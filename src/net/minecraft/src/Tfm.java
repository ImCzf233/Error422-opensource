package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class Tfm {
    private int field_21260d_FWm = 12;
    private transient KHL[] field_835f4f18_Dne = new KHL[16];
    private volatile transient int field_2e5f1b_bzF;
    private transient int field_2092ae_Dne;
    private final float field_2092ab_Dne = 0.75f;

    private static int method_ce7f5d9c_Dne(int n) {
        n ^= n >>> 20 ^ n >>> 12;
        return n ^ n >>> 7 ^ n >>> 4;
    }

    private static int method_16cca6d_Dne(int n, int n2) {
        return n & n2 - 1;
    }

    public Object method_20ed7708_Dne(long l) {
        int n = Tfm.method_117d1d9e_FWm(l);
        KHL kHL = this.field_835f4f18_Dne[Tfm.method_16cca6d_Dne(n, this.field_835f4f18_Dne.length)];
        while (kHL != null) {
            if (kHL.field_2092af_Dne == l) {
                return kHL.field_63dcf1d7_Dne;
            }
            kHL = kHL.field_36901bd_Dne;
        }
        return null;
    }

    private void method_df1b588c_Dne(int n, long l, Object object, int n2) {
        KHL kHL = this.field_835f4f18_Dne[n2];
        this.field_835f4f18_Dne[n2] = new KHL(n, l, object, kHL);
        if (this.field_2092ae_Dne++ >= this.field_21260d_FWm) {
            this.method_ce7f5da9_Dne(2 * this.field_835f4f18_Dne.length);
        }
    }

    private void method_ce7f5da9_Dne(int n) {
        KHL[] kHLArray = this.field_835f4f18_Dne;
        int n2 = kHLArray.length;
        if (n2 == 0x40000000) {
            this.field_21260d_FWm = Integer.MAX_VALUE;
        } else {
            KHL[] kHLArray2 = new KHL[n];
            this.method_b699c1f7_Dne(kHLArray2);
            this.field_835f4f18_Dne = kHLArray2;
            this.field_21260d_FWm = (int)((float)n * this.field_2092ab_Dne);
        }
    }

    final KHL method_aca694ad_FWm(long l) {
        KHL kHL;
        int n = Tfm.method_117d1d9e_FWm(l);
        int n2 = Tfm.method_16cca6d_Dne(n, this.field_835f4f18_Dne.length);
        KHL kHL2 = kHL = this.field_835f4f18_Dne[n2];
        while (kHL2 != null) {
            KHL kHL3 = kHL2.field_36901bd_Dne;
            if (kHL2.field_2092af_Dne == l) {
                ++this.field_2e5f1b_bzF;
                --this.field_2092ae_Dne;
                if (kHL == kHL2) {
                    this.field_835f4f18_Dne[n2] = kHL3;
                } else {
                    kHL.field_36901bd_Dne = kHL3;
                }
                return kHL2;
            }
            kHL = kHL2;
            kHL2 = kHL3;
        }
        return kHL2;
    }

    public int method_7a46288d_Dne() {
        return this.field_2092ae_Dne;
    }

    public void method_b9998ac6_Dne(long l, Object object) {
        int n = Tfm.method_117d1d9e_FWm(l);
        int n2 = Tfm.method_16cca6d_Dne(n, this.field_835f4f18_Dne.length);
        KHL kHL = this.field_835f4f18_Dne[n2];
        while (kHL != null) {
            if (kHL.field_2092af_Dne == l) {
                kHL.field_63dcf1d7_Dne = object;
                return;
            }
            kHL = kHL.field_36901bd_Dne;
        }
        ++this.field_2e5f1b_bzF;
        this.method_df1b588c_Dne(n, l, object, n2);
    }

    private static int method_117d1d9e_FWm(long l) {
        return Tfm.method_ce7f5d9c_Dne((int)(l ^ l >>> 32));
    }

    public Object method_a2a9a4e7_FWm(long l) {
        KHL kHL = this.method_aca694ad_FWm(l);
        return kHL == null ? null : kHL.field_63dcf1d7_Dne;
    }

    private void method_b699c1f7_Dne(KHL[] kHLArray) {
        KHL[] kHLArray2 = this.field_835f4f18_Dne;
        int n = kHLArray.length;
        for (int i = 0; i < kHLArray2.length; ++i) {
            KHL kHL;
            KHL kHL2 = kHLArray2[i];
            if (kHL2 == null) continue;
            kHLArray2[i] = null;
            do {
                kHL = kHL2.field_36901bd_Dne;
                int n2 = Tfm.method_16cca6d_Dne(kHL2.field_2092ae_Dne, n);
                kHL2.field_36901bd_Dne = kHLArray[n2];
                kHLArray[n2] = kHL2;
                kHL2 = kHL;
            } while (kHL != null);
        }
    }

    static int method_ce7f615d_Dne(long l) {
        return Tfm.method_117d1d9e_FWm(l);
    }

    public boolean method_ce7f616e_Dne(long l) {
        return this.method_d352e0ec_Dne(l) != null;
    }

    final KHL method_d352e0ec_Dne(long l) {
        int n = Tfm.method_117d1d9e_FWm(l);
        KHL kHL = this.field_835f4f18_Dne[Tfm.method_16cca6d_Dne(n, this.field_835f4f18_Dne.length)];
        while (kHL != null) {
            if (kHL.field_2092af_Dne == l) {
                return kHL;
            }
            kHL = kHL.field_36901bd_Dne;
        }
        return null;
    }
}

