package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class IlF
extends xZE {
    @Override
    public boolean method_a8c9cf69_Dne(gnI gnI2) {
        return jwh_0.method_2302cf90_Dne().method_9feec6c6_Zpi() || super.method_a8c9cf69_Dne(gnI2);
    }

    @Override
    public void method_4036a99a_Dne(gnI gnI2, String[] stringArray) {
        Qnq qnq = gnI2 instanceof FiG ? ((FiG)gnI2).field_36c4f18_Dne : jwh_0.method_2302cf90_Dne().method_9e6fba3b_Dne(0);
        gnI2.method_8f501fe4_Dne("Seed: " + qnq.method_7a46288e_Dne());
    }

    @Override
    public String method_eecad346_Dne() {
        return "seed";
    }

    @Override
    public int method_7a46288d_Dne() {
        return 2;
    }
}

