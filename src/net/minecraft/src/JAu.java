package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

class JAu {
    private final Sxs field_36d5d9e_Dne;
    private int field_2092ae_Dne;
    final wrs field_37da474_Dne;
    private final List field_f27c122c_Dne;
    private short[] field_3f1c593_Dne;
    private int field_21260d_FWm;

    public void method_58e661b1_FWm(PJQ pJQ) {
        if (this.field_f27c122c_Dne.contains(pJQ)) {
            pJQ.field_36dacd0_Dne.method_7be2fb8c_Dne(new pKI(wrs.method_270d1881_Dne(this.field_37da474_Dne).method_e1796070_FWm(this.field_36d5d9e_Dne.field_2092ae_Dne, this.field_36d5d9e_Dne.field_21260d_FWm), true, 0));
            this.field_f27c122c_Dne.remove(pJQ);
            pJQ.field_f27c122c_Dne.remove(this.field_36d5d9e_Dne);
            if (this.field_f27c122c_Dne.isEmpty()) {
                long l = (long)this.field_36d5d9e_Dne.field_2092ae_Dne + Integer.MAX_VALUE | (long)this.field_36d5d9e_Dne.field_21260d_FWm + Integer.MAX_VALUE << 32;
                wrs.method_270e8fe5_Dne(this.field_37da474_Dne).method_a2a9a4e7_FWm(l);
                if (this.field_2092ae_Dne > 0) {
                    wrs.method_e39b6778_Dne(this.field_37da474_Dne).remove(this);
                }
                this.field_37da474_Dne.method_2305a4ac_Dne().field_366d5ad_Dne.method_1e269659_FWm(this.field_36d5d9e_Dne.field_2092ae_Dne, this.field_36d5d9e_Dne.field_21260d_FWm);
            }
        }
    }

    public void method_2c2cf7c9_Dne(int n, int n2, int n3) {
        if (this.field_2092ae_Dne == 0) {
            wrs.method_e39b6778_Dne(this.field_37da474_Dne).add(this);
        }
        this.field_21260d_FWm |= 1 << (n2 >> 4);
        if (this.field_2092ae_Dne < 64) {
            short s = (short)(n << 12 | n3 << 8 | n2);
            for (int i = 0; i < this.field_2092ae_Dne; ++i) {
                if (this.field_3f1c593_Dne[i] != s) continue;
                return;
            }
            this.field_3f1c593_Dne[this.field_2092ae_Dne++] = s;
        }
    }

    private void method_ac4d69ca_Dne(ipD ipD2) {
        NER nER;
        if (ipD2 != null && (nER = ipD2.method_2303e2b0_Dne()) != null) {
            this.method_7be2fb8c_Dne(nER);
        }
    }

    public void method_7a46289a_Dne() {
        if (this.field_2092ae_Dne != 0) {
            if (this.field_2092ae_Dne == 1) {
                int n = this.field_36d5d9e_Dne.field_2092ae_Dne * 16 + (this.field_3f1c593_Dne[0] >> 12 & 0xF);
                int n2 = this.field_3f1c593_Dne[0] & 0xFF;
                int n3 = this.field_36d5d9e_Dne.field_21260d_FWm * 16 + (this.field_3f1c593_Dne[0] >> 8 & 0xF);
                this.method_7be2fb8c_Dne(new cSs(n, n2, n3, wrs.method_270d1881_Dne(this.field_37da474_Dne)));
                if (wrs.method_270d1881_Dne(this.field_37da474_Dne).method_a6aca7ce_FWm(n, n2, n3)) {
                    this.method_ac4d69ca_Dne(wrs.method_270d1881_Dne(this.field_37da474_Dne).method_d98e681d_Dne(n, n2, n3));
                }
            } else if (this.field_2092ae_Dne == 64) {
                int n = this.field_36d5d9e_Dne.field_2092ae_Dne * 16;
                int n4 = this.field_36d5d9e_Dne.field_21260d_FWm * 16;
                this.method_7be2fb8c_Dne(new pKI(wrs.method_270d1881_Dne(this.field_37da474_Dne).method_e1796070_FWm(this.field_36d5d9e_Dne.field_2092ae_Dne, this.field_36d5d9e_Dne.field_21260d_FWm), false, this.field_21260d_FWm));
                for (int i = 0; i < 16; ++i) {
                    if ((this.field_21260d_FWm & 1 << i) == 0) continue;
                    int n5 = i << 4;
                    List list = wrs.method_270d1881_Dne(this.field_37da474_Dne).method_5b2c30cd_Dne(n, n5, n4, n + 16, n5 + 16, n4 + 16);
                    for (int j = 0; j < list.size(); ++j) {
                        this.method_ac4d69ca_Dne((ipD)list.get(j));
                    }
                }
            } else {
                this.method_7be2fb8c_Dne(new Ylf(this.field_36d5d9e_Dne.field_2092ae_Dne, this.field_36d5d9e_Dne.field_21260d_FWm, this.field_3f1c593_Dne, this.field_2092ae_Dne, wrs.method_270d1881_Dne(this.field_37da474_Dne)));
                for (int i = 0; i < this.field_2092ae_Dne; ++i) {
                    int n = this.field_36d5d9e_Dne.field_2092ae_Dne * 16 + (this.field_3f1c593_Dne[i] >> 12 & 0xF);
                    int n6 = this.field_3f1c593_Dne[i] & 0xFF;
                    int n7 = this.field_36d5d9e_Dne.field_21260d_FWm * 16 + (this.field_3f1c593_Dne[i] >> 8 & 0xF);
                    if (!wrs.method_270d1881_Dne(this.field_37da474_Dne).method_a6aca7ce_FWm(n, n6, n7)) continue;
                    this.method_ac4d69ca_Dne(wrs.method_270d1881_Dne(this.field_37da474_Dne).method_d98e681d_Dne(n, n6, n7));
                }
            }
            this.field_2092ae_Dne = 0;
            this.field_21260d_FWm = 0;
        }
    }

    public void method_7be2fb8c_Dne(NER nER) {
        for (int i = 0; i < this.field_f27c122c_Dne.size(); ++i) {
            PJQ pJQ = (PJQ)this.field_f27c122c_Dne.get(i);
            if (pJQ.field_f27c122c_Dne.contains(this.field_36d5d9e_Dne)) continue;
            pJQ.field_36dacd0_Dne.method_7be2fb8c_Dne(nER);
        }
    }

    static Sxs method_a4ce97ec_Dne(JAu jAu) {
        return jAu.field_36d5d9e_Dne;
    }

    public JAu(wrs wrs2, int n, int n2) {
        this.field_37da474_Dne = wrs2;
        this.field_f27c122c_Dne = new ArrayList();
        this.field_3f1c593_Dne = new short[64];
        this.field_2092ae_Dne = 0;
        this.field_36d5d9e_Dne = new Sxs(n, n2);
        wrs2.method_2305a4ac_Dne().field_366d5ad_Dne.method_e1796070_FWm(n, n2);
    }

    public void method_7f92adf0_Dne(PJQ pJQ) {
        if (this.field_f27c122c_Dne.contains(pJQ)) {
            throw new IllegalStateException("Failed to add player. " + pJQ + " already is in chunk " + this.field_36d5d9e_Dne.field_2092ae_Dne + ", " + this.field_36d5d9e_Dne.field_21260d_FWm);
        }
        this.field_f27c122c_Dne.add(pJQ);
        pJQ.field_f27c122c_Dne.add(this.field_36d5d9e_Dne);
    }

    static List method_f212fb1e_Dne(JAu jAu) {
        return jAu.field_f27c122c_Dne;
    }
}

