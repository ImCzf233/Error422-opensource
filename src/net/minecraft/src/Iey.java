package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class Iey
extends Twy {
    public final WkD field_36ef89c_Dne;
    final Nlm field_36ae9fd_Dne;
    public final String field_569fcf45_Dne;

    public Iey(Nlm nlm, WkD wkD, String string) {
        super(1);
        this.field_36ae9fd_Dne = nlm;
        if (string.equals("Minecart")) {
            if (wkD != null) {
                switch (wkD.method_8f501fd7_Dne("Type")) {
                    case 0: {
                        string = "MinecartRideable";
                        break;
                    }
                    case 1: {
                        string = "MinecartChest";
                        break;
                    }
                    case 2: {
                        string = "MinecartFurnace";
                    }
                }
            } else {
                string = "MinecartRideable";
            }
        }
        this.field_36ef89c_Dne = wkD;
        this.field_569fcf45_Dne = string;
    }

    public Iey(Nlm nlm, WkD wkD) {
        super(wkD.method_8f501fd7_Dne("Weight"));
        this.field_36ae9fd_Dne = nlm;
        WkD wkD2 = wkD.method_2851c945_Dne("Properties");
        String string = wkD.method_39193c_Dne("Type");
        if (string.equals("Minecart")) {
            if (wkD2 != null) {
                switch (wkD2.method_8f501fd7_Dne("Type")) {
                    case 0: {
                        string = "MinecartRideable";
                        break;
                    }
                    case 1: {
                        string = "MinecartChest";
                        break;
                    }
                    case 2: {
                        string = "MinecartFurnace";
                    }
                }
            } else {
                string = "MinecartRideable";
            }
        }
        this.field_36ef89c_Dne = wkD2;
        this.field_569fcf45_Dne = string;
    }

    public WkD method_230886fb_Dne() {
        WkD wkD = new WkD();
        wkD.method_312ec00d_Dne("Properties", this.field_36ef89c_Dne);
        wkD.method_abaa98ae_Dne("Type", this.field_569fcf45_Dne);
        wkD.method_5ab44f9f_Dne("Weight", this.field_2e5f1b_bzF);
        return wkD;
    }
}

