package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedList;
import java.util.List;

public final class EWS
implements Xix {
    private final List field_f27c122c_Dne = new LinkedList();

    @Override
    public LIC method_23030725_Dne() {
        return this.method_230d6528_Dne();
    }

    static List<hta> method_4a5da021_Dne(EWS eWS) {
        return eWS.field_f27c122c_Dne;
    }

    public EWS method_b16d9862_Dne(hta hta2) {
        this.field_f27c122c_Dne.add(hta2);
        return this;
    }

    public bab method_230d6528_Dne() {
        return ACm.method_41b377b9_Dne(new IvV(this));
    }
}

