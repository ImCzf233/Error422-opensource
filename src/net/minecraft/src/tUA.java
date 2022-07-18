package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class tUA {
    protected byte[] field_3f1c582_Dne;
    protected OTl field_36b0425_Dne;
    protected boolean field_2092bf_Dne;
    protected int field_2092ae_Dne;
    protected boolean field_21261e_FWm;
    protected boolean field_2e5f2c_bzF;

    public tUA(OTl oTl) {
        this.field_36b0425_Dne = oTl;
        this.field_3f1c582_Dne = new byte[oTl.method_7a46288d_Dne()];
        this.field_2092ae_Dne = 0;
        String string = oTl.method_eecad346_Dne();
        int n = string.indexOf(47) + 1;
        boolean bl = this.field_2e5f2c_bzF = n > 0 && string.startsWith("PGP", n);
        this.field_21261e_FWm = this.field_2e5f2c_bzF ? true : n > 0 && (string.startsWith("CFB", n) || string.startsWith("OFB", n) || string.startsWith("OpenPGP", n) || string.startsWith("SIC", n) || string.startsWith("GCTR", n));
    }

    public int method_7a46288d_Dne() {
        return this.field_36b0425_Dne.method_7a46288d_Dne();
    }

    public int method_ce7f5d9c_Dne(int n) {
        int n2 = n + this.field_2092ae_Dne;
        int n3 = this.field_2e5f2c_bzF ? n2 % this.field_3f1c582_Dne.length - (this.field_36b0425_Dne.method_7a46288d_Dne() + 2) : n2 % this.field_3f1c582_Dne.length;
        return n2 - n3;
    }

    protected tUA() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int method_2d277035_Dne(byte[] byArray, int n) {
        int n2;
        try {
            int n3 = 0;
            if (n + this.field_2092ae_Dne > byArray.length) {
                throw new Gtk("output buffer too short for doFinal()");
            }
            if (this.field_2092ae_Dne != 0) {
                if (!this.field_21261e_FWm) {
                    throw new Gtk("data not block size aligned");
                }
                this.field_36b0425_Dne.method_a339278d_Dne(this.field_3f1c582_Dne, 0, this.field_3f1c582_Dne, 0);
                n3 = this.field_2092ae_Dne;
                this.field_2092ae_Dne = 0;
                System.arraycopy(this.field_3f1c582_Dne, 0, byArray, n, n3);
            }
            n2 = n3;
        }
        finally {
            this.method_7a46289a_Dne();
        }
        return n2;
    }

    public void method_7b9bc5f9_Dne(boolean bl, ePy ePy2) {
        this.field_2092bf_Dne = bl;
        this.method_7a46289a_Dne();
        this.field_36b0425_Dne.method_7b9bc5f9_Dne(bl, ePy2);
    }

    public int method_117d19dd_FWm(int n) {
        return n + this.field_2092ae_Dne;
    }

    public int method_a692206e_Dne(byte[] byArray, int n, int n2, byte[] byArray2, int n3) {
        if (n2 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int n4 = this.method_7a46288d_Dne();
        int n5 = this.method_ce7f5d9c_Dne(n2);
        if (n5 > 0 && n3 + n5 > byArray2.length) {
            throw new Gtk("output buffer too short");
        }
        int n6 = 0;
        int n7 = this.field_3f1c582_Dne.length - this.field_2092ae_Dne;
        if (n2 > n7) {
            System.arraycopy(byArray, n, this.field_3f1c582_Dne, this.field_2092ae_Dne, n7);
            n6 += this.field_36b0425_Dne.method_a339278d_Dne(this.field_3f1c582_Dne, 0, byArray2, n3);
            this.field_2092ae_Dne = 0;
            n2 -= n7;
            n += n7;
            while (n2 > this.field_3f1c582_Dne.length) {
                n6 += this.field_36b0425_Dne.method_a339278d_Dne(byArray, n, byArray2, n3 + n6);
                n2 -= n4;
                n += n4;
            }
        }
        System.arraycopy(byArray, n, this.field_3f1c582_Dne, this.field_2092ae_Dne, n2);
        this.field_2092ae_Dne += n2;
        if (this.field_2092ae_Dne == this.field_3f1c582_Dne.length) {
            n6 += this.field_36b0425_Dne.method_a339278d_Dne(this.field_3f1c582_Dne, 0, byArray2, n3 + n6);
            this.field_2092ae_Dne = 0;
        }
        return n6;
    }

    public void method_7a46289a_Dne() {
        for (int i = 0; i < this.field_3f1c582_Dne.length; ++i) {
            this.field_3f1c582_Dne[i] = 0;
        }
        this.field_2092ae_Dne = 0;
        this.field_36b0425_Dne.method_7a46289a_Dne();
    }
}

