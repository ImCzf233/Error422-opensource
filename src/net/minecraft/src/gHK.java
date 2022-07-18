package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.Random;

public class gHK
extends ljW {
    public final int field_2092ae_Dne;
    private final Random field_7331eae7_Dne = new Random();

    @Override
    public boolean method_ae128dcb_bzF() {
        return this.field_2092ae_Dne == 1;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 22;
    }

    @Override
    public void method_fbabf7ef_Dne(Zpi zpi, int n, int n2, int n3) {
        if (zpi.method_2c2cf7bc_Dne(n, n2, n3 - 1) == this.field_21260d_FWm) {
            this.method_eb14b51a_Dne(0.0625f, 0.0f, 0.0f, 0.9375f, 0.875f, 0.9375f);
        } else if (zpi.method_2c2cf7bc_Dne(n, n2, n3 + 1) == this.field_21260d_FWm) {
            this.method_eb14b51a_Dne(0.0625f, 0.0f, 0.0625f, 0.9375f, 0.875f, 1.0f);
        } else if (zpi.method_2c2cf7bc_Dne(n - 1, n2, n3) == this.field_21260d_FWm) {
            this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0625f, 0.9375f, 0.875f, 0.9375f);
        } else if (zpi.method_2c2cf7bc_Dne(n + 1, n2, n3) == this.field_21260d_FWm) {
            this.method_eb14b51a_Dne(0.0625f, 0.0f, 0.0625f, 1.0f, 0.875f, 0.9375f);
        } else {
            this.method_eb14b51a_Dne(0.0625f, 0.0f, 0.0625f, 0.9375f, 0.875f, 0.9375f);
        }
    }

    public MqS method_8bf4132_Dne(Qnq qnq, int n, int n2, int n3) {
        MqS mqS = (gon_0)qnq.method_d98e681d_Dne(n, n2, n3);
        if (mqS == null) {
            return null;
        }
        if (qnq.method_6fdef3c4_DyG(n, n2 + 1, n3)) {
            return null;
        }
        if (gHK.method_714a8ebb_Qnq(qnq, n, n2, n3)) {
            return null;
        }
        if (qnq.method_2c2cf7bc_Dne(n - 1, n2, n3) == this.field_21260d_FWm && (qnq.method_6fdef3c4_DyG(n - 1, n2 + 1, n3) || gHK.method_714a8ebb_Qnq(qnq, n - 1, n2, n3))) {
            return null;
        }
        if (qnq.method_2c2cf7bc_Dne(n + 1, n2, n3) == this.field_21260d_FWm && (qnq.method_6fdef3c4_DyG(n + 1, n2 + 1, n3) || gHK.method_714a8ebb_Qnq(qnq, n + 1, n2, n3))) {
            return null;
        }
        if (qnq.method_2c2cf7bc_Dne(n, n2, n3 - 1) == this.field_21260d_FWm && (qnq.method_6fdef3c4_DyG(n, n2 + 1, n3 - 1) || gHK.method_714a8ebb_Qnq(qnq, n, n2, n3 - 1))) {
            return null;
        }
        if (qnq.method_2c2cf7bc_Dne(n, n2, n3 + 1) == this.field_21260d_FWm && (qnq.method_6fdef3c4_DyG(n, n2 + 1, n3 + 1) || gHK.method_714a8ebb_Qnq(qnq, n, n2, n3 + 1))) {
            return null;
        }
        if (qnq.method_2c2cf7bc_Dne(n - 1, n2, n3) == this.field_21260d_FWm) {
            mqS = new isA("container.chestDouble", (gon_0)qnq.method_d98e681d_Dne(n - 1, n2, n3), mqS);
        }
        if (qnq.method_2c2cf7bc_Dne(n + 1, n2, n3) == this.field_21260d_FWm) {
            mqS = new isA("container.chestDouble", mqS, (gon_0)qnq.method_d98e681d_Dne(n + 1, n2, n3));
        }
        if (qnq.method_2c2cf7bc_Dne(n, n2, n3 - 1) == this.field_21260d_FWm) {
            mqS = new isA("container.chestDouble", (gon_0)qnq.method_d98e681d_Dne(n, n2, n3 - 1), mqS);
        }
        if (qnq.method_2c2cf7bc_Dne(n, n2, n3 + 1) == this.field_21260d_FWm) {
            mqS = new isA("container.chestDouble", mqS, (gon_0)qnq.method_d98e681d_Dne(n, n2, n3 + 1));
        }
        return mqS;
    }

    @Override
    public void method_9cb39130_Dne(Qnq qnq, int n, int n2, int n3) {
        super.method_9cb39130_Dne(qnq, n, n2, n3);
        this.method_5452795d_bzF(qnq, n, n2, n3);
        int n4 = qnq.method_2c2cf7bc_Dne(n, n2, n3 - 1);
        int n5 = qnq.method_2c2cf7bc_Dne(n, n2, n3 + 1);
        int n6 = qnq.method_2c2cf7bc_Dne(n - 1, n2, n3);
        int n7 = qnq.method_2c2cf7bc_Dne(n + 1, n2, n3);
        if (n4 == this.field_21260d_FWm) {
            this.method_5452795d_bzF(qnq, n, n2, n3 - 1);
        }
        if (n5 == this.field_21260d_FWm) {
            this.method_5452795d_bzF(qnq, n, n2, n3 + 1);
        }
        if (n6 == this.field_21260d_FWm) {
            this.method_5452795d_bzF(qnq, n - 1, n2, n3);
        }
        if (n7 == this.field_21260d_FWm) {
            this.method_5452795d_bzF(qnq, n + 1, n2, n3);
        }
    }

    @Override
    public void method_3e226590_Dne(Qnq qnq, int n, int n2, int n3, int n4, int n5) {
        gon_0 gon_02 = (gon_0)qnq.method_d98e681d_Dne(n, n2, n3);
        if (gon_02 != null) {
            for (int i = 0; i < gon_02.method_907a9d14_Qnq(); ++i) {
                NMq nMq = gon_02.method_9e6e1a08_Dne(i);
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
                    float f4 = 0.05f;
                    jiM.field_291868_XHL = (float)this.field_7331eae7_Dne.nextGaussian() * f4;
                    jiM.field_2a9ad1_Zpi = (float)this.field_7331eae7_Dne.nextGaussian() * f4 + 0.2f;
                    jiM.field_31b811_kGO = (float)this.field_7331eae7_Dne.nextGaussian() * f4;
                    if (nMq.method_a98a0664_aFZ()) {
                        jiM.method_23040479_Dne().method_66a36cd8_FWm((WkD)nMq.method_230886fb_Dne().method_23130705_Dne());
                    }
                    qnq.method_94d18be5_FWm(jiM);
                }
            }
            qnq.method_6465ff20_aFZ(n, n2, n3, n4);
        }
        super.method_3e226590_Dne(qnq, n, n2, n3, n4, n5);
    }

    private static boolean method_714a8ebb_Qnq(Qnq qnq, int n, int n2, int n3) {
        kQo kQo2;
        kQo kQo3;
        Iterator iterator = qnq.method_9314b7e8_Dne(kQo.class, bSp.method_23186cf1_Dne().method_b4ea3e0c_Dne(n, n2 + 1, n3, n + 1, n2 + 2, n3 + 1)).iterator();
        do {
            if (iterator.hasNext()) continue;
            return false;
        } while (!(kQo3 = (kQo2 = (kQo)iterator.next())).method_80692b1e_ICU());
        return true;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    public int method_56b56428_FWm(Zpi zpi, int n, int n2, int n3, int n4) {
        return n4 == 1 ? this.method_79d378e7_Dne(zpi, n, n2, n3, n4) : 0;
    }

    @Override
    public ipD method_c35d5be7_Dne(Qnq qnq) {
        gon_0 gon_02 = new gon_0();
        return gon_02;
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    @Override
    public void method_f9bf07d3_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        super.method_f9bf07d3_Dne(qnq, n, n2, n3, n4);
        gon_0 gon_02 = (gon_0)qnq.method_d98e681d_Dne(n, n2, n3);
        if (gon_02 != null) {
            gon_02.method_907a9d21_Qnq();
        }
    }

    @Override
    public int method_f9bf07c6_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        return Pdb.method_7c9aa16b_Dne(this.method_8bf4132_Dne(qnq, n, n2, n3));
    }

    protected gHK(int n, int n2) {
        super(n, KFd.field_5e526bea_Qnq);
        this.field_2092ae_Dne = n2;
        this.method_82a88d64_Dne(JcN.field_2022bed6_FWm);
        this.method_eb14b51a_Dne(0.0625f, 0.0f, 0.0625f, 0.9375f, 0.875f, 0.9375f);
    }

    private boolean method_54527961_bzF(Qnq qnq, int n, int n2, int n3) {
        return qnq.method_2c2cf7bc_Dne(n, n2, n3) != this.field_21260d_FWm ? false : (qnq.method_2c2cf7bc_Dne(n - 1, n2, n3) == this.field_21260d_FWm ? true : (qnq.method_2c2cf7bc_Dne(n + 1, n2, n3) == this.field_21260d_FWm ? true : (qnq.method_2c2cf7bc_Dne(n, n2, n3 - 1) == this.field_21260d_FWm ? true : qnq.method_2c2cf7bc_Dne(n, n2, n3 + 1) == this.field_21260d_FWm)));
    }

    @Override
    public void method_ca7e4e57_Dne(Qnq qnq, int n, int n2, int n3, FUH fUH, NMq nMq) {
        int n4 = qnq.method_2c2cf7bc_Dne(n, n2, n3 - 1);
        int n5 = qnq.method_2c2cf7bc_Dne(n, n2, n3 + 1);
        int n6 = qnq.method_2c2cf7bc_Dne(n - 1, n2, n3);
        int n7 = qnq.method_2c2cf7bc_Dne(n + 1, n2, n3);
        int n8 = 0;
        int n9 = geR.method_117d0718_FWm((double)(fUH.field_334489_mrb * 4.0f / 360.0f) + 0.5) & 3;
        if (n9 == 0) {
            n8 = 2;
        }
        if (n9 == 1) {
            n8 = 5;
        }
        if (n9 == 2) {
            n8 = 3;
        }
        if (n9 == 3) {
            n8 = 4;
        }
        if (n4 != this.field_21260d_FWm && n5 != this.field_21260d_FWm && n6 != this.field_21260d_FWm && n7 != this.field_21260d_FWm) {
            qnq.method_d4dc89ed_Dne(n, n2, n3, n8, 3);
        } else {
            if (!(n4 != this.field_21260d_FWm && n5 != this.field_21260d_FWm || n8 != 4 && n8 != 5)) {
                if (n4 == this.field_21260d_FWm) {
                    qnq.method_d4dc89ed_Dne(n, n2, n3 - 1, n8, 3);
                } else {
                    qnq.method_d4dc89ed_Dne(n, n2, n3 + 1, n8, 3);
                }
                qnq.method_d4dc89ed_Dne(n, n2, n3, n8, 3);
            }
            if (!(n6 != this.field_21260d_FWm && n7 != this.field_21260d_FWm || n8 != 2 && n8 != 3)) {
                if (n6 == this.field_21260d_FWm) {
                    qnq.method_d4dc89ed_Dne(n - 1, n2, n3, n8, 3);
                } else {
                    qnq.method_d4dc89ed_Dne(n + 1, n2, n3, n8, 3);
                }
                qnq.method_d4dc89ed_Dne(n, n2, n3, n8, 3);
            }
        }
        if (nMq.method_d44b4596_zGp()) {
            ((gon_0)qnq.method_d98e681d_Dne(n, n2, n3)).method_8f501fe4_Dne(nMq.method_d1f1ed87_FWm());
        }
    }

    @Override
    public boolean method_9cb39134_Dne(Qnq qnq, int n, int n2, int n3) {
        int n4 = 0;
        if (qnq.method_2c2cf7bc_Dne(n - 1, n2, n3) == this.field_21260d_FWm) {
            ++n4;
        }
        if (qnq.method_2c2cf7bc_Dne(n + 1, n2, n3) == this.field_21260d_FWm) {
            ++n4;
        }
        if (qnq.method_2c2cf7bc_Dne(n, n2, n3 - 1) == this.field_21260d_FWm) {
            ++n4;
        }
        if (qnq.method_2c2cf7bc_Dne(n, n2, n3 + 1) == this.field_21260d_FWm) {
            ++n4;
        }
        return n4 > 1 ? false : (this.method_54527961_bzF(qnq, n - 1, n2, n3) ? false : (this.method_54527961_bzF(qnq, n + 1, n2, n3) ? false : (this.method_54527961_bzF(qnq, n, n2, n3 - 1) ? false : !this.method_54527961_bzF(qnq, n, n2, n3 + 1))));
    }

    public void method_5452795d_bzF(Qnq qnq, int n, int n2, int n3) {
        if (!qnq.field_2d2a05_aFZ) {
            int n4;
            int n5 = qnq.method_2c2cf7bc_Dne(n, n2, n3 - 1);
            int n6 = qnq.method_2c2cf7bc_Dne(n, n2, n3 + 1);
            int n7 = qnq.method_2c2cf7bc_Dne(n - 1, n2, n3);
            int n8 = qnq.method_2c2cf7bc_Dne(n + 1, n2, n3);
            boolean bl = true;
            if (n5 != this.field_21260d_FWm && n6 != this.field_21260d_FWm) {
                if (n7 != this.field_21260d_FWm && n8 != this.field_21260d_FWm) {
                    n4 = 3;
                    if (zKP.field_4039e1b_FWm[n5] && !zKP.field_4039e1b_FWm[n6]) {
                        n4 = 3;
                    }
                    if (zKP.field_4039e1b_FWm[n6] && !zKP.field_4039e1b_FWm[n5]) {
                        n4 = 2;
                    }
                    if (zKP.field_4039e1b_FWm[n7] && !zKP.field_4039e1b_FWm[n8]) {
                        n4 = 5;
                    }
                    if (zKP.field_4039e1b_FWm[n8] && !zKP.field_4039e1b_FWm[n7]) {
                        n4 = 4;
                    }
                } else {
                    int n9 = qnq.method_2c2cf7bc_Dne(n7 == this.field_21260d_FWm ? n - 1 : n + 1, n2, n3 - 1);
                    int n10 = qnq.method_2c2cf7bc_Dne(n7 == this.field_21260d_FWm ? n - 1 : n + 1, n2, n3 + 1);
                    n4 = 3;
                    boolean bl2 = true;
                    int n11 = n7 == this.field_21260d_FWm ? qnq.method_2dee76f_bzF(n - 1, n2, n3) : qnq.method_2dee76f_bzF(n + 1, n2, n3);
                    if (n11 == 2) {
                        n4 = 2;
                    }
                    if ((zKP.field_4039e1b_FWm[n5] || zKP.field_4039e1b_FWm[n9]) && !zKP.field_4039e1b_FWm[n6] && !zKP.field_4039e1b_FWm[n10]) {
                        n4 = 3;
                    }
                    if ((zKP.field_4039e1b_FWm[n6] || zKP.field_4039e1b_FWm[n10]) && !zKP.field_4039e1b_FWm[n5] && !zKP.field_4039e1b_FWm[n9]) {
                        n4 = 2;
                    }
                }
            } else {
                int n12 = qnq.method_2c2cf7bc_Dne(n - 1, n2, n5 == this.field_21260d_FWm ? n3 - 1 : n3 + 1);
                int n13 = qnq.method_2c2cf7bc_Dne(n + 1, n2, n5 == this.field_21260d_FWm ? n3 - 1 : n3 + 1);
                n4 = 5;
                boolean bl3 = true;
                int n14 = n5 == this.field_21260d_FWm ? qnq.method_2dee76f_bzF(n, n2, n3 - 1) : qnq.method_2dee76f_bzF(n, n2, n3 + 1);
                if (n14 == 4) {
                    n4 = 4;
                }
                if ((zKP.field_4039e1b_FWm[n7] || zKP.field_4039e1b_FWm[n12]) && !zKP.field_4039e1b_FWm[n8] && !zKP.field_4039e1b_FWm[n13]) {
                    n4 = 5;
                }
                if ((zKP.field_4039e1b_FWm[n8] || zKP.field_4039e1b_FWm[n13]) && !zKP.field_4039e1b_FWm[n7] && !zKP.field_4039e1b_FWm[n12]) {
                    n4 = 4;
                }
            }
            qnq.method_d4dc89ed_Dne(n, n2, n3, n4, 3);
        }
    }

    @Override
    public boolean method_cb53d52e_Dne(Qnq qnq, int n, int n2, int n3, FiG fiG, int n4, float f, float f2, float f3) {
        if (qnq.field_2d2a05_aFZ) {
            return true;
        }
        MqS mqS = this.method_8bf4132_Dne(qnq, n, n2, n3);
        if (mqS != null) {
            fiG.method_7c9aa178_Dne(mqS);
        }
        return true;
    }

    @Override
    public boolean method_582b29b_a_() {
        return true;
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_5e5f2002_Qnq = rbp.method_285881e4_Dne("wood");
    }

    @Override
    public int method_79d378e7_Dne(Zpi zpi, int n, int n2, int n3, int n4) {
        if (!this.method_ae128dcb_bzF()) {
            return 0;
        }
        int n5 = ((gon_0)zpi.method_d98e681d_Dne((int)n, (int)n2, (int)n3)).field_2092ae_Dne;
        return geR.method_2c2cf7bc_Dne(n5, 0, 15);
    }
}

