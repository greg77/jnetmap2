package org.sio.jnetmap.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.util.DigestUtils;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(table = "t_user")
public class User {
	
    @NotNull
    @Size(min = 3, max = 30)
    private String username;

    @Size(max = 100)
    private String password;
    
    @Size(max = 100)
    @Transient
    private String passwordConfirmation;

    @NotNull
    private Boolean enabled;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Role> roles = new HashSet<Role>();
    
    @PrePersist
    @PreUpdate
    protected void encryptPassword() {
      if (password != null
    		  && password.equals(passwordConfirmation)
    		  && (! password.matches("^[0-9a-fA-F]+$"))) {
        // prevent encryption if already encrypted
        password = DigestUtils.md5DigestAsHex(password.getBytes());
      }
    }
}
