package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class olK
extends YAD {
    protected oai_0 field_36abc75_Dne;

    @Override
    protected void method_740ba292_Dne(FUH fUH, float f) {
        this.method_967557a0_FWm((pjB)fUH, f);
    }

    @Override
    public void method_2cdda2d0_Dne(FUH fUH, double d, double d2, double d3, float f, float f2) {
        this.method_2acea3ff_Dne((pjB)fUH, d, d2, d3, f, f2);
    }

    public olK() {
        super(new oai_0(0.0f), 0.5f);
        this.field_36abc75_Dne = (oai_0)this.field_367c742_Dne;
    }

    @Override
    protected void method_c52e66f1_FWm(FUH fUH, float f) {
        this.method_45529341_Dne((pjB)fUH, f);
    }

    protected void method_45529341_Dne(pjB pjB2, float f) {
        super.method_c52e66f1_FWm(pjB2, f);
    }

    @Override
    public void method_31745cde_Dne(sMa sMa2, double d, double d2, double d3, float f, float f2) {
        this.method_2acea3ff_Dne((pjB)sMa2, d, d2, d3, f, f2);
    }

    @Override
    protected int method_d6a747e_Dne(FUH fUH, int n, float f) {
        return this.method_650199af_Dne((pjB)fUH, n, f);
    }

    protected int method_650199af_Dne(pjB pjB2, int n, float f) {
        return -1;
    }

    public void method_2acea3ff_Dne(pjB pjB2, double d, double d2, double d3, float f, float f2) {
        super.method_2cdda2d0_Dne(pjB2, d, d2, d3, f, f2);
    }

    protected void method_967557a0_FWm(pjB pjB2, float f) {
        float f2 = 0.9375f;
        if (pjB2.method_ae128dba_bzF() < 0) {
            f2 = (float)((double)f2 * 0.5);
            this.field_2092ab_Dne = 0.25f;
        } else {
            this.field_2092ab_Dne = 0.5f;
        }
        GL11.glScalef(f2, f2, f2);
    }
}

