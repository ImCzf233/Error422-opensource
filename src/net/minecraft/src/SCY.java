package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class SCY {
    private int field_21260d_FWm = 0;
    private int field_2092ae_Dne = 20;
    private float field_2092ab_Dne = 5.0f;
    private float field_21260a_FWm;
    private int field_2e5f1b_bzF = 20;

    public void method_703284a3_Dne(FiG fiG) {
        int n = fiG.field_36c4f18_Dne.field_2d29f4_aFZ;
        this.field_2e5f1b_bzF = this.field_2092ae_Dne;
        if (this.field_21260a_FWm > 4.0f) {
            this.field_21260a_FWm -= 4.0f;
            if (this.field_2092ab_Dne > 0.0f) {
                this.field_2092ab_Dne = Math.max(this.field_2092ab_Dne - 1.0f, 0.0f);
            } else if (n > 0) {
                this.field_2092ae_Dne = Math.max(this.field_2092ae_Dne - 1, 0);
            }
        }
        if (this.field_2092ae_Dne >= 18 && fiG.method_80692b1e_ICU()) {
            ++this.field_21260d_FWm;
            if (this.field_21260d_FWm >= 80) {
                fiG.method_ce7f5da9_Dne(1);
                this.field_21260d_FWm = 0;
            }
        } else if (this.field_2092ae_Dne <= 0) {
            ++this.field_21260d_FWm;
            if (this.field_21260d_FWm >= 80) {
                if (fiG.method_9a443a8c_XHL() > 10 || n >= 3 || fiG.method_9a443a8c_XHL() > 1 && n >= 2) {
                    fiG.method_147b2066_Dne(zBn.field_f0b00bbe_zGp, 1);
                }
                this.field_21260d_FWm = 0;
            }
        } else {
            this.field_21260d_FWm = 0;
        }
    }

    public void method_117d0ea7_FWm(float f) {
        this.field_2092ab_Dne = f;
    }

    public boolean method_7a46289e_Dne() {
        return this.field_2092ae_Dne < 20;
    }

    public float method_7a46288a_Dne() {
        return this.field_2092ab_Dne;
    }

    public void method_66a36cd8_FWm(WkD wkD) {
        wkD.method_5ab44f9f_Dne("foodLevel", this.field_2092ae_Dne);
        wkD.method_5ab44f9f_Dne("foodTickTimer", this.field_21260d_FWm);
        wkD.method_5ab4445c_Dne("foodSaturationLevel", this.field_2092ab_Dne);
        wkD.method_5ab4445c_Dne("foodExhaustionLevel", this.field_21260a_FWm);
    }

    public void method_ce7f5266_Dne(float f) {
        this.field_21260a_FWm = Math.min(this.field_21260a_FWm + f, 40.0f);
    }

    public void method_7f1e4ef0_Dne(PBI pBI) {
        this.method_16cbf37_Dne(pBI.method_7c6f602c_FWm(), pBI.method_7a46288a_Dne());
    }

    public int method_7c6f602c_FWm() {
        return this.field_2e5f1b_bzF;
    }

    public int method_7a46288d_Dne() {
        return this.field_2092ae_Dne;
    }

    public void method_8d4fb917_Dne(WkD wkD) {
        if (wkD.method_8f501fe8_Dne("foodLevel")) {
            this.field_2092ae_Dne = wkD.method_8f501fd7_Dne("foodLevel");
            this.field_21260d_FWm = wkD.method_8f501fd7_Dne("foodTickTimer");
            this.field_2092ab_Dne = wkD.method_8f501fd4_Dne("foodSaturationLevel");
            this.field_21260a_FWm = wkD.method_8f501fd4_Dne("foodExhaustionLevel");
        }
    }

    public void method_ce7f5da9_Dne(int n) {
        this.field_2092ae_Dne = n;
    }

    public void method_16cbf37_Dne(int n, float f) {
        this.field_2092ae_Dne = Math.min(n + this.field_2092ae_Dne, 20);
        this.field_2092ab_Dne = Math.min(this.field_2092ab_Dne + (float)n * f * 2.0f, (float)this.field_2092ae_Dne);
    }
}

