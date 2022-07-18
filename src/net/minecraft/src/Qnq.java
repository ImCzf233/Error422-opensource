package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

public abstract class Qnq
implements Zpi {
    public final Bkx field_365731d_Dne;
    public boolean field_2092bf_Dne = false;
    private final dLs field_37472c1_Dne;
    public List field_f27c122c_Dne = new ArrayList();
    protected float field_2e5f18_bzF;
    public xoY field_37e0a6a_Dne;
    public boolean field_21261e_FWm;
    int[] field_3f1c589_Dne;
    private long field_2092af_Dne = 0xFFFFFFL;
    public Random field_7331eae7_Dne;
    private List field_f0d8c563_DyG;
    public int field_2092ae_Dne = 0;
    public final Jik field_3690d00_Dne;
    protected List field_6a0474ed_FWm = new ArrayList();
    protected float field_2092ab_Dne;
    public boolean field_2d2a05_aFZ = false;
    protected boolean field_2e5f2c_bzF = true;
    protected final iDE field_3769502_Dne;
    protected final int field_2e5f1b_bzF = 1013904223;
    private boolean field_388db7_zGp;
    protected List field_d97fc834_zGp;
    protected final oJI field_379663e_Dne;
    private int field_388da6_zGp;
    protected SFA field_36c9bde_Dne;
    public final PrX field_36be6b6_Dne;
    private ArrayList field_dc9cb15_Dne;
    protected float field_21260a_FWm;
    protected Set<Sxs> field_83b48b6a_Dne;
    protected float field_267cf2_Qnq;
    private final Calendar field_56371c0c_Dne;
    public int field_2d29f4_aFZ;
    public int field_267cf5_Qnq = 0;
    protected int field_21260d_FWm;
    public LLx field_3698a74_Dne;
    private final ziS field_37edbe8_Dne;
    public List field_10b14626_aFZ;
    private List field_2c369dc2_div;
    public List field_2c197105_Qnq;
    protected boolean field_267d06_Qnq = true;
    protected ZfC field_37042d5_Dne;
    public List field_7eb83e1f_bzF = new ArrayList();

    public void method_4b7c1628_zGp(sMa sMa2) {
        int n = geR.method_117d0718_FWm(sMa2.field_2f0dd3_div / 16.0);
        int n2 = geR.method_117d0718_FWm(sMa2.field_334487_mrb / 16.0);
        int n3 = 2;
        for (int i = n - n3; i <= n + n3; ++i) {
            for (int j = n2 - n3; j <= n2 + n3; ++j) {
                this.method_e1796070_FWm(i, j);
            }
        }
        if (!this.field_f27c122c_Dne.contains(sMa2)) {
            this.field_f27c122c_Dne.add(sMa2);
        }
    }

    public void method_7a46289a_Dne() {
        this.method_76d9fc43_aFZ(8, 64, 8);
    }

    public float method_87b72d50_aFZ(float f) {
        return (this.field_2e5f18_bzF + (this.field_267cf2_Qnq - this.field_2e5f18_bzF) * f) * this.method_b51dd45e_zGp(f);
    }

    public void method_58fe7b07_bzF(int n, int n2, int n3, int n4) {
        this.method_9fbb4d61_Qnq(n - 1, n2, n3, n4);
        this.method_9fbb4d61_Qnq(n + 1, n2, n3, n4);
        this.method_9fbb4d61_Qnq(n, n2 - 1, n3, n4);
        this.method_9fbb4d61_Qnq(n, n2 + 1, n3, n4);
        this.method_9fbb4d61_Qnq(n, n2, n3 - 1, n4);
        this.method_9fbb4d61_Qnq(n, n2, n3 + 1, n4);
    }

    public chN method_ffc5552e_Dne(float f) {
        float f2;
        float f3;
        float f4 = this.method_117d0e97_FWm(f);
        float f5 = geR.method_117d0e97_FWm(f4 * (float)Math.PI * 2.0f) * 2.0f + 0.5f;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        float f6 = (float)(this.field_2092af_Dne >> 16 & 0xFFL) / 255.0f;
        float f7 = (float)(this.field_2092af_Dne >> 8 & 0xFFL) / 255.0f;
        float f8 = (float)(this.field_2092af_Dne & 0xFFL) / 255.0f;
        float f9 = this.method_b51dd45e_zGp(f);
        if (f9 > 0.0f) {
            f3 = (f6 * 0.3f + f7 * 0.59f + f8 * 0.11f) * 0.6f;
            f2 = 1.0f - f9 * 0.95f;
            f6 = f6 * f2 + f3 * (1.0f - f2);
            f7 = f7 * f2 + f3 * (1.0f - f2);
            f8 = f8 * f2 + f3 * (1.0f - f2);
        }
        f6 *= f5 * 0.9f + 0.1f;
        f7 *= f5 * 0.9f + 0.1f;
        f8 *= f5 * 0.85f + 0.15f;
        f3 = this.method_87b72d50_aFZ(f);
        if (f3 > 0.0f) {
            f2 = (f6 * 0.3f + f7 * 0.59f + f8 * 0.11f) * 0.2f;
            float f10 = 1.0f - f3 * 0.95f;
            f6 = f6 * f10 + f2 * (1.0f - f10);
            f7 = f7 * f10 + f2 * (1.0f - f10);
            f8 = f8 * f10 + f2 * (1.0f - f10);
        }
        return this.method_23186a47_Dne().method_e4505d6c_Dne(f6, f7, f8);
    }

    public wHH method_9210e274_Dne(chN chN2, chN chN3, boolean bl, boolean bl2) {
        if (!(Double.isNaN(chN2.field_2092a9_Dne) || Double.isNaN(chN2.field_212608_FWm) || Double.isNaN(chN2.field_2e5f16_bzF))) {
            if (!(Double.isNaN(chN3.field_2092a9_Dne) || Double.isNaN(chN3.field_212608_FWm) || Double.isNaN(chN3.field_2e5f16_bzF))) {
                wHH wHH2;
                int n = geR.method_117d0718_FWm(chN3.field_2092a9_Dne);
                int n2 = geR.method_117d0718_FWm(chN3.field_212608_FWm);
                int n3 = geR.method_117d0718_FWm(chN3.field_2e5f16_bzF);
                int n4 = geR.method_117d0718_FWm(chN2.field_2092a9_Dne);
                int n5 = geR.method_117d0718_FWm(chN2.field_212608_FWm);
                int n6 = geR.method_117d0718_FWm(chN2.field_2e5f16_bzF);
                int n7 = this.method_2c2cf7bc_Dne(n4, n5, n6);
                int n8 = this.method_2dee76f_bzF(n4, n5, n6);
                zKP zKP2 = zKP.field_8374b848_Dne[n7];
                if ((!bl2 || zKP2 == null || zKP2.method_8c85fe2_Dne(this, n4, n5, n6) != null) && n7 > 0 && zKP2.method_16d0a4f_Dne(n8, bl) && (wHH2 = zKP2.method_acf3908a_Dne(this, n4, n5, n6, chN2, chN3)) != null) {
                    return wHH2;
                }
                n7 = 200;
                while (n7-- >= 0) {
                    wHH wHH3;
                    int n9;
                    if (Double.isNaN(chN2.field_2092a9_Dne) || Double.isNaN(chN2.field_212608_FWm) || Double.isNaN(chN2.field_2e5f16_bzF)) {
                        return null;
                    }
                    if (n4 == n && n5 == n2 && n6 == n3) {
                        return null;
                    }
                    boolean bl3 = true;
                    boolean bl4 = true;
                    boolean bl5 = true;
                    double d = 999.0;
                    double d2 = 999.0;
                    double d3 = 999.0;
                    if (n > n4) {
                        d = (double)n4 + 1.0;
                    } else if (n < n4) {
                        d = (double)n4 + 0.0;
                    } else {
                        bl3 = false;
                    }
                    if (n2 > n5) {
                        d2 = (double)n5 + 1.0;
                    } else if (n2 < n5) {
                        d2 = (double)n5 + 0.0;
                    } else {
                        bl4 = false;
                    }
                    if (n3 > n6) {
                        d3 = (double)n6 + 1.0;
                    } else if (n3 < n6) {
                        d3 = (double)n6 + 0.0;
                    } else {
                        bl5 = false;
                    }
                    double d4 = 999.0;
                    double d5 = 999.0;
                    double d6 = 999.0;
                    double d7 = chN3.field_2092a9_Dne - chN2.field_2092a9_Dne;
                    double d8 = chN3.field_212608_FWm - chN2.field_212608_FWm;
                    double d9 = chN3.field_2e5f16_bzF - chN2.field_2e5f16_bzF;
                    if (bl3) {
                        d4 = (d - chN2.field_2092a9_Dne) / d7;
                    }
                    if (bl4) {
                        d5 = (d2 - chN2.field_212608_FWm) / d8;
                    }
                    if (bl5) {
                        d6 = (d3 - chN2.field_2e5f16_bzF) / d9;
                    }
                    boolean bl6 = false;
                    if (d4 < d5 && d4 < d6) {
                        n9 = n > n4 ? 4 : 5;
                        chN2.field_2092a9_Dne = d;
                        chN2.field_212608_FWm += d8 * d4;
                        chN2.field_2e5f16_bzF += d9 * d4;
                    } else if (d5 < d6) {
                        n9 = n2 > n5 ? 0 : 1;
                        chN2.field_2092a9_Dne += d7 * d5;
                        chN2.field_212608_FWm = d2;
                        chN2.field_2e5f16_bzF += d9 * d5;
                    } else {
                        n9 = n3 > n6 ? 2 : 3;
                        chN2.field_2092a9_Dne += d7 * d6;
                        chN2.field_212608_FWm += d8 * d6;
                        chN2.field_2e5f16_bzF = d3;
                    }
                    chN chN4 = this.method_23186a47_Dne().method_e4505d6c_Dne(chN2.field_2092a9_Dne, chN2.field_212608_FWm, chN2.field_2e5f16_bzF);
                    chN4.field_2092a9_Dne = geR.method_117d0718_FWm(chN2.field_2092a9_Dne);
                    n4 = (int)chN4.field_2092a9_Dne;
                    if (n9 == 5) {
                        --n4;
                        chN4.field_2092a9_Dne += 1.0;
                    }
                    chN4.field_212608_FWm = geR.method_117d0718_FWm(chN2.field_212608_FWm);
                    n5 = (int)chN4.field_212608_FWm;
                    if (n9 == 1) {
                        --n5;
                        chN4.field_212608_FWm += 1.0;
                    }
                    chN4.field_2e5f16_bzF = geR.method_117d0718_FWm(chN2.field_2e5f16_bzF);
                    n6 = (int)chN4.field_2e5f16_bzF;
                    if (n9 == 3) {
                        --n6;
                        chN4.field_2e5f16_bzF += 1.0;
                    }
                    int n10 = this.method_2c2cf7bc_Dne(n4, n5, n6);
                    int n11 = this.method_2dee76f_bzF(n4, n5, n6);
                    zKP zKP3 = zKP.field_8374b848_Dne[n10];
                    if (bl2 && zKP3 != null && zKP3.method_8c85fe2_Dne(this, n4, n5, n6) == null || n10 <= 0 || !zKP3.method_16d0a4f_Dne(n11, bl) || (wHH3 = zKP3.method_acf3908a_Dne(this, n4, n5, n6, chN2, chN3)) == null) continue;
                    return wHH3;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public int method_6fdef3b3_DyG(int n, int n2, int n3) {
        int n4 = 0;
        for (int i = 0; i < 6; ++i) {
            int n5 = this.method_58fe7afa_bzF(n + rrP.field_4039e0a_FWm[i], n2 + rrP.field_59d86bc_bzF[i], n3 + rrP.field_4a92422_Qnq[i], i);
            if (n5 >= 15) {
                return 15;
            }
            if (n5 <= n4) continue;
            n4 = n5;
        }
        return n4;
    }

    public yTR method_95c6ba4c_Dne(sMa sMa2, double d, double d2, double d3, float f, boolean bl) {
        return this.method_4ff037c_Dne(sMa2, d, d2, d3, f, false, bl);
    }

    public boolean method_21a91c05_Qnq(bSp bSp2) {
        int n;
        int n2 = geR.method_117d0718_FWm(bSp2.field_2092a9_Dne);
        int n3 = geR.method_117d0718_FWm(bSp2.field_267cf0_Qnq + 1.0);
        int n4 = geR.method_117d0718_FWm(bSp2.field_212608_FWm);
        int n5 = geR.method_117d0718_FWm(bSp2.field_2d29ef_aFZ + 1.0);
        int n6 = geR.method_117d0718_FWm(bSp2.field_2e5f16_bzF);
        if (this.method_c6b5263e_Dne(n2, n4, n6, n3, n5, n = geR.method_117d0718_FWm(bSp2.field_388da1_zGp + 1.0))) {
            for (int i = n2; i < n3; ++i) {
                for (int j = n4; j < n5; ++j) {
                    for (int k = n6; k < n; ++k) {
                        int n7 = this.method_2c2cf7bc_Dne(i, j, k);
                        if (n7 != zKP.field_3774324_Dne.field_21260d_FWm && n7 != zKP.field_202dfeee_FWm.field_21260d_FWm && n7 != zKP.field_14274117_div.field_21260d_FWm) continue;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public wHH method_38be674_Dne(chN chN2, chN chN3) {
        return this.method_9210e274_Dne(chN2, chN3, false, false);
    }

    public FiG method_9079f0a6_FWm(double d, double d2, double d3, double d4) {
        double d5 = -1.0;
        FiG fiG = null;
        for (int i = 0; i < this.field_2c197105_Qnq.size(); ++i) {
            FiG fiG2 = (FiG)this.field_2c197105_Qnq.get(i);
            if (fiG2.field_37cb681_Dne.field_2092bf_Dne || !fiG2.method_cd4cb3d9_udO()) continue;
            double d6 = fiG2.method_2be42992_Dne(d, d2, d3);
            double d7 = d4;
            if (fiG2.method_a98a0664_aFZ()) {
                d7 = d4 * (double)0.8f;
            }
            if (fiG2.method_998e662d_Vxn()) {
                float f = fiG2.method_9a443a89_XHL();
                if (f < 0.1f) {
                    f = 0.1f;
                }
                d7 *= (double)(0.7f * f);
            }
            if (!(d4 < 0.0) && !(d6 < d7 * d7) || d5 != -1.0 && !(d6 < d5)) continue;
            d5 = d6;
            fiG = fiG2;
        }
        return fiG;
    }

    public void method_76d9fc43_aFZ(int n, int n2, int n3) {
        this.field_37e0a6a_Dne.method_2c2cf7c9_Dne(n, n2, n3);
    }

    public aSc method_230cbc5a_Dne() {
        return this.field_37e0a6a_Dne.method_230cbc5a_Dne();
    }

    public boolean method_6382f365_kGO(int n, int n2, int n3) {
        return this.method_58fe7afa_bzF(n, n2 - 1, n3, 0) > 0 ? true : (this.method_58fe7afa_bzF(n, n2 + 1, n3, 1) > 0 ? true : (this.method_58fe7afa_bzF(n, n2, n3 - 1, 2) > 0 ? true : (this.method_58fe7afa_bzF(n, n2, n3 + 1, 3) > 0 ? true : (this.method_58fe7afa_bzF(n - 1, n2, n3, 4) > 0 ? true : this.method_58fe7afa_bzF(n + 1, n2, n3, 5) > 0))));
    }

    protected void method_7ad38803_DyG() {
        int n;
        int n2;
        int n3;
        FiG fiG;
        int n4;
        this.field_83b48b6a_Dne.clear();
        this.field_365731d_Dne.method_8f501fe4_Dne("buildList");
        for (n4 = 0; n4 < this.field_2c197105_Qnq.size(); ++n4) {
            fiG = (FiG)this.field_2c197105_Qnq.get(n4);
            n3 = geR.method_117d0718_FWm(fiG.field_2f0dd3_div / 16.0);
            n2 = geR.method_117d0718_FWm(fiG.field_334487_mrb / 16.0);
            n = 7;
            for (int i = -n; i <= n; ++i) {
                for (int j = -n; j <= n; ++j) {
                    this.field_83b48b6a_Dne.add(new Sxs(i + n3, j + n2));
                }
            }
        }
        this.field_365731d_Dne.method_7c6f6039_FWm();
        if (this.field_388da6_zGp > 0) {
            --this.field_388da6_zGp;
        }
        this.field_365731d_Dne.method_8f501fe4_Dne("playerCheckLight");
        if (!this.field_2c197105_Qnq.isEmpty()) {
            n4 = this.field_7331eae7_Dne.nextInt(this.field_2c197105_Qnq.size());
            fiG = (FiG)this.field_2c197105_Qnq.get(n4);
            n3 = geR.method_117d0718_FWm(fiG.field_2f0dd3_div) + this.field_7331eae7_Dne.nextInt(11) - 5;
            n2 = geR.method_117d0718_FWm(fiG.field_22c5fd_IjH) + this.field_7331eae7_Dne.nextInt(11) - 5;
            n = geR.method_117d0718_FWm(fiG.field_334487_mrb) + this.field_7331eae7_Dne.nextInt(11) - 5;
            this.method_2e7161e2_Qnq(n3, n2, n);
        }
        this.field_365731d_Dne.method_7c6f6039_FWm();
    }

    public void method_efba61a_aFZ(sMa sMa2) {
        this.method_b43ddeb4_Dne(sMa2, true);
    }

    public qDW method_f4d8ada1_Dne(Ebp ebp) {
        return null;
    }

    public boolean method_88973324_Dne(FiG fiG, int n, int n2, int n3) {
        return true;
    }

    public boolean method_ebf4c0af_mrb(int n, int n2, int n3) {
        return this.method_58febadc_bzF(n, n2, n3, false);
    }

    public int method_1e26964c_FWm(int n, int n2) {
        if (n >= -30000000 && n2 >= -30000000 && n < 30000000 && n2 < 30000000) {
            if (!this.method_16cca7e_Dne(n >> 4, n2 >> 4)) {
                return 0;
            }
            qMV qMV2 = this.method_e1796070_FWm(n >> 4, n2 >> 4);
            return qMV2.method_16cca6d_Dne(n & 0xF, n2 & 0xF);
        }
        return 0;
    }

    public float method_7ed96eaf_Qnq(float f) {
        float f2 = this.method_117d0e97_FWm(f);
        float f3 = 1.0f - (geR.method_117d0e97_FWm(f2 * (float)Math.PI * 2.0f) * 2.0f + 0.25f);
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        return f3 * f3 * 0.5f;
    }

    public boolean method_d4dc89ed_Dne(int n, int n2, int n3, int n4, int n5) {
        if (n >= -30000000 && n3 >= -30000000 && n < 30000000 && n3 < 30000000) {
            int n6;
            int n7;
            if (n2 < 0) {
                return false;
            }
            if (n2 >= 256) {
                return false;
            }
            qMV qMV2 = this.method_e1796070_FWm(n >> 4, n3 >> 4);
            boolean bl = qMV2.method_5972745e_Dne(n7 = n & 0xF, n2, n6 = n3 & 0xF, n4);
            if (bl) {
                int n8 = qMV2.method_2c2cf7bc_Dne(n7, n2, n6);
                if (!((n5 & 2) == 0 || this.field_2d2a05_aFZ && (n5 & 4) != 0)) {
                    this.method_2c2cf7c9_Dne(n, n2, n3);
                }
                if (!this.field_2d2a05_aFZ && (n5 & 1) != 0) {
                    this.method_5972745a_Dne(n, n2, n3, n8);
                    zKP zKP2 = zKP.field_8374b848_Dne[n8];
                    if (zKP2 != null && zKP2.method_582b29b_a_()) {
                        this.method_6465ff20_aFZ(n, n2, n3, n8);
                    }
                }
            }
            return bl;
        }
        return false;
    }

    @Override
    public float method_5972744a_Dne(int n, int n2, int n3, int n4) {
        int n5 = this.method_76d9fc36_aFZ(n, n2, n3);
        if (n5 < n4) {
            n5 = n4;
        }
        return this.field_3690d00_Dne.field_3f1c586_Dne[n5];
    }

    public boolean method_90cba31f_bzF(bSp bSp2) {
        int n = geR.method_117d0718_FWm(bSp2.field_2092a9_Dne);
        int n2 = geR.method_117d0718_FWm(bSp2.field_267cf0_Qnq + 1.0);
        int n3 = geR.method_117d0718_FWm(bSp2.field_212608_FWm);
        int n4 = geR.method_117d0718_FWm(bSp2.field_2d29ef_aFZ + 1.0);
        int n5 = geR.method_117d0718_FWm(bSp2.field_2e5f16_bzF);
        int n6 = geR.method_117d0718_FWm(bSp2.field_388da1_zGp + 1.0);
        if (bSp2.field_2092a9_Dne < 0.0) {
            --n;
        }
        if (bSp2.field_212608_FWm < 0.0) {
            --n3;
        }
        if (bSp2.field_2e5f16_bzF < 0.0) {
            --n5;
        }
        for (int i = n; i < n2; ++i) {
            for (int j = n3; j < n4; ++j) {
                for (int k = n5; k < n6; ++k) {
                    zKP zKP2 = zKP.field_8374b848_Dne[this.method_2c2cf7bc_Dne(i, j, k)];
                    if (zKP2 == null || !zKP2.field_368fd23_Dne.method_907a9d25_Qnq()) continue;
                    return true;
                }
            }
        }
        return false;
    }

    public List method_71df22e6_FWm(sMa sMa2, bSp bSp2) {
        return this.method_b6681b68_Dne(sMa2, bSp2, null);
    }

    public void method_3e501ff9_Qnq(sMa sMa2) {
        sMa2.method_5d73f9d_g_();
        if (sMa2 instanceof FiG) {
            this.field_2c197105_Qnq.remove(sMa2);
            this.method_9a443a99_XHL();
        }
        int n = sMa2.field_22c602_IjH;
        int n2 = sMa2.field_29186d_XHL;
        if (sMa2.field_367165_trS && this.method_16cca7e_Dne(n, n2)) {
            this.method_e1796070_FWm(n, n2).method_94d18be1_FWm(sMa2);
        }
        this.field_f27c122c_Dne.remove(sMa2);
        this.method_94d18be1_FWm(sMa2);
    }

    public Random method_aed68399_Dne(int n, int n2, int n3) {
        long l = (long)n * 341873128712L + (long)n2 * 132897987541L + this.method_231798c9_Dne().method_7a46288e_Dne() + (long)n3;
        this.field_7331eae7_Dne.setSeed(l);
        return this.field_7331eae7_Dne;
    }

    public List method_2a089c0_Dne(qMV qMV2, boolean bl) {
        return null;
    }

    public int method_60f38def_Dne(udO udO2, int n, int n2, int n3) {
        if (this.field_3690d00_Dne.field_21261e_FWm && udO2 == udO.field_37c82cc_Dne) {
            return 0;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        if (n2 >= 256) {
            return udO2.field_2092ae_Dne;
        }
        if (n >= -30000000 && n3 >= -30000000 && n < 30000000 && n3 < 30000000) {
            int n4 = n >> 4;
            int n5 = n3 >> 4;
            if (!this.method_16cca7e_Dne(n4, n5)) {
                return udO2.field_2092ae_Dne;
            }
            if (zKP.field_4a92433_Qnq[this.method_2c2cf7bc_Dne(n, n2, n3)]) {
                int n6 = this.method_f476b68e_FWm(udO2, n, n2 + 1, n3);
                int n7 = this.method_f476b68e_FWm(udO2, n + 1, n2, n3);
                int n8 = this.method_f476b68e_FWm(udO2, n - 1, n2, n3);
                int n9 = this.method_f476b68e_FWm(udO2, n, n2, n3 + 1);
                int n10 = this.method_f476b68e_FWm(udO2, n, n2, n3 - 1);
                if (n7 > n6) {
                    n6 = n7;
                }
                if (n8 > n6) {
                    n6 = n8;
                }
                if (n9 > n6) {
                    n6 = n9;
                }
                if (n10 > n6) {
                    n6 = n10;
                }
                return n6;
            }
            qMV qMV2 = this.method_e1796070_FWm(n4, n5);
            return qMV2.method_60f38def_Dne(udO2, n & 0xF, n2, n3 & 0xF);
        }
        return udO2.field_2092ae_Dne;
    }

    @Override
    public int method_2c2cf7bc_Dne(int n, int n2, int n3) {
        if (n >= -30000000 && n3 >= -30000000 && n < 30000000 && n3 < 30000000) {
            if (n2 < 0) {
                return 0;
            }
            if (n2 >= 256) {
                return 0;
            }
            qMV qMV2 = null;
            try {
                qMV2 = this.method_e1796070_FWm(n >> 4, n3 >> 4);
                return qMV2.method_2c2cf7bc_Dne(n & 0xF, n2, n3 & 0xF);
            }
            catch (Throwable throwable) {
                McM mcM = McM.method_948e60df_Dne(throwable, "Exception getting block type in world");
                Noo noo = mcM.method_284dc627_Dne("Requested block coordinates");
                noo.method_5e295ec0_Dne("Found chunk", qMV2 == null);
                noo.method_5e295ec0_Dne("Location", Noo.method_924467f7_Dne(n, n2, n3));
                throw new kaJ(mcM);
            }
        }
        return 0;
    }

    public int method_5fce35d6_Dne(Class clazz) {
        int n = 0;
        for (int i = 0; i < this.field_f27c122c_Dne.size(); ++i) {
            sMa sMa2 = (sMa)this.field_f27c122c_Dne.get(i);
            if (sMa2 instanceof FUH && ((FUH)sMa2).method_c71d6b54_rPc() || !clazz.isAssignableFrom(sMa2.getClass())) continue;
            ++n;
        }
        return n;
    }

    public String method_eecad346_Dne() {
        return "All: " + this.field_f27c122c_Dne.size();
    }

    public iSh method_23105fed_Dne() {
        return new iSh(this.field_37e0a6a_Dne.method_7a46288d_Dne(), this.field_37e0a6a_Dne.method_7c6f602c_FWm(), this.field_37e0a6a_Dne.method_ae128dba_bzF());
    }

    public int method_6f304eb3_aFZ(int n, int n2) {
        qMV qMV2 = this.method_90569c11_Dne(n, n2);
        n &= 0xF;
        n2 &= 0xF;
        for (int i = qMV2.method_7a46288d_Dne() + 15; i > 0; --i) {
            int n3 = qMV2.method_2c2cf7bc_Dne(n, i, n2);
            if (n3 == 0 || !zKP.field_8374b848_Dne[n3].field_368fd23_Dne.method_ae128dcb_bzF() || zKP.field_8374b848_Dne[n3].field_368fd23_Dne == KFd.field_74f39001_mrb) continue;
            return i + 1;
        }
        return -1;
    }

    public void method_ea14418b_Dne(List list) {
        this.field_f27c122c_Dne.addAll(list);
        for (int i = 0; i < list.size(); ++i) {
            this.method_bb7dd820_Dne((sMa)list.get(i));
        }
    }

    public FiG method_fcf6c807_Dne(double d, double d2, double d3, double d4) {
        double d5 = -1.0;
        FiG fiG = null;
        for (int i = 0; i < this.field_2c197105_Qnq.size(); ++i) {
            FiG fiG2 = (FiG)this.field_2c197105_Qnq.get(i);
            double d6 = fiG2.method_2be42992_Dne(d, d2, d3);
            if (!(d4 < 0.0) && !(d6 < d4 * d4) || d5 != -1.0 && !(d6 < d5)) continue;
            d5 = d6;
            fiG = fiG2;
        }
        return fiG;
    }

    private int method_d959cd6b_Dne(int n, int n2, int n3, udO udO2) {
        if (udO2 == udO.field_37c82cc_Dne && this.method_76d9fc47_aFZ(n, n2, n3)) {
            return 15;
        }
        int n4 = this.method_2c2cf7bc_Dne(n, n2, n3);
        int n5 = udO2 == udO.field_37c82cc_Dne ? 0 : zKP.field_59d86bc_bzF[n4];
        int n6 = zKP.field_4039e0a_FWm[n4];
        if (n6 >= 15 && zKP.field_59d86bc_bzF[n4] > 0) {
            n6 = 1;
        }
        if (n6 < 1) {
            n6 = 1;
        }
        if (n6 >= 15) {
            return 0;
        }
        if (n5 >= 14) {
            return n5;
        }
        for (int i = 0; i < 6; ++i) {
            int n7 = n + rrP.field_4039e0a_FWm[i];
            int n8 = n2 + rrP.field_59d86bc_bzF[i];
            int n9 = n3 + rrP.field_4a92422_Qnq[i];
            int n10 = this.method_f476b68e_FWm(udO2, n7, n8, n9) - n6;
            if (n10 > n5) {
                n5 = n10;
            }
            if (n5 < 14) continue;
            return n5;
        }
        return n5;
    }

    public boolean method_5972745e_Dne(int n, int n2, int n3, int n4) {
        return this.method_c6b5263e_Dne(n - n4, n2 - n4, n3 - n4, n + n4, n2 + n4, n3 + n4);
    }

    public int method_ae128dba_bzF() {
        return this.field_3690d00_Dne.field_21261e_FWm ? 128 : 256;
    }

    public void method_a6aca7ca_FWm(int n, int n2, int n3) {
        for (int i = 0; i < this.field_d97fc834_zGp.size(); ++i) {
            ((IjH)this.field_d97fc834_zGp.get(i)).method_a6aca7ca_FWm(n, n2, n3);
        }
    }

    public FiG method_284a07d1_Dne(String string) {
        for (int i = 0; i < this.field_2c197105_Qnq.size(); ++i) {
            if (!string.equals(((FiG)this.field_2c197105_Qnq.get((int)i)).field_bc57ecbf_aFZ)) continue;
            return (FiG)this.field_2c197105_Qnq.get(i);
        }
        return null;
    }

    public void method_a36f5f6a_Dne(sMa sMa2, String string, float f, float f2) {
        if (sMa2 != null && string != null) {
            for (int i = 0; i < this.field_d97fc834_zGp.size(); ++i) {
                ((IjH)this.field_d97fc834_zGp.get(i)).method_676c4f9a_Dne(string, sMa2.field_2f0dd3_div, sMa2.field_22c5fd_IjH - (double)sMa2.field_36b0a6_udO, sMa2.field_334487_mrb, f, f2);
            }
        }
    }

    public int method_8f501fd7_Dne(String string) {
        return this.field_3698a74_Dne.method_8f501fd7_Dne(string);
    }

    public boolean method_8d69c8a5_Zpi(int n, int n2, int n3) {
        OdI odI = this.method_90477c37_Dne(n, n3);
        float f = odI.method_ae128db7_bzF();
        if (f > 0.15f) {
            return false;
        }
        if (n2 >= 0 && n2 < 256 && this.method_f476b68e_FWm(udO.field_20364eab_FWm, n, n2, n3) < 10) {
            int n4 = this.method_2c2cf7bc_Dne(n, n2 - 1, n3);
            int n5 = this.method_2c2cf7bc_Dne(n, n2, n3);
            if (n5 == 0 && zKP.field_23a1e80a_EwP.method_9cb39134_Dne(this, n, n2, n3) && n4 != 0 && n4 != zKP.field_c4c81e9d_xEx.field_21260d_FWm && zKP.field_8374b848_Dne[n4].field_368fd23_Dne.method_ae128dcb_bzF()) {
                return true;
            }
        }
        return false;
    }

    public boolean method_ce7f9d7e_Dne(boolean bl) {
        return false;
    }

    public void method_174c49a_Dne(boolean bl, boolean bl2) {
        this.field_2e5f2c_bzF = bl;
        this.field_267d06_Qnq = bl2;
    }

    @Override
    public OdI method_90477c37_Dne(int n, int n2) {
        qMV qMV2;
        if (this.method_2dee780_bzF(n, 0, n2) && (qMV2 = this.method_90569c11_Dne(n, n2)) != null) {
            return qMV2.method_812dd1f4_Dne(n & 0xF, n2 & 0xF, this.field_3690d00_Dne.field_37c1c1c_Dne);
        }
        return this.field_3690d00_Dne.field_37c1c1c_Dne.method_90477c37_Dne(n, n2);
    }

    public boolean method_a6aca7ce_FWm(int n, int n2, int n3) {
        int n4 = this.method_2c2cf7bc_Dne(n, n2, n3);
        return zKP.field_8374b848_Dne[n4] != null && zKP.field_8374b848_Dne[n4].method_c073dafc_mrb();
    }

    public iDE method_23102361_Dne() {
        return this.field_3769502_Dne;
    }

    public void method_755f9a60_Dne(IjH ijH) {
        this.field_d97fc834_zGp.add(ijH);
    }

    public void method_2c2cf7c9_Dne(int n, int n2, int n3) {
        for (int i = 0; i < this.field_d97fc834_zGp.size(); ++i) {
            ((IjH)this.field_d97fc834_zGp.get(i)).method_2c2cf7c9_Dne(n, n2, n3);
        }
    }

    public void method_18d926cb_Dne(Collection collection) {
        if (this.field_388db7_zGp) {
            this.field_f0d8c563_DyG.addAll(collection);
        } else {
            this.field_7eb83e1f_bzF.addAll(collection);
        }
    }

    public boolean method_2aa891f3_FWm(bSp bSp2, KFd kFd) {
        int n = geR.method_117d0718_FWm(bSp2.field_2092a9_Dne);
        int n2 = geR.method_117d0718_FWm(bSp2.field_267cf0_Qnq + 1.0);
        int n3 = geR.method_117d0718_FWm(bSp2.field_212608_FWm);
        int n4 = geR.method_117d0718_FWm(bSp2.field_2d29ef_aFZ + 1.0);
        int n5 = geR.method_117d0718_FWm(bSp2.field_2e5f16_bzF);
        int n6 = geR.method_117d0718_FWm(bSp2.field_388da1_zGp + 1.0);
        for (int i = n; i < n2; ++i) {
            for (int j = n3; j < n4; ++j) {
                for (int k = n5; k < n6; ++k) {
                    zKP zKP2 = zKP.field_8374b848_Dne[this.method_2c2cf7bc_Dne(i, j, k)];
                    if (zKP2 == null || zKP2.field_368fd23_Dne != kFd) continue;
                    int n7 = this.method_2dee76f_bzF(i, j, k);
                    double d = j + 1;
                    if (n7 < 8) {
                        d = (double)(j + 1) - (double)n7 / 8.0;
                    }
                    if (!(d >= bSp2.field_212608_FWm)) continue;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public float method_2c2cf7b9_Dne(int n, int n2, int n3) {
        return this.field_3690d00_Dne.field_3f1c586_Dne[this.method_76d9fc36_aFZ(n, n2, n3)];
    }

    @Override
    public boolean method_2c2cf7cd_Dne(int n, int n2, int n3) {
        return this.method_2c2cf7bc_Dne(n, n2, n3) == 0;
    }

    public xoY method_231798c9_Dne() {
        return this.field_37e0a6a_Dne;
    }

    @Override
    public ipD method_d98e681d_Dne(int n, int n2, int n3) {
        if (n2 >= 0 && n2 < 256) {
            qMV qMV2;
            ipD ipD2;
            int n4;
            ipD ipD3 = null;
            if (this.field_388db7_zGp) {
                for (n4 = 0; n4 < this.field_f0d8c563_DyG.size(); ++n4) {
                    ipD2 = (ipD)this.field_f0d8c563_DyG.get(n4);
                    if (ipD2.method_a98a0664_aFZ() || ipD2.field_267cf5_Qnq != n || ipD2.field_2d29f4_aFZ != n2 || ipD2.field_388da6_zGp != n3) continue;
                    ipD3 = ipD2;
                    break;
                }
            }
            if (ipD3 == null && (qMV2 = this.method_e1796070_FWm(n >> 4, n3 >> 4)) != null) {
                ipD3 = qMV2.method_d98e681d_Dne(n & 0xF, n2, n3 & 0xF);
            }
            if (ipD3 == null) {
                for (n4 = 0; n4 < this.field_f0d8c563_DyG.size(); ++n4) {
                    ipD2 = (ipD)this.field_f0d8c563_DyG.get(n4);
                    if (ipD2.method_a98a0664_aFZ() || ipD2.field_267cf5_Qnq != n || ipD2.field_2d29f4_aFZ != n2 || ipD2.field_388da6_zGp != n3) continue;
                    ipD3 = ipD2;
                    break;
                }
            }
            return ipD3;
        }
        return null;
    }

    @Override
    public boolean method_73e9b8f9_IjH(int n, int n2, int n3) {
        zKP zKP2 = zKP.field_8374b848_Dne[this.method_2c2cf7bc_Dne(n, n2, n3)];
        return this.method_222ffcdf_Dne(zKP2, this.method_2dee76f_bzF(n, n2, n3));
    }

    public void method_8288d6ee_IjH() {
    }

    public abstract sMa method_9e7ee9d3_Dne(int var1);

    public boolean method_222ffcdf_Dne(zKP zKP2, int n) {
        return zKP2 == null ? false : (zKP2.field_368fd23_Dne.method_7ad38807_DyG() && zKP2.method_7a46289e_Dne() ? true : (zKP2 instanceof vla ? (n & 4) == 4 : (zKP2 instanceof dNT ? (n & 8) == 8 : (zKP2 instanceof SrC ? true : (zKP2 instanceof XUv ? (n & 7) == 7 : false)))));
    }

    public List method_d11d9a5_Dne(sMa sMa2, bSp bSp2) {
        this.field_dc9cb15_Dne.clear();
        int n = geR.method_117d0718_FWm(bSp2.field_2092a9_Dne);
        int n2 = geR.method_117d0718_FWm(bSp2.field_267cf0_Qnq + 1.0);
        int n3 = geR.method_117d0718_FWm(bSp2.field_212608_FWm);
        int n4 = geR.method_117d0718_FWm(bSp2.field_2d29ef_aFZ + 1.0);
        int n5 = geR.method_117d0718_FWm(bSp2.field_2e5f16_bzF);
        int n6 = geR.method_117d0718_FWm(bSp2.field_388da1_zGp + 1.0);
        for (int i = n; i < n2; ++i) {
            for (int j = n5; j < n6; ++j) {
                if (!this.method_2dee780_bzF(i, 64, j)) continue;
                for (int k = n3 - 1; k < n4; ++k) {
                    zKP zKP2 = zKP.field_8374b848_Dne[this.method_2c2cf7bc_Dne(i, k, j)];
                    if (zKP2 == null) continue;
                    zKP2.method_1bbfa017_Dne(this, i, k, j, bSp2, this.field_dc9cb15_Dne, sMa2);
                }
            }
        }
        double d = 0.25;
        List list = this.method_71df22e6_FWm(sMa2, bSp2.method_b78565d7_FWm(d, d, d));
        for (int i = 0; i < list.size(); ++i) {
            bSp bSp3 = ((sMa)list.get(i)).method_230d324c_Dne();
            if (bSp3 != null && bSp3.method_9ed6d42c_Dne(bSp2)) {
                this.field_dc9cb15_Dne.add(bSp3);
            }
            if ((bSp3 = sMa2.method_9a35aed2_Dne((sMa)list.get(i))) == null || !bSp3.method_9ed6d42c_Dne(bSp2)) continue;
            this.field_dc9cb15_Dne.add(bSp3);
        }
        return this.field_dc9cb15_Dne;
    }

    public int method_a6aca7bd_FWm(int n, int n2, int n3) {
        int n4 = this.method_2c2cf7bc_Dne(n, n2, n3);
        return zKP.field_8374b848_Dne[n4] != null ? zKP.field_8374b848_Dne[n4].method_7a46288d_Dne() : -1;
    }

    public boolean method_2ee9044e_FWm(int n, int n2, int n3, boolean bl) {
        if (n >= -30000000 && n3 >= -30000000 && n < 30000000 && n3 < 30000000) {
            qMV qMV2 = this.field_37042d5_Dne.method_90569c11_Dne(n >> 4, n3 >> 4);
            if (qMV2 != null && !qMV2.method_7a46289e_Dne()) {
                zKP zKP2 = zKP.field_8374b848_Dne[this.method_2c2cf7bc_Dne(n, n2, n3)];
                return zKP2 == null ? false : zKP2.field_368fd23_Dne.method_7ad38807_DyG() && zKP2.method_7a46289e_Dne();
            }
            return bl;
        }
        return bl;
    }

    public EyB method_1b74dc2_Dne(String string, int n, int n2, int n3) {
        return this.method_f8802153_FWm().method_2849cfe9_Dne(this, string, n, n2, n3);
    }

    public void method_2ee8c479_FWm(int n, int n2, int n3, int n4) {
        int n5;
        if (n3 > n4) {
            n5 = n4;
            n4 = n3;
            n3 = n5;
        }
        if (!this.field_3690d00_Dne.field_21261e_FWm) {
            for (n5 = n3; n5 <= n4; ++n5) {
                this.method_60f38dfc_Dne(udO.field_37c82cc_Dne, n, n5, n2);
            }
        }
        this.method_c6b5263a_Dne(n, n3, n2, n, n4, n2);
    }

    public int method_5972b41e_Dne(int n, int n2, int n3, boolean bl) {
        if (n >= -30000000 && n3 >= -30000000 && n < 30000000 && n3 < 30000000) {
            int n4;
            if (bl && zKP.field_4a92433_Qnq[n4 = this.method_2c2cf7bc_Dne(n, n2, n3)]) {
                int n5 = this.method_5972b41e_Dne(n, n2 + 1, n3, false);
                int n6 = this.method_5972b41e_Dne(n + 1, n2, n3, false);
                int n7 = this.method_5972b41e_Dne(n - 1, n2, n3, false);
                int n8 = this.method_5972b41e_Dne(n, n2, n3 + 1, false);
                int n9 = this.method_5972b41e_Dne(n, n2, n3 - 1, false);
                if (n6 > n5) {
                    n5 = n6;
                }
                if (n7 > n5) {
                    n5 = n7;
                }
                if (n8 > n5) {
                    n5 = n8;
                }
                if (n9 > n5) {
                    n5 = n9;
                }
                return n5;
            }
            if (n2 < 0) {
                return 0;
            }
            if (n2 >= 256) {
                n2 = 255;
            }
            qMV qMV2 = this.method_e1796070_FWm(n >> 4, n3 >> 4);
            return qMV2.method_5972744d_Dne(n &= 0xF, n2, n3 &= 0xF, this.field_2092ae_Dne);
        }
        return 15;
    }

    public void method_7c6f6039_FWm() {
        Object object;
        int n;
        int n2;
        sMa sMa2;
        int n3;
        this.field_365731d_Dne.method_8f501fe4_Dne("entities");
        this.field_365731d_Dne.method_8f501fe4_Dne("global");
        for (n3 = 0; n3 < this.field_10b14626_aFZ.size(); ++n3) {
            sMa2 = (sMa)this.field_10b14626_aFZ.get(n3);
            try {
                ++sMa2.field_388da6_zGp;
                sMa2.method_7a46289a_Dne();
            }
            catch (Throwable throwable) {
                McM mcM = McM.method_948e60df_Dne(throwable, "Ticking entity");
                Noo noo = mcM.method_284dc627_Dne("Entity being ticked");
                if (sMa2 == null) {
                    noo.method_5e295ec0_Dne("Entity", "~~NULL~~");
                } else {
                    sMa2.method_7e400579_Dne(noo);
                }
                throw new kaJ(mcM);
            }
            if (!sMa2.field_2a9ae7_Zpi) continue;
            this.field_10b14626_aFZ.remove(n3--);
        }
        this.field_365731d_Dne.method_110c4dc3_FWm("remove");
        this.field_f27c122c_Dne.removeAll(this.field_6a0474ed_FWm);
        for (n3 = 0; n3 < this.field_6a0474ed_FWm.size(); ++n3) {
            sMa2 = (sMa)this.field_6a0474ed_FWm.get(n3);
            n2 = sMa2.field_22c602_IjH;
            n = sMa2.field_29186d_XHL;
            if (!sMa2.field_367165_trS || !this.method_16cca7e_Dne(n2, n)) continue;
            this.method_e1796070_FWm(n2, n).method_94d18be1_FWm(sMa2);
        }
        for (n3 = 0; n3 < this.field_6a0474ed_FWm.size(); ++n3) {
            this.method_94d18be1_FWm((sMa)this.field_6a0474ed_FWm.get(n3));
        }
        this.field_6a0474ed_FWm.clear();
        this.field_365731d_Dne.method_110c4dc3_FWm("regular");
        for (n3 = 0; n3 < this.field_f27c122c_Dne.size(); ++n3) {
            sMa2 = (sMa)this.field_f27c122c_Dne.get(n3);
            if (sMa2.field_203511c4_FWm != null) {
                if (!sMa2.field_203511c4_FWm.field_2a9ae7_Zpi && sMa2.field_203511c4_FWm.field_37b45e5_Dne == sMa2) continue;
                sMa2.field_203511c4_FWm.field_37b45e5_Dne = null;
                sMa2.field_203511c4_FWm = null;
            }
            this.field_365731d_Dne.method_8f501fe4_Dne("tick");
            if (!sMa2.field_2a9ae7_Zpi) {
                try {
                    this.method_efba61a_aFZ(sMa2);
                }
                catch (Throwable throwable) {
                    McM mcM = McM.method_948e60df_Dne(throwable, "Ticking entity");
                    Noo noo = mcM.method_284dc627_Dne("Entity being ticked");
                    sMa2.method_7e400579_Dne(noo);
                    throw new kaJ(mcM);
                }
            }
            this.field_365731d_Dne.method_7c6f6039_FWm();
            this.field_365731d_Dne.method_8f501fe4_Dne("remove");
            if (sMa2.field_2a9ae7_Zpi) {
                n2 = sMa2.field_22c602_IjH;
                n = sMa2.field_29186d_XHL;
                if (sMa2.field_367165_trS && this.method_16cca7e_Dne(n2, n)) {
                    this.method_e1796070_FWm(n2, n).method_94d18be1_FWm(sMa2);
                }
                this.field_f27c122c_Dne.remove(n3--);
                this.method_94d18be1_FWm(sMa2);
            }
            this.field_365731d_Dne.method_7c6f6039_FWm();
        }
        this.field_365731d_Dne.method_110c4dc3_FWm("tileEntities");
        this.field_388db7_zGp = true;
        Iterator iterator = this.field_7eb83e1f_bzF.iterator();
        while (iterator.hasNext()) {
            ipD ipD2 = (ipD)iterator.next();
            if (!ipD2.method_a98a0664_aFZ() && ipD2.method_907a9d25_Qnq() && this.method_2dee780_bzF(ipD2.field_267cf5_Qnq, ipD2.field_2d29f4_aFZ, ipD2.field_388da6_zGp)) {
                try {
                    ipD2.method_7a46289a_Dne();
                }
                catch (Throwable throwable) {
                    McM mcM = McM.method_948e60df_Dne(throwable, "Ticking tile entity");
                    Noo noo = mcM.method_284dc627_Dne("Tile entity being ticked");
                    ipD2.method_7e400579_Dne(noo);
                    throw new kaJ(mcM);
                }
            }
            if (!ipD2.method_a98a0664_aFZ()) continue;
            iterator.remove();
            if (!this.method_16cca7e_Dne(ipD2.field_267cf5_Qnq >> 4, ipD2.field_388da6_zGp >> 4) || (object = this.method_e1796070_FWm(ipD2.field_267cf5_Qnq >> 4, ipD2.field_388da6_zGp >> 4)) == null) continue;
            ((qMV)object).method_2c2cf7c9_Dne(ipD2.field_267cf5_Qnq & 0xF, ipD2.field_2d29f4_aFZ, ipD2.field_388da6_zGp & 0xF);
        }
        this.field_388db7_zGp = false;
        if (!this.field_2c369dc2_div.isEmpty()) {
            this.field_7eb83e1f_bzF.removeAll(this.field_2c369dc2_div);
            this.field_2c369dc2_div.clear();
        }
        this.field_365731d_Dne.method_110c4dc3_FWm("pendingTileEntities");
        if (!this.field_f0d8c563_DyG.isEmpty()) {
            for (int i = 0; i < this.field_f0d8c563_DyG.size(); ++i) {
                qMV qMV2;
                object = (ipD)this.field_f0d8c563_DyG.get(i);
                if (((ipD)object).method_a98a0664_aFZ()) continue;
                if (!this.field_7eb83e1f_bzF.contains(object)) {
                    this.field_7eb83e1f_bzF.add(object);
                }
                if (this.method_16cca7e_Dne(((ipD)object).field_267cf5_Qnq >> 4, ((ipD)object).field_388da6_zGp >> 4) && (qMV2 = this.method_e1796070_FWm(((ipD)object).field_267cf5_Qnq >> 4, ((ipD)object).field_388da6_zGp >> 4)) != null) {
                    qMV2.method_c583bffb_Dne(((ipD)object).field_267cf5_Qnq & 0xF, ((ipD)object).field_2d29f4_aFZ, ((ipD)object).field_388da6_zGp & 0xF, (ipD)object);
                }
                this.method_2c2cf7c9_Dne(((ipD)object).field_267cf5_Qnq, ((ipD)object).field_2d29f4_aFZ, ((ipD)object).field_388da6_zGp);
            }
            this.field_f0d8c563_DyG.clear();
        }
        this.field_365731d_Dne.method_7c6f6039_FWm();
        this.field_365731d_Dne.method_7c6f6039_FWm();
    }

    public boolean method_ff46456e_Dne(bSp bSp2, KFd kFd, sMa sMa2) {
        int n;
        int n2 = geR.method_117d0718_FWm(bSp2.field_2092a9_Dne);
        int n3 = geR.method_117d0718_FWm(bSp2.field_267cf0_Qnq + 1.0);
        int n4 = geR.method_117d0718_FWm(bSp2.field_212608_FWm);
        int n5 = geR.method_117d0718_FWm(bSp2.field_2d29ef_aFZ + 1.0);
        int n6 = geR.method_117d0718_FWm(bSp2.field_2e5f16_bzF);
        if (!this.method_c6b5263e_Dne(n2, n4, n6, n3, n5, n = geR.method_117d0718_FWm(bSp2.field_388da1_zGp + 1.0))) {
            return false;
        }
        boolean bl = false;
        chN chN2 = this.method_23186a47_Dne().method_e4505d6c_Dne(0.0, 0.0, 0.0);
        for (int i = n2; i < n3; ++i) {
            for (int j = n4; j < n5; ++j) {
                for (int k = n6; k < n; ++k) {
                    double d;
                    zKP zKP2 = zKP.field_8374b848_Dne[this.method_2c2cf7bc_Dne(i, j, k)];
                    if (zKP2 == null || zKP2.field_368fd23_Dne != kFd || !((double)n5 >= (d = (double)((float)(j + 1) - byt.method_ce7f5d99_Dne(this.method_2dee76f_bzF(i, j, k)))))) continue;
                    bl = true;
                    zKP2.method_f4575f0e_Dne(this, i, j, k, sMa2, chN2);
                }
            }
        }
        if (chN2.method_7a462888_Dne() > 0.0 && sMa2.method_c19d9a0d_oIf()) {
            chN2 = chN2.method_230df162_Dne();
            double d = 0.014;
            sMa2.field_291868_XHL += chN2.field_2092a9_Dne * d;
            sMa2.field_2a9ad1_Zpi += chN2.field_212608_FWm * d;
            sMa2.field_31b811_kGO += chN2.field_2e5f16_bzF * d;
        }
        return bl;
    }

    @Override
    public boolean method_907a9d25_Qnq() {
        return false;
    }

    public boolean method_2dee780_bzF(int n, int n2, int n3) {
        return n2 >= 0 && n2 < 256 ? this.method_16cca7e_Dne(n >> 4, n3 >> 4) : false;
    }

    public int method_5c563934_Qnq(int n, int n2) {
        return this.method_90569c11_Dne(n, n2).method_1e26964c_FWm(n & 0xF, n2 & 0xF);
    }

    public sMa method_82785e85_Dne(Class clazz, bSp bSp2, sMa sMa2) {
        List list = this.method_9314b7e8_Dne(clazz, bSp2);
        sMa sMa3 = null;
        double d = Double.MAX_VALUE;
        for (int i = 0; i < list.size(); ++i) {
            double d2;
            sMa sMa4 = (sMa)list.get(i);
            if (sMa4 == sMa2 || !((d2 = sMa2.method_bb7dd80e_Dne(sMa4)) <= d)) continue;
            sMa3 = sMa4;
            d = d2;
        }
        return sMa3;
    }

    protected void method_bb7dd820_Dne(sMa sMa2) {
        for (int i = 0; i < this.field_d97fc834_zGp.size(); ++i) {
            ((IjH)this.field_d97fc834_zGp.get(i)).method_bb7dd820_Dne(sMa2);
        }
    }

    public float method_143f92c9_bzF(float f) {
        float f2 = this.method_117d0e97_FWm(f);
        return f2 * (float)Math.PI * 2.0f;
    }

    public void method_117d1dab_FWm(long l) {
        this.field_37e0a6a_Dne.method_117d1dab_FWm(l);
    }

    public float method_ce7f5256_Dne(float f) {
        float f2 = this.method_117d0e97_FWm(f);
        float f3 = 1.0f - (geR.method_117d0e97_FWm(f2 * (float)Math.PI * 2.0f) * 2.0f + 0.2f);
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        f3 = 1.0f - f3;
        f3 = (float)((double)f3 * (1.0 - (double)(this.method_b51dd45e_zGp(f) * 5.0f) / 16.0));
        f3 = (float)((double)f3 * (1.0 - (double)(this.method_87b72d50_aFZ(f) * 5.0f) / 16.0));
        return f3 * 0.8f + 0.2f;
    }

    public boolean method_2b9d316e_XHL(int n, int n2, int n3) {
        return this.method_58febadc_bzF(n, n2, n3, true);
    }

    public boolean method_76d9fc47_aFZ(int n, int n2, int n3) {
        return this.method_e1796070_FWm(n >> 4, n3 >> 4).method_2c2cf7cd_Dne(n & 0xF, n2, n3 & 0xF);
    }

    public SFA method_23062a3d_Dne() {
        return this.field_36c9bde_Dne;
    }

    @Override
    public boolean method_e53317d5_zGp(int n, int n2, int n3) {
        zKP zKP2 = zKP.field_8374b848_Dne[this.method_2c2cf7bc_Dne(n, n2, n3)];
        return zKP2 == null ? false : zKP2.method_7c6f603d_FWm();
    }

    public wHH method_50000e54_Dne(chN chN2, chN chN3, boolean bl) {
        return this.method_9210e274_Dne(chN2, chN3, bl, false);
    }

    public <T> List<T> method_9314b7e8_Dne(Class<T> clazz, bSp bSp2) {
        return this.method_e7d4af05_Dne(clazz, bSp2, null);
    }

    public qMV method_90569c11_Dne(int n, int n2) {
        return this.method_e1796070_FWm(n >> 4, n2 >> 4);
    }

    public void method_2dee77c_bzF(int n, int n2, int n3) {
        ipD ipD2 = this.method_d98e681d_Dne(n, n2, n3);
        if (ipD2 != null && this.field_388db7_zGp) {
            ipD2.method_d44b4592_zGp();
            this.field_f0d8c563_DyG.remove(ipD2);
        } else {
            qMV qMV2;
            if (ipD2 != null) {
                this.field_f0d8c563_DyG.remove(ipD2);
                this.field_7eb83e1f_bzF.remove(ipD2);
            }
            if ((qMV2 = this.method_e1796070_FWm(n >> 4, n3 >> 4)) != null) {
                qMV2.method_2c2cf7c9_Dne(n & 0xF, n2, n3 & 0xF);
            }
        }
    }

    public void method_ae303daa_FWm(int n, int n2, int n3, int n4, int n5) {
    }

    @Override
    public boolean method_6fdef3c4_DyG(int n, int n2, int n3) {
        return zKP.method_df9deb64_DyG(this.method_2c2cf7bc_Dne(n, n2, n3));
    }

    public dLs method_230e0120_Dne() {
        return this.field_37472c1_Dne;
    }

    public List method_b6681b68_Dne(sMa sMa2, bSp bSp2, pUe pUe2) {
        ArrayList arrayList = new ArrayList();
        int n = geR.method_117d0718_FWm((bSp2.field_2092a9_Dne - 2.0) / 16.0);
        int n2 = geR.method_117d0718_FWm((bSp2.field_267cf0_Qnq + 2.0) / 16.0);
        int n3 = geR.method_117d0718_FWm((bSp2.field_2e5f16_bzF - 2.0) / 16.0);
        int n4 = geR.method_117d0718_FWm((bSp2.field_388da1_zGp + 2.0) / 16.0);
        for (int i = n; i <= n2; ++i) {
            for (int j = n3; j <= n4; ++j) {
                if (!this.method_16cca7e_Dne(i, j)) continue;
                this.method_e1796070_FWm(i, j).method_d3f21eae_Dne(sMa2, bSp2, arrayList, pUe2);
            }
        }
        return arrayList;
    }

    public boolean method_bb7dd824_Dne(sMa sMa2) {
        this.field_10b14626_aFZ.add(sMa2);
        return true;
    }

    public void method_6465ff20_aFZ(int n, int n2, int n3, int n4) {
        for (int i = 0; i < 4; ++i) {
            int n5 = n + zxJ.field_3f1c589_Dne[i];
            int n6 = n3 + zxJ.field_4039e0a_FWm[i];
            int n7 = this.method_2c2cf7bc_Dne(n5, n2, n6);
            if (n7 == 0) continue;
            zKP zKP2 = zKP.field_8374b848_Dne[n7];
            if (zKP.field_36fe252_Dne.method_87b738a7_aFZ(n7)) {
                zKP2.method_f9bf07d3_Dne(this, n5, n2, n6, n4);
                continue;
            }
            if (!zKP.method_df9deb64_DyG(n7)) continue;
            n7 = this.method_2c2cf7bc_Dne(n5 += zxJ.field_3f1c589_Dne[i], n2, n6 += zxJ.field_4039e0a_FWm[i]);
            zKP2 = zKP.field_8374b848_Dne[n7];
            if (!zKP.field_36fe252_Dne.method_87b738a7_aFZ(n7)) continue;
            zKP2.method_f9bf07d3_Dne(this, n5, n2, n6, n4);
        }
    }

    public boolean method_c6b5263e_Dne(int n, int n2, int n3, int n4, int n5, int n6) {
        if (n5 >= 0 && n2 < 256) {
            n3 >>= 4;
            n4 >>= 4;
            n6 >>= 4;
            for (int i = n >>= 4; i <= n4; ++i) {
                for (int j = n3; j <= n6; ++j) {
                    if (this.method_16cca7e_Dne(i, j)) continue;
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public int method_7c6f602c_FWm() {
        return 256;
    }

    public void method_12705b2a_FWm(List list) {
        this.field_6a0474ed_FWm.addAll(list);
    }

    @Override
    public KFd method_d9802b31_Dne(int n, int n2, int n3) {
        int n4 = this.method_2c2cf7bc_Dne(n, n2, n3);
        return n4 == 0 ? KFd.field_368fd23_Dne : zKP.field_8374b848_Dne[n4].field_368fd23_Dne;
    }

    public void method_c6b5263a_Dne(int n, int n2, int n3, int n4, int n5, int n6) {
        for (int i = 0; i < this.field_d97fc834_zGp.size(); ++i) {
            ((IjH)this.field_d97fc834_zGp.get(i)).method_c6b5263a_Dne(n, n2, n3, n4, n5, n6);
        }
    }

    public int method_58fe7afa_bzF(int n, int n2, int n3, int n4) {
        if (this.method_6fdef3c4_DyG(n, n2, n3)) {
            return this.method_e53317c4_zGp(n, n2, n3);
        }
        int n5 = this.method_2c2cf7bc_Dne(n, n2, n3);
        return n5 == 0 ? 0 : zKP.field_8374b848_Dne[n5].method_79d378e7_Dne(this, n, n2, n3, n4);
    }

    public boolean method_782a87ed_FWm(bSp bSp2) {
        int n = geR.method_117d0718_FWm(bSp2.field_2092a9_Dne);
        int n2 = geR.method_117d0718_FWm(bSp2.field_267cf0_Qnq + 1.0);
        int n3 = geR.method_117d0718_FWm(bSp2.field_212608_FWm);
        int n4 = geR.method_117d0718_FWm(bSp2.field_2d29ef_aFZ + 1.0);
        int n5 = geR.method_117d0718_FWm(bSp2.field_2e5f16_bzF);
        int n6 = geR.method_117d0718_FWm(bSp2.field_388da1_zGp + 1.0);
        if (bSp2.field_2092a9_Dne < 0.0) {
            --n;
        }
        if (bSp2.field_212608_FWm < 0.0) {
            --n3;
        }
        if (bSp2.field_2e5f16_bzF < 0.0) {
            --n5;
        }
        for (int i = n; i < n2; ++i) {
            for (int j = n3; j < n4; ++j) {
                for (int k = n5; k < n6; ++k) {
                    zKP zKP2 = zKP.field_8374b848_Dne[this.method_2c2cf7bc_Dne(i, j, k)];
                    if (zKP2 == null) continue;
                    return true;
                }
            }
        }
        return false;
    }

    public int method_76d9fc36_aFZ(int n, int n2, int n3) {
        return this.method_5972b41e_Dne(n, n2, n3, true);
    }

    public void method_5972745a_Dne(int n, int n2, int n3, int n4) {
        this.method_58fe7b07_bzF(n, n2, n3, n4);
    }

    public double method_7a462888_Dne() {
        return this.field_37e0a6a_Dne.method_23111898_Dne() == kGO.field_20315618_FWm ? 0.0 : 63.0;
    }

    public boolean method_1889bc82_Dne(int n, int n2, int n3, int n4, boolean bl, int n5, sMa sMa2, NMq nMq) {
        int n6 = this.method_2c2cf7bc_Dne(n2, n3, n4);
        zKP zKP2 = zKP.field_8374b848_Dne[n6];
        zKP zKP3 = zKP.field_8374b848_Dne[n];
        bSp bSp2 = zKP3.method_8c85fe2_Dne(this, n2, n3, n4);
        if (bl) {
            bSp2 = null;
        }
        if (bSp2 != null && !this.method_aff03556_Dne(bSp2, sMa2)) {
            return false;
        }
        if (zKP2 != null && (zKP2 == zKP.field_374330f_Dne || zKP2 == zKP.field_16319416_DyG || zKP2 == zKP.field_202dfeee_FWm || zKP2 == zKP.field_14274117_div || zKP2 == zKP.field_3774324_Dne || zKP2.field_368fd23_Dne.method_d44b4596_zGp())) {
            zKP2 = null;
        }
        return zKP2 != null && zKP2.field_368fd23_Dne == KFd.field_1efdede7_qLR && zKP3 == zKP.field_9225485d_etZ ? true : n > 0 && zKP2 == null && zKP3.method_d1e08b80_Dne(this, n2, n3, n4, n5, nMq);
    }

    public List method_adea226d_Dne() {
        return this.field_f27c122c_Dne;
    }

    public void method_60f38dfc_Dne(udO udO2, int n, int n2, int n3) {
        if (this.method_5972745e_Dne(n, n2, n3, 17)) {
            int n4;
            int n5;
            int n6;
            int n7;
            int n8;
            int n9;
            int n10;
            int n11;
            int n12;
            int n13;
            int n14 = 0;
            int n15 = 0;
            this.field_365731d_Dne.method_8f501fe4_Dne("getBrightness");
            int n16 = this.method_f476b68e_FWm(udO2, n, n2, n3);
            int n17 = this.method_d959cd6b_Dne(n, n2, n3, udO2);
            if (n17 > n16) {
                this.field_3f1c589_Dne[n15++] = 133152;
            } else if (n17 < n16) {
                this.field_3f1c589_Dne[n15++] = 0x20820 | n16 << 18;
                while (n14 < n15) {
                    n13 = this.field_3f1c589_Dne[n14++];
                    n12 = (n13 & 0x3F) - 32 + n;
                    n11 = (n13 >> 6 & 0x3F) - 32 + n2;
                    n10 = (n13 >> 12 & 0x3F) - 32 + n3;
                    n9 = n13 >> 18 & 0xF;
                    n8 = this.method_f476b68e_FWm(udO2, n12, n11, n10);
                    if (n8 != n9) continue;
                    this.method_bd7ea487_Dne(udO2, n12, n11, n10, 0);
                    if (n9 <= 0 || (n7 = geR.method_ce7f5d9c_Dne(n12 - n)) + (n6 = geR.method_ce7f5d9c_Dne(n11 - n2)) + (n5 = geR.method_ce7f5d9c_Dne(n10 - n3)) >= 17) continue;
                    for (n4 = 0; n4 < 6; ++n4) {
                        int n18 = n12 + rrP.field_4039e0a_FWm[n4];
                        int n19 = n11 + rrP.field_59d86bc_bzF[n4];
                        int n20 = n10 + rrP.field_4a92422_Qnq[n4];
                        int n21 = Math.max(1, zKP.field_4039e0a_FWm[this.method_2c2cf7bc_Dne(n18, n19, n20)]);
                        n8 = this.method_f476b68e_FWm(udO2, n18, n19, n20);
                        if (n8 != n9 - n21 || n15 >= this.field_3f1c589_Dne.length) continue;
                        this.field_3f1c589_Dne[n15++] = n18 - n + 32 | n19 - n2 + 32 << 6 | n20 - n3 + 32 << 12 | n9 - n21 << 18;
                    }
                }
                n14 = 0;
            }
            this.field_365731d_Dne.method_7c6f6039_FWm();
            this.field_365731d_Dne.method_8f501fe4_Dne("checkedPosition < toCheckCount");
            while (n14 < n15) {
                n13 = this.field_3f1c589_Dne[n14++];
                n12 = (n13 & 0x3F) - 32 + n;
                n11 = (n13 >> 6 & 0x3F) - 32 + n2;
                n10 = (n13 >> 12 & 0x3F) - 32 + n3;
                n9 = this.method_f476b68e_FWm(udO2, n12, n11, n10);
                n8 = this.method_d959cd6b_Dne(n12, n11, n10, udO2);
                if (n8 == n9) continue;
                this.method_bd7ea487_Dne(udO2, n12, n11, n10, n8);
                if (n8 <= n9) continue;
                n7 = Math.abs(n12 - n);
                n6 = Math.abs(n11 - n2);
                n5 = Math.abs(n10 - n3);
                int n22 = n4 = n15 < this.field_3f1c589_Dne.length - 6 ? 1 : 0;
                if (n7 + n6 + n5 >= 17 || n4 == 0) continue;
                if (this.method_f476b68e_FWm(udO2, n12 - 1, n11, n10) < n8) {
                    this.field_3f1c589_Dne[n15++] = n12 - 1 - n + 32 + (n11 - n2 + 32 << 6) + (n10 - n3 + 32 << 12);
                }
                if (this.method_f476b68e_FWm(udO2, n12 + 1, n11, n10) < n8) {
                    this.field_3f1c589_Dne[n15++] = n12 + 1 - n + 32 + (n11 - n2 + 32 << 6) + (n10 - n3 + 32 << 12);
                }
                if (this.method_f476b68e_FWm(udO2, n12, n11 - 1, n10) < n8) {
                    this.field_3f1c589_Dne[n15++] = n12 - n + 32 + (n11 - 1 - n2 + 32 << 6) + (n10 - n3 + 32 << 12);
                }
                if (this.method_f476b68e_FWm(udO2, n12, n11 + 1, n10) < n8) {
                    this.field_3f1c589_Dne[n15++] = n12 - n + 32 + (n11 + 1 - n2 + 32 << 6) + (n10 - n3 + 32 << 12);
                }
                if (this.method_f476b68e_FWm(udO2, n12, n11, n10 - 1) < n8) {
                    this.field_3f1c589_Dne[n15++] = n12 - n + 32 + (n11 - n2 + 32 << 6) + (n10 - 1 - n3 + 32 << 12);
                }
                if (this.method_f476b68e_FWm(udO2, n12, n11, n10 + 1) >= n8) continue;
                this.field_3f1c589_Dne[n15++] = n12 - n + 32 + (n11 - n2 + 32 << 6) + (n10 + 1 - n3 + 32 << 12);
            }
            this.field_365731d_Dne.method_7c6f6039_FWm();
        }
    }

    public void method_d4dc89e9_Dne(int n, int n2, int n3, int n4, int n5) {
        if (n5 != 4) {
            this.method_9fbb4d61_Qnq(n - 1, n2, n3, n4);
        }
        if (n5 != 5) {
            this.method_9fbb4d61_Qnq(n + 1, n2, n3, n4);
        }
        if (n5 != 0) {
            this.method_9fbb4d61_Qnq(n, n2 - 1, n3, n4);
        }
        if (n5 != 1) {
            this.method_9fbb4d61_Qnq(n, n2 + 1, n3, n4);
        }
        if (n5 != 2) {
            this.method_9fbb4d61_Qnq(n, n2, n3 - 1, n4);
        }
        if (n5 != 3) {
            this.method_9fbb4d61_Qnq(n, n2, n3 + 1, n4);
        }
    }

    public long method_7c6f602d_FWm() {
        return this.field_37e0a6a_Dne.method_7c6f602d_FWm();
    }

    public boolean method_7c6f603d_FWm() {
        return (double)this.method_87b72d50_aFZ(1.0f) > 0.9;
    }

    public boolean method_7a46289e_Dne() {
        return this.field_2092ae_Dne < 4;
    }

    public qMV method_e1796070_FWm(int n, int n2) {
        return this.field_37042d5_Dne.method_90569c11_Dne(n, n2);
    }

    public boolean method_94d18be5_FWm(sMa sMa2) {
        int n = geR.method_117d0718_FWm(sMa2.field_2f0dd3_div / 16.0);
        int n2 = geR.method_117d0718_FWm(sMa2.field_334487_mrb / 16.0);
        boolean bl = sMa2.field_267d06_Qnq;
        if (sMa2 instanceof FiG) {
            bl = true;
        }
        if (!bl && !this.method_16cca7e_Dne(n, n2)) {
            return false;
        }
        if (sMa2 instanceof FiG) {
            FiG fiG = (FiG)sMa2;
            this.field_2c197105_Qnq.add(fiG);
            this.method_9a443a99_XHL();
        }
        this.method_e1796070_FWm(n, n2).method_bb7dd820_Dne(sMa2);
        this.field_f27c122c_Dne.add(sMa2);
        this.method_bb7dd820_Dne(sMa2);
        return true;
    }

    public void method_9a443a99_XHL() {
    }

    public void method_ac4d69ca_Dne(ipD ipD2) {
        this.field_2c369dc2_div.add(ipD2);
    }

    public void method_4eb34e21_FWm(IjH ijH) {
        this.field_d97fc834_zGp.remove(ijH);
    }

    public void method_57aed1c2_Qnq(int n, int n2, int n3, int n4, int n5) {
        this.method_bfa54b80_Dne(null, n, n2, n3, n4, n5);
    }

    public List method_6577291f_Dne(bSp bSp2) {
        this.field_dc9cb15_Dne.clear();
        int n = geR.method_117d0718_FWm(bSp2.field_2092a9_Dne);
        int n2 = geR.method_117d0718_FWm(bSp2.field_267cf0_Qnq + 1.0);
        int n3 = geR.method_117d0718_FWm(bSp2.field_212608_FWm);
        int n4 = geR.method_117d0718_FWm(bSp2.field_2d29ef_aFZ + 1.0);
        int n5 = geR.method_117d0718_FWm(bSp2.field_2e5f16_bzF);
        int n6 = geR.method_117d0718_FWm(bSp2.field_388da1_zGp + 1.0);
        for (int i = n; i < n2; ++i) {
            for (int j = n5; j < n6; ++j) {
                if (!this.method_2dee780_bzF(i, 64, j)) continue;
                for (int k = n3 - 1; k < n4; ++k) {
                    zKP zKP2 = zKP.field_8374b848_Dne[this.method_2c2cf7bc_Dne(i, k, j)];
                    if (zKP2 == null) continue;
                    zKP2.method_1bbfa017_Dne(this, i, k, j, bSp2, this.field_dc9cb15_Dne, null);
                }
            }
        }
        return this.field_dc9cb15_Dne;
    }

    public wdG method_37763af4_Dne(sMa sMa2, int n, int n2, int n3, float f, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.field_365731d_Dne.method_8f501fe4_Dne("pathfind");
        int n4 = geR.method_117d0718_FWm(sMa2.field_2f0dd3_div);
        int n5 = geR.method_117d0718_FWm(sMa2.field_22c5fd_IjH);
        int n6 = geR.method_117d0718_FWm(sMa2.field_334487_mrb);
        int n7 = (int)(f + 8.0f);
        int n8 = n4 - n7;
        int n9 = n5 - n7;
        int n10 = n6 - n7;
        int n11 = n4 + n7;
        int n12 = n5 + n7;
        int n13 = n6 + n7;
        ATE aTE = new ATE(this, n8, n9, n10, n11, n12, n13, 0);
        wdG wdG2 = new Seh(aTE, bl, bl2, bl3, bl4).method_96ef7c74_Dne(sMa2, n, n2, n3, f);
        this.field_365731d_Dne.method_7c6f6039_FWm();
        return wdG2;
    }

    protected abstract ZfC method_2309d134_Dne();

    public boolean method_ae128dcb_bzF() {
        return (double)this.method_b51dd45e_zGp(1.0f) > 0.2;
    }

    public boolean method_58fe7b0b_bzF(int n, int n2, int n3, int n4) {
        return false;
    }

    public long method_ae128dbb_bzF() {
        return this.field_37e0a6a_Dne.method_ae128dbb_bzF();
    }

    public boolean method_58febadc_bzF(int n, int n2, int n3, boolean bl) {
        int n4;
        OdI odI = this.method_90477c37_Dne(n, n3);
        float f = odI.method_ae128db7_bzF();
        if (f > 0.15f) {
            return false;
        }
        if (n2 >= 0 && n2 < 256 && this.method_f476b68e_FWm(udO.field_20364eab_FWm, n, n2, n3) < 10 && ((n4 = this.method_2c2cf7bc_Dne(n, n2, n3)) == zKP.field_16319416_DyG.field_21260d_FWm || n4 == zKP.field_374330f_Dne.field_21260d_FWm) && this.method_2dee76f_bzF(n, n2, n3) == 0) {
            if (!bl) {
                return true;
            }
            boolean bl2 = true;
            if (bl2 && this.method_d9802b31_Dne(n - 1, n2, n3) != KFd.field_1411d34d_div) {
                bl2 = false;
            }
            if (bl2 && this.method_d9802b31_Dne(n + 1, n2, n3) != KFd.field_1411d34d_div) {
                bl2 = false;
            }
            if (bl2 && this.method_d9802b31_Dne(n, n2, n3 - 1) != KFd.field_1411d34d_div) {
                bl2 = false;
            }
            if (bl2 && this.method_d9802b31_Dne(n, n2, n3 + 1) != KFd.field_1411d34d_div) {
                bl2 = false;
            }
            if (!bl2) {
                return true;
            }
        }
        return false;
    }

    protected void method_b34a9e6a_Dne(mrb mrb2) {
        this.field_37e0a6a_Dne.method_143fdded_bzF(true);
    }

    public boolean method_6b4d1514_Dne(bSp bSp2, KFd kFd) {
        int n = geR.method_117d0718_FWm(bSp2.field_2092a9_Dne);
        int n2 = geR.method_117d0718_FWm(bSp2.field_267cf0_Qnq + 1.0);
        int n3 = geR.method_117d0718_FWm(bSp2.field_212608_FWm);
        int n4 = geR.method_117d0718_FWm(bSp2.field_2d29ef_aFZ + 1.0);
        int n5 = geR.method_117d0718_FWm(bSp2.field_2e5f16_bzF);
        int n6 = geR.method_117d0718_FWm(bSp2.field_388da1_zGp + 1.0);
        for (int i = n; i < n2; ++i) {
            for (int j = n3; j < n4; ++j) {
                for (int k = n5; k < n6; ++k) {
                    zKP zKP2 = zKP.field_8374b848_Dne[this.method_2c2cf7bc_Dne(i, j, k)];
                    if (zKP2 == null || zKP2.field_368fd23_Dne != kFd) continue;
                    return true;
                }
            }
        }
        return false;
    }

    public Qnq(iDE iDE2, String string, mrb mrb2, Jik jik, Bkx bkx, dLs dLs2) {
        PrX prX;
        this.field_f0d8c563_DyG = new ArrayList();
        this.field_2c369dc2_div = new ArrayList();
        this.field_2c197105_Qnq = new ArrayList();
        this.field_10b14626_aFZ = new ArrayList();
        this.field_21260d_FWm = new Random().nextInt();
        this.field_7331eae7_Dne = new Random();
        this.field_d97fc834_zGp = new ArrayList();
        this.field_379663e_Dne = new oJI(this);
        this.field_37edbe8_Dne = new ziS(300, 2000);
        this.field_56371c0c_Dne = Calendar.getInstance();
        this.field_36c9bde_Dne = new SFA();
        this.field_dc9cb15_Dne = new ArrayList();
        this.field_83b48b6a_Dne = new HashSet();
        this.field_388da6_zGp = this.field_7331eae7_Dne.nextInt(12000);
        this.field_3f1c589_Dne = new int[32768];
        this.field_3769502_Dne = iDE2;
        this.field_365731d_Dne = bkx;
        this.field_3698a74_Dne = new LLx(iDE2);
        this.field_37472c1_Dne = dLs2;
        this.field_37e0a6a_Dne = iDE2.method_231798c9_Dne();
        this.field_3690d00_Dne = jik != null ? jik : (this.field_37e0a6a_Dne != null && this.field_37e0a6a_Dne.method_907a9d14_Qnq() != 0 ? Jik.method_9e6cb0ee_Dne(this.field_37e0a6a_Dne.method_907a9d14_Qnq()) : Jik.method_9e6cb0ee_Dne(0));
        if (this.field_37e0a6a_Dne == null) {
            this.field_37e0a6a_Dne = new xoY(mrb2, string);
        } else {
            this.field_37e0a6a_Dne.method_8f501fe4_Dne(string);
        }
        this.field_3690d00_Dne.method_83516093_Dne(this);
        this.field_37042d5_Dne = this.method_2309d134_Dne();
        if (!this.field_37e0a6a_Dne.method_d44b4596_zGp()) {
            try {
                this.method_b34a9e6a_Dne(mrb2);
            }
            catch (Throwable throwable) {
                McM mcM = McM.method_948e60df_Dne(throwable, "Exception initializing level");
                try {
                    this.method_f7903e73_Dne(mcM);
                }
                catch (Throwable throwable2) {
                    // empty catch block
                }
                throw new kaJ(mcM);
            }
            this.field_37e0a6a_Dne.method_143fdded_bzF(true);
        }
        if ((prX = (PrX)this.field_3698a74_Dne.method_64d498e5_Dne(PrX.class, "villages")) == null) {
            this.field_36be6b6_Dne = new PrX(this);
            this.field_3698a74_Dne.method_65052564_Dne("villages", this.field_36be6b6_Dne);
        } else {
            this.field_36be6b6_Dne = prX;
            this.field_36be6b6_Dne.method_83516093_Dne(this);
        }
        this.method_ae128dc7_bzF();
        this.method_9feec6c2_Zpi();
        xNA.method_c5e18f65_Dne(this.field_37e0a6a_Dne);
    }

    public Noo method_f7903e73_Dne(McM mcM) {
        Noo noo = mcM.method_424da062_Dne("Affected level", 1);
        noo.method_5e295ec0_Dne("Level name", this.field_37e0a6a_Dne == null ? "????" : this.field_37e0a6a_Dne.method_eecad346_Dne());
        noo.method_2aeeb7ad_Dne("All players", new zGp(this));
        noo.method_2aeeb7ad_Dne("Chunk stats", new DyG(this));
        try {
            this.field_37e0a6a_Dne.method_7e400579_Dne(noo);
        }
        catch (Throwable throwable) {
            noo.method_37db6a91_Dne("Level Data Unobtainable", throwable);
        }
        return noo;
    }

    @Override
    public ziS method_23186a47_Dne() {
        return this.field_37edbe8_Dne;
    }

    public ZfC method_f8802153_FWm() {
        return this.field_37042d5_Dne;
    }

    protected void method_b0a28144_div() {
        this.method_7ad38803_DyG();
    }

    public Calendar method_8fb123cd_Dne() {
        if (this.method_7c6f602d_FWm() % 600L == 0L) {
            this.field_56371c0c_Dne.setTimeInMillis(System.currentTimeMillis());
        }
        return this.field_56371c0c_Dne;
    }

    public void method_907a9d21_Qnq() {
        this.method_a98a0660_aFZ();
    }

    public wdG method_f4cb42fd_Dne(sMa sMa2, sMa sMa3, float f, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.field_365731d_Dne.method_8f501fe4_Dne("pathfind");
        int n = geR.method_117d0718_FWm(sMa2.field_2f0dd3_div);
        int n2 = geR.method_117d0718_FWm(sMa2.field_22c5fd_IjH + 1.0);
        int n3 = geR.method_117d0718_FWm(sMa2.field_334487_mrb);
        int n4 = (int)(f + 16.0f);
        int n5 = n - n4;
        int n6 = n2 - n4;
        int n7 = n3 - n4;
        int n8 = n + n4;
        int n9 = n2 + n4;
        int n10 = n3 + n4;
        ATE aTE = new ATE(this, n5, n6, n7, n8, n9, n10, 0);
        wdG wdG2 = new Seh(aTE, bl, bl2, bl3, bl4).method_1c13f0fd_Dne(sMa2, sMa3, f);
        this.field_365731d_Dne.method_7c6f6039_FWm();
        return wdG2;
    }

    public int method_7a46288d_Dne() {
        return this.field_3690d00_Dne.method_ce7f615d_Dne(this.field_37e0a6a_Dne.method_ae128dbb_bzF());
    }

    public yTR method_4ff037c_Dne(sMa sMa2, double d, double d2, double d3, float f, boolean bl, boolean bl2) {
        yTR yTR2 = new yTR(this, sMa2, d, d2, d3, f);
        yTR2.field_2092bf_Dne = bl;
        yTR2.field_21261e_FWm = bl2;
        yTR2.method_7a46289a_Dne();
        yTR2.method_ce7f9d7a_Dne(true);
        return yTR2;
    }

    public Qnq(iDE iDE2, String string, Jik jik, mrb mrb2, Bkx bkx, dLs dLs2) {
        this.field_f0d8c563_DyG = new ArrayList();
        this.field_2c369dc2_div = new ArrayList();
        this.field_2c197105_Qnq = new ArrayList();
        this.field_10b14626_aFZ = new ArrayList();
        this.field_21260d_FWm = new Random().nextInt();
        this.field_7331eae7_Dne = new Random();
        this.field_d97fc834_zGp = new ArrayList();
        this.field_379663e_Dne = new oJI(this);
        this.field_37edbe8_Dne = new ziS(300, 2000);
        this.field_56371c0c_Dne = Calendar.getInstance();
        this.field_36c9bde_Dne = new SFA();
        this.field_dc9cb15_Dne = new ArrayList();
        this.field_83b48b6a_Dne = new HashSet();
        this.field_388da6_zGp = this.field_7331eae7_Dne.nextInt(12000);
        this.field_3f1c589_Dne = new int[32768];
        this.field_3769502_Dne = iDE2;
        this.field_365731d_Dne = bkx;
        this.field_37e0a6a_Dne = new xoY(mrb2, string);
        this.field_3690d00_Dne = jik;
        this.field_3698a74_Dne = new LLx(iDE2);
        this.field_37472c1_Dne = dLs2;
        PrX prX = (PrX)this.field_3698a74_Dne.method_64d498e5_Dne(PrX.class, "villages");
        if (prX == null) {
            this.field_36be6b6_Dne = new PrX(this);
            this.field_3698a74_Dne.method_65052564_Dne("villages", this.field_36be6b6_Dne);
        } else {
            this.field_36be6b6_Dne = prX;
            this.field_36be6b6_Dne.method_83516093_Dne(this);
        }
        jik.method_83516093_Dne(this);
        this.field_37042d5_Dne = this.method_2309d134_Dne();
        this.method_ae128dc7_bzF();
        this.method_9feec6c2_Zpi();
        xNA.method_c5e18f65_Dne(this.field_37e0a6a_Dne);
    }

    public void method_ad72a713_bzF(sMa sMa2) {
        if (sMa2.field_37b45e5_Dne != null) {
            sMa2.field_37b45e5_Dne.method_ad72a713_bzF(null);
        }
        if (sMa2.field_203511c4_FWm != null) {
            sMa2.method_ad72a713_bzF(null);
        }
        sMa2.method_5d73f9d_g_();
        if (sMa2 instanceof FiG) {
            this.field_2c197105_Qnq.remove(sMa2);
            this.method_9a443a99_XHL();
        }
    }

    public boolean method_f2b15eb2_udO(int n, int n2, int n3) {
        if (!this.method_ae128dcb_bzF()) {
            return false;
        }
        if (!this.method_76d9fc47_aFZ(n, n2, n3)) {
            return false;
        }
        if (this.method_5c563934_Qnq(n, n3) > n2) {
            return false;
        }
        OdI odI = this.method_90477c37_Dne(n, n3);
        return odI.method_7a46289e_Dne() ? false : odI.method_7c6f603d_FWm();
    }

    public float method_811d6d74_Dne(chN chN2, bSp bSp2) {
        double d = 1.0 / ((bSp2.field_267cf0_Qnq - bSp2.field_2092a9_Dne) * 2.0 + 1.0);
        double d2 = 1.0 / ((bSp2.field_2d29ef_aFZ - bSp2.field_212608_FWm) * 2.0 + 1.0);
        double d3 = 1.0 / ((bSp2.field_388da1_zGp - bSp2.field_2e5f16_bzF) * 2.0 + 1.0);
        int n = 0;
        int n2 = 0;
        float f = 0.0f;
        while (f <= 1.0f) {
            float f2 = 0.0f;
            while (f2 <= 1.0f) {
                float f3 = 0.0f;
                while (f3 <= 1.0f) {
                    double d4 = bSp2.field_2092a9_Dne + (bSp2.field_267cf0_Qnq - bSp2.field_2092a9_Dne) * (double)f;
                    double d5 = bSp2.field_212608_FWm + (bSp2.field_2d29ef_aFZ - bSp2.field_212608_FWm) * (double)f2;
                    double d6 = bSp2.field_2e5f16_bzF + (bSp2.field_388da1_zGp - bSp2.field_2e5f16_bzF) * (double)f3;
                    if (this.method_38be674_Dne(this.method_23186a47_Dne().method_e4505d6c_Dne(d4, d5, d6), chN2) == null) {
                        ++n;
                    }
                    ++n2;
                    f3 = (float)((double)f3 + d3);
                }
                f2 = (float)((double)f2 + d2);
            }
            f = (float)((double)f + d);
        }
        return (float)n / (float)n2;
    }

    public void method_62d7c9a6_Dne(double d, double d2, double d3, String string, float f, float f2, boolean bl) {
    }

    @Override
    public int method_2ee8c46c_FWm(int n, int n2, int n3, int n4) {
        int n5 = this.method_2c2cf7bc_Dne(n, n2, n3);
        return n5 == 0 ? 0 : zKP.field_8374b848_Dne[n5].method_56b56428_FWm(this, n, n2, n3, n4);
    }

    public void method_17d7ea99_FWm(int n, int n2, int n3, int n4, int n5, int n6) {
    }

    public void method_ce7f616a_Dne(long l) {
        this.field_37e0a6a_Dne.method_ce7f616a_Dne(l);
    }

    public List method_e7d4af05_Dne(Class clazz, bSp bSp2, pUe pUe2) {
        int n = geR.method_117d0718_FWm((bSp2.field_2092a9_Dne - 2.0) / 16.0);
        int n2 = geR.method_117d0718_FWm((bSp2.field_267cf0_Qnq + 2.0) / 16.0);
        int n3 = geR.method_117d0718_FWm((bSp2.field_2e5f16_bzF - 2.0) / 16.0);
        int n4 = geR.method_117d0718_FWm((bSp2.field_388da1_zGp + 2.0) / 16.0);
        ArrayList arrayList = new ArrayList();
        for (int i = n; i <= n2; ++i) {
            for (int j = n3; j <= n4; ++j) {
                if (!this.method_16cca7e_Dne(i, j)) continue;
                this.method_e1796070_FWm(i, j).method_d017feb1_Dne(clazz, bSp2, arrayList, pUe2);
            }
        }
        return arrayList;
    }

    public boolean method_9ed6d42c_Dne(bSp bSp2) {
        return this.method_aff03556_Dne(bSp2, null);
    }

    public boolean method_aff03556_Dne(bSp bSp2, sMa sMa2) {
        List list = this.method_71df22e6_FWm(null, bSp2);
        for (int i = 0; i < list.size(); ++i) {
            sMa sMa3 = (sMa)list.get(i);
            if (sMa3.field_2a9ae7_Zpi || !sMa3.field_2e5f2c_bzF || sMa3 == sMa2) continue;
            return false;
        }
        return true;
    }

    public void method_b43ddeb4_Dne(sMa sMa2, boolean bl) {
        int n = geR.method_117d0718_FWm(sMa2.field_2f0dd3_div);
        int n2 = geR.method_117d0718_FWm(sMa2.field_334487_mrb);
        int n3 = 32;
        if (!bl || this.method_c6b5263e_Dne(n - n3, 0, n2 - n3, n + n3, 0, n2 + n3)) {
            sMa2.field_36b0a4_udO = sMa2.field_2f0dd3_div;
            sMa2.field_34225f_ooe = sMa2.field_22c5fd_IjH;
            sMa2.field_36714f_trS = sMa2.field_334487_mrb;
            sMa2.field_2a9ad3_Zpi = sMa2.field_334489_mrb;
            sMa2.field_31b813_kGO = sMa2.field_29186a_XHL;
            if (bl && sMa2.field_367165_trS) {
                if (sMa2.field_203511c4_FWm != null) {
                    sMa2.method_ce109fc6_vSL();
                } else {
                    ++sMa2.field_388da6_zGp;
                    sMa2.method_7a46289a_Dne();
                }
            }
            this.field_365731d_Dne.method_8f501fe4_Dne("chunkCheck");
            if (Double.isNaN(sMa2.field_2f0dd3_div) || Double.isInfinite(sMa2.field_2f0dd3_div)) {
                sMa2.field_2f0dd3_div = sMa2.field_36b0a4_udO;
            }
            if (Double.isNaN(sMa2.field_22c5fd_IjH) || Double.isInfinite(sMa2.field_22c5fd_IjH)) {
                sMa2.field_22c5fd_IjH = sMa2.field_34225f_ooe;
            }
            if (Double.isNaN(sMa2.field_334487_mrb) || Double.isInfinite(sMa2.field_334487_mrb)) {
                sMa2.field_334487_mrb = sMa2.field_36714f_trS;
            }
            if (Double.isNaN(sMa2.field_29186a_XHL) || Double.isInfinite(sMa2.field_29186a_XHL)) {
                sMa2.field_29186a_XHL = sMa2.field_31b813_kGO;
            }
            if (Double.isNaN(sMa2.field_334489_mrb) || Double.isInfinite(sMa2.field_334489_mrb)) {
                sMa2.field_334489_mrb = sMa2.field_2a9ad3_Zpi;
            }
            int n4 = geR.method_117d0718_FWm(sMa2.field_2f0dd3_div / 16.0);
            int n5 = geR.method_117d0718_FWm(sMa2.field_22c5fd_IjH / 16.0);
            int n6 = geR.method_117d0718_FWm(sMa2.field_334487_mrb / 16.0);
            if (!sMa2.field_367165_trS || sMa2.field_22c602_IjH != n4 || sMa2.field_33448c_mrb != n5 || sMa2.field_29186d_XHL != n6) {
                if (sMa2.field_367165_trS && this.method_16cca7e_Dne(sMa2.field_22c602_IjH, sMa2.field_29186d_XHL)) {
                    this.method_e1796070_FWm(sMa2.field_22c602_IjH, sMa2.field_29186d_XHL).method_b43d9ee3_Dne(sMa2, sMa2.field_33448c_mrb);
                }
                if (this.method_16cca7e_Dne(n4, n6)) {
                    sMa2.field_367165_trS = true;
                    this.method_e1796070_FWm(n4, n6).method_bb7dd820_Dne(sMa2);
                } else {
                    sMa2.field_367165_trS = false;
                }
            }
            this.field_365731d_Dne.method_7c6f6039_FWm();
            if (bl && sMa2.field_367165_trS && sMa2.field_37b45e5_Dne != null) {
                if (!sMa2.field_37b45e5_Dne.field_2a9ae7_Zpi && sMa2.field_37b45e5_Dne.field_203511c4_FWm == sMa2) {
                    this.method_efba61a_aFZ(sMa2.field_37b45e5_Dne);
                } else {
                    sMa2.field_37b45e5_Dne.field_203511c4_FWm = null;
                    sMa2.field_37b45e5_Dne = null;
                }
            }
        }
    }

    public chN method_6dac6968_Dne(sMa sMa2, float f) {
        float f2;
        float f3;
        float f4 = this.method_117d0e97_FWm(f);
        float f5 = geR.method_117d0e97_FWm(f4 * (float)Math.PI * 2.0f) * 2.0f + 0.5f;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        int n = geR.method_117d0718_FWm(sMa2.field_2f0dd3_div);
        int n2 = geR.method_117d0718_FWm(sMa2.field_334487_mrb);
        OdI odI = this.method_90477c37_Dne(n, n2);
        float f6 = odI.method_ae128db7_bzF();
        int n3 = odI.method_ce7f5259_Dne(f6);
        float f7 = (float)(n3 >> 16 & 0xFF) / 255.0f;
        float f8 = (float)(n3 >> 8 & 0xFF) / 255.0f;
        float f9 = (float)(n3 & 0xFF) / 255.0f;
        f7 *= f5;
        f8 *= f5;
        f9 *= f5;
        float f10 = this.method_b51dd45e_zGp(f);
        if (f10 > 0.0f) {
            f3 = (f7 * 0.3f + f8 * 0.59f + f9 * 0.11f) * 0.6f;
            f2 = 1.0f - f10 * 0.75f;
            f7 = f7 * f2 + f3 * (1.0f - f2);
            f8 = f8 * f2 + f3 * (1.0f - f2);
            f9 = f9 * f2 + f3 * (1.0f - f2);
        }
        if ((f3 = this.method_87b72d50_aFZ(f)) > 0.0f) {
            f2 = (f7 * 0.3f + f8 * 0.59f + f9 * 0.11f) * 0.2f;
            float f11 = 1.0f - f3 * 0.75f;
            f7 = f7 * f11 + f2 * (1.0f - f11);
            f8 = f8 * f11 + f2 * (1.0f - f11);
            f9 = f9 * f11 + f2 * (1.0f - f11);
        }
        if (this.field_267cf5_Qnq > 0) {
            f2 = (float)this.field_267cf5_Qnq - f;
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            f7 = f7 * (1.0f - (f2 *= 0.45f)) + 0.8f * f2;
            f8 = f8 * (1.0f - f2) + 0.8f * f2;
            f9 = f9 * (1.0f - f2) + 1.0f * f2;
        }
        return this.method_23186a47_Dne().method_e4505d6c_Dne(f7, f8, f9);
    }

    public long method_7a46288e_Dne() {
        return this.field_37e0a6a_Dne.method_7a46288e_Dne();
    }

    public chN method_d91908ef_FWm(float f) {
        float f2 = this.method_117d0e97_FWm(f);
        return this.field_3690d00_Dne.method_b9fa6ae2_Dne(f2, f);
    }

    public boolean method_2ee8c47d_FWm(int n, int n2, int n3, int n4) {
        return this.method_17d7ea9d_FWm(n, n2, n3, n4, 0, 3);
    }

    public void method_2e7161e2_Qnq(int n, int n2, int n3) {
        if (!this.field_3690d00_Dne.field_21261e_FWm) {
            this.method_60f38dfc_Dne(udO.field_37c82cc_Dne, n, n2, n3);
        }
        this.method_60f38dfc_Dne(udO.field_20364eab_FWm, n, n2, n3);
    }

    public boolean method_5972b42f_Dne(int n, int n2, int n3, boolean bl) {
        int n4 = this.method_2c2cf7bc_Dne(n, n2, n3);
        if (n4 > 0) {
            int n5 = this.method_2dee76f_bzF(n, n2, n3);
            this.method_57aed1c2_Qnq(2001, n, n2, n3, n4 + (n5 << 12));
            if (bl) {
                zKP.field_8374b848_Dne[n4].method_fd7de26f_FWm(this, n, n2, n3, n5, 0);
            }
            return this.method_17d7ea9d_FWm(n, n2, n3, 0, 0, 3);
        }
        return false;
    }

    protected void method_f322b0ed_Dne(int n, int n2, qMV qMV2) {
        this.field_365731d_Dne.method_110c4dc3_FWm("moodSound");
        if (this.field_388da6_zGp == 0 && !this.field_2d2a05_aFZ) {
            FiG fiG;
            this.field_21260d_FWm = this.field_21260d_FWm * 3 + 1013904223;
            int n3 = this.field_21260d_FWm >> 2;
            int n4 = n3 & 0xF;
            int n5 = n3 >> 8 & 0xF;
            int n6 = n3 >> 16 & 0x7F;
            int n7 = qMV2.method_2c2cf7bc_Dne(n4, n6, n5);
            if (n7 == 0 && this.method_2e7161d5_Qnq(n4 += n, n6, n5 += n2) <= this.field_7331eae7_Dne.nextInt(8) && this.method_f476b68e_FWm(udO.field_37c82cc_Dne, n4, n6, n5) <= 0 && (fiG = this.method_fcf6c807_Dne((double)n4 + 0.5, (double)n6 + 0.5, (double)n5 + 0.5, 8.0)) != null && fiG.method_2be42992_Dne((double)n4 + 0.5, (double)n6 + 0.5, (double)n5 + 0.5) > 4.0) {
                this.method_c961c6ee_Dne((double)n4 + 0.5, (double)n6 + 0.5, (double)n5 + 0.5, "ambient.cave.cave", 0.7f, 0.8f + this.field_7331eae7_Dne.nextFloat() * 0.2f);
                this.field_388da6_zGp = this.field_7331eae7_Dne.nextInt(12000) + 6000;
            }
        }
        this.field_365731d_Dne.method_110c4dc3_FWm("checkLight");
        qMV2.method_b0a28144_div();
    }

    public float method_117d0e97_FWm(float f) {
        return this.field_3690d00_Dne.method_16d3386_Dne(this.field_37e0a6a_Dne.method_ae128dbb_bzF(), f);
    }

    public void method_2d5bac6d_Dne(FiG fiG, String string, float f, float f2) {
        if (fiG != null && string != null) {
            for (int i = 0; i < this.field_d97fc834_zGp.size(); ++i) {
                ((IjH)this.field_d97fc834_zGp.get(i)).method_f3667971_Dne(fiG, string, fiG.field_2f0dd3_div, fiG.field_22c5fd_IjH - (double)fiG.field_36b0a6_udO, fiG.field_334487_mrb, f, f2);
            }
        }
    }

    public int method_e53317c4_zGp(int n, int n2, int n3) {
        int n4 = 0;
        int n5 = Math.max(n4, this.method_2ee8c46c_FWm(n, n2 - 1, n3, 0));
        if (n5 >= 15) {
            return n5;
        }
        if ((n5 = Math.max(n5, this.method_2ee8c46c_FWm(n, n2 + 1, n3, 1))) >= 15) {
            return n5;
        }
        if ((n5 = Math.max(n5, this.method_2ee8c46c_FWm(n, n2, n3 - 1, 2))) >= 15) {
            return n5;
        }
        if ((n5 = Math.max(n5, this.method_2ee8c46c_FWm(n, n2, n3 + 1, 3))) >= 15) {
            return n5;
        }
        if ((n5 = Math.max(n5, this.method_2ee8c46c_FWm(n - 1, n2, n3, 4))) >= 15) {
            return n5;
        }
        return (n5 = Math.max(n5, this.method_2ee8c46c_FWm(n + 1, n2, n3, 5))) >= 15 ? n5 : n5;
    }

    public void method_c583bffb_Dne(int n, int n2, int n3, ipD ipD2) {
        if (ipD2 != null && !ipD2.method_a98a0664_aFZ()) {
            if (this.field_388db7_zGp) {
                ipD2.field_267cf5_Qnq = n;
                ipD2.field_2d29f4_aFZ = n2;
                ipD2.field_388da6_zGp = n3;
                Iterator iterator = this.field_f0d8c563_DyG.iterator();
                while (iterator.hasNext()) {
                    ipD ipD3 = (ipD)iterator.next();
                    if (ipD3.field_267cf5_Qnq != n || ipD3.field_2d29f4_aFZ != n2 || ipD3.field_388da6_zGp != n3) continue;
                    ipD3.method_d44b4592_zGp();
                    iterator.remove();
                }
                this.field_f0d8c563_DyG.add(ipD2);
            } else {
                this.field_7eb83e1f_bzF.add(ipD2);
                qMV qMV2 = this.method_e1796070_FWm(n >> 4, n3 >> 4);
                if (qMV2 != null) {
                    qMV2.method_c583bffb_Dne(n & 0xF, n2, n3 & 0xF, ipD2);
                }
            }
        }
    }

    public int method_16cca6d_Dne(int n, int n2) {
        int n3 = 63;
        while (!this.method_2c2cf7cd_Dne(n, n3 + 1, n2)) {
            ++n3;
        }
        return this.method_2c2cf7bc_Dne(n, n3, n2);
    }

    @Override
    public int method_2dee76f_bzF(int n, int n2, int n3) {
        if (n >= -30000000 && n3 >= -30000000 && n < 30000000 && n3 < 30000000) {
            if (n2 < 0) {
                return 0;
            }
            if (n2 >= 256) {
                return 0;
            }
            qMV qMV2 = this.method_e1796070_FWm(n >> 4, n3 >> 4);
            return qMV2.method_2dee76f_bzF(n &= 0xF, n2, n3 &= 0xF);
        }
        return 0;
    }

    public vWZ method_64d498e5_Dne(Class clazz, String string) {
        return this.field_3698a74_Dne.method_64d498e5_Dne(clazz, string);
    }

    public int method_f476b68e_FWm(udO udO2, int n, int n2, int n3) {
        if (n2 < 0) {
            n2 = 0;
        }
        if (n2 >= 256) {
            n2 = 255;
        }
        if (n >= -30000000 && n3 >= -30000000 && n < 30000000 && n3 < 30000000) {
            int n4 = n >> 4;
            int n5 = n3 >> 4;
            if (!this.method_16cca7e_Dne(n4, n5)) {
                return udO2.field_2092ae_Dne;
            }
            qMV qMV2 = this.method_e1796070_FWm(n4, n5);
            return qMV2.method_60f38def_Dne(udO2, n & 0xF, n2, n3 & 0xF);
        }
        return udO2.field_2092ae_Dne;
    }

    public FiG method_c32e43ea_FWm(sMa sMa2, double d) {
        return this.method_9079f0a6_FWm(sMa2.field_2f0dd3_div, sMa2.field_22c5fd_IjH, sMa2.field_334487_mrb, d);
    }

    public float method_b51dd45e_zGp(float f) {
        return this.field_2092ab_Dne + (this.field_21260a_FWm - this.field_2092ab_Dne) * f;
    }

    public void method_c073daf8_mrb() throws div {
        this.field_3769502_Dne.method_7c6f6039_FWm();
    }

    public int method_ce7f5259_Dne(float f) {
        float f2 = this.method_117d0e97_FWm(f);
        float f3 = 1.0f - (geR.method_117d0e97_FWm(f2 * (float)Math.PI * 2.0f) * 2.0f + 0.5f);
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        f3 = 1.0f - f3;
        f3 = (float)((double)f3 * (1.0 - (double)(this.method_b51dd45e_zGp(f) * 5.0f) / 16.0));
        f3 = (float)((double)f3 * (1.0 - (double)(this.method_87b72d50_aFZ(f) * 5.0f) / 16.0));
        f3 = 1.0f - f3;
        return (int)(f3 * 11.0f);
    }

    private void method_9feec6c2_Zpi() {
        if (this.field_37e0a6a_Dne.method_7c6f603d_FWm()) {
            this.field_21260a_FWm = 1.0f;
            if (this.field_37e0a6a_Dne.method_7a46289e_Dne()) {
                this.field_267cf2_Qnq = 1.0f;
            }
        }
    }

    public tgc method_2315aa7b_Dne() {
        return this.field_3690d00_Dne.field_37c1c1c_Dne;
    }

    protected void method_94d18be1_FWm(sMa sMa2) {
        for (int i = 0; i < this.field_d97fc834_zGp.size(); ++i) {
            ((IjH)this.field_d97fc834_zGp.get(i)).method_94d18be1_FWm(sMa2);
        }
    }

    public boolean method_17d7ea9d_FWm(int n, int n2, int n3, int n4, int n5, int n6) {
        if (n >= -30000000 && n3 >= -30000000 && n < 30000000 && n3 < 30000000) {
            if (n2 < 0) {
                return false;
            }
            if (n2 >= 256) {
                return false;
            }
            qMV qMV2 = this.method_e1796070_FWm(n >> 4, n3 >> 4);
            int n7 = 0;
            if ((n6 & 1) != 0) {
                n7 = qMV2.method_2c2cf7bc_Dne(n & 0xF, n2, n3 & 0xF);
            }
            boolean bl = qMV2.method_d4dc89ed_Dne(n & 0xF, n2, n3 & 0xF, n4, n5);
            this.field_365731d_Dne.method_8f501fe4_Dne("checkLight");
            this.method_2e7161e2_Qnq(n, n2, n3);
            this.field_365731d_Dne.method_7c6f6039_FWm();
            if (bl) {
                if (!((n6 & 2) == 0 || this.field_2d2a05_aFZ && (n6 & 4) != 0)) {
                    this.method_2c2cf7c9_Dne(n, n2, n3);
                }
                if (!this.field_2d2a05_aFZ && (n6 & 1) != 0) {
                    this.method_5972745a_Dne(n, n2, n3, n7);
                    zKP zKP2 = zKP.field_8374b848_Dne[n4];
                    if (zKP2 != null && zKP2.method_582b29b_a_()) {
                        this.method_6465ff20_aFZ(n, n2, n3, n4);
                    }
                }
            }
            return bl;
        }
        return false;
    }

    protected boolean method_16cca7e_Dne(int n, int n2) {
        return this.field_37042d5_Dne.method_16cca7e_Dne(n, n2);
    }

    public boolean method_309ee6e3_div(int n, int n2, int n3) {
        int n4 = this.method_2c2cf7bc_Dne(n, n2, n3);
        if (n4 != 0 && zKP.field_8374b848_Dne[n4] != null) {
            bSp bSp2 = zKP.field_8374b848_Dne[n4].method_8c85fe2_Dne(this, n, n2, n3);
            return bSp2 != null && bSp2.method_7a462888_Dne() >= 1.0;
        }
        return false;
    }

    public void method_37142557_Dne(double d, double d2, double d3, double d4, double d5, double d6, WkD wkD) {
    }

    public boolean method_7b8cc9d7_ooe(int n, int n2, int n3) {
        OdI odI = this.method_90477c37_Dne(n, n3);
        return odI.method_ae128dcb_bzF();
    }

    public void method_135a35a7_bzF(int n, int n2, int n3, int n4, int n5, int n6) {
    }

    public void method_65052564_Dne(String string, vWZ vWZ2) {
        this.field_3698a74_Dne.method_65052564_Dne(string, vWZ2);
    }

    public void method_bfa54b80_Dne(FiG fiG, int n, int n2, int n3, int n4, int n5) {
        try {
            for (int i = 0; i < this.field_d97fc834_zGp.size(); ++i) {
                ((IjH)this.field_d97fc834_zGp.get(i)).method_bfa54b80_Dne(fiG, n, n2, n3, n4, n5);
            }
        }
        catch (Throwable throwable) {
            McM mcM = McM.method_948e60df_Dne(throwable, "Playing level event");
            Noo noo = mcM.method_284dc627_Dne("Level event being played");
            noo.method_5e295ec0_Dne("Block coordinates", Noo.method_924467f7_Dne(n2, n3, n4));
            noo.method_5e295ec0_Dne("Event source", fiG);
            noo.method_5e295ec0_Dne("Event type", n);
            noo.method_5e295ec0_Dne("Event data", n5);
            throw new kaJ(mcM);
        }
    }

    public void method_ae128dc7_bzF() {
        int n = this.method_ce7f5259_Dne(1.0f);
        if (n != this.field_2092ae_Dne) {
            this.field_2092ae_Dne = n;
        }
    }

    public void method_c961c6ee_Dne(double d, double d2, double d3, String string, float f, float f2) {
        if (string != null) {
            for (int i = 0; i < this.field_d97fc834_zGp.size(); ++i) {
                ((IjH)this.field_d97fc834_zGp.get(i)).method_676c4f9a_Dne(string, d, d2, d3, f, f2);
            }
        }
    }

    public void method_8600ec24_Dne(String string, double d, double d2, double d3, double d4, double d5, double d6) {
        for (int i = 0; i < this.field_d97fc834_zGp.size(); ++i) {
            ((IjH)this.field_d97fc834_zGp.get(i)).method_8600ec24_Dne(string, d, d2, d3, d4, d5, d6);
        }
    }

    public void method_285a57e3_aFZ(int n, int n2, int n3, int n4, int n5) {
        for (int i = 0; i < this.field_d97fc834_zGp.size(); ++i) {
            IjH ijH = (IjH)this.field_d97fc834_zGp.get(i);
            ijH.method_ae303daa_FWm(n, n2, n3, n4, n5);
        }
    }

    public int method_2e7161d5_Qnq(int n, int n2, int n3) {
        if (n2 < 0) {
            return 0;
        }
        if (n2 >= 256) {
            n2 = 255;
        }
        return this.method_e1796070_FWm(n >> 4, n3 >> 4).method_5972744d_Dne(n & 0xF, n2, n3 & 0xF, 0);
    }

    public boolean method_2e7161e6_Qnq(int n, int n2, int n3) {
        return this.method_17d7ea9d_FWm(n, n2, n3, 0, 0, 3);
    }

    public int method_73b4985a_bzF(int n, int n2) {
        if (n >= -30000000 && n2 >= -30000000 && n < 30000000 && n2 < 30000000) {
            if (!this.method_16cca7e_Dne(n >> 4, n2 >> 4)) {
                return 0;
            }
            qMV qMV2 = this.method_e1796070_FWm(n >> 4, n2 >> 4);
            return qMV2.field_2e5f1b_bzF;
        }
        return 0;
    }

    protected void method_a98a0660_aFZ() {
        if (!this.field_3690d00_Dne.field_21261e_FWm) {
            int n = this.field_37e0a6a_Dne.method_d44b4585_zGp();
            if (n <= 0) {
                if (this.field_37e0a6a_Dne.method_7a46289e_Dne()) {
                    this.field_37e0a6a_Dne.method_87b738a3_aFZ(this.field_7331eae7_Dne.nextInt(12000) + 3600);
                } else {
                    this.field_37e0a6a_Dne.method_87b738a3_aFZ(this.field_7331eae7_Dne.nextInt(168000) + 12000);
                }
            } else {
                this.field_37e0a6a_Dne.method_87b738a3_aFZ(--n);
                if (n <= 0) {
                    this.field_37e0a6a_Dne.method_ce7f9d7a_Dne(!this.field_37e0a6a_Dne.method_7a46289e_Dne());
                }
            }
            int n2 = this.field_37e0a6a_Dne.method_7ad387f6_DyG();
            if (n2 <= 0) {
                if (this.field_37e0a6a_Dne.method_7c6f603d_FWm()) {
                    this.field_37e0a6a_Dne.method_b51ddfb1_zGp(this.field_7331eae7_Dne.nextInt(12000) + 12000);
                } else {
                    this.field_37e0a6a_Dne.method_b51ddfb1_zGp(this.field_7331eae7_Dne.nextInt(168000) + 12000);
                }
            } else {
                this.field_37e0a6a_Dne.method_b51ddfb1_zGp(--n2);
                if (n2 <= 0) {
                    this.field_37e0a6a_Dne.method_117d59bb_FWm(!this.field_37e0a6a_Dne.method_7c6f603d_FWm());
                }
            }
            this.field_2092ab_Dne = this.field_21260a_FWm;
            this.field_21260a_FWm = this.field_37e0a6a_Dne.method_7c6f603d_FWm() ? (float)((double)this.field_21260a_FWm + 0.01) : (float)((double)this.field_21260a_FWm - 0.01);
            if (this.field_21260a_FWm < 0.0f) {
                this.field_21260a_FWm = 0.0f;
            }
            if (this.field_21260a_FWm > 1.0f) {
                this.field_21260a_FWm = 1.0f;
            }
            this.field_2e5f18_bzF = this.field_267cf2_Qnq;
            this.field_267cf2_Qnq = this.field_37e0a6a_Dne.method_7a46289e_Dne() ? (float)((double)this.field_267cf2_Qnq + 0.01) : (float)((double)this.field_267cf2_Qnq - 0.01);
            if (this.field_267cf2_Qnq < 0.0f) {
                this.field_267cf2_Qnq = 0.0f;
            }
            if (this.field_267cf2_Qnq > 1.0f) {
                this.field_267cf2_Qnq = 1.0f;
            }
        }
    }

    public FiG method_3d2c70b_Dne(sMa sMa2, double d) {
        return this.method_fcf6c807_Dne(sMa2.field_2f0dd3_div, sMa2.field_22c5fd_IjH, sMa2.field_334487_mrb, d);
    }

    @Override
    public int method_5972744d_Dne(int n, int n2, int n3, int n4) {
        int n5 = this.method_60f38def_Dne(udO.field_37c82cc_Dne, n, n2, n3);
        int n6 = this.method_60f38def_Dne(udO.field_20364eab_FWm, n, n2, n3);
        if (n6 < n4) {
            n6 = n4;
        }
        return n5 << 20 | n6 << 4;
    }

    public void method_7eed443f_Dne(String string, int n, int n2, int n3) {
        for (int i = 0; i < this.field_d97fc834_zGp.size(); ++i) {
            ((IjH)this.field_d97fc834_zGp.get(i)).method_7eed443f_Dne(string, n, n2, n3);
        }
    }

    public String method_d1f1ed87_FWm() {
        return this.field_37042d5_Dne.method_eecad346_Dne();
    }

    public void method_c6d158dc_bzF(int n, int n2, int n3, int n4, int n5) {
        for (int i = 0; i < this.field_d97fc834_zGp.size(); ++i) {
            ((IjH)this.field_d97fc834_zGp.get(i)).method_d4dc89e9_Dne(n, n2, n3, n4, n5);
        }
    }

    public void method_bd7ea487_Dne(udO udO2, int n, int n2, int n3, int n4) {
        if (n >= -30000000 && n3 >= -30000000 && n < 30000000 && n3 < 30000000 && n2 >= 0 && n2 < 256 && this.method_16cca7e_Dne(n >> 4, n3 >> 4)) {
            qMV qMV2 = this.method_e1796070_FWm(n >> 4, n3 >> 4);
            qMV2.method_bd7ea487_Dne(udO2, n & 0xF, n2, n3 & 0xF, n4);
            for (int i = 0; i < this.field_d97fc834_zGp.size(); ++i) {
                ((IjH)this.field_d97fc834_zGp.get(i)).method_a6aca7ca_FWm(n, n2, n3);
            }
        }
    }

    public void method_5906e89a_FWm(int n, int n2, int n3, ipD ipD2) {
        if (this.method_2dee780_bzF(n, n2, n3)) {
            this.method_90569c11_Dne(n, n3).method_a98a0660_aFZ();
        }
    }

    public void method_b43d849c_Dne(sMa sMa2, byte by) {
    }

    public void method_9fbb4d61_Qnq(int n, int n2, int n3, int n4) {
        int n5;
        zKP zKP2;
        if (!this.field_2d2a05_aFZ && (zKP2 = zKP.field_8374b848_Dne[n5 = this.method_2c2cf7bc_Dne(n, n2, n3)]) != null) {
            try {
                zKP2.method_f9bf07d3_Dne(this, n, n2, n3, n4);
            }
            catch (Throwable throwable) {
                int n6;
                McM mcM = McM.method_948e60df_Dne(throwable, "Exception while updating neighbours");
                Noo noo = mcM.method_284dc627_Dne("Block being updated");
                try {
                    n6 = this.method_2dee76f_bzF(n, n2, n3);
                }
                catch (Throwable throwable2) {
                    n6 = -1;
                }
                noo.method_2aeeb7ad_Dne("Source block type", new aFZ(this, n4));
                Noo.method_4b34e06a_Dne(noo, n, n2, n3, n5, n6);
                throw new kaJ(mcM);
            }
        }
    }

    public void method_9e2bd981_Qnq(int n, int n2, int n3, int n4, int n5, int n6) {
        if (n4 > 0) {
            zKP.field_8374b848_Dne[n4].method_3e226594_Dne(this, n, n2, n3, n5, n6);
        }
    }

    public void method_ce7f5266_Dne(float f) {
        this.field_2092ab_Dne = f;
        this.field_21260a_FWm = f;
    }

    public void method_d44b4592_zGp() {
        this.field_37e0a6a_Dne.method_b51ddfb1_zGp(1);
    }

    public boolean method_9fbb4d65_Qnq(int n, int n2, int n3, int n4) {
        return this.method_58fe7afa_bzF(n, n2, n3, n4) > 0;
    }

    public boolean method_8a4fa3e7_Dne(FiG fiG, int n, int n2, int n3, int n4) {
        if (n4 == 0) {
            --n2;
        }
        if (n4 == 1) {
            ++n2;
        }
        if (n4 == 2) {
            --n3;
        }
        if (n4 == 3) {
            ++n3;
        }
        if (n4 == 4) {
            --n;
        }
        if (n4 == 5) {
            ++n;
        }
        if (this.method_2c2cf7bc_Dne(n, n2, n3) == zKP.field_3774324_Dne.field_21260d_FWm) {
            this.method_bfa54b80_Dne(fiG, 1004, n, n2, n3, 0);
            this.method_2e7161e6_Qnq(n, n2, n3);
            return true;
        }
        return false;
    }
}

