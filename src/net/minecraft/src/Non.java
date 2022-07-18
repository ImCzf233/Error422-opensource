package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class Non
extends QCe {
    public void method_b7e87ada_Dne(hhc hhc2, double d, double d2, double d3, float f, float f2) {
        this.method_8f501fe4_Dne("/item/arrows.png");
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d2, (float)d3);
        GL11.glRotatef(hhc2.field_2a9ad3_Zpi + (hhc2.field_334489_mrb - hhc2.field_2a9ad3_Zpi) * f2 - 90.0f, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(hhc2.field_31b813_kGO + (hhc2.field_29186a_XHL - hhc2.field_31b813_kGO) * f2, 0.0f, 0.0f, 1.0f);
        WAR wAR = WAR.field_36e5ca4_Dne;
        int n = 0;
        float f3 = 0.0f;
        float f4 = 0.5f;
        float f5 = (float)(0 + n * 10) / 32.0f;
        float f6 = (float)(5 + n * 10) / 32.0f;
        float f7 = 0.0f;
        float f8 = 0.15625f;
        float f9 = (float)(5 + n * 10) / 32.0f;
        float f10 = (float)(10 + n * 10) / 32.0f;
        float f11 = 0.05625f;
        GL11.glEnable(32826);
        float f12 = (float)hhc2.field_21260d_FWm - f2;
        if (f12 > 0.0f) {
            float f13 = -geR.method_ce7f5256_Dne(f12 * 3.0f) * f12;
            GL11.glRotatef(f13, 0.0f, 0.0f, 1.0f);
        }
        GL11.glRotatef(45.0f, 1.0f, 0.0f, 0.0f);
        GL11.glScalef(f11, f11, f11);
        GL11.glTranslatef(-4.0f, 0.0f, 0.0f);
        GL11.glNormal3f(f11, 0.0f, 0.0f);
        wAR.method_7a46289a_Dne();
        wAR.method_c38c5864_Dne(-7.0, -2.0, -2.0, f7, f9);
        wAR.method_c38c5864_Dne(-7.0, -2.0, 2.0, f8, f9);
        wAR.method_c38c5864_Dne(-7.0, 2.0, 2.0, f8, f10);
        wAR.method_c38c5864_Dne(-7.0, 2.0, -2.0, f7, f10);
        wAR.method_7a46288d_Dne();
        GL11.glNormal3f(-f11, 0.0f, 0.0f);
        wAR.method_7a46289a_Dne();
        wAR.method_c38c5864_Dne(-7.0, 2.0, -2.0, f7, f9);
        wAR.method_c38c5864_Dne(-7.0, 2.0, 2.0, f8, f9);
        wAR.method_c38c5864_Dne(-7.0, -2.0, 2.0, f8, f10);
        wAR.method_c38c5864_Dne(-7.0, -2.0, -2.0, f7, f10);
        wAR.method_7a46288d_Dne();
        for (int i = 0; i < 4; ++i) {
            GL11.glRotatef(90.0f, 1.0f, 0.0f, 0.0f);
            GL11.glNormal3f(0.0f, 0.0f, f11);
            wAR.method_7a46289a_Dne();
            wAR.method_c38c5864_Dne(-8.0, -2.0, 0.0, f3, f5);
            wAR.method_c38c5864_Dne(8.0, -2.0, 0.0, f4, f5);
            wAR.method_c38c5864_Dne(8.0, 2.0, 0.0, f4, f6);
            wAR.method_c38c5864_Dne(-8.0, 2.0, 0.0, f3, f6);
            wAR.method_7a46288d_Dne();
        }
        GL11.glDisable(32826);
        GL11.glPopMatrix();
    }

    @Override
    public void method_31745cde_Dne(sMa sMa2, double d, double d2, double d3, float f, float f2) {
        this.method_b7e87ada_Dne((hhc)sMa2, d, d2, d3, f, f2);
    }
}

