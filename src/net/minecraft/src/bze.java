package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class bze
extends qVZ {
    private int field_267cf5_Qnq = 0;
    private int field_2092ae_Dne = 0;

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        this.method_a98a0660_aFZ();
        this.method_32faf66d_Dne(this.field_3791671_Dne, "Game menu", this.field_21260d_FWm / 2, 40, 0xFFFFFF);
        super.method_2c2cec86_Dne(n, n2, f);
    }

    @Override
    public void method_ae128dc7_bzF() {
        super.method_ae128dc7_bzF();
        ++this.field_267cf5_Qnq;
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_2092ae_Dne = 0;
        this.field_f27c122c_Dne.clear();
        int n = -16;
        this.field_f27c122c_Dne.add(new pee_0(1, this.field_21260d_FWm / 2 - 100, this.field_2e5f1b_bzF / 4 + 120 + n, KGL.method_39193c_Dne("menu.returnToMenu")));
        if (!this.field_493682ed_Dne.method_d44b4596_zGp()) {
            ((pee_0)this.field_f27c122c_Dne.get((int)0)).field_569fcf45_Dne = KGL.method_39193c_Dne("menu.disconnect");
        }
        this.field_f27c122c_Dne.add(new pee_0(4, this.field_21260d_FWm / 2 - 100, this.field_2e5f1b_bzF / 4 + 24 + n, KGL.method_39193c_Dne("menu.returnToGame")));
        this.field_f27c122c_Dne.add(new pee_0(0, this.field_21260d_FWm / 2 - 100, this.field_2e5f1b_bzF / 4 + 96 + n, 98, 20, KGL.method_39193c_Dne("menu.options")));
        pee_0 pee_02 = new pee_0(7, this.field_21260d_FWm / 2 + 2, this.field_2e5f1b_bzF / 4 + 96 + n, 98, 20, "HostException", false);
        this.field_f27c122c_Dne.add(pee_02);
        this.field_f27c122c_Dne.add(new pee_0(5, this.field_21260d_FWm / 2 - 100, this.field_2e5f1b_bzF / 4 + 48 + n, 98, 20, KGL.method_39193c_Dne("gui.achievements")));
        this.field_f27c122c_Dne.add(new pee_0(6, this.field_21260d_FWm / 2 + 2, this.field_2e5f1b_bzF / 4 + 48 + n, 98, 20, KGL.method_39193c_Dne("gui.stats")));
    }

    @Override
    protected void method_81183ff7_Dne(pee_0 pee_02) {
        switch (pee_02.field_2d29f4_aFZ) {
            case 0: {
                this.field_493682ed_Dne.method_b88fcbd2_Dne(new uqy(this, this.field_493682ed_Dne.field_3758af7_Dne));
                break;
            }
            case 1: {
                pee_02.field_2092bf_Dne = false;
                this.field_493682ed_Dne.field_3673fc1_Dne.method_df3461c5_Dne(trP.field_712fc289_aFZ, 1);
                this.field_493682ed_Dne.field_36ebf36_Dne.method_8288d6ee_IjH();
                this.field_493682ed_Dne.method_8c784131_Dne(null);
                this.field_493682ed_Dne.method_b88fcbd2_Dne(new MKS());
            }
            default: {
                break;
            }
            case 4: {
                this.field_493682ed_Dne.method_b88fcbd2_Dne(null);
                this.field_493682ed_Dne.method_a98a0660_aFZ();
                this.field_493682ed_Dne.field_3788296_Dne.method_d44b4592_zGp();
                break;
            }
            case 5: {
                this.field_493682ed_Dne.method_b88fcbd2_Dne(new apb(this.field_493682ed_Dne.field_3673fc1_Dne));
                break;
            }
            case 6: {
                this.field_493682ed_Dne.method_b88fcbd2_Dne(new ZyA(this, this.field_493682ed_Dne.field_3673fc1_Dne));
                break;
            }
            case 7: {
                this.field_493682ed_Dne.method_b88fcbd2_Dne(new VCO(this));
            }
        }
    }
}

