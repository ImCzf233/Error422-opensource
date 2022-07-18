package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ZyT
 */
public class zyt_0
extends xZE {
    @Override
    public void method_4036a99a_Dne(gnI gnI2, String[] stringArray) {
        jwh_0 jwh_02 = jwh_0.method_2302cf90_Dne();
        gnI2.method_8f501fe4_Dne(gnI2.method_98148f73_Dne("commands.save.start", new Object[0]));
        if (jwh_02.method_230ea953_Dne() != null) {
            jwh_02.method_230ea953_Dne().method_7c6f6039_FWm();
        }
        try {
            boolean bl;
            RAN rAN;
            int n;
            for (n = 0; n < jwh_02.field_836263a8_Dne.length; ++n) {
                if (jwh_02.field_836263a8_Dne[n] == null) continue;
                rAN = jwh_02.field_836263a8_Dne[n];
                bl = rAN.field_388db7_zGp;
                rAN.field_388db7_zGp = false;
                rAN.method_5f7a671b_Dne(true, null);
                rAN.field_388db7_zGp = bl;
            }
            if (stringArray.length > 0 && "flush".equals(stringArray[0])) {
                gnI2.method_8f501fe4_Dne(gnI2.method_98148f73_Dne("commands.save.flushStart", new Object[0]));
                for (n = 0; n < jwh_02.field_836263a8_Dne.length; ++n) {
                    if (jwh_02.field_836263a8_Dne[n] == null) continue;
                    rAN = jwh_02.field_836263a8_Dne[n];
                    bl = rAN.field_388db7_zGp;
                    rAN.field_388db7_zGp = false;
                    rAN.method_cc5ef5c0_trS();
                    rAN.field_388db7_zGp = bl;
                }
                gnI2.method_8f501fe4_Dne(gnI2.method_98148f73_Dne("commands.save.flushEnd", new Object[0]));
            }
        }
        catch (div div2) {
            zyt_0.method_7424c4e2_Dne(gnI2, "commands.save.failed", div2.getMessage());
            return;
        }
        zyt_0.method_7424c4e2_Dne(gnI2, "commands.save.success", new Object[0]);
    }

    @Override
    public String method_eecad346_Dne() {
        return "save-all";
    }

    @Override
    public int method_7a46288d_Dne() {
        return 4;
    }
}

