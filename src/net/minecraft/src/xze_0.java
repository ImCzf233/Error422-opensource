package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.input.Keyboard;

/*
 * Renamed from XZe
 */
public class xze_0
extends qVZ {
    private mHN field_3787699_Dne;
    private final qVZ field_37a7e17_Dne;
    private final etB field_3757759_Dne;

    @Override
    public void method_7c6f6039_FWm() {
        Keyboard.enableRepeatEvents(false);
        this.field_493682ed_Dne.field_3758af7_Dne.field_d9a85c6_FWm = this.field_3787699_Dne.method_eecad346_Dne();
        this.field_493682ed_Dne.field_3758af7_Dne.method_7c6f6039_FWm();
    }

    public xze_0(qVZ qVZ2, etB etB2) {
        this.field_37a7e17_Dne = qVZ2;
        this.field_3757759_Dne = etB2;
    }

    @Override
    public void method_ae128dc7_bzF() {
        this.field_3787699_Dne.method_7a46289a_Dne();
    }

    @Override
    public void method_7a46289a_Dne() {
        irb irb2 = irb.method_2310d392_Dne();
        Keyboard.enableRepeatEvents(true);
        this.field_f27c122c_Dne.clear();
        this.field_f27c122c_Dne.add(new pee_0(0, this.field_21260d_FWm / 2 - 100, this.field_2e5f1b_bzF / 4 + 96 + 12, irb2.method_39193c_Dne("selectServer.select")));
        this.field_f27c122c_Dne.add(new pee_0(1, this.field_21260d_FWm / 2 - 100, this.field_2e5f1b_bzF / 4 + 120 + 12, irb2.method_39193c_Dne("gui.cancel")));
        this.field_3787699_Dne = new mHN(this.field_3791671_Dne, this.field_21260d_FWm / 2 - 100, 116, 200, 20);
        this.field_3787699_Dne.method_87b738a3_aFZ(128);
        this.field_3787699_Dne.method_117d59bb_FWm(true);
        this.field_3787699_Dne.method_8f501fe4_Dne(this.field_493682ed_Dne.field_3758af7_Dne.field_d9a85c6_FWm);
        ((pee_0)this.field_f27c122c_Dne.get((int)0)).field_2092bf_Dne = this.field_3787699_Dne.method_eecad346_Dne().length() > 0 && this.field_3787699_Dne.method_eecad346_Dne().split(":").length > 0;
    }

    @Override
    protected void method_2c2cf7c9_Dne(int n, int n2, int n3) {
        super.method_2c2cf7c9_Dne(n, n2, n3);
        this.field_3787699_Dne.method_2c2cf7c9_Dne(n, n2, n3);
    }

    @Override
    protected void method_16a1040_Dne(char c, int n) {
        if (this.field_3787699_Dne.method_16a1044_Dne(c, n)) {
            ((pee_0)this.field_f27c122c_Dne.get((int)0)).field_2092bf_Dne = this.field_3787699_Dne.method_eecad346_Dne().length() > 0 && this.field_3787699_Dne.method_eecad346_Dne().split(":").length > 0;
        } else if (n == 28) {
            this.method_81183ff7_Dne((pee_0)this.field_f27c122c_Dne.get(0));
        }
    }

    @Override
    protected void method_81183ff7_Dne(pee_0 pee_02) {
        if (pee_02.field_2092bf_Dne) {
            if (pee_02.field_2d29f4_aFZ == 1) {
                this.field_37a7e17_Dne.method_17484c9_Dne(false, 0);
            } else if (pee_02.field_2d29f4_aFZ == 0) {
                this.field_3757759_Dne.field_d9a85c6_FWm = this.field_3787699_Dne.method_eecad346_Dne();
                this.field_37a7e17_Dne.method_17484c9_Dne(true, 0);
            }
        }
    }

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        irb irb2 = irb.method_2310d392_Dne();
        this.method_a98a0660_aFZ();
        this.method_32faf66d_Dne(this.field_3791671_Dne, irb2.method_39193c_Dne("selectServer.direct"), this.field_21260d_FWm / 2, this.field_2e5f1b_bzF / 4 - 60 + 20, 0xFFFFFF);
        this.method_67d6d54c_FWm(this.field_3791671_Dne, irb2.method_39193c_Dne("addServer.enterIp"), this.field_21260d_FWm / 2 - 100, 100, 0xA0A0A0);
        this.field_3787699_Dne.method_907a9d21_Qnq();
        super.method_2c2cec86_Dne(n, n2, f);
    }
}

