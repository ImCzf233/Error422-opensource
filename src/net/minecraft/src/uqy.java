package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class uqy
extends qVZ {
    private final fZI field_3758af7_Dne;
    protected String field_569fcf45_Dne = "Options";
    private static final ONk[] field_83613adb_Dne = new ONk[]{ONk.field_36aed80_Dne, ONk.field_2024b95f_FWm, ONk.field_75b2bb6d_bzF, ONk.field_5e545c47_Qnq, ONk.field_712e71c6_aFZ, ONk.field_6164a1a8_Zpi, ONk.field_76c5e99_gnI};
    private final qVZ field_37a7e17_Dne;

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        this.method_a98a0660_aFZ();
        this.method_32faf66d_Dne(this.field_3791671_Dne, this.field_569fcf45_Dne, this.field_21260d_FWm / 2, 15, 0xFFFFFF);
        super.method_2c2cec86_Dne(n, n2, f);
    }

    @Override
    protected void method_81183ff7_Dne(pee_0 pee_02) {
        if (pee_02.field_2092bf_Dne) {
            if (pee_02.field_2d29f4_aFZ < 100 && pee_02 instanceof Cpw) {
                this.field_3758af7_Dne.method_461f0d68_Dne(((Cpw)pee_02).method_23047bdf_Dne(), 1);
                pee_02.field_569fcf45_Dne = this.field_3758af7_Dne.method_95e92505_Dne(ONk.method_9e6e916e_Dne(pee_02.field_2d29f4_aFZ));
            }
            if (pee_02.field_2d29f4_aFZ == 101) {
                this.field_493682ed_Dne.field_3758af7_Dne.method_7c6f6039_FWm();
                this.field_493682ed_Dne.method_b88fcbd2_Dne(new qik(this, this.field_3758af7_Dne));
            }
            if (pee_02.field_2d29f4_aFZ == 100) {
                this.field_493682ed_Dne.field_3758af7_Dne.method_7c6f6039_FWm();
                this.field_493682ed_Dne.method_b88fcbd2_Dne(new dnF(this, this.field_3758af7_Dne));
            }
            if (pee_02.field_2d29f4_aFZ == 102) {
                this.field_493682ed_Dne.field_3758af7_Dne.method_7c6f6039_FWm();
                this.field_493682ed_Dne.method_b88fcbd2_Dne(new Utr(this, this.field_3758af7_Dne));
            }
            if (pee_02.field_2d29f4_aFZ == 103) {
                this.field_493682ed_Dne.field_3758af7_Dne.method_7c6f6039_FWm();
                this.field_493682ed_Dne.method_b88fcbd2_Dne(new zSv(this, this.field_3758af7_Dne));
            }
            if (pee_02.field_2d29f4_aFZ == 104) {
                this.field_493682ed_Dne.field_3758af7_Dne.method_7c6f6039_FWm();
                this.field_493682ed_Dne.method_b88fcbd2_Dne(new RKa(this, this.field_3758af7_Dne));
            }
            if (pee_02.field_2d29f4_aFZ == 200) {
                this.field_493682ed_Dne.field_3758af7_Dne.method_7c6f6039_FWm();
                this.field_493682ed_Dne.method_b88fcbd2_Dne(this.field_37a7e17_Dne);
            }
            if (pee_02.field_2d29f4_aFZ == 105) {
                this.field_493682ed_Dne.field_3758af7_Dne.method_7c6f6039_FWm();
                this.field_493682ed_Dne.method_b88fcbd2_Dne(new SbO(this, this.field_3758af7_Dne));
            }
        }
    }

    public uqy(qVZ qVZ2, fZI fZI2) {
        this.field_37a7e17_Dne = qVZ2;
        this.field_3758af7_Dne = fZI2;
    }

    @Override
    public void method_7a46289a_Dne() {
        irb irb2 = irb.method_2310d392_Dne();
        int n = 0;
        this.field_569fcf45_Dne = irb2.method_39193c_Dne("options.title");
        for (ONk oNk : field_83613adb_Dne) {
            if (oNk.method_7a46289e_Dne()) {
                this.field_f27c122c_Dne.add(new bsO(oNk.method_7a46288d_Dne(), this.field_21260d_FWm / 2 - 155 + n % 2 * 160, this.field_2e5f1b_bzF / 6 - 12 + 24 * (n >> 1), oNk, this.field_3758af7_Dne.method_95e92505_Dne(oNk), this.field_3758af7_Dne.method_7e2204eb_Dne(oNk)));
            } else {
                Cpw cpw = new Cpw(oNk.method_7a46288d_Dne(), this.field_21260d_FWm / 2 - 155 + n % 2 * 160, this.field_2e5f1b_bzF / 6 - 12 + 24 * (n >> 1), oNk, this.field_3758af7_Dne.method_95e92505_Dne(oNk));
                if (oNk == ONk.field_6164a1a8_Zpi && this.field_493682ed_Dne.field_36ebf36_Dne != null && this.field_493682ed_Dne.field_36ebf36_Dne.method_231798c9_Dne().method_907a9d25_Qnq()) {
                    cpw.field_2092bf_Dne = false;
                    cpw.field_569fcf45_Dne = KGL.method_39193c_Dne("options.difficulty") + ": " + KGL.method_39193c_Dne("options.difficulty.hardcore");
                }
                this.field_f27c122c_Dne.add(cpw);
            }
            ++n;
        }
        this.field_f27c122c_Dne.add(new pee_0(101, this.field_21260d_FWm / 2 - 152, this.field_2e5f1b_bzF / 6 + 96 - 6, 150, 20, irb2.method_39193c_Dne("options.video")));
        this.field_f27c122c_Dne.add(new pee_0(100, this.field_21260d_FWm / 2 + 2, this.field_2e5f1b_bzF / 6 + 96 - 6, 150, 20, irb2.method_39193c_Dne("options.controls")));
        this.field_f27c122c_Dne.add(new pee_0(102, this.field_21260d_FWm / 2 - 152, this.field_2e5f1b_bzF / 6 + 120 - 6, 150, 20, "Unidentified", false));
        this.field_f27c122c_Dne.add(new pee_0(103, this.field_21260d_FWm / 2 + 2, this.field_2e5f1b_bzF / 6 + 120 - 6, 150, 20, "Unidentified", false));
        this.field_f27c122c_Dne.add(new pee_0(105, this.field_21260d_FWm / 2 - 152, this.field_2e5f1b_bzF / 6 + 144 - 6, 150, 20, "Unidentified", false));
        this.field_f27c122c_Dne.add(new pee_0(104, this.field_21260d_FWm / 2 + 2, this.field_2e5f1b_bzF / 6 + 144 - 6, 150, 20, irb2.method_39193c_Dne("options.snooper.view")));
        this.field_f27c122c_Dne.add(new pee_0(200, this.field_21260d_FWm / 2 - 100, this.field_2e5f1b_bzF / 6 + 168, irb2.method_39193c_Dne("gui.done")));
    }
}

