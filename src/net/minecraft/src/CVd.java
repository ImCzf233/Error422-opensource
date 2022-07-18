package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class CVd
extends ljW {
    public static final yEI field_37ddf2f_Dne = new wXO(new tip());
    protected gDn field_202f7d1a_FWm;
    protected gDn field_375b13b_Dne;
    protected Random field_7331eae7_Dne = new Random();
    protected gDn field_75bd7f28_bzF;

    @Override
    public void method_f9bf07d3_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        boolean bl;
        boolean bl2 = qnq.method_6382f365_kGO(n, n2, n3) || qnq.method_6382f365_kGO(n, n2 + 1, n3);
        int n5 = qnq.method_2dee76f_bzF(n, n2, n3);
        boolean bl3 = bl = (n5 & 8) != 0;
        if (bl2 && !bl) {
            qnq.method_ae303daa_FWm(n, n2, n3, this.field_21260d_FWm, this.method_83516086_Dne(qnq));
            qnq.method_d4dc89ed_Dne(n, n2, n3, n5 | 8, 4);
        } else if (!bl2 && bl) {
            qnq.method_d4dc89ed_Dne(n, n2, n3, n5 & 0xFFFFFFF7, 4);
        }
    }

    @Override
    public int method_83516086_Dne(Qnq qnq) {
        return 4;
    }

    public static HQH method_9e6b69db_Dne(int n) {
        return HQH.method_9e6b69db_Dne(n & 7);
    }

    @Override
    public void method_ca7e4e57_Dne(Qnq qnq, int n, int n2, int n3, FUH fUH, NMq nMq) {
        int n4 = XbN.method_40c3a80b_Dne(qnq, n, n2, n3, fUH);
        qnq.method_d4dc89ed_Dne(n, n2, n3, n4, 2);
        if (nMq.method_d44b4596_zGp()) {
            ((UTs)qnq.method_d98e681d_Dne(n, n2, n3)).method_8f501fe4_Dne(nMq.method_d1f1ed87_FWm());
        }
    }

    protected CVd(int n) {
        super(n, KFd.field_712c8169_aFZ);
        this.method_82a88d64_Dne(JcN.field_75b0c0e4_bzF);
    }

    public static loO method_9dc26def_Dne(cwq_0 cwq_02) {
        HQH hQH = CVd.method_9e6b69db_Dne(cwq_02.method_907a9d14_Qnq());
        double d = cwq_02.method_7a462888_Dne() + 0.7 * (double)hQH.method_7a46288d_Dne();
        double d2 = cwq_02.method_7c6f6027_FWm() + 0.7 * (double)hQH.method_7c6f602c_FWm();
        double d3 = cwq_02.method_ae128db5_bzF() + 0.7 * (double)hQH.method_ae128dba_bzF();
        return new gmI(d, d2, d3);
    }

    @Override
    public int method_f9bf07c6_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        return Pdb.method_7c9aa16b_Dne((MqS)((Object)qnq.method_d98e681d_Dne(n, n2, n3)));
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        int n3 = n2 & 7;
        return n == n3 ? (n3 != 1 && n3 != 0 ? this.field_202f7d1a_FWm : this.field_75bd7f28_bzF) : (n3 != 1 && n3 != 0 ? (n != 1 && n != 0 ? this.field_5e5f2002_Qnq : this.field_375b13b_Dne) : this.field_375b13b_Dne);
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_5e5f2002_Qnq = rbp.method_285881e4_Dne("furnace_side");
        this.field_375b13b_Dne = rbp.method_285881e4_Dne("furnace_top");
        this.field_202f7d1a_FWm = rbp.method_285881e4_Dne("dispenser_front");
        this.field_75bd7f28_bzF = rbp.method_285881e4_Dne("dispenser_front_vertical");
    }

    @Override
    public boolean method_cb53d52e_Dne(Qnq qnq, int n, int n2, int n3, FiG fiG, int n4, float f, float f2, float f3) {
        if (qnq.field_2d2a05_aFZ) {
            return true;
        }
        UTs uTs = (UTs)qnq.method_d98e681d_Dne(n, n2, n3);
        if (uTs != null) {
            fiG.method_88b748b3_Dne(uTs);
        }
        return true;
    }

    protected void method_5452795d_bzF(Qnq qnq, int n, int n2, int n3) {
        XSK xSK = new XSK(qnq, n, n2, n3);
        UTs uTs = (UTs)xSK.method_2310c86e_Dne();
        if (uTs != null) {
            int n4 = uTs.method_7a46288d_Dne();
            if (n4 < 0) {
                qnq.method_57aed1c2_Qnq(1001, n, n2, n3, 0);
            } else {
                NMq nMq = uTs.method_9e6e1a08_Dne(n4);
                ClS clS = this.method_c99d661c_Dne(nMq);
                if (clS != ClS.field_365e6c2_Dne) {
                    NMq nMq2 = clS.method_267feca4_Dne(xSK, nMq);
                    uTs.method_6e3a6b66_Dne(n4, nMq2.field_2092ae_Dne == 0 ? null : nMq2);
                }
            }
        }
    }

    @Override
    public boolean method_582b29b_a_() {
        return true;
    }

    private void method_714a8eb7_Qnq(Qnq qnq, int n, int n2, int n3) {
        if (!qnq.field_2d2a05_aFZ) {
            int n4 = qnq.method_2c2cf7bc_Dne(n, n2, n3 - 1);
            int n5 = qnq.method_2c2cf7bc_Dne(n, n2, n3 + 1);
            int n6 = qnq.method_2c2cf7bc_Dne(n - 1, n2, n3);
            int n7 = qnq.method_2c2cf7bc_Dne(n + 1, n2, n3);
            int n8 = 3;
            if (zKP.field_4039e1b_FWm[n4] && !zKP.field_4039e1b_FWm[n5]) {
                n8 = 3;
            }
            if (zKP.field_4039e1b_FWm[n5] && !zKP.field_4039e1b_FWm[n4]) {
                n8 = 2;
            }
            if (zKP.field_4039e1b_FWm[n6] && !zKP.field_4039e1b_FWm[n7]) {
                n8 = 5;
            }
            if (zKP.field_4039e1b_FWm[n7] && !zKP.field_4039e1b_FWm[n6]) {
                n8 = 4;
            }
            qnq.method_d4dc89ed_Dne(n, n2, n3, n8, 2);
        }
    }

    protected ClS method_c99d661c_Dne(NMq nMq) {
        return (ClS)field_37ddf2f_Dne.method_8dde1bfc_Dne(nMq.method_230de6ba_Dne());
    }

    @Override
    public void method_9cb39130_Dne(Qnq qnq, int n, int n2, int n3) {
        super.method_9cb39130_Dne(qnq, n, n2, n3);
        this.method_714a8eb7_Qnq(qnq, n, n2, n3);
    }

    @Override
    public ipD method_c35d5be7_Dne(Qnq qnq) {
        return new UTs();
    }

    @Override
    public void method_3e226590_Dne(Qnq qnq, int n, int n2, int n3, int n4, int n5) {
        UTs uTs = (UTs)qnq.method_d98e681d_Dne(n, n2, n3);
        if (uTs != null) {
            for (int i = 0; i < uTs.method_907a9d14_Qnq(); ++i) {
                NMq nMq = uTs.method_9e6e1a08_Dne(i);
                if (nMq == null) continue;
                float f = this.field_7331eae7_Dne.nextFloat() * 0.8f + 0.1f;
                float f2 = this.field_7331eae7_Dne.nextFloat() * 0.8f + 0.1f;
                float f3 = this.field_7331eae7_Dne.nextFloat() * 0.8f + 0.1f;
                while (nMq.field_2092ae_Dne > 0) {
                    int n6 = this.field_7331eae7_Dne.nextInt(21) + 10;
                    if (n6 > nMq.field_2092ae_Dne) {
                        n6 = nMq.field_2092ae_Dne;
                    }
                    nMq.field_2092ae_Dne -= n6;
                    JiM jiM = new JiM(qnq, (float)n + f, (float)n2 + f2, (float)n3 + f3, new NMq(nMq.field_2e5f1b_bzF, n6, nMq.method_907a9d14_Qnq()));
                    if (nMq.method_a98a0664_aFZ()) {
                        jiM.method_23040479_Dne().method_66a36cd8_FWm((WkD)nMq.method_230886fb_Dne().method_23130705_Dne());
                    }
                    float f4 = 0.05f;
                    jiM.field_291868_XHL = (float)this.field_7331eae7_Dne.nextGaussian() * f4;
                    jiM.field_2a9ad1_Zpi = (float)this.field_7331eae7_Dne.nextGaussian() * f4 + 0.2f;
                    jiM.field_31b811_kGO = (float)this.field_7331eae7_Dne.nextGaussian() * f4;
                    qnq.method_94d18be5_FWm(jiM);
                }
            }
            qnq.method_6465ff20_aFZ(n, n2, n3, n4);
        }
        super.method_3e226590_Dne(qnq, n, n2, n3, n4, n5);
    }

    @Override
    public void method_ca828a1c_Dne(Qnq qnq, int n, int n2, int n3, Random random) {
        if (!qnq.field_2d2a05_aFZ) {
            this.method_5452795d_bzF(qnq, n, n2, n3);
        }
    }
}

