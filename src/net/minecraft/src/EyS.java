package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class EyS
extends YAD {
    @Override
    public void method_31745cde_Dne(sMa sMa2, double d, double d2, double d3, float f, float f2) {
        this.method_ee676a78_Dne((Ahh)sMa2, d, d2, d3, f, f2);
    }

    @Override
    public void method_2cdda2d0_Dne(FUH fUH, double d, double d2, double d3, float f, float f2) {
        this.method_ee676a78_Dne((Ahh)fUH, d, d2, d3, f, f2);
    }

    @Override
    protected void method_c52e66f1_FWm(FUH fUH, float f) {
        this.method_8dbb7e3a_Dne((Ahh)fUH, f);
    }

    protected void method_8dbb7e3a_Dne(Ahh ahh, float f) {
        super.method_c52e66f1_FWm(ahh, f);
        if (!ahh.method_8288d6f2_IjH()) {
            this.method_8f501fe4_Dne("/terrain.png");
            GL11.glEnable(2884);
            GL11.glPushMatrix();
            GL11.glScalef(1.0f, -1.0f, 1.0f);
            GL11.glTranslatef(0.2f, 0.4f, 0.5f);
            GL11.glRotatef(42.0f, 0.0f, 1.0f, 0.0f);
            this.field_37e98b3_Dne.method_23d00645_Dne(zKP.field_5e6003e8_Qnq, 0, 1.0f);
            GL11.glTranslatef(0.1f, 0.0f, -0.6f);
            GL11.glRotatef(42.0f, 0.0f, 1.0f, 0.0f);
            this.field_37e98b3_Dne.method_23d00645_Dne(zKP.field_5e6003e8_Qnq, 0, 1.0f);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            ((qcK)this.field_367c742_Dne).field_37b7066_Dne.method_143f92d9_bzF(0.0625f);
            GL11.glScalef(1.0f, -1.0f, 1.0f);
            GL11.glTranslatef(0.0f, 0.75f, -0.2f);
            GL11.glRotatef(12.0f, 0.0f, 1.0f, 0.0f);
            this.field_37e98b3_Dne.method_23d00645_Dne(zKP.field_5e6003e8_Qnq, 0, 1.0f);
            GL11.glPopMatrix();
            GL11.glDisable(2884);
        }
    }

    public EyS(Gor gor, float f) {
        super(gor, f);
    }

    public void method_ee676a78_Dne(Ahh ahh, double d, double d2, double d3, float f, float f2) {
        super.method_2cdda2d0_Dne(ahh, d, d2, d3, f, f2);
    }
}

