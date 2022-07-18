package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class GLU
extends QCe {
    public void method_2efdcc63_Dne(cQz cQz2, double d, double d2, double d3, float f, float f2) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d2, (float)d3);
        GL11.glEnable(32826);
        GL11.glScalef(0.5f, 0.5f, 0.5f);
        int n = 1;
        int n2 = 2;
        this.method_8f501fe4_Dne("/particles.png");
        WAR wAR = WAR.field_36e5ca4_Dne;
        float f3 = (float)(n * 8 + 0) / 128.0f;
        float f4 = (float)(n * 8 + 8) / 128.0f;
        float f5 = (float)(n2 * 8 + 0) / 128.0f;
        float f6 = (float)(n2 * 8 + 8) / 128.0f;
        float f7 = 1.0f;
        float f8 = 0.5f;
        float f9 = 0.5f;
        GL11.glRotatef(180.0f - this.field_37a7828_Dne.field_2092ab_Dne, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(-this.field_37a7828_Dne.field_21260a_FWm, 1.0f, 0.0f, 0.0f);
        wAR.method_7a46289a_Dne();
        wAR.method_a680f8e7_FWm(0.0f, 1.0f, 0.0f);
        wAR.method_c38c5864_Dne(0.0f - f8, 0.0f - f9, 0.0, f3, f6);
        wAR.method_c38c5864_Dne(f7 - f8, 0.0f - f9, 0.0, f4, f6);
        wAR.method_c38c5864_Dne(f7 - f8, 1.0f - f9, 0.0, f4, f5);
        wAR.method_c38c5864_Dne(0.0f - f8, 1.0f - f9, 0.0, f3, f5);
        wAR.method_7a46288d_Dne();
        GL11.glDisable(32826);
        GL11.glPopMatrix();
        if (cQz2.field_3673728_Dne != null) {
            double d4;
            float f10 = cQz2.field_3673728_Dne.method_117d0e97_FWm(f2);
            float f11 = geR.method_ce7f5256_Dne(geR.method_143f92c9_bzF(f10) * (float)Math.PI);
            chN chN2 = cQz2.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(-0.5, 0.03, 0.8);
            chN2.method_ce7f5266_Dne(-(cQz2.field_3673728_Dne.field_31b813_kGO + (cQz2.field_3673728_Dne.field_29186a_XHL - cQz2.field_3673728_Dne.field_31b813_kGO) * f2) * (float)Math.PI / 180.0f);
            chN2.method_117d0ea7_FWm(-(cQz2.field_3673728_Dne.field_2a9ad3_Zpi + (cQz2.field_3673728_Dne.field_334489_mrb - cQz2.field_3673728_Dne.field_2a9ad3_Zpi) * f2) * (float)Math.PI / 180.0f);
            chN2.method_117d0ea7_FWm(f11 * 0.5f);
            chN2.method_ce7f5266_Dne(-f11 * 0.7f);
            double d5 = cQz2.field_3673728_Dne.field_2d29ef_aFZ + (cQz2.field_3673728_Dne.field_2f0dd3_div - cQz2.field_3673728_Dne.field_2d29ef_aFZ) * (double)f2 + chN2.field_2092a9_Dne;
            double d6 = cQz2.field_3673728_Dne.field_388da1_zGp + (cQz2.field_3673728_Dne.field_22c5fd_IjH - cQz2.field_3673728_Dne.field_388da1_zGp) * (double)f2 + chN2.field_212608_FWm;
            double d7 = cQz2.field_3673728_Dne.field_20b852_DyG + (cQz2.field_3673728_Dne.field_334487_mrb - cQz2.field_3673728_Dne.field_20b852_DyG) * (double)f2 + chN2.field_2e5f16_bzF;
            double d8 = d4 = cQz2.field_3673728_Dne != Minecraft.method_81a5f12e_Dne().field_369f6b6_Dne ? (double)cQz2.field_3673728_Dne.method_59ee189_c_() : 0.0;
            if (this.field_37a7828_Dne.field_3758af7_Dne.field_2f0dd8_div > 0 || cQz2.field_3673728_Dne != Minecraft.method_81a5f12e_Dne().field_369f6b6_Dne) {
                float f12 = (cQz2.field_3673728_Dne.field_3393da_oIf + (cQz2.field_3673728_Dne.field_22c5ff_IjH - cQz2.field_3673728_Dne.field_3393da_oIf) * f2) * (float)Math.PI / 180.0f;
                double d9 = geR.method_ce7f5256_Dne(f12);
                double d10 = geR.method_117d0e97_FWm(f12);
                d5 = cQz2.field_3673728_Dne.field_2d29ef_aFZ + (cQz2.field_3673728_Dne.field_2f0dd3_div - cQz2.field_3673728_Dne.field_2d29ef_aFZ) * (double)f2 - d10 * 0.35 - d9 * 0.85;
                d6 = cQz2.field_3673728_Dne.field_388da1_zGp + d4 + (cQz2.field_3673728_Dne.field_22c5fd_IjH - cQz2.field_3673728_Dne.field_388da1_zGp) * (double)f2 - 0.45;
                d7 = cQz2.field_3673728_Dne.field_20b852_DyG + (cQz2.field_3673728_Dne.field_334487_mrb - cQz2.field_3673728_Dne.field_20b852_DyG) * (double)f2 - d9 * 0.35 + d10 * 0.85;
            }
            double d11 = cQz2.field_2d29ef_aFZ + (cQz2.field_2f0dd3_div - cQz2.field_2d29ef_aFZ) * (double)f2;
            double d12 = cQz2.field_388da1_zGp + (cQz2.field_22c5fd_IjH - cQz2.field_388da1_zGp) * (double)f2 + 0.25;
            double d13 = cQz2.field_20b852_DyG + (cQz2.field_334487_mrb - cQz2.field_20b852_DyG) * (double)f2;
            double d14 = (float)(d5 - d11);
            double d15 = (float)(d6 - d12);
            double d16 = (float)(d7 - d13);
            GL11.glDisable(3553);
            GL11.glDisable(2896);
            wAR.method_ce7f5da9_Dne(3);
            wAR.method_143f9e1c_bzF(0);
            int n3 = 16;
            for (int i = 0; i <= n3; ++i) {
                float f13 = (float)i / (float)n3;
                wAR.method_2be429a4_Dne(d + d14 * (double)f13, d2 + d15 * (double)(f13 * f13 + f13) * 0.5 + 0.25, d3 + d16 * (double)f13);
            }
            wAR.method_7a46288d_Dne();
            GL11.glEnable(2896);
            GL11.glEnable(3553);
        }
    }

    @Override
    public void method_31745cde_Dne(sMa sMa2, double d, double d2, double d3, float f, float f2) {
        this.method_2efdcc63_Dne((cQz)sMa2, d, d2, d3, f, f2);
    }
}

