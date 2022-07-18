package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class zmN
extends cMv {
    int field_2092ae_Dne = 0;
    private Qnq field_36c4f18_Dne;
    private FUH field_366ec33_Dne;

    @Override
    public void method_7c6f6039_FWm() {
        this.field_2092ae_Dne = 0;
    }

    public zmN(FUH fUH) {
        this.field_366ec33_Dne = fUH;
        this.field_36c4f18_Dne = fUH.field_36c4f18_Dne;
        this.method_ce7f5da9_Dne(7);
    }

    @Override
    public void method_ae128dc7_bzF() {
        this.field_2092ae_Dne = Math.max(0, this.field_2092ae_Dne - 1);
        if (this.field_2092ae_Dne == 4) {
            int n;
            int n2;
            int n3 = geR.method_117d0718_FWm(this.field_366ec33_Dne.field_2f0dd3_div);
            if (this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n3, n2 = geR.method_117d0718_FWm(this.field_366ec33_Dne.field_22c5fd_IjH), n = geR.method_117d0718_FWm(this.field_366ec33_Dne.field_334487_mrb)) == zKP.field_36dc147_Dne.field_21260d_FWm) {
                this.field_36c4f18_Dne.method_5972b42f_Dne(n3, n2, n, false);
                this.field_366ec33_Dne.method_c5dec32d_qXo();
            } else if (this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n3, n2 - 1, n) == zKP.field_36ff555_Dne.field_21260d_FWm) {
                this.field_36c4f18_Dne.method_57aed1c2_Qnq(2001, n3, n2 - 1, n, zKP.field_36ff555_Dne.field_21260d_FWm);
                this.field_36c4f18_Dne.method_17d7ea9d_FWm(n3, n2 - 1, n, zKP.field_203836cc_FWm.field_21260d_FWm, 0, 2);
                this.field_366ec33_Dne.method_c5dec32d_qXo();
            }
        }
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return this.field_2092ae_Dne > 0;
    }

    public int method_7a46288d_Dne() {
        return this.field_2092ae_Dne;
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_2092ae_Dne = 40;
        this.field_36c4f18_Dne.method_b43d849c_Dne(this.field_366ec33_Dne, (byte)10);
        this.field_366ec33_Dne.method_23028a4c_Dne().method_7c6f6039_FWm();
    }

    @Override
    public boolean method_7a46289e_Dne() {
        int n;
        int n2;
        if (this.field_366ec33_Dne.method_b5ceee8_Dne().nextInt(this.field_366ec33_Dne.method_8288d6f2_IjH() ? 50 : 1000) != 0) {
            return false;
        }
        int n3 = geR.method_117d0718_FWm(this.field_366ec33_Dne.field_2f0dd3_div);
        return this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n3, n2 = geR.method_117d0718_FWm(this.field_366ec33_Dne.field_22c5fd_IjH), n = geR.method_117d0718_FWm(this.field_366ec33_Dne.field_334487_mrb)) == zKP.field_36dc147_Dne.field_21260d_FWm && this.field_36c4f18_Dne.method_2dee76f_bzF(n3, n2, n) == 1 ? true : this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n3, n2 - 1, n) == zKP.field_36ff555_Dne.field_21260d_FWm;
    }
}

