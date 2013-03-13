package org.sio.jnetmap.domain;

import java.util.List;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Switches {

    @NotNull
    @Size(min = 2, max = 30)
    private String ip;

    @NotNull
    @Size(min = 2, max = 30)
    private String name;

    @ManyToOne
    private Dispatcher dispatcher;
    

}