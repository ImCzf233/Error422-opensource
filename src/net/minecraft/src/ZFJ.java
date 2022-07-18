package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class ZFJ
extends LHi {
    @Override
    public float method_2c2cf7b9_Dne(int n, int n2, int n3) {
        return this.field_36c4f18_Dne.method_2c2cf7b9_Dne(n, n2, n3) - 0.5f;
    }

    public ZFJ(Qnq qnq) {
        super(qnq);
        this.field_c480ca78_bzF = "/mob/zombie.png";
        this.field_2e1df2_cHy = 0.5f;
        this.field_36b0a6_udO *= 6.0f;
        this.method_16b621a_Dne(this.field_342261_ooe * 6.0f, this.field_367151_trS * 6.0f);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 100;
    }

    @Override
    public int method_bb7dd813_Dne(sMa sMa2) {
        return 50;
    }
}

