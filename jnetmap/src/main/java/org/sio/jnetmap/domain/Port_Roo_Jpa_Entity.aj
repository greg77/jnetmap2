// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.sio.jnetmap.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;
import org.sio.jnetmap.domain.Port;

privileged aspect Port_Roo_Jpa_Entity {
    
    declare @type: Port: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Port.id;
    
    @Version
    @Column(name = "version")
    private Integer Port.version;
    
    public Long Port.getId() {
        return this.id;
    }
    
    public void Port.setId(Long id) {
        this.id = id;
    }
    
    public Integer Port.getVersion() {
        return this.version;
    }
    
    public void Port.setVersion(Integer version) {
        this.version = version;
    }
    
}
