package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class rWl
extends xZE {
    private static final String[] field_f5e54dca_Dne = new String[]{"options.difficulty.peaceful", "options.difficulty.easy", "options.difficulty.normal", "options.difficulty.hard"};

    @Override
    public void method_4036a99a_Dne(gnI gnI2, String[] stringArray) {
        if (stringArray.length <= 0) {
            throw new fxw_0("commands.difficulty.usage", new Object[0]);
        }
        int n = this.method_d491c9e2_Dne(gnI2, stringArray[0]);
        jwh_0.method_2302cf90_Dne().method_117d19ea_FWm(n);
        String string = KGL.method_39193c_Dne(field_f5e54dca_Dne[n]);
        rWl.method_7424c4e2_Dne(gnI2, "commands.difficulty.success", string);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 2;
    }

    @Override
    public String method_aef63bdb_Dne(gnI gnI2) {
        return gnI2.method_98148f73_Dne("commands.difficulty.usage", new Object[0]);
    }

    protected int method_d491c9e2_Dne(gnI gnI2, String string) {
        return !string.equalsIgnoreCase("peaceful") && !string.equalsIgnoreCase("p") ? (!string.equalsIgnoreCase("easy") && !string.equalsIgnoreCase("e") ? (!string.equalsIgnoreCase("normal") && !string.equalsIgnoreCase("n") ? (!string.equalsIgnoreCase("hard") && !string.equalsIgnoreCase("h") ? rWl.method_f7556a82_Dne(gnI2, string, 0, 3) : 3) : 2) : 1) : 0;
    }

    @Override
    public List method_cac7816d_Dne(gnI gnI2, String[] stringArray) {
        return stringArray.length == 1 ? rWl.method_80180c4d_Dne(stringArray, "peaceful", "easy", "normal", "hard") : null;
    }

    @Override
    public String method_eecad346_Dne() {
        return "difficulty";
    }
}

