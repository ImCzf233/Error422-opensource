package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class bcj
extends qVZ {
    private fzy field_37608e7_Dne;
    private int field_2092ae_Dne = 0;

    public bcj(fzy fzy2) {
        this.field_37608e7_Dne = fzy2;
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_f27c122c_Dne.clear();
    }

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        this.method_143f9e1c_bzF(0);
        irb irb2 = irb.method_2310d392_Dne();
        this.method_32faf66d_Dne(this.field_3791671_Dne, irb2.method_39193c_Dne("multiplayer.downloadingTerrain"), this.field_21260d_FWm / 2, this.field_2e5f1b_bzF / 2 - 50, 0xFFFFFF);
        super.method_2c2cec86_Dne(n, n2, f);
    }

    @Override
    protected void method_16a1040_Dne(char c, int n) {
    }

    @Override
    public void method_ae128dc7_bzF() {
        ++this.field_2092ae_Dne;
        if (this.field_2092ae_Dne % 20 == 0) {
            this.field_37608e7_Dne.method_5536af4d_FWm(new Phv());
        }
        if (this.field_37608e7_Dne != null) {
            this.field_37608e7_Dne.method_7c6f6039_FWm();
        }
    }
}

