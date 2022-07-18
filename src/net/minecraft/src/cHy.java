package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class cHy {
    private FYZ field_5e506c2c_Qnq;
    private FYZ field_75aecb52_bzF;
    private FYZ field_366fd65_Dne;
    private int field_2092ae_Dne;
    private byte[] field_3f1c582_Dne;
    private int field_21260d_FWm;
    private int field_2e5f1b_bzF;
    private FYZ field_2020c944_FWm;

    public void method_2ee8c479_FWm(int n, int n2, int n3, int n4) {
        this.field_2020c944_FWm.method_5972745a_Dne(n, n2, n3, n4);
    }

    public int method_2dee76f_bzF(int n, int n2, int n3) {
        return this.field_5e506c2c_Qnq.method_2c2cf7bc_Dne(n, n2, n3);
    }

    public cHy(int n, boolean bl) {
        this.field_2092ae_Dne = n;
        this.field_3f1c582_Dne = new byte[4096];
        this.field_2020c944_FWm = new FYZ(this.field_3f1c582_Dne.length, 4);
        this.field_75aecb52_bzF = new FYZ(this.field_3f1c582_Dne.length, 4);
        if (bl) {
            this.field_5e506c2c_Qnq = new FYZ(this.field_3f1c582_Dne.length, 4);
        }
    }

    public void method_6f59afa0_Dne(FYZ fYZ) {
        this.field_366fd65_Dne = fYZ;
    }

    public byte[] method_ce7eeb83_Dne() {
        return this.field_3f1c582_Dne;
    }

    public FYZ method_2df4168a_aFZ() {
        this.field_366fd65_Dne = new FYZ(this.field_3f1c582_Dne.length, 4);
        return this.field_366fd65_Dne;
    }

    public void method_f22bf779_Qnq(FYZ fYZ) {
        this.field_5e506c2c_Qnq = fYZ;
    }

    public void method_9fbb4d61_Qnq(int n, int n2, int n3, int n4) {
        this.field_75aecb52_bzF.method_5972745a_Dne(n, n2, n3, n4);
    }

    public void method_614e7e93_bzF(FYZ fYZ) {
        this.field_75aecb52_bzF = fYZ;
    }

    public FYZ method_23008bc4_Dne() {
        return this.field_366fd65_Dne;
    }

    public FYZ method_228c9271_bzF() {
        return this.field_75aecb52_bzF;
    }

    public void method_7c6f6039_FWm() {
        this.field_366fd65_Dne = null;
    }

    public void method_7a46289a_Dne() {
        this.field_21260d_FWm = 0;
        this.field_2e5f1b_bzF = 0;
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                for (int k = 0; k < 16; ++k) {
                    int n = this.method_2c2cf7bc_Dne(i, j, k);
                    if (n <= 0) continue;
                    if (zKP.field_8374b848_Dne[n] == null) {
                        this.field_3f1c582_Dne[j << 8 | k << 4 | i] = 0;
                        if (this.field_366fd65_Dne == null) continue;
                        this.field_366fd65_Dne.method_5972745a_Dne(i, j, k, 0);
                        continue;
                    }
                    ++this.field_21260d_FWm;
                    if (!zKP.field_8374b848_Dne[n].method_8288d6f2_IjH()) continue;
                    ++this.field_2e5f1b_bzF;
                }
            }
        }
    }

    public int method_2e7161d5_Qnq(int n, int n2, int n3) {
        return this.field_75aecb52_bzF.method_2c2cf7bc_Dne(n, n2, n3);
    }

    public int method_2c2cf7bc_Dne(int n, int n2, int n3) {
        int n4 = this.field_3f1c582_Dne[n2 << 8 | n3 << 4 | n] & 0xFF;
        return this.field_366fd65_Dne != null ? this.field_366fd65_Dne.method_2c2cf7bc_Dne(n, n2, n3) << 8 | n4 : n4;
    }

    public boolean method_7a46289e_Dne() {
        return this.field_21260d_FWm == 0;
    }

    public int method_a6aca7bd_FWm(int n, int n2, int n3) {
        return this.field_2020c944_FWm.method_2c2cf7bc_Dne(n, n2, n3);
    }

    public FYZ method_f876dbe3_FWm() {
        return this.field_2020c944_FWm;
    }

    public void method_174dee1_Dne(byte[] byArray) {
        this.field_3f1c582_Dne = byArray;
    }

    public FYZ method_694964cb_Qnq() {
        return this.field_5e506c2c_Qnq;
    }

    public void method_58fe7b07_bzF(int n, int n2, int n3, int n4) {
        this.field_5e506c2c_Qnq.method_5972745a_Dne(n, n2, n3, n4);
    }

    public void method_5972745a_Dne(int n, int n2, int n3, int n4) {
        int n5 = this.field_3f1c582_Dne[n2 << 8 | n3 << 4 | n] & 0xFF;
        if (this.field_366fd65_Dne != null) {
            n5 |= this.field_366fd65_Dne.method_2c2cf7bc_Dne(n, n2, n3) << 8;
        }
        if (n5 == 0 && n4 != 0) {
            ++this.field_21260d_FWm;
            if (zKP.field_8374b848_Dne[n4] != null && zKP.field_8374b848_Dne[n4].method_8288d6f2_IjH()) {
                ++this.field_2e5f1b_bzF;
            }
        } else if (n5 != 0 && n4 == 0) {
            --this.field_21260d_FWm;
            if (zKP.field_8374b848_Dne[n5] != null && zKP.field_8374b848_Dne[n5].method_8288d6f2_IjH()) {
                --this.field_2e5f1b_bzF;
            }
        } else if (zKP.field_8374b848_Dne[n5] != null && zKP.field_8374b848_Dne[n5].method_8288d6f2_IjH() && (zKP.field_8374b848_Dne[n4] == null || !zKP.field_8374b848_Dne[n4].method_8288d6f2_IjH())) {
            --this.field_2e5f1b_bzF;
        } else if ((zKP.field_8374b848_Dne[n5] == null || !zKP.field_8374b848_Dne[n5].method_8288d6f2_IjH()) && zKP.field_8374b848_Dne[n4] != null && zKP.field_8374b848_Dne[n4].method_8288d6f2_IjH()) {
            ++this.field_2e5f1b_bzF;
        }
        this.field_3f1c582_Dne[n2 << 8 | n3 << 4 | n] = (byte)(n4 & 0xFF);
        if (n4 > 255) {
            if (this.field_366fd65_Dne == null) {
                this.field_366fd65_Dne = new FYZ(this.field_3f1c582_Dne.length, 4);
            }
            this.field_366fd65_Dne.method_5972745a_Dne(n, n2, n3, (n4 & 0xF00) >> 8);
        } else if (this.field_366fd65_Dne != null) {
            this.field_366fd65_Dne.method_5972745a_Dne(n, n2, n3, 0);
        }
    }

    public void method_48ad6361_FWm(FYZ fYZ) {
        this.field_2020c944_FWm = fYZ;
    }

    public int method_7a46288d_Dne() {
        return this.field_2092ae_Dne;
    }

    public boolean method_7c6f603d_FWm() {
        return this.field_2e5f1b_bzF > 0;
    }
}

