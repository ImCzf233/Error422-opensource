package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class Nde
extends qVZ
implements TaY {
    private int field_2092ae_Dne = 0;
    private String field_d9a85c6_FWm = "";
    private boolean field_2e5f2c_bzF;
    private String field_569fcf45_Dne = "";

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        if (this.field_2e5f2c_bzF) {
            this.field_493682ed_Dne.method_b88fcbd2_Dne(null);
        } else {
            this.method_a98a0660_aFZ();
            this.method_32faf66d_Dne(this.field_3791671_Dne, this.field_569fcf45_Dne, this.field_21260d_FWm / 2, 70, 0xFFFFFF);
            this.method_32faf66d_Dne(this.field_3791671_Dne, this.field_d9a85c6_FWm + " " + this.field_2092ae_Dne + "%", this.field_21260d_FWm / 2, 90, 0xFFFFFF);
            super.method_2c2cec86_Dne(n, n2, f);
        }
    }

    @Override
    public void method_8f501fe4_Dne(String string) {
        this.field_569fcf45_Dne = string;
        this.method_a9a920ab_Qnq("Working...");
    }

    @Override
    public void method_5acf91a_d_() {
        this.field_2e5f2c_bzF = true;
    }

    @Override
    public void method_a9a920ab_Qnq(String string) {
        this.field_d9a85c6_FWm = string;
        this.method_ce7f5da9_Dne(0);
    }

    @Override
    public void method_ce7f5da9_Dne(int n) {
        this.field_2092ae_Dne = n;
    }

    @Override
    public void method_110c4dc3_FWm(String string) {
        this.method_8f501fe4_Dne(string);
    }
}

