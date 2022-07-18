package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class tMs
extends hbe {
    @Override
    public int method_117d19dd_FWm(int n) {
        return 2129968;
    }

    protected tMs(int n) {
        super(n);
        float f = 0.5f;
        float f2 = 0.015625f;
        this.method_eb14b51a_Dne(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, f2, 0.5f + f);
        this.method_82a88d64_Dne(JcN.field_2022bed6_FWm);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 23;
    }

    @Override
    public int method_fbabf7e2_Dne(Zpi zpi, int n, int n2, int n3) {
        return 2129968;
    }

    @Override
    public bSp method_8c85fe2_Dne(Qnq qnq, int n, int n2, int n3) {
        return bSp.method_23186cf1_Dne().method_b4ea3e0c_Dne((double)n + this.field_2092a9_Dne, (double)n2 + this.field_212608_FWm, (double)n3 + this.field_2e5f16_bzF, (double)n + this.field_267cf0_Qnq, (double)n2 + this.field_2d29ef_aFZ, (double)n3 + this.field_388da1_zGp);
    }

    @Override
    protected boolean method_ce7f5dad_Dne(int n) {
        return true;
    }

    @Override
    public boolean method_52f8ce31_a_(Qnq qnq, int n, int n2, int n3) {
        return true;
    }

    @Override
    public int method_590ca0b_b_() {
        return 2129968;
    }

    @Override
    public void method_1bbfa017_Dne(Qnq qnq, int n, int n2, int n3, bSp bSp2, List list, sMa sMa2) {
        if (sMa2 == null || !(sMa2 instanceof iMX)) {
            super.method_1bbfa017_Dne(qnq, n, n2, n3, bSp2, list, sMa2);
        }
    }
}

