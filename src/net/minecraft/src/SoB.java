package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class SoB
extends ipD {
    private int field_2092ae_Dne;
    private float field_2092ab_Dne;
    private boolean field_2e5f2c_bzF;
    private int field_21260d_FWm;
    private float field_21260a_FWm;
    private boolean field_2092bf_Dne;
    private int field_2e5f1b_bzF;
    private List<sMa> field_f27c122c_Dne = new ArrayList();

    public SoB() {
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        super.method_66a36cd8_FWm(wkD);
        wkD.method_5ab44f9f_Dne("blockId", this.field_2092ae_Dne);
        wkD.method_5ab44f9f_Dne("blockData", this.field_21260d_FWm);
        wkD.method_5ab44f9f_Dne("facing", this.field_2e5f1b_bzF);
        wkD.method_5ab4445c_Dne("progress", this.field_21260a_FWm);
        wkD.method_5ab48f70_Dne("extending", this.field_2092bf_Dne);
    }

    private void method_16b621a_Dne(float f, float f2) {
        List list;
        f = this.field_2092bf_Dne ? 1.0f - f : (f -= 1.0f);
        bSp bSp2 = zKP.field_37c4776_Dne.method_b3052e08_Dne(this.field_36c4f18_Dne, this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp, this.field_2092ae_Dne, f, this.field_2e5f1b_bzF);
        if (bSp2 != null && !(list = this.field_36c4f18_Dne.method_71df22e6_FWm(null, bSp2)).isEmpty()) {
            this.field_f27c122c_Dne.addAll(list);
            for (sMa sMa2 : this.field_f27c122c_Dne) {
                sMa2.method_2be429a4_Dne(f2 * (float)rrP.field_4039e0a_FWm[this.field_2e5f1b_bzF], f2 * (float)rrP.field_59d86bc_bzF[this.field_2e5f1b_bzF], f2 * (float)rrP.field_4a92422_Qnq[this.field_2e5f1b_bzF]);
            }
            this.field_f27c122c_Dne.clear();
        }
    }

    public int method_7a46288d_Dne() {
        return this.field_2092ae_Dne;
    }

    public SoB(int n, int n2, int n3, boolean bl, boolean bl2) {
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_2e5f1b_bzF = n3;
        this.field_2092bf_Dne = bl;
        this.field_2e5f2c_bzF = bl2;
    }

    public float method_7ed96eaf_Qnq(float f) {
        return this.field_2092bf_Dne ? (this.method_ce7f5256_Dne(f) - 1.0f) * (float)rrP.field_4a92422_Qnq[this.field_2e5f1b_bzF] : (1.0f - this.method_ce7f5256_Dne(f)) * (float)rrP.field_4a92422_Qnq[this.field_2e5f1b_bzF];
    }

    public boolean method_7c6f603d_FWm() {
        return this.field_2e5f2c_bzF;
    }

    @Override
    public int method_d44b4585_zGp() {
        return this.field_21260d_FWm;
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        super.method_8d4fb917_Dne(wkD);
        this.field_2092ae_Dne = wkD.method_8f501fd7_Dne("blockId");
        this.field_21260d_FWm = wkD.method_8f501fd7_Dne("blockData");
        this.field_2e5f1b_bzF = wkD.method_8f501fd7_Dne("facing");
        this.field_21260a_FWm = this.field_2092ab_Dne = wkD.method_8f501fd4_Dne("progress");
        this.field_2092bf_Dne = wkD.method_110c4dc7_FWm("extending");
    }

    public int method_7c6f602c_FWm() {
        return this.field_2e5f1b_bzF;
    }

    public void method_7c6f6039_FWm() {
        if (this.field_21260a_FWm < 1.0f && this.field_36c4f18_Dne != null) {
            this.field_2092ab_Dne = 1.0f;
            this.field_21260a_FWm = 1.0f;
            this.field_36c4f18_Dne.method_2dee77c_bzF(this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp);
            this.method_d44b4592_zGp();
            if (this.field_36c4f18_Dne.method_2c2cf7bc_Dne(this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp) == zKP.field_37c4776_Dne.field_21260d_FWm) {
                this.field_36c4f18_Dne.method_17d7ea9d_FWm(this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp, this.field_2092ae_Dne, this.field_21260d_FWm, 3);
                this.field_36c4f18_Dne.method_9fbb4d61_Qnq(this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp, this.field_2092ae_Dne);
            }
        }
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_21260a_FWm = this.field_2092ab_Dne;
        if (this.field_21260a_FWm >= 1.0f) {
            this.method_16b621a_Dne(1.0f, 0.25f);
            this.field_36c4f18_Dne.method_2dee77c_bzF(this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp);
            this.method_d44b4592_zGp();
            if (this.field_36c4f18_Dne.method_2c2cf7bc_Dne(this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp) == zKP.field_37c4776_Dne.field_21260d_FWm) {
                this.field_36c4f18_Dne.method_17d7ea9d_FWm(this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp, this.field_2092ae_Dne, this.field_21260d_FWm, 3);
                this.field_36c4f18_Dne.method_9fbb4d61_Qnq(this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp, this.field_2092ae_Dne);
            }
        } else {
            this.field_2092ab_Dne += 0.5f;
            if (this.field_2092ab_Dne >= 1.0f) {
                this.field_2092ab_Dne = 1.0f;
            }
            if (this.field_2092bf_Dne) {
                this.method_16b621a_Dne(this.field_2092ab_Dne, this.field_2092ab_Dne - this.field_21260a_FWm + 0.0625f);
            }
        }
    }

    public float method_143f92c9_bzF(float f) {
        return this.field_2092bf_Dne ? (this.method_ce7f5256_Dne(f) - 1.0f) * (float)rrP.field_59d86bc_bzF[this.field_2e5f1b_bzF] : (1.0f - this.method_ce7f5256_Dne(f)) * (float)rrP.field_59d86bc_bzF[this.field_2e5f1b_bzF];
    }

    public float method_117d0e97_FWm(float f) {
        return this.field_2092bf_Dne ? (this.method_ce7f5256_Dne(f) - 1.0f) * (float)rrP.field_4039e0a_FWm[this.field_2e5f1b_bzF] : (1.0f - this.method_ce7f5256_Dne(f)) * (float)rrP.field_4039e0a_FWm[this.field_2e5f1b_bzF];
    }

    public float method_ce7f5256_Dne(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        }
        return this.field_21260a_FWm + (this.field_2092ab_Dne - this.field_21260a_FWm) * f;
    }

    public boolean method_7a46289e_Dne() {
        return this.field_2092bf_Dne;
    }
}

