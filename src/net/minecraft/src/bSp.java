package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class bSp {
    public double field_2e5f16_bzF;
    public double field_212608_FWm;
    public double field_388da1_zGp;
    private static final ThreadLocal field_9fba90bf_Dne = new nJD();
    public double field_2d29ef_aFZ;
    public double field_267cf0_Qnq;
    public double field_2092a9_Dne;

    public static bSp method_b4ea3e0c_Dne(double d, double d2, double d3, double d4, double d5, double d6) {
        return new bSp(d, d2, d3, d4, d5, d6);
    }

    public bSp method_4f91d5d0_aFZ(double d, double d2, double d3) {
        double d4 = this.field_2092a9_Dne + d;
        double d5 = this.field_212608_FWm + d2;
        double d6 = this.field_2e5f16_bzF + d3;
        double d7 = this.field_267cf0_Qnq - d;
        double d8 = this.field_2d29ef_aFZ - d2;
        double d9 = this.field_388da1_zGp - d3;
        return bSp.method_23186cf1_Dne().method_b4ea3e0c_Dne(d4, d5, d6, d7, d8, d9);
    }

    public double method_3c041104_Dne(bSp bSp2, double d) {
        if (bSp2.field_2d29ef_aFZ > this.field_212608_FWm && bSp2.field_212608_FWm < this.field_2d29ef_aFZ) {
            if (bSp2.field_388da1_zGp > this.field_2e5f16_bzF && bSp2.field_2e5f16_bzF < this.field_388da1_zGp) {
                double d2;
                if (d > 0.0 && bSp2.field_267cf0_Qnq <= this.field_2092a9_Dne && (d2 = this.field_2092a9_Dne - bSp2.field_267cf0_Qnq) < d) {
                    d = d2;
                }
                if (d < 0.0 && bSp2.field_2092a9_Dne >= this.field_267cf0_Qnq && (d2 = this.field_267cf0_Qnq - bSp2.field_2092a9_Dne) > d) {
                    d = d2;
                }
                return d;
            }
            return d;
        }
        return d;
    }

    public double method_8d26d563_FWm(bSp bSp2, double d) {
        if (bSp2.field_267cf0_Qnq > this.field_2092a9_Dne && bSp2.field_2092a9_Dne < this.field_267cf0_Qnq) {
            if (bSp2.field_388da1_zGp > this.field_2e5f16_bzF && bSp2.field_2e5f16_bzF < this.field_388da1_zGp) {
                double d2;
                if (d > 0.0 && bSp2.field_2d29ef_aFZ <= this.field_212608_FWm && (d2 = this.field_212608_FWm - bSp2.field_2d29ef_aFZ) < d) {
                    d = d2;
                }
                if (d < 0.0 && bSp2.field_212608_FWm >= this.field_2d29ef_aFZ && (d2 = this.field_2d29ef_aFZ - bSp2.field_212608_FWm) > d) {
                    d = d2;
                }
                return d;
            }
            return d;
        }
        return d;
    }

    public wHH method_38be674_Dne(chN chN2, chN chN3) {
        chN chN4 = chN2.method_783f7808_Dne(chN3, this.field_2092a9_Dne);
        chN chN5 = chN2.method_783f7808_Dne(chN3, this.field_267cf0_Qnq);
        chN chN6 = chN2.method_379af4e7_FWm(chN3, this.field_212608_FWm);
        chN chN7 = chN2.method_379af4e7_FWm(chN3, this.field_2d29ef_aFZ);
        chN chN8 = chN2.method_c3c508f5_bzF(chN3, this.field_2e5f16_bzF);
        chN chN9 = chN2.method_c3c508f5_bzF(chN3, this.field_388da1_zGp);
        if (!this.method_7af7d983_FWm(chN4)) {
            chN4 = null;
        }
        if (!this.method_7af7d983_FWm(chN5)) {
            chN5 = null;
        }
        if (!this.method_9398f4b5_bzF(chN6)) {
            chN6 = null;
        }
        if (!this.method_9398f4b5_bzF(chN7)) {
            chN7 = null;
        }
        if (!this.method_24766d9b_Qnq(chN8)) {
            chN8 = null;
        }
        if (!this.method_24766d9b_Qnq(chN9)) {
            chN9 = null;
        }
        chN chN10 = null;
        if (chN4 != null && (chN10 == null || chN2.method_9398f49f_bzF(chN4) < chN2.method_9398f49f_bzF(chN10))) {
            chN10 = chN4;
        }
        if (chN5 != null && (chN10 == null || chN2.method_9398f49f_bzF(chN5) < chN2.method_9398f49f_bzF(chN10))) {
            chN10 = chN5;
        }
        if (chN6 != null && (chN10 == null || chN2.method_9398f49f_bzF(chN6) < chN2.method_9398f49f_bzF(chN10))) {
            chN10 = chN6;
        }
        if (chN7 != null && (chN10 == null || chN2.method_9398f49f_bzF(chN7) < chN2.method_9398f49f_bzF(chN10))) {
            chN10 = chN7;
        }
        if (chN8 != null && (chN10 == null || chN2.method_9398f49f_bzF(chN8) < chN2.method_9398f49f_bzF(chN10))) {
            chN10 = chN8;
        }
        if (chN9 != null && (chN10 == null || chN2.method_9398f49f_bzF(chN9) < chN2.method_9398f49f_bzF(chN10))) {
            chN10 = chN9;
        }
        if (chN10 == null) {
            return null;
        }
        int n = -1;
        if (chN10 == chN4) {
            n = 4;
        }
        if (chN10 == chN5) {
            n = 5;
        }
        if (chN10 == chN6) {
            n = 0;
        }
        if (chN10 == chN7) {
            n = 1;
        }
        if (chN10 == chN8) {
            n = 2;
        }
        if (chN10 == chN9) {
            n = 3;
        }
        return new wHH(0, 0, 0, n, chN10);
    }

    protected bSp(double d, double d2, double d3, double d4, double d5, double d6) {
        this.field_2092a9_Dne = d;
        this.field_212608_FWm = d2;
        this.field_2e5f16_bzF = d3;
        this.field_267cf0_Qnq = d4;
        this.field_2d29ef_aFZ = d5;
        this.field_388da1_zGp = d6;
    }

    public bSp method_fbaf53ef_Qnq(double d, double d2, double d3) {
        this.field_2092a9_Dne += d;
        this.field_212608_FWm += d2;
        this.field_2e5f16_bzF += d3;
        this.field_267cf0_Qnq += d;
        this.field_2d29ef_aFZ += d2;
        this.field_388da1_zGp += d3;
        return this;
    }

    public bSp method_7445baeb_FWm(double d, double d2, double d3, double d4, double d5, double d6) {
        this.field_2092a9_Dne = d;
        this.field_212608_FWm = d2;
        this.field_2e5f16_bzF = d3;
        this.field_267cf0_Qnq = d4;
        this.field_2d29ef_aFZ = d5;
        this.field_388da1_zGp = d6;
        return this;
    }

    public bSp method_e44f9e56_Dne(double d, double d2, double d3) {
        double d4 = this.field_2092a9_Dne;
        double d5 = this.field_212608_FWm;
        double d6 = this.field_2e5f16_bzF;
        double d7 = this.field_267cf0_Qnq;
        double d8 = this.field_2d29ef_aFZ;
        double d9 = this.field_388da1_zGp;
        if (d < 0.0) {
            d4 += d;
        }
        if (d > 0.0) {
            d7 += d;
        }
        if (d2 < 0.0) {
            d5 += d2;
        }
        if (d2 > 0.0) {
            d8 += d2;
        }
        if (d3 < 0.0) {
            d6 += d3;
        }
        if (d3 > 0.0) {
            d9 += d3;
        }
        return bSp.method_23186cf1_Dne().method_b4ea3e0c_Dne(d4, d5, d6, d7, d8, d9);
    }

    public String toString() {
        return "box[" + this.field_2092a9_Dne + ", " + this.field_212608_FWm + ", " + this.field_2e5f16_bzF + " -> " + this.field_267cf0_Qnq + ", " + this.field_2d29ef_aFZ + ", " + this.field_388da1_zGp + "]";
    }

    public bSp method_2c4c7c89_bzF(double d, double d2, double d3) {
        return bSp.method_23186cf1_Dne().method_b4ea3e0c_Dne(this.field_2092a9_Dne + d, this.field_212608_FWm + d2, this.field_2e5f16_bzF + d3, this.field_267cf0_Qnq + d, this.field_2d29ef_aFZ + d2, this.field_388da1_zGp + d3);
    }

    public static zjJ method_23186cf1_Dne() {
        return (zjJ)field_9fba90bf_Dne.get();
    }

    public boolean method_9ed6d42c_Dne(bSp bSp2) {
        return bSp2.field_267cf0_Qnq > this.field_2092a9_Dne && bSp2.field_2092a9_Dne < this.field_267cf0_Qnq ? (bSp2.field_2d29ef_aFZ > this.field_212608_FWm && bSp2.field_212608_FWm < this.field_2d29ef_aFZ ? bSp2.field_388da1_zGp > this.field_2e5f16_bzF && bSp2.field_2e5f16_bzF < this.field_388da1_zGp : false) : false;
    }

    private boolean method_24766d9b_Qnq(chN chN2) {
        return chN2 == null ? false : chN2.field_2092a9_Dne >= this.field_2092a9_Dne && chN2.field_2092a9_Dne <= this.field_267cf0_Qnq && chN2.field_212608_FWm >= this.field_212608_FWm && chN2.field_212608_FWm <= this.field_2d29ef_aFZ;
    }

    public bSp method_b78565d7_FWm(double d, double d2, double d3) {
        double d4 = this.field_2092a9_Dne - d;
        double d5 = this.field_212608_FWm - d2;
        double d6 = this.field_2e5f16_bzF - d3;
        double d7 = this.field_267cf0_Qnq + d;
        double d8 = this.field_2d29ef_aFZ + d2;
        double d9 = this.field_388da1_zGp + d3;
        return bSp.method_23186cf1_Dne().method_b4ea3e0c_Dne(d4, d5, d6, d7, d8, d9);
    }

    private boolean method_9398f4b5_bzF(chN chN2) {
        return chN2 == null ? false : chN2.field_2092a9_Dne >= this.field_2092a9_Dne && chN2.field_2092a9_Dne <= this.field_267cf0_Qnq && chN2.field_2e5f16_bzF >= this.field_2e5f16_bzF && chN2.field_2e5f16_bzF <= this.field_388da1_zGp;
    }

    private boolean method_7af7d983_FWm(chN chN2) {
        return chN2 == null ? false : chN2.field_212608_FWm >= this.field_212608_FWm && chN2.field_212608_FWm <= this.field_2d29ef_aFZ && chN2.field_2e5f16_bzF >= this.field_2e5f16_bzF && chN2.field_2e5f16_bzF <= this.field_388da1_zGp;
    }

    public void method_9ed6d428_Dne(bSp bSp2) {
        this.field_2092a9_Dne = bSp2.field_2092a9_Dne;
        this.field_212608_FWm = bSp2.field_212608_FWm;
        this.field_2e5f16_bzF = bSp2.field_2e5f16_bzF;
        this.field_267cf0_Qnq = bSp2.field_267cf0_Qnq;
        this.field_2d29ef_aFZ = bSp2.field_2d29ef_aFZ;
        this.field_388da1_zGp = bSp2.field_388da1_zGp;
    }

    public boolean method_a1a425c2_Dne(chN chN2) {
        return chN2.field_2092a9_Dne > this.field_2092a9_Dne && chN2.field_2092a9_Dne < this.field_267cf0_Qnq ? (chN2.field_212608_FWm > this.field_212608_FWm && chN2.field_212608_FWm < this.field_2d29ef_aFZ ? chN2.field_2e5f16_bzF > this.field_2e5f16_bzF && chN2.field_2e5f16_bzF < this.field_388da1_zGp : false) : false;
    }

    public double method_88a92071_bzF(bSp bSp2, double d) {
        if (bSp2.field_267cf0_Qnq > this.field_2092a9_Dne && bSp2.field_2092a9_Dne < this.field_267cf0_Qnq) {
            if (bSp2.field_2d29ef_aFZ > this.field_212608_FWm && bSp2.field_212608_FWm < this.field_2d29ef_aFZ) {
                double d2;
                if (d > 0.0 && bSp2.field_388da1_zGp <= this.field_2e5f16_bzF && (d2 = this.field_2e5f16_bzF - bSp2.field_388da1_zGp) < d) {
                    d = d2;
                }
                if (d < 0.0 && bSp2.field_2e5f16_bzF >= this.field_388da1_zGp && (d2 = this.field_388da1_zGp - bSp2.field_2e5f16_bzF) > d) {
                    d = d2;
                }
                return d;
            }
            return d;
        }
        return d;
    }

    public double method_7a462888_Dne() {
        double d = this.field_267cf0_Qnq - this.field_2092a9_Dne;
        double d2 = this.field_2d29ef_aFZ - this.field_212608_FWm;
        double d3 = this.field_388da1_zGp - this.field_2e5f16_bzF;
        return (d + d2 + d3) / 3.0;
    }

    public bSp method_230d324c_Dne() {
        return bSp.method_23186cf1_Dne().method_b4ea3e0c_Dne(this.field_2092a9_Dne, this.field_212608_FWm, this.field_2e5f16_bzF, this.field_267cf0_Qnq, this.field_2d29ef_aFZ, this.field_388da1_zGp);
    }
}

