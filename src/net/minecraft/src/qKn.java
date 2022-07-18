package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class qKn
extends qVZ {
    @Override
    protected void method_16a1040_Dne(char c, int n) {
    }

    @Override
    protected void method_81183ff7_Dne(pee_0 pee_02) {
        if (pee_02.field_2d29f4_aFZ == 0) {
            this.field_493682ed_Dne.method_b88fcbd2_Dne(new MKS());
        } else if (pee_02.field_2d29f4_aFZ == 1) {
            this.field_493682ed_Dne.method_907a9d21_Qnq();
        }
    }

    @Override
    public void method_7a46289a_Dne() {
        irb irb2 = irb.method_2310d392_Dne();
        this.field_f27c122c_Dne.clear();
        this.field_f27c122c_Dne.add(new Cpw(0, this.field_21260d_FWm / 2 - 155, this.field_2e5f1b_bzF / 4 + 120 + 12, irb2.method_39193c_Dne("gui.toMenu")));
        this.field_f27c122c_Dne.add(new Cpw(1, this.field_21260d_FWm / 2 - 155 + 160, this.field_2e5f1b_bzF / 4 + 120 + 12, irb2.method_39193c_Dne("menu.quit")));
    }

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        this.method_a98a0660_aFZ();
        this.method_32faf66d_Dne(this.field_3791671_Dne, "Out of memory!", this.field_21260d_FWm / 2, this.field_2e5f1b_bzF / 4 - 60 + 20, 0xFFFFFF);
        this.method_67d6d54c_FWm(this.field_3791671_Dne, "Minecraft has run out of memory.", this.field_21260d_FWm / 2 - 140, this.field_2e5f1b_bzF / 4 - 60 + 60 + 0, 0xA0A0A0);
        this.method_67d6d54c_FWm(this.field_3791671_Dne, "This could be caused by a bug in the game or by the", this.field_21260d_FWm / 2 - 140, this.field_2e5f1b_bzF / 4 - 60 + 60 + 18, 0xA0A0A0);
        this.method_67d6d54c_FWm(this.field_3791671_Dne, "Java Virtual Machine not being allocated enough", this.field_21260d_FWm / 2 - 140, this.field_2e5f1b_bzF / 4 - 60 + 60 + 27, 0xA0A0A0);
        this.method_67d6d54c_FWm(this.field_3791671_Dne, "memory. If you are playing in a web browser, try", this.field_21260d_FWm / 2 - 140, this.field_2e5f1b_bzF / 4 - 60 + 60 + 36, 0xA0A0A0);
        this.method_67d6d54c_FWm(this.field_3791671_Dne, "downloading the game and playing it offline.", this.field_21260d_FWm / 2 - 140, this.field_2e5f1b_bzF / 4 - 60 + 60 + 45, 0xA0A0A0);
        this.method_67d6d54c_FWm(this.field_3791671_Dne, "To prevent level corruption, the current game has quit.", this.field_21260d_FWm / 2 - 140, this.field_2e5f1b_bzF / 4 - 60 + 60 + 63, 0xA0A0A0);
        this.method_67d6d54c_FWm(this.field_3791671_Dne, "We've tried to free up enough memory to let you go back to", this.field_21260d_FWm / 2 - 140, this.field_2e5f1b_bzF / 4 - 60 + 60 + 81, 0xA0A0A0);
        this.method_67d6d54c_FWm(this.field_3791671_Dne, "the main menu and back to playing, but this may not have worked.", this.field_21260d_FWm / 2 - 140, this.field_2e5f1b_bzF / 4 - 60 + 60 + 90, 0xA0A0A0);
        this.method_67d6d54c_FWm(this.field_3791671_Dne, "Please restart the game if you see this message again.", this.field_21260d_FWm / 2 - 140, this.field_2e5f1b_bzF / 4 - 60 + 60 + 99, 0xA0A0A0);
        super.method_2c2cec86_Dne(n, n2, f);
    }
}

