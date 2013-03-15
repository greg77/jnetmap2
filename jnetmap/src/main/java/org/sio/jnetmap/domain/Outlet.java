package org.sio.jnetmap.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.json.RooJson;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.ui.ModelMap;

@RooJson
@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Outlet {

    @NotNull
    @Size(min = 2, max = 30)
    private String num;

    @OneToOne
    private Port port;

    @ManyToOne
    private Room room;

    @ManyToOne
    private Band band;

	public static List<Outlet> findOutletOfRooms(Long roomsId) {
		return entityManager().createQuery(
				"SELECT s FROM Outlet s WHERE s.room.id=" + roomsId,
				Outlet.class).getResultList();
	}
	
	public static Outlet findOutletWithPort(Long portId){
		return entityManager().createQuery(
				"SELECT s FROM Outlet s WHERE s.port=" + portId,
				Outlet.class).getSingleResult();
	}
	
	public static List<Outlet> findAllOutletsByModule(Long moduleId){
		return entityManager().createQuery(
				"SELECT s FROM Outlet s WHERE s.port= (SELECT p.id FROM Port p WHERE p.a_Module = )" + moduleId,
				Outlet.class).getResultList();
		
	}
	
	public static List<Outlet> findOutletsWithCustomQuery(String query){
		return entityManager().createNativeQuery(
				query,
				Outlet.class).getResultList();
		
	}
	

	

}
