package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class wao
extends tkl_0
implements vjn {
    @Override
    protected int method_baa393f5_kGO() {
        return dEr.field_4817800a_iNQ.field_267cf5_Qnq;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 4;
    }

    public wao(Qnq qnq) {
        super(qnq);
        this.field_c480ca78_bzF = "/mob/snowman.png";
        this.method_16b621a_Dne(0.4f, 1.8f);
        this.method_23028a4c_Dne().method_ce7f9d7a_Dne(true);
        this.field_36ae2b9_Dne.method_9212764c_Dne(1, new Auu(this, 0.25f, 20, 10.0f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(2, new IBw(this, 0.2f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(3, new yws(this, FiG.class, 6.0f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(4, new cHg(this));
        this.field_2024ae98_FWm.method_9212764c_Dne(1, new AmF(this, FUH.class, 16.0f, 0, true, false, ZFz.field_37a074c_Dne));
    }

    @Override
    public boolean method_cbcb3929_tgc() {
        return true;
    }

    @Override
    public void method_740ba292_Dne(FUH fUH, float f) {
        kxx_0 kxx_02 = new kxx_0(this.field_36c4f18_Dne, this);
        double d = fUH.field_2f0dd3_div - this.field_2f0dd3_div;
        double d2 = fUH.field_22c5fd_IjH + (double)fUH.method_59ee189_c_() - (double)1.1f - kxx_02.field_22c5fd_IjH;
        double d3 = fUH.field_334487_mrb - this.field_334487_mrb;
        float f2 = geR.method_ce7f4ad4_Dne(d * d + d3 * d3) * 0.2f;
        kxx_02.method_b5821797_bzF(d, d2 + (double)f2, d3, 1.6f, 12.0f);
        this.method_fbd4aee4_Dne("random.bow", 1.0f, 1.0f / (this.method_b5ceee8_Dne().nextFloat() * 0.4f + 0.8f));
        this.field_36c4f18_Dne.method_94d18be5_FWm(kxx_02);
    }

    @Override
    public void method_8288d6ee_IjH() {
        int n;
        int n2;
        super.method_8288d6ee_IjH();
        if (this.method_9a443a9d_XHL()) {
            this.method_147b2066_Dne(zBn.field_7141d10c_aFZ, 1);
        }
        if (this.field_36c4f18_Dne.method_90477c37_Dne(n2 = geR.method_117d0718_FWm(this.field_2f0dd3_div), n = geR.method_117d0718_FWm(this.field_334487_mrb)).method_ae128db7_bzF() > 1.0f) {
            this.method_147b2066_Dne(zBn.field_203818a5_FWm, 1);
        }
        for (n2 = 0; n2 < 4; ++n2) {
            int n3;
            int n4;
            n = geR.method_117d0718_FWm(this.field_2f0dd3_div + (double)((float)(n2 % 2 * 2 - 1) * 0.25f));
            if (this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n, n4 = geR.method_117d0718_FWm(this.field_22c5fd_IjH), n3 = geR.method_117d0718_FWm(this.field_334487_mrb + (double)((float)(n2 / 2 % 2 * 2 - 1) * 0.25f))) != 0 || !(this.field_36c4f18_Dne.method_90477c37_Dne(n, n3).method_ae128db7_bzF() < 0.8f) || !zKP.field_23a1e80a_EwP.method_9cb39134_Dne(this.field_36c4f18_Dne, n, n4, n3)) continue;
            this.field_36c4f18_Dne.method_2ee8c47d_FWm(n, n4, n3, zKP.field_23a1e80a_EwP.field_21260d_FWm);
        }
    }

    @Override
    protected void method_17484c9_Dne(boolean bl, int n) {
        int n2 = this.field_7331eae7_Dne.nextInt(16);
        for (int i = 0; i < n2; ++i) {
            this.method_9045499d_Dne(dEr.field_4817800a_iNQ.field_267cf5_Qnq, 1);
        }
    }
}

