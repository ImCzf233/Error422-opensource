package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class svf
extends QCe {
    private float field_2e5f18_bzF;

    public svf(float f) {
        this.field_2e5f18_bzF = f;
    }

    public void method_f4e74059_Dne(Tdr tdr, double d, double d2, double d3, float f, float f2) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d2, (float)d3);
        GL11.glEnable(32826);
        float f3 = this.field_2e5f18_bzF;
        GL11.glScalef(f3 / 1.0f, f3 / 1.0f, f3 / 1.0f);
        gDn gDn2 = dEr.field_9b1ab643_lDk.method_9e795529_Dne(0);
        this.method_8f501fe4_Dne("/gui/items.png");
        WAR wAR = WAR.field_36e5ca4_Dne;
        float f4 = gDn2.method_7a46288a_Dne();
        float f5 = gDn2.method_7c6f6029_FWm();
        float f6 = gDn2.method_ae128db7_bzF();
        float f7 = gDn2.method_907a9d11_Qnq();
        float f8 = 1.0f;
        float f9 = 0.5f;
        float f10 = 0.25f;
        GL11.glRotatef(180.0f - this.field_37a7828_Dne.field_2092ab_Dne, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(-this.field_37a7828_Dne.field_21260a_FWm, 1.0f, 0.0f, 0.0f);
        wAR.method_7a46289a_Dne();
        wAR.method_a680f8e7_FWm(0.0f, 1.0f, 0.0f);
        wAR.method_c38c5864_Dne(0.0f - f9, 0.0f - f10, 0.0, f4, f7);
        wAR.method_c38c5864_Dne(f8 - f9, 0.0f - f10, 0.0, f5, f7);
        wAR.method_c38c5864_Dne(f8 - f9, 1.0f - f10, 0.0, f5, f6);
        wAR.method_c38c5864_Dne(0.0f - f9, 1.0f - f10, 0.0, f4, f6);
        wAR.method_7a46288d_Dne();
        GL11.glDisable(32826);
        GL11.glPopMatrix();
    }

    @Override
    public void method_31745cde_Dne(sMa sMa2, double d, double d2, double d3, float f, float f2) {
        this.method_f4e74059_Dne((Tdr)sMa2, d, d2, d3, f, f2);
    }
}

