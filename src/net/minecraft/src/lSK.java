package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class lSK
extends sHC {
    private String field_9e60dbde_Qnq;

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        super.method_2c2cec86_Dne(n, n2, f);
        this.method_32faf66d_Dne(this.field_3791671_Dne, this.field_9e60dbde_Qnq, this.field_21260d_FWm / 2, 110, 0xFFFFFF);
    }

    public lSK(qVZ qVZ2, String string, String string2, String string3, int n) {
        super(qVZ2, string, string2, n);
        this.field_9e60dbde_Qnq = string3;
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_f27c122c_Dne.add(new Cpw(0, this.field_21260d_FWm / 2 - 155, this.field_2e5f1b_bzF / 6 + 112, this.field_d9a85c6_FWm));
        this.field_f27c122c_Dne.add(new Cpw(1, this.field_21260d_FWm / 2 - 155 + 160, this.field_2e5f1b_bzF / 6 + 112, this.field_c480ca78_bzF));
    }
}

