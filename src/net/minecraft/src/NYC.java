package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

final class NYC
extends MbX {
    final QUo field_36bf101_Dne;

    public String toString() {
        return "a field called [\"" + this.field_36bf101_Dne.method_eecad346_Dne() + "\"]";
    }

    @Override
    public String method_eecad346_Dne() {
        return "\"" + this.field_36bf101_Dne.method_eecad346_Dne() + "\"";
    }

    @Override
    public Object method_1b7587fd_FWm(Object object) {
        return this.method_41a919b6_Dne((Map)object);
    }

    @Override
    public boolean method_41cee5fa_Dne(Object object) {
        return this.method_a5b62baf_Dne((Map)object);
    }

    NYC(QUo qUo) {
        this.field_36bf101_Dne = qUo;
    }

    public boolean method_a5b62baf_Dne(Map map) {
        return map.containsKey(this.field_36bf101_Dne);
    }

    public LIC method_41a919b6_Dne(Map map) {
        return (LIC)map.get(this.field_36bf101_Dne);
    }
}

