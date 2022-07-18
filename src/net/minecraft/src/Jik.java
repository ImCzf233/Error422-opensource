package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public abstract class Jik {
    public boolean field_2092bf_Dne = false;
    public String field_569fcf45_Dne;
    public Qnq field_36c4f18_Dne;
    public float[] field_3f1c586_Dne = new float[16];
    private float[] field_4039e07_FWm = new float[4];
    public kGO field_3778a39_Dne;
    public tgc field_37c1c1c_Dne;
    public int field_2092ae_Dne = 0;
    public boolean field_21261e_FWm = false;

    public int method_7a46288d_Dne() {
        return this.field_3778a39_Dne == kGO.field_20315618_FWm ? 4 : 64;
    }

    public ZfC method_2309d134_Dne() {
        return this.field_3778a39_Dne == kGO.field_20315618_FWm ? new sly(this.field_36c4f18_Dne, this.field_36c4f18_Dne.method_7a46288e_Dne(), this.field_36c4f18_Dne.method_231798c9_Dne().method_ae128dcb_bzF(), this.field_569fcf45_Dne) : new XwR(this.field_36c4f18_Dne, this.field_36c4f18_Dne.method_7a46288e_Dne(), this.field_36c4f18_Dne.method_231798c9_Dne().method_ae128dcb_bzF());
    }

    public boolean method_907a9d25_Qnq() {
        return this.field_3778a39_Dne != kGO.field_20315618_FWm && !this.field_21261e_FWm;
    }

    public boolean method_7a46289e_Dne() {
        return true;
    }

    public float[] method_2c00e207_Dne(float f, float f2) {
        float f3;
        float f4 = 0.4f;
        float f5 = geR.method_117d0e97_FWm(f * (float)Math.PI * 2.0f) - 0.0f;
        if (f5 >= (f3 = -0.0f) - f4 && f5 <= f3 + f4) {
            float f6 = (f5 - f3) / f4 * 0.5f + 0.5f;
            float f7 = 1.0f - (1.0f - geR.method_ce7f5256_Dne(f6 * (float)Math.PI)) * 0.99f;
            f7 *= f7;
            this.field_4039e07_FWm[0] = f6 * 0.3f + 0.7f;
            this.field_4039e07_FWm[1] = f6 * f6 * 0.7f + 0.2f;
            this.field_4039e07_FWm[2] = f6 * f6 * 0.0f + 0.2f;
            this.field_4039e07_FWm[3] = f7;
            return this.field_4039e07_FWm;
        }
        return null;
    }

    public boolean method_7c6f603d_FWm() {
        return true;
    }

    public double method_7a462888_Dne() {
        return this.field_3778a39_Dne == kGO.field_20315618_FWm ? 1.0 : 0.03125;
    }

    public boolean method_1e26965d_FWm(int n, int n2) {
        return false;
    }

    public boolean method_16cca7e_Dne(int n, int n2) {
        int n3 = this.field_36c4f18_Dne.method_16cca6d_Dne(n, n2);
        return n3 == zKP.field_36ff555_Dne.field_21260d_FWm;
    }

    public chN method_b9fa6ae2_Dne(float f, float f2) {
        float f3 = geR.method_117d0e97_FWm(f * (float)Math.PI * 2.0f) * 2.0f + 0.5f;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        float f4 = 0.7529412f;
        float f5 = 0.84705883f;
        float f6 = 1.0f;
        return this.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(f4 *= f3 * 0.94f + 0.06f, f5 *= f3 * 0.94f + 0.06f, f6 *= f3 * 0.91f + 0.09f);
    }

    public static Jik method_9e6cb0ee_Dne(int n) {
        return n == -1 ? new XjO() : (n == 0 ? new lMz() : (n == 1 ? new TKg() : null));
    }

    public boolean method_ae128dcb_bzF() {
        return true;
    }

    public abstract String method_eecad346_Dne();

    public float method_16d3386_Dne(long l, float f) {
        int n = (int)(l % 24000L);
        float f2 = ((float)n + f) / 24000.0f - 0.25f;
        if (f2 < 0.0f) {
            f2 += 1.0f;
        }
        if (f2 > 1.0f) {
            f2 -= 1.0f;
        }
        float f3 = f2;
        f2 = 1.0f - (float)((Math.cos((double)f2 * Math.PI) + 1.0) / 2.0);
        f2 = f3 + (f2 - f3) / 3.0f;
        return f2;
    }

    public final void method_83516093_Dne(Qnq qnq) {
        this.field_36c4f18_Dne = qnq;
        this.field_3778a39_Dne = qnq.method_231798c9_Dne().method_23111898_Dne();
        this.field_569fcf45_Dne = qnq.method_231798c9_Dne().method_d1f1ed87_FWm();
        this.method_7c6f6039_FWm();
        this.method_7a46289a_Dne();
    }

    public float method_7a46288a_Dne() {
        return 128.0f;
    }

    protected void method_7a46289a_Dne() {
        float f = 0.0f;
        for (int i = 0; i <= 15; ++i) {
            float f2 = 1.0f - (float)i / 15.0f;
            this.field_3f1c586_Dne[i] = (1.0f - f2) / (f2 * 3.0f + 1.0f) * (1.0f - f) + f;
        }
    }

    public int method_ce7f615d_Dne(long l) {
        return (int)(l / 24000L) % 8;
    }

    protected void method_7c6f6039_FWm() {
        if (this.field_36c4f18_Dne.method_231798c9_Dne().method_23111898_Dne() == kGO.field_20315618_FWm) {
            lDk lDk2 = lDk.method_285ac762_Dne(this.field_36c4f18_Dne.method_231798c9_Dne().method_d1f1ed87_FWm());
            this.field_37c1c1c_Dne = new yMz(OdI.field_83618953_Dne[lDk2.method_7a46288d_Dne()], 0.5f, 0.5f);
        } else {
            this.field_37c1c1c_Dne = new tgc(this.field_36c4f18_Dne);
        }
    }

    public iSh method_23105fed_Dne() {
        return null;
    }
}

