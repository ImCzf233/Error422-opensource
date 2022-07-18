package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class mHN
extends ocu {
    private boolean field_2092bf_Dne = true;
    private String field_569fcf45_Dne = "";
    private final msA field_3791671_Dne;
    private final int field_2092ae_Dne;
    private int field_20b857_DyG = 0;
    private final int field_21260d_FWm;
    private final int field_267cf5_Qnq;
    private boolean field_21261e_FWm = true;
    private boolean field_267d06_Qnq = true;
    private int field_2f0dd8_div = 0;
    private int field_388da6_zGp;
    private int field_22c602_IjH = 0;
    private boolean field_2d2a05_aFZ = true;
    private final int field_2e5f1b_bzF;
    private boolean field_2e5f2c_bzF = false;
    private int field_29186d_XHL = 0x707070;
    private int field_33448c_mrb = 0xE0E0E0;
    private int field_2d29f4_aFZ = 32;

    public String method_eecad346_Dne() {
        return this.field_569fcf45_Dne;
    }

    public int method_907a9d14_Qnq() {
        return this.method_7a46289e_Dne() ? this.field_2e5f1b_bzF - 8 : this.field_2e5f1b_bzF;
    }

    public void method_df9deb60_DyG(int n) {
        this.field_29186d_XHL = n;
    }

    public void method_117d59bb_FWm(boolean bl) {
        if (bl && !this.field_2e5f2c_bzF) {
            this.field_388da6_zGp = 0;
        }
        this.field_2e5f2c_bzF = bl;
    }

    public void method_ce7f9d7a_Dne(boolean bl) {
        this.field_2092bf_Dne = bl;
    }

    public void method_87b77874_aFZ(boolean bl) {
        this.field_2d2a05_aFZ = bl;
    }

    public mHN(msA msA2, int n, int n2, int n3, int n4) {
        this.field_3791671_Dne = msA2;
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_2e5f1b_bzF = n3;
        this.field_267cf5_Qnq = n4;
    }

    public int method_7a46288d_Dne() {
        return this.field_2d29f4_aFZ;
    }

    public int method_2c2d378d_Dne(int n, int n2, boolean bl) {
        int n3 = n2;
        boolean bl2 = n < 0;
        int n4 = Math.abs(n);
        for (int i = 0; i < n4; ++i) {
            if (bl2) {
                while (bl && n3 > 0 && this.field_569fcf45_Dne.charAt(n3 - 1) == ' ') {
                    --n3;
                }
                while (n3 > 0 && this.field_569fcf45_Dne.charAt(n3 - 1) != ' ') {
                    --n3;
                }
                continue;
            }
            int n5 = this.field_569fcf45_Dne.length();
            if ((n3 = this.field_569fcf45_Dne.indexOf(32, n3)) == -1) {
                n3 = n5;
                continue;
            }
            while (bl && n3 < n5 && this.field_569fcf45_Dne.charAt(n3) == ' ') {
                ++n3;
            }
        }
        return n3;
    }

    public void method_907a9d21_Qnq() {
        if (this.method_ae128dcb_bzF()) {
            if (this.method_7a46289e_Dne()) {
                mHN.method_d4dc89e9_Dne(this.field_2092ae_Dne - 1, this.field_21260d_FWm - 1, this.field_2092ae_Dne + this.field_2e5f1b_bzF + 1, this.field_21260d_FWm + this.field_267cf5_Qnq + 1, -6250336);
                mHN.method_d4dc89e9_Dne(this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2092ae_Dne + this.field_2e5f1b_bzF, this.field_21260d_FWm + this.field_267cf5_Qnq, -16777216);
            }
            int n = this.field_267d06_Qnq ? this.field_33448c_mrb : this.field_29186d_XHL;
            int n2 = this.field_2f0dd8_div - this.field_20b857_DyG;
            int n3 = this.field_22c602_IjH - this.field_20b857_DyG;
            String string = this.field_3791671_Dne.method_4868f6e1_Dne(this.field_569fcf45_Dne.substring(this.field_20b857_DyG), this.method_907a9d14_Qnq());
            boolean bl = n2 >= 0 && n2 <= string.length();
            boolean bl2 = this.field_2e5f2c_bzF && this.field_388da6_zGp / 6 % 2 == 0 && bl;
            int n4 = this.field_2092bf_Dne ? this.field_2092ae_Dne + 4 : this.field_2092ae_Dne;
            int n5 = this.field_2092bf_Dne ? this.field_21260d_FWm + (this.field_267cf5_Qnq - 8) / 2 : this.field_21260d_FWm;
            int n6 = n4;
            if (n3 > string.length()) {
                n3 = string.length();
            }
            if (string.length() > 0) {
                String string2 = bl ? string.substring(0, n2) : string;
                n6 = this.field_3791671_Dne.method_7eed4432_Dne(string2, n4, n5, n);
            }
            boolean bl3 = this.field_2f0dd8_div < this.field_569fcf45_Dne.length() || this.field_569fcf45_Dne.length() >= this.method_7a46288d_Dne();
            int n7 = n6;
            if (!bl) {
                n7 = n2 > 0 ? n4 + this.field_2e5f1b_bzF : n4;
            } else if (bl3) {
                n7 = n6 - 1;
                --n6;
            }
            if (string.length() > 0 && bl && n2 < string.length()) {
                this.field_3791671_Dne.method_7eed4432_Dne(string.substring(n2), n6, n5, n);
            }
            if (bl2) {
                if (bl3) {
                    ocu.method_d4dc89e9_Dne(n7, n5 - 1, n7 + 1, n5 + 1 + this.field_3791671_Dne.field_2092ae_Dne, -3092272);
                } else {
                    this.field_3791671_Dne.method_7eed4432_Dne("_", n7, n5, n);
                }
            }
            if (n3 != n2) {
                int n8 = n4 + this.field_3791671_Dne.method_8f501fd7_Dne(string.substring(0, n3));
                this.method_58fe7b07_bzF(n7, n5 - 1, n8 - 1, n5 + 1 + this.field_3791671_Dne.field_2092ae_Dne);
            }
        }
    }

    public void method_2c2cf7c9_Dne(int n, int n2, int n3) {
        boolean bl;
        boolean bl2 = bl = n >= this.field_2092ae_Dne && n < this.field_2092ae_Dne + this.field_2e5f1b_bzF && n2 >= this.field_21260d_FWm && n2 < this.field_21260d_FWm + this.field_267cf5_Qnq;
        if (this.field_21261e_FWm) {
            this.method_117d59bb_FWm(this.field_267d06_Qnq && bl);
        }
        if (this.field_2e5f2c_bzF && n3 == 0) {
            int n4 = n - this.field_2092ae_Dne;
            if (this.field_2092bf_Dne) {
                n4 -= 4;
            }
            String string = this.field_3791671_Dne.method_4868f6e1_Dne(this.field_569fcf45_Dne.substring(this.field_20b857_DyG), this.method_907a9d14_Qnq());
            this.method_7ed97a02_Qnq(this.field_3791671_Dne.method_4868f6e1_Dne(string, n4).length() + this.field_20b857_DyG);
        }
    }

    public boolean method_7c6f603d_FWm() {
        return this.field_2e5f2c_bzF;
    }

    public void method_63ae1a3f_div(int n) {
        int n2 = this.field_569fcf45_Dne.length();
        if (n > n2) {
            n = n2;
        }
        if (n < 0) {
            n = 0;
        }
        this.field_22c602_IjH = n;
        if (this.field_3791671_Dne != null) {
            if (this.field_20b857_DyG > n2) {
                this.field_20b857_DyG = n2;
            }
            int n3 = this.method_907a9d14_Qnq();
            String string = this.field_3791671_Dne.method_4868f6e1_Dne(this.field_569fcf45_Dne.substring(this.field_20b857_DyG), n3);
            int n4 = string.length() + this.field_20b857_DyG;
            if (n == this.field_20b857_DyG) {
                this.field_20b857_DyG -= this.field_3791671_Dne.method_67f40a2b_Dne(this.field_569fcf45_Dne, n3, true).length();
            }
            if (n > n4) {
                this.field_20b857_DyG += n - n4;
            } else if (n <= this.field_20b857_DyG) {
                this.field_20b857_DyG -= this.field_20b857_DyG - n;
            }
            if (this.field_20b857_DyG < 0) {
                this.field_20b857_DyG = 0;
            }
            if (this.field_20b857_DyG > n2) {
                this.field_20b857_DyG = n2;
            }
        }
    }

    public int method_7c6f602c_FWm() {
        return this.field_2f0dd8_div;
    }

    public void method_110c4dc3_FWm(String string) {
        int n;
        String string2 = "";
        String string3 = BAQ.method_39193c_Dne(string);
        int n2 = this.field_2f0dd8_div < this.field_22c602_IjH ? this.field_2f0dd8_div : this.field_22c602_IjH;
        int n3 = this.field_2f0dd8_div < this.field_22c602_IjH ? this.field_22c602_IjH : this.field_2f0dd8_div;
        int n4 = this.field_2d29f4_aFZ - this.field_569fcf45_Dne.length() - (n2 - this.field_22c602_IjH);
        boolean bl = false;
        if (this.field_569fcf45_Dne.length() > 0) {
            string2 = string2 + this.field_569fcf45_Dne.substring(0, n2);
        }
        if (n4 < string3.length()) {
            string2 = string2 + string3.substring(0, n4);
            n = n4;
        } else {
            string2 = string2 + string3;
            n = string3.length();
        }
        if (this.field_569fcf45_Dne.length() > 0 && n3 < this.field_569fcf45_Dne.length()) {
            string2 = string2 + this.field_569fcf45_Dne.substring(n3);
        }
        this.field_569fcf45_Dne = string2;
        this.method_143f9e1c_bzF(n2 - this.field_22c602_IjH + n);
    }

    public void method_ae128dc7_bzF() {
        this.method_7ed97a02_Qnq(this.field_569fcf45_Dne.length());
    }

    public void method_7ed9b9d3_Qnq(boolean bl) {
        this.field_21261e_FWm = bl;
    }

    public void method_ce7f5da9_Dne(int n) {
        if (this.field_569fcf45_Dne.length() != 0) {
            if (this.field_22c602_IjH != this.field_2f0dd8_div) {
                this.method_110c4dc3_FWm("");
            } else {
                this.method_117d19ea_FWm(this.method_ce7f5d9c_Dne(n) - this.field_2f0dd8_div);
            }
        }
    }

    public int method_16cca6d_Dne(int n, int n2) {
        return this.method_2c2d378d_Dne(n, this.method_7c6f602c_FWm(), true);
    }

    public int method_ae128dba_bzF() {
        return this.field_22c602_IjH;
    }

    public void method_87b738a3_aFZ(int n) {
        this.field_2d29f4_aFZ = n;
        if (this.field_569fcf45_Dne.length() > n) {
            this.field_569fcf45_Dne = this.field_569fcf45_Dne.substring(0, n);
        }
    }

    private void method_58fe7b07_bzF(int n, int n2, int n3, int n4) {
        int n5;
        if (n < n3) {
            n5 = n;
            n = n3;
            n3 = n5;
        }
        if (n2 < n4) {
            n5 = n2;
            n2 = n4;
            n4 = n5;
        }
        WAR wAR = WAR.field_36e5ca4_Dne;
        GL11.glColor4f(0.0f, 0.0f, 255.0f, 255.0f);
        GL11.glDisable(3553);
        GL11.glEnable(3058);
        GL11.glLogicOp(5387);
        wAR.method_7a46289a_Dne();
        wAR.method_2be429a4_Dne(n, n4, 0.0);
        wAR.method_2be429a4_Dne(n3, n4, 0.0);
        wAR.method_2be429a4_Dne(n3, n2, 0.0);
        wAR.method_2be429a4_Dne(n, n2, 0.0);
        wAR.method_7a46288d_Dne();
        GL11.glDisable(3058);
        GL11.glEnable(3553);
    }

    public boolean method_ae128dcb_bzF() {
        return this.field_2d2a05_aFZ;
    }

    public boolean method_7a46289e_Dne() {
        return this.field_2092bf_Dne;
    }

    public void method_b51ddfb1_zGp(int n) {
        this.field_33448c_mrb = n;
    }

    public void method_8f501fe4_Dne(String string) {
        this.field_569fcf45_Dne = string.length() > this.field_2d29f4_aFZ ? string.substring(0, this.field_2d29f4_aFZ) : string;
        this.method_ae128dc7_bzF();
    }

    public void method_143f9e1c_bzF(int n) {
        this.method_7ed97a02_Qnq(this.field_22c602_IjH + n);
    }

    public void method_7a46289a_Dne() {
        ++this.field_388da6_zGp;
    }

    public void method_143fdded_bzF(boolean bl) {
        this.field_267d06_Qnq = bl;
    }

    public int method_ce7f5d9c_Dne(int n) {
        return this.method_16cca6d_Dne(n, this.method_7c6f602c_FWm());
    }

    public void method_117d19ea_FWm(int n) {
        if (this.field_569fcf45_Dne.length() != 0) {
            if (this.field_22c602_IjH != this.field_2f0dd8_div) {
                this.method_110c4dc3_FWm("");
            } else {
                boolean bl = n < 0;
                int n2 = bl ? this.field_2f0dd8_div + n : this.field_2f0dd8_div;
                int n3 = bl ? this.field_2f0dd8_div : this.field_2f0dd8_div + n;
                String string = "";
                if (n2 >= 0) {
                    string = this.field_569fcf45_Dne.substring(0, n2);
                }
                if (n3 < this.field_569fcf45_Dne.length()) {
                    string = string + this.field_569fcf45_Dne.substring(n3);
                }
                this.field_569fcf45_Dne = string;
                if (bl) {
                    this.method_143f9e1c_bzF(n);
                }
            }
        }
    }

    public void method_7ed97a02_Qnq(int n) {
        this.field_2f0dd8_div = n;
        int n2 = this.field_569fcf45_Dne.length();
        if (this.field_2f0dd8_div < 0) {
            this.field_2f0dd8_div = 0;
        }
        if (this.field_2f0dd8_div > n2) {
            this.field_2f0dd8_div = n2;
        }
        this.method_63ae1a3f_div(this.field_2f0dd8_div);
    }

    public String method_d1f1ed87_FWm() {
        int n = this.field_2f0dd8_div < this.field_22c602_IjH ? this.field_2f0dd8_div : this.field_22c602_IjH;
        int n2 = this.field_2f0dd8_div < this.field_22c602_IjH ? this.field_22c602_IjH : this.field_2f0dd8_div;
        return this.field_569fcf45_Dne.substring(n, n2);
    }

    public void method_7c6f6039_FWm() {
        this.method_7ed97a02_Qnq(0);
    }

    public boolean method_16a1044_Dne(char c, int n) {
        if (this.field_267d06_Qnq && this.field_2e5f2c_bzF) {
            switch (c) {
                case '\u0001': {
                    this.method_ae128dc7_bzF();
                    this.method_63ae1a3f_div(0);
                    return true;
                }
                case '\u0003': {
                    qVZ.method_47a073d1_bzF(this.method_d1f1ed87_FWm());
                    return true;
                }
                case '\u0016': {
                    this.method_110c4dc3_FWm(qVZ.method_d1f1ed87_FWm());
                    return true;
                }
                case '\u0018': {
                    qVZ.method_47a073d1_bzF(this.method_d1f1ed87_FWm());
                    this.method_110c4dc3_FWm("");
                    return true;
                }
            }
            switch (n) {
                case 14: {
                    if (qVZ.method_7c6f603d_FWm()) {
                        this.method_ce7f5da9_Dne(-1);
                    } else {
                        this.method_117d19ea_FWm(-1);
                    }
                    return true;
                }
                case 199: {
                    if (qVZ.method_ae128dcb_bzF()) {
                        this.method_63ae1a3f_div(0);
                    } else {
                        this.method_7c6f6039_FWm();
                    }
                    return true;
                }
                case 203: {
                    if (qVZ.method_ae128dcb_bzF()) {
                        if (qVZ.method_7c6f603d_FWm()) {
                            this.method_63ae1a3f_div(this.method_16cca6d_Dne(-1, this.method_ae128dba_bzF()));
                        } else {
                            this.method_63ae1a3f_div(this.method_ae128dba_bzF() - 1);
                        }
                    } else if (qVZ.method_7c6f603d_FWm()) {
                        this.method_7ed97a02_Qnq(this.method_ce7f5d9c_Dne(-1));
                    } else {
                        this.method_143f9e1c_bzF(-1);
                    }
                    return true;
                }
                case 205: {
                    if (qVZ.method_ae128dcb_bzF()) {
                        if (qVZ.method_7c6f603d_FWm()) {
                            this.method_63ae1a3f_div(this.method_16cca6d_Dne(1, this.method_ae128dba_bzF()));
                        } else {
                            this.method_63ae1a3f_div(this.method_ae128dba_bzF() + 1);
                        }
                    } else if (qVZ.method_7c6f603d_FWm()) {
                        this.method_7ed97a02_Qnq(this.method_ce7f5d9c_Dne(1));
                    } else {
                        this.method_143f9e1c_bzF(1);
                    }
                    return true;
                }
                case 207: {
                    if (qVZ.method_ae128dcb_bzF()) {
                        this.method_63ae1a3f_div(this.field_569fcf45_Dne.length());
                    } else {
                        this.method_ae128dc7_bzF();
                    }
                    return true;
                }
                case 211: {
                    if (qVZ.method_7c6f603d_FWm()) {
                        this.method_ce7f5da9_Dne(1);
                    } else {
                        this.method_117d19ea_FWm(1);
                    }
                    return true;
                }
            }
            if (BAQ.method_ce7f4727_Dne(c)) {
                this.method_110c4dc3_FWm(Character.toString(c));
                return true;
            }
            return false;
        }
        return false;
    }
}

