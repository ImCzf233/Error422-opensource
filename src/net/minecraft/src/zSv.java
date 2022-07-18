package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class zSv
extends qVZ {
    private static final ONk[] field_fde0eadc_FWm;
    private static final ONk[] field_83613adb_Dne;
    private final fZI field_3758af7_Dne;
    private int field_2092ae_Dne = 0;
    private String field_569fcf45_Dne;
    private String field_d9a85c6_FWm;
    private final qVZ field_37a7e17_Dne;

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        this.method_a98a0660_aFZ();
        this.method_32faf66d_Dne(this.field_3791671_Dne, this.field_569fcf45_Dne, this.field_21260d_FWm / 2, 20, 0xFFFFFF);
        this.method_32faf66d_Dne(this.field_3791671_Dne, this.field_d9a85c6_FWm, this.field_21260d_FWm / 2, this.field_2092ae_Dne + 7, 0xFFFFFF);
        super.method_2c2cec86_Dne(n, n2, f);
    }

    @Override
    public void method_7a46289a_Dne() {
        irb irb2 = irb.method_2310d392_Dne();
        int n = 0;
        this.field_569fcf45_Dne = irb2.method_39193c_Dne("options.chat.title");
        this.field_d9a85c6_FWm = irb2.method_39193c_Dne("options.multiplayer.title");
        for (ONk oNk : field_83613adb_Dne) {
            if (oNk.method_7a46289e_Dne()) {
                this.field_f27c122c_Dne.add(new bsO(oNk.method_7a46288d_Dne(), this.field_21260d_FWm / 2 - 155 + n % 2 * 160, this.field_2e5f1b_bzF / 6 + 24 * (n >> 1), oNk, this.field_3758af7_Dne.method_95e92505_Dne(oNk), this.field_3758af7_Dne.method_7e2204eb_Dne(oNk)));
            } else {
                this.field_f27c122c_Dne.add(new Cpw(oNk.method_7a46288d_Dne(), this.field_21260d_FWm / 2 - 155 + n % 2 * 160, this.field_2e5f1b_bzF / 6 + 24 * (n >> 1), oNk, this.field_3758af7_Dne.method_95e92505_Dne(oNk)));
            }
            ++n;
        }
        if (n % 2 == 1) {
            ++n;
        }
        this.field_2092ae_Dne = this.field_2e5f1b_bzF / 6 + 24 * (n >> 1);
        n += 2;
        for (ONk oNk : field_fde0eadc_FWm) {
            if (oNk.method_7a46289e_Dne()) {
                this.field_f27c122c_Dne.add(new bsO(oNk.method_7a46288d_Dne(), this.field_21260d_FWm / 2 - 155 + n % 2 * 160, this.field_2e5f1b_bzF / 6 + 24 * (n >> 1), oNk, this.field_3758af7_Dne.method_95e92505_Dne(oNk), this.field_3758af7_Dne.method_7e2204eb_Dne(oNk)));
            } else {
                this.field_f27c122c_Dne.add(new Cpw(oNk.method_7a46288d_Dne(), this.field_21260d_FWm / 2 - 155 + n % 2 * 160, this.field_2e5f1b_bzF / 6 + 24 * (n >> 1), oNk, this.field_3758af7_Dne.method_95e92505_Dne(oNk)));
            }
            ++n;
        }
        this.field_f27c122c_Dne.add(new pee_0(200, this.field_21260d_FWm / 2 - 100, this.field_2e5f1b_bzF / 6 + 168, irb2.method_39193c_Dne("gui.done")));
    }

    @Override
    protected void method_81183ff7_Dne(pee_0 pee_02) {
        if (pee_02.field_2092bf_Dne) {
            if (pee_02.field_2d29f4_aFZ < 100 && pee_02 instanceof Cpw) {
                this.field_3758af7_Dne.method_461f0d68_Dne(((Cpw)pee_02).method_23047bdf_Dne(), 1);
                pee_02.field_569fcf45_Dne = this.field_3758af7_Dne.method_95e92505_Dne(ONk.method_9e6e916e_Dne(pee_02.field_2d29f4_aFZ));
            }
            if (pee_02.field_2d29f4_aFZ == 200) {
                this.field_493682ed_Dne.field_3758af7_Dne.method_7c6f6039_FWm();
                this.field_493682ed_Dne.method_b88fcbd2_Dne(this.field_37a7e17_Dne);
            }
        }
    }

    public zSv(qVZ qVZ2, fZI fZI2) {
        this.field_37a7e17_Dne = qVZ2;
        this.field_3758af7_Dne = fZI2;
    }

    static {
        field_83613adb_Dne = new ONk[]{ONk.field_35ca4e69_ATE, ONk.field_719a034f_Vxn, ONk.field_84fc3358_ceE, ONk.field_7577086d_EyB, ONk.field_d443208_FfS, ONk.field_7ee074b_tgc, ONk.field_24958cdb_AgF, ONk.field_d7315955_yMz, ONk.field_cb472f53_qXo};
        field_fde0eadc_FWm = new ONk[]{ONk.field_dd6a5af8_Fnk};
    }
}

