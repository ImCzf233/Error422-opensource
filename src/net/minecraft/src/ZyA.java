package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class ZyA
extends qVZ {
    private static eKj field_374e248_Dne = new eKj();
    protected String field_569fcf45_Dne = "Select world";
    private FkP field_3673fc1_Dne;
    private LAz field_3696167_Dne;
    protected qVZ field_37a7e17_Dne;
    private eiw field_3755479_Dne;
    private kmt field_3781d5a_Dne;
    private LSv field_369a47d_Dne = null;

    private void method_2dee77c_bzF(int n, int n2, int n3) {
        this.method_16cca7a_Dne(n + 1, n2 + 1);
        GL11.glEnable(32826);
        Cit.method_ae128dc7_bzF();
        field_374e248_Dne.method_77c09267_Dne(this.field_3791671_Dne, this.field_493682ed_Dne.field_36d36bf_Dne, new NMq(n3, 1, 0), n + 2, n2 + 2);
        Cit.method_7a46289a_Dne();
        GL11.glDisable(32826);
    }

    static msA method_5ebea4fd_mrb(ZyA zyA) {
        return zyA.field_3791671_Dne;
    }

    @Override
    protected void method_81183ff7_Dne(pee_0 pee_02) {
        if (pee_02.field_2092bf_Dne) {
            if (pee_02.field_2d29f4_aFZ == 0) {
                this.field_493682ed_Dne.method_b88fcbd2_Dne(this.field_37a7e17_Dne);
            } else if (pee_02.field_2d29f4_aFZ == 1) {
                this.field_369a47d_Dne = this.field_3781d5a_Dne;
            } else if (pee_02.field_2d29f4_aFZ == 3) {
                this.field_369a47d_Dne = this.field_3696167_Dne;
            } else if (pee_02.field_2d29f4_aFZ == 2) {
                this.field_369a47d_Dne = this.field_3755479_Dne;
            } else {
                this.field_369a47d_Dne.method_81183ff7_Dne(pee_02);
            }
        }
    }

    static msA method_e23ece95_aFZ(ZyA zyA) {
        return zyA.field_3791671_Dne;
    }

    static msA method_fcf540f4_Qnq(ZyA zyA) {
        return zyA.field_3791671_Dne;
    }

    static Minecraft method_7831f5a2_FWm(ZyA zyA) {
        return zyA.field_493682ed_Dne;
    }

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        this.field_369a47d_Dne.method_2c2cec86_Dne(n, n2, f);
        this.method_32faf66d_Dne(this.field_3791671_Dne, this.field_569fcf45_Dne, this.field_21260d_FWm / 2, 20, 0xFFFFFF);
        super.method_2c2cec86_Dne(n, n2, f);
    }

    static Minecraft method_3b99f430_bzF(ZyA zyA) {
        return zyA.field_493682ed_Dne;
    }

    static void method_63780845_Dne(ZyA zyA, int n, int n2, int n3, int n4, int n5, int n6) {
        zyA.method_c6b5263a_Dne(n, n2, n3, n4, n5, n6);
    }

    static msA method_72194a7c_XHL(ZyA zyA) {
        return zyA.field_3791671_Dne;
    }

    static msA method_7aeaab0e_bzF(ZyA zyA) {
        return zyA.field_3791671_Dne;
    }

    static msA method_73a6bdc7_IjH(ZyA zyA) {
        return zyA.field_3791671_Dne;
    }

    public ZyA(qVZ qVZ2, FkP fkP) {
        this.field_37a7e17_Dne = qVZ2;
        this.field_3673fc1_Dne = fkP;
    }

    private void method_16cca7a_Dne(int n, int n2) {
        this.method_58fe7b07_bzF(n, n2, 0, 0);
    }

    static msA method_9cc87a3_zGp(ZyA zyA) {
        return zyA.field_3791671_Dne;
    }

    static FkP method_3e9ab6eb_Dne(ZyA zyA) {
        return zyA.field_3673fc1_Dne;
    }

    static msA method_ffd97452_DyG(ZyA zyA) {
        return zyA.field_3791671_Dne;
    }

    public void method_d44b4592_zGp() {
        irb irb2 = irb.method_2310d392_Dne();
        this.field_f27c122c_Dne.add(new pee_0(0, this.field_21260d_FWm / 2 + 4, this.field_2e5f1b_bzF - 28, 150, 20, irb2.method_39193c_Dne("gui.done")));
        this.field_f27c122c_Dne.add(new pee_0(1, this.field_21260d_FWm / 2 - 154, this.field_2e5f1b_bzF - 52, 100, 20, irb2.method_39193c_Dne("stat.generalButton")));
        pee_0 pee_02 = new pee_0(2, this.field_21260d_FWm / 2 - 46, this.field_2e5f1b_bzF - 52, 100, 20, irb2.method_39193c_Dne("stat.blocksButton"));
        this.field_f27c122c_Dne.add(pee_02);
        pee_0 pee_03 = new pee_0(3, this.field_21260d_FWm / 2 + 62, this.field_2e5f1b_bzF - 52, 100, 20, irb2.method_39193c_Dne("stat.itemsButton"));
        this.field_f27c122c_Dne.add(pee_03);
        if (this.field_3755479_Dne.method_7a46288d_Dne() == 0) {
            pee_02.field_2092bf_Dne = false;
        }
        if (this.field_3696167_Dne.method_7a46288d_Dne() == 0) {
            pee_03.field_2092bf_Dne = false;
        }
    }

    static Minecraft method_52dbe183_Dne(ZyA zyA) {
        return zyA.field_493682ed_Dne;
    }

    private void method_58fe7b07_bzF(int n, int n2, int n3, int n4) {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/gui/slot.png");
        WAR wAR = WAR.field_36e5ca4_Dne;
        wAR.method_7a46289a_Dne();
        wAR.method_c38c5864_Dne(n + 0, n2 + 18, this.field_21260a_FWm, (float)(n3 + 0) * 0.0078125f, (float)(n4 + 18) * 0.0078125f);
        wAR.method_c38c5864_Dne(n + 18, n2 + 18, this.field_21260a_FWm, (float)(n3 + 18) * 0.0078125f, (float)(n4 + 18) * 0.0078125f);
        wAR.method_c38c5864_Dne(n + 18, n2 + 0, this.field_21260a_FWm, (float)(n3 + 18) * 0.0078125f, (float)(n4 + 0) * 0.0078125f);
        wAR.method_c38c5864_Dne(n + 0, n2 + 0, this.field_21260a_FWm, (float)(n3 + 0) * 0.0078125f, (float)(n4 + 0) * 0.0078125f);
        wAR.method_7a46288d_Dne();
    }

    static void method_5e9d499e_Dne(ZyA zyA, int n, int n2, int n3) {
        zyA.method_2dee77c_bzF(n, n2, n3);
    }

    static void method_8f8c2746_FWm(ZyA zyA, int n, int n2, int n3, int n4, int n5, int n6) {
        zyA.method_c6b5263a_Dne(n, n2, n3, n4, n5, n6);
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_569fcf45_Dne = KGL.method_39193c_Dne("gui.stats");
        this.field_3781d5a_Dne = new kmt(this);
        this.field_3781d5a_Dne.method_b6186b2b_Dne(this.field_f27c122c_Dne, 1, 1);
        this.field_3696167_Dne = new LAz(this);
        this.field_3696167_Dne.method_b6186b2b_Dne(this.field_f27c122c_Dne, 1, 1);
        this.field_3755479_Dne = new eiw(this);
        this.field_3755479_Dne.method_b6186b2b_Dne(this.field_f27c122c_Dne, 1, 1);
        this.field_369a47d_Dne = this.field_3781d5a_Dne;
        this.method_d44b4592_zGp();
    }

    static void method_750c5d25_Dne(ZyA zyA, int n, int n2, int n3, int n4) {
        zyA.method_58fe7b07_bzF(n, n2, n3, n4);
    }

    static msA method_3eac8d9b_Dne(ZyA zyA) {
        return zyA.field_3791671_Dne;
    }

    static msA method_e7785431_div(ZyA zyA) {
        return zyA.field_3791671_Dne;
    }

    static msA method_1b8e78dc_FWm(ZyA zyA) {
        return zyA.field_3791671_Dne;
    }
}

