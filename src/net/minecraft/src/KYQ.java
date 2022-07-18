package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class KYQ
extends YAD {
    private float field_2e5f18_bzF;

    public KYQ(Gor gor, float f, float f2) {
        super(gor, f * f2);
        this.field_2e5f18_bzF = f2;
    }

    @Override
    protected void method_740ba292_Dne(FUH fUH, float f) {
        this.method_7c8bc157_Dne((ZFJ)fUH, f);
    }

    protected void method_7c8bc157_Dne(ZFJ zFJ, float f) {
        GL11.glScalef(this.field_2e5f18_bzF, this.field_2e5f18_bzF, this.field_2e5f18_bzF);
    }
}

