package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class cZD
extends QCe {
    public void method_c7df1813_Dne(alg alg2, double d, double d2, double d3, float f, float f2) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d2, (float)d3);
        int n = alg2.method_ae128dba_bzF();
        this.method_8f501fe4_Dne("/item/xporb.png");
        WAR wAR = WAR.field_36e5ca4_Dne;
        float f3 = (float)(n % 4 * 16 + 0) / 64.0f;
        float f4 = (float)(n % 4 * 16 + 16) / 64.0f;
        float f5 = (float)(n / 4 * 16 + 0) / 64.0f;
        float f6 = (float)(n / 4 * 16 + 16) / 64.0f;
        float f7 = 1.0f;
        float f8 = 0.5f;
        float f9 = 0.25f;
        int n2 = alg2.method_ce7f5259_Dne(f2);
        int n3 = n2 % 65536;
        int n4 = n2 / 65536;
        oCF.method_2c2b8f69_Dne(oCF.field_21260d_FWm, (float)n3 / 1.0f, (float)n4 / 1.0f);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        float f10 = 255.0f;
        float f11 = ((float)alg2.field_2092ae_Dne + f2) / 2.0f;
        n4 = (int)((geR.method_ce7f5256_Dne(f11 + 0.0f) + 1.0f) * 0.5f * f10);
        int n5 = (int)f10;
        int n6 = (int)((geR.method_ce7f5256_Dne(f11 + 4.1887903f) + 1.0f) * 0.1f * f10);
        int n7 = n4 << 16 | n5 << 8 | n6;
        GL11.glRotatef(180.0f - this.field_37a7828_Dne.field_2092ab_Dne, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(-this.field_37a7828_Dne.field_21260a_FWm, 1.0f, 0.0f, 0.0f);
        float f12 = 0.3f;
        GL11.glScalef(f12, f12, f12);
        wAR.method_7a46289a_Dne();
        wAR.method_16cca7a_Dne(n7, 128);
        wAR.method_a680f8e7_FWm(0.0f, 1.0f, 0.0f);
        wAR.method_c38c5864_Dne(0.0f - f8, 0.0f - f9, 0.0, f3, f6);
        wAR.method_c38c5864_Dne(f7 - f8, 0.0f - f9, 0.0, f4, f6);
        wAR.method_c38c5864_Dne(f7 - f8, 1.0f - f9, 0.0, f4, f5);
        wAR.method_c38c5864_Dne(0.0f - f8, 1.0f - f9, 0.0, f3, f5);
        wAR.method_7a46288d_Dne();
        GL11.glDisable(3042);
        GL11.glDisable(32826);
        GL11.glPopMatrix();
    }

    public cZD() {
        this.field_2092ab_Dne = 0.15f;
        this.field_21260a_FWm = 0.75f;
    }

    @Override
    public void method_31745cde_Dne(sMa sMa2, double d, double d2, double d3, float f, float f2) {
        this.method_c7df1813_Dne((alg)sMa2, d, d2, d3, f, f2);
    }
}

