package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class zPr
extends SmS {
    private int field_267cf5_Qnq;
    private int field_2d29f4_aFZ = -1;

    @Override
    public boolean method_7c6f603d_FWm() {
        double d = this.field_366ec33_Dne.method_2be42992_Dne(this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF);
        return this.field_267cf5_Qnq <= 240 && !this.field_379fdf9_Dne.method_8f2f2092_FWm(this.field_366ec33_Dne.field_36c4f18_Dne, this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF) && d < 4.0;
    }

    public zPr(FUH fUH) {
        super(fUH);
    }

    @Override
    public void method_ae128dc7_bzF() {
        super.method_ae128dc7_bzF();
        if (this.field_366ec33_Dne.method_b5ceee8_Dne().nextInt(20) == 0) {
            this.field_366ec33_Dne.field_36c4f18_Dne.method_57aed1c2_Qnq(1010, this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF, 0);
        }
        ++this.field_267cf5_Qnq;
        int n = (int)((float)this.field_267cf5_Qnq / 240.0f * 10.0f);
        if (n != this.field_2d29f4_aFZ) {
            this.field_366ec33_Dne.field_36c4f18_Dne.method_285a57e3_aFZ(this.field_366ec33_Dne.field_2d29f4_aFZ, this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF, n);
            this.field_2d29f4_aFZ = n;
        }
        if (this.field_267cf5_Qnq == 240 && this.field_366ec33_Dne.field_36c4f18_Dne.field_2d29f4_aFZ == 3) {
            this.field_366ec33_Dne.field_36c4f18_Dne.method_2e7161e6_Qnq(this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF);
            this.field_366ec33_Dne.field_36c4f18_Dne.method_57aed1c2_Qnq(1012, this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF, 0);
            this.field_366ec33_Dne.field_36c4f18_Dne.method_57aed1c2_Qnq(2001, this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF, this.field_379fdf9_Dne.field_21260d_FWm);
        }
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return !super.method_7a46289e_Dne() ? false : (!this.field_366ec33_Dne.field_36c4f18_Dne.method_230cbc5a_Dne().method_8f501fe8_Dne("mobGriefing") ? false : !this.field_379fdf9_Dne.method_8f2f2092_FWm(this.field_366ec33_Dne.field_36c4f18_Dne, this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF));
    }

    @Override
    public void method_7a46289a_Dne() {
        super.method_7a46289a_Dne();
        this.field_267cf5_Qnq = 0;
    }

    @Override
    public void method_7c6f6039_FWm() {
        super.method_7c6f6039_FWm();
        this.field_366ec33_Dne.field_36c4f18_Dne.method_285a57e3_aFZ(this.field_366ec33_Dne.field_2d29f4_aFZ, this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF, -1);
    }
}

