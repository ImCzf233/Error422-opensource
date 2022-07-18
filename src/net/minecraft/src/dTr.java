package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

public class dTr
implements Comparator {
    private final iSh field_376d18e_Dne;

    public int compare(Object object, Object object2) {
        return this.method_71120e4d_Dne((PJQ)object, (PJQ)object2);
    }

    public dTr(iSh iSh2) {
        this.field_376d18e_Dne = iSh2;
    }

    public int method_71120e4d_Dne(PJQ pJQ, PJQ pJQ2) {
        double d;
        double d2 = pJQ.method_2be42992_Dne(this.field_376d18e_Dne.field_2092ae_Dne, this.field_376d18e_Dne.field_21260d_FWm, this.field_376d18e_Dne.field_2e5f1b_bzF);
        return d2 < (d = pJQ2.method_2be42992_Dne(this.field_376d18e_Dne.field_2092ae_Dne, this.field_376d18e_Dne.field_21260d_FWm, this.field_376d18e_Dne.field_2e5f1b_bzF)) ? -1 : (d2 > d ? 1 : 0);
    }
}

