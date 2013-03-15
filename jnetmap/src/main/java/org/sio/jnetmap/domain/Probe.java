package org.sio.jnetmap.domain;

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
public class Probe {

    @NotNull
    @Size(min = 1, max = 30)
    private String mac;

    @NotNull
    @Size(min = 1, max = 30)
    private String num;
}
