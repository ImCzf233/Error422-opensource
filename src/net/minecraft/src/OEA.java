package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.awt.image.BufferedImage;
import java.nio.FloatBuffer;
import java.util.List;
import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.glu.GLU;

public class OEA {
    private float field_22c5ff_IjH = 4.0f;
    public int field_21260d_FWm;
    private lSM field_5e619a2d_Qnq;
    private float field_307844_gnI;
    private float field_215b33_FfS = 0.0f;
    private float field_36b0a6_udO = 0.0f;
    private float field_2f0dd5_div = 0.0f;
    float field_388da3_zGp;
    private lSM field_f0a9ea5e_zGp;
    private float field_1ed014_ATE;
    private lSM field_713bafac_aFZ;
    public static int field_2092ae_Dne;
    public XyI field_36fa224_Dne;
    float[] field_4039e07_FWm;
    private long field_2092af_Dne;
    private long field_21260e_FWm = 0L;
    private float field_31b813_kGO = 0.0f;
    volatile int field_2e5f1b_bzF = 0;
    private float field_217c23_Fnk;
    private boolean field_2e5f2c_bzF = false;
    private sMa field_37b45e5_Dne = null;
    private float field_26818c_RPx;
    private float field_2a9ad3_Zpi = 0.0f;
    float field_267cf2_Qnq = 0.0f;
    private float field_367151_trS;
    float field_21260a_FWm = 0.0f;
    private float field_212c18_EyB = 0.0f;
    private float field_3393da_oIf;
    private Random field_7331eae7_Dne;
    volatile int field_267cf5_Qnq = 0;
    private boolean field_21261e_FWm = false;
    private lSM field_3782b66_Dne = new lSM();
    private float field_2e8483_ceE = 0.0f;
    private int[] field_3f1c589_Dne;
    private float field_29186a_XHL = 0.0f;
    private int field_20b857_DyG = 0;
    public int field_2d29f4_aFZ;
    public static boolean field_2092bf_Dne;
    float field_20b854_DyG;
    private lSM field_2031f745_FWm = new lSM();
    float field_2d29f1_aFZ;
    private int field_388da6_zGp;
    private float field_3649f6_tgc;
    private float field_36e4d7_vSL;
    private float field_34856f_qLR;
    float field_2092ab_Dne = 0.0f;
    private float field_342261_ooe;
    FloatBuffer field_b5fd3c76_Dne;
    private double field_2092a9_Dne = 1.0;
    private double field_212608_FWm = 0.0;
    float[] field_3f1c586_Dne;
    private float field_34b5fe_qXo;
    private Minecraft field_493682ed_Dne;
    float field_2e5f18_bzF = 0.0f;
    private lSM field_75bff953_bzF = new lSM();
    private float field_28e7fa_Vxn;
    private float field_334489_mrb = 4.0f;
    private float field_2569d2_OdI = 0.0f;
    private double field_2e5f16_bzF = 0.0;

    protected void method_143f92d9_bzF(float f) {
        float f2 = this.field_493682ed_Dne.field_36ebf36_Dne.method_b51dd45e_zGp(f);
        if (f2 > 0.0f) {
            this.method_117d0725_FWm(f);
            if (this.field_3f1c586_Dne == null) {
                this.field_3f1c586_Dne = new float[1024];
                this.field_4039e07_FWm = new float[1024];
                for (int i = 0; i < 32; ++i) {
                    for (int j = 0; j < 32; ++j) {
                        float f3 = j - 16;
                        float f4 = i - 16;
                        float f5 = geR.method_143f92c9_bzF(f3 * f3 + f4 * f4);
                        this.field_3f1c586_Dne[i << 5 | j] = -f4 / f5;
                        this.field_4039e07_FWm[i << 5 | j] = f3 / f5;
                    }
                }
            }
            FUH fUH = this.field_493682ed_Dne.field_366ec33_Dne;
            VzZ vzZ = this.field_493682ed_Dne.field_36ebf36_Dne;
            int n = geR.method_117d0718_FWm(fUH.field_2f0dd3_div);
            int n2 = geR.method_117d0718_FWm(fUH.field_22c5fd_IjH);
            int n3 = geR.method_117d0718_FWm(fUH.field_334487_mrb);
            WAR wAR = WAR.field_36e5ca4_Dne;
            GL11.glDisable(2884);
            GL11.glNormal3f(0.0f, 1.0f, 0.0f);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            GL11.glAlphaFunc(516, 0.01f);
            this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/environment/snow.png");
            double d = fUH.field_36b0a4_udO + (fUH.field_2f0dd3_div - fUH.field_36b0a4_udO) * (double)f;
            double d2 = fUH.field_34225f_ooe + (fUH.field_22c5fd_IjH - fUH.field_34225f_ooe) * (double)f;
            double d3 = fUH.field_36714f_trS + (fUH.field_334487_mrb - fUH.field_36714f_trS) * (double)f;
            int n4 = geR.method_117d0718_FWm(d2);
            int n5 = 5;
            if (this.field_493682ed_Dne.field_3758af7_Dne.field_2d2a05_aFZ) {
                n5 = 10;
            }
            boolean bl = false;
            int n6 = -1;
            float f6 = (float)this.field_388da6_zGp + f;
            if (this.field_493682ed_Dne.field_3758af7_Dne.field_2d2a05_aFZ) {
                n5 = 10;
            }
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            bl = false;
            for (int i = n3 - n5; i <= n3 + n5; ++i) {
                for (int j = n - n5; j <= n + n5; ++j) {
                    double d4;
                    float f7;
                    int n7 = (i - n3 + 16) * 32 + j - n + 16;
                    float f8 = this.field_3f1c586_Dne[n7] * 0.5f;
                    float f9 = this.field_4039e07_FWm[n7] * 0.5f;
                    OdI odI = vzZ.method_90477c37_Dne(j, i);
                    if (!odI.method_7c6f603d_FWm() && !odI.method_7a46289e_Dne()) continue;
                    int n8 = vzZ.method_5c563934_Qnq(j, i);
                    int n9 = n2 - n5;
                    int n10 = n2 + n5;
                    if (n9 < n8) {
                        n9 = n8;
                    }
                    if (n10 < n8) {
                        n10 = n8;
                    }
                    float f10 = 1.0f;
                    int n11 = n8;
                    if (n8 < n4) {
                        n11 = n4;
                    }
                    if (n9 == n10) continue;
                    this.field_7331eae7_Dne.setSeed(j * j * 3121 + j * 45238971 ^ i * i * 418711 + i * 13761);
                    float f11 = odI.method_ae128db7_bzF();
                    if (vzZ.method_2315aa7b_Dne().method_16b6d4d_Dne(f11, n8) >= 0.15f) {
                        if (n6 != 0) {
                            if (n6 >= 0) {
                                wAR.method_7a46288d_Dne();
                            }
                            n6 = 0;
                            this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/environment/rain.png");
                            wAR.method_7a46289a_Dne();
                        }
                        f7 = ((float)(this.field_388da6_zGp + j * j * 3121 + j * 45238971 + i * i * 418711 + i * 13761 & 0x1F) + f) / 32.0f * (3.0f + this.field_7331eae7_Dne.nextFloat());
                        double d5 = (double)((float)j + 0.5f) - fUH.field_2f0dd3_div;
                        d4 = (double)((float)i + 0.5f) - fUH.field_334487_mrb;
                        float f12 = geR.method_ce7f4ad4_Dne(d5 * d5 + d4 * d4) / (float)n5;
                        float f13 = 1.0f;
                        wAR.method_117d19ea_FWm(vzZ.method_5972744d_Dne(j, n11, i, 0));
                        wAR.method_54283b9a_Dne(f13, f13, f13, ((1.0f - f12 * f12) * 0.5f + 0.5f) * f2);
                        wAR.method_a663d9a5_FWm(-d * 1.0, -d2 * 1.0, -d3 * 1.0);
                        wAR.method_c38c5864_Dne((double)((float)j - f8) + 0.5, n9, (double)((float)i - f9) + 0.5, 0.0f * f10, (float)n9 * f10 / 4.0f + f7 * f10);
                        wAR.method_c38c5864_Dne((double)((float)j + f8) + 0.5, n9, (double)((float)i + f9) + 0.5, 1.0f * f10, (float)n9 * f10 / 4.0f + f7 * f10);
                        wAR.method_c38c5864_Dne((double)((float)j + f8) + 0.5, n10, (double)((float)i + f9) + 0.5, 1.0f * f10, (float)n10 * f10 / 4.0f + f7 * f10);
                        wAR.method_c38c5864_Dne((double)((float)j - f8) + 0.5, n10, (double)((float)i - f9) + 0.5, 0.0f * f10, (float)n10 * f10 / 4.0f + f7 * f10);
                        wAR.method_a663d9a5_FWm(0.0, 0.0, 0.0);
                        continue;
                    }
                    if (n6 != 1) {
                        if (n6 >= 0) {
                            wAR.method_7a46288d_Dne();
                        }
                        n6 = 1;
                        this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/environment/snow.png");
                        wAR.method_7a46289a_Dne();
                    }
                    f7 = ((float)(this.field_388da6_zGp & 0x1FF) + f) / 512.0f;
                    float f14 = this.field_7331eae7_Dne.nextFloat() + f6 * 0.01f * (float)this.field_7331eae7_Dne.nextGaussian();
                    float f15 = this.field_7331eae7_Dne.nextFloat() + f6 * (float)this.field_7331eae7_Dne.nextGaussian() * 0.001f;
                    d4 = (double)((float)j + 0.5f) - fUH.field_2f0dd3_div;
                    double d6 = (double)((float)i + 0.5f) - fUH.field_334487_mrb;
                    float f16 = geR.method_ce7f4ad4_Dne(d4 * d4 + d6 * d6) / (float)n5;
                    float f17 = 1.0f;
                    wAR.method_117d19ea_FWm((vzZ.method_5972744d_Dne(j, n11, i, 0) * 3 + 0xF000F0) / 4);
                    wAR.method_54283b9a_Dne(f17, f17, f17, ((1.0f - f16 * f16) * 0.3f + 0.5f) * f2);
                    wAR.method_a663d9a5_FWm(-d * 1.0, -d2 * 1.0, -d3 * 1.0);
                    wAR.method_c38c5864_Dne((double)((float)j - f8) + 0.5, n9, (double)((float)i - f9) + 0.5, 0.0f * f10 + f14, (float)n9 * f10 / 4.0f + f7 * f10 + f15);
                    wAR.method_c38c5864_Dne((double)((float)j + f8) + 0.5, n9, (double)((float)i + f9) + 0.5, 1.0f * f10 + f14, (float)n9 * f10 / 4.0f + f7 * f10 + f15);
                    wAR.method_c38c5864_Dne((double)((float)j + f8) + 0.5, n10, (double)((float)i + f9) + 0.5, 1.0f * f10 + f14, (float)n10 * f10 / 4.0f + f7 * f10 + f15);
                    wAR.method_c38c5864_Dne((double)((float)j - f8) + 0.5, n10, (double)((float)i - f9) + 0.5, 0.0f * f10 + f14, (float)n10 * f10 / 4.0f + f7 * f10 + f15);
                    wAR.method_a663d9a5_FWm(0.0, 0.0, 0.0);
                }
            }
            if (n6 >= 0) {
                wAR.method_7a46288d_Dne();
            }
            GL11.glEnable(2884);
            GL11.glDisable(3042);
            GL11.glAlphaFunc(516, 0.1f);
            this.method_ce7f4ae4_Dne(f);
        }
    }

    public void method_117d0ea7_FWm(float f) {
        int n;
        this.field_493682ed_Dne.field_365731d_Dne.method_8f501fe4_Dne("lightTex");
        if (this.field_2e5f2c_bzF) {
            this.method_df9de01d_DyG(f);
        }
        this.field_493682ed_Dne.field_365731d_Dne.method_7c6f6039_FWm();
        boolean bl = Display.isActive();
        if (!(bl || !this.field_493682ed_Dne.field_3758af7_Dne.field_367165_trS || this.field_493682ed_Dne.field_3758af7_Dne.field_1ed028_ATE && Mouse.isButtonDown(1))) {
            if (Minecraft.method_7a46288e_Dne() - this.field_2092af_Dne > 500L) {
                this.field_493682ed_Dne.method_7ad38803_DyG();
            }
        } else {
            this.field_2092af_Dne = Minecraft.method_7a46288e_Dne();
        }
        this.field_493682ed_Dne.field_365731d_Dne.method_8f501fe4_Dne("mouse");
        if (this.field_493682ed_Dne.field_388db7_zGp && bl) {
            this.field_493682ed_Dne.field_3693f03_Dne.method_ae128dc7_bzF();
            float f2 = this.field_493682ed_Dne.field_3758af7_Dne.field_2e5f18_bzF * 0.6f + 0.2f;
            float f3 = f2 * f2 * f2 * 8.0f;
            float f4 = (float)this.field_493682ed_Dne.field_3693f03_Dne.field_2092ae_Dne * f3;
            float f5 = (float)this.field_493682ed_Dne.field_3693f03_Dne.field_21260d_FWm * f3;
            n = 1;
            if (this.field_493682ed_Dne.field_3758af7_Dne.field_2092bf_Dne) {
                n = -1;
            }
            if (this.field_493682ed_Dne.field_3758af7_Dne.field_3393ee_oIf) {
                this.field_342261_ooe += f4;
                this.field_367151_trS += f5;
                float f6 = f - this.field_28e7fa_Vxn;
                this.field_28e7fa_Vxn = f;
                f4 = this.field_34856f_qLR * f6;
                f5 = this.field_1ed014_ATE * f6;
                this.field_493682ed_Dne.field_369f6b6_Dne.method_73b33007_bzF(f4, f5 * (float)n);
            } else {
                this.field_493682ed_Dne.field_369f6b6_Dne.method_73b33007_bzF(f4, f5 * (float)n);
            }
        }
        this.field_493682ed_Dne.field_365731d_Dne.method_7c6f6039_FWm();
        if (!this.field_493682ed_Dne.field_267d06_Qnq) {
            field_2092bf_Dne = this.field_493682ed_Dne.field_3758af7_Dne.field_2e5f2c_bzF;
            IJm iJm = new IJm(this.field_493682ed_Dne.field_3758af7_Dne, this.field_493682ed_Dne.field_2092ae_Dne, this.field_493682ed_Dne.field_21260d_FWm);
            int n2 = iJm.method_7a46288d_Dne();
            int n3 = iJm.method_7c6f602c_FWm();
            int n4 = Mouse.getX() * n2 / this.field_493682ed_Dne.field_2092ae_Dne;
            n = n3 - Mouse.getY() * n3 / this.field_493682ed_Dne.field_21260d_FWm - 1;
            int n5 = OEA.method_ce7f5d9c_Dne(this.field_493682ed_Dne.field_3758af7_Dne.field_21260d_FWm);
            if (this.field_493682ed_Dne.field_36ebf36_Dne != null) {
                this.field_493682ed_Dne.field_365731d_Dne.method_8f501fe4_Dne("level");
                if (this.field_493682ed_Dne.field_3758af7_Dne.field_21260d_FWm == 0) {
                    this.method_16b711e_Dne(f, 0L);
                } else {
                    this.method_16b711e_Dne(f, this.field_21260e_FWm + (long)(1000000000 / n5));
                }
                this.field_21260e_FWm = System.nanoTime();
                this.field_493682ed_Dne.field_365731d_Dne.method_110c4dc3_FWm("gui");
                if (!this.field_493682ed_Dne.field_3758af7_Dne.field_2e8497_ceE || this.field_493682ed_Dne.field_37a7e17_Dne != null) {
                    this.field_493682ed_Dne.field_3733694_Dne.method_55437a0e_Dne(f, this.field_493682ed_Dne.field_37a7e17_Dne != null, n4, n);
                }
                this.field_493682ed_Dne.field_365731d_Dne.method_7c6f6039_FWm();
            } else {
                GL11.glViewport(0, 0, this.field_493682ed_Dne.field_2092ae_Dne, this.field_493682ed_Dne.field_21260d_FWm);
                GL11.glMatrixMode(5889);
                GL11.glLoadIdentity();
                GL11.glMatrixMode(5888);
                GL11.glLoadIdentity();
                this.method_7c6f6039_FWm();
                this.field_21260e_FWm = System.nanoTime();
            }
            if (this.field_493682ed_Dne.field_369f6b6_Dne != null) {
                mKT cfr_ignored_0 = this.field_493682ed_Dne.field_3788296_Dne;
                if (mKT.field_a378b605_Dne != null) {
                    mKT cfr_ignored_1 = this.field_493682ed_Dne.field_3788296_Dne;
                    if (mKT.field_a378b605_Dne.getVolume("noise") != this.field_493682ed_Dne.field_3758af7_Dne.field_2092ab_Dne) {
                        mKT cfr_ignored_2 = this.field_493682ed_Dne.field_3788296_Dne;
                        mKT.field_a378b605_Dne.setVolume("noise", this.field_493682ed_Dne.field_3758af7_Dne.field_2092ab_Dne);
                    }
                    mKT cfr_ignored_3 = this.field_493682ed_Dne.field_3788296_Dne;
                    if (mKT.field_a378b605_Dne.playing("bgtheme")) {
                        mKT cfr_ignored_4 = this.field_493682ed_Dne.field_3788296_Dne;
                        mKT.field_a378b605_Dne.stop("bgtheme");
                    }
                    mKT cfr_ignored_5 = this.field_493682ed_Dne.field_3788296_Dne;
                    if (!mKT.field_a378b605_Dne.playing("noise")) {
                        mKT cfr_ignored_6 = this.field_493682ed_Dne.field_3788296_Dne;
                        mKT.field_a378b605_Dne.play("noise");
                    }
                }
            }
            if (this.field_493682ed_Dne.field_37a7e17_Dne != null) {
                GL11.glClear(256);
                try {
                    try {
                        mKT cfr_ignored_7 = this.field_493682ed_Dne.field_3788296_Dne;
                        if (!mKT.field_a378b605_Dne.playing("bgtheme") && this.field_493682ed_Dne.field_369f6b6_Dne == null) {
                            mKT cfr_ignored_8 = this.field_493682ed_Dne.field_3788296_Dne;
                            mKT.field_a378b605_Dne.play("bgtheme");
                            mKT cfr_ignored_9 = this.field_493682ed_Dne.field_3788296_Dne;
                            if (mKT.field_a378b605_Dne.playing("noise")) {
                                mKT cfr_ignored_10 = this.field_493682ed_Dne.field_3788296_Dne;
                                mKT.field_a378b605_Dne.stop("noise");
                            }
                        } else if (this.field_493682ed_Dne.field_369f6b6_Dne == null) {
                            mKT cfr_ignored_11 = this.field_493682ed_Dne.field_3788296_Dne;
                            if (mKT.field_a378b605_Dne.playing("noise")) {
                                mKT cfr_ignored_12 = this.field_493682ed_Dne.field_3788296_Dne;
                                mKT.field_a378b605_Dne.stop("noise");
                            }
                            mKT cfr_ignored_13 = this.field_493682ed_Dne.field_3788296_Dne;
                            if (mKT.field_a378b605_Dne.playing("noise1")) {
                                mKT cfr_ignored_14 = this.field_493682ed_Dne.field_3788296_Dne;
                                mKT.field_a378b605_Dne.stop("noise1");
                            }
                        }
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    this.field_493682ed_Dne.field_37a7e17_Dne.method_2c2cec86_Dne(n4, n, f);
                }
                catch (Throwable throwable) {
                    this.field_493682ed_Dne.field_37a7e17_Dne.method_2c2cec86_Dne(n4, n, f);
                    McM mcM = McM.method_948e60df_Dne(throwable, "Rendering screen");
                    Noo noo = mcM.method_284dc627_Dne("Screen render details");
                    noo.method_2aeeb7ad_Dne("Screen name", new Fch(this));
                    noo.method_2aeeb7ad_Dne("Mouse location", new FTG(this, n4, n));
                    noo.method_2aeeb7ad_Dne("Screen size", new jYd(this, iJm));
                    throw new kaJ(mcM);
                }
                if (this.field_493682ed_Dne.field_37a7e17_Dne != null && this.field_493682ed_Dne.field_37a7e17_Dne.field_3780a57_Dne != null) {
                    this.field_493682ed_Dne.field_37a7e17_Dne.field_3780a57_Dne.method_ce7f5266_Dne(f);
                }
            }
        }
    }

    private void method_df9de01d_DyG(float f) {
        VzZ vzZ = this.field_493682ed_Dne.field_36ebf36_Dne;
        if (vzZ != null) {
            for (int i = 0; i < 256; ++i) {
                float f2;
                float f3;
                float f4 = vzZ.method_ce7f5256_Dne(1.0f) * 0.95f + 0.05f;
                float f5 = vzZ.field_3690d00_Dne.field_3f1c586_Dne[i / 16] * f4;
                float f6 = vzZ.field_3690d00_Dne.field_3f1c586_Dne[i % 16] * (this.field_2092ab_Dne * 0.1f + 1.5f);
                if (vzZ.field_267cf5_Qnq > 0) {
                    f5 = vzZ.field_3690d00_Dne.field_3f1c586_Dne[i / 16];
                }
                float f7 = f5 * (vzZ.method_ce7f5256_Dne(1.0f) * 0.65f + 0.35f);
                float f8 = f5 * (vzZ.method_ce7f5256_Dne(1.0f) * 0.65f + 0.35f);
                float f9 = f6 * ((f6 * 0.6f + 0.4f) * 0.6f + 0.4f);
                float f10 = f6 * (f6 * f6 * 0.6f + 0.4f);
                float f11 = f7 + f6;
                float f12 = f8 + f9;
                float f13 = f5 + f10;
                f11 = f11 * 0.96f + 0.03f;
                f12 = f12 * 0.96f + 0.03f;
                f13 = f13 * 0.96f + 0.03f;
                if (this.field_217c23_Fnk > 0.0f) {
                    f3 = this.field_307844_gnI + (this.field_217c23_Fnk - this.field_307844_gnI) * f;
                    f11 = f11 * (1.0f - f3) + f11 * 0.7f * f3;
                    f12 = f12 * (1.0f - f3) + f12 * 0.6f * f3;
                    f13 = f13 * (1.0f - f3) + f13 * 0.6f * f3;
                }
                if (vzZ.field_3690d00_Dne.field_2092ae_Dne == 1) {
                    f11 = 0.22f + f6 * 0.75f;
                    f12 = 0.28f + f9 * 0.75f;
                    f13 = 0.25f + f10 * 0.75f;
                }
                if (this.field_493682ed_Dne.field_369f6b6_Dne.method_857f23ec_Dne(SXd.field_1f01d471_qLR)) {
                    f3 = this.method_961e776d_Dne(this.field_493682ed_Dne.field_369f6b6_Dne, f);
                    f2 = 1.0f / f11;
                    if (f2 > 1.0f / f12) {
                        f2 = 1.0f / f12;
                    }
                    if (f2 > 1.0f / f13) {
                        f2 = 1.0f / f13;
                    }
                    f11 = f11 * (1.0f - f3) + f11 * f2 * f3;
                    f12 = f12 * (1.0f - f3) + f12 * f2 * f3;
                    f13 = f13 * (1.0f - f3) + f13 * f2 * f3;
                }
                if (f11 > 1.0f) {
                    f11 = 1.0f;
                }
                if (f12 > 1.0f) {
                    f12 = 1.0f;
                }
                if (f13 > 1.0f) {
                    f13 = 1.0f;
                }
                f3 = this.field_493682ed_Dne.field_3758af7_Dne.field_2a9ad3_Zpi;
                f2 = 1.0f - f11;
                float f14 = 1.0f - f12;
                float f15 = 1.0f - f13;
                f2 = 1.0f - f2 * f2 * f2 * f2;
                f14 = 1.0f - f14 * f14 * f14 * f14;
                f15 = 1.0f - f15 * f15 * f15 * f15;
                f11 = f11 * (1.0f - f3) + f2 * f3;
                f12 = f12 * (1.0f - f3) + f14 * f3;
                f13 = f13 * (1.0f - f3) + f15 * f3;
                f11 = f11 * 0.96f + 0.03f;
                f12 = f12 * 0.96f + 0.03f;
                f13 = f13 * 0.96f + 0.03f;
                if (f11 > 1.0f) {
                    f11 = 1.0f;
                }
                if (f12 > 1.0f) {
                    f12 = 1.0f;
                }
                if (f13 > 1.0f) {
                    f13 = 1.0f;
                }
                if (f11 < 0.0f) {
                    f11 = 0.0f;
                }
                if (f12 < 0.0f) {
                    f12 = 0.0f;
                }
                if (f13 < 0.0f) {
                    f13 = 0.0f;
                }
                int n = 255;
                int n2 = (int)(f11 * 255.0f);
                int n3 = (int)(f12 * 255.0f);
                int n4 = (int)(f13 * 255.0f);
                this.field_3f1c589_Dne[i] = n << 24 | n2 << 16 | n3 << 8 | n4;
            }
            this.field_493682ed_Dne.field_36d36bf_Dne.method_8d0cb47b_Dne(this.field_3f1c589_Dne, 16, 16, this.field_21260d_FWm);
        }
    }

    static Minecraft method_ddce57ac_Dne(OEA oEA) {
        return oEA.field_493682ed_Dne;
    }

    private float method_16bad1e_Dne(float f, boolean bl) {
        int n;
        if (this.field_2d29f4_aFZ > 0) {
            return 90.0f;
        }
        FiG fiG = (FiG)this.field_493682ed_Dne.field_366ec33_Dne;
        float f2 = 70.0f;
        if (bl) {
            f2 += this.field_493682ed_Dne.field_3758af7_Dne.field_29186a_XHL * 40.0f;
            f2 *= this.field_36e4d7_vSL + (this.field_3393da_oIf - this.field_36e4d7_vSL) * f;
        }
        if (fiG.method_9a443a8c_XHL() <= 0) {
            float f3 = (float)fiG.field_36e4da_vSL + f;
            f2 /= (1.0f - 500.0f / (f3 + 500.0f)) * 2.0f + 1.0f;
        }
        if ((n = lqj.method_33813bbe_Dne(this.field_493682ed_Dne.field_36ebf36_Dne, fiG, f)) != 0 && zKP.field_8374b848_Dne[n].field_368fd23_Dne == KFd.field_1411d34d_div) {
            f2 = f2 * 60.0f / 70.0f;
        }
        return f2 + this.field_212c18_EyB + (this.field_2e8483_ceE - this.field_212c18_EyB) * f;
    }

    private void method_16b6d5d_Dne(float f, int n) {
        int n2;
        float f2;
        this.field_2f0dd5_div = 256 >> this.field_493682ed_Dne.field_3758af7_Dne.field_2092ae_Dne;
        GL11.glMatrixMode(5889);
        GL11.glLoadIdentity();
        float f3 = 0.07f;
        if (this.field_493682ed_Dne.field_3758af7_Dne.field_2e5f2c_bzF) {
            GL11.glTranslatef((float)(-(n * 2 - 1)) * f3, 0.0f, 0.0f);
        }
        if (this.field_2092a9_Dne != 1.0) {
            GL11.glTranslatef((float)this.field_212608_FWm, (float)(-this.field_2e5f16_bzF), 0.0f);
            GL11.glScaled(this.field_2092a9_Dne, this.field_2092a9_Dne, 1.0);
        }
        GLU.gluPerspective(this.method_16bad1e_Dne(f, true), (float)this.field_493682ed_Dne.field_2092ae_Dne / (float)this.field_493682ed_Dne.field_21260d_FWm, 0.05f, this.field_2f0dd5_div * 2.0f);
        if (this.field_493682ed_Dne.field_36c390e_Dne.method_7a46289e_Dne()) {
            f2 = 0.6666667f;
            GL11.glScalef(1.0f, f2, 1.0f);
        }
        GL11.glMatrixMode(5888);
        GL11.glLoadIdentity();
        if (this.field_493682ed_Dne.field_3758af7_Dne.field_2e5f2c_bzF) {
            GL11.glTranslatef((float)(n * 2 - 1) * 0.1f, 0.0f, 0.0f);
        }
        this.method_7ed96ebf_Qnq(f);
        if (this.field_493682ed_Dne.field_3758af7_Dne.field_21261e_FWm) {
            this.method_87b72d60_aFZ(f);
        }
        if ((f2 = this.field_493682ed_Dne.field_369f6b6_Dne.field_388da3_zGp + (this.field_493682ed_Dne.field_369f6b6_Dne.field_2d29f1_aFZ - this.field_493682ed_Dne.field_369f6b6_Dne.field_388da3_zGp) * f) > 0.0f) {
            n2 = 20;
            if (this.field_493682ed_Dne.field_369f6b6_Dne.method_857f23ec_Dne(SXd.field_74f7768b_mrb)) {
                n2 = 7;
            }
            float f4 = 5.0f / (f2 * f2 + 5.0f) - f2 * 0.04f;
            f4 *= f4;
            GL11.glRotatef(((float)this.field_388da6_zGp + f) * (float)n2, 0.0f, 1.0f, 1.0f);
            GL11.glScalef(1.0f / f4, 1.0f, 1.0f);
            GL11.glRotatef(-((float)this.field_388da6_zGp + f) * (float)n2, 0.0f, 1.0f, 1.0f);
        }
        this.method_b51dd46e_zGp(f);
        if (this.field_2d29f4_aFZ > 0) {
            n2 = this.field_2d29f4_aFZ - 1;
            if (n2 == 1) {
                GL11.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
            }
            if (n2 == 2) {
                GL11.glRotatef(180.0f, 0.0f, 1.0f, 0.0f);
            }
            if (n2 == 3) {
                GL11.glRotatef(-90.0f, 0.0f, 1.0f, 0.0f);
            }
            if (n2 == 4) {
                GL11.glRotatef(90.0f, 1.0f, 0.0f, 0.0f);
            }
            if (n2 == 5) {
                GL11.glRotatef(-90.0f, 1.0f, 0.0f, 0.0f);
            }
        }
    }

    public void method_ce7f4ae4_Dne(double d) {
        oCF.method_ce7f5da9_Dne(oCF.field_21260d_FWm);
        GL11.glDisable(3553);
        oCF.method_ce7f5da9_Dne(oCF.field_2092ae_Dne);
    }

    private void method_1e25393c_FWm(float f, int n) {
        if (this.field_2d29f4_aFZ <= 0) {
            GL11.glMatrixMode(5889);
            GL11.glLoadIdentity();
            float f2 = 0.07f;
            if (this.field_493682ed_Dne.field_3758af7_Dne.field_2e5f2c_bzF) {
                GL11.glTranslatef((float)(-(n * 2 - 1)) * f2, 0.0f, 0.0f);
            }
            if (this.field_2092a9_Dne != 1.0) {
                GL11.glTranslatef((float)this.field_212608_FWm, (float)(-this.field_2e5f16_bzF), 0.0f);
                GL11.glScaled(this.field_2092a9_Dne, this.field_2092a9_Dne, 1.0);
            }
            GLU.gluPerspective(this.method_16bad1e_Dne(f, false), (float)this.field_493682ed_Dne.field_2092ae_Dne / (float)this.field_493682ed_Dne.field_21260d_FWm, 0.05f, this.field_2f0dd5_div * 2.0f);
            if (this.field_493682ed_Dne.field_36c390e_Dne.method_7a46289e_Dne()) {
                float f3 = 0.6666667f;
                GL11.glScalef(1.0f, f3, 1.0f);
            }
            GL11.glMatrixMode(5888);
            GL11.glLoadIdentity();
            if (this.field_493682ed_Dne.field_3758af7_Dne.field_2e5f2c_bzF) {
                GL11.glTranslatef((float)(n * 2 - 1) * 0.1f, 0.0f, 0.0f);
            }
            GL11.glPushMatrix();
            this.method_7ed96ebf_Qnq(f);
            if (this.field_493682ed_Dne.field_3758af7_Dne.field_21261e_FWm) {
                this.method_87b72d60_aFZ(f);
            }
            if (!(this.field_493682ed_Dne.field_3758af7_Dne.field_2f0dd8_div != 0 || this.field_493682ed_Dne.field_366ec33_Dne.method_9b310ff4_Wwe() || this.field_493682ed_Dne.field_3758af7_Dne.field_2e8497_ceE || this.field_493682ed_Dne.field_36c390e_Dne.method_7a46289e_Dne())) {
                this.method_117d0725_FWm(f);
                this.field_36fa224_Dne.method_ce7f5266_Dne(f);
                this.method_ce7f4ae4_Dne(f);
            }
            GL11.glPopMatrix();
            if (this.field_493682ed_Dne.field_3758af7_Dne.field_2f0dd8_div == 0 && !this.field_493682ed_Dne.field_366ec33_Dne.method_9b310ff4_Wwe()) {
                this.field_36fa224_Dne.method_117d0ea7_FWm(f);
                this.method_7ed96ebf_Qnq(f);
            }
            if (this.field_493682ed_Dne.field_3758af7_Dne.field_21261e_FWm) {
                this.method_87b72d60_aFZ(f);
            }
        }
    }

    private void method_b51dd46e_zGp(float f) {
        FUH fUH = this.field_493682ed_Dne.field_366ec33_Dne;
        float f2 = fUH.field_36b0a6_udO - 1.62f;
        double d = fUH.field_2d29ef_aFZ + (fUH.field_2f0dd3_div - fUH.field_2d29ef_aFZ) * (double)f;
        double d2 = fUH.field_388da1_zGp + (fUH.field_22c5fd_IjH - fUH.field_388da1_zGp) * (double)f - (double)f2;
        double d3 = fUH.field_20b852_DyG + (fUH.field_334487_mrb - fUH.field_20b852_DyG) * (double)f;
        GL11.glRotatef(this.field_2569d2_OdI + (this.field_215b33_FfS - this.field_2569d2_OdI) * f, 0.0f, 0.0f, 1.0f);
        if (fUH.method_9b310ff4_Wwe()) {
            f2 = (float)((double)f2 + 1.0);
            GL11.glTranslatef(0.0f, 0.3f, 0.0f);
            if (!this.field_493682ed_Dne.field_3758af7_Dne.field_36e4eb_vSL) {
                int n = this.field_493682ed_Dne.field_36ebf36_Dne.method_2c2cf7bc_Dne(geR.method_117d0718_FWm(fUH.field_2f0dd3_div), geR.method_117d0718_FWm(fUH.field_22c5fd_IjH), geR.method_117d0718_FWm(fUH.field_334487_mrb));
                if (n == zKP.field_d57af75_FfS.field_21260d_FWm) {
                    int n2 = this.field_493682ed_Dne.field_36ebf36_Dne.method_2dee76f_bzF(geR.method_117d0718_FWm(fUH.field_2f0dd3_div), geR.method_117d0718_FWm(fUH.field_22c5fd_IjH), geR.method_117d0718_FWm(fUH.field_334487_mrb));
                    int n3 = n2 & 3;
                    GL11.glRotatef(n3 * 90, 0.0f, 1.0f, 0.0f);
                }
                GL11.glRotatef(fUH.field_2a9ad3_Zpi + (fUH.field_334489_mrb - fUH.field_2a9ad3_Zpi) * f + 180.0f, 0.0f, -1.0f, 0.0f);
                GL11.glRotatef(fUH.field_31b813_kGO + (fUH.field_29186a_XHL - fUH.field_31b813_kGO) * f, -1.0f, 0.0f, 0.0f);
            }
        } else if (this.field_493682ed_Dne.field_3758af7_Dne.field_2f0dd8_div > 0) {
            double d4 = this.field_334489_mrb + (this.field_22c5ff_IjH - this.field_334489_mrb) * f;
            if (this.field_493682ed_Dne.field_3758af7_Dne.field_36e4eb_vSL) {
                float f3 = this.field_2a9ad3_Zpi + (this.field_29186a_XHL - this.field_2a9ad3_Zpi) * f;
                float f4 = this.field_36b0a6_udO + (this.field_31b813_kGO - this.field_36b0a6_udO) * f;
                GL11.glTranslatef(0.0f, 0.0f, (float)(-d4));
                GL11.glRotatef(f4, 1.0f, 0.0f, 0.0f);
                GL11.glRotatef(f3, 0.0f, 1.0f, 0.0f);
            } else {
                float f5 = fUH.field_334489_mrb;
                float f6 = fUH.field_29186a_XHL;
                if (this.field_493682ed_Dne.field_3758af7_Dne.field_2f0dd8_div == 2) {
                    f6 += 180.0f;
                }
                double d5 = (double)(-geR.method_ce7f5256_Dne(f5 / 180.0f * (float)Math.PI) * geR.method_117d0e97_FWm(f6 / 180.0f * (float)Math.PI)) * d4;
                double d6 = (double)(geR.method_117d0e97_FWm(f5 / 180.0f * (float)Math.PI) * geR.method_117d0e97_FWm(f6 / 180.0f * (float)Math.PI)) * d4;
                double d7 = (double)(-geR.method_ce7f5256_Dne(f6 / 180.0f * (float)Math.PI)) * d4;
                for (int i = 0; i < 8; ++i) {
                    double d8;
                    float f7 = (i & 1) * 2 - 1;
                    float f8 = (i >> 1 & 1) * 2 - 1;
                    float f9 = (i >> 2 & 1) * 2 - 1;
                    wHH wHH2 = this.field_493682ed_Dne.field_36ebf36_Dne.method_38be674_Dne(this.field_493682ed_Dne.field_36ebf36_Dne.method_23186a47_Dne().method_e4505d6c_Dne(d + (double)(f7 *= 0.1f), d2 + (double)(f8 *= 0.1f), d3 + (double)(f9 *= 0.1f)), this.field_493682ed_Dne.field_36ebf36_Dne.method_23186a47_Dne().method_e4505d6c_Dne(d - d5 + (double)f7 + (double)f9, d2 - d7 + (double)f8, d3 - d6 + (double)f9));
                    if (wHH2 == null || !((d8 = wHH2.field_3746303_Dne.method_7af7d96d_FWm(this.field_493682ed_Dne.field_36ebf36_Dne.method_23186a47_Dne().method_e4505d6c_Dne(d, d2, d3))) < d4)) continue;
                    d4 = d8;
                }
                if (this.field_493682ed_Dne.field_3758af7_Dne.field_2f0dd8_div == 2) {
                    GL11.glRotatef(180.0f, 0.0f, 1.0f, 0.0f);
                }
                GL11.glRotatef(fUH.field_29186a_XHL - f6, 1.0f, 0.0f, 0.0f);
                GL11.glRotatef(fUH.field_334489_mrb - f5, 0.0f, 1.0f, 0.0f);
                GL11.glTranslatef(0.0f, 0.0f, (float)(-d4));
                GL11.glRotatef(f5 - fUH.field_334489_mrb, 0.0f, 1.0f, 0.0f);
                GL11.glRotatef(f6 - fUH.field_29186a_XHL, 1.0f, 0.0f, 0.0f);
            }
        } else {
            GL11.glTranslatef(0.0f, 0.0f, -0.1f);
        }
        if (!this.field_493682ed_Dne.field_3758af7_Dne.field_36e4eb_vSL) {
            GL11.glRotatef(fUH.field_31b813_kGO + (fUH.field_29186a_XHL - fUH.field_31b813_kGO) * f, 1.0f, 0.0f, 0.0f);
            GL11.glRotatef(fUH.field_2a9ad3_Zpi + (fUH.field_334489_mrb - fUH.field_2a9ad3_Zpi) * f + 180.0f, 0.0f, 1.0f, 0.0f);
        }
        GL11.glTranslatef(0.0f, f2, 0.0f);
        d = fUH.field_2d29ef_aFZ + (fUH.field_2f0dd3_div - fUH.field_2d29ef_aFZ) * (double)f;
        d2 = fUH.field_388da1_zGp + (fUH.field_22c5fd_IjH - fUH.field_388da1_zGp) * (double)f - (double)f2;
        d3 = fUH.field_20b852_DyG + (fUH.field_334487_mrb - fUH.field_20b852_DyG) * (double)f;
        this.field_21261e_FWm = this.field_493682ed_Dne.field_37b59c1_Dne.method_50a172a0_Dne(d, d2, d3, f);
    }

    private FloatBuffer method_ed4c24f7_Dne(float f, float f2, float f3, float f4) {
        this.field_b5fd3c76_Dne.clear();
        this.field_b5fd3c76_Dne.put(f).put(f2).put(f3).put(f4);
        this.field_b5fd3c76_Dne.flip();
        return this.field_b5fd3c76_Dne;
    }

    private void method_87b72d60_aFZ(float f) {
        if (this.field_493682ed_Dne.field_366ec33_Dne instanceof FiG) {
            FiG fiG = (FiG)this.field_493682ed_Dne.field_366ec33_Dne;
            float f2 = fiG.field_1ed014_ATE - fiG.field_34856f_qLR;
            float f3 = -(fiG.field_1ed014_ATE + f2 * f);
            float f4 = fiG.field_37e098_xXN + (fiG.field_228593_IYC - fiG.field_37e098_xXN) * f;
            float f5 = fiG.field_332a61_mlD + (fiG.field_20b33e_EWz - fiG.field_332a61_mlD) * f;
            GL11.glTranslatef(geR.method_ce7f5256_Dne(f3 * (float)Math.PI) * f4 * 0.5f, -Math.abs(geR.method_117d0e97_FWm(f3 * (float)Math.PI) * f4), 0.0f);
            GL11.glRotatef(geR.method_ce7f5256_Dne(f3 * (float)Math.PI) * f4 * 3.0f, 0.0f, 0.0f, 1.0f);
            GL11.glRotatef(Math.abs(geR.method_117d0e97_FWm(f3 * (float)Math.PI - 0.2f) * f4) * 5.0f, 1.0f, 0.0f, 0.0f);
            GL11.glRotatef(f5, 1.0f, 0.0f, 0.0f);
        }
    }

    private void method_a98a0660_aFZ() {
        float f = this.field_493682ed_Dne.field_36ebf36_Dne.method_b51dd45e_zGp(1.0f);
        if (!this.field_493682ed_Dne.field_3758af7_Dne.field_2d2a05_aFZ) {
            f /= 2.0f;
        }
        if (f != 0.0f) {
            this.field_7331eae7_Dne.setSeed((long)this.field_388da6_zGp * 312987231L);
            FUH fUH = this.field_493682ed_Dne.field_366ec33_Dne;
            VzZ vzZ = this.field_493682ed_Dne.field_36ebf36_Dne;
            int n = geR.method_117d0718_FWm(fUH.field_2f0dd3_div);
            int n2 = geR.method_117d0718_FWm(fUH.field_22c5fd_IjH);
            int n3 = geR.method_117d0718_FWm(fUH.field_334487_mrb);
            int n4 = 10;
            double d = 0.0;
            double d2 = 0.0;
            double d3 = 0.0;
            int n5 = 0;
            int n6 = (int)(100.0f * f * f);
            if (this.field_493682ed_Dne.field_3758af7_Dne.field_33448c_mrb == 1) {
                n6 >>= 1;
            } else if (this.field_493682ed_Dne.field_3758af7_Dne.field_33448c_mrb == 2) {
                n6 = 0;
            }
            for (int i = 0; i < n6; ++i) {
                int n7 = n + this.field_7331eae7_Dne.nextInt(n4) - this.field_7331eae7_Dne.nextInt(n4);
                int n8 = n3 + this.field_7331eae7_Dne.nextInt(n4) - this.field_7331eae7_Dne.nextInt(n4);
                int n9 = vzZ.method_5c563934_Qnq(n7, n8);
                int n10 = vzZ.method_2c2cf7bc_Dne(n7, n9 - 1, n8);
                OdI odI = vzZ.method_90477c37_Dne(n7, n8);
                if (n9 > n2 + n4 || n9 < n2 - n4 || !odI.method_7c6f603d_FWm() || !(odI.method_ae128db7_bzF() >= 0.2f)) continue;
                float f2 = this.field_7331eae7_Dne.nextFloat();
                float f3 = this.field_7331eae7_Dne.nextFloat();
                if (n10 <= 0) continue;
                if (zKP.field_8374b848_Dne[n10].field_368fd23_Dne == KFd.field_5b96677_IjH) {
                    this.field_493682ed_Dne.field_364ffb6_Dne.method_68e8f1ab_Dne(new bsu(vzZ, (float)n7 + f2, (double)((float)n9 + 0.1f) - zKP.field_8374b848_Dne[n10].method_ae128db5_bzF(), (float)n8 + f3, 0.0, 0.0, 0.0));
                    continue;
                }
                if (this.field_7331eae7_Dne.nextInt(++n5) == 0) {
                    d = (float)n7 + f2;
                    d2 = (double)((float)n9 + 0.1f) - zKP.field_8374b848_Dne[n10].method_ae128db5_bzF();
                    d3 = (float)n8 + f3;
                }
                this.field_493682ed_Dne.field_364ffb6_Dne.method_68e8f1ab_Dne(new CyE(vzZ, (float)n7 + f2, (double)((float)n9 + 0.1f) - zKP.field_8374b848_Dne[n10].method_ae128db5_bzF(), (float)n8 + f3));
            }
            if (n5 > 0 && this.field_7331eae7_Dne.nextInt(3) < this.field_20b857_DyG++) {
                this.field_20b857_DyG = 0;
                if (d2 > fUH.field_22c5fd_IjH + 1.0 && vzZ.method_5c563934_Qnq(geR.method_117d0718_FWm(fUH.field_2f0dd3_div), geR.method_117d0718_FWm(fUH.field_334487_mrb)) > geR.method_117d0718_FWm(fUH.field_22c5fd_IjH)) {
                    this.field_493682ed_Dne.field_36ebf36_Dne.method_62d7c9a6_Dne(d, d2, d3, "ambient.weather.rain", 0.1f, 0.5f, false);
                } else {
                    this.field_493682ed_Dne.field_36ebf36_Dne.method_62d7c9a6_Dne(d, d2, d3, "ambient.weather.rain", 0.2f, 1.0f, false);
                }
            }
        }
    }

    public void method_16b711e_Dne(float f, long l) {
        this.field_493682ed_Dne.field_365731d_Dne.method_8f501fe4_Dne("lightTex");
        if (this.field_2e5f2c_bzF) {
            this.method_df9de01d_DyG(f);
        }
        GL11.glEnable(2884);
        GL11.glEnable(2929);
        if (this.field_493682ed_Dne.field_366ec33_Dne == null) {
            this.field_493682ed_Dne.field_366ec33_Dne = this.field_493682ed_Dne.field_369f6b6_Dne;
        }
        this.field_493682ed_Dne.field_365731d_Dne.method_110c4dc3_FWm("pick");
        this.method_ce7f5266_Dne(f);
        FUH fUH = this.field_493682ed_Dne.field_366ec33_Dne;
        rqj rqj2 = this.field_493682ed_Dne.field_37b59c1_Dne;
        BMa bMa = this.field_493682ed_Dne.field_364ffb6_Dne;
        double d = fUH.field_36b0a4_udO + (fUH.field_2f0dd3_div - fUH.field_36b0a4_udO) * (double)f;
        double d2 = fUH.field_34225f_ooe + (fUH.field_22c5fd_IjH - fUH.field_34225f_ooe) * (double)f;
        double d3 = fUH.field_36714f_trS + (fUH.field_334487_mrb - fUH.field_36714f_trS) * (double)f;
        this.field_493682ed_Dne.field_365731d_Dne.method_110c4dc3_FWm("center");
        for (int i = 0; i < 2; ++i) {
            if (this.field_493682ed_Dne.field_3758af7_Dne.field_2e5f2c_bzF) {
                field_2092ae_Dne = i;
                if (field_2092ae_Dne == 0) {
                    GL11.glColorMask(false, true, true, false);
                } else {
                    GL11.glColorMask(true, false, false, false);
                }
            }
            this.field_493682ed_Dne.field_365731d_Dne.method_110c4dc3_FWm("clear");
            GL11.glViewport(0, 0, this.field_493682ed_Dne.field_2092ae_Dne, this.field_493682ed_Dne.field_21260d_FWm);
            this.method_63ae0efc_div(f);
            GL11.glClear(16640);
            GL11.glEnable(2884);
            this.field_493682ed_Dne.field_365731d_Dne.method_110c4dc3_FWm("camera");
            this.method_16b6d5d_Dne(f, i);
            lqj.method_961ec291_Dne(this.field_493682ed_Dne.field_369f6b6_Dne, this.field_493682ed_Dne.field_3758af7_Dne.field_2f0dd8_div == 2);
            this.field_493682ed_Dne.field_365731d_Dne.method_110c4dc3_FWm("frustrum");
            hAW.method_22ff7c46_Dne();
            if (this.field_493682ed_Dne.field_3758af7_Dne.field_2092ae_Dne < 2) {
                this.method_16cbf37_Dne(-1, f);
                this.field_493682ed_Dne.field_365731d_Dne.method_110c4dc3_FWm("sky");
                rqj2.method_ce7f5266_Dne(f);
            }
            GL11.glEnable(2912);
            this.method_16cbf37_Dne(1, f);
            if (this.field_493682ed_Dne.field_3758af7_Dne.field_2e5f1b_bzF != 0) {
                GL11.glShadeModel(7425);
            }
            this.field_493682ed_Dne.field_365731d_Dne.method_110c4dc3_FWm("culling");
            BXR bXR = new BXR();
            bXR.method_2be429a4_Dne(d, d2, d3);
            this.field_493682ed_Dne.field_37b59c1_Dne.method_cda816a_Dne(bXR, f);
            if (i == 0) {
                long l2;
                this.field_493682ed_Dne.field_365731d_Dne.method_110c4dc3_FWm("updatechunks");
                while (!this.field_493682ed_Dne.field_37b59c1_Dne.method_740bedaa_Dne(fUH, false) && l != 0L && (l2 = l - System.nanoTime()) >= 0L && l2 <= 1000000000L) {
                }
            }
            if (fUH.field_22c5fd_IjH < 128.0) {
                this.method_bd44a244_Dne(rqj2, f);
            }
            this.field_493682ed_Dne.field_365731d_Dne.method_110c4dc3_FWm("prepareterrain");
            this.method_16cbf37_Dne(0, f);
            GL11.glEnable(2912);
            this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/terrain.png");
            Cit.method_7a46289a_Dne();
            this.field_493682ed_Dne.field_365731d_Dne.method_110c4dc3_FWm("terrain");
            rqj2.method_d6a6cfc_Dne(fUH, 0, f);
            GL11.glShadeModel(7424);
            if (this.field_2d29f4_aFZ == 0) {
                Cit.method_7c6f6039_FWm();
                this.field_493682ed_Dne.field_365731d_Dne.method_110c4dc3_FWm("entities");
                rqj2.method_7367138e_Dne(fUH.method_ffc5552e_Dne(f), bXR, f);
                this.method_117d0725_FWm(f);
                this.field_493682ed_Dne.field_365731d_Dne.method_110c4dc3_FWm("litParticles");
                bMa.method_56057ff_FWm(fUH, f);
                Cit.method_7a46289a_Dne();
                this.method_16cbf37_Dne(0, f);
                this.field_493682ed_Dne.field_365731d_Dne.method_110c4dc3_FWm("particles");
                bMa.method_b43d93a0_Dne(fUH, f);
                this.method_ce7f4ae4_Dne(f);
                if (this.field_493682ed_Dne.field_37d0195_Dne != null && fUH.method_76dab7e2_Dne(KFd.field_1411d34d_div) && fUH instanceof FiG && !this.field_493682ed_Dne.field_3758af7_Dne.field_2e8497_ceE) {
                    FiG fiG = (FiG)fUH;
                    GL11.glDisable(3008);
                    this.field_493682ed_Dne.field_365731d_Dne.method_110c4dc3_FWm("outline");
                    rqj2.method_dfa257ad_Dne(fiG, this.field_493682ed_Dne.field_37d0195_Dne, 0, fiG.field_36a059b_Dne.method_23040479_Dne(), f);
                    rqj2.method_c2c971ee_FWm(fiG, this.field_493682ed_Dne.field_37d0195_Dne, 0, fiG.field_36a059b_Dne.method_23040479_Dne(), f);
                    GL11.glEnable(3008);
                }
            }
            GL11.glDisable(3042);
            GL11.glEnable(2884);
            GL11.glBlendFunc(770, 771);
            GL11.glDepthMask(true);
            this.method_16cbf37_Dne(0, f);
            GL11.glEnable(3042);
            GL11.glDisable(2884);
            this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/terrain.png");
            if (this.field_493682ed_Dne.field_3758af7_Dne.field_2d2a05_aFZ) {
                this.field_493682ed_Dne.field_365731d_Dne.method_110c4dc3_FWm("water");
                if (this.field_493682ed_Dne.field_3758af7_Dne.field_2e5f1b_bzF != 0) {
                    GL11.glShadeModel(7425);
                }
                GL11.glColorMask(false, false, false, false);
                int n = rqj2.method_d6a6cfc_Dne(fUH, 1, f);
                if (this.field_493682ed_Dne.field_3758af7_Dne.field_2e5f2c_bzF) {
                    if (field_2092ae_Dne == 0) {
                        GL11.glColorMask(false, true, true, true);
                    } else {
                        GL11.glColorMask(true, false, false, true);
                    }
                } else {
                    GL11.glColorMask(true, true, true, true);
                }
                if (n > 0) {
                    rqj2.method_16cb7b5_Dne(1, f);
                }
                GL11.glShadeModel(7424);
            } else {
                this.field_493682ed_Dne.field_365731d_Dne.method_110c4dc3_FWm("water");
                rqj2.method_d6a6cfc_Dne(fUH, 1, f);
            }
            GL11.glDepthMask(true);
            GL11.glEnable(2884);
            GL11.glDisable(3042);
            if (this.field_2092a9_Dne == 1.0 && fUH instanceof FiG && !this.field_493682ed_Dne.field_3758af7_Dne.field_2e8497_ceE && this.field_493682ed_Dne.field_37d0195_Dne != null && !fUH.method_76dab7e2_Dne(KFd.field_1411d34d_div)) {
                FiG fiG = (FiG)fUH;
                GL11.glDisable(3008);
                this.field_493682ed_Dne.field_365731d_Dne.method_110c4dc3_FWm("outline");
                rqj2.method_dfa257ad_Dne(fiG, this.field_493682ed_Dne.field_37d0195_Dne, 0, fiG.field_36a059b_Dne.method_23040479_Dne(), f);
                rqj2.method_c2c971ee_FWm(fiG, this.field_493682ed_Dne.field_37d0195_Dne, 0, fiG.field_36a059b_Dne.method_23040479_Dne(), f);
                GL11.glEnable(3008);
            }
            this.field_493682ed_Dne.field_365731d_Dne.method_110c4dc3_FWm("destroyProgress");
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 1);
            rqj2.method_c2a5d242_Dne(WAR.field_36e5ca4_Dne, (FiG)fUH, f);
            GL11.glDisable(3042);
            this.field_493682ed_Dne.field_365731d_Dne.method_110c4dc3_FWm("weather");
            this.method_143f92d9_bzF(f);
            GL11.glDisable(2912);
            if (fUH.field_22c5fd_IjH >= 128.0) {
                this.method_bd44a244_Dne(rqj2, f);
            }
            this.field_493682ed_Dne.field_365731d_Dne.method_110c4dc3_FWm("hand");
            if (this.field_2092a9_Dne == 1.0) {
                GL11.glClear(256);
                this.method_1e25393c_FWm(f, i);
            }
            if (this.field_493682ed_Dne.field_3758af7_Dne.field_2e5f2c_bzF) continue;
            this.field_493682ed_Dne.field_365731d_Dne.method_7c6f6039_FWm();
            return;
        }
        GL11.glColorMask(true, true, true, false);
        this.field_493682ed_Dne.field_365731d_Dne.method_7c6f6039_FWm();
    }

    static {
        field_2092bf_Dne = false;
    }

    public void method_117d0725_FWm(double d) {
        oCF.method_ce7f5da9_Dne(oCF.field_21260d_FWm);
        GL11.glMatrixMode(5890);
        GL11.glLoadIdentity();
        float f = 0.00390625f;
        GL11.glScalef(f, f, f);
        GL11.glTranslatef(8.0f, 8.0f, 8.0f);
        GL11.glMatrixMode(5888);
        GL11.glBindTexture(3553, this.field_21260d_FWm);
        GL11.glTexParameteri(3553, 10241, 9729);
        GL11.glTexParameteri(3553, 10240, 9729);
        GL11.glTexParameteri(3553, 10241, 9729);
        GL11.glTexParameteri(3553, 10240, 9729);
        GL11.glTexParameteri(3553, 10242, 10496);
        GL11.glTexParameteri(3553, 10243, 10496);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glEnable(3553);
        this.field_493682ed_Dne.field_36d36bf_Dne.method_7a46289a_Dne();
        oCF.method_ce7f5da9_Dne(oCF.field_2092ae_Dne);
    }

    private void method_63ae0efc_div(float f) {
        float f2;
        float f3;
        VzZ vzZ = this.field_493682ed_Dne.field_36ebf36_Dne;
        FUH fUH = this.field_493682ed_Dne.field_366ec33_Dne;
        float f4 = 1.0f / (float)(4 - this.field_493682ed_Dne.field_3758af7_Dne.field_2092ae_Dne);
        f4 = 1.0f - (float)Math.pow(f4, 0.25);
        chN chN2 = vzZ.method_6dac6968_Dne(this.field_493682ed_Dne.field_366ec33_Dne, f);
        float f5 = (float)chN2.field_2092a9_Dne;
        float f6 = (float)chN2.field_212608_FWm;
        float f7 = (float)chN2.field_2e5f16_bzF;
        chN chN3 = vzZ.method_d91908ef_FWm(f);
        this.field_2d29f1_aFZ = (float)chN3.field_2092a9_Dne;
        this.field_388da3_zGp = (float)chN3.field_212608_FWm;
        this.field_20b854_DyG = (float)chN3.field_2e5f16_bzF;
        if (this.field_493682ed_Dne.field_3758af7_Dne.field_2092ae_Dne < 2) {
            float[] fArray;
            chN chN4 = geR.method_ce7f5256_Dne(vzZ.method_143f92c9_bzF(f)) > 0.0f ? vzZ.method_23186a47_Dne().method_e4505d6c_Dne(-1.0, 0.0, 0.0) : vzZ.method_23186a47_Dne().method_e4505d6c_Dne(1.0, 0.0, 0.0);
            f3 = (float)fUH.method_d91908ef_FWm(f).method_a1a425ac_Dne(chN4);
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 > 0.0f && (fArray = vzZ.field_3690d00_Dne.method_2c00e207_Dne(vzZ.method_117d0e97_FWm(f), f)) != null) {
                this.field_2d29f1_aFZ = this.field_2d29f1_aFZ * (1.0f - (f3 *= fArray[3])) + fArray[0] * f3;
                this.field_388da3_zGp = this.field_388da3_zGp * (1.0f - f3) + fArray[1] * f3;
                this.field_20b854_DyG = this.field_20b854_DyG * (1.0f - f3) + fArray[2] * f3;
            }
        }
        this.field_2d29f1_aFZ += (f5 - this.field_2d29f1_aFZ) * f4;
        this.field_388da3_zGp += (f6 - this.field_388da3_zGp) * f4;
        this.field_20b854_DyG += (f7 - this.field_20b854_DyG) * f4;
        float f8 = vzZ.method_b51dd45e_zGp(f);
        if (f8 > 0.0f) {
            f3 = 1.0f - f8 * 0.5f;
            float f9 = 1.0f - f8 * 0.4f;
            this.field_2d29f1_aFZ *= f3;
            this.field_388da3_zGp *= f3;
            this.field_20b854_DyG *= f9;
        }
        if ((f3 = vzZ.method_87b72d50_aFZ(f)) > 0.0f) {
            float f10 = 1.0f - f3 * 0.5f;
            this.field_2d29f1_aFZ *= f10;
            this.field_388da3_zGp *= f10;
            this.field_20b854_DyG *= f10;
        }
        int n = lqj.method_33813bbe_Dne(this.field_493682ed_Dne.field_36ebf36_Dne, fUH, f);
        if (this.field_21261e_FWm) {
            chN chN5 = vzZ.method_ffc5552e_Dne(f);
            this.field_2d29f1_aFZ = (float)chN5.field_2092a9_Dne;
            this.field_388da3_zGp = (float)chN5.field_212608_FWm;
            this.field_20b854_DyG = (float)chN5.field_2e5f16_bzF;
        } else if (n != 0 && zKP.field_8374b848_Dne[n].field_368fd23_Dne == KFd.field_1411d34d_div) {
            this.field_2d29f1_aFZ = 0.02f;
            this.field_388da3_zGp = 0.02f;
            this.field_20b854_DyG = 0.2f;
        } else if (n != 0 && zKP.field_8374b848_Dne[n].field_368fd23_Dne == KFd.field_5b96677_IjH) {
            this.field_2d29f1_aFZ = 0.6f;
            this.field_388da3_zGp = 0.1f;
            this.field_20b854_DyG = 0.0f;
        }
        float f11 = this.field_3649f6_tgc + (this.field_34b5fe_qXo - this.field_3649f6_tgc) * f;
        this.field_2d29f1_aFZ *= f11;
        this.field_388da3_zGp *= f11;
        this.field_20b854_DyG *= f11;
        double d = (fUH.field_34225f_ooe + (fUH.field_22c5fd_IjH - fUH.field_34225f_ooe) * (double)f) * vzZ.field_3690d00_Dne.method_7a462888_Dne();
        if (fUH.method_857f23ec_Dne(SXd.field_3286ff53_trS)) {
            int n2 = fUH.method_a7927c94_Dne(SXd.field_3286ff53_trS).method_7c6f602c_FWm();
            d = n2 < 20 ? (d *= (double)(1.0f - (float)n2 / 20.0f)) : 0.0;
        }
        if (d < 1.0) {
            if (d < 0.0) {
                d = 0.0;
            }
            d *= d;
            this.field_2d29f1_aFZ = (float)((double)this.field_2d29f1_aFZ * d);
            this.field_388da3_zGp = (float)((double)this.field_388da3_zGp * d);
            this.field_20b854_DyG = (float)((double)this.field_20b854_DyG * d);
        }
        if (this.field_217c23_Fnk > 0.0f) {
            float f12 = this.field_307844_gnI + (this.field_217c23_Fnk - this.field_307844_gnI) * f;
            this.field_2d29f1_aFZ = this.field_2d29f1_aFZ * (1.0f - f12) + this.field_2d29f1_aFZ * 0.7f * f12;
            this.field_388da3_zGp = this.field_388da3_zGp * (1.0f - f12) + this.field_388da3_zGp * 0.6f * f12;
            this.field_20b854_DyG = this.field_20b854_DyG * (1.0f - f12) + this.field_20b854_DyG * 0.6f * f12;
        }
        if (fUH.method_857f23ec_Dne(SXd.field_1f01d471_qLR)) {
            float f13 = this.method_961e776d_Dne(this.field_493682ed_Dne.field_369f6b6_Dne, f);
            f2 = 1.0f / this.field_2d29f1_aFZ;
            if (f2 > 1.0f / this.field_388da3_zGp) {
                f2 = 1.0f / this.field_388da3_zGp;
            }
            if (f2 > 1.0f / this.field_20b854_DyG) {
                f2 = 1.0f / this.field_20b854_DyG;
            }
            this.field_2d29f1_aFZ = this.field_2d29f1_aFZ * (1.0f - f13) + this.field_2d29f1_aFZ * f2 * f13;
            this.field_388da3_zGp = this.field_388da3_zGp * (1.0f - f13) + this.field_388da3_zGp * f2 * f13;
            this.field_20b854_DyG = this.field_20b854_DyG * (1.0f - f13) + this.field_20b854_DyG * f2 * f13;
        }
        if (this.field_493682ed_Dne.field_3758af7_Dne.field_2e5f2c_bzF) {
            float f14 = (this.field_2d29f1_aFZ * 30.0f + this.field_388da3_zGp * 59.0f + this.field_20b854_DyG * 11.0f) / 100.0f;
            f2 = (this.field_2d29f1_aFZ * 30.0f + this.field_388da3_zGp * 70.0f) / 100.0f;
            float f15 = (this.field_2d29f1_aFZ * 30.0f + this.field_20b854_DyG * 70.0f) / 100.0f;
            this.field_2d29f1_aFZ = f14;
            this.field_388da3_zGp = f2;
            this.field_20b854_DyG = f15;
        }
        GL11.glClearColor(this.field_2d29f1_aFZ, this.field_388da3_zGp, this.field_20b854_DyG, 0.0f);
    }

    private void method_bd44a244_Dne(rqj rqj2, float f) {
        if (this.field_493682ed_Dne.field_3758af7_Dne.method_7a46289e_Dne()) {
            this.field_493682ed_Dne.field_365731d_Dne.method_110c4dc3_FWm("clouds");
            GL11.glPushMatrix();
            this.method_16cbf37_Dne(0, f);
            GL11.glEnable(2912);
            rqj2.method_117d0ea7_FWm(f);
            GL11.glDisable(2912);
            this.method_16cbf37_Dne(1, f);
            GL11.glPopMatrix();
        }
    }

    public OEA(Minecraft minecraft) {
        this.field_5e619a2d_Qnq = new lSM();
        this.field_713bafac_aFZ = new lSM();
        this.field_f0a9ea5e_zGp = new lSM();
        this.field_2092af_Dne = Minecraft.method_7a46288e_Dne();
        this.field_7331eae7_Dne = new Random();
        this.field_b5fd3c76_Dne = pZS.method_c3f43248_Dne(16);
        this.field_493682ed_Dne = minecraft;
        this.field_36fa224_Dne = new XyI(minecraft);
        this.field_21260d_FWm = minecraft.field_36d36bf_Dne.method_1420ded2_Dne(new BufferedImage(16, 16, 1));
        this.field_3f1c589_Dne = new int[256];
    }

    private void method_16cbf37_Dne(int n, float f) {
        FUH fUH = this.field_493682ed_Dne.field_366ec33_Dne;
        boolean bl = false;
        if (fUH instanceof FiG) {
            bl = ((FiG)fUH).field_37cb681_Dne.field_267d06_Qnq;
        }
        if (n == 999) {
            GL11.glFog(2918, this.method_ed4c24f7_Dne(0.0f, 0.0f, 0.0f, 1.0f));
            GL11.glFogi(2917, 9729);
            GL11.glFogf(2915, 0.0f);
            GL11.glFogf(2916, 8.0f);
            if (GLContext.getCapabilities().GL_NV_fog_distance) {
                GL11.glFogi(34138, 34139);
            }
            GL11.glFogf(2915, 0.0f);
        } else {
            GL11.glFog(2918, this.method_ed4c24f7_Dne(this.field_2d29f1_aFZ, this.field_388da3_zGp, this.field_20b854_DyG, 1.0f));
            GL11.glNormal3f(0.0f, -1.0f, 0.0f);
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            int n2 = lqj.method_33813bbe_Dne(this.field_493682ed_Dne.field_36ebf36_Dne, fUH, f);
            if (fUH.method_857f23ec_Dne(SXd.field_3286ff53_trS)) {
                float f2 = 5.0f;
                int n3 = fUH.method_a7927c94_Dne(SXd.field_3286ff53_trS).method_7c6f602c_FWm();
                if (n3 < 20) {
                    f2 = 5.0f + (this.field_2f0dd5_div - 5.0f) * (1.0f - (float)n3 / 20.0f);
                }
                GL11.glFogi(2917, 9729);
                if (n < 0) {
                    GL11.glFogf(2915, 0.0f);
                    GL11.glFogf(2916, f2 * 0.8f);
                } else {
                    GL11.glFogf(2915, f2 * 0.25f);
                    GL11.glFogf(2916, f2);
                }
                if (GLContext.getCapabilities().GL_NV_fog_distance) {
                    GL11.glFogi(34138, 34139);
                }
            } else if (this.field_21261e_FWm) {
                GL11.glFogi(2917, 2048);
                GL11.glFogf(2914, 0.1f);
                float f3 = 1.0f;
                float f4 = 1.0f;
                float f5 = 1.0f;
                if (this.field_493682ed_Dne.field_3758af7_Dne.field_2e5f2c_bzF) {
                    float f6 = (f3 * 30.0f + f4 * 59.0f + f5 * 11.0f) / 100.0f;
                    float f7 = (f3 * 30.0f + f4 * 70.0f) / 100.0f;
                    float f8 = (f3 * 30.0f + f5 * 70.0f) / 100.0f;
                }
            } else if (n2 > 0 && zKP.field_8374b848_Dne[n2].field_368fd23_Dne == KFd.field_1411d34d_div) {
                GL11.glFogi(2917, 2048);
                if (fUH.method_857f23ec_Dne(SXd.field_aefd8c28_udO)) {
                    GL11.glFogf(2914, 0.05f);
                } else {
                    GL11.glFogf(2914, 0.1f);
                }
                float f9 = 0.4f;
                float f10 = 0.4f;
                float f11 = 0.9f;
                if (this.field_493682ed_Dne.field_3758af7_Dne.field_2e5f2c_bzF) {
                    float f12 = (f9 * 30.0f + f10 * 59.0f + f11 * 11.0f) / 100.0f;
                    float f13 = (f9 * 30.0f + f10 * 70.0f) / 100.0f;
                    float f14 = (f9 * 30.0f + f11 * 70.0f) / 100.0f;
                }
            } else if (n2 > 0 && zKP.field_8374b848_Dne[n2].field_368fd23_Dne == KFd.field_5b96677_IjH) {
                GL11.glFogi(2917, 2048);
                GL11.glFogf(2914, 2.0f);
                float f15 = 0.4f;
                float f16 = 0.3f;
                float f17 = 0.3f;
                if (this.field_493682ed_Dne.field_3758af7_Dne.field_2e5f2c_bzF) {
                    float f18 = (f15 * 30.0f + f16 * 59.0f + f17 * 11.0f) / 100.0f;
                    float f19 = (f15 * 30.0f + f16 * 70.0f) / 100.0f;
                    float f20 = (f15 * 30.0f + f17 * 70.0f) / 100.0f;
                }
            } else {
                double d;
                float f21 = this.field_2f0dd5_div;
                if (this.field_493682ed_Dne.field_36ebf36_Dne.field_3690d00_Dne.method_907a9d25_Qnq() && !bl && (d = (double)((fUH.method_ce7f5259_Dne(f) & 0xF00000) >> 20) / 16.0 + (fUH.field_34225f_ooe + (fUH.field_22c5fd_IjH - fUH.field_34225f_ooe) * (double)f + 4.0) / 32.0) < 1.0) {
                    float f22;
                    if (d < 0.0) {
                        d = 0.0;
                    }
                    if ((f22 = 100.0f * (float)(d *= d)) < 5.0f) {
                        f22 = 5.0f;
                    }
                    if (f21 > f22) {
                        f21 = f22;
                    }
                }
                GL11.glFogi(2917, 9729);
                if (n < 0) {
                    GL11.glFogf(2915, 0.0f);
                    GL11.glFogf(2916, f21 * 0.8f);
                } else {
                    GL11.glFogf(2915, f21 * 0.25f);
                    GL11.glFogf(2916, f21);
                }
                if (GLContext.getCapabilities().GL_NV_fog_distance) {
                    GL11.glFogi(34138, 34139);
                }
                if (this.field_493682ed_Dne.field_36ebf36_Dne.field_3690d00_Dne.method_1e26965d_FWm((int)fUH.field_2f0dd3_div, (int)fUH.field_334487_mrb)) {
                    GL11.glFogf(2915, f21 * 0.05f);
                    GL11.glFogf(2916, Math.min(f21, 192.0f) * 0.5f);
                }
            }
            GL11.glEnable(2903);
            GL11.glColorMaterial(1028, 4608);
        }
    }

    public void method_7c6f6039_FWm() {
        IJm iJm = new IJm(this.field_493682ed_Dne.field_3758af7_Dne, this.field_493682ed_Dne.field_2092ae_Dne, this.field_493682ed_Dne.field_21260d_FWm);
        GL11.glClear(256);
        GL11.glMatrixMode(5889);
        GL11.glLoadIdentity();
        GL11.glOrtho(0.0, iJm.method_7a462888_Dne(), iJm.method_7c6f6027_FWm(), 0.0, 1000.0, 3000.0);
        GL11.glMatrixMode(5888);
        GL11.glLoadIdentity();
        GL11.glTranslatef(0.0f, 0.0f, -2000.0f);
    }

    private float method_961e776d_Dne(FiG fiG, float f) {
        int n = fiG.method_a7927c94_Dne(SXd.field_1f01d471_qLR).method_7c6f602c_FWm();
        return n > 200 ? 1.0f : 0.7f + geR.method_ce7f5256_Dne(((float)n - f) * (float)Math.PI * 0.2f) * 0.3f;
    }

    private void method_7ed96ebf_Qnq(float f) {
        float f2;
        FUH fUH = this.field_493682ed_Dne.field_366ec33_Dne;
        float f3 = (float)fUH.field_2569d5_OdI - f;
        if (fUH.method_9a443a8c_XHL() <= 0) {
            f2 = (float)fUH.field_36e4da_vSL + f;
            GL11.glRotatef(40.0f - 8000.0f / (f2 + 200.0f), 0.0f, 0.0f, 1.0f);
        }
        if (f3 >= 0.0f) {
            f3 /= (float)fUH.field_3393dd_oIf;
            f3 = geR.method_ce7f5256_Dne(f3 * f3 * f3 * f3 * (float)Math.PI);
            f2 = fUH.field_2f0273_eHV;
            GL11.glRotatef(-f2, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(-f3 * 14.0f, 0.0f, 0.0f, 1.0f);
            GL11.glRotatef(f2, 0.0f, 1.0f, 0.0f);
        }
    }

    private void method_907a9d21_Qnq() {
        this.field_21260a_FWm = (float)((double)this.field_21260a_FWm + (Math.random() - Math.random()) * Math.random() * Math.random());
        this.field_267cf2_Qnq = (float)((double)this.field_267cf2_Qnq + (Math.random() - Math.random()) * Math.random() * Math.random());
        this.field_21260a_FWm = (float)((double)this.field_21260a_FWm * 0.9);
        this.field_267cf2_Qnq = (float)((double)this.field_267cf2_Qnq * 0.9);
        this.field_2092ab_Dne += (this.field_21260a_FWm - this.field_2092ab_Dne) * 1.0f;
        this.field_2e5f18_bzF += (this.field_267cf2_Qnq - this.field_2e5f18_bzF) * 1.0f;
        this.field_2e5f2c_bzF = true;
    }

    public void method_ce7f5266_Dne(float f) {
        if (this.field_493682ed_Dne.field_366ec33_Dne != null && this.field_493682ed_Dne.field_36ebf36_Dne != null) {
            this.field_493682ed_Dne.field_2020b812_FWm = null;
            double d = this.field_493682ed_Dne.field_36c390e_Dne.method_7a46288a_Dne();
            this.field_493682ed_Dne.field_37d0195_Dne = this.field_493682ed_Dne.field_366ec33_Dne.method_ea40afb6_Dne(d, f);
            double d2 = d;
            chN chN2 = this.field_493682ed_Dne.field_366ec33_Dne.method_ffc5552e_Dne(f);
            if (this.field_493682ed_Dne.field_36c390e_Dne.method_d44b4596_zGp()) {
                d = 6.0;
                d2 = 6.0;
            } else {
                if (d > 3.0) {
                    d2 = 3.0;
                }
                d = d2;
            }
            if (this.field_493682ed_Dne.field_37d0195_Dne != null) {
                d2 = this.field_493682ed_Dne.field_37d0195_Dne.field_3746303_Dne.method_7af7d96d_FWm(chN2);
            }
            chN chN3 = this.field_493682ed_Dne.field_366ec33_Dne.method_d91908ef_FWm(f);
            chN chN4 = chN2.method_2c4d3b9f_bzF(chN3.field_2092a9_Dne * d, chN3.field_212608_FWm * d, chN3.field_2e5f16_bzF * d);
            this.field_37b45e5_Dne = null;
            float f2 = 1.0f;
            List list = this.field_493682ed_Dne.field_36ebf36_Dne.method_71df22e6_FWm(this.field_493682ed_Dne.field_366ec33_Dne, this.field_493682ed_Dne.field_366ec33_Dne.field_373a3ed_Dne.method_e44f9e56_Dne(chN3.field_2092a9_Dne * d, chN3.field_212608_FWm * d, chN3.field_2e5f16_bzF * d).method_b78565d7_FWm(f2, f2, f2));
            double d3 = d2;
            for (int i = 0; i < list.size(); ++i) {
                double d4;
                sMa sMa2 = (sMa)list.get(i);
                if (!sMa2.method_baa39406_kGO()) continue;
                float f3 = sMa2.method_907a9d11_Qnq();
                bSp bSp2 = sMa2.field_373a3ed_Dne.method_b78565d7_FWm(f3, f3, f3);
                wHH wHH2 = bSp2.method_38be674_Dne(chN2, chN4);
                if (bSp2.method_a1a425c2_Dne(chN2)) {
                    if (!(0.0 < d3) && d3 != 0.0) continue;
                    this.field_37b45e5_Dne = sMa2;
                    d3 = 0.0;
                    continue;
                }
                if (wHH2 == null || !((d4 = chN2.method_7af7d96d_FWm(wHH2.field_3746303_Dne)) < d3) && d3 != 0.0) continue;
                this.field_37b45e5_Dne = sMa2;
                d3 = d4;
            }
            if (this.field_37b45e5_Dne != null && (d3 < d2 || this.field_493682ed_Dne.field_37d0195_Dne == null)) {
                this.field_493682ed_Dne.field_37d0195_Dne = new wHH(this.field_37b45e5_Dne);
                if (this.field_37b45e5_Dne instanceof FUH) {
                    this.field_493682ed_Dne.field_2020b812_FWm = (FUH)this.field_37b45e5_Dne;
                }
            }
        }
    }

    public static int method_ce7f5d9c_Dne(int n) {
        int n2 = 200;
        if (n == 1) {
            n2 = 120;
        }
        if (n == 2) {
            n2 = 35;
        }
        return n2;
    }

    public void method_7a46289a_Dne() {
        float f;
        float f2;
        this.method_ae128dc7_bzF();
        this.method_907a9d21_Qnq();
        this.field_3649f6_tgc = this.field_34b5fe_qXo;
        this.field_334489_mrb = this.field_22c5ff_IjH;
        this.field_2a9ad3_Zpi = this.field_29186a_XHL;
        this.field_36b0a6_udO = this.field_31b813_kGO;
        this.field_212c18_EyB = this.field_2e8483_ceE;
        this.field_2569d2_OdI = this.field_215b33_FfS;
        if (this.field_493682ed_Dne.field_3758af7_Dne.field_3393ee_oIf) {
            f2 = this.field_493682ed_Dne.field_3758af7_Dne.field_2e5f18_bzF * 0.6f + 0.2f;
            f = f2 * f2 * f2 * 8.0f;
            this.field_34856f_qLR = this.field_3782b66_Dne.method_16b620a_Dne(this.field_342261_ooe, 0.05f * f);
            this.field_1ed014_ATE = this.field_2031f745_FWm.method_16b620a_Dne(this.field_367151_trS, 0.05f * f);
            this.field_28e7fa_Vxn = 0.0f;
            this.field_342261_ooe = 0.0f;
            this.field_367151_trS = 0.0f;
        }
        if (this.field_493682ed_Dne.field_366ec33_Dne == null) {
            this.field_493682ed_Dne.field_366ec33_Dne = this.field_493682ed_Dne.field_369f6b6_Dne;
        }
        f2 = this.field_493682ed_Dne.field_36ebf36_Dne.method_2c2cf7b9_Dne(geR.method_117d0718_FWm(this.field_493682ed_Dne.field_366ec33_Dne.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_493682ed_Dne.field_366ec33_Dne.field_22c5fd_IjH), geR.method_117d0718_FWm(this.field_493682ed_Dne.field_366ec33_Dne.field_334487_mrb));
        f = (float)(3 - this.field_493682ed_Dne.field_3758af7_Dne.field_2092ae_Dne) / 3.0f;
        float f3 = f2 * (1.0f - f) + f;
        this.field_34b5fe_qXo += (f3 - this.field_34b5fe_qXo) * 0.1f;
        ++this.field_388da6_zGp;
        this.field_36fa224_Dne.method_7a46289a_Dne();
        this.method_a98a0660_aFZ();
        this.field_307844_gnI = this.field_217c23_Fnk;
        if (mwX.field_2092bf_Dne) {
            this.field_217c23_Fnk += 0.05f;
            if (this.field_217c23_Fnk > 1.0f) {
                this.field_217c23_Fnk = 1.0f;
            }
            mwX.field_2092bf_Dne = false;
        } else if (this.field_217c23_Fnk > 0.0f) {
            this.field_217c23_Fnk -= 0.0125f;
        }
    }

    private void method_ae128dc7_bzF() {
        FKB fKB = (FKB)this.field_493682ed_Dne.field_366ec33_Dne;
        this.field_26818c_RPx = fKB.method_582b287_a_();
        this.field_36e4d7_vSL = this.field_3393da_oIf;
        this.field_3393da_oIf += (this.field_26818c_RPx - this.field_3393da_oIf) * 0.5f;
        if (this.field_3393da_oIf > 1.5f) {
            this.field_3393da_oIf = 1.5f;
        }
        if (this.field_3393da_oIf < 0.1f) {
            this.field_3393da_oIf = 0.1f;
        }
    }
}

