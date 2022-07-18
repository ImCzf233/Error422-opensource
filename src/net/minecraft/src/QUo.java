package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Map;

public final class QUo
extends LIC
implements Comparable {
    private final String field_569fcf45_Dne;

    @Override
    public Map method_d410254f_Dne() {
        throw new IllegalStateException("Attempt to get fields on a JsonNode without fields.");
    }

    public int compareTo(Object object) {
        return this.method_81f02c2f_Dne((QUo)object);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            QUo qUo = (QUo)object;
            return this.field_569fcf45_Dne.equals(qUo.field_569fcf45_Dne);
        }
        return false;
    }

    @Override
    public BAS method_22fe5f57_Dne() {
        return BAS.field_75ac9ee5_bzF;
    }

    public int hashCode() {
        return this.field_569fcf45_Dne.hashCode();
    }

    @Override
    public String method_eecad346_Dne() {
        return this.field_569fcf45_Dne;
    }

    @Override
    public List method_adea226d_Dne() {
        throw new IllegalStateException("Attempt to get elements on a JsonNode without elements.");
    }

    public int method_81f02c2f_Dne(QUo qUo) {
        return this.field_569fcf45_Dne.compareTo(qUo.field_569fcf45_Dne);
    }

    public String toString() {
        return "JsonStringNode value:[" + this.field_569fcf45_Dne + "]";
    }

    QUo(String string) {
        if (string == null) {
            throw new NullPointerException("Attempt to construct a JsonString with a null value.");
        }
        this.field_569fcf45_Dne = string;
    }
}

