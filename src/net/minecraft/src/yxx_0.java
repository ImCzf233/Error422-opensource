package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Calendar;

/*
 * Renamed from yXX
 */
public class yxx_0
extends LHi
implements vjn {
    private etz_0 field_3757e21_Dne;
    private Auu field_36523eb_Dne = new Auu(this, 0.25f, 20, 60, 15.0f);

    @Override
    public boolean method_ad72a717_bzF(sMa sMa2) {
        if (super.method_ad72a717_bzF(sMa2)) {
            if (this.method_ae128dba_bzF() == 1 && sMa2 instanceof FUH) {
                ((FUH)sMa2).method_fe8e2b7b_Qnq(new NAx(SXd.field_7578fe9a_EyB.field_2092ae_Dne, 200));
            }
            return true;
        }
        return false;
    }

    public void method_907a9d21_Qnq() {
        this.field_36ae2b9_Dne.method_a039d9fb_Dne(this.field_3757e21_Dne);
        this.field_36ae2b9_Dne.method_a039d9fb_Dne(this.field_36523eb_Dne);
        NMq nMq = this.method_23040479_Dne();
        if (nMq != null && nMq.field_2e5f1b_bzF == dEr.field_3667432_Dne.field_267cf5_Qnq) {
            this.field_36ae2b9_Dne.method_9212764c_Dne(4, this.field_36523eb_Dne);
        } else {
            this.field_36ae2b9_Dne.method_9212764c_Dne(4, this.field_3757e21_Dne);
        }
    }

    public void method_117d19ea_FWm(int n) {
        this.field_378ab08_Dne.method_62ca2346_FWm(13, (byte)n);
        boolean bl = this.field_342275_ooe = n == 1;
        if (n == 1) {
            this.method_16b621a_Dne(0.72f, 2.34f);
        } else {
            this.method_16b621a_Dne(0.6f, 1.8f);
        }
    }

    @Override
    protected String method_6a89a3dc_div() {
        return "mob.skeleton.death";
    }

    @Override
    protected int method_baa393f5_kGO() {
        return dEr.field_f0a61753_zGp.field_267cf5_Qnq;
    }

    @Override
    public aYc method_230cd2e0_Dne() {
        return aYc.field_202d1060_FWm;
    }

    @Override
    public void method_c6daaac1_Dne(zBn zBn2) {
        super.method_c6daaac1_Dne(zBn2);
        if (zBn2.method_2314d444_Dne() instanceof hhc && zBn2.method_f88b2463_FWm() instanceof FiG) {
            FiG fiG = (FiG)zBn2.method_f88b2463_FWm();
            double d = fiG.field_2f0dd3_div - this.field_2f0dd3_div;
            double d2 = fiG.field_334487_mrb - this.field_334487_mrb;
            if (d * d + d2 * d2 >= 2500.0) {
                fiG.method_831230fe_Dne(qlg.field_1efa1379_qLR);
            }
        }
    }

    @Override
    protected String method_3c9d12fd_DyG() {
        return "mob.skeleton.hurt";
    }

    @Override
    public void method_80692b1a_ICU() {
        Calendar calendar;
        if (this.field_36c4f18_Dne.field_3690d00_Dne instanceof XjO && this.method_b5ceee8_Dne().nextInt(5) > 0) {
            this.field_36ae2b9_Dne.method_9212764c_Dne(4, this.field_3757e21_Dne);
            this.method_117d19ea_FWm(1);
            this.method_19b4c3a3_a_(0, new NMq(dEr.field_328e7401_trS));
        } else {
            this.field_36ae2b9_Dne.method_9212764c_Dne(4, this.field_36523eb_Dne);
            this.method_c738b194_qrB();
            this.method_8692166d_LVR();
        }
        this.method_63ae5a10_div(this.field_7331eae7_Dne.nextFloat() < field_3f1c586_Dne[this.field_36c4f18_Dne.field_2d29f4_aFZ]);
        if (this.method_9e6e1a08_Dne(4) == null && (calendar = this.field_36c4f18_Dne.method_8fb123cd_Dne()).get(2) + 1 == 10 && calendar.get(5) == 31 && this.field_7331eae7_Dne.nextFloat() < 0.25f) {
            this.method_19b4c3a3_a_(4, new NMq(this.field_7331eae7_Dne.nextFloat() < 0.1f ? zKP.field_dcc1edd5_XwR : zKP.field_32158d62_aJO));
            this.field_4039e07_FWm[4] = 0.0f;
        }
    }

    @Override
    public void method_740ba292_Dne(FUH fUH, float f) {
        hhc hhc2 = new hhc(this.field_36c4f18_Dne, this, fUH, 1.6f, 14 - this.field_36c4f18_Dne.field_2d29f4_aFZ * 4);
        int n = UYp.method_6e3a6b59_Dne(ycv.field_71ad6b0f_Vxn.field_21260d_FWm, this.method_23040479_Dne());
        int n2 = UYp.method_6e3a6b59_Dne(ycv.field_850f9b18_ceE.field_21260d_FWm, this.method_23040479_Dne());
        hhc2.method_ce7f4ae4_Dne((double)(f * 2.0f) + this.field_7331eae7_Dne.nextGaussian() * 0.25 + (double)((float)this.field_36c4f18_Dne.field_2d29f4_aFZ * 0.11f));
        if (n > 0) {
            hhc2.method_ce7f4ae4_Dne(hhc2.method_7a462888_Dne() + (double)n * 0.5 + 0.5);
        }
        if (n2 > 0) {
            hhc2.method_ce7f5da9_Dne(n2);
        }
        if (UYp.method_6e3a6b59_Dne(ycv.field_758a702d_EyB.field_21260d_FWm, this.method_23040479_Dne()) > 0 || this.method_ae128dba_bzF() == 1) {
            hhc2.method_87b738a3_aFZ(100);
        }
        this.method_fbd4aee4_Dne("random.bow", 1.0f, 1.0f / (this.method_b5ceee8_Dne().nextFloat() * 0.4f + 0.8f));
        this.field_36c4f18_Dne.method_94d18be5_FWm(hhc2);
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        super.method_66a36cd8_FWm(wkD);
        if (wkD.method_8f501fe8_Dne("SkeletonType")) {
            byte by = wkD.method_8f501fd0_Dne("SkeletonType");
            this.method_117d19ea_FWm(by);
        }
        this.method_907a9d21_Qnq();
    }

    public int method_ae128dba_bzF() {
        return this.field_378ab08_Dne.method_ce7f5d95_Dne(13);
    }

    public yxx_0(Qnq qnq) {
        super(qnq);
        this.field_3757e21_Dne = new etz_0(this, FiG.class, 0.31f, false);
        this.field_c480ca78_bzF = "/mob/skeleton.png";
        this.field_2e1df2_cHy = 0.25f;
        this.field_36ae2b9_Dne.method_9212764c_Dne(1, new Cyb(this));
        this.field_36ae2b9_Dne.method_9212764c_Dne(2, new CBo(this));
        this.field_36ae2b9_Dne.method_9212764c_Dne(3, new ITf(this, this.field_2e1df2_cHy));
        this.field_36ae2b9_Dne.method_9212764c_Dne(5, new IBw(this, this.field_2e1df2_cHy));
        this.field_36ae2b9_Dne.method_9212764c_Dne(6, new yws(this, FiG.class, 8.0f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(6, new cHg(this));
        this.field_2024ae98_FWm.method_9212764c_Dne(1, new QRF(this, false));
        this.field_2024ae98_FWm.method_9212764c_Dne(2, new AmF(this, FiG.class, 16.0f, 0, true));
        if (qnq != null && !qnq.field_2d2a05_aFZ) {
            this.method_907a9d21_Qnq();
        }
    }

    @Override
    public void method_8288d6ee_IjH() {
        float f;
        if (this.field_36c4f18_Dne.method_7a46289e_Dne() && !this.field_36c4f18_Dne.field_2d2a05_aFZ && (f = this.method_ce7f5256_Dne(1.0f)) > 0.5f && this.field_7331eae7_Dne.nextFloat() * 30.0f < (f - 0.4f) * 2.0f && this.field_36c4f18_Dne.method_76d9fc47_aFZ(geR.method_117d0718_FWm(this.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_22c5fd_IjH), geR.method_117d0718_FWm(this.field_334487_mrb))) {
            boolean bl = true;
            NMq nMq = this.method_9e6e1a08_Dne(4);
            if (nMq != null) {
                if (nMq.method_7c6f603d_FWm()) {
                    nMq.method_ce7f5da9_Dne(nMq.method_ae128dba_bzF() + this.field_7331eae7_Dne.nextInt(2));
                    if (nMq.method_ae128dba_bzF() >= nMq.method_a98a0653_aFZ()) {
                        this.method_55b582d6_FWm(nMq);
                        this.method_19b4c3a3_a_(4, null);
                    }
                }
                bl = false;
            }
            if (bl) {
                this.method_87b738a3_aFZ(8);
            }
        }
        if (this.field_36c4f18_Dne.field_2d2a05_aFZ && this.method_ae128dba_bzF() == 1) {
            this.method_16b621a_Dne(0.72f, 2.34f);
        }
        super.method_8288d6ee_IjH();
    }

    @Override
    public int method_bb7dd813_Dne(sMa sMa2) {
        if (this.method_ae128dba_bzF() == 1) {
            NMq nMq = this.method_23040479_Dne();
            int n = 4;
            if (nMq != null) {
                n += nMq.method_bb7dd813_Dne(this);
            }
            return n;
        }
        return super.method_bb7dd813_Dne(sMa2);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 20;
    }

    @Override
    protected void method_7c6f6039_FWm() {
        super.method_7c6f6039_FWm();
        this.field_378ab08_Dne.method_ad009545_Dne(13, (byte) 0);
    }

    @Override
    protected String method_a174454e_zGp() {
        return "mob.skeleton.say";
    }

    @Override
    public String method_6859cdb9_bzF() {
        return this.method_ae128dba_bzF() == 1 ? "/mob/skeleton_wither.png" : super.method_6859cdb9_bzF();
    }

    @Override
    protected void method_ce9279d5_IjH(int n) {
        if (this.method_ae128dba_bzF() == 1) {
            this.method_2cda29ee_Dne(new NMq(dEr.field_e405241a_mfU.field_267cf5_Qnq, 1, 1), 0.0f);
        }
    }

    @Override
    protected void method_17484c9_Dne(boolean bl, int n) {
        int n2;
        int n3;
        if (this.method_ae128dba_bzF() == 1) {
            n3 = this.field_7331eae7_Dne.nextInt(3 + n) - 1;
            for (n2 = 0; n2 < n3; ++n2) {
                this.method_9045499d_Dne(dEr.field_16278184_DyG.field_267cf5_Qnq, 1);
            }
        } else {
            n3 = this.field_7331eae7_Dne.nextInt(3 + n);
            for (n2 = 0; n2 < n3; ++n2) {
                this.method_9045499d_Dne(dEr.field_f0a61753_zGp.field_267cf5_Qnq, 1);
            }
        }
        n3 = this.field_7331eae7_Dne.nextInt(3 + n);
        for (n2 = 0; n2 < n3; ++n2) {
            this.method_9045499d_Dne(dEr.field_fc3bf6d1_tIz.field_267cf5_Qnq, 1);
        }
    }

    @Override
    protected void method_c738b194_qrB() {
        super.method_c738b194_qrB();
        this.method_19b4c3a3_a_(0, new NMq(dEr.field_3667432_Dne));
    }

    @Override
    public boolean method_cbcb3929_tgc() {
        return true;
    }

    @Override
    public void method_19b4c3a3_a_(int n, NMq nMq) {
        super.method_19b4c3a3_a_(n, nMq);
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ && n == 0) {
            this.method_907a9d21_Qnq();
        }
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        super.method_8d4fb917_Dne(wkD);
        wkD.method_5ab43558_Dne("SkeletonType", (byte)this.method_ae128dba_bzF());
    }

    @Override
    protected void method_5972745a_Dne(int n, int n2, int n3, int n4) {
        this.method_fbd4aee4_Dne("mob.skeleton.step", 0.15f, 1.0f);
    }
}

