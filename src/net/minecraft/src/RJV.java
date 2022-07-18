package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.client.Minecraft;

public class RJV {
    private int field_2e5f1b_bzF = -1;
    private int field_2092ae_Dne = -1;
    private final fzy field_37608e7_Dne;
    private float field_21260a_FWm = 0.0f;
    private NMq field_36a761a_Dne = null;
    private float field_2092ab_Dne = 0.0f;
    private int field_2d29f4_aFZ = 0;
    public XHL field_36eea90_Dne = XHL.field_2028b66f_FWm;
    private final Minecraft field_493682ed_Dne;
    private int field_21260d_FWm = -1;
    private boolean field_2092bf_Dne = false;
    private int field_267cf5_Qnq = 0;

    public boolean method_ae128dcb_bzF() {
        return true;
    }

    public void method_49863864_FWm(FiG fiG) {
        fiG.field_334489_mrb = -180.0f;
    }

    public MJs method_c350188e_Dne(Qnq qnq) {
        return new MJs(this.field_493682ed_Dne, qnq, this.field_493682ed_Dne.field_37d3e5f_Dne, this.field_37608e7_Dne);
    }

    public boolean method_d0db4f89_Dne(FiG fiG, Qnq qnq, NMq nMq) {
        this.method_ae128dc7_bzF();
        this.field_37608e7_Dne.method_5536af4d_FWm(new dtj_0(-1, -1, -1, 255, fiG.field_36a059b_Dne.method_23040479_Dne(), 0.0f, 0.0f, 0.0f));
        int n = nMq.field_2092ae_Dne;
        NMq nMq2 = nMq.method_a9f2e429_Dne(qnq, fiG);
        if (nMq2 == nMq && (nMq2 == null || nMq2.field_2092ae_Dne == n)) {
            return false;
        }
        fiG.field_36a059b_Dne.field_8360c375_Dne[fiG.field_36a059b_Dne.field_2092ae_Dne] = nMq2;
        if (nMq2.field_2092ae_Dne == 0) {
            fiG.field_36a059b_Dne.field_8360c375_Dne[fiG.field_36a059b_Dne.field_2092ae_Dne] = null;
        }
        return true;
    }

    public boolean method_5972745e_Dne(int n, int n2, int n3, int n4) {
        NMq nMq;
        if (this.field_36eea90_Dne.method_7a46289e_Dne() && !this.field_493682ed_Dne.field_369f6b6_Dne.method_a6aca7ce_FWm(n, n2, n3)) {
            return false;
        }
        VzZ vzZ = this.field_493682ed_Dne.field_36ebf36_Dne;
        zKP zKP2 = zKP.field_8374b848_Dne[vzZ.method_2c2cf7bc_Dne(n, n2, n3)];
        if (zKP2 == null) {
            return false;
        }
        vzZ.method_57aed1c2_Qnq(2001, n, n2, n3, zKP2.field_21260d_FWm + (vzZ.method_2dee76f_bzF(n, n2, n3) << 12));
        int n5 = vzZ.method_2dee76f_bzF(n, n2, n3);
        boolean bl = vzZ.method_2e7161e6_Qnq(n, n2, n3);
        if (bl) {
            zKP2.method_35fd2546_bzF(vzZ, n, n2, n3, n5);
        }
        this.field_21260d_FWm = -1;
        if (!this.field_36eea90_Dne.method_7c6f603d_FWm() && (nMq = this.field_493682ed_Dne.field_369f6b6_Dne.method_22900b26_bzF()) != null) {
            nMq.method_c5b1410a_Dne(vzZ, zKP2.field_21260d_FWm, n, n2, n3, this.field_493682ed_Dne.field_369f6b6_Dne);
            if (nMq.field_2092ae_Dne == 0) {
                this.field_493682ed_Dne.field_369f6b6_Dne.method_74d3fa75_BJH();
            }
        }
        return bl;
    }

    private void method_ae128dc7_bzF() {
        int n = this.field_493682ed_Dne.field_369f6b6_Dne.field_36a059b_Dne.field_2092ae_Dne;
        if (n != this.field_2d29f4_aFZ) {
            this.field_2d29f4_aFZ = n;
            this.field_37608e7_Dne.method_5536af4d_FWm(new aig(this.field_2d29f4_aFZ));
        }
    }

    public void method_7c6f6039_FWm() {
        this.method_ae128dc7_bzF();
        this.field_493682ed_Dne.field_3788296_Dne.method_ae128dc7_bzF();
    }

    public boolean method_907a9d25_Qnq() {
        return !this.field_36eea90_Dne.method_7c6f603d_FWm();
    }

    public void method_fd8868e_Dne(NMq nMq, int n) {
        if (this.field_36eea90_Dne.method_7c6f603d_FWm()) {
            this.field_37608e7_Dne.method_5536af4d_FWm(new pRp(n, nMq));
        }
    }

    public void method_5972745a_Dne(int n, int n2, int n3, int n4) {
        if (!this.field_36eea90_Dne.method_7a46289e_Dne() || this.field_493682ed_Dne.field_369f6b6_Dne.method_a6aca7ce_FWm(n, n2, n3)) {
            if (this.field_36eea90_Dne.method_7c6f603d_FWm()) {
                this.field_37608e7_Dne.method_5536af4d_FWm(new Wbc(0, n, n2, n3, n4));
                RJV.method_f52ea817_Dne(this.field_493682ed_Dne, this, n, n2, n3, n4);
                this.field_267cf5_Qnq = 5;
            } else if (!this.field_2092bf_Dne || !this.method_2c2cf7cd_Dne(n, n2, n3)) {
                if (this.field_2092bf_Dne) {
                    this.field_37608e7_Dne.method_5536af4d_FWm(new Wbc(1, this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF, n4));
                }
                this.field_37608e7_Dne.method_5536af4d_FWm(new Wbc(0, n, n2, n3, n4));
                int n5 = this.field_493682ed_Dne.field_36ebf36_Dne.method_2c2cf7bc_Dne(n, n2, n3);
                if (n5 > 0 && this.field_2092ab_Dne == 0.0f) {
                    zKP.field_8374b848_Dne[n5].method_41dd09cd_Dne(this.field_493682ed_Dne.field_36ebf36_Dne, n, n2, n3, this.field_493682ed_Dne.field_369f6b6_Dne);
                }
                if (n5 > 0 && zKP.field_8374b848_Dne[n5].method_b4ebd429_Dne(this.field_493682ed_Dne.field_369f6b6_Dne, this.field_493682ed_Dne.field_369f6b6_Dne.field_36c4f18_Dne, n, n2, n3) >= 1.0f) {
                    this.method_5972745e_Dne(n, n2, n3, n4);
                } else {
                    this.field_2092bf_Dne = true;
                    this.field_2092ae_Dne = n;
                    this.field_21260d_FWm = n2;
                    this.field_2e5f1b_bzF = n3;
                    this.field_36a761a_Dne = this.field_493682ed_Dne.field_369f6b6_Dne.method_23040479_Dne();
                    this.field_2092ab_Dne = 0.0f;
                    this.field_21260a_FWm = 0.0f;
                    this.field_493682ed_Dne.field_36ebf36_Dne.method_285a57e3_aFZ(this.field_493682ed_Dne.field_369f6b6_Dne.field_2d29f4_aFZ, this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF, (int)(this.field_2092ab_Dne * 10.0f) - 1);
                }
            }
        }
    }

    public float method_7a46288a_Dne() {
        return this.field_36eea90_Dne.method_7c6f603d_FWm() ? 5.0f : 4.5f;
    }

    public boolean method_7a46289e_Dne() {
        return false;
    }

    private boolean method_2c2cf7cd_Dne(int n, int n2, int n3) {
        boolean bl;
        NMq nMq = this.field_493682ed_Dne.field_369f6b6_Dne.method_23040479_Dne();
        boolean bl2 = bl = this.field_36a761a_Dne == null && nMq == null;
        if (this.field_36a761a_Dne != null && nMq != null) {
            bl = nMq.field_2e5f1b_bzF == this.field_36a761a_Dne.field_2e5f1b_bzF && NMq.method_a981fd7e_Dne(nMq, this.field_36a761a_Dne) && (nMq.method_7c6f603d_FWm() || nMq.method_907a9d14_Qnq() == this.field_36a761a_Dne.method_907a9d14_Qnq());
        }
        return n == this.field_2092ae_Dne && n2 == this.field_21260d_FWm && n3 == this.field_2e5f1b_bzF && bl;
    }

    public boolean method_d44b4596_zGp() {
        return this.field_36eea90_Dne.method_7c6f603d_FWm();
    }

    public void method_7a46289a_Dne() {
        if (this.field_2092bf_Dne) {
            this.field_37608e7_Dne.method_5536af4d_FWm(new Wbc(1, this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF, -1));
        }
        this.field_2092bf_Dne = false;
        this.field_2092ab_Dne = 0.0f;
        this.field_493682ed_Dne.field_36ebf36_Dne.method_285a57e3_aFZ(this.field_493682ed_Dne.field_369f6b6_Dne.field_2d29f4_aFZ, this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF, -1);
    }

    public boolean method_a98a0664_aFZ() {
        return this.field_36eea90_Dne.method_7c6f603d_FWm();
    }

    public void method_16cca7a_Dne(int n, int n2) {
        this.field_37608e7_Dne.method_5536af4d_FWm(new fwI(n, n2));
    }

    public void method_8d1afe0b_Dne(XHL xHL) {
        this.field_36eea90_Dne = xHL;
        this.field_36eea90_Dne.method_c0e591bc_Dne(this.field_493682ed_Dne.field_369f6b6_Dne.field_37cb681_Dne);
    }

    public static void method_f52ea817_Dne(Minecraft minecraft, RJV rJV, int n, int n2, int n3, int n4) {
        if (!minecraft.field_36ebf36_Dne.method_8a4fa3e7_Dne(minecraft.field_369f6b6_Dne, n, n2, n3, n4)) {
            rJV.method_5972745e_Dne(n, n2, n3, n4);
        }
    }

    public void method_7c61cf15_Dne(NMq nMq) {
        if (this.field_36eea90_Dne.method_7c6f603d_FWm() && nMq != null) {
            this.field_37608e7_Dne.method_5536af4d_FWm(new pRp(-1, nMq));
        }
    }

    public boolean method_7c6f603d_FWm() {
        return this.field_36eea90_Dne.method_ae128dcb_bzF();
    }

    public void method_703284a3_Dne(FiG fiG) {
        this.field_36eea90_Dne.method_c0e591bc_Dne(fiG.field_37cb681_Dne);
    }

    public void method_62275396_bzF(FiG fiG) {
        this.method_ae128dc7_bzF();
        this.field_37608e7_Dne.method_5536af4d_FWm(new Wbc(5, 0, 0, 0, 255));
        fiG.method_9f50959e_ZfC();
    }

    public RJV(Minecraft minecraft, fzy fzy2) {
        this.field_493682ed_Dne = minecraft;
        this.field_37608e7_Dne = fzy2;
    }

    public void method_2ee8c479_FWm(int n, int n2, int n3, int n4) {
        this.method_ae128dc7_bzF();
        if (this.field_267cf5_Qnq > 0) {
            --this.field_267cf5_Qnq;
        } else if (this.field_36eea90_Dne.method_7c6f603d_FWm()) {
            this.field_267cf5_Qnq = 5;
            this.field_37608e7_Dne.method_5536af4d_FWm(new Wbc(0, n, n2, n3, n4));
            RJV.method_f52ea817_Dne(this.field_493682ed_Dne, this, n, n2, n3, n4);
        } else if (this.method_2c2cf7cd_Dne(n, n2, n3)) {
            int n5 = this.field_493682ed_Dne.field_36ebf36_Dne.method_2c2cf7bc_Dne(n, n2, n3);
            if (n5 == 0) {
                this.field_2092bf_Dne = false;
                return;
            }
            zKP zKP2 = zKP.field_8374b848_Dne[n5];
            this.field_2092ab_Dne += zKP2.method_b4ebd429_Dne(this.field_493682ed_Dne.field_369f6b6_Dne, this.field_493682ed_Dne.field_369f6b6_Dne.field_36c4f18_Dne, n, n2, n3);
            if (this.field_21260a_FWm % 4.0f == 0.0f && zKP2 != null) {
                this.field_493682ed_Dne.field_3788296_Dne.method_d4bea65c_Dne(zKP2.field_a21c1bc0_kGO.method_6859cdb9_bzF(), (float)n + 0.5f, (float)n2 + 0.5f, (float)n3 + 0.5f, (zKP2.field_a21c1bc0_kGO.method_7a46288a_Dne() + 1.0f) / 8.0f, zKP2.field_a21c1bc0_kGO.method_7c6f6029_FWm() * 0.5f);
            }
            this.field_21260a_FWm += 1.0f;
            if (this.field_2092ab_Dne >= 1.0f) {
                this.field_2092bf_Dne = false;
                this.field_37608e7_Dne.method_5536af4d_FWm(new Wbc(2, n, n2, n3, n4));
                this.method_5972745e_Dne(n, n2, n3, n4);
                this.field_2092ab_Dne = 0.0f;
                this.field_21260a_FWm = 0.0f;
                this.field_267cf5_Qnq = 5;
            }
            this.field_493682ed_Dne.field_36ebf36_Dne.method_285a57e3_aFZ(this.field_493682ed_Dne.field_369f6b6_Dne.field_2d29f4_aFZ, this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF, (int)(this.field_2092ab_Dne * 10.0f) - 1);
        } else {
            this.method_5972745a_Dne(n, n2, n3, n4);
        }
    }

    public NMq method_816e2042_Dne(int n, int n2, int n3, int n4, FiG fiG) {
        short s = fiG.field_20257f3d_FWm.method_7abb8253_Dne(fiG.field_36a059b_Dne);
        NMq nMq = fiG.field_20257f3d_FWm.method_a0af09b3_Dne(n2, n3, n4, fiG);
        this.field_37608e7_Dne.method_5536af4d_FWm(new mZp(n, n2, n3, n4, nMq, s));
        return nMq;
    }

    public void method_a64699b7_Dne(FiG fiG, sMa sMa2) {
        this.method_ae128dc7_bzF();
        this.field_37608e7_Dne.method_5536af4d_FWm(new EHr(fiG.field_2d29f4_aFZ, sMa2.field_2d29f4_aFZ, 1));
        fiG.method_70efe4c_IjH(sMa2);
    }

    public boolean method_851a377_Dne(FiG fiG, Qnq qnq, NMq nMq, int n, int n2, int n3, int n4, chN chN2) {
        tkL tkL2;
        int n5;
        this.method_ae128dc7_bzF();
        float f = (float)chN2.field_2092a9_Dne - (float)n;
        float f2 = (float)chN2.field_212608_FWm - (float)n2;
        float f3 = (float)chN2.field_2e5f16_bzF - (float)n3;
        boolean bl = false;
        if ((!fiG.method_a98a0664_aFZ() || fiG.method_23040479_Dne() == null) && (n5 = qnq.method_2c2cf7bc_Dne(n, n2, n3)) > 0 && zKP.field_8374b848_Dne[n5].method_cb53d52e_Dne(qnq, n, n2, n3, fiG, n4, f, f2, f3)) {
            bl = true;
        }
        if (!bl && nMq != null && nMq.method_230de6ba_Dne() instanceof tkL && !(tkL2 = (tkL)nMq.method_230de6ba_Dne()).method_4f447ca9_Dne(qnq, n, n2, n3, n4, fiG, nMq)) {
            return false;
        }
        this.field_37608e7_Dne.method_5536af4d_FWm(new dtj_0(n, n2, n3, n4, fiG.field_36a059b_Dne.method_23040479_Dne(), f, f2, f3));
        if (bl) {
            return true;
        }
        if (nMq == null) {
            return false;
        }
        if (this.field_36eea90_Dne.method_7c6f603d_FWm()) {
            n5 = nMq.method_907a9d14_Qnq();
            int n6 = nMq.field_2092ae_Dne;
            boolean bl2 = nMq.method_2bdf899a_Dne(fiG, qnq, n, n2, n3, n4, f, f2, f3);
            nMq.method_ce7f5da9_Dne(n5);
            nMq.field_2092ae_Dne = n6;
            return bl2;
        }
        return nMq.method_2bdf899a_Dne(fiG, qnq, n, n2, n3, n4, f, f2, f3);
    }

    public boolean method_a64699bb_Dne(FiG fiG, sMa sMa2) {
        this.method_ae128dc7_bzF();
        this.field_37608e7_Dne.method_5536af4d_FWm(new EHr(fiG.field_2d29f4_aFZ, sMa2.field_2d29f4_aFZ, 0));
        return fiG.method_efba61e_aFZ(sMa2);
    }
}

