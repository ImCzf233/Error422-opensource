package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from GON
 */
public class gon_0
extends ipD
implements MqS {
    public int field_2092ae_Dne;
    public float field_21260a_FWm;
    private int field_2e5f1b_bzF = -1;
    private NMq[] field_8360c375_Dne = new NMq[36];
    public gon_0 field_75af18b3_bzF;
    public gon_0 field_202116a5_FWm;
    public boolean field_2092bf_Dne = false;
    public gon_0 field_5e50b98d_Qnq;
    private int field_21260d_FWm;
    private String field_569fcf45_Dne;
    public gon_0 field_3674ac6_Dne;
    public float field_2092ab_Dne;

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        super.method_8d4fb917_Dne(wkD);
        mbZ mbZ2 = wkD.method_285baa50_Dne("Items");
        this.field_8360c375_Dne = new NMq[this.method_907a9d14_Qnq()];
        if (wkD.method_8f501fe8_Dne("CustomName")) {
            this.field_569fcf45_Dne = wkD.method_39193c_Dne("CustomName");
        }
        for (int i = 0; i < mbZ2.method_7a46288d_Dne(); ++i) {
            WkD wkD2 = (WkD)mbZ2.method_77d0d055_FWm(i);
            int n = wkD2.method_8f501fd0_Dne("Slot") & 0xFF;
            if (n < 0 || n >= this.field_8360c375_Dne.length) continue;
            this.field_8360c375_Dne[n] = NMq.method_7da70e76_Dne(wkD2);
        }
    }

    @Override
    public int method_a98a0653_aFZ() {
        return erC.field_2092ae_Dne;
    }

    @Override
    public boolean method_5acf91e_d_() {
        return this.field_569fcf45_Dne != null && this.field_569fcf45_Dne.length() > 0;
    }

    public void method_8f501fe4_Dne(String string) {
        this.field_569fcf45_Dne = string;
    }

    @Override
    public void method_907a9d21_Qnq() {
        super.method_907a9d21_Qnq();
        this.field_2092bf_Dne = false;
    }

    @Override
    public boolean method_6e3a6b6a_Dne(int n, NMq nMq) {
        return true;
    }

    @Override
    public void method_5f36e9f_i_() {
        if (this.field_2092ae_Dne < 0) {
            this.field_2092ae_Dne = 0;
        }
        ++this.field_2092ae_Dne;
        this.field_36c4f18_Dne.method_9e2bd981_Qnq(this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp, this.method_2317f94c_Dne().field_21260d_FWm, 1, this.field_2092ae_Dne);
        this.field_36c4f18_Dne.method_58fe7b07_bzF(this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp, this.method_2317f94c_Dne().field_21260d_FWm);
        this.field_36c4f18_Dne.method_58fe7b07_bzF(this.field_267cf5_Qnq, this.field_2d29f4_aFZ - 1, this.field_388da6_zGp, this.method_2317f94c_Dne().field_21260d_FWm);
    }

    public void method_a98a0660_aFZ() {
        if (!this.field_2092bf_Dne) {
            this.field_2092bf_Dne = true;
            this.field_3674ac6_Dne = null;
            this.field_202116a5_FWm = null;
            this.field_75af18b3_bzF = null;
            this.field_5e50b98d_Qnq = null;
            if (this.method_2c2cf7cd_Dne(this.field_267cf5_Qnq - 1, this.field_2d29f4_aFZ, this.field_388da6_zGp)) {
                this.field_75af18b3_bzF = (gon_0)this.field_36c4f18_Dne.method_d98e681d_Dne(this.field_267cf5_Qnq - 1, this.field_2d29f4_aFZ, this.field_388da6_zGp);
            }
            if (this.method_2c2cf7cd_Dne(this.field_267cf5_Qnq + 1, this.field_2d29f4_aFZ, this.field_388da6_zGp)) {
                this.field_202116a5_FWm = (gon_0)this.field_36c4f18_Dne.method_d98e681d_Dne(this.field_267cf5_Qnq + 1, this.field_2d29f4_aFZ, this.field_388da6_zGp);
            }
            if (this.method_2c2cf7cd_Dne(this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp - 1)) {
                this.field_3674ac6_Dne = (gon_0)this.field_36c4f18_Dne.method_d98e681d_Dne(this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp - 1);
            }
            if (this.method_2c2cf7cd_Dne(this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp + 1)) {
                this.field_5e50b98d_Qnq = (gon_0)this.field_36c4f18_Dne.method_d98e681d_Dne(this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp + 1);
            }
            if (this.field_3674ac6_Dne != null) {
                this.field_3674ac6_Dne.method_9f096262_Dne(this, 0);
            }
            if (this.field_5e50b98d_Qnq != null) {
                this.field_5e50b98d_Qnq.method_9f096262_Dne(this, 2);
            }
            if (this.field_202116a5_FWm != null) {
                this.field_202116a5_FWm.method_9f096262_Dne(this, 1);
            }
            if (this.field_75af18b3_bzF != null) {
                this.field_75af18b3_bzF.method_9f096262_Dne(this, 3);
            }
        }
    }

    @Override
    public boolean method_703284a7_Dne(FiG fiG) {
        return this.field_36c4f18_Dne.method_d98e681d_Dne(this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp) != this ? false : fiG.method_2be42992_Dne((double)this.field_267cf5_Qnq + 0.5, (double)this.field_2d29f4_aFZ + 0.5, (double)this.field_388da6_zGp + 0.5) <= 64.0;
    }

    @Override
    public int method_907a9d14_Qnq() {
        return 27;
    }

    @Override
    public void method_6e3a6b66_Dne(int n, NMq nMq) {
        this.field_8360c375_Dne[n] = nMq;
        if (nMq != null && nMq.field_2092ae_Dne > this.method_a98a0653_aFZ()) {
            nMq.field_2092ae_Dne = this.method_a98a0653_aFZ();
        }
        this.method_582b297_a_();
    }

    @Override
    public String method_9fc39d88_b_() {
        return this.method_5acf91e_d_() ? this.field_569fcf45_Dne : "container.chest";
    }

    private void method_9f096262_Dne(gon_0 gon_02, int n) {
        if (gon_02.method_a98a0664_aFZ()) {
            this.field_2092bf_Dne = false;
        } else if (this.field_2092bf_Dne) {
            switch (n) {
                case 0: {
                    if (this.field_5e50b98d_Qnq == gon_02) break;
                    this.field_2092bf_Dne = false;
                    break;
                }
                case 1: {
                    if (this.field_75af18b3_bzF == gon_02) break;
                    this.field_2092bf_Dne = false;
                    break;
                }
                case 2: {
                    if (this.field_3674ac6_Dne == gon_02) break;
                    this.field_2092bf_Dne = false;
                    break;
                }
                case 3: {
                    if (this.field_202116a5_FWm == gon_02) break;
                    this.field_2092bf_Dne = false;
                }
            }
        }
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        super.method_66a36cd8_FWm(wkD);
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

    @Override
    public void method_d44b4592_zGp() {
        super.method_d44b4592_zGp();
        this.method_907a9d21_Qnq();
        this.method_a98a0660_aFZ();
    }

    @Override
    public void method_7a46289a_Dne() {
        float f;
        super.method_7a46289a_Dne();
        this.method_a98a0660_aFZ();
        ++this.field_21260d_FWm;
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ && this.field_2092ae_Dne != 0 && (this.field_21260d_FWm + this.field_267cf5_Qnq + this.field_2d29f4_aFZ + this.field_388da6_zGp) % 200 == 0) {
            this.field_2092ae_Dne = 0;
            f = 5.0f;
            List<FiG> list = this.field_36c4f18_Dne.method_9314b7e8_Dne(FiG.class, bSp.method_23186cf1_Dne().method_b4ea3e0c_Dne((float)this.field_267cf5_Qnq - f, (float)this.field_2d29f4_aFZ - f, (float)this.field_388da6_zGp - f, (float)(this.field_267cf5_Qnq + 1) + f, (float)(this.field_2d29f4_aFZ + 1) + f, (float)(this.field_388da6_zGp + 1) + f));
            for (FiG fiG : list) {
                MqS mqS;
                if (!(fiG.field_20257f3d_FWm instanceof ZqW) || (mqS = ((ZqW)fiG.field_20257f3d_FWm).method_2304139c_Dne()) != this && (!(mqS instanceof isA) || !((isA)mqS).method_7c9aa17c_Dne(this))) continue;
                ++this.field_2092ae_Dne;
            }
        }
        this.field_21260a_FWm = this.field_2092ab_Dne;
        f = 0.1f;
        if (this.field_2092ae_Dne > 0 && this.field_2092ab_Dne == 0.0f && this.field_3674ac6_Dne == null && this.field_75af18b3_bzF == null) {
            double d = (double)this.field_267cf5_Qnq + 0.5;
            double d2 = (double)this.field_388da6_zGp + 0.5;
            if (this.field_5e50b98d_Qnq != null) {
                d2 += 0.5;
            }
            if (this.field_202116a5_FWm != null) {
                d += 0.5;
            }
            this.field_36c4f18_Dne.method_c961c6ee_Dne(d, (double)this.field_2d29f4_aFZ + 0.5, d2, "random.chestopen", 0.5f, this.field_36c4f18_Dne.field_7331eae7_Dne.nextFloat() * 0.1f + 0.9f);
        }
        if (this.field_2092ae_Dne == 0 && this.field_2092ab_Dne > 0.0f || this.field_2092ae_Dne > 0 && this.field_2092ab_Dne < 1.0f) {
            float f2;
            float f3 = this.field_2092ab_Dne;
            this.field_2092ab_Dne = this.field_2092ae_Dne > 0 ? (this.field_2092ab_Dne += f) : (this.field_2092ab_Dne -= f);
            if (this.field_2092ab_Dne > 1.0f) {
                this.field_2092ab_Dne = 1.0f;
            }
            if (this.field_2092ab_Dne < (f2 = 0.5f) && f3 >= f2 && this.field_3674ac6_Dne == null && this.field_75af18b3_bzF == null) {
                double d = (double)this.field_267cf5_Qnq + 0.5;
                double d3 = (double)this.field_388da6_zGp + 0.5;
                if (this.field_5e50b98d_Qnq != null) {
                    d3 += 0.5;
                }
                if (this.field_202116a5_FWm != null) {
                    d += 0.5;
                }
                this.field_36c4f18_Dne.method_c961c6ee_Dne(d, (double)this.field_2d29f4_aFZ + 0.5, d3, "random.chestclosed", 0.5f, this.field_36c4f18_Dne.field_7331eae7_Dne.nextFloat() * 0.1f + 0.9f);
            }
            if (this.field_2092ab_Dne < 0.0f) {
                this.field_2092ab_Dne = 0.0f;
            }
        }
    }

    public int method_7a46288d_Dne() {
        if (this.field_2e5f1b_bzF == -1) {
            if (this.field_36c4f18_Dne == null || !(this.method_2317f94c_Dne() instanceof gHK)) {
                return 0;
            }
            this.field_2e5f1b_bzF = ((gHK)this.method_2317f94c_Dne()).field_2092ae_Dne;
        }
        return this.field_2e5f1b_bzF;
    }

    private boolean method_2c2cf7cd_Dne(int n, int n2, int n3) {
        zKP zKP2 = zKP.field_8374b848_Dne[this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n, n2, n3)];
        return zKP2 != null && zKP2 instanceof gHK ? ((gHK)zKP2).field_2092ae_Dne == this.method_7a46288d_Dne() : false;
    }

    @Override
    public NMq method_9e6e1a08_Dne(int n) {
        return this.field_8360c375_Dne[n];
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
    public boolean method_16cca7e_Dne(int n, int n2) {
        if (n == 1) {
            this.field_2092ae_Dne = n2;
            return true;
        }
        return super.method_16cca7e_Dne(n, n2);
    }

    @Override
    public NMq method_9046b659_Dne(int n, int n2) {
        if (this.field_8360c375_Dne[n] != null) {
            if (this.field_8360c375_Dne[n].field_2092ae_Dne <= n2) {
                NMq nMq = this.field_8360c375_Dne[n];
                this.field_8360c375_Dne[n] = null;
                this.method_582b297_a_();
                return nMq;
            }
            NMq nMq = this.field_8360c375_Dne[n].method_9e6e1a08_Dne(n2);
            if (this.field_8360c375_Dne[n].field_2092ae_Dne == 0) {
                this.field_8360c375_Dne[n] = null;
            }
            this.method_582b297_a_();
            return nMq;
        }
        return null;
    }

    @Override
    public void method_ae128dc7_bzF() {
        if (this.method_2317f94c_Dne() != null && this.method_2317f94c_Dne() instanceof gHK) {
            --this.field_2092ae_Dne;
            this.field_36c4f18_Dne.method_9e2bd981_Qnq(this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp, this.method_2317f94c_Dne().field_21260d_FWm, 1, this.field_2092ae_Dne);
            this.field_36c4f18_Dne.method_58fe7b07_bzF(this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp, this.method_2317f94c_Dne().field_21260d_FWm);
            this.field_36c4f18_Dne.method_58fe7b07_bzF(this.field_267cf5_Qnq, this.field_2d29f4_aFZ - 1, this.field_388da6_zGp, this.method_2317f94c_Dne().field_21260d_FWm);
        }
    }
}

