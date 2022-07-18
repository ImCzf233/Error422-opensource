package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class YAD
extends QCe {
    protected Gor field_367c742_Dne;
    protected Gor field_20219321_FWm;

    protected void method_6f1922ee_Dne(FUH fUH) {
        this.method_8f501fe4_Dne(fUH.method_6859cdb9_bzF());
    }

    public void method_724f763d_Dne(Gor gor) {
        this.field_20219321_FWm = gor;
    }

    protected void method_c52e66f1_FWm(FUH fUH, float f) {
    }

    protected void method_c0b0b1ff_bzF(FUH fUH, float f) {
        int n = fUH.method_cc5ef5b3_trS();
        if (n > 0) {
            hhc hhc2 = new hhc(fUH.field_36c4f18_Dne, fUH.field_2f0dd3_div, fUH.field_22c5fd_IjH, fUH.field_334487_mrb);
            Random random = new Random(fUH.field_2d29f4_aFZ);
            Cit.method_7a46289a_Dne();
            for (int i = 0; i < n; ++i) {
                GL11.glPushMatrix();
                rxL rxL2 = this.field_367c742_Dne.method_d1619b31_Dne(random);
                UgT ugT = (UgT)rxL2.field_f27c122c_Dne.get(random.nextInt(rxL2.field_f27c122c_Dne.size()));
                rxL2.method_143f92d9_bzF(0.0625f);
                float f2 = random.nextFloat();
                float f3 = random.nextFloat();
                float f4 = random.nextFloat();
                float f5 = (ugT.field_2092ab_Dne + (ugT.field_267cf2_Qnq - ugT.field_2092ab_Dne) * f2) / 16.0f;
                float f6 = (ugT.field_21260a_FWm + (ugT.field_2d29f1_aFZ - ugT.field_21260a_FWm) * f3) / 16.0f;
                float f7 = (ugT.field_2e5f18_bzF + (ugT.field_388da3_zGp - ugT.field_2e5f18_bzF) * f4) / 16.0f;
                GL11.glTranslatef(f5, f6, f7);
                f2 = f2 * 2.0f - 1.0f;
                f3 = f3 * 2.0f - 1.0f;
                f4 = f4 * 2.0f - 1.0f;
                float f8 = geR.method_143f92c9_bzF((f2 *= -1.0f) * f2 + (f4 *= -1.0f) * f4);
                hhc2.field_2a9ad3_Zpi = hhc2.field_334489_mrb = (float)(Math.atan2(f2, f4) * 180.0 / Math.PI);
                hhc2.field_31b813_kGO = hhc2.field_29186a_XHL = (float)(Math.atan2(f3 *= -1.0f, f8) * 180.0 / Math.PI);
                double d = 0.0;
                double d2 = 0.0;
                double d3 = 0.0;
                float f9 = 0.0f;
                this.field_37a7828_Dne.method_31745cde_Dne(hhc2, d, d2, d3, f9, f);
                GL11.glPopMatrix();
            }
            Cit.method_7c6f6039_FWm();
        }
    }

    protected void method_740ba292_Dne(FUH fUH, float f) {
    }

    protected void method_9fba3e12_Dne(FUH fUH, float f, float f2, float f3) {
        GL11.glRotatef(180.0f - f2, 0.0f, 1.0f, 0.0f);
        if (fUH.field_36e4da_vSL > 0) {
            float f4 = ((float)fUH.field_36e4da_vSL + f3 - 1.0f) / 20.0f * 1.6f;
            if ((f4 = geR.method_143f92c9_bzF(f4)) > 1.0f) {
                f4 = 1.0f;
            }
            GL11.glRotatef(f4 * this.method_6f1922de_Dne(fUH), 0.0f, 0.0f, 1.0f);
        }
    }

    @Override
    public void method_31745cde_Dne(sMa sMa2, double d, double d2, double d3, float f, float f2) {
        this.method_2cdda2d0_Dne((FUH)sMa2, d, d2, d3, f, f2);
    }

    public YAD(Gor gor, float f) {
        this.field_367c742_Dne = gor;
        this.field_2092ab_Dne = f;
    }

    protected void method_c92c837d_Dne(FUH fUH, String string, double d, double d2, double d3, int n) {
        double d4 = fUH.method_bb7dd80e_Dne(this.field_37a7828_Dne.field_366ec33_Dne);
        if (d4 <= (double)(n * n)) {
            msA msA2 = this.method_2312a4d0_Dne();
            float f = 1.6f;
            float f2 = 0.016666668f * f;
            GL11.glPushMatrix();
            GL11.glTranslatef((float)d + 0.0f, (float)d2 + fUH.field_367151_trS + 0.5f, (float)d3);
            GL11.glNormal3f(0.0f, 1.0f, 0.0f);
            GL11.glRotatef(-this.field_37a7828_Dne.field_2092ab_Dne, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(this.field_37a7828_Dne.field_21260a_FWm, 1.0f, 0.0f, 0.0f);
            GL11.glScalef(-f2, -f2, f2);
            GL11.glDisable(2896);
            GL11.glDepthMask(false);
            GL11.glDisable(2929);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            WAR wAR = WAR.field_36e5ca4_Dne;
            int n2 = 0;
            if (string.equals("deadmau5")) {
                n2 = -10;
            }
            GL11.glDisable(3553);
            wAR.method_7a46289a_Dne();
            int n3 = msA2.method_8f501fd7_Dne(string) / 2;
            wAR.method_54283b9a_Dne(0.0f, 0.0f, 0.0f, 0.25f);
            wAR.method_2be429a4_Dne(-n3 - 1, -1 + n2, 0.0);
            wAR.method_2be429a4_Dne(-n3 - 1, 8 + n2, 0.0);
            wAR.method_2be429a4_Dne(n3 + 1, 8 + n2, 0.0);
            wAR.method_2be429a4_Dne(n3 + 1, -1 + n2, 0.0);
            wAR.method_7a46288d_Dne();
            GL11.glEnable(3553);
            msA2.method_e88b55f3_FWm(string, -msA2.method_8f501fd7_Dne(string) / 2, n2, 0x20FFFFFF);
            GL11.glEnable(2929);
            GL11.glDepthMask(true);
            msA2.method_e88b55f3_FWm(string, -msA2.method_8f501fd7_Dne(string) / 2, n2, -1);
            GL11.glEnable(2896);
            GL11.glDisable(3042);
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            GL11.glPopMatrix();
        }
    }

    protected int method_d6a747e_Dne(FUH fUH, int n, float f) {
        return -1;
    }

    private float method_2c0148d6_Dne(float f, float f2, float f3) {
        float f4;
        for (f4 = f2 - f; f4 < -180.0f; f4 += 360.0f) {
        }
        while (f4 >= 180.0f) {
            f4 -= 360.0f;
        }
        return f + f3 * f4;
    }

    protected void method_d6a748b_Dne(FUH fUH, int n, float f) {
    }

    protected void method_3320476f_FWm(FUH fUH, double d, double d2, double d3) {
        if (Minecraft.method_7c6f603d_FWm() && fUH != this.field_37a7828_Dne.field_366ec33_Dne && !fUH.method_49863868_FWm(Minecraft.method_81a5f12e_Dne().field_369f6b6_Dne) && (fUH.method_c011aad4_mlD() || fUH.method_9f65f313_ZgS() && fUH == this.field_37a7828_Dne.field_2020b812_FWm)) {
            float f;
            float f2 = 1.6f;
            float f3 = 0.016666668f * f2;
            double d4 = fUH.method_bb7dd80e_Dne(this.field_37a7828_Dne.field_366ec33_Dne);
            float f4 = f = fUH.method_a98a0664_aFZ() ? 32.0f : 64.0f;
            if (d4 < (double)(f * f)) {
                String string = fUH.method_c6f17a40_aFZ();
                if (fUH.method_a98a0664_aFZ()) {
                    msA msA2 = this.method_2312a4d0_Dne();
                    GL11.glPushMatrix();
                    GL11.glTranslatef((float)d + 0.0f, (float)d2 + fUH.field_367151_trS + 0.5f, (float)d3);
                    GL11.glNormal3f(0.0f, 1.0f, 0.0f);
                    GL11.glRotatef(-this.field_37a7828_Dne.field_2092ab_Dne, 0.0f, 1.0f, 0.0f);
                    GL11.glRotatef(this.field_37a7828_Dne.field_21260a_FWm, 1.0f, 0.0f, 0.0f);
                    GL11.glScalef(-f3, -f3, f3);
                    GL11.glDisable(2896);
                    GL11.glTranslatef(0.0f, 0.25f / f3, 0.0f);
                    GL11.glDepthMask(false);
                    GL11.glEnable(3042);
                    GL11.glBlendFunc(770, 771);
                    WAR wAR = WAR.field_36e5ca4_Dne;
                    GL11.glDisable(3553);
                    wAR.method_7a46289a_Dne();
                    int n = msA2.method_8f501fd7_Dne(string) / 2;
                    wAR.method_54283b9a_Dne(0.0f, 0.0f, 0.0f, 0.25f);
                    wAR.method_2be429a4_Dne(-n - 1, -1.0, 0.0);
                    wAR.method_2be429a4_Dne(-n - 1, 8.0, 0.0);
                    wAR.method_2be429a4_Dne(n + 1, 8.0, 0.0);
                    wAR.method_2be429a4_Dne(n + 1, -1.0, 0.0);
                    wAR.method_7a46288d_Dne();
                    GL11.glEnable(3553);
                    GL11.glDepthMask(true);
                    msA2.method_e88b55f3_FWm(string, -msA2.method_8f501fd7_Dne(string) / 2, 0, 0x20FFFFFF);
                    GL11.glEnable(2896);
                    GL11.glDisable(3042);
                    GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                    GL11.glPopMatrix();
                } else {
                    this.method_be586698_Dne(fUH, d, d2, d3, string, f3, d4);
                }
            }
        }
    }

    protected int method_e0a03bff_FWm(FUH fUH, int n, float f) {
        return this.method_d6a747e_Dne(fUH, n, f);
    }

    protected float method_740ba282_Dne(FUH fUH, float f) {
        return (float)fUH.field_388da6_zGp + f;
    }

    public void method_2cdda2d0_Dne(FUH fUH, double d, double d2, double d3, float f, float f2) {
        GL11.glPushMatrix();
        GL11.glDisable(2884);
        this.field_367c742_Dne.field_2092ab_Dne = this.method_c52e66e1_FWm(fUH, f2);
        if (this.field_20219321_FWm != null) {
            this.field_20219321_FWm.field_2092ab_Dne = this.field_367c742_Dne.field_2092ab_Dne;
        }
        this.field_367c742_Dne.field_388db7_zGp = fUH.method_c5287a62_qLR();
        if (this.field_20219321_FWm != null) {
            this.field_20219321_FWm.field_388db7_zGp = this.field_367c742_Dne.field_388db7_zGp;
        }
        this.field_367c742_Dne.field_20b868_DyG = fUH.method_8288d6f2_IjH();
        if (this.field_20219321_FWm != null) {
            this.field_20219321_FWm.field_20b868_DyG = this.field_367c742_Dne.field_20b868_DyG;
        }
        try {
            float f3;
            int n;
            float f4;
            float f5;
            int n2;
            float f6 = this.method_2c0148d6_Dne(fUH.field_3393da_oIf, fUH.field_22c5ff_IjH, f2);
            float f7 = this.method_2c0148d6_Dne(fUH.field_26818c_RPx, fUH.field_36e4d7_vSL, f2);
            float f8 = fUH.field_31b813_kGO + (fUH.field_29186a_XHL - fUH.field_31b813_kGO) * f2;
            this.method_9f9d1ed0_Dne(fUH, d, d2, d3);
            float f9 = this.method_740ba282_Dne(fUH, f2);
            this.method_9fba3e12_Dne(fUH, f9, f6, f2);
            float f10 = 0.0625f;
            GL11.glEnable(32826);
            GL11.glScalef(-1.0f, -1.0f, 1.0f);
            this.method_740ba292_Dne(fUH, f2);
            GL11.glTranslatef(0.0f, -24.0f * f10 - 0.0078125f, 0.0f);
            float f11 = fUH.field_30bcaf_haP + (fUH.field_351225_qrB - fUH.field_30bcaf_haP) * f2;
            float f12 = fUH.field_23d93e_LVR - fUH.field_351225_qrB * (1.0f - f2);
            if (fUH.method_8288d6f2_IjH()) {
                f12 *= 3.0f;
            }
            if (f11 > 1.0f) {
                f11 = 1.0f;
            }
            GL11.glEnable(3008);
            this.field_367c742_Dne.method_9fba3e12_Dne(fUH, f12, f11, f2);
            this.method_abcfa06e_Dne(fUH, f12, f11, f9, f7 - f6, f8, f10);
            for (int i = 0; i < 4; ++i) {
                n2 = this.method_d6a747e_Dne(fUH, i, f2);
                if (n2 <= 0) continue;
                this.field_20219321_FWm.method_9fba3e12_Dne(fUH, f12, f11, f2);
                this.field_20219321_FWm.method_3a102820_Dne(fUH, f12, f11, f9, f7 - f6, f8, f10);
                if ((n2 & 0xF0) == 16) {
                    this.method_d6a748b_Dne(fUH, i, f2);
                    this.field_20219321_FWm.method_3a102820_Dne(fUH, f12, f11, f9, f7 - f6, f8, f10);
                }
                if ((n2 & 0xF) == 15) {
                    f5 = (float)fUH.field_388da6_zGp + f2;
                    this.method_8f501fe4_Dne("%blur%/misc/glint.png");
                    GL11.glEnable(3042);
                    f4 = 0.5f;
                    GL11.glColor4f(f4, f4, f4, 1.0f);
                    GL11.glDepthFunc(514);
                    GL11.glDepthMask(false);
                    for (n = 0; n < 2; ++n) {
                        GL11.glDisable(2896);
                        f3 = 0.76f;
                        GL11.glColor4f(0.5f * f3, 0.25f * f3, 0.8f * f3, 1.0f);
                        GL11.glBlendFunc(768, 1);
                        GL11.glMatrixMode(5890);
                        GL11.glLoadIdentity();
                        float f13 = f5 * (0.001f + (float)n * 0.003f) * 20.0f;
                        float f14 = 0.33333334f;
                        GL11.glScalef(f14, f14, f14);
                        GL11.glRotatef(30.0f - (float)n * 60.0f, 0.0f, 0.0f, 1.0f);
                        GL11.glTranslatef(0.0f, f13, 0.0f);
                        GL11.glMatrixMode(5888);
                        this.field_20219321_FWm.method_3a102820_Dne(fUH, f12, f11, f9, f7 - f6, f8, f10);
                    }
                    GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                    GL11.glMatrixMode(5890);
                    GL11.glDepthMask(true);
                    GL11.glLoadIdentity();
                    GL11.glMatrixMode(5888);
                    GL11.glEnable(2896);
                    GL11.glDisable(3042);
                    GL11.glDepthFunc(515);
                }
                GL11.glDisable(3042);
                GL11.glEnable(3008);
            }
            GL11.glDepthMask(true);
            this.method_c52e66f1_FWm(fUH, f2);
            float f15 = fUH.method_ce7f5256_Dne(f2);
            n2 = this.method_d691761_Dne(fUH, f15, f2);
            oCF.method_ce7f5da9_Dne(oCF.field_21260d_FWm);
            GL11.glDisable(3553);
            oCF.method_ce7f5da9_Dne(oCF.field_2092ae_Dne);
            if ((n2 >> 24 & 0xFF) > 0 || fUH.field_2569d5_OdI > 0 || fUH.field_36e4da_vSL > 0) {
                GL11.glDisable(3553);
                GL11.glDisable(3008);
                GL11.glEnable(3042);
                GL11.glBlendFunc(770, 771);
                GL11.glDepthFunc(514);
                if (fUH.field_2569d5_OdI > 0 || fUH.field_36e4da_vSL > 0) {
                    GL11.glColor4f(f15, 0.0f, 0.0f, 0.4f);
                    this.field_367c742_Dne.method_3a102820_Dne(fUH, f12, f11, f9, f7 - f6, f8, f10);
                    for (n = 0; n < 4; ++n) {
                        if (this.method_e0a03bff_FWm(fUH, n, f2) < 0) continue;
                        GL11.glColor4f(f15, 0.0f, 0.0f, 0.4f);
                        this.field_20219321_FWm.method_3a102820_Dne(fUH, f12, f11, f9, f7 - f6, f8, f10);
                    }
                }
                if ((n2 >> 24 & 0xFF) > 0) {
                    f5 = (float)(n2 >> 16 & 0xFF) / 255.0f;
                    f4 = (float)(n2 >> 8 & 0xFF) / 255.0f;
                    float f16 = (float)(n2 & 0xFF) / 255.0f;
                    f3 = (float)(n2 >> 24 & 0xFF) / 255.0f;
                    GL11.glColor4f(f5, f4, f16, f3);
                    this.field_367c742_Dne.method_3a102820_Dne(fUH, f12, f11, f9, f7 - f6, f8, f10);
                    for (int i = 0; i < 4; ++i) {
                        if (this.method_e0a03bff_FWm(fUH, i, f2) < 0) continue;
                        GL11.glColor4f(f5, f4, f16, f3);
                        this.field_20219321_FWm.method_3a102820_Dne(fUH, f12, f11, f9, f7 - f6, f8, f10);
                    }
                }
                GL11.glDepthFunc(515);
                GL11.glDisable(3042);
                GL11.glEnable(3008);
                GL11.glEnable(3553);
            }
            GL11.glDisable(32826);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        oCF.method_ce7f5da9_Dne(oCF.field_21260d_FWm);
        GL11.glEnable(3553);
        oCF.method_ce7f5da9_Dne(oCF.field_2092ae_Dne);
        GL11.glEnable(2884);
        GL11.glPopMatrix();
        this.method_3320476f_FWm(fUH, d, d2, d3);
    }

    protected void method_9f9d1ed0_Dne(FUH fUH, double d, double d2, double d3) {
        GL11.glTranslatef((float)d, (float)d2, (float)d3);
    }

    protected float method_c52e66e1_FWm(FUH fUH, float f) {
        return fUH.method_117d0e97_FWm(f);
    }

    protected float method_6f1922de_Dne(FUH fUH) {
        return 90.0f;
    }

    protected void method_abcfa06e_Dne(FUH fUH, float f, float f2, float f3, float f4, float f5, float f6) {
        this.method_6f1922ee_Dne(fUH);
        if (!fUH.method_998e662d_Vxn()) {
            this.field_367c742_Dne.method_3a102820_Dne(fUH, f, f2, f3, f4, f5, f6);
        } else if (!fUH.method_49863868_FWm(Minecraft.method_81a5f12e_Dne().field_369f6b6_Dne)) {
            GL11.glPushMatrix();
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 0.15f);
            GL11.glDepthMask(false);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            GL11.glAlphaFunc(516, 0.003921569f);
            this.field_367c742_Dne.method_3a102820_Dne(fUH, f, f2, f3, f4, f5, f6);
            GL11.glDisable(3042);
            GL11.glAlphaFunc(516, 0.1f);
            GL11.glPopMatrix();
            GL11.glDepthMask(true);
        } else {
            this.field_367c742_Dne.method_5c531ba0_Dne(f, f2, f3, f4, f5, f6, fUH);
        }
    }

    protected int method_d691761_Dne(FUH fUH, float f, float f2) {
        return 0;
    }

    protected void method_be586698_Dne(FUH fUH, double d, double d2, double d3, String string, float f, double d4) {
        if (fUH.method_9b310ff4_Wwe()) {
            this.method_c92c837d_Dne(fUH, string, d, d2 - 1.5, d3, 64);
        } else {
            this.method_c92c837d_Dne(fUH, string, d, d2, d3, 64);
        }
    }
}

