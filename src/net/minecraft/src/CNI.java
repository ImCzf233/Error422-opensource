package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public enum CNI {
    field_36574ee_Dne(0, 59, 2.0f, 0, 15),
    field_201f40cd_FWm(1, 131, 4.0f, 1, 5),
    field_75ad42db_bzF(2, 250, 6.0f, 2, 14),
    field_5e4ee3b5_Qnq(3, 1561, 8.0f, 3, 10),
    field_7128f934_aFZ(0, 32, 12.0f, 0, 22);

    private final float field_2092ab_Dne;
    private final int field_267cf5_Qnq;
    private final int field_2092ae_Dne;
    private final int field_21260d_FWm;
    private final int field_2e5f1b_bzF;

    public int method_ae128dba_bzF() {
        return this.field_2092ae_Dne;
    }

    private CNI(int var3, int var4, float var5, int var6, int var7) {
        this.field_2092ae_Dne = var3;
        this.field_21260d_FWm = var4;
        this.field_2092ab_Dne = var5;
        this.field_2e5f1b_bzF = var6;
        this.field_267cf5_Qnq = var7;
    }

    public int method_907a9d14_Qnq() {
        return this.field_267cf5_Qnq;
    }

    public int method_a98a0653_aFZ() {
        return this == field_36574ee_Dne ? zKP.field_5e67d9b4_Qnq.field_21260d_FWm : (this == field_201f40cd_FWm ? zKP.field_75c638da_bzF.field_21260d_FWm : (this == field_7128f934_aFZ ? dEr.field_74feeb39_mrb.field_267cf5_Qnq : (this == field_75ad42db_bzF ? dEr.field_5c4c1af_IjH.field_267cf5_Qnq : (this == field_5e4ee3b5_Qnq ? dEr.field_141d2e85_div.field_267cf5_Qnq : 0))));
    }

    public int method_7c6f602c_FWm() {
        return this.field_2e5f1b_bzF;
    }

    public int method_7a46288d_Dne() {
        return this.field_21260d_FWm;
    }

    public float method_7a46288a_Dne() {
        return this.field_2092ab_Dne;
    }
}

