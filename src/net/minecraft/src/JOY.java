package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;
import org.lwjgl.opengl.GL11;

public class JOY
extends YAD {
    private static int field_2092ae_Dne = 0;
    protected Drf field_36673f4_Dne;

    public void method_4224745e_Dne(WSC wSC, double d, double d2, double d3, float f, float f2) {
        mwX.method_b9f76b1c_Dne(wSC, false);
        if (field_2092ae_Dne != 4) {
            this.field_367c742_Dne = new Drf(0.0f);
            field_2092ae_Dne = 4;
        }
        super.method_2cdda2d0_Dne(wSC, d, d2, d3, f, f2);
        if (wSC.field_36acbb7_Dne != null) {
            float f3 = (float)wSC.field_36acbb7_Dne.field_2092ae_Dne + f2;
            float f4 = geR.method_ce7f5256_Dne(f3 * 0.2f) / 2.0f + 0.5f;
            f4 = (f4 * f4 + f4) * 0.2f;
            float f5 = (float)(wSC.field_36acbb7_Dne.field_2f0dd3_div - wSC.field_2f0dd3_div - (wSC.field_2d29ef_aFZ - wSC.field_2f0dd3_div) * (double)(1.0f - f2));
            float f6 = (float)((double)f4 + wSC.field_36acbb7_Dne.field_22c5fd_IjH - 1.0 - wSC.field_22c5fd_IjH - (wSC.field_388da1_zGp - wSC.field_22c5fd_IjH) * (double)(1.0f - f2));
            float f7 = (float)(wSC.field_36acbb7_Dne.field_334487_mrb - wSC.field_334487_mrb - (wSC.field_20b852_DyG - wSC.field_334487_mrb) * (double)(1.0f - f2));
            float f8 = geR.method_143f92c9_bzF(f5 * f5 + f7 * f7);
            float f9 = geR.method_143f92c9_bzF(f5 * f5 + f6 * f6 + f7 * f7);
            GL11.glPushMatrix();
            GL11.glTranslatef((float)d, (float)d2 + 2.0f, (float)d3);
            GL11.glRotatef((float)(-Math.atan2(f7, f5)) * 180.0f / (float)Math.PI - 90.0f, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef((float)(-Math.atan2(f8, f6)) * 180.0f / (float)Math.PI - 90.0f, 1.0f, 0.0f, 0.0f);
            WAR wAR = WAR.field_36e5ca4_Dne;
            Cit.method_7a46289a_Dne();
            GL11.glDisable(2884);
            this.method_8f501fe4_Dne("/mob/enderdragon/beam.png");
            GL11.glShadeModel(7425);
            float f10 = 0.0f - ((float)wSC.field_388da6_zGp + f2) * 0.01f;
            float f11 = geR.method_143f92c9_bzF(f5 * f5 + f6 * f6 + f7 * f7) / 32.0f - ((float)wSC.field_388da6_zGp + f2) * 0.01f;
            wAR.method_ce7f5da9_Dne(5);
            int n = 8;
            for (int i = 0; i <= n; ++i) {
                float f12 = geR.method_ce7f5256_Dne((float)(i % n) * (float)Math.PI * 2.0f / (float)n) * 0.75f;
                float f13 = geR.method_117d0e97_FWm((float)(i % n) * (float)Math.PI * 2.0f / (float)n) * 0.75f;
                float f14 = (float)(i % n) * 1.0f / (float)n;
                wAR.method_143f9e1c_bzF(0);
                wAR.method_c38c5864_Dne(f12 * 0.2f, f13 * 0.2f, 0.0, f14, f11);
                wAR.method_143f9e1c_bzF(0xFFFFFF);
                wAR.method_c38c5864_Dne(f12, f13, f9, f14, f10);
            }
            wAR.method_7a46288d_Dne();
            GL11.glEnable(2884);
            GL11.glShadeModel(7424);
            Cit.method_7c6f6039_FWm();
            GL11.glPopMatrix();
        }
    }

    @Override
    protected void method_c52e66f1_FWm(FUH fUH, float f) {
        this.method_f3a56b20_Dne((WSC)fUH, f);
    }

    protected void method_a0041b20_Dne(WSC wSC, float f, float f2, float f3) {
        float f4 = (float)wSC.method_2c2b2888_Dne(7, f3)[0];
        float f5 = (float)(wSC.method_2c2b2888_Dne(5, f3)[1] - wSC.method_2c2b2888_Dne(10, f3)[1]);
        GL11.glRotatef(-f4, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(f5 * 10.0f, 1.0f, 0.0f, 0.0f);
        GL11.glTranslatef(0.0f, 0.0f, 1.0f);
        if (wSC.field_36e4da_vSL > 0) {
            float f6 = ((float)wSC.field_36e4da_vSL + f3 - 1.0f) / 20.0f * 1.6f;
            if ((f6 = geR.method_143f92c9_bzF(f6)) > 1.0f) {
                f6 = 1.0f;
            }
            GL11.glRotatef(f6 * this.method_6f1922de_Dne(wSC), 0.0f, 0.0f, 1.0f);
        }
    }

    protected void method_3f6300a0_Dne(WSC wSC, float f, float f2, float f3, float f4, float f5, float f6) {
        if (wSC.field_21260d_FWm > 0) {
            float f7 = (float)wSC.field_21260d_FWm / 200.0f;
            GL11.glDepthFunc(515);
            GL11.glEnable(3008);
            GL11.glAlphaFunc(516, f7);
            this.method_8f501fe4_Dne("/mob/enderdragon/shuffle.png");
            this.field_367c742_Dne.method_3a102820_Dne(wSC, f, f2, f3, f4, f5, f6);
            GL11.glAlphaFunc(516, 0.1f);
            GL11.glDepthFunc(514);
        }
        this.method_8f501fe4_Dne(wSC.method_6859cdb9_bzF());
        this.field_367c742_Dne.method_3a102820_Dne(wSC, f, f2, f3, f4, f5, f6);
        if (wSC.field_2569d5_OdI > 0) {
            GL11.glDepthFunc(514);
            GL11.glDisable(3553);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            GL11.glColor4f(1.0f, 0.0f, 0.0f, 0.5f);
            this.field_367c742_Dne.method_3a102820_Dne(wSC, f, f2, f3, f4, f5, f6);
            GL11.glEnable(3553);
            GL11.glDisable(3042);
            GL11.glDepthFunc(515);
        }
    }

    protected void method_f3a56b20_Dne(WSC wSC, float f) {
        super.method_c52e66f1_FWm(wSC, f);
        WAR wAR = WAR.field_36e5ca4_Dne;
        if (wSC.field_21260d_FWm > 0) {
            Cit.method_7a46289a_Dne();
            float f2 = ((float)wSC.field_21260d_FWm + f) / 200.0f;
            float f3 = 0.0f;
            if (f2 > 0.8f) {
                f3 = (f2 - 0.8f) / 0.2f;
            }
            Random random = new Random(432L);
            GL11.glDisable(3553);
            GL11.glShadeModel(7425);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 1);
            GL11.glDisable(3008);
            GL11.glEnable(2884);
            GL11.glDepthMask(false);
            GL11.glPushMatrix();
            GL11.glTranslatef(0.0f, -1.0f, -2.0f);
            int n = 0;
            while ((float)n < (f2 + f2 * f2) / 2.0f * 60.0f) {
                GL11.glRotatef(random.nextFloat() * 360.0f, 1.0f, 0.0f, 0.0f);
                GL11.glRotatef(random.nextFloat() * 360.0f, 0.0f, 1.0f, 0.0f);
                GL11.glRotatef(random.nextFloat() * 360.0f, 0.0f, 0.0f, 1.0f);
                GL11.glRotatef(random.nextFloat() * 360.0f, 1.0f, 0.0f, 0.0f);
                GL11.glRotatef(random.nextFloat() * 360.0f, 0.0f, 1.0f, 0.0f);
                GL11.glRotatef(random.nextFloat() * 360.0f + f2 * 90.0f, 0.0f, 0.0f, 1.0f);
                wAR.method_ce7f5da9_Dne(6);
                float f4 = random.nextFloat() * 20.0f + 5.0f + f3 * 10.0f;
                float f5 = random.nextFloat() * 2.0f + 1.0f + f3 * 2.0f;
                wAR.method_16cca7a_Dne(0xFFFFFF, (int)(255.0f * (1.0f - f3)));
                wAR.method_2be429a4_Dne(0.0, 0.0, 0.0);
                wAR.method_16cca7a_Dne(0xFF00FF, 0);
                wAR.method_2be429a4_Dne(-0.866 * (double)f5, f4, -0.5f * f5);
                wAR.method_2be429a4_Dne(0.866 * (double)f5, f4, -0.5f * f5);
                wAR.method_2be429a4_Dne(0.0, f4, 1.0f * f5);
                wAR.method_2be429a4_Dne(-0.866 * (double)f5, f4, -0.5f * f5);
                wAR.method_7a46288d_Dne();
                ++n;
            }
            GL11.glPopMatrix();
            GL11.glDepthMask(true);
            GL11.glDisable(2884);
            GL11.glDisable(3042);
            GL11.glShadeModel(7424);
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            GL11.glEnable(3553);
            GL11.glEnable(3008);
            Cit.method_7c6f6039_FWm();
        }
    }

    @Override
    protected void method_9fba3e12_Dne(FUH fUH, float f, float f2, float f3) {
        this.method_a0041b20_Dne((WSC)fUH, f, f2, f3);
    }

    @Override
    protected int method_d6a747e_Dne(FUH fUH, int n, float f) {
        return this.method_8109bdb0_Dne((WSC)fUH, n, f);
    }

    @Override
    protected void method_abcfa06e_Dne(FUH fUH, float f, float f2, float f3, float f4, float f5, float f6) {
        this.method_3f6300a0_Dne((WSC)fUH, f, f2, f3, f4, f5, f6);
    }

    @Override
    public void method_31745cde_Dne(sMa sMa2, double d, double d2, double d3, float f, float f2) {
        this.method_4224745e_Dne((WSC)sMa2, d, d2, d3, f, f2);
    }

    @Override
    public void method_2cdda2d0_Dne(FUH fUH, double d, double d2, double d3, float f, float f2) {
        this.method_4224745e_Dne((WSC)fUH, d, d2, d3, f, f2);
    }

    protected int method_8109bdb0_Dne(WSC wSC, int n, float f) {
        if (n == 1) {
            GL11.glDepthFunc(515);
        }
        if (n != 0) {
            return -1;
        }
        this.method_8f501fe4_Dne("/mob/enderdragon/ender_eyes.png");
        float f2 = 1.0f;
        GL11.glEnable(3042);
        GL11.glDisable(3008);
        GL11.glBlendFunc(1, 1);
        GL11.glDisable(2896);
        GL11.glDepthFunc(514);
        int n2 = 61680;
        int n3 = n2 % 65536;
        int n4 = n2 / 65536;
        oCF.method_2c2b8f69_Dne(oCF.field_21260d_FWm, (float)n3 / 1.0f, (float)n4 / 1.0f);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glEnable(2896);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, f2);
        return 1;
    }

    public JOY() {
        super(new Drf(0.0f), 0.5f);
        this.field_36673f4_Dne = (Drf)this.field_367c742_Dne;
        this.method_724f763d_Dne(this.field_367c742_Dne);
    }
}

