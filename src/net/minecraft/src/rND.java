package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.client.Minecraft;

public class rND
extends qVZ {
    private fzy field_37608e7_Dne;
    private final qVZ field_37a7e17_Dne;
    private boolean field_2e5f2c_bzF = false;

    @Override
    public void method_7a46289a_Dne() {
        irb irb2 = irb.method_2310d392_Dne();
        this.field_f27c122c_Dne.clear();
        this.field_f27c122c_Dne.add(new pee_0(0, this.field_21260d_FWm / 2 - 100, this.field_2e5f1b_bzF / 4 + 120 + 12, irb2.method_39193c_Dne("gui.cancel")));
    }

    public rND(qVZ qVZ2, Minecraft minecraft, String string, int n) {
        this.field_493682ed_Dne = minecraft;
        this.field_37a7e17_Dne = qVZ2;
        minecraft.method_8c784131_Dne(null);
        this.method_5ab44f9f_Dne(string, n);
    }

    static boolean method_b9c9e843_Dne(rND rND2) {
        return rND2.field_2e5f2c_bzF;
    }

    static Minecraft method_4e0e79f0_Qnq(rND rND2) {
        return rND2.field_493682ed_Dne;
    }

    static Minecraft method_f7aa6faf_aFZ(rND rND2) {
        return rND2.field_493682ed_Dne;
    }

    static Minecraft method_d8837ce9_Dne(rND rND2) {
        return rND2.field_493682ed_Dne;
    }

    @Override
    protected void method_81183ff7_Dne(pee_0 pee_02) {
        if (pee_02.field_2d29f4_aFZ == 0) {
            this.field_2e5f2c_bzF = true;
            if (this.field_37608e7_Dne != null) {
                this.field_37608e7_Dne.method_ae128dc7_bzF();
            }
            this.field_493682ed_Dne.method_b88fcbd2_Dne(this.field_37a7e17_Dne);
        }
    }

    static qVZ method_75b5719b_Dne(rND rND2) {
        return rND2.field_37a7e17_Dne;
    }

    private void method_5ab44f9f_Dne(String string, int n) {
        this.field_493682ed_Dne.method_230e0120_Dne().method_8f501fe4_Dne("Connecting to " + string + ", " + n);
        new kpW(this, string, n).start();
    }

    static Minecraft method_fdd99108_FWm(rND rND2) {
        return rND2.field_493682ed_Dne;
    }

    @Override
    public void method_ae128dc7_bzF() {
        if (this.field_37608e7_Dne != null) {
            this.field_37608e7_Dne.method_7c6f6039_FWm();
        }
    }

    @Override
    protected void method_16a1040_Dne(char c, int n) {
    }

    static Minecraft method_c1418f96_bzF(rND rND2) {
        return rND2.field_493682ed_Dne;
    }

    public rND(qVZ qVZ2, Minecraft minecraft, etB etB2) {
        this.field_493682ed_Dne = minecraft;
        this.field_37a7e17_Dne = qVZ2;
        Qyv qyv = Qyv.method_284f49a7_Dne(etB2.field_d9a85c6_FWm);
        minecraft.method_8c784131_Dne(null);
        minecraft.method_a5b17c94_Dne(etB2);
        this.method_5ab44f9f_Dne(qyv.method_eecad346_Dne(), qyv.method_7a46288d_Dne());
    }

    static fzy method_75b0fc6b_Dne(rND rND2) {
        return rND2.field_37608e7_Dne;
    }

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        this.method_a98a0660_aFZ();
        irb irb2 = irb.method_2310d392_Dne();
        if (this.field_37608e7_Dne == null) {
            this.method_32faf66d_Dne(this.field_3791671_Dne, irb2.method_39193c_Dne("connect.connecting"), this.field_21260d_FWm / 2, this.field_2e5f1b_bzF / 2 - 50, 0xFFFFFF);
            this.method_32faf66d_Dne(this.field_3791671_Dne, "", this.field_21260d_FWm / 2, this.field_2e5f1b_bzF / 2 - 10, 0xFFFFFF);
        } else {
            this.method_32faf66d_Dne(this.field_3791671_Dne, irb2.method_39193c_Dne("connect.authorizing"), this.field_21260d_FWm / 2, this.field_2e5f1b_bzF / 2 - 50, 0xFFFFFF);
            this.method_32faf66d_Dne(this.field_3791671_Dne, this.field_37608e7_Dne.field_569fcf45_Dne, this.field_21260d_FWm / 2, this.field_2e5f1b_bzF / 2 - 10, 0xFFFFFF);
        }
        super.method_2c2cec86_Dne(n, n2, f);
    }

    static fzy method_c23a1749_Dne(rND rND2, fzy fzy2) {
        rND2.field_37608e7_Dne = fzy2;
        return rND2.field_37608e7_Dne;
    }
}

