package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.input.Keyboard;

public class ugH
extends qVZ {
    private mHN field_20324278_FWm;
    private etB field_3757759_Dne;
    private mHN field_3787699_Dne;
    private qVZ field_37a7e17_Dne;

    @Override
    protected void method_81183ff7_Dne(pee_0 pee_02) {
        if (pee_02.field_2092bf_Dne) {
            if (pee_02.field_2d29f4_aFZ == 1) {
                this.field_37a7e17_Dne.method_17484c9_Dne(false, 0);
            } else if (pee_02.field_2d29f4_aFZ == 0) {
                this.field_3757759_Dne.field_569fcf45_Dne = this.field_20324278_FWm.method_eecad346_Dne();
                this.field_3757759_Dne.field_d9a85c6_FWm = this.field_3787699_Dne.method_eecad346_Dne();
                this.field_37a7e17_Dne.method_17484c9_Dne(true, 0);
            } else if (pee_02.field_2d29f4_aFZ == 2) {
                irb irb2 = irb.method_2310d392_Dne();
                this.field_3757759_Dne.method_117d59bb_FWm(!this.field_3757759_Dne.method_ae128dcb_bzF());
                ((pee_0)this.field_f27c122c_Dne.get((int)2)).field_569fcf45_Dne = irb2.method_39193c_Dne("addServer.hideAddress") + ": " + (this.field_3757759_Dne.method_ae128dcb_bzF() ? irb2.method_39193c_Dne("gui.yes") : irb2.method_39193c_Dne("gui.no"));
            }
        }
    }

    @Override
    public void method_ae128dc7_bzF() {
        this.field_20324278_FWm.method_7a46289a_Dne();
        this.field_3787699_Dne.method_7a46289a_Dne();
    }

    @Override
    public void method_7a46289a_Dne() {
        irb irb2 = irb.method_2310d392_Dne();
        Keyboard.enableRepeatEvents(true);
        this.field_f27c122c_Dne.clear();
        this.field_f27c122c_Dne.add(new pee_0(0, this.field_21260d_FWm / 2 - 100, this.field_2e5f1b_bzF / 4 + 96 + 12, irb2.method_39193c_Dne("addServer.add")));
        this.field_f27c122c_Dne.add(new pee_0(1, this.field_21260d_FWm / 2 - 100, this.field_2e5f1b_bzF / 4 + 120 + 12, irb2.method_39193c_Dne("gui.cancel")));
        this.field_f27c122c_Dne.add(new pee_0(2, this.field_21260d_FWm / 2 - 100, 142, irb2.method_39193c_Dne("addServer.hideAddress") + ": " + (this.field_3757759_Dne.method_ae128dcb_bzF() ? irb2.method_39193c_Dne("gui.yes") : irb2.method_39193c_Dne("gui.no"))));
        this.field_20324278_FWm = new mHN(this.field_3791671_Dne, this.field_21260d_FWm / 2 - 100, 66, 200, 20);
        this.field_20324278_FWm.method_117d59bb_FWm(true);
        this.field_20324278_FWm.method_8f501fe4_Dne(this.field_3757759_Dne.field_569fcf45_Dne);
        this.field_3787699_Dne = new mHN(this.field_3791671_Dne, this.field_21260d_FWm / 2 - 100, 106, 200, 20);
        this.field_3787699_Dne.method_87b738a3_aFZ(128);
        this.field_3787699_Dne.method_8f501fe4_Dne(this.field_3757759_Dne.field_d9a85c6_FWm);
        ((pee_0)this.field_f27c122c_Dne.get((int)0)).field_2092bf_Dne = this.field_3787699_Dne.method_eecad346_Dne().length() > 0 && this.field_3787699_Dne.method_eecad346_Dne().split(":").length > 0 && this.field_20324278_FWm.method_eecad346_Dne().length() > 0;
    }

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        irb irb2 = irb.method_2310d392_Dne();
        this.method_a98a0660_aFZ();
        this.method_32faf66d_Dne(this.field_3791671_Dne, irb2.method_39193c_Dne("addServer.title"), this.field_21260d_FWm / 2, 17, 0xFFFFFF);
        this.method_67d6d54c_FWm(this.field_3791671_Dne, irb2.method_39193c_Dne("addServer.enterName"), this.field_21260d_FWm / 2 - 100, 53, 0xA0A0A0);
        this.method_67d6d54c_FWm(this.field_3791671_Dne, irb2.method_39193c_Dne("addServer.enterIp"), this.field_21260d_FWm / 2 - 100, 94, 0xA0A0A0);
        this.field_20324278_FWm.method_907a9d21_Qnq();
        this.field_3787699_Dne.method_907a9d21_Qnq();
        super.method_2c2cec86_Dne(n, n2, f);
    }

    @Override
    public void method_7c6f6039_FWm() {
        Keyboard.enableRepeatEvents(false);
    }

    public ugH(qVZ qVZ2, etB etB2) {
        this.field_37a7e17_Dne = qVZ2;
        this.field_3757759_Dne = etB2;
    }

    @Override
    protected void method_2c2cf7c9_Dne(int n, int n2, int n3) {
        super.method_2c2cf7c9_Dne(n, n2, n3);
        this.field_3787699_Dne.method_2c2cf7c9_Dne(n, n2, n3);
        this.field_20324278_FWm.method_2c2cf7c9_Dne(n, n2, n3);
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
            this.method_81183ff7_Dne((pee_0)this.field_f27c122c_Dne.get(0));
        }
        ((pee_0)this.field_f27c122c_Dne.get((int)0)).field_2092bf_Dne = this.field_3787699_Dne.method_eecad346_Dne().length() > 0 && this.field_3787699_Dne.method_eecad346_Dne().split(":").length > 0 && this.field_20324278_FWm.method_eecad346_Dne().length() > 0;
    }
}

