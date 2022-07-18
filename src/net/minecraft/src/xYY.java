package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.lwjgl.input.Mouse;

abstract class xYY
extends LSv {
    protected int field_20b857_DyG;
    protected int field_2f0dd8_div;
    final ZyA field_202a55c9_FWm;
    protected List field_f27c122c_Dne;
    protected Comparator field_740a65b4_Dne;
    protected int field_2092ae_Dne;

    @Override
    protected boolean method_ce7f5dad_Dne(int n) {
        return false;
    }

    @Override
    protected void method_16cca7a_Dne(int n, int n2) {
        this.field_2092ae_Dne = -1;
        if (n >= 79 && n < 115) {
            this.field_2092ae_Dne = 0;
        } else if (n >= 129 && n < 165) {
            this.field_2092ae_Dne = 1;
        } else if (n >= 179 && n < 215) {
            this.field_2092ae_Dne = 2;
        }
        if (this.field_2092ae_Dne >= 0) {
            this.method_117d19ea_FWm(this.field_2092ae_Dne);
            ZyA.method_3b99f430_bzF((ZyA)this.field_202a55c9_FWm).field_3788296_Dne.method_fbd4aee4_Dne("random.click", 1.0f, 1.0f);
        }
    }

    protected xYY(ZyA zyA) {
        super(ZyA.method_7831f5a2_FWm(zyA), zyA.field_21260d_FWm, zyA.field_2e5f1b_bzF, 32, zyA.field_2e5f1b_bzF - 64, 20);
        this.field_202a55c9_FWm = zyA;
        this.field_2092ae_Dne = -1;
        this.field_20b857_DyG = -1;
        this.field_2f0dd8_div = 0;
        this.method_ce7f9d7a_Dne(false);
        this.method_17484c9_Dne(true, 20);
    }

    @Override
    protected final int method_7a46288d_Dne() {
        return this.field_f27c122c_Dne.size();
    }

    protected abstract String method_2c0e7e17_Dne(int var1);

    protected void method_117d19ea_FWm(int n) {
        if (n != this.field_20b857_DyG) {
            this.field_20b857_DyG = n;
            this.field_2f0dd8_div = -1;
        } else if (this.field_2f0dd8_div == -1) {
            this.field_2f0dd8_div = 1;
        } else {
            this.field_20b857_DyG = -1;
            this.field_2f0dd8_div = 0;
        }
        Collections.sort(this.field_f27c122c_Dne, this.field_740a65b4_Dne);
    }

    @Override
    protected void method_16d0a4b_Dne(int n, boolean bl) {
    }

    protected void method_31b5f37c_Dne(isy isy2, int n, int n2, boolean bl) {
        if (isy2 != null) {
            String string = isy2.method_2c0e7e17_Dne(ZyA.method_3e9ab6eb_Dne(this.field_202a55c9_FWm).method_831230f1_Dne(isy2));
            this.field_202a55c9_FWm.method_67d6d54c_FWm(ZyA.method_fcf540f4_Qnq(this.field_202a55c9_FWm), string, n - ZyA.method_e23ece95_aFZ(this.field_202a55c9_FWm).method_8f501fd7_Dne(string), n2 + 5, bl ? 0xFFFFFF : 0x909090);
        } else {
            String string = "-";
            this.field_202a55c9_FWm.method_67d6d54c_FWm(ZyA.method_9cc87a3_zGp(this.field_202a55c9_FWm), string, n - ZyA.method_ffd97452_DyG(this.field_202a55c9_FWm).method_8f501fd7_Dne(string), n2 + 5, bl ? 0xFFFFFF : 0x909090);
        }
    }

    protected final isy method_9e7aefab_Dne(int n) {
        return (isy)this.field_f27c122c_Dne.get(n);
    }

    @Override
    protected void method_7a46289a_Dne() {
        this.field_202a55c9_FWm.method_a98a0660_aFZ();
    }

    @Override
    protected void method_c619c53f_Dne(int n, int n2, WAR wAR) {
        if (!Mouse.isButtonDown(0)) {
            this.field_2092ae_Dne = -1;
        }
        if (this.field_2092ae_Dne == 0) {
            ZyA.method_750c5d25_Dne(this.field_202a55c9_FWm, n + 115 - 18, n2 + 1, 0, 0);
        } else {
            ZyA.method_750c5d25_Dne(this.field_202a55c9_FWm, n + 115 - 18, n2 + 1, 0, 18);
        }
        if (this.field_2092ae_Dne == 1) {
            ZyA.method_750c5d25_Dne(this.field_202a55c9_FWm, n + 165 - 18, n2 + 1, 0, 0);
        } else {
            ZyA.method_750c5d25_Dne(this.field_202a55c9_FWm, n + 165 - 18, n2 + 1, 0, 18);
        }
        if (this.field_2092ae_Dne == 2) {
            ZyA.method_750c5d25_Dne(this.field_202a55c9_FWm, n + 215 - 18, n2 + 1, 0, 0);
        } else {
            ZyA.method_750c5d25_Dne(this.field_202a55c9_FWm, n + 215 - 18, n2 + 1, 0, 18);
        }
        if (this.field_20b857_DyG != -1) {
            int n3 = 79;
            int n4 = 18;
            if (this.field_20b857_DyG == 1) {
                n3 = 129;
            } else if (this.field_20b857_DyG == 2) {
                n3 = 179;
            }
            if (this.field_2f0dd8_div == 1) {
                n4 = 36;
            }
            ZyA.method_750c5d25_Dne(this.field_202a55c9_FWm, n + n3, n2 + 1, n4, 0);
        }
    }

    protected void method_c7cc0a58_Dne(isy isy2, int n, int n2) {
        if (isy2 != null) {
            dEr dEr2 = dEr.field_836aa5b6_Dne[isy2.method_7a46288d_Dne()];
            String string = ("" + irb.method_2310d392_Dne().method_8dd0853d_FWm(dEr2.method_d1f1ed87_FWm())).trim();
            if (string.length() > 0) {
                int n3 = n + 12;
                int n4 = n2 - 12;
                int n5 = ZyA.method_5ebea4fd_mrb(this.field_202a55c9_FWm).method_8f501fd7_Dne(string);
                ZyA.method_8f8c2746_FWm(this.field_202a55c9_FWm, n3 - 3, n4 - 3, n3 + n5 + 3, n4 + 8 + 3, -1073741824, -1073741824);
                ZyA.method_72194a7c_XHL(this.field_202a55c9_FWm).method_7eed4432_Dne(string, n3, n4, -1);
            }
        }
    }

    @Override
    protected void method_1e269659_FWm(int n, int n2) {
        if (n2 >= this.field_21260d_FWm && n2 <= this.field_2e5f1b_bzF) {
            int n3 = this.method_16cca6d_Dne(n, n2);
            int n4 = this.field_202a55c9_FWm.field_21260d_FWm / 2 - 92 - 16;
            if (n3 >= 0) {
                if (n < n4 + 40 || n > n4 + 40 + 20) {
                    return;
                }
                isy isy2 = this.method_9e7aefab_Dne(n3);
                this.method_c7cc0a58_Dne(isy2, n, n2);
            } else {
                String string = "";
                if (n >= n4 + 115 - 18 && n <= n4 + 115) {
                    string = this.method_2c0e7e17_Dne(0);
                } else if (n >= n4 + 165 - 18 && n <= n4 + 165) {
                    string = this.method_2c0e7e17_Dne(1);
                } else {
                    if (n < n4 + 215 - 18 || n > n4 + 215) {
                        return;
                    }
                    string = this.method_2c0e7e17_Dne(2);
                }
                string = ("" + irb.method_2310d392_Dne().method_39193c_Dne(string)).trim();
                if (string.length() > 0) {
                    int n5 = n + 12;
                    int n6 = n2 - 12;
                    int n7 = ZyA.method_e7785431_div(this.field_202a55c9_FWm).method_8f501fd7_Dne(string);
                    ZyA.method_63780845_Dne(this.field_202a55c9_FWm, n5 - 3, n6 - 3, n5 + n7 + 3, n6 + 8 + 3, -1073741824, -1073741824);
                    ZyA.method_73a6bdc7_IjH(this.field_202a55c9_FWm).method_7eed4432_Dne(string, n5, n6, -1);
                }
            }
        }
    }
}

