// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.sio.jnetmap.domain;

import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.sio.jnetmap.domain.Band;

privileged aspect Band_Roo_Json {
    
    public String Band.toJson() {
        return new JSONSerializer().exclude("*.class").serialize(this);
    }
    
    public static Band Band.fromJsonToBand(String json) {
        return new JSONDeserializer<Band>().use(null, Band.class).deserialize(json);
    }
    
    public static String Band.toJsonArray(Collection<Band> collection) {
        return new JSONSerializer().exclude("*.class").serialize(collection);
    }
    
    public static Collection<Band> Band.fromJsonArrayToBands(String json) {
        return new JSONDeserializer<List<Band>>().use(null, ArrayList.class).use("values", Band.class).deserialize(json);
    }
    
}
