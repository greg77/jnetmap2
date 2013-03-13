// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.sio.jnetmap.domain;

import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.sio.jnetmap.domain.Port;

privileged aspect Port_Roo_Json {
    
    public String Port.toJson() {
        return new JSONSerializer().exclude("*.class").serialize(this);
    }
    
    public static Port Port.fromJsonToPort(String json) {
        return new JSONDeserializer<Port>().use(null, Port.class).deserialize(json);
    }
    
    public static String Port.toJsonArray(Collection<Port> collection) {
        return new JSONSerializer().exclude("*.class").serialize(collection);
    }
    
    public static Collection<Port> Port.fromJsonArrayToPorts(String json) {
        return new JSONDeserializer<List<Port>>().use(null, ArrayList.class).use("values", Port.class).deserialize(json);
    }
    
}
