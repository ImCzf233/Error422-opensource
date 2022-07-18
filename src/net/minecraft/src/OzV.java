package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class OzV
extends dyC {
    private int field_21260d_FWm = 0;
    private boolean field_2092bf_Dne = false;
    private boolean field_21261e_FWm = false;
    private int field_2092ae_Dne = 0;

    @Override
    public boolean method_2c2cf7cd_Dne(int n, int n2, int n3) {
        return this.field_21261e_FWm ? false : super.method_2c2cf7cd_Dne(n, n2, n3);
    }

    private void method_7c6f6039_FWm() {
        if (this.field_2092ae_Dne > 100) {
            this.field_36b4fb5_Dne.method_8f501fe4_Dne(this.field_36b4fb5_Dne.method_98148f73_Dne("demo.reminder", new Object[0]));
            this.field_2092ae_Dne = 0;
        }
    }

    @Override
    public boolean method_d0db4f89_Dne(FiG fiG, Qnq qnq, NMq nMq) {
        if (this.field_21261e_FWm) {
            this.method_7c6f6039_FWm();
            return false;
        }
        return super.method_d0db4f89_Dne(fiG, qnq, nMq);
    }

    @Override
    public void method_2c2cf7c9_Dne(int n, int n2, int n3) {
        if (!this.field_21261e_FWm) {
            super.method_2c2cf7c9_Dne(n, n2, n3);
        }
    }

    @Override
    public boolean method_dfecafdf_Dne(FiG fiG, Qnq qnq, NMq nMq, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        if (this.field_21261e_FWm) {
            this.method_7c6f6039_FWm();
            return false;
        }
        return super.method_dfecafdf_Dne(fiG, qnq, nMq, n, n2, n3, n4, f, f2, f3);
    }

    @Override
    public void method_7a46289a_Dne() {
        super.method_7a46289a_Dne();
        ++this.field_21260d_FWm;
        long l = this.field_36c4f18_Dne.method_7c6f602d_FWm();
        long l2 = l / 24000L + 1L;
        if (!this.field_2092bf_Dne && this.field_21260d_FWm > 20) {
            this.field_2092bf_Dne = true;
            this.field_36b4fb5_Dne.field_36dacd0_Dne.method_7be2fb8c_Dne(new Tnn(5, 0));
        }
        boolean bl = this.field_21261e_FWm = l > 120500L;
        if (this.field_21261e_FWm) {
            ++this.field_2092ae_Dne;
        }
        if (l % 24000L == 500L) {
            if (l2 <= 6L) {
                this.field_36b4fb5_Dne.method_8f501fe4_Dne(this.field_36b4fb5_Dne.method_98148f73_Dne("demo.day." + l2, new Object[0]));
            }
        } else if (l2 == 1L) {
            if (l == 100L) {
                this.field_36b4fb5_Dne.field_36dacd0_Dne.method_7be2fb8c_Dne(new Tnn(5, 101));
            } else if (l == 175L) {
                this.field_36b4fb5_Dne.field_36dacd0_Dne.method_7be2fb8c_Dne(new Tnn(5, 102));
            } else if (l == 250L) {
                this.field_36b4fb5_Dne.field_36dacd0_Dne.method_7be2fb8c_Dne(new Tnn(5, 103));
            }
        } else if (l2 == 5L && l % 24000L == 22000L) {
            this.field_36b4fb5_Dne.method_8f501fe4_Dne(this.field_36b4fb5_Dne.method_98148f73_Dne("demo.day.warning", new Object[0]));
        }
    }

    @Override
    public void method_5972745a_Dne(int n, int n2, int n3, int n4) {
        if (this.field_21261e_FWm) {
            this.method_7c6f6039_FWm();
        } else {
            super.method_5972745a_Dne(n, n2, n3, n4);
        }
    }

    public OzV(Qnq qnq) {
        super(qnq);
    }
}

