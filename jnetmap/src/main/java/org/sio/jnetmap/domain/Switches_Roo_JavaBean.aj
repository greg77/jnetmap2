// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.sio.jnetmap.domain;

import org.sio.jnetmap.domain.Dispatcher;
import org.sio.jnetmap.domain.Switches;

privileged aspect Switches_Roo_JavaBean {
    
    public String Switches.getIp() {
        return this.ip;
    }
    
    public void Switches.setIp(String ip) {
        this.ip = ip;
    }
    
    public String Switches.getName() {
        return this.name;
    }
    
    public void Switches.setName(String name) {
        this.name = name;
    }
    
    public Dispatcher Switches.getDispatcher() {
        return this.dispatcher;
    }
    
    public void Switches.setDispatcher(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }
    
}
