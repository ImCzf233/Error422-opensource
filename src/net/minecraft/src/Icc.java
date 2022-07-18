package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public enum Icc {
    field_3688123_Dne(ZFz.class, 70, KFd.field_368fd23_Dne, false, false),
    field_20224d02_FWm(HzK.class, 10, KFd.field_368fd23_Dne, true, true),
    field_75b04f10_bzF(ifA.class, 15, KFd.field_368fd23_Dne, true, false),
    field_5e51efea_Qnq(DIk.class, 5, KFd.field_1411d34d_div, true, false);

    private final boolean field_21261e_FWm;
    private final KFd field_368fd23_Dne;
    private final Class field_ce3f4d68_Dne;
    private final int field_2092ae_Dne;
    private final boolean field_2092bf_Dne;

    public KFd method_23028b82_Dne() {
        return this.field_368fd23_Dne;
    }

    public int method_7a46288d_Dne() {
        return this.field_2092ae_Dne;
    }

    public Class method_80934547_Dne() {
        return this.field_ce3f4d68_Dne;
    }

    private Icc(Class var3, int var4, KFd var5, boolean var6, boolean var7) {
        this.field_ce3f4d68_Dne = var3;
        this.field_2092ae_Dne = var4;
        this.field_368fd23_Dne = var5;
        this.field_2092bf_Dne = var6;
        this.field_21261e_FWm = var7;
    }

    public boolean method_7c6f603d_FWm() {
        return this.field_21261e_FWm;
    }

    public boolean method_7a46289e_Dne() {
        return this.field_2092bf_Dne;
    }
}

