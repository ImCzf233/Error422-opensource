package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class bVr
extends LHi
implements vjn {
    private static final int[] field_3f1c589_Dne = new int[]{dEr.field_dcb7db43_XwR.field_267cf5_Qnq, dEr.field_391d10a7_WvN.field_267cf5_Qnq, dEr.field_59c23676_exS.field_267cf5_Qnq, dEr.field_fad9f794_EYV.field_267cf5_Qnq, dEr.field_7c27c815_OCU.field_267cf5_Qnq, dEr.field_e637b3ee_cot.field_267cf5_Qnq, dEr.field_d2b52a0a_oIf.field_267cf5_Qnq, dEr.field_d2b52a0a_oIf.field_267cf5_Qnq};
    private int field_21260d_FWm = 0;

    @Override
    public float method_c073dae8_mrb() {
        float f = super.method_c073dae8_mrb();
        if (this.method_86921671_LVR()) {
            f *= 0.75f;
        }
        return f;
    }

    @Override
    protected void method_17484c9_Dne(boolean bl, int n) {
        int n2 = this.field_7331eae7_Dne.nextInt(3) + 1;
        for (int i = 0; i < n2; ++i) {
            int n3 = this.field_7331eae7_Dne.nextInt(3);
            int n4 = field_3f1c589_Dne[this.field_7331eae7_Dne.nextInt(field_3f1c589_Dne.length)];
            if (n > 0) {
                n3 += this.field_7331eae7_Dne.nextInt(n + 1);
            }
            for (int j = 0; j < n3; ++j) {
                this.method_9045499d_Dne(n4, 1);
            }
        }
    }

    @Override
    public void method_ce7f4362_Dne(byte by) {
        if (by == 15) {
            for (int i = 0; i < this.field_7331eae7_Dne.nextInt(35) + 10; ++i) {
                this.field_36c4f18_Dne.method_8600ec24_Dne("witchMagic", this.field_2f0dd3_div + this.field_7331eae7_Dne.nextGaussian() * (double)0.13f, this.field_373a3ed_Dne.field_2d29ef_aFZ + 0.5 + this.field_7331eae7_Dne.nextGaussian() * (double)0.13f, this.field_334487_mrb + this.field_7331eae7_Dne.nextGaussian() * (double)0.13f, 0.0, 0.0, 0.0);
            }
        } else {
            super.method_ce7f4362_Dne(by);
        }
    }

    @Override
    public boolean method_cbcb3929_tgc() {
        return true;
    }

    @Override
    protected String method_a174454e_zGp() {
        return "mob.witch.idle";
    }

    @Override
    public void method_740ba292_Dne(FUH fUH, float f) {
        if (!this.method_86921671_LVR()) {
            YgL ygL = new YgL(this.field_36c4f18_Dne, (FUH)this, 32732);
            ygL.field_29186a_XHL -= -20.0f;
            double d = fUH.field_2f0dd3_div + fUH.field_291868_XHL - this.field_2f0dd3_div;
            double d2 = fUH.field_22c5fd_IjH + (double)fUH.method_59ee189_c_() - (double)1.1f - this.field_22c5fd_IjH;
            double d3 = fUH.field_334487_mrb + fUH.field_31b811_kGO - this.field_334487_mrb;
            float f2 = geR.method_ce7f4ad4_Dne(d * d + d3 * d3);
            if (f2 >= 8.0f && !fUH.method_857f23ec_Dne(SXd.field_75b4b19a_bzF)) {
                ygL.method_ce7f5da9_Dne(32698);
            } else if (fUH.method_9a443a8c_XHL() >= 8 && !fUH.method_857f23ec_Dne(SXd.field_84fe2985_ceE)) {
                ygL.method_ce7f5da9_Dne(32660);
            } else if (f2 <= 3.0f && !fUH.method_857f23ec_Dne(SXd.field_719bf97c_Vxn) && this.field_7331eae7_Dne.nextFloat() < 0.25f) {
                ygL.method_ce7f5da9_Dne(32696);
            }
            ygL.method_b5821797_bzF(d, d2 + (double)(f2 * 0.2f), d3, 0.75f, 8.0f);
            this.field_36c4f18_Dne.method_94d18be5_FWm(ygL);
        }
    }

    @Override
    protected String method_6a89a3dc_div() {
        return "mob.witch.death";
    }

    @Override
    protected void method_7c6f6039_FWm() {
        super.method_7c6f6039_FWm();
        this.method_23123967_Dne().method_ad009545_Dne(21, (byte)0);
    }

    @Override
    protected String method_3c9d12fd_DyG() {
        return "mob.witch.hurt";
    }

    @Override
    public void method_8288d6ee_IjH() {
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            if (this.method_86921671_LVR()) {
                if (this.field_21260d_FWm-- <= 0) {
                    List<NAx> list;
                    this.method_117d59bb_FWm(false);
                    NMq nMq = this.method_23040479_Dne();
                    this.method_19b4c3a3_a_(0, null);
                    if (nMq != null && nMq.field_2e5f1b_bzF == dEr.field_3682442_Dne.field_267cf5_Qnq && (list = dEr.field_3682442_Dne.method_c9635692_Dne(nMq)) != null) {
                        for (NAx nAx : list) {
                            this.method_fe8e2b7b_Qnq(new NAx(nAx));
                        }
                    }
                }
            } else {
                int n = -1;
                if (this.field_7331eae7_Dne.nextFloat() < 0.15f && this.method_cc5ef5c4_trS() && !this.method_857f23ec_Dne(SXd.field_a21d1515_kGO)) {
                    n = 16307;
                } else if (this.field_7331eae7_Dne.nextFloat() < 0.05f && this.field_28e7fd_Vxn < this.method_7a46288d_Dne()) {
                    n = 16341;
                } else if (this.field_7331eae7_Dne.nextFloat() < 0.25f && this.method_228c813f_bzF() != null && !this.method_857f23ec_Dne(SXd.field_2026af8c_FWm) && this.method_228c813f_bzF().method_bb7dd80e_Dne(this) > 121.0) {
                    n = 16274;
                } else if (this.field_7331eae7_Dne.nextFloat() < 0.25f && this.method_228c813f_bzF() != null && !this.method_857f23ec_Dne(SXd.field_2026af8c_FWm) && this.method_228c813f_bzF().method_bb7dd80e_Dne(this) > 121.0) {
                    n = 16274;
                }
                if (n > -1) {
                    this.method_19b4c3a3_a_(0, new NMq(dEr.field_3682442_Dne, 1, n));
                    this.field_21260d_FWm = this.method_23040479_Dne().method_d44b4585_zGp();
                    this.method_117d59bb_FWm(true);
                }
            }
            if (this.field_7331eae7_Dne.nextFloat() < 7.5E-4f) {
                this.field_36c4f18_Dne.method_b43d849c_Dne(this, (byte)15);
            }
        }
        super.method_8288d6ee_IjH();
    }

    public boolean method_86921671_LVR() {
        return this.method_23123967_Dne().method_ce7f5d95_Dne(21) == 1;
    }

    @Override
    protected int method_659de4b4_FWm(zBn zBn2, int n) {
        n = super.method_659de4b4_FWm(zBn2, n);
        if (zBn2.method_f88b2463_FWm() == this) {
            n = 0;
        }
        if (zBn2.method_7ad38807_DyG()) {
            n = (int)((double)n * 0.15);
        }
        return n;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 26;
    }

    public void method_117d59bb_FWm(boolean bl) {
        this.method_23123967_Dne().method_62ca2346_FWm(21, (byte)(bl ? 1 : 0));
    }

    public bVr(Qnq qnq) {
        super(qnq);
        this.field_c480ca78_bzF = "/mob/villager/witch.png";
        this.field_2e1df2_cHy = 0.25f;
        this.field_36ae2b9_Dne.method_9212764c_Dne(1, new Cyb(this));
        this.field_36ae2b9_Dne.method_9212764c_Dne(2, new Auu(this, this.field_2e1df2_cHy, 60, 10.0f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(2, new IBw(this, this.field_2e1df2_cHy));
        this.field_36ae2b9_Dne.method_9212764c_Dne(3, new yws(this, FiG.class, 8.0f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(3, new cHg(this));
        this.field_2024ae98_FWm.method_9212764c_Dne(1, new QRF(this, false));
        this.field_2024ae98_FWm.method_9212764c_Dne(2, new AmF(this, FiG.class, 16.0f, 0, true));
    }
}

