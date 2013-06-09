// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.sio.jnetmap.domain;

import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.sio.jnetmap.domain.Switches;

privileged aspect Switches_Roo_Json {
    
    public String Switches.toJson() {
        return new JSONSerializer().exclude("*.class").serialize(this);
    }
    
    public static Switches Switches.fromJsonToSwitches(String json) {
        return new JSONDeserializer<Switches>().use(null, Switches.class).deserialize(json);
    }
    
    public static String Switches.toJsonArray(Collection<Switches> collection) {
        return new JSONSerializer().exclude("*.class").serialize(collection);
    }
    
    public static Collection<Switches> Switches.fromJsonArrayToSwitcheses(String json) {
        return new JSONDeserializer<List<Switches>>().use(null, ArrayList.class).use("values", Switches.class).deserialize(json);
    }
    
}
