package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
final class stM
implements DOt {
    @Override
    public String method_2c0e7e17_Dne(int n) {
        double d = (double)n / 100.0;
        double d2 = d / 1000.0;
        return d2 > 0.5 ? RLC.method_da21e0f8_Dne().format(d2) + " km" : (d > 0.5 ? RLC.method_da21e0f8_Dne().format(d) + " m" : n + " cm");
    }

    stM() {
    }
}

