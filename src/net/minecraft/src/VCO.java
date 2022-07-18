package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class VCO
extends qVZ {
    private boolean field_2e5f2c_bzF = false;
    private String field_569fcf45_Dne = "survival";
    private final qVZ field_37a7e17_Dne;
    private pee_0 field_2025835b_FWm;
    private pee_0 field_36bb77c_Dne;

    @Override
    protected void method_81183ff7_Dne(pee_0 pee_02) {
        if (pee_02.field_2d29f4_aFZ == 102) {
            this.field_493682ed_Dne.method_b88fcbd2_Dne(this.field_37a7e17_Dne);
        } else if (pee_02.field_2d29f4_aFZ == 104) {
            this.field_569fcf45_Dne = this.field_569fcf45_Dne.equals("survival") ? "creative" : (this.field_569fcf45_Dne.equals("creative") ? "adventure" : "survival");
            this.method_d44b4592_zGp();
        } else if (pee_02.field_2d29f4_aFZ == 103) {
            this.field_2e5f2c_bzF = !this.field_2e5f2c_bzF;
            this.method_d44b4592_zGp();
        } else if (pee_02.field_2d29f4_aFZ == 101) {
            this.field_493682ed_Dne.method_b88fcbd2_Dne(null);
            String string = this.field_493682ed_Dne.method_2317ec95_Dne().method_9f2c7597_Dne(XHL.method_2851bb39_Dne(this.field_569fcf45_Dne), this.field_2e5f2c_bzF);
            String string2 = "";
            string2 = string != null ? this.field_493682ed_Dne.field_369f6b6_Dne.method_98148f73_Dne("commands.publish.started", string) : this.field_493682ed_Dne.field_369f6b6_Dne.method_98148f73_Dne("commands.publish.failed", new Object[0]);
            this.field_493682ed_Dne.field_3733694_Dne.method_2312ad69_Dne().method_8f501fe4_Dne(string2);
        }
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_f27c122c_Dne.clear();
        this.field_f27c122c_Dne.add(new pee_0(101, this.field_21260d_FWm / 2 - 155, this.field_2e5f1b_bzF - 28, 150, 20, KGL.method_39193c_Dne("lanServer.start")));
        this.field_f27c122c_Dne.add(new pee_0(102, this.field_21260d_FWm / 2 + 5, this.field_2e5f1b_bzF - 28, 150, 20, KGL.method_39193c_Dne("gui.cancel")));
        this.field_2025835b_FWm = new pee_0(104, this.field_21260d_FWm / 2 - 155, 100, 150, 20, KGL.method_39193c_Dne("selectWorld.gameMode"));
        this.field_f27c122c_Dne.add(this.field_2025835b_FWm);
        this.field_36bb77c_Dne = new pee_0(103, this.field_21260d_FWm / 2 + 5, 100, 150, 20, KGL.method_39193c_Dne("selectWorld.allowCommands"));
        this.field_f27c122c_Dne.add(this.field_36bb77c_Dne);
        this.method_d44b4592_zGp();
    }

    private void method_d44b4592_zGp() {
        irb irb2 = irb.method_2310d392_Dne();
        this.field_2025835b_FWm.field_569fcf45_Dne = irb2.method_39193c_Dne("selectWorld.gameMode") + " " + irb2.method_39193c_Dne("selectWorld.gameMode." + this.field_569fcf45_Dne);
        this.field_36bb77c_Dne.field_569fcf45_Dne = irb2.method_39193c_Dne("selectWorld.allowCommands") + " ";
        this.field_36bb77c_Dne.field_569fcf45_Dne = this.field_2e5f2c_bzF ? this.field_36bb77c_Dne.field_569fcf45_Dne + irb2.method_39193c_Dne("options.on") : this.field_36bb77c_Dne.field_569fcf45_Dne + irb2.method_39193c_Dne("options.off");
    }

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        this.method_a98a0660_aFZ();
        this.method_32faf66d_Dne(this.field_3791671_Dne, KGL.method_39193c_Dne("lanServer.title"), this.field_21260d_FWm / 2, 50, 0xFFFFFF);
        this.method_32faf66d_Dne(this.field_3791671_Dne, KGL.method_39193c_Dne("lanServer.otherPlayers"), this.field_21260d_FWm / 2, 82, 0xFFFFFF);
        super.method_2c2cec86_Dne(n, n2, f);
    }

    public VCO(qVZ qVZ2) {
        this.field_37a7e17_Dne = qVZ2;
    }
}

