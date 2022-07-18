package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class Uyd
extends YAD {
    protected float method_d14908f5_Dne(oEB oEB2, float f) {
        return oEB2.method_9a443a89_XHL();
    }

    public Uyd(Gor gor, Gor gor2, float f) {
        super(gor, f);
        this.method_724f763d_Dne(gor2);
    }

    @Override
    protected float method_740ba282_Dne(FUH fUH, float f) {
        return this.method_d14908f5_Dne((oEB)fUH, f);
    }

    protected int method_57d9dc6b_Dne(oEB oEB2, int n, float f) {
        if (n == 0 && oEB2.method_7c82ec32_FYZ()) {
            float f2 = oEB2.method_ce7f5256_Dne(f) * oEB2.method_143f92c9_bzF(f);
            this.method_8f501fe4_Dne(oEB2.method_6859cdb9_bzF());
            GL11.glColor3f(f2, f2, f2);
            return 1;
        }
        if (n == 1 && oEB2.method_86921671_LVR()) {
            this.method_8f501fe4_Dne("/mob/wolf_collar.png");
            float f3 = 1.0f;
            int n2 = oEB2.method_c5287a51_qLR();
            GL11.glColor3f(f3 * Pvd.field_7a46ee0b_Dne[n2][0], f3 * Pvd.field_7a46ee0b_Dne[n2][1], f3 * Pvd.field_7a46ee0b_Dne[n2][2]);
            return 1;
        }
        return -1;
    }

    @Override
    protected int method_d6a747e_Dne(FUH fUH, int n, float f) {
        return this.method_57d9dc6b_Dne((oEB)fUH, n, f);
    }
}

