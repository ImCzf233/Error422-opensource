package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

public class dPW
implements Comparator {
    private double field_2e5f16_bzF;
    private double field_212608_FWm;
    private double field_2092a9_Dne;

    public dPW(sMa sMa2) {
        this.field_2092a9_Dne = -sMa2.field_2f0dd3_div;
        this.field_212608_FWm = -sMa2.field_22c5fd_IjH;
        this.field_2e5f16_bzF = -sMa2.field_334487_mrb;
    }

    public int method_a9ca690d_Dne(snt snt2, snt snt3) {
        double d = (double)snt2.field_29186d_XHL + this.field_2092a9_Dne;
        double d2 = (double)snt2.field_2a9ad6_Zpi + this.field_212608_FWm;
        double d3 = (double)snt2.field_31b816_kGO + this.field_2e5f16_bzF;
        double d4 = (double)snt3.field_29186d_XHL + this.field_2092a9_Dne;
        double d5 = (double)snt3.field_2a9ad6_Zpi + this.field_212608_FWm;
        double d6 = (double)snt3.field_31b816_kGO + this.field_2e5f16_bzF;
        return (int)((d * d + d2 * d2 + d3 * d3 - (d4 * d4 + d5 * d5 + d6 * d6)) * 1024.0);
    }

    public int compare(Object object, Object object2) {
        return this.method_a9ca690d_Dne((snt)object, (snt)object2);
    }
}

