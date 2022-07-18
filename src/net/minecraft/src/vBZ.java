package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class vBZ
extends sHC {
    private String field_9e60dbde_Qnq;
    private boolean field_2e5f2c_bzF = true;
    private String field_8b8e234d_zGp;
    private String field_bc57ecbf_aFZ;

    @Override
    protected void method_81183ff7_Dne(pee_0 pee_02) {
        if (pee_02.field_2d29f4_aFZ == 2) {
            this.method_d44b4592_zGp();
        }
        this.field_37a7e17_Dne.method_17484c9_Dne(pee_02.field_2d29f4_aFZ == 0, this.field_2092ae_Dne);
    }

    public void method_d44b4592_zGp() {
        vBZ.method_47a073d1_bzF(this.field_8b8e234d_zGp);
    }

    public vBZ(qVZ qVZ2, String string, int n, boolean bl) {
        super(qVZ2, irb.method_2310d392_Dne().method_39193c_Dne(bl ? "chat.link.confirmTrusted" : "chat.link.confirm"), string, n);
        irb irb2 = irb.method_2310d392_Dne();
        this.field_d9a85c6_FWm = irb2.method_39193c_Dne(bl ? "chat.link.open" : "gui.yes");
        this.field_c480ca78_bzF = irb2.method_39193c_Dne(bl ? "gui.cancel" : "gui.no");
        this.field_bc57ecbf_aFZ = irb2.method_39193c_Dne("chat.copy");
        this.field_9e60dbde_Qnq = irb2.method_39193c_Dne("chat.link.warning");
        this.field_8b8e234d_zGp = string;
    }

    public void method_8288d6ee_IjH() {
        this.field_2e5f2c_bzF = false;
    }

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        super.method_2c2cec86_Dne(n, n2, f);
        if (this.field_2e5f2c_bzF) {
            this.method_32faf66d_Dne(this.field_3791671_Dne, this.field_9e60dbde_Qnq, this.field_21260d_FWm / 2, 110, 0xFFCCCC);
        }
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_f27c122c_Dne.add(new pee_0(0, this.field_21260d_FWm / 3 - 83 + 0, this.field_2e5f1b_bzF / 6 + 96, 100, 20, this.field_d9a85c6_FWm));
        this.field_f27c122c_Dne.add(new pee_0(2, this.field_21260d_FWm / 3 - 83 + 105, this.field_2e5f1b_bzF / 6 + 96, 100, 20, this.field_bc57ecbf_aFZ));
        this.field_f27c122c_Dne.add(new pee_0(1, this.field_21260d_FWm / 3 - 83 + 210, this.field_2e5f1b_bzF / 6 + 96, 100, 20, this.field_c480ca78_bzF));
    }
}

