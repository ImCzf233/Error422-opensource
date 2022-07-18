package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public class MaG
extends qVZ {
    private mHN field_3787699_Dne;
    private final int field_2092ae_Dne = 1;
    private qVZ field_37a7e17_Dne;
    private pee_0 field_36bb77c_Dne;
    private final int field_267cf5_Qnq = 2;
    private muh field_37922ac_Dne;

    @Override
    protected void method_2c2cf7c9_Dne(int n, int n2, int n3) {
        super.method_2c2cf7c9_Dne(n, n2, n3);
        this.field_3787699_Dne.method_2c2cf7c9_Dne(n, n2, n3);
    }

    static qVZ method_5fcfdbd0_Dne(MaG maG) {
        return maG.field_37a7e17_Dne;
    }

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        irb irb2 = irb.method_2310d392_Dne();
        this.method_a98a0660_aFZ();
        this.method_32faf66d_Dne(this.field_3791671_Dne, irb2.method_39193c_Dne("mco.reset.world.title"), this.field_21260d_FWm / 2, 17, 0xFFFFFF);
        this.method_32faf66d_Dne(this.field_3791671_Dne, irb2.method_39193c_Dne("mco.reset.world.warning"), this.field_21260d_FWm / 2, 66, 0xFF0000);
        this.method_67d6d54c_FWm(this.field_3791671_Dne, irb2.method_39193c_Dne("mco.reset.world.seed"), this.field_21260d_FWm / 2 - 100, 96, 0xA0A0A0);
        this.field_3787699_Dne.method_907a9d21_Qnq();
        super.method_2c2cec86_Dne(n, n2, f);
    }

    @Override
    public void method_ae128dc7_bzF() {
        this.field_3787699_Dne.method_7a46289a_Dne();
    }

    public MaG(qVZ qVZ2, muh muh2) {
        this.field_37a7e17_Dne = qVZ2;
        this.field_37922ac_Dne = muh2;
    }

    static Minecraft method_d67d5994_Dne(MaG maG) {
        return maG.field_493682ed_Dne;
    }

    @Override
    public void method_7a46289a_Dne() {
        irb irb2 = irb.method_2310d392_Dne();
        Keyboard.enableRepeatEvents(true);
        this.field_f27c122c_Dne.clear();
        this.field_36bb77c_Dne = new pee_0(1, this.field_21260d_FWm / 2 - 100, this.field_2e5f1b_bzF / 4 + 96 + 12, irb2.method_39193c_Dne("mco.configure.world.buttons.reset"));
        this.field_f27c122c_Dne.add(this.field_36bb77c_Dne);
        this.field_f27c122c_Dne.add(new pee_0(2, this.field_21260d_FWm / 2 - 100, this.field_2e5f1b_bzF / 4 + 120 + 12, irb2.method_39193c_Dne("gui.cancel")));
        this.field_3787699_Dne = new mHN(this.field_3791671_Dne, this.field_21260d_FWm / 2 - 100, 109, 200, 20);
        this.field_3787699_Dne.method_117d59bb_FWm(true);
        this.field_3787699_Dne.method_87b738a3_aFZ(32);
        this.field_3787699_Dne.method_8f501fe4_Dne("");
    }

    @Override
    public void method_7c6f6039_FWm() {
        Keyboard.enableRepeatEvents(false);
    }

    @Override
    protected void method_16a1040_Dne(char c, int n) {
        this.field_3787699_Dne.method_16a1044_Dne(c, n);
        if (c == '\r') {
            this.method_81183ff7_Dne(this.field_36bb77c_Dne);
        }
    }

    @Override
    protected void method_81183ff7_Dne(pee_0 pee_02) {
        if (pee_02.field_2092bf_Dne) {
            if (pee_02.field_2d29f4_aFZ == 2) {
                this.field_493682ed_Dne.method_b88fcbd2_Dne(this.field_37a7e17_Dne);
            } else if (pee_02.field_2d29f4_aFZ == 1) {
                Gon gon = new Gon(this, this.field_37922ac_Dne.field_2092af_Dne, this.field_3787699_Dne.method_eecad346_Dne());
                blc blc2 = new blc(this.field_493682ed_Dne, this.field_37a7e17_Dne, gon);
                blc2.method_d44b4592_zGp();
                this.field_493682ed_Dne.method_b88fcbd2_Dne(blc2);
            }
        }
    }
}

