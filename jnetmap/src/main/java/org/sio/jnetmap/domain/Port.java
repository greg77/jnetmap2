package org.sio.jnetmap.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Nullable;
import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.json.RooJson;
import org.springframework.roo.addon.tostring.RooToString;

@RooJson
@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Port {

	@NotNull
	private String num;

	@ManyToOne
	private Modules aModule;

	@Nullable
	@JsonIgnore
	@OneToOne(mappedBy = "port")
	private Outlet outlet;

	@ManyToOne
	private Vlan vlanUntagged;

	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Vlan> vlansTagged = new HashSet<Vlan>();

	public static List<Port> findAllPortsBySwitch(Long netSwitchId) {
		return entityManager()
				.createNativeQuery(
						"SELECT DISTINCT s.* FROM Port s, Modules m WHERE s.a_Module = m.id AND m.a_Switch="
								+ netSwitchId, Port.class).getResultList();
	}

	public static List<Port> findAllPortsByModule(Long moduleId) {
		return entityManager().createQuery(
				"SELECT p FROM Port p WHERE p.aModule.id = " + moduleId,
				Port.class).getResultList();
	}

	public static List<Port> findPortsWithCustomQuery(String query) {
		return entityManager().createNativeQuery(query, Port.class)
				.getResultList();

	}

	public void setOutlet(Outlet outlet) {
		if (outlet == null) {
			if (this.outlet != null)
				this.outlet.setPort(null);
			this.outlet = null;
		} else {
			outlet.setPort(this);
			this.outlet = outlet;			
		}

	}
}
