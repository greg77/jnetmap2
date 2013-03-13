package org.sio.jnetmap.domain;

import java.util.List;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Modules {

    @NotNull
    private char num;

    @ManyToOne
    private Switches aSwitch;
    
	public static List<Modules> findNetModuleByNetSwitch(Long netSwitchId){
		return entityManager().createQuery(
				"SELECT s FROM NetModule s WHERE s.aSwitch.id=" + netSwitchId,
				Modules.class).getResultList();
	}
}

