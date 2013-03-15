package org.sio.jnetmap.domain;

import java.util.List;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.json.RooJson;
import org.springframework.roo.addon.tostring.RooToString;

@RooJson
@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Room {

    @NotNull
    @Size(min = 2, max = 30)
    private String name;

    @ManyToOne
    private Building building;

	public static List<Room> findRoomsOfBuilding(Long buildId) {
		return entityManager().createQuery(
				"SELECT s FROM Room s WHERE s.building.id=" + buildId,
				Room.class).getResultList();
	}
	
	public static List<Room> findRoomsWithCustomQuery(String query){
		return entityManager().createNativeQuery(
				query,
				Room.class).getResultList();
		
	}
}
