package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class Htk
extends SmS {
    int field_267cf5_Qnq;
    boolean field_21261e_FWm;

    @Override
    public void method_ae128dc7_bzF() {
        --this.field_267cf5_Qnq;
        super.method_ae128dc7_bzF();
    }

    public Htk(FUH fUH, boolean bl) {
        super(fUH);
        this.field_366ec33_Dne = fUH;
        this.field_21261e_FWm = bl;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return this.field_21261e_FWm && this.field_267cf5_Qnq > 0 && super.method_7c6f603d_FWm();
    }

    @Override
    public void method_7c6f6039_FWm() {
        if (this.field_21261e_FWm) {
            this.field_379fdf9_Dne.method_f9bf47a4_Dne(this.field_366ec33_Dne.field_36c4f18_Dne, this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF, false);
        }
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_267cf5_Qnq = 20;
        this.field_379fdf9_Dne.method_f9bf47a4_Dne(this.field_366ec33_Dne.field_36c4f18_Dne, this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF, true);
    }
}

