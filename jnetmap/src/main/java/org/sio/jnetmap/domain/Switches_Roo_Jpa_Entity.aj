// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.sio.jnetmap.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;
import org.sio.jnetmap.domain.Switches;

privileged aspect Switches_Roo_Jpa_Entity {
    
    declare @type: Switches: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Switches.id;
    
    @Version
    @Column(name = "version")
    private Integer Switches.version;
    
    public Long Switches.getId() {
        return this.id;
    }
    
    public void Switches.setId(Long id) {
        this.id = id;
    }
    
    public Integer Switches.getVersion() {
        return this.version;
    }
    
    public void Switches.setVersion(Integer version) {
        this.version = version;
    }
    
}
