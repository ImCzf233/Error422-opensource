package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

final class Avy
extends LIC {
    private static final Pattern field_b2ec7984_Dne = Pattern.compile("(-?)(0|([1-9]([0-9]*)))(\\.[0-9]+)?((e|E)(\\+|-)?[0-9]+)?");
    private final String field_569fcf45_Dne;

    @Override
    public String method_eecad346_Dne() {
        return this.field_569fcf45_Dne;
    }

    Avy(String string) {
        if (string == null) {
            throw new NullPointerException("Attempt to construct a JsonNumber with a null value.");
        }
        if (!field_b2ec7984_Dne.matcher(string).matches()) {
            throw new IllegalArgumentException("Attempt to construct a JsonNumber with a String [" + string + "] that does not match the JSON number specification.");
        }
        this.field_569fcf45_Dne = string;
    }

    public String toString() {
        return "JsonNumberNode value:[" + this.field_569fcf45_Dne + "]";
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            Avy avy = (Avy)object;
            return this.field_569fcf45_Dne.equals(avy.field_569fcf45_Dne);
        }
        return false;
    }

    @Override
    public List method_adea226d_Dne() {
        throw new IllegalStateException("Attempt to get elements on a JsonNode without elements.");
    }

    public int hashCode() {
        return this.field_569fcf45_Dne.hashCode();
    }

    @Override
    public Map method_d410254f_Dne() {
        throw new IllegalStateException("Attempt to get fields on a JsonNode without fields.");
    }

    @Override
    public BAS method_22fe5f57_Dne() {
        return BAS.field_5e4e3fbf_Qnq;
    }
}

