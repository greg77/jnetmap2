// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.sio.jnetmap.domain;

import org.sio.jnetmap.domain.Band;
import org.sio.jnetmap.domain.Outlet;
import org.sio.jnetmap.domain.Port;
import org.sio.jnetmap.domain.Room;

privileged aspect Outlet_Roo_JavaBean {
    
    public String Outlet.getNum() {
        return this.num;
    }
    
    public void Outlet.setNum(String num) {
        this.num = num;
    }
    
    public Port Outlet.getPort() {
        return this.port;
    }
    
    public void Outlet.setPort(Port port) {
        this.port = port;
    }
    
    public Room Outlet.getRoom() {
        return this.room;
    }
    
    public void Outlet.setRoom(Room room) {
        this.room = room;
    }
    
    public Band Outlet.getBand() {
        return this.band;
    }
    
    public void Outlet.setBand(Band band) {
        this.band = band;
    }
    
}
