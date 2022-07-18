package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import org.lwjgl.input.Keyboard;

public class VqU
extends qVZ {
    private boolean field_2e5f2c_bzF = false;
    private final qVZ field_37a7e17_Dne;
    private String field_d9a85c6_FWm;
    private final JFs field_3688a95_Dne;
    private final int field_267cf5_Qnq = 1;
    private final int field_2092ae_Dne = 0;
    private muh field_37922ac_Dne;
    private String field_569fcf45_Dne = "Could not invite the provided name";
    private mHN field_3787699_Dne;

    @Override
    public void method_7a46289a_Dne() {
        irb irb2 = irb.method_2310d392_Dne();
        Keyboard.enableRepeatEvents(true);
        this.field_f27c122c_Dne.clear();
        this.field_f27c122c_Dne.add(new pee_0(0, this.field_21260d_FWm / 2 - 100, this.field_2e5f1b_bzF / 4 + 96 + 12, irb2.method_39193c_Dne("mco.configure.world.buttons.invite")));
        this.field_f27c122c_Dne.add(new pee_0(1, this.field_21260d_FWm / 2 - 100, this.field_2e5f1b_bzF / 4 + 120 + 12, irb2.method_39193c_Dne("gui.cancel")));
        this.field_3787699_Dne = new mHN(this.field_3791671_Dne, this.field_21260d_FWm / 2 - 100, 66, 200, 20);
        this.field_3787699_Dne.method_117d59bb_FWm(true);
    }

    @Override
    public void method_7c6f6039_FWm() {
        Keyboard.enableRepeatEvents(false);
    }

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        irb irb2 = irb.method_2310d392_Dne();
        this.method_a98a0660_aFZ();
        this.method_32faf66d_Dne(this.field_3791671_Dne, irb2.method_39193c_Dne(""), this.field_21260d_FWm / 2, 17, 0xFFFFFF);
        this.method_67d6d54c_FWm(this.field_3791671_Dne, irb2.method_39193c_Dne("mco.configure.world.invite.profile.name"), this.field_21260d_FWm / 2 - 100, 53, 0xA0A0A0);
        if (this.field_2e5f2c_bzF) {
            this.method_32faf66d_Dne(this.field_3791671_Dne, this.field_d9a85c6_FWm, this.field_21260d_FWm / 2, 100, 0xFF0000);
        }
        this.field_3787699_Dne.method_907a9d21_Qnq();
        super.method_2c2cec86_Dne(n, n2, f);
    }

    @Override
    protected void method_81183ff7_Dne(pee_0 pee_02) {
        if (pee_02.field_2092bf_Dne) {
            if (pee_02.field_2d29f4_aFZ == 1) {
                this.field_493682ed_Dne.method_b88fcbd2_Dne(this.field_3688a95_Dne);
            } else if (pee_02.field_2d29f4_aFZ == 0) {
                mNp mNp2 = new mNp(this.field_493682ed_Dne.field_37d3e5f_Dne);
                try {
                    muh muh2 = mNp2.method_bda7b025_Dne(this.field_37922ac_Dne.field_2092af_Dne, this.field_3787699_Dne.method_eecad346_Dne());
                    if (muh2 != null) {
                        this.field_37922ac_Dne.field_f27c122c_Dne = muh2.field_f27c122c_Dne;
                        this.field_493682ed_Dne.method_b88fcbd2_Dne(new JFs(this.field_37a7e17_Dne, this.field_37922ac_Dne));
                    } else {
                        this.method_8f501fe4_Dne(this.field_569fcf45_Dne);
                    }
                }
                catch (lUu lUu2) {
                    this.method_8f501fe4_Dne(lUu2.field_569fcf45_Dne);
                }
                catch (IOException iOException) {
                    this.method_8f501fe4_Dne(this.field_569fcf45_Dne);
                }
            }
        }
    }

    @Override
    public void method_ae128dc7_bzF() {
        this.field_3787699_Dne.method_7a46289a_Dne();
    }

    @Override
    protected void method_16a1040_Dne(char c, int n) {
        this.field_3787699_Dne.method_16a1044_Dne(c, n);
        if (c == '\t') {
            if (this.field_3787699_Dne.method_7c6f603d_FWm()) {
                this.field_3787699_Dne.method_117d59bb_FWm(false);
            } else {
                this.field_3787699_Dne.method_117d59bb_FWm(true);
            }
        }
        if (c == '\r') {
            this.method_81183ff7_Dne((pee_0)this.field_f27c122c_Dne.get(0));
        }
    }

    public VqU(qVZ qVZ2, JFs jFs, muh muh2) {
        this.field_37a7e17_Dne = qVZ2;
        this.field_3688a95_Dne = jFs;
        this.field_37922ac_Dne = muh2;
    }

    private void method_8f501fe4_Dne(String string) {
        this.field_2e5f2c_bzF = true;
        this.field_d9a85c6_FWm = string;
    }

    @Override
    protected void method_2c2cf7c9_Dne(int n, int n2, int n3) {
        super.method_2c2cf7c9_Dne(n, n2, n3);
        this.field_3787699_Dne.method_2c2cf7c9_Dne(n, n2, n3);
    }
}

