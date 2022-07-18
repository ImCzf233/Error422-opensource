package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class apb
extends qVZ {
    private static final int field_22c602_IjH;
    protected double field_267cf0_Qnq;
    private static final int field_20b857_DyG;
    protected int field_2d29f4_aFZ = 0;
    protected int field_2092ae_Dne = 256;
    protected double field_388da1_zGp;
    protected double field_2e5f16_bzF;
    protected double field_212608_FWm;
    protected int field_267cf5_Qnq = 202;
    private static final int field_2f0dd8_div;
    private int field_29186d_XHL = 0;
    private FkP field_3673fc1_Dne;
    protected int field_388da6_zGp = 0;
    protected double field_2d29ef_aFZ;
    protected double field_2092a9_Dne;
    private static final int field_33448c_mrb;

    public apb(FkP fkP) {
        this.field_3673fc1_Dne = fkP;
        int n = 141;
        int n2 = 141;
        this.field_2e5f16_bzF = this.field_2d29ef_aFZ = (double)(qlg.field_36522b5_Dne.field_2092ae_Dne * 24 - n / 2 - 12);
        this.field_2092a9_Dne = this.field_2d29ef_aFZ;
        this.field_267cf0_Qnq = this.field_388da1_zGp = (double)(qlg.field_36522b5_Dne.field_21260d_FWm * 24 - n2 / 2);
        this.field_212608_FWm = this.field_388da1_zGp;
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return true;
    }

    protected void method_d44b4592_zGp() {
        int n = (this.field_21260d_FWm - this.field_2092ae_Dne) / 2;
        int n2 = (this.field_2e5f1b_bzF - this.field_267cf5_Qnq) / 2;
        this.field_3791671_Dne.method_e88b55f3_FWm("Achievements", n + 15, n2 + 5, 0x404040);
    }

    protected void method_a6ac9c87_FWm(int var1, int var2, float var3) {
        int var4 = geR.method_117d0718_FWm(this.field_2092a9_Dne + (this.field_2e5f16_bzF - this.field_2092a9_Dne) * (double)var3);
        int var5 = geR.method_117d0718_FWm(this.field_212608_FWm + (this.field_267cf0_Qnq - this.field_212608_FWm) * (double)var3);
        if (var4 < field_20b857_DyG) {
            var4 = field_20b857_DyG;
        }

        if (var5 < field_2f0dd8_div) {
            var5 = field_2f0dd8_div;
        }

        if (var4 >= field_22c602_IjH) {
            var4 = field_22c602_IjH - 1;
        }

        if (var5 >= field_33448c_mrb) {
            var5 = field_33448c_mrb - 1;
        }

        int var6 = (this.field_21260d_FWm - this.field_2092ae_Dne) / 2;
        int var7 = (this.field_2e5f1b_bzF - this.field_267cf5_Qnq) / 2;
        int var8 = var6 + 16;
        int var9 = var7 + 17;
        this.field_21260a_FWm = 0.0F;
        GL11.glDepthFunc(518);
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0F, 0.0F, -200.0F);
        GL11.glEnable(3553);
        GL11.glDisable(2896);
        GL11.glEnable(32826);
        GL11.glEnable(2903);
        this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/terrain.png");
        int var10 = var4 + 288 >> 4;
        int var11 = var5 + 288 >> 4;
        int var12 = (var4 + 288) % 16;
        int var13 = (var5 + 288) % 16;
        Random var14 = new Random();

        int var15;
        int var16;
        int var17;
        for(var15 = 0; var15 * 16 - var13 < 155; ++var15) {
            float var18 = 0.6F - (float)(var11 + var15) / 25.0F * 0.3F;
            GL11.glColor4f(var18, var18, var18, 1.0F);

            for(var16 = 0; var16 * 16 - var12 < 224; ++var16) {
                var14.setSeed((long)(1234 + var10 + var16));
                var14.nextInt();
                var17 = var14.nextInt(1 + var11 + var15) + (var11 + var15) / 2;
                gDn var19 = zKP.field_5ced441_IjH.method_9051f17a_Dne(0, 0);
                if (var17 <= 37 && var11 + var15 != 35) {
                    if (var17 == 22) {
                        if (var14.nextInt(2) == 0) {
                            var19 = zKP.field_5fd56c22_ZgS.method_9051f17a_Dne(0, 0);
                        } else {
                            var19 = zKP.field_390036e3_JLG.method_9051f17a_Dne(0, 0);
                        }
                    } else if (var17 == 10) {
                        var19 = zKP.field_61781f15_Zpi.method_9051f17a_Dne(0, 0);
                    } else if (var17 == 8) {
                        var19 = zKP.field_a22e9c55_kGO.method_9051f17a_Dne(0, 0);
                    } else if (var17 > 4) {
                        var19 = zKP.field_37e6aed_Dne.method_9051f17a_Dne(0, 0);
                    } else if (var17 > 0) {
                        var19 = zKP.field_203836cc_FWm.method_9051f17a_Dne(0, 0);
                    }
                } else {
                    var19 = zKP.field_f0b029e5_zGp.method_9051f17a_Dne(0, 0);
                }

                this.method_f35902f6_Dne(var8 + var16 * 16 - var12, var9 + var15 * 16 - var13, var19, 16, 16);
            }
        }

        GL11.glEnable(2929);
        GL11.glDepthFunc(515);
        GL11.glDisable(3553);

        int var20;
        auk_0 var21;
        int var24;
        int var28;
        int var29;
        for(var15 = 0; var15 < qlg.field_f27c122c_Dne.size(); ++var15) {
            var21 = (auk_0)qlg.field_f27c122c_Dne.get(var15);
            if (var21.field_36522b5_Dne != null) {
                var16 = var21.field_2092ae_Dne * 24 - var4 + 11 + var8;
                var17 = var21.field_21260d_FWm * 24 - var5 + 11 + var9;
                var20 = var21.field_36522b5_Dne.field_2092ae_Dne * 24 - var4 + 11 + var8;
                var28 = var21.field_36522b5_Dne.field_21260d_FWm * 24 - var5 + 11 + var9;
                boolean var22 = this.field_3673fc1_Dne.method_6863c0f4_Dne(var21);
                boolean var23 = this.field_3673fc1_Dne.method_41b774b5_FWm(var21);
                var29 = Math.sin((double)(Minecraft.method_7a46288e_Dne() % 600L) / 600.0D * 3.141592653589793D * 2.0D) > 0.6D ? 255 : 130;
                var24 = -16777216;
                if (var22) {
                    var24 = -9408400;
                } else if (var23) {
                    var24 = '＀' + (var29 << 24);
                }

                this.method_5972745a_Dne(var16, var20, var17, var24);
                this.method_2ee8c479_FWm(var20, var17, var28, var24);
            }
        }

        var21 = null;
        eKj var30 = new eKj();
        Cit.method_ae128dc7_bzF();
        GL11.glDisable(2896);
        GL11.glEnable(32826);
        GL11.glEnable(2903);

        int var31;
        for(var16 = 0; var16 < qlg.field_f27c122c_Dne.size(); ++var16) {
            auk_0 var25 = (auk_0)qlg.field_f27c122c_Dne.get(var16);
            var20 = var25.field_2092ae_Dne * 24 - var4;
            var28 = var25.field_21260d_FWm * 24 - var5;
            if (var20 >= -24 && var28 >= -24 && var20 <= 224 && var28 <= 155) {
                float var26;
                if (this.field_3673fc1_Dne.method_6863c0f4_Dne(var25)) {
                    var26 = 1.0F;
                    GL11.glColor4f(var26, var26, var26, 1.0F);
                } else if (this.field_3673fc1_Dne.method_41b774b5_FWm(var25)) {
                    var26 = Math.sin((double)(Minecraft.method_7a46288e_Dne() % 600L) / 600.0D * 3.141592653589793D * 2.0D) < 0.6D ? 0.6F : 0.8F;
                    GL11.glColor4f(var26, var26, var26, 1.0F);
                } else {
                    var26 = 0.3F;
                    GL11.glColor4f(var26, var26, var26, 1.0F);
                }

                this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/achievement/bg.png");
                var31 = var8 + var20;
                var24 = var9 + var28;
                if (var25.method_7c6f603d_FWm()) {
                    this.method_17d7ea99_FWm(var31 - 2, var24 - 2, 26, 202, 26, 26);
                } else {
                    this.method_17d7ea99_FWm(var31 - 2, var24 - 2, 0, 202, 26, 26);
                }

                if (!this.field_3673fc1_Dne.method_41b774b5_FWm(var25)) {
                    float var27 = 0.1F;
                    GL11.glColor4f(var27, var27, var27, 1.0F);
                    var30.field_2092bf_Dne = false;
                }

                GL11.glEnable(2896);
                GL11.glEnable(2884);
                var30.method_5ae7aca8_FWm(this.field_493682ed_Dne.field_3791671_Dne, this.field_493682ed_Dne.field_36d36bf_Dne, var25.field_36a761a_Dne, var31 + 3, var24 + 3);
                GL11.glDisable(2896);
                if (!this.field_3673fc1_Dne.method_41b774b5_FWm(var25)) {
                    var30.field_2092bf_Dne = true;
                }

                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                if (var1 >= var8 && var2 >= var9 && var1 < var8 + 224 && var2 < var9 + 155 && var1 >= var31 && var1 <= var31 + 22 && var2 >= var24 && var2 <= var24 + 22) {
                    var21 = var25;
                }
            }
        }

        GL11.glDisable(2929);
        GL11.glEnable(3042);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/achievement/bg.png");
        this.method_17d7ea99_FWm(var6, var7, 0, 0, this.field_2092ae_Dne, this.field_267cf5_Qnq);
        GL11.glPopMatrix();
        this.field_21260a_FWm = 0.0F;
        GL11.glDepthFunc(515);
        GL11.glDisable(2929);
        GL11.glEnable(3553);
        super.method_2c2cec86_Dne(var1, var2, var3);
        if (var21 != null) {
            String var32 = KGL.method_39193c_Dne(var21.method_d1f1ed87_FWm());
            String var33 = var21.method_eecad346_Dne();
            var20 = var1 + 12;
            var28 = var2 - 4;
            if (this.field_3673fc1_Dne.method_41b774b5_FWm(var21)) {
                var31 = Math.max(this.field_3791671_Dne.method_8f501fd7_Dne(var32), 120);
                var24 = this.field_3791671_Dne.method_5ab44f92_Dne(var33, var31);
                if (this.field_3673fc1_Dne.method_6863c0f4_Dne(var21)) {
                    var24 += 12;
                }

                this.method_c6b5263a_Dne(var20 - 3, var28 - 3, var20 + var31 + 3, var28 + var24 + 3 + 12, -1073741824, -1073741824);
                this.field_3791671_Dne.method_5ebbb6a4_Dne(var33, var20, var28 + 12, var31, -6250336);
                if (this.field_3673fc1_Dne.method_6863c0f4_Dne(var21)) {
                    this.field_3791671_Dne.method_7eed4432_Dne(KGL.method_39193c_Dne("achievement.taken"), var20, var28 + var24 + 4, -7302913);
                }
            } else {
                var31 = Math.max(this.field_3791671_Dne.method_8f501fd7_Dne(var32), 120);
                String var34 = KGL.method_98148f73_Dne("achievement.requires", KGL.method_39193c_Dne(var21.field_36522b5_Dne.method_d1f1ed87_FWm()));
                var29 = this.field_3791671_Dne.method_5ab44f92_Dne(var34, var31);
                this.method_c6b5263a_Dne(var20 - 3, var28 - 3, var20 + var31 + 3, var28 + var29 + 12 + 3, -1073741824, -1073741824);
                this.field_3791671_Dne.method_5ebbb6a4_Dne(var34, var20, var28 + 12, var31, -9416624);
            }

            this.field_3791671_Dne.method_7eed4432_Dne(var32, var20, var28, this.field_3673fc1_Dne.method_41b774b5_FWm(var21) ? (var21.method_7c6f603d_FWm() ? -128 : -1) : (var21.method_7c6f603d_FWm() ? -8355776 : -8355712));
        }

        GL11.glEnable(2929);
        GL11.glEnable(2896);
        Cit.method_7a46289a_Dne();
    }

    @Override
    public void method_ae128dc7_bzF() {
        this.field_2092a9_Dne = this.field_2e5f16_bzF;
        this.field_212608_FWm = this.field_267cf0_Qnq;
        double d = this.field_2d29ef_aFZ - this.field_2e5f16_bzF;
        double d2 = this.field_388da1_zGp - this.field_267cf0_Qnq;
        if (d * d + d2 * d2 < 4.0) {
            this.field_2e5f16_bzF += d;
            this.field_267cf0_Qnq += d2;
        } else {
            this.field_2e5f16_bzF += d * 0.85;
            this.field_267cf0_Qnq += d2 * 0.85;
        }
    }

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        if (Mouse.isButtonDown(0)) {
            int n3 = (this.field_21260d_FWm - this.field_2092ae_Dne) / 2;
            int n4 = (this.field_2e5f1b_bzF - this.field_267cf5_Qnq) / 2;
            int n5 = n3 + 8;
            int n6 = n4 + 17;
            if ((this.field_29186d_XHL == 0 || this.field_29186d_XHL == 1) && n >= n5 && n < n5 + 224 && n2 >= n6 && n2 < n6 + 155) {
                if (this.field_29186d_XHL == 0) {
                    this.field_29186d_XHL = 1;
                } else {
                    this.field_2e5f16_bzF -= (double)(n - this.field_2d29f4_aFZ);
                    this.field_267cf0_Qnq -= (double)(n2 - this.field_388da6_zGp);
                    this.field_2d29ef_aFZ = this.field_2092a9_Dne = this.field_2e5f16_bzF;
                    this.field_388da1_zGp = this.field_212608_FWm = this.field_267cf0_Qnq;
                }
                this.field_2d29f4_aFZ = n;
                this.field_388da6_zGp = n2;
            }
            if (this.field_2d29ef_aFZ < (double)field_20b857_DyG) {
                this.field_2d29ef_aFZ = field_20b857_DyG;
            }
            if (this.field_388da1_zGp < (double)field_2f0dd8_div) {
                this.field_388da1_zGp = field_2f0dd8_div;
            }
            if (this.field_2d29ef_aFZ >= (double)field_22c602_IjH) {
                this.field_2d29ef_aFZ = field_22c602_IjH - 1;
            }
            if (this.field_388da1_zGp >= (double)field_33448c_mrb) {
                this.field_388da1_zGp = field_33448c_mrb - 1;
            }
        } else {
            this.field_29186d_XHL = 0;
        }
        this.method_a98a0660_aFZ();
        this.method_a6ac9c87_FWm(n, n2, f);
        GL11.glDisable(2896);
        GL11.glDisable(2929);
        this.method_d44b4592_zGp();
        GL11.glEnable(2896);
        GL11.glEnable(2929);
    }

    @Override
    protected void method_81183ff7_Dne(pee_0 pee_02) {
        if (pee_02.field_2d29f4_aFZ == 1) {
            this.field_493682ed_Dne.method_b88fcbd2_Dne(null);
            this.field_493682ed_Dne.method_a98a0660_aFZ();
        }
        super.method_81183ff7_Dne(pee_02);
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_f27c122c_Dne.clear();
        this.field_f27c122c_Dne.add(new Cpw(1, this.field_21260d_FWm / 2 + 24, this.field_2e5f1b_bzF / 2 + 74, 80, 20, KGL.method_39193c_Dne("gui.done")));
    }

    @Override
    protected void method_16a1040_Dne(char c, int n) {
        if (n == this.field_493682ed_Dne.field_3758af7_Dne.field_f0ae5e96_zGp.field_2092ae_Dne) {
            this.field_493682ed_Dne.method_b88fcbd2_Dne(null);
            this.field_493682ed_Dne.method_a98a0660_aFZ();
        } else {
            super.method_16a1040_Dne(c, n);
        }
    }

    static {
        field_20b857_DyG = qlg.field_2092ae_Dne * 24 - 112;
        field_2f0dd8_div = qlg.field_21260d_FWm * 24 - 112;
        field_22c602_IjH = qlg.field_2e5f1b_bzF * 24 - 77;
        field_33448c_mrb = qlg.field_267cf5_Qnq * 24 - 77;
    }
}

