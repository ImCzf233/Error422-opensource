package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.input.Keyboard;

public class PGU
extends qVZ {
    private muh field_37922ac_Dne;
    private qVZ field_203449f6_FWm;
    private qVZ field_37a7e17_Dne;
    private mHN field_3787699_Dne;
    private pee_0 field_36bb77c_Dne;
    private int field_2092ae_Dne;
    private mHN field_20324278_FWm;
    private xxt field_37e2f78_Dne;
    private int field_267cf5_Qnq;
    private int field_2d29f4_aFZ;

    @Override
    public void method_7c6f6039_FWm() {
        Keyboard.enableRepeatEvents(false);
    }

    @Override
    protected void method_16a1040_Dne(char c, int n) {
        this.field_20324278_FWm.method_16a1044_Dne(c, n);
        this.field_3787699_Dne.method_16a1044_Dne(c, n);
        if (c == '\t') {
            if (this.field_20324278_FWm.method_7c6f603d_FWm()) {
                this.field_20324278_FWm.method_117d59bb_FWm(false);
                this.field_3787699_Dne.method_117d59bb_FWm(true);
            } else {
                this.field_20324278_FWm.method_117d59bb_FWm(true);
                this.field_3787699_Dne.method_117d59bb_FWm(false);
            }
        }
        if (c == '\r') {
            this.method_d44b4592_zGp();
        }
        this.field_36bb77c_Dne.field_2092bf_Dne = this.field_20324278_FWm.method_eecad346_Dne() != null && !this.field_20324278_FWm.method_eecad346_Dne().trim().equals("");
    }

    private void method_d44b4592_zGp() {
        mNp mNp2 = new mNp(this.field_493682ed_Dne.field_37d3e5f_Dne);
        try {
            String string = this.field_3787699_Dne.method_eecad346_Dne() != null && !this.field_3787699_Dne.method_eecad346_Dne().trim().equals("") ? this.field_3787699_Dne.method_eecad346_Dne() : "";
            mNp2.method_53cda25e_Dne(this.field_37922ac_Dne.field_2092af_Dne, this.field_20324278_FWm.method_eecad346_Dne(), string, this.field_37e2f78_Dne.field_2092ae_Dne, this.field_37e2f78_Dne.field_21260d_FWm);
            this.field_37922ac_Dne.method_8f501fe4_Dne(this.field_20324278_FWm.method_eecad346_Dne());
            this.field_37922ac_Dne.method_110c4dc3_FWm(this.field_3787699_Dne.method_eecad346_Dne());
            this.field_493682ed_Dne.method_b88fcbd2_Dne(new JFs(this.field_203449f6_FWm, this.field_37922ac_Dne));
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        irb irb2 = irb.method_2310d392_Dne();
        this.method_a98a0660_aFZ();
        this.method_32faf66d_Dne(this.field_3791671_Dne, irb2.method_39193c_Dne("mco.configure.world.edit.title"), this.field_21260d_FWm / 2, 17, 0xFFFFFF);
        this.method_67d6d54c_FWm(this.field_3791671_Dne, irb2.method_39193c_Dne("mco.configure.world.name"), this.field_2092ae_Dne, 43, 0xA0A0A0);
        this.method_67d6d54c_FWm(this.field_3791671_Dne, irb2.method_39193c_Dne("mco.configure.world.description"), this.field_2092ae_Dne, 84, 0xA0A0A0);
        this.field_20324278_FWm.method_907a9d21_Qnq();
        this.field_3787699_Dne.method_907a9d21_Qnq();
        this.field_37e2f78_Dne.method_801d5574_Dne(this, this.field_3791671_Dne);
        super.method_2c2cec86_Dne(n, n2, f);
    }

    @Override
    public void method_7a46289a_Dne() {
        irb irb2 = irb.method_2310d392_Dne();
        this.field_2092ae_Dne = this.field_21260d_FWm / 4;
        this.field_267cf5_Qnq = this.field_21260d_FWm / 4 - 2;
        this.field_2d29f4_aFZ = this.field_21260d_FWm / 2 + 4;
        Keyboard.enableRepeatEvents(true);
        this.field_f27c122c_Dne.clear();
        this.field_36bb77c_Dne = new pee_0(0, this.field_2092ae_Dne, this.field_2e5f1b_bzF / 4 + 120 + 22, this.field_267cf5_Qnq, 20, irb2.method_39193c_Dne("mco.configure.world.buttons.done"));
        this.field_f27c122c_Dne.add(this.field_36bb77c_Dne);
        this.field_f27c122c_Dne.add(new pee_0(1, this.field_2d29f4_aFZ, this.field_2e5f1b_bzF / 4 + 120 + 22, this.field_267cf5_Qnq, 20, irb2.method_39193c_Dne("gui.cancel")));
        this.field_20324278_FWm = new mHN(this.field_3791671_Dne, this.field_2092ae_Dne, 56, 212, 20);
        this.field_20324278_FWm.method_117d59bb_FWm(true);
        this.field_20324278_FWm.method_87b738a3_aFZ(32);
        this.field_20324278_FWm.method_8f501fe4_Dne(this.field_37922ac_Dne.method_d1f1ed87_FWm());
        this.field_3787699_Dne = new mHN(this.field_3791671_Dne, this.field_2092ae_Dne, 96, 212, 20);
        this.field_3787699_Dne.method_87b738a3_aFZ(32);
        this.field_3787699_Dne.method_8f501fe4_Dne(this.field_37922ac_Dne.method_eecad346_Dne());
        this.field_37e2f78_Dne = new xxt(this.field_21260d_FWm, this.field_2e5f1b_bzF, this.field_2092ae_Dne, 122);
        this.field_f27c122c_Dne.addAll(this.field_37e2f78_Dne.field_f27c122c_Dne);
    }

    @Override
    protected void method_81183ff7_Dne(pee_0 pee_02) {
        if (pee_02.field_2092bf_Dne) {
            if (pee_02.field_2d29f4_aFZ == 1) {
                this.field_493682ed_Dne.method_b88fcbd2_Dne(this.field_37a7e17_Dne);
            } else if (pee_02.field_2d29f4_aFZ == 0) {
                this.method_d44b4592_zGp();
            } else if (pee_02.field_2d29f4_aFZ == 2) {
                this.field_493682ed_Dne.method_b88fcbd2_Dne(new MaG(this, this.field_37922ac_Dne));
            } else {
                this.field_37e2f78_Dne.method_81183ff7_Dne(pee_02);
            }
        }
    }

    public PGU(qVZ qVZ2, qVZ qVZ3, muh muh2) {
        this.field_37a7e17_Dne = qVZ2;
        this.field_203449f6_FWm = qVZ3;
        this.field_37922ac_Dne = muh2;
    }

    @Override
    protected void method_2c2cf7c9_Dne(int n, int n2, int n3) {
        super.method_2c2cf7c9_Dne(n, n2, n3);
        this.field_3787699_Dne.method_2c2cf7c9_Dne(n, n2, n3);
        this.field_20324278_FWm.method_2c2cf7c9_Dne(n, n2, n3);
    }

    @Override
    public void method_ae128dc7_bzF() {
        this.field_20324278_FWm.method_7a46289a_Dne();
        this.field_3787699_Dne.method_7a46289a_Dne();
    }
}

