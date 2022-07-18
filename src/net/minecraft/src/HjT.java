package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class HjT
extends bab {
    private final Map field_83b1c1b0_Dne;

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            HjT hjT = (HjT)object;
            return this.field_83b1c1b0_Dne.equals(hjT.field_83b1c1b0_Dne);
        }
        return false;
    }

    public int hashCode() {
        return this.field_83b1c1b0_Dne.hashCode();
    }

    @Override
    public List method_adea226d_Dne() {
        throw new IllegalStateException("Attempt to get elements on a JsonNode without elements.");
    }

    @Override
    public String method_eecad346_Dne() {
        throw new IllegalStateException("Attempt to get text on a JsonNode without text.");
    }

    @Override
    public BAS method_22fe5f57_Dne() {
        return BAS.field_364d0f8_Dne;
    }

    @Override
    public Map method_d410254f_Dne() {
        return new HashMap(this.field_83b1c1b0_Dne);
    }

    public String toString() {
        return "JsonObject fields:[" + this.field_83b1c1b0_Dne + "]";
    }

    HjT(Map map) {
        this.field_83b1c1b0_Dne = new HashMap(map);
    }
}

