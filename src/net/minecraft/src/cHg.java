package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class cHg
extends cMv {
    private FUH field_366ec33_Dne;
    private int field_2092ae_Dne = 0;
    private double field_212608_FWm;
    private double field_2092a9_Dne;

    public cHg(FUH fUH) {
        this.field_366ec33_Dne = fUH;
        this.method_ce7f5da9_Dne(3);
    }

    @Override
    public void method_7a46289a_Dne() {
        double d = Math.PI * 2 * this.field_366ec33_Dne.method_b5ceee8_Dne().nextDouble();
        this.field_2092a9_Dne = Math.cos(d);
        this.field_212608_FWm = Math.sin(d);
        this.field_2092ae_Dne = 20 + this.field_366ec33_Dne.method_b5ceee8_Dne().nextInt(20);
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return this.field_366ec33_Dne.method_b5ceee8_Dne().nextFloat() < 0.02f;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return this.field_2092ae_Dne >= 0;
    }

    @Override
    public void method_ae128dc7_bzF() {
        --this.field_2092ae_Dne;
        this.field_366ec33_Dne.method_230db26a_Dne().method_c38d48a4_Dne(this.field_366ec33_Dne.field_2f0dd3_div + this.field_2092a9_Dne, this.field_366ec33_Dne.field_22c5fd_IjH + (double)this.field_366ec33_Dne.method_59ee189_c_(), this.field_366ec33_Dne.field_334487_mrb + this.field_212608_FWm, 10.0f, this.field_366ec33_Dne.method_cd4cb3c8_udO());
    }
}

