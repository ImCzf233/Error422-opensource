package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public enum HQH {
    field_367c5ed_Dne(0, 1, 0, -1, 0),
    field_202191cc_FWm(1, 0, 0, 1, 0),
    field_75af93da_bzF(2, 3, 0, 0, -1),
    field_5e5134b4_Qnq(3, 2, 0, 0, 1),
    field_712b4a33_aFZ(4, 5, -1, 0, 0),
    field_f09984e5_zGp(5, 4, 1, 0, 0);

    private static final HQH[] field_835e1348_Dne = new HQH[6];
    private final int field_2092ae_Dne;
    private final int field_267cf5_Qnq;
    private final int field_2e5f1b_bzF;
    private final int field_21260d_FWm;
    private final int field_2d29f4_aFZ;

    public int method_ae128dba_bzF() {
        return this.field_2d29f4_aFZ;
    }

    public int method_7a46288d_Dne() {
        return this.field_2e5f1b_bzF;
    }

    public int method_7c6f602c_FWm() {
        return this.field_267cf5_Qnq;
    }

    public static HQH method_9e6b69db_Dne(int n) {
        return field_835e1348_Dne[n % field_835e1348_Dne.length];
    }

    static {
        HQH[] var0 = values();
        int var1 = var0.length;

        for(int var2 = 0; var2 < var1; ++var2) {
            HQH var3 = var0[var2];
            field_835e1348_Dne[var3.field_2092ae_Dne] = var3;
        }

    }

    private HQH(int var3, int var4, int var5, int var6, int var7) {
        this.field_2092ae_Dne = var3;
        this.field_21260d_FWm = var4;
        this.field_2e5f1b_bzF = var5;
        this.field_267cf5_Qnq = var6;
        this.field_2d29f4_aFZ = var7;
    }
}

