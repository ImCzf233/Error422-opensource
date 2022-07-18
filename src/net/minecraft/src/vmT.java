package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class vmT
extends SlE {
    private void method_d44b4592_zGp() {
        fzy fzy2 = this.field_493682ed_Dne.field_369f6b6_Dne.field_37608e7_Dne;
        fzy2.method_5536af4d_FWm(new Pkw(this.field_493682ed_Dne.field_369f6b6_Dne, 3));
        if (eCD.method_ce7f5d9c_Dne(100) == 0) {
            qxi_0.field_36b4fb5_Dne.field_28e7fd_Vxn = 0;
        }
    }

    @Override
    protected void method_16a1040_Dne(char c, int n) {
        if (n == 1) {
            this.method_d44b4592_zGp();
        } else if (n == 28) {
            String string = this.field_3787699_Dne.method_eecad346_Dne().trim();
            if (string.length() > 0) {
                this.field_493682ed_Dne.field_369f6b6_Dne.method_110c4dc3_FWm(string);
            }
            this.field_3787699_Dne.method_8f501fe4_Dne("");
            this.field_493682ed_Dne.field_3733694_Dne.method_2312ad69_Dne().method_ae128dc7_bzF();
        } else {
            super.method_16a1040_Dne(c, n);
        }
    }

    @Override
    public void method_7a46289a_Dne() {
        super.method_7a46289a_Dne();
        irb irb2 = irb.method_2310d392_Dne();
        this.field_f27c122c_Dne.add(new pee_0(1, this.field_21260d_FWm / 2 - 100, this.field_2e5f1b_bzF - 40, irb2.method_39193c_Dne("multiplayer.stopSleeping")));
    }

    @Override
    protected void method_81183ff7_Dne(pee_0 pee_02) {
        if (pee_02.field_2d29f4_aFZ == 1) {
            this.method_d44b4592_zGp();
        } else {
            super.method_81183ff7_Dne(pee_02);
        }
    }
}

