package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.client.Minecraft;

public class Ayv
implements WGf {
    final Minecraft field_493682ed_Dne;

    public Ayv(Minecraft minecraft) {
        this.field_493682ed_Dne = minecraft;
    }

    @Override
    public String method_39193c_Dne(String string) {
        try {
            return String.format(string, fZI.method_e45ed204_bzF(this.field_493682ed_Dne.field_3758af7_Dne.field_f0ae5e96_zGp.field_2092ae_Dne));
        }
        catch (Exception exception) {
            return "Error: " + exception.getLocalizedMessage();
        }
    }
}

