package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class NMq {
    private BPY field_3650a01_Dne = null;
    public WkD field_36ef89c_Dne;
    public int field_21260d_FWm;
    private int field_267cf5_Qnq;
    public int field_2092ae_Dne = 0;
    public int field_2e5f1b_bzF;

    public int method_a98a0653_aFZ() {
        return dEr.field_836aa5b6_Dne[this.field_2e5f1b_bzF].method_a98a0653_aFZ();
    }

    public NMq(zKP zKP2, int n) {
        this(zKP2.field_21260d_FWm, n, 0);
    }

    public NMq method_9e6e1a08_Dne(int n) {
        NMq nMq = new NMq(this.field_2e5f1b_bzF, n, this.field_267cf5_Qnq);
        if (this.field_36ef89c_Dne != null) {
            nMq.field_36ef89c_Dne = (WkD)this.field_36ef89c_Dne.method_23130705_Dne();
        }
        this.field_2092ae_Dne -= n;
        return nMq;
    }

    public String method_eecad346_Dne() {
        return dEr.field_836aa5b6_Dne[this.field_2e5f1b_bzF].method_10c7922b_Dne(this);
    }

    public int method_d44b4585_zGp() {
        return this.method_230de6ba_Dne().method_e4cfb2b_a_(this);
    }

    public boolean method_2bdf899a_Dne(FiG fiG, Qnq qnq, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        boolean bl = this.method_230de6ba_Dne().method_4ddc487f_Dne(this, fiG, qnq, n, n2, n3, n4, f, f2, f3);
        if (bl) {
            fiG.method_df3461c5_Dne(trP.field_5a147b51_bzF[this.field_2e5f1b_bzF], 1);
        }
        return bl;
    }

    public static NMq method_c9a1f574_Dne(NMq nMq) {
        return nMq == null ? null : nMq.method_23040479_Dne();
    }

    public List method_38697b96_Dne(FiG fiG, boolean bl) {
        Object object;
        ArrayList<String> arrayList = new ArrayList<String>();
        dEr dEr2 = dEr.field_836aa5b6_Dne[this.field_2e5f1b_bzF];
        String string = this.method_d1f1ed87_FWm();
        if (this.method_d44b4596_zGp()) {
            string = (Object)((Object)Dne.field_75727fbe_EyB) + string + (Object)((Object)Dne.field_d3fa959_FfS);
        }
        if (bl) {
            object = "";
            if (string.length() > 0) {
                string = string + " (";
                object = ")";
            }
            string = this.method_ae128dcb_bzF() ? string + String.format("#%04d/%d%s", this.field_2e5f1b_bzF, this.field_267cf5_Qnq, object) : string + String.format("#%04d%s", this.field_2e5f1b_bzF, object);
        } else if (!this.method_d44b4596_zGp() && this.field_2e5f1b_bzF == dEr.field_3792594_Dne.field_267cf5_Qnq) {
            string = string + " #" + this.field_267cf5_Qnq;
        }
        arrayList.add(string);
        dEr2.method_497c81fb_Dne(this, fiG, arrayList, bl);
        if (this.method_a98a0664_aFZ()) {
            int n;
            object = this.method_23126806_Dne();
            if (object != null) {
                for (int i = 0; i < ((mbZ)object).method_7a46288d_Dne(); ++i) {
                    short s = ((WkD)((mbZ)object).method_77d0d055_FWm(i)).method_8f501fe1_Dne("id");
                    n = ((WkD)((mbZ)object).method_77d0d055_FWm(i)).method_8f501fe1_Dne("lvl");
                    if (ycv.field_8374a29b_Dne[s] == null) continue;
                    arrayList.add(ycv.field_8374a29b_Dne[s].method_2c0e7e17_Dne(n));
                }
            }
            if (this.field_36ef89c_Dne.method_8f501fe8_Dne("display")) {
                mbZ mbZ2;
                WkD wkD = this.field_36ef89c_Dne.method_2851c945_Dne("display");
                if (wkD.method_8f501fe8_Dne("color")) {
                    if (bl) {
                        arrayList.add("Color: #" + Integer.toHexString(wkD.method_8f501fd7_Dne("color")).toUpperCase());
                    } else {
                        arrayList.add((Object)((Object)Dne.field_75727fbe_EyB) + KGL.method_39193c_Dne("item.dyed"));
                    }
                }
                if (wkD.method_8f501fe8_Dne("Lore") && (mbZ2 = wkD.method_285baa50_Dne("Lore")).method_7a46288d_Dne() > 0) {
                    for (n = 0; n < mbZ2.method_7a46288d_Dne(); ++n) {
                        arrayList.add((Object)((Object)Dne.field_f09823c9_zGp) + "" + (Object)((Object)Dne.field_75727fbe_EyB) + ((QNx)mbZ2.method_77d0d055_FWm((int)n)).field_569fcf45_Dne);
                    }
                }
            }
        }
        if (bl && this.method_907a9d25_Qnq()) {
            arrayList.add("Durability: " + (this.method_a98a0653_aFZ() - this.method_ae128dba_bzF()) + " / " + this.method_a98a0653_aFZ());
        }
        return arrayList;
    }

    public een method_230ed2bd_Dne() {
        return this.method_230de6ba_Dne().method_c9acc3b8_Dne(this);
    }

    public boolean method_c74bdb2c_Dne(zKP zKP2) {
        return dEr.field_836aa5b6_Dne[this.field_2e5f1b_bzF].method_c74bdb2c_Dne(zKP2);
    }

    public boolean method_d44b4596_zGp() {
        return this.field_36ef89c_Dne == null ? false : (!this.field_36ef89c_Dne.method_8f501fe8_Dne("display") ? false : this.field_36ef89c_Dne.method_2851c945_Dne("display").method_8f501fe8_Dne("Name"));
    }

    public boolean method_a98a0664_aFZ() {
        return this.field_36ef89c_Dne != null;
    }

    private NMq() {
    }

    public BPY method_22fe9860_Dne() {
        return this.field_3650a01_Dne;
    }

    public void method_60f1bf3f_Dne(int n, FUH fUH) {
        if ((!(fUH instanceof FiG) || !((FiG)fUH).field_37cb681_Dne.field_267d06_Qnq) && this.method_7c6f603d_FWm() && this.method_3afb8a59_Dne(n, fUH.method_b5ceee8_Dne())) {
            fUH.method_55b582d6_FWm(this);
            if (fUH instanceof FiG) {
                ((FiG)fUH).method_df3461c5_Dne(trP.field_85a6f5b7_Qnq[this.field_2e5f1b_bzF], 1);
            }
            --this.field_2092ae_Dne;
            if (this.field_2092ae_Dne < 0) {
                this.field_2092ae_Dne = 0;
            }
            this.field_267cf5_Qnq = 0;
        }
    }

    public void method_18558da8_Dne(ycv ycv2, int n) {
        if (this.field_36ef89c_Dne == null) {
            this.method_66a36cd8_FWm(new WkD());
        }
        if (!this.field_36ef89c_Dne.method_8f501fe8_Dne("ench")) {
            this.field_36ef89c_Dne.method_58996597_Dne("ench", new mbZ("ench"));
        }
        mbZ mbZ2 = (mbZ)this.field_36ef89c_Dne.method_285c494f_Dne("ench");
        WkD wkD = new WkD();
        wkD.method_5ab47529_Dne("id", (short)ycv2.field_21260d_FWm);
        wkD.method_5ab47529_Dne("lvl", (byte)n);
        mbZ2.method_b4ba5ea1_Dne(wkD);
    }

    public void method_c5b1410a_Dne(Qnq qnq, int n, int n2, int n3, int n4, FiG fiG) {
        boolean bl = dEr.field_836aa5b6_Dne[this.field_2e5f1b_bzF].method_eec51294_Dne(this, qnq, n, n2, n3, n4, fiG);
        if (bl) {
            fiG.method_df3461c5_Dne(trP.field_5a147b51_bzF[this.field_2e5f1b_bzF], 1);
        }
    }

    public dEr method_230de6ba_Dne() {
        return dEr.field_836aa5b6_Dne[this.field_2e5f1b_bzF];
    }

    public void method_81a83afa_FWm(Qnq qnq, FiG fiG, int n) {
        this.method_230de6ba_Dne().method_682f2a9e_Dne(this, qnq, fiG, n);
    }

    public void method_55941bf9_Dne(Qnq qnq, FiG fiG, int n) {
        fiG.method_df3461c5_Dne(trP.field_fde23b9f_FWm[this.field_2e5f1b_bzF], n);
        dEr.field_836aa5b6_Dne[this.field_2e5f1b_bzF].method_c2991f86_FWm(this, qnq, fiG);
    }

    public gDn method_230f3f9a_Dne() {
        return this.method_230de6ba_Dne().method_c9ad3095_Dne(this);
    }

    public float method_c74bdb18_Dne(zKP zKP2) {
        return this.method_230de6ba_Dne().method_f46c097d_Dne(this, zKP2);
    }

    public static boolean method_68dd7a5d_FWm(NMq nMq, NMq nMq2) {
        return nMq == null && nMq2 == null ? true : (nMq != null && nMq2 != null ? nMq.method_55b582da_FWm(nMq2) : false);
    }

    public void method_8f501fe4_Dne(String string) {
        if (this.field_36ef89c_Dne == null) {
            this.field_36ef89c_Dne = new WkD("tag");
        }
        if (!this.field_36ef89c_Dne.method_8f501fe8_Dne("display")) {
            this.field_36ef89c_Dne.method_312ec00d_Dne("display", new WkD());
        }
        this.field_36ef89c_Dne.method_2851c945_Dne("display").method_abaa98ae_Dne("Name", string);
    }

    public void method_58996597_Dne(String string, oNe oNe2) {
        if (this.field_36ef89c_Dne == null) {
            this.method_66a36cd8_FWm(new WkD());
        }
        this.field_36ef89c_Dne.method_58996597_Dne(string, oNe2);
    }

    public boolean method_9a443a9d_XHL() {
        return this.field_3650a01_Dne != null;
    }

    public String method_d1f1ed87_FWm() {
        WkD wkD;
        String string = this.method_230de6ba_Dne().method_6194d772_Qnq(this);
        if (this.field_36ef89c_Dne != null && this.field_36ef89c_Dne.method_8f501fe8_Dne("display") && (wkD = this.field_36ef89c_Dne.method_2851c945_Dne("display")).method_8f501fe8_Dne("Name")) {
            string = wkD.method_39193c_Dne("Name");
        }
        return string;
    }

    public int method_bb7dd813_Dne(sMa sMa2) {
        return dEr.field_836aa5b6_Dne[this.field_2e5f1b_bzF].method_bb7dd813_Dne(sMa2);
    }

    public NMq(zKP zKP2) {
        this(zKP2, 1);
    }

    public NMq(dEr dEr2) {
        this(dEr2.field_267cf5_Qnq, 1, 0);
    }

    public static NMq method_7da70e76_Dne(WkD wkD) {
        NMq nMq = new NMq();
        nMq.method_8d4fb917_Dne(wkD);
        return nMq.method_230de6ba_Dne() != null ? nMq : null;
    }

    public int method_7ad387f6_DyG() {
        return this.method_a98a0664_aFZ() && this.field_36ef89c_Dne.method_8f501fe8_Dne("RepairCost") ? this.field_36ef89c_Dne.method_8f501fd7_Dne("RepairCost") : 0;
    }

    public int method_ae128dba_bzF() {
        return this.field_267cf5_Qnq;
    }

    public NMq(dEr dEr2, int n, int n2) {
        this(dEr2.field_267cf5_Qnq, n, n2);
    }

    public int method_907a9d14_Qnq() {
        return this.field_267cf5_Qnq;
    }

    public boolean method_ae128dcb_bzF() {
        return dEr.field_836aa5b6_Dne[this.field_2e5f1b_bzF].method_d44b4596_zGp();
    }

    public boolean method_6f1922f2_Dne(FUH fUH) {
        return dEr.field_836aa5b6_Dne[this.field_2e5f1b_bzF].method_9c395157_Dne(this, fUH);
    }

    public void method_6807053c_Dne(BPY bPY) {
        this.field_3650a01_Dne = bPY;
    }

    public boolean method_b0a28148_div() {
        return !this.method_230de6ba_Dne().method_e4cfb3c_a_(this) ? false : !this.method_8288d6f2_IjH();
    }

    public boolean method_7c6f603d_FWm() {
        return dEr.field_836aa5b6_Dne[this.field_2e5f1b_bzF].method_a98a0653_aFZ() > 0;
    }

    public mbZ method_23126806_Dne() {
        return this.field_36ef89c_Dne == null ? null : (mbZ)this.field_36ef89c_Dne.method_285c494f_Dne("ench");
    }

    public static boolean method_a981fd7e_Dne(NMq nMq, NMq nMq2) {
        return nMq == null && nMq2 == null ? true : (nMq != null && nMq2 != null ? (nMq.field_36ef89c_Dne == null && nMq2.field_36ef89c_Dne != null ? false : nMq.field_36ef89c_Dne == null || nMq.field_36ef89c_Dne.equals(nMq2.field_36ef89c_Dne)) : false);
    }

    public int method_7a46288d_Dne() {
        return this.method_230de6ba_Dne().method_ae128dba_bzF();
    }

    public WkD method_230886fb_Dne() {
        return this.field_36ef89c_Dne;
    }

    public boolean method_3afb8a59_Dne(int n, Random random) {
        if (!this.method_7c6f603d_FWm()) {
            return false;
        }
        if (n > 0) {
            int n2 = UYp.method_6e3a6b59_Dne(ycv.field_1f134604_qLR.field_21260d_FWm, this);
            int n3 = 0;
            for (int i = 0; n2 > 0 && i < n; ++i) {
                if (!Nkb.method_d0c423fe_Dne(this, n2, random)) continue;
                ++n3;
            }
            if ((n -= n3) <= 0) {
                return false;
            }
        }
        this.field_267cf5_Qnq += n;
        return this.field_267cf5_Qnq > this.method_a98a0653_aFZ();
    }

    public NMq(int n, int n2, int n3) {
        this.field_2e5f1b_bzF = n;
        this.field_2092ae_Dne = n2;
        this.field_267cf5_Qnq = n3;
        if (this.field_267cf5_Qnq < 0) {
            this.field_267cf5_Qnq = 0;
        }
    }

    public int method_7c6f602c_FWm() {
        return this.method_230de6ba_Dne().method_907a9d14_Qnq();
    }

    private boolean method_55b582da_FWm(NMq nMq) {
        return this.field_2092ae_Dne != nMq.field_2092ae_Dne ? false : (this.field_2e5f1b_bzF != nMq.field_2e5f1b_bzF ? false : (this.field_267cf5_Qnq != nMq.field_267cf5_Qnq ? false : (this.field_36ef89c_Dne == null && nMq.field_36ef89c_Dne != null ? false : this.field_36ef89c_Dne == null || this.field_36ef89c_Dne.equals(nMq.field_36ef89c_Dne))));
    }

    public GXY method_2300fc43_Dne() {
        return this.method_230de6ba_Dne().method_c99eed3e_Dne(this);
    }

    public void method_8d4fb917_Dne(WkD wkD) {
        this.field_2e5f1b_bzF = wkD.method_8f501fe1_Dne("id");
        this.field_2092ae_Dne = wkD.method_8f501fd0_Dne("Count");
        this.field_267cf5_Qnq = wkD.method_8f501fe1_Dne("Damage");
        if (this.field_267cf5_Qnq < 0) {
            this.field_267cf5_Qnq = 0;
        }
        if (wkD.method_8f501fe8_Dne("tag")) {
            this.field_36ef89c_Dne = wkD.method_2851c945_Dne("tag");
        }
    }

    public void method_117d19ea_FWm(int n) {
        if (!this.method_a98a0664_aFZ()) {
            this.field_36ef89c_Dne = new WkD("tag");
        }
        this.field_36ef89c_Dne.method_5ab44f9f_Dne("RepairCost", n);
    }

    public NMq(dEr dEr2, int n) {
        this(dEr2.field_267cf5_Qnq, n, 0);
    }

    public void method_ce7f5da9_Dne(int n) {
        this.field_267cf5_Qnq = n;
        if (this.field_267cf5_Qnq < 0) {
            this.field_267cf5_Qnq = 0;
        }
    }

    public NMq(zKP zKP2, int n, int n2) {
        this(zKP2.field_21260d_FWm, n, n2);
    }

    public boolean method_907a9d25_Qnq() {
        return this.method_7c6f603d_FWm() && this.field_267cf5_Qnq > 0;
    }

    public boolean method_8288d6f2_IjH() {
        return this.field_36ef89c_Dne != null && this.field_36ef89c_Dne.method_8f501fe8_Dne("ench");
    }

    public boolean method_7ad38807_DyG() {
        return this.method_230de6ba_Dne().method_55b582da_FWm(this);
    }

    public boolean method_c073dafc_mrb() {
        return this.method_230de6ba_Dne().method_9a443a9d_XHL();
    }

    public NMq method_23040479_Dne() {
        NMq nMq = new NMq(this.field_2e5f1b_bzF, this.field_2092ae_Dne, this.field_267cf5_Qnq);
        if (this.field_36ef89c_Dne != null) {
            nMq.field_36ef89c_Dne = (WkD)this.field_36ef89c_Dne.method_23130705_Dne();
        }
        return nMq;
    }

    public String toString() {
        return this.field_2092ae_Dne + "x" + dEr.field_836aa5b6_Dne[this.field_2e5f1b_bzF].method_d1f1ed87_FWm() + "@" + this.field_267cf5_Qnq;
    }

    public void method_2b47e38_Dne(Qnq qnq, sMa sMa2, int n, boolean bl) {
        if (this.field_21260d_FWm > 0) {
            --this.field_21260d_FWm;
        }
        dEr.field_836aa5b6_Dne[this.field_2e5f1b_bzF].method_437b4433_Dne(this, qnq, sMa2, n, bl);
    }

    public void method_d982decf_Dne(FUH fUH, FiG fiG) {
        boolean bl = dEr.field_836aa5b6_Dne[this.field_2e5f1b_bzF].method_a8f85d9_Dne(this, fUH, fiG);
        if (bl) {
            fiG.method_df3461c5_Dne(trP.field_5a147b51_bzF[this.field_2e5f1b_bzF], 1);
        }
    }

    public WkD method_7dab90f8_Dne(WkD wkD) {
        wkD.method_5ab47529_Dne("id", (short)this.field_2e5f1b_bzF);
        wkD.method_5ab43558_Dne("Count", (byte)this.field_2092ae_Dne);
        wkD.method_5ab47529_Dne("Damage", (short)this.field_267cf5_Qnq);
        if (this.field_36ef89c_Dne != null) {
            wkD.method_58996597_Dne("tag", this.field_36ef89c_Dne);
        }
        return wkD;
    }

    public NMq method_2376d988_FWm(Qnq qnq, FiG fiG) {
        return this.method_230de6ba_Dne().method_89e9a565_FWm(this, qnq, fiG);
    }

    public boolean method_7c61cf19_Dne(NMq nMq) {
        return this.field_2e5f1b_bzF == nMq.field_2e5f1b_bzF && this.field_267cf5_Qnq == nMq.field_267cf5_Qnq;
    }

    public void method_66a36cd8_FWm(WkD wkD) {
        this.field_36ef89c_Dne = wkD;
    }

    public boolean method_7a46289e_Dne() {
        return this.method_7c6f602c_FWm() > 1 && (!this.method_7c6f603d_FWm() || !this.method_907a9d25_Qnq());
    }

    public NMq method_a9f2e429_Dne(Qnq qnq, FiG fiG) {
        return this.method_230de6ba_Dne().method_d4201764_Dne(this, qnq, fiG);
    }
}

