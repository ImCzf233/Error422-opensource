package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class iDg
extends QCe {
    @Override
    public void method_31745cde_Dne(sMa sMa2, double d, double d2, double d3, float f, float f2) {
        this.method_8ac29dc2_Dne((JCd)sMa2, d, d2, d3, f, f2);
    }

    public void method_8ac29dc2_Dne(JCd jCd, double d, double d2, double d3, float f, float f2) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d2, (float)d3);
        GL11.glRotatef(f, 0.0f, 1.0f, 0.0f);
        GL11.glEnable(32826);
        this.method_8f501fe4_Dne("/art/kz.png");
        uCl uCl2 = jCd.field_37c0a6e_Dne;
        float f3 = 0.0625f;
        GL11.glScalef(f3, f3, f3);
        this.method_1dcf037c_Dne(jCd, uCl2.field_21260d_FWm, uCl2.field_2e5f1b_bzF, uCl2.field_267cf5_Qnq, uCl2.field_2d29f4_aFZ);
        GL11.glDisable(32826);
        GL11.glPopMatrix();
    }

    private void method_248551bc_Dne(JCd jCd, float f, float f2) {
        int n = geR.method_117d0718_FWm(jCd.field_2f0dd3_div);
        int n2 = geR.method_117d0718_FWm(jCd.field_22c5fd_IjH + (double)(f2 / 16.0f));
        int n3 = geR.method_117d0718_FWm(jCd.field_334487_mrb);
        if (jCd.field_2092ae_Dne == 2) {
            n = geR.method_117d0718_FWm(jCd.field_2f0dd3_div + (double)(f / 16.0f));
        }
        if (jCd.field_2092ae_Dne == 1) {
            n3 = geR.method_117d0718_FWm(jCd.field_334487_mrb - (double)(f / 16.0f));
        }
        if (jCd.field_2092ae_Dne == 0) {
            n = geR.method_117d0718_FWm(jCd.field_2f0dd3_div - (double)(f / 16.0f));
        }
        if (jCd.field_2092ae_Dne == 3) {
            n3 = geR.method_117d0718_FWm(jCd.field_334487_mrb + (double)(f / 16.0f));
        }
        int n4 = this.field_37a7828_Dne.field_36c4f18_Dne.method_5972744d_Dne(n, n2, n3, 0);
        int n5 = n4 % 65536;
        int n6 = n4 / 65536;
        oCF.method_2c2b8f69_Dne(oCF.field_21260d_FWm, n5, n6);
        GL11.glColor3f(1.0f, 1.0f, 1.0f);
    }

    private void method_1dcf037c_Dne(JCd jCd, int n, int n2, int n3, int n4) {
        float f = (float)(-n) / 2.0f;
        float f2 = (float)(-n2) / 2.0f;
        float f3 = 0.5f;
        float f4 = 0.75f;
        float f5 = 0.8125f;
        float f6 = 0.0f;
        float f7 = 0.0625f;
        float f8 = 0.75f;
        float f9 = 0.8125f;
        float f10 = 0.001953125f;
        float f11 = 0.001953125f;
        float f12 = 0.7519531f;
        float f13 = 0.7519531f;
        float f14 = 0.0f;
        float f15 = 0.0625f;
        for (int i = 0; i < n / 16; ++i) {
            for (int j = 0; j < n2 / 16; ++j) {
                float f16 = f + (float)((i + 1) * 16);
                float f17 = f + (float)(i * 16);
                float f18 = f2 + (float)((j + 1) * 16);
                float f19 = f2 + (float)(j * 16);
                this.method_248551bc_Dne(jCd, (f16 + f17) / 2.0f, (f18 + f19) / 2.0f);
                float f20 = (float)(n3 + n - i * 16) / 256.0f;
                float f21 = (float)(n3 + n - (i + 1) * 16) / 256.0f;
                float f22 = (float)(n4 + n2 - j * 16) / 256.0f;
                float f23 = (float)(n4 + n2 - (j + 1) * 16) / 256.0f;
                WAR wAR = WAR.field_36e5ca4_Dne;
                wAR.method_7a46289a_Dne();
                wAR.method_a680f8e7_FWm(0.0f, 0.0f, -1.0f);
                wAR.method_c38c5864_Dne(f16, f19, -f3, f21, f22);
                wAR.method_c38c5864_Dne(f17, f19, -f3, f20, f22);
                wAR.method_c38c5864_Dne(f17, f18, -f3, f20, f23);
                wAR.method_c38c5864_Dne(f16, f18, -f3, f21, f23);
                wAR.method_a680f8e7_FWm(0.0f, 0.0f, 1.0f);
                wAR.method_c38c5864_Dne(f16, f18, f3, f4, f6);
                wAR.method_c38c5864_Dne(f17, f18, f3, f5, f6);
                wAR.method_c38c5864_Dne(f17, f19, f3, f5, f7);
                wAR.method_c38c5864_Dne(f16, f19, f3, f4, f7);
                wAR.method_a680f8e7_FWm(0.0f, 1.0f, 0.0f);
                wAR.method_c38c5864_Dne(f16, f18, -f3, f8, f10);
                wAR.method_c38c5864_Dne(f17, f18, -f3, f9, f10);
                wAR.method_c38c5864_Dne(f17, f18, f3, f9, f11);
                wAR.method_c38c5864_Dne(f16, f18, f3, f8, f11);
                wAR.method_a680f8e7_FWm(0.0f, -1.0f, 0.0f);
                wAR.method_c38c5864_Dne(f16, f19, f3, f8, f10);
                wAR.method_c38c5864_Dne(f17, f19, f3, f9, f10);
                wAR.method_c38c5864_Dne(f17, f19, -f3, f9, f11);
                wAR.method_c38c5864_Dne(f16, f19, -f3, f8, f11);
                wAR.method_a680f8e7_FWm(-1.0f, 0.0f, 0.0f);
                wAR.method_c38c5864_Dne(f16, f18, f3, f13, f14);
                wAR.method_c38c5864_Dne(f16, f19, f3, f13, f15);
                wAR.method_c38c5864_Dne(f16, f19, -f3, f12, f15);
                wAR.method_c38c5864_Dne(f16, f18, -f3, f12, f14);
                wAR.method_a680f8e7_FWm(1.0f, 0.0f, 0.0f);
                wAR.method_c38c5864_Dne(f17, f18, -f3, f13, f14);
                wAR.method_c38c5864_Dne(f17, f19, -f3, f13, f15);
                wAR.method_c38c5864_Dne(f17, f19, f3, f12, f15);
                wAR.method_c38c5864_Dne(f17, f18, f3, f12, f14);
                wAR.method_7a46288d_Dne();
            }
        }
    }
}

