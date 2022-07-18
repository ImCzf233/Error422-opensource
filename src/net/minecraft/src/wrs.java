package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class wrs {
    private final Tfm field_36d8db1_Dne;
    private final RAN field_36c164d_Dne;
    private final int field_2092ae_Dne;
    private final List field_f27c122c_Dne = new ArrayList();
    private final List field_6a0474ed_FWm;
    private final int[][] field_7a46ee0e_Dne;

    public void method_7a46289a_Dne() {
        Jik jik;
        for (int i = 0; i < this.field_6a0474ed_FWm.size(); ++i) {
            ((JAu)this.field_6a0474ed_FWm.get(i)).method_7a46289a_Dne();
        }
        this.field_6a0474ed_FWm.clear();
        if (this.field_f27c122c_Dne.isEmpty() && !(jik = this.field_36c164d_Dne.field_3690d00_Dne).method_7c6f603d_FWm()) {
            this.field_36c164d_Dne.field_366d5ad_Dne.method_7c6f6039_FWm();
        }
    }

    public RAN method_2305a4ac_Dne() {
        return this.field_36c164d_Dne;
    }

    public static int method_ce7f5d9c_Dne(int n) {
        return n * 16 - 16;
    }

    public void method_58e661b1_FWm(PJQ pJQ) {
        int n;
        ArrayList arrayList = new ArrayList(pJQ.field_f27c122c_Dne);
        int n2 = 0;
        int n3 = this.field_2092ae_Dne;
        int n4 = (int)pJQ.field_2f0dd3_div >> 4;
        int n5 = (int)pJQ.field_334487_mrb >> 4;
        int n6 = 0;
        int n7 = 0;
        Sxs sxs = JAu.method_a4ce97ec_Dne(this.method_5cc9956d_Dne(n4, n5, true));
        pJQ.field_f27c122c_Dne.clear();
        if (arrayList.contains(sxs)) {
            pJQ.field_f27c122c_Dne.add(sxs);
        }
        for (n = 1; n <= n3 * 2; ++n) {
            for (int i = 0; i < 2; ++i) {
                int[] nArray = this.field_7a46ee0e_Dne[n2++ % 4];
                for (int j = 0; j < n; ++j) {
                    sxs = JAu.method_a4ce97ec_Dne(this.method_5cc9956d_Dne(n4 + (n6 += nArray[0]), n5 + (n7 += nArray[1]), true));
                    if (!arrayList.contains(sxs)) continue;
                    pJQ.field_f27c122c_Dne.add(sxs);
                }
            }
        }
        n2 %= 4;
        for (n = 0; n < n3 * 2; ++n) {
            sxs = JAu.method_a4ce97ec_Dne(this.method_5cc9956d_Dne(n4 + (n6 += this.field_7a46ee0e_Dne[n2][0]), n5 + (n7 += this.field_7a46ee0e_Dne[n2][1]), true));
            if (!arrayList.contains(sxs)) continue;
            pJQ.field_f27c122c_Dne.add(sxs);
        }
    }

    public void method_2c2cf7c9_Dne(int n, int n2, int n3) {
        int n4 = n >> 4;
        int n5 = n3 >> 4;
        JAu jAu = this.method_5cc9956d_Dne(n4, n5, false);
        if (jAu != null) {
            jAu.method_2c2cf7c9_Dne(n & 0xF, n2, n3 & 0xF);
        }
    }

    public wrs(RAN rAN, int n) {
        this.field_36d8db1_Dne = new Tfm();
        this.field_6a0474ed_FWm = new ArrayList();
        this.field_7a46ee0e_Dne = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        if (n > 15) {
            throw new IllegalArgumentException("Too big view radius!");
        }
        if (n < 3) {
            throw new IllegalArgumentException("Too small view radius!");
        }
        this.field_2092ae_Dne = n;
        this.field_36c164d_Dne = rAN;
    }

    static Tfm method_270e8fe5_Dne(wrs wrs2) {
        return wrs2.field_36d8db1_Dne;
    }

    public boolean method_e5ad5254_Dne(PJQ pJQ, int n, int n2) {
        JAu jAu = this.method_5cc9956d_Dne(n, n2, false);
        return jAu == null ? false : JAu.method_f212fb1e_Dne(jAu).contains(pJQ) && !pJQ.field_f27c122c_Dne.contains(JAu.method_a4ce97ec_Dne(jAu));
    }

    public void method_7f92adf0_Dne(PJQ pJQ) {
        int n = (int)pJQ.field_2f0dd3_div >> 4;
        int n2 = (int)pJQ.field_334487_mrb >> 4;
        pJQ.field_2092a9_Dne = pJQ.field_2f0dd3_div;
        pJQ.field_212608_FWm = pJQ.field_334487_mrb;
        for (int i = n - this.field_2092ae_Dne; i <= n + this.field_2092ae_Dne; ++i) {
            for (int j = n2 - this.field_2092ae_Dne; j <= n2 + this.field_2092ae_Dne; ++j) {
                this.method_5cc9956d_Dne(i, j, true).method_7f92adf0_Dne(pJQ);
            }
        }
        this.field_f27c122c_Dne.add(pJQ);
        this.method_58e661b1_FWm(pJQ);
    }

    private boolean method_d4dc89ed_Dne(int n, int n2, int n3, int n4, int n5) {
        int n6 = n - n3;
        int n7 = n2 - n4;
        return n6 >= -n5 && n6 <= n5 ? n7 >= -n5 && n7 <= n5 : false;
    }

    public void method_71877ce3_bzF(PJQ pJQ) {
        int n = (int)pJQ.field_2092a9_Dne >> 4;
        int n2 = (int)pJQ.field_212608_FWm >> 4;
        for (int i = n - this.field_2092ae_Dne; i <= n + this.field_2092ae_Dne; ++i) {
            for (int j = n2 - this.field_2092ae_Dne; j <= n2 + this.field_2092ae_Dne; ++j) {
                JAu jAu = this.method_5cc9956d_Dne(i, j, false);
                if (jAu == null) continue;
                jAu.method_58e661b1_FWm(pJQ);
            }
        }
        this.field_f27c122c_Dne.remove(pJQ);
    }

    static List method_e39b6778_Dne(wrs wrs2) {
        return wrs2.field_6a0474ed_FWm;
    }

    private JAu method_5cc9956d_Dne(int n, int n2, boolean bl) {
        long l = (long)n + Integer.MAX_VALUE | (long)n2 + Integer.MAX_VALUE << 32;
        JAu jAu = (JAu)this.field_36d8db1_Dne.method_20ed7708_Dne(l);
        if (jAu == null && bl) {
            jAu = new JAu(this, n, n2);
            this.field_36d8db1_Dne.method_b9998ac6_Dne(l, jAu);
        }
        return jAu;
    }

    static RAN method_270d1881_Dne(wrs wrs2) {
        return wrs2.field_36c164d_Dne;
    }

    public void method_264f5c9_Qnq(PJQ pJQ) {
        int n = (int)pJQ.field_2f0dd3_div >> 4;
        int n2 = (int)pJQ.field_334487_mrb >> 4;
        double d = pJQ.field_2092a9_Dne - pJQ.field_2f0dd3_div;
        double d2 = pJQ.field_212608_FWm - pJQ.field_334487_mrb;
        double d3 = d * d + d2 * d2;
        if (d3 >= 64.0) {
            int n3 = (int)pJQ.field_2092a9_Dne >> 4;
            int n4 = (int)pJQ.field_212608_FWm >> 4;
            int n5 = this.field_2092ae_Dne;
            int n6 = n - n3;
            int n7 = n2 - n4;
            if (n6 != 0 || n7 != 0) {
                for (int i = n - n5; i <= n + n5; ++i) {
                    for (int j = n2 - n5; j <= n2 + n5; ++j) {
                        JAu jAu;
                        if (!this.method_d4dc89ed_Dne(i, j, n3, n4, n5)) {
                            this.method_5cc9956d_Dne(i, j, true).method_7f92adf0_Dne(pJQ);
                        }
                        if (this.method_d4dc89ed_Dne(i - n6, j - n7, n, n2, n5) || (jAu = this.method_5cc9956d_Dne(i - n6, j - n7, false)) == null) continue;
                        jAu.method_58e661b1_FWm(pJQ);
                    }
                }
                this.method_58e661b1_FWm(pJQ);
                pJQ.field_2092a9_Dne = pJQ.field_2f0dd3_div;
                pJQ.field_212608_FWm = pJQ.field_334487_mrb;
            }
        }
    }
}

