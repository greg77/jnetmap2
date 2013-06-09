// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.sio.jnetmap.domain;

import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.sio.jnetmap.domain.Modules;

privileged aspect Modules_Roo_Json {
    
    public String Modules.toJson() {
        return new JSONSerializer().exclude("*.class").serialize(this);
    }
    
    public static Modules Modules.fromJsonToModules(String json) {
        return new JSONDeserializer<Modules>().use(null, Modules.class).deserialize(json);
    }
    
    public static String Modules.toJsonArray(Collection<Modules> collection) {
        return new JSONSerializer().exclude("*.class").serialize(collection);
    }
    
    public static Collection<Modules> Modules.fromJsonArrayToModuleses(String json) {
        return new JSONDeserializer<List<Modules>>().use(null, ArrayList.class).use("values", Modules.class).deserialize(json);
    }
    
}