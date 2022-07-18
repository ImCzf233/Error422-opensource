package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class uxm
extends cMv {
    private Qnq field_36c4f18_Dne;
    uQr field_37c3fb6_Dne;
    private int field_2092ae_Dne = 0;
    private pjB field_37a51e4_Dne;
    private pjB field_20341dc3_FWm;

    private void method_907a9d21_Qnq() {
        pjB pjB2 = this.field_37a51e4_Dne.method_cb140201_Dne(this.field_20341dc3_FWm);
        this.field_20341dc3_FWm.method_117d19ea_FWm(6000);
        this.field_37a51e4_Dne.method_117d19ea_FWm(6000);
        pjB2.method_117d19ea_FWm(-24000);
        pjB2.method_9ce0fc65_FWm(this.field_37a51e4_Dne.field_2f0dd3_div, this.field_37a51e4_Dne.field_22c5fd_IjH, this.field_37a51e4_Dne.field_334487_mrb, 0.0f, 0.0f);
        this.field_36c4f18_Dne.method_94d18be5_FWm(pjB2);
        this.field_36c4f18_Dne.method_b43d849c_Dne(pjB2, (byte)12);
    }

    public uxm(pjB pjB2) {
        this.field_37a51e4_Dne = pjB2;
        this.field_36c4f18_Dne = pjB2.field_36c4f18_Dne;
        this.method_ce7f5da9_Dne(3);
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return this.field_2092ae_Dne >= 0 && this.method_ae128dcb_bzF() && this.field_37a51e4_Dne.method_ae128dba_bzF() == 0;
    }

    @Override
    public void method_ae128dc7_bzF() {
        --this.field_2092ae_Dne;
        this.field_37a51e4_Dne.method_230db26a_Dne().method_d3754820_Dne(this.field_20341dc3_FWm, 10.0f, 30.0f);
        if (this.field_37a51e4_Dne.method_bb7dd80e_Dne(this.field_20341dc3_FWm) > 2.25) {
            this.field_37a51e4_Dne.method_23028a4c_Dne().method_740ba296_Dne(this.field_20341dc3_FWm, 0.25f);
        } else if (this.field_2092ae_Dne == 0 && this.field_20341dc3_FWm.method_86921671_LVR()) {
            this.method_907a9d21_Qnq();
        }
        if (this.field_37a51e4_Dne.method_b5ceee8_Dne().nextInt(35) == 0) {
            this.field_36c4f18_Dne.method_b43d849c_Dne(this.field_37a51e4_Dne, (byte)12);
        }
    }

    @Override
    public void method_7c6f6039_FWm() {
        this.field_37c3fb6_Dne = null;
        this.field_20341dc3_FWm = null;
        this.field_37a51e4_Dne.method_ce92b9a6_IjH(false);
    }

    @Override
    public boolean method_7a46289e_Dne() {
        if (this.field_37a51e4_Dne.method_ae128dba_bzF() != 0) {
            return false;
        }
        if (this.field_37a51e4_Dne.method_b5ceee8_Dne().nextInt(500) != 0) {
            return false;
        }
        this.field_37c3fb6_Dne = this.field_36c4f18_Dne.field_36be6b6_Dne.method_b7b639d5_Dne(geR.method_117d0718_FWm(this.field_37a51e4_Dne.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_37a51e4_Dne.field_22c5fd_IjH), geR.method_117d0718_FWm(this.field_37a51e4_Dne.field_334487_mrb), 0);
        if (this.field_37c3fb6_Dne == null) {
            return false;
        }
        if (!this.method_ae128dcb_bzF()) {
            return false;
        }
        sMa sMa2 = this.field_36c4f18_Dne.method_82785e85_Dne(pjB.class, this.field_37a51e4_Dne.field_373a3ed_Dne.method_b78565d7_FWm(8.0, 3.0, 8.0), this.field_37a51e4_Dne);
        if (sMa2 == null) {
            return false;
        }
        this.field_20341dc3_FWm = (pjB)sMa2;
        return this.field_20341dc3_FWm.method_ae128dba_bzF() == 0;
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_2092ae_Dne = 300;
        this.field_37a51e4_Dne.method_ce92b9a6_IjH(true);
    }

    private boolean method_ae128dcb_bzF() {
        if (!this.field_37c3fb6_Dne.method_7c6f603d_FWm()) {
            return false;
        }
        int n = (int)((double)this.field_37c3fb6_Dne.method_7c6f602c_FWm() * 0.35);
        return this.field_37c3fb6_Dne.method_907a9d14_Qnq() < n;
    }
}

