package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class jNM
extends xZE {
    @Override
    public void method_4036a99a_Dne(gnI gnI2, String[] stringArray) {
        jwh_0 jwh_02 = jwh_0.method_2302cf90_Dne();
        for (int i = 0; i < jwh_02.field_836263a8_Dne.length; ++i) {
            if (jwh_02.field_836263a8_Dne[i] == null) continue;
            RAN rAN = jwh_02.field_836263a8_Dne[i];
            rAN.field_388db7_zGp = true;
        }
        jNM.method_7424c4e2_Dne(gnI2, "commands.save.disabled", new Object[0]);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 4;
    }

    @Override
    public String method_eecad346_Dne() {
        return "save-off";
    }
}

