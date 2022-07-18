package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public abstract class BJs {
    private float field_2092ab_Dne = -2.0f;
    private long field_2092af_Dne = 0L;
    private final int field_2d29f4_aFZ;
    private final int field_267cf5_Qnq;
    private final int field_20b857_DyG;
    protected final int field_2092ae_Dne;
    private final int field_388da6_zGp;
    private float field_2e5f18_bzF;
    protected int field_2e5f1b_bzF;
    private float field_21260a_FWm;
    protected int field_21260d_FWm;
    private final Minecraft field_493682ed_Dne;
    private int field_2f0dd8_div = -1;

    protected abstract boolean method_ce7f5dad_Dne(int var1);

    public BJs(Minecraft minecraft, int n, int n2, int n3, int n4, int n5) {
        this.field_493682ed_Dne = minecraft;
        this.field_2d29f4_aFZ = n2;
        this.field_20b857_DyG = n2 + n4;
        this.field_2092ae_Dne = n5;
        this.field_267cf5_Qnq = n;
        this.field_388da6_zGp = n + n3;
    }

    protected int method_907a9d14_Qnq() {
        return this.field_388da6_zGp - 8;
    }

    protected abstract void method_8a73475f_Dne(int var1, int var2, int var3, int var4, WAR var5);

    public int method_ae128dba_bzF() {
        return this.method_7c6f602c_FWm() - (this.field_20b857_DyG - this.field_2d29f4_aFZ - 4);
    }

    private void method_7c6f6039_FWm() {
        int n = this.method_ae128dba_bzF();
        if (n < 0) {
            n = 0;
        }
        if (this.field_2e5f18_bzF < 0.0f) {
            this.field_2e5f18_bzF = 0.0f;
        }
        if (this.field_2e5f18_bzF > (float)n) {
            this.field_2e5f18_bzF = n;
        }
    }

    protected abstract int method_7a46288d_Dne();

    protected abstract void method_16d0a4b_Dne(int var1, boolean var2);

    public void method_2c2cec86_Dne(int n, int n2, float f) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        this.field_21260d_FWm = n;
        this.field_2e5f1b_bzF = n2;
        this.method_7a46289a_Dne();
        int n11 = this.method_7a46288d_Dne();
        int n12 = this.method_907a9d14_Qnq();
        int n13 = n12 + 6;
        if (Mouse.isButtonDown(0)) {
            if (this.field_2092ab_Dne == -1.0f) {
                n10 = 1;
                if (n2 >= this.field_2d29f4_aFZ && n2 <= this.field_20b857_DyG) {
                    int n14 = this.field_267cf5_Qnq + 2;
                    n9 = this.field_388da6_zGp - 2;
                    n8 = n2 - this.field_2d29f4_aFZ + (int)this.field_2e5f18_bzF - 4;
                    n7 = n8 / this.field_2092ae_Dne;
                    if (n >= n14 && n <= n9 && n7 >= 0 && n8 >= 0 && n7 < n11) {
                        n6 = n7 == this.field_2f0dd8_div && Minecraft.method_7a46288e_Dne() - this.field_2092af_Dne < 250L ? 1 : 0;
                        this.method_16d0a4b_Dne(n7, n6 != 0);
                        this.field_2f0dd8_div = n7;
                        this.field_2092af_Dne = Minecraft.method_7a46288e_Dne();
                    } else if (n >= n14 && n <= n9 && n8 < 0) {
                        n10 = 0;
                    }
                    if (n >= n12 && n <= n13) {
                        this.field_21260a_FWm = -1.0f;
                        n5 = this.method_ae128dba_bzF();
                        if (n5 < 1) {
                            n5 = 1;
                        }
                        if ((n4 = (int)((float)((this.field_20b857_DyG - this.field_2d29f4_aFZ) * (this.field_20b857_DyG - this.field_2d29f4_aFZ)) / (float)this.method_7c6f602c_FWm())) < 32) {
                            n4 = 32;
                        }
                        if (n4 > this.field_20b857_DyG - this.field_2d29f4_aFZ - 8) {
                            n4 = this.field_20b857_DyG - this.field_2d29f4_aFZ - 8;
                        }
                        this.field_21260a_FWm /= (float)(this.field_20b857_DyG - this.field_2d29f4_aFZ - n4) / (float)n5;
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
                this.field_2e5f18_bzF += (float)(n10 * this.field_2092ae_Dne / 2);
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
        wAR.method_c38c5864_Dne(this.field_267cf5_Qnq, this.field_20b857_DyG, 0.0, (float)this.field_267cf5_Qnq / f2, (float)(this.field_20b857_DyG + (int)this.field_2e5f18_bzF) / f2);
        wAR.method_c38c5864_Dne(this.field_388da6_zGp, this.field_20b857_DyG, 0.0, (float)this.field_388da6_zGp / f2, (float)(this.field_20b857_DyG + (int)this.field_2e5f18_bzF) / f2);
        wAR.method_c38c5864_Dne(this.field_388da6_zGp, this.field_2d29f4_aFZ, 0.0, (float)this.field_388da6_zGp / f2, (float)(this.field_2d29f4_aFZ + (int)this.field_2e5f18_bzF) / f2);
        wAR.method_c38c5864_Dne(this.field_267cf5_Qnq, this.field_2d29f4_aFZ, 0.0, (float)this.field_267cf5_Qnq / f2, (float)(this.field_2d29f4_aFZ + (int)this.field_2e5f18_bzF) / f2);
        wAR.method_7a46288d_Dne();
        n9 = this.field_267cf5_Qnq + 2;
        n8 = this.field_2d29f4_aFZ + 4 - (int)this.field_2e5f18_bzF;
        for (n7 = 0; n7 < n11; ++n7) {
            n5 = n8 + n7 * this.field_2092ae_Dne;
            n4 = this.field_2092ae_Dne - 4;
            if (n5 + this.field_2092ae_Dne > this.field_20b857_DyG || n5 - 4 < this.field_2d29f4_aFZ) continue;
            if (this.method_ce7f5dad_Dne(n7)) {
                n6 = this.field_267cf5_Qnq + 2;
                n3 = this.field_388da6_zGp - 2;
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
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glDisable(3008);
        GL11.glShadeModel(7425);
        GL11.glDisable(3553);
        wAR.method_7a46289a_Dne();
        wAR.method_16cca7a_Dne(0, 0);
        wAR.method_c38c5864_Dne(this.field_267cf5_Qnq, this.field_2d29f4_aFZ + n3, 0.0, 0.0, 1.0);
        wAR.method_c38c5864_Dne(this.field_388da6_zGp, this.field_2d29f4_aFZ + n3, 0.0, 1.0, 1.0);
        wAR.method_16cca7a_Dne(0, 255);
        wAR.method_c38c5864_Dne(this.field_388da6_zGp, this.field_2d29f4_aFZ, 0.0, 1.0, 0.0);
        wAR.method_c38c5864_Dne(this.field_267cf5_Qnq, this.field_2d29f4_aFZ, 0.0, 0.0, 0.0);
        wAR.method_7a46288d_Dne();
        wAR.method_7a46289a_Dne();
        wAR.method_16cca7a_Dne(0, 255);
        wAR.method_c38c5864_Dne(this.field_267cf5_Qnq, this.field_20b857_DyG, 0.0, 0.0, 1.0);
        wAR.method_c38c5864_Dne(this.field_388da6_zGp, this.field_20b857_DyG, 0.0, 1.0, 1.0);
        wAR.method_16cca7a_Dne(0, 0);
        wAR.method_c38c5864_Dne(this.field_388da6_zGp, this.field_20b857_DyG - n3, 0.0, 1.0, 0.0);
        wAR.method_c38c5864_Dne(this.field_267cf5_Qnq, this.field_20b857_DyG - n3, 0.0, 0.0, 0.0);
        wAR.method_7a46288d_Dne();
        n5 = this.method_ae128dba_bzF();
        if (n5 > 0) {
            n4 = (this.field_20b857_DyG - this.field_2d29f4_aFZ) * (this.field_20b857_DyG - this.field_2d29f4_aFZ) / this.method_7c6f602c_FWm();
            if (n4 < 32) {
                n4 = 32;
            }
            if (n4 > this.field_20b857_DyG - this.field_2d29f4_aFZ - 8) {
                n4 = this.field_20b857_DyG - this.field_2d29f4_aFZ - 8;
            }
            if ((n6 = (int)this.field_2e5f18_bzF * (this.field_20b857_DyG - this.field_2d29f4_aFZ - n4) / n5 + this.field_2d29f4_aFZ) < this.field_2d29f4_aFZ) {
                n6 = this.field_2d29f4_aFZ;
            }
            wAR.method_7a46289a_Dne();
            wAR.method_16cca7a_Dne(0, 255);
            wAR.method_c38c5864_Dne(n12, this.field_20b857_DyG, 0.0, 0.0, 1.0);
            wAR.method_c38c5864_Dne(n13, this.field_20b857_DyG, 0.0, 1.0, 1.0);
            wAR.method_c38c5864_Dne(n13, this.field_2d29f4_aFZ, 0.0, 1.0, 0.0);
            wAR.method_c38c5864_Dne(n12, this.field_2d29f4_aFZ, 0.0, 0.0, 0.0);
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
        GL11.glEnable(3553);
        GL11.glShadeModel(7424);
        GL11.glEnable(3008);
        GL11.glDisable(3042);
    }

    protected abstract void method_7a46289a_Dne();

    protected int method_7c6f602c_FWm() {
        return this.method_7a46288d_Dne() * this.field_2092ae_Dne;
    }
}

