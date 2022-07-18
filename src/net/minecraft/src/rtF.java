package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.client.Minecraft;

class rtF
extends qVZ {
    final String field_569fcf45_Dne;
    final fzy field_37608e7_Dne;

    rtF(fzy fzy2, String string) {
        this.field_37608e7_Dne = fzy2;
        this.field_569fcf45_Dne = string;
    }

    @Override
    public void method_17484c9_Dne(boolean bl, int n) {
        this.field_493682ed_Dne = Minecraft.method_81a5f12e_Dne();
        if (this.field_493682ed_Dne.method_230f05b8_Dne() != null) {
            this.field_493682ed_Dne.method_230f05b8_Dne().method_ce7f9d7a_Dne(bl);
            GNm.method_7f053055_FWm(this.field_493682ed_Dne.method_230f05b8_Dne());
        }
        if (bl) {
            this.field_493682ed_Dne.field_373a352_Dne.method_8f501fe4_Dne(this.field_569fcf45_Dne);
        }
        this.field_493682ed_Dne.method_b88fcbd2_Dne(null);
    }
}

