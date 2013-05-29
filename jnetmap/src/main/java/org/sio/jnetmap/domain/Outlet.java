package org.sio.jnetmap.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Nullable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
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
    @Size(min = 0, max = 30)
    private String num;
    
    @Nullable
    @OneToOne(cascade = CascadeType.ALL)
    private Port port;

    @ManyToOne
    private Room room;

    @ManyToOne
    private Band band;
    
    public String getCode(){
    	return this.band.getDispatcher().getName()+"-"+this.band.getNum()+"-"+this.port.getNum();
    }

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
	
	
	public static Outlet findOutletWithNumDispatcherNumBandNumPort(String nameDispatcher, String numBand, String numPort){
		return entityManager().createQuery(
				"SELECT s FROM Outlet s WHERE s.port.num='" + numPort +"' AND s.band.num = '"+ numBand + "' AND s.band.dispatcher.name = '"+nameDispatcher+"'",
				Outlet.class).getSingleResult();
	}
	
	public static List<Outlet> findAllOutletsByModule(Long moduleId){
		return entityManager().createQuery(
				"SELECT s FROM Outlet s WHERE s.port.aModule ="+ moduleId,
				Outlet.class).getResultList();
		
	}
	
	
	public static List<Outlet> findOutletWithIdDispatcherNumBand(String idDispatcher, String numBand){
		return entityManager().createQuery(
				"SELECT s FROM Outlet s WHERE s.band.num = '"+ numBand + "' AND s.band.dispatcher.id = "+idDispatcher+"",
				Outlet.class).getResultList();
	}
	
	
	public static List<Outlet> findOutletsWithCustomQuery(String query){
		return entityManager().createNativeQuery(
				query,
				Outlet.class).getResultList();
		
	}
	


	public void setPort(Port p) {
		if (p == null)
			this.port = null;
		else
			this.port = p;
		
	}

	public static List<Outlet> findUnplugOutlets() {
		return entityManager().createQuery(
				"SELECT s FROM Outlet s WHERE s.port= null",
				Outlet.class).getResultList();
	}
	
	
	

	

}
