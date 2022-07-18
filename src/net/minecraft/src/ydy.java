package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class ydy
extends YAD {
    protected void method_a1d8fc52_Dne(VAd vAd, float f) {
        float f2 = ((float)vAd.field_21260d_FWm + (float)(vAd.field_2592c3_One - vAd.field_21260d_FWm) * f) / 20.0f;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        f2 = 1.0f / (f2 * f2 * f2 * f2 * f2 * 2.0f + 1.0f);
        float f3 = (8.0f + f2) / 2.0f;
        float f4 = (8.0f + 1.0f / f2) / 2.0f;
        GL11.glScalef(f4, f3, f4);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
    }

    public ydy() {
        super(new Wsm(), 0.5f);
    }

    @Override
    protected void method_740ba292_Dne(FUH fUH, float f) {
        this.method_a1d8fc52_Dne((VAd)fUH, f);
    }
}

