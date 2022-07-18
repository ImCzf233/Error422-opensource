package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class VQx
extends cMv {
    private final float field_2092ab_Dne;
    private final kQo field_377b3a3_Dne;
    private int field_2e5f1b_bzF = 0;
    private int field_267cf5_Qnq = 0;
    private int field_388da6_zGp = 0;
    private int field_2d29f4_aFZ = 0;
    private int field_2092ae_Dne = 0;
    private int field_21260d_FWm = 0;

    private boolean method_ae128dcb_bzF() {
        int n = (int)this.field_377b3a3_Dne.field_22c5fd_IjH;
        double d = 2.147483647E9;
        int n2 = (int)this.field_377b3a3_Dne.field_2f0dd3_div - 8;
        while ((double)n2 < this.field_377b3a3_Dne.field_2f0dd3_div + 8.0) {
            int n3 = (int)this.field_377b3a3_Dne.field_334487_mrb - 8;
            while ((double)n3 < this.field_377b3a3_Dne.field_334487_mrb + 8.0) {
                double d2;
                if (this.method_9cb39134_Dne(this.field_377b3a3_Dne.field_36c4f18_Dne, n2, n, n3) && this.field_377b3a3_Dne.field_36c4f18_Dne.method_2c2cf7cd_Dne(n2, n + 1, n3) && (d2 = this.field_377b3a3_Dne.method_2be42992_Dne(n2, n, n3)) < d) {
                    this.field_267cf5_Qnq = n2;
                    this.field_2d29f4_aFZ = n;
                    this.field_388da6_zGp = n3;
                    d = d2;
                }
                ++n3;
            }
            ++n2;
        }
        return d < 2.147483647E9;
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_377b3a3_Dne.method_23028a4c_Dne().method_50a172a0_Dne((double)this.field_267cf5_Qnq + 0.5, this.field_2d29f4_aFZ + 1, (double)this.field_388da6_zGp + 0.5, this.field_2092ab_Dne);
        this.field_2092ae_Dne = 0;
        this.field_21260d_FWm = 0;
        this.field_2e5f1b_bzF = this.field_377b3a3_Dne.method_b5ceee8_Dne().nextInt(this.field_377b3a3_Dne.method_b5ceee8_Dne().nextInt(1200) + 1200) + 1200;
        this.field_377b3a3_Dne.method_23011cf5_Dne().method_ce7f9d7a_Dne(false);
    }

    @Override
    public void method_7c6f6039_FWm() {
        this.field_377b3a3_Dne.method_ae43cb5b_XHL(false);
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return this.field_377b3a3_Dne.method_86921671_LVR() && !this.field_377b3a3_Dne.method_80692b1e_ICU() && this.field_377b3a3_Dne.method_b5ceee8_Dne().nextDouble() <= (double)0.0065f && this.method_ae128dcb_bzF();
    }

    @Override
    public void method_ae128dc7_bzF() {
        ++this.field_2092ae_Dne;
        this.field_377b3a3_Dne.method_23011cf5_Dne().method_ce7f9d7a_Dne(false);
        if (this.field_377b3a3_Dne.method_2be42992_Dne(this.field_267cf5_Qnq, this.field_2d29f4_aFZ + 1, this.field_388da6_zGp) > 1.0) {
            this.field_377b3a3_Dne.method_ae43cb5b_XHL(false);
            this.field_377b3a3_Dne.method_23028a4c_Dne().method_50a172a0_Dne((double)this.field_267cf5_Qnq + 0.5, this.field_2d29f4_aFZ + 1, (double)this.field_388da6_zGp + 0.5, this.field_2092ab_Dne);
            ++this.field_21260d_FWm;
        } else if (!this.field_377b3a3_Dne.method_80692b1e_ICU()) {
            this.field_377b3a3_Dne.method_ae43cb5b_XHL(true);
        } else {
            --this.field_21260d_FWm;
        }
    }

    private boolean method_9cb39134_Dne(Qnq qnq, int n, int n2, int n3) {
        int n4 = qnq.method_2c2cf7bc_Dne(n, n2, n3);
        int n5 = qnq.method_2dee76f_bzF(n, n2, n3);
        if (n4 == zKP.field_375bc02_Dne.field_21260d_FWm) {
            gon_0 gon_02 = (gon_0)qnq.method_d98e681d_Dne(n, n2, n3);
            if (gon_02.field_2092ae_Dne < 1) {
                return true;
            }
        } else {
            if (n4 == zKP.field_ddf29d67_qrB.field_21260d_FWm) {
                return true;
            }
            if (n4 == zKP.field_d57af75_FfS.field_21260d_FWm && !rTW.method_ce7f5dad_Dne(n5)) {
                return true;
            }
        }
        return false;
    }

    public VQx(kQo kQo2, float f) {
        this.field_377b3a3_Dne = kQo2;
        this.field_2092ab_Dne = f;
        this.method_ce7f5da9_Dne(5);
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return this.field_2092ae_Dne <= this.field_2e5f1b_bzF && this.field_21260d_FWm <= 60 && this.method_9cb39134_Dne(this.field_377b3a3_Dne.field_36c4f18_Dne, this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp);
    }
}

