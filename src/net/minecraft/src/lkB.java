package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class lkB
extends QCe {
    private dEr field_374585b_Dne;
    private int field_2092ae_Dne;

    public lkB(dEr dEr2) {
        this(dEr2, 0);
    }

    private void method_a7fa7e91_Dne(WAR wAR, gDn gDn2) {
        float f = gDn2.method_7a46288a_Dne();
        float f2 = gDn2.method_7c6f6029_FWm();
        float f3 = gDn2.method_ae128db7_bzF();
        float f4 = gDn2.method_907a9d11_Qnq();
        float f5 = 1.0f;
        float f6 = 0.5f;
        float f7 = 0.25f;
        GL11.glRotatef(180.0f - this.field_37a7828_Dne.field_2092ab_Dne, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(-this.field_37a7828_Dne.field_21260a_FWm, 1.0f, 0.0f, 0.0f);
        wAR.method_7a46289a_Dne();
        wAR.method_a680f8e7_FWm(0.0f, 1.0f, 0.0f);
        wAR.method_c38c5864_Dne(0.0f - f6, 0.0f - f7, 0.0, f, f4);
        wAR.method_c38c5864_Dne(f5 - f6, 0.0f - f7, 0.0, f2, f4);
        wAR.method_c38c5864_Dne(f5 - f6, f5 - f7, 0.0, f2, f3);
        wAR.method_c38c5864_Dne(0.0f - f6, f5 - f7, 0.0, f, f3);
        wAR.method_7a46288d_Dne();
    }

    @Override
    public void method_31745cde_Dne(sMa sMa2, double d, double d2, double d3, float f, float f2) {
        gDn gDn2 = this.field_374585b_Dne.method_9e795529_Dne(this.field_2092ae_Dne);
        if (gDn2 != null) {
            GL11.glPushMatrix();
            GL11.glTranslatef((float)d, (float)d2, (float)d3);
            GL11.glEnable(32826);
            GL11.glScalef(0.5f, 0.5f, 0.5f);
            this.method_8f501fe4_Dne("/gui/items.png");
            WAR wAR = WAR.field_36e5ca4_Dne;
            if (gDn2 == IJk.method_285881e4_Dne("potion_splash")) {
                int n = yDZ.method_16d0a3e_Dne(((YgL)sMa2).method_7a46288d_Dne(), false);
                float f3 = (float)(n >> 16 & 0xFF) / 255.0f;
                float f4 = (float)(n >> 8 & 0xFF) / 255.0f;
                float f5 = (float)(n & 0xFF) / 255.0f;
                GL11.glColor3f(f3, f4, f5);
                GL11.glPushMatrix();
                this.method_a7fa7e91_Dne(wAR, IJk.method_285881e4_Dne("potion_contents"));
                GL11.glPopMatrix();
                GL11.glColor3f(1.0f, 1.0f, 1.0f);
            }
            this.method_a7fa7e91_Dne(wAR, gDn2);
            GL11.glDisable(32826);
            GL11.glPopMatrix();
        }
    }

    public lkB(dEr dEr2, int n) {
        this.field_374585b_Dne = dEr2;
        this.field_2092ae_Dne = n;
    }
}

