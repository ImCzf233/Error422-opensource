package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class RDG {
    public int field_21260d_FWm;
    public double field_291868_XHL;
    public double field_2d29ef_aFZ;
    public double field_22c5fd_IjH;
    public double field_20b852_DyG;
    public double field_2f0dd3_div;
    private static Random field_7331eae7_Dne = new Random();
    public double field_388da1_zGp;
    public double field_36b0a4_udO;
    public double field_2a9ad1_Zpi;
    public double field_267cf0_Qnq;
    public boolean field_2092bf_Dne;
    public double field_2e5f16_bzF;
    public int field_2092ae_Dne;
    public double field_31b811_kGO;
    public double field_334487_mrb;
    public double field_34225f_ooe;
    public double field_2092a9_Dne;
    public double field_212608_FWm;

    public void method_7a46289a_Dne() {
        this.field_2a9ad1_Zpi = this.field_2f0dd3_div;
        this.field_31b811_kGO = this.field_22c5fd_IjH;
        this.field_36b0a4_udO = this.field_334487_mrb;
        this.field_34225f_ooe = this.field_291868_XHL;
        this.field_2e5f16_bzF = this.field_2092a9_Dne;
        this.field_267cf0_Qnq = this.field_212608_FWm;
    }

    public void method_af5b4812_Dne(lJS lJS2) {
        this.field_2092a9_Dne += this.field_2d29ef_aFZ;
        this.field_212608_FWm += this.field_388da1_zGp;
        this.field_2d29ef_aFZ *= this.field_20b852_DyG;
        this.field_388da1_zGp *= this.field_20b852_DyG;
        this.field_388da1_zGp += 0.1;
        if (++this.field_2092ae_Dne > this.field_21260d_FWm) {
            this.method_7c6f6039_FWm();
        }
        this.field_291868_XHL = 2.0 - (double)this.field_2092ae_Dne / (double)this.field_21260d_FWm * 2.0;
        if (this.field_291868_XHL > 1.0) {
            this.field_291868_XHL = 1.0;
        }
        this.field_291868_XHL *= this.field_291868_XHL;
        this.field_291868_XHL *= 0.5;
    }

    public void method_7c6f6039_FWm() {
        this.field_2092bf_Dne = true;
    }
}

