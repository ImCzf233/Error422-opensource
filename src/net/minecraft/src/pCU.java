package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class pCU
extends YAD {
    public void method_77329d60_Dne(kQo kQo2, double d, double d2, double d3, float f, float f2) {
        super.method_2cdda2d0_Dne(kQo2, d, d2, d3, f, f2);
    }

    public pCU(Gor gor, float f) {
        super(gor, f);
    }

    @Override
    public void method_31745cde_Dne(sMa sMa2, double d, double d2, double d3, float f, float f2) {
        this.method_77329d60_Dne((kQo)sMa2, d, d2, d3, f, f2);
    }

    @Override
    public void method_2cdda2d0_Dne(FUH fUH, double d, double d2, double d3, float f, float f2) {
        this.method_77329d60_Dne((kQo)fUH, d, d2, d3, f, f2);
    }

    protected void method_14a46522_Dne(kQo kQo2, float f) {
        super.method_740ba292_Dne(kQo2, f);
        if (kQo2.method_86921671_LVR()) {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
        }
    }

    @Override
    protected void method_740ba292_Dne(FUH fUH, float f) {
        this.method_14a46522_Dne((kQo)fUH, f);
    }
}

