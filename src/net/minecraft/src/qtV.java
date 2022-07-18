package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class qtV
extends qVZ {
    private String field_569fcf45_Dne;
    private String field_d9a85c6_FWm;

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        this.method_c6b5263a_Dne(0, 0, this.field_21260d_FWm, this.field_2e5f1b_bzF, -12574688, -11530224);
        this.method_32faf66d_Dne(this.field_3791671_Dne, this.field_569fcf45_Dne, this.field_21260d_FWm / 2, 90, 0xFFFFFF);
        this.method_32faf66d_Dne(this.field_3791671_Dne, this.field_d9a85c6_FWm, this.field_21260d_FWm / 2, 110, 0xFFFFFF);
        super.method_2c2cec86_Dne(n, n2, f);
    }

    @Override
    protected void method_16a1040_Dne(char c, int n) {
    }

    public qtV(String string, String string2) {
        this.field_569fcf45_Dne = string;
        this.field_d9a85c6_FWm = string2;
    }

    @Override
    public void method_7a46289a_Dne() {
        super.method_7a46289a_Dne();
        this.field_f27c122c_Dne.add(new pee_0(0, this.field_21260d_FWm / 2 - 100, 140, KGL.method_39193c_Dne("gui.cancel")));
    }

    @Override
    protected void method_81183ff7_Dne(pee_0 pee_02) {
        this.field_493682ed_Dne.method_b88fcbd2_Dne(null);
    }
}

