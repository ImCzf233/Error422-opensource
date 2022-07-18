package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class auk
extends xZE {
    @Override
    public String method_eecad346_Dne() {
        return "save-on";
    }

    @Override
    public int method_7a46288d_Dne() {
        return 4;
    }

    @Override
    public void method_4036a99a_Dne(gnI gnI2, String[] stringArray) {
        jwh_0 jwh_02 = jwh_0.method_2302cf90_Dne();
        for (int i = 0; i < jwh_02.field_836263a8_Dne.length; ++i) {
            if (jwh_02.field_836263a8_Dne[i] == null) continue;
            RAN rAN = jwh_02.field_836263a8_Dne[i];
            rAN.field_388db7_zGp = false;
        }
        auk.method_7424c4e2_Dne(gnI2, "commands.save.enabled", new Object[0]);
    }
}

