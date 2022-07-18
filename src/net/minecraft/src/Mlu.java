package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class Mlu
extends YAD {
    private EnT field_366d721_Dne;
    private int field_2092ae_Dne;

    protected void method_926195d6_FWm(bVr bVr2, float f) {
        float f2 = 0.9375f;
        GL11.glScalef(f2, f2, f2);
    }

    @Override
    public void method_2cdda2d0_Dne(FUH fUH, double d, double d2, double d3, float f, float f2) {
        this.method_bd64d735_Dne((bVr)fUH, d, d2, d3, f, f2);
    }

    protected void method_7a46289a_Dne() {
        GL11.glTranslatef(0.0f, 0.1875f, 0.0f);
    }

    @Override
    protected void method_740ba292_Dne(FUH fUH, float f) {
        this.method_926195d6_FWm((bVr)fUH, f);
    }

    @Override
    public void method_31745cde_Dne(sMa sMa2, double d, double d2, double d3, float f, float f2) {
        this.method_bd64d735_Dne((bVr)sMa2, d, d2, d3, f, f2);
    }

    protected void method_413ed177_Dne(bVr bVr2, float f) {
        float f2 = 1.0f;
        GL11.glColor3f(f2, f2, f2);
        super.method_c52e66f1_FWm(bVr2, f);
        NMq nMq = bVr2.method_23040479_Dne();
        if (nMq != null) {
            float f3;
            GL11.glPushMatrix();
            if (this.field_367c742_Dne.field_20b868_DyG) {
                f3 = 0.5f;
                GL11.glTranslatef(0.0f, 0.625f, 0.0f);
                GL11.glRotatef(-20.0f, -1.0f, 0.0f, 0.0f);
                GL11.glScalef(f3, f3, f3);
            }
            this.field_366d721_Dne.field_f0ad2f5e_zGp.method_143f92d9_bzF(0.0625f);
            GL11.glTranslatef(-0.0625f, 0.53125f, 0.21875f);
            if (nMq.field_2e5f1b_bzF < 256 && zVu.method_ce7f5dad_Dne(zKP.field_8374b848_Dne[nMq.field_2e5f1b_bzF].method_7a46288d_Dne())) {
                f3 = 0.5f;
                GL11.glTranslatef(0.0f, 0.1875f, -0.3125f);
                GL11.glRotatef(20.0f, 1.0f, 0.0f, 0.0f);
                GL11.glRotatef(45.0f, 0.0f, 1.0f, 0.0f);
                GL11.glScalef(f3 *= 0.75f, -f3, f3);
            } else if (nMq.field_2e5f1b_bzF == dEr.field_3667432_Dne.field_267cf5_Qnq) {
                f3 = 0.625f;
                GL11.glTranslatef(0.0f, 0.125f, 0.3125f);
                GL11.glRotatef(-20.0f, 0.0f, 1.0f, 0.0f);
                GL11.glScalef(f3, -f3, f3);
                GL11.glRotatef(-100.0f, 1.0f, 0.0f, 0.0f);
                GL11.glRotatef(45.0f, 0.0f, 1.0f, 0.0f);
            } else if (dEr.field_836aa5b6_Dne[nMq.field_2e5f1b_bzF].method_7c6f603d_FWm()) {
                f3 = 0.625f;
                if (dEr.field_836aa5b6_Dne[nMq.field_2e5f1b_bzF].method_ae128dcb_bzF()) {
                    GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
                    GL11.glTranslatef(0.0f, -0.125f, 0.0f);
                }
                this.method_7a46289a_Dne();
                GL11.glScalef(f3, -f3, f3);
                GL11.glRotatef(-100.0f, 1.0f, 0.0f, 0.0f);
                GL11.glRotatef(45.0f, 0.0f, 1.0f, 0.0f);
            } else {
                f3 = 0.375f;
                GL11.glTranslatef(0.25f, 0.1875f, -0.1875f);
                GL11.glScalef(f3, f3, f3);
                GL11.glRotatef(60.0f, 0.0f, 0.0f, 1.0f);
                GL11.glRotatef(-90.0f, 1.0f, 0.0f, 0.0f);
                GL11.glRotatef(20.0f, 0.0f, 0.0f, 1.0f);
            }
            GL11.glRotatef(-15.0f, 1.0f, 0.0f, 0.0f);
            GL11.glRotatef(40.0f, 0.0f, 0.0f, 1.0f);
            this.field_37a7828_Dne.field_36fa224_Dne.method_d09371e2_Dne(bVr2, nMq, 0);
            if (nMq.method_230de6ba_Dne().method_7a46289e_Dne()) {
                this.field_37a7828_Dne.field_36fa224_Dne.method_d09371e2_Dne(bVr2, nMq, 1);
            }
            GL11.glPopMatrix();
        }
    }

    public void method_bd64d735_Dne(bVr bVr2, double d, double d2, double d3, float f, float f2) {
        NMq nMq = bVr2.method_23040479_Dne();
        if (this.field_366d721_Dne.method_7a46288d_Dne() != this.field_2092ae_Dne) {
            Minecraft.method_81a5f12e_Dne().method_230e0120_Dne().method_8f501fe4_Dne("Loaded new witch model");
            this.field_366d721_Dne = new EnT(0.0f);
            this.field_367c742_Dne = this.field_366d721_Dne;
            this.field_2092ae_Dne = this.field_366d721_Dne.method_7a46288d_Dne();
        }
        this.field_366d721_Dne.field_2092bf_Dne = nMq != null;
        super.method_2cdda2d0_Dne(bVr2, d, d2, d3, f, f2);
    }

    @Override
    protected void method_c52e66f1_FWm(FUH fUH, float f) {
        this.method_413ed177_Dne((bVr)fUH, f);
    }

    public Mlu() {
        super(new EnT(0.0f), 0.5f);
        this.field_366d721_Dne = (EnT)this.field_367c742_Dne;
        this.field_2092ae_Dne = this.field_366d721_Dne.method_7a46288d_Dne();
    }
}

