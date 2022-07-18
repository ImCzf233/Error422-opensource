package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class yTR {
    public double field_2e5f16_bzF;
    private int field_2092ae_Dne = 16;
    public double field_212608_FWm;
    public boolean field_21261e_FWm = true;
    public float field_2092ab_Dne;
    public boolean field_2092bf_Dne = false;
    private Qnq field_36c4f18_Dne;
    private Random field_7331eae7_Dne = new Random();
    public List<EyB> field_f27c122c_Dne = new ArrayList();
    private Map field_83b1c1b0_Dne = new HashMap();
    public double field_2092a9_Dne;
    public sMa field_37b45e5_Dne;

    public yTR(Qnq qnq, sMa sMa2, double d, double d2, double d3, float f) {
        this.field_36c4f18_Dne = qnq;
        this.field_37b45e5_Dne = sMa2;
        this.field_2092ab_Dne = f;
        this.field_2092a9_Dne = d;
        this.field_212608_FWm = d2;
        this.field_2e5f16_bzF = d3;
    }

    public void method_ce7f9d7a_Dne(boolean bl) {
        int n;
        int n2;
        int n3;
        int n4;
        this.field_36c4f18_Dne.method_c961c6ee_Dne(this.field_2092a9_Dne, this.field_212608_FWm, this.field_2e5f16_bzF, "random.explode", 4.0f, (1.0f + (this.field_36c4f18_Dne.field_7331eae7_Dne.nextFloat() - this.field_36c4f18_Dne.field_7331eae7_Dne.nextFloat()) * 0.2f) * 0.7f);
        if (this.field_2092ab_Dne >= 2.0f && this.field_21261e_FWm) {
            this.field_36c4f18_Dne.method_8600ec24_Dne("hugeexplosion", this.field_2092a9_Dne, this.field_212608_FWm, this.field_2e5f16_bzF, 1.0, 0.0, 0.0);
        } else {
            this.field_36c4f18_Dne.method_8600ec24_Dne("largeexplode", this.field_2092a9_Dne, this.field_212608_FWm, this.field_2e5f16_bzF, 1.0, 0.0, 0.0);
        }
        if (this.field_21261e_FWm) {
            for (EyB eyB : this.field_f27c122c_Dne) {
                n4 = eyB.field_2092ae_Dne;
                n3 = eyB.field_21260d_FWm;
                n2 = eyB.field_2e5f1b_bzF;
                n = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n4, n3, n2);
                if (bl) {
                    double d = (float)n4 + this.field_36c4f18_Dne.field_7331eae7_Dne.nextFloat();
                    double d2 = (float)n3 + this.field_36c4f18_Dne.field_7331eae7_Dne.nextFloat();
                    double d3 = (float)n2 + this.field_36c4f18_Dne.field_7331eae7_Dne.nextFloat();
                    double d4 = d - this.field_2092a9_Dne;
                    double d5 = d2 - this.field_212608_FWm;
                    double d6 = d3 - this.field_2e5f16_bzF;
                    double d7 = geR.method_ce7f4ad4_Dne(d4 * d4 + d5 * d5 + d6 * d6);
                    d4 /= d7;
                    d5 /= d7;
                    d6 /= d7;
                    double d8 = 0.5 / (d7 / (double)this.field_2092ab_Dne + 0.1);
                    this.field_36c4f18_Dne.method_8600ec24_Dne("explode", (d + this.field_2092a9_Dne * 1.0) / 2.0, (d2 + this.field_212608_FWm * 1.0) / 2.0, (d3 + this.field_2e5f16_bzF * 1.0) / 2.0, d4 *= (d8 *= (double)(this.field_36c4f18_Dne.field_7331eae7_Dne.nextFloat() * this.field_36c4f18_Dne.field_7331eae7_Dne.nextFloat() + 0.3f)), d5 *= d8, d6 *= d8);
                    this.field_36c4f18_Dne.method_8600ec24_Dne("smoke", d, d2, d3, d4, d5, d6);
                }
                if (n <= 0) continue;
                zKP zKP2 = zKP.field_8374b848_Dne[n];
                if (zKP2.method_c616bed4_Dne(this)) {
                    zKP2.method_86296256_Dne(this.field_36c4f18_Dne, n4, n3, n2, this.field_36c4f18_Dne.method_2dee76f_bzF(n4, n3, n2), 1.0f / this.field_2092ab_Dne, 0);
                }
                this.field_36c4f18_Dne.method_17d7ea9d_FWm(n4, n3, n2, 0, 0, 3);
                zKP2.method_97c143fa_Dne(this.field_36c4f18_Dne, n4, n3, n2, this);
            }
        }
        if (this.field_2092bf_Dne) {
            for (EyB eyB : this.field_f27c122c_Dne) {
                n4 = eyB.field_2092ae_Dne;
                n3 = eyB.field_21260d_FWm;
                n2 = eyB.field_2e5f1b_bzF;
                n = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n4, n3, n2);
                int n5 = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n4, n3 - 1, n2);
                if (n != 0 || !zKP.field_4039e1b_FWm[n5] || this.field_7331eae7_Dne.nextInt(3) != 0) continue;
                this.field_36c4f18_Dne.method_2ee8c47d_FWm(n4, n3, n2, zKP.field_3774324_Dne.field_21260d_FWm);
            }
        }
    }

    public void method_7a46289a_Dne() {
        double d;
        double d2;
        double d3;
        int n;
        int n2;
        int n3;
        float f = this.field_2092ab_Dne;
        HashSet<EyB> hashSet = new HashSet<EyB>();
        for (n3 = 0; n3 < this.field_2092ae_Dne; ++n3) {
            for (n2 = 0; n2 < this.field_2092ae_Dne; ++n2) {
                for (n = 0; n < this.field_2092ae_Dne; ++n) {
                    if (n3 != 0 && n3 != this.field_2092ae_Dne - 1 && n2 != 0 && n2 != this.field_2092ae_Dne - 1 && n != 0 && n != this.field_2092ae_Dne - 1) continue;
                    double d4 = (float)n3 / ((float)this.field_2092ae_Dne - 1.0f) * 2.0f - 1.0f;
                    double d5 = (float)n2 / ((float)this.field_2092ae_Dne - 1.0f) * 2.0f - 1.0f;
                    double d6 = (float)n / ((float)this.field_2092ae_Dne - 1.0f) * 2.0f - 1.0f;
                    double d7 = Math.sqrt(d4 * d4 + d5 * d5 + d6 * d6);
                    d4 /= d7;
                    d5 /= d7;
                    d6 /= d7;
                    d3 = this.field_2092a9_Dne;
                    d2 = this.field_212608_FWm;
                    d = this.field_2e5f16_bzF;
                    float f2 = 0.3f;
                    for (float f3 = this.field_2092ab_Dne * (0.7f + this.field_36c4f18_Dne.field_7331eae7_Dne.nextFloat() * 0.6f); f3 > 0.0f; f3 -= f2 * 0.75f) {
                        int n4;
                        int n5;
                        int n6 = geR.method_117d0718_FWm(d3);
                        int n7 = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n6, n5 = geR.method_117d0718_FWm(d2), n4 = geR.method_117d0718_FWm(d));
                        if (n7 > 0) {
                            zKP zKP2 = zKP.field_8374b848_Dne[n7];
                            float f4 = this.field_37b45e5_Dne != null ? this.field_37b45e5_Dne.method_981211cc_Dne(this, this.field_36c4f18_Dne, n6, n5, n4, zKP2) : zKP2.method_bb7dd810_Dne(this.field_37b45e5_Dne);
                            f3 -= (f4 + 0.3f) * f2;
                        }
                        if (f3 > 0.0f && (this.field_37b45e5_Dne == null || this.field_37b45e5_Dne.method_6eed2507_Dne(this, this.field_36c4f18_Dne, n6, n5, n4, n7, f3))) {
                            hashSet.add(new EyB(n6, n5, n4));
                        }
                        d3 += d4 * (double)f2;
                        d2 += d5 * (double)f2;
                        d += d6 * (double)f2;
                    }
                }
            }
        }
        this.field_f27c122c_Dne.addAll(hashSet);
        this.field_2092ab_Dne *= 2.0f;
        n3 = geR.method_117d0718_FWm(this.field_2092a9_Dne - (double)this.field_2092ab_Dne - 1.0);
        n2 = geR.method_117d0718_FWm(this.field_2092a9_Dne + (double)this.field_2092ab_Dne + 1.0);
        n = geR.method_117d0718_FWm(this.field_212608_FWm - (double)this.field_2092ab_Dne - 1.0);
        int n8 = geR.method_117d0718_FWm(this.field_212608_FWm + (double)this.field_2092ab_Dne + 1.0);
        int n9 = geR.method_117d0718_FWm(this.field_2e5f16_bzF - (double)this.field_2092ab_Dne - 1.0);
        int n10 = geR.method_117d0718_FWm(this.field_2e5f16_bzF + (double)this.field_2092ab_Dne + 1.0);
        List list = this.field_36c4f18_Dne.method_71df22e6_FWm(this.field_37b45e5_Dne, bSp.method_23186cf1_Dne().method_b4ea3e0c_Dne(n3, n, n9, n2, n8, n10));
        chN chN2 = this.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(this.field_2092a9_Dne, this.field_212608_FWm, this.field_2e5f16_bzF);
        for (int i = 0; i < list.size(); ++i) {
            double d8;
            sMa sMa2 = (sMa)list.get(i);
            double d9 = sMa2.method_a663d993_FWm(this.field_2092a9_Dne, this.field_212608_FWm, this.field_2e5f16_bzF) / (double)this.field_2092ab_Dne;
            if (!(d9 <= 1.0) || (d8 = (double)geR.method_ce7f4ad4_Dne((d3 = sMa2.field_2f0dd3_div - this.field_2092a9_Dne) * d3 + (d2 = sMa2.field_22c5fd_IjH + (double)sMa2.method_59ee189_c_() - this.field_212608_FWm) * d2 + (d = sMa2.field_334487_mrb - this.field_2e5f16_bzF) * d)) == 0.0) continue;
            d3 /= d8;
            d2 /= d8;
            d /= d8;
            double d10 = this.field_36c4f18_Dne.method_811d6d74_Dne(chN2, sMa2.field_373a3ed_Dne);
            double d11 = (1.0 - d9) * d10;
            sMa2.method_147b2066_Dne(zBn.method_4ba6665b_Dne(this), (int)((d11 * d11 + d11) / 2.0 * 8.0 * (double)this.field_2092ab_Dne + 1.0));
            double d12 = oAi.method_b43d8c0c_Dne(sMa2, d11);
            sMa2.field_291868_XHL += d3 * d12;
            sMa2.field_2a9ad1_Zpi += d2 * d12;
            sMa2.field_31b811_kGO += d * d12;
            if (!(sMa2 instanceof FiG)) continue;
            this.field_83b1c1b0_Dne.put((FiG)sMa2, this.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(d3 * d11, d2 * d11, d * d11));
        }
        this.field_2092ab_Dne = f;
    }

    public Map method_d410254f_Dne() {
        return this.field_83b1c1b0_Dne;
    }

    public FUH method_23007a92_Dne() {
        return this.field_37b45e5_Dne == null ? null : (this.field_37b45e5_Dne instanceof gqg ? ((gqg)this.field_37b45e5_Dne).method_23007a92_Dne() : (this.field_37b45e5_Dne instanceof FUH ? (FUH)this.field_37b45e5_Dne : null));
    }
}

