package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class MOS
implements MqS {
    public int field_2092ae_Dne = 0;
    public NMq[] field_8360c375_Dne = new NMq[36];
    private NMq field_36a761a_Dne;
    private NMq field_202441f9_FWm;
    public NMq[] field_fde07376_FWm = new NMq[4];
    public FiG field_3673728_Dne;
    public boolean field_2092bf_Dne = false;

    @Override
    public boolean method_703284a7_Dne(FiG fiG) {
        return this.field_3673728_Dne.field_2a9ae7_Zpi ? false : fiG.method_bb7dd80e_Dne(this.field_3673728_Dne) <= 64.0;
    }

    @Override
    public NMq method_9e6e1a08_Dne(int n) {
        NMq[] nMqArray = this.field_8360c375_Dne;
        if (n >= nMqArray.length) {
            n -= nMqArray.length;
            nMqArray = this.field_fde07376_FWm;
        }
        return nMqArray[n];
    }

    public int method_ae128dba_bzF() {
        int n = 0;
        for (int i = 0; i < this.field_fde07376_FWm.length; ++i) {
            if (this.field_fde07376_FWm[i] == null || !(this.field_fde07376_FWm[i].method_230de6ba_Dne() instanceof qoi_0)) continue;
            int n2 = ((qoi_0)this.field_fde07376_FWm[i].method_230de6ba_Dne()).field_21260d_FWm;
            n += n2;
        }
        return n;
    }

    @Override
    public int method_907a9d14_Qnq() {
        return this.field_8360c375_Dne.length + 4;
    }

    public int method_7c6f602c_FWm() {
        for (int i = 0; i < this.field_8360c375_Dne.length; ++i) {
            if (this.field_8360c375_Dne[i] != null) continue;
            return i;
        }
        return -1;
    }

    public mbZ method_32f71ece_Dne(mbZ mbZ2) {
        WkD wkD;
        int n;
        for (n = 0; n < this.field_8360c375_Dne.length; ++n) {
            if (this.field_8360c375_Dne[n] == null) continue;
            wkD = new WkD();
            wkD.method_5ab43558_Dne("Slot", (byte)n);
            this.field_8360c375_Dne[n].method_7dab90f8_Dne(wkD);
            mbZ2.method_b4ba5ea1_Dne(wkD);
        }
        for (n = 0; n < this.field_fde07376_FWm.length; ++n) {
            if (this.field_fde07376_FWm[n] == null) continue;
            wkD = new WkD();
            wkD.method_5ab43558_Dne("Slot", (byte)(n + 100));
            this.field_fde07376_FWm[n].method_7dab90f8_Dne(wkD);
            mbZ2.method_b4ba5ea1_Dne(wkD);
        }
        return mbZ2;
    }

    public void method_7abb8256_Dne(MOS mOS) {
        int n;
        for (n = 0; n < this.field_8360c375_Dne.length; ++n) {
            this.field_8360c375_Dne[n] = NMq.method_c9a1f574_Dne(mOS.field_8360c375_Dne[n]);
        }
        for (n = 0; n < this.field_fde07376_FWm.length; ++n) {
            this.field_fde07376_FWm[n] = NMq.method_c9a1f574_Dne(mOS.field_fde07376_FWm[n]);
        }
        this.field_2092ae_Dne = mOS.field_2092ae_Dne;
    }

    @Override
    public NMq method_9046b659_Dne(int n, int n2) {
        NMq[] nMqArray = this.field_8360c375_Dne;
        if (n >= this.field_8360c375_Dne.length) {
            nMqArray = this.field_fde07376_FWm;
            n -= this.field_8360c375_Dne.length;
        }
        if (nMqArray[n] != null) {
            if (nMqArray[n].field_2092ae_Dne <= n2) {
                NMq nMq = nMqArray[n];
                nMqArray[n] = null;
                return nMq;
            }
            NMq nMq = nMqArray[n].method_9e6e1a08_Dne(n2);
            if (nMqArray[n].field_2092ae_Dne == 0) {
                nMqArray[n] = null;
            }
            return nMq;
        }
        return null;
    }

    public void method_7a46289a_Dne() {
        for (int i = 0; i < this.field_8360c375_Dne.length; ++i) {
            if (this.field_8360c375_Dne[i] == null) continue;
            this.field_8360c375_Dne[i].method_2b47e38_Dne(this.field_3673728_Dne.field_36c4f18_Dne, this.field_3673728_Dne, i, this.field_2092ae_Dne == i);
        }
    }

    public NMq method_9062e8fb_bzF(int n) {
        return this.field_fde07376_FWm[n];
    }

    public boolean method_7c61cf19_Dne(NMq nMq) {
        if (nMq == null) {
            return false;
        }
        try {
            int n;
            if (nMq.method_907a9d25_Qnq()) {
                int n2 = this.method_7c6f602c_FWm();
                if (n2 >= 0) {
                    this.field_8360c375_Dne[n2] = NMq.method_c9a1f574_Dne(nMq);
                    this.field_8360c375_Dne[n2].field_21260d_FWm = 5;
                    nMq.field_2092ae_Dne = 0;
                    return true;
                }
                if (this.field_3673728_Dne.field_37cb681_Dne.field_267d06_Qnq) {
                    nMq.field_2092ae_Dne = 0;
                    return true;
                }
                return false;
            }
            do {
                n = nMq.field_2092ae_Dne;
                nMq.field_2092ae_Dne = this.method_55b582c9_FWm(nMq);
            } while (nMq.field_2092ae_Dne > 0 && nMq.field_2092ae_Dne < n);
            if (nMq.field_2092ae_Dne == n && this.field_3673728_Dne.field_37cb681_Dne.field_267d06_Qnq) {
                nMq.field_2092ae_Dne = 0;
                return true;
            }
            return nMq.field_2092ae_Dne < n;
        }
        catch (Throwable throwable) {
            McM mcM = McM.method_948e60df_Dne(throwable, "Adding item to inventory");
            Noo noo = mcM.method_284dc627_Dne("Item being added");
            noo.method_5e295ec0_Dne("Item ID", nMq.field_2e5f1b_bzF);
            noo.method_5e295ec0_Dne("Item data", nMq.method_907a9d14_Qnq());
            noo.method_2aeeb7ad_Dne("Item name", new Alk(this, nMq));
            throw new kaJ(mcM);
        }
    }

    public int method_bb7dd813_Dne(sMa sMa2) {
        NMq nMq = this.method_9e6e1a08_Dne(this.field_2092ae_Dne);
        return nMq != null ? nMq.method_bb7dd813_Dne(sMa2) : 1;
    }

    public int method_16cca6d_Dne(int n, int n2) {
        NMq nMq;
        int n3;
        int n4 = 0;
        for (n3 = 0; n3 < this.field_8360c375_Dne.length; ++n3) {
            nMq = this.field_8360c375_Dne[n3];
            if (nMq == null || n > -1 && nMq.field_2e5f1b_bzF != n || n2 > -1 && nMq.method_907a9d14_Qnq() != n2) continue;
            n4 += nMq.field_2092ae_Dne;
            this.field_8360c375_Dne[n3] = null;
        }
        for (n3 = 0; n3 < this.field_fde07376_FWm.length; ++n3) {
            nMq = this.field_fde07376_FWm[n3];
            if (nMq == null || n > -1 && nMq.field_2e5f1b_bzF != n || n2 > -1 && nMq.method_907a9d14_Qnq() != n2) continue;
            n4 += nMq.field_2092ae_Dne;
            this.field_fde07376_FWm[n3] = null;
        }
        return n4;
    }

    public boolean method_ce7f5dad_Dne(int n) {
        int n2 = this.method_ce7f5d9c_Dne(n);
        if (n2 < 0) {
            return false;
        }
        if (--this.field_8360c375_Dne[n2].field_2092ae_Dne <= 0) {
            this.field_8360c375_Dne[n2] = null;
        }
        return true;
    }

    private int method_55b582c9_FWm(NMq nMq) {
        int n = nMq.field_2e5f1b_bzF;
        int n2 = nMq.field_2092ae_Dne;
        if (nMq.method_7c6f602c_FWm() == 1) {
            int n3 = this.method_7c6f602c_FWm();
            if (n3 < 0) {
                return n2;
            }
            if (this.field_8360c375_Dne[n3] == null) {
                this.field_8360c375_Dne[n3] = NMq.method_c9a1f574_Dne(nMq);
            }
            return 0;
        }
        int n4 = this.method_7c61cf08_Dne(nMq);
        if (n4 < 0) {
            n4 = this.method_7c6f602c_FWm();
        }
        if (n4 < 0) {
            return n2;
        }
        if (this.field_8360c375_Dne[n4] == null) {
            this.field_8360c375_Dne[n4] = new NMq(n, 0, nMq.method_907a9d14_Qnq());
            if (nMq.method_a98a0664_aFZ()) {
                this.field_8360c375_Dne[n4].method_66a36cd8_FWm((WkD)nMq.method_230886fb_Dne().method_23130705_Dne());
            }
        }
        int n5 = n2;
        if (n2 > this.field_8360c375_Dne[n4].method_7c6f602c_FWm() - this.field_8360c375_Dne[n4].field_2092ae_Dne) {
            n5 = this.field_8360c375_Dne[n4].method_7c6f602c_FWm() - this.field_8360c375_Dne[n4].field_2092ae_Dne;
        }
        if (n5 > this.method_a98a0653_aFZ() - this.field_8360c375_Dne[n4].field_2092ae_Dne) {
            n5 = this.method_a98a0653_aFZ() - this.field_8360c375_Dne[n4].field_2092ae_Dne;
        }
        if (n5 == 0) {
            return n2;
        }
        this.field_8360c375_Dne[n4].field_2092ae_Dne += n5;
        this.field_8360c375_Dne[n4].field_21260d_FWm = 5;
        return n2 -= n5;
    }

    public void method_ce7f5da9_Dne(int n) {
        if (n > 0) {
            n = 1;
        }
        if (n < 0) {
            n = -1;
        }
        this.field_2092ae_Dne -= n;
        while (this.field_2092ae_Dne < 0) {
            this.field_2092ae_Dne += 9;
        }
        while (this.field_2092ae_Dne >= 9) {
            this.field_2092ae_Dne -= 9;
        }
    }

    @Override
    public boolean method_6e3a6b6a_Dne(int n, NMq nMq) {
        return true;
    }

    @Override
    public NMq method_77c1cdc9_FWm(int n) {
        NMq[] nMqArray = this.field_8360c375_Dne;
        if (n >= this.field_8360c375_Dne.length) {
            nMqArray = this.field_fde07376_FWm;
            n -= this.field_8360c375_Dne.length;
        }
        if (nMqArray[n] != null) {
            NMq nMq = nMqArray[n];
            nMqArray[n] = null;
            return nMq;
        }
        return null;
    }

    public void method_597a6e7a_Dne(int n, int n2, boolean bl, boolean bl2) {
        boolean bl3 = true;
        this.field_36a761a_Dne = this.method_23040479_Dne();
        int n3 = bl ? this.method_1e26964c_FWm(n, n2) : this.method_ce7f5d9c_Dne(n);
        if (n3 >= 0 && n3 < 9) {
            this.field_2092ae_Dne = n3;
        } else if (bl2 && n > 0) {
            int n4 = this.method_7c6f602c_FWm();
            if (n4 >= 0 && n4 < 9) {
                this.field_2092ae_Dne = n4;
            }
            this.method_8e08f0ad_Dne(dEr.field_836aa5b6_Dne[n], n2);
        }
    }

    public boolean method_117d19ee_FWm(int n) {
        int n2 = this.method_ce7f5d9c_Dne(n);
        return n2 >= 0;
    }

    public void method_7c61cf15_Dne(NMq nMq) {
        this.field_202441f9_FWm = nMq;
    }

    public static int method_7a46288d_Dne() {
        return 9;
    }

    @Override
    public void method_6e3a6b66_Dne(int n, NMq nMq) {
        NMq[] nMqArray = this.field_8360c375_Dne;
        if (n >= nMqArray.length) {
            n -= nMqArray.length;
            nMqArray = this.field_fde07376_FWm;
        }
        nMqArray[n] = nMq;
    }

    @Override
    public void method_582b297_a_() {
        this.field_2092bf_Dne = true;
    }

    public float method_c74bdb18_Dne(zKP zKP2) {
        float f = 1.0f;
        if (this.field_8360c375_Dne[this.field_2092ae_Dne] != null) {
            f *= this.field_8360c375_Dne[this.field_2092ae_Dne].method_c74bdb18_Dne(zKP2);
        }
        return f;
    }

    public boolean method_55b582da_FWm(NMq nMq) {
        int n;
        for (n = 0; n < this.field_fde07376_FWm.length; ++n) {
            if (this.field_fde07376_FWm[n] == null || !this.field_fde07376_FWm[n].method_7c61cf19_Dne(nMq)) continue;
            return true;
        }
        for (n = 0; n < this.field_8360c375_Dne.length; ++n) {
            if (this.field_8360c375_Dne[n] == null || !this.field_8360c375_Dne[n].method_7c61cf19_Dne(nMq)) continue;
            return true;
        }
        return false;
    }

    public void method_117d19ea_FWm(int n) {
        if ((n /= 4) < 1) {
            n = 1;
        }
        for (int i = 0; i < this.field_fde07376_FWm.length; ++i) {
            if (this.field_fde07376_FWm[i] == null || !(this.field_fde07376_FWm[i].method_230de6ba_Dne() instanceof qoi_0)) continue;
            this.field_fde07376_FWm[i].method_60f1bf3f_Dne(n, this.field_3673728_Dne);
            if (this.field_fde07376_FWm[i].field_2092ae_Dne != 0) continue;
            this.field_fde07376_FWm[i] = null;
        }
    }

    public NMq method_23040479_Dne() {
        return this.field_2092ae_Dne < 9 && this.field_2092ae_Dne >= 0 ? this.field_8360c375_Dne[this.field_2092ae_Dne] : null;
    }

    public NMq method_f87a5498_FWm() {
        return this.field_202441f9_FWm;
    }

    public void method_b2658362_Dne(mbZ mbZ2) {
        this.field_8360c375_Dne = new NMq[36];
        this.field_fde07376_FWm = new NMq[4];
        for (int i = 0; i < mbZ2.method_7a46288d_Dne(); ++i) {
            WkD wkD = (WkD)mbZ2.method_77d0d055_FWm(i);
            int n = wkD.method_8f501fd0_Dne("Slot") & 0xFF;
            NMq nMq = NMq.method_7da70e76_Dne(wkD);
            if (nMq == null) continue;
            if (n >= 0 && n < this.field_8360c375_Dne.length) {
                this.field_8360c375_Dne[n] = nMq;
            }
            if (n < 100 || n >= this.field_fde07376_FWm.length + 100) continue;
            this.field_fde07376_FWm[n - 100] = nMq;
        }
    }

    @Override
    public String method_9fc39d88_b_() {
        return "container.inventory";
    }

    @Override
    public void method_5f36e9f_i_() {
    }

    public void method_907a9d21_Qnq() {
        int n;
        for (n = 0; n < this.field_8360c375_Dne.length; ++n) {
            if (this.field_8360c375_Dne[n] == null) continue;
            this.field_3673728_Dne.method_4ed6cb02_Dne(this.field_8360c375_Dne[n], true);
            this.field_8360c375_Dne[n] = null;
        }
        for (n = 0; n < this.field_fde07376_FWm.length; ++n) {
            if (this.field_fde07376_FWm[n] == null) continue;
            this.field_3673728_Dne.method_4ed6cb02_Dne(this.field_fde07376_FWm[n], true);
            this.field_fde07376_FWm[n] = null;
        }
    }

    private int method_1e26964c_FWm(int n, int n2) {
        for (int i = 0; i < this.field_8360c375_Dne.length; ++i) {
            if (this.field_8360c375_Dne[i] == null || this.field_8360c375_Dne[i].field_2e5f1b_bzF != n || this.field_8360c375_Dne[i].method_907a9d14_Qnq() != n2) continue;
            return i;
        }
        return -1;
    }

    private int method_ce7f5d9c_Dne(int n) {
        for (int i = 0; i < this.field_8360c375_Dne.length; ++i) {
            if (this.field_8360c375_Dne[i] == null || this.field_8360c375_Dne[i].field_2e5f1b_bzF != n) continue;
            return i;
        }
        return -1;
    }

    @Override
    public boolean method_5acf91e_d_() {
        return false;
    }

    @Override
    public void method_ae128dc7_bzF() {
    }

    @Override
    public int method_a98a0653_aFZ() {
        return erC.field_2092ae_Dne;
    }

    public boolean method_c74bdb2c_Dne(zKP zKP2) {
        if (zKP2.field_368fd23_Dne.method_b0a28148_div()) {
            return true;
        }
        NMq nMq = this.method_9e6e1a08_Dne(this.field_2092ae_Dne);
        return nMq != null ? nMq.method_c74bdb2c_Dne(zKP2) : false;
    }

    public void method_8e08f0ad_Dne(dEr dEr2, int n) {
        if (dEr2 != null) {
            int n2 = this.method_1e26964c_FWm(dEr2.field_267cf5_Qnq, n);
            if (n2 >= 0) {
                this.field_8360c375_Dne[n2] = this.field_8360c375_Dne[this.field_2092ae_Dne];
            }
            if (this.field_36a761a_Dne != null && this.field_36a761a_Dne.method_b0a28148_div() && this.method_1e26964c_FWm(this.field_36a761a_Dne.field_2e5f1b_bzF, this.field_36a761a_Dne.method_ae128dba_bzF()) == this.field_2092ae_Dne) {
                return;
            }
            this.field_8360c375_Dne[this.field_2092ae_Dne] = new NMq(dEr.field_836aa5b6_Dne[dEr2.field_267cf5_Qnq], 1, n);
        }
    }

    public MOS(FiG fiG) {
        this.field_3673728_Dne = fiG;
    }

    private int method_7c61cf08_Dne(NMq nMq) {
        for (int i = 0; i < this.field_8360c375_Dne.length; ++i) {
            if (this.field_8360c375_Dne[i] == null || this.field_8360c375_Dne[i].field_2e5f1b_bzF != nMq.field_2e5f1b_bzF || !this.field_8360c375_Dne[i].method_7a46289e_Dne() || this.field_8360c375_Dne[i].field_2092ae_Dne >= this.field_8360c375_Dne[i].method_7c6f602c_FWm() || this.field_8360c375_Dne[i].field_2092ae_Dne >= this.method_a98a0653_aFZ() || this.field_8360c375_Dne[i].method_ae128dcb_bzF() && this.field_8360c375_Dne[i].method_907a9d14_Qnq() != nMq.method_907a9d14_Qnq() || !NMq.method_a981fd7e_Dne(this.field_8360c375_Dne[i], nMq)) continue;
            return i;
        }
        return -1;
    }
}

