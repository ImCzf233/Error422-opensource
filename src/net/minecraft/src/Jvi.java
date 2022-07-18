package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class Jvi
extends RNA {
    @Override
    protected void method_740ba292_Dne(FUH fUH, float f) {
        this.method_3e97272_Dne((yxx_0)fUH, f);
    }

    @Override
    protected void method_7c6f6039_FWm() {
        GL11.glTranslatef(0.09375f, 0.1875f, 0.0f);
    }

    protected void method_3e97272_Dne(yxx_0 yxx_02, float f) {
        if (yxx_02.method_ae128dba_bzF() == 1) {
            GL11.glScalef(1.2f, 1.2f, 1.2f);
        }
    }

    public Jvi() {
        super(new bfK(), 0.5f);
    }
}

