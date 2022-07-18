package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class CiF
extends sMa {
    public WkD field_36ef89c_Dne = null;
    public int field_2092ae_Dne;
    public int field_2e5f1b_bzF = 0;
    private boolean field_2e8497_ceE = false;
    private boolean field_21261e_FWm = false;
    private float field_2092ab_Dne = 2.0f;
    private int field_267cf5_Qnq = 40;
    public boolean field_2092bf_Dne = true;
    public int field_21260d_FWm;

    public CiF(Qnq qnq, double d, double d2, double d3, int n, int n2) {
        super(qnq);
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_2e5f2c_bzF = true;
        this.method_16b621a_Dne(0.98f, 0.98f);
        this.field_36b0a6_udO = this.field_367151_trS / 2.0f;
        this.method_2961957_bzF(d, d2, d3);
        this.field_291868_XHL = 0.0;
        this.field_2a9ad1_Zpi = 0.0;
        this.field_31b811_kGO = 0.0;
        this.field_2d29ef_aFZ = d;
        this.field_388da1_zGp = d2;
        this.field_20b852_DyG = d3;
    }

    @Override
    public boolean method_8c71d205_OdI() {
        return false;
    }

    public CiF(Qnq qnq, double d, double d2, double d3, int n) {
        this(qnq, d, d2, d3, n, 0);
    }

    @Override
    protected void method_ce7f5266_Dne(float f) {
        int n;
        if (this.field_2e8497_ceE && (n = geR.method_117d0e9a_FWm(f - 1.0f)) > 0) {
            ArrayList<sMa> arrayList = new ArrayList(this.field_36c4f18_Dne.method_71df22e6_FWm(this, this.field_373a3ed_Dne));
            zBn zBn2 = this.field_2092ae_Dne == zKP.field_9225485d_etZ.field_21260d_FWm ? zBn.field_a22e7e2e_kGO : zBn.field_af0ef541_udO;
            for (sMa sMa2 : arrayList) {
                sMa2.method_147b2066_Dne(zBn2, Math.min(geR.method_ce7f5259_Dne((float)n * this.field_2092ab_Dne), this.field_267cf5_Qnq));
            }
            if (this.field_2092ae_Dne == zKP.field_9225485d_etZ.field_21260d_FWm && (double)this.field_7331eae7_Dne.nextFloat() < (double)0.05f + (double)n * 0.05) {
                int n2 = this.field_21260d_FWm >> 2;
                int n3 = this.field_21260d_FWm & 3;
                if (++n2 > 2) {
                    this.field_21261e_FWm = true;
                } else {
                    this.field_21260d_FWm = n3 | n2 << 2;
                }
            }
        }
    }

    @Override
    public float method_7a46288a_Dne() {
        return 0.0f;
    }

    @Override
    protected void method_66a36cd8_FWm(WkD wkD) {
        this.field_2092ae_Dne = wkD.method_8f501fe8_Dne("TileID") ? wkD.method_8f501fd7_Dne("TileID") : wkD.method_8f501fd0_Dne("Tile") & 0xFF;
        this.field_21260d_FWm = wkD.method_8f501fd0_Dne("Data") & 0xFF;
        this.field_2e5f1b_bzF = wkD.method_8f501fd0_Dne("Time") & 0xFF;
        if (wkD.method_8f501fe8_Dne("HurtEntities")) {
            this.field_2e8497_ceE = wkD.method_110c4dc7_FWm("HurtEntities");
            this.field_2092ab_Dne = wkD.method_8f501fd4_Dne("FallHurtAmount");
            this.field_267cf5_Qnq = wkD.method_8f501fd7_Dne("FallHurtMax");
        } else if (this.field_2092ae_Dne == zKP.field_9225485d_etZ.field_21260d_FWm) {
            this.field_2e8497_ceE = true;
        }
        if (wkD.method_8f501fe8_Dne("DropItem")) {
            this.field_2092bf_Dne = wkD.method_110c4dc7_FWm("DropItem");
        }
        if (wkD.method_8f501fe8_Dne("TileEntityData")) {
            this.field_36ef89c_Dne = wkD.method_2851c945_Dne("TileEntityData");
        }
        if (this.field_2092ae_Dne == 0) {
            this.field_2092ae_Dne = zKP.field_5ced441_IjH.field_21260d_FWm;
        }
    }

    @Override
    public boolean method_baa39406_kGO() {
        return !this.field_2a9ae7_Zpi;
    }

    @Override
    protected boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    public void method_7a46289a_Dne() {
        if (this.field_2092ae_Dne == 0) {
            this.method_5d73f9d_g_();
        } else {
            this.field_2d29ef_aFZ = this.field_2f0dd3_div;
            this.field_388da1_zGp = this.field_22c5fd_IjH;
            this.field_20b852_DyG = this.field_334487_mrb;
            ++this.field_2e5f1b_bzF;
            this.field_2a9ad1_Zpi -= (double)0.04f;
            this.method_2be429a4_Dne(this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO);
            this.field_291868_XHL *= (double)0.98f;
            this.field_2a9ad1_Zpi *= (double)0.98f;
            this.field_31b811_kGO *= (double)0.98f;
            if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
                int n = geR.method_117d0718_FWm(this.field_2f0dd3_div);
                int n2 = geR.method_117d0718_FWm(this.field_22c5fd_IjH);
                int n3 = geR.method_117d0718_FWm(this.field_334487_mrb);
                if (this.field_2e5f1b_bzF == 1) {
                    if (this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n, n2, n3) != this.field_2092ae_Dne) {
                        this.method_5d73f9d_g_();
                        return;
                    }
                    this.field_36c4f18_Dne.method_2e7161e6_Qnq(n, n2, n3);
                }
                if (this.field_2d2a05_aFZ) {
                    this.field_291868_XHL *= (double)0.7f;
                    this.field_31b811_kGO *= (double)0.7f;
                    this.field_2a9ad1_Zpi *= -0.5;
                    if (this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n, n2, n3) != zKP.field_37c4776_Dne.field_21260d_FWm) {
                        this.method_5d73f9d_g_();
                        if (!this.field_21261e_FWm && this.field_36c4f18_Dne.method_1889bc82_Dne(this.field_2092ae_Dne, n, n2, n3, true, 1, null, null) && !ZgW.method_54527961_bzF(this.field_36c4f18_Dne, n, n2 - 1, n3) && this.field_36c4f18_Dne.method_17d7ea9d_FWm(n, n2, n3, this.field_2092ae_Dne, this.field_21260d_FWm, 3)) {
                            ipD ipD2;
                            if (zKP.field_8374b848_Dne[this.field_2092ae_Dne] instanceof ZgW) {
                                ((ZgW)zKP.field_8374b848_Dne[this.field_2092ae_Dne]).method_c216a76_a_(this.field_36c4f18_Dne, n, n2, n3, this.field_21260d_FWm);
                            }
                            if (this.field_36ef89c_Dne != null && zKP.field_8374b848_Dne[this.field_2092ae_Dne] instanceof sCQ && (ipD2 = this.field_36c4f18_Dne.method_d98e681d_Dne(n, n2, n3)) != null) {
                                WkD wkD = new WkD();
                                ipD2.method_66a36cd8_FWm(wkD);
                                for (oNe oNe2 : this.field_36ef89c_Dne.method_be5f586d_Dne()) {
                                    if (oNe2.method_eecad346_Dne().equals("x") || oNe2.method_eecad346_Dne().equals("y") || oNe2.method_eecad346_Dne().equals("z")) continue;
                                    wkD.method_58996597_Dne(oNe2.method_eecad346_Dne(), oNe2.method_23130705_Dne());
                                }
                                ipD2.method_8d4fb917_Dne(wkD);
                                ipD2.method_582b297_a_();
                            }
                        } else if (this.field_2092bf_Dne && !this.field_21261e_FWm) {
                            this.method_2cda29ee_Dne(new NMq(this.field_2092ae_Dne, 1, zKP.field_8374b848_Dne[this.field_2092ae_Dne].method_ce7f5d9c_Dne(this.field_21260d_FWm)), 0.0f);
                        }
                    }
                } else if (this.field_2e5f1b_bzF > 100 && !this.field_36c4f18_Dne.field_2d2a05_aFZ && (n2 < 1 || n2 > 256) || this.field_2e5f1b_bzF > 600) {
                    if (this.field_2092bf_Dne) {
                        this.method_2cda29ee_Dne(new NMq(this.field_2092ae_Dne, 1, zKP.field_8374b848_Dne[this.field_2092ae_Dne].method_ce7f5d9c_Dne(this.field_21260d_FWm)), 0.0f);
                    }
                    this.method_5d73f9d_g_();
                }
            }
        }
    }

    public void method_117d59bb_FWm(boolean bl) {
        this.field_2e8497_ceE = bl;
    }

    public CiF(Qnq qnq) {
        super(qnq);
    }

    @Override
    protected void method_8d4fb917_Dne(WkD wkD) {
        wkD.method_5ab43558_Dne("Tile", (byte)this.field_2092ae_Dne);
        wkD.method_5ab44f9f_Dne("TileID", this.field_2092ae_Dne);
        wkD.method_5ab43558_Dne("Data", (byte)this.field_21260d_FWm);
        wkD.method_5ab43558_Dne("Time", (byte)this.field_2e5f1b_bzF);
        wkD.method_5ab48f70_Dne("DropItem", this.field_2092bf_Dne);
        wkD.method_5ab48f70_Dne("HurtEntities", this.field_2e8497_ceE);
        wkD.method_5ab4445c_Dne("FallHurtAmount", this.field_2092ab_Dne);
        wkD.method_5ab44f9f_Dne("FallHurtMax", this.field_267cf5_Qnq);
        if (this.field_36ef89c_Dne != null) {
            wkD.method_312ec00d_Dne("TileEntityData", this.field_36ef89c_Dne);
        }
    }

    @Override
    protected void method_7c6f6039_FWm() {
    }

    @Override
    public void method_7e400579_Dne(Noo noo) {
        super.method_7e400579_Dne(noo);
        noo.method_5e295ec0_Dne("Immitating block ID", this.field_2092ae_Dne);
        noo.method_5e295ec0_Dne("Immitating block data", this.field_21260d_FWm);
    }

    public Qnq method_2305dd77_Dne() {
        return this.field_36c4f18_Dne;
    }
}

