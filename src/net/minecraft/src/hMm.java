package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class hMm
extends YAD {
    private int field_2092ae_Dne;

    protected void method_3fb981e_Dne(oaw oaw2, float f) {
        GL11.glScalef(0.35f, 0.35f, 0.35f);
    }

    protected void method_f383009e_Dne(oaw oaw2, float f, float f2, float f3) {
        if (!oaw2.method_b6f3e1a2_haP()) {
            GL11.glTranslatef(0.0f, geR.method_117d0e97_FWm(f * 0.3f) * 0.1f, 0.0f);
        } else {
            GL11.glTranslatef(0.0f, -0.1f, 0.0f);
        }
        super.method_9fba3e12_Dne(oaw2, f, f2, f3);
    }

    @Override
    public void method_31745cde_Dne(sMa sMa2, double d, double d2, double d3, float f, float f2) {
        this.method_b17ff25c_Dne((oaw)sMa2, d, d2, d3, f, f2);
    }

    @Override
    protected void method_9f9d1ed0_Dne(FUH fUH, double d, double d2, double d3) {
        this.method_f365e15c_Dne((oaw)fUH, d, d2, d3);
    }

    @Override
    protected void method_9fba3e12_Dne(FUH fUH, float f, float f2, float f3) {
        this.method_f383009e_Dne((oaw)fUH, f, f2, f3);
    }

    @Override
    public void method_2cdda2d0_Dne(FUH fUH, double d, double d2, double d3, float f, float f2) {
        this.method_b17ff25c_Dne((oaw)fUH, d, d2, d3, f, f2);
    }

    public hMm() {
        super(new ljp(), 0.25f);
        this.field_2092ae_Dne = ((ljp)this.field_367c742_Dne).method_7a46288d_Dne();
    }

    @Override
    protected void method_740ba292_Dne(FUH fUH, float f) {
        this.method_3fb981e_Dne((oaw)fUH, f);
    }

    public void method_b17ff25c_Dne(oaw oaw2, double d, double d2, double d3, float f, float f2) {
        int n = ((ljp)this.field_367c742_Dne).method_7a46288d_Dne();
        if (n != this.field_2092ae_Dne) {
            this.field_2092ae_Dne = n;
            this.field_367c742_Dne = new ljp();
        }
        super.method_2cdda2d0_Dne(oaw2, d, d2, d3, f, f2);
    }

    protected void method_f365e15c_Dne(oaw oaw2, double d, double d2, double d3) {
        super.method_9f9d1ed0_Dne(oaw2, d, d2, d3);
    }
}

