package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class sHC
extends qVZ {
    private String field_9e60dbde_Qnq;
    protected int field_2092ae_Dne;
    protected qVZ field_37a7e17_Dne;
    protected String field_d9a85c6_FWm;
    protected String field_c480ca78_bzF;
    protected String field_569fcf45_Dne;

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        this.method_a98a0660_aFZ();
        this.method_32faf66d_Dne(this.field_3791671_Dne, this.field_569fcf45_Dne, this.field_21260d_FWm / 2, 70, 0xFFFFFF);
        this.method_32faf66d_Dne(this.field_3791671_Dne, this.field_9e60dbde_Qnq, this.field_21260d_FWm / 2, 90, 0xFFFFFF);
        super.method_2c2cec86_Dne(n, n2, f);
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_f27c122c_Dne.add(new Cpw(0, this.field_21260d_FWm / 2 - 155, this.field_2e5f1b_bzF / 6 + 96, this.field_d9a85c6_FWm));
        this.field_f27c122c_Dne.add(new Cpw(1, this.field_21260d_FWm / 2 - 155 + 160, this.field_2e5f1b_bzF / 6 + 96, this.field_c480ca78_bzF));
    }

    public sHC(qVZ qVZ2, String string, String string2, int n) {
        this.field_37a7e17_Dne = qVZ2;
        this.field_569fcf45_Dne = string;
        this.field_9e60dbde_Qnq = string2;
        this.field_2092ae_Dne = n;
        irb irb2 = irb.method_2310d392_Dne();
        this.field_d9a85c6_FWm = irb2.method_39193c_Dne("gui.yes");
        this.field_c480ca78_bzF = irb2.method_39193c_Dne("gui.no");
    }

    @Override
    protected void method_81183ff7_Dne(pee_0 pee_02) {
        this.field_37a7e17_Dne.method_17484c9_Dne(pee_02.field_2d29f4_aFZ == 0, this.field_2092ae_Dne);
    }

    public sHC(qVZ qVZ2, String string, String string2, String string3, String string4, int n) {
        this.field_37a7e17_Dne = qVZ2;
        this.field_569fcf45_Dne = string;
        this.field_9e60dbde_Qnq = string2;
        this.field_d9a85c6_FWm = string3;
        this.field_c480ca78_bzF = string4;
        this.field_2092ae_Dne = n;
    }
}

