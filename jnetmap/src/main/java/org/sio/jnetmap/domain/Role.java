package org.sio.jnetmap.domain;

import java.util.List;

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
public class Role {

    @NotNull
    @Size(max = 50)
    private String name;
    
    public void name() {
		this.getId();
	}





}