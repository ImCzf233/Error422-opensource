package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class dnF
extends qVZ {
    private int field_2092ae_Dne = -1;
    private qVZ field_37a7e17_Dne;
    private fZI field_3758af7_Dne;
    protected String field_569fcf45_Dne = "Controls";

    @Override
    public void method_7a46289a_Dne() {
        irb irb2 = irb.method_2310d392_Dne();
        int n = this.method_7a46288d_Dne();
        for (int i = 0; i < this.field_3758af7_Dne.field_8372ecf9_Dne.length; ++i) {
            this.field_f27c122c_Dne.add(new Cpw(i, n + i % 2 * 160, this.field_2e5f1b_bzF / 6 + 24 * (i >> 1), 70, 20, this.field_3758af7_Dne.method_adcaabf6_FWm(i)));
        }
        this.field_f27c122c_Dne.add(new pee_0(200, this.field_21260d_FWm / 2 - 100, this.field_2e5f1b_bzF / 6 + 168, irb2.method_39193c_Dne("gui.done")));
        this.field_569fcf45_Dne = irb2.method_39193c_Dne("controls.title");
    }

    @Override
    protected void method_81183ff7_Dne(pee_0 pee_02) {
        for (int i = 0; i < this.field_3758af7_Dne.field_8372ecf9_Dne.length; ++i) {
            ((pee_0)this.field_f27c122c_Dne.get((int)i)).field_569fcf45_Dne = this.field_3758af7_Dne.method_adcaabf6_FWm(i);
        }
        if (pee_02.field_2d29f4_aFZ == 200) {
            this.field_493682ed_Dne.method_b88fcbd2_Dne(this.field_37a7e17_Dne);
        } else {
            this.field_2092ae_Dne = pee_02.field_2d29f4_aFZ;
            pee_02.field_569fcf45_Dne = "> " + this.field_3758af7_Dne.method_adcaabf6_FWm(pee_02.field_2d29f4_aFZ) + " <";
        }
    }

    private int method_7a46288d_Dne() {
        return this.field_21260d_FWm / 2 - 155;
    }

    public dnF(qVZ qVZ2, fZI fZI2) {
        this.field_37a7e17_Dne = qVZ2;
        this.field_3758af7_Dne = fZI2;
    }

    @Override
    protected void method_16a1040_Dne(char c, int n) {
        if (this.field_2092ae_Dne >= 0) {
            this.field_3758af7_Dne.method_16cca7a_Dne(this.field_2092ae_Dne, n);
            ((pee_0)this.field_f27c122c_Dne.get((int)this.field_2092ae_Dne)).field_569fcf45_Dne = this.field_3758af7_Dne.method_adcaabf6_FWm(this.field_2092ae_Dne);
            this.field_2092ae_Dne = -1;
            ulE.method_7c6f6039_FWm();
        } else {
            super.method_16a1040_Dne(c, n);
        }
    }

    @Override
    protected void method_2c2cf7c9_Dne(int n, int n2, int n3) {
        if (this.field_2092ae_Dne >= 0) {
            this.field_3758af7_Dne.method_16cca7a_Dne(this.field_2092ae_Dne, -100 + n3);
            ((pee_0)this.field_f27c122c_Dne.get((int)this.field_2092ae_Dne)).field_569fcf45_Dne = this.field_3758af7_Dne.method_adcaabf6_FWm(this.field_2092ae_Dne);
            this.field_2092ae_Dne = -1;
            ulE.method_7c6f6039_FWm();
        } else {
            super.method_2c2cf7c9_Dne(n, n2, n3);
        }
    }

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        this.method_a98a0660_aFZ();
        this.method_32faf66d_Dne(this.field_3791671_Dne, this.field_569fcf45_Dne, this.field_21260d_FWm / 2, 20, 0xFFFFFF);
        int n3 = this.method_7a46288d_Dne();
        for (int i = 0; i < this.field_3758af7_Dne.field_8372ecf9_Dne.length; ++i) {
            boolean bl = false;
            for (int j = 0; j < this.field_3758af7_Dne.field_8372ecf9_Dne.length; ++j) {
                if (j == i || this.field_3758af7_Dne.field_8372ecf9_Dne[i].field_2092ae_Dne != this.field_3758af7_Dne.field_8372ecf9_Dne[j].field_2092ae_Dne) {
                    continue;
                }
                bl = true;
                break;
            }
            ((pee_0)this.field_f27c122c_Dne.get((int)i)).field_569fcf45_Dne = this.field_2092ae_Dne == i ? "" + (Object)((Object)Dne.field_32808077_trS) + "> " + (Object)((Object)Dne.field_ab1f2987_ooe) + "??? " + (Object)((Object)Dne.field_32808077_trS) + "<" : (bl ? (Object)((Object)Dne.field_a2169639_kGO) + this.field_3758af7_Dne.method_adcaabf6_FWm(i) : this.field_3758af7_Dne.method_adcaabf6_FWm(i));
            this.method_67d6d54c_FWm(this.field_3791671_Dne, this.field_3758af7_Dne.method_2c0e7e17_Dne(i), n3 + i % 2 * 160 + 70 + 6, this.field_2e5f1b_bzF / 6 + 24 * (i >> 1) + 7, -1);
        }
        super.method_2c2cec86_Dne(n, n2, f);
    }
}

