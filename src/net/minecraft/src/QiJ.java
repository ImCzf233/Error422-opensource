package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class QiJ
extends YAD {
    protected float method_698e146e_Dne(Xxe xxe, float f) {
        return xxe.field_228593_IYC + (xxe.field_37e098_xXN - xxe.field_228593_IYC) * f;
    }

    @Override
    public void method_31745cde_Dne(sMa sMa2, double d, double d2, double d3, float f, float f2) {
        this.method_d6bd3ebc_Dne((Xxe)sMa2, d, d2, d3, f, f2);
    }

    protected void method_3e67e4fe_Dne(Xxe xxe, float f, float f2, float f3) {
        float f4 = xxe.field_21260a_FWm + (xxe.field_2092ab_Dne - xxe.field_21260a_FWm) * f3;
        float f5 = xxe.field_267cf2_Qnq + (xxe.field_2e5f18_bzF - xxe.field_267cf2_Qnq) * f3;
        GL11.glTranslatef(0.0f, 0.5f, 0.0f);
        GL11.glRotatef(180.0f - f2, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(f4, 1.0f, 0.0f, 0.0f);
        GL11.glRotatef(f5, 0.0f, 1.0f, 0.0f);
        GL11.glTranslatef(0.0f, -1.2f, 0.0f);
    }

    public QiJ(Gor gor, float f) {
        super(gor, f);
    }

    public void method_d6bd3ebc_Dne(Xxe xxe, double d, double d2, double d3, float f, float f2) {
        super.method_2cdda2d0_Dne(xxe, d, d2, d3, f, f2);
    }

    @Override
    public void method_2cdda2d0_Dne(FUH fUH, double d, double d2, double d3, float f, float f2) {
        this.method_d6bd3ebc_Dne((Xxe)fUH, d, d2, d3, f, f2);
    }

    @Override
    protected void method_9fba3e12_Dne(FUH fUH, float f, float f2, float f3) {
        this.method_3e67e4fe_Dne((Xxe)fUH, f, f2, f3);
    }

    @Override
    protected float method_740ba282_Dne(FUH fUH, float f) {
        return this.method_698e146e_Dne((Xxe)fUH, f);
    }
}

