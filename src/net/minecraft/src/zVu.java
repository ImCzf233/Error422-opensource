package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class zVu {
    private int field_36b0a9_udO;
    private int field_2e5f1b_bzF = 0;
    private float field_26818c_RPx;
    private int field_2a9ad6_Zpi;
    private int field_36e4da_vSL;
    private float field_20b854_DyG;
    private float field_342261_ooe;
    public Zpi field_3706cf9_Dne;
    private float field_36e4d7_vSL;
    private float field_3393da_oIf;
    private int field_342264_ooe;
    private boolean field_2e5f2c_bzF = false;
    private float field_22c5ff_IjH;
    private float field_1f1786_AgF;
    public boolean field_21261e_FWm = true;
    private int field_29186d_XHL;
    private int field_348572_qLR;
    private float field_3649f6_tgc;
    private double field_388da1_zGp;
    private gDn field_375b13b_Dne = null;
    private float field_21260a_FWm;
    private int field_26818f_RPx;
    private int field_3393dd_oIf;
    private int field_2092ae_Dne = 0;
    private float field_1ed014_ATE;
    private float field_2092ab_Dne;
    private int field_2d29f4_aFZ = 0;
    private double field_212608_FWm;
    private int field_215b36_FfS;
    private float field_217c23_Fnk;
    private int field_1ed017_ATE;
    private final Minecraft field_493682ed_Dne;
    private float field_2a9ad3_Zpi;
    private int field_21260d_FWm = 0;
    private double field_2e5f16_bzF;
    private int field_2e8486_ceE;
    private float field_267cf2_Qnq;
    private double field_2092a9_Dne;
    private int field_33448c_mrb;
    private float field_367151_trS;
    private int field_2f0dd8_div;
    private boolean field_20b868_DyG;
    private float field_31b813_kGO;
    private boolean field_2d2a05_aFZ = false;
    private float field_36b0a6_udO;
    private int field_28e7fd_Vxn;
    private int field_367154_trS;
    private boolean field_388db7_zGp = false;
    private float field_29186a_XHL;
    private float field_2f0dd5_div;
    private int field_3649f9_tgc;
    private float field_215b33_FfS;
    private float field_34b5fe_qXo;
    private float field_383100_yMz;
    private int field_2569d5_OdI;
    private int field_31b816_kGO;
    private float field_34856f_qLR;
    private float field_307844_gnI;
    private float field_2e8483_ceE;
    private boolean field_267d06_Qnq = false;
    private int field_20b857_DyG;
    private double field_2d29ef_aFZ;
    private float field_28e7fa_Vxn;
    private int field_34b601_qXo;
    private float field_2d29f1_aFZ;
    private float field_388da3_zGp;
    private int field_267cf5_Qnq = 0;
    private int field_22c602_IjH;
    private int field_388da6_zGp = 0;
    public static boolean field_2092bf_Dne = true;
    private float field_2e5f18_bzF;
    private int field_212c1b_EyB;
    private float field_334489_mrb;
    private float field_2569d2_OdI;
    private int field_217c26_Fnk;
    private double field_267cf0_Qnq;
    private int field_307847_gnI;
    private float field_212c18_EyB;

    public void method_3fc2d5c2_zGp(zKP zKP2, double d, double d2, double d3, gDn gDn2) {
        double d4;
        WAR wAR = WAR.field_36e5ca4_Dne;
        if (this.method_7a46289e_Dne()) {
            gDn2 = this.field_375b13b_Dne;
        }
        double d5 = gDn2.method_ce7f4ad4_Dne(this.field_2d29ef_aFZ * 16.0);
        double d6 = gDn2.method_ce7f4ad4_Dne(this.field_388da1_zGp * 16.0);
        double d7 = gDn2.method_117d0715_FWm(16.0 - this.field_267cf0_Qnq * 16.0);
        double d8 = gDn2.method_117d0715_FWm(16.0 - this.field_2e5f16_bzF * 16.0);
        if (this.field_2e5f2c_bzF) {
            d4 = d5;
            d5 = d6;
            d6 = d4;
        }
        if (this.field_2d29ef_aFZ < 0.0 || this.field_388da1_zGp > 1.0) {
            d5 = gDn2.method_7a46288a_Dne();
            d6 = gDn2.method_7c6f6029_FWm();
        }
        if (this.field_2e5f16_bzF < 0.0 || this.field_267cf0_Qnq > 1.0) {
            d7 = gDn2.method_ae128db7_bzF();
            d8 = gDn2.method_907a9d11_Qnq();
        }
        d4 = d6;
        double d9 = d5;
        double d10 = d7;
        double d11 = d8;
        if (this.field_2e5f1b_bzF == 2) {
            d5 = gDn2.method_ce7f4ad4_Dne(this.field_2e5f16_bzF * 16.0);
            d7 = gDn2.method_117d0715_FWm(16.0 - this.field_2d29ef_aFZ * 16.0);
            d6 = gDn2.method_ce7f4ad4_Dne(this.field_267cf0_Qnq * 16.0);
            d8 = gDn2.method_117d0715_FWm(16.0 - this.field_388da1_zGp * 16.0);
            d10 = d7;
            d11 = d8;
            d4 = d5;
            d9 = d6;
            d7 = d8;
            d8 = d10;
        } else if (this.field_2e5f1b_bzF == 1) {
            d5 = gDn2.method_ce7f4ad4_Dne(16.0 - this.field_267cf0_Qnq * 16.0);
            d7 = gDn2.method_117d0715_FWm(this.field_388da1_zGp * 16.0);
            d6 = gDn2.method_ce7f4ad4_Dne(16.0 - this.field_2e5f16_bzF * 16.0);
            d8 = gDn2.method_117d0715_FWm(this.field_2d29ef_aFZ * 16.0);
            d4 = d6;
            d9 = d5;
            d5 = d6;
            d6 = d9;
            d10 = d8;
            d11 = d7;
        } else if (this.field_2e5f1b_bzF == 3) {
            d5 = gDn2.method_ce7f4ad4_Dne(16.0 - this.field_2d29ef_aFZ * 16.0);
            d6 = gDn2.method_ce7f4ad4_Dne(16.0 - this.field_388da1_zGp * 16.0);
            d7 = gDn2.method_117d0715_FWm(this.field_267cf0_Qnq * 16.0);
            d8 = gDn2.method_117d0715_FWm(this.field_2e5f16_bzF * 16.0);
            d4 = d6;
            d9 = d5;
            d10 = d7;
            d11 = d8;
        }
        double d12 = d + this.field_212608_FWm;
        double d13 = d2 + this.field_2e5f16_bzF;
        double d14 = d2 + this.field_267cf0_Qnq;
        double d15 = d3 + this.field_2d29ef_aFZ;
        double d16 = d3 + this.field_388da1_zGp;
        if (this.field_20b868_DyG) {
            wAR.method_2c0148e6_Dne(this.field_212c18_EyB, this.field_36e4d7_vSL, this.field_3649f6_tgc);
            wAR.method_117d19ea_FWm(this.field_217c26_Fnk);
            wAR.method_c38c5864_Dne(d12, d13, d16, d9, d11);
            wAR.method_2c0148e6_Dne(this.field_215b33_FfS, this.field_26818c_RPx, this.field_34b5fe_qXo);
            wAR.method_117d19ea_FWm(this.field_307847_gnI);
            wAR.method_c38c5864_Dne(d12, d13, d15, d6, d8);
            wAR.method_2c0148e6_Dne(this.field_2569d2_OdI, this.field_217c23_Fnk, this.field_1f1786_AgF);
            wAR.method_117d19ea_FWm(this.field_3649f9_tgc);
            wAR.method_c38c5864_Dne(d12, d14, d15, d4, d10);
            wAR.method_2c0148e6_Dne(this.field_3393da_oIf, this.field_307844_gnI, this.field_383100_yMz);
            wAR.method_117d19ea_FWm(this.field_34b601_qXo);
            wAR.method_c38c5864_Dne(d12, d14, d16, d5, d7);
        } else {
            wAR.method_c38c5864_Dne(d12, d13, d16, d9, d11);
            wAR.method_c38c5864_Dne(d12, d13, d15, d6, d8);
            wAR.method_c38c5864_Dne(d12, d14, d15, d4, d10);
            wAR.method_c38c5864_Dne(d12, d14, d16, d5, d7);
        }
    }

    public void method_70206fb9_Dne(zKP zKP2, int n, int n2, int n3, boolean bl) {
        this.field_267d06_Qnq = true;
        this.method_4d025afe_FWm(zKP2, n, n2, n3, bl);
        this.field_267d06_Qnq = false;
    }

    public boolean method_265bacd3_IjH(zKP zKP2, int n, int n2, int n3) {
        WAR wAR = WAR.field_36e5ca4_Dne;
        wAR.method_117d19ea_FWm(zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3));
        float f = 1.0f;
        int n4 = zKP2.method_fbabf7e2_Dne(this.field_3706cf9_Dne, n, n2, n3);
        float f2 = (float)(n4 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n4 >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n4 & 0xFF) / 255.0f;
        if (OEA.field_2092bf_Dne) {
            float f5 = (f2 * 30.0f + f3 * 59.0f + f4 * 11.0f) / 100.0f;
            float f6 = (f2 * 30.0f + f3 * 70.0f) / 100.0f;
            float f7 = (f2 * 30.0f + f4 * 70.0f) / 100.0f;
            f2 = f5;
            f3 = f6;
            f4 = f7;
        }
        wAR.method_2c0148e6_Dne(f * f2, f * f3, f * f4);
        double d = n;
        double d2 = n2;
        double d3 = n3;
        if (zKP2 == zKP.field_36dc147_Dne) {
            long l = (long)(n * 3129871) ^ (long)n3 * 116129781L ^ (long)n2;
            l = l * l * 42317861L + l * 11L;
            d += ((double)((float)(l >> 16 & 0xFL) / 15.0f) - 0.5) * 0.5;
            d2 += ((double)((float)(l >> 20 & 0xFL) / 15.0f) - 1.0) * 0.2;
            d3 += ((double)((float)(l >> 24 & 0xFL) / 15.0f) - 0.5) * 0.5;
        }
        this.method_8b153e5d_Dne(zKP2, this.field_3706cf9_Dne.method_2dee76f_bzF(n, n2, n3), d, d2, d3, 1.0f);
        return true;
    }

    public boolean method_bb0e88a7_Zpi(zKP zKP2, int n, int n2, int n3) {
        WAR wAR = WAR.field_36e5ca4_Dne;
        gDn gDn2 = this.method_5d830b5b_Dne(zKP2, 1);
        if (this.method_7a46289e_Dne()) {
            gDn2 = this.field_375b13b_Dne;
        }
        float f = 0.015625f;
        double d = gDn2.method_7a46288a_Dne();
        double d2 = gDn2.method_ae128db7_bzF();
        double d3 = gDn2.method_7c6f6029_FWm();
        double d4 = gDn2.method_907a9d11_Qnq();
        long l = (long)(n * 3129871) ^ (long)n3 * 116129781L ^ (long)n2;
        l = l * l * 42317861L + l * 11L;
        int n4 = (int)(l >> 16 & 3L);
        wAR.method_117d19ea_FWm(zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3));
        float f2 = (float)n + 0.5f;
        float f3 = (float)n3 + 0.5f;
        float f4 = (float)(n4 & 1) * 0.5f * (float)(1 - n4 / 2 % 2 * 2);
        float f5 = (float)(n4 + 1 & 1) * 0.5f * (float)(1 - (n4 + 1) / 2 % 2 * 2);
        wAR.method_143f9e1c_bzF(zKP2.method_590ca0b_b_());
        wAR.method_c38c5864_Dne(f2 + f4 - f5, (float)n2 + f, f3 + f4 + f5, d, d2);
        wAR.method_c38c5864_Dne(f2 + f4 + f5, (float)n2 + f, f3 - f4 + f5, d3, d2);
        wAR.method_c38c5864_Dne(f2 - f4 + f5, (float)n2 + f, f3 - f4 - f5, d3, d4);
        wAR.method_c38c5864_Dne(f2 - f4 - f5, (float)n2 + f, f3 + f4 - f5, d, d4);
        wAR.method_143f9e1c_bzF((zKP2.method_590ca0b_b_() & 0xFEFEFE) >> 1);
        wAR.method_c38c5864_Dne(f2 - f4 - f5, (float)n2 + f, f3 + f4 - f5, d, d4);
        wAR.method_c38c5864_Dne(f2 - f4 + f5, (float)n2 + f, f3 - f4 - f5, d3, d4);
        wAR.method_c38c5864_Dne(f2 + f4 + f5, (float)n2 + f, f3 - f4 + f5, d3, d2);
        wAR.method_c38c5864_Dne(f2 + f4 - f5, (float)n2 + f, f3 + f4 + f5, d, d2);
        return true;
    }

    public void method_a68ac5f6_Dne(gDn gDn2) {
        this.field_375b13b_Dne = gDn2;
    }

    public boolean method_2ac99006_Qnq(zKP zKP2, int n, int n2, int n3) {
        int n4;
        WAR wAR = WAR.field_36e5ca4_Dne;
        int n5 = this.field_3706cf9_Dne.method_2dee76f_bzF(n, n2, n3);
        int n6 = n5 & 3;
        boolean bl = (n5 & 4) == 4;
        boolean bl2 = (n5 & 8) == 8;
        boolean bl3 = !this.field_3706cf9_Dne.method_73e9b8f9_IjH(n, n2 - 1, n3);
        boolean bl4 = this.method_7a46289e_Dne();
        if (!bl4) {
            this.method_a68ac5f6_Dne(this.method_39bcfb28_Dne(zKP.field_5e67d9b4_Qnq));
        }
        float f = 0.25f;
        float f2 = 0.125f;
        float f3 = 0.125f;
        float f4 = 0.3f - f;
        float f5 = 0.3f + f;
        if (n6 == 2) {
            this.method_adff145a_Dne(0.5f - f2, f4, 1.0f - f3, 0.5f + f2, f5, 1.0);
        } else if (n6 == 0) {
            this.method_adff145a_Dne(0.5f - f2, f4, 0.0, 0.5f + f2, f5, f3);
        } else if (n6 == 1) {
            this.method_adff145a_Dne(1.0f - f3, f4, 0.5f - f2, 1.0, f5, 0.5f + f2);
        } else if (n6 == 3) {
            this.method_adff145a_Dne(0.0, f4, 0.5f - f2, f3, f5, 0.5f + f2);
        }
        this.method_9743b2ba_udO(zKP2, n, n2, n3);
        if (!bl4) {
            this.method_7a46289a_Dne();
        }
        wAR.method_117d19ea_FWm(zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3));
        float f6 = 1.0f;
        if (zKP.field_59d86bc_bzF[zKP2.field_21260d_FWm] > 0) {
            f6 = 1.0f;
        }
        wAR.method_2c0148e6_Dne(f6, f6, f6);
        gDn gDn2 = this.method_5d830b5b_Dne(zKP2, 0);
        if (this.method_7a46289e_Dne()) {
            gDn2 = this.field_375b13b_Dne;
        }
        double d = gDn2.method_7a46288a_Dne();
        double d2 = gDn2.method_ae128db7_bzF();
        double d3 = gDn2.method_7c6f6029_FWm();
        double d4 = gDn2.method_907a9d11_Qnq();
        chN[] chNArray = new chN[8];
        float f7 = 0.046875f;
        float f8 = 0.046875f;
        float f9 = 0.3125f;
        chNArray[0] = this.field_3706cf9_Dne.method_23186a47_Dne().method_e4505d6c_Dne(-f7, 0.0, -f8);
        chNArray[1] = this.field_3706cf9_Dne.method_23186a47_Dne().method_e4505d6c_Dne(f7, 0.0, -f8);
        chNArray[2] = this.field_3706cf9_Dne.method_23186a47_Dne().method_e4505d6c_Dne(f7, 0.0, f8);
        chNArray[3] = this.field_3706cf9_Dne.method_23186a47_Dne().method_e4505d6c_Dne(-f7, 0.0, f8);
        chNArray[4] = this.field_3706cf9_Dne.method_23186a47_Dne().method_e4505d6c_Dne(-f7, f9, -f8);
        chNArray[5] = this.field_3706cf9_Dne.method_23186a47_Dne().method_e4505d6c_Dne(f7, f9, -f8);
        chNArray[6] = this.field_3706cf9_Dne.method_23186a47_Dne().method_e4505d6c_Dne(f7, f9, f8);
        chNArray[7] = this.field_3706cf9_Dne.method_23186a47_Dne().method_e4505d6c_Dne(-f7, f9, f8);
        for (int i = 0; i < 8; ++i) {
            chNArray[i].field_2e5f16_bzF += 0.0625;
            if (bl2) {
                chNArray[i].method_ce7f5266_Dne(0.5235988f);
                chNArray[i].field_212608_FWm -= 0.4375;
            } else if (bl) {
                chNArray[i].method_ce7f5266_Dne(0.08726647f);
                chNArray[i].field_212608_FWm -= 0.4375;
            } else {
                chNArray[i].method_ce7f5266_Dne(-0.69813174f);
                chNArray[i].field_212608_FWm -= 0.375;
            }
            chNArray[i].method_ce7f5266_Dne(1.5707964f);
            if (n6 == 2) {
                chNArray[i].method_117d0ea7_FWm(0.0f);
            }
            if (n6 == 0) {
                chNArray[i].method_117d0ea7_FWm((float)Math.PI);
            }
            if (n6 == 1) {
                chNArray[i].method_117d0ea7_FWm(1.5707964f);
            }
            if (n6 == 3) {
                chNArray[i].method_117d0ea7_FWm(-1.5707964f);
            }
            chNArray[i].field_2092a9_Dne += (double)n + 0.5;
            chNArray[i].field_212608_FWm += (double)((float)n2 + 0.3125f);
            chNArray[i].field_2e5f16_bzF += (double)n3 + 0.5;
        }
        chN chN2 = null;
        chN chN3 = null;
        chN chN4 = null;
        chN chN5 = null;
        int n7 = 7;
        int n8 = 9;
        int n9 = 9;
        int n10 = 16;
        for (int i = 0; i < 6; ++i) {
            if (i == 0) {
                chN2 = chNArray[0];
                chN3 = chNArray[1];
                chN4 = chNArray[2];
                chN5 = chNArray[3];
                d = gDn2.method_ce7f4ad4_Dne(n7);
                d2 = gDn2.method_117d0715_FWm(n9);
                d3 = gDn2.method_ce7f4ad4_Dne(n8);
                d4 = gDn2.method_117d0715_FWm(n9 + 2);
            } else if (i == 1) {
                chN2 = chNArray[7];
                chN3 = chNArray[6];
                chN4 = chNArray[5];
                chN5 = chNArray[4];
            } else if (i == 2) {
                chN2 = chNArray[1];
                chN3 = chNArray[0];
                chN4 = chNArray[4];
                chN5 = chNArray[5];
                d = gDn2.method_ce7f4ad4_Dne(n7);
                d2 = gDn2.method_117d0715_FWm(n9);
                d3 = gDn2.method_ce7f4ad4_Dne(n8);
                d4 = gDn2.method_117d0715_FWm(n10);
            } else if (i == 3) {
                chN2 = chNArray[2];
                chN3 = chNArray[1];
                chN4 = chNArray[5];
                chN5 = chNArray[6];
            } else if (i == 4) {
                chN2 = chNArray[3];
                chN3 = chNArray[2];
                chN4 = chNArray[6];
                chN5 = chNArray[7];
            } else if (i == 5) {
                chN2 = chNArray[0];
                chN3 = chNArray[3];
                chN4 = chNArray[7];
                chN5 = chNArray[4];
            }
            wAR.method_c38c5864_Dne(chN2.field_2092a9_Dne, chN2.field_212608_FWm, chN2.field_2e5f16_bzF, d, d4);
            wAR.method_c38c5864_Dne(chN3.field_2092a9_Dne, chN3.field_212608_FWm, chN3.field_2e5f16_bzF, d3, d4);
            wAR.method_c38c5864_Dne(chN4.field_2092a9_Dne, chN4.field_212608_FWm, chN4.field_2e5f16_bzF, d3, d2);
            wAR.method_c38c5864_Dne(chN5.field_2092a9_Dne, chN5.field_212608_FWm, chN5.field_2e5f16_bzF, d, d2);
        }
        float f10 = 0.09375f;
        float f11 = 0.09375f;
        float f12 = 0.03125f;
        chNArray[0] = this.field_3706cf9_Dne.method_23186a47_Dne().method_e4505d6c_Dne(-f10, 0.0, -f11);
        chNArray[1] = this.field_3706cf9_Dne.method_23186a47_Dne().method_e4505d6c_Dne(f10, 0.0, -f11);
        chNArray[2] = this.field_3706cf9_Dne.method_23186a47_Dne().method_e4505d6c_Dne(f10, 0.0, f11);
        chNArray[3] = this.field_3706cf9_Dne.method_23186a47_Dne().method_e4505d6c_Dne(-f10, 0.0, f11);
        chNArray[4] = this.field_3706cf9_Dne.method_23186a47_Dne().method_e4505d6c_Dne(-f10, f12, -f11);
        chNArray[5] = this.field_3706cf9_Dne.method_23186a47_Dne().method_e4505d6c_Dne(f10, f12, -f11);
        chNArray[6] = this.field_3706cf9_Dne.method_23186a47_Dne().method_e4505d6c_Dne(f10, f12, f11);
        chNArray[7] = this.field_3706cf9_Dne.method_23186a47_Dne().method_e4505d6c_Dne(-f10, f12, f11);
        for (n4 = 0; n4 < 8; ++n4) {
            chNArray[n4].field_2e5f16_bzF += 0.21875;
            if (bl2) {
                chNArray[n4].field_212608_FWm -= 0.09375;
                chNArray[n4].field_2e5f16_bzF -= 0.1625;
                chNArray[n4].method_ce7f5266_Dne(0.0f);
            } else if (bl) {
                chNArray[n4].field_212608_FWm += 0.015625;
                chNArray[n4].field_2e5f16_bzF -= 0.171875;
                chNArray[n4].method_ce7f5266_Dne(0.17453294f);
            } else {
                chNArray[n4].method_ce7f5266_Dne(0.87266463f);
            }
            if (n6 == 2) {
                chNArray[n4].method_117d0ea7_FWm(0.0f);
            }
            if (n6 == 0) {
                chNArray[n4].method_117d0ea7_FWm((float)Math.PI);
            }
            if (n6 == 1) {
                chNArray[n4].method_117d0ea7_FWm(1.5707964f);
            }
            if (n6 == 3) {
                chNArray[n4].method_117d0ea7_FWm(-1.5707964f);
            }
            chNArray[n4].field_2092a9_Dne += (double)n + 0.5;
            chNArray[n4].field_212608_FWm += (double)((float)n2 + 0.3125f);
            chNArray[n4].field_2e5f16_bzF += (double)n3 + 0.5;
        }
        n4 = 5;
        int n11 = 11;
        int n12 = 3;
        int n13 = 9;
        for (int i = 0; i < 6; ++i) {
            if (i == 0) {
                chN2 = chNArray[0];
                chN3 = chNArray[1];
                chN4 = chNArray[2];
                chN5 = chNArray[3];
                d = gDn2.method_ce7f4ad4_Dne(n4);
                d2 = gDn2.method_117d0715_FWm(n12);
                d3 = gDn2.method_ce7f4ad4_Dne(n11);
                d4 = gDn2.method_117d0715_FWm(n13);
            } else if (i == 1) {
                chN2 = chNArray[7];
                chN3 = chNArray[6];
                chN4 = chNArray[5];
                chN5 = chNArray[4];
            } else if (i == 2) {
                chN2 = chNArray[1];
                chN3 = chNArray[0];
                chN4 = chNArray[4];
                chN5 = chNArray[5];
                d = gDn2.method_ce7f4ad4_Dne(n4);
                d2 = gDn2.method_117d0715_FWm(n12);
                d3 = gDn2.method_ce7f4ad4_Dne(n11);
                d4 = gDn2.method_117d0715_FWm(n12 + 2);
            } else if (i == 3) {
                chN2 = chNArray[2];
                chN3 = chNArray[1];
                chN4 = chNArray[5];
                chN5 = chNArray[6];
            } else if (i == 4) {
                chN2 = chNArray[3];
                chN3 = chNArray[2];
                chN4 = chNArray[6];
                chN5 = chNArray[7];
            } else if (i == 5) {
                chN2 = chNArray[0];
                chN3 = chNArray[3];
                chN4 = chNArray[7];
                chN5 = chNArray[4];
            }
            wAR.method_c38c5864_Dne(chN2.field_2092a9_Dne, chN2.field_212608_FWm, chN2.field_2e5f16_bzF, d, d4);
            wAR.method_c38c5864_Dne(chN3.field_2092a9_Dne, chN3.field_212608_FWm, chN3.field_2e5f16_bzF, d3, d4);
            wAR.method_c38c5864_Dne(chN4.field_2092a9_Dne, chN4.field_212608_FWm, chN4.field_2e5f16_bzF, d3, d2);
            wAR.method_c38c5864_Dne(chN5.field_2092a9_Dne, chN5.field_212608_FWm, chN5.field_2e5f16_bzF, d, d2);
        }
        if (bl) {
            double d5 = chNArray[0].field_212608_FWm;
            float f13 = 0.03125f;
            float f14 = 0.5f - f13 / 2.0f;
            float f15 = f14 + f13;
            gDn gDn3 = this.method_39bcfb28_Dne(zKP.field_9b24c8d5_lDk);
            double d6 = gDn2.method_7a46288a_Dne();
            double d7 = gDn2.method_117d0715_FWm(bl ? 2.0 : 0.0);
            double d8 = gDn2.method_7c6f6029_FWm();
            double d9 = gDn2.method_117d0715_FWm(bl ? 4.0 : 2.0);
            double d10 = (double)(bl3 ? 3.5f : 1.5f) / 16.0;
            f6 = zKP2.method_fbabf7df_Dne(this.field_3706cf9_Dne, n, n2, n3) * 0.75f;
            wAR.method_2c0148e6_Dne(f6, f6, f6);
            if (n6 == 2) {
                wAR.method_c38c5864_Dne((float)n + f14, (double)n2 + d10, (double)n3 + 0.25, d6, d7);
                wAR.method_c38c5864_Dne((float)n + f15, (double)n2 + d10, (double)n3 + 0.25, d6, d9);
                wAR.method_c38c5864_Dne((float)n + f15, (double)n2 + d10, n3, d8, d9);
                wAR.method_c38c5864_Dne((float)n + f14, (double)n2 + d10, n3, d8, d7);
                wAR.method_c38c5864_Dne((float)n + f14, d5, (double)n3 + 0.5, d6, d7);
                wAR.method_c38c5864_Dne((float)n + f15, d5, (double)n3 + 0.5, d6, d9);
                wAR.method_c38c5864_Dne((float)n + f15, (double)n2 + d10, (double)n3 + 0.25, d8, d9);
                wAR.method_c38c5864_Dne((float)n + f14, (double)n2 + d10, (double)n3 + 0.25, d8, d7);
            } else if (n6 == 0) {
                wAR.method_c38c5864_Dne((float)n + f14, (double)n2 + d10, (double)n3 + 0.75, d6, d7);
                wAR.method_c38c5864_Dne((float)n + f15, (double)n2 + d10, (double)n3 + 0.75, d6, d9);
                wAR.method_c38c5864_Dne((float)n + f15, d5, (double)n3 + 0.5, d8, d9);
                wAR.method_c38c5864_Dne((float)n + f14, d5, (double)n3 + 0.5, d8, d7);
                wAR.method_c38c5864_Dne((float)n + f14, (double)n2 + d10, n3 + 1, d6, d7);
                wAR.method_c38c5864_Dne((float)n + f15, (double)n2 + d10, n3 + 1, d6, d9);
                wAR.method_c38c5864_Dne((float)n + f15, (double)n2 + d10, (double)n3 + 0.75, d8, d9);
                wAR.method_c38c5864_Dne((float)n + f14, (double)n2 + d10, (double)n3 + 0.75, d8, d7);
            } else if (n6 == 1) {
                wAR.method_c38c5864_Dne(n, (double)n2 + d10, (float)n3 + f15, d6, d9);
                wAR.method_c38c5864_Dne((double)n + 0.25, (double)n2 + d10, (float)n3 + f15, d8, d9);
                wAR.method_c38c5864_Dne((double)n + 0.25, (double)n2 + d10, (float)n3 + f14, d8, d7);
                wAR.method_c38c5864_Dne(n, (double)n2 + d10, (float)n3 + f14, d6, d7);
                wAR.method_c38c5864_Dne((double)n + 0.25, (double)n2 + d10, (float)n3 + f15, d6, d9);
                wAR.method_c38c5864_Dne((double)n + 0.5, d5, (float)n3 + f15, d8, d9);
                wAR.method_c38c5864_Dne((double)n + 0.5, d5, (float)n3 + f14, d8, d7);
                wAR.method_c38c5864_Dne((double)n + 0.25, (double)n2 + d10, (float)n3 + f14, d6, d7);
            } else {
                wAR.method_c38c5864_Dne((double)n + 0.5, d5, (float)n3 + f15, d6, d9);
                wAR.method_c38c5864_Dne((double)n + 0.75, (double)n2 + d10, (float)n3 + f15, d8, d9);
                wAR.method_c38c5864_Dne((double)n + 0.75, (double)n2 + d10, (float)n3 + f14, d8, d7);
                wAR.method_c38c5864_Dne((double)n + 0.5, d5, (float)n3 + f14, d6, d7);
                wAR.method_c38c5864_Dne((double)n + 0.75, (double)n2 + d10, (float)n3 + f15, d6, d9);
                wAR.method_c38c5864_Dne(n + 1, (double)n2 + d10, (float)n3 + f15, d8, d9);
                wAR.method_c38c5864_Dne(n + 1, (double)n2 + d10, (float)n3 + f14, d8, d7);
                wAR.method_c38c5864_Dne((double)n + 0.75, (double)n2 + d10, (float)n3 + f14, d6, d7);
            }
        }
        return true;
    }

    private boolean method_94c5dd35_Dne(SrC srC, int n, int n2, int n3, int n4, boolean bl) {
        float f;
        WAR wAR = WAR.field_36e5ca4_Dne;
        int n5 = SrC.method_143f9e0f_bzF(n4);
        double d = 0.625;
        this.method_adff145a_Dne(0.0, d, 0.0, 1.0, 1.0, 1.0);
        if (bl) {
            wAR.method_7a46289a_Dne();
            wAR.method_a680f8e7_FWm(0.0f, -1.0f, 0.0f);
            this.method_58bf1fba_Dne(srC, 0.0, 0.0, 0.0, this.method_b27f0188_Dne(srC, 0, n4));
            wAR.method_7a46288d_Dne();
            wAR.method_7a46289a_Dne();
            wAR.method_a680f8e7_FWm(0.0f, 1.0f, 0.0f);
            this.method_d047827b_FWm(srC, 0.0, 0.0, 0.0, this.method_b27f0188_Dne(srC, 1, n4));
            wAR.method_7a46288d_Dne();
            wAR.method_7a46289a_Dne();
            wAR.method_a680f8e7_FWm(0.0f, 0.0f, -1.0f);
            this.method_e4fb4bad_bzF(srC, 0.0, 0.0, 0.0, this.method_b27f0188_Dne(srC, 2, n4));
            wAR.method_7a46288d_Dne();
            wAR.method_7a46289a_Dne();
            wAR.method_a680f8e7_FWm(0.0f, 0.0f, 1.0f);
            this.method_925c7e93_Qnq(srC, 0.0, 0.0, 0.0, this.method_b27f0188_Dne(srC, 3, n4));
            wAR.method_7a46288d_Dne();
            wAR.method_7a46289a_Dne();
            wAR.method_a680f8e7_FWm(-1.0f, 0.0f, 0.0f);
            this.method_76f453b4_aFZ(srC, 0.0, 0.0, 0.0, this.method_b27f0188_Dne(srC, 4, n4));
            wAR.method_7a46288d_Dne();
            wAR.method_7a46289a_Dne();
            wAR.method_a680f8e7_FWm(1.0f, 0.0f, 0.0f);
            this.method_3fc2d5c2_zGp(srC, 0.0, 0.0, 0.0, this.method_b27f0188_Dne(srC, 5, n4));
            wAR.method_7a46288d_Dne();
        } else {
            this.method_9743b2ba_udO(srC, n, n2, n3);
        }
        if (!bl) {
            wAR.method_117d19ea_FWm(srC.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3));
            float f2 = 1.0f;
            int n6 = srC.method_fbabf7e2_Dne(this.field_3706cf9_Dne, n, n2, n3);
            f = (float)(n6 >> 16 & 0xFF) / 255.0f;
            float f3 = (float)(n6 >> 8 & 0xFF) / 255.0f;
            float f4 = (float)(n6 & 0xFF) / 255.0f;
            if (OEA.field_2092bf_Dne) {
                float f5 = (f * 30.0f + f3 * 59.0f + f4 * 11.0f) / 100.0f;
                float f6 = (f * 30.0f + f3 * 70.0f) / 100.0f;
                float f7 = (f * 30.0f + f4 * 70.0f) / 100.0f;
                f = f5;
                f3 = f6;
                f4 = f7;
            }
            wAR.method_2c0148e6_Dne(f2 * f, f2 * f3, f2 * f4);
        }
        gDn gDn2 = SrC.method_285881e4_Dne("hopper");
        gDn gDn3 = SrC.method_285881e4_Dne("hopper_inside");
        f = 0.125f;
        if (bl) {
            wAR.method_7a46289a_Dne();
            wAR.method_a680f8e7_FWm(1.0f, 0.0f, 0.0f);
            this.method_3fc2d5c2_zGp(srC, -1.0f + f, 0.0, 0.0, gDn2);
            wAR.method_7a46288d_Dne();
            wAR.method_7a46289a_Dne();
            wAR.method_a680f8e7_FWm(-1.0f, 0.0f, 0.0f);
            this.method_76f453b4_aFZ(srC, 1.0f - f, 0.0, 0.0, gDn2);
            wAR.method_7a46288d_Dne();
            wAR.method_7a46289a_Dne();
            wAR.method_a680f8e7_FWm(0.0f, 0.0f, 1.0f);
            this.method_925c7e93_Qnq(srC, 0.0, 0.0, -1.0f + f, gDn2);
            wAR.method_7a46288d_Dne();
            wAR.method_7a46289a_Dne();
            wAR.method_a680f8e7_FWm(0.0f, 0.0f, -1.0f);
            this.method_e4fb4bad_bzF(srC, 0.0, 0.0, 1.0f - f, gDn2);
            wAR.method_7a46288d_Dne();
            wAR.method_7a46289a_Dne();
            wAR.method_a680f8e7_FWm(0.0f, 1.0f, 0.0f);
            this.method_d047827b_FWm(srC, 0.0, -1.0 + d, 0.0, gDn3);
            wAR.method_7a46288d_Dne();
        } else {
            this.method_3fc2d5c2_zGp(srC, (float)n - 1.0f + f, n2, n3, gDn2);
            this.method_76f453b4_aFZ(srC, (float)n + 1.0f - f, n2, n3, gDn2);
            this.method_925c7e93_Qnq(srC, n, n2, (float)n3 - 1.0f + f, gDn2);
            this.method_e4fb4bad_bzF(srC, n, n2, (float)n3 + 1.0f - f, gDn2);
            this.method_d047827b_FWm(srC, n, (double)((float)n2 - 1.0f) + d, n3, gDn3);
        }
        this.method_a68ac5f6_Dne(gDn2);
        double d2 = 0.25;
        double d3 = 0.25;
        this.method_adff145a_Dne(d2, d3, d2, 1.0 - d2, d - 0.002, 1.0 - d2);
        if (bl) {
            wAR.method_7a46289a_Dne();
            wAR.method_a680f8e7_FWm(1.0f, 0.0f, 0.0f);
            this.method_3fc2d5c2_zGp(srC, 0.0, 0.0, 0.0, gDn2);
            wAR.method_7a46288d_Dne();
            wAR.method_7a46289a_Dne();
            wAR.method_a680f8e7_FWm(-1.0f, 0.0f, 0.0f);
            this.method_76f453b4_aFZ(srC, 0.0, 0.0, 0.0, gDn2);
            wAR.method_7a46288d_Dne();
            wAR.method_7a46289a_Dne();
            wAR.method_a680f8e7_FWm(0.0f, 0.0f, 1.0f);
            this.method_925c7e93_Qnq(srC, 0.0, 0.0, 0.0, gDn2);
            wAR.method_7a46288d_Dne();
            wAR.method_7a46289a_Dne();
            wAR.method_a680f8e7_FWm(0.0f, 0.0f, -1.0f);
            this.method_e4fb4bad_bzF(srC, 0.0, 0.0, 0.0, gDn2);
            wAR.method_7a46288d_Dne();
            wAR.method_7a46289a_Dne();
            wAR.method_a680f8e7_FWm(0.0f, 1.0f, 0.0f);
            this.method_d047827b_FWm(srC, 0.0, 0.0, 0.0, gDn2);
            wAR.method_7a46288d_Dne();
            wAR.method_7a46289a_Dne();
            wAR.method_a680f8e7_FWm(0.0f, -1.0f, 0.0f);
            this.method_58bf1fba_Dne(srC, 0.0, 0.0, 0.0, gDn2);
            wAR.method_7a46288d_Dne();
        } else {
            this.method_9743b2ba_udO(srC, n, n2, n3);
        }
        if (!bl) {
            double d4 = 0.375;
            double d5 = 0.25;
            this.method_a68ac5f6_Dne(gDn2);
            if (n5 == 0) {
                this.method_adff145a_Dne(d4, 0.0, d4, 1.0 - d4, 0.25, 1.0 - d4);
                this.method_9743b2ba_udO(srC, n, n2, n3);
            }
            if (n5 == 2) {
                this.method_adff145a_Dne(d4, d3, 0.0, 1.0 - d4, d3 + d5, d2);
                this.method_9743b2ba_udO(srC, n, n2, n3);
            }
            if (n5 == 3) {
                this.method_adff145a_Dne(d4, d3, 1.0 - d2, 1.0 - d4, d3 + d5, 1.0);
                this.method_9743b2ba_udO(srC, n, n2, n3);
            }
            if (n5 == 4) {
                this.method_adff145a_Dne(0.0, d3, d4, d2, d3 + d5, 1.0 - d4);
                this.method_9743b2ba_udO(srC, n, n2, n3);
            }
            if (n5 == 5) {
                this.method_adff145a_Dne(1.0 - d2, d3, d4, 1.0, d3 + d5, 1.0 - d4);
                this.method_9743b2ba_udO(srC, n, n2, n3);
            }
        }
        this.method_7a46289a_Dne();
        return true;
    }

    public boolean method_e9b5bb1e_FWm(zKP zKP2, int n, int n2, int n3) {
        int n4 = this.field_3706cf9_Dne.method_2dee76f_bzF(n, n2, n3);
        WAR wAR = WAR.field_36e5ca4_Dne;
        wAR.method_117d19ea_FWm(zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3));
        wAR.method_2c0148e6_Dne(1.0f, 1.0f, 1.0f);
        double d = 0.4f;
        double d2 = 0.5 - d;
        double d3 = 0.2f;
        if (n4 == 1) {
            this.method_d02c372d_Dne(zKP2, (double)n - d2, (double)n2 + d3, n3, -d, 0.0, 0);
        } else if (n4 == 2) {
            this.method_d02c372d_Dne(zKP2, (double)n + d2, (double)n2 + d3, n3, d, 0.0, 0);
        } else if (n4 == 3) {
            this.method_d02c372d_Dne(zKP2, n, (double)n2 + d3, (double)n3 - d2, 0.0, -d, 0);
        } else if (n4 == 4) {
            this.method_d02c372d_Dne(zKP2, n, (double)n2 + d3, (double)n3 + d2, 0.0, d, 0);
        } else {
            this.method_d02c372d_Dne(zKP2, n, n2, n3, 0.0, 0.0, 0);
        }
        return true;
    }

    public boolean method_6f91619b_Dne(LRA lRA, int n, int n2, int n3) {
        float f;
        boolean bl = false;
        float f2 = 0.375f;
        float f3 = 0.625f;
        this.method_adff145a_Dne(f2, 0.0, f2, f3, 1.0, f3);
        this.method_9743b2ba_udO(lRA, n, n2, n3);
        bl = true;
        boolean bl2 = false;
        boolean bl3 = false;
        if (lRA.method_8f2f2092_FWm(this.field_3706cf9_Dne, n - 1, n2, n3) || lRA.method_8f2f2092_FWm(this.field_3706cf9_Dne, n + 1, n2, n3)) {
            bl2 = true;
        }
        if (lRA.method_8f2f2092_FWm(this.field_3706cf9_Dne, n, n2, n3 - 1) || lRA.method_8f2f2092_FWm(this.field_3706cf9_Dne, n, n2, n3 + 1)) {
            bl3 = true;
        }
        boolean bl4 = lRA.method_8f2f2092_FWm(this.field_3706cf9_Dne, n - 1, n2, n3);
        boolean bl5 = lRA.method_8f2f2092_FWm(this.field_3706cf9_Dne, n + 1, n2, n3);
        boolean bl6 = lRA.method_8f2f2092_FWm(this.field_3706cf9_Dne, n, n2, n3 - 1);
        boolean bl7 = lRA.method_8f2f2092_FWm(this.field_3706cf9_Dne, n, n2, n3 + 1);
        if (!bl2 && !bl3) {
            bl2 = true;
        }
        f2 = 0.4375f;
        f3 = 0.5625f;
        float f4 = 0.75f;
        float f5 = 0.9375f;
        float f6 = bl4 ? 0.0f : f2;
        float f7 = bl5 ? 1.0f : f3;
        float f8 = bl6 ? 0.0f : f2;
        float f9 = f = bl7 ? 1.0f : f3;
        if (bl2) {
            this.method_adff145a_Dne(f6, f4, f2, f7, f5, f3);
            this.method_9743b2ba_udO(lRA, n, n2, n3);
            bl = true;
        }
        if (bl3) {
            this.method_adff145a_Dne(f2, f4, f8, f3, f5, f);
            this.method_9743b2ba_udO(lRA, n, n2, n3);
            bl = true;
        }
        f4 = 0.375f;
        f5 = 0.5625f;
        if (bl2) {
            this.method_adff145a_Dne(f6, f4, f2, f7, f5, f3);
            this.method_9743b2ba_udO(lRA, n, n2, n3);
            bl = true;
        }
        if (bl3) {
            this.method_adff145a_Dne(f2, f4, f8, f3, f5, f);
            this.method_9743b2ba_udO(lRA, n, n2, n3);
            bl = true;
        }
        lRA.method_fbabf7ef_Dne(this.field_3706cf9_Dne, n, n2, n3);
        return bl;
    }

    private boolean method_bec3468a_Dne(Lsq lsq, int n, int n2, int n3) {
        WAR wAR = WAR.field_36e5ca4_Dne;
        wAR.method_117d19ea_FWm(lsq.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3));
        wAR.method_2c0148e6_Dne(1.0f, 1.0f, 1.0f);
        int n4 = this.field_3706cf9_Dne.method_2dee76f_bzF(n, n2, n3);
        int n5 = kbN.method_7ed979f5_Qnq(n4);
        int n6 = Lsq.method_ae3dc47d_c_(n4);
        gDn gDn2 = lsq.method_9e795529_Dne(n6);
        int n7 = 4 + n6 * 2;
        int n8 = 5 + n6 * 2;
        double d = 15.0 - (double)n7;
        double d2 = 15.0;
        double d3 = 4.0;
        double d4 = 4.0 + (double)n8;
        double d5 = gDn2.method_ce7f4ad4_Dne(d);
        double d6 = gDn2.method_ce7f4ad4_Dne(d2);
        double d7 = gDn2.method_117d0715_FWm(d3);
        double d8 = gDn2.method_117d0715_FWm(d4);
        double d9 = 0.0;
        double d10 = 0.0;
        switch (n5) {
            case 0: {
                d9 = 8.0 - (double)(n7 / 2);
                d10 = 15.0 - (double)n7;
                break;
            }
            case 1: {
                d9 = 1.0;
                d10 = 8.0 - (double)(n7 / 2);
                break;
            }
            case 2: {
                d9 = 8.0 - (double)(n7 / 2);
                d10 = 1.0;
                break;
            }
            case 3: {
                d9 = 15.0 - (double)n7;
                d10 = 8.0 - (double)(n7 / 2);
            }
        }
        double d11 = (double)n + d9 / 16.0;
        double d12 = (double)n + (d9 + (double)n7) / 16.0;
        double d13 = (double)n2 + (12.0 - (double)n8) / 16.0;
        double d14 = (double)n2 + 0.75;
        double d15 = (double)n3 + d10 / 16.0;
        double d16 = (double)n3 + (d10 + (double)n7) / 16.0;
        wAR.method_c38c5864_Dne(d11, d13, d15, d5, d8);
        wAR.method_c38c5864_Dne(d11, d13, d16, d6, d8);
        wAR.method_c38c5864_Dne(d11, d14, d16, d6, d7);
        wAR.method_c38c5864_Dne(d11, d14, d15, d5, d7);
        wAR.method_c38c5864_Dne(d12, d13, d16, d5, d8);
        wAR.method_c38c5864_Dne(d12, d13, d15, d6, d8);
        wAR.method_c38c5864_Dne(d12, d14, d15, d6, d7);
        wAR.method_c38c5864_Dne(d12, d14, d16, d5, d7);
        wAR.method_c38c5864_Dne(d12, d13, d15, d5, d8);
        wAR.method_c38c5864_Dne(d11, d13, d15, d6, d8);
        wAR.method_c38c5864_Dne(d11, d14, d15, d6, d7);
        wAR.method_c38c5864_Dne(d12, d14, d15, d5, d7);
        wAR.method_c38c5864_Dne(d11, d13, d16, d5, d8);
        wAR.method_c38c5864_Dne(d12, d13, d16, d6, d8);
        wAR.method_c38c5864_Dne(d12, d14, d16, d6, d7);
        wAR.method_c38c5864_Dne(d11, d14, d16, d5, d7);
        int n9 = n7;
        if (n6 >= 2) {
            n9 = n7 - 1;
        }
        d5 = gDn2.method_7a46288a_Dne();
        d6 = gDn2.method_ce7f4ad4_Dne(n9);
        d7 = gDn2.method_ae128db7_bzF();
        d8 = gDn2.method_117d0715_FWm(n9);
        wAR.method_c38c5864_Dne(d11, d14, d16, d5, d8);
        wAR.method_c38c5864_Dne(d12, d14, d16, d6, d8);
        wAR.method_c38c5864_Dne(d12, d14, d15, d6, d7);
        wAR.method_c38c5864_Dne(d11, d14, d15, d5, d7);
        wAR.method_c38c5864_Dne(d11, d13, d15, d5, d7);
        wAR.method_c38c5864_Dne(d12, d13, d15, d6, d7);
        wAR.method_c38c5864_Dne(d12, d13, d16, d6, d8);
        wAR.method_c38c5864_Dne(d11, d13, d16, d5, d8);
        d5 = gDn2.method_ce7f4ad4_Dne(12.0);
        d6 = gDn2.method_7c6f6029_FWm();
        d7 = gDn2.method_ae128db7_bzF();
        d8 = gDn2.method_117d0715_FWm(4.0);
        d9 = 8.0;
        d10 = 0.0;
        switch (n5) {
            case 0: {
                d9 = 8.0;
                d10 = 12.0;
                double d17 = d5;
                d5 = d6;
                d6 = d17;
                break;
            }
            case 1: {
                d9 = 0.0;
                d10 = 8.0;
                break;
            }
            case 2: {
                d9 = 8.0;
                d10 = 0.0;
                break;
            }
            case 3: {
                d9 = 12.0;
                d10 = 8.0;
                double d18 = d5;
                d5 = d6;
                d6 = d18;
            }
        }
        d11 = (double)n + d9 / 16.0;
        d12 = (double)n + (d9 + 4.0) / 16.0;
        d13 = (double)n2 + 0.75;
        d14 = (double)n2 + 1.0;
        d15 = (double)n3 + d10 / 16.0;
        d16 = (double)n3 + (d10 + 4.0) / 16.0;
        if (n5 != 2 && n5 != 0) {
            if (n5 == 1 || n5 == 3) {
                wAR.method_c38c5864_Dne(d12, d13, d15, d5, d8);
                wAR.method_c38c5864_Dne(d11, d13, d15, d6, d8);
                wAR.method_c38c5864_Dne(d11, d14, d15, d6, d7);
                wAR.method_c38c5864_Dne(d12, d14, d15, d5, d7);
                wAR.method_c38c5864_Dne(d11, d13, d15, d6, d8);
                wAR.method_c38c5864_Dne(d12, d13, d15, d5, d8);
                wAR.method_c38c5864_Dne(d12, d14, d15, d5, d7);
                wAR.method_c38c5864_Dne(d11, d14, d15, d6, d7);
            }
        } else {
            wAR.method_c38c5864_Dne(d11, d13, d15, d6, d8);
            wAR.method_c38c5864_Dne(d11, d13, d16, d5, d8);
            wAR.method_c38c5864_Dne(d11, d14, d16, d5, d7);
            wAR.method_c38c5864_Dne(d11, d14, d15, d6, d7);
            wAR.method_c38c5864_Dne(d11, d13, d16, d5, d8);
            wAR.method_c38c5864_Dne(d11, d13, d15, d6, d8);
            wAR.method_c38c5864_Dne(d11, d14, d15, d6, d7);
            wAR.method_c38c5864_Dne(d11, d14, d16, d5, d7);
        }
        return true;
    }

    public gDn method_36cdcef6_Dne(gDn gDn2) {
        return gDn2 == null ? this.field_493682ed_Dne.field_36d36bf_Dne.method_9e795529_Dne(0) : gDn2;
    }

    public boolean method_8115e0a8_ATE(zKP zKP2, int n, int n2, int n3) {
        WAR wAR = WAR.field_36e5ca4_Dne;
        int n4 = this.field_3706cf9_Dne.method_2dee76f_bzF(n, n2, n3);
        if ((n4 & 8) != 0 ? this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n, n2 - 1, n3) != zKP2.field_21260d_FWm : this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n, n2 + 1, n3) != zKP2.field_21260d_FWm) {
            return false;
        }
        boolean bl = false;
        float f = 0.5f;
        float f2 = 1.0f;
        float f3 = 0.8f;
        float f4 = 0.6f;
        int n5 = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3);
        wAR.method_117d19ea_FWm(this.field_2e5f16_bzF > 0.0 ? n5 : zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2 - 1, n3));
        wAR.method_2c0148e6_Dne(f, f, f);
        this.method_58bf1fba_Dne(zKP2, n, n2, n3, this.method_42ba3726_Dne(zKP2, this.field_3706cf9_Dne, n, n2, n3, 0));
        bl = true;
        wAR.method_117d19ea_FWm(this.field_267cf0_Qnq < 1.0 ? n5 : zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2 + 1, n3));
        wAR.method_2c0148e6_Dne(f2, f2, f2);
        this.method_d047827b_FWm(zKP2, n, n2, n3, this.method_42ba3726_Dne(zKP2, this.field_3706cf9_Dne, n, n2, n3, 1));
        bl = true;
        wAR.method_117d19ea_FWm(this.field_2d29ef_aFZ > 0.0 ? n5 : zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3 - 1));
        wAR.method_2c0148e6_Dne(f3, f3, f3);
        gDn gDn2 = this.method_42ba3726_Dne(zKP2, this.field_3706cf9_Dne, n, n2, n3, 2);
        this.method_e4fb4bad_bzF(zKP2, n, n2, n3, gDn2);
        bl = true;
        this.field_2e5f2c_bzF = false;
        wAR.method_117d19ea_FWm(this.field_388da1_zGp < 1.0 ? n5 : zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3 + 1));
        wAR.method_2c0148e6_Dne(f3, f3, f3);
        gDn2 = this.method_42ba3726_Dne(zKP2, this.field_3706cf9_Dne, n, n2, n3, 3);
        this.method_925c7e93_Qnq(zKP2, n, n2, n3, gDn2);
        bl = true;
        this.field_2e5f2c_bzF = false;
        wAR.method_117d19ea_FWm(this.field_2092a9_Dne > 0.0 ? n5 : zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n - 1, n2, n3));
        wAR.method_2c0148e6_Dne(f4, f4, f4);
        gDn2 = this.method_42ba3726_Dne(zKP2, this.field_3706cf9_Dne, n, n2, n3, 4);
        this.method_76f453b4_aFZ(zKP2, n, n2, n3, gDn2);
        bl = true;
        this.field_2e5f2c_bzF = false;
        wAR.method_117d19ea_FWm(this.field_212608_FWm < 1.0 ? n5 : zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n + 1, n2, n3));
        wAR.method_2c0148e6_Dne(f4, f4, f4);
        gDn2 = this.method_42ba3726_Dne(zKP2, this.field_3706cf9_Dne, n, n2, n3, 5);
        this.method_3fc2d5c2_zGp(zKP2, n, n2, n3, gDn2);
        bl = true;
        this.field_2e5f2c_bzF = false;
        return bl;
    }

    public boolean method_dd17aac_bzF(zKP zKP2, int n, int n2, int n3) {
        int n4 = this.field_3706cf9_Dne.method_2dee76f_bzF(n, n2, n3);
        int n5 = n4 & 7;
        boolean bl = (n4 & 8) > 0;
        WAR wAR = WAR.field_36e5ca4_Dne;
        boolean bl2 = this.method_7a46289e_Dne();
        if (!bl2) {
            this.method_a68ac5f6_Dne(this.method_39bcfb28_Dne(zKP.field_75c638da_bzF));
        }
        float f = 0.25f;
        float f2 = 0.1875f;
        float f3 = 0.1875f;
        if (n5 == 5) {
            this.method_adff145a_Dne(0.5f - f2, 0.0, 0.5f - f, 0.5f + f2, f3, 0.5f + f);
        } else if (n5 == 6) {
            this.method_adff145a_Dne(0.5f - f, 0.0, 0.5f - f2, 0.5f + f, f3, 0.5f + f2);
        } else if (n5 == 4) {
            this.method_adff145a_Dne(0.5f - f2, 0.5f - f, 1.0f - f3, 0.5f + f2, 0.5f + f, 1.0);
        } else if (n5 == 3) {
            this.method_adff145a_Dne(0.5f - f2, 0.5f - f, 0.0, 0.5f + f2, 0.5f + f, f3);
        } else if (n5 == 2) {
            this.method_adff145a_Dne(1.0f - f3, 0.5f - f, 0.5f - f2, 1.0, 0.5f + f, 0.5f + f2);
        } else if (n5 == 1) {
            this.method_adff145a_Dne(0.0, 0.5f - f, 0.5f - f2, f3, 0.5f + f, 0.5f + f2);
        } else if (n5 == 0) {
            this.method_adff145a_Dne(0.5f - f, 1.0f - f3, 0.5f - f2, 0.5f + f, 1.0, 0.5f + f2);
        } else if (n5 == 7) {
            this.method_adff145a_Dne(0.5f - f2, 1.0f - f3, 0.5f - f, 0.5f + f2, 1.0, 0.5f + f);
        }
        this.method_9743b2ba_udO(zKP2, n, n2, n3);
        if (!bl2) {
            this.method_7a46289a_Dne();
        }
        wAR.method_117d19ea_FWm(zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3));
        float f4 = 1.0f;
        if (zKP.field_59d86bc_bzF[zKP2.field_21260d_FWm] > 0) {
            f4 = 1.0f;
        }
        wAR.method_2c0148e6_Dne(f4, f4, f4);
        gDn gDn2 = this.method_5d830b5b_Dne(zKP2, 0);
        if (this.method_7a46289e_Dne()) {
            gDn2 = this.field_375b13b_Dne;
        }
        double d = gDn2.method_7a46288a_Dne();
        double d2 = gDn2.method_ae128db7_bzF();
        double d3 = gDn2.method_7c6f6029_FWm();
        double d4 = gDn2.method_907a9d11_Qnq();
        chN[] chNArray = new chN[8];
        float f5 = 0.0625f;
        float f6 = 0.0625f;
        float f7 = 0.625f;
        chNArray[0] = this.field_3706cf9_Dne.method_23186a47_Dne().method_e4505d6c_Dne(-f5, 0.0, -f6);
        chNArray[1] = this.field_3706cf9_Dne.method_23186a47_Dne().method_e4505d6c_Dne(f5, 0.0, -f6);
        chNArray[2] = this.field_3706cf9_Dne.method_23186a47_Dne().method_e4505d6c_Dne(f5, 0.0, f6);
        chNArray[3] = this.field_3706cf9_Dne.method_23186a47_Dne().method_e4505d6c_Dne(-f5, 0.0, f6);
        chNArray[4] = this.field_3706cf9_Dne.method_23186a47_Dne().method_e4505d6c_Dne(-f5, f7, -f6);
        chNArray[5] = this.field_3706cf9_Dne.method_23186a47_Dne().method_e4505d6c_Dne(f5, f7, -f6);
        chNArray[6] = this.field_3706cf9_Dne.method_23186a47_Dne().method_e4505d6c_Dne(f5, f7, f6);
        chNArray[7] = this.field_3706cf9_Dne.method_23186a47_Dne().method_e4505d6c_Dne(-f5, f7, f6);
        for (int i = 0; i < 8; ++i) {
            if (bl) {
                chNArray[i].field_2e5f16_bzF -= 0.0625;
                chNArray[i].method_ce7f5266_Dne(0.69813174f);
            } else {
                chNArray[i].field_2e5f16_bzF += 0.0625;
                chNArray[i].method_ce7f5266_Dne(-0.69813174f);
            }
            if (n5 == 0 || n5 == 7) {
                chNArray[i].method_143f92d9_bzF((float)Math.PI);
            }
            if (n5 == 6 || n5 == 0) {
                chNArray[i].method_117d0ea7_FWm(1.5707964f);
            }
            if (n5 > 0 && n5 < 5) {
                chNArray[i].field_212608_FWm -= 0.375;
                chNArray[i].method_ce7f5266_Dne(1.5707964f);
                if (n5 == 4) {
                    chNArray[i].method_117d0ea7_FWm(0.0f);
                }
                if (n5 == 3) {
                    chNArray[i].method_117d0ea7_FWm((float)Math.PI);
                }
                if (n5 == 2) {
                    chNArray[i].method_117d0ea7_FWm(1.5707964f);
                }
                if (n5 == 1) {
                    chNArray[i].method_117d0ea7_FWm(-1.5707964f);
                }
                chNArray[i].field_2092a9_Dne += (double)n + 0.5;
                chNArray[i].field_212608_FWm += (double)((float)n2 + 0.5f);
                chNArray[i].field_2e5f16_bzF += (double)n3 + 0.5;
                continue;
            }
            if (n5 != 0 && n5 != 7) {
                chNArray[i].field_2092a9_Dne += (double)n + 0.5;
                chNArray[i].field_212608_FWm += (double)((float)n2 + 0.125f);
                chNArray[i].field_2e5f16_bzF += (double)n3 + 0.5;
                continue;
            }
            chNArray[i].field_2092a9_Dne += (double)n + 0.5;
            chNArray[i].field_212608_FWm += (double)((float)n2 + 0.875f);
            chNArray[i].field_2e5f16_bzF += (double)n3 + 0.5;
        }
        chN chN2 = null;
        chN chN3 = null;
        chN chN4 = null;
        chN chN5 = null;
        for (int i = 0; i < 6; ++i) {
            if (i == 0) {
                d = gDn2.method_ce7f4ad4_Dne(7.0);
                d2 = gDn2.method_117d0715_FWm(6.0);
                d3 = gDn2.method_ce7f4ad4_Dne(9.0);
                d4 = gDn2.method_117d0715_FWm(8.0);
            } else if (i == 2) {
                d = gDn2.method_ce7f4ad4_Dne(7.0);
                d2 = gDn2.method_117d0715_FWm(6.0);
                d3 = gDn2.method_ce7f4ad4_Dne(9.0);
                d4 = gDn2.method_907a9d11_Qnq();
            }
            if (i == 0) {
                chN2 = chNArray[0];
                chN3 = chNArray[1];
                chN4 = chNArray[2];
                chN5 = chNArray[3];
            } else if (i == 1) {
                chN2 = chNArray[7];
                chN3 = chNArray[6];
                chN4 = chNArray[5];
                chN5 = chNArray[4];
            } else if (i == 2) {
                chN2 = chNArray[1];
                chN3 = chNArray[0];
                chN4 = chNArray[4];
                chN5 = chNArray[5];
            } else if (i == 3) {
                chN2 = chNArray[2];
                chN3 = chNArray[1];
                chN4 = chNArray[5];
                chN5 = chNArray[6];
            } else if (i == 4) {
                chN2 = chNArray[3];
                chN3 = chNArray[2];
                chN4 = chNArray[6];
                chN5 = chNArray[7];
            } else if (i == 5) {
                chN2 = chNArray[0];
                chN3 = chNArray[3];
                chN4 = chNArray[7];
                chN5 = chNArray[4];
            }
            wAR.method_c38c5864_Dne(chN2.field_2092a9_Dne, chN2.field_212608_FWm, chN2.field_2e5f16_bzF, d, d4);
            wAR.method_c38c5864_Dne(chN3.field_2092a9_Dne, chN3.field_212608_FWm, chN3.field_2e5f16_bzF, d3, d4);
            wAR.method_c38c5864_Dne(chN4.field_2092a9_Dne, chN4.field_212608_FWm, chN4.field_2e5f16_bzF, d3, d2);
            wAR.method_c38c5864_Dne(chN5.field_2092a9_Dne, chN5.field_212608_FWm, chN5.field_2e5f16_bzF, d, d2);
        }
        return true;
    }

    public void method_cc956a4a_Dne(ScM scM, int n, int n2, double d, double d2, double d3, double d4) {
        WAR wAR = WAR.field_36e5ca4_Dne;
        gDn gDn2 = scM.method_230f3f9a_Dne();
        if (this.method_7a46289e_Dne()) {
            gDn2 = this.field_375b13b_Dne;
        }
        double d5 = gDn2.method_7a46288a_Dne();
        double d6 = gDn2.method_ae128db7_bzF();
        double d7 = gDn2.method_7c6f6029_FWm();
        double d8 = gDn2.method_907a9d11_Qnq();
        double d9 = d2 + 0.5 - 0.5;
        double d10 = d2 + 0.5 + 0.5;
        double d11 = d4 + 0.5 - 0.5;
        double d12 = d4 + 0.5 + 0.5;
        double d13 = d2 + 0.5;
        double d14 = d4 + 0.5;
        if ((n2 + 1) / 2 % 2 == 1) {
            double d15 = d7;
            d7 = d5;
            d5 = d15;
        }
        if (n2 < 2) {
            wAR.method_c38c5864_Dne(d9, d3 + d, d14, d5, d6);
            wAR.method_c38c5864_Dne(d9, d3 + 0.0, d14, d5, d8);
            wAR.method_c38c5864_Dne(d10, d3 + 0.0, d14, d7, d8);
            wAR.method_c38c5864_Dne(d10, d3 + d, d14, d7, d6);
            wAR.method_c38c5864_Dne(d10, d3 + d, d14, d7, d6);
            wAR.method_c38c5864_Dne(d10, d3 + 0.0, d14, d7, d8);
            wAR.method_c38c5864_Dne(d9, d3 + 0.0, d14, d5, d8);
            wAR.method_c38c5864_Dne(d9, d3 + d, d14, d5, d6);
        } else {
            wAR.method_c38c5864_Dne(d13, d3 + d, d12, d5, d6);
            wAR.method_c38c5864_Dne(d13, d3 + 0.0, d12, d5, d8);
            wAR.method_c38c5864_Dne(d13, d3 + 0.0, d11, d7, d8);
            wAR.method_c38c5864_Dne(d13, d3 + d, d11, d7, d6);
            wAR.method_c38c5864_Dne(d13, d3 + d, d11, d7, d6);
            wAR.method_c38c5864_Dne(d13, d3 + 0.0, d11, d7, d8);
            wAR.method_c38c5864_Dne(d13, d3 + 0.0, d12, d5, d8);
            wAR.method_c38c5864_Dne(d13, d3 + d, d12, d5, d6);
        }
    }

    private void method_e2373e85_bzF(double d, double d2, double d3, double d4, double d5, double d6, float f, double d7) {
        gDn gDn2 = XbN.method_285881e4_Dne("piston_side");
        if (this.method_7a46289e_Dne()) {
            gDn2 = this.field_375b13b_Dne;
        }
        WAR wAR = WAR.field_36e5ca4_Dne;
        double d8 = gDn2.method_7a46288a_Dne();
        double d9 = gDn2.method_ae128db7_bzF();
        double d10 = gDn2.method_ce7f4ad4_Dne(d7);
        double d11 = gDn2.method_117d0715_FWm(4.0);
        wAR.method_2c0148e6_Dne(f, f, f);
        wAR.method_c38c5864_Dne(d2, d3, d5, d10, d9);
        wAR.method_c38c5864_Dne(d, d3, d5, d8, d9);
        wAR.method_c38c5864_Dne(d, d4, d6, d8, d11);
        wAR.method_c38c5864_Dne(d2, d4, d6, d10, d11);
    }

    private boolean method_61ecf23a_Dne(YkL ykL, int n, int n2, int n3) {
        gDn gDn2;
        WAR wAR = WAR.field_36e5ca4_Dne;
        wAR.method_117d19ea_FWm(ykL.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3));
        wAR.method_2c0148e6_Dne(1.0f, 1.0f, 1.0f);
        int n4 = this.field_3706cf9_Dne.method_2dee76f_bzF(n, n2, n3);
        int n5 = n4 & 3;
        double d = 0.0;
        double d2 = -0.1875;
        double d3 = 0.0;
        double d4 = 0.0;
        double d5 = 0.0;
        if (ykL.method_117d19ee_FWm(n4)) {
            gDn2 = zKP.field_3f9bd7dc_CZC.method_77cd08ea_FWm(0);
        } else {
            d2 -= 0.1875;
            gDn2 = zKP.field_4821929c_iNQ.method_77cd08ea_FWm(0);
        }
        switch (n5) {
            case 0: {
                d3 = -0.3125;
                d5 = 1.0;
                break;
            }
            case 1: {
                d = 0.3125;
                d4 = -1.0;
                break;
            }
            case 2: {
                d3 = 0.3125;
                d5 = -1.0;
                break;
            }
            case 3: {
                d = -0.3125;
                d4 = 1.0;
            }
        }
        this.method_d02c372d_Dne(ykL, (double)n + 0.25 * d4 + 0.1875 * d5, (float)n2 - 0.1875f, (double)n3 + 0.25 * d5 + 0.1875 * d4, 0.0, 0.0, n4);
        this.method_d02c372d_Dne(ykL, (double)n + 0.25 * d4 + -0.1875 * d5, (float)n2 - 0.1875f, (double)n3 + 0.25 * d5 + -0.1875 * d4, 0.0, 0.0, n4);
        this.method_a68ac5f6_Dne(gDn2);
        this.method_d02c372d_Dne(ykL, (double)n + d, (double)n2 + d2, (double)n3 + d3, 0.0, 0.0, n4);
        this.method_7a46289a_Dne();
        this.method_715a729e_Dne(ykL, n, n2, n3, n5);
        return true;
    }

    private void method_715a729e_Dne(gvx gvx2, int n, int n2, int n3, int n4) {
        this.method_9743b2ba_udO(gvx2, n, n2, n3);
        WAR wAR = WAR.field_36e5ca4_Dne;
        wAR.method_117d19ea_FWm(gvx2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3));
        wAR.method_2c0148e6_Dne(1.0f, 1.0f, 1.0f);
        int n5 = this.field_3706cf9_Dne.method_2dee76f_bzF(n, n2, n3);
        gDn gDn2 = this.method_b27f0188_Dne(gvx2, 1, n5);
        double d = gDn2.method_7a46288a_Dne();
        double d2 = gDn2.method_7c6f6029_FWm();
        double d3 = gDn2.method_ae128db7_bzF();
        double d4 = gDn2.method_907a9d11_Qnq();
        double d5 = 0.125;
        double d6 = n + 1;
        double d7 = n + 1;
        double d8 = n + 0;
        double d9 = n + 0;
        double d10 = n3 + 0;
        double d11 = n3 + 1;
        double d12 = n3 + 1;
        double d13 = n3 + 0;
        double d14 = (double)n2 + d5;
        if (n4 == 2) {
            d6 = d7 = (double)(n + 0);
            d8 = d9 = (double)(n + 1);
            d10 = d13 = (double)(n3 + 1);
            d11 = d12 = (double)(n3 + 0);
        } else if (n4 == 3) {
            d6 = d9 = (double)(n + 0);
            d7 = d8 = (double)(n + 1);
            d10 = d11 = (double)(n3 + 0);
            d12 = d13 = (double)(n3 + 1);
        } else if (n4 == 1) {
            d6 = d9 = (double)(n + 1);
            d7 = d8 = (double)(n + 0);
            d10 = d11 = (double)(n3 + 1);
            d12 = d13 = (double)(n3 + 0);
        }
        wAR.method_c38c5864_Dne(d9, d14, d13, d, d3);
        wAR.method_c38c5864_Dne(d8, d14, d12, d, d4);
        wAR.method_c38c5864_Dne(d7, d14, d11, d2, d4);
        wAR.method_c38c5864_Dne(d6, d14, d10, d2, d3);
    }

    private boolean method_bc7600c0_Dne(TXd tXd, int n, int n2, int n3) {
        this.method_adff145a_Dne(0.4375, 0.0, 0.4375, 0.5625, 0.875, 0.5625);
        this.method_9743b2ba_udO(tXd, n, n2, n3);
        this.method_a68ac5f6_Dne(tXd.method_230f3f9a_Dne());
        this.method_adff145a_Dne(0.5625, 0.0, 0.3125, 0.9375, 0.125, 0.6875);
        this.method_9743b2ba_udO(tXd, n, n2, n3);
        this.method_adff145a_Dne(0.125, 0.0, 0.0625, 0.5, 0.125, 0.4375);
        this.method_9743b2ba_udO(tXd, n, n2, n3);
        this.method_adff145a_Dne(0.125, 0.0, 0.5625, 0.5, 0.125, 0.9375);
        this.method_9743b2ba_udO(tXd, n, n2, n3);
        this.method_7a46289a_Dne();
        WAR wAR = WAR.field_36e5ca4_Dne;
        wAR.method_117d19ea_FWm(tXd.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3));
        float f = 1.0f;
        int n4 = tXd.method_fbabf7e2_Dne(this.field_3706cf9_Dne, n, n2, n3);
        float f2 = (float)(n4 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n4 >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n4 & 0xFF) / 255.0f;
        if (OEA.field_2092bf_Dne) {
            float f5 = (f2 * 30.0f + f3 * 59.0f + f4 * 11.0f) / 100.0f;
            float f6 = (f2 * 30.0f + f3 * 70.0f) / 100.0f;
            float f7 = (f2 * 30.0f + f4 * 70.0f) / 100.0f;
            f2 = f5;
            f3 = f6;
            f4 = f7;
        }
        wAR.method_2c0148e6_Dne(f * f2, f * f3, f * f4);
        gDn gDn2 = this.method_b27f0188_Dne(tXd, 0, 0);
        if (this.method_7a46289e_Dne()) {
            gDn2 = this.field_375b13b_Dne;
        }
        double d = gDn2.method_ae128db7_bzF();
        double d2 = gDn2.method_907a9d11_Qnq();
        int n5 = this.field_3706cf9_Dne.method_2dee76f_bzF(n, n2, n3);
        for (int i = 0; i < 3; ++i) {
            double d3 = (double)i * Math.PI * 2.0 / 3.0 + 1.5707963267948966;
            double d4 = gDn2.method_ce7f4ad4_Dne(8.0);
            double d5 = gDn2.method_7c6f6029_FWm();
            if ((n5 & 1 << i) != 0) {
                d5 = gDn2.method_7a46288a_Dne();
            }
            double d6 = (double)n + 0.5;
            double d7 = (double)n + 0.5 + Math.sin(d3) * 8.0 / 16.0;
            double d8 = (double)n3 + 0.5;
            double d9 = (double)n3 + 0.5 + Math.cos(d3) * 8.0 / 16.0;
            wAR.method_c38c5864_Dne(d6, n2 + 1, d8, d4, d);
            wAR.method_c38c5864_Dne(d6, n2 + 0, d8, d4, d2);
            wAR.method_c38c5864_Dne(d7, n2 + 0, d9, d5, d2);
            wAR.method_c38c5864_Dne(d7, n2 + 1, d9, d5, d);
            wAR.method_c38c5864_Dne(d7, n2 + 1, d9, d5, d);
            wAR.method_c38c5864_Dne(d7, n2 + 0, d9, d5, d2);
            wAR.method_c38c5864_Dne(d6, n2 + 0, d8, d4, d2);
            wAR.method_c38c5864_Dne(d6, n2 + 1, d8, d4, d);
        }
        tXd.method_7a46289a_Dne();
        return true;
    }

    public boolean method_7a46289e_Dne() {
        return this.field_375b13b_Dne != null;
    }

    private boolean method_4d025afe_FWm(zKP zKP2, int n, int n2, int n3, boolean bl) {
        int n4 = this.field_3706cf9_Dne.method_2dee76f_bzF(n, n2, n3);
        int n5 = FmX.method_143f9e0f_bzF(n4);
        float f = zKP2.method_fbabf7df_Dne(this.field_3706cf9_Dne, n, n2, n3);
        float f2 = bl ? 1.0f : 0.5f;
        double d = bl ? 16.0 : 8.0;
        switch (n5) {
            case 0: {
                this.field_2092ae_Dne = 3;
                this.field_21260d_FWm = 3;
                this.field_2e5f1b_bzF = 3;
                this.field_267cf5_Qnq = 3;
                this.method_adff145a_Dne(0.0, 0.0, 0.0, 1.0, 0.25, 1.0);
                this.method_9743b2ba_udO(zKP2, n, n2, n3);
                this.method_2a985658_Dne((float)n + 0.375f, (float)n + 0.625f, (float)n2 + 0.25f, (float)n2 + 0.25f + f2, (float)n3 + 0.625f, (float)n3 + 0.625f, f * 0.8f, d);
                this.method_2a985658_Dne((float)n + 0.625f, (float)n + 0.375f, (float)n2 + 0.25f, (float)n2 + 0.25f + f2, (float)n3 + 0.375f, (float)n3 + 0.375f, f * 0.8f, d);
                this.method_2a985658_Dne((float)n + 0.375f, (float)n + 0.375f, (float)n2 + 0.25f, (float)n2 + 0.25f + f2, (float)n3 + 0.375f, (float)n3 + 0.625f, f * 0.6f, d);
                this.method_2a985658_Dne((float)n + 0.625f, (float)n + 0.625f, (float)n2 + 0.25f, (float)n2 + 0.25f + f2, (float)n3 + 0.625f, (float)n3 + 0.375f, f * 0.6f, d);
                break;
            }
            case 1: {
                this.method_adff145a_Dne(0.0, 0.75, 0.0, 1.0, 1.0, 1.0);
                this.method_9743b2ba_udO(zKP2, n, n2, n3);
                this.method_2a985658_Dne((float)n + 0.375f, (float)n + 0.625f, (float)n2 - 0.25f + 1.0f - f2, (float)n2 - 0.25f + 1.0f, (float)n3 + 0.625f, (float)n3 + 0.625f, f * 0.8f, d);
                this.method_2a985658_Dne((float)n + 0.625f, (float)n + 0.375f, (float)n2 - 0.25f + 1.0f - f2, (float)n2 - 0.25f + 1.0f, (float)n3 + 0.375f, (float)n3 + 0.375f, f * 0.8f, d);
                this.method_2a985658_Dne((float)n + 0.375f, (float)n + 0.375f, (float)n2 - 0.25f + 1.0f - f2, (float)n2 - 0.25f + 1.0f, (float)n3 + 0.375f, (float)n3 + 0.625f, f * 0.6f, d);
                this.method_2a985658_Dne((float)n + 0.625f, (float)n + 0.625f, (float)n2 - 0.25f + 1.0f - f2, (float)n2 - 0.25f + 1.0f, (float)n3 + 0.625f, (float)n3 + 0.375f, f * 0.6f, d);
                break;
            }
            case 2: {
                this.field_2e5f1b_bzF = 1;
                this.field_267cf5_Qnq = 2;
                this.method_adff145a_Dne(0.0, 0.0, 0.0, 1.0, 1.0, 0.25);
                this.method_9743b2ba_udO(zKP2, n, n2, n3);
                this.method_be1b7ef7_FWm((float)n + 0.375f, (float)n + 0.375f, (float)n2 + 0.625f, (float)n2 + 0.375f, (float)n3 + 0.25f, (float)n3 + 0.25f + f2, f * 0.6f, d);
                this.method_be1b7ef7_FWm((float)n + 0.625f, (float)n + 0.625f, (float)n2 + 0.375f, (float)n2 + 0.625f, (float)n3 + 0.25f, (float)n3 + 0.25f + f2, f * 0.6f, d);
                this.method_be1b7ef7_FWm((float)n + 0.375f, (float)n + 0.625f, (float)n2 + 0.375f, (float)n2 + 0.375f, (float)n3 + 0.25f, (float)n3 + 0.25f + f2, f * 0.5f, d);
                this.method_be1b7ef7_FWm((float)n + 0.625f, (float)n + 0.375f, (float)n2 + 0.625f, (float)n2 + 0.625f, (float)n3 + 0.25f, (float)n3 + 0.25f + f2, f, d);
                break;
            }
            case 3: {
                this.field_2e5f1b_bzF = 2;
                this.field_267cf5_Qnq = 1;
                this.field_2d29f4_aFZ = 3;
                this.field_388da6_zGp = 3;
                this.method_adff145a_Dne(0.0, 0.0, 0.75, 1.0, 1.0, 1.0);
                this.method_9743b2ba_udO(zKP2, n, n2, n3);
                this.method_be1b7ef7_FWm((float)n + 0.375f, (float)n + 0.375f, (float)n2 + 0.625f, (float)n2 + 0.375f, (float)n3 - 0.25f + 1.0f - f2, (float)n3 - 0.25f + 1.0f, f * 0.6f, d);
                this.method_be1b7ef7_FWm((float)n + 0.625f, (float)n + 0.625f, (float)n2 + 0.375f, (float)n2 + 0.625f, (float)n3 - 0.25f + 1.0f - f2, (float)n3 - 0.25f + 1.0f, f * 0.6f, d);
                this.method_be1b7ef7_FWm((float)n + 0.375f, (float)n + 0.625f, (float)n2 + 0.375f, (float)n2 + 0.375f, (float)n3 - 0.25f + 1.0f - f2, (float)n3 - 0.25f + 1.0f, f * 0.5f, d);
                this.method_be1b7ef7_FWm((float)n + 0.625f, (float)n + 0.375f, (float)n2 + 0.625f, (float)n2 + 0.625f, (float)n3 - 0.25f + 1.0f - f2, (float)n3 - 0.25f + 1.0f, f, d);
                break;
            }
            case 4: {
                this.field_2092ae_Dne = 1;
                this.field_21260d_FWm = 2;
                this.field_2d29f4_aFZ = 2;
                this.field_388da6_zGp = 1;
                this.method_adff145a_Dne(0.0, 0.0, 0.0, 0.25, 1.0, 1.0);
                this.method_9743b2ba_udO(zKP2, n, n2, n3);
                this.method_e2373e85_bzF((float)n + 0.25f, (float)n + 0.25f + f2, (float)n2 + 0.375f, (float)n2 + 0.375f, (float)n3 + 0.625f, (float)n3 + 0.375f, f * 0.5f, d);
                this.method_e2373e85_bzF((float)n + 0.25f, (float)n + 0.25f + f2, (float)n2 + 0.625f, (float)n2 + 0.625f, (float)n3 + 0.375f, (float)n3 + 0.625f, f, d);
                this.method_e2373e85_bzF((float)n + 0.25f, (float)n + 0.25f + f2, (float)n2 + 0.375f, (float)n2 + 0.625f, (float)n3 + 0.375f, (float)n3 + 0.375f, f * 0.6f, d);
                this.method_e2373e85_bzF((float)n + 0.25f, (float)n + 0.25f + f2, (float)n2 + 0.625f, (float)n2 + 0.375f, (float)n3 + 0.625f, (float)n3 + 0.625f, f * 0.6f, d);
                break;
            }
            case 5: {
                this.field_2092ae_Dne = 2;
                this.field_21260d_FWm = 1;
                this.field_2d29f4_aFZ = 1;
                this.field_388da6_zGp = 2;
                this.method_adff145a_Dne(0.75, 0.0, 0.0, 1.0, 1.0, 1.0);
                this.method_9743b2ba_udO(zKP2, n, n2, n3);
                this.method_e2373e85_bzF((float)n - 0.25f + 1.0f - f2, (float)n - 0.25f + 1.0f, (float)n2 + 0.375f, (float)n2 + 0.375f, (float)n3 + 0.625f, (float)n3 + 0.375f, f * 0.5f, d);
                this.method_e2373e85_bzF((float)n - 0.25f + 1.0f - f2, (float)n - 0.25f + 1.0f, (float)n2 + 0.625f, (float)n2 + 0.625f, (float)n3 + 0.375f, (float)n3 + 0.625f, f, d);
                this.method_e2373e85_bzF((float)n - 0.25f + 1.0f - f2, (float)n - 0.25f + 1.0f, (float)n2 + 0.375f, (float)n2 + 0.625f, (float)n3 + 0.375f, (float)n3 + 0.375f, f * 0.6f, d);
                this.method_e2373e85_bzF((float)n - 0.25f + 1.0f - f2, (float)n - 0.25f + 1.0f, (float)n2 + 0.625f, (float)n2 + 0.375f, (float)n3 + 0.625f, (float)n3 + 0.625f, f * 0.6f, d);
            }
        }
        this.field_2092ae_Dne = 0;
        this.field_21260d_FWm = 0;
        this.field_2e5f1b_bzF = 0;
        this.field_267cf5_Qnq = 0;
        this.field_2d29f4_aFZ = 0;
        this.field_388da6_zGp = 0;
        this.method_adff145a_Dne(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
        return true;
    }

    public void method_5632927b_Dne(zKP zKP2, int n, int n2, int n3) {
        this.field_267d06_Qnq = true;
        this.method_5632927f_Dne(zKP2, n, n2, n3);
        this.field_267d06_Qnq = false;
    }

    public gDn method_b27f0188_Dne(zKP zKP2, int n, int n2) {
        return this.method_36cdcef6_Dne(zKP2.method_9051f17a_Dne(n, n2));
    }

    public boolean method_bda9fea0_Dne(MZM mZM, int n, int n2, int n3) {
        boolean bl = mZM.method_8f2f2092_FWm(this.field_3706cf9_Dne, n - 1, n2, n3);
        boolean bl2 = mZM.method_8f2f2092_FWm(this.field_3706cf9_Dne, n + 1, n2, n3);
        boolean bl3 = mZM.method_8f2f2092_FWm(this.field_3706cf9_Dne, n, n2, n3 - 1);
        boolean bl4 = mZM.method_8f2f2092_FWm(this.field_3706cf9_Dne, n, n2, n3 + 1);
        boolean bl5 = bl3 && bl4 && !bl && !bl2;
        boolean bl6 = !bl3 && !bl4 && bl && bl2;
        boolean bl7 = this.field_3706cf9_Dne.method_2c2cf7cd_Dne(n, n2 + 1, n3);
        if ((bl5 || bl6) && bl7) {
            if (bl5) {
                this.method_adff145a_Dne(0.3125, 0.0, 0.0, 0.6875, 0.8125, 1.0);
                this.method_9743b2ba_udO(mZM, n, n2, n3);
            } else {
                this.method_adff145a_Dne(0.0, 0.0, 0.3125, 1.0, 0.8125, 0.6875);
                this.method_9743b2ba_udO(mZM, n, n2, n3);
            }
        } else {
            this.method_adff145a_Dne(0.25, 0.0, 0.25, 0.75, 1.0, 0.75);
            this.method_9743b2ba_udO(mZM, n, n2, n3);
            if (bl) {
                this.method_adff145a_Dne(0.0, 0.0, 0.3125, 0.25, 0.8125, 0.6875);
                this.method_9743b2ba_udO(mZM, n, n2, n3);
            }
            if (bl2) {
                this.method_adff145a_Dne(0.75, 0.0, 0.3125, 1.0, 0.8125, 0.6875);
                this.method_9743b2ba_udO(mZM, n, n2, n3);
            }
            if (bl3) {
                this.method_adff145a_Dne(0.3125, 0.0, 0.0, 0.6875, 0.8125, 0.25);
                this.method_9743b2ba_udO(mZM, n, n2, n3);
            }
            if (bl4) {
                this.method_adff145a_Dne(0.3125, 0.0, 0.75, 0.6875, 0.8125, 1.0);
                this.method_9743b2ba_udO(mZM, n, n2, n3);
            }
        }
        mZM.method_fbabf7ef_Dne(this.field_3706cf9_Dne, n, n2, n3);
        return true;
    }

    public boolean method_5632927f_Dne(zKP zKP2, int n, int n2, int n3) {
        int n4 = zKP2.method_7a46288d_Dne();
        if (n4 == -1) {
            return false;
        }
        zKP2.method_fbabf7ef_Dne(this.field_3706cf9_Dne, n, n2, n3);
        this.method_c74bdb28_Dne(zKP2);
        return n4 == 0 ? this.method_9743b2ba_udO(zKP2, n, n2, n3) : (n4 == 4 ? this.method_bfc215e7_kGO(zKP2, n, n2, n3) : (n4 == 31 ? this.method_34f676b5_ooe(zKP2, n, n2, n3) : (n4 == 1 ? this.method_265bacd3_IjH(zKP2, n, n2, n3) : (n4 == 2 ? this.method_e9b5bb1e_FWm(zKP2, n, n2, n3) : (n4 == 20 ? this.method_6c28a129_div(zKP2, n, n2, n3) : (n4 == 11 ? this.method_6f91619b_Dne((LRA)zKP2, n, n2, n3) : (n4 == 39 ? this.method_df56d9a5_trS(zKP2, n, n2, n3) : (n4 == 5 ? this.method_f9a73777_zGp(zKP2, n, n2, n3) : (n4 == 13 ? this.method_ca98e043_qLR(zKP2, n, n2, n3) : (n4 == 9 ? this.method_e7d6e014_Dne((Oaf)zKP2, n, n2, n3) : (n4 == 19 ? this.method_25af06dd_mrb(zKP2, n, n2, n3) : (n4 == 23 ? this.method_bb0e88a7_Zpi(zKP2, n, n2, n3) : (n4 == 6 ? this.method_d3ba357e_XHL(zKP2, n, n2, n3) : (n4 == 3 ? this.method_85db44a8_Dne((iqp)zKP2, n, n2, n3) : (n4 == 8 ? this.method_af0278e8_DyG(zKP2, n, n2, n3) : (n4 == 7 ? this.method_8115e0a8_ATE(zKP2, n, n2, n3) : (n4 == 10 ? this.method_ec718e8b_Dne((vla)zKP2, n, n2, n3) : (n4 == 27 ? this.method_8ebefff1_Dne((tVs)zKP2, n, n2, n3) : (n4 == 32 ? this.method_bda9fea0_Dne((MZM)zKP2, n, n2, n3) : (n4 == 12 ? this.method_dd17aac_bzF(zKP2, n, n2, n3) : (n4 == 29 ? this.method_2ac99006_Qnq(zKP2, n, n2, n3) : (n4 == 30 ? this.method_53374a45_aFZ(zKP2, n, n2, n3) : (n4 == 14 ? this.method_ce27d10e_Vxn(zKP2, n, n2, n3) : (n4 == 15 ? this.method_6316da6c_Dne((xui)zKP2, n, n2, n3) : (n4 == 36 ? this.method_bea2109_Dne((gvx)zKP2, n, n2, n3) : (n4 == 37 ? this.method_61ecf23a_Dne((YkL)zKP2, n, n2, n3) : (n4 == 16 ? this.method_70206fbd_Dne(zKP2, n, n2, n3, false) : (n4 == 17 ? this.method_4d025afe_FWm(zKP2, n, n2, n3, true) : (n4 == 18 ? this.method_768ede18_Dne((CRG)zKP2, n, n2, n3) : (n4 == 21 ? this.method_46142a36_Dne((SFI)zKP2, n, n2, n3) : (n4 == 24 ? this.method_74a7654f_Dne((BTA)zKP2, n, n2, n3) : (n4 == 33 ? this.method_a5c7ad92_Dne((aeV)zKP2, n, n2, n3) : (n4 == 35 ? this.method_aa7a7b22_Dne((qQB)zKP2, n, n2, n3) : (n4 == 25 ? this.method_bc7600c0_Dne((TXd)zKP2, n, n2, n3) : (n4 == 26 ? this.method_60822b8e_Dne((KPs)zKP2, n, n2, n3) : (n4 == 28 ? this.method_bec3468a_Dne((Lsq)zKP2, n, n2, n3) : (n4 == 34 ? this.method_42402dcd_Dne((dMv)zKP2, n, n2, n3) : (n4 == 38 ? this.method_e3627d04_Dne((SrC)zKP2, n, n2, n3) : false))))))))))))))))))))))))))))))))))))));
    }

    public boolean method_9743b2ba_udO(zKP zKP2, int n, int n2, int n3) {
        int n4 = zKP2.method_fbabf7e2_Dne(this.field_3706cf9_Dne, n, n2, n3);
        float f = (float)(n4 >> 16 & 0xFF) / 255.0f;
        float f2 = (float)(n4 >> 8 & 0xFF) / 255.0f;
        float f3 = (float)(n4 & 0xFF) / 255.0f;
        if (OEA.field_2092bf_Dne) {
            float f4 = (f * 30.0f + f2 * 59.0f + f3 * 11.0f) / 100.0f;
            float f5 = (f * 30.0f + f2 * 70.0f) / 100.0f;
            float f6 = (f * 30.0f + f3 * 70.0f) / 100.0f;
            f = f4;
            f2 = f5;
            f3 = f6;
        }
        return Minecraft.method_907a9d25_Qnq() && zKP.field_59d86bc_bzF[zKP2.field_21260d_FWm] == 0 ? (this.field_388db7_zGp ? this.method_14caa66a_FWm(zKP2, n, n2, n3, f, f2, f3) : this.method_e8b68769_Dne(zKP2, n, n2, n3, f, f2, f3)) : this.method_de3141c_bzF(zKP2, n, n2, n3, f, f2, f3);
    }

    public boolean method_6c28a129_div(zKP zKP2, int n, int n2, int n3) {
        WAR wAR = WAR.field_36e5ca4_Dne;
        gDn gDn2 = this.method_5d830b5b_Dne(zKP2, 0);
        if (this.method_7a46289e_Dne()) {
            gDn2 = this.field_375b13b_Dne;
        }
        float f = 1.0f;
        wAR.method_117d19ea_FWm(zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3));
        int n4 = zKP2.method_fbabf7e2_Dne(this.field_3706cf9_Dne, n, n2, n3);
        float f2 = (float)(n4 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n4 >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n4 & 0xFF) / 255.0f;
        wAR.method_2c0148e6_Dne(f * f2, f * f3, f * f4);
        double d = gDn2.method_7a46288a_Dne();
        double d2 = gDn2.method_ae128db7_bzF();
        double d3 = gDn2.method_7c6f6029_FWm();
        double d4 = gDn2.method_907a9d11_Qnq();
        double d5 = 0.05f;
        int n5 = this.field_3706cf9_Dne.method_2dee76f_bzF(n, n2, n3);
        if ((n5 & 2) != 0) {
            wAR.method_c38c5864_Dne((double)n + d5, n2 + 1, n3 + 1, d, d2);
            wAR.method_c38c5864_Dne((double)n + d5, n2 + 0, n3 + 1, d, d4);
            wAR.method_c38c5864_Dne((double)n + d5, n2 + 0, n3 + 0, d3, d4);
            wAR.method_c38c5864_Dne((double)n + d5, n2 + 1, n3 + 0, d3, d2);
            wAR.method_c38c5864_Dne((double)n + d5, n2 + 1, n3 + 0, d3, d2);
            wAR.method_c38c5864_Dne((double)n + d5, n2 + 0, n3 + 0, d3, d4);
            wAR.method_c38c5864_Dne((double)n + d5, n2 + 0, n3 + 1, d, d4);
            wAR.method_c38c5864_Dne((double)n + d5, n2 + 1, n3 + 1, d, d2);
        }
        if ((n5 & 8) != 0) {
            wAR.method_c38c5864_Dne((double)(n + 1) - d5, n2 + 0, n3 + 1, d3, d4);
            wAR.method_c38c5864_Dne((double)(n + 1) - d5, n2 + 1, n3 + 1, d3, d2);
            wAR.method_c38c5864_Dne((double)(n + 1) - d5, n2 + 1, n3 + 0, d, d2);
            wAR.method_c38c5864_Dne((double)(n + 1) - d5, n2 + 0, n3 + 0, d, d4);
            wAR.method_c38c5864_Dne((double)(n + 1) - d5, n2 + 0, n3 + 0, d, d4);
            wAR.method_c38c5864_Dne((double)(n + 1) - d5, n2 + 1, n3 + 0, d, d2);
            wAR.method_c38c5864_Dne((double)(n + 1) - d5, n2 + 1, n3 + 1, d3, d2);
            wAR.method_c38c5864_Dne((double)(n + 1) - d5, n2 + 0, n3 + 1, d3, d4);
        }
        if ((n5 & 4) != 0) {
            wAR.method_c38c5864_Dne(n + 1, n2 + 0, (double)n3 + d5, d3, d4);
            wAR.method_c38c5864_Dne(n + 1, n2 + 1, (double)n3 + d5, d3, d2);
            wAR.method_c38c5864_Dne(n + 0, n2 + 1, (double)n3 + d5, d, d2);
            wAR.method_c38c5864_Dne(n + 0, n2 + 0, (double)n3 + d5, d, d4);
            wAR.method_c38c5864_Dne(n + 0, n2 + 0, (double)n3 + d5, d, d4);
            wAR.method_c38c5864_Dne(n + 0, n2 + 1, (double)n3 + d5, d, d2);
            wAR.method_c38c5864_Dne(n + 1, n2 + 1, (double)n3 + d5, d3, d2);
            wAR.method_c38c5864_Dne(n + 1, n2 + 0, (double)n3 + d5, d3, d4);
        }
        if ((n5 & 1) != 0) {
            wAR.method_c38c5864_Dne(n + 1, n2 + 1, (double)(n3 + 1) - d5, d, d2);
            wAR.method_c38c5864_Dne(n + 1, n2 + 0, (double)(n3 + 1) - d5, d, d4);
            wAR.method_c38c5864_Dne(n + 0, n2 + 0, (double)(n3 + 1) - d5, d3, d4);
            wAR.method_c38c5864_Dne(n + 0, n2 + 1, (double)(n3 + 1) - d5, d3, d2);
            wAR.method_c38c5864_Dne(n + 0, n2 + 1, (double)(n3 + 1) - d5, d3, d2);
            wAR.method_c38c5864_Dne(n + 0, n2 + 0, (double)(n3 + 1) - d5, d3, d4);
            wAR.method_c38c5864_Dne(n + 1, n2 + 0, (double)(n3 + 1) - d5, d, d4);
            wAR.method_c38c5864_Dne(n + 1, n2 + 1, (double)(n3 + 1) - d5, d, d2);
        }
        if (this.field_3706cf9_Dne.method_6fdef3c4_DyG(n, n2 + 1, n3)) {
            wAR.method_c38c5864_Dne(n + 1, (double)(n2 + 1) - d5, n3 + 0, d, d2);
            wAR.method_c38c5864_Dne(n + 1, (double)(n2 + 1) - d5, n3 + 1, d, d4);
            wAR.method_c38c5864_Dne(n + 0, (double)(n2 + 1) - d5, n3 + 1, d3, d4);
            wAR.method_c38c5864_Dne(n + 0, (double)(n2 + 1) - d5, n3 + 0, d3, d2);
        }
        return true;
    }

    public void method_e4fb4bad_bzF(zKP zKP2, double d, double d2, double d3, gDn gDn2) {
        double d4;
        WAR wAR = WAR.field_36e5ca4_Dne;
        if (this.method_7a46289e_Dne()) {
            gDn2 = this.field_375b13b_Dne;
        }
        double d5 = gDn2.method_ce7f4ad4_Dne(this.field_2092a9_Dne * 16.0);
        double d6 = gDn2.method_ce7f4ad4_Dne(this.field_212608_FWm * 16.0);
        double d7 = gDn2.method_117d0715_FWm(16.0 - this.field_267cf0_Qnq * 16.0);
        double d8 = gDn2.method_117d0715_FWm(16.0 - this.field_2e5f16_bzF * 16.0);
        if (this.field_2e5f2c_bzF) {
            d4 = d5;
            d5 = d6;
            d6 = d4;
        }
        if (this.field_2092a9_Dne < 0.0 || this.field_212608_FWm > 1.0) {
            d5 = gDn2.method_7a46288a_Dne();
            d6 = gDn2.method_7c6f6029_FWm();
        }
        if (this.field_2e5f16_bzF < 0.0 || this.field_267cf0_Qnq > 1.0) {
            d7 = gDn2.method_ae128db7_bzF();
            d8 = gDn2.method_907a9d11_Qnq();
        }
        d4 = d6;
        double d9 = d5;
        double d10 = d7;
        double d11 = d8;
        if (this.field_2092ae_Dne == 2) {
            d5 = gDn2.method_ce7f4ad4_Dne(this.field_2e5f16_bzF * 16.0);
            d7 = gDn2.method_117d0715_FWm(16.0 - this.field_2092a9_Dne * 16.0);
            d6 = gDn2.method_ce7f4ad4_Dne(this.field_267cf0_Qnq * 16.0);
            d8 = gDn2.method_117d0715_FWm(16.0 - this.field_212608_FWm * 16.0);
            d10 = d7;
            d11 = d8;
            d4 = d5;
            d9 = d6;
            d7 = d8;
            d8 = d10;
        } else if (this.field_2092ae_Dne == 1) {
            d5 = gDn2.method_ce7f4ad4_Dne(16.0 - this.field_267cf0_Qnq * 16.0);
            d7 = gDn2.method_117d0715_FWm(this.field_212608_FWm * 16.0);
            d6 = gDn2.method_ce7f4ad4_Dne(16.0 - this.field_2e5f16_bzF * 16.0);
            d8 = gDn2.method_117d0715_FWm(this.field_2092a9_Dne * 16.0);
            d4 = d6;
            d9 = d5;
            d5 = d6;
            d6 = d9;
            d10 = d8;
            d11 = d7;
        } else if (this.field_2092ae_Dne == 3) {
            d5 = gDn2.method_ce7f4ad4_Dne(16.0 - this.field_2092a9_Dne * 16.0);
            d6 = gDn2.method_ce7f4ad4_Dne(16.0 - this.field_212608_FWm * 16.0);
            d7 = gDn2.method_117d0715_FWm(this.field_267cf0_Qnq * 16.0);
            d8 = gDn2.method_117d0715_FWm(this.field_2e5f16_bzF * 16.0);
            d4 = d6;
            d9 = d5;
            d10 = d7;
            d11 = d8;
        }
        double d12 = d + this.field_2092a9_Dne;
        double d13 = d + this.field_212608_FWm;
        double d14 = d2 + this.field_2e5f16_bzF;
        double d15 = d2 + this.field_267cf0_Qnq;
        double d16 = d3 + this.field_2d29ef_aFZ;
        if (this.field_20b868_DyG) {
            wAR.method_2c0148e6_Dne(this.field_212c18_EyB, this.field_36e4d7_vSL, this.field_3649f6_tgc);
            wAR.method_117d19ea_FWm(this.field_217c26_Fnk);
            wAR.method_c38c5864_Dne(d12, d15, d16, d4, d10);
            wAR.method_2c0148e6_Dne(this.field_215b33_FfS, this.field_26818c_RPx, this.field_34b5fe_qXo);
            wAR.method_117d19ea_FWm(this.field_307847_gnI);
            wAR.method_c38c5864_Dne(d13, d15, d16, d5, d7);
            wAR.method_2c0148e6_Dne(this.field_2569d2_OdI, this.field_217c23_Fnk, this.field_1f1786_AgF);
            wAR.method_117d19ea_FWm(this.field_3649f9_tgc);
            wAR.method_c38c5864_Dne(d13, d14, d16, d9, d11);
            wAR.method_2c0148e6_Dne(this.field_3393da_oIf, this.field_307844_gnI, this.field_383100_yMz);
            wAR.method_117d19ea_FWm(this.field_34b601_qXo);
            wAR.method_c38c5864_Dne(d12, d14, d16, d6, d8);
        } else {
            wAR.method_c38c5864_Dne(d12, d15, d16, d4, d10);
            wAR.method_c38c5864_Dne(d13, d15, d16, d5, d7);
            wAR.method_c38c5864_Dne(d13, d14, d16, d9, d11);
            wAR.method_c38c5864_Dne(d12, d14, d16, d6, d8);
        }
    }

    private boolean method_f5d6cbd3_Dne(qQB qQB2, int n, int n2, int n3, int n4, boolean bl) {
        int n5 = bl ? 0 : n4 & 3;
        boolean bl2 = false;
        float f = 0.0f;
        switch (n5) {
            case 0: {
                this.field_2e5f1b_bzF = 2;
                this.field_267cf5_Qnq = 1;
                this.field_2d29f4_aFZ = 3;
                this.field_388da6_zGp = 3;
                break;
            }
            case 1: {
                this.field_2092ae_Dne = 1;
                this.field_21260d_FWm = 2;
                this.field_2d29f4_aFZ = 2;
                this.field_388da6_zGp = 1;
                bl2 = true;
                break;
            }
            case 2: {
                this.field_2e5f1b_bzF = 1;
                this.field_267cf5_Qnq = 2;
                break;
            }
            case 3: {
                this.field_2092ae_Dne = 2;
                this.field_21260d_FWm = 1;
                this.field_2d29f4_aFZ = 1;
                this.field_388da6_zGp = 2;
                bl2 = true;
            }
        }
        f = this.method_71d3a92e_Dne(qQB2, n, n2, n3, 0, f, 0.75f, 0.25f, 0.75f, bl2, bl, n4);
        f = this.method_71d3a92e_Dne(qQB2, n, n2, n3, 1, f, 0.5f, 0.0625f, 0.625f, bl2, bl, n4);
        f = this.method_71d3a92e_Dne(qQB2, n, n2, n3, 2, f, 0.25f, 0.3125f, 0.5f, bl2, bl, n4);
        this.method_71d3a92e_Dne(qQB2, n, n2, n3, 3, f, 0.625f, 0.375f, 1.0f, bl2, bl, n4);
        this.method_adff145a_Dne(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
        this.field_2092ae_Dne = 0;
        this.field_21260d_FWm = 0;
        this.field_2e5f1b_bzF = 0;
        this.field_267cf5_Qnq = 0;
        this.field_2d29f4_aFZ = 0;
        this.field_388da6_zGp = 0;
        return true;
    }

    private float method_71d3a92e_Dne(qQB qQB2, int n, int n2, int n3, int n4, float f, float f2, float f3, float f4, boolean bl, boolean bl2, int n5) {
        if (bl) {
            float f5 = f2;
            f2 = f4;
            f4 = f5;
        }
        qQB2.field_2092ae_Dne = n4;
        this.method_adff145a_Dne(0.5f - (f2 /= 2.0f), f, 0.5f - (f4 /= 2.0f), 0.5f + f2, f + f3, 0.5f + f4);
        if (bl2) {
            WAR wAR = WAR.field_36e5ca4_Dne;
            wAR.method_7a46289a_Dne();
            wAR.method_a680f8e7_FWm(0.0f, -1.0f, 0.0f);
            this.method_58bf1fba_Dne(qQB2, 0.0, 0.0, 0.0, this.method_b27f0188_Dne(qQB2, 0, n5));
            wAR.method_7a46288d_Dne();
            wAR.method_7a46289a_Dne();
            wAR.method_a680f8e7_FWm(0.0f, 1.0f, 0.0f);
            this.method_d047827b_FWm(qQB2, 0.0, 0.0, 0.0, this.method_b27f0188_Dne(qQB2, 1, n5));
            wAR.method_7a46288d_Dne();
            wAR.method_7a46289a_Dne();
            wAR.method_a680f8e7_FWm(0.0f, 0.0f, -1.0f);
            this.method_e4fb4bad_bzF(qQB2, 0.0, 0.0, 0.0, this.method_b27f0188_Dne(qQB2, 2, n5));
            wAR.method_7a46288d_Dne();
            wAR.method_7a46289a_Dne();
            wAR.method_a680f8e7_FWm(0.0f, 0.0f, 1.0f);
            this.method_925c7e93_Qnq(qQB2, 0.0, 0.0, 0.0, this.method_b27f0188_Dne(qQB2, 3, n5));
            wAR.method_7a46288d_Dne();
            wAR.method_7a46289a_Dne();
            wAR.method_a680f8e7_FWm(-1.0f, 0.0f, 0.0f);
            this.method_76f453b4_aFZ(qQB2, 0.0, 0.0, 0.0, this.method_b27f0188_Dne(qQB2, 4, n5));
            wAR.method_7a46288d_Dne();
            wAR.method_7a46289a_Dne();
            wAR.method_a680f8e7_FWm(1.0f, 0.0f, 0.0f);
            this.method_3fc2d5c2_zGp(qQB2, 0.0, 0.0, 0.0, this.method_b27f0188_Dne(qQB2, 5, n5));
            wAR.method_7a46288d_Dne();
        } else {
            this.method_9743b2ba_udO(qQB2, n, n2, n3);
        }
        return f + f3;
    }

    public boolean method_ca98e043_qLR(zKP zKP2, int n, int n2, int n3) {
        int n4 = zKP2.method_fbabf7e2_Dne(this.field_3706cf9_Dne, n, n2, n3);
        float f = (float)(n4 >> 16 & 0xFF) / 255.0f;
        float f2 = (float)(n4 >> 8 & 0xFF) / 255.0f;
        float f3 = (float)(n4 & 0xFF) / 255.0f;
        if (OEA.field_2092bf_Dne) {
            float f4 = (f * 30.0f + f2 * 59.0f + f3 * 11.0f) / 100.0f;
            float f5 = (f * 30.0f + f2 * 70.0f) / 100.0f;
            float f6 = (f * 30.0f + f3 * 70.0f) / 100.0f;
            f = f4;
            f2 = f5;
            f3 = f6;
        }
        return this.method_379fc882_Qnq(zKP2, n, n2, n3, f, f2, f3);
    }

    public boolean method_85db44a8_Dne(iqp iqp2, int n, int n2, int n3) {
        WAR wAR = WAR.field_36e5ca4_Dne;
        gDn gDn2 = iqp2.method_9e795529_Dne(0);
        gDn gDn3 = iqp2.method_9e795529_Dne(1);
        gDn gDn4 = gDn2;
        if (this.method_7a46289e_Dne()) {
            gDn4 = this.field_375b13b_Dne;
        }
        wAR.method_2c0148e6_Dne(1.0f, 1.0f, 1.0f);
        wAR.method_117d19ea_FWm(iqp2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3));
        double d = gDn4.method_7a46288a_Dne();
        double d2 = gDn4.method_ae128db7_bzF();
        double d3 = gDn4.method_7c6f6029_FWm();
        double d4 = gDn4.method_907a9d11_Qnq();
        float f = 1.4f;
        if (!this.field_3706cf9_Dne.method_73e9b8f9_IjH(n, n2 - 1, n3) && !zKP.field_3774324_Dne.method_8f2f2092_FWm(this.field_3706cf9_Dne, n, n2 - 1, n3)) {
            double d5;
            float f2 = 0.2f;
            float f3 = 0.0625f;
            if ((n + n2 + n3 & 1) == 1) {
                d = gDn3.method_7a46288a_Dne();
                d2 = gDn3.method_ae128db7_bzF();
                d3 = gDn3.method_7c6f6029_FWm();
                d4 = gDn3.method_907a9d11_Qnq();
            }
            if ((n / 2 + n2 / 2 + n3 / 2 & 1) == 1) {
                d5 = d3;
                d3 = d;
                d = d5;
            }
            if (zKP.field_3774324_Dne.method_8f2f2092_FWm(this.field_3706cf9_Dne, n - 1, n2, n3)) {
                wAR.method_c38c5864_Dne((float)n + f2, (float)n2 + f + f3, n3 + 1, d3, d2);
                wAR.method_c38c5864_Dne(n + 0, (float)(n2 + 0) + f3, n3 + 1, d3, d4);
                wAR.method_c38c5864_Dne(n + 0, (float)(n2 + 0) + f3, n3 + 0, d, d4);
                wAR.method_c38c5864_Dne((float)n + f2, (float)n2 + f + f3, n3 + 0, d, d2);
                wAR.method_c38c5864_Dne((float)n + f2, (float)n2 + f + f3, n3 + 0, d, d2);
                wAR.method_c38c5864_Dne(n + 0, (float)(n2 + 0) + f3, n3 + 0, d, d4);
                wAR.method_c38c5864_Dne(n + 0, (float)(n2 + 0) + f3, n3 + 1, d3, d4);
                wAR.method_c38c5864_Dne((float)n + f2, (float)n2 + f + f3, n3 + 1, d3, d2);
            }
            if (zKP.field_3774324_Dne.method_8f2f2092_FWm(this.field_3706cf9_Dne, n + 1, n2, n3)) {
                wAR.method_c38c5864_Dne((float)(n + 1) - f2, (float)n2 + f + f3, n3 + 0, d, d2);
                wAR.method_c38c5864_Dne(n + 1 - 0, (float)(n2 + 0) + f3, n3 + 0, d, d4);
                wAR.method_c38c5864_Dne(n + 1 - 0, (float)(n2 + 0) + f3, n3 + 1, d3, d4);
                wAR.method_c38c5864_Dne((float)(n + 1) - f2, (float)n2 + f + f3, n3 + 1, d3, d2);
                wAR.method_c38c5864_Dne((float)(n + 1) - f2, (float)n2 + f + f3, n3 + 1, d3, d2);
                wAR.method_c38c5864_Dne(n + 1 - 0, (float)(n2 + 0) + f3, n3 + 1, d3, d4);
                wAR.method_c38c5864_Dne(n + 1 - 0, (float)(n2 + 0) + f3, n3 + 0, d, d4);
                wAR.method_c38c5864_Dne((float)(n + 1) - f2, (float)n2 + f + f3, n3 + 0, d, d2);
            }
            if (zKP.field_3774324_Dne.method_8f2f2092_FWm(this.field_3706cf9_Dne, n, n2, n3 - 1)) {
                wAR.method_c38c5864_Dne(n + 0, (float)n2 + f + f3, (float)n3 + f2, d3, d2);
                wAR.method_c38c5864_Dne(n + 0, (float)(n2 + 0) + f3, n3 + 0, d3, d4);
                wAR.method_c38c5864_Dne(n + 1, (float)(n2 + 0) + f3, n3 + 0, d, d4);
                wAR.method_c38c5864_Dne(n + 1, (float)n2 + f + f3, (float)n3 + f2, d, d2);
                wAR.method_c38c5864_Dne(n + 1, (float)n2 + f + f3, (float)n3 + f2, d, d2);
                wAR.method_c38c5864_Dne(n + 1, (float)(n2 + 0) + f3, n3 + 0, d, d4);
                wAR.method_c38c5864_Dne(n + 0, (float)(n2 + 0) + f3, n3 + 0, d3, d4);
                wAR.method_c38c5864_Dne(n + 0, (float)n2 + f + f3, (float)n3 + f2, d3, d2);
            }
            if (zKP.field_3774324_Dne.method_8f2f2092_FWm(this.field_3706cf9_Dne, n, n2, n3 + 1)) {
                wAR.method_c38c5864_Dne(n + 1, (float)n2 + f + f3, (float)(n3 + 1) - f2, d, d2);
                wAR.method_c38c5864_Dne(n + 1, (float)(n2 + 0) + f3, n3 + 1 - 0, d, d4);
                wAR.method_c38c5864_Dne(n + 0, (float)(n2 + 0) + f3, n3 + 1 - 0, d3, d4);
                wAR.method_c38c5864_Dne(n + 0, (float)n2 + f + f3, (float)(n3 + 1) - f2, d3, d2);
                wAR.method_c38c5864_Dne(n + 0, (float)n2 + f + f3, (float)(n3 + 1) - f2, d3, d2);
                wAR.method_c38c5864_Dne(n + 0, (float)(n2 + 0) + f3, n3 + 1 - 0, d3, d4);
                wAR.method_c38c5864_Dne(n + 1, (float)(n2 + 0) + f3, n3 + 1 - 0, d, d4);
                wAR.method_c38c5864_Dne(n + 1, (float)n2 + f + f3, (float)(n3 + 1) - f2, d, d2);
            }
            if (zKP.field_3774324_Dne.method_8f2f2092_FWm(this.field_3706cf9_Dne, n, n2 + 1, n3)) {
                d5 = (double)n + 0.5 + 0.5;
                double d6 = (double)n + 0.5 - 0.5;
                double d7 = (double)n3 + 0.5 + 0.5;
                double d8 = (double)n3 + 0.5 - 0.5;
                double d9 = (double)n + 0.5 - 0.5;
                double d10 = (double)n + 0.5 + 0.5;
                double d11 = (double)n3 + 0.5 - 0.5;
                double d12 = (double)n3 + 0.5 + 0.5;
                d = gDn2.method_7a46288a_Dne();
                d2 = gDn2.method_ae128db7_bzF();
                d3 = gDn2.method_7c6f6029_FWm();
                d4 = gDn2.method_907a9d11_Qnq();
                f = -0.2f;
                if ((n + ++n2 + n3 & 1) == 0) {
                    wAR.method_c38c5864_Dne(d9, (float)n2 + f, n3 + 0, d3, d2);
                    wAR.method_c38c5864_Dne(d5, n2 + 0, n3 + 0, d3, d4);
                    wAR.method_c38c5864_Dne(d5, n2 + 0, n3 + 1, d, d4);
                    wAR.method_c38c5864_Dne(d9, (float)n2 + f, n3 + 1, d, d2);
                    d = gDn3.method_7a46288a_Dne();
                    d2 = gDn3.method_ae128db7_bzF();
                    d3 = gDn3.method_7c6f6029_FWm();
                    d4 = gDn3.method_907a9d11_Qnq();
                    wAR.method_c38c5864_Dne(d10, (float)n2 + f, n3 + 1, d3, d2);
                    wAR.method_c38c5864_Dne(d6, n2 + 0, n3 + 1, d3, d4);
                    wAR.method_c38c5864_Dne(d6, n2 + 0, n3 + 0, d, d4);
                    wAR.method_c38c5864_Dne(d10, (float)n2 + f, n3 + 0, d, d2);
                } else {
                    wAR.method_c38c5864_Dne(n + 0, (float)n2 + f, d12, d3, d2);
                    wAR.method_c38c5864_Dne(n + 0, n2 + 0, d8, d3, d4);
                    wAR.method_c38c5864_Dne(n + 1, n2 + 0, d8, d, d4);
                    wAR.method_c38c5864_Dne(n + 1, (float)n2 + f, d12, d, d2);
                    d = gDn3.method_7a46288a_Dne();
                    d2 = gDn3.method_ae128db7_bzF();
                    d3 = gDn3.method_7c6f6029_FWm();
                    d4 = gDn3.method_907a9d11_Qnq();
                    wAR.method_c38c5864_Dne(n + 1, (float)n2 + f, d11, d3, d2);
                    wAR.method_c38c5864_Dne(n + 1, n2 + 0, d7, d3, d4);
                    wAR.method_c38c5864_Dne(n + 0, n2 + 0, d7, d, d4);
                    wAR.method_c38c5864_Dne(n + 0, (float)n2 + f, d11, d, d2);
                }
            }
        } else {
            double d13 = (double)n + 0.5 + 0.2;
            double d14 = (double)n + 0.5 - 0.2;
            double d15 = (double)n3 + 0.5 + 0.2;
            double d16 = (double)n3 + 0.5 - 0.2;
            double d17 = (double)n + 0.5 - 0.3;
            double d18 = (double)n + 0.5 + 0.3;
            double d19 = (double)n3 + 0.5 - 0.3;
            double d20 = (double)n3 + 0.5 + 0.3;
            wAR.method_c38c5864_Dne(d17, (float)n2 + f, n3 + 1, d3, d2);
            wAR.method_c38c5864_Dne(d13, n2 + 0, n3 + 1, d3, d4);
            wAR.method_c38c5864_Dne(d13, n2 + 0, n3 + 0, d, d4);
            wAR.method_c38c5864_Dne(d17, (float)n2 + f, n3 + 0, d, d2);
            wAR.method_c38c5864_Dne(d18, (float)n2 + f, n3 + 0, d3, d2);
            wAR.method_c38c5864_Dne(d14, n2 + 0, n3 + 0, d3, d4);
            wAR.method_c38c5864_Dne(d14, n2 + 0, n3 + 1, d, d4);
            wAR.method_c38c5864_Dne(d18, (float)n2 + f, n3 + 1, d, d2);
            d = gDn3.method_7a46288a_Dne();
            d2 = gDn3.method_ae128db7_bzF();
            d3 = gDn3.method_7c6f6029_FWm();
            d4 = gDn3.method_907a9d11_Qnq();
            wAR.method_c38c5864_Dne(n + 1, (float)n2 + f, d20, d3, d2);
            wAR.method_c38c5864_Dne(n + 1, n2 + 0, d16, d3, d4);
            wAR.method_c38c5864_Dne(n + 0, n2 + 0, d16, d, d4);
            wAR.method_c38c5864_Dne(n + 0, (float)n2 + f, d20, d, d2);
            wAR.method_c38c5864_Dne(n + 0, (float)n2 + f, d19, d3, d2);
            wAR.method_c38c5864_Dne(n + 0, n2 + 0, d15, d3, d4);
            wAR.method_c38c5864_Dne(n + 1, n2 + 0, d15, d, d4);
            wAR.method_c38c5864_Dne(n + 1, (float)n2 + f, d19, d, d2);
            d13 = (double)n + 0.5 - 0.5;
            d14 = (double)n + 0.5 + 0.5;
            d15 = (double)n3 + 0.5 - 0.5;
            d16 = (double)n3 + 0.5 + 0.5;
            d17 = (double)n + 0.5 - 0.4;
            d18 = (double)n + 0.5 + 0.4;
            d19 = (double)n3 + 0.5 - 0.4;
            d20 = (double)n3 + 0.5 + 0.4;
            wAR.method_c38c5864_Dne(d17, (float)n2 + f, n3 + 0, d, d2);
            wAR.method_c38c5864_Dne(d13, n2 + 0, n3 + 0, d, d4);
            wAR.method_c38c5864_Dne(d13, n2 + 0, n3 + 1, d3, d4);
            wAR.method_c38c5864_Dne(d17, (float)n2 + f, n3 + 1, d3, d2);
            wAR.method_c38c5864_Dne(d18, (float)n2 + f, n3 + 1, d, d2);
            wAR.method_c38c5864_Dne(d14, n2 + 0, n3 + 1, d, d4);
            wAR.method_c38c5864_Dne(d14, n2 + 0, n3 + 0, d3, d4);
            wAR.method_c38c5864_Dne(d18, (float)n2 + f, n3 + 0, d3, d2);
            d = gDn2.method_7a46288a_Dne();
            d2 = gDn2.method_ae128db7_bzF();
            d3 = gDn2.method_7c6f6029_FWm();
            d4 = gDn2.method_907a9d11_Qnq();
            wAR.method_c38c5864_Dne(n + 0, (float)n2 + f, d20, d, d2);
            wAR.method_c38c5864_Dne(n + 0, n2 + 0, d16, d, d4);
            wAR.method_c38c5864_Dne(n + 1, n2 + 0, d16, d3, d4);
            wAR.method_c38c5864_Dne(n + 1, (float)n2 + f, d20, d3, d2);
            wAR.method_c38c5864_Dne(n + 1, (float)n2 + f, d19, d, d2);
            wAR.method_c38c5864_Dne(n + 1, n2 + 0, d15, d, d4);
            wAR.method_c38c5864_Dne(n + 0, n2 + 0, d15, d3, d4);
            wAR.method_c38c5864_Dne(n + 0, (float)n2 + f, d19, d3, d2);
        }
        return true;
    }

    public void method_d047827b_FWm(zKP zKP2, double d, double d2, double d3, gDn gDn2) {
        WAR wAR = WAR.field_36e5ca4_Dne;
        if (this.method_7a46289e_Dne()) {
            gDn2 = this.field_375b13b_Dne;
        }
        double d4 = gDn2.method_ce7f4ad4_Dne(this.field_2092a9_Dne * 16.0);
        double d5 = gDn2.method_ce7f4ad4_Dne(this.field_212608_FWm * 16.0);
        double d6 = gDn2.method_117d0715_FWm(this.field_2d29ef_aFZ * 16.0);
        double d7 = gDn2.method_117d0715_FWm(this.field_388da1_zGp * 16.0);
        if (this.field_2092a9_Dne < 0.0 || this.field_212608_FWm > 1.0) {
            d4 = gDn2.method_7a46288a_Dne();
            d5 = gDn2.method_7c6f6029_FWm();
        }
        if (this.field_2d29ef_aFZ < 0.0 || this.field_388da1_zGp > 1.0) {
            d6 = gDn2.method_ae128db7_bzF();
            d7 = gDn2.method_907a9d11_Qnq();
        }
        double d8 = d5;
        double d9 = d4;
        double d10 = d6;
        double d11 = d7;
        if (this.field_2d29f4_aFZ == 1) {
            d4 = gDn2.method_ce7f4ad4_Dne(this.field_2d29ef_aFZ * 16.0);
            d6 = gDn2.method_117d0715_FWm(16.0 - this.field_212608_FWm * 16.0);
            d5 = gDn2.method_ce7f4ad4_Dne(this.field_388da1_zGp * 16.0);
            d7 = gDn2.method_117d0715_FWm(16.0 - this.field_2092a9_Dne * 16.0);
            d10 = d6;
            d11 = d7;
            d8 = d4;
            d9 = d5;
            d6 = d7;
            d7 = d10;
        } else if (this.field_2d29f4_aFZ == 2) {
            d4 = gDn2.method_ce7f4ad4_Dne(16.0 - this.field_388da1_zGp * 16.0);
            d6 = gDn2.method_117d0715_FWm(this.field_2092a9_Dne * 16.0);
            d5 = gDn2.method_ce7f4ad4_Dne(16.0 - this.field_2d29ef_aFZ * 16.0);
            d7 = gDn2.method_117d0715_FWm(this.field_212608_FWm * 16.0);
            d8 = d5;
            d9 = d4;
            d4 = d5;
            d5 = d9;
            d10 = d7;
            d11 = d6;
        } else if (this.field_2d29f4_aFZ == 3) {
            d4 = gDn2.method_ce7f4ad4_Dne(16.0 - this.field_2092a9_Dne * 16.0);
            d5 = gDn2.method_ce7f4ad4_Dne(16.0 - this.field_212608_FWm * 16.0);
            d6 = gDn2.method_117d0715_FWm(16.0 - this.field_2d29ef_aFZ * 16.0);
            d7 = gDn2.method_117d0715_FWm(16.0 - this.field_388da1_zGp * 16.0);
            d8 = d5;
            d9 = d4;
            d10 = d6;
            d11 = d7;
        }
        double d12 = d + this.field_2092a9_Dne;
        double d13 = d + this.field_212608_FWm;
        double d14 = d2 + this.field_267cf0_Qnq;
        double d15 = d3 + this.field_2d29ef_aFZ;
        double d16 = d3 + this.field_388da1_zGp;
        if (this.field_20b868_DyG) {
            wAR.method_2c0148e6_Dne(this.field_212c18_EyB, this.field_36e4d7_vSL, this.field_3649f6_tgc);
            wAR.method_117d19ea_FWm(this.field_217c26_Fnk);
            wAR.method_c38c5864_Dne(d13, d14, d16, d5, d7);
            wAR.method_2c0148e6_Dne(this.field_215b33_FfS, this.field_26818c_RPx, this.field_34b5fe_qXo);
            wAR.method_117d19ea_FWm(this.field_307847_gnI);
            wAR.method_c38c5864_Dne(d13, d14, d15, d8, d10);
            wAR.method_2c0148e6_Dne(this.field_2569d2_OdI, this.field_217c23_Fnk, this.field_1f1786_AgF);
            wAR.method_117d19ea_FWm(this.field_3649f9_tgc);
            wAR.method_c38c5864_Dne(d12, d14, d15, d4, d6);
            wAR.method_2c0148e6_Dne(this.field_3393da_oIf, this.field_307844_gnI, this.field_383100_yMz);
            wAR.method_117d19ea_FWm(this.field_34b601_qXo);
            wAR.method_c38c5864_Dne(d12, d14, d16, d9, d11);
        } else {
            wAR.method_c38c5864_Dne(d13, d14, d16, d5, d7);
            wAR.method_c38c5864_Dne(d13, d14, d15, d8, d10);
            wAR.method_c38c5864_Dne(d12, d14, d15, d4, d6);
            wAR.method_c38c5864_Dne(d12, d14, d16, d9, d11);
        }
    }

    private boolean method_42402dcd_Dne(dMv dMv2, int n, int n2, int n3) {
        float f = 0.1875f;
        this.method_a68ac5f6_Dne(this.method_39bcfb28_Dne(zKP.field_e641c680_cot));
        this.method_adff145a_Dne(0.125, 0.00625f, 0.125, 0.875, f, 0.875);
        this.method_9743b2ba_udO(dMv2, n, n2, n3);
        this.method_a68ac5f6_Dne(this.method_39bcfb28_Dne(zKP.field_32988693_trS));
        this.method_adff145a_Dne(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
        this.method_9743b2ba_udO(dMv2, n, n2, n3);
        this.method_a68ac5f6_Dne(dMv2.method_230f3f9a_Dne());
        this.method_adff145a_Dne(0.1875, f, 0.1875, 0.8125, 0.875, 0.8125);
        this.method_9743b2ba_udO(dMv2, n, n2, n3);
        this.method_7a46289a_Dne();
        return true;
    }

    private boolean method_74a7654f_Dne(BTA bTA, int n, int n2, int n3) {
        float f;
        this.method_9743b2ba_udO(bTA, n, n2, n3);
        WAR wAR = WAR.field_36e5ca4_Dne;
        wAR.method_117d19ea_FWm(bTA.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3));
        float f2 = 1.0f;
        int n4 = bTA.method_fbabf7e2_Dne(this.field_3706cf9_Dne, n, n2, n3);
        float f3 = (float)(n4 >> 16 & 0xFF) / 255.0f;
        float f4 = (float)(n4 >> 8 & 0xFF) / 255.0f;
        float f5 = (float)(n4 & 0xFF) / 255.0f;
        if (OEA.field_2092bf_Dne) {
            float f6 = (f3 * 30.0f + f4 * 59.0f + f5 * 11.0f) / 100.0f;
            f = (f3 * 30.0f + f4 * 70.0f) / 100.0f;
            float f7 = (f3 * 30.0f + f5 * 70.0f) / 100.0f;
            f3 = f6;
            f4 = f;
            f5 = f7;
        }
        wAR.method_2c0148e6_Dne(f2 * f3, f2 * f4, f2 * f5);
        gDn gDn2 = bTA.method_77cd08ea_FWm(2);
        f = 0.125f;
        this.method_3fc2d5c2_zGp(bTA, (float)n - 1.0f + f, n2, n3, gDn2);
        this.method_76f453b4_aFZ(bTA, (float)n + 1.0f - f, n2, n3, gDn2);
        this.method_925c7e93_Qnq(bTA, n, n2, (float)n3 - 1.0f + f, gDn2);
        this.method_e4fb4bad_bzF(bTA, n, n2, (float)n3 + 1.0f - f, gDn2);
        gDn gDn3 = BTA.method_285881e4_Dne("cauldron_inner");
        this.method_d047827b_FWm(bTA, n, (float)n2 - 1.0f + 0.25f, n3, gDn3);
        this.method_58bf1fba_Dne(bTA, n, (float)n2 + 1.0f - 0.75f, n3, gDn3);
        int n5 = this.field_3706cf9_Dne.method_2dee76f_bzF(n, n2, n3);
        if (n5 > 0) {
            gDn gDn4 = byt.method_285881e4_Dne("water");
            if (n5 > 3) {
                n5 = 3;
            }
            this.method_d047827b_FWm(bTA, n, (float)n2 - 1.0f + (6.0f + (float)n5 * 3.0f) / 16.0f, n3, gDn4);
        }
        return true;
    }

    public void method_7a46289a_Dne() {
        this.field_375b13b_Dne = null;
    }

    public void method_8b153e5d_Dne(zKP zKP2, int n, double d, double d2, double d3, float f) {
        WAR wAR = WAR.field_36e5ca4_Dne;
        gDn gDn2 = this.method_b27f0188_Dne(zKP2, 0, n);
        if (this.method_7a46289e_Dne()) {
            gDn2 = this.field_375b13b_Dne;
        }
        double d4 = gDn2.method_7a46288a_Dne();
        double d5 = gDn2.method_ae128db7_bzF();
        double d6 = gDn2.method_7c6f6029_FWm();
        double d7 = gDn2.method_907a9d11_Qnq();
        double d8 = 0.45 * (double)f;
        double d9 = d + 0.5 - d8;
        double d10 = d + 0.5 + d8;
        double d11 = d3 + 0.5 - d8;
        double d12 = d3 + 0.5 + d8;
        wAR.method_c38c5864_Dne(d9, d2 + (double)f, d11, d4, d5);
        wAR.method_c38c5864_Dne(d9, d2 + 0.0, d11, d4, d7);
        wAR.method_c38c5864_Dne(d10, d2 + 0.0, d12, d6, d7);
        wAR.method_c38c5864_Dne(d10, d2 + (double)f, d12, d6, d5);
        wAR.method_c38c5864_Dne(d10, d2 + (double)f, d12, d4, d5);
        wAR.method_c38c5864_Dne(d10, d2 + 0.0, d12, d4, d7);
        wAR.method_c38c5864_Dne(d9, d2 + 0.0, d11, d6, d7);
        wAR.method_c38c5864_Dne(d9, d2 + (double)f, d11, d6, d5);
        wAR.method_c38c5864_Dne(d9, d2 + (double)f, d12, d4, d5);
        wAR.method_c38c5864_Dne(d9, d2 + 0.0, d12, d4, d7);
        wAR.method_c38c5864_Dne(d10, d2 + 0.0, d11, d6, d7);
        wAR.method_c38c5864_Dne(d10, d2 + (double)f, d11, d6, d5);
        wAR.method_c38c5864_Dne(d10, d2 + (double)f, d11, d4, d5);
        wAR.method_c38c5864_Dne(d10, d2 + 0.0, d11, d4, d7);
        wAR.method_c38c5864_Dne(d9, d2 + 0.0, d12, d6, d7);
        wAR.method_c38c5864_Dne(d9, d2 + (double)f, d12, d6, d5);
    }

    public boolean method_f9a73777_zGp(zKP zKP2, int n, int n2, int n3) {
        boolean bl;
        WAR wAR = WAR.field_36e5ca4_Dne;
        int n4 = this.field_3706cf9_Dne.method_2dee76f_bzF(n, n2, n3);
        gDn gDn2 = VHB.method_285881e4_Dne("redstoneDust_cross");
        gDn gDn3 = VHB.method_285881e4_Dne("redstoneDust_line");
        gDn gDn4 = VHB.method_285881e4_Dne("redstoneDust_cross_overlay");
        gDn gDn5 = VHB.method_285881e4_Dne("redstoneDust_line_overlay");
        wAR.method_117d19ea_FWm(zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3));
        float f = 1.0f;
        float f2 = (float)n4 / 15.0f;
        float f3 = f2 * 0.6f + 0.4f;
        if (n4 == 0) {
            f3 = 0.3f;
        }
        float f4 = f2 * f2 * 0.7f - 0.5f;
        float f5 = f2 * f2 * 0.6f - 0.7f;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        wAR.method_2c0148e6_Dne(f3, f4, f5);
        boolean bl2 = VHB.method_b611966b_bzF(this.field_3706cf9_Dne, n - 1, n2, n3, 1) || !this.field_3706cf9_Dne.method_6fdef3c4_DyG(n - 1, n2, n3) && VHB.method_b611966b_bzF(this.field_3706cf9_Dne, n - 1, n2 - 1, n3, -1);
        boolean bl3 = VHB.method_b611966b_bzF(this.field_3706cf9_Dne, n + 1, n2, n3, 3) || !this.field_3706cf9_Dne.method_6fdef3c4_DyG(n + 1, n2, n3) && VHB.method_b611966b_bzF(this.field_3706cf9_Dne, n + 1, n2 - 1, n3, -1);
        boolean bl4 = VHB.method_b611966b_bzF(this.field_3706cf9_Dne, n, n2, n3 - 1, 2) || !this.field_3706cf9_Dne.method_6fdef3c4_DyG(n, n2, n3 - 1) && VHB.method_b611966b_bzF(this.field_3706cf9_Dne, n, n2 - 1, n3 - 1, -1);
        boolean bl5 = bl = VHB.method_b611966b_bzF(this.field_3706cf9_Dne, n, n2, n3 + 1, 0) || !this.field_3706cf9_Dne.method_6fdef3c4_DyG(n, n2, n3 + 1) && VHB.method_b611966b_bzF(this.field_3706cf9_Dne, n, n2 - 1, n3 + 1, -1);
        if (!this.field_3706cf9_Dne.method_6fdef3c4_DyG(n, n2 + 1, n3)) {
            if (this.field_3706cf9_Dne.method_6fdef3c4_DyG(n - 1, n2, n3) && VHB.method_b611966b_bzF(this.field_3706cf9_Dne, n - 1, n2 + 1, n3, -1)) {
                bl2 = true;
            }
            if (this.field_3706cf9_Dne.method_6fdef3c4_DyG(n + 1, n2, n3) && VHB.method_b611966b_bzF(this.field_3706cf9_Dne, n + 1, n2 + 1, n3, -1)) {
                bl3 = true;
            }
            if (this.field_3706cf9_Dne.method_6fdef3c4_DyG(n, n2, n3 - 1) && VHB.method_b611966b_bzF(this.field_3706cf9_Dne, n, n2 + 1, n3 - 1, -1)) {
                bl4 = true;
            }
            if (this.field_3706cf9_Dne.method_6fdef3c4_DyG(n, n2, n3 + 1) && VHB.method_b611966b_bzF(this.field_3706cf9_Dne, n, n2 + 1, n3 + 1, -1)) {
                bl = true;
            }
        }
        float f6 = n + 0;
        float f7 = n + 1;
        float f8 = n3 + 0;
        float f9 = n3 + 1;
        int n5 = 0;
        if ((bl2 || bl3) && !bl4 && !bl) {
            n5 = 1;
        }
        if ((bl4 || bl) && !bl3 && !bl2) {
            n5 = 2;
        }
        if (n5 == 0) {
            int n6 = 0;
            int n7 = 0;
            int n8 = 16;
            int n9 = 16;
            if (!bl2) {
                f6 += 0.3125f;
            }
            if (!bl2) {
                n6 += 5;
            }
            if (!bl3) {
                f7 -= 0.3125f;
            }
            if (!bl3) {
                n8 -= 5;
            }
            if (!bl4) {
                f8 += 0.3125f;
            }
            if (!bl4) {
                n7 += 5;
            }
            if (!bl) {
                f9 -= 0.3125f;
            }
            if (!bl) {
                n9 -= 5;
            }
            wAR.method_c38c5864_Dne(f7, (double)n2 + 0.015625, f9, gDn2.method_ce7f4ad4_Dne(n8), gDn2.method_117d0715_FWm(n9));
            wAR.method_c38c5864_Dne(f7, (double)n2 + 0.015625, f8, gDn2.method_ce7f4ad4_Dne(n8), gDn2.method_117d0715_FWm(n7));
            wAR.method_c38c5864_Dne(f6, (double)n2 + 0.015625, f8, gDn2.method_ce7f4ad4_Dne(n6), gDn2.method_117d0715_FWm(n7));
            wAR.method_c38c5864_Dne(f6, (double)n2 + 0.015625, f9, gDn2.method_ce7f4ad4_Dne(n6), gDn2.method_117d0715_FWm(n9));
            wAR.method_2c0148e6_Dne(f, f, f);
            wAR.method_c38c5864_Dne(f7, (double)n2 + 0.015625, f9, gDn4.method_ce7f4ad4_Dne(n8), gDn4.method_117d0715_FWm(n9));
            wAR.method_c38c5864_Dne(f7, (double)n2 + 0.015625, f8, gDn4.method_ce7f4ad4_Dne(n8), gDn4.method_117d0715_FWm(n7));
            wAR.method_c38c5864_Dne(f6, (double)n2 + 0.015625, f8, gDn4.method_ce7f4ad4_Dne(n6), gDn4.method_117d0715_FWm(n7));
            wAR.method_c38c5864_Dne(f6, (double)n2 + 0.015625, f9, gDn4.method_ce7f4ad4_Dne(n6), gDn4.method_117d0715_FWm(n9));
        } else if (n5 == 1) {
            wAR.method_c38c5864_Dne(f7, (double)n2 + 0.015625, f9, gDn3.method_7c6f6029_FWm(), gDn3.method_907a9d11_Qnq());
            wAR.method_c38c5864_Dne(f7, (double)n2 + 0.015625, f8, gDn3.method_7c6f6029_FWm(), gDn3.method_ae128db7_bzF());
            wAR.method_c38c5864_Dne(f6, (double)n2 + 0.015625, f8, gDn3.method_7a46288a_Dne(), gDn3.method_ae128db7_bzF());
            wAR.method_c38c5864_Dne(f6, (double)n2 + 0.015625, f9, gDn3.method_7a46288a_Dne(), gDn3.method_907a9d11_Qnq());
            wAR.method_2c0148e6_Dne(f, f, f);
            wAR.method_c38c5864_Dne(f7, (double)n2 + 0.015625, f9, gDn5.method_7c6f6029_FWm(), gDn5.method_907a9d11_Qnq());
            wAR.method_c38c5864_Dne(f7, (double)n2 + 0.015625, f8, gDn5.method_7c6f6029_FWm(), gDn5.method_ae128db7_bzF());
            wAR.method_c38c5864_Dne(f6, (double)n2 + 0.015625, f8, gDn5.method_7a46288a_Dne(), gDn5.method_ae128db7_bzF());
            wAR.method_c38c5864_Dne(f6, (double)n2 + 0.015625, f9, gDn5.method_7a46288a_Dne(), gDn5.method_907a9d11_Qnq());
        } else {
            wAR.method_c38c5864_Dne(f7, (double)n2 + 0.015625, f9, gDn3.method_7c6f6029_FWm(), gDn3.method_907a9d11_Qnq());
            wAR.method_c38c5864_Dne(f7, (double)n2 + 0.015625, f8, gDn3.method_7a46288a_Dne(), gDn3.method_907a9d11_Qnq());
            wAR.method_c38c5864_Dne(f6, (double)n2 + 0.015625, f8, gDn3.method_7a46288a_Dne(), gDn3.method_ae128db7_bzF());
            wAR.method_c38c5864_Dne(f6, (double)n2 + 0.015625, f9, gDn3.method_7c6f6029_FWm(), gDn3.method_ae128db7_bzF());
            wAR.method_2c0148e6_Dne(f, f, f);
            wAR.method_c38c5864_Dne(f7, (double)n2 + 0.015625, f9, gDn5.method_7c6f6029_FWm(), gDn5.method_907a9d11_Qnq());
            wAR.method_c38c5864_Dne(f7, (double)n2 + 0.015625, f8, gDn5.method_7a46288a_Dne(), gDn5.method_907a9d11_Qnq());
            wAR.method_c38c5864_Dne(f6, (double)n2 + 0.015625, f8, gDn5.method_7a46288a_Dne(), gDn5.method_ae128db7_bzF());
            wAR.method_c38c5864_Dne(f6, (double)n2 + 0.015625, f9, gDn5.method_7c6f6029_FWm(), gDn5.method_ae128db7_bzF());
        }
        if (!this.field_3706cf9_Dne.method_6fdef3c4_DyG(n, n2 + 1, n3)) {
            if (this.field_3706cf9_Dne.method_6fdef3c4_DyG(n - 1, n2, n3) && this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n - 1, n2 + 1, n3) == zKP.field_36e009c_Dne.field_21260d_FWm) {
                wAR.method_2c0148e6_Dne(f * f3, f * f4, f * f5);
                wAR.method_c38c5864_Dne((double)n + 0.015625, (float)(n2 + 1) + 0.021875f, n3 + 1, gDn3.method_7c6f6029_FWm(), gDn3.method_ae128db7_bzF());
                wAR.method_c38c5864_Dne((double)n + 0.015625, n2 + 0, n3 + 1, gDn3.method_7a46288a_Dne(), gDn3.method_ae128db7_bzF());
                wAR.method_c38c5864_Dne((double)n + 0.015625, n2 + 0, n3 + 0, gDn3.method_7a46288a_Dne(), gDn3.method_907a9d11_Qnq());
                wAR.method_c38c5864_Dne((double)n + 0.015625, (float)(n2 + 1) + 0.021875f, n3 + 0, gDn3.method_7c6f6029_FWm(), gDn3.method_907a9d11_Qnq());
                wAR.method_2c0148e6_Dne(f, f, f);
                wAR.method_c38c5864_Dne((double)n + 0.015625, (float)(n2 + 1) + 0.021875f, n3 + 1, gDn5.method_7c6f6029_FWm(), gDn5.method_ae128db7_bzF());
                wAR.method_c38c5864_Dne((double)n + 0.015625, n2 + 0, n3 + 1, gDn5.method_7a46288a_Dne(), gDn5.method_ae128db7_bzF());
                wAR.method_c38c5864_Dne((double)n + 0.015625, n2 + 0, n3 + 0, gDn5.method_7a46288a_Dne(), gDn5.method_907a9d11_Qnq());
                wAR.method_c38c5864_Dne((double)n + 0.015625, (float)(n2 + 1) + 0.021875f, n3 + 0, gDn5.method_7c6f6029_FWm(), gDn5.method_907a9d11_Qnq());
            }
            if (this.field_3706cf9_Dne.method_6fdef3c4_DyG(n + 1, n2, n3) && this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n + 1, n2 + 1, n3) == zKP.field_36e009c_Dne.field_21260d_FWm) {
                wAR.method_2c0148e6_Dne(f * f3, f * f4, f * f5);
                wAR.method_c38c5864_Dne((double)(n + 1) - 0.015625, n2 + 0, n3 + 1, gDn3.method_7a46288a_Dne(), gDn3.method_907a9d11_Qnq());
                wAR.method_c38c5864_Dne((double)(n + 1) - 0.015625, (float)(n2 + 1) + 0.021875f, n3 + 1, gDn3.method_7c6f6029_FWm(), gDn3.method_907a9d11_Qnq());
                wAR.method_c38c5864_Dne((double)(n + 1) - 0.015625, (float)(n2 + 1) + 0.021875f, n3 + 0, gDn3.method_7c6f6029_FWm(), gDn3.method_ae128db7_bzF());
                wAR.method_c38c5864_Dne((double)(n + 1) - 0.015625, n2 + 0, n3 + 0, gDn3.method_7a46288a_Dne(), gDn3.method_ae128db7_bzF());
                wAR.method_2c0148e6_Dne(f, f, f);
                wAR.method_c38c5864_Dne((double)(n + 1) - 0.015625, n2 + 0, n3 + 1, gDn5.method_7a46288a_Dne(), gDn5.method_907a9d11_Qnq());
                wAR.method_c38c5864_Dne((double)(n + 1) - 0.015625, (float)(n2 + 1) + 0.021875f, n3 + 1, gDn5.method_7c6f6029_FWm(), gDn5.method_907a9d11_Qnq());
                wAR.method_c38c5864_Dne((double)(n + 1) - 0.015625, (float)(n2 + 1) + 0.021875f, n3 + 0, gDn5.method_7c6f6029_FWm(), gDn5.method_ae128db7_bzF());
                wAR.method_c38c5864_Dne((double)(n + 1) - 0.015625, n2 + 0, n3 + 0, gDn5.method_7a46288a_Dne(), gDn5.method_ae128db7_bzF());
            }
            if (this.field_3706cf9_Dne.method_6fdef3c4_DyG(n, n2, n3 - 1) && this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n, n2 + 1, n3 - 1) == zKP.field_36e009c_Dne.field_21260d_FWm) {
                wAR.method_2c0148e6_Dne(f * f3, f * f4, f * f5);
                wAR.method_c38c5864_Dne(n + 1, n2 + 0, (double)n3 + 0.015625, gDn3.method_7a46288a_Dne(), gDn3.method_907a9d11_Qnq());
                wAR.method_c38c5864_Dne(n + 1, (float)(n2 + 1) + 0.021875f, (double)n3 + 0.015625, gDn3.method_7c6f6029_FWm(), gDn3.method_907a9d11_Qnq());
                wAR.method_c38c5864_Dne(n + 0, (float)(n2 + 1) + 0.021875f, (double)n3 + 0.015625, gDn3.method_7c6f6029_FWm(), gDn3.method_ae128db7_bzF());
                wAR.method_c38c5864_Dne(n + 0, n2 + 0, (double)n3 + 0.015625, gDn3.method_7a46288a_Dne(), gDn3.method_ae128db7_bzF());
                wAR.method_2c0148e6_Dne(f, f, f);
                wAR.method_c38c5864_Dne(n + 1, n2 + 0, (double)n3 + 0.015625, gDn5.method_7a46288a_Dne(), gDn5.method_907a9d11_Qnq());
                wAR.method_c38c5864_Dne(n + 1, (float)(n2 + 1) + 0.021875f, (double)n3 + 0.015625, gDn5.method_7c6f6029_FWm(), gDn5.method_907a9d11_Qnq());
                wAR.method_c38c5864_Dne(n + 0, (float)(n2 + 1) + 0.021875f, (double)n3 + 0.015625, gDn5.method_7c6f6029_FWm(), gDn5.method_ae128db7_bzF());
                wAR.method_c38c5864_Dne(n + 0, n2 + 0, (double)n3 + 0.015625, gDn5.method_7a46288a_Dne(), gDn5.method_ae128db7_bzF());
            }
            if (this.field_3706cf9_Dne.method_6fdef3c4_DyG(n, n2, n3 + 1) && this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n, n2 + 1, n3 + 1) == zKP.field_36e009c_Dne.field_21260d_FWm) {
                wAR.method_2c0148e6_Dne(f * f3, f * f4, f * f5);
                wAR.method_c38c5864_Dne(n + 1, (float)(n2 + 1) + 0.021875f, (double)(n3 + 1) - 0.015625, gDn3.method_7c6f6029_FWm(), gDn3.method_ae128db7_bzF());
                wAR.method_c38c5864_Dne(n + 1, n2 + 0, (double)(n3 + 1) - 0.015625, gDn3.method_7a46288a_Dne(), gDn3.method_ae128db7_bzF());
                wAR.method_c38c5864_Dne(n + 0, n2 + 0, (double)(n3 + 1) - 0.015625, gDn3.method_7a46288a_Dne(), gDn3.method_907a9d11_Qnq());
                wAR.method_c38c5864_Dne(n + 0, (float)(n2 + 1) + 0.021875f, (double)(n3 + 1) - 0.015625, gDn3.method_7c6f6029_FWm(), gDn3.method_907a9d11_Qnq());
                wAR.method_2c0148e6_Dne(f, f, f);
                wAR.method_c38c5864_Dne(n + 1, (float)(n2 + 1) + 0.021875f, (double)(n3 + 1) - 0.015625, gDn5.method_7c6f6029_FWm(), gDn5.method_ae128db7_bzF());
                wAR.method_c38c5864_Dne(n + 1, n2 + 0, (double)(n3 + 1) - 0.015625, gDn5.method_7a46288a_Dne(), gDn5.method_ae128db7_bzF());
                wAR.method_c38c5864_Dne(n + 0, n2 + 0, (double)(n3 + 1) - 0.015625, gDn5.method_7a46288a_Dne(), gDn5.method_907a9d11_Qnq());
                wAR.method_c38c5864_Dne(n + 0, (float)(n2 + 1) + 0.021875f, (double)(n3 + 1) - 0.015625, gDn5.method_7c6f6029_FWm(), gDn5.method_907a9d11_Qnq());
            }
        }
        return true;
    }

    private int method_e541d6cd_Dne(int n, int n2, int n3, int n4, double d, double d2, double d3, double d4) {
        int n5 = (int)((double)(n >> 16 & 0xFF) * d + (double)(n2 >> 16 & 0xFF) * d2 + (double)(n3 >> 16 & 0xFF) * d3 + (double)(n4 >> 16 & 0xFF) * d4) & 0xFF;
        int n6 = (int)((double)(n & 0xFF) * d + (double)(n2 & 0xFF) * d2 + (double)(n3 & 0xFF) * d3 + (double)(n4 & 0xFF) * d4) & 0xFF;
        return n5 << 16 | n6;
    }

    private int method_5972744d_Dne(int n, int n2, int n3, int n4) {
        if (n == 0) {
            n = n4;
        }
        if (n2 == 0) {
            n2 = n4;
        }
        if (n3 == 0) {
            n3 = n4;
        }
        return n + n2 + n3 + n4 >> 2 & 0xFF00FF;
    }

    public boolean method_53374a45_aFZ(zKP zKP2, int n, int n2, int n3) {
        boolean bl;
        WAR wAR = WAR.field_36e5ca4_Dne;
        gDn gDn2 = this.method_5d830b5b_Dne(zKP2, 0);
        int n4 = this.field_3706cf9_Dne.method_2dee76f_bzF(n, n2, n3);
        boolean bl2 = (n4 & 4) == 4;
        boolean bl3 = bl = (n4 & 2) == 2;
        if (this.method_7a46289e_Dne()) {
            gDn2 = this.field_375b13b_Dne;
        }
        wAR.method_117d19ea_FWm(zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3));
        float f = zKP2.method_fbabf7df_Dne(this.field_3706cf9_Dne, n, n2, n3) * 0.75f;
        wAR.method_2c0148e6_Dne(f, f, f);
        double d = gDn2.method_7a46288a_Dne();
        double d2 = gDn2.method_117d0715_FWm(bl2 ? 2.0 : 0.0);
        double d3 = gDn2.method_7c6f6029_FWm();
        double d4 = gDn2.method_117d0715_FWm(bl2 ? 4.0 : 2.0);
        double d5 = (double)(bl ? 3.5f : 1.5f) / 16.0;
        boolean bl4 = MLy.method_c09c1893_Dne(this.field_3706cf9_Dne, n, n2, n3, n4, 1);
        boolean bl5 = MLy.method_c09c1893_Dne(this.field_3706cf9_Dne, n, n2, n3, n4, 3);
        boolean bl6 = MLy.method_c09c1893_Dne(this.field_3706cf9_Dne, n, n2, n3, n4, 2);
        boolean bl7 = MLy.method_c09c1893_Dne(this.field_3706cf9_Dne, n, n2, n3, n4, 0);
        float f2 = 0.03125f;
        float f3 = 0.5f - f2 / 2.0f;
        float f4 = f3 + f2;
        if (!(bl6 || bl5 || bl7 || bl4)) {
            bl6 = true;
            bl7 = true;
        }
        if (bl6) {
            wAR.method_c38c5864_Dne((float)n + f3, (double)n2 + d5, (double)n3 + 0.25, d, d2);
            wAR.method_c38c5864_Dne((float)n + f4, (double)n2 + d5, (double)n3 + 0.25, d, d4);
            wAR.method_c38c5864_Dne((float)n + f4, (double)n2 + d5, n3, d3, d4);
            wAR.method_c38c5864_Dne((float)n + f3, (double)n2 + d5, n3, d3, d2);
            wAR.method_c38c5864_Dne((float)n + f3, (double)n2 + d5, n3, d3, d2);
            wAR.method_c38c5864_Dne((float)n + f4, (double)n2 + d5, n3, d3, d4);
            wAR.method_c38c5864_Dne((float)n + f4, (double)n2 + d5, (double)n3 + 0.25, d, d4);
            wAR.method_c38c5864_Dne((float)n + f3, (double)n2 + d5, (double)n3 + 0.25, d, d2);
        }
        if (bl6 || bl7 && !bl5 && !bl4) {
            wAR.method_c38c5864_Dne((float)n + f3, (double)n2 + d5, (double)n3 + 0.5, d, d2);
            wAR.method_c38c5864_Dne((float)n + f4, (double)n2 + d5, (double)n3 + 0.5, d, d4);
            wAR.method_c38c5864_Dne((float)n + f4, (double)n2 + d5, (double)n3 + 0.25, d3, d4);
            wAR.method_c38c5864_Dne((float)n + f3, (double)n2 + d5, (double)n3 + 0.25, d3, d2);
            wAR.method_c38c5864_Dne((float)n + f3, (double)n2 + d5, (double)n3 + 0.25, d3, d2);
            wAR.method_c38c5864_Dne((float)n + f4, (double)n2 + d5, (double)n3 + 0.25, d3, d4);
            wAR.method_c38c5864_Dne((float)n + f4, (double)n2 + d5, (double)n3 + 0.5, d, d4);
            wAR.method_c38c5864_Dne((float)n + f3, (double)n2 + d5, (double)n3 + 0.5, d, d2);
        }
        if (bl7 || bl6 && !bl5 && !bl4) {
            wAR.method_c38c5864_Dne((float)n + f3, (double)n2 + d5, (double)n3 + 0.75, d, d2);
            wAR.method_c38c5864_Dne((float)n + f4, (double)n2 + d5, (double)n3 + 0.75, d, d4);
            wAR.method_c38c5864_Dne((float)n + f4, (double)n2 + d5, (double)n3 + 0.5, d3, d4);
            wAR.method_c38c5864_Dne((float)n + f3, (double)n2 + d5, (double)n3 + 0.5, d3, d2);
            wAR.method_c38c5864_Dne((float)n + f3, (double)n2 + d5, (double)n3 + 0.5, d3, d2);
            wAR.method_c38c5864_Dne((float)n + f4, (double)n2 + d5, (double)n3 + 0.5, d3, d4);
            wAR.method_c38c5864_Dne((float)n + f4, (double)n2 + d5, (double)n3 + 0.75, d, d4);
            wAR.method_c38c5864_Dne((float)n + f3, (double)n2 + d5, (double)n3 + 0.75, d, d2);
        }
        if (bl7) {
            wAR.method_c38c5864_Dne((float)n + f3, (double)n2 + d5, n3 + 1, d, d2);
            wAR.method_c38c5864_Dne((float)n + f4, (double)n2 + d5, n3 + 1, d, d4);
            wAR.method_c38c5864_Dne((float)n + f4, (double)n2 + d5, (double)n3 + 0.75, d3, d4);
            wAR.method_c38c5864_Dne((float)n + f3, (double)n2 + d5, (double)n3 + 0.75, d3, d2);
            wAR.method_c38c5864_Dne((float)n + f3, (double)n2 + d5, (double)n3 + 0.75, d3, d2);
            wAR.method_c38c5864_Dne((float)n + f4, (double)n2 + d5, (double)n3 + 0.75, d3, d4);
            wAR.method_c38c5864_Dne((float)n + f4, (double)n2 + d5, n3 + 1, d, d4);
            wAR.method_c38c5864_Dne((float)n + f3, (double)n2 + d5, n3 + 1, d, d2);
        }
        if (bl4) {
            wAR.method_c38c5864_Dne(n, (double)n2 + d5, (float)n3 + f4, d, d4);
            wAR.method_c38c5864_Dne((double)n + 0.25, (double)n2 + d5, (float)n3 + f4, d3, d4);
            wAR.method_c38c5864_Dne((double)n + 0.25, (double)n2 + d5, (float)n3 + f3, d3, d2);
            wAR.method_c38c5864_Dne(n, (double)n2 + d5, (float)n3 + f3, d, d2);
            wAR.method_c38c5864_Dne(n, (double)n2 + d5, (float)n3 + f3, d, d2);
            wAR.method_c38c5864_Dne((double)n + 0.25, (double)n2 + d5, (float)n3 + f3, d3, d2);
            wAR.method_c38c5864_Dne((double)n + 0.25, (double)n2 + d5, (float)n3 + f4, d3, d4);
            wAR.method_c38c5864_Dne(n, (double)n2 + d5, (float)n3 + f4, d, d4);
        }
        if (bl4 || bl5 && !bl6 && !bl7) {
            wAR.method_c38c5864_Dne((double)n + 0.25, (double)n2 + d5, (float)n3 + f4, d, d4);
            wAR.method_c38c5864_Dne((double)n + 0.5, (double)n2 + d5, (float)n3 + f4, d3, d4);
            wAR.method_c38c5864_Dne((double)n + 0.5, (double)n2 + d5, (float)n3 + f3, d3, d2);
            wAR.method_c38c5864_Dne((double)n + 0.25, (double)n2 + d5, (float)n3 + f3, d, d2);
            wAR.method_c38c5864_Dne((double)n + 0.25, (double)n2 + d5, (float)n3 + f3, d, d2);
            wAR.method_c38c5864_Dne((double)n + 0.5, (double)n2 + d5, (float)n3 + f3, d3, d2);
            wAR.method_c38c5864_Dne((double)n + 0.5, (double)n2 + d5, (float)n3 + f4, d3, d4);
            wAR.method_c38c5864_Dne((double)n + 0.25, (double)n2 + d5, (float)n3 + f4, d, d4);
        }
        if (bl5 || bl4 && !bl6 && !bl7) {
            wAR.method_c38c5864_Dne((double)n + 0.5, (double)n2 + d5, (float)n3 + f4, d, d4);
            wAR.method_c38c5864_Dne((double)n + 0.75, (double)n2 + d5, (float)n3 + f4, d3, d4);
            wAR.method_c38c5864_Dne((double)n + 0.75, (double)n2 + d5, (float)n3 + f3, d3, d2);
            wAR.method_c38c5864_Dne((double)n + 0.5, (double)n2 + d5, (float)n3 + f3, d, d2);
            wAR.method_c38c5864_Dne((double)n + 0.5, (double)n2 + d5, (float)n3 + f3, d, d2);
            wAR.method_c38c5864_Dne((double)n + 0.75, (double)n2 + d5, (float)n3 + f3, d3, d2);
            wAR.method_c38c5864_Dne((double)n + 0.75, (double)n2 + d5, (float)n3 + f4, d3, d4);
            wAR.method_c38c5864_Dne((double)n + 0.5, (double)n2 + d5, (float)n3 + f4, d, d4);
        }
        if (bl5) {
            wAR.method_c38c5864_Dne((double)n + 0.75, (double)n2 + d5, (float)n3 + f4, d, d4);
            wAR.method_c38c5864_Dne(n + 1, (double)n2 + d5, (float)n3 + f4, d3, d4);
            wAR.method_c38c5864_Dne(n + 1, (double)n2 + d5, (float)n3 + f3, d3, d2);
            wAR.method_c38c5864_Dne((double)n + 0.75, (double)n2 + d5, (float)n3 + f3, d, d2);
            wAR.method_c38c5864_Dne((double)n + 0.75, (double)n2 + d5, (float)n3 + f3, d, d2);
            wAR.method_c38c5864_Dne(n + 1, (double)n2 + d5, (float)n3 + f3, d3, d2);
            wAR.method_c38c5864_Dne(n + 1, (double)n2 + d5, (float)n3 + f4, d3, d4);
            wAR.method_c38c5864_Dne((double)n + 0.75, (double)n2 + d5, (float)n3 + f4, d, d4);
        }
        return true;
    }

    private boolean method_6316da6c_Dne(xui xui2, int n, int n2, int n3) {
        int n4 = this.field_3706cf9_Dne.method_2dee76f_bzF(n, n2, n3);
        int n5 = n4 & 3;
        int n6 = (n4 & 0xC) >> 2;
        WAR wAR = WAR.field_36e5ca4_Dne;
        wAR.method_117d19ea_FWm(xui2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3));
        wAR.method_2c0148e6_Dne(1.0f, 1.0f, 1.0f);
        double d = -0.1875;
        boolean bl = xui2.method_8c35db9b_a_(this.field_3706cf9_Dne, n, n2, n3, n4);
        double d2 = 0.0;
        double d3 = 0.0;
        double d4 = 0.0;
        double d5 = 0.0;
        switch (n5) {
            case 0: {
                d5 = -0.3125;
                d3 = xui.field_3f1c584_Dne[n6];
                break;
            }
            case 1: {
                d4 = 0.3125;
                d2 = -xui.field_3f1c584_Dne[n6];
                break;
            }
            case 2: {
                d5 = 0.3125;
                d3 = -xui.field_3f1c584_Dne[n6];
                break;
            }
            case 3: {
                d4 = -0.3125;
                d2 = xui.field_3f1c584_Dne[n6];
            }
        }
        if (!bl) {
            this.method_d02c372d_Dne(xui2, (double)n + d2, (double)n2 + d, (double)n3 + d3, 0.0, 0.0, 0);
        } else {
            gDn gDn2 = this.method_39bcfb28_Dne(zKP.field_f0b029e5_zGp);
            this.method_a68ac5f6_Dne(gDn2);
            float f = 2.0f;
            float f2 = 14.0f;
            float f3 = 7.0f;
            float f4 = 9.0f;
            switch (n5) {
                case 1: 
                case 3: {
                    f = 7.0f;
                    f2 = 9.0f;
                    f3 = 2.0f;
                    f4 = 14.0f;
                }
            }
            this.method_adff145a_Dne(f / 16.0f + (float)d2, 0.125, f3 / 16.0f + (float)d3, f2 / 16.0f + (float)d2, 0.25, f4 / 16.0f + (float)d3);
            double d6 = gDn2.method_ce7f4ad4_Dne(f);
            double d7 = gDn2.method_117d0715_FWm(f3);
            double d8 = gDn2.method_ce7f4ad4_Dne(f2);
            double d9 = gDn2.method_117d0715_FWm(f4);
            wAR.method_c38c5864_Dne((double)((float)n + f / 16.0f) + d2, (float)n2 + 0.25f, (double)((float)n3 + f3 / 16.0f) + d3, d6, d7);
            wAR.method_c38c5864_Dne((double)((float)n + f / 16.0f) + d2, (float)n2 + 0.25f, (double)((float)n3 + f4 / 16.0f) + d3, d6, d9);
            wAR.method_c38c5864_Dne((double)((float)n + f2 / 16.0f) + d2, (float)n2 + 0.25f, (double)((float)n3 + f4 / 16.0f) + d3, d8, d9);
            wAR.method_c38c5864_Dne((double)((float)n + f2 / 16.0f) + d2, (float)n2 + 0.25f, (double)((float)n3 + f3 / 16.0f) + d3, d8, d7);
            this.method_9743b2ba_udO(xui2, n, n2, n3);
            this.method_adff145a_Dne(0.0, 0.0, 0.0, 1.0, 0.125, 1.0);
            this.method_7a46289a_Dne();
        }
        wAR.method_117d19ea_FWm(xui2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3));
        wAR.method_2c0148e6_Dne(1.0f, 1.0f, 1.0f);
        this.method_d02c372d_Dne(xui2, (double)n + d4, (double)n2 + d, (double)n3 + d5, 0.0, 0.0, 0);
        this.method_bea2109_Dne(xui2, n, n2, n3);
        return true;
    }

    public gDn method_39bcfb28_Dne(zKP zKP2) {
        return this.method_36cdcef6_Dne(zKP2.method_77cd08ea_FWm(1));
    }

    private boolean method_e3627d04_Dne(SrC srC, int n, int n2, int n3) {
        WAR wAR = WAR.field_36e5ca4_Dne;
        wAR.method_117d19ea_FWm(srC.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3));
        float f = 1.0f;
        int n4 = srC.method_fbabf7e2_Dne(this.field_3706cf9_Dne, n, n2, n3);
        float f2 = (float)(n4 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n4 >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n4 & 0xFF) / 255.0f;
        if (OEA.field_2092bf_Dne) {
            float f5 = (f2 * 30.0f + f3 * 59.0f + f4 * 11.0f) / 100.0f;
            float f6 = (f2 * 30.0f + f3 * 70.0f) / 100.0f;
            float f7 = (f2 * 30.0f + f4 * 70.0f) / 100.0f;
            f2 = f5;
            f3 = f6;
            f4 = f7;
        }
        wAR.method_2c0148e6_Dne(f * f2, f * f3, f * f4);
        return this.method_94c5dd35_Dne(srC, n, n2, n3, this.field_3706cf9_Dne.method_2dee76f_bzF(n, n2, n3), false);
    }

    private void method_be1b7ef7_FWm(double d, double d2, double d3, double d4, double d5, double d6, float f, double d7) {
        gDn gDn2 = XbN.method_285881e4_Dne("piston_side");
        if (this.method_7a46289e_Dne()) {
            gDn2 = this.field_375b13b_Dne;
        }
        WAR wAR = WAR.field_36e5ca4_Dne;
        double d8 = gDn2.method_7a46288a_Dne();
        double d9 = gDn2.method_ae128db7_bzF();
        double d10 = gDn2.method_ce7f4ad4_Dne(d7);
        double d11 = gDn2.method_117d0715_FWm(4.0);
        wAR.method_2c0148e6_Dne(f, f, f);
        wAR.method_c38c5864_Dne(d, d3, d6, d10, d9);
        wAR.method_c38c5864_Dne(d, d3, d5, d8, d9);
        wAR.method_c38c5864_Dne(d2, d4, d5, d8, d11);
        wAR.method_c38c5864_Dne(d2, d4, d6, d10, d11);
    }

    public void method_76f453b4_aFZ(zKP zKP2, double d, double d2, double d3, gDn gDn2) {
        double d4;
        WAR wAR = WAR.field_36e5ca4_Dne;
        if (this.method_7a46289e_Dne()) {
            gDn2 = this.field_375b13b_Dne;
        }
        double d5 = gDn2.method_ce7f4ad4_Dne(this.field_2d29ef_aFZ * 16.0);
        double d6 = gDn2.method_ce7f4ad4_Dne(this.field_388da1_zGp * 16.0);
        double d7 = gDn2.method_117d0715_FWm(16.0 - this.field_267cf0_Qnq * 16.0);
        double d8 = gDn2.method_117d0715_FWm(16.0 - this.field_2e5f16_bzF * 16.0);
        if (this.field_2e5f2c_bzF) {
            d4 = d5;
            d5 = d6;
            d6 = d4;
        }
        if (this.field_2d29ef_aFZ < 0.0 || this.field_388da1_zGp > 1.0) {
            d5 = gDn2.method_7a46288a_Dne();
            d6 = gDn2.method_7c6f6029_FWm();
        }
        if (this.field_2e5f16_bzF < 0.0 || this.field_267cf0_Qnq > 1.0) {
            d7 = gDn2.method_ae128db7_bzF();
            d8 = gDn2.method_907a9d11_Qnq();
        }
        d4 = d6;
        double d9 = d5;
        double d10 = d7;
        double d11 = d8;
        if (this.field_267cf5_Qnq == 1) {
            d5 = gDn2.method_ce7f4ad4_Dne(this.field_2e5f16_bzF * 16.0);
            d7 = gDn2.method_117d0715_FWm(16.0 - this.field_388da1_zGp * 16.0);
            d6 = gDn2.method_ce7f4ad4_Dne(this.field_267cf0_Qnq * 16.0);
            d8 = gDn2.method_117d0715_FWm(16.0 - this.field_2d29ef_aFZ * 16.0);
            d10 = d7;
            d11 = d8;
            d4 = d5;
            d9 = d6;
            d7 = d8;
            d8 = d10;
        } else if (this.field_267cf5_Qnq == 2) {
            d5 = gDn2.method_ce7f4ad4_Dne(16.0 - this.field_267cf0_Qnq * 16.0);
            d7 = gDn2.method_117d0715_FWm(this.field_2d29ef_aFZ * 16.0);
            d6 = gDn2.method_ce7f4ad4_Dne(16.0 - this.field_2e5f16_bzF * 16.0);
            d8 = gDn2.method_117d0715_FWm(this.field_388da1_zGp * 16.0);
            d4 = d6;
            d9 = d5;
            d5 = d6;
            d6 = d9;
            d10 = d8;
            d11 = d7;
        } else if (this.field_267cf5_Qnq == 3) {
            d5 = gDn2.method_ce7f4ad4_Dne(16.0 - this.field_2d29ef_aFZ * 16.0);
            d6 = gDn2.method_ce7f4ad4_Dne(16.0 - this.field_388da1_zGp * 16.0);
            d7 = gDn2.method_117d0715_FWm(this.field_267cf0_Qnq * 16.0);
            d8 = gDn2.method_117d0715_FWm(this.field_2e5f16_bzF * 16.0);
            d4 = d6;
            d9 = d5;
            d10 = d7;
            d11 = d8;
        }
        double d12 = d + this.field_2092a9_Dne;
        double d13 = d2 + this.field_2e5f16_bzF;
        double d14 = d2 + this.field_267cf0_Qnq;
        double d15 = d3 + this.field_2d29ef_aFZ;
        double d16 = d3 + this.field_388da1_zGp;
        if (this.field_20b868_DyG) {
            wAR.method_2c0148e6_Dne(this.field_212c18_EyB, this.field_36e4d7_vSL, this.field_3649f6_tgc);
            wAR.method_117d19ea_FWm(this.field_217c26_Fnk);
            wAR.method_c38c5864_Dne(d12, d14, d16, d4, d10);
            wAR.method_2c0148e6_Dne(this.field_215b33_FfS, this.field_26818c_RPx, this.field_34b5fe_qXo);
            wAR.method_117d19ea_FWm(this.field_307847_gnI);
            wAR.method_c38c5864_Dne(d12, d14, d15, d5, d7);
            wAR.method_2c0148e6_Dne(this.field_2569d2_OdI, this.field_217c23_Fnk, this.field_1f1786_AgF);
            wAR.method_117d19ea_FWm(this.field_3649f9_tgc);
            wAR.method_c38c5864_Dne(d12, d13, d15, d9, d11);
            wAR.method_2c0148e6_Dne(this.field_3393da_oIf, this.field_307844_gnI, this.field_383100_yMz);
            wAR.method_117d19ea_FWm(this.field_34b601_qXo);
            wAR.method_c38c5864_Dne(d12, d13, d16, d6, d8);
        } else {
            wAR.method_c38c5864_Dne(d12, d14, d16, d4, d10);
            wAR.method_c38c5864_Dne(d12, d14, d15, d5, d7);
            wAR.method_c38c5864_Dne(d12, d13, d15, d9, d11);
            wAR.method_c38c5864_Dne(d12, d13, d16, d6, d8);
        }
    }

    public void method_13be5505_Dne(zKP zKP2, Qnq qnq, int n, int n2, int n3, int n4) {
        float f = 0.5f;
        float f2 = 1.0f;
        float f3 = 0.8f;
        float f4 = 0.6f;
        WAR wAR = WAR.field_36e5ca4_Dne;
        wAR.method_7a46289a_Dne();
        wAR.method_117d19ea_FWm(zKP2.method_b34ae00f_bzF(qnq, n, n2, n3));
        float f5 = 1.0f;
        float f6 = 1.0f;
        if (f6 < f5) {
            f6 = f5;
        }
        wAR.method_2c0148e6_Dne(f * f6, f * f6, f * f6);
        this.method_58bf1fba_Dne(zKP2, -0.5, -0.5, -0.5, this.method_b27f0188_Dne(zKP2, 0, n4));
        f6 = 1.0f;
        if (f6 < f5) {
            f6 = f5;
        }
        wAR.method_2c0148e6_Dne(f2 * f6, f2 * f6, f2 * f6);
        this.method_d047827b_FWm(zKP2, -0.5, -0.5, -0.5, this.method_b27f0188_Dne(zKP2, 1, n4));
        f6 = 1.0f;
        if (f6 < f5) {
            f6 = f5;
        }
        wAR.method_2c0148e6_Dne(f3 * f6, f3 * f6, f3 * f6);
        this.method_e4fb4bad_bzF(zKP2, -0.5, -0.5, -0.5, this.method_b27f0188_Dne(zKP2, 2, n4));
        f6 = 1.0f;
        if (f6 < f5) {
            f6 = f5;
        }
        wAR.method_2c0148e6_Dne(f3 * f6, f3 * f6, f3 * f6);
        this.method_925c7e93_Qnq(zKP2, -0.5, -0.5, -0.5, this.method_b27f0188_Dne(zKP2, 3, n4));
        f6 = 1.0f;
        if (f6 < f5) {
            f6 = f5;
        }
        wAR.method_2c0148e6_Dne(f4 * f6, f4 * f6, f4 * f6);
        this.method_76f453b4_aFZ(zKP2, -0.5, -0.5, -0.5, this.method_b27f0188_Dne(zKP2, 4, n4));
        f6 = 1.0f;
        if (f6 < f5) {
            f6 = f5;
        }
        wAR.method_2c0148e6_Dne(f4 * f6, f4 * f6, f4 * f6);
        this.method_3fc2d5c2_zGp(zKP2, -0.5, -0.5, -0.5, this.method_b27f0188_Dne(zKP2, 5, n4));
        wAR.method_7a46288d_Dne();
    }

    private boolean method_bea2109_Dne(gvx gvx2, int n, int n2, int n3) {
        WAR wAR = WAR.field_36e5ca4_Dne;
        this.method_715a729e_Dne(gvx2, n, n2, n3, this.field_3706cf9_Dne.method_2dee76f_bzF(n, n2, n3) & 3);
        return true;
    }

    public void method_6fd761c3_Dne(zKP zKP2, int n, double d, double d2, double d3) {
        WAR wAR = WAR.field_36e5ca4_Dne;
        gDn gDn2 = this.method_b27f0188_Dne(zKP2, 0, n);
        if (this.method_7a46289e_Dne()) {
            gDn2 = this.field_375b13b_Dne;
        }
        double d4 = gDn2.method_7a46288a_Dne();
        double d5 = gDn2.method_ae128db7_bzF();
        double d6 = gDn2.method_7c6f6029_FWm();
        double d7 = gDn2.method_907a9d11_Qnq();
        double d8 = d + 0.5 - 0.25;
        double d9 = d + 0.5 + 0.25;
        double d10 = d3 + 0.5 - 0.5;
        double d11 = d3 + 0.5 + 0.5;
        wAR.method_c38c5864_Dne(d8, d2 + 1.0, d10, d4, d5);
        wAR.method_c38c5864_Dne(d8, d2 + 0.0, d10, d4, d7);
        wAR.method_c38c5864_Dne(d8, d2 + 0.0, d11, d6, d7);
        wAR.method_c38c5864_Dne(d8, d2 + 1.0, d11, d6, d5);
        wAR.method_c38c5864_Dne(d8, d2 + 1.0, d11, d4, d5);
        wAR.method_c38c5864_Dne(d8, d2 + 0.0, d11, d4, d7);
        wAR.method_c38c5864_Dne(d8, d2 + 0.0, d10, d6, d7);
        wAR.method_c38c5864_Dne(d8, d2 + 1.0, d10, d6, d5);
        wAR.method_c38c5864_Dne(d9, d2 + 1.0, d11, d4, d5);
        wAR.method_c38c5864_Dne(d9, d2 + 0.0, d11, d4, d7);
        wAR.method_c38c5864_Dne(d9, d2 + 0.0, d10, d6, d7);
        wAR.method_c38c5864_Dne(d9, d2 + 1.0, d10, d6, d5);
        wAR.method_c38c5864_Dne(d9, d2 + 1.0, d10, d4, d5);
        wAR.method_c38c5864_Dne(d9, d2 + 0.0, d10, d4, d7);
        wAR.method_c38c5864_Dne(d9, d2 + 0.0, d11, d6, d7);
        wAR.method_c38c5864_Dne(d9, d2 + 1.0, d11, d6, d5);
        d8 = d + 0.5 - 0.5;
        d9 = d + 0.5 + 0.5;
        d10 = d3 + 0.5 - 0.25;
        d11 = d3 + 0.5 + 0.25;
        wAR.method_c38c5864_Dne(d8, d2 + 1.0, d10, d4, d5);
        wAR.method_c38c5864_Dne(d8, d2 + 0.0, d10, d4, d7);
        wAR.method_c38c5864_Dne(d9, d2 + 0.0, d10, d6, d7);
        wAR.method_c38c5864_Dne(d9, d2 + 1.0, d10, d6, d5);
        wAR.method_c38c5864_Dne(d9, d2 + 1.0, d10, d4, d5);
        wAR.method_c38c5864_Dne(d9, d2 + 0.0, d10, d4, d7);
        wAR.method_c38c5864_Dne(d8, d2 + 0.0, d10, d6, d7);
        wAR.method_c38c5864_Dne(d8, d2 + 1.0, d10, d6, d5);
        wAR.method_c38c5864_Dne(d9, d2 + 1.0, d11, d4, d5);
        wAR.method_c38c5864_Dne(d9, d2 + 0.0, d11, d4, d7);
        wAR.method_c38c5864_Dne(d8, d2 + 0.0, d11, d6, d7);
        wAR.method_c38c5864_Dne(d8, d2 + 1.0, d11, d6, d5);
        wAR.method_c38c5864_Dne(d8, d2 + 1.0, d11, d4, d5);
        wAR.method_c38c5864_Dne(d8, d2 + 0.0, d11, d4, d7);
        wAR.method_c38c5864_Dne(d9, d2 + 0.0, d11, d6, d7);
        wAR.method_c38c5864_Dne(d9, d2 + 1.0, d11, d6, d5);
    }

    private float method_90110dff_Dne(int n, int n2, int n3, KFd kFd) {
        int n4 = 0;
        float f = 0.0f;
        for (int i = 0; i < 4; ++i) {
            int n5 = n - (i & 1);
            int n6 = n3 - (i >> 1 & 1);
            if (this.field_3706cf9_Dne.method_d9802b31_Dne(n5, n2 + 1, n6) == kFd) {
                return 1.0f;
            }
            KFd kFd2 = this.field_3706cf9_Dne.method_d9802b31_Dne(n5, n2, n6);
            if (kFd2 == kFd) {
                int n7 = this.field_3706cf9_Dne.method_2dee76f_bzF(n5, n2, n6);
                if (n7 >= 8 || n7 == 0) {
                    f += byt.method_ce7f5d99_Dne(n7) * 10.0f;
                    n4 += 10;
                }
                f += byt.method_ce7f5d99_Dne(n7);
                ++n4;
                continue;
            }
            if (kFd2.method_7a46289e_Dne()) continue;
            f += 1.0f;
            ++n4;
        }
        return 1.0f - f / (float)n4;
    }

    private boolean method_70206fbd_Dne(zKP zKP2, int n, int n2, int n3, boolean bl) {
        int n4 = this.field_3706cf9_Dne.method_2dee76f_bzF(n, n2, n3);
        boolean bl2 = bl || (n4 & 8) != 0;
        int n5 = XbN.method_143f9e0f_bzF(n4);
        if (bl2) {
            switch (n5) {
                case 0: {
                    this.field_2092ae_Dne = 3;
                    this.field_21260d_FWm = 3;
                    this.field_2e5f1b_bzF = 3;
                    this.field_267cf5_Qnq = 3;
                    this.method_adff145a_Dne(0.0, 0.25, 0.0, 1.0, 1.0, 1.0);
                    break;
                }
                case 1: {
                    this.method_adff145a_Dne(0.0, 0.0, 0.0, 1.0, 0.75, 1.0);
                    break;
                }
                case 2: {
                    this.field_2e5f1b_bzF = 1;
                    this.field_267cf5_Qnq = 2;
                    this.method_adff145a_Dne(0.0, 0.0, 0.25, 1.0, 1.0, 1.0);
                    break;
                }
                case 3: {
                    this.field_2e5f1b_bzF = 2;
                    this.field_267cf5_Qnq = 1;
                    this.field_2d29f4_aFZ = 3;
                    this.field_388da6_zGp = 3;
                    this.method_adff145a_Dne(0.0, 0.0, 0.0, 1.0, 1.0, 0.75);
                    break;
                }
                case 4: {
                    this.field_2092ae_Dne = 1;
                    this.field_21260d_FWm = 2;
                    this.field_2d29f4_aFZ = 2;
                    this.field_388da6_zGp = 1;
                    this.method_adff145a_Dne(0.25, 0.0, 0.0, 1.0, 1.0, 1.0);
                    break;
                }
                case 5: {
                    this.field_2092ae_Dne = 2;
                    this.field_21260d_FWm = 1;
                    this.field_2d29f4_aFZ = 1;
                    this.field_388da6_zGp = 2;
                    this.method_adff145a_Dne(0.0, 0.0, 0.0, 0.75, 1.0, 1.0);
                }
            }
            ((XbN)zKP2).method_3c377979_FWm((float)this.field_2092a9_Dne, (float)this.field_2e5f16_bzF, (float)this.field_2d29ef_aFZ, (float)this.field_212608_FWm, (float)this.field_267cf0_Qnq, (float)this.field_388da1_zGp);
            this.method_9743b2ba_udO(zKP2, n, n2, n3);
            this.field_2092ae_Dne = 0;
            this.field_21260d_FWm = 0;
            this.field_2e5f1b_bzF = 0;
            this.field_267cf5_Qnq = 0;
            this.field_2d29f4_aFZ = 0;
            this.field_388da6_zGp = 0;
            this.method_adff145a_Dne(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
            ((XbN)zKP2).method_3c377979_FWm((float)this.field_2092a9_Dne, (float)this.field_2e5f16_bzF, (float)this.field_2d29ef_aFZ, (float)this.field_212608_FWm, (float)this.field_267cf0_Qnq, (float)this.field_388da1_zGp);
        } else {
            switch (n5) {
                case 0: {
                    this.field_2092ae_Dne = 3;
                    this.field_21260d_FWm = 3;
                    this.field_2e5f1b_bzF = 3;
                    this.field_267cf5_Qnq = 3;
                }
                default: {
                    break;
                }
                case 2: {
                    this.field_2e5f1b_bzF = 1;
                    this.field_267cf5_Qnq = 2;
                    break;
                }
                case 3: {
                    this.field_2e5f1b_bzF = 2;
                    this.field_267cf5_Qnq = 1;
                    this.field_2d29f4_aFZ = 3;
                    this.field_388da6_zGp = 3;
                    break;
                }
                case 4: {
                    this.field_2092ae_Dne = 1;
                    this.field_21260d_FWm = 2;
                    this.field_2d29f4_aFZ = 2;
                    this.field_388da6_zGp = 1;
                    break;
                }
                case 5: {
                    this.field_2092ae_Dne = 2;
                    this.field_21260d_FWm = 1;
                    this.field_2d29f4_aFZ = 1;
                    this.field_388da6_zGp = 2;
                }
            }
            this.method_9743b2ba_udO(zKP2, n, n2, n3);
            this.field_2092ae_Dne = 0;
            this.field_21260d_FWm = 0;
            this.field_2e5f1b_bzF = 0;
            this.field_267cf5_Qnq = 0;
            this.field_2d29f4_aFZ = 0;
            this.field_388da6_zGp = 0;
        }
        return true;
    }

    public void method_ff21d8b9_FWm(double d, double d2, double d3, double d4, double d5, double d6) {
        this.field_2092a9_Dne = d;
        this.field_212608_FWm = d4;
        this.field_2e5f16_bzF = d2;
        this.field_267cf0_Qnq = d5;
        this.field_2d29ef_aFZ = d3;
        this.field_388da1_zGp = d6;
        this.field_2d2a05_aFZ = true;
        this.field_388db7_zGp = this.field_493682ed_Dne.field_3758af7_Dne.field_2e5f1b_bzF >= 2 && (this.field_2092a9_Dne > 0.0 || this.field_212608_FWm < 1.0 || this.field_2e5f16_bzF > 0.0 || this.field_267cf0_Qnq < 1.0 || this.field_2d29ef_aFZ > 0.0 || this.field_388da1_zGp < 1.0);
    }

    private void method_2a985658_Dne(double d, double d2, double d3, double d4, double d5, double d6, float f, double d7) {
        gDn gDn2 = XbN.method_285881e4_Dne("piston_side");
        if (this.method_7a46289e_Dne()) {
            gDn2 = this.field_375b13b_Dne;
        }
        WAR wAR = WAR.field_36e5ca4_Dne;
        double d8 = gDn2.method_7a46288a_Dne();
        double d9 = gDn2.method_ae128db7_bzF();
        double d10 = gDn2.method_ce7f4ad4_Dne(d7);
        double d11 = gDn2.method_117d0715_FWm(4.0);
        wAR.method_2c0148e6_Dne(f, f, f);
        wAR.method_c38c5864_Dne(d, d4, d5, d10, d9);
        wAR.method_c38c5864_Dne(d, d3, d5, d8, d9);
        wAR.method_c38c5864_Dne(d2, d3, d6, d8, d11);
        wAR.method_c38c5864_Dne(d2, d4, d6, d10, d11);
    }

    public boolean method_af0278e8_DyG(zKP zKP2, int n, int n2, int n3) {
        WAR wAR = WAR.field_36e5ca4_Dne;
        gDn gDn2 = this.method_5d830b5b_Dne(zKP2, 0);
        if (this.method_7a46289e_Dne()) {
            gDn2 = this.field_375b13b_Dne;
        }
        wAR.method_117d19ea_FWm(zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3));
        float f = 1.0f;
        wAR.method_2c0148e6_Dne(f, f, f);
        double d = gDn2.method_7a46288a_Dne();
        double d2 = gDn2.method_ae128db7_bzF();
        double d3 = gDn2.method_7c6f6029_FWm();
        double d4 = gDn2.method_907a9d11_Qnq();
        int n4 = this.field_3706cf9_Dne.method_2dee76f_bzF(n, n2, n3);
        double d5 = 0.0;
        double d6 = 0.05f;
        if (n4 == 5) {
            wAR.method_c38c5864_Dne((double)n + d6, (double)(n2 + 1) + d5, (double)(n3 + 1) + d5, d, d2);
            wAR.method_c38c5864_Dne((double)n + d6, (double)(n2 + 0) - d5, (double)(n3 + 1) + d5, d, d4);
            wAR.method_c38c5864_Dne((double)n + d6, (double)(n2 + 0) - d5, (double)(n3 + 0) - d5, d3, d4);
            wAR.method_c38c5864_Dne((double)n + d6, (double)(n2 + 1) + d5, (double)(n3 + 0) - d5, d3, d2);
        }
        if (n4 == 4) {
            wAR.method_c38c5864_Dne((double)(n + 1) - d6, (double)(n2 + 0) - d5, (double)(n3 + 1) + d5, d3, d4);
            wAR.method_c38c5864_Dne((double)(n + 1) - d6, (double)(n2 + 1) + d5, (double)(n3 + 1) + d5, d3, d2);
            wAR.method_c38c5864_Dne((double)(n + 1) - d6, (double)(n2 + 1) + d5, (double)(n3 + 0) - d5, d, d2);
            wAR.method_c38c5864_Dne((double)(n + 1) - d6, (double)(n2 + 0) - d5, (double)(n3 + 0) - d5, d, d4);
        }
        if (n4 == 3) {
            wAR.method_c38c5864_Dne((double)(n + 1) + d5, (double)(n2 + 0) - d5, (double)n3 + d6, d3, d4);
            wAR.method_c38c5864_Dne((double)(n + 1) + d5, (double)(n2 + 1) + d5, (double)n3 + d6, d3, d2);
            wAR.method_c38c5864_Dne((double)(n + 0) - d5, (double)(n2 + 1) + d5, (double)n3 + d6, d, d2);
            wAR.method_c38c5864_Dne((double)(n + 0) - d5, (double)(n2 + 0) - d5, (double)n3 + d6, d, d4);
        }
        if (n4 == 2) {
            wAR.method_c38c5864_Dne((double)(n + 1) + d5, (double)(n2 + 1) + d5, (double)(n3 + 1) - d6, d, d2);
            wAR.method_c38c5864_Dne((double)(n + 1) + d5, (double)(n2 + 0) - d5, (double)(n3 + 1) - d6, d, d4);
            wAR.method_c38c5864_Dne((double)(n + 0) - d5, (double)(n2 + 0) - d5, (double)(n3 + 1) - d6, d3, d4);
            wAR.method_c38c5864_Dne((double)(n + 0) - d5, (double)(n2 + 1) + d5, (double)(n3 + 1) - d6, d3, d2);
        }
        return true;
    }

    public void method_c74bdb28_Dne(zKP zKP2) {
        if (!this.field_2d2a05_aFZ) {
            this.field_2092a9_Dne = zKP2.method_7a462888_Dne();
            this.field_212608_FWm = zKP2.method_7c6f6027_FWm();
            this.field_2e5f16_bzF = zKP2.method_ae128db5_bzF();
            this.field_267cf0_Qnq = zKP2.method_907a9d0f_Qnq();
            this.field_2d29ef_aFZ = zKP2.method_a98a064e_aFZ();
            this.field_388da1_zGp = zKP2.method_d44b4580_zGp();
            this.field_388db7_zGp = this.field_493682ed_Dne.field_3758af7_Dne.field_2e5f1b_bzF >= 2 && (this.field_2092a9_Dne > 0.0 || this.field_212608_FWm < 1.0 || this.field_2e5f16_bzF > 0.0 || this.field_267cf0_Qnq < 1.0 || this.field_2d29ef_aFZ > 0.0 || this.field_388da1_zGp < 1.0);
        }
    }

    public boolean method_de3141c_bzF(zKP zKP2, int n, int n2, int n3, float f, float f2, float f3) {
        gDn gDn2;
        this.field_20b868_DyG = false;
        WAR wAR = WAR.field_36e5ca4_Dne;
        boolean bl = false;
        float f4 = 0.5f;
        float f5 = 1.0f;
        float f6 = 0.8f;
        float f7 = 0.6f;
        float f8 = f5 * f;
        float f9 = f5 * f2;
        float f10 = f5 * f3;
        float f11 = f4;
        float f12 = f6;
        float f13 = f7;
        float f14 = f4;
        float f15 = f6;
        float f16 = f7;
        float f17 = f4;
        float f18 = f6;
        float f19 = f7;
        if (zKP2 != zKP.field_36ff555_Dne) {
            f11 = f4 * f;
            f12 = f6 * f;
            f13 = f7 * f;
            f14 = f4 * f2;
            f15 = f6 * f2;
            f16 = f7 * f2;
            f17 = f4 * f3;
            f18 = f6 * f3;
            f19 = f7 * f3;
        }
        int n4 = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3);
        if (this.field_267d06_Qnq || zKP2.method_79d378f8_Dne(this.field_3706cf9_Dne, n, n2 - 1, n3, 0)) {
            wAR.method_117d19ea_FWm(this.field_2e5f16_bzF > 0.0 ? n4 : zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2 - 1, n3));
            wAR.method_2c0148e6_Dne(f11, f14, f17);
            this.method_58bf1fba_Dne(zKP2, n, n2, n3, this.method_42ba3726_Dne(zKP2, this.field_3706cf9_Dne, n, n2, n3, 0));
            bl = true;
        }
        if (this.field_267d06_Qnq || zKP2.method_79d378f8_Dne(this.field_3706cf9_Dne, n, n2 + 1, n3, 1)) {
            wAR.method_117d19ea_FWm(this.field_267cf0_Qnq < 1.0 ? n4 : zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2 + 1, n3));
            wAR.method_2c0148e6_Dne(f8, f9, f10);
            this.method_d047827b_FWm(zKP2, n, n2, n3, this.method_42ba3726_Dne(zKP2, this.field_3706cf9_Dne, n, n2, n3, 1));
            bl = true;
        }
        if (this.field_267d06_Qnq || zKP2.method_79d378f8_Dne(this.field_3706cf9_Dne, n, n2, n3 - 1, 2)) {
            wAR.method_117d19ea_FWm(this.field_2d29ef_aFZ > 0.0 ? n4 : zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3 - 1));
            wAR.method_2c0148e6_Dne(f12, f15, f18);
            gDn2 = this.method_42ba3726_Dne(zKP2, this.field_3706cf9_Dne, n, n2, n3, 2);
            this.method_e4fb4bad_bzF(zKP2, n, n2, n3, gDn2);
            if (field_2092bf_Dne && gDn2.method_eecad346_Dne().equals("grass_side") && !this.method_7a46289e_Dne()) {
                wAR.method_2c0148e6_Dne(f12 * f, f15 * f2, f18 * f3);
                this.method_e4fb4bad_bzF(zKP2, n, n2, n3, ZQN.method_230f3f9a_Dne());
            }
            bl = true;
        }
        if (this.field_267d06_Qnq || zKP2.method_79d378f8_Dne(this.field_3706cf9_Dne, n, n2, n3 + 1, 3)) {
            wAR.method_117d19ea_FWm(this.field_388da1_zGp < 1.0 ? n4 : zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3 + 1));
            wAR.method_2c0148e6_Dne(f12, f15, f18);
            gDn2 = this.method_42ba3726_Dne(zKP2, this.field_3706cf9_Dne, n, n2, n3, 3);
            this.method_925c7e93_Qnq(zKP2, n, n2, n3, gDn2);
            if (field_2092bf_Dne && gDn2.method_eecad346_Dne().equals("grass_side") && !this.method_7a46289e_Dne()) {
                wAR.method_2c0148e6_Dne(f12 * f, f15 * f2, f18 * f3);
                this.method_925c7e93_Qnq(zKP2, n, n2, n3, ZQN.method_230f3f9a_Dne());
            }
            bl = true;
        }
        if (this.field_267d06_Qnq || zKP2.method_79d378f8_Dne(this.field_3706cf9_Dne, n - 1, n2, n3, 4)) {
            wAR.method_117d19ea_FWm(this.field_2092a9_Dne > 0.0 ? n4 : zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n - 1, n2, n3));
            wAR.method_2c0148e6_Dne(f13, f16, f19);
            gDn2 = this.method_42ba3726_Dne(zKP2, this.field_3706cf9_Dne, n, n2, n3, 4);
            this.method_76f453b4_aFZ(zKP2, n, n2, n3, gDn2);
            if (field_2092bf_Dne && gDn2.method_eecad346_Dne().equals("grass_side") && !this.method_7a46289e_Dne()) {
                wAR.method_2c0148e6_Dne(f13 * f, f16 * f2, f19 * f3);
                this.method_76f453b4_aFZ(zKP2, n, n2, n3, ZQN.method_230f3f9a_Dne());
            }
            bl = true;
        }
        if (this.field_267d06_Qnq || zKP2.method_79d378f8_Dne(this.field_3706cf9_Dne, n + 1, n2, n3, 5)) {
            wAR.method_117d19ea_FWm(this.field_212608_FWm < 1.0 ? n4 : zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n + 1, n2, n3));
            wAR.method_2c0148e6_Dne(f13, f16, f19);
            gDn2 = this.method_42ba3726_Dne(zKP2, this.field_3706cf9_Dne, n, n2, n3, 5);
            this.method_3fc2d5c2_zGp(zKP2, n, n2, n3, gDn2);
            if (field_2092bf_Dne && gDn2.method_eecad346_Dne().equals("grass_side") && !this.method_7a46289e_Dne()) {
                wAR.method_2c0148e6_Dne(f13 * f, f16 * f2, f19 * f3);
                this.method_3fc2d5c2_zGp(zKP2, n, n2, n3, ZQN.method_230f3f9a_Dne());
            }
            bl = true;
        }
        return bl;
    }

    public boolean method_ec718e8b_Dne(vla vla2, int n, int n2, int n3) {
        vla2.method_8f2f208e_FWm(this.field_3706cf9_Dne, n, n2, n3);
        this.method_c74bdb28_Dne(vla2);
        this.method_9743b2ba_udO(vla2, n, n2, n3);
        boolean bl = vla2.method_8f2f2092_FWm(this.field_3706cf9_Dne, n, n2, n3);
        this.method_c74bdb28_Dne(vla2);
        this.method_9743b2ba_udO(vla2, n, n2, n3);
        if (bl && vla2.method_b34ae020_bzF(this.field_3706cf9_Dne, n, n2, n3)) {
            this.method_c74bdb28_Dne(vla2);
            this.method_9743b2ba_udO(vla2, n, n2, n3);
        }
        return true;
    }

    public boolean method_e7d6e014_Dne(Oaf oaf, int n, int n2, int n3) {
        WAR wAR = WAR.field_36e5ca4_Dne;
        int n4 = this.field_3706cf9_Dne.method_2dee76f_bzF(n, n2, n3);
        gDn gDn2 = this.method_b27f0188_Dne(oaf, 0, n4);
        if (this.method_7a46289e_Dne()) {
            gDn2 = this.field_375b13b_Dne;
        }
        if (oaf.method_907a9d25_Qnq()) {
            n4 &= 7;
        }
        wAR.method_117d19ea_FWm(oaf.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3));
        wAR.method_2c0148e6_Dne(1.0f, 1.0f, 1.0f);
        double d = gDn2.method_7a46288a_Dne();
        double d2 = gDn2.method_ae128db7_bzF();
        double d3 = gDn2.method_7c6f6029_FWm();
        double d4 = gDn2.method_907a9d11_Qnq();
        double d5 = 0.0625;
        double d6 = n + 1;
        double d7 = n + 1;
        double d8 = n + 0;
        double d9 = n + 0;
        double d10 = n3 + 0;
        double d11 = n3 + 1;
        double d12 = n3 + 1;
        double d13 = n3 + 0;
        double d14 = (double)n2 + d5;
        double d15 = (double)n2 + d5;
        double d16 = (double)n2 + d5;
        double d17 = (double)n2 + d5;
        if (n4 != 1 && n4 != 2 && n4 != 3 && n4 != 7) {
            if (n4 == 8) {
                d6 = d7 = (double)(n + 0);
                d8 = d9 = (double)(n + 1);
                d10 = d13 = (double)(n3 + 1);
                d11 = d12 = (double)(n3 + 0);
            } else if (n4 == 9) {
                d6 = d9 = (double)(n + 0);
                d7 = d8 = (double)(n + 1);
                d10 = d11 = (double)(n3 + 0);
                d12 = d13 = (double)(n3 + 1);
            }
        } else {
            d6 = d9 = (double)(n + 1);
            d7 = d8 = (double)(n + 0);
            d10 = d11 = (double)(n3 + 1);
            d12 = d13 = (double)(n3 + 0);
        }
        if (n4 != 2 && n4 != 4) {
            if (n4 == 3 || n4 == 5) {
                d15 += 1.0;
                d16 += 1.0;
            }
        } else {
            d14 += 1.0;
            d17 += 1.0;
        }
        wAR.method_c38c5864_Dne(d6, d14, d10, d3, d2);
        wAR.method_c38c5864_Dne(d7, d15, d11, d3, d4);
        wAR.method_c38c5864_Dne(d8, d16, d12, d, d4);
        wAR.method_c38c5864_Dne(d9, d17, d13, d, d2);
        wAR.method_c38c5864_Dne(d9, d17, d13, d, d2);
        wAR.method_c38c5864_Dne(d8, d16, d12, d, d4);
        wAR.method_c38c5864_Dne(d7, d15, d11, d3, d4);
        wAR.method_c38c5864_Dne(d6, d14, d10, d3, d2);
        return true;
    }

    public zVu() {
        this.field_493682ed_Dne = Minecraft.method_81a5f12e_Dne();
    }

    public void method_e9b5bb1a_FWm(zKP zKP2, int n, int n2, int n3) {
        this.field_267d06_Qnq = true;
        this.method_70206fbd_Dne(zKP2, n, n2, n3, true);
        this.field_267d06_Qnq = false;
    }

    public boolean method_768ede18_Dne(CRG cRG, int n, int n2, int n3) {
        gDn gDn2;
        gDn gDn3;
        int n4 = this.field_3706cf9_Dne.method_7c6f602c_FWm();
        WAR wAR = WAR.field_36e5ca4_Dne;
        wAR.method_117d19ea_FWm(cRG.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3));
        float f = 1.0f;
        int n5 = cRG.method_fbabf7e2_Dne(this.field_3706cf9_Dne, n, n2, n3);
        float f2 = (float)(n5 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n5 >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n5 & 0xFF) / 255.0f;
        if (OEA.field_2092bf_Dne) {
            float f5 = (f2 * 30.0f + f3 * 59.0f + f4 * 11.0f) / 100.0f;
            float f6 = (f2 * 30.0f + f3 * 70.0f) / 100.0f;
            float f7 = (f2 * 30.0f + f4 * 70.0f) / 100.0f;
            f2 = f5;
            f3 = f6;
            f4 = f7;
        }
        wAR.method_2c0148e6_Dne(f * f2, f * f3, f * f4);
        if (this.method_7a46289e_Dne()) {
            gDn3 = this.field_375b13b_Dne;
            gDn2 = this.field_375b13b_Dne;
        } else {
            int n6 = this.field_3706cf9_Dne.method_2dee76f_bzF(n, n2, n3);
            gDn3 = this.method_b27f0188_Dne(cRG, 0, n6);
            gDn2 = cRG.method_230f3f9a_Dne();
        }
        int n7 = gDn3.method_7a46288d_Dne();
        int n8 = gDn3.method_7c6f602c_FWm();
        double d = gDn3.method_7a46288a_Dne();
        double d2 = gDn3.method_ce7f4ad4_Dne(8.0);
        double d3 = gDn3.method_7c6f6029_FWm();
        double d4 = gDn3.method_ae128db7_bzF();
        double d5 = gDn3.method_907a9d11_Qnq();
        int n9 = gDn2.method_7a46288d_Dne();
        int n10 = gDn2.method_7c6f602c_FWm();
        double d6 = gDn2.method_ce7f4ad4_Dne(7.0);
        double d7 = gDn2.method_ce7f4ad4_Dne(9.0);
        double d8 = gDn2.method_ae128db7_bzF();
        double d9 = gDn2.method_117d0715_FWm(8.0);
        double d10 = gDn2.method_907a9d11_Qnq();
        double d11 = n;
        double d12 = (double)n + 0.5;
        double d13 = n + 1;
        double d14 = n3;
        double d15 = (double)n3 + 0.5;
        double d16 = n3 + 1;
        double d17 = (double)n + 0.5 - 0.0625;
        double d18 = (double)n + 0.5 + 0.0625;
        double d19 = (double)n3 + 0.5 - 0.0625;
        double d20 = (double)n3 + 0.5 + 0.0625;
        boolean bl = cRG.method_ce7f5dad_Dne(this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n, n2, n3 - 1));
        boolean bl2 = cRG.method_ce7f5dad_Dne(this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n, n2, n3 + 1));
        boolean bl3 = cRG.method_ce7f5dad_Dne(this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n - 1, n2, n3));
        boolean bl4 = cRG.method_ce7f5dad_Dne(this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n + 1, n2, n3));
        boolean bl5 = cRG.method_79d378f8_Dne(this.field_3706cf9_Dne, n, n2 + 1, n3, 1);
        boolean bl6 = cRG.method_79d378f8_Dne(this.field_3706cf9_Dne, n, n2 - 1, n3, 0);
        if ((!bl3 || !bl4) && (bl3 || bl4 || bl || bl2)) {
            if (bl3 && !bl4) {
                wAR.method_c38c5864_Dne(d11, n2 + 1, d15, d, d4);
                wAR.method_c38c5864_Dne(d11, n2 + 0, d15, d, d5);
                wAR.method_c38c5864_Dne(d12, n2 + 0, d15, d2, d5);
                wAR.method_c38c5864_Dne(d12, n2 + 1, d15, d2, d4);
                wAR.method_c38c5864_Dne(d12, n2 + 1, d15, d, d4);
                wAR.method_c38c5864_Dne(d12, n2 + 0, d15, d, d5);
                wAR.method_c38c5864_Dne(d11, n2 + 0, d15, d2, d5);
                wAR.method_c38c5864_Dne(d11, n2 + 1, d15, d2, d4);
                if (!bl2 && !bl) {
                    wAR.method_c38c5864_Dne(d12, n2 + 1, d20, d6, d8);
                    wAR.method_c38c5864_Dne(d12, n2 + 0, d20, d6, d10);
                    wAR.method_c38c5864_Dne(d12, n2 + 0, d19, d7, d10);
                    wAR.method_c38c5864_Dne(d12, n2 + 1, d19, d7, d8);
                    wAR.method_c38c5864_Dne(d12, n2 + 1, d19, d6, d8);
                    wAR.method_c38c5864_Dne(d12, n2 + 0, d19, d6, d10);
                    wAR.method_c38c5864_Dne(d12, n2 + 0, d20, d7, d10);
                    wAR.method_c38c5864_Dne(d12, n2 + 1, d20, d7, d8);
                }
                if (bl5 || n2 < n4 - 1 && this.field_3706cf9_Dne.method_2c2cf7cd_Dne(n - 1, n2 + 1, n3)) {
                    wAR.method_c38c5864_Dne(d11, (double)(n2 + 1) + 0.01, d20, d7, d9);
                    wAR.method_c38c5864_Dne(d12, (double)(n2 + 1) + 0.01, d20, d7, d10);
                    wAR.method_c38c5864_Dne(d12, (double)(n2 + 1) + 0.01, d19, d6, d10);
                    wAR.method_c38c5864_Dne(d11, (double)(n2 + 1) + 0.01, d19, d6, d9);
                    wAR.method_c38c5864_Dne(d12, (double)(n2 + 1) + 0.01, d20, d7, d9);
                    wAR.method_c38c5864_Dne(d11, (double)(n2 + 1) + 0.01, d20, d7, d10);
                    wAR.method_c38c5864_Dne(d11, (double)(n2 + 1) + 0.01, d19, d6, d10);
                    wAR.method_c38c5864_Dne(d12, (double)(n2 + 1) + 0.01, d19, d6, d9);
                }
                if (bl6 || n2 > 1 && this.field_3706cf9_Dne.method_2c2cf7cd_Dne(n - 1, n2 - 1, n3)) {
                    wAR.method_c38c5864_Dne(d11, (double)n2 - 0.01, d20, d7, d9);
                    wAR.method_c38c5864_Dne(d12, (double)n2 - 0.01, d20, d7, d10);
                    wAR.method_c38c5864_Dne(d12, (double)n2 - 0.01, d19, d6, d10);
                    wAR.method_c38c5864_Dne(d11, (double)n2 - 0.01, d19, d6, d9);
                    wAR.method_c38c5864_Dne(d12, (double)n2 - 0.01, d20, d7, d9);
                    wAR.method_c38c5864_Dne(d11, (double)n2 - 0.01, d20, d7, d10);
                    wAR.method_c38c5864_Dne(d11, (double)n2 - 0.01, d19, d6, d10);
                    wAR.method_c38c5864_Dne(d12, (double)n2 - 0.01, d19, d6, d9);
                }
            } else if (!bl3 && bl4) {
                wAR.method_c38c5864_Dne(d12, n2 + 1, d15, d2, d4);
                wAR.method_c38c5864_Dne(d12, n2 + 0, d15, d2, d5);
                wAR.method_c38c5864_Dne(d13, n2 + 0, d15, d3, d5);
                wAR.method_c38c5864_Dne(d13, n2 + 1, d15, d3, d4);
                wAR.method_c38c5864_Dne(d13, n2 + 1, d15, d2, d4);
                wAR.method_c38c5864_Dne(d13, n2 + 0, d15, d2, d5);
                wAR.method_c38c5864_Dne(d12, n2 + 0, d15, d3, d5);
                wAR.method_c38c5864_Dne(d12, n2 + 1, d15, d3, d4);
                if (!bl2 && !bl) {
                    wAR.method_c38c5864_Dne(d12, n2 + 1, d19, d6, d8);
                    wAR.method_c38c5864_Dne(d12, n2 + 0, d19, d6, d10);
                    wAR.method_c38c5864_Dne(d12, n2 + 0, d20, d7, d10);
                    wAR.method_c38c5864_Dne(d12, n2 + 1, d20, d7, d8);
                    wAR.method_c38c5864_Dne(d12, n2 + 1, d20, d6, d8);
                    wAR.method_c38c5864_Dne(d12, n2 + 0, d20, d6, d10);
                    wAR.method_c38c5864_Dne(d12, n2 + 0, d19, d7, d10);
                    wAR.method_c38c5864_Dne(d12, n2 + 1, d19, d7, d8);
                }
                if (bl5 || n2 < n4 - 1 && this.field_3706cf9_Dne.method_2c2cf7cd_Dne(n + 1, n2 + 1, n3)) {
                    wAR.method_c38c5864_Dne(d12, (double)(n2 + 1) + 0.01, d20, d7, d8);
                    wAR.method_c38c5864_Dne(d13, (double)(n2 + 1) + 0.01, d20, d7, d9);
                    wAR.method_c38c5864_Dne(d13, (double)(n2 + 1) + 0.01, d19, d6, d9);
                    wAR.method_c38c5864_Dne(d12, (double)(n2 + 1) + 0.01, d19, d6, d8);
                    wAR.method_c38c5864_Dne(d13, (double)(n2 + 1) + 0.01, d20, d7, d8);
                    wAR.method_c38c5864_Dne(d12, (double)(n2 + 1) + 0.01, d20, d7, d9);
                    wAR.method_c38c5864_Dne(d12, (double)(n2 + 1) + 0.01, d19, d6, d9);
                    wAR.method_c38c5864_Dne(d13, (double)(n2 + 1) + 0.01, d19, d6, d8);
                }
                if (bl6 || n2 > 1 && this.field_3706cf9_Dne.method_2c2cf7cd_Dne(n + 1, n2 - 1, n3)) {
                    wAR.method_c38c5864_Dne(d12, (double)n2 - 0.01, d20, d7, d8);
                    wAR.method_c38c5864_Dne(d13, (double)n2 - 0.01, d20, d7, d9);
                    wAR.method_c38c5864_Dne(d13, (double)n2 - 0.01, d19, d6, d9);
                    wAR.method_c38c5864_Dne(d12, (double)n2 - 0.01, d19, d6, d8);
                    wAR.method_c38c5864_Dne(d13, (double)n2 - 0.01, d20, d7, d8);
                    wAR.method_c38c5864_Dne(d12, (double)n2 - 0.01, d20, d7, d9);
                    wAR.method_c38c5864_Dne(d12, (double)n2 - 0.01, d19, d6, d9);
                    wAR.method_c38c5864_Dne(d13, (double)n2 - 0.01, d19, d6, d8);
                }
            }
        } else {
            wAR.method_c38c5864_Dne(d11, n2 + 1, d15, d, d4);
            wAR.method_c38c5864_Dne(d11, n2 + 0, d15, d, d5);
            wAR.method_c38c5864_Dne(d13, n2 + 0, d15, d3, d5);
            wAR.method_c38c5864_Dne(d13, n2 + 1, d15, d3, d4);
            wAR.method_c38c5864_Dne(d13, n2 + 1, d15, d, d4);
            wAR.method_c38c5864_Dne(d13, n2 + 0, d15, d, d5);
            wAR.method_c38c5864_Dne(d11, n2 + 0, d15, d3, d5);
            wAR.method_c38c5864_Dne(d11, n2 + 1, d15, d3, d4);
            if (bl5) {
                wAR.method_c38c5864_Dne(d11, (double)(n2 + 1) + 0.01, d20, d7, d10);
                wAR.method_c38c5864_Dne(d13, (double)(n2 + 1) + 0.01, d20, d7, d8);
                wAR.method_c38c5864_Dne(d13, (double)(n2 + 1) + 0.01, d19, d6, d8);
                wAR.method_c38c5864_Dne(d11, (double)(n2 + 1) + 0.01, d19, d6, d10);
                wAR.method_c38c5864_Dne(d13, (double)(n2 + 1) + 0.01, d20, d7, d10);
                wAR.method_c38c5864_Dne(d11, (double)(n2 + 1) + 0.01, d20, d7, d8);
                wAR.method_c38c5864_Dne(d11, (double)(n2 + 1) + 0.01, d19, d6, d8);
                wAR.method_c38c5864_Dne(d13, (double)(n2 + 1) + 0.01, d19, d6, d10);
            } else {
                if (n2 < n4 - 1 && this.field_3706cf9_Dne.method_2c2cf7cd_Dne(n - 1, n2 + 1, n3)) {
                    wAR.method_c38c5864_Dne(d11, (double)(n2 + 1) + 0.01, d20, d7, d9);
                    wAR.method_c38c5864_Dne(d12, (double)(n2 + 1) + 0.01, d20, d7, d10);
                    wAR.method_c38c5864_Dne(d12, (double)(n2 + 1) + 0.01, d19, d6, d10);
                    wAR.method_c38c5864_Dne(d11, (double)(n2 + 1) + 0.01, d19, d6, d9);
                    wAR.method_c38c5864_Dne(d12, (double)(n2 + 1) + 0.01, d20, d7, d9);
                    wAR.method_c38c5864_Dne(d11, (double)(n2 + 1) + 0.01, d20, d7, d10);
                    wAR.method_c38c5864_Dne(d11, (double)(n2 + 1) + 0.01, d19, d6, d10);
                    wAR.method_c38c5864_Dne(d12, (double)(n2 + 1) + 0.01, d19, d6, d9);
                }
                if (n2 < n4 - 1 && this.field_3706cf9_Dne.method_2c2cf7cd_Dne(n + 1, n2 + 1, n3)) {
                    wAR.method_c38c5864_Dne(d12, (double)(n2 + 1) + 0.01, d20, d7, d8);
                    wAR.method_c38c5864_Dne(d13, (double)(n2 + 1) + 0.01, d20, d7, d9);
                    wAR.method_c38c5864_Dne(d13, (double)(n2 + 1) + 0.01, d19, d6, d9);
                    wAR.method_c38c5864_Dne(d12, (double)(n2 + 1) + 0.01, d19, d6, d8);
                    wAR.method_c38c5864_Dne(d13, (double)(n2 + 1) + 0.01, d20, d7, d8);
                    wAR.method_c38c5864_Dne(d12, (double)(n2 + 1) + 0.01, d20, d7, d9);
                    wAR.method_c38c5864_Dne(d12, (double)(n2 + 1) + 0.01, d19, d6, d9);
                    wAR.method_c38c5864_Dne(d13, (double)(n2 + 1) + 0.01, d19, d6, d8);
                }
            }
            if (bl6) {
                wAR.method_c38c5864_Dne(d11, (double)n2 - 0.01, d20, d7, d10);
                wAR.method_c38c5864_Dne(d13, (double)n2 - 0.01, d20, d7, d8);
                wAR.method_c38c5864_Dne(d13, (double)n2 - 0.01, d19, d6, d8);
                wAR.method_c38c5864_Dne(d11, (double)n2 - 0.01, d19, d6, d10);
                wAR.method_c38c5864_Dne(d13, (double)n2 - 0.01, d20, d7, d10);
                wAR.method_c38c5864_Dne(d11, (double)n2 - 0.01, d20, d7, d8);
                wAR.method_c38c5864_Dne(d11, (double)n2 - 0.01, d19, d6, d8);
                wAR.method_c38c5864_Dne(d13, (double)n2 - 0.01, d19, d6, d10);
            } else {
                if (n2 > 1 && this.field_3706cf9_Dne.method_2c2cf7cd_Dne(n - 1, n2 - 1, n3)) {
                    wAR.method_c38c5864_Dne(d11, (double)n2 - 0.01, d20, d7, d9);
                    wAR.method_c38c5864_Dne(d12, (double)n2 - 0.01, d20, d7, d10);
                    wAR.method_c38c5864_Dne(d12, (double)n2 - 0.01, d19, d6, d10);
                    wAR.method_c38c5864_Dne(d11, (double)n2 - 0.01, d19, d6, d9);
                    wAR.method_c38c5864_Dne(d12, (double)n2 - 0.01, d20, d7, d9);
                    wAR.method_c38c5864_Dne(d11, (double)n2 - 0.01, d20, d7, d10);
                    wAR.method_c38c5864_Dne(d11, (double)n2 - 0.01, d19, d6, d10);
                    wAR.method_c38c5864_Dne(d12, (double)n2 - 0.01, d19, d6, d9);
                }
                if (n2 > 1 && this.field_3706cf9_Dne.method_2c2cf7cd_Dne(n + 1, n2 - 1, n3)) {
                    wAR.method_c38c5864_Dne(d12, (double)n2 - 0.01, d20, d7, d8);
                    wAR.method_c38c5864_Dne(d13, (double)n2 - 0.01, d20, d7, d9);
                    wAR.method_c38c5864_Dne(d13, (double)n2 - 0.01, d19, d6, d9);
                    wAR.method_c38c5864_Dne(d12, (double)n2 - 0.01, d19, d6, d8);
                    wAR.method_c38c5864_Dne(d13, (double)n2 - 0.01, d20, d7, d8);
                    wAR.method_c38c5864_Dne(d12, (double)n2 - 0.01, d20, d7, d9);
                    wAR.method_c38c5864_Dne(d12, (double)n2 - 0.01, d19, d6, d9);
                    wAR.method_c38c5864_Dne(d13, (double)n2 - 0.01, d19, d6, d8);
                }
            }
        }
        if ((!bl || !bl2) && (bl3 || bl4 || bl || bl2)) {
            if (bl && !bl2) {
                wAR.method_c38c5864_Dne(d12, n2 + 1, d14, d, d4);
                wAR.method_c38c5864_Dne(d12, n2 + 0, d14, d, d5);
                wAR.method_c38c5864_Dne(d12, n2 + 0, d15, d2, d5);
                wAR.method_c38c5864_Dne(d12, n2 + 1, d15, d2, d4);
                wAR.method_c38c5864_Dne(d12, n2 + 1, d15, d, d4);
                wAR.method_c38c5864_Dne(d12, n2 + 0, d15, d, d5);
                wAR.method_c38c5864_Dne(d12, n2 + 0, d14, d2, d5);
                wAR.method_c38c5864_Dne(d12, n2 + 1, d14, d2, d4);
                if (!bl4 && !bl3) {
                    wAR.method_c38c5864_Dne(d17, n2 + 1, d15, d6, d8);
                    wAR.method_c38c5864_Dne(d17, n2 + 0, d15, d6, d10);
                    wAR.method_c38c5864_Dne(d18, n2 + 0, d15, d7, d10);
                    wAR.method_c38c5864_Dne(d18, n2 + 1, d15, d7, d8);
                    wAR.method_c38c5864_Dne(d18, n2 + 1, d15, d6, d8);
                    wAR.method_c38c5864_Dne(d18, n2 + 0, d15, d6, d10);
                    wAR.method_c38c5864_Dne(d17, n2 + 0, d15, d7, d10);
                    wAR.method_c38c5864_Dne(d17, n2 + 1, d15, d7, d8);
                }
                if (bl5 || n2 < n4 - 1 && this.field_3706cf9_Dne.method_2c2cf7cd_Dne(n, n2 + 1, n3 - 1)) {
                    wAR.method_c38c5864_Dne(d17, (double)(n2 + 1) + 0.005, d14, d7, d8);
                    wAR.method_c38c5864_Dne(d17, (double)(n2 + 1) + 0.005, d15, d7, d9);
                    wAR.method_c38c5864_Dne(d18, (double)(n2 + 1) + 0.005, d15, d6, d9);
                    wAR.method_c38c5864_Dne(d18, (double)(n2 + 1) + 0.005, d14, d6, d8);
                    wAR.method_c38c5864_Dne(d17, (double)(n2 + 1) + 0.005, d15, d7, d8);
                    wAR.method_c38c5864_Dne(d17, (double)(n2 + 1) + 0.005, d14, d7, d9);
                    wAR.method_c38c5864_Dne(d18, (double)(n2 + 1) + 0.005, d14, d6, d9);
                    wAR.method_c38c5864_Dne(d18, (double)(n2 + 1) + 0.005, d15, d6, d8);
                }
                if (bl6 || n2 > 1 && this.field_3706cf9_Dne.method_2c2cf7cd_Dne(n, n2 - 1, n3 - 1)) {
                    wAR.method_c38c5864_Dne(d17, (double)n2 - 0.005, d14, d7, d8);
                    wAR.method_c38c5864_Dne(d17, (double)n2 - 0.005, d15, d7, d9);
                    wAR.method_c38c5864_Dne(d18, (double)n2 - 0.005, d15, d6, d9);
                    wAR.method_c38c5864_Dne(d18, (double)n2 - 0.005, d14, d6, d8);
                    wAR.method_c38c5864_Dne(d17, (double)n2 - 0.005, d15, d7, d8);
                    wAR.method_c38c5864_Dne(d17, (double)n2 - 0.005, d14, d7, d9);
                    wAR.method_c38c5864_Dne(d18, (double)n2 - 0.005, d14, d6, d9);
                    wAR.method_c38c5864_Dne(d18, (double)n2 - 0.005, d15, d6, d8);
                }
            } else if (!bl && bl2) {
                wAR.method_c38c5864_Dne(d12, n2 + 1, d15, d2, d4);
                wAR.method_c38c5864_Dne(d12, n2 + 0, d15, d2, d5);
                wAR.method_c38c5864_Dne(d12, n2 + 0, d16, d3, d5);
                wAR.method_c38c5864_Dne(d12, n2 + 1, d16, d3, d4);
                wAR.method_c38c5864_Dne(d12, n2 + 1, d16, d2, d4);
                wAR.method_c38c5864_Dne(d12, n2 + 0, d16, d2, d5);
                wAR.method_c38c5864_Dne(d12, n2 + 0, d15, d3, d5);
                wAR.method_c38c5864_Dne(d12, n2 + 1, d15, d3, d4);
                if (!bl4 && !bl3) {
                    wAR.method_c38c5864_Dne(d18, n2 + 1, d15, d6, d8);
                    wAR.method_c38c5864_Dne(d18, n2 + 0, d15, d6, d10);
                    wAR.method_c38c5864_Dne(d17, n2 + 0, d15, d7, d10);
                    wAR.method_c38c5864_Dne(d17, n2 + 1, d15, d7, d8);
                    wAR.method_c38c5864_Dne(d17, n2 + 1, d15, d6, d8);
                    wAR.method_c38c5864_Dne(d17, n2 + 0, d15, d6, d10);
                    wAR.method_c38c5864_Dne(d18, n2 + 0, d15, d7, d10);
                    wAR.method_c38c5864_Dne(d18, n2 + 1, d15, d7, d8);
                }
                if (bl5 || n2 < n4 - 1 && this.field_3706cf9_Dne.method_2c2cf7cd_Dne(n, n2 + 1, n3 + 1)) {
                    wAR.method_c38c5864_Dne(d17, (double)(n2 + 1) + 0.005, d15, d6, d9);
                    wAR.method_c38c5864_Dne(d17, (double)(n2 + 1) + 0.005, d16, d6, d10);
                    wAR.method_c38c5864_Dne(d18, (double)(n2 + 1) + 0.005, d16, d7, d10);
                    wAR.method_c38c5864_Dne(d18, (double)(n2 + 1) + 0.005, d15, d7, d9);
                    wAR.method_c38c5864_Dne(d17, (double)(n2 + 1) + 0.005, d16, d6, d9);
                    wAR.method_c38c5864_Dne(d17, (double)(n2 + 1) + 0.005, d15, d6, d10);
                    wAR.method_c38c5864_Dne(d18, (double)(n2 + 1) + 0.005, d15, d7, d10);
                    wAR.method_c38c5864_Dne(d18, (double)(n2 + 1) + 0.005, d16, d7, d9);
                }
                if (bl6 || n2 > 1 && this.field_3706cf9_Dne.method_2c2cf7cd_Dne(n, n2 - 1, n3 + 1)) {
                    wAR.method_c38c5864_Dne(d17, (double)n2 - 0.005, d15, d6, d9);
                    wAR.method_c38c5864_Dne(d17, (double)n2 - 0.005, d16, d6, d10);
                    wAR.method_c38c5864_Dne(d18, (double)n2 - 0.005, d16, d7, d10);
                    wAR.method_c38c5864_Dne(d18, (double)n2 - 0.005, d15, d7, d9);
                    wAR.method_c38c5864_Dne(d17, (double)n2 - 0.005, d16, d6, d9);
                    wAR.method_c38c5864_Dne(d17, (double)n2 - 0.005, d15, d6, d10);
                    wAR.method_c38c5864_Dne(d18, (double)n2 - 0.005, d15, d7, d10);
                    wAR.method_c38c5864_Dne(d18, (double)n2 - 0.005, d16, d7, d9);
                }
            }
        } else {
            wAR.method_c38c5864_Dne(d12, n2 + 1, d16, d, d4);
            wAR.method_c38c5864_Dne(d12, n2 + 0, d16, d, d5);
            wAR.method_c38c5864_Dne(d12, n2 + 0, d14, d3, d5);
            wAR.method_c38c5864_Dne(d12, n2 + 1, d14, d3, d4);
            wAR.method_c38c5864_Dne(d12, n2 + 1, d14, d, d4);
            wAR.method_c38c5864_Dne(d12, n2 + 0, d14, d, d5);
            wAR.method_c38c5864_Dne(d12, n2 + 0, d16, d3, d5);
            wAR.method_c38c5864_Dne(d12, n2 + 1, d16, d3, d4);
            if (bl5) {
                wAR.method_c38c5864_Dne(d18, (double)(n2 + 1) + 0.005, d16, d7, d10);
                wAR.method_c38c5864_Dne(d18, (double)(n2 + 1) + 0.005, d14, d7, d8);
                wAR.method_c38c5864_Dne(d17, (double)(n2 + 1) + 0.005, d14, d6, d8);
                wAR.method_c38c5864_Dne(d17, (double)(n2 + 1) + 0.005, d16, d6, d10);
                wAR.method_c38c5864_Dne(d18, (double)(n2 + 1) + 0.005, d14, d7, d10);
                wAR.method_c38c5864_Dne(d18, (double)(n2 + 1) + 0.005, d16, d7, d8);
                wAR.method_c38c5864_Dne(d17, (double)(n2 + 1) + 0.005, d16, d6, d8);
                wAR.method_c38c5864_Dne(d17, (double)(n2 + 1) + 0.005, d14, d6, d10);
            } else {
                if (n2 < n4 - 1 && this.field_3706cf9_Dne.method_2c2cf7cd_Dne(n, n2 + 1, n3 - 1)) {
                    wAR.method_c38c5864_Dne(d17, (double)(n2 + 1) + 0.005, d14, d7, d8);
                    wAR.method_c38c5864_Dne(d17, (double)(n2 + 1) + 0.005, d15, d7, d9);
                    wAR.method_c38c5864_Dne(d18, (double)(n2 + 1) + 0.005, d15, d6, d9);
                    wAR.method_c38c5864_Dne(d18, (double)(n2 + 1) + 0.005, d14, d6, d8);
                    wAR.method_c38c5864_Dne(d17, (double)(n2 + 1) + 0.005, d15, d7, d8);
                    wAR.method_c38c5864_Dne(d17, (double)(n2 + 1) + 0.005, d14, d7, d9);
                    wAR.method_c38c5864_Dne(d18, (double)(n2 + 1) + 0.005, d14, d6, d9);
                    wAR.method_c38c5864_Dne(d18, (double)(n2 + 1) + 0.005, d15, d6, d8);
                }
                if (n2 < n4 - 1 && this.field_3706cf9_Dne.method_2c2cf7cd_Dne(n, n2 + 1, n3 + 1)) {
                    wAR.method_c38c5864_Dne(d17, (double)(n2 + 1) + 0.005, d15, d6, d9);
                    wAR.method_c38c5864_Dne(d17, (double)(n2 + 1) + 0.005, d16, d6, d10);
                    wAR.method_c38c5864_Dne(d18, (double)(n2 + 1) + 0.005, d16, d7, d10);
                    wAR.method_c38c5864_Dne(d18, (double)(n2 + 1) + 0.005, d15, d7, d9);
                    wAR.method_c38c5864_Dne(d17, (double)(n2 + 1) + 0.005, d16, d6, d9);
                    wAR.method_c38c5864_Dne(d17, (double)(n2 + 1) + 0.005, d15, d6, d10);
                    wAR.method_c38c5864_Dne(d18, (double)(n2 + 1) + 0.005, d15, d7, d10);
                    wAR.method_c38c5864_Dne(d18, (double)(n2 + 1) + 0.005, d16, d7, d9);
                }
            }
            if (bl6) {
                wAR.method_c38c5864_Dne(d18, (double)n2 - 0.005, d16, d7, d10);
                wAR.method_c38c5864_Dne(d18, (double)n2 - 0.005, d14, d7, d8);
                wAR.method_c38c5864_Dne(d17, (double)n2 - 0.005, d14, d6, d8);
                wAR.method_c38c5864_Dne(d17, (double)n2 - 0.005, d16, d6, d10);
                wAR.method_c38c5864_Dne(d18, (double)n2 - 0.005, d14, d7, d10);
                wAR.method_c38c5864_Dne(d18, (double)n2 - 0.005, d16, d7, d8);
                wAR.method_c38c5864_Dne(d17, (double)n2 - 0.005, d16, d6, d8);
                wAR.method_c38c5864_Dne(d17, (double)n2 - 0.005, d14, d6, d10);
            } else {
                if (n2 > 1 && this.field_3706cf9_Dne.method_2c2cf7cd_Dne(n, n2 - 1, n3 - 1)) {
                    wAR.method_c38c5864_Dne(d17, (double)n2 - 0.005, d14, d7, d8);
                    wAR.method_c38c5864_Dne(d17, (double)n2 - 0.005, d15, d7, d9);
                    wAR.method_c38c5864_Dne(d18, (double)n2 - 0.005, d15, d6, d9);
                    wAR.method_c38c5864_Dne(d18, (double)n2 - 0.005, d14, d6, d8);
                    wAR.method_c38c5864_Dne(d17, (double)n2 - 0.005, d15, d7, d8);
                    wAR.method_c38c5864_Dne(d17, (double)n2 - 0.005, d14, d7, d9);
                    wAR.method_c38c5864_Dne(d18, (double)n2 - 0.005, d14, d6, d9);
                    wAR.method_c38c5864_Dne(d18, (double)n2 - 0.005, d15, d6, d8);
                }
                if (n2 > 1 && this.field_3706cf9_Dne.method_2c2cf7cd_Dne(n, n2 - 1, n3 + 1)) {
                    wAR.method_c38c5864_Dne(d17, (double)n2 - 0.005, d15, d6, d9);
                    wAR.method_c38c5864_Dne(d17, (double)n2 - 0.005, d16, d6, d10);
                    wAR.method_c38c5864_Dne(d18, (double)n2 - 0.005, d16, d7, d10);
                    wAR.method_c38c5864_Dne(d18, (double)n2 - 0.005, d15, d7, d9);
                    wAR.method_c38c5864_Dne(d17, (double)n2 - 0.005, d16, d6, d9);
                    wAR.method_c38c5864_Dne(d17, (double)n2 - 0.005, d15, d6, d10);
                    wAR.method_c38c5864_Dne(d18, (double)n2 - 0.005, d15, d7, d10);
                    wAR.method_c38c5864_Dne(d18, (double)n2 - 0.005, d16, d7, d9);
                }
            }
        }
        return true;
    }

    public void method_8b1536db_Dne(zKP zKP2, int n, double d, double d2, double d3, double d4) {
        WAR wAR = WAR.field_36e5ca4_Dne;
        gDn gDn2 = this.method_b27f0188_Dne(zKP2, 0, n);
        if (this.method_7a46289e_Dne()) {
            gDn2 = this.field_375b13b_Dne;
        }
        double d5 = gDn2.method_7a46288a_Dne();
        double d6 = gDn2.method_ae128db7_bzF();
        double d7 = gDn2.method_7c6f6029_FWm();
        double d8 = gDn2.method_117d0715_FWm(d * 16.0);
        double d9 = d2 + 0.5 - (double)0.45f;
        double d10 = d2 + 0.5 + (double)0.45f;
        double d11 = d4 + 0.5 - (double)0.45f;
        double d12 = d4 + 0.5 + (double)0.45f;
        wAR.method_c38c5864_Dne(d9, d3 + d, d11, d5, d6);
        wAR.method_c38c5864_Dne(d9, d3 + 0.0, d11, d5, d8);
        wAR.method_c38c5864_Dne(d10, d3 + 0.0, d12, d7, d8);
        wAR.method_c38c5864_Dne(d10, d3 + d, d12, d7, d6);
        wAR.method_c38c5864_Dne(d10, d3 + d, d12, d5, d6);
        wAR.method_c38c5864_Dne(d10, d3 + 0.0, d12, d5, d8);
        wAR.method_c38c5864_Dne(d9, d3 + 0.0, d11, d7, d8);
        wAR.method_c38c5864_Dne(d9, d3 + d, d11, d7, d6);
        wAR.method_c38c5864_Dne(d9, d3 + d, d12, d5, d6);
        wAR.method_c38c5864_Dne(d9, d3 + 0.0, d12, d5, d8);
        wAR.method_c38c5864_Dne(d10, d3 + 0.0, d11, d7, d8);
        wAR.method_c38c5864_Dne(d10, d3 + d, d11, d7, d6);
        wAR.method_c38c5864_Dne(d10, d3 + d, d11, d5, d6);
        wAR.method_c38c5864_Dne(d10, d3 + 0.0, d11, d5, d8);
        wAR.method_c38c5864_Dne(d9, d3 + 0.0, d12, d7, d8);
        wAR.method_c38c5864_Dne(d9, d3 + d, d12, d7, d6);
    }

    public boolean method_a4d55ba9_Dne(qQB qQB2, int n, int n2, int n3, int n4) {
        WAR wAR = WAR.field_36e5ca4_Dne;
        wAR.method_117d19ea_FWm(qQB2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3));
        float f = 1.0f;
        int n5 = qQB2.method_fbabf7e2_Dne(this.field_3706cf9_Dne, n, n2, n3);
        float f2 = (float)(n5 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n5 >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n5 & 0xFF) / 255.0f;
        if (OEA.field_2092bf_Dne) {
            float f5 = (f2 * 30.0f + f3 * 59.0f + f4 * 11.0f) / 100.0f;
            float f6 = (f2 * 30.0f + f3 * 70.0f) / 100.0f;
            float f7 = (f2 * 30.0f + f4 * 70.0f) / 100.0f;
            f2 = f5;
            f3 = f6;
            f4 = f7;
        }
        wAR.method_2c0148e6_Dne(f * f2, f * f3, f * f4);
        return this.method_f5d6cbd3_Dne(qQB2, n, n2, n3, n4, false);
    }

    public void method_925c7e93_Qnq(zKP zKP2, double d, double d2, double d3, gDn gDn2) {
        double d4;
        WAR wAR = WAR.field_36e5ca4_Dne;
        if (this.method_7a46289e_Dne()) {
            gDn2 = this.field_375b13b_Dne;
        }
        double d5 = gDn2.method_ce7f4ad4_Dne(this.field_2092a9_Dne * 16.0);
        double d6 = gDn2.method_ce7f4ad4_Dne(this.field_212608_FWm * 16.0);
        double d7 = gDn2.method_117d0715_FWm(16.0 - this.field_267cf0_Qnq * 16.0);
        double d8 = gDn2.method_117d0715_FWm(16.0 - this.field_2e5f16_bzF * 16.0);
        if (this.field_2e5f2c_bzF) {
            d4 = d5;
            d5 = d6;
            d6 = d4;
        }
        if (this.field_2092a9_Dne < 0.0 || this.field_212608_FWm > 1.0) {
            d5 = gDn2.method_7a46288a_Dne();
            d6 = gDn2.method_7c6f6029_FWm();
        }
        if (this.field_2e5f16_bzF < 0.0 || this.field_267cf0_Qnq > 1.0) {
            d7 = gDn2.method_ae128db7_bzF();
            d8 = gDn2.method_907a9d11_Qnq();
        }
        d4 = d6;
        double d9 = d5;
        double d10 = d7;
        double d11 = d8;
        if (this.field_21260d_FWm == 1) {
            d5 = gDn2.method_ce7f4ad4_Dne(this.field_2e5f16_bzF * 16.0);
            d8 = gDn2.method_117d0715_FWm(16.0 - this.field_2092a9_Dne * 16.0);
            d6 = gDn2.method_ce7f4ad4_Dne(this.field_267cf0_Qnq * 16.0);
            d10 = d7 = (double)gDn2.method_117d0715_FWm(16.0 - this.field_212608_FWm * 16.0);
            d11 = d8;
            d4 = d5;
            d9 = d6;
            d7 = d8;
            d8 = d10;
        } else if (this.field_21260d_FWm == 2) {
            d5 = gDn2.method_ce7f4ad4_Dne(16.0 - this.field_267cf0_Qnq * 16.0);
            d7 = gDn2.method_117d0715_FWm(this.field_2092a9_Dne * 16.0);
            d6 = gDn2.method_ce7f4ad4_Dne(16.0 - this.field_2e5f16_bzF * 16.0);
            d8 = gDn2.method_117d0715_FWm(this.field_212608_FWm * 16.0);
            d4 = d6;
            d9 = d5;
            d5 = d6;
            d6 = d9;
            d10 = d8;
            d11 = d7;
        } else if (this.field_21260d_FWm == 3) {
            d5 = gDn2.method_ce7f4ad4_Dne(16.0 - this.field_2092a9_Dne * 16.0);
            d6 = gDn2.method_ce7f4ad4_Dne(16.0 - this.field_212608_FWm * 16.0);
            d7 = gDn2.method_117d0715_FWm(this.field_267cf0_Qnq * 16.0);
            d8 = gDn2.method_117d0715_FWm(this.field_2e5f16_bzF * 16.0);
            d4 = d6;
            d9 = d5;
            d10 = d7;
            d11 = d8;
        }
        double d12 = d + this.field_2092a9_Dne;
        double d13 = d + this.field_212608_FWm;
        double d14 = d2 + this.field_2e5f16_bzF;
        double d15 = d2 + this.field_267cf0_Qnq;
        double d16 = d3 + this.field_388da1_zGp;
        if (this.field_20b868_DyG) {
            wAR.method_2c0148e6_Dne(this.field_212c18_EyB, this.field_36e4d7_vSL, this.field_3649f6_tgc);
            wAR.method_117d19ea_FWm(this.field_217c26_Fnk);
            wAR.method_c38c5864_Dne(d12, d15, d16, d5, d7);
            wAR.method_2c0148e6_Dne(this.field_215b33_FfS, this.field_26818c_RPx, this.field_34b5fe_qXo);
            wAR.method_117d19ea_FWm(this.field_307847_gnI);
            wAR.method_c38c5864_Dne(d12, d14, d16, d9, d11);
            wAR.method_2c0148e6_Dne(this.field_2569d2_OdI, this.field_217c23_Fnk, this.field_1f1786_AgF);
            wAR.method_117d19ea_FWm(this.field_3649f9_tgc);
            wAR.method_c38c5864_Dne(d13, d14, d16, d6, d8);
            wAR.method_2c0148e6_Dne(this.field_3393da_oIf, this.field_307844_gnI, this.field_383100_yMz);
            wAR.method_117d19ea_FWm(this.field_34b601_qXo);
            wAR.method_c38c5864_Dne(d13, d15, d16, d4, d10);
        } else {
            wAR.method_c38c5864_Dne(d12, d15, d16, d5, d7);
            wAR.method_c38c5864_Dne(d12, d14, d16, d9, d11);
            wAR.method_c38c5864_Dne(d13, d14, d16, d6, d8);
            wAR.method_c38c5864_Dne(d13, d15, d16, d4, d10);
        }
    }

    private boolean method_aa7a7b22_Dne(qQB qQB2, int n, int n2, int n3) {
        return this.method_a4d55ba9_Dne(qQB2, n, n2, n3, this.field_3706cf9_Dne.method_2dee76f_bzF(n, n2, n3));
    }

    public void method_58bf1fba_Dne(zKP zKP2, double d, double d2, double d3, gDn gDn2) {
        WAR wAR = WAR.field_36e5ca4_Dne;
        if (this.method_7a46289e_Dne()) {
            gDn2 = this.field_375b13b_Dne;
        }
        double d4 = gDn2.method_ce7f4ad4_Dne(this.field_2092a9_Dne * 16.0);
        double d5 = gDn2.method_ce7f4ad4_Dne(this.field_212608_FWm * 16.0);
        double d6 = gDn2.method_117d0715_FWm(this.field_2d29ef_aFZ * 16.0);
        double d7 = gDn2.method_117d0715_FWm(this.field_388da1_zGp * 16.0);
        if (this.field_2092a9_Dne < 0.0 || this.field_212608_FWm > 1.0) {
            d4 = gDn2.method_7a46288a_Dne();
            d5 = gDn2.method_7c6f6029_FWm();
        }
        if (this.field_2d29ef_aFZ < 0.0 || this.field_388da1_zGp > 1.0) {
            d6 = gDn2.method_ae128db7_bzF();
            d7 = gDn2.method_907a9d11_Qnq();
        }
        double d8 = d5;
        double d9 = d4;
        double d10 = d6;
        double d11 = d7;
        if (this.field_388da6_zGp == 2) {
            d4 = gDn2.method_ce7f4ad4_Dne(this.field_2d29ef_aFZ * 16.0);
            d6 = gDn2.method_117d0715_FWm(16.0 - this.field_212608_FWm * 16.0);
            d5 = gDn2.method_ce7f4ad4_Dne(this.field_388da1_zGp * 16.0);
            d7 = gDn2.method_117d0715_FWm(16.0 - this.field_2092a9_Dne * 16.0);
            d10 = d6;
            d11 = d7;
            d8 = d4;
            d9 = d5;
            d6 = d7;
            d7 = d10;
        } else if (this.field_388da6_zGp == 1) {
            d4 = gDn2.method_ce7f4ad4_Dne(16.0 - this.field_388da1_zGp * 16.0);
            d6 = gDn2.method_117d0715_FWm(this.field_2092a9_Dne * 16.0);
            d5 = gDn2.method_ce7f4ad4_Dne(16.0 - this.field_2d29ef_aFZ * 16.0);
            d7 = gDn2.method_117d0715_FWm(this.field_212608_FWm * 16.0);
            d8 = d5;
            d9 = d4;
            d4 = d5;
            d5 = d9;
            d10 = d7;
            d11 = d6;
        } else if (this.field_388da6_zGp == 3) {
            d4 = gDn2.method_ce7f4ad4_Dne(16.0 - this.field_2092a9_Dne * 16.0);
            d5 = gDn2.method_ce7f4ad4_Dne(16.0 - this.field_212608_FWm * 16.0);
            d6 = gDn2.method_117d0715_FWm(16.0 - this.field_2d29ef_aFZ * 16.0);
            d7 = gDn2.method_117d0715_FWm(16.0 - this.field_388da1_zGp * 16.0);
            d8 = d5;
            d9 = d4;
            d10 = d6;
            d11 = d7;
        }
        double d12 = d + this.field_2092a9_Dne;
        double d13 = d + this.field_212608_FWm;
        double d14 = d2 + this.field_2e5f16_bzF;
        double d15 = d3 + this.field_2d29ef_aFZ;
        double d16 = d3 + this.field_388da1_zGp;
        if (this.field_20b868_DyG) {
            wAR.method_2c0148e6_Dne(this.field_212c18_EyB, this.field_36e4d7_vSL, this.field_3649f6_tgc);
            wAR.method_117d19ea_FWm(this.field_217c26_Fnk);
            wAR.method_c38c5864_Dne(d12, d14, d16, d9, d11);
            wAR.method_2c0148e6_Dne(this.field_215b33_FfS, this.field_26818c_RPx, this.field_34b5fe_qXo);
            wAR.method_117d19ea_FWm(this.field_307847_gnI);
            wAR.method_c38c5864_Dne(d12, d14, d15, d4, d6);
            wAR.method_2c0148e6_Dne(this.field_2569d2_OdI, this.field_217c23_Fnk, this.field_1f1786_AgF);
            wAR.method_117d19ea_FWm(this.field_3649f9_tgc);
            wAR.method_c38c5864_Dne(d13, d14, d15, d8, d10);
            wAR.method_2c0148e6_Dne(this.field_3393da_oIf, this.field_307844_gnI, this.field_383100_yMz);
            wAR.method_117d19ea_FWm(this.field_34b601_qXo);
            wAR.method_c38c5864_Dne(d13, d14, d16, d5, d7);
        } else {
            wAR.method_c38c5864_Dne(d12, d14, d16, d9, d11);
            wAR.method_c38c5864_Dne(d12, d14, d15, d4, d6);
            wAR.method_c38c5864_Dne(d13, d14, d15, d8, d10);
            wAR.method_c38c5864_Dne(d13, d14, d16, d5, d7);
        }
    }

    public boolean method_46142a36_Dne(SFI sFI, int n, int n2, int n3) {
        float f;
        float f2;
        float f3;
        float f4;
        boolean bl = true;
        int n4 = this.field_3706cf9_Dne.method_2dee76f_bzF(n, n2, n3);
        boolean bl2 = SFI.method_ce7f5dad_Dne(n4);
        int n5 = kbN.method_7ed979f5_Qnq(n4);
        float f5 = 0.375f;
        float f6 = 0.5625f;
        float f7 = 0.75f;
        float f8 = 0.9375f;
        float f9 = 0.3125f;
        float f10 = 1.0f;
        if ((n5 == 2 || n5 == 0) && this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n - 1, n2, n3) == zKP.field_94470304_dYY.field_21260d_FWm && this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n + 1, n2, n3) == zKP.field_94470304_dYY.field_21260d_FWm || (n5 == 3 || n5 == 1) && this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n, n2, n3 - 1) == zKP.field_94470304_dYY.field_21260d_FWm && this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n, n2, n3 + 1) == zKP.field_94470304_dYY.field_21260d_FWm) {
            f5 -= 0.1875f;
            f6 -= 0.1875f;
            f7 -= 0.1875f;
            f8 -= 0.1875f;
            f9 -= 0.1875f;
            f10 -= 0.1875f;
        }
        this.field_267d06_Qnq = true;
        if (n5 != 3 && n5 != 1) {
            f4 = 0.0f;
            f3 = 0.125f;
            f2 = 0.4375f;
            f = 0.5625f;
            this.method_adff145a_Dne(f4, f9, f2, f3, f10, f);
            this.method_9743b2ba_udO(sFI, n, n2, n3);
            f4 = 0.875f;
            f3 = 1.0f;
            this.method_adff145a_Dne(f4, f9, f2, f3, f10, f);
            this.method_9743b2ba_udO(sFI, n, n2, n3);
        } else {
            this.field_2d29f4_aFZ = 1;
            f4 = 0.4375f;
            f3 = 0.5625f;
            f2 = 0.0f;
            f = 0.125f;
            this.method_adff145a_Dne(f4, f9, f2, f3, f10, f);
            this.method_9743b2ba_udO(sFI, n, n2, n3);
            f2 = 0.875f;
            f = 1.0f;
            this.method_adff145a_Dne(f4, f9, f2, f3, f10, f);
            this.method_9743b2ba_udO(sFI, n, n2, n3);
            this.field_2d29f4_aFZ = 0;
        }
        if (bl2) {
            if (n5 == 2 || n5 == 0) {
                this.field_2d29f4_aFZ = 1;
            }
            if (n5 == 3) {
                this.method_adff145a_Dne(0.8125, f5, 0.0, 0.9375, f8, 0.125);
                this.method_9743b2ba_udO(sFI, n, n2, n3);
                this.method_adff145a_Dne(0.8125, f5, 0.875, 0.9375, f8, 1.0);
                this.method_9743b2ba_udO(sFI, n, n2, n3);
                this.method_adff145a_Dne(0.5625, f5, 0.0, 0.8125, f6, 0.125);
                this.method_9743b2ba_udO(sFI, n, n2, n3);
                this.method_adff145a_Dne(0.5625, f5, 0.875, 0.8125, f6, 1.0);
                this.method_9743b2ba_udO(sFI, n, n2, n3);
                this.method_adff145a_Dne(0.5625, f7, 0.0, 0.8125, f8, 0.125);
                this.method_9743b2ba_udO(sFI, n, n2, n3);
                this.method_adff145a_Dne(0.5625, f7, 0.875, 0.8125, f8, 1.0);
                this.method_9743b2ba_udO(sFI, n, n2, n3);
            } else if (n5 == 1) {
                this.method_adff145a_Dne(0.0625, f5, 0.0, 0.1875, f8, 0.125);
                this.method_9743b2ba_udO(sFI, n, n2, n3);
                this.method_adff145a_Dne(0.0625, f5, 0.875, 0.1875, f8, 1.0);
                this.method_9743b2ba_udO(sFI, n, n2, n3);
                this.method_adff145a_Dne(0.1875, f5, 0.0, 0.4375, f6, 0.125);
                this.method_9743b2ba_udO(sFI, n, n2, n3);
                this.method_adff145a_Dne(0.1875, f5, 0.875, 0.4375, f6, 1.0);
                this.method_9743b2ba_udO(sFI, n, n2, n3);
                this.method_adff145a_Dne(0.1875, f7, 0.0, 0.4375, f8, 0.125);
                this.method_9743b2ba_udO(sFI, n, n2, n3);
                this.method_adff145a_Dne(0.1875, f7, 0.875, 0.4375, f8, 1.0);
                this.method_9743b2ba_udO(sFI, n, n2, n3);
            } else if (n5 == 0) {
                this.method_adff145a_Dne(0.0, f5, 0.8125, 0.125, f8, 0.9375);
                this.method_9743b2ba_udO(sFI, n, n2, n3);
                this.method_adff145a_Dne(0.875, f5, 0.8125, 1.0, f8, 0.9375);
                this.method_9743b2ba_udO(sFI, n, n2, n3);
                this.method_adff145a_Dne(0.0, f5, 0.5625, 0.125, f6, 0.8125);
                this.method_9743b2ba_udO(sFI, n, n2, n3);
                this.method_adff145a_Dne(0.875, f5, 0.5625, 1.0, f6, 0.8125);
                this.method_9743b2ba_udO(sFI, n, n2, n3);
                this.method_adff145a_Dne(0.0, f7, 0.5625, 0.125, f8, 0.8125);
                this.method_9743b2ba_udO(sFI, n, n2, n3);
                this.method_adff145a_Dne(0.875, f7, 0.5625, 1.0, f8, 0.8125);
                this.method_9743b2ba_udO(sFI, n, n2, n3);
            } else if (n5 == 2) {
                this.method_adff145a_Dne(0.0, f5, 0.0625, 0.125, f8, 0.1875);
                this.method_9743b2ba_udO(sFI, n, n2, n3);
                this.method_adff145a_Dne(0.875, f5, 0.0625, 1.0, f8, 0.1875);
                this.method_9743b2ba_udO(sFI, n, n2, n3);
                this.method_adff145a_Dne(0.0, f5, 0.1875, 0.125, f6, 0.4375);
                this.method_9743b2ba_udO(sFI, n, n2, n3);
                this.method_adff145a_Dne(0.875, f5, 0.1875, 1.0, f6, 0.4375);
                this.method_9743b2ba_udO(sFI, n, n2, n3);
                this.method_adff145a_Dne(0.0, f7, 0.1875, 0.125, f8, 0.4375);
                this.method_9743b2ba_udO(sFI, n, n2, n3);
                this.method_adff145a_Dne(0.875, f7, 0.1875, 1.0, f8, 0.4375);
                this.method_9743b2ba_udO(sFI, n, n2, n3);
            }
        } else if (n5 != 3 && n5 != 1) {
            f4 = 0.375f;
            f3 = 0.5f;
            f2 = 0.4375f;
            f = 0.5625f;
            this.method_adff145a_Dne(f4, f5, f2, f3, f8, f);
            this.method_9743b2ba_udO(sFI, n, n2, n3);
            f4 = 0.5f;
            f3 = 0.625f;
            this.method_adff145a_Dne(f4, f5, f2, f3, f8, f);
            this.method_9743b2ba_udO(sFI, n, n2, n3);
            f4 = 0.625f;
            f3 = 0.875f;
            this.method_adff145a_Dne(f4, f5, f2, f3, f6, f);
            this.method_9743b2ba_udO(sFI, n, n2, n3);
            this.method_adff145a_Dne(f4, f7, f2, f3, f8, f);
            this.method_9743b2ba_udO(sFI, n, n2, n3);
            f4 = 0.125f;
            f3 = 0.375f;
            this.method_adff145a_Dne(f4, f5, f2, f3, f6, f);
            this.method_9743b2ba_udO(sFI, n, n2, n3);
            this.method_adff145a_Dne(f4, f7, f2, f3, f8, f);
            this.method_9743b2ba_udO(sFI, n, n2, n3);
        } else {
            this.field_2d29f4_aFZ = 1;
            f4 = 0.4375f;
            f3 = 0.5625f;
            f2 = 0.375f;
            f = 0.5f;
            this.method_adff145a_Dne(f4, f5, f2, f3, f8, f);
            this.method_9743b2ba_udO(sFI, n, n2, n3);
            f2 = 0.5f;
            f = 0.625f;
            this.method_adff145a_Dne(f4, f5, f2, f3, f8, f);
            this.method_9743b2ba_udO(sFI, n, n2, n3);
            f2 = 0.625f;
            f = 0.875f;
            this.method_adff145a_Dne(f4, f5, f2, f3, f6, f);
            this.method_9743b2ba_udO(sFI, n, n2, n3);
            this.method_adff145a_Dne(f4, f7, f2, f3, f8, f);
            this.method_9743b2ba_udO(sFI, n, n2, n3);
            f2 = 0.125f;
            f = 0.375f;
            this.method_adff145a_Dne(f4, f5, f2, f3, f6, f);
            this.method_9743b2ba_udO(sFI, n, n2, n3);
            this.method_adff145a_Dne(f4, f7, f2, f3, f8, f);
            this.method_9743b2ba_udO(sFI, n, n2, n3);
        }
        this.field_267d06_Qnq = false;
        this.field_2d29f4_aFZ = 0;
        this.method_adff145a_Dne(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
        return bl;
    }

    public void method_7c6f6039_FWm() {
        this.field_2d2a05_aFZ = false;
    }

    public boolean method_bfc215e7_kGO(zKP zKP2, int n, int n2, int n3) {
        float f;
        float f2;
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        WAR wAR = WAR.field_36e5ca4_Dne;
        int n4 = zKP2.method_fbabf7e2_Dne(this.field_3706cf9_Dne, n, n2, n3);
        float f3 = (float)(n4 >> 16 & 0xFF) / 255.0f;
        float f4 = (float)(n4 >> 8 & 0xFF) / 255.0f;
        float f5 = (float)(n4 & 0xFF) / 255.0f;
        boolean bl = zKP2.method_79d378f8_Dne(this.field_3706cf9_Dne, n, n2 + 1, n3, 1);
        boolean bl2 = zKP2.method_79d378f8_Dne(this.field_3706cf9_Dne, n, n2 - 1, n3, 0);
        boolean[] blArray = new boolean[]{zKP2.method_79d378f8_Dne(this.field_3706cf9_Dne, n, n2, n3 - 1, 2), zKP2.method_79d378f8_Dne(this.field_3706cf9_Dne, n, n2, n3 + 1, 3), zKP2.method_79d378f8_Dne(this.field_3706cf9_Dne, n - 1, n2, n3, 4), zKP2.method_79d378f8_Dne(this.field_3706cf9_Dne, n + 1, n2, n3, 5)};
        if (!(bl || bl2 || blArray[0] || blArray[1] || blArray[2] || blArray[3])) {
            return false;
        }
        boolean bl3 = false;
        float f6 = 0.5f;
        float f7 = 1.0f;
        float f8 = 0.8f;
        float f9 = 0.6f;
        double d7 = 0.0;
        double d8 = 1.0;
        KFd kFd = zKP2.field_368fd23_Dne;
        int n5 = this.field_3706cf9_Dne.method_2dee76f_bzF(n, n2, n3);
        double d9 = this.method_90110dff_Dne(n, n2, n3, kFd);
        double d10 = this.method_90110dff_Dne(n, n2, n3 + 1, kFd);
        double d11 = this.method_90110dff_Dne(n + 1, n2, n3 + 1, kFd);
        double d12 = this.method_90110dff_Dne(n + 1, n2, n3, kFd);
        double d13 = 0.001f;
        if (this.field_267d06_Qnq || bl) {
            double d14;
            double d15;
            bl3 = true;
            gDn gDn2 = this.method_b27f0188_Dne(zKP2, 1, n5);
            float f10 = (float)byt.method_d8ca3597_Dne(this.field_3706cf9_Dne, n, n2, n3, kFd);
            if (f10 > -999.0f) {
                gDn2 = this.method_b27f0188_Dne(zKP2, 2, n5);
            }
            d9 -= d13;
            d10 -= d13;
            d11 -= d13;
            d12 -= d13;
            if (f10 < -999.0f) {
                d15 = gDn2.method_ce7f4ad4_Dne(0.0);
                d6 = gDn2.method_117d0715_FWm(0.0);
                d5 = d15;
                d4 = gDn2.method_117d0715_FWm(16.0);
                d3 = gDn2.method_ce7f4ad4_Dne(16.0);
                d2 = d4;
                d = d3;
                d14 = d6;
            } else {
                f2 = geR.method_ce7f5256_Dne(f10) * 0.25f;
                f = geR.method_117d0e97_FWm(f10) * 0.25f;
                d15 = gDn2.method_ce7f4ad4_Dne(8.0f + (-f - f2) * 16.0f);
                d6 = gDn2.method_117d0715_FWm(8.0f + (-f + f2) * 16.0f);
                d5 = gDn2.method_ce7f4ad4_Dne(8.0f + (-f + f2) * 16.0f);
                d4 = gDn2.method_117d0715_FWm(8.0f + (f + f2) * 16.0f);
                d3 = gDn2.method_ce7f4ad4_Dne(8.0f + (f + f2) * 16.0f);
                d2 = gDn2.method_117d0715_FWm(8.0f + (f - f2) * 16.0f);
                d = gDn2.method_ce7f4ad4_Dne(8.0f + (f - f2) * 16.0f);
                d14 = gDn2.method_117d0715_FWm(8.0f + (-f - f2) * 16.0f);
            }
            wAR.method_117d19ea_FWm(zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3));
            f2 = 1.0f;
            wAR.method_2c0148e6_Dne(f7 * f2 * f3, f7 * f2 * f4, f7 * f2 * f5);
            wAR.method_c38c5864_Dne(n + 0, (double)n2 + d9, n3 + 0, d15, d6);
            wAR.method_c38c5864_Dne(n + 0, (double)n2 + d10, n3 + 1, d5, d4);
            wAR.method_c38c5864_Dne(n + 1, (double)n2 + d11, n3 + 1, d3, d2);
            wAR.method_c38c5864_Dne(n + 1, (double)n2 + d12, n3 + 0, d, d14);
        }
        if (this.field_267d06_Qnq || bl2) {
            wAR.method_117d19ea_FWm(zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2 - 1, n3));
            float f11 = 1.0f;
            wAR.method_2c0148e6_Dne(f6 * f11, f6 * f11, f6 * f11);
            this.method_58bf1fba_Dne(zKP2, n, (double)n2 + d13, n3, this.method_5d830b5b_Dne(zKP2, 0));
            bl3 = true;
        }
        for (int i = 0; i < 4; ++i) {
            int n6 = n;
            int n7 = n3;
            if (i == 0) {
                n7 = n3 - 1;
            }
            if (i == 1) {
                ++n7;
            }
            if (i == 2) {
                n6 = n - 1;
            }
            if (i == 3) {
                ++n6;
            }
            gDn gDn3 = this.method_b27f0188_Dne(zKP2, i + 2, n5);
            if (!this.field_267d06_Qnq && !blArray[i]) continue;
            if (i == 0) {
                d5 = d9;
                d3 = d12;
                d = n;
                d4 = n + 1;
                d6 = (double)n3 + d13;
                d2 = (double)n3 + d13;
            } else if (i == 1) {
                d5 = d11;
                d3 = d10;
                d = n + 1;
                d4 = n;
                d6 = (double)(n3 + 1) - d13;
                d2 = (double)(n3 + 1) - d13;
            } else if (i == 2) {
                d5 = d10;
                d3 = d9;
                d = (double)n + d13;
                d4 = (double)n + d13;
                d6 = n3 + 1;
                d2 = n3;
            } else {
                d5 = d12;
                d3 = d11;
                d = (double)(n + 1) - d13;
                d4 = (double)(n + 1) - d13;
                d6 = n3;
                d2 = n3 + 1;
            }
            bl3 = true;
            float f12 = gDn3.method_ce7f4ad4_Dne(0.0);
            f2 = gDn3.method_ce7f4ad4_Dne(8.0);
            f = gDn3.method_117d0715_FWm((1.0 - d5) * 16.0 * 0.5);
            float f13 = gDn3.method_117d0715_FWm((1.0 - d3) * 16.0 * 0.5);
            float f14 = gDn3.method_117d0715_FWm(8.0);
            wAR.method_117d19ea_FWm(zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n6, n2, n7));
            float f15 = 1.0f;
            f15 = i < 2 ? (f15 *= f8) : (f15 *= f9);
            wAR.method_2c0148e6_Dne(f7 * f15 * f3, f7 * f15 * f4, f7 * f15 * f5);
            wAR.method_c38c5864_Dne(d, (double)n2 + d5, d6, f12, f);
            wAR.method_c38c5864_Dne(d4, (double)n2 + d3, d2, f2, f13);
            wAR.method_c38c5864_Dne(d4, n2 + 0, d2, f2, f14);
            wAR.method_c38c5864_Dne(d, n2 + 0, d6, f12, f14);
        }
        this.field_2e5f16_bzF = d7;
        this.field_267cf0_Qnq = d8;
        return bl3;
    }

    public void method_d02c372d_Dne(zKP zKP2, double d, double d2, double d3, double d4, double d5, int n) {
        WAR wAR = WAR.field_36e5ca4_Dne;
        gDn gDn2 = this.method_b27f0188_Dne(zKP2, 0, n);
        if (this.method_7a46289e_Dne()) {
            gDn2 = this.field_375b13b_Dne;
        }
        double d6 = gDn2.method_7a46288a_Dne();
        double d7 = gDn2.method_ae128db7_bzF();
        double d8 = gDn2.method_7c6f6029_FWm();
        double d9 = gDn2.method_907a9d11_Qnq();
        double d10 = gDn2.method_ce7f4ad4_Dne(7.0);
        double d11 = gDn2.method_117d0715_FWm(6.0);
        double d12 = gDn2.method_ce7f4ad4_Dne(9.0);
        double d13 = gDn2.method_117d0715_FWm(8.0);
        double d14 = gDn2.method_ce7f4ad4_Dne(7.0);
        double d15 = gDn2.method_117d0715_FWm(13.0);
        double d16 = gDn2.method_ce7f4ad4_Dne(9.0);
        double d17 = gDn2.method_117d0715_FWm(15.0);
        double d18 = (d += 0.5) - 0.5;
        double d19 = d + 0.5;
        double d20 = (d3 += 0.5) - 0.5;
        double d21 = d3 + 0.5;
        double d22 = 0.0625;
        double d23 = 0.625;
        wAR.method_c38c5864_Dne(d + d4 * (1.0 - d23) - d22, d2 + d23, d3 + d5 * (1.0 - d23) - d22, d10, d11);
        wAR.method_c38c5864_Dne(d + d4 * (1.0 - d23) - d22, d2 + d23, d3 + d5 * (1.0 - d23) + d22, d10, d13);
        wAR.method_c38c5864_Dne(d + d4 * (1.0 - d23) + d22, d2 + d23, d3 + d5 * (1.0 - d23) + d22, d12, d13);
        wAR.method_c38c5864_Dne(d + d4 * (1.0 - d23) + d22, d2 + d23, d3 + d5 * (1.0 - d23) - d22, d12, d11);
        wAR.method_c38c5864_Dne(d + d22 + d4, d2, d3 - d22 + d5, d16, d15);
        wAR.method_c38c5864_Dne(d + d22 + d4, d2, d3 + d22 + d5, d16, d17);
        wAR.method_c38c5864_Dne(d - d22 + d4, d2, d3 + d22 + d5, d14, d17);
        wAR.method_c38c5864_Dne(d - d22 + d4, d2, d3 - d22 + d5, d14, d15);
        wAR.method_c38c5864_Dne(d - d22, d2 + 1.0, d20, d6, d7);
        wAR.method_c38c5864_Dne(d - d22 + d4, d2 + 0.0, d20 + d5, d6, d9);
        wAR.method_c38c5864_Dne(d - d22 + d4, d2 + 0.0, d21 + d5, d8, d9);
        wAR.method_c38c5864_Dne(d - d22, d2 + 1.0, d21, d8, d7);
        wAR.method_c38c5864_Dne(d + d22, d2 + 1.0, d21, d6, d7);
        wAR.method_c38c5864_Dne(d + d4 + d22, d2 + 0.0, d21 + d5, d6, d9);
        wAR.method_c38c5864_Dne(d + d4 + d22, d2 + 0.0, d20 + d5, d8, d9);
        wAR.method_c38c5864_Dne(d + d22, d2 + 1.0, d20, d8, d7);
        wAR.method_c38c5864_Dne(d18, d2 + 1.0, d3 + d22, d6, d7);
        wAR.method_c38c5864_Dne(d18 + d4, d2 + 0.0, d3 + d22 + d5, d6, d9);
        wAR.method_c38c5864_Dne(d19 + d4, d2 + 0.0, d3 + d22 + d5, d8, d9);
        wAR.method_c38c5864_Dne(d19, d2 + 1.0, d3 + d22, d8, d7);
        wAR.method_c38c5864_Dne(d19, d2 + 1.0, d3 - d22, d6, d7);
        wAR.method_c38c5864_Dne(d19 + d4, d2 + 0.0, d3 - d22 + d5, d6, d9);
        wAR.method_c38c5864_Dne(d18 + d4, d2 + 0.0, d3 - d22 + d5, d8, d9);
        wAR.method_c38c5864_Dne(d18, d2 + 1.0, d3 - d22, d8, d7);
    }

    public gDn method_5d830b5b_Dne(zKP zKP2, int n) {
        return this.method_36cdcef6_Dne(zKP2.method_77cd08ea_FWm(n));
    }

    public boolean method_d3ba357e_XHL(zKP zKP2, int n, int n2, int n3) {
        WAR wAR = WAR.field_36e5ca4_Dne;
        wAR.method_117d19ea_FWm(zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3));
        wAR.method_2c0148e6_Dne(1.0f, 1.0f, 1.0f);
        this.method_6fd761c3_Dne(zKP2, this.field_3706cf9_Dne.method_2dee76f_bzF(n, n2, n3), n, (float)n2 - 0.0625f, n3);
        return true;
    }

    public boolean method_34f676b5_ooe(zKP zKP2, int n, int n2, int n3) {
        int n4 = this.field_3706cf9_Dne.method_2dee76f_bzF(n, n2, n3);
        int n5 = n4 & 0xC;
        if (n5 == 4) {
            this.field_2092ae_Dne = 1;
            this.field_21260d_FWm = 1;
            this.field_2d29f4_aFZ = 1;
            this.field_388da6_zGp = 1;
        } else if (n5 == 8) {
            this.field_2e5f1b_bzF = 1;
            this.field_267cf5_Qnq = 1;
        }
        boolean bl = this.method_9743b2ba_udO(zKP2, n, n2, n3);
        this.field_2e5f1b_bzF = 0;
        this.field_2092ae_Dne = 0;
        this.field_21260d_FWm = 0;
        this.field_267cf5_Qnq = 0;
        this.field_2d29f4_aFZ = 0;
        this.field_388da6_zGp = 0;
        return bl;
    }

    public void method_adff145a_Dne(double d, double d2, double d3, double d4, double d5, double d6) {
        if (!this.field_2d2a05_aFZ) {
            this.field_2092a9_Dne = d;
            this.field_212608_FWm = d4;
            this.field_2e5f16_bzF = d2;
            this.field_267cf0_Qnq = d5;
            this.field_2d29ef_aFZ = d3;
            this.field_388da1_zGp = d6;
            this.field_388db7_zGp = this.field_493682ed_Dne.field_3758af7_Dne.field_2e5f1b_bzF >= 2 && (this.field_2092a9_Dne > 0.0 || this.field_212608_FWm < 1.0 || this.field_2e5f16_bzF > 0.0 || this.field_267cf0_Qnq < 1.0 || this.field_2d29ef_aFZ > 0.0 || this.field_388da1_zGp < 1.0);
        }
    }

    public boolean method_14caa66a_FWm(zKP zKP2, int n, int n2, int n3, float f, float f2, float f3) {
        gDn gDn2;
        int n4;
        int n5;
        int n6;
        int n7;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        int n8;
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        this.field_20b868_DyG = true;
        boolean bl5 = false;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        boolean bl6 = true;
        int n9 = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3);
        WAR wAR = WAR.field_36e5ca4_Dne;
        wAR.method_117d19ea_FWm(983055);
        if (this.method_39bcfb28_Dne(zKP2).method_eecad346_Dne().equals("grass_top")) {
            bl6 = false;
        } else if (this.method_7a46289e_Dne()) {
            bl6 = false;
        }
        if (this.field_267d06_Qnq || zKP2.method_79d378f8_Dne(this.field_3706cf9_Dne, n, n2 - 1, n3, 0)) {
            if (this.field_2e5f16_bzF <= 0.0) {
                --n2;
            }
            this.field_2f0dd8_div = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n - 1, n2, n3);
            this.field_33448c_mrb = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3 - 1);
            this.field_29186d_XHL = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3 + 1);
            this.field_31b816_kGO = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n + 1, n2, n3);
            this.field_21260a_FWm = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n - 1, n2, n3);
            this.field_267cf2_Qnq = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2, n3 - 1);
            this.field_2d29f1_aFZ = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2, n3 + 1);
            this.field_20b854_DyG = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n + 1, n2, n3);
            bl4 = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n + 1, n2 - 1, n3)];
            bl3 = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n - 1, n2 - 1, n3)];
            bl2 = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n, n2 - 1, n3 + 1)];
            bl = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n, n2 - 1, n3 - 1)];
            if (!bl && !bl3) {
                this.field_2092ab_Dne = this.field_21260a_FWm;
                this.field_20b857_DyG = this.field_2f0dd8_div;
            } else {
                this.field_2092ab_Dne = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n - 1, n2, n3 - 1);
                this.field_20b857_DyG = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n - 1, n2, n3 - 1);
            }
            if (!bl2 && !bl3) {
                this.field_2e5f18_bzF = this.field_21260a_FWm;
                this.field_22c602_IjH = this.field_2f0dd8_div;
            } else {
                this.field_2e5f18_bzF = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n - 1, n2, n3 + 1);
                this.field_22c602_IjH = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n - 1, n2, n3 + 1);
            }
            if (!bl && !bl4) {
                this.field_388da3_zGp = this.field_20b854_DyG;
                this.field_2a9ad6_Zpi = this.field_31b816_kGO;
            } else {
                this.field_388da3_zGp = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n + 1, n2, n3 - 1);
                this.field_2a9ad6_Zpi = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n + 1, n2, n3 - 1);
            }
            if (!bl2 && !bl4) {
                this.field_2f0dd5_div = this.field_20b854_DyG;
                this.field_36b0a9_udO = this.field_31b816_kGO;
            } else {
                this.field_2f0dd5_div = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n + 1, n2, n3 + 1);
                this.field_36b0a9_udO = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n + 1, n2, n3 + 1);
            }
            if (this.field_2e5f16_bzF <= 0.0) {
                ++n2;
            }
            n8 = n9;
            if (this.field_2e5f16_bzF <= 0.0 || !this.field_3706cf9_Dne.method_e53317d5_zGp(n, n2 - 1, n3)) {
                n8 = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2 - 1, n3);
            }
            f8 = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2 - 1, n3);
            f9 = (this.field_2e5f18_bzF + this.field_21260a_FWm + this.field_2d29f1_aFZ + f8) / 4.0f;
            f12 = (this.field_2d29f1_aFZ + f8 + this.field_2f0dd5_div + this.field_20b854_DyG) / 4.0f;
            f11 = (f8 + this.field_267cf2_Qnq + this.field_20b854_DyG + this.field_388da3_zGp) / 4.0f;
            f10 = (this.field_21260a_FWm + this.field_2092ab_Dne + f8 + this.field_267cf2_Qnq) / 4.0f;
            this.field_217c26_Fnk = this.method_5972744d_Dne(this.field_22c602_IjH, this.field_2f0dd8_div, this.field_29186d_XHL, n8);
            this.field_34b601_qXo = this.method_5972744d_Dne(this.field_29186d_XHL, this.field_36b0a9_udO, this.field_31b816_kGO, n8);
            this.field_3649f9_tgc = this.method_5972744d_Dne(this.field_33448c_mrb, this.field_31b816_kGO, this.field_2a9ad6_Zpi, n8);
            this.field_307847_gnI = this.method_5972744d_Dne(this.field_2f0dd8_div, this.field_20b857_DyG, this.field_33448c_mrb, n8);
            if (bl6) {
                this.field_2569d2_OdI = this.field_3393da_oIf = f * 0.5f;
                this.field_215b33_FfS = this.field_3393da_oIf;
                this.field_212c18_EyB = this.field_3393da_oIf;
                this.field_217c23_Fnk = this.field_307844_gnI = f2 * 0.5f;
                this.field_26818c_RPx = this.field_307844_gnI;
                this.field_36e4d7_vSL = this.field_307844_gnI;
                this.field_1f1786_AgF = this.field_383100_yMz = f3 * 0.5f;
                this.field_34b5fe_qXo = this.field_383100_yMz;
                this.field_3649f6_tgc = this.field_383100_yMz;
            } else {
                this.field_3393da_oIf = 0.5f;
                this.field_2569d2_OdI = 0.5f;
                this.field_215b33_FfS = 0.5f;
                this.field_212c18_EyB = 0.5f;
                this.field_307844_gnI = 0.5f;
                this.field_217c23_Fnk = 0.5f;
                this.field_26818c_RPx = 0.5f;
                this.field_36e4d7_vSL = 0.5f;
                this.field_383100_yMz = 0.5f;
                this.field_1f1786_AgF = 0.5f;
                this.field_34b5fe_qXo = 0.5f;
                this.field_3649f6_tgc = 0.5f;
            }
            this.field_212c18_EyB *= f9;
            this.field_36e4d7_vSL *= f9;
            this.field_3649f6_tgc *= f9;
            this.field_215b33_FfS *= f10;
            this.field_26818c_RPx *= f10;
            this.field_34b5fe_qXo *= f10;
            this.field_2569d2_OdI *= f11;
            this.field_217c23_Fnk *= f11;
            this.field_1f1786_AgF *= f11;
            this.field_3393da_oIf *= f12;
            this.field_307844_gnI *= f12;
            this.field_383100_yMz *= f12;
            this.method_58bf1fba_Dne(zKP2, n, n2, n3, this.method_42ba3726_Dne(zKP2, this.field_3706cf9_Dne, n, n2, n3, 0));
            bl5 = true;
        }
        if (this.field_267d06_Qnq || zKP2.method_79d378f8_Dne(this.field_3706cf9_Dne, n, n2 + 1, n3, 1)) {
            if (this.field_267cf0_Qnq >= 1.0) {
                ++n2;
            }
            this.field_367154_trS = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n - 1, n2, n3);
            this.field_2e8486_ceE = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n + 1, n2, n3);
            this.field_1ed017_ATE = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3 - 1);
            this.field_212c1b_EyB = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3 + 1);
            this.field_334489_mrb = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n - 1, n2, n3);
            this.field_36b0a6_udO = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n + 1, n2, n3);
            this.field_2a9ad3_Zpi = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2, n3 - 1);
            this.field_342261_ooe = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2, n3 + 1);
            bl4 = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n + 1, n2 + 1, n3)];
            bl3 = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n - 1, n2 + 1, n3)];
            bl2 = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n, n2 + 1, n3 + 1)];
            bl = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n, n2 + 1, n3 - 1)];
            if (!bl && !bl3) {
                this.field_22c5ff_IjH = this.field_334489_mrb;
                this.field_342264_ooe = this.field_367154_trS;
            } else {
                this.field_22c5ff_IjH = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n - 1, n2, n3 - 1);
                this.field_342264_ooe = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n - 1, n2, n3 - 1);
            }
            if (!bl && !bl4) {
                this.field_31b813_kGO = this.field_36b0a6_udO;
                this.field_28e7fd_Vxn = this.field_2e8486_ceE;
            } else {
                this.field_31b813_kGO = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n + 1, n2, n3 - 1);
                this.field_28e7fd_Vxn = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n + 1, n2, n3 - 1);
            }
            if (!bl2 && !bl3) {
                this.field_29186a_XHL = this.field_334489_mrb;
                this.field_348572_qLR = this.field_367154_trS;
            } else {
                this.field_29186a_XHL = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n - 1, n2, n3 + 1);
                this.field_348572_qLR = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n - 1, n2, n3 + 1);
            }
            if (!bl2 && !bl4) {
                this.field_367151_trS = this.field_36b0a6_udO;
                this.field_215b36_FfS = this.field_2e8486_ceE;
            } else {
                this.field_367151_trS = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n + 1, n2, n3 + 1);
                this.field_215b36_FfS = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n + 1, n2, n3 + 1);
            }
            if (this.field_267cf0_Qnq >= 1.0) {
                --n2;
            }
            n8 = n9;
            if (this.field_267cf0_Qnq >= 1.0 || !this.field_3706cf9_Dne.method_e53317d5_zGp(n, n2 + 1, n3)) {
                n8 = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2 + 1, n3);
            }
            f8 = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2 + 1, n3);
            f12 = (this.field_29186a_XHL + this.field_334489_mrb + this.field_342261_ooe + f8) / 4.0f;
            f9 = (this.field_342261_ooe + f8 + this.field_367151_trS + this.field_36b0a6_udO) / 4.0f;
            f10 = (f8 + this.field_2a9ad3_Zpi + this.field_36b0a6_udO + this.field_31b813_kGO) / 4.0f;
            f11 = (this.field_334489_mrb + this.field_22c5ff_IjH + f8 + this.field_2a9ad3_Zpi) / 4.0f;
            this.field_34b601_qXo = this.method_5972744d_Dne(this.field_348572_qLR, this.field_367154_trS, this.field_212c1b_EyB, n8);
            this.field_217c26_Fnk = this.method_5972744d_Dne(this.field_212c1b_EyB, this.field_215b36_FfS, this.field_2e8486_ceE, n8);
            this.field_307847_gnI = this.method_5972744d_Dne(this.field_1ed017_ATE, this.field_2e8486_ceE, this.field_28e7fd_Vxn, n8);
            this.field_3649f9_tgc = this.method_5972744d_Dne(this.field_367154_trS, this.field_342264_ooe, this.field_1ed017_ATE, n8);
            this.field_2569d2_OdI = this.field_3393da_oIf = f;
            this.field_215b33_FfS = this.field_3393da_oIf;
            this.field_212c18_EyB = this.field_3393da_oIf;
            this.field_217c23_Fnk = this.field_307844_gnI = f2;
            this.field_26818c_RPx = this.field_307844_gnI;
            this.field_36e4d7_vSL = this.field_307844_gnI;
            this.field_1f1786_AgF = this.field_383100_yMz = f3;
            this.field_34b5fe_qXo = this.field_383100_yMz;
            this.field_3649f6_tgc = this.field_383100_yMz;
            this.field_212c18_EyB *= f9;
            this.field_36e4d7_vSL *= f9;
            this.field_3649f6_tgc *= f9;
            this.field_215b33_FfS *= f10;
            this.field_26818c_RPx *= f10;
            this.field_34b5fe_qXo *= f10;
            this.field_2569d2_OdI *= f11;
            this.field_217c23_Fnk *= f11;
            this.field_1f1786_AgF *= f11;
            this.field_3393da_oIf *= f12;
            this.field_307844_gnI *= f12;
            this.field_383100_yMz *= f12;
            this.method_d047827b_FWm(zKP2, n, n2, n3, this.method_42ba3726_Dne(zKP2, this.field_3706cf9_Dne, n, n2, n3, 1));
            bl5 = true;
        }
        if (this.field_267d06_Qnq || zKP2.method_79d378f8_Dne(this.field_3706cf9_Dne, n, n2, n3 - 1, 2)) {
            if (this.field_2d29ef_aFZ <= 0.0) {
                --n3;
            }
            this.field_34856f_qLR = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n - 1, n2, n3);
            this.field_267cf2_Qnq = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2 - 1, n3);
            this.field_2a9ad3_Zpi = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2 + 1, n3);
            this.field_1ed014_ATE = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n + 1, n2, n3);
            this.field_2569d5_OdI = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n - 1, n2, n3);
            this.field_33448c_mrb = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2 - 1, n3);
            this.field_1ed017_ATE = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2 + 1, n3);
            this.field_3393dd_oIf = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n + 1, n2, n3);
            bl4 = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n + 1, n2, n3 - 1)];
            bl3 = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n - 1, n2, n3 - 1)];
            bl2 = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n, n2 + 1, n3 - 1)];
            bl = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n, n2 - 1, n3 - 1)];
            if (!bl3 && !bl) {
                this.field_2092ab_Dne = this.field_34856f_qLR;
                this.field_20b857_DyG = this.field_2569d5_OdI;
            } else {
                this.field_2092ab_Dne = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n - 1, n2 - 1, n3);
                this.field_20b857_DyG = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n - 1, n2 - 1, n3);
            }
            if (!bl3 && !bl2) {
                this.field_22c5ff_IjH = this.field_34856f_qLR;
                this.field_342264_ooe = this.field_2569d5_OdI;
            } else {
                this.field_22c5ff_IjH = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n - 1, n2 + 1, n3);
                this.field_342264_ooe = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n - 1, n2 + 1, n3);
            }
            if (!bl4 && !bl) {
                this.field_388da3_zGp = this.field_1ed014_ATE;
                this.field_2a9ad6_Zpi = this.field_3393dd_oIf;
            } else {
                this.field_388da3_zGp = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n + 1, n2 - 1, n3);
                this.field_2a9ad6_Zpi = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n + 1, n2 - 1, n3);
            }
            if (!bl4 && !bl2) {
                this.field_31b813_kGO = this.field_1ed014_ATE;
                this.field_28e7fd_Vxn = this.field_3393dd_oIf;
            } else {
                this.field_31b813_kGO = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n + 1, n2 + 1, n3);
                this.field_28e7fd_Vxn = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n + 1, n2 + 1, n3);
            }
            if (this.field_2d29ef_aFZ <= 0.0) {
                ++n3;
            }
            n8 = n9;
            if (this.field_2d29ef_aFZ <= 0.0 || !this.field_3706cf9_Dne.method_e53317d5_zGp(n, n2, n3 - 1)) {
                n8 = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3 - 1);
            }
            f8 = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2, n3 - 1);
            f7 = (this.field_34856f_qLR + this.field_22c5ff_IjH + f8 + this.field_2a9ad3_Zpi) / 4.0f;
            f6 = (f8 + this.field_2a9ad3_Zpi + this.field_1ed014_ATE + this.field_31b813_kGO) / 4.0f;
            f5 = (this.field_267cf2_Qnq + f8 + this.field_388da3_zGp + this.field_1ed014_ATE) / 4.0f;
            f4 = (this.field_2092ab_Dne + this.field_34856f_qLR + this.field_267cf2_Qnq + f8) / 4.0f;
            f9 = (float)((double)f7 * this.field_267cf0_Qnq * (1.0 - this.field_2092a9_Dne) + (double)f6 * this.field_2e5f16_bzF * this.field_2092a9_Dne + (double)f5 * (1.0 - this.field_267cf0_Qnq) * this.field_2092a9_Dne + (double)f4 * (1.0 - this.field_267cf0_Qnq) * (1.0 - this.field_2092a9_Dne));
            f10 = (float)((double)f7 * this.field_267cf0_Qnq * (1.0 - this.field_212608_FWm) + (double)f6 * this.field_267cf0_Qnq * this.field_212608_FWm + (double)f5 * (1.0 - this.field_267cf0_Qnq) * this.field_212608_FWm + (double)f4 * (1.0 - this.field_267cf0_Qnq) * (1.0 - this.field_212608_FWm));
            f11 = (float)((double)f7 * this.field_2e5f16_bzF * (1.0 - this.field_212608_FWm) + (double)f6 * this.field_2e5f16_bzF * this.field_212608_FWm + (double)f5 * (1.0 - this.field_2e5f16_bzF) * this.field_212608_FWm + (double)f4 * (1.0 - this.field_2e5f16_bzF) * (1.0 - this.field_212608_FWm));
            f12 = (float)((double)f7 * this.field_2e5f16_bzF * (1.0 - this.field_2092a9_Dne) + (double)f6 * this.field_2e5f16_bzF * this.field_2092a9_Dne + (double)f5 * (1.0 - this.field_2e5f16_bzF) * this.field_2092a9_Dne + (double)f4 * (1.0 - this.field_2e5f16_bzF) * (1.0 - this.field_2092a9_Dne));
            n7 = this.method_5972744d_Dne(this.field_2569d5_OdI, this.field_342264_ooe, this.field_1ed017_ATE, n8);
            n6 = this.method_5972744d_Dne(this.field_1ed017_ATE, this.field_3393dd_oIf, this.field_28e7fd_Vxn, n8);
            n5 = this.method_5972744d_Dne(this.field_33448c_mrb, this.field_2a9ad6_Zpi, this.field_3393dd_oIf, n8);
            n4 = this.method_5972744d_Dne(this.field_20b857_DyG, this.field_2569d5_OdI, this.field_33448c_mrb, n8);
            this.field_217c26_Fnk = this.method_e541d6cd_Dne(n7, n6, n5, n4, this.field_267cf0_Qnq * (1.0 - this.field_2092a9_Dne), this.field_267cf0_Qnq * this.field_2092a9_Dne, (1.0 - this.field_267cf0_Qnq) * this.field_2092a9_Dne, (1.0 - this.field_267cf0_Qnq) * (1.0 - this.field_2092a9_Dne));
            this.field_307847_gnI = this.method_e541d6cd_Dne(n7, n6, n5, n4, this.field_267cf0_Qnq * (1.0 - this.field_212608_FWm), this.field_267cf0_Qnq * this.field_212608_FWm, (1.0 - this.field_267cf0_Qnq) * this.field_212608_FWm, (1.0 - this.field_267cf0_Qnq) * (1.0 - this.field_212608_FWm));
            this.field_3649f9_tgc = this.method_e541d6cd_Dne(n7, n6, n5, n4, this.field_2e5f16_bzF * (1.0 - this.field_212608_FWm), this.field_2e5f16_bzF * this.field_212608_FWm, (1.0 - this.field_2e5f16_bzF) * this.field_212608_FWm, (1.0 - this.field_2e5f16_bzF) * (1.0 - this.field_212608_FWm));
            this.field_34b601_qXo = this.method_e541d6cd_Dne(n7, n6, n5, n4, this.field_2e5f16_bzF * (1.0 - this.field_2092a9_Dne), this.field_2e5f16_bzF * this.field_2092a9_Dne, (1.0 - this.field_2e5f16_bzF) * this.field_2092a9_Dne, (1.0 - this.field_2e5f16_bzF) * (1.0 - this.field_2092a9_Dne));
            if (bl6) {
                this.field_2569d2_OdI = this.field_3393da_oIf = f * 0.8f;
                this.field_215b33_FfS = this.field_3393da_oIf;
                this.field_212c18_EyB = this.field_3393da_oIf;
                this.field_217c23_Fnk = this.field_307844_gnI = f2 * 0.8f;
                this.field_26818c_RPx = this.field_307844_gnI;
                this.field_36e4d7_vSL = this.field_307844_gnI;
                this.field_1f1786_AgF = this.field_383100_yMz = f3 * 0.8f;
                this.field_34b5fe_qXo = this.field_383100_yMz;
                this.field_3649f6_tgc = this.field_383100_yMz;
            } else {
                this.field_3393da_oIf = 0.8f;
                this.field_2569d2_OdI = 0.8f;
                this.field_215b33_FfS = 0.8f;
                this.field_212c18_EyB = 0.8f;
                this.field_307844_gnI = 0.8f;
                this.field_217c23_Fnk = 0.8f;
                this.field_26818c_RPx = 0.8f;
                this.field_36e4d7_vSL = 0.8f;
                this.field_383100_yMz = 0.8f;
                this.field_1f1786_AgF = 0.8f;
                this.field_34b5fe_qXo = 0.8f;
                this.field_3649f6_tgc = 0.8f;
            }
            this.field_212c18_EyB *= f9;
            this.field_36e4d7_vSL *= f9;
            this.field_3649f6_tgc *= f9;
            this.field_215b33_FfS *= f10;
            this.field_26818c_RPx *= f10;
            this.field_34b5fe_qXo *= f10;
            this.field_2569d2_OdI *= f11;
            this.field_217c23_Fnk *= f11;
            this.field_1f1786_AgF *= f11;
            this.field_3393da_oIf *= f12;
            this.field_307844_gnI *= f12;
            this.field_383100_yMz *= f12;
            gDn2 = this.method_42ba3726_Dne(zKP2, this.field_3706cf9_Dne, n, n2, n3, 2);
            this.method_e4fb4bad_bzF(zKP2, n, n2, n3, gDn2);
            if (field_2092bf_Dne && gDn2.method_eecad346_Dne().equals("grass_side") && !this.method_7a46289e_Dne()) {
                this.field_212c18_EyB *= f;
                this.field_215b33_FfS *= f;
                this.field_2569d2_OdI *= f;
                this.field_3393da_oIf *= f;
                this.field_36e4d7_vSL *= f2;
                this.field_26818c_RPx *= f2;
                this.field_217c23_Fnk *= f2;
                this.field_307844_gnI *= f2;
                this.field_3649f6_tgc *= f3;
                this.field_34b5fe_qXo *= f3;
                this.field_1f1786_AgF *= f3;
                this.field_383100_yMz *= f3;
                this.method_e4fb4bad_bzF(zKP2, n, n2, n3, ZQN.method_230f3f9a_Dne());
            }
            bl5 = true;
        }
        if (this.field_267d06_Qnq || zKP2.method_79d378f8_Dne(this.field_3706cf9_Dne, n, n2, n3 + 1, 3)) {
            if (this.field_388da1_zGp >= 1.0) {
                ++n3;
            }
            this.field_28e7fa_Vxn = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n - 1, n2, n3);
            this.field_2e8483_ceE = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n + 1, n2, n3);
            this.field_2d29f1_aFZ = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2 - 1, n3);
            this.field_342261_ooe = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2 + 1, n3);
            this.field_36e4da_vSL = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n - 1, n2, n3);
            this.field_26818f_RPx = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n + 1, n2, n3);
            this.field_29186d_XHL = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2 - 1, n3);
            this.field_212c1b_EyB = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2 + 1, n3);
            bl4 = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n + 1, n2, n3 + 1)];
            bl3 = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n - 1, n2, n3 + 1)];
            bl2 = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n, n2 + 1, n3 + 1)];
            bl = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n, n2 - 1, n3 + 1)];
            if (!bl3 && !bl) {
                this.field_2e5f18_bzF = this.field_28e7fa_Vxn;
                this.field_22c602_IjH = this.field_36e4da_vSL;
            } else {
                this.field_2e5f18_bzF = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n - 1, n2 - 1, n3);
                this.field_22c602_IjH = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n - 1, n2 - 1, n3);
            }
            if (!bl3 && !bl2) {
                this.field_29186a_XHL = this.field_28e7fa_Vxn;
                this.field_348572_qLR = this.field_36e4da_vSL;
            } else {
                this.field_29186a_XHL = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n - 1, n2 + 1, n3);
                this.field_348572_qLR = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n - 1, n2 + 1, n3);
            }
            if (!bl4 && !bl) {
                this.field_2f0dd5_div = this.field_2e8483_ceE;
                this.field_36b0a9_udO = this.field_26818f_RPx;
            } else {
                this.field_2f0dd5_div = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n + 1, n2 - 1, n3);
                this.field_36b0a9_udO = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n + 1, n2 - 1, n3);
            }
            if (!bl4 && !bl2) {
                this.field_367151_trS = this.field_2e8483_ceE;
                this.field_215b36_FfS = this.field_26818f_RPx;
            } else {
                this.field_367151_trS = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n + 1, n2 + 1, n3);
                this.field_215b36_FfS = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n + 1, n2 + 1, n3);
            }
            if (this.field_388da1_zGp >= 1.0) {
                --n3;
            }
            n8 = n9;
            if (this.field_388da1_zGp >= 1.0 || !this.field_3706cf9_Dne.method_e53317d5_zGp(n, n2, n3 + 1)) {
                n8 = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3 + 1);
            }
            f8 = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2, n3 + 1);
            f7 = (this.field_28e7fa_Vxn + this.field_29186a_XHL + f8 + this.field_342261_ooe) / 4.0f;
            f6 = (f8 + this.field_342261_ooe + this.field_2e8483_ceE + this.field_367151_trS) / 4.0f;
            f5 = (this.field_2d29f1_aFZ + f8 + this.field_2f0dd5_div + this.field_2e8483_ceE) / 4.0f;
            f4 = (this.field_2e5f18_bzF + this.field_28e7fa_Vxn + this.field_2d29f1_aFZ + f8) / 4.0f;
            f9 = (float)((double)f7 * this.field_267cf0_Qnq * (1.0 - this.field_2092a9_Dne) + (double)f6 * this.field_267cf0_Qnq * this.field_2092a9_Dne + (double)f5 * (1.0 - this.field_267cf0_Qnq) * this.field_2092a9_Dne + (double)f4 * (1.0 - this.field_267cf0_Qnq) * (1.0 - this.field_2092a9_Dne));
            f10 = (float)((double)f7 * this.field_2e5f16_bzF * (1.0 - this.field_2092a9_Dne) + (double)f6 * this.field_2e5f16_bzF * this.field_2092a9_Dne + (double)f5 * (1.0 - this.field_2e5f16_bzF) * this.field_2092a9_Dne + (double)f4 * (1.0 - this.field_2e5f16_bzF) * (1.0 - this.field_2092a9_Dne));
            f11 = (float)((double)f7 * this.field_2e5f16_bzF * (1.0 - this.field_212608_FWm) + (double)f6 * this.field_2e5f16_bzF * this.field_212608_FWm + (double)f5 * (1.0 - this.field_2e5f16_bzF) * this.field_212608_FWm + (double)f4 * (1.0 - this.field_2e5f16_bzF) * (1.0 - this.field_212608_FWm));
            f12 = (float)((double)f7 * this.field_267cf0_Qnq * (1.0 - this.field_212608_FWm) + (double)f6 * this.field_267cf0_Qnq * this.field_212608_FWm + (double)f5 * (1.0 - this.field_267cf0_Qnq) * this.field_212608_FWm + (double)f4 * (1.0 - this.field_267cf0_Qnq) * (1.0 - this.field_212608_FWm));
            n7 = this.method_5972744d_Dne(this.field_36e4da_vSL, this.field_348572_qLR, this.field_212c1b_EyB, n8);
            n6 = this.method_5972744d_Dne(this.field_212c1b_EyB, this.field_26818f_RPx, this.field_215b36_FfS, n8);
            n5 = this.method_5972744d_Dne(this.field_29186d_XHL, this.field_36b0a9_udO, this.field_26818f_RPx, n8);
            n4 = this.method_5972744d_Dne(this.field_22c602_IjH, this.field_36e4da_vSL, this.field_29186d_XHL, n8);
            this.field_217c26_Fnk = this.method_e541d6cd_Dne(n7, n4, n5, n6, this.field_267cf0_Qnq * (1.0 - this.field_2092a9_Dne), (1.0 - this.field_267cf0_Qnq) * (1.0 - this.field_2092a9_Dne), (1.0 - this.field_267cf0_Qnq) * this.field_2092a9_Dne, this.field_267cf0_Qnq * this.field_2092a9_Dne);
            this.field_307847_gnI = this.method_e541d6cd_Dne(n7, n4, n5, n6, this.field_2e5f16_bzF * (1.0 - this.field_2092a9_Dne), (1.0 - this.field_2e5f16_bzF) * (1.0 - this.field_2092a9_Dne), (1.0 - this.field_2e5f16_bzF) * this.field_2092a9_Dne, this.field_2e5f16_bzF * this.field_2092a9_Dne);
            this.field_3649f9_tgc = this.method_e541d6cd_Dne(n7, n4, n5, n6, this.field_2e5f16_bzF * (1.0 - this.field_212608_FWm), (1.0 - this.field_2e5f16_bzF) * (1.0 - this.field_212608_FWm), (1.0 - this.field_2e5f16_bzF) * this.field_212608_FWm, this.field_2e5f16_bzF * this.field_212608_FWm);
            this.field_34b601_qXo = this.method_e541d6cd_Dne(n7, n4, n5, n6, this.field_267cf0_Qnq * (1.0 - this.field_212608_FWm), (1.0 - this.field_267cf0_Qnq) * (1.0 - this.field_212608_FWm), (1.0 - this.field_267cf0_Qnq) * this.field_212608_FWm, this.field_267cf0_Qnq * this.field_212608_FWm);
            if (bl6) {
                this.field_2569d2_OdI = this.field_3393da_oIf = f * 0.8f;
                this.field_215b33_FfS = this.field_3393da_oIf;
                this.field_212c18_EyB = this.field_3393da_oIf;
                this.field_217c23_Fnk = this.field_307844_gnI = f2 * 0.8f;
                this.field_26818c_RPx = this.field_307844_gnI;
                this.field_36e4d7_vSL = this.field_307844_gnI;
                this.field_1f1786_AgF = this.field_383100_yMz = f3 * 0.8f;
                this.field_34b5fe_qXo = this.field_383100_yMz;
                this.field_3649f6_tgc = this.field_383100_yMz;
            } else {
                this.field_3393da_oIf = 0.8f;
                this.field_2569d2_OdI = 0.8f;
                this.field_215b33_FfS = 0.8f;
                this.field_212c18_EyB = 0.8f;
                this.field_307844_gnI = 0.8f;
                this.field_217c23_Fnk = 0.8f;
                this.field_26818c_RPx = 0.8f;
                this.field_36e4d7_vSL = 0.8f;
                this.field_383100_yMz = 0.8f;
                this.field_1f1786_AgF = 0.8f;
                this.field_34b5fe_qXo = 0.8f;
                this.field_3649f6_tgc = 0.8f;
            }
            this.field_212c18_EyB *= f9;
            this.field_36e4d7_vSL *= f9;
            this.field_3649f6_tgc *= f9;
            this.field_215b33_FfS *= f10;
            this.field_26818c_RPx *= f10;
            this.field_34b5fe_qXo *= f10;
            this.field_2569d2_OdI *= f11;
            this.field_217c23_Fnk *= f11;
            this.field_1f1786_AgF *= f11;
            this.field_3393da_oIf *= f12;
            this.field_307844_gnI *= f12;
            this.field_383100_yMz *= f12;
            gDn2 = this.method_42ba3726_Dne(zKP2, this.field_3706cf9_Dne, n, n2, n3, 3);
            this.method_925c7e93_Qnq(zKP2, n, n2, n3, this.method_42ba3726_Dne(zKP2, this.field_3706cf9_Dne, n, n2, n3, 3));
            if (field_2092bf_Dne && gDn2.method_eecad346_Dne().equals("grass_side") && !this.method_7a46289e_Dne()) {
                this.field_212c18_EyB *= f;
                this.field_215b33_FfS *= f;
                this.field_2569d2_OdI *= f;
                this.field_3393da_oIf *= f;
                this.field_36e4d7_vSL *= f2;
                this.field_26818c_RPx *= f2;
                this.field_217c23_Fnk *= f2;
                this.field_307844_gnI *= f2;
                this.field_3649f6_tgc *= f3;
                this.field_34b5fe_qXo *= f3;
                this.field_1f1786_AgF *= f3;
                this.field_383100_yMz *= f3;
                this.method_925c7e93_Qnq(zKP2, n, n2, n3, ZQN.method_230f3f9a_Dne());
            }
            bl5 = true;
        }
        if (this.field_267d06_Qnq || zKP2.method_79d378f8_Dne(this.field_3706cf9_Dne, n - 1, n2, n3, 4)) {
            if (this.field_2092a9_Dne <= 0.0) {
                --n;
            }
            this.field_21260a_FWm = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2 - 1, n3);
            this.field_34856f_qLR = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2, n3 - 1);
            this.field_28e7fa_Vxn = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2, n3 + 1);
            this.field_334489_mrb = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2 + 1, n3);
            this.field_2f0dd8_div = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2 - 1, n3);
            this.field_2569d5_OdI = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3 - 1);
            this.field_36e4da_vSL = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3 + 1);
            this.field_367154_trS = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2 + 1, n3);
            bl4 = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n - 1, n2 + 1, n3)];
            bl3 = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n - 1, n2 - 1, n3)];
            bl2 = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n - 1, n2, n3 - 1)];
            bl = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n - 1, n2, n3 + 1)];
            if (!bl2 && !bl3) {
                this.field_2092ab_Dne = this.field_34856f_qLR;
                this.field_20b857_DyG = this.field_2569d5_OdI;
            } else {
                this.field_2092ab_Dne = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2 - 1, n3 - 1);
                this.field_20b857_DyG = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2 - 1, n3 - 1);
            }
            if (!bl && !bl3) {
                this.field_2e5f18_bzF = this.field_28e7fa_Vxn;
                this.field_22c602_IjH = this.field_36e4da_vSL;
            } else {
                this.field_2e5f18_bzF = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2 - 1, n3 + 1);
                this.field_22c602_IjH = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2 - 1, n3 + 1);
            }
            if (!bl2 && !bl4) {
                this.field_22c5ff_IjH = this.field_34856f_qLR;
                this.field_342264_ooe = this.field_2569d5_OdI;
            } else {
                this.field_22c5ff_IjH = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2 + 1, n3 - 1);
                this.field_342264_ooe = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2 + 1, n3 - 1);
            }
            if (!bl && !bl4) {
                this.field_29186a_XHL = this.field_28e7fa_Vxn;
                this.field_348572_qLR = this.field_36e4da_vSL;
            } else {
                this.field_29186a_XHL = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2 + 1, n3 + 1);
                this.field_348572_qLR = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2 + 1, n3 + 1);
            }
            if (this.field_2092a9_Dne <= 0.0) {
                ++n;
            }
            n8 = n9;
            if (this.field_2092a9_Dne <= 0.0 || !this.field_3706cf9_Dne.method_e53317d5_zGp(n - 1, n2, n3)) {
                n8 = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n - 1, n2, n3);
            }
            f8 = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n - 1, n2, n3);
            f7 = (this.field_21260a_FWm + this.field_2e5f18_bzF + f8 + this.field_28e7fa_Vxn) / 4.0f;
            f6 = (f8 + this.field_28e7fa_Vxn + this.field_334489_mrb + this.field_29186a_XHL) / 4.0f;
            f5 = (this.field_34856f_qLR + f8 + this.field_22c5ff_IjH + this.field_334489_mrb) / 4.0f;
            f4 = (this.field_2092ab_Dne + this.field_21260a_FWm + this.field_34856f_qLR + f8) / 4.0f;
            f9 = (float)((double)f6 * this.field_267cf0_Qnq * this.field_388da1_zGp + (double)f5 * this.field_267cf0_Qnq * (1.0 - this.field_388da1_zGp) + (double)f4 * (1.0 - this.field_267cf0_Qnq) * (1.0 - this.field_388da1_zGp) + (double)f7 * (1.0 - this.field_267cf0_Qnq) * this.field_388da1_zGp);
            f10 = (float)((double)f6 * this.field_267cf0_Qnq * this.field_2d29ef_aFZ + (double)f5 * this.field_267cf0_Qnq * (1.0 - this.field_2d29ef_aFZ) + (double)f4 * (1.0 - this.field_267cf0_Qnq) * (1.0 - this.field_2d29ef_aFZ) + (double)f7 * (1.0 - this.field_267cf0_Qnq) * this.field_2d29ef_aFZ);
            f11 = (float)((double)f6 * this.field_2e5f16_bzF * this.field_2d29ef_aFZ + (double)f5 * this.field_2e5f16_bzF * (1.0 - this.field_2d29ef_aFZ) + (double)f4 * (1.0 - this.field_2e5f16_bzF) * (1.0 - this.field_2d29ef_aFZ) + (double)f7 * (1.0 - this.field_2e5f16_bzF) * this.field_2d29ef_aFZ);
            f12 = (float)((double)f6 * this.field_2e5f16_bzF * this.field_388da1_zGp + (double)f5 * this.field_2e5f16_bzF * (1.0 - this.field_388da1_zGp) + (double)f4 * (1.0 - this.field_2e5f16_bzF) * (1.0 - this.field_388da1_zGp) + (double)f7 * (1.0 - this.field_2e5f16_bzF) * this.field_388da1_zGp);
            n7 = this.method_5972744d_Dne(this.field_2f0dd8_div, this.field_22c602_IjH, this.field_36e4da_vSL, n8);
            n6 = this.method_5972744d_Dne(this.field_36e4da_vSL, this.field_367154_trS, this.field_348572_qLR, n8);
            n5 = this.method_5972744d_Dne(this.field_2569d5_OdI, this.field_342264_ooe, this.field_367154_trS, n8);
            n4 = this.method_5972744d_Dne(this.field_20b857_DyG, this.field_2f0dd8_div, this.field_2569d5_OdI, n8);
            this.field_217c26_Fnk = this.method_e541d6cd_Dne(n6, n5, n4, n7, this.field_267cf0_Qnq * this.field_388da1_zGp, this.field_267cf0_Qnq * (1.0 - this.field_388da1_zGp), (1.0 - this.field_267cf0_Qnq) * (1.0 - this.field_388da1_zGp), (1.0 - this.field_267cf0_Qnq) * this.field_388da1_zGp);
            this.field_307847_gnI = this.method_e541d6cd_Dne(n6, n5, n4, n7, this.field_267cf0_Qnq * this.field_2d29ef_aFZ, this.field_267cf0_Qnq * (1.0 - this.field_2d29ef_aFZ), (1.0 - this.field_267cf0_Qnq) * (1.0 - this.field_2d29ef_aFZ), (1.0 - this.field_267cf0_Qnq) * this.field_2d29ef_aFZ);
            this.field_3649f9_tgc = this.method_e541d6cd_Dne(n6, n5, n4, n7, this.field_2e5f16_bzF * this.field_2d29ef_aFZ, this.field_2e5f16_bzF * (1.0 - this.field_2d29ef_aFZ), (1.0 - this.field_2e5f16_bzF) * (1.0 - this.field_2d29ef_aFZ), (1.0 - this.field_2e5f16_bzF) * this.field_2d29ef_aFZ);
            this.field_34b601_qXo = this.method_e541d6cd_Dne(n6, n5, n4, n7, this.field_2e5f16_bzF * this.field_388da1_zGp, this.field_2e5f16_bzF * (1.0 - this.field_388da1_zGp), (1.0 - this.field_2e5f16_bzF) * (1.0 - this.field_388da1_zGp), (1.0 - this.field_2e5f16_bzF) * this.field_388da1_zGp);
            if (bl6) {
                this.field_2569d2_OdI = this.field_3393da_oIf = f * 0.6f;
                this.field_215b33_FfS = this.field_3393da_oIf;
                this.field_212c18_EyB = this.field_3393da_oIf;
                this.field_217c23_Fnk = this.field_307844_gnI = f2 * 0.6f;
                this.field_26818c_RPx = this.field_307844_gnI;
                this.field_36e4d7_vSL = this.field_307844_gnI;
                this.field_1f1786_AgF = this.field_383100_yMz = f3 * 0.6f;
                this.field_34b5fe_qXo = this.field_383100_yMz;
                this.field_3649f6_tgc = this.field_383100_yMz;
            } else {
                this.field_3393da_oIf = 0.6f;
                this.field_2569d2_OdI = 0.6f;
                this.field_215b33_FfS = 0.6f;
                this.field_212c18_EyB = 0.6f;
                this.field_307844_gnI = 0.6f;
                this.field_217c23_Fnk = 0.6f;
                this.field_26818c_RPx = 0.6f;
                this.field_36e4d7_vSL = 0.6f;
                this.field_383100_yMz = 0.6f;
                this.field_1f1786_AgF = 0.6f;
                this.field_34b5fe_qXo = 0.6f;
                this.field_3649f6_tgc = 0.6f;
            }
            this.field_212c18_EyB *= f9;
            this.field_36e4d7_vSL *= f9;
            this.field_3649f6_tgc *= f9;
            this.field_215b33_FfS *= f10;
            this.field_26818c_RPx *= f10;
            this.field_34b5fe_qXo *= f10;
            this.field_2569d2_OdI *= f11;
            this.field_217c23_Fnk *= f11;
            this.field_1f1786_AgF *= f11;
            this.field_3393da_oIf *= f12;
            this.field_307844_gnI *= f12;
            this.field_383100_yMz *= f12;
            gDn2 = this.method_42ba3726_Dne(zKP2, this.field_3706cf9_Dne, n, n2, n3, 4);
            this.method_76f453b4_aFZ(zKP2, n, n2, n3, gDn2);
            if (field_2092bf_Dne && gDn2.method_eecad346_Dne().equals("grass_side") && !this.method_7a46289e_Dne()) {
                this.field_212c18_EyB *= f;
                this.field_215b33_FfS *= f;
                this.field_2569d2_OdI *= f;
                this.field_3393da_oIf *= f;
                this.field_36e4d7_vSL *= f2;
                this.field_26818c_RPx *= f2;
                this.field_217c23_Fnk *= f2;
                this.field_307844_gnI *= f2;
                this.field_3649f6_tgc *= f3;
                this.field_34b5fe_qXo *= f3;
                this.field_1f1786_AgF *= f3;
                this.field_383100_yMz *= f3;
                this.method_76f453b4_aFZ(zKP2, n, n2, n3, ZQN.method_230f3f9a_Dne());
            }
            bl5 = true;
        }
        if (this.field_267d06_Qnq || zKP2.method_79d378f8_Dne(this.field_3706cf9_Dne, n + 1, n2, n3, 5)) {
            if (this.field_212608_FWm >= 1.0) {
                ++n;
            }
            this.field_20b854_DyG = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2 - 1, n3);
            this.field_1ed014_ATE = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2, n3 - 1);
            this.field_2e8483_ceE = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2, n3 + 1);
            this.field_36b0a6_udO = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2 + 1, n3);
            this.field_31b816_kGO = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2 - 1, n3);
            this.field_3393dd_oIf = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3 - 1);
            this.field_26818f_RPx = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3 + 1);
            this.field_2e8486_ceE = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2 + 1, n3);
            bl4 = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n + 1, n2 + 1, n3)];
            bl3 = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n + 1, n2 - 1, n3)];
            bl2 = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n + 1, n2, n3 + 1)];
            bl = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n + 1, n2, n3 - 1)];
            if (!bl3 && !bl) {
                this.field_388da3_zGp = this.field_1ed014_ATE;
                this.field_2a9ad6_Zpi = this.field_3393dd_oIf;
            } else {
                this.field_388da3_zGp = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2 - 1, n3 - 1);
                this.field_2a9ad6_Zpi = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2 - 1, n3 - 1);
            }
            if (!bl3 && !bl2) {
                this.field_2f0dd5_div = this.field_2e8483_ceE;
                this.field_36b0a9_udO = this.field_26818f_RPx;
            } else {
                this.field_2f0dd5_div = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2 - 1, n3 + 1);
                this.field_36b0a9_udO = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2 - 1, n3 + 1);
            }
            if (!bl4 && !bl) {
                this.field_31b813_kGO = this.field_1ed014_ATE;
                this.field_28e7fd_Vxn = this.field_3393dd_oIf;
            } else {
                this.field_31b813_kGO = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2 + 1, n3 - 1);
                this.field_28e7fd_Vxn = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2 + 1, n3 - 1);
            }
            if (!bl4 && !bl2) {
                this.field_367151_trS = this.field_2e8483_ceE;
                this.field_215b36_FfS = this.field_26818f_RPx;
            } else {
                this.field_367151_trS = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2 + 1, n3 + 1);
                this.field_215b36_FfS = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2 + 1, n3 + 1);
            }
            if (this.field_212608_FWm >= 1.0) {
                --n;
            }
            n8 = n9;
            if (this.field_212608_FWm >= 1.0 || !this.field_3706cf9_Dne.method_e53317d5_zGp(n + 1, n2, n3)) {
                n8 = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n + 1, n2, n3);
            }
            f8 = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n + 1, n2, n3);
            f7 = (this.field_20b854_DyG + this.field_2f0dd5_div + f8 + this.field_2e8483_ceE) / 4.0f;
            f6 = (this.field_388da3_zGp + this.field_20b854_DyG + this.field_1ed014_ATE + f8) / 4.0f;
            f5 = (this.field_1ed014_ATE + f8 + this.field_31b813_kGO + this.field_36b0a6_udO) / 4.0f;
            f4 = (f8 + this.field_2e8483_ceE + this.field_36b0a6_udO + this.field_367151_trS) / 4.0f;
            f9 = (float)((double)f7 * (1.0 - this.field_2e5f16_bzF) * this.field_388da1_zGp + (double)f6 * (1.0 - this.field_2e5f16_bzF) * (1.0 - this.field_388da1_zGp) + (double)f5 * this.field_2e5f16_bzF * (1.0 - this.field_388da1_zGp) + (double)f4 * this.field_2e5f16_bzF * this.field_388da1_zGp);
            f10 = (float)((double)f7 * (1.0 - this.field_2e5f16_bzF) * this.field_2d29ef_aFZ + (double)f6 * (1.0 - this.field_2e5f16_bzF) * (1.0 - this.field_2d29ef_aFZ) + (double)f5 * this.field_2e5f16_bzF * (1.0 - this.field_2d29ef_aFZ) + (double)f4 * this.field_2e5f16_bzF * this.field_2d29ef_aFZ);
            f11 = (float)((double)f7 * (1.0 - this.field_267cf0_Qnq) * this.field_2d29ef_aFZ + (double)f6 * (1.0 - this.field_267cf0_Qnq) * (1.0 - this.field_2d29ef_aFZ) + (double)f5 * this.field_267cf0_Qnq * (1.0 - this.field_2d29ef_aFZ) + (double)f4 * this.field_267cf0_Qnq * this.field_2d29ef_aFZ);
            f12 = (float)((double)f7 * (1.0 - this.field_267cf0_Qnq) * this.field_388da1_zGp + (double)f6 * (1.0 - this.field_267cf0_Qnq) * (1.0 - this.field_388da1_zGp) + (double)f5 * this.field_267cf0_Qnq * (1.0 - this.field_388da1_zGp) + (double)f4 * this.field_267cf0_Qnq * this.field_388da1_zGp);
            n7 = this.method_5972744d_Dne(this.field_31b816_kGO, this.field_36b0a9_udO, this.field_26818f_RPx, n8);
            n6 = this.method_5972744d_Dne(this.field_26818f_RPx, this.field_2e8486_ceE, this.field_215b36_FfS, n8);
            n5 = this.method_5972744d_Dne(this.field_3393dd_oIf, this.field_28e7fd_Vxn, this.field_2e8486_ceE, n8);
            n4 = this.method_5972744d_Dne(this.field_2a9ad6_Zpi, this.field_31b816_kGO, this.field_3393dd_oIf, n8);
            this.field_217c26_Fnk = this.method_e541d6cd_Dne(n7, n4, n5, n6, (1.0 - this.field_2e5f16_bzF) * this.field_388da1_zGp, (1.0 - this.field_2e5f16_bzF) * (1.0 - this.field_388da1_zGp), this.field_2e5f16_bzF * (1.0 - this.field_388da1_zGp), this.field_2e5f16_bzF * this.field_388da1_zGp);
            this.field_307847_gnI = this.method_e541d6cd_Dne(n7, n4, n5, n6, (1.0 - this.field_2e5f16_bzF) * this.field_2d29ef_aFZ, (1.0 - this.field_2e5f16_bzF) * (1.0 - this.field_2d29ef_aFZ), this.field_2e5f16_bzF * (1.0 - this.field_2d29ef_aFZ), this.field_2e5f16_bzF * this.field_2d29ef_aFZ);
            this.field_3649f9_tgc = this.method_e541d6cd_Dne(n7, n4, n5, n6, (1.0 - this.field_267cf0_Qnq) * this.field_2d29ef_aFZ, (1.0 - this.field_267cf0_Qnq) * (1.0 - this.field_2d29ef_aFZ), this.field_267cf0_Qnq * (1.0 - this.field_2d29ef_aFZ), this.field_267cf0_Qnq * this.field_2d29ef_aFZ);
            this.field_34b601_qXo = this.method_e541d6cd_Dne(n7, n4, n5, n6, (1.0 - this.field_267cf0_Qnq) * this.field_388da1_zGp, (1.0 - this.field_267cf0_Qnq) * (1.0 - this.field_388da1_zGp), this.field_267cf0_Qnq * (1.0 - this.field_388da1_zGp), this.field_267cf0_Qnq * this.field_388da1_zGp);
            if (bl6) {
                this.field_2569d2_OdI = this.field_3393da_oIf = f * 0.6f;
                this.field_215b33_FfS = this.field_3393da_oIf;
                this.field_212c18_EyB = this.field_3393da_oIf;
                this.field_217c23_Fnk = this.field_307844_gnI = f2 * 0.6f;
                this.field_26818c_RPx = this.field_307844_gnI;
                this.field_36e4d7_vSL = this.field_307844_gnI;
                this.field_1f1786_AgF = this.field_383100_yMz = f3 * 0.6f;
                this.field_34b5fe_qXo = this.field_383100_yMz;
                this.field_3649f6_tgc = this.field_383100_yMz;
            } else {
                this.field_3393da_oIf = 0.6f;
                this.field_2569d2_OdI = 0.6f;
                this.field_215b33_FfS = 0.6f;
                this.field_212c18_EyB = 0.6f;
                this.field_307844_gnI = 0.6f;
                this.field_217c23_Fnk = 0.6f;
                this.field_26818c_RPx = 0.6f;
                this.field_36e4d7_vSL = 0.6f;
                this.field_383100_yMz = 0.6f;
                this.field_1f1786_AgF = 0.6f;
                this.field_34b5fe_qXo = 0.6f;
                this.field_3649f6_tgc = 0.6f;
            }
            this.field_212c18_EyB *= f9;
            this.field_36e4d7_vSL *= f9;
            this.field_3649f6_tgc *= f9;
            this.field_215b33_FfS *= f10;
            this.field_26818c_RPx *= f10;
            this.field_34b5fe_qXo *= f10;
            this.field_2569d2_OdI *= f11;
            this.field_217c23_Fnk *= f11;
            this.field_1f1786_AgF *= f11;
            this.field_3393da_oIf *= f12;
            this.field_307844_gnI *= f12;
            this.field_383100_yMz *= f12;
            gDn2 = this.method_42ba3726_Dne(zKP2, this.field_3706cf9_Dne, n, n2, n3, 5);
            this.method_3fc2d5c2_zGp(zKP2, n, n2, n3, gDn2);
            if (field_2092bf_Dne && gDn2.method_eecad346_Dne().equals("grass_side") && !this.method_7a46289e_Dne()) {
                this.field_212c18_EyB *= f;
                this.field_215b33_FfS *= f;
                this.field_2569d2_OdI *= f;
                this.field_3393da_oIf *= f;
                this.field_36e4d7_vSL *= f2;
                this.field_26818c_RPx *= f2;
                this.field_217c23_Fnk *= f2;
                this.field_307844_gnI *= f2;
                this.field_3649f6_tgc *= f3;
                this.field_34b5fe_qXo *= f3;
                this.field_1f1786_AgF *= f3;
                this.field_383100_yMz *= f3;
                this.method_3fc2d5c2_zGp(zKP2, n, n2, n3, ZQN.method_230f3f9a_Dne());
            }
            bl5 = true;
        }
        this.field_20b868_DyG = false;
        return bl5;
    }

    public void method_23d00645_Dne(zKP zKP2, int n, float f) {
        float f2;
        float f3;
        float f4;
        int n2;
        boolean bl;
        WAR wAR = WAR.field_36e5ca4_Dne;
        boolean bl2 = bl = zKP2.field_21260d_FWm == zKP.field_36ff555_Dne.field_21260d_FWm;
        if (zKP2 == zKP.field_71ad80bc_Vxn || zKP2 == zKP.field_c4889ac3_yHt || zKP2 == zKP.field_cba1f2f1_haP) {
            n = 3;
        }
        if (this.field_21261e_FWm) {
            n2 = zKP2.method_117d19dd_FWm(n);
            if (bl) {
                n2 = 0xFFFFFF;
            }
            f4 = (float)(n2 >> 16 & 0xFF) / 255.0f;
            f3 = (float)(n2 >> 8 & 0xFF) / 255.0f;
            f2 = (float)(n2 & 0xFF) / 255.0f;
            GL11.glColor4f(f4 * f, f3 * f, f2 * f, 1.0f);
        }
        n2 = zKP2.method_7a46288d_Dne();
        this.method_c74bdb28_Dne(zKP2);
        if (n2 != 0 && n2 != 31 && n2 != 39 && n2 != 16 && n2 != 26) {
            if (n2 == 1) {
                wAR.method_7a46289a_Dne();
                wAR.method_a680f8e7_FWm(0.0f, -1.0f, 0.0f);
                this.method_8b153e5d_Dne(zKP2, n, -0.5, -0.5, -0.5, 1.0f);
                wAR.method_7a46288d_Dne();
            } else if (n2 == 19) {
                wAR.method_7a46289a_Dne();
                wAR.method_a680f8e7_FWm(0.0f, -1.0f, 0.0f);
                zKP2.method_7a46289a_Dne();
                this.method_8b1536db_Dne(zKP2, n, this.field_267cf0_Qnq, -0.5, -0.5, -0.5);
                wAR.method_7a46288d_Dne();
            } else if (n2 == 23) {
                wAR.method_7a46289a_Dne();
                wAR.method_a680f8e7_FWm(0.0f, -1.0f, 0.0f);
                zKP2.method_7a46289a_Dne();
                wAR.method_7a46288d_Dne();
            } else if (n2 == 13) {
                zKP2.method_7a46289a_Dne();
                GL11.glTranslatef(-0.5f, -0.5f, -0.5f);
                f4 = 0.0625f;
                wAR.method_7a46289a_Dne();
                wAR.method_a680f8e7_FWm(0.0f, -1.0f, 0.0f);
                this.method_58bf1fba_Dne(zKP2, 0.0, 0.0, 0.0, this.method_5d830b5b_Dne(zKP2, 0));
                wAR.method_7a46288d_Dne();
                wAR.method_7a46289a_Dne();
                wAR.method_a680f8e7_FWm(0.0f, 1.0f, 0.0f);
                this.method_d047827b_FWm(zKP2, 0.0, 0.0, 0.0, this.method_5d830b5b_Dne(zKP2, 1));
                wAR.method_7a46288d_Dne();
                wAR.method_7a46289a_Dne();
                wAR.method_a680f8e7_FWm(0.0f, 0.0f, -1.0f);
                wAR.method_2b33899_bzF(0.0f, 0.0f, f4);
                this.method_e4fb4bad_bzF(zKP2, 0.0, 0.0, 0.0, this.method_5d830b5b_Dne(zKP2, 2));
                wAR.method_2b33899_bzF(0.0f, 0.0f, -f4);
                wAR.method_7a46288d_Dne();
                wAR.method_7a46289a_Dne();
                wAR.method_a680f8e7_FWm(0.0f, 0.0f, 1.0f);
                wAR.method_2b33899_bzF(0.0f, 0.0f, -f4);
                this.method_925c7e93_Qnq(zKP2, 0.0, 0.0, 0.0, this.method_5d830b5b_Dne(zKP2, 3));
                wAR.method_2b33899_bzF(0.0f, 0.0f, f4);
                wAR.method_7a46288d_Dne();
                wAR.method_7a46289a_Dne();
                wAR.method_a680f8e7_FWm(-1.0f, 0.0f, 0.0f);
                wAR.method_2b33899_bzF(f4, 0.0f, 0.0f);
                this.method_76f453b4_aFZ(zKP2, 0.0, 0.0, 0.0, this.method_5d830b5b_Dne(zKP2, 4));
                wAR.method_2b33899_bzF(-f4, 0.0f, 0.0f);
                wAR.method_7a46288d_Dne();
                wAR.method_7a46289a_Dne();
                wAR.method_a680f8e7_FWm(1.0f, 0.0f, 0.0f);
                wAR.method_2b33899_bzF(-f4, 0.0f, 0.0f);
                this.method_3fc2d5c2_zGp(zKP2, 0.0, 0.0, 0.0, this.method_5d830b5b_Dne(zKP2, 5));
                wAR.method_2b33899_bzF(f4, 0.0f, 0.0f);
                wAR.method_7a46288d_Dne();
                GL11.glTranslatef(0.5f, 0.5f, 0.5f);
            } else if (n2 == 22) {
                GL11.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
                GL11.glTranslatef(-0.5f, -0.5f, -0.5f);
                yrf.field_37e8b9f_Dne.method_23d00645_Dne(zKP2, n, f);
                GL11.glEnable(32826);
            } else if (n2 == 6) {
                wAR.method_7a46289a_Dne();
                wAR.method_a680f8e7_FWm(0.0f, -1.0f, 0.0f);
                this.method_6fd761c3_Dne(zKP2, n, -0.5, -0.5, -0.5);
                wAR.method_7a46288d_Dne();
            } else if (n2 == 2) {
                wAR.method_7a46289a_Dne();
                wAR.method_a680f8e7_FWm(0.0f, -1.0f, 0.0f);
                this.method_d02c372d_Dne(zKP2, -0.5, -0.5, -0.5, 0.0, 0.0, 0);
                wAR.method_7a46288d_Dne();
            } else if (n2 == 10) {
                for (int i = 0; i < 2; ++i) {
                    if (i == 0) {
                        this.method_adff145a_Dne(0.0, 0.0, 0.0, 1.0, 1.0, 0.5);
                    }
                    if (i == 1) {
                        this.method_adff145a_Dne(0.0, 0.0, 0.5, 1.0, 0.5, 1.0);
                    }
                    GL11.glTranslatef(-0.5f, -0.5f, -0.5f);
                    wAR.method_7a46289a_Dne();
                    wAR.method_a680f8e7_FWm(0.0f, -1.0f, 0.0f);
                    this.method_58bf1fba_Dne(zKP2, 0.0, 0.0, 0.0, this.method_5d830b5b_Dne(zKP2, 0));
                    wAR.method_7a46288d_Dne();
                    wAR.method_7a46289a_Dne();
                    wAR.method_a680f8e7_FWm(0.0f, 1.0f, 0.0f);
                    this.method_d047827b_FWm(zKP2, 0.0, 0.0, 0.0, this.method_5d830b5b_Dne(zKP2, 1));
                    wAR.method_7a46288d_Dne();
                    wAR.method_7a46289a_Dne();
                    wAR.method_a680f8e7_FWm(0.0f, 0.0f, -1.0f);
                    this.method_e4fb4bad_bzF(zKP2, 0.0, 0.0, 0.0, this.method_5d830b5b_Dne(zKP2, 2));
                    wAR.method_7a46288d_Dne();
                    wAR.method_7a46289a_Dne();
                    wAR.method_a680f8e7_FWm(0.0f, 0.0f, 1.0f);
                    this.method_925c7e93_Qnq(zKP2, 0.0, 0.0, 0.0, this.method_5d830b5b_Dne(zKP2, 3));
                    wAR.method_7a46288d_Dne();
                    wAR.method_7a46289a_Dne();
                    wAR.method_a680f8e7_FWm(-1.0f, 0.0f, 0.0f);
                    this.method_76f453b4_aFZ(zKP2, 0.0, 0.0, 0.0, this.method_5d830b5b_Dne(zKP2, 4));
                    wAR.method_7a46288d_Dne();
                    wAR.method_7a46289a_Dne();
                    wAR.method_a680f8e7_FWm(1.0f, 0.0f, 0.0f);
                    this.method_3fc2d5c2_zGp(zKP2, 0.0, 0.0, 0.0, this.method_5d830b5b_Dne(zKP2, 5));
                    wAR.method_7a46288d_Dne();
                    GL11.glTranslatef(0.5f, 0.5f, 0.5f);
                }
            } else if (n2 == 27) {
                int n3 = 0;
                GL11.glTranslatef(-0.5f, -0.5f, -0.5f);
                wAR.method_7a46289a_Dne();
                for (int i = 0; i < 8; ++i) {
                    int n4 = 0;
                    int n5 = 1;
                    if (i == 0) {
                        n4 = 2;
                    }
                    if (i == 1) {
                        n4 = 3;
                    }
                    if (i == 2) {
                        n4 = 4;
                    }
                    if (i == 3) {
                        n4 = 5;
                        n5 = 2;
                    }
                    if (i == 4) {
                        n4 = 6;
                        n5 = 3;
                    }
                    if (i == 5) {
                        n4 = 7;
                        n5 = 5;
                    }
                    if (i == 6) {
                        n4 = 6;
                        n5 = 2;
                    }
                    if (i == 7) {
                        n4 = 3;
                    }
                    float f5 = (float)n4 / 16.0f;
                    float f6 = 1.0f - (float)n3 / 16.0f;
                    float f7 = 1.0f - (float)(n3 + n5) / 16.0f;
                    n3 += n5;
                    this.method_adff145a_Dne(0.5f - f5, f7, 0.5f - f5, 0.5f + f5, f6, 0.5f + f5);
                    wAR.method_a680f8e7_FWm(0.0f, -1.0f, 0.0f);
                    this.method_58bf1fba_Dne(zKP2, 0.0, 0.0, 0.0, this.method_5d830b5b_Dne(zKP2, 0));
                    wAR.method_a680f8e7_FWm(0.0f, 1.0f, 0.0f);
                    this.method_d047827b_FWm(zKP2, 0.0, 0.0, 0.0, this.method_5d830b5b_Dne(zKP2, 1));
                    wAR.method_a680f8e7_FWm(0.0f, 0.0f, -1.0f);
                    this.method_e4fb4bad_bzF(zKP2, 0.0, 0.0, 0.0, this.method_5d830b5b_Dne(zKP2, 2));
                    wAR.method_a680f8e7_FWm(0.0f, 0.0f, 1.0f);
                    this.method_925c7e93_Qnq(zKP2, 0.0, 0.0, 0.0, this.method_5d830b5b_Dne(zKP2, 3));
                    wAR.method_a680f8e7_FWm(-1.0f, 0.0f, 0.0f);
                    this.method_76f453b4_aFZ(zKP2, 0.0, 0.0, 0.0, this.method_5d830b5b_Dne(zKP2, 4));
                    wAR.method_a680f8e7_FWm(1.0f, 0.0f, 0.0f);
                    this.method_3fc2d5c2_zGp(zKP2, 0.0, 0.0, 0.0, this.method_5d830b5b_Dne(zKP2, 5));
                }
                wAR.method_7a46288d_Dne();
                GL11.glTranslatef(0.5f, 0.5f, 0.5f);
                this.method_adff145a_Dne(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
            } else if (n2 == 11) {
                for (int i = 0; i < 4; ++i) {
                    f3 = 0.125f;
                    if (i == 0) {
                        this.method_adff145a_Dne(0.5f - f3, 0.0, 0.0, 0.5f + f3, 1.0, f3 * 2.0f);
                    }
                    if (i == 1) {
                        this.method_adff145a_Dne(0.5f - f3, 0.0, 1.0f - f3 * 2.0f, 0.5f + f3, 1.0, 1.0);
                    }
                    f3 = 0.0625f;
                    if (i == 2) {
                        this.method_adff145a_Dne(0.5f - f3, 1.0f - f3 * 3.0f, -f3 * 2.0f, 0.5f + f3, 1.0f - f3, 1.0f + f3 * 2.0f);
                    }
                    if (i == 3) {
                        this.method_adff145a_Dne(0.5f - f3, 0.5f - f3 * 3.0f, -f3 * 2.0f, 0.5f + f3, 0.5f - f3, 1.0f + f3 * 2.0f);
                    }
                    GL11.glTranslatef(-0.5f, -0.5f, -0.5f);
                    wAR.method_7a46289a_Dne();
                    wAR.method_a680f8e7_FWm(0.0f, -1.0f, 0.0f);
                    this.method_58bf1fba_Dne(zKP2, 0.0, 0.0, 0.0, this.method_5d830b5b_Dne(zKP2, 0));
                    wAR.method_7a46288d_Dne();
                    wAR.method_7a46289a_Dne();
                    wAR.method_a680f8e7_FWm(0.0f, 1.0f, 0.0f);
                    this.method_d047827b_FWm(zKP2, 0.0, 0.0, 0.0, this.method_5d830b5b_Dne(zKP2, 1));
                    wAR.method_7a46288d_Dne();
                    wAR.method_7a46289a_Dne();
                    wAR.method_a680f8e7_FWm(0.0f, 0.0f, -1.0f);
                    this.method_e4fb4bad_bzF(zKP2, 0.0, 0.0, 0.0, this.method_5d830b5b_Dne(zKP2, 2));
                    wAR.method_7a46288d_Dne();
                    wAR.method_7a46289a_Dne();
                    wAR.method_a680f8e7_FWm(0.0f, 0.0f, 1.0f);
                    this.method_925c7e93_Qnq(zKP2, 0.0, 0.0, 0.0, this.method_5d830b5b_Dne(zKP2, 3));
                    wAR.method_7a46288d_Dne();
                    wAR.method_7a46289a_Dne();
                    wAR.method_a680f8e7_FWm(-1.0f, 0.0f, 0.0f);
                    this.method_76f453b4_aFZ(zKP2, 0.0, 0.0, 0.0, this.method_5d830b5b_Dne(zKP2, 4));
                    wAR.method_7a46288d_Dne();
                    wAR.method_7a46289a_Dne();
                    wAR.method_a680f8e7_FWm(1.0f, 0.0f, 0.0f);
                    this.method_3fc2d5c2_zGp(zKP2, 0.0, 0.0, 0.0, this.method_5d830b5b_Dne(zKP2, 5));
                    wAR.method_7a46288d_Dne();
                    GL11.glTranslatef(0.5f, 0.5f, 0.5f);
                }
                this.method_adff145a_Dne(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
            } else if (n2 == 21) {
                for (int i = 0; i < 3; ++i) {
                    f3 = 0.0625f;
                    if (i == 0) {
                        this.method_adff145a_Dne(0.5f - f3, 0.3f, 0.0, 0.5f + f3, 1.0, f3 * 2.0f);
                    }
                    if (i == 1) {
                        this.method_adff145a_Dne(0.5f - f3, 0.3f, 1.0f - f3 * 2.0f, 0.5f + f3, 1.0, 1.0);
                    }
                    f3 = 0.0625f;
                    if (i == 2) {
                        this.method_adff145a_Dne(0.5f - f3, 0.5, 0.0, 0.5f + f3, 1.0f - f3, 1.0);
                    }
                    GL11.glTranslatef(-0.5f, -0.5f, -0.5f);
                    wAR.method_7a46289a_Dne();
                    wAR.method_a680f8e7_FWm(0.0f, -1.0f, 0.0f);
                    this.method_58bf1fba_Dne(zKP2, 0.0, 0.0, 0.0, this.method_5d830b5b_Dne(zKP2, 0));
                    wAR.method_7a46288d_Dne();
                    wAR.method_7a46289a_Dne();
                    wAR.method_a680f8e7_FWm(0.0f, 1.0f, 0.0f);
                    this.method_d047827b_FWm(zKP2, 0.0, 0.0, 0.0, this.method_5d830b5b_Dne(zKP2, 1));
                    wAR.method_7a46288d_Dne();
                    wAR.method_7a46289a_Dne();
                    wAR.method_a680f8e7_FWm(0.0f, 0.0f, -1.0f);
                    this.method_e4fb4bad_bzF(zKP2, 0.0, 0.0, 0.0, this.method_5d830b5b_Dne(zKP2, 2));
                    wAR.method_7a46288d_Dne();
                    wAR.method_7a46289a_Dne();
                    wAR.method_a680f8e7_FWm(0.0f, 0.0f, 1.0f);
                    this.method_925c7e93_Qnq(zKP2, 0.0, 0.0, 0.0, this.method_5d830b5b_Dne(zKP2, 3));
                    wAR.method_7a46288d_Dne();
                    wAR.method_7a46289a_Dne();
                    wAR.method_a680f8e7_FWm(-1.0f, 0.0f, 0.0f);
                    this.method_76f453b4_aFZ(zKP2, 0.0, 0.0, 0.0, this.method_5d830b5b_Dne(zKP2, 4));
                    wAR.method_7a46288d_Dne();
                    wAR.method_7a46289a_Dne();
                    wAR.method_a680f8e7_FWm(1.0f, 0.0f, 0.0f);
                    this.method_3fc2d5c2_zGp(zKP2, 0.0, 0.0, 0.0, this.method_5d830b5b_Dne(zKP2, 5));
                    wAR.method_7a46288d_Dne();
                    GL11.glTranslatef(0.5f, 0.5f, 0.5f);
                }
            } else if (n2 == 32) {
                for (int i = 0; i < 2; ++i) {
                    if (i == 0) {
                        this.method_adff145a_Dne(0.0, 0.0, 0.3125, 1.0, 0.8125, 0.6875);
                    }
                    if (i == 1) {
                        this.method_adff145a_Dne(0.25, 0.0, 0.25, 0.75, 1.0, 0.75);
                    }
                    GL11.glTranslatef(-0.5f, -0.5f, -0.5f);
                    wAR.method_7a46289a_Dne();
                    wAR.method_a680f8e7_FWm(0.0f, -1.0f, 0.0f);
                    this.method_58bf1fba_Dne(zKP2, 0.0, 0.0, 0.0, this.method_b27f0188_Dne(zKP2, 0, n));
                    wAR.method_7a46288d_Dne();
                    wAR.method_7a46289a_Dne();
                    wAR.method_a680f8e7_FWm(0.0f, 1.0f, 0.0f);
                    this.method_d047827b_FWm(zKP2, 0.0, 0.0, 0.0, this.method_b27f0188_Dne(zKP2, 1, n));
                    wAR.method_7a46288d_Dne();
                    wAR.method_7a46289a_Dne();
                    wAR.method_a680f8e7_FWm(0.0f, 0.0f, -1.0f);
                    this.method_e4fb4bad_bzF(zKP2, 0.0, 0.0, 0.0, this.method_b27f0188_Dne(zKP2, 2, n));
                    wAR.method_7a46288d_Dne();
                    wAR.method_7a46289a_Dne();
                    wAR.method_a680f8e7_FWm(0.0f, 0.0f, 1.0f);
                    this.method_925c7e93_Qnq(zKP2, 0.0, 0.0, 0.0, this.method_b27f0188_Dne(zKP2, 3, n));
                    wAR.method_7a46288d_Dne();
                    wAR.method_7a46289a_Dne();
                    wAR.method_a680f8e7_FWm(-1.0f, 0.0f, 0.0f);
                    this.method_76f453b4_aFZ(zKP2, 0.0, 0.0, 0.0, this.method_b27f0188_Dne(zKP2, 4, n));
                    wAR.method_7a46288d_Dne();
                    wAR.method_7a46289a_Dne();
                    wAR.method_a680f8e7_FWm(1.0f, 0.0f, 0.0f);
                    this.method_3fc2d5c2_zGp(zKP2, 0.0, 0.0, 0.0, this.method_b27f0188_Dne(zKP2, 5, n));
                    wAR.method_7a46288d_Dne();
                    GL11.glTranslatef(0.5f, 0.5f, 0.5f);
                }
                this.method_adff145a_Dne(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
            } else if (n2 == 35) {
                GL11.glTranslatef(-0.5f, -0.5f, -0.5f);
                this.method_f5d6cbd3_Dne((qQB)zKP2, 0, 0, 0, n, true);
                GL11.glTranslatef(0.5f, 0.5f, 0.5f);
            } else if (n2 == 34) {
                for (int i = 0; i < 3; ++i) {
                    if (i == 0) {
                        this.method_adff145a_Dne(0.125, 0.0, 0.125, 0.875, 0.1875, 0.875);
                        this.method_a68ac5f6_Dne(this.method_39bcfb28_Dne(zKP.field_e641c680_cot));
                    } else if (i == 1) {
                        this.method_adff145a_Dne(0.1875, 0.1875, 0.1875, 0.8125, 0.875, 0.8125);
                        this.method_a68ac5f6_Dne(zKP.field_37476df_Dne.method_230f3f9a_Dne());
                    } else if (i == 2) {
                        this.method_adff145a_Dne(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
                        this.method_a68ac5f6_Dne(this.method_39bcfb28_Dne(zKP.field_32988693_trS));
                    }
                    GL11.glTranslatef(-0.5f, -0.5f, -0.5f);
                    wAR.method_7a46289a_Dne();
                    wAR.method_a680f8e7_FWm(0.0f, -1.0f, 0.0f);
                    this.method_58bf1fba_Dne(zKP2, 0.0, 0.0, 0.0, this.method_b27f0188_Dne(zKP2, 0, n));
                    wAR.method_7a46288d_Dne();
                    wAR.method_7a46289a_Dne();
                    wAR.method_a680f8e7_FWm(0.0f, 1.0f, 0.0f);
                    this.method_d047827b_FWm(zKP2, 0.0, 0.0, 0.0, this.method_b27f0188_Dne(zKP2, 1, n));
                    wAR.method_7a46288d_Dne();
                    wAR.method_7a46289a_Dne();
                    wAR.method_a680f8e7_FWm(0.0f, 0.0f, -1.0f);
                    this.method_e4fb4bad_bzF(zKP2, 0.0, 0.0, 0.0, this.method_b27f0188_Dne(zKP2, 2, n));
                    wAR.method_7a46288d_Dne();
                    wAR.method_7a46289a_Dne();
                    wAR.method_a680f8e7_FWm(0.0f, 0.0f, 1.0f);
                    this.method_925c7e93_Qnq(zKP2, 0.0, 0.0, 0.0, this.method_b27f0188_Dne(zKP2, 3, n));
                    wAR.method_7a46288d_Dne();
                    wAR.method_7a46289a_Dne();
                    wAR.method_a680f8e7_FWm(-1.0f, 0.0f, 0.0f);
                    this.method_76f453b4_aFZ(zKP2, 0.0, 0.0, 0.0, this.method_b27f0188_Dne(zKP2, 4, n));
                    wAR.method_7a46288d_Dne();
                    wAR.method_7a46289a_Dne();
                    wAR.method_a680f8e7_FWm(1.0f, 0.0f, 0.0f);
                    this.method_3fc2d5c2_zGp(zKP2, 0.0, 0.0, 0.0, this.method_b27f0188_Dne(zKP2, 5, n));
                    wAR.method_7a46288d_Dne();
                    GL11.glTranslatef(0.5f, 0.5f, 0.5f);
                }
                this.method_adff145a_Dne(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
                this.method_7a46289a_Dne();
            } else if (n2 == 38) {
                GL11.glTranslatef(-0.5f, -0.5f, -0.5f);
                this.method_94c5dd35_Dne((SrC)zKP2, 0, 0, 0, 0, true);
                GL11.glTranslatef(0.5f, 0.5f, 0.5f);
            }
        } else {
            if (n2 == 16) {
                n = 1;
            }
            zKP2.method_7a46289a_Dne();
            this.method_c74bdb28_Dne(zKP2);
            GL11.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
            GL11.glTranslatef(-0.5f, -0.5f, -0.5f);
            wAR.method_7a46289a_Dne();
            wAR.method_a680f8e7_FWm(0.0f, -1.0f, 0.0f);
            this.method_58bf1fba_Dne(zKP2, 0.0, 0.0, 0.0, this.method_b27f0188_Dne(zKP2, 0, n));
            wAR.method_7a46288d_Dne();
            if (bl && this.field_21261e_FWm) {
                int n6 = zKP2.method_117d19dd_FWm(n);
                f3 = (float)(n6 >> 16 & 0xFF) / 255.0f;
                f2 = (float)(n6 >> 8 & 0xFF) / 255.0f;
                float f8 = (float)(n6 & 0xFF) / 255.0f;
                GL11.glColor4f(f3 * f, f2 * f, f8 * f, 1.0f);
            }
            wAR.method_7a46289a_Dne();
            wAR.method_a680f8e7_FWm(0.0f, 1.0f, 0.0f);
            this.method_d047827b_FWm(zKP2, 0.0, 0.0, 0.0, this.method_b27f0188_Dne(zKP2, 1, n));
            wAR.method_7a46288d_Dne();
            if (bl && this.field_21261e_FWm) {
                GL11.glColor4f(f, f, f, 1.0f);
            }
            wAR.method_7a46289a_Dne();
            wAR.method_a680f8e7_FWm(0.0f, 0.0f, -1.0f);
            this.method_e4fb4bad_bzF(zKP2, 0.0, 0.0, 0.0, this.method_b27f0188_Dne(zKP2, 2, n));
            wAR.method_7a46288d_Dne();
            wAR.method_7a46289a_Dne();
            wAR.method_a680f8e7_FWm(0.0f, 0.0f, 1.0f);
            this.method_925c7e93_Qnq(zKP2, 0.0, 0.0, 0.0, this.method_b27f0188_Dne(zKP2, 3, n));
            wAR.method_7a46288d_Dne();
            wAR.method_7a46289a_Dne();
            wAR.method_a680f8e7_FWm(-1.0f, 0.0f, 0.0f);
            this.method_76f453b4_aFZ(zKP2, 0.0, 0.0, 0.0, this.method_b27f0188_Dne(zKP2, 4, n));
            wAR.method_7a46288d_Dne();
            wAR.method_7a46289a_Dne();
            wAR.method_a680f8e7_FWm(1.0f, 0.0f, 0.0f);
            this.method_3fc2d5c2_zGp(zKP2, 0.0, 0.0, 0.0, this.method_b27f0188_Dne(zKP2, 5, n));
            wAR.method_7a46288d_Dne();
            GL11.glTranslatef(0.5f, 0.5f, 0.5f);
        }
    }

    public boolean method_25af06dd_mrb(zKP zKP2, int n, int n2, int n3) {
        ScM scM = (ScM)zKP2;
        WAR wAR = WAR.field_36e5ca4_Dne;
        wAR.method_117d19ea_FWm(scM.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3));
        float f = 1.0f;
        int n4 = scM.method_fbabf7e2_Dne(this.field_3706cf9_Dne, n, n2, n3);
        float f2 = (float)(n4 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n4 >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n4 & 0xFF) / 255.0f;
        if (OEA.field_2092bf_Dne) {
            float f5 = (f2 * 30.0f + f3 * 59.0f + f4 * 11.0f) / 100.0f;
            float f6 = (f2 * 30.0f + f3 * 70.0f) / 100.0f;
            float f7 = (f2 * 30.0f + f4 * 70.0f) / 100.0f;
            f2 = f5;
            f3 = f6;
            f4 = f7;
        }
        wAR.method_2c0148e6_Dne(f * f2, f * f3, f * f4);
        scM.method_fbabf7ef_Dne(this.field_3706cf9_Dne, n, n2, n3);
        int n5 = scM.method_8f2f2081_FWm(this.field_3706cf9_Dne, n, n2, n3);
        if (n5 < 0) {
            this.method_8b1536db_Dne(scM, this.field_3706cf9_Dne.method_2dee76f_bzF(n, n2, n3), this.field_267cf0_Qnq, n, (float)n2 - 0.0625f, n3);
        } else {
            this.method_8b1536db_Dne(scM, this.field_3706cf9_Dne.method_2dee76f_bzF(n, n2, n3), 0.5, n, (float)n2 - 0.0625f, n3);
            this.method_cc956a4a_Dne(scM, this.field_3706cf9_Dne.method_2dee76f_bzF(n, n2, n3), n5, this.field_267cf0_Qnq, n, (float)n2 - 0.0625f, n3);
        }
        return true;
    }

    private boolean method_60822b8e_Dne(KPs kPs, int n, int n2, int n3) {
        int n4 = this.field_3706cf9_Dne.method_2dee76f_bzF(n, n2, n3);
        int n5 = n4 & 3;
        if (n5 == 0) {
            this.field_2d29f4_aFZ = 3;
        } else if (n5 == 3) {
            this.field_2d29f4_aFZ = 1;
        } else if (n5 == 1) {
            this.field_2d29f4_aFZ = 2;
        }
        if (!KPs.method_ce7f5dad_Dne(n4)) {
            this.method_adff145a_Dne(0.0, 0.0, 0.0, 1.0, 0.8125, 1.0);
            this.method_9743b2ba_udO(kPs, n, n2, n3);
            this.field_2d29f4_aFZ = 0;
            return true;
        }
        this.field_267d06_Qnq = true;
        this.method_adff145a_Dne(0.0, 0.0, 0.0, 1.0, 0.8125, 1.0);
        this.method_9743b2ba_udO(kPs, n, n2, n3);
        this.method_a68ac5f6_Dne(kPs.method_230f3f9a_Dne());
        this.method_adff145a_Dne(0.25, 0.8125, 0.25, 0.75, 1.0, 0.75);
        this.method_9743b2ba_udO(kPs, n, n2, n3);
        this.field_267d06_Qnq = false;
        this.method_7a46289a_Dne();
        this.field_2d29f4_aFZ = 0;
        return true;
    }

    public void method_aea60b5_Dne(zKP zKP2, int n, int n2, int n3, gDn gDn2) {
        this.method_a68ac5f6_Dne(gDn2);
        this.method_5632927f_Dne(zKP2, n, n2, n3);
        this.method_7a46289a_Dne();
    }

    public boolean method_e8b68769_Dne(zKP zKP2, int n, int n2, int n3, float f, float f2, float f3) {
        gDn gDn2;
        float f4;
        int n4;
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        this.field_20b868_DyG = true;
        boolean bl5 = false;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        boolean bl6 = true;
        int n5 = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3);
        WAR wAR = WAR.field_36e5ca4_Dne;
        wAR.method_117d19ea_FWm(983055);
        if (this.method_39bcfb28_Dne(zKP2).method_eecad346_Dne().equals("grass_top")) {
            bl6 = false;
        } else if (this.method_7a46289e_Dne()) {
            bl6 = false;
        }
        if (this.field_267d06_Qnq || zKP2.method_79d378f8_Dne(this.field_3706cf9_Dne, n, n2 - 1, n3, 0)) {
            if (this.field_2e5f16_bzF <= 0.0) {
                --n2;
            }
            this.field_2f0dd8_div = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n - 1, n2, n3);
            this.field_33448c_mrb = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3 - 1);
            this.field_29186d_XHL = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3 + 1);
            this.field_31b816_kGO = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n + 1, n2, n3);
            this.field_21260a_FWm = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n - 1, n2, n3);
            this.field_267cf2_Qnq = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2, n3 - 1);
            this.field_2d29f1_aFZ = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2, n3 + 1);
            this.field_20b854_DyG = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n + 1, n2, n3);
            bl4 = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n + 1, n2 - 1, n3)];
            bl3 = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n - 1, n2 - 1, n3)];
            bl2 = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n, n2 - 1, n3 + 1)];
            bl = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n, n2 - 1, n3 - 1)];
            if (!bl && !bl3) {
                this.field_2092ab_Dne = this.field_21260a_FWm;
                this.field_20b857_DyG = this.field_2f0dd8_div;
            } else {
                this.field_2092ab_Dne = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n - 1, n2, n3 - 1);
                this.field_20b857_DyG = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n - 1, n2, n3 - 1);
            }
            if (!bl2 && !bl3) {
                this.field_2e5f18_bzF = this.field_21260a_FWm;
                this.field_22c602_IjH = this.field_2f0dd8_div;
            } else {
                this.field_2e5f18_bzF = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n - 1, n2, n3 + 1);
                this.field_22c602_IjH = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n - 1, n2, n3 + 1);
            }
            if (!bl && !bl4) {
                this.field_388da3_zGp = this.field_20b854_DyG;
                this.field_2a9ad6_Zpi = this.field_31b816_kGO;
            } else {
                this.field_388da3_zGp = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n + 1, n2, n3 - 1);
                this.field_2a9ad6_Zpi = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n + 1, n2, n3 - 1);
            }
            if (!bl2 && !bl4) {
                this.field_2f0dd5_div = this.field_20b854_DyG;
                this.field_36b0a9_udO = this.field_31b816_kGO;
            } else {
                this.field_2f0dd5_div = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n + 1, n2, n3 + 1);
                this.field_36b0a9_udO = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n + 1, n2, n3 + 1);
            }
            if (this.field_2e5f16_bzF <= 0.0) {
                ++n2;
            }
            n4 = n5;
            if (this.field_2e5f16_bzF <= 0.0 || !this.field_3706cf9_Dne.method_e53317d5_zGp(n, n2 - 1, n3)) {
                n4 = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2 - 1, n3);
            }
            f4 = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2 - 1, n3);
            f5 = (this.field_2e5f18_bzF + this.field_21260a_FWm + this.field_2d29f1_aFZ + f4) / 4.0f;
            f8 = (this.field_2d29f1_aFZ + f4 + this.field_2f0dd5_div + this.field_20b854_DyG) / 4.0f;
            f7 = (f4 + this.field_267cf2_Qnq + this.field_20b854_DyG + this.field_388da3_zGp) / 4.0f;
            f6 = (this.field_21260a_FWm + this.field_2092ab_Dne + f4 + this.field_267cf2_Qnq) / 4.0f;
            this.field_217c26_Fnk = this.method_5972744d_Dne(this.field_22c602_IjH, this.field_2f0dd8_div, this.field_29186d_XHL, n4);
            this.field_34b601_qXo = this.method_5972744d_Dne(this.field_29186d_XHL, this.field_36b0a9_udO, this.field_31b816_kGO, n4);
            this.field_3649f9_tgc = this.method_5972744d_Dne(this.field_33448c_mrb, this.field_31b816_kGO, this.field_2a9ad6_Zpi, n4);
            this.field_307847_gnI = this.method_5972744d_Dne(this.field_2f0dd8_div, this.field_20b857_DyG, this.field_33448c_mrb, n4);
            if (bl6) {
                this.field_2569d2_OdI = this.field_3393da_oIf = f * 0.5f;
                this.field_215b33_FfS = this.field_3393da_oIf;
                this.field_212c18_EyB = this.field_3393da_oIf;
                this.field_217c23_Fnk = this.field_307844_gnI = f2 * 0.5f;
                this.field_26818c_RPx = this.field_307844_gnI;
                this.field_36e4d7_vSL = this.field_307844_gnI;
                this.field_1f1786_AgF = this.field_383100_yMz = f3 * 0.5f;
                this.field_34b5fe_qXo = this.field_383100_yMz;
                this.field_3649f6_tgc = this.field_383100_yMz;
            } else {
                this.field_3393da_oIf = 0.5f;
                this.field_2569d2_OdI = 0.5f;
                this.field_215b33_FfS = 0.5f;
                this.field_212c18_EyB = 0.5f;
                this.field_307844_gnI = 0.5f;
                this.field_217c23_Fnk = 0.5f;
                this.field_26818c_RPx = 0.5f;
                this.field_36e4d7_vSL = 0.5f;
                this.field_383100_yMz = 0.5f;
                this.field_1f1786_AgF = 0.5f;
                this.field_34b5fe_qXo = 0.5f;
                this.field_3649f6_tgc = 0.5f;
            }
            this.field_212c18_EyB *= f5;
            this.field_36e4d7_vSL *= f5;
            this.field_3649f6_tgc *= f5;
            this.field_215b33_FfS *= f6;
            this.field_26818c_RPx *= f6;
            this.field_34b5fe_qXo *= f6;
            this.field_2569d2_OdI *= f7;
            this.field_217c23_Fnk *= f7;
            this.field_1f1786_AgF *= f7;
            this.field_3393da_oIf *= f8;
            this.field_307844_gnI *= f8;
            this.field_383100_yMz *= f8;
            this.method_58bf1fba_Dne(zKP2, n, n2, n3, this.method_42ba3726_Dne(zKP2, this.field_3706cf9_Dne, n, n2, n3, 0));
            bl5 = true;
        }
        if (this.field_267d06_Qnq || zKP2.method_79d378f8_Dne(this.field_3706cf9_Dne, n, n2 + 1, n3, 1)) {
            if (this.field_267cf0_Qnq >= 1.0) {
                ++n2;
            }
            this.field_367154_trS = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n - 1, n2, n3);
            this.field_2e8486_ceE = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n + 1, n2, n3);
            this.field_1ed017_ATE = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3 - 1);
            this.field_212c1b_EyB = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3 + 1);
            this.field_334489_mrb = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n - 1, n2, n3);
            this.field_36b0a6_udO = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n + 1, n2, n3);
            this.field_2a9ad3_Zpi = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2, n3 - 1);
            this.field_342261_ooe = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2, n3 + 1);
            bl4 = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n + 1, n2 + 1, n3)];
            bl3 = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n - 1, n2 + 1, n3)];
            bl2 = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n, n2 + 1, n3 + 1)];
            bl = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n, n2 + 1, n3 - 1)];
            if (!bl && !bl3) {
                this.field_22c5ff_IjH = this.field_334489_mrb;
                this.field_342264_ooe = this.field_367154_trS;
            } else {
                this.field_22c5ff_IjH = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n - 1, n2, n3 - 1);
                this.field_342264_ooe = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n - 1, n2, n3 - 1);
            }
            if (!bl && !bl4) {
                this.field_31b813_kGO = this.field_36b0a6_udO;
                this.field_28e7fd_Vxn = this.field_2e8486_ceE;
            } else {
                this.field_31b813_kGO = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n + 1, n2, n3 - 1);
                this.field_28e7fd_Vxn = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n + 1, n2, n3 - 1);
            }
            if (!bl2 && !bl3) {
                this.field_29186a_XHL = this.field_334489_mrb;
                this.field_348572_qLR = this.field_367154_trS;
            } else {
                this.field_29186a_XHL = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n - 1, n2, n3 + 1);
                this.field_348572_qLR = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n - 1, n2, n3 + 1);
            }
            if (!bl2 && !bl4) {
                this.field_367151_trS = this.field_36b0a6_udO;
                this.field_215b36_FfS = this.field_2e8486_ceE;
            } else {
                this.field_367151_trS = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n + 1, n2, n3 + 1);
                this.field_215b36_FfS = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n + 1, n2, n3 + 1);
            }
            if (this.field_267cf0_Qnq >= 1.0) {
                --n2;
            }
            n4 = n5;
            if (this.field_267cf0_Qnq >= 1.0 || !this.field_3706cf9_Dne.method_e53317d5_zGp(n, n2 + 1, n3)) {
                n4 = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2 + 1, n3);
            }
            f4 = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2 + 1, n3);
            f8 = (this.field_29186a_XHL + this.field_334489_mrb + this.field_342261_ooe + f4) / 4.0f;
            f5 = (this.field_342261_ooe + f4 + this.field_367151_trS + this.field_36b0a6_udO) / 4.0f;
            f6 = (f4 + this.field_2a9ad3_Zpi + this.field_36b0a6_udO + this.field_31b813_kGO) / 4.0f;
            f7 = (this.field_334489_mrb + this.field_22c5ff_IjH + f4 + this.field_2a9ad3_Zpi) / 4.0f;
            this.field_34b601_qXo = this.method_5972744d_Dne(this.field_348572_qLR, this.field_367154_trS, this.field_212c1b_EyB, n4);
            this.field_217c26_Fnk = this.method_5972744d_Dne(this.field_212c1b_EyB, this.field_215b36_FfS, this.field_2e8486_ceE, n4);
            this.field_307847_gnI = this.method_5972744d_Dne(this.field_1ed017_ATE, this.field_2e8486_ceE, this.field_28e7fd_Vxn, n4);
            this.field_3649f9_tgc = this.method_5972744d_Dne(this.field_367154_trS, this.field_342264_ooe, this.field_1ed017_ATE, n4);
            this.field_2569d2_OdI = this.field_3393da_oIf = f;
            this.field_215b33_FfS = this.field_3393da_oIf;
            this.field_212c18_EyB = this.field_3393da_oIf;
            this.field_217c23_Fnk = this.field_307844_gnI = f2;
            this.field_26818c_RPx = this.field_307844_gnI;
            this.field_36e4d7_vSL = this.field_307844_gnI;
            this.field_1f1786_AgF = this.field_383100_yMz = f3;
            this.field_34b5fe_qXo = this.field_383100_yMz;
            this.field_3649f6_tgc = this.field_383100_yMz;
            this.field_212c18_EyB *= f5;
            this.field_36e4d7_vSL *= f5;
            this.field_3649f6_tgc *= f5;
            this.field_215b33_FfS *= f6;
            this.field_26818c_RPx *= f6;
            this.field_34b5fe_qXo *= f6;
            this.field_2569d2_OdI *= f7;
            this.field_217c23_Fnk *= f7;
            this.field_1f1786_AgF *= f7;
            this.field_3393da_oIf *= f8;
            this.field_307844_gnI *= f8;
            this.field_383100_yMz *= f8;
            this.method_d047827b_FWm(zKP2, n, n2, n3, this.method_42ba3726_Dne(zKP2, this.field_3706cf9_Dne, n, n2, n3, 1));
            bl5 = true;
        }
        if (this.field_267d06_Qnq || zKP2.method_79d378f8_Dne(this.field_3706cf9_Dne, n, n2, n3 - 1, 2)) {
            if (this.field_2d29ef_aFZ <= 0.0) {
                --n3;
            }
            this.field_34856f_qLR = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n - 1, n2, n3);
            this.field_267cf2_Qnq = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2 - 1, n3);
            this.field_2a9ad3_Zpi = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2 + 1, n3);
            this.field_1ed014_ATE = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n + 1, n2, n3);
            this.field_2569d5_OdI = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n - 1, n2, n3);
            this.field_33448c_mrb = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2 - 1, n3);
            this.field_1ed017_ATE = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2 + 1, n3);
            this.field_3393dd_oIf = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n + 1, n2, n3);
            bl4 = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n + 1, n2, n3 - 1)];
            bl3 = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n - 1, n2, n3 - 1)];
            bl2 = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n, n2 + 1, n3 - 1)];
            bl = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n, n2 - 1, n3 - 1)];
            if (!bl3 && !bl) {
                this.field_2092ab_Dne = this.field_34856f_qLR;
                this.field_20b857_DyG = this.field_2569d5_OdI;
            } else {
                this.field_2092ab_Dne = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n - 1, n2 - 1, n3);
                this.field_20b857_DyG = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n - 1, n2 - 1, n3);
            }
            if (!bl3 && !bl2) {
                this.field_22c5ff_IjH = this.field_34856f_qLR;
                this.field_342264_ooe = this.field_2569d5_OdI;
            } else {
                this.field_22c5ff_IjH = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n - 1, n2 + 1, n3);
                this.field_342264_ooe = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n - 1, n2 + 1, n3);
            }
            if (!bl4 && !bl) {
                this.field_388da3_zGp = this.field_1ed014_ATE;
                this.field_2a9ad6_Zpi = this.field_3393dd_oIf;
            } else {
                this.field_388da3_zGp = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n + 1, n2 - 1, n3);
                this.field_2a9ad6_Zpi = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n + 1, n2 - 1, n3);
            }
            if (!bl4 && !bl2) {
                this.field_31b813_kGO = this.field_1ed014_ATE;
                this.field_28e7fd_Vxn = this.field_3393dd_oIf;
            } else {
                this.field_31b813_kGO = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n + 1, n2 + 1, n3);
                this.field_28e7fd_Vxn = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n + 1, n2 + 1, n3);
            }
            if (this.field_2d29ef_aFZ <= 0.0) {
                ++n3;
            }
            n4 = n5;
            if (this.field_2d29ef_aFZ <= 0.0 || !this.field_3706cf9_Dne.method_e53317d5_zGp(n, n2, n3 - 1)) {
                n4 = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3 - 1);
            }
            f4 = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2, n3 - 1);
            f5 = (this.field_34856f_qLR + this.field_22c5ff_IjH + f4 + this.field_2a9ad3_Zpi) / 4.0f;
            f6 = (f4 + this.field_2a9ad3_Zpi + this.field_1ed014_ATE + this.field_31b813_kGO) / 4.0f;
            f7 = (this.field_267cf2_Qnq + f4 + this.field_388da3_zGp + this.field_1ed014_ATE) / 4.0f;
            f8 = (this.field_2092ab_Dne + this.field_34856f_qLR + this.field_267cf2_Qnq + f4) / 4.0f;
            this.field_217c26_Fnk = this.method_5972744d_Dne(this.field_2569d5_OdI, this.field_342264_ooe, this.field_1ed017_ATE, n4);
            this.field_307847_gnI = this.method_5972744d_Dne(this.field_1ed017_ATE, this.field_3393dd_oIf, this.field_28e7fd_Vxn, n4);
            this.field_3649f9_tgc = this.method_5972744d_Dne(this.field_33448c_mrb, this.field_2a9ad6_Zpi, this.field_3393dd_oIf, n4);
            this.field_34b601_qXo = this.method_5972744d_Dne(this.field_20b857_DyG, this.field_2569d5_OdI, this.field_33448c_mrb, n4);
            if (bl6) {
                this.field_2569d2_OdI = this.field_3393da_oIf = f * 0.8f;
                this.field_215b33_FfS = this.field_3393da_oIf;
                this.field_212c18_EyB = this.field_3393da_oIf;
                this.field_217c23_Fnk = this.field_307844_gnI = f2 * 0.8f;
                this.field_26818c_RPx = this.field_307844_gnI;
                this.field_36e4d7_vSL = this.field_307844_gnI;
                this.field_1f1786_AgF = this.field_383100_yMz = f3 * 0.8f;
                this.field_34b5fe_qXo = this.field_383100_yMz;
                this.field_3649f6_tgc = this.field_383100_yMz;
            } else {
                this.field_3393da_oIf = 0.8f;
                this.field_2569d2_OdI = 0.8f;
                this.field_215b33_FfS = 0.8f;
                this.field_212c18_EyB = 0.8f;
                this.field_307844_gnI = 0.8f;
                this.field_217c23_Fnk = 0.8f;
                this.field_26818c_RPx = 0.8f;
                this.field_36e4d7_vSL = 0.8f;
                this.field_383100_yMz = 0.8f;
                this.field_1f1786_AgF = 0.8f;
                this.field_34b5fe_qXo = 0.8f;
                this.field_3649f6_tgc = 0.8f;
            }
            this.field_212c18_EyB *= f5;
            this.field_36e4d7_vSL *= f5;
            this.field_3649f6_tgc *= f5;
            this.field_215b33_FfS *= f6;
            this.field_26818c_RPx *= f6;
            this.field_34b5fe_qXo *= f6;
            this.field_2569d2_OdI *= f7;
            this.field_217c23_Fnk *= f7;
            this.field_1f1786_AgF *= f7;
            this.field_3393da_oIf *= f8;
            this.field_307844_gnI *= f8;
            this.field_383100_yMz *= f8;
            gDn2 = this.method_42ba3726_Dne(zKP2, this.field_3706cf9_Dne, n, n2, n3, 2);
            this.method_e4fb4bad_bzF(zKP2, n, n2, n3, gDn2);
            if (field_2092bf_Dne && gDn2.method_eecad346_Dne().equals("grass_side") && !this.method_7a46289e_Dne()) {
                this.field_212c18_EyB *= f;
                this.field_215b33_FfS *= f;
                this.field_2569d2_OdI *= f;
                this.field_3393da_oIf *= f;
                this.field_36e4d7_vSL *= f2;
                this.field_26818c_RPx *= f2;
                this.field_217c23_Fnk *= f2;
                this.field_307844_gnI *= f2;
                this.field_3649f6_tgc *= f3;
                this.field_34b5fe_qXo *= f3;
                this.field_1f1786_AgF *= f3;
                this.field_383100_yMz *= f3;
                this.method_e4fb4bad_bzF(zKP2, n, n2, n3, ZQN.method_230f3f9a_Dne());
            }
            bl5 = true;
        }
        if (this.field_267d06_Qnq || zKP2.method_79d378f8_Dne(this.field_3706cf9_Dne, n, n2, n3 + 1, 3)) {
            if (this.field_388da1_zGp >= 1.0) {
                ++n3;
            }
            this.field_28e7fa_Vxn = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n - 1, n2, n3);
            this.field_2e8483_ceE = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n + 1, n2, n3);
            this.field_2d29f1_aFZ = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2 - 1, n3);
            this.field_342261_ooe = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2 + 1, n3);
            this.field_36e4da_vSL = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n - 1, n2, n3);
            this.field_26818f_RPx = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n + 1, n2, n3);
            this.field_29186d_XHL = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2 - 1, n3);
            this.field_212c1b_EyB = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2 + 1, n3);
            bl4 = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n + 1, n2, n3 + 1)];
            bl3 = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n - 1, n2, n3 + 1)];
            bl2 = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n, n2 + 1, n3 + 1)];
            bl = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n, n2 - 1, n3 + 1)];
            if (!bl3 && !bl) {
                this.field_2e5f18_bzF = this.field_28e7fa_Vxn;
                this.field_22c602_IjH = this.field_36e4da_vSL;
            } else {
                this.field_2e5f18_bzF = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n - 1, n2 - 1, n3);
                this.field_22c602_IjH = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n - 1, n2 - 1, n3);
            }
            if (!bl3 && !bl2) {
                this.field_29186a_XHL = this.field_28e7fa_Vxn;
                this.field_348572_qLR = this.field_36e4da_vSL;
            } else {
                this.field_29186a_XHL = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n - 1, n2 + 1, n3);
                this.field_348572_qLR = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n - 1, n2 + 1, n3);
            }
            if (!bl4 && !bl) {
                this.field_2f0dd5_div = this.field_2e8483_ceE;
                this.field_36b0a9_udO = this.field_26818f_RPx;
            } else {
                this.field_2f0dd5_div = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n + 1, n2 - 1, n3);
                this.field_36b0a9_udO = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n + 1, n2 - 1, n3);
            }
            if (!bl4 && !bl2) {
                this.field_367151_trS = this.field_2e8483_ceE;
                this.field_215b36_FfS = this.field_26818f_RPx;
            } else {
                this.field_367151_trS = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n + 1, n2 + 1, n3);
                this.field_215b36_FfS = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n + 1, n2 + 1, n3);
            }
            if (this.field_388da1_zGp >= 1.0) {
                --n3;
            }
            n4 = n5;
            if (this.field_388da1_zGp >= 1.0 || !this.field_3706cf9_Dne.method_e53317d5_zGp(n, n2, n3 + 1)) {
                n4 = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3 + 1);
            }
            f4 = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2, n3 + 1);
            f5 = (this.field_28e7fa_Vxn + this.field_29186a_XHL + f4 + this.field_342261_ooe) / 4.0f;
            f8 = (f4 + this.field_342261_ooe + this.field_2e8483_ceE + this.field_367151_trS) / 4.0f;
            f7 = (this.field_2d29f1_aFZ + f4 + this.field_2f0dd5_div + this.field_2e8483_ceE) / 4.0f;
            f6 = (this.field_2e5f18_bzF + this.field_28e7fa_Vxn + this.field_2d29f1_aFZ + f4) / 4.0f;
            this.field_217c26_Fnk = this.method_5972744d_Dne(this.field_36e4da_vSL, this.field_348572_qLR, this.field_212c1b_EyB, n4);
            this.field_34b601_qXo = this.method_5972744d_Dne(this.field_212c1b_EyB, this.field_26818f_RPx, this.field_215b36_FfS, n4);
            this.field_3649f9_tgc = this.method_5972744d_Dne(this.field_29186d_XHL, this.field_36b0a9_udO, this.field_26818f_RPx, n4);
            this.field_307847_gnI = this.method_5972744d_Dne(this.field_22c602_IjH, this.field_36e4da_vSL, this.field_29186d_XHL, n4);
            if (bl6) {
                this.field_2569d2_OdI = this.field_3393da_oIf = f * 0.8f;
                this.field_215b33_FfS = this.field_3393da_oIf;
                this.field_212c18_EyB = this.field_3393da_oIf;
                this.field_217c23_Fnk = this.field_307844_gnI = f2 * 0.8f;
                this.field_26818c_RPx = this.field_307844_gnI;
                this.field_36e4d7_vSL = this.field_307844_gnI;
                this.field_1f1786_AgF = this.field_383100_yMz = f3 * 0.8f;
                this.field_34b5fe_qXo = this.field_383100_yMz;
                this.field_3649f6_tgc = this.field_383100_yMz;
            } else {
                this.field_3393da_oIf = 0.8f;
                this.field_2569d2_OdI = 0.8f;
                this.field_215b33_FfS = 0.8f;
                this.field_212c18_EyB = 0.8f;
                this.field_307844_gnI = 0.8f;
                this.field_217c23_Fnk = 0.8f;
                this.field_26818c_RPx = 0.8f;
                this.field_36e4d7_vSL = 0.8f;
                this.field_383100_yMz = 0.8f;
                this.field_1f1786_AgF = 0.8f;
                this.field_34b5fe_qXo = 0.8f;
                this.field_3649f6_tgc = 0.8f;
            }
            this.field_212c18_EyB *= f5;
            this.field_36e4d7_vSL *= f5;
            this.field_3649f6_tgc *= f5;
            this.field_215b33_FfS *= f6;
            this.field_26818c_RPx *= f6;
            this.field_34b5fe_qXo *= f6;
            this.field_2569d2_OdI *= f7;
            this.field_217c23_Fnk *= f7;
            this.field_1f1786_AgF *= f7;
            this.field_3393da_oIf *= f8;
            this.field_307844_gnI *= f8;
            this.field_383100_yMz *= f8;
            gDn2 = this.method_42ba3726_Dne(zKP2, this.field_3706cf9_Dne, n, n2, n3, 3);
            this.method_925c7e93_Qnq(zKP2, n, n2, n3, this.method_42ba3726_Dne(zKP2, this.field_3706cf9_Dne, n, n2, n3, 3));
            if (field_2092bf_Dne && gDn2.method_eecad346_Dne().equals("grass_side") && !this.method_7a46289e_Dne()) {
                this.field_212c18_EyB *= f;
                this.field_215b33_FfS *= f;
                this.field_2569d2_OdI *= f;
                this.field_3393da_oIf *= f;
                this.field_36e4d7_vSL *= f2;
                this.field_26818c_RPx *= f2;
                this.field_217c23_Fnk *= f2;
                this.field_307844_gnI *= f2;
                this.field_3649f6_tgc *= f3;
                this.field_34b5fe_qXo *= f3;
                this.field_1f1786_AgF *= f3;
                this.field_383100_yMz *= f3;
                this.method_925c7e93_Qnq(zKP2, n, n2, n3, ZQN.method_230f3f9a_Dne());
            }
            bl5 = true;
        }
        if (this.field_267d06_Qnq || zKP2.method_79d378f8_Dne(this.field_3706cf9_Dne, n - 1, n2, n3, 4)) {
            if (this.field_2092a9_Dne <= 0.0) {
                --n;
            }
            this.field_21260a_FWm = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2 - 1, n3);
            this.field_34856f_qLR = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2, n3 - 1);
            this.field_28e7fa_Vxn = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2, n3 + 1);
            this.field_334489_mrb = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2 + 1, n3);
            this.field_2f0dd8_div = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2 - 1, n3);
            this.field_2569d5_OdI = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3 - 1);
            this.field_36e4da_vSL = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3 + 1);
            this.field_367154_trS = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2 + 1, n3);
            bl4 = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n - 1, n2 + 1, n3)];
            bl3 = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n - 1, n2 - 1, n3)];
            bl2 = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n - 1, n2, n3 - 1)];
            bl = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n - 1, n2, n3 + 1)];
            if (!bl2 && !bl3) {
                this.field_2092ab_Dne = this.field_34856f_qLR;
                this.field_20b857_DyG = this.field_2569d5_OdI;
            } else {
                this.field_2092ab_Dne = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2 - 1, n3 - 1);
                this.field_20b857_DyG = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2 - 1, n3 - 1);
            }
            if (!bl && !bl3) {
                this.field_2e5f18_bzF = this.field_28e7fa_Vxn;
                this.field_22c602_IjH = this.field_36e4da_vSL;
            } else {
                this.field_2e5f18_bzF = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2 - 1, n3 + 1);
                this.field_22c602_IjH = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2 - 1, n3 + 1);
            }
            if (!bl2 && !bl4) {
                this.field_22c5ff_IjH = this.field_34856f_qLR;
                this.field_342264_ooe = this.field_2569d5_OdI;
            } else {
                this.field_22c5ff_IjH = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2 + 1, n3 - 1);
                this.field_342264_ooe = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2 + 1, n3 - 1);
            }
            if (!bl && !bl4) {
                this.field_29186a_XHL = this.field_28e7fa_Vxn;
                this.field_348572_qLR = this.field_36e4da_vSL;
            } else {
                this.field_29186a_XHL = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2 + 1, n3 + 1);
                this.field_348572_qLR = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2 + 1, n3 + 1);
            }
            if (this.field_2092a9_Dne <= 0.0) {
                ++n;
            }
            n4 = n5;
            if (this.field_2092a9_Dne <= 0.0 || !this.field_3706cf9_Dne.method_e53317d5_zGp(n - 1, n2, n3)) {
                n4 = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n - 1, n2, n3);
            }
            f4 = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n - 1, n2, n3);
            f8 = (this.field_21260a_FWm + this.field_2e5f18_bzF + f4 + this.field_28e7fa_Vxn) / 4.0f;
            f5 = (f4 + this.field_28e7fa_Vxn + this.field_334489_mrb + this.field_29186a_XHL) / 4.0f;
            f6 = (this.field_34856f_qLR + f4 + this.field_22c5ff_IjH + this.field_334489_mrb) / 4.0f;
            f7 = (this.field_2092ab_Dne + this.field_21260a_FWm + this.field_34856f_qLR + f4) / 4.0f;
            this.field_34b601_qXo = this.method_5972744d_Dne(this.field_2f0dd8_div, this.field_22c602_IjH, this.field_36e4da_vSL, n4);
            this.field_217c26_Fnk = this.method_5972744d_Dne(this.field_36e4da_vSL, this.field_367154_trS, this.field_348572_qLR, n4);
            this.field_307847_gnI = this.method_5972744d_Dne(this.field_2569d5_OdI, this.field_342264_ooe, this.field_367154_trS, n4);
            this.field_3649f9_tgc = this.method_5972744d_Dne(this.field_20b857_DyG, this.field_2f0dd8_div, this.field_2569d5_OdI, n4);
            if (bl6) {
                this.field_2569d2_OdI = this.field_3393da_oIf = f * 0.6f;
                this.field_215b33_FfS = this.field_3393da_oIf;
                this.field_212c18_EyB = this.field_3393da_oIf;
                this.field_217c23_Fnk = this.field_307844_gnI = f2 * 0.6f;
                this.field_26818c_RPx = this.field_307844_gnI;
                this.field_36e4d7_vSL = this.field_307844_gnI;
                this.field_1f1786_AgF = this.field_383100_yMz = f3 * 0.6f;
                this.field_34b5fe_qXo = this.field_383100_yMz;
                this.field_3649f6_tgc = this.field_383100_yMz;
            } else {
                this.field_3393da_oIf = 0.6f;
                this.field_2569d2_OdI = 0.6f;
                this.field_215b33_FfS = 0.6f;
                this.field_212c18_EyB = 0.6f;
                this.field_307844_gnI = 0.6f;
                this.field_217c23_Fnk = 0.6f;
                this.field_26818c_RPx = 0.6f;
                this.field_36e4d7_vSL = 0.6f;
                this.field_383100_yMz = 0.6f;
                this.field_1f1786_AgF = 0.6f;
                this.field_34b5fe_qXo = 0.6f;
                this.field_3649f6_tgc = 0.6f;
            }
            this.field_212c18_EyB *= f5;
            this.field_36e4d7_vSL *= f5;
            this.field_3649f6_tgc *= f5;
            this.field_215b33_FfS *= f6;
            this.field_26818c_RPx *= f6;
            this.field_34b5fe_qXo *= f6;
            this.field_2569d2_OdI *= f7;
            this.field_217c23_Fnk *= f7;
            this.field_1f1786_AgF *= f7;
            this.field_3393da_oIf *= f8;
            this.field_307844_gnI *= f8;
            this.field_383100_yMz *= f8;
            gDn2 = this.method_42ba3726_Dne(zKP2, this.field_3706cf9_Dne, n, n2, n3, 4);
            this.method_76f453b4_aFZ(zKP2, n, n2, n3, gDn2);
            if (field_2092bf_Dne && gDn2.method_eecad346_Dne().equals("grass_side") && !this.method_7a46289e_Dne()) {
                this.field_212c18_EyB *= f;
                this.field_215b33_FfS *= f;
                this.field_2569d2_OdI *= f;
                this.field_3393da_oIf *= f;
                this.field_36e4d7_vSL *= f2;
                this.field_26818c_RPx *= f2;
                this.field_217c23_Fnk *= f2;
                this.field_307844_gnI *= f2;
                this.field_3649f6_tgc *= f3;
                this.field_34b5fe_qXo *= f3;
                this.field_1f1786_AgF *= f3;
                this.field_383100_yMz *= f3;
                this.method_76f453b4_aFZ(zKP2, n, n2, n3, ZQN.method_230f3f9a_Dne());
            }
            bl5 = true;
        }
        if (this.field_267d06_Qnq || zKP2.method_79d378f8_Dne(this.field_3706cf9_Dne, n + 1, n2, n3, 5)) {
            if (this.field_212608_FWm >= 1.0) {
                ++n;
            }
            this.field_20b854_DyG = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2 - 1, n3);
            this.field_1ed014_ATE = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2, n3 - 1);
            this.field_2e8483_ceE = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2, n3 + 1);
            this.field_36b0a6_udO = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2 + 1, n3);
            this.field_31b816_kGO = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2 - 1, n3);
            this.field_3393dd_oIf = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3 - 1);
            this.field_26818f_RPx = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3 + 1);
            this.field_2e8486_ceE = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2 + 1, n3);
            bl4 = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n + 1, n2 + 1, n3)];
            bl3 = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n + 1, n2 - 1, n3)];
            bl2 = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n + 1, n2, n3 + 1)];
            bl = zKP.field_59d86cd_bzF[this.field_3706cf9_Dne.method_2c2cf7bc_Dne(n + 1, n2, n3 - 1)];
            if (!bl3 && !bl) {
                this.field_388da3_zGp = this.field_1ed014_ATE;
                this.field_2a9ad6_Zpi = this.field_3393dd_oIf;
            } else {
                this.field_388da3_zGp = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2 - 1, n3 - 1);
                this.field_2a9ad6_Zpi = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2 - 1, n3 - 1);
            }
            if (!bl3 && !bl2) {
                this.field_2f0dd5_div = this.field_2e8483_ceE;
                this.field_36b0a9_udO = this.field_26818f_RPx;
            } else {
                this.field_2f0dd5_div = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2 - 1, n3 + 1);
                this.field_36b0a9_udO = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2 - 1, n3 + 1);
            }
            if (!bl4 && !bl) {
                this.field_31b813_kGO = this.field_1ed014_ATE;
                this.field_28e7fd_Vxn = this.field_3393dd_oIf;
            } else {
                this.field_31b813_kGO = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2 + 1, n3 - 1);
                this.field_28e7fd_Vxn = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2 + 1, n3 - 1);
            }
            if (!bl4 && !bl2) {
                this.field_367151_trS = this.field_2e8483_ceE;
                this.field_215b36_FfS = this.field_26818f_RPx;
            } else {
                this.field_367151_trS = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n, n2 + 1, n3 + 1);
                this.field_215b36_FfS = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2 + 1, n3 + 1);
            }
            if (this.field_212608_FWm >= 1.0) {
                --n;
            }
            n4 = n5;
            if (this.field_212608_FWm >= 1.0 || !this.field_3706cf9_Dne.method_e53317d5_zGp(n + 1, n2, n3)) {
                n4 = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n + 1, n2, n3);
            }
            f4 = zKP2.method_8f2f207e_FWm(this.field_3706cf9_Dne, n + 1, n2, n3);
            f5 = (this.field_20b854_DyG + this.field_2f0dd5_div + f4 + this.field_2e8483_ceE) / 4.0f;
            f6 = (this.field_388da3_zGp + this.field_20b854_DyG + this.field_1ed014_ATE + f4) / 4.0f;
            f7 = (this.field_1ed014_ATE + f4 + this.field_31b813_kGO + this.field_36b0a6_udO) / 4.0f;
            f8 = (f4 + this.field_2e8483_ceE + this.field_36b0a6_udO + this.field_367151_trS) / 4.0f;
            this.field_217c26_Fnk = this.method_5972744d_Dne(this.field_31b816_kGO, this.field_36b0a9_udO, this.field_26818f_RPx, n4);
            this.field_34b601_qXo = this.method_5972744d_Dne(this.field_26818f_RPx, this.field_2e8486_ceE, this.field_215b36_FfS, n4);
            this.field_3649f9_tgc = this.method_5972744d_Dne(this.field_3393dd_oIf, this.field_28e7fd_Vxn, this.field_2e8486_ceE, n4);
            this.field_307847_gnI = this.method_5972744d_Dne(this.field_2a9ad6_Zpi, this.field_31b816_kGO, this.field_3393dd_oIf, n4);
            if (bl6) {
                this.field_2569d2_OdI = this.field_3393da_oIf = f * 0.6f;
                this.field_215b33_FfS = this.field_3393da_oIf;
                this.field_212c18_EyB = this.field_3393da_oIf;
                this.field_217c23_Fnk = this.field_307844_gnI = f2 * 0.6f;
                this.field_26818c_RPx = this.field_307844_gnI;
                this.field_36e4d7_vSL = this.field_307844_gnI;
                this.field_1f1786_AgF = this.field_383100_yMz = f3 * 0.6f;
                this.field_34b5fe_qXo = this.field_383100_yMz;
                this.field_3649f6_tgc = this.field_383100_yMz;
            } else {
                this.field_3393da_oIf = 0.6f;
                this.field_2569d2_OdI = 0.6f;
                this.field_215b33_FfS = 0.6f;
                this.field_212c18_EyB = 0.6f;
                this.field_307844_gnI = 0.6f;
                this.field_217c23_Fnk = 0.6f;
                this.field_26818c_RPx = 0.6f;
                this.field_36e4d7_vSL = 0.6f;
                this.field_383100_yMz = 0.6f;
                this.field_1f1786_AgF = 0.6f;
                this.field_34b5fe_qXo = 0.6f;
                this.field_3649f6_tgc = 0.6f;
            }
            this.field_212c18_EyB *= f5;
            this.field_36e4d7_vSL *= f5;
            this.field_3649f6_tgc *= f5;
            this.field_215b33_FfS *= f6;
            this.field_26818c_RPx *= f6;
            this.field_34b5fe_qXo *= f6;
            this.field_2569d2_OdI *= f7;
            this.field_217c23_Fnk *= f7;
            this.field_1f1786_AgF *= f7;
            this.field_3393da_oIf *= f8;
            this.field_307844_gnI *= f8;
            this.field_383100_yMz *= f8;
            gDn2 = this.method_42ba3726_Dne(zKP2, this.field_3706cf9_Dne, n, n2, n3, 5);
            this.method_3fc2d5c2_zGp(zKP2, n, n2, n3, gDn2);
            if (field_2092bf_Dne && gDn2.method_eecad346_Dne().equals("grass_side") && !this.method_7a46289e_Dne()) {
                this.field_212c18_EyB *= f;
                this.field_215b33_FfS *= f;
                this.field_2569d2_OdI *= f;
                this.field_3393da_oIf *= f;
                this.field_36e4d7_vSL *= f2;
                this.field_26818c_RPx *= f2;
                this.field_217c23_Fnk *= f2;
                this.field_307844_gnI *= f2;
                this.field_3649f6_tgc *= f3;
                this.field_34b5fe_qXo *= f3;
                this.field_1f1786_AgF *= f3;
                this.field_383100_yMz *= f3;
                this.method_3fc2d5c2_zGp(zKP2, n, n2, n3, ZQN.method_230f3f9a_Dne());
            }
            bl5 = true;
        }
        this.field_20b868_DyG = false;
        return bl5;
    }

    public gDn method_42ba3726_Dne(zKP zKP2, Zpi zpi, int n, int n2, int n3, int n4) {
        return this.method_36cdcef6_Dne(zKP2.method_68d2f4_Dne(zpi, n, n2, n3, n4));
    }

    public static boolean method_ce7f5dad_Dne(int n) {
        return n == 0 ? true : (n == 31 ? true : (n == 39 ? true : (n == 13 ? true : (n == 10 ? true : (n == 11 ? true : (n == 27 ? true : (n == 22 ? true : (n == 21 ? true : (n == 16 ? true : (n == 26 ? true : (n == 32 ? true : (n == 34 ? true : n == 35))))))))))));
    }

    private boolean method_ce27d10e_Vxn(zKP zKP2, int n, int n2, int n3) {
        WAR wAR = WAR.field_36e5ca4_Dne;
        int n4 = this.field_3706cf9_Dne.method_2dee76f_bzF(n, n2, n3);
        int n5 = rTW.method_7ed979f5_Qnq(n4);
        boolean bl = rTW.method_ce7f5dad_Dne(n4);
        float f = 0.5f;
        float f2 = 1.0f;
        float f3 = 0.8f;
        float f4 = 0.6f;
        int n6 = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3);
        wAR.method_117d19ea_FWm(n6);
        wAR.method_2c0148e6_Dne(f, f, f);
        gDn gDn2 = this.method_42ba3726_Dne(zKP2, this.field_3706cf9_Dne, n, n2, n3, 0);
        double d = gDn2.method_7a46288a_Dne();
        double d2 = gDn2.method_7c6f6029_FWm();
        double d3 = gDn2.method_ae128db7_bzF();
        double d4 = gDn2.method_907a9d11_Qnq();
        double d5 = (double)n + this.field_2092a9_Dne;
        double d6 = (double)n + this.field_212608_FWm;
        double d7 = (double)n2 + this.field_2e5f16_bzF + 0.1875;
        double d8 = (double)n3 + this.field_2d29ef_aFZ;
        double d9 = (double)n3 + this.field_388da1_zGp;
        wAR.method_c38c5864_Dne(d5, d7, d9, d, d4);
        wAR.method_c38c5864_Dne(d5, d7, d8, d, d3);
        wAR.method_c38c5864_Dne(d6, d7, d8, d2, d3);
        wAR.method_c38c5864_Dne(d6, d7, d9, d2, d4);
        wAR.method_117d19ea_FWm(zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2 + 1, n3));
        wAR.method_2c0148e6_Dne(f2, f2, f2);
        gDn2 = this.method_42ba3726_Dne(zKP2, this.field_3706cf9_Dne, n, n2, n3, 1);
        d = gDn2.method_7a46288a_Dne();
        d2 = gDn2.method_7c6f6029_FWm();
        d3 = gDn2.method_ae128db7_bzF();
        d4 = gDn2.method_907a9d11_Qnq();
        d5 = d;
        d6 = d2;
        d7 = d3;
        d8 = d3;
        d9 = d;
        double d10 = d2;
        double d11 = d4;
        double d12 = d4;
        if (n5 == 0) {
            d6 = d;
            d7 = d4;
            d9 = d2;
            d12 = d3;
        } else if (n5 == 2) {
            d5 = d2;
            d8 = d4;
            d10 = d;
            d11 = d3;
        } else if (n5 == 3) {
            d5 = d2;
            d8 = d4;
            d10 = d;
            d11 = d3;
            d6 = d;
            d7 = d4;
            d9 = d2;
            d12 = d3;
        }
        double d13 = (double)n + this.field_2092a9_Dne;
        double d14 = (double)n + this.field_212608_FWm;
        double d15 = (double)n2 + this.field_267cf0_Qnq;
        double d16 = (double)n3 + this.field_2d29ef_aFZ;
        double d17 = (double)n3 + this.field_388da1_zGp;
        wAR.method_c38c5864_Dne(d14, d15, d17, d9, d11);
        wAR.method_c38c5864_Dne(d14, d15, d16, d5, d7);
        wAR.method_c38c5864_Dne(d13, d15, d16, d6, d8);
        wAR.method_c38c5864_Dne(d13, d15, d17, d10, d12);
        int n7 = zxJ.field_59d86bc_bzF[n5];
        if (bl) {
            n7 = zxJ.field_59d86bc_bzF[zxJ.field_5781703_aFZ[n5]];
        }
        int n8 = 4;
        switch (n5) {
            case 0: {
                n8 = 5;
                break;
            }
            case 1: {
                n8 = 3;
            }
            default: {
                break;
            }
            case 3: {
                n8 = 2;
            }
        }
        if (n7 != 2 && (this.field_267d06_Qnq || zKP2.method_79d378f8_Dne(this.field_3706cf9_Dne, n, n2, n3 - 1, 2))) {
            wAR.method_117d19ea_FWm(this.field_2d29ef_aFZ > 0.0 ? n6 : zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3 - 1));
            wAR.method_2c0148e6_Dne(f3, f3, f3);
            this.field_2e5f2c_bzF = n8 == 2;
            this.method_e4fb4bad_bzF(zKP2, n, n2, n3, this.method_42ba3726_Dne(zKP2, this.field_3706cf9_Dne, n, n2, n3, 2));
        }
        if (n7 != 3 && (this.field_267d06_Qnq || zKP2.method_79d378f8_Dne(this.field_3706cf9_Dne, n, n2, n3 + 1, 3))) {
            wAR.method_117d19ea_FWm(this.field_388da1_zGp < 1.0 ? n6 : zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3 + 1));
            wAR.method_2c0148e6_Dne(f3, f3, f3);
            this.field_2e5f2c_bzF = n8 == 3;
            this.method_925c7e93_Qnq(zKP2, n, n2, n3, this.method_42ba3726_Dne(zKP2, this.field_3706cf9_Dne, n, n2, n3, 3));
        }
        if (n7 != 4 && (this.field_267d06_Qnq || zKP2.method_79d378f8_Dne(this.field_3706cf9_Dne, n - 1, n2, n3, 4))) {
            wAR.method_117d19ea_FWm(this.field_2d29ef_aFZ > 0.0 ? n6 : zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n - 1, n2, n3));
            wAR.method_2c0148e6_Dne(f4, f4, f4);
            this.field_2e5f2c_bzF = n8 == 4;
            this.method_76f453b4_aFZ(zKP2, n, n2, n3, this.method_42ba3726_Dne(zKP2, this.field_3706cf9_Dne, n, n2, n3, 4));
        }
        if (n7 != 5 && (this.field_267d06_Qnq || zKP2.method_79d378f8_Dne(this.field_3706cf9_Dne, n + 1, n2, n3, 5))) {
            wAR.method_117d19ea_FWm(this.field_388da1_zGp < 1.0 ? n6 : zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n + 1, n2, n3));
            wAR.method_2c0148e6_Dne(f4, f4, f4);
            this.field_2e5f2c_bzF = n8 == 5;
            this.method_3fc2d5c2_zGp(zKP2, n, n2, n3, this.method_42ba3726_Dne(zKP2, this.field_3706cf9_Dne, n, n2, n3, 5));
        }
        this.field_2e5f2c_bzF = false;
        return true;
    }

    public boolean method_8ebefff1_Dne(tVs tVs2, int n, int n2, int n3) {
        boolean bl = false;
        int n4 = 0;
        for (int i = 0; i < 8; ++i) {
            int n5 = 0;
            int n6 = 1;
            if (i == 0) {
                n5 = 2;
            }
            if (i == 1) {
                n5 = 3;
            }
            if (i == 2) {
                n5 = 4;
            }
            if (i == 3) {
                n5 = 5;
                n6 = 2;
            }
            if (i == 4) {
                n5 = 6;
                n6 = 3;
            }
            if (i == 5) {
                n5 = 7;
                n6 = 5;
            }
            if (i == 6) {
                n5 = 6;
                n6 = 2;
            }
            if (i == 7) {
                n5 = 3;
            }
            float f = (float)n5 / 16.0f;
            float f2 = 1.0f - (float)n4 / 16.0f;
            float f3 = 1.0f - (float)(n4 + n6) / 16.0f;
            n4 += n6;
            this.method_adff145a_Dne(0.5f - f, f3, 0.5f - f, 0.5f + f, f2, 0.5f + f);
            this.method_9743b2ba_udO(tVs2, n, n2, n3);
        }
        bl = true;
        this.method_adff145a_Dne(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
        return bl;
    }

    public boolean method_379fc882_Qnq(zKP zKP2, int n, int n2, int n3, float f, float f2, float f3) {
        WAR wAR = WAR.field_36e5ca4_Dne;
        boolean bl = false;
        float f4 = 0.5f;
        float f5 = 1.0f;
        float f6 = 0.8f;
        float f7 = 0.6f;
        float f8 = f4 * f;
        float f9 = f5 * f;
        float f10 = f6 * f;
        float f11 = f7 * f;
        float f12 = f4 * f2;
        float f13 = f5 * f2;
        float f14 = f6 * f2;
        float f15 = f7 * f2;
        float f16 = f4 * f3;
        float f17 = f5 * f3;
        float f18 = f6 * f3;
        float f19 = f7 * f3;
        float f20 = 0.0625f;
        int n4 = zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3);
        if (this.field_267d06_Qnq || zKP2.method_79d378f8_Dne(this.field_3706cf9_Dne, n, n2 - 1, n3, 0)) {
            wAR.method_117d19ea_FWm(this.field_2e5f16_bzF > 0.0 ? n4 : zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2 - 1, n3));
            wAR.method_2c0148e6_Dne(f8, f12, f16);
            this.method_58bf1fba_Dne(zKP2, n, n2, n3, this.method_42ba3726_Dne(zKP2, this.field_3706cf9_Dne, n, n2, n3, 0));
            bl = true;
        }
        if (this.field_267d06_Qnq || zKP2.method_79d378f8_Dne(this.field_3706cf9_Dne, n, n2 + 1, n3, 1)) {
            wAR.method_117d19ea_FWm(this.field_267cf0_Qnq < 1.0 ? n4 : zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2 + 1, n3));
            wAR.method_2c0148e6_Dne(f9, f13, f17);
            this.method_d047827b_FWm(zKP2, n, n2, n3, this.method_42ba3726_Dne(zKP2, this.field_3706cf9_Dne, n, n2, n3, 1));
            bl = true;
        }
        if (this.field_267d06_Qnq || zKP2.method_79d378f8_Dne(this.field_3706cf9_Dne, n, n2, n3 - 1, 2)) {
            wAR.method_117d19ea_FWm(this.field_2d29ef_aFZ > 0.0 ? n4 : zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3 - 1));
            wAR.method_2c0148e6_Dne(f10, f14, f18);
            wAR.method_2b33899_bzF(0.0f, 0.0f, f20);
            this.method_e4fb4bad_bzF(zKP2, n, n2, n3, this.method_42ba3726_Dne(zKP2, this.field_3706cf9_Dne, n, n2, n3, 2));
            wAR.method_2b33899_bzF(0.0f, 0.0f, -f20);
            bl = true;
        }
        if (this.field_267d06_Qnq || zKP2.method_79d378f8_Dne(this.field_3706cf9_Dne, n, n2, n3 + 1, 3)) {
            wAR.method_117d19ea_FWm(this.field_388da1_zGp < 1.0 ? n4 : zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3 + 1));
            wAR.method_2c0148e6_Dne(f10, f14, f18);
            wAR.method_2b33899_bzF(0.0f, 0.0f, -f20);
            this.method_925c7e93_Qnq(zKP2, n, n2, n3, this.method_42ba3726_Dne(zKP2, this.field_3706cf9_Dne, n, n2, n3, 3));
            wAR.method_2b33899_bzF(0.0f, 0.0f, f20);
            bl = true;
        }
        if (this.field_267d06_Qnq || zKP2.method_79d378f8_Dne(this.field_3706cf9_Dne, n - 1, n2, n3, 4)) {
            wAR.method_117d19ea_FWm(this.field_2092a9_Dne > 0.0 ? n4 : zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n - 1, n2, n3));
            wAR.method_2c0148e6_Dne(f11, f15, f19);
            wAR.method_2b33899_bzF(f20, 0.0f, 0.0f);
            this.method_76f453b4_aFZ(zKP2, n, n2, n3, this.method_42ba3726_Dne(zKP2, this.field_3706cf9_Dne, n, n2, n3, 4));
            wAR.method_2b33899_bzF(-f20, 0.0f, 0.0f);
            bl = true;
        }
        if (this.field_267d06_Qnq || zKP2.method_79d378f8_Dne(this.field_3706cf9_Dne, n + 1, n2, n3, 5)) {
            wAR.method_117d19ea_FWm(this.field_212608_FWm < 1.0 ? n4 : zKP2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n + 1, n2, n3));
            wAR.method_2c0148e6_Dne(f11, f15, f19);
            wAR.method_2b33899_bzF(-f20, 0.0f, 0.0f);
            this.method_3fc2d5c2_zGp(zKP2, n, n2, n3, this.method_42ba3726_Dne(zKP2, this.field_3706cf9_Dne, n, n2, n3, 5));
            wAR.method_2b33899_bzF(f20, 0.0f, 0.0f);
            bl = true;
        }
        return bl;
    }

    private boolean method_a5c7ad92_Dne(aeV aeV2, int n, int n2, int n3) {
        float f;
        float f2;
        this.method_9743b2ba_udO(aeV2, n, n2, n3);
        WAR wAR = WAR.field_36e5ca4_Dne;
        wAR.method_117d19ea_FWm(aeV2.method_b34ae00f_bzF(this.field_3706cf9_Dne, n, n2, n3));
        float f3 = 1.0f;
        int n4 = aeV2.method_fbabf7e2_Dne(this.field_3706cf9_Dne, n, n2, n3);
        gDn gDn2 = this.method_5d830b5b_Dne(aeV2, 0);
        float f4 = (float)(n4 >> 16 & 0xFF) / 255.0f;
        float f5 = (float)(n4 >> 8 & 0xFF) / 255.0f;
        float f6 = (float)(n4 & 0xFF) / 255.0f;
        if (OEA.field_2092bf_Dne) {
            f2 = (f4 * 30.0f + f5 * 59.0f + f6 * 11.0f) / 100.0f;
            float f7 = (f4 * 30.0f + f5 * 70.0f) / 100.0f;
            f = (f4 * 30.0f + f6 * 70.0f) / 100.0f;
            f4 = f2;
            f5 = f7;
            f6 = f;
        }
        wAR.method_2c0148e6_Dne(f3 * f4, f3 * f5, f3 * f6);
        f2 = 0.1865f;
        this.method_3fc2d5c2_zGp(aeV2, (float)n - 0.5f + f2, n2, n3, gDn2);
        this.method_76f453b4_aFZ(aeV2, (float)n + 0.5f - f2, n2, n3, gDn2);
        this.method_925c7e93_Qnq(aeV2, n, n2, (float)n3 - 0.5f + f2, gDn2);
        this.method_e4fb4bad_bzF(aeV2, n, n2, (float)n3 + 0.5f - f2, gDn2);
        this.method_d047827b_FWm(aeV2, n, (float)n2 - 0.5f + f2 + 0.1875f, n3, this.method_39bcfb28_Dne(zKP.field_203836cc_FWm));
        int n5 = this.field_3706cf9_Dne.method_2dee76f_bzF(n, n2, n3);
        if (n5 != 0) {
            f = 0.0f;
            float f8 = 4.0f;
            float f9 = 0.0f;
            hbe hbe2 = null;
            switch (n5) {
                case 1: {
                    hbe2 = zKP.field_20306100_FWm;
                    break;
                }
                case 2: {
                    hbe2 = zKP.field_3769521_Dne;
                }
                default: {
                    break;
                }
                case 7: {
                    hbe2 = zKP.field_5e6003e8_Qnq;
                    break;
                }
                case 8: {
                    hbe2 = zKP.field_75be630e_bzF;
                }
            }
            wAR.method_2b33899_bzF(f / 16.0f, f8 / 16.0f, f9 / 16.0f);
            if (hbe2 != null) {
                this.method_5632927f_Dne(hbe2, n, n2, n3);
            } else if (n5 == 9) {
                this.field_267d06_Qnq = true;
                float f10 = 0.125f;
                this.method_adff145a_Dne(0.5f - f10, 0.0, 0.5f - f10, 0.5f + f10, 0.25, 0.5f + f10);
                this.method_9743b2ba_udO(zKP.field_27f261ab_XjO, n, n2, n3);
                this.method_adff145a_Dne(0.5f - f10, 0.25, 0.5f - f10, 0.5f + f10, 0.5, 0.5f + f10);
                this.method_9743b2ba_udO(zKP.field_27f261ab_XjO, n, n2, n3);
                this.method_adff145a_Dne(0.5f - f10, 0.5, 0.5f - f10, 0.5f + f10, 0.75, 0.5f + f10);
                this.method_9743b2ba_udO(zKP.field_27f261ab_XjO, n, n2, n3);
                this.field_267d06_Qnq = false;
                this.method_adff145a_Dne(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
            } else if (n5 == 3) {
                this.method_8b153e5d_Dne(zKP.field_7141ef33_aFZ, 0, n, n2, n3, 0.75f);
            } else if (n5 == 5) {
                this.method_8b153e5d_Dne(zKP.field_7141ef33_aFZ, 2, n, n2, n3, 0.75f);
            } else if (n5 == 4) {
                this.method_8b153e5d_Dne(zKP.field_7141ef33_aFZ, 1, n, n2, n3, 0.75f);
            } else if (n5 == 6) {
                this.method_8b153e5d_Dne(zKP.field_7141ef33_aFZ, 3, n, n2, n3, 0.75f);
            } else if (n5 == 11) {
                n4 = zKP.field_36dc147_Dne.method_fbabf7e2_Dne(this.field_3706cf9_Dne, n, n2, n3);
                f4 = (float)(n4 >> 16 & 0xFF) / 255.0f;
                f5 = (float)(n4 >> 8 & 0xFF) / 255.0f;
                f6 = (float)(n4 & 0xFF) / 255.0f;
                wAR.method_2c0148e6_Dne(f3 * f4, f3 * f5, f3 * f6);
                this.method_8b153e5d_Dne(zKP.field_36dc147_Dne, 2, n, n2, n3, 0.75f);
            } else if (n5 == 10) {
                this.method_8b153e5d_Dne(zKP.field_373e079_Dne, 2, n, n2, n3, 0.75f);
            }
            wAR.method_2b33899_bzF(-f / 16.0f, -f8 / 16.0f, -f9 / 16.0f);
        }
        return true;
    }

    public zVu(Zpi zpi) {
        this.field_3706cf9_Dne = zpi;
        this.field_493682ed_Dne = Minecraft.method_81a5f12e_Dne();
    }

    public boolean method_df56d9a5_trS(zKP zKP2, int n, int n2, int n3) {
        int n4 = this.field_3706cf9_Dne.method_2dee76f_bzF(n, n2, n3);
        if (n4 == 3) {
            this.field_2092ae_Dne = 1;
            this.field_21260d_FWm = 1;
            this.field_2d29f4_aFZ = 1;
            this.field_388da6_zGp = 1;
        } else if (n4 == 4) {
            this.field_2e5f1b_bzF = 1;
            this.field_267cf5_Qnq = 1;
        }
        boolean bl = this.method_9743b2ba_udO(zKP2, n, n2, n3);
        this.field_2e5f1b_bzF = 0;
        this.field_2092ae_Dne = 0;
        this.field_21260d_FWm = 0;
        this.field_267cf5_Qnq = 0;
        this.field_2d29f4_aFZ = 0;
        this.field_388da6_zGp = 0;
        return bl;
    }
}

