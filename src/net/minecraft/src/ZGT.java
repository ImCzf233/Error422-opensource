package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;
import java.util.Set;

public class ZGT {
    private transient int field_2092ae_Dne;
    private transient AAk[] field_835aacdc_Dne = new AAk[16];
    private final float field_2092ab_Dne = 0.75f;
    private int field_21260d_FWm = 12;
    private Set field_83b48b6a_Dne = new HashSet();
    private volatile transient int field_2e5f1b_bzF;

    private void method_a534bebb_Dne(AAk[] aAkArray) {
        AAk[] aAkArray2 = this.field_835aacdc_Dne;
        int n = aAkArray.length;
        for (int i = 0; i < aAkArray2.length; ++i) {
            AAk aAk;
            AAk aAk2 = aAkArray2[i];
            if (aAk2 == null) continue;
            aAkArray2[i] = null;
            do {
                aAk = aAk2.field_3645f81_Dne;
                int n2 = ZGT.method_16cca6d_Dne(aAk2.field_21260d_FWm, n);
                aAk2.field_3645f81_Dne = aAkArray[n2];
                aAkArray[n2] = aAk2;
                aAk2 = aAk;
            } while (aAk != null);
        }
    }

    public void method_7a46289a_Dne() {
        ++this.field_2e5f1b_bzF;
        AAk[] aAkArray = this.field_835aacdc_Dne;
        for (int i = 0; i < aAkArray.length; ++i) {
            aAkArray[i] = null;
        }
        this.field_2092ae_Dne = 0;
    }

    final AAk method_77bbb730_FWm(int n) {
        AAk aAk;
        int n2 = ZGT.method_117d19dd_FWm(n);
        int n3 = ZGT.method_16cca6d_Dne(n2, this.field_835aacdc_Dne.length);
        AAk aAk2 = aAk = this.field_835aacdc_Dne[n3];
        while (aAk2 != null) {
            AAk aAk3 = aAk2.field_3645f81_Dne;
            if (aAk2.field_2092ae_Dne == n) {
                ++this.field_2e5f1b_bzF;
                --this.field_2092ae_Dne;
                if (aAk == aAk2) {
                    this.field_835aacdc_Dne[n3] = aAk3;
                } else {
                    aAk.field_3645f81_Dne = aAk3;
                }
                return aAk2;
            }
            aAk = aAk2;
            aAk2 = aAk3;
        }
        return aAk2;
    }

    public Object method_bb07ce88_FWm(int n) {
        this.field_83b48b6a_Dne.remove(n);
        AAk aAk = this.method_77bbb730_FWm(n);
        return aAk == null ? null : aAk.field_63dcf1d7_Dne;
    }

    public Set method_d412ef09_Dne() {
        return this.field_83b48b6a_Dne;
    }

    private static int method_16cca6d_Dne(int n, int n2) {
        return n & n2 - 1;
    }

    public Object method_394ba0a9_Dne(int n) {
        int n2 = ZGT.method_117d19dd_FWm(n);
        AAk aAk = this.field_835aacdc_Dne[ZGT.method_16cca6d_Dne(n2, this.field_835aacdc_Dne.length)];
        while (aAk != null) {
            if (aAk.field_2092ae_Dne == n) {
                return aAk.field_63dcf1d7_Dne;
            }
            aAk = aAk.field_3645f81_Dne;
        }
        return null;
    }

    public void method_ad009545_Dne(int n, Object object) {
        this.field_83b48b6a_Dne.add(n);
        int n2 = ZGT.method_117d19dd_FWm(n);
        int n3 = ZGT.method_16cca6d_Dne(n2, this.field_835aacdc_Dne.length);
        AAk aAk = this.field_835aacdc_Dne[n3];
        while (aAk != null) {
            if (aAk.field_2092ae_Dne == n) {
                aAk.field_63dcf1d7_Dne = object;
                return;
            }
            aAk = aAk.field_3645f81_Dne;
        }
        ++this.field_2e5f1b_bzF;
        this.method_58959ded_Dne(n2, n, object, n3);
    }

    private void method_ce7f5da9_Dne(int n) {
        AAk[] aAkArray = this.field_835aacdc_Dne;
        int n2 = aAkArray.length;
        if (n2 == 0x40000000) {
            this.field_21260d_FWm = Integer.MAX_VALUE;
        } else {
            AAk[] aAkArray2 = new AAk[n];
            this.method_a534bebb_Dne(aAkArray2);
            this.field_835aacdc_Dne = aAkArray2;
            this.field_21260d_FWm = (int)((float)n * this.field_2092ab_Dne);
        }
    }

    private static int method_117d19dd_FWm(int n) {
        n ^= n >>> 20 ^ n >>> 12;
        return n ^ n >>> 7 ^ n >>> 4;
    }

    static int method_ce7f5d9c_Dne(int n) {
        return ZGT.method_117d19dd_FWm(n);
    }

    public boolean method_ce7f5dad_Dne(int n) {
        return this.method_9e68036f_Dne(n) != null;
    }

    private void method_58959ded_Dne(int n, int n2, Object object, int n3) {
        AAk aAk = this.field_835aacdc_Dne[n3];
        this.field_835aacdc_Dne[n3] = new AAk(n, n2, object, aAk);
        if (this.field_2092ae_Dne++ >= this.field_21260d_FWm) {
            this.method_ce7f5da9_Dne(2 * this.field_835aacdc_Dne.length);
        }
    }

    final AAk method_9e68036f_Dne(int n) {
        int n2 = ZGT.method_117d19dd_FWm(n);
        AAk aAk = this.field_835aacdc_Dne[ZGT.method_16cca6d_Dne(n2, this.field_835aacdc_Dne.length)];
        while (aAk != null) {
            if (aAk.field_2092ae_Dne == n) {
                return aAk;
            }
            aAk = aAk.field_3645f81_Dne;
        }
        return null;
    }
}

