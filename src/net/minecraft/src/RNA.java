package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class RNA
extends YAD {
    protected Sgm field_2026e8f2_FWm;
    protected float field_2e5f18_bzF;
    private static final String[] field_f5e54dca_Dne = new String[]{"cloth", "chain", "iron", "diamond", "gold"};
    protected Sgm field_75b4eb00_bzF;
    protected Sgm field_36d1d13_Dne;

    protected void method_e5b22941_Dne(FUH fUH, NMq nMq) {
        this.field_36d1d13_Dne.field_21260d_FWm = nMq != null ? 1 : 0;
        this.field_75b4eb00_bzF.field_21260d_FWm = this.field_36d1d13_Dne.field_21260d_FWm;
        this.field_2026e8f2_FWm.field_21260d_FWm = this.field_36d1d13_Dne.field_21260d_FWm;
        this.field_75b4eb00_bzF.field_2e5f2c_bzF = this.field_36d1d13_Dne.field_2e5f2c_bzF = fUH.method_a98a0664_aFZ();
        this.field_2026e8f2_FWm.field_2e5f2c_bzF = this.field_36d1d13_Dne.field_2e5f2c_bzF;
    }

    @Override
    public void method_2cdda2d0_Dne(FUH fUH, double d, double d2, double d3, float f, float f2) {
        float f3 = 1.0f;
        GL11.glColor3f(f3, f3, f3);
        NMq nMq = fUH.method_23040479_Dne();
        this.method_e5b22941_Dne(fUH, nMq);
        double d4 = d2 - (double)fUH.field_36b0a6_udO;
        if (fUH.method_a98a0664_aFZ() && !(fUH instanceof FKB)) {
            d4 -= 0.125;
        }
        super.method_2cdda2d0_Dne(fUH, d, d4, d3, f, f2);
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

    public RNA(Sgm sgm, float f, float f2) {
        super(sgm, f);
        this.field_36d1d13_Dne = sgm;
        this.field_2e5f18_bzF = f2;
        this.method_7a46289a_Dne();
    }

    @Override
    public void method_31745cde_Dne(sMa sMa2, double d, double d2, double d3, float f, float f2) {
        this.method_2cdda2d0_Dne((FUH)sMa2, d, d2, d3, f, f2);
    }

    protected void method_7c6f6039_FWm() {
        GL11.glTranslatef(0.0f, 0.1875f, 0.0f);
    }

    @Override
    protected void method_d6a748b_Dne(FUH fUH, int n, float f) {
        dEr dEr2;
        NMq nMq = fUH.method_77c1cdc9_FWm(3 - n);
        if (nMq != null && (dEr2 = nMq.method_230de6ba_Dne()) instanceof qoi_0) {
            qoi_0 qoi_02 = (qoi_0)dEr2;
            this.method_8f501fe4_Dne("/armor/" + field_f5e54dca_Dne[qoi_02.field_2e5f1b_bzF] + "_" + (n == 2 ? 2 : 1) + "_b.png");
            float f2 = 1.0f;
            GL11.glColor3f(f2, f2, f2);
        }
    }

    protected void method_7a46289a_Dne() {
        this.field_2026e8f2_FWm = new Sgm(1.0f);
        this.field_75b4eb00_bzF = new Sgm(0.5f);
    }

    public RNA(Sgm sgm, float f) {
        this(sgm, f, 1.0f);
    }

    @Override
    protected int method_d6a747e_Dne(FUH fUH, int n, float f) {
        dEr dEr2;
        NMq nMq = fUH.method_77c1cdc9_FWm(3 - n);
        if (nMq != null && (dEr2 = nMq.method_230de6ba_Dne()) instanceof qoi_0) {
            qoi_0 qoi_02 = (qoi_0)dEr2;
            this.method_8f501fe4_Dne("/armor/" + field_f5e54dca_Dne[qoi_02.field_2e5f1b_bzF] + "_" + (n == 2 ? 2 : 1) + ".png");
            Sgm sgm = n == 2 ? this.field_75b4eb00_bzF : this.field_2026e8f2_FWm;
            sgm.field_37b7066_Dne.field_21261e_FWm = n == 0;
            sgm.field_20353c45_FWm.field_21261e_FWm = n == 0;
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
    protected void method_c52e66f1_FWm(FUH fUH, float f) {
        float f2;
        float f3 = 1.0f;
        GL11.glColor3f(f3, f3, f3);
        super.method_c52e66f1_FWm(fUH, f);
        NMq nMq = fUH.method_23040479_Dne();
        NMq nMq2 = fUH.method_77c1cdc9_FWm(3);
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
                this.field_37a7828_Dne.field_36fa224_Dne.method_d09371e2_Dne(fUH, nMq2, 0);
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
        if (nMq != null) {
            GL11.glPushMatrix();
            if (this.field_367c742_Dne.field_20b868_DyG) {
                f2 = 0.5f;
                GL11.glTranslatef(0.0f, 0.625f, 0.0f);
                GL11.glRotatef(-20.0f, -1.0f, 0.0f, 0.0f);
                GL11.glScalef(f2, f2, f2);
            }
            this.field_36d1d13_Dne.field_5e64df2d_Qnq.method_143f92d9_bzF(0.0625f);
            GL11.glTranslatef(-0.0625f, 0.4375f, 0.0625f);
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
                this.method_7c6f6039_FWm();
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
            this.field_37a7828_Dne.field_36fa224_Dne.method_d09371e2_Dne(fUH, nMq, 0);
            if (nMq.method_230de6ba_Dne().method_7a46289e_Dne()) {
                this.field_37a7828_Dne.field_36fa224_Dne.method_d09371e2_Dne(fUH, nMq, 1);
            }
            GL11.glPopMatrix();
        }
    }
}

