package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class CSH
extends YAD {
    private Sgm field_75b4eb00_bzF;
    private static final String[] field_f5e54dca_Dne = new String[]{"cloth", "chain", "iron", "diamond", "gold"};
    private Sgm field_36d1d13_Dne;
    private Sgm field_2026e8f2_FWm;

    protected void method_961e777d_Dne(FiG fiG, float f) {
        NMq nMq;
        float f2;
        float f3 = 1.0f;
        GL11.glColor3f(f3, f3, f3);
        super.method_c52e66f1_FWm(fiG, f);
        super.method_c0b0b1ff_bzF(fiG, f);
        NMq nMq2 = fiG.field_36a059b_Dne.method_9062e8fb_bzF(3);
        if (nMq2 != null) {
            GL11.glPushMatrix();
            this.field_36d1d13_Dne.field_37b7066_Dne.method_143f92d9_bzF(0.0625f);
            if (nMq2.method_230de6ba_Dne().field_267cf5_Qnq < 256) {
                if (zVu.method_ce7f5dad_Dne(zKP.field_8374b848_Dne[nMq2.field_2e5f1b_bzF].method_7a46288d_Dne())) {
                    f2 = 0.625f;
                    GL11.glTranslatef(0.0f, -0.25f, 0.0f);
                    GL11.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
                    GL11.glScalef(f2, -f2, -f2);
                }
                this.field_37a7828_Dne.field_36fa224_Dne.method_d09371e2_Dne(fiG, nMq2, 0);
            } else if (nMq2.method_230de6ba_Dne().field_267cf5_Qnq == dEr.field_e405241a_mfU.field_267cf5_Qnq) {
                f2 = 1.0625f;
                GL11.glScalef(f2, -f2, -f2);
                String string = "";
                if (nMq2.method_a98a0664_aFZ() && nMq2.method_230886fb_Dne().method_8f501fe8_Dne("SkullOwner")) {
                    string = nMq2.method_230886fb_Dne().method_39193c_Dne("SkullOwner");
                }
                rzA.field_37b7693_Dne.method_afa438aa_Dne(-0.5f, 0.0f, -0.5f, 1, 180.0f, nMq2.method_907a9d14_Qnq(), string);
            }
            GL11.glPopMatrix();
        }
        if (fiG.field_bc57ecbf_aFZ.equals("deadmau5") && this.method_abaa98b2_Dne(fiG.field_569fcf45_Dne, null)) {
            for (int i = 0; i < 2; ++i) {
                float f4 = fiG.field_2a9ad3_Zpi + (fiG.field_334489_mrb - fiG.field_2a9ad3_Zpi) * f - (fiG.field_3393da_oIf + (fiG.field_22c5ff_IjH - fiG.field_3393da_oIf) * f);
                f2 = fiG.field_31b813_kGO + (fiG.field_29186a_XHL - fiG.field_31b813_kGO) * f;
                GL11.glPushMatrix();
                GL11.glRotatef(f4, 0.0f, 1.0f, 0.0f);
                GL11.glRotatef(f2, 1.0f, 0.0f, 0.0f);
                GL11.glTranslatef(0.375f * (float)(i * 2 - 1), 0.0f, 0.0f);
                GL11.glTranslatef(0.0f, -0.375f, 0.0f);
                GL11.glRotatef(-f2, 1.0f, 0.0f, 0.0f);
                GL11.glRotatef(-f4, 0.0f, 1.0f, 0.0f);
                float f5 = 1.3333334f;
                GL11.glScalef(f5, f5, f5);
                this.field_36d1d13_Dne.method_ce7f5266_Dne(0.0625f);
                GL11.glPopMatrix();
            }
        }
        if (this.method_abaa98b2_Dne(fiG.field_d9a85c6_FWm, null) && !fiG.method_998e662d_Vxn() && !fiG.method_9f5095a2_ZfC()) {
            GL11.glPushMatrix();
            GL11.glTranslatef(0.0f, 0.0f, 0.125f);
            double d = fiG.field_212c16_EyB + (fiG.field_3393d8_oIf - fiG.field_212c16_EyB) * (double)f - (fiG.field_2d29ef_aFZ + (fiG.field_2f0dd3_div - fiG.field_2d29ef_aFZ) * (double)f);
            double d2 = fiG.field_215b31_FfS + (fiG.field_36e4d5_vSL - fiG.field_215b31_FfS) * (double)f - (fiG.field_388da1_zGp + (fiG.field_22c5fd_IjH - fiG.field_388da1_zGp) * (double)f);
            double d3 = fiG.field_2569d0_OdI + (fiG.field_26818a_RPx - fiG.field_2569d0_OdI) * (double)f - (fiG.field_20b852_DyG + (fiG.field_334487_mrb - fiG.field_20b852_DyG) * (double)f);
            float f6 = fiG.field_3393da_oIf + (fiG.field_22c5ff_IjH - fiG.field_3393da_oIf) * f;
            double d4 = geR.method_ce7f5256_Dne(f6 * (float)Math.PI / 180.0f);
            double d5 = -geR.method_117d0e97_FWm(f6 * (float)Math.PI / 180.0f);
            float f7 = (float)d2 * 10.0f;
            if (f7 < -6.0f) {
                f7 = -6.0f;
            }
            if (f7 > 32.0f) {
                f7 = 32.0f;
            }
            float f8 = (float)(d * d4 + d3 * d5) * 100.0f;
            float f9 = (float)(d * d5 - d3 * d4) * 100.0f;
            if (f8 < 0.0f) {
                f8 = 0.0f;
            }
            float f10 = fiG.field_37e098_xXN + (fiG.field_228593_IYC - fiG.field_37e098_xXN) * f;
            f7 += geR.method_ce7f5256_Dne((fiG.field_34856f_qLR + (fiG.field_1ed014_ATE - fiG.field_34856f_qLR) * f) * 6.0f) * 32.0f * f10;
            if (fiG.method_a98a0664_aFZ()) {
                f7 += 25.0f;
            }
            GL11.glRotatef(6.0f + f8 / 2.0f + f7, 1.0f, 0.0f, 0.0f);
            GL11.glRotatef(f9 / 2.0f, 0.0f, 0.0f, 1.0f);
            GL11.glRotatef(-f9 / 2.0f, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(180.0f, 0.0f, 1.0f, 0.0f);
            this.field_36d1d13_Dne.method_117d0ea7_FWm(0.0625f);
            GL11.glPopMatrix();
        }
        if ((nMq = fiG.field_36a059b_Dne.method_23040479_Dne()) != null) {
            GL11.glPushMatrix();
            this.field_36d1d13_Dne.field_5e64df2d_Qnq.method_143f92d9_bzF(0.0625f);
            GL11.glTranslatef(-0.0625f, 0.4375f, 0.0625f);
            if (fiG.field_3741200_Dne != null) {
                nMq = new NMq(dEr.field_d2b52a0a_oIf);
            }
            een een2 = null;
            if (fiG.method_c5287a51_qLR() > 0) {
                een2 = nMq.method_230ed2bd_Dne();
            }
            if (nMq.field_2e5f1b_bzF < 256 && zVu.method_ce7f5dad_Dne(zKP.field_8374b848_Dne[nMq.field_2e5f1b_bzF].method_7a46288d_Dne())) {
                f2 = 0.5f;
                GL11.glTranslatef(0.0f, 0.1875f, -0.3125f);
                GL11.glRotatef(20.0f, 1.0f, 0.0f, 0.0f);
                GL11.glRotatef(45.0f, 0.0f, 1.0f, 0.0f);
                GL11.glScalef(-(f2 *= 0.75f), -f2, f2);
            } else if (nMq.field_2e5f1b_bzF == dEr.field_3667432_Dne.field_267cf5_Qnq) {
                f2 = 0.625f;
                GL11.glTranslatef(0.0f, 0.125f, 0.3125f);
                GL11.glRotatef(-20.0f, 0.0f, 1.0f, 0.0f);
                GL11.glScalef(f2, -f2, f2);
                GL11.glRotatef(-100.0f, 1.0f, 0.0f, 0.0f);
                GL11.glRotatef(45.0f, 0.0f, 1.0f, 0.0f);
            } else if (dEr.field_836aa5b6_Dne[nMq.field_2e5f1b_bzF].method_7c6f603d_FWm()) {
                f2 = 0.625f;
                if (dEr.field_836aa5b6_Dne[nMq.field_2e5f1b_bzF].method_ae128dcb_bzF()) {
                    GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
                    GL11.glTranslatef(0.0f, -0.125f, 0.0f);
                }
                if (fiG.method_c5287a51_qLR() > 0 && een2 == een.field_5e5eb325_Qnq) {
                    GL11.glTranslatef(0.05f, 0.0f, -0.1f);
                    GL11.glRotatef(-50.0f, 0.0f, 1.0f, 0.0f);
                    GL11.glRotatef(-10.0f, 1.0f, 0.0f, 0.0f);
                    GL11.glRotatef(-60.0f, 0.0f, 0.0f, 1.0f);
                }
                GL11.glTranslatef(0.0f, 0.1875f, 0.0f);
                GL11.glScalef(f2, -f2, f2);
                GL11.glRotatef(-100.0f, 1.0f, 0.0f, 0.0f);
                GL11.glRotatef(45.0f, 0.0f, 1.0f, 0.0f);
            } else {
                f2 = 0.375f;
                GL11.glTranslatef(0.25f, 0.1875f, -0.1875f);
                GL11.glScalef(f2, f2, f2);
                GL11.glRotatef(60.0f, 0.0f, 0.0f, 1.0f);
                GL11.glRotatef(-90.0f, 1.0f, 0.0f, 0.0f);
                GL11.glRotatef(20.0f, 0.0f, 0.0f, 1.0f);
            }
            if (nMq.method_230de6ba_Dne().method_7a46289e_Dne()) {
                for (int i = 0; i <= 1; ++i) {
                    int n = nMq.method_230de6ba_Dne().method_fd88681_Dne(nMq, i);
                    float f11 = (float)(n >> 16 & 0xFF) / 255.0f;
                    float f12 = (float)(n >> 8 & 0xFF) / 255.0f;
                    float f13 = (float)(n & 0xFF) / 255.0f;
                    GL11.glColor4f(f11, f12, f13, 1.0f);
                    this.field_37a7828_Dne.field_36fa224_Dne.method_d09371e2_Dne(fiG, nMq, i);
                }
            } else {
                int n = nMq.method_230de6ba_Dne().method_fd88681_Dne(nMq, 0);
                float f14 = (float)(n >> 16 & 0xFF) / 255.0f;
                float f15 = (float)(n >> 8 & 0xFF) / 255.0f;
                float f16 = (float)(n & 0xFF) / 255.0f;
                GL11.glColor4f(f14, f15, f16, 1.0f);
                this.field_37a7828_Dne.field_36fa224_Dne.method_d09371e2_Dne(fiG, nMq, 0);
            }
            GL11.glPopMatrix();
        }
    }

    public CSH() {
        super(new Sgm(0.0f), 0.5f);
        this.field_36d1d13_Dne = (Sgm)this.field_367c742_Dne;
        this.field_2026e8f2_FWm = new Sgm(1.0f);
        this.field_75b4eb00_bzF = new Sgm(0.5f);
    }

    public void method_ae560a3b_Dne(FiG fiG, double d, double d2, double d3, float f, float f2) {
        float f3 = 1.0f;
        GL11.glColor3f(f3, f3, f3);
        NMq nMq = fiG.field_36a059b_Dne.method_23040479_Dne();
        this.field_36d1d13_Dne.field_21260d_FWm = nMq != null ? 1 : 0;
        this.field_75b4eb00_bzF.field_21260d_FWm = this.field_36d1d13_Dne.field_21260d_FWm;
        this.field_2026e8f2_FWm.field_21260d_FWm = this.field_36d1d13_Dne.field_21260d_FWm;
        if (nMq != null && fiG.method_c5287a51_qLR() > 0) {
            een een2 = nMq.method_230ed2bd_Dne();
            if (een2 == een.field_5e5eb325_Qnq) {
                this.field_36d1d13_Dne.field_21260d_FWm = 3;
                this.field_75b4eb00_bzF.field_21260d_FWm = 3;
                this.field_2026e8f2_FWm.field_21260d_FWm = 3;
            } else if (een2 == een.field_7138c8a4_aFZ) {
                this.field_36d1d13_Dne.field_267d06_Qnq = true;
                this.field_75b4eb00_bzF.field_267d06_Qnq = true;
                this.field_2026e8f2_FWm.field_267d06_Qnq = true;
            }
        }
        this.field_75b4eb00_bzF.field_2e5f2c_bzF = this.field_36d1d13_Dne.field_2e5f2c_bzF = fiG.method_a98a0664_aFZ();
        this.field_2026e8f2_FWm.field_2e5f2c_bzF = this.field_36d1d13_Dne.field_2e5f2c_bzF;
        double d4 = d2 - (double)fiG.field_36b0a6_udO;
        if (fiG.method_a98a0664_aFZ() && !(fiG instanceof FKB)) {
            d4 -= 0.125;
        }
        super.method_2cdda2d0_Dne(fiG, d, d4, d3, f, f2);
        this.field_36d1d13_Dne.field_267d06_Qnq = false;
        this.field_75b4eb00_bzF.field_267d06_Qnq = false;
        this.field_2026e8f2_FWm.field_267d06_Qnq = false;
        this.field_36d1d13_Dne.field_2e5f2c_bzF = false;
        this.field_75b4eb00_bzF.field_2e5f2c_bzF = false;
        this.field_2026e8f2_FWm.field_2e5f2c_bzF = false;
        this.field_36d1d13_Dne.field_21260d_FWm = 0;
        this.field_75b4eb00_bzF.field_21260d_FWm = 0;
        this.field_2026e8f2_FWm.field_21260d_FWm = 0;
    }

    @Override
    protected int method_d6a747e_Dne(FUH fUH, int n, float f) {
        return this.method_2db23cf3_Dne((FiG)fUH, n, f);
    }

    @Override
    protected void method_6f1922ee_Dne(FUH fUH) {
        this.method_703284a3_Dne((FiG)fUH);
    }

    protected void method_e7413bdc_FWm(FiG fiG, float f) {
        float f2 = 0.9375f;
        GL11.glScalef(f2, f2, f2);
    }

    @Override
    public void method_2cdda2d0_Dne(FUH fUH, double d, double d2, double d3, float f, float f2) {
        this.method_ae560a3b_Dne((FiG)fUH, d, d2, d3, f, f2);
    }

    @Override
    public void method_31745cde_Dne(sMa sMa2, double d, double d2, double d3, float f, float f2) {
        this.method_ae560a3b_Dne((FiG)sMa2, d, d2, d3, f, f2);
    }

    protected int method_2db23cf3_Dne(FiG fiG, int n, float f) {
        dEr dEr2;
        NMq nMq = fiG.field_36a059b_Dne.method_9062e8fb_bzF(3 - n);
        if (nMq != null && (dEr2 = nMq.method_230de6ba_Dne()) instanceof qoi_0) {
            Sgm sgm;
            qoi_0 qoi_02 = (qoi_0)dEr2;
            this.method_8f501fe4_Dne("/armor/" + field_f5e54dca_Dne[qoi_02.field_2e5f1b_bzF] + "_" + (n == 2 ? 2 : 1) + ".png");
            Sgm sgm2 = sgm = n == 2 ? this.field_75b4eb00_bzF : this.field_2026e8f2_FWm;
            if (!Sgm.field_2d2a05_aFZ) {
                sgm.field_37b7066_Dne.field_21261e_FWm = n == 0;
                sgm.field_20353c45_FWm.field_21261e_FWm = n == 0;
            } else {
                sgm.field_37b7066_Dne.field_21261e_FWm = false;
                sgm.field_20353c45_FWm.field_21261e_FWm = false;
            }
            sgm.field_75c33e53_bzF.field_21261e_FWm = n == 1 || n == 2;
            sgm.field_5e64df2d_Qnq.field_21261e_FWm = n == 1;
            sgm.field_713ef4ac_aFZ.field_21261e_FWm = n == 1;
            sgm.field_f0ad2f5e_zGp.field_21261e_FWm = n == 2 || n == 3;
            sgm.field_162e998f_DyG.field_21261e_FWm = n == 2 || n == 3;
            this.method_724f763d_Dne(sgm);
            if (sgm != null) {
                sgm.field_2092ab_Dne = this.field_367c742_Dne.field_2092ab_Dne;
            }
            if (sgm != null) {
                sgm.field_388db7_zGp = this.field_367c742_Dne.field_388db7_zGp;
            }
            if (sgm != null) {
                sgm.field_20b868_DyG = this.field_367c742_Dne.field_20b868_DyG;
            }
            float f2 = 1.0f;
            if (qoi_02.method_2306c36c_Dne() == TNy.field_36d350d_Dne) {
                int n2 = qoi_02.method_7c61cf08_Dne(nMq);
                float f3 = (float)(n2 >> 16 & 0xFF) / 255.0f;
                float f4 = (float)(n2 >> 8 & 0xFF) / 255.0f;
                float f5 = (float)(n2 & 0xFF) / 255.0f;
                GL11.glColor3f(f2 * f3, f2 * f4, f2 * f5);
                if (nMq.method_8288d6f2_IjH()) {
                    return 31;
                }
                return 16;
            }
            GL11.glColor3f(f2, f2, f2);
            if (nMq.method_8288d6f2_IjH()) {
                return 15;
            }
            return 1;
        }
        return -1;
    }

    @Override
    protected void method_9f9d1ed0_Dne(FUH fUH, double d, double d2, double d3) {
        this.method_884e64fb_Dne((FiG)fUH, d, d2, d3);
    }

    @Override
    protected void method_740ba292_Dne(FUH fUH, float f) {
        this.method_e7413bdc_FWm((FiG)fUH, f);
    }

    protected void method_884e64fb_Dne(FiG fiG, double d, double d2, double d3) {
        if (fiG.method_cd4cb3d9_udO() && fiG.method_9b310ff4_Wwe()) {
            super.method_9f9d1ed0_Dne(fiG, d + (double)fiG.field_298de0_YHU, d2 + (double)fiG.field_22c9a1_JLG, d3 + (double)fiG.field_2fb646_exS);
        } else {
            super.method_9f9d1ed0_Dne(fiG, d, d2, d3);
        }
    }

    @Override
    protected void method_be586698_Dne(FUH fUH, double d, double d2, double d3, String string, float f, double d4) {
        this.method_555be943_Dne((FiG)fUH, d, d2, d3, string, f, d4);
    }

    protected void method_703284a3_Dne(FiG fiG) {
        this.method_abaa98b2_Dne(fiG.field_569fcf45_Dne, fiG.method_6859cdb9_bzF());
    }

    public void method_49863864_FWm(FiG fiG) {
        float f = 1.0f;
        GL11.glColor3f(f, f, f);
        this.field_36d1d13_Dne.field_2092ab_Dne = 0.0f;
        this.field_36d1d13_Dne.method_5c531ba0_Dne(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, fiG);
        this.field_36d1d13_Dne.field_5e64df2d_Qnq.method_ce7f5266_Dne(0.0625f);
    }

    @Override
    protected void method_d6a748b_Dne(FUH fUH, int n, float f) {
        this.method_2db23d00_Dne((FiG)fUH, n, f);
    }

    @Override
    protected void method_c52e66f1_FWm(FUH fUH, float f) {
        this.method_961e777d_Dne((FiG)fUH, f);
    }

    @Override
    protected void method_9fba3e12_Dne(FUH fUH, float f, float f2, float f3) {
        this.method_886b843d_Dne((FiG)fUH, f, f2, f3);
    }

    protected void method_2db23d00_Dne(FiG fiG, int n, float f) {
        dEr dEr2;
        NMq nMq = fiG.field_36a059b_Dne.method_9062e8fb_bzF(3 - n);
        if (nMq != null && (dEr2 = nMq.method_230de6ba_Dne()) instanceof qoi_0) {
            qoi_0 qoi_02 = (qoi_0)dEr2;
            this.method_8f501fe4_Dne("/armor/" + field_f5e54dca_Dne[qoi_02.field_2e5f1b_bzF] + "_" + (n == 2 ? 2 : 1) + "_b.png");
            float f2 = 1.0f;
            GL11.glColor3f(f2, f2, f2);
        }
    }

    protected void method_886b843d_Dne(FiG fiG, float f, float f2, float f3) {
        if (fiG.method_cd4cb3d9_udO() && fiG.method_9b310ff4_Wwe()) {
            GL11.glRotatef(fiG.method_9feec6b2_Zpi(), 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(this.method_6f1922de_Dne(fiG), 0.0f, 0.0f, 1.0f);
            GL11.glRotatef(270.0f, 0.0f, 1.0f, 0.0f);
        } else {
            super.method_9fba3e12_Dne(fiG, f, f2, f3);
        }
    }

    protected void method_555be943_Dne(FiG fiG, double d, double d2, double d3, String string, float f, double d4) {
        SFA sFA;
        vfE vfE2;
        if (d4 < 100.0 && (vfE2 = (sFA = fiG.method_23062a3d_Dne()).method_9e80a165_Dne(2)) != null) {
            OHz oHz = sFA.method_938dc1b8_Dne(fiG.method_eecad346_Dne(), vfE2);
            if (fiG.method_9b310ff4_Wwe()) {
                this.method_c92c837d_Dne(fiG, oHz.method_7a46288d_Dne() + " " + vfE2.method_d1f1ed87_FWm(), d, d2 - 1.5, d3, 64);
            } else {
                this.method_c92c837d_Dne(fiG, oHz.method_7a46288d_Dne() + " " + vfE2.method_d1f1ed87_FWm(), d, d2, d3, 64);
            }
            d2 += (double)((float)this.method_2312a4d0_Dne().field_2092ae_Dne * 1.15f * f);
        }
        super.method_be586698_Dne(fiG, d, d2, d3, string, f, d4);
    }
}

