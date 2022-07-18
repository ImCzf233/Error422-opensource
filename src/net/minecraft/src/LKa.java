package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public class LKa
extends qVZ {
    private String field_d9a85c6_FWm;
    private String field_c480ca78_bzF = "You must enter a name!";
    private static int field_267cf5_Qnq;
    private mHN field_3787699_Dne;
    private static int field_2092ae_Dne;
    private mHN field_20324278_FWm;
    private boolean field_2e5f2c_bzF = false;
    private String field_569fcf45_Dne;
    private qVZ field_37a7e17_Dne;

    private boolean method_907a9d25_Qnq() {
        this.field_2e5f2c_bzF = this.field_3787699_Dne.method_eecad346_Dne() == null || this.field_3787699_Dne.method_eecad346_Dne().trim().equals("");
        return !this.field_2e5f2c_bzF;
    }

    static Minecraft method_5cc03ba2_FWm(LKa lKa) {
        return lKa.field_493682ed_Dne;
    }

    public LKa(qVZ qVZ2) {
        this.field_f27c122c_Dne = Collections.synchronizedList(new ArrayList());
        this.field_37a7e17_Dne = qVZ2;
    }

    @Override
    protected void method_2c2cf7c9_Dne(int n, int n2, int n3) {
        super.method_2c2cf7c9_Dne(n, n2, n3);
        this.field_3787699_Dne.method_2c2cf7c9_Dne(n, n2, n3);
        this.field_20324278_FWm.method_2c2cf7c9_Dne(n, n2, n3);
    }

    static Minecraft method_376a2783_Dne(LKa lKa) {
        return lKa.field_493682ed_Dne;
    }

    @Override
    protected void method_81183ff7_Dne(pee_0 pee_02) {
        if (pee_02.field_2092bf_Dne) {
            if (pee_02.field_2d29f4_aFZ == field_267cf5_Qnq) {
                this.field_493682ed_Dne.method_b88fcbd2_Dne(this.field_37a7e17_Dne);
            } else if (pee_02.field_2d29f4_aFZ == field_2092ae_Dne) {
                this.method_d44b4592_zGp();
            }
        }
    }

    @Override
    public void method_7c6f6039_FWm() {
        Keyboard.enableRepeatEvents(false);
    }

    @Override
    public void method_ae128dc7_bzF() {
        this.field_3787699_Dne.method_7a46289a_Dne();
        this.field_569fcf45_Dne = this.field_3787699_Dne.method_eecad346_Dne();
        this.field_20324278_FWm.method_7a46289a_Dne();
        this.field_d9a85c6_FWm = this.field_20324278_FWm.method_eecad346_Dne();
    }

    private void method_d44b4592_zGp() {
        if (this.method_907a9d25_Qnq()) {
            dlo dlo2 = new dlo(this, this.field_3787699_Dne.method_eecad346_Dne(), "Minecraft Realms Server", "NO_LOCATION", this.field_d9a85c6_FWm);
            blc blc2 = new blc(this.field_493682ed_Dne, this.field_37a7e17_Dne, dlo2);
            blc2.method_d44b4592_zGp();
            this.field_493682ed_Dne.method_b88fcbd2_Dne(blc2);
        }
    }

    @Override
    protected void method_16a1040_Dne(char c, int n) {
        this.field_3787699_Dne.method_16a1044_Dne(c, n);
        this.field_20324278_FWm.method_16a1044_Dne(c, n);
        if (c == '\t') {
            this.field_3787699_Dne.method_117d59bb_FWm(!this.field_3787699_Dne.method_7c6f603d_FWm());
            this.field_20324278_FWm.method_117d59bb_FWm(!this.field_20324278_FWm.method_7c6f603d_FWm());
        }
        if (c == '\r') {
            this.method_81183ff7_Dne((pee_0)this.field_f27c122c_Dne.get(0));
        }
    }

    static {
        field_2092ae_Dne = 0;
        field_267cf5_Qnq = 1;
    }

    static qVZ method_3a836f41_Dne(LKa lKa) {
        return lKa.field_37a7e17_Dne;
    }

    @Override
    public void method_7a46289a_Dne() {
        irb irb2 = irb.method_2310d392_Dne();
        Keyboard.enableRepeatEvents(true);
        this.field_f27c122c_Dne.clear();
        this.field_f27c122c_Dne.add(new pee_0(field_2092ae_Dne, this.field_21260d_FWm / 2 - 100, this.field_2e5f1b_bzF / 4 + 120 + 17, 97, 20, irb2.method_39193c_Dne("mco.create.world")));
        this.field_f27c122c_Dne.add(new pee_0(field_267cf5_Qnq, this.field_21260d_FWm / 2 + 5, this.field_2e5f1b_bzF / 4 + 120 + 17, 95, 20, irb2.method_39193c_Dne("gui.cancel")));
        this.field_3787699_Dne = new mHN(this.field_3791671_Dne, this.field_21260d_FWm / 2 - 100, 65, 200, 20);
        this.field_3787699_Dne.method_117d59bb_FWm(true);
        if (this.field_569fcf45_Dne != null) {
            this.field_3787699_Dne.method_8f501fe4_Dne(this.field_569fcf45_Dne);
        }
        this.field_20324278_FWm = new mHN(this.field_3791671_Dne, this.field_21260d_FWm / 2 - 100, 111, 200, 20);
        if (this.field_d9a85c6_FWm != null) {
            this.field_20324278_FWm.method_8f501fe4_Dne(this.field_d9a85c6_FWm);
        }
    }

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        irb irb2 = irb.method_2310d392_Dne();
        this.method_a98a0660_aFZ();
        this.method_32faf66d_Dne(this.field_3791671_Dne, irb2.method_39193c_Dne("mco.selectServer.create"), this.field_21260d_FWm / 2, 11, 0xFFFFFF);
        this.method_67d6d54c_FWm(this.field_3791671_Dne, irb2.method_39193c_Dne("mco.configure.world.name"), this.field_21260d_FWm / 2 - 100, 52, 0xA0A0A0);
        this.method_67d6d54c_FWm(this.field_3791671_Dne, irb2.method_39193c_Dne("mco.configure.world.seed"), this.field_21260d_FWm / 2 - 100, 98, 0xA0A0A0);
        if (this.field_2e5f2c_bzF) {
            this.method_32faf66d_Dne(this.field_3791671_Dne, this.field_c480ca78_bzF, this.field_21260d_FWm / 2, 167, 0xFF0000);
        }
        this.field_3787699_Dne.method_907a9d21_Qnq();
        this.field_20324278_FWm.method_907a9d21_Qnq();
        super.method_2c2cec86_Dne(n, n2, f);
    }
}

