package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class fZp
extends qVZ {
    private Object[] field_322705c_Dne;
    private String field_569fcf45_Dne;
    private final qVZ field_37a7e17_Dne;
    private List field_6a0474ed_FWm;
    private String field_d9a85c6_FWm;

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        this.method_a98a0660_aFZ();
        this.method_32faf66d_Dne(this.field_3791671_Dne, this.field_569fcf45_Dne, this.field_21260d_FWm / 2, this.field_2e5f1b_bzF / 2 - 50, 0xAAAAAA);
        int n3 = this.field_2e5f1b_bzF / 2 - 30;
        if (this.field_6a0474ed_FWm != null) {
            for (Object obj : this.field_6a0474ed_FWm) {String string = (String) obj;
                this.method_32faf66d_Dne(this.field_3791671_Dne, string, this.field_21260d_FWm / 2, n3, 0xFFFFFF);
                n3 += this.field_3791671_Dne.field_2092ae_Dne;
            }
        }
        super.method_2c2cec86_Dne(n, n2, f);
    }

    @Override
    protected void method_16a1040_Dne(char c, int n) {
    }

    public fZp(qVZ qVZ2, String string, String string2, Object ... objectArray) {
        irb irb2 = irb.method_2310d392_Dne();
        this.field_37a7e17_Dne = qVZ2;
        this.field_569fcf45_Dne = irb2.method_39193c_Dne(string);
        this.field_d9a85c6_FWm = string2;
        this.field_322705c_Dne = objectArray;
    }

    @Override
    protected void method_81183ff7_Dne(pee_0 pee_02) {
        if (pee_02.field_2d29f4_aFZ == 0) {
            this.field_493682ed_Dne.method_b88fcbd2_Dne(this.field_37a7e17_Dne);
        }
    }

    @Override
    public void method_7a46289a_Dne() {
        irb irb2 = irb.method_2310d392_Dne();
        this.field_f27c122c_Dne.clear();
        this.field_f27c122c_Dne.add(new pee_0(0, this.field_21260d_FWm / 2 - 100, this.field_2e5f1b_bzF / 4 + 120 + 12, irb2.method_39193c_Dne("gui.toMenu")));
        this.field_6a0474ed_FWm = this.field_322705c_Dne != null ? this.field_3791671_Dne.method_c46270c8_Dne(irb2.method_98148f73_Dne(this.field_d9a85c6_FWm, this.field_322705c_Dne), this.field_21260d_FWm - 50) : this.field_3791671_Dne.method_c46270c8_Dne(irb2.method_39193c_Dne(this.field_d9a85c6_FWm), this.field_21260d_FWm - 50);
    }
}

