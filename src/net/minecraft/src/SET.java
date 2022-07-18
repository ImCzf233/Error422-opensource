package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class SET
extends cMv {
    private yQQ field_37e0d33_Dne;
    private kSJ field_377b6aa_Dne;

    @Override
    public boolean method_7a46289e_Dne() {
        if (this.field_377b6aa_Dne.field_36c4f18_Dne.method_7a46289e_Dne()) {
            return false;
        }
        uQr uQr2 = this.field_377b6aa_Dne.field_36c4f18_Dne.field_36be6b6_Dne.method_b7b639d5_Dne(geR.method_117d0718_FWm(this.field_377b6aa_Dne.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_377b6aa_Dne.field_22c5fd_IjH), geR.method_117d0718_FWm(this.field_377b6aa_Dne.field_334487_mrb), 16);
        if (uQr2 == null) {
            return false;
        }
        this.field_37e0d33_Dne = uQr2.method_d9953b41_Dne(geR.method_117d0718_FWm(this.field_377b6aa_Dne.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_377b6aa_Dne.field_22c5fd_IjH), geR.method_117d0718_FWm(this.field_377b6aa_Dne.field_334487_mrb));
        return this.field_37e0d33_Dne == null ? false : (double)this.field_37e0d33_Dne.method_a6aca7bd_FWm(geR.method_117d0718_FWm(this.field_377b6aa_Dne.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_377b6aa_Dne.field_22c5fd_IjH), geR.method_117d0718_FWm(this.field_377b6aa_Dne.field_334487_mrb)) < 2.25;
    }

    @Override
    public void method_ae128dc7_bzF() {
        this.field_37e0d33_Dne.method_7c6f6039_FWm();
    }

    public SET(kSJ kSJ2) {
        this.field_377b6aa_Dne = kSJ2;
    }

    @Override
    public void method_7c6f6039_FWm() {
        this.field_377b6aa_Dne.method_23028a4c_Dne().method_117d59bb_FWm(true);
        this.field_377b6aa_Dne.method_23028a4c_Dne().method_143fdded_bzF(true);
        this.field_37e0d33_Dne = null;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return this.field_377b6aa_Dne.field_36c4f18_Dne.method_7a46289e_Dne() ? false : !this.field_37e0d33_Dne.field_2092bf_Dne && this.field_37e0d33_Dne.method_16cca7e_Dne(geR.method_117d0718_FWm(this.field_377b6aa_Dne.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_377b6aa_Dne.field_334487_mrb));
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_377b6aa_Dne.method_23028a4c_Dne().method_117d59bb_FWm(false);
        this.field_377b6aa_Dne.method_23028a4c_Dne().method_143fdded_bzF(false);
    }
}

