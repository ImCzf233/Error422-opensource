package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class YGW
extends uOw {
    public int field_2092ae_Dne;
    public long field_2092af_Dne;

    public static YGW method_28522d2c_Dne(String string) {
        YGW yGW = new YGW();
        try {
            bab bab2 = new tjH().method_2856a772_Dne(string);
            yGW.field_2092af_Dne = Long.parseLong(bab2.method_1d4d0948_FWm("startDate"));
            yGW.field_2092ae_Dne = Integer.parseInt(bab2.method_1d4d0948_FWm("daysLeft"));
        }
        catch (pPp pPp2) {
        }
        catch (IllegalArgumentException illegalArgumentException) {
            // empty catch block
        }
        return yGW;
    }
}

