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
public class Band {

    @NotNull
    @Size(min = 2, max = 30)
    private String num;
   
    @ManyToOne
    private Dispatcher dispatcher;
    
	public static List<Band> findBandsWithCustomQuery(String query){
		return entityManager().createNativeQuery(
				query,
				Band.class).getResultList();
		
	}
	
	public static List<Band> findBandOfDispatcher(Long dispatcherId) {
		return entityManager().createQuery(
				"SELECT b FROM Band b WHERE b.dispatcher.id=" + dispatcherId,
				Band.class).getResultList();
	}
}
