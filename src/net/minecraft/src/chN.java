package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class chN {
    public double field_2092a9_Dne;
    public double field_212608_FWm;
    public double field_2e5f16_bzF;
    public final ziS field_2038a7c7_FWm;
    public static final ziS field_37edbe8_Dne = new ziS(-1, -1);

    public chN method_379af4e7_FWm(chN chN2, double d) {
        double d2 = chN2.field_2092a9_Dne - this.field_2092a9_Dne;
        double d3 = chN2.field_212608_FWm - this.field_212608_FWm;
        double d4 = chN2.field_2e5f16_bzF - this.field_2e5f16_bzF;
        if (d3 * d3 < (double)1.0E-7f) {
            return null;
        }
        double d5 = (d - this.field_212608_FWm) / d3;
        return d5 >= 0.0 && d5 <= 1.0 ? this.field_2038a7c7_FWm.method_e4505d6c_Dne(this.field_2092a9_Dne + d2 * d5, this.field_212608_FWm + d3 * d5, this.field_2e5f16_bzF + d4 * d5) : null;
    }

    public static chN method_e4505d6c_Dne(double d, double d2, double d3) {
        return new chN(field_37edbe8_Dne, d, d2, d3);
    }

    public chN method_2002a7c7_FWm(chN chN2) {
        return this.field_2038a7c7_FWm.method_e4505d6c_Dne(this.field_212608_FWm * chN2.field_2e5f16_bzF - this.field_2e5f16_bzF * chN2.field_212608_FWm, this.field_2e5f16_bzF * chN2.field_2092a9_Dne - this.field_2092a9_Dne * chN2.field_2e5f16_bzF, this.field_2092a9_Dne * chN2.field_212608_FWm - this.field_212608_FWm * chN2.field_2092a9_Dne);
    }

    public chN method_230df162_Dne() {
        double d = geR.method_ce7f4ad4_Dne(this.field_2092a9_Dne * this.field_2092a9_Dne + this.field_212608_FWm * this.field_212608_FWm + this.field_2e5f16_bzF * this.field_2e5f16_bzF);
        return d < 1.0E-4 ? this.field_2038a7c7_FWm.method_e4505d6c_Dne(0.0, 0.0, 0.0) : this.field_2038a7c7_FWm.method_e4505d6c_Dne(this.field_2092a9_Dne / d, this.field_212608_FWm / d, this.field_2e5f16_bzF / d);
    }

    public double method_2be42992_Dne(double d, double d2, double d3) {
        double d4 = d - this.field_2092a9_Dne;
        double d5 = d2 - this.field_212608_FWm;
        double d6 = d3 - this.field_2e5f16_bzF;
        return d4 * d4 + d5 * d5 + d6 * d6;
    }

    public chN method_783f7808_Dne(chN chN2, double d) {
        double d2 = chN2.field_2092a9_Dne - this.field_2092a9_Dne;
        double d3 = chN2.field_212608_FWm - this.field_212608_FWm;
        double d4 = chN2.field_2e5f16_bzF - this.field_2e5f16_bzF;
        if (d2 * d2 < (double)1.0E-7f) {
            return null;
        }
        double d5 = (d - this.field_2092a9_Dne) / d2;
        return d5 >= 0.0 && d5 <= 1.0 ? this.field_2038a7c7_FWm.method_e4505d6c_Dne(this.field_2092a9_Dne + d2 * d5, this.field_212608_FWm + d3 * d5, this.field_2e5f16_bzF + d4 * d5) : null;
    }

    public void method_ce7f5266_Dne(float f) {
        float f2 = geR.method_117d0e97_FWm(f);
        float f3 = geR.method_ce7f5256_Dne(f);
        double d = this.field_2092a9_Dne;
        double d2 = this.field_212608_FWm * (double)f2 + this.field_2e5f16_bzF * (double)f3;
        double d3 = this.field_2e5f16_bzF * (double)f2 - this.field_212608_FWm * (double)f3;
        this.field_2092a9_Dne = d;
        this.field_212608_FWm = d2;
        this.field_2e5f16_bzF = d3;
    }

    public void method_117d0ea7_FWm(float f) {
        float f2 = geR.method_117d0e97_FWm(f);
        float f3 = geR.method_ce7f5256_Dne(f);
        double d = this.field_2092a9_Dne * (double)f2 + this.field_2e5f16_bzF * (double)f3;
        double d2 = this.field_212608_FWm;
        double d3 = this.field_2e5f16_bzF * (double)f2 - this.field_2092a9_Dne * (double)f3;
        this.field_2092a9_Dne = d;
        this.field_212608_FWm = d2;
        this.field_2e5f16_bzF = d3;
    }

    public double method_9398f49f_bzF(chN chN2) {
        double d = chN2.field_2092a9_Dne - this.field_2092a9_Dne;
        double d2 = chN2.field_212608_FWm - this.field_212608_FWm;
        double d3 = chN2.field_2e5f16_bzF - this.field_2e5f16_bzF;
        return d * d + d2 * d2 + d3 * d3;
    }

    protected chN(ziS ziS2, double d, double d2, double d3) {
        if (d == -0.0) {
            d = 0.0;
        }
        if (d2 == -0.0) {
            d2 = 0.0;
        }
        if (d3 == -0.0) {
            d3 = 0.0;
        }
        this.field_2092a9_Dne = d;
        this.field_212608_FWm = d2;
        this.field_2e5f16_bzF = d3;
        this.field_2038a7c7_FWm = ziS2;
    }

    public String toString() {
        return "(" + this.field_2092a9_Dne + ", " + this.field_212608_FWm + ", " + this.field_2e5f16_bzF + ")";
    }

    public double method_7a462888_Dne() {
        return geR.method_ce7f4ad4_Dne(this.field_2092a9_Dne * this.field_2092a9_Dne + this.field_212608_FWm * this.field_212608_FWm + this.field_2e5f16_bzF * this.field_2e5f16_bzF);
    }

    protected chN method_b78624ed_FWm(double d, double d2, double d3) {
        this.field_2092a9_Dne = d;
        this.field_212608_FWm = d2;
        this.field_2e5f16_bzF = d3;
        return this;
    }

    public chN method_4320bc86_Dne(chN chN2) {
        return this.field_2038a7c7_FWm.method_e4505d6c_Dne(chN2.field_2092a9_Dne - this.field_2092a9_Dne, chN2.field_212608_FWm - this.field_212608_FWm, chN2.field_2e5f16_bzF - this.field_2e5f16_bzF);
    }

    public void method_143f92d9_bzF(float f) {
        float f2 = geR.method_117d0e97_FWm(f);
        float f3 = geR.method_ce7f5256_Dne(f);
        double d = this.field_2092a9_Dne * (double)f2 + this.field_212608_FWm * (double)f3;
        double d2 = this.field_212608_FWm * (double)f2 - this.field_2092a9_Dne * (double)f3;
        double d3 = this.field_2e5f16_bzF;
        this.field_2092a9_Dne = d;
        this.field_212608_FWm = d2;
        this.field_2e5f16_bzF = d3;
    }

    public double method_7af7d96d_FWm(chN chN2) {
        double d = chN2.field_2092a9_Dne - this.field_2092a9_Dne;
        double d2 = chN2.field_212608_FWm - this.field_212608_FWm;
        double d3 = chN2.field_2e5f16_bzF - this.field_2e5f16_bzF;
        return geR.method_ce7f4ad4_Dne(d * d + d2 * d2 + d3 * d3);
    }

    public double method_a1a425ac_Dne(chN chN2) {
        return this.field_2092a9_Dne * chN2.field_2092a9_Dne + this.field_212608_FWm * chN2.field_212608_FWm + this.field_2e5f16_bzF * chN2.field_2e5f16_bzF;
    }

    public chN method_c3c508f5_bzF(chN chN2, double d) {
        double d2 = chN2.field_2092a9_Dne - this.field_2092a9_Dne;
        double d3 = chN2.field_212608_FWm - this.field_212608_FWm;
        double d4 = chN2.field_2e5f16_bzF - this.field_2e5f16_bzF;
        if (d4 * d4 < (double)1.0E-7f) {
            return null;
        }
        double d5 = (d - this.field_2e5f16_bzF) / d4;
        return d5 >= 0.0 && d5 <= 1.0 ? this.field_2038a7c7_FWm.method_e4505d6c_Dne(this.field_2092a9_Dne + d2 * d5, this.field_212608_FWm + d3 * d5, this.field_2e5f16_bzF + d4 * d5) : null;
    }

    public chN method_2c4d3b9f_bzF(double d, double d2, double d3) {
        return this.field_2038a7c7_FWm.method_e4505d6c_Dne(this.field_2092a9_Dne + d, this.field_212608_FWm + d2, this.field_2e5f16_bzF + d3);
    }
}

