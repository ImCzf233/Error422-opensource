package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class WNU
implements OTl {
    private byte[] field_4039e03_FWm;
    private int field_2092ae_Dne;
    private boolean field_2092bf_Dne;
    private byte[] field_3f1c582_Dne;
    private byte[] field_59d86b5_bzF;
    private OTl field_36b0425_Dne = null;

    public int method_f45bebec_FWm(byte[] byArray, int n, byte[] byArray2, int n2) {
        if (n + this.field_2092ae_Dne > byArray.length) {
            throw new Gtk("input buffer too short");
        }
        if (n2 + this.field_2092ae_Dne > byArray2.length) {
            throw new Gtk("output buffer too short");
        }
        this.field_36b0425_Dne.method_a339278d_Dne(this.field_4039e03_FWm, 0, this.field_59d86b5_bzF, 0);
        for (int i = 0; i < this.field_2092ae_Dne; ++i) {
            byArray2[n2 + i] = (byte)(this.field_59d86b5_bzF[i] ^ byArray[n + i]);
        }
        System.arraycopy(this.field_4039e03_FWm, this.field_2092ae_Dne, this.field_4039e03_FWm, 0, this.field_4039e03_FWm.length - this.field_2092ae_Dne);
        System.arraycopy(byArray2, n2, this.field_4039e03_FWm, this.field_4039e03_FWm.length - this.field_2092ae_Dne, this.field_2092ae_Dne);
        return this.field_2092ae_Dne;
    }

    @Override
    public int method_a339278d_Dne(byte[] byArray, int n, byte[] byArray2, int n2) {
        return this.field_2092bf_Dne ? this.method_f45bebec_FWm(byArray, n, byArray2, n2) : this.method_efde36fa_bzF(byArray, n, byArray2, n2);
    }

    public WNU(OTl oTl, int n) {
        this.field_36b0425_Dne = oTl;
        this.field_2092ae_Dne = n / 8;
        this.field_3f1c582_Dne = new byte[oTl.method_7a46288d_Dne()];
        this.field_4039e03_FWm = new byte[oTl.method_7a46288d_Dne()];
        this.field_59d86b5_bzF = new byte[oTl.method_7a46288d_Dne()];
    }

    @Override
    public int method_7a46288d_Dne() {
        return this.field_2092ae_Dne;
    }

    @Override
    public void method_7b9bc5f9_Dne(boolean bl, ePy ePy2) {
        this.field_2092bf_Dne = bl;
        if (ePy2 instanceof mpe_0) {
            mpe_0 mpe_02 = (mpe_0)ePy2;
            byte[] byArray = mpe_02.method_ce7eeb83_Dne();
            if (byArray.length < this.field_3f1c582_Dne.length) {
                System.arraycopy(byArray, 0, this.field_3f1c582_Dne, this.field_3f1c582_Dne.length - byArray.length, byArray.length);
                for (int i = 0; i < this.field_3f1c582_Dne.length - byArray.length; ++i) {
                    this.field_3f1c582_Dne[i] = 0;
                }
            } else {
                System.arraycopy(byArray, 0, this.field_3f1c582_Dne, 0, this.field_3f1c582_Dne.length);
            }
            this.method_7a46289a_Dne();
            if (mpe_02.method_230e853d_Dne() != null) {
                this.field_36b0425_Dne.method_7b9bc5f9_Dne(true, mpe_02.method_230e853d_Dne());
            }
        } else {
            this.method_7a46289a_Dne();
            this.field_36b0425_Dne.method_7b9bc5f9_Dne(true, ePy2);
        }
    }

    public int method_efde36fa_bzF(byte[] byArray, int n, byte[] byArray2, int n2) {
        if (n + this.field_2092ae_Dne > byArray.length) {
            throw new Gtk("input buffer too short");
        }
        if (n2 + this.field_2092ae_Dne > byArray2.length) {
            throw new Gtk("output buffer too short");
        }
        this.field_36b0425_Dne.method_a339278d_Dne(this.field_4039e03_FWm, 0, this.field_59d86b5_bzF, 0);
        System.arraycopy(this.field_4039e03_FWm, this.field_2092ae_Dne, this.field_4039e03_FWm, 0, this.field_4039e03_FWm.length - this.field_2092ae_Dne);
        System.arraycopy(byArray, n, this.field_4039e03_FWm, this.field_4039e03_FWm.length - this.field_2092ae_Dne, this.field_2092ae_Dne);
        for (int i = 0; i < this.field_2092ae_Dne; ++i) {
            byArray2[n2 + i] = (byte)(this.field_59d86b5_bzF[i] ^ byArray[n + i]);
        }
        return this.field_2092ae_Dne;
    }

    @Override
    public String method_eecad346_Dne() {
        return this.field_36b0425_Dne.method_eecad346_Dne() + "/CFB" + this.field_2092ae_Dne * 8;
    }

    @Override
    public void method_7a46289a_Dne() {
        System.arraycopy(this.field_3f1c582_Dne, 0, this.field_4039e03_FWm, 0, this.field_3f1c582_Dne.length);
        this.field_36b0425_Dne.method_7a46289a_Dne();
    }
}

