package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class NAx {
    private int field_2092ae_Dne;
    private int field_2e5f1b_bzF;
    private int field_21260d_FWm;
    private boolean field_2e5f2c_bzF;
    private boolean field_2092bf_Dne;
    private boolean field_21261e_FWm;

    public void method_7bbbe3a2_Dne(NAx nAx) {
        if (this.field_2092ae_Dne != nAx.field_2092ae_Dne) {
            System.err.println("This method should only be called for matching effects!");
        }
        if (nAx.field_2e5f1b_bzF > this.field_2e5f1b_bzF) {
            this.field_2e5f1b_bzF = nAx.field_2e5f1b_bzF;
            this.field_21260d_FWm = nAx.field_21260d_FWm;
        } else if (nAx.field_2e5f1b_bzF == this.field_2e5f1b_bzF && this.field_21260d_FWm < nAx.field_21260d_FWm) {
            this.field_21260d_FWm = nAx.field_21260d_FWm;
        } else if (!nAx.field_21261e_FWm && this.field_21261e_FWm) {
            this.field_21261e_FWm = nAx.field_21261e_FWm;
        }
    }

    public WkD method_7dab90f8_Dne(WkD wkD) {
        wkD.method_5ab43558_Dne("Id", (byte)this.method_7a46288d_Dne());
        wkD.method_5ab43558_Dne("Amplifier", (byte)this.method_ae128dba_bzF());
        wkD.method_5ab44f9f_Dne("Duration", this.method_7c6f602c_FWm());
        wkD.method_5ab48f70_Dne("Ambient", this.method_7c6f603d_FWm());
        return wkD;
    }

    public NAx(int n, int n2) {
        this(n, n2, 0);
    }

    public int method_7a46288d_Dne() {
        return this.field_2092ae_Dne;
    }

    public NAx(int n, int n2, int n3, boolean bl) {
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_2e5f1b_bzF = n3;
        this.field_21261e_FWm = bl;
    }

    public void method_ce7f9d7a_Dne(boolean bl) {
        this.field_2092bf_Dne = bl;
    }

    public String method_eecad346_Dne() {
        return SXd.field_83633108_Dne[this.field_2092ae_Dne].method_eecad346_Dne();
    }

    public NAx(int n, int n2, int n3) {
        this(n, n2, n3, false);
    }

    public boolean method_7c6f603d_FWm() {
        return this.field_21261e_FWm;
    }

    public boolean method_7a46289e_Dne() {
        return this.field_2092bf_Dne;
    }

    public boolean equals(Object object) {
        if (!(object instanceof NAx)) {
            return false;
        }
        NAx nAx = (NAx)object;
        return this.field_2092ae_Dne == nAx.field_2092ae_Dne && this.field_2e5f1b_bzF == nAx.field_2e5f1b_bzF && this.field_21260d_FWm == nAx.field_21260d_FWm && this.field_2092bf_Dne == nAx.field_2092bf_Dne && this.field_21261e_FWm == nAx.field_21261e_FWm;
    }

    public int method_ae128dba_bzF() {
        return this.field_2e5f1b_bzF;
    }

    public NAx(NAx nAx) {
        this.field_2092ae_Dne = nAx.field_2092ae_Dne;
        this.field_21260d_FWm = nAx.field_21260d_FWm;
        this.field_2e5f1b_bzF = nAx.field_2e5f1b_bzF;
    }

    public boolean method_6f1922f2_Dne(FUH fUH) {
        if (this.field_21260d_FWm > 0) {
            if (SXd.field_83633108_Dne[this.field_2092ae_Dne].method_16cca7e_Dne(this.field_21260d_FWm, this.field_2e5f1b_bzF)) {
                this.method_6f1922ee_Dne(fUH);
            }
            this.method_907a9d14_Qnq();
        }
        return this.field_21260d_FWm > 0;
    }

    public int method_7c6f602c_FWm() {
        return this.field_21260d_FWm;
    }

    public boolean method_ae128dcb_bzF() {
        return this.field_2e5f2c_bzF;
    }

    private int method_907a9d14_Qnq() {
        return --this.field_21260d_FWm;
    }

    public static NAx method_7da6e243_Dne(WkD wkD) {
        byte by = wkD.method_8f501fd0_Dne("Id");
        byte by2 = wkD.method_8f501fd0_Dne("Amplifier");
        int n = wkD.method_8f501fd7_Dne("Duration");
        boolean bl = wkD.method_110c4dc7_FWm("Ambient");
        return new NAx(by, n, by2, bl);
    }

    public int hashCode() {
        return this.field_2092ae_Dne;
    }

    public void method_6f1922ee_Dne(FUH fUH) {
        if (this.field_21260d_FWm > 0) {
            SXd.field_83633108_Dne[this.field_2092ae_Dne].method_740badd5_Dne(fUH, this.field_2e5f1b_bzF);
        }
    }

    public void method_117d59bb_FWm(boolean bl) {
        this.field_2e5f2c_bzF = bl;
    }

    public String toString() {
        String string = "";
        string = this.method_ae128dba_bzF() > 0 ? this.method_eecad346_Dne() + " x " + (this.method_ae128dba_bzF() + 1) + ", Duration: " + this.method_7c6f602c_FWm() : this.method_eecad346_Dne() + ", Duration: " + this.method_7c6f602c_FWm();
        if (this.field_2092bf_Dne) {
            string = string + ", Splash: true";
        }
        return SXd.field_83633108_Dne[this.field_2092ae_Dne].method_907a9d25_Qnq() ? "(" + string + ")" : string;
    }
}

