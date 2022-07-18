package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public abstract class lSb {
    private float field_2e5f18_bzF;
    private float field_2092ab_Dne = -2.0f;
    private boolean field_21261e_FWm;
    private int field_2a9ad6_Zpi = -1;
    private float field_21260a_FWm;
    protected int field_2d29f4_aFZ;
    private int field_33448c_mrb;
    protected int field_267cf5_Qnq;
    private int field_388da6_zGp;
    private final Minecraft field_493682ed_Dne;
    private boolean field_2092bf_Dne = true;
    private int field_20b857_DyG;
    protected int field_21260d_FWm;
    private int field_29186d_XHL;
    private long field_2092af_Dne = 0L;
    protected final int field_2e5f1b_bzF;
    private int field_2f0dd8_div;
    private int field_22c602_IjH;
    protected int field_2092ae_Dne;
    private int field_31b816_kGO;

    public void method_81183ff7_Dne(pee_0 pee_02) {
        if (pee_02.field_2092bf_Dne) {
            if (pee_02.field_2d29f4_aFZ == this.field_33448c_mrb) {
                this.field_2e5f18_bzF -= (float)(this.field_2e5f1b_bzF * 2 / 3);
                this.field_2092ab_Dne = -2.0f;
                this.method_7c6f6039_FWm();
            } else if (pee_02.field_2d29f4_aFZ == this.field_29186d_XHL) {
                this.field_2e5f18_bzF += (float)(this.field_2e5f1b_bzF * 2 / 3);
                this.field_2092ab_Dne = -2.0f;
                this.method_7c6f6039_FWm();
            }
        }
    }

    protected abstract void method_8a73475f_Dne(int var1, int var2, int var3, int var4, WAR var5);

    public int method_ae128dba_bzF() {
        return this.method_7c6f602c_FWm() - (this.field_21260d_FWm - this.field_2092ae_Dne - 4);
    }

    protected abstract boolean method_117d19ee_FWm(int var1);

    protected abstract boolean method_ce7f5dad_Dne(int var1);

    public void method_5972745a_Dne(int n, int n2, int n3, int n4) {
        this.field_388da6_zGp = n;
        this.field_20b857_DyG = n2;
        this.field_2092ae_Dne = n3;
        this.field_21260d_FWm = n4;
        this.field_22c602_IjH = 0;
        this.field_2f0dd8_div = n;
    }

    public void method_2c2cec86_Dne(int n, int n2, float f) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        this.field_267cf5_Qnq = n;
        this.field_2d29f4_aFZ = n2;
        this.method_7a46289a_Dne();
        int n11 = this.method_7a46288d_Dne();
        int n12 = this.method_907a9d14_Qnq();
        int n13 = n12 + 6;
        if (Mouse.isButtonDown(0)) {
            if (this.field_2092ab_Dne == -1.0f) {
                n10 = 1;
                if (n2 >= this.field_2092ae_Dne && n2 <= this.field_21260d_FWm) {
                    int n14 = this.field_388da6_zGp / 2 - 110;
                    n9 = this.field_388da6_zGp / 2 + 110;
                    n8 = n2 - this.field_2092ae_Dne - this.field_31b816_kGO + (int)this.field_2e5f18_bzF - 4;
                    n7 = n8 / this.field_2e5f1b_bzF;
                    if (n >= n14 && n <= n9 && n7 >= 0 && n8 >= 0 && n7 < n11) {
                        n6 = n7 == this.field_2a9ad6_Zpi && Minecraft.method_7a46288e_Dne() - this.field_2092af_Dne < 250L ? 1 : 0;
                        this.method_16d0a4b_Dne(n7, n6 != 0);
                        this.field_2a9ad6_Zpi = n7;
                        this.field_2092af_Dne = Minecraft.method_7a46288e_Dne();
                    } else if (n >= n14 && n <= n9 && n8 < 0) {
                        this.method_16cca7a_Dne(n - n14, n2 - this.field_2092ae_Dne + (int)this.field_2e5f18_bzF - 4);
                        n10 = 0;
                    }
                    if (n >= n12 && n <= n13) {
                        this.field_21260a_FWm = -1.0f;
                        n5 = this.method_ae128dba_bzF();
                        if (n5 < 1) {
                            n5 = 1;
                        }
                        if ((n4 = (int)((float)((this.field_21260d_FWm - this.field_2092ae_Dne) * (this.field_21260d_FWm - this.field_2092ae_Dne)) / (float)this.method_7c6f602c_FWm())) < 32) {
                            n4 = 32;
                        }
                        if (n4 > this.field_21260d_FWm - this.field_2092ae_Dne - 8) {
                            n4 = this.field_21260d_FWm - this.field_2092ae_Dne - 8;
                        }
                        this.field_21260a_FWm /= (float)(this.field_21260d_FWm - this.field_2092ae_Dne - n4) / (float)n5;
                    } else {
                        this.field_21260a_FWm = 1.0f;
                    }
                    this.field_2092ab_Dne = n10 != 0 ? (float)n2 : -2.0f;
                } else {
                    this.field_2092ab_Dne = -2.0f;
                }
            } else if (this.field_2092ab_Dne >= 0.0f) {
                this.field_2e5f18_bzF -= ((float)n2 - this.field_2092ab_Dne) * this.field_21260a_FWm;
                this.field_2092ab_Dne = n2;
            }
        } else {
            while (!this.field_493682ed_Dne.field_3758af7_Dne.field_1ed028_ATE && Mouse.next()) {
                n10 = Mouse.getEventDWheel();
                if (n10 == 0) continue;
                if (n10 > 0) {
                    n10 = -1;
                } else if (n10 < 0) {
                    n10 = 1;
                }
                this.field_2e5f18_bzF += (float)(n10 * this.field_2e5f1b_bzF / 2);
            }
            this.field_2092ab_Dne = -1.0f;
        }
        this.method_7c6f6039_FWm();
        GL11.glDisable(2896);
        GL11.glDisable(2912);
        WAR wAR = WAR.field_36e5ca4_Dne;
        this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/gui/background.png");
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        float f2 = 32.0f;
        wAR.method_7a46289a_Dne();
        wAR.method_143f9e1c_bzF(0x202020);
        wAR.method_c38c5864_Dne(this.field_22c602_IjH, this.field_21260d_FWm, 0.0, (float)this.field_22c602_IjH / f2, (float)(this.field_21260d_FWm + (int)this.field_2e5f18_bzF) / f2);
        wAR.method_c38c5864_Dne(this.field_2f0dd8_div, this.field_21260d_FWm, 0.0, (float)this.field_2f0dd8_div / f2, (float)(this.field_21260d_FWm + (int)this.field_2e5f18_bzF) / f2);
        wAR.method_c38c5864_Dne(this.field_2f0dd8_div, this.field_2092ae_Dne, 0.0, (float)this.field_2f0dd8_div / f2, (float)(this.field_2092ae_Dne + (int)this.field_2e5f18_bzF) / f2);
        wAR.method_c38c5864_Dne(this.field_22c602_IjH, this.field_2092ae_Dne, 0.0, (float)this.field_22c602_IjH / f2, (float)(this.field_2092ae_Dne + (int)this.field_2e5f18_bzF) / f2);
        wAR.method_7a46288d_Dne();
        n9 = this.field_388da6_zGp / 2 - 92 - 16;
        n8 = this.field_2092ae_Dne + 4 - (int)this.field_2e5f18_bzF;
        if (this.field_21261e_FWm) {
            this.method_c619c53f_Dne(n9, n8, wAR);
        }
        for (n7 = 0; n7 < n11; ++n7) {
            n5 = n8 + n7 * this.field_2e5f1b_bzF + this.field_31b816_kGO;
            n4 = this.field_2e5f1b_bzF - 4;
            if (n5 > this.field_21260d_FWm || n5 + n4 < this.field_2092ae_Dne) continue;
            if (this.field_2092bf_Dne && this.method_117d19ee_FWm(n7)) {
                n6 = this.field_388da6_zGp / 2 - 110;
                n3 = this.field_388da6_zGp / 2 + 110;
                GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                GL11.glDisable(3553);
                wAR.method_7a46289a_Dne();
                wAR.method_143f9e1c_bzF(0);
                wAR.method_c38c5864_Dne(n6, n5 + n4 + 2, 0.0, 0.0, 1.0);
                wAR.method_c38c5864_Dne(n3, n5 + n4 + 2, 0.0, 1.0, 1.0);
                wAR.method_c38c5864_Dne(n3, n5 - 2, 0.0, 1.0, 0.0);
                wAR.method_c38c5864_Dne(n6, n5 - 2, 0.0, 0.0, 0.0);
                wAR.method_7a46288d_Dne();
                GL11.glEnable(3553);
            }
            if (this.field_2092bf_Dne && this.method_ce7f5dad_Dne(n7)) {
                n6 = this.field_388da6_zGp / 2 - 110;
                n3 = this.field_388da6_zGp / 2 + 110;
                GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                GL11.glDisable(3553);
                wAR.method_7a46289a_Dne();
                wAR.method_143f9e1c_bzF(0x808080);
                wAR.method_c38c5864_Dne(n6, n5 + n4 + 2, 0.0, 0.0, 1.0);
                wAR.method_c38c5864_Dne(n3, n5 + n4 + 2, 0.0, 1.0, 1.0);
                wAR.method_c38c5864_Dne(n3, n5 - 2, 0.0, 1.0, 0.0);
                wAR.method_c38c5864_Dne(n6, n5 - 2, 0.0, 0.0, 0.0);
                wAR.method_143f9e1c_bzF(0);
                wAR.method_c38c5864_Dne(n6 + 1, n5 + n4 + 1, 0.0, 0.0, 1.0);
                wAR.method_c38c5864_Dne(n3 - 1, n5 + n4 + 1, 0.0, 1.0, 1.0);
                wAR.method_c38c5864_Dne(n3 - 1, n5 - 1, 0.0, 1.0, 0.0);
                wAR.method_c38c5864_Dne(n6 + 1, n5 - 1, 0.0, 0.0, 0.0);
                wAR.method_7a46288d_Dne();
                GL11.glEnable(3553);
            }
            this.method_8a73475f_Dne(n7, n9, n5, n4, wAR);
        }
        GL11.glDisable(2929);
        n3 = 4;
        this.method_2ee8c479_FWm(0, this.field_2092ae_Dne, 255, 255);
        this.method_2ee8c479_FWm(this.field_21260d_FWm, this.field_20b857_DyG, 255, 255);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glDisable(3008);
        GL11.glShadeModel(7425);
        GL11.glDisable(3553);
        wAR.method_7a46289a_Dne();
        wAR.method_16cca7a_Dne(0, 0);
        wAR.method_c38c5864_Dne(this.field_22c602_IjH, this.field_2092ae_Dne + n3, 0.0, 0.0, 1.0);
        wAR.method_c38c5864_Dne(this.field_2f0dd8_div, this.field_2092ae_Dne + n3, 0.0, 1.0, 1.0);
        wAR.method_16cca7a_Dne(0, 255);
        wAR.method_c38c5864_Dne(this.field_2f0dd8_div, this.field_2092ae_Dne, 0.0, 1.0, 0.0);
        wAR.method_c38c5864_Dne(this.field_22c602_IjH, this.field_2092ae_Dne, 0.0, 0.0, 0.0);
        wAR.method_7a46288d_Dne();
        wAR.method_7a46289a_Dne();
        wAR.method_16cca7a_Dne(0, 255);
        wAR.method_c38c5864_Dne(this.field_22c602_IjH, this.field_21260d_FWm, 0.0, 0.0, 1.0);
        wAR.method_c38c5864_Dne(this.field_2f0dd8_div, this.field_21260d_FWm, 0.0, 1.0, 1.0);
        wAR.method_16cca7a_Dne(0, 0);
        wAR.method_c38c5864_Dne(this.field_2f0dd8_div, this.field_21260d_FWm - n3, 0.0, 1.0, 0.0);
        wAR.method_c38c5864_Dne(this.field_22c602_IjH, this.field_21260d_FWm - n3, 0.0, 0.0, 0.0);
        wAR.method_7a46288d_Dne();
        n5 = this.method_ae128dba_bzF();
        if (n5 > 0) {
            n4 = (this.field_21260d_FWm - this.field_2092ae_Dne) * (this.field_21260d_FWm - this.field_2092ae_Dne) / this.method_7c6f602c_FWm();
            if (n4 < 32) {
                n4 = 32;
            }
            if (n4 > this.field_21260d_FWm - this.field_2092ae_Dne - 8) {
                n4 = this.field_21260d_FWm - this.field_2092ae_Dne - 8;
            }
            if ((n6 = (int)this.field_2e5f18_bzF * (this.field_21260d_FWm - this.field_2092ae_Dne - n4) / n5 + this.field_2092ae_Dne) < this.field_2092ae_Dne) {
                n6 = this.field_2092ae_Dne;
            }
            wAR.method_7a46289a_Dne();
            wAR.method_16cca7a_Dne(0, 255);
            wAR.method_c38c5864_Dne(n12, this.field_21260d_FWm, 0.0, 0.0, 1.0);
            wAR.method_c38c5864_Dne(n13, this.field_21260d_FWm, 0.0, 1.0, 1.0);
            wAR.method_c38c5864_Dne(n13, this.field_2092ae_Dne, 0.0, 1.0, 0.0);
            wAR.method_c38c5864_Dne(n12, this.field_2092ae_Dne, 0.0, 0.0, 0.0);
            wAR.method_7a46288d_Dne();
            wAR.method_7a46289a_Dne();
            wAR.method_16cca7a_Dne(0x808080, 255);
            wAR.method_c38c5864_Dne(n12, n6 + n4, 0.0, 0.0, 1.0);
            wAR.method_c38c5864_Dne(n13, n6 + n4, 0.0, 1.0, 1.0);
            wAR.method_c38c5864_Dne(n13, n6, 0.0, 1.0, 0.0);
            wAR.method_c38c5864_Dne(n12, n6, 0.0, 0.0, 0.0);
            wAR.method_7a46288d_Dne();
            wAR.method_7a46289a_Dne();
            wAR.method_16cca7a_Dne(0xC0C0C0, 255);
            wAR.method_c38c5864_Dne(n12, n6 + n4 - 1, 0.0, 0.0, 1.0);
            wAR.method_c38c5864_Dne(n13 - 1, n6 + n4 - 1, 0.0, 1.0, 1.0);
            wAR.method_c38c5864_Dne(n13 - 1, n6, 0.0, 1.0, 0.0);
            wAR.method_c38c5864_Dne(n12, n6, 0.0, 0.0, 0.0);
            wAR.method_7a46288d_Dne();
        }
        this.method_1e269659_FWm(n, n2);
        GL11.glEnable(3553);
        GL11.glShadeModel(7424);
        GL11.glEnable(3008);
        GL11.glDisable(3042);
    }

    protected void method_16cca7a_Dne(int n, int n2) {
    }

    protected abstract void method_7a46289a_Dne();

    public lSb(Minecraft minecraft, int n, int n2, int n3, int n4, int n5) {
        this.field_493682ed_Dne = minecraft;
        this.field_388da6_zGp = n;
        this.field_20b857_DyG = n2;
        this.field_2092ae_Dne = n3;
        this.field_21260d_FWm = n4;
        this.field_2e5f1b_bzF = n5;
        this.field_22c602_IjH = 0;
        this.field_2f0dd8_div = n;
    }

    protected void method_1e269659_FWm(int n, int n2) {
    }

    protected abstract int method_7a46288d_Dne();

    private void method_7c6f6039_FWm() {
        int n = this.method_ae128dba_bzF();
        if (n < 0) {
            n /= 2;
        }
        if (this.field_2e5f18_bzF < 0.0f) {
            this.field_2e5f18_bzF = 0.0f;
        }
        if (this.field_2e5f18_bzF > (float)n) {
            this.field_2e5f18_bzF = n;
        }
    }

    protected void method_c619c53f_Dne(int n, int n2, WAR wAR) {
    }

    protected int method_7c6f602c_FWm() {
        return this.method_7a46288d_Dne() * this.field_2e5f1b_bzF + this.field_31b816_kGO;
    }

    protected int method_907a9d14_Qnq() {
        return this.field_388da6_zGp / 2 + 124;
    }

    protected abstract void method_16d0a4b_Dne(int var1, boolean var2);

    private void method_2ee8c479_FWm(int n, int n2, int n3, int n4) {
        WAR wAR = WAR.field_36e5ca4_Dne;
        this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/gui/background.png");
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        float f = 32.0f;
        wAR.method_7a46289a_Dne();
        wAR.method_16cca7a_Dne(0x404040, n4);
        wAR.method_c38c5864_Dne(0.0, n2, 0.0, 0.0, (float)n2 / f);
        wAR.method_c38c5864_Dne(this.field_388da6_zGp, n2, 0.0, (float)this.field_388da6_zGp / f, (float)n2 / f);
        wAR.method_16cca7a_Dne(0x404040, n3);
        wAR.method_c38c5864_Dne(this.field_388da6_zGp, n, 0.0, (float)this.field_388da6_zGp / f, (float)n / f);
        wAR.method_c38c5864_Dne(0.0, n, 0.0, 0.0, (float)n / f);
        wAR.method_7a46288d_Dne();
    }
}

