package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class ENB
extends YAD {
    private Gor field_75af952f_bzF;

    public ENB(Gor gor, Gor gor2, float f) {
        super(gor, f);
        this.field_75af952f_bzF = gor2;
    }

    protected int method_adefd860_Dne(Tgj tgj, int n, float f) {
        if (tgj.method_998e662d_Vxn()) {
            return 0;
        }
        if (n == 0) {
            this.method_724f763d_Dne(this.field_75af952f_bzF);
            GL11.glEnable(2977);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            return 1;
        }
        if (n == 1) {
            GL11.glDisable(3042);
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        }
        return -1;
    }

    @Override
    protected void method_740ba292_Dne(FUH fUH, float f) {
        this.method_79393a70_Dne((Tgj)fUH, f);
    }

    protected void method_79393a70_Dne(Tgj tgj, float f) {
        float f2 = tgj.method_73aaafb6_ATE();
        float f3 = (tgj.field_2e5f18_bzF + (tgj.field_21260a_FWm - tgj.field_2e5f18_bzF) * f) / (f2 * 0.5f + 1.0f);
        float f4 = 1.0f / (f3 + 1.0f);
        GL11.glScalef(f4 * f2, 1.0f / f4 * f2, f4 * f2);
    }

    @Override
    protected int method_d6a747e_Dne(FUH fUH, int n, float f) {
        return this.method_adefd860_Dne((Tgj)fUH, n, f);
    }
}

