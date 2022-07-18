package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class zEq
implements Map {
    private final Map field_83b1c1b0_Dne = new LinkedHashMap();

    @Override
    public boolean containsKey(Object object) {
        return this.field_83b1c1b0_Dne.containsKey(object.toString().toLowerCase());
    }

    public Set entrySet() {
        return this.field_83b1c1b0_Dne.entrySet();
    }

    public Object remove(Object object) {
        return this.field_83b1c1b0_Dne.remove(object.toString().toLowerCase());
    }

    public Object method_eddf1072_Dne(String string, Object object) {
        return this.field_83b1c1b0_Dne.put(string.toLowerCase(), object);
    }

    @Override
    public int size() {
        return this.field_83b1c1b0_Dne.size();
    }

    public Set keySet() {
        return this.field_83b1c1b0_Dne.keySet();
    }

    public Object get(Object object) {
        return this.field_83b1c1b0_Dne.get(object.toString().toLowerCase());
    }

    public Collection values() {
        return this.field_83b1c1b0_Dne.values();
    }

    @Override
    public void clear() {
        this.field_83b1c1b0_Dne.clear();
    }

    @Override
    public boolean containsValue(Object object) {
        return this.field_83b1c1b0_Dne.containsKey(object);
    }

    public Object put(Object object, Object object2) {
        return this.method_eddf1072_Dne((String)object, object2);
    }

    public void putAll(Map var1) {
        Iterator var2 = var1.entrySet().iterator();

        while(var2.hasNext()) {
            Entry var3 = (Entry)var2.next();
            this.method_eddf1072_Dne((String)var3.getKey(), var3.getValue());
        }

    }

    @Override
    public boolean isEmpty() {
        return this.field_83b1c1b0_Dne.isEmpty();
    }
}

