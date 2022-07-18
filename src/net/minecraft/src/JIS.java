package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class JIS {
    private final float field_2092ab_Dne;
    private final int field_21260d_FWm;
    private final String field_569fcf45_Dne;
    private final zBn field_37e4cc6_Dne;
    private final int field_2092ae_Dne;
    private final int field_2e5f1b_bzF;

    public float method_7a46288a_Dne() {
        return this.field_37e4cc6_Dne == zBn.field_5ceb61a_IjH ? Float.MAX_VALUE : this.field_2092ab_Dne;
    }

    public String method_eecad346_Dne() {
        return this.field_569fcf45_Dne;
    }

    public zBn method_2317db25_Dne() {
        return this.field_37e4cc6_Dne;
    }

    public int method_7a46288d_Dne() {
        return this.field_21260d_FWm;
    }

    public String method_d1f1ed87_FWm() {
        return this.method_2317db25_Dne().method_f88b2463_FWm() == null ? null : this.method_2317db25_Dne().method_f88b2463_FWm().method_c6f17a40_aFZ();
    }

    public boolean method_7a46289e_Dne() {
        return this.field_37e4cc6_Dne.method_f88b2463_FWm() instanceof FUH;
    }

    public JIS(zBn zBn2, int n, int n2, int n3, String string, float f) {
        this.field_37e4cc6_Dne = zBn2;
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n3;
        this.field_2e5f1b_bzF = n2;
        this.field_569fcf45_Dne = string;
        this.field_2092ab_Dne = f;
    }
}

