package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class XjO
extends Jik {
    @Override
    protected void method_7a46289a_Dne() {
        float f = 0.1f;
        for (int i = 0; i <= 15; ++i) {
            float f2 = 1.0f - (float)i / 15.0f;
            this.field_3f1c586_Dne[i] = (1.0f - f2) / (f2 * 3.0f + 1.0f) * (1.0f - f) + f;
        }
    }

    @Override
    public boolean method_16cca7e_Dne(int n, int n2) {
        return false;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    public float method_16d3386_Dne(long l, float f) {
        return 0.5f;
    }

    @Override
    public boolean method_1e26965d_FWm(int n, int n2) {
        return true;
    }

    @Override
    public void method_7c6f6039_FWm() {
        this.field_37c1c1c_Dne = new yMz(OdI.field_5bba54c_IjH, 1.0f, 0.0f);
        this.field_2092bf_Dne = true;
        this.field_21261e_FWm = true;
        this.field_2092ae_Dne = -1;
    }

    @Override
    public ZfC method_2309d134_Dne() {
        return new aJO(this.field_36c4f18_Dne, this.field_36c4f18_Dne.method_7a46288e_Dne());
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    @Override
    public String method_eecad346_Dne() {
        return "Nether";
    }

    @Override
    public chN method_b9fa6ae2_Dne(float f, float f2) {
        return this.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(0.2f, 0.03f, 0.03f);
    }
}

