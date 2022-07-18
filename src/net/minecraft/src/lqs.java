package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class lqs
extends ipD
implements FMb {
    public int field_21260d_FWm = 0;
    private NMq[] field_8360c375_Dne = new NMq[3];
    private static final int[] field_59d86bc_bzF;
    private static final int[] field_4039e0a_FWm;
    private String field_569fcf45_Dne;
    public int field_2092ae_Dne = 0;
    private static final int[] field_3f1c589_Dne;
    public int field_2e5f1b_bzF = 0;

    @Override
    public boolean method_703284a7_Dne(FiG fiG) {
        return this.field_36c4f18_Dne.method_d98e681d_Dne(this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp) != this ? false : fiG.method_2be42992_Dne((double)this.field_267cf5_Qnq + 0.5, (double)this.field_2d29f4_aFZ + 0.5, (double)this.field_388da6_zGp + 0.5) <= 64.0;
    }

    @Override
    public boolean method_59137461_Dne(int n, NMq nMq, int n2) {
        return this.method_6e3a6b6a_Dne(n, nMq);
    }

    @Override
    public NMq method_9e6e1a08_Dne(int n) {
        return this.field_8360c375_Dne[n];
    }

    public void method_8f501fe4_Dne(String string) {
        this.field_569fcf45_Dne = string;
    }

    @Override
    public NMq method_77c1cdc9_FWm(int n) {
        if (this.field_8360c375_Dne[n] != null) {
            NMq nMq = this.field_8360c375_Dne[n];
            this.field_8360c375_Dne[n] = null;
            return nMq;
        }
        return null;
    }

    @Override
    public void method_6e3a6b66_Dne(int n, NMq nMq) {
        this.field_8360c375_Dne[n] = nMq;
        if (nMq != null && nMq.field_2092ae_Dne > this.method_a98a0653_aFZ()) {
            nMq.field_2092ae_Dne = this.method_a98a0653_aFZ();
        }
    }

    static {
        field_3f1c589_Dne = new int[]{0};
        field_4039e0a_FWm = new int[]{2, 1};
        field_59d86bc_bzF = new int[]{1};
    }

    @Override
    public int method_a98a0653_aFZ() {
        return erC.field_2092ae_Dne;
    }

    @Override
    public NMq method_9046b659_Dne(int n, int n2) {
        if (this.field_8360c375_Dne[n] != null) {
            if (this.field_8360c375_Dne[n].field_2092ae_Dne <= n2) {
                NMq nMq = this.field_8360c375_Dne[n];
                this.field_8360c375_Dne[n] = null;
                return nMq;
            }
            NMq nMq = this.field_8360c375_Dne[n].method_9e6e1a08_Dne(n2);
            if (this.field_8360c375_Dne[n].field_2092ae_Dne == 0) {
                this.field_8360c375_Dne[n] = null;
            }
            return nMq;
        }
        return null;
    }

    @Override
    public boolean method_2c493be2_FWm(int n, NMq nMq, int n2) {
        return n2 != 0 || n != 1 || nMq.field_2e5f1b_bzF == dEr.field_5ac2e6dc_qMV.field_267cf5_Qnq;
    }

    private boolean method_ae128dcb_bzF() {
        if (this.field_8360c375_Dne[0] == null) {
            return false;
        }
        NMq nMq = cTN.method_230da64e_Dne().method_9e6e1a08_Dne(this.field_8360c375_Dne[0].method_230de6ba_Dne().field_267cf5_Qnq);
        return nMq == null ? false : (this.field_8360c375_Dne[2] == null ? true : (!this.field_8360c375_Dne[2].method_7c61cf19_Dne(nMq) ? false : (this.field_8360c375_Dne[2].field_2092ae_Dne < this.method_a98a0653_aFZ() && this.field_8360c375_Dne[2].field_2092ae_Dne < this.field_8360c375_Dne[2].method_7c6f602c_FWm() ? true : this.field_8360c375_Dne[2].field_2092ae_Dne < nMq.method_7c6f602c_FWm())));
    }

    @Override
    public void method_ae128dc7_bzF() {
    }

    public int method_ce7f5d9c_Dne(int n) {
        return this.field_2e5f1b_bzF * n / 200;
    }

    public static int method_7c61cf08_Dne(NMq nMq) {
        if (nMq == null) {
            return 0;
        }
        int n = nMq.method_230de6ba_Dne().field_267cf5_Qnq;
        dEr dEr2 = nMq.method_230de6ba_Dne();
        if (n < 256 && zKP.field_8374b848_Dne[n] != null) {
            zKP zKP2 = zKP.field_8374b848_Dne[n];
            if (zKP2 == zKP.field_5e5de549_Qnq) {
                return 150;
            }
            if (zKP2.field_368fd23_Dne == KFd.field_5e526bea_Qnq) {
                return 300;
            }
        }
        return dEr2 instanceof SgG && ((SgG)dEr2).method_eecad346_Dne().equals("WOOD") ? 200 : (dEr2 instanceof uVe && ((uVe)dEr2).method_eecad346_Dne().equals("WOOD") ? 200 : (dEr2 instanceof EZq && ((EZq)dEr2).method_eecad346_Dne().equals("WOOD") ? 200 : (n == dEr.field_d2b52a0a_oIf.field_267cf5_Qnq ? 100 : (n == dEr.field_16278184_DyG.field_267cf5_Qnq ? 1600 : (n == dEr.field_6a28e7c8_xXN.field_267cf5_Qnq ? 20000 : (n == zKP.field_7141ef33_aFZ.field_21260d_FWm ? 100 : (n == dEr.field_d1baeb7c_TpV.field_267cf5_Qnq ? 2400 : 0)))))));
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        super.method_8d4fb917_Dne(wkD);
        mbZ mbZ2 = wkD.method_285baa50_Dne("Items");
        this.field_8360c375_Dne = new NMq[this.method_907a9d14_Qnq()];
        for (int i = 0; i < mbZ2.method_7a46288d_Dne(); ++i) {
            WkD wkD2 = (WkD)mbZ2.method_77d0d055_FWm(i);
            byte by = wkD2.method_8f501fd0_Dne("Slot");
            if (by < 0 || by >= this.field_8360c375_Dne.length) continue;
            this.field_8360c375_Dne[by] = NMq.method_7da70e76_Dne(wkD2);
        }
        this.field_2092ae_Dne = wkD.method_8f501fe1_Dne("BurnTime");
        this.field_2e5f1b_bzF = wkD.method_8f501fe1_Dne("CookTime");
        this.field_21260d_FWm = lqs.method_7c61cf08_Dne(this.field_8360c375_Dne[1]);
        if (wkD.method_8f501fe8_Dne("CustomName")) {
            this.field_569fcf45_Dne = wkD.method_39193c_Dne("CustomName");
        }
    }

    @Override
    public String method_9fc39d88_b_() {
        return this.method_5acf91e_d_() ? this.field_569fcf45_Dne : "container.furnace";
    }

    public static boolean method_7c61cf19_Dne(NMq nMq) {
        return lqs.method_7c61cf08_Dne(nMq) > 0;
    }

    @Override
    public int[] method_16c585b_Dne(int n) {
        return n == 0 ? field_4039e0a_FWm : (n == 1 ? field_3f1c589_Dne : field_59d86bc_bzF);
    }

    @Override
    public boolean method_5acf91e_d_() {
        return this.field_569fcf45_Dne != null && this.field_569fcf45_Dne.length() > 0;
    }

    @Override
    public int method_907a9d14_Qnq() {
        return this.field_8360c375_Dne.length;
    }

    public boolean method_7c6f603d_FWm() {
        return this.field_2092ae_Dne > 0;
    }

    @Override
    public void method_7a46289a_Dne() {
        boolean bl = this.field_2092ae_Dne > 0;
        boolean bl2 = false;
        if (this.field_2092ae_Dne > 0) {
            --this.field_2092ae_Dne;
        }
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            if (this.field_2092ae_Dne == 0 && this.method_ae128dcb_bzF()) {
                this.field_21260d_FWm = this.field_2092ae_Dne = lqs.method_7c61cf08_Dne(this.field_8360c375_Dne[1]);
                if (this.field_2092ae_Dne > 0) {
                    bl2 = true;
                    if (this.field_8360c375_Dne[1] != null) {
                        --this.field_8360c375_Dne[1].field_2092ae_Dne;
                        if (this.field_8360c375_Dne[1].field_2092ae_Dne == 0) {
                            dEr dEr2 = this.field_8360c375_Dne[1].method_230de6ba_Dne().method_f88436d9_FWm();
                            NMq nMq = this.field_8360c375_Dne[1] = dEr2 != null ? new NMq(dEr2) : null;
                        }
                    }
                }
            }
            if (this.method_7c6f603d_FWm() && this.method_ae128dcb_bzF()) {
                ++this.field_2e5f1b_bzF;
                if (this.field_2e5f1b_bzF == 200) {
                    this.field_2e5f1b_bzF = 0;
                    this.method_a98a0660_aFZ();
                    bl2 = true;
                }
            } else {
                this.field_2e5f1b_bzF = 0;
            }
            if (bl != this.field_2092ae_Dne > 0) {
                bl2 = true;
                XXJ.method_661a2610_Dne(this.field_2092ae_Dne > 0, this.field_36c4f18_Dne, this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp);
            }
        }
        if (bl2) {
            this.method_582b297_a_();
        }
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        super.method_66a36cd8_FWm(wkD);
        wkD.method_5ab47529_Dne("BurnTime", (short)this.field_2092ae_Dne);
        wkD.method_5ab47529_Dne("CookTime", (short)this.field_2e5f1b_bzF);
        mbZ mbZ2 = new mbZ();
        for (int i = 0; i < this.field_8360c375_Dne.length; ++i) {
            if (this.field_8360c375_Dne[i] == null) continue;
            WkD wkD2 = new WkD();
            wkD2.method_5ab43558_Dne("Slot", (byte)i);
            this.field_8360c375_Dne[i].method_7dab90f8_Dne(wkD2);
            mbZ2.method_b4ba5ea1_Dne(wkD2);
        }
        wkD.method_58996597_Dne("Items", mbZ2);
        if (this.method_5acf91e_d_()) {
            wkD.method_abaa98ae_Dne("CustomName", this.field_569fcf45_Dne);
        }
    }

    public int method_117d19dd_FWm(int n) {
        if (this.field_21260d_FWm == 0) {
            this.field_21260d_FWm = 200;
        }
        return this.field_2092ae_Dne * n / this.field_21260d_FWm;
    }

    @Override
    public boolean method_6e3a6b6a_Dne(int n, NMq nMq) {
        return n == 2 ? false : (n == 1 ? lqs.method_7c61cf19_Dne(nMq) : true);
    }

    @Override
    public void method_5f36e9f_i_() {
    }

    public void method_a98a0660_aFZ() {
        if (this.method_ae128dcb_bzF()) {
            NMq nMq = cTN.method_230da64e_Dne().method_9e6e1a08_Dne(this.field_8360c375_Dne[0].method_230de6ba_Dne().field_267cf5_Qnq);
            if (this.field_8360c375_Dne[2] == null) {
                this.field_8360c375_Dne[2] = nMq.method_23040479_Dne();
            } else if (this.field_8360c375_Dne[2].field_2e5f1b_bzF == nMq.field_2e5f1b_bzF) {
                ++this.field_8360c375_Dne[2].field_2092ae_Dne;
            }
            --this.field_8360c375_Dne[0].field_2092ae_Dne;
            if (this.field_8360c375_Dne[0].field_2092ae_Dne <= 0) {
                this.field_8360c375_Dne[0] = null;
            }
        }
    }
}

