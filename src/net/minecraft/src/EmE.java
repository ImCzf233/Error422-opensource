package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class EmE
extends QCe {
    protected Gor field_367c742_Dne;

    public EmE() {
        this.field_2092ab_Dne = 0.5f;
        this.field_367c742_Dne = new WXj();
    }

    @Override
    public void method_31745cde_Dne(sMa sMa2, double d, double d2, double d3, float f, float f2) {
        this.method_2a1d7a4b_Dne((iMX)sMa2, d, d2, d3, f, f2);
    }

    public void method_2a1d7a4b_Dne(iMX iMX2, double d, double d2, double d3, float f, float f2) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d2, (float)d3);
        GL11.glRotatef(180.0f - f, 0.0f, 1.0f, 0.0f);
        float f3 = (float)iMX2.method_ae128dba_bzF() - f2;
        float f4 = (float)iMX2.method_7a46288d_Dne() - f2;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f3 > 0.0f) {
            GL11.glRotatef(geR.method_ce7f5256_Dne(f3) * f3 * f4 / 10.0f * (float)iMX2.method_907a9d14_Qnq(), 1.0f, 0.0f, 0.0f);
        }
        this.method_8f501fe4_Dne("/terrain.png");
        float f5 = 0.75f;
        GL11.glScalef(f5, f5, f5);
        GL11.glScalef(1.0f / f5, 1.0f / f5, 1.0f / f5);
        this.method_8f501fe4_Dne("/item/boat.png");
        GL11.glScalef(-1.0f, -1.0f, 1.0f);
        this.field_367c742_Dne.method_3a102820_Dne(iMX2, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0625f);
        GL11.glPopMatrix();
    }
}

