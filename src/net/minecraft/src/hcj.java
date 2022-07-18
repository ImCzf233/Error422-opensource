package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class hcj
extends qVZ {
    private KHk field_369057e_Dne;
    private static eKj field_374e248_Dne = new eKj();
    private pee_0 field_36bb77c_Dne;
    private String field_569fcf45_Dne;
    private pee_0 field_75b38569_bzF;
    private pee_0 field_2025835b_FWm;
    private final Lbd field_369da9e_Dne;
    private String field_c480ca78_bzF;
    private lDk field_377f6b9_Dne = lDk.method_23118518_Dne();
    private String field_d9a85c6_FWm;

    private boolean method_907a9d25_Qnq() {
        return this.field_369057e_Dne.field_2092ae_Dne > -1 && this.field_369057e_Dne.field_2092ae_Dne < this.field_377f6b9_Dne.method_adea226d_Dne().size();
    }

    static eKj method_230e70a7_Dne() {
        return field_374e248_Dne;
    }

    static lDk method_7fde4336_Dne(hcj hcj2) {
        return hcj2.field_377f6b9_Dne;
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_f27c122c_Dne.clear();
        this.field_569fcf45_Dne = KGL.method_39193c_Dne("createWorld.customize.flat.title");
        this.field_d9a85c6_FWm = KGL.method_39193c_Dne("createWorld.customize.flat.tile");
        this.field_c480ca78_bzF = KGL.method_39193c_Dne("createWorld.customize.flat.height");
        this.field_369057e_Dne = new KHk(this);
        this.field_36bb77c_Dne = new pee_0(2, this.field_21260d_FWm / 2 - 154, this.field_2e5f1b_bzF - 52, 100, 20, KGL.method_39193c_Dne("createWorld.customize.flat.addLayer") + " (NYI)");
        this.field_f27c122c_Dne.add(this.field_36bb77c_Dne);
        this.field_2025835b_FWm = new pee_0(3, this.field_21260d_FWm / 2 - 50, this.field_2e5f1b_bzF - 52, 100, 20, KGL.method_39193c_Dne("createWorld.customize.flat.editLayer") + " (NYI)");
        this.field_f27c122c_Dne.add(this.field_2025835b_FWm);
        this.field_75b38569_bzF = new pee_0(4, this.field_21260d_FWm / 2 - 155, this.field_2e5f1b_bzF - 52, 150, 20, KGL.method_39193c_Dne("createWorld.customize.flat.removeLayer"));
        this.field_f27c122c_Dne.add(this.field_75b38569_bzF);
        this.field_f27c122c_Dne.add(new pee_0(0, this.field_21260d_FWm / 2 - 155, this.field_2e5f1b_bzF - 28, 150, 20, KGL.method_39193c_Dne("gui.done")));
        this.field_f27c122c_Dne.add(new pee_0(5, this.field_21260d_FWm / 2 + 5, this.field_2e5f1b_bzF - 52, 150, 20, KGL.method_39193c_Dne("createWorld.customize.presets")));
        this.field_f27c122c_Dne.add(new pee_0(1, this.field_21260d_FWm / 2 + 5, this.field_2e5f1b_bzF - 28, 150, 20, KGL.method_39193c_Dne("gui.cancel")));
        this.field_2025835b_FWm.field_21261e_FWm = false;
        this.field_36bb77c_Dne.field_21261e_FWm = false;
        this.field_377f6b9_Dne.method_7a46289a_Dne();
        this.method_59ee199_c_();
    }

    public void method_8f501fe4_Dne(String string) {
        this.field_377f6b9_Dne = lDk.method_285ac762_Dne(string);
    }

    @Override
    protected void method_81183ff7_Dne(pee_0 pee_02) {
        int n = this.field_377f6b9_Dne.method_adea226d_Dne().size() - this.field_369057e_Dne.field_2092ae_Dne - 1;
        if (pee_02.field_2d29f4_aFZ == 1) {
            this.field_493682ed_Dne.method_b88fcbd2_Dne(this.field_369da9e_Dne);
        } else if (pee_02.field_2d29f4_aFZ == 0) {
            this.field_369da9e_Dne.field_569fcf45_Dne = this.method_eecad346_Dne();
            this.field_493682ed_Dne.method_b88fcbd2_Dne(this.field_369da9e_Dne);
        } else if (pee_02.field_2d29f4_aFZ == 5) {
            this.field_493682ed_Dne.method_b88fcbd2_Dne(new TEn(this));
        } else if (pee_02.field_2d29f4_aFZ == 4 && this.method_907a9d25_Qnq()) {
            this.field_377f6b9_Dne.method_adea226d_Dne().remove(n);
            this.field_369057e_Dne.field_2092ae_Dne = Math.min(this.field_369057e_Dne.field_2092ae_Dne, this.field_377f6b9_Dne.method_adea226d_Dne().size() - 1);
        }
        this.field_377f6b9_Dne.method_7a46289a_Dne();
        this.method_59ee199_c_();
    }

    public void method_59ee199_c_() {
        boolean bl;
        this.field_75b38569_bzF.field_2092bf_Dne = bl = this.method_907a9d25_Qnq();
        this.field_2025835b_FWm.field_2092bf_Dne = bl;
        this.field_2025835b_FWm.field_2092bf_Dne = false;
        this.field_36bb77c_Dne.field_2092bf_Dne = false;
    }

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        this.method_a98a0660_aFZ();
        this.field_369057e_Dne.method_2c2cec86_Dne(n, n2, f);
        this.method_32faf66d_Dne(this.field_3791671_Dne, this.field_569fcf45_Dne, this.field_21260d_FWm / 2, 8, 0xFFFFFF);
        int n3 = this.field_21260d_FWm / 2 - 92 - 16;
        this.method_67d6d54c_FWm(this.field_3791671_Dne, this.field_d9a85c6_FWm, n3, 32, 0xFFFFFF);
        this.method_67d6d54c_FWm(this.field_3791671_Dne, this.field_c480ca78_bzF, n3 + 2 + 213 - this.field_3791671_Dne.method_8f501fd7_Dne(this.field_c480ca78_bzF), 32, 0xFFFFFF);
        super.method_2c2cec86_Dne(n, n2, f);
    }

    public String method_eecad346_Dne() {
        return this.field_377f6b9_Dne.toString();
    }

    public hcj(Lbd lbd, String string) {
        this.field_369da9e_Dne = lbd;
        this.method_8f501fe4_Dne(string);
    }
}

