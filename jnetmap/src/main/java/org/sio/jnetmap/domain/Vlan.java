package org.sio.jnetmap.domain;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.json.RooJson;
import org.springframework.roo.addon.tostring.RooToString;

@RooJson
@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Vlan {
	
	@NotNull
	private String name;
	
	@NotNull
	private int num;
	
	  public static List<Vlan> findVlansWithCustomQuery(String query){
			return entityManager().createNativeQuery(
					query,
					Vlan.class).getResultList();		
			
		}
	  
	  public String getRgbVlanColor(){	
		 						      
				String quarter = "";
				long firstRgb= (17*this.getId()+ 37)%256;
				long secondRgb= (37*this.getId()*2 + 73)%256;
				long thirdRgb= (73*this.getId()*3 + 17)%256;
				quarter += "rgb("+firstRgb+","+secondRgb+","+thirdRgb+")";
		  
			return quarter;
			
		}
}
