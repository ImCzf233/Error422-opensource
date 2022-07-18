package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class alz
extends xZE {
    @Override
    public void method_4036a99a_Dne(gnI gnI2, String[] stringArray) {
        if (stringArray.length != 1) {
            throw new fxw_0("commands.testfor.usage", new Object[0]);
        }
        if (!(gnI2 instanceof FgE)) {
            throw new WoB("commands.testfor.failed", new Object[0]);
        }
        alz.method_4145cce9_Dne(gnI2, stringArray[0]);
    }

    @Override
    public boolean method_cb1fa962_Dne(String[] stringArray, int n) {
        return n == 0;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 2;
    }

    @Override
    public String method_eecad346_Dne() {
        return "testfor";
    }
}

