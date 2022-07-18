package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class qik
extends qVZ {
    private fZI field_3758af7_Dne;
    private boolean field_2e5f2c_bzF = false;
    private static ONk[] field_83613adb_Dne = new ONk[]{ONk.field_a21b1ee8_kGO, ONk.field_161e16a9_DyG, ONk.field_aefb95fb_udO, ONk.field_1c2c7bbf_XHL, ONk.field_5bb56d4_IjH, ONk.field_1413c3aa_div, ONk.field_ab23b236_ooe, ONk.field_74f5805e_mrb, ONk.field_f09cac78_zGp, ONk.field_32850926_trS, ONk.field_1effde44_qLR, ONk.field_3951d927_OdI, ONk.field_8e7449ac_vSL, ONk.field_9f2c83e1_RPx};
    private qVZ field_37a7e17_Dne;
    protected String field_569fcf45_Dne = "Video Settings";

    @Override
    protected void method_81183ff7_Dne(pee_0 pee_02) {
        if (pee_02.field_2092bf_Dne) {
            int n = this.field_3758af7_Dne.field_22c602_IjH;
            if (pee_02.field_2d29f4_aFZ < 100 && pee_02 instanceof Cpw) {
                this.field_3758af7_Dne.method_461f0d68_Dne(((Cpw)pee_02).method_23047bdf_Dne(), 1);
                pee_02.field_569fcf45_Dne = this.field_3758af7_Dne.method_95e92505_Dne(ONk.method_9e6e916e_Dne(pee_02.field_2d29f4_aFZ));
            }
            if (pee_02.field_2d29f4_aFZ == 200) {
                this.field_493682ed_Dne.field_3758af7_Dne.method_7c6f6039_FWm();
                this.field_493682ed_Dne.method_b88fcbd2_Dne(this.field_37a7e17_Dne);
            }
            if (this.field_3758af7_Dne.field_22c602_IjH != n) {
                IJm iJm = new IJm(this.field_493682ed_Dne.field_3758af7_Dne, this.field_493682ed_Dne.field_2092ae_Dne, this.field_493682ed_Dne.field_21260d_FWm);
                int n2 = iJm.method_7a46288d_Dne();
                int n3 = iJm.method_7c6f602c_FWm();
                this.method_f68b2f6c_Dne(this.field_493682ed_Dne, n2, n3);
            }
        }
    }

    public qik(qVZ qVZ2, fZI fZI2) {
        this.field_37a7e17_Dne = qVZ2;
        this.field_3758af7_Dne = fZI2;
    }

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        this.method_a98a0660_aFZ();
        this.method_32faf66d_Dne(this.field_3791671_Dne, this.field_569fcf45_Dne, this.field_21260d_FWm / 2, this.field_2e5f2c_bzF ? 20 : 5, 0xFFFFFF);
        if (!this.field_2e5f2c_bzF && this.field_3758af7_Dne.field_2092ae_Dne == 0) {
            this.method_32faf66d_Dne(this.field_3791671_Dne, KGL.method_39193c_Dne("options.farWarning1"), this.field_21260d_FWm / 2, this.field_2e5f1b_bzF / 6 + 144 + 1, 0xAF0000);
            this.method_32faf66d_Dne(this.field_3791671_Dne, KGL.method_39193c_Dne("options.farWarning2"), this.field_21260d_FWm / 2, this.field_2e5f1b_bzF / 6 + 144 + 13, 0xAF0000);
        }
        super.method_2c2cec86_Dne(n, n2, f);
    }

    @Override
    public void method_7a46289a_Dne() {
        irb var1 = irb.method_2310d392_Dne();
        this.field_569fcf45_Dne = var1.method_39193c_Dne("options.videoTitle");
        this.field_f27c122c_Dne.clear();
        this.field_f27c122c_Dne.add(new pee_0(200, this.field_21260d_FWm / 2 - 100, this.field_2e5f1b_bzF / 6 + 168, var1.method_39193c_Dne("gui.done")));
        this.field_2e5f2c_bzF = false;
        String[] var2 = new String[]{"sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch"};
        String[] var3 = var2;
        int var4 = var2.length;

        int var5;
        for(var5 = 0; var5 < var4; ++var5) {
            String var6 = var3[var5];
            String var7 = System.getProperty(var6);
            if (var7 != null && var7.contains("64")) {
                this.field_2e5f2c_bzF = true;
                break;
            }
        }

        var5 = 0;
        var4 = this.field_2e5f2c_bzF ? 0 : -15;
        ONk[] var10 = field_83613adb_Dne;
        int var11 = var10.length;

        for(int var8 = 0; var8 < var11; ++var8) {
            ONk var9 = var10[var8];
            if (var9.method_7a46289e_Dne()) {
                this.field_f27c122c_Dne.add(new bsO(var9.method_7a46288d_Dne(), this.field_21260d_FWm / 2 - 155 + var5 % 2 * 160, this.field_2e5f1b_bzF / 7 + var4 + 24 * (var5 >> 1), var9, this.field_3758af7_Dne.method_95e92505_Dne(var9), this.field_3758af7_Dne.method_7e2204eb_Dne(var9)));
            } else {
                this.field_f27c122c_Dne.add(new Cpw(var9.method_7a46288d_Dne(), this.field_21260d_FWm / 2 - 155 + var5 % 2 * 160, this.field_2e5f1b_bzF / 7 + var4 + 24 * (var5 >> 1), var9, this.field_3758af7_Dne.method_95e92505_Dne(var9)));
            }

            ++var5;
        }

    }
}

