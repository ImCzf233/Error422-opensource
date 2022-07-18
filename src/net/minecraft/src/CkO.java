package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.input.Keyboard;

public class CkO
extends qVZ {
    private mHN field_3787699_Dne;
    private qVZ field_37a7e17_Dne;
    private final String field_569fcf45_Dne;

    @Override
    public void method_7c6f6039_FWm() {
        Keyboard.enableRepeatEvents(false);
    }

    @Override
    public void method_ae128dc7_bzF() {
        this.field_3787699_Dne.method_7a46289a_Dne();
    }

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        irb irb2 = irb.method_2310d392_Dne();
        this.method_a98a0660_aFZ();
        this.method_32faf66d_Dne(this.field_3791671_Dne, irb2.method_39193c_Dne("selectWorld.renameTitle"), this.field_21260d_FWm / 2, this.field_2e5f1b_bzF / 4 - 60 + 20, 0xFFFFFF);
        this.method_67d6d54c_FWm(this.field_3791671_Dne, irb2.method_39193c_Dne("selectWorld.enterName"), this.field_21260d_FWm / 2 - 100, 47, 0xA0A0A0);
        this.field_3787699_Dne.method_907a9d21_Qnq();
        super.method_2c2cec86_Dne(n, n2, f);
    }

    @Override
    public void method_7a46289a_Dne() {
        irb irb2 = irb.method_2310d392_Dne();
        Keyboard.enableRepeatEvents(true);
        this.field_f27c122c_Dne.clear();
        this.field_f27c122c_Dne.add(new pee_0(0, this.field_21260d_FWm / 2 - 100, this.field_2e5f1b_bzF / 4 + 96 + 12, irb2.method_39193c_Dne("selectWorld.renameButton")));
        this.field_f27c122c_Dne.add(new pee_0(1, this.field_21260d_FWm / 2 - 100, this.field_2e5f1b_bzF / 4 + 120 + 12, irb2.method_39193c_Dne("gui.cancel")));
        YiY yiY = this.field_493682ed_Dne.method_23096ac2_Dne();
        xoY xoY2 = yiY.method_2860db13_Dne(this.field_569fcf45_Dne);
        String string = xoY2.method_eecad346_Dne();
        this.field_3787699_Dne = new mHN(this.field_3791671_Dne, this.field_21260d_FWm / 2 - 100, 60, 200, 20);
        this.field_3787699_Dne.method_117d59bb_FWm(true);
        this.field_3787699_Dne.method_8f501fe4_Dne(string);
    }

    public CkO(qVZ qVZ2, String string) {
        this.field_37a7e17_Dne = qVZ2;
        this.field_569fcf45_Dne = string;
    }

    @Override
    protected void method_81183ff7_Dne(pee_0 pee_02) {
        if (pee_02.field_2092bf_Dne) {
            if (pee_02.field_2d29f4_aFZ == 1) {
                this.field_493682ed_Dne.method_b88fcbd2_Dne(this.field_37a7e17_Dne);
            } else if (pee_02.field_2d29f4_aFZ == 0) {
                YiY yiY = this.field_493682ed_Dne.method_23096ac2_Dne();
                yiY.method_abaa98ae_Dne(this.field_569fcf45_Dne, this.field_3787699_Dne.method_eecad346_Dne().trim());
                this.field_493682ed_Dne.method_b88fcbd2_Dne(this.field_37a7e17_Dne);
            }
        }
    }

    @Override
    protected void method_16a1040_Dne(char c, int n) {
        this.field_3787699_Dne.method_16a1044_Dne(c, n);
        boolean bl = ((pee_0)this.field_f27c122c_Dne.get((int)0)).field_2092bf_Dne = this.field_3787699_Dne.method_eecad346_Dne().trim().length() > 0;
        if (c == '\r') {
            this.method_81183ff7_Dne((pee_0)this.field_f27c122c_Dne.get(0));
        }
    }

    @Override
    protected void method_2c2cf7c9_Dne(int n, int n2, int n3) {
        super.method_2c2cf7c9_Dne(n, n2, n3);
        this.field_3787699_Dne.method_2c2cf7c9_Dne(n, n2, n3);
    }
}

