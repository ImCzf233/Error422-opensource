package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class vnj
extends YAD {
    private yGB field_37de5d8_Dne;

    protected void method_b82c47bd_Dne(CDE cDE, float f) {
        super.method_c52e66f1_FWm(cDE, f);
        if (cDE.method_c5287a51_qLR() != 0) {
            GL11.glEnable(32826);
            GL11.glPushMatrix();
            GL11.glRotatef(5.0f + 180.0f * this.field_37de5d8_Dne.field_75c33e53_bzF.field_388da3_zGp / (float)Math.PI, 1.0f, 0.0f, 0.0f);
            GL11.glTranslatef(-0.6875f, 1.25f, -0.9375f);
            GL11.glRotatef(90.0f, 1.0f, 0.0f, 0.0f);
            float f2 = 0.8f;
            GL11.glScalef(f2, -f2, f2);
            int n = cDE.method_ce7f5259_Dne(f);
            int n2 = n % 65536;
            int n3 = n / 65536;
            oCF.method_2c2b8f69_Dne(oCF.field_21260d_FWm, (float)n2 / 1.0f, (float)n3 / 1.0f);
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            this.method_8f501fe4_Dne("/terrain.png");
            this.field_37e98b3_Dne.method_23d00645_Dne(zKP.field_20306100_FWm, 0, 1.0f);
            GL11.glPopMatrix();
            GL11.glDisable(32826);
        }
    }

    @Override
    protected void method_9fba3e12_Dne(FUH fUH, float f, float f2, float f3) {
        this.method_5e46447d_Dne((CDE)fUH, f, f2, f3);
    }

    public vnj() {
        super(new yGB(), 0.5f);
        this.field_37de5d8_Dne = (yGB)this.field_367c742_Dne;
    }

    @Override
    public void method_31745cde_Dne(sMa sMa2, double d, double d2, double d3, float f, float f2) {
        this.method_7881ba7b_Dne((CDE)sMa2, d, d2, d3, f, f2);
    }

    protected void method_5e46447d_Dne(CDE cDE, float f, float f2, float f3) {
        super.method_9fba3e12_Dne(cDE, f, f2, f3);
        if ((double)cDE.field_351225_qrB >= 0.01) {
            float f4 = 13.0f;
            float f5 = cDE.field_23d93e_LVR - cDE.field_351225_qrB * (1.0f - f3) + 6.0f;
            float f6 = (Math.abs(f5 % f4 - f4 * 0.5f) - f4 * 0.25f) / (f4 * 0.25f);
            GL11.glRotatef(6.5f * f6, 0.0f, 0.0f, 1.0f);
        }
    }

    public void method_7881ba7b_Dne(CDE cDE, double d, double d2, double d3, float f, float f2) {
        super.method_2cdda2d0_Dne(cDE, d, d2, d3, f, f2);
    }

    @Override
    public void method_2cdda2d0_Dne(FUH fUH, double d, double d2, double d3, float f, float f2) {
        this.method_7881ba7b_Dne((CDE)fUH, d, d2, d3, f, f2);
    }

    @Override
    protected void method_c52e66f1_FWm(FUH fUH, float f) {
        this.method_b82c47bd_Dne((CDE)fUH, f);
    }
}

