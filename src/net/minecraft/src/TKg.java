package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class TKg
extends Jik {
    @Override
    public boolean method_1e26965d_FWm(int n, int n2) {
        return true;
    }

    @Override
    public float method_16d3386_Dne(long l, float f) {
        return 0.0f;
    }

    @Override
    public ZfC method_2309d134_Dne() {
        return new Zlx(this.field_36c4f18_Dne, this.field_36c4f18_Dne.method_7a46288e_Dne());
    }

    @Override
    public boolean method_ae128dcb_bzF() {
        return false;
    }

    @Override
    public void method_7c6f6039_FWm() {
        this.field_37c1c1c_Dne = new yMz(OdI.field_74f5ced6_mrb, 0.5f, 0.0f);
        this.field_2092ae_Dne = 1;
        this.field_21261e_FWm = true;
    }

    @Override
    public chN method_b9fa6ae2_Dne(float f, float f2) {
        int n = 0xA080A0;
        float f3 = geR.method_117d0e97_FWm(f * (float)Math.PI * 2.0f) * 2.0f + 0.5f;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        float f4 = (float)(n >> 16 & 0xFF) / 255.0f;
        float f5 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f6 = (float)(n & 0xFF) / 255.0f;
        return this.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(f4 *= f3 * 0.0f + 0.15f, f5 *= f3 * 0.0f + 0.15f, f6 *= f3 * 0.0f + 0.15f);
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    @Override
    public float method_7a46288a_Dne() {
        return 8.0f;
    }

    @Override
    public boolean method_16cca7e_Dne(int n, int n2) {
        int n3 = this.field_36c4f18_Dne.method_16cca6d_Dne(n, n2);
        return n3 == 0 ? false : zKP.field_8374b848_Dne[n3].field_368fd23_Dne.method_ae128dcb_bzF();
    }

    @Override
    public float[] method_2c00e207_Dne(float f, float f2) {
        return null;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 50;
    }

    @Override
    public iSh method_23105fed_Dne() {
        return new iSh(100, 50, 0);
    }

    @Override
    public String method_eecad346_Dne() {
        return "The End";
    }
}

