package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class gNt
extends cMv {
    private int field_21260d_FWm = -1;
    private kSJ field_377b6aa_Dne;
    private int field_2092ae_Dne = -1;
    private yQQ field_37e0d33_Dne;

    @Override
    public boolean method_7a46289e_Dne() {
        if (!(this.field_377b6aa_Dne.field_36c4f18_Dne.method_7a46289e_Dne() && !this.field_377b6aa_Dne.field_36c4f18_Dne.method_ae128dcb_bzF() || this.field_377b6aa_Dne.field_36c4f18_Dne.field_3690d00_Dne.field_21261e_FWm)) {
            if (this.field_377b6aa_Dne.method_b5ceee8_Dne().nextInt(50) != 0) {
                return false;
            }
            if (this.field_2092ae_Dne != -1 && this.field_377b6aa_Dne.method_2be42992_Dne(this.field_2092ae_Dne, this.field_377b6aa_Dne.field_22c5fd_IjH, this.field_21260d_FWm) < 4.0) {
                return false;
            }
            uQr uQr2 = this.field_377b6aa_Dne.field_36c4f18_Dne.field_36be6b6_Dne.method_b7b639d5_Dne(geR.method_117d0718_FWm(this.field_377b6aa_Dne.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_377b6aa_Dne.field_22c5fd_IjH), geR.method_117d0718_FWm(this.field_377b6aa_Dne.field_334487_mrb), 14);
            if (uQr2 == null) {
                return false;
            }
            this.field_37e0d33_Dne = uQr2.method_accb02c2_FWm(geR.method_117d0718_FWm(this.field_377b6aa_Dne.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_377b6aa_Dne.field_22c5fd_IjH), geR.method_117d0718_FWm(this.field_377b6aa_Dne.field_334487_mrb));
            return this.field_37e0d33_Dne != null;
        }
        return false;
    }

    public gNt(kSJ kSJ2) {
        this.field_377b6aa_Dne = kSJ2;
        this.method_ce7f5da9_Dne(1);
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return !this.field_377b6aa_Dne.method_23028a4c_Dne().method_ae128dcb_bzF();
    }

    @Override
    public void method_7c6f6039_FWm() {
        this.field_2092ae_Dne = this.field_37e0d33_Dne.method_7a46288d_Dne();
        this.field_21260d_FWm = this.field_37e0d33_Dne.method_ae128dba_bzF();
        this.field_37e0d33_Dne = null;
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_2092ae_Dne = -1;
        if (this.field_377b6aa_Dne.method_2be42992_Dne(this.field_37e0d33_Dne.method_7a46288d_Dne(), this.field_37e0d33_Dne.field_21260d_FWm, this.field_37e0d33_Dne.method_ae128dba_bzF()) > 256.0) {
            chN chN2 = gWB.method_25f96ebb_Dne(this.field_377b6aa_Dne, 14, 3, this.field_377b6aa_Dne.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne((double)this.field_37e0d33_Dne.method_7a46288d_Dne() + 0.5, this.field_37e0d33_Dne.method_7c6f602c_FWm(), (double)this.field_37e0d33_Dne.method_ae128dba_bzF() + 0.5));
            if (chN2 != null) {
                this.field_377b6aa_Dne.method_23028a4c_Dne().method_50a172a0_Dne(chN2.field_2092a9_Dne, chN2.field_212608_FWm, chN2.field_2e5f16_bzF, 0.3f);
            }
        } else {
            this.field_377b6aa_Dne.method_23028a4c_Dne().method_50a172a0_Dne((double)this.field_37e0d33_Dne.method_7a46288d_Dne() + 0.5, this.field_37e0d33_Dne.method_7c6f602c_FWm(), (double)this.field_37e0d33_Dne.method_ae128dba_bzF() + 0.5, 0.3f);
        }
    }
}

