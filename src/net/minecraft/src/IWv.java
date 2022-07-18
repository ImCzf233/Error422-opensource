package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class IWv
extends xZE {
    @Override
    public int method_7a46288d_Dne() {
        return 4;
    }

    @Override
    public String method_eecad346_Dne() {
        return "publish";
    }

    @Override
    public void method_4036a99a_Dne(gnI gnI2, String[] stringArray) {
        String string = jwh_0.method_2302cf90_Dne().method_9f2c7597_Dne(XHL.field_2028b66f_FWm, false);
        if (string != null) {
            IWv.method_7424c4e2_Dne(gnI2, "commands.publish.started", string);
        } else {
            IWv.method_7424c4e2_Dne(gnI2, "commands.publish.failed", new Object[0]);
        }
    }
}

