package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class RPI
extends ipD {
    private int field_21260d_FWm;
    public float field_21260a_FWm;
    public float field_2092ab_Dne;
    public int field_2092ae_Dne;

    @Override
    public boolean method_16cca7e_Dne(int n, int n2) {
        if (n == 1) {
            this.field_2092ae_Dne = n2;
            return true;
        }
        return super.method_16cca7e_Dne(n, n2);
    }

    public void method_7c6f6039_FWm() {
        ++this.field_2092ae_Dne;
        this.field_36c4f18_Dne.method_9e2bd981_Qnq(this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp, zKP.field_cd3e340c_wns.field_21260d_FWm, 1, this.field_2092ae_Dne);
    }

    @Override
    public void method_d44b4592_zGp() {
        this.method_907a9d21_Qnq();
        super.method_d44b4592_zGp();
    }

    public void method_ae128dc7_bzF() {
        --this.field_2092ae_Dne;
        this.field_36c4f18_Dne.method_9e2bd981_Qnq(this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp, zKP.field_cd3e340c_wns.field_21260d_FWm, 1, this.field_2092ae_Dne);
    }

    public boolean method_703284a7_Dne(FiG fiG) {
        return this.field_36c4f18_Dne.method_d98e681d_Dne(this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp) != this ? false : fiG.method_2be42992_Dne((double)this.field_267cf5_Qnq + 0.5, (double)this.field_2d29f4_aFZ + 0.5, (double)this.field_388da6_zGp + 0.5) <= 64.0;
    }

    @Override
    public void method_7a46289a_Dne() {
        double d;
        super.method_7a46289a_Dne();
        if (++this.field_21260d_FWm % 20 * 4 == 0) {
            this.field_36c4f18_Dne.method_9e2bd981_Qnq(this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp, zKP.field_cd3e340c_wns.field_21260d_FWm, 1, this.field_2092ae_Dne);
        }
        this.field_21260a_FWm = this.field_2092ab_Dne;
        float f = 0.1f;
        if (this.field_2092ae_Dne > 0 && this.field_2092ab_Dne == 0.0f) {
            double d2 = (double)this.field_267cf5_Qnq + 0.5;
            d = (double)this.field_388da6_zGp + 0.5;
            this.field_36c4f18_Dne.method_c961c6ee_Dne(d2, (double)this.field_2d29f4_aFZ + 0.5, d, "random.chestopen", 0.5f, this.field_36c4f18_Dne.field_7331eae7_Dne.nextFloat() * 0.1f + 0.9f);
        }
        if (this.field_2092ae_Dne == 0 && this.field_2092ab_Dne > 0.0f || this.field_2092ae_Dne > 0 && this.field_2092ab_Dne < 1.0f) {
            float f2;
            float f3 = this.field_2092ab_Dne;
            this.field_2092ab_Dne = this.field_2092ae_Dne > 0 ? (this.field_2092ab_Dne += f) : (this.field_2092ab_Dne -= f);
            if (this.field_2092ab_Dne > 1.0f) {
                this.field_2092ab_Dne = 1.0f;
            }
            if (this.field_2092ab_Dne < (f2 = 0.5f) && f3 >= f2) {
                d = (double)this.field_267cf5_Qnq + 0.5;
                double d3 = (double)this.field_388da6_zGp + 0.5;
                this.field_36c4f18_Dne.method_c961c6ee_Dne(d, (double)this.field_2d29f4_aFZ + 0.5, d3, "random.chestclosed", 0.5f, this.field_36c4f18_Dne.field_7331eae7_Dne.nextFloat() * 0.1f + 0.9f);
            }
            if (this.field_2092ab_Dne < 0.0f) {
                this.field_2092ab_Dne = 0.0f;
            }
        }
    }
}

