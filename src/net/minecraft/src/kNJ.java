package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
final class kNJ
implements DOt {
    kNJ() {
    }

    @Override
    public String method_2c0e7e17_Dne(int n) {
        double d = (double)n / 20.0;
        double d2 = d / 60.0;
        double d3 = d2 / 60.0;
        double d4 = d3 / 24.0;
        double d5 = d4 / 365.0;
        return d5 > 0.5 ? RLC.method_da21e0f8_Dne().format(d5) + " y" : (d4 > 0.5 ? RLC.method_da21e0f8_Dne().format(d4) + " d" : (d3 > 0.5 ? RLC.method_da21e0f8_Dne().format(d3) + " h" : (d2 > 0.5 ? RLC.method_da21e0f8_Dne().format(d2) + " m" : d + " s")));
    }
}

