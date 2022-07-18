package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class PRc {
    public int field_2092ae_Dne;
    public int[] field_3f1c589_Dne;
    private static final int field_21260d_FWm = -130;
    private static byte[] field_4039e03_FWm = "vorbis".getBytes();
    private static byte[] field_59d86b5_bzF = "Xiphophorus libVorbis I 20000508".getBytes();
    public byte[] field_3f1c582_Dne;
    public byte[][] field_7a46ee07_Dne;

    public int method_b9bcb96f_Dne(qlF qlF2) {
        qbC qbC2 = new qbC();
        qbC2.method_7a46289a_Dne();
        if (this.method_92822509_FWm(qbC2) != 0) {
            return -130;
        }
        qlF2.field_3f1c582_Dne = new byte[qbC2.method_ae128dba_bzF()];
        qlF2.field_2092ae_Dne = 0;
        qlF2.field_21260d_FWm = qbC2.method_ae128dba_bzF();
        System.arraycopy(qbC2.method_ce7eeb83_Dne(), 0, qlF2.field_3f1c582_Dne, 0, qlF2.field_21260d_FWm);
        qlF2.field_2e5f1b_bzF = 0;
        qlF2.field_267cf5_Qnq = 0;
        qlF2.field_2092af_Dne = 0L;
        return 0;
    }

    public void method_8f501fe4_Dne(String string) {
        this.method_174dee1_Dne(string.getBytes());
    }

    public void method_7a46289a_Dne() {
        this.field_7a46ee07_Dne = null;
        this.field_2092ae_Dne = 0;
        this.field_3f1c582_Dne = null;
    }

    void method_7c6f6039_FWm() {
        for (int i = 0; i < this.field_2092ae_Dne; ++i) {
            this.field_7a46ee07_Dne[i] = null;
        }
        this.field_7a46ee07_Dne = null;
        this.field_3f1c582_Dne = null;
    }

    public String method_2c0e7e17_Dne(int n) {
        if (this.field_2092ae_Dne <= n) {
            return null;
        }
        return new String(this.field_7a46ee07_Dne[n], 0, this.field_7a46ee07_Dne[n].length - 1);
    }

    static boolean method_8215409f_Dne(byte[] byArray, byte[] byArray2, int n) {
        for (int i = 0; i < n; ++i) {
            byte by = byArray[i];
            byte by2 = byArray2[i];
            if (90 >= by && by >= 65) {
                by = (byte)(by - 65 + 97);
            }
            if (90 >= by2 && by2 >= 65) {
                by2 = (byte)(by2 - 65 + 97);
            }
            if (by == by2) continue;
            return false;
        }
        return true;
    }

    public String method_4868f6e1_Dne(String string, int n) {
        int n2 = this.method_2d277035_Dne(string.getBytes(), n);
        if (n2 == -1) {
            return null;
        }
        byte[] byArray = this.field_7a46ee07_Dne[n2];
        for (int i = 0; i < this.field_3f1c589_Dne[n2]; ++i) {
            if (byArray[i] != 61) continue;
            return new String(byArray, i + 1, this.field_3f1c589_Dne[n2] - (i + 1));
        }
        return null;
    }

    public void method_abaa98ae_Dne(String string, String string2) {
        if (string2 == null) {
            string2 = "";
        }
        this.method_8f501fe4_Dne(string + "=" + string2);
    }

    private void method_174dee1_Dne(byte[] byArray) {
        byte[][] byArrayArray = new byte[this.field_2092ae_Dne + 2][];
        if (this.field_7a46ee07_Dne != null) {
            System.arraycopy(this.field_7a46ee07_Dne, 0, byArrayArray, 0, this.field_2092ae_Dne);
        }
        this.field_7a46ee07_Dne = byArrayArray;
        int[] nArray = new int[this.field_2092ae_Dne + 2];
        if (this.field_3f1c589_Dne != null) {
            System.arraycopy(this.field_3f1c589_Dne, 0, nArray, 0, this.field_2092ae_Dne);
        }
        this.field_3f1c589_Dne = nArray;
        byte[] byArray2 = new byte[byArray.length + 1];
        System.arraycopy(byArray, 0, byArray2, 0, byArray.length);
        this.field_7a46ee07_Dne[this.field_2092ae_Dne] = byArray2;
        this.field_3f1c589_Dne[this.field_2092ae_Dne] = byArray.length;
        ++this.field_2092ae_Dne;
        this.field_7a46ee07_Dne[this.field_2092ae_Dne] = null;
    }

    public String method_eecad346_Dne() {
        return new String(this.field_3f1c582_Dne, 0, this.field_3f1c582_Dne.length - 1);
    }

    public String method_39193c_Dne(String string) {
        return this.method_4868f6e1_Dne(string, 0);
    }

    int method_92822509_FWm(qbC qbC2) {
        qbC2.method_16cca7a_Dne(3, 8);
        qbC2.method_174dee1_Dne(field_4039e03_FWm);
        qbC2.method_16cca7a_Dne(field_59d86b5_bzF.length, 32);
        qbC2.method_174dee1_Dne(field_59d86b5_bzF);
        qbC2.method_16cca7a_Dne(this.field_2092ae_Dne, 32);
        if (this.field_2092ae_Dne != 0) {
            for (int i = 0; i < this.field_2092ae_Dne; ++i) {
                if (this.field_7a46ee07_Dne[i] != null) {
                    qbC2.method_16cca7a_Dne(this.field_3f1c589_Dne[i], 32);
                    qbC2.method_174dee1_Dne(this.field_7a46ee07_Dne[i]);
                    continue;
                }
                qbC2.method_16cca7a_Dne(0, 32);
            }
        }
        qbC2.method_16cca7a_Dne(1, 1);
        return 0;
    }

    private int method_2d277035_Dne(byte[] byArray, int n) {
        int n2 = 0;
        int n3 = 0;
        int n4 = byArray.length + 1;
        byte[] byArray2 = new byte[n4];
        System.arraycopy(byArray, 0, byArray2, 0, byArray.length);
        byArray2[byArray.length] = 61;
        for (n2 = 0; n2 < this.field_2092ae_Dne; ++n2) {
            if (!PRc.method_8215409f_Dne(this.field_7a46ee07_Dne[n2], byArray2, n4)) continue;
            if (n == n3) {
                return n2;
            }
            ++n3;
        }
        return -1;
    }

    int method_b92e7148_Dne(qbC qbC2) {
        int n = qbC2.method_117d19dd_FWm(32);
        if (n < 0) {
            this.method_7c6f6039_FWm();
            return -1;
        }
        this.field_3f1c582_Dne = new byte[n + 1];
        qbC2.method_2d277042_Dne(this.field_3f1c582_Dne, n);
        this.field_2092ae_Dne = qbC2.method_117d19dd_FWm(32);
        if (this.field_2092ae_Dne < 0) {
            this.method_7c6f6039_FWm();
            return -1;
        }
        this.field_7a46ee07_Dne = new byte[this.field_2092ae_Dne + 1][];
        this.field_3f1c589_Dne = new int[this.field_2092ae_Dne + 1];
        for (int i = 0; i < this.field_2092ae_Dne; ++i) {
            int n2 = qbC2.method_117d19dd_FWm(32);
            if (n2 < 0) {
                this.method_7c6f6039_FWm();
                return -1;
            }
            this.field_3f1c589_Dne[i] = n2;
            this.field_7a46ee07_Dne[i] = new byte[n2 + 1];
            qbC2.method_2d277042_Dne(this.field_7a46ee07_Dne[i], n2);
        }
        if (qbC2.method_117d19dd_FWm(1) != 1) {
            this.method_7c6f6039_FWm();
            return -1;
        }
        return 0;
    }

    public String toString() {
        String string = "Vendor: " + new String(this.field_3f1c582_Dne, 0, this.field_3f1c582_Dne.length - 1);
        for (int i = 0; i < this.field_2092ae_Dne; ++i) {
            string = string + "\nComment: " + new String(this.field_7a46ee07_Dne[i], 0, this.field_7a46ee07_Dne[i].length - 1);
        }
        string = string + "\n";
        return string;
    }
}

