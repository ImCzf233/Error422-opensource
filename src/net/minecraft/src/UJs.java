package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class UJs
extends YAD {
    protected int method_1dab89f9_Dne(Pvd pvd, int n, float f) {
        if (n == 0 && !pvd.method_86921671_LVR()) {
            this.method_8f501fe4_Dne("/mob/sheep_fur.png");
            float f2 = 1.0f;
            int n2 = pvd.method_c5287a51_qLR();
            GL11.glColor3f(f2 * Pvd.field_7a46ee0b_Dne[n2][0], f2 * Pvd.field_7a46ee0b_Dne[n2][1], f2 * Pvd.field_7a46ee0b_Dne[n2][2]);
            return 1;
        }
        return -1;
    }

    @Override
    protected int method_d6a747e_Dne(FUH fUH, int n, float f) {
        return this.method_1dab89f9_Dne((Pvd)fUH, n, f);
    }

    public UJs(Gor gor, Gor gor2, float f) {
        super(gor, f);
        this.method_724f763d_Dne(gor2);
    }
}

