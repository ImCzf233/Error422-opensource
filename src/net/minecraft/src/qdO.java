package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class qdO
extends bab {
    private final List field_f27c122c_Dne;

    @Override
    public List method_adea226d_Dne() {
        return new ArrayList(this.field_f27c122c_Dne);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            qdO qdO2 = (qdO)object;
            return this.field_f27c122c_Dne.equals(qdO2.field_f27c122c_Dne);
        }
        return false;
    }

    @Override
    public String method_eecad346_Dne() {
        throw new IllegalStateException("Attempt to get text on a JsonNode without text.");
    }

    qdO(Iterable iterable) {
        this.field_f27c122c_Dne = qdO.method_21a5c344_Dne(iterable);
    }

    private static List method_21a5c344_Dne(Iterable iterable) {
        return new iOH(iterable);
    }

    public int hashCode() {
        return this.field_f27c122c_Dne.hashCode();
    }

    @Override
    public Map method_d410254f_Dne() {
        throw new IllegalStateException("Attempt to get fields on a JsonNode without fields.");
    }

    public String toString() {
        return "JsonArray elements:[" + this.field_f27c122c_Dne + "]";
    }

    @Override
    public BAS method_22fe5f57_Dne() {
        return BAS.field_201e9cd7_FWm;
    }
}

