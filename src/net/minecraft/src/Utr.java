package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class Utr
extends qVZ {
    private int field_2092ae_Dne = -1;
    private GBu field_3671eb2_Dne;
    private Cpw field_365fa22_Dne;
    private final fZI field_3758af7_Dne;
    protected qVZ field_37a7e17_Dne;

    @Override
    public void method_ae128dc7_bzF() {
        super.method_ae128dc7_bzF();
        --this.field_2092ae_Dne;
    }

    @Override
    public void method_7a46289a_Dne() {
        irb irb2 = irb.method_2310d392_Dne();
        this.field_365fa22_Dne = new Cpw(6, this.field_21260d_FWm / 2 - 75, this.field_2e5f1b_bzF - 38, irb2.method_39193c_Dne("gui.done"));
        this.field_f27c122c_Dne.add(this.field_365fa22_Dne);
        this.field_3671eb2_Dne = new GBu(this);
        this.field_3671eb2_Dne.method_b6186b2b_Dne(this.field_f27c122c_Dne, 7, 8);
    }

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        this.field_3671eb2_Dne.method_2c2cec86_Dne(n, n2, f);
        if (this.field_2092ae_Dne <= 0) {
            this.field_493682ed_Dne.field_373a352_Dne.method_7c6f6039_FWm();
            this.field_2092ae_Dne += 20;
        }
        irb irb2 = irb.method_2310d392_Dne();
        this.method_32faf66d_Dne(this.field_3791671_Dne, irb2.method_39193c_Dne("options.language"), this.field_21260d_FWm / 2, 16, 0xFFFFFF);
        this.method_32faf66d_Dne(this.field_3791671_Dne, "(" + irb2.method_39193c_Dne("options.languageWarning") + ")", this.field_21260d_FWm / 2, this.field_2e5f1b_bzF - 56, 0x808080);
        super.method_2c2cec86_Dne(n, n2, f);
    }

    static Cpw method_75eda75b_Dne(Utr utr) {
        return utr.field_365fa22_Dne;
    }

    public Utr(qVZ qVZ2, fZI fZI2) {
        this.field_37a7e17_Dne = qVZ2;
        this.field_3758af7_Dne = fZI2;
    }

    static fZI method_75fd3830_Dne(Utr utr) {
        return utr.field_3758af7_Dne;
    }

    @Override
    protected void method_81183ff7_Dne(pee_0 pee_02) {
        if (pee_02.field_2092bf_Dne) {
            switch (pee_02.field_2d29f4_aFZ) {
                case 5: {
                    break;
                }
                case 6: {
                    this.field_493682ed_Dne.method_b88fcbd2_Dne(this.field_37a7e17_Dne);
                    break;
                }
                default: {
                    this.field_3671eb2_Dne.method_81183ff7_Dne(pee_02);
                }
            }
        }
    }
}

