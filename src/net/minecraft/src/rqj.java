package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.ARBOcclusionQuery;
import org.lwjgl.opengl.GL11;

public class rqj
implements IjH {
    private int field_215b36_FfS;
    public List field_f27c122c_Dne = new ArrayList();
    int[] field_3f1c589_Dne;
    private ofu[] field_83702209_Dne;
    private int field_20b857_DyG;
    private IntBuffer field_5a1a3784_FWm;
    private Map field_83b1c1b0_Dne;
    private List field_7eb83e1f_bzF;
    private int field_26818f_RPx;
    private int field_3393dd_oIf;
    private snt[] field_fdf1c16f_FWm;
    private Minecraft field_493682ed_Dne;
    double field_2092a9_Dne = -9999.0;
    private int field_2f0dd8_div;
    private int field_1ed017_ATE;
    private int field_388da6_zGp = 0;
    private int field_2d29f4_aFZ;
    private int field_2a9ad6_Zpi;
    double field_212608_FWm = -9999.0;
    private int field_28e7fd_Vxn;
    private VzZ field_36ebf36_Dne;
    private zVu field_37e98b3_Dne;
    private snt[] field_8372116e_Dne;
    private int field_2569d5_OdI;
    private int field_267cf5_Qnq;
    private int field_348572_qLR = 2;
    double field_2e5f16_bzF = -9999.0;
    private int field_342264_ooe;
    private int field_36e4da_vSL;
    private gDn[] field_836bfe96_Dne;
    private List field_6a0474ed_FWm = new ArrayList();
    private int field_367154_trS = -1;
    private int field_2e8486_ceE;
    private int field_2e5f1b_bzF;
    private int field_31b816_kGO;
    private int field_21260d_FWm;
    private boolean field_2092bf_Dne = false;
    int field_2092ae_Dne = 0;
    private final Snh field_36d36bf_Dne;
    private int field_212c1b_EyB;
    private int field_36b0a9_udO;
    private int field_22c602_IjH;
    private int field_217c26_Fnk;
    private int field_33448c_mrb;
    IntBuffer field_76f31d43_Dne;
    private int field_29186d_XHL;

    public boolean method_50a172a0_Dne(double d, double d2, double d3, float f) {
        return false;
    }

    public void method_cda816a_Dne(IPx iPx, float f) {
        for (int i = 0; i < this.field_fdf1c16f_FWm.length; ++i) {
            if (this.field_fdf1c16f_FWm[i].method_7a46289e_Dne() || this.field_fdf1c16f_FWm[i].field_2092bf_Dne && (i + this.field_2092ae_Dne & 0xF) != 0) continue;
            this.field_fdf1c16f_FWm[i].method_74070916_Dne(iPx);
        }
        ++this.field_2092ae_Dne;
    }

    public void method_845caac7_Dne(Rbp rbp) {
        this.field_836bfe96_Dne = new gDn[10];
        for (int i = 0; i < this.field_836bfe96_Dne.length; ++i) {
            this.field_836bfe96_Dne[i] = rbp.method_285881e4_Dne("destroy_" + i);
        }
    }

    private void method_2dee77c_bzF(int n, int n2, int n3) {
        n -= 8;
        n2 -= 8;
        n3 -= 8;
        this.field_33448c_mrb = Integer.MAX_VALUE;
        this.field_29186d_XHL = Integer.MAX_VALUE;
        this.field_2a9ad6_Zpi = Integer.MAX_VALUE;
        this.field_31b816_kGO = Integer.MIN_VALUE;
        this.field_36b0a9_udO = Integer.MIN_VALUE;
        this.field_342264_ooe = Integer.MIN_VALUE;
        int n4 = this.field_21260d_FWm * 16;
        int n5 = n4 / 2;
        for (int i = 0; i < this.field_21260d_FWm; ++i) {
            int n6 = i * 16;
            int n7 = n6 + n5 - n;
            if (n7 < 0) {
                n7 -= n4 - 1;
            }
            if ((n6 -= (n7 /= n4) * n4) < this.field_33448c_mrb) {
                this.field_33448c_mrb = n6;
            }
            if (n6 > this.field_31b816_kGO) {
                this.field_31b816_kGO = n6;
            }
            for (int j = 0; j < this.field_267cf5_Qnq; ++j) {
                int n8 = j * 16;
                int n9 = n8 + n5 - n3;
                if (n9 < 0) {
                    n9 -= n4 - 1;
                }
                if ((n8 -= (n9 /= n4) * n4) < this.field_2a9ad6_Zpi) {
                    this.field_2a9ad6_Zpi = n8;
                }
                if (n8 > this.field_342264_ooe) {
                    this.field_342264_ooe = n8;
                }
                for (int k = 0; k < this.field_2e5f1b_bzF; ++k) {
                    int n10 = k * 16;
                    if (n10 < this.field_29186d_XHL) {
                        this.field_29186d_XHL = n10;
                    }
                    if (n10 > this.field_36b0a9_udO) {
                        this.field_36b0a9_udO = n10;
                    }
                    snt snt2 = this.field_fdf1c16f_FWm[(j * this.field_2e5f1b_bzF + k) * this.field_21260d_FWm + i];
                    boolean bl = snt2.field_21261e_FWm;
                    snt2.method_2c2cf7c9_Dne(n6, n10, n8);
                    if (bl || !snt2.field_21261e_FWm) continue;
                    this.field_6a0474ed_FWm.add(snt2);
                }
            }
        }
    }

    @Override
    public void method_c6b5263a_Dne(int n, int n2, int n3, int n4, int n5, int n6) {
        this.method_17d7ea99_FWm(n - 1, n2 - 1, n3 - 1, n4 + 1, n5 + 1, n6 + 1);
    }

    public boolean method_740bedaa_Dne(FUH fUH, boolean bl) {
        snt snt2;
        int n;
        int n2;
        int n3;
        snt snt3;
        int n4;
        int n5 = 2;
        hAV hAV2 = new hAV(fUH);
        snt[] sntArray = new snt[n5];
        ArrayList<snt> arrayList = null;
        int n6 = this.field_6a0474ed_FWm.size();
        int n7 = 0;
        this.field_36ebf36_Dne.field_365731d_Dne.method_8f501fe4_Dne("nearChunksSearch");
        block0: for (n4 = 0; n4 < n6; ++n4) {
            snt3 = (snt)this.field_6a0474ed_FWm.get(n4);
            if (snt3 == null) continue;
            if (!bl) {
                if (snt3.method_bb7dd810_Dne(fUH) > 256.0f) {
                    for (n3 = 0; n3 < n5 && (sntArray[n3] == null || hAV2.method_a9ca690d_Dne(sntArray[n3], snt3) <= 0); ++n3) {
                    }
                    if (--n3 <= 0) continue;
                    n2 = n3;
                    while (true) {
                        if (--n2 == 0) {
                            sntArray[n3] = snt3;
                            continue block0;
                        }
                        sntArray[n2 - 1] = sntArray[n2];
                    }
                }
            } else if (!snt3.field_2092bf_Dne) continue;
            if (arrayList == null) {
                arrayList = new ArrayList<snt>();
            }
            ++n7;
            arrayList.add(snt3);
            this.field_6a0474ed_FWm.set(n4, null);
        }
        this.field_36ebf36_Dne.field_365731d_Dne.method_7c6f6039_FWm();
        this.field_36ebf36_Dne.field_365731d_Dne.method_8f501fe4_Dne("sort");
        if (arrayList != null) {
            if (arrayList.size() > 1) {
                Collections.sort(arrayList, hAV2);
            }
            for (n4 = arrayList.size() - 1; n4 >= 0; --n4) {
                snt3 = (snt)arrayList.get(n4);
                snt3.method_7a46289a_Dne();
                snt3.field_21261e_FWm = false;
            }
        }
        this.field_36ebf36_Dne.field_365731d_Dne.method_7c6f6039_FWm();
        n4 = 0;
        this.field_36ebf36_Dne.field_365731d_Dne.method_8f501fe4_Dne("rebuild");
        for (n = n5 - 1; n >= 0; --n) {
            snt2 = sntArray[n];
            if (snt2 == null) continue;
            if (!snt2.field_2092bf_Dne && n != n5 - 1) {
                sntArray[n] = null;
                sntArray[0] = null;
                break;
            }
            sntArray[n].method_7a46289a_Dne();
            sntArray[n].field_21261e_FWm = false;
            ++n4;
        }
        this.field_36ebf36_Dne.field_365731d_Dne.method_7c6f6039_FWm();
        this.field_36ebf36_Dne.field_365731d_Dne.method_8f501fe4_Dne("cleanup");
        n3 = 0;
        n2 = this.field_6a0474ed_FWm.size();
        for (n = 0; n != n2; ++n) {
            snt2 = (snt)this.field_6a0474ed_FWm.get(n);
            if (snt2 == null) continue;
            boolean bl2 = false;
            for (int i = 0; i < n5 && !bl2; ++i) {
                if (snt2 != sntArray[i]) continue;
                bl2 = true;
            }
            if (bl2) continue;
            if (n3 != n) {
                this.field_6a0474ed_FWm.set(n3, snt2);
            }
            ++n3;
        }
        this.field_36ebf36_Dne.field_365731d_Dne.method_7c6f6039_FWm();
        this.field_36ebf36_Dne.field_365731d_Dne.method_8f501fe4_Dne("trim");
        while (true) {
            if (--n < n3) {
                this.field_36ebf36_Dne.field_365731d_Dne.method_7c6f6039_FWm();
                return n6 == n7 + n4;
            }
            this.field_6a0474ed_FWm.remove(n);
        }
    }

    public void method_dfa257ad_Dne(FiG fiG, wHH wHH2, int n, NMq nMq, float f) {
        WAR wAR = WAR.field_36e5ca4_Dne;
        GL11.glEnable(3042);
        GL11.glEnable(3008);
        GL11.glBlendFunc(770, 1);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, (geR.method_ce7f5256_Dne((float)Minecraft.method_7a46288e_Dne() / 100.0f) * 0.2f + 0.4f) * 0.5f);
        if (n != 0 && nMq != null) {
            GL11.glBlendFunc(770, 771);
            float f2 = geR.method_ce7f5256_Dne((float)Minecraft.method_7a46288e_Dne() / 100.0f) * 0.2f + 0.8f;
            GL11.glColor4f(f2, f2, f2, geR.method_ce7f5256_Dne((float)Minecraft.method_7a46288e_Dne() / 200.0f) * 0.2f + 0.5f);
            this.field_36d36bf_Dne.method_8f501fe4_Dne("/terrain.png");
        }
        GL11.glDisable(3042);
        GL11.glDisable(3008);
    }

    public void method_143f92d9_bzF(float f) {
        float f2;
        float f3;
        float f4;
        GL11.glDisable(2884);
        float f5 = (float)(this.field_493682ed_Dne.field_366ec33_Dne.field_34225f_ooe + (this.field_493682ed_Dne.field_366ec33_Dne.field_22c5fd_IjH - this.field_493682ed_Dne.field_366ec33_Dne.field_34225f_ooe) * (double)f);
        WAR wAR = WAR.field_36e5ca4_Dne;
        float f6 = 12.0f;
        float f7 = 4.0f;
        double d = (float)this.field_388da6_zGp + f;
        double d2 = (this.field_493682ed_Dne.field_366ec33_Dne.field_2d29ef_aFZ + (this.field_493682ed_Dne.field_366ec33_Dne.field_2f0dd3_div - this.field_493682ed_Dne.field_366ec33_Dne.field_2d29ef_aFZ) * (double)f + d * (double)0.03f) / (double)f6;
        double d3 = (this.field_493682ed_Dne.field_366ec33_Dne.field_20b852_DyG + (this.field_493682ed_Dne.field_366ec33_Dne.field_334487_mrb - this.field_493682ed_Dne.field_366ec33_Dne.field_20b852_DyG) * (double)f) / (double)f6 + (double)0.33f;
        float f8 = this.field_36ebf36_Dne.field_3690d00_Dne.method_7a46288a_Dne() - f5 + 0.33f;
        int n = geR.method_117d0718_FWm(d2 / 2048.0);
        int n2 = geR.method_117d0718_FWm(d3 / 2048.0);
        d2 -= (double)(n * 2048);
        d3 -= (double)(n2 * 2048);
        this.field_36d36bf_Dne.method_8f501fe4_Dne("/environment/clouds.png");
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        chN chN2 = this.field_36ebf36_Dne.method_ffc5552e_Dne(f);
        float f9 = (float)chN2.field_2092a9_Dne;
        float f10 = (float)chN2.field_212608_FWm;
        float f11 = (float)chN2.field_2e5f16_bzF;
        if (this.field_493682ed_Dne.field_3758af7_Dne.field_2e5f2c_bzF) {
            f4 = (f9 * 30.0f + f10 * 59.0f + f11 * 11.0f) / 100.0f;
            f3 = (f9 * 30.0f + f10 * 70.0f) / 100.0f;
            f2 = (f9 * 30.0f + f11 * 70.0f) / 100.0f;
            f9 = f4;
            f10 = f3;
            f11 = f2;
        }
        f4 = (float)(d2 * 0.0);
        f3 = (float)(d3 * 0.0);
        f2 = 0.00390625f;
        f4 = (float)geR.method_117d0718_FWm(d2) * f2;
        f3 = (float)geR.method_117d0718_FWm(d3) * f2;
        float f12 = (float)(d2 - (double)geR.method_117d0718_FWm(d2));
        float f13 = (float)(d3 - (double)geR.method_117d0718_FWm(d3));
        int n3 = 8;
        int n4 = 4;
        float f14 = 9.765625E-4f;
        GL11.glScalef(f6, 1.0f, f6);
        for (int i = 0; i < 2; ++i) {
            if (i == 0) {
                GL11.glColorMask(false, false, false, false);
            } else if (this.field_493682ed_Dne.field_3758af7_Dne.field_2e5f2c_bzF) {
                if (OEA.field_2092ae_Dne == 0) {
                    GL11.glColorMask(false, true, true, true);
                } else {
                    GL11.glColorMask(true, false, false, true);
                }
            } else {
                GL11.glColorMask(true, true, true, true);
            }
            for (int j = -n4 + 1; j <= n4; ++j) {
                for (int k = -n4 + 1; k <= n4; ++k) {
                    int n5;
                    wAR.method_7a46289a_Dne();
                    float f15 = j * n3;
                    float f16 = k * n3;
                    float f17 = f15 - f12;
                    float f18 = f16 - f13;
                    if (f8 > -f7 - 1.0f) {
                        wAR.method_54283b9a_Dne(f9 * 0.7f, f10 * 0.7f, f11 * 0.7f, 0.8f);
                        wAR.method_a680f8e7_FWm(0.0f, -1.0f, 0.0f);
                        wAR.method_c38c5864_Dne(f17 + 0.0f, f8 + 0.0f, f18 + (float)n3, (f15 + 0.0f) * f2 + f4, (f16 + (float)n3) * f2 + f3);
                        wAR.method_c38c5864_Dne(f17 + (float)n3, f8 + 0.0f, f18 + (float)n3, (f15 + (float)n3) * f2 + f4, (f16 + (float)n3) * f2 + f3);
                        wAR.method_c38c5864_Dne(f17 + (float)n3, f8 + 0.0f, f18 + 0.0f, (f15 + (float)n3) * f2 + f4, (f16 + 0.0f) * f2 + f3);
                        wAR.method_c38c5864_Dne(f17 + 0.0f, f8 + 0.0f, f18 + 0.0f, (f15 + 0.0f) * f2 + f4, (f16 + 0.0f) * f2 + f3);
                    }
                    if (f8 <= f7 + 1.0f) {
                        wAR.method_54283b9a_Dne(f9, f10, f11, 0.8f);
                        wAR.method_a680f8e7_FWm(0.0f, 1.0f, 0.0f);
                        wAR.method_c38c5864_Dne(f17 + 0.0f, f8 + f7 - f14, f18 + (float)n3, (f15 + 0.0f) * f2 + f4, (f16 + (float)n3) * f2 + f3);
                        wAR.method_c38c5864_Dne(f17 + (float)n3, f8 + f7 - f14, f18 + (float)n3, (f15 + (float)n3) * f2 + f4, (f16 + (float)n3) * f2 + f3);
                        wAR.method_c38c5864_Dne(f17 + (float)n3, f8 + f7 - f14, f18 + 0.0f, (f15 + (float)n3) * f2 + f4, (f16 + 0.0f) * f2 + f3);
                        wAR.method_c38c5864_Dne(f17 + 0.0f, f8 + f7 - f14, f18 + 0.0f, (f15 + 0.0f) * f2 + f4, (f16 + 0.0f) * f2 + f3);
                    }
                    wAR.method_54283b9a_Dne(f9 * 0.9f, f10 * 0.9f, f11 * 0.9f, 0.8f);
                    if (j > -1) {
                        wAR.method_a680f8e7_FWm(-1.0f, 0.0f, 0.0f);
                        for (n5 = 0; n5 < n3; ++n5) {
                            wAR.method_c38c5864_Dne(f17 + (float)n5 + 0.0f, f8 + 0.0f, f18 + (float)n3, (f15 + (float)n5 + 0.5f) * f2 + f4, (f16 + (float)n3) * f2 + f3);
                            wAR.method_c38c5864_Dne(f17 + (float)n5 + 0.0f, f8 + f7, f18 + (float)n3, (f15 + (float)n5 + 0.5f) * f2 + f4, (f16 + (float)n3) * f2 + f3);
                            wAR.method_c38c5864_Dne(f17 + (float)n5 + 0.0f, f8 + f7, f18 + 0.0f, (f15 + (float)n5 + 0.5f) * f2 + f4, (f16 + 0.0f) * f2 + f3);
                            wAR.method_c38c5864_Dne(f17 + (float)n5 + 0.0f, f8 + 0.0f, f18 + 0.0f, (f15 + (float)n5 + 0.5f) * f2 + f4, (f16 + 0.0f) * f2 + f3);
                        }
                    }
                    if (j <= 1) {
                        wAR.method_a680f8e7_FWm(1.0f, 0.0f, 0.0f);
                        for (n5 = 0; n5 < n3; ++n5) {
                            wAR.method_c38c5864_Dne(f17 + (float)n5 + 1.0f - f14, f8 + 0.0f, f18 + (float)n3, (f15 + (float)n5 + 0.5f) * f2 + f4, (f16 + (float)n3) * f2 + f3);
                            wAR.method_c38c5864_Dne(f17 + (float)n5 + 1.0f - f14, f8 + f7, f18 + (float)n3, (f15 + (float)n5 + 0.5f) * f2 + f4, (f16 + (float)n3) * f2 + f3);
                            wAR.method_c38c5864_Dne(f17 + (float)n5 + 1.0f - f14, f8 + f7, f18 + 0.0f, (f15 + (float)n5 + 0.5f) * f2 + f4, (f16 + 0.0f) * f2 + f3);
                            wAR.method_c38c5864_Dne(f17 + (float)n5 + 1.0f - f14, f8 + 0.0f, f18 + 0.0f, (f15 + (float)n5 + 0.5f) * f2 + f4, (f16 + 0.0f) * f2 + f3);
                        }
                    }
                    wAR.method_54283b9a_Dne(f9 * 0.8f, f10 * 0.8f, f11 * 0.8f, 0.8f);
                    if (k > -1) {
                        wAR.method_a680f8e7_FWm(0.0f, 0.0f, -1.0f);
                        for (n5 = 0; n5 < n3; ++n5) {
                            wAR.method_c38c5864_Dne(f17 + 0.0f, f8 + f7, f18 + (float)n5 + 0.0f, (f15 + 0.0f) * f2 + f4, (f16 + (float)n5 + 0.5f) * f2 + f3);
                            wAR.method_c38c5864_Dne(f17 + (float)n3, f8 + f7, f18 + (float)n5 + 0.0f, (f15 + (float)n3) * f2 + f4, (f16 + (float)n5 + 0.5f) * f2 + f3);
                            wAR.method_c38c5864_Dne(f17 + (float)n3, f8 + 0.0f, f18 + (float)n5 + 0.0f, (f15 + (float)n3) * f2 + f4, (f16 + (float)n5 + 0.5f) * f2 + f3);
                            wAR.method_c38c5864_Dne(f17 + 0.0f, f8 + 0.0f, f18 + (float)n5 + 0.0f, (f15 + 0.0f) * f2 + f4, (f16 + (float)n5 + 0.5f) * f2 + f3);
                        }
                    }
                    if (k <= 1) {
                        wAR.method_a680f8e7_FWm(0.0f, 0.0f, 1.0f);
                        for (n5 = 0; n5 < n3; ++n5) {
                            wAR.method_c38c5864_Dne(f17 + 0.0f, f8 + f7, f18 + (float)n5 + 1.0f - f14, (f15 + 0.0f) * f2 + f4, (f16 + (float)n5 + 0.5f) * f2 + f3);
                            wAR.method_c38c5864_Dne(f17 + (float)n3, f8 + f7, f18 + (float)n5 + 1.0f - f14, (f15 + (float)n3) * f2 + f4, (f16 + (float)n5 + 0.5f) * f2 + f3);
                            wAR.method_c38c5864_Dne(f17 + (float)n3, f8 + 0.0f, f18 + (float)n5 + 1.0f - f14, (f15 + (float)n3) * f2 + f4, (f16 + (float)n5 + 0.5f) * f2 + f3);
                            wAR.method_c38c5864_Dne(f17 + 0.0f, f8 + 0.0f, f18 + (float)n5 + 1.0f - f14, (f15 + 0.0f) * f2 + f4, (f16 + (float)n5 + 0.5f) * f2 + f3);
                        }
                    }
                    wAR.method_7a46288d_Dne();
                }
            }
        }
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glDisable(3042);
        GL11.glEnable(2884);
    }

    @Override
    public void method_2c2cf7c9_Dne(int n, int n2, int n3) {
        this.method_17d7ea99_FWm(n - 1, n2 - 1, n3 - 1, n + 1, n2 + 1, n3 + 1);
    }

    public CAZ method_8538c319_Dne(String string, double d, double d2, double d3, double d4, double d5, double d6) {
        if (this.field_493682ed_Dne != null && this.field_493682ed_Dne.field_366ec33_Dne != null && this.field_493682ed_Dne.field_364ffb6_Dne != null) {
            int n = this.field_493682ed_Dne.field_3758af7_Dne.field_33448c_mrb;
            if (n == 1 && this.field_36ebf36_Dne.field_7331eae7_Dne.nextInt(3) == 0) {
                n = 2;
            }
            double d7 = this.field_493682ed_Dne.field_366ec33_Dne.field_2f0dd3_div - d;
            double d8 = this.field_493682ed_Dne.field_366ec33_Dne.field_22c5fd_IjH - d2;
            double d9 = this.field_493682ed_Dne.field_366ec33_Dne.field_334487_mrb - d3;
            CAZ cAZ = null;
            if (string.equals("hugeexplosion")) {
                cAZ = new Rtm(this.field_36ebf36_Dne, d, d2, d3, d4, d5, d6);
                this.field_493682ed_Dne.field_364ffb6_Dne.method_68e8f1ab_Dne(cAZ);
            } else if (string.equals("largeexplode")) {
                cAZ = new dfd(this.field_36d36bf_Dne, this.field_36ebf36_Dne, d, d2, d3, d4, d5, d6);
                this.field_493682ed_Dne.field_364ffb6_Dne.method_68e8f1ab_Dne(cAZ);
            } else if (string.equals("fireworksSpark")) {
                cAZ = new HkG(this.field_36ebf36_Dne, d, d2, d3, d4, d5, d6, this.field_493682ed_Dne.field_364ffb6_Dne);
                this.field_493682ed_Dne.field_364ffb6_Dne.method_68e8f1ab_Dne(cAZ);
            }
            if (cAZ != null) {
                return cAZ;
            }
            double d10 = 16.0;
            if (d7 * d7 + d8 * d8 + d9 * d9 > d10 * d10) {
                return null;
            }
            if (n > 1) {
                return null;
            }
            if (string.equals("bubble")) {
                cAZ = new gwy(this.field_36ebf36_Dne, d, d2, d3, d4, d5, d6);
            } else if (string.equals("suspended")) {
                cAZ = new tvf(this.field_36ebf36_Dne, d, d2, d3, d4, d5, d6);
            } else if (string.equals("depthsuspend")) {
                cAZ = new ywl(this.field_36ebf36_Dne, d, d2, d3, d4, d5, d6);
            } else if (string.equals("townaura")) {
                cAZ = new ywl(this.field_36ebf36_Dne, d, d2, d3, d4, d5, d6);
            } else if (string.equals("crit")) {
                cAZ = new KUG(this.field_36ebf36_Dne, d, d2, d3, d4, d5, d6);
            } else if (string.equals("magicCrit")) {
                cAZ = new KUG(this.field_36ebf36_Dne, d, d2, d3, d4, d5, d6);
                cAZ.method_2c0148e6_Dne(cAZ.method_590ca08_b_() * 0.3f, cAZ.method_7c6f6029_FWm() * 0.8f, cAZ.method_ae128db7_bzF());
                cAZ.method_ae128dc7_bzF();
            } else if (string.equals("smoke")) {
                cAZ = new bsu(this.field_36ebf36_Dne, d, d2, d3, d4, d5, d6);
            } else if (string.equals("mobSpell")) {
                cAZ = new Cbk(this.field_36ebf36_Dne, d, d2, d3, 0.0, 0.0, 0.0);
                cAZ.method_2c0148e6_Dne((float)d4, (float)d5, (float)d6);
            } else if (string.equals("mobSpellAmbient")) {
                cAZ = new Cbk(this.field_36ebf36_Dne, d, d2, d3, 0.0, 0.0, 0.0);
                cAZ.method_aad40809_a_(0.15f);
                cAZ.method_2c0148e6_Dne((float)d4, (float)d5, (float)d6);
            } else if (string.equals("spell")) {
                cAZ = new Cbk(this.field_36ebf36_Dne, d, d2, d3, d4, d5, d6);
            } else if (string.equals("instantSpell")) {
                cAZ = new Cbk(this.field_36ebf36_Dne, d, d2, d3, d4, d5, d6);
                ((Cbk)cAZ).method_ce7f5da9_Dne(144);
            } else if (string.equals("witchMagic")) {
                cAZ = new Cbk(this.field_36ebf36_Dne, d, d2, d3, d4, d5, d6);
                ((Cbk)cAZ).method_ce7f5da9_Dne(144);
                float f = this.field_36ebf36_Dne.field_7331eae7_Dne.nextFloat() * 0.5f + 0.35f;
                cAZ.method_2c0148e6_Dne(1.0f * f, 0.0f * f, 1.0f * f);
            } else if (string.equals("note")) {
                cAZ = new RlB(this.field_36ebf36_Dne, d, d2, d3, d4, d5, d6);
            } else if (string.equals("portal")) {
                cAZ = new kPv(this.field_36ebf36_Dne, d, d2, d3, d4, d5, d6);
            } else if (string.equals("enchantmenttable")) {
                cAZ = new NYy(this.field_36ebf36_Dne, d, d2, d3, d4, d5, d6);
            } else if (string.equals("explode")) {
                cAZ = new JTe(this.field_36ebf36_Dne, d, d2, d3, d4, d5, d6);
            } else if (string.equals("flame")) {
                cAZ = new FXJ(this.field_36ebf36_Dne, d, d2, d3, d4, d5, d6);
            } else if (string.equals("lava")) {
                cAZ = new asS(this.field_36ebf36_Dne, d, d2, d3);
            } else if (string.equals("footstep")) {
                cAZ = new bHB(this.field_36d36bf_Dne, this.field_36ebf36_Dne, d, d2, d3);
            } else if (string.equals("splash")) {
                cAZ = new ReK(this.field_36ebf36_Dne, d, d2, d3, d4, d5, d6);
            } else if (string.equals("largesmoke")) {
                cAZ = new bsu(this.field_36ebf36_Dne, d, d2, d3, d4, d5, d6, 2.5f);
            } else if (string.equals("cloud")) {
                cAZ = new Cch(this.field_36ebf36_Dne, d, d2, d3, d4, d5, d6);
            } else if (string.equals("reddust")) {
                cAZ = new dhs_0((Qnq)this.field_36ebf36_Dne, d, d2, d3, (float)d4, (float)d5, (float)d6);
            } else if (string.equals("snowballpoof")) {
                cAZ = new gwo(this.field_36ebf36_Dne, d, d2, d3, dEr.field_4817800a_iNQ, this.field_36d36bf_Dne);
            } else if (string.equals("dripWater")) {
                cAZ = new lMw(this.field_36ebf36_Dne, d, d2, d3, KFd.field_1411d34d_div);
            } else if (string.equals("dripLava")) {
                cAZ = new lMw(this.field_36ebf36_Dne, d, d2, d3, KFd.field_5b96677_IjH);
            } else if (string.equals("snowshovel")) {
                cAZ = new DwD(this.field_36ebf36_Dne, d, d2, d3, d4, d5, d6);
            } else if (string.equals("slime")) {
                cAZ = new gwo(this.field_36ebf36_Dne, d, d2, d3, dEr.field_20b3be69_jBE, this.field_36d36bf_Dne);
            } else if (string.equals("heart")) {
                cAZ = new BRZ(this.field_36ebf36_Dne, d, d2, d3, d4, d5, d6);
            } else if (string.equals("angryVillager")) {
                cAZ = new BRZ(this.field_36ebf36_Dne, d, d2 + 0.5, d3, d4, d5, d6);
                cAZ.method_143f9e1c_bzF(81);
                cAZ.method_2c0148e6_Dne(1.0f, 1.0f, 1.0f);
            } else if (string.equals("happyVillager")) {
                cAZ = new ywl(this.field_36ebf36_Dne, d, d2, d3, d4, d5, d6);
                cAZ.method_143f9e1c_bzF(82);
                cAZ.method_2c0148e6_Dne(1.0f, 1.0f, 1.0f);
            } else if (string.startsWith("iconcrack_")) {
                int n2 = Integer.parseInt(string.substring(string.indexOf("_") + 1));
                cAZ = new gwo(this.field_36ebf36_Dne, d, d2, d3, d4, d5, d6, dEr.field_836aa5b6_Dne[n2], this.field_36d36bf_Dne);
            } else if (string.startsWith("tilecrack_")) {
                String[] stringArray = string.split("_", 3);
                int n3 = Integer.parseInt(stringArray[1]);
                int n4 = Integer.parseInt(stringArray[2]);
                cAZ = new gWM(this.field_36ebf36_Dne, d, d2, d3, d4, d5, d6, zKP.field_8374b848_Dne[n3], 0, n4, this.field_36d36bf_Dne).method_9e79987d_Dne(n4);
            }
            if (cAZ != null) {
                this.field_493682ed_Dne.field_364ffb6_Dne.method_68e8f1ab_Dne(cAZ);
            }
            return cAZ;
        }
        return null;
    }

    public void method_117d0ea7_FWm(float f) {
        if (this.field_493682ed_Dne.field_36ebf36_Dne.field_3690d00_Dne.method_7a46289e_Dne()) {
            if (this.field_493682ed_Dne.field_3758af7_Dne.field_2d2a05_aFZ) {
                this.method_143f92d9_bzF(f);
            } else {
                float f2;
                GL11.glDisable(2884);
                float f3 = (float)(this.field_493682ed_Dne.field_366ec33_Dne.field_34225f_ooe + (this.field_493682ed_Dne.field_366ec33_Dne.field_22c5fd_IjH - this.field_493682ed_Dne.field_366ec33_Dne.field_34225f_ooe) * (double)f);
                int n = 32;
                int n2 = 256 / n;
                WAR wAR = WAR.field_36e5ca4_Dne;
                this.field_36d36bf_Dne.method_8f501fe4_Dne("/environment/clouds.png");
                GL11.glEnable(3042);
                GL11.glBlendFunc(770, 771);
                chN chN2 = this.field_36ebf36_Dne.method_ffc5552e_Dne(f);
                float f4 = (float)chN2.field_2092a9_Dne;
                float f5 = (float)chN2.field_212608_FWm;
                float f6 = (float)chN2.field_2e5f16_bzF;
                if (this.field_493682ed_Dne.field_3758af7_Dne.field_2e5f2c_bzF) {
                    f2 = (f4 * 30.0f + f5 * 59.0f + f6 * 11.0f) / 100.0f;
                    float f7 = (f4 * 30.0f + f5 * 70.0f) / 100.0f;
                    float f8 = (f4 * 30.0f + f6 * 70.0f) / 100.0f;
                    f4 = f2;
                    f5 = f7;
                    f6 = f8;
                }
                f2 = 4.8828125E-4f;
                double d = (float)this.field_388da6_zGp + f;
                double d2 = this.field_493682ed_Dne.field_366ec33_Dne.field_2d29ef_aFZ + (this.field_493682ed_Dne.field_366ec33_Dne.field_2f0dd3_div - this.field_493682ed_Dne.field_366ec33_Dne.field_2d29ef_aFZ) * (double)f + d * (double)0.03f;
                double d3 = this.field_493682ed_Dne.field_366ec33_Dne.field_20b852_DyG + (this.field_493682ed_Dne.field_366ec33_Dne.field_334487_mrb - this.field_493682ed_Dne.field_366ec33_Dne.field_20b852_DyG) * (double)f;
                int n3 = geR.method_117d0718_FWm(d2 / 2048.0);
                int n4 = geR.method_117d0718_FWm(d3 / 2048.0);
                float f9 = this.field_36ebf36_Dne.field_3690d00_Dne.method_7a46288a_Dne() - f3 + 0.33f;
                float f10 = (float)((d2 -= (double)(n3 * 2048)) * (double)f2);
                float f11 = (float)((d3 -= (double)(n4 * 2048)) * (double)f2);
                wAR.method_7a46289a_Dne();
                wAR.method_54283b9a_Dne(f4, f5, f6, 0.8f);
                for (int i = -n * n2; i < n * n2; i += n) {
                    for (int j = -n * n2; j < n * n2; j += n) {
                        wAR.method_c38c5864_Dne(i + 0, f9, j + n, (float)(i + 0) * f2 + f10, (float)(j + n) * f2 + f11);
                        wAR.method_c38c5864_Dne(i + n, f9, j + n, (float)(i + n) * f2 + f10, (float)(j + n) * f2 + f11);
                        wAR.method_c38c5864_Dne(i + n, f9, j + 0, (float)(i + n) * f2 + f10, (float)(j + 0) * f2 + f11);
                        wAR.method_c38c5864_Dne(i + 0, f9, j + 0, (float)(i + 0) * f2 + f10, (float)(j + 0) * f2 + f11);
                    }
                }
                wAR.method_7a46288d_Dne();
                GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                GL11.glDisable(3042);
                GL11.glEnable(2884);
            }
        }
    }

    @Override
    public void method_94d18be1_FWm(sMa sMa2) {
        if (sMa2.field_569fcf45_Dne != null) {
            this.field_36d36bf_Dne.method_110c4dc3_FWm(sMa2.field_569fcf45_Dne);
        }
        if (sMa2.field_d9a85c6_FWm != null) {
            this.field_36d36bf_Dne.method_110c4dc3_FWm(sMa2.field_d9a85c6_FWm);
        }
    }

    @Override
    public void method_676c4f9a_Dne(String string, double d, double d2, double d3, float f, float f2) {
    }

    public void method_7a46289a_Dne() {
        if (this.field_36ebf36_Dne != null) {
            FUH fUH;
            int n;
            int n2;
            zKP.field_36e218c_Dne.method_ce7f9d7a_Dne(this.field_493682ed_Dne.field_3758af7_Dne.field_2d2a05_aFZ);
            this.field_367154_trS = this.field_493682ed_Dne.field_3758af7_Dne.field_2092ae_Dne;
            if (this.field_fdf1c16f_FWm != null) {
                for (n2 = 0; n2 < this.field_fdf1c16f_FWm.length; ++n2) {
                    this.field_fdf1c16f_FWm[n2].method_ae128dc7_bzF();
                }
            }
            if ((n2 = 64 << 3 - this.field_367154_trS) > 400) {
                n2 = 400;
            }
            this.field_21260d_FWm = n2 / 16 + 1;
            this.field_2e5f1b_bzF = 16;
            this.field_267cf5_Qnq = n2 / 16 + 1;
            this.field_fdf1c16f_FWm = new snt[this.field_21260d_FWm * this.field_2e5f1b_bzF * this.field_267cf5_Qnq];
            this.field_8372116e_Dne = new snt[this.field_21260d_FWm * this.field_2e5f1b_bzF * this.field_267cf5_Qnq];
            int n3 = 0;
            int n4 = 0;
            this.field_33448c_mrb = 0;
            this.field_29186d_XHL = 0;
            this.field_2a9ad6_Zpi = 0;
            this.field_31b816_kGO = this.field_21260d_FWm;
            this.field_36b0a9_udO = this.field_2e5f1b_bzF;
            this.field_342264_ooe = this.field_267cf5_Qnq;
            for (n = 0; n < this.field_6a0474ed_FWm.size(); ++n) {
                ((snt)this.field_6a0474ed_FWm.get((int)n)).field_21261e_FWm = false;
            }
            this.field_6a0474ed_FWm.clear();
            this.field_f27c122c_Dne.clear();
            for (n = 0; n < this.field_21260d_FWm; ++n) {
                for (int i = 0; i < this.field_2e5f1b_bzF; ++i) {
                    for (int j = 0; j < this.field_267cf5_Qnq; ++j) {
                        this.field_fdf1c16f_FWm[(j * this.field_2e5f1b_bzF + i) * this.field_21260d_FWm + n] = new snt(this.field_36ebf36_Dne, this.field_f27c122c_Dne, n * 16, i * 16, j * 16, this.field_2d29f4_aFZ + n3);
                        if (this.field_2092bf_Dne) {
                            this.field_fdf1c16f_FWm[(j * this.field_2e5f1b_bzF + i) * this.field_21260d_FWm + n].field_342264_ooe = this.field_5a1a3784_FWm.get(n4);
                        }
                        this.field_fdf1c16f_FWm[(j * this.field_2e5f1b_bzF + i) * this.field_21260d_FWm + n].field_267d06_Qnq = false;
                        this.field_fdf1c16f_FWm[(j * this.field_2e5f1b_bzF + i) * this.field_21260d_FWm + n].field_2e5f2c_bzF = true;
                        this.field_fdf1c16f_FWm[(j * this.field_2e5f1b_bzF + i) * this.field_21260d_FWm + n].field_2092bf_Dne = true;
                        this.field_fdf1c16f_FWm[(j * this.field_2e5f1b_bzF + i) * this.field_21260d_FWm + n].field_36b0a9_udO = n4++;
                        this.field_fdf1c16f_FWm[(j * this.field_2e5f1b_bzF + i) * this.field_21260d_FWm + n].method_a98a0660_aFZ();
                        this.field_8372116e_Dne[(j * this.field_2e5f1b_bzF + i) * this.field_21260d_FWm + n] = this.field_fdf1c16f_FWm[(j * this.field_2e5f1b_bzF + i) * this.field_21260d_FWm + n];
                        this.field_6a0474ed_FWm.add(this.field_fdf1c16f_FWm[(j * this.field_2e5f1b_bzF + i) * this.field_21260d_FWm + n]);
                        n3 += 3;
                    }
                }
            }
            if (this.field_36ebf36_Dne != null && (fUH = this.field_493682ed_Dne.field_366ec33_Dne) != null) {
                this.method_2dee77c_bzF(geR.method_117d0718_FWm(fUH.field_2f0dd3_div), geR.method_117d0718_FWm(fUH.field_22c5fd_IjH), geR.method_117d0718_FWm(fUH.field_334487_mrb));
                Arrays.sort(this.field_8372116e_Dne, new dPW(fUH));
            }
            this.field_348572_qLR = 2;
        }
    }

    @Override
    public void method_bb7dd820_Dne(sMa sMa2) {
        sMa2.method_c073daf8_mrb();
        if (sMa2.field_569fcf45_Dne != null) {
            this.field_36d36bf_Dne.method_ce6d8658_Dne(sMa2.field_569fcf45_Dne, new VGP());
        }
        if (sMa2.field_d9a85c6_FWm != null) {
            this.field_36d36bf_Dne.method_ce6d8658_Dne(sMa2.field_d9a85c6_FWm, new VGP());
        }
    }

    public rqj(Minecraft minecraft, Snh snh) {
        int n;
        int n2;
        this.field_83b1c1b0_Dne = new HashMap();
        this.field_3f1c589_Dne = new int[50000];
        this.field_76f31d43_Dne = pZS.method_ab715f95_Dne(64);
        this.field_7eb83e1f_bzF = new ArrayList();
        this.field_83702209_Dne = new ofu[]{new ofu(), new ofu(), new ofu(), new ofu()};
        this.field_493682ed_Dne = minecraft;
        this.field_36d36bf_Dne = snh;
        int n3 = 34;
        int n4 = 32;
        this.field_2d29f4_aFZ = pZS.method_ce7f5d9c_Dne(n3 * n3 * n4 * 3);
        this.field_2092bf_Dne = UGN.method_7a46289e_Dne();
        if (this.field_2092bf_Dne) {
            this.field_76f31d43_Dne.clear();
            this.field_5a1a3784_FWm = pZS.method_ab715f95_Dne(n3 * n3 * n4);
            this.field_5a1a3784_FWm.clear();
            this.field_5a1a3784_FWm.position(0);
            this.field_5a1a3784_FWm.limit(n3 * n3 * n4);
            ARBOcclusionQuery.glGenQueriesARB(this.field_5a1a3784_FWm);
        }
        this.field_20b857_DyG = pZS.method_ce7f5d9c_Dne(3);
        GL11.glPushMatrix();
        GL11.glNewList(this.field_20b857_DyG, 4864);
        this.method_907a9d21_Qnq();
        GL11.glEndList();
        GL11.glPopMatrix();
        WAR wAR = WAR.field_36e5ca4_Dne;
        this.field_2f0dd8_div = this.field_20b857_DyG + 1;
        GL11.glNewList(this.field_2f0dd8_div, 4864);
        int n5 = 64;
        int n6 = 256 / n5 + 2;
        float f = 16.0f;
        for (n2 = -n5 * n6; n2 <= n5 * n6; n2 += n5) {
            for (n = -n5 * n6; n <= n5 * n6; n += n5) {
                wAR.method_7a46289a_Dne();
                wAR.method_2be429a4_Dne(n2 + 0, f, n + 0);
                wAR.method_2be429a4_Dne(n2 + n5, f, n + 0);
                wAR.method_2be429a4_Dne(n2 + n5, f, n + n5);
                wAR.method_2be429a4_Dne(n2 + 0, f, n + n5);
                wAR.method_7a46288d_Dne();
            }
        }
        GL11.glEndList();
        this.field_22c602_IjH = this.field_20b857_DyG + 2;
        GL11.glNewList(this.field_22c602_IjH, 4864);
        f = -16.0f;
        wAR.method_7a46289a_Dne();
        for (n2 = -n5 * n6; n2 <= n5 * n6; n2 += n5) {
            for (n = -n5 * n6; n <= n5 * n6; n += n5) {
                wAR.method_2be429a4_Dne(n2 + n5, f, n + 0);
                wAR.method_2be429a4_Dne(n2 + 0, f, n + 0);
                wAR.method_2be429a4_Dne(n2 + 0, f, n + n5);
                wAR.method_2be429a4_Dne(n2 + n5, f, n + n5);
            }
        }
        wAR.method_7a46288d_Dne();
        GL11.glEndList();
    }

    private void method_9ed6d428_Dne(bSp bSp2) {
        WAR wAR = WAR.field_36e5ca4_Dne;
        wAR.method_ce7f5da9_Dne(3);
        wAR.method_2be429a4_Dne(bSp2.field_2092a9_Dne, bSp2.field_212608_FWm, bSp2.field_2e5f16_bzF);
        wAR.method_2be429a4_Dne(bSp2.field_267cf0_Qnq, bSp2.field_212608_FWm, bSp2.field_2e5f16_bzF);
        wAR.method_2be429a4_Dne(bSp2.field_267cf0_Qnq, bSp2.field_212608_FWm, bSp2.field_388da1_zGp);
        wAR.method_2be429a4_Dne(bSp2.field_2092a9_Dne, bSp2.field_212608_FWm, bSp2.field_388da1_zGp);
        wAR.method_2be429a4_Dne(bSp2.field_2092a9_Dne, bSp2.field_212608_FWm, bSp2.field_2e5f16_bzF);
        wAR.method_7a46288d_Dne();
        wAR.method_ce7f5da9_Dne(3);
        wAR.method_2be429a4_Dne(bSp2.field_2092a9_Dne, bSp2.field_2d29ef_aFZ, bSp2.field_2e5f16_bzF);
        wAR.method_2be429a4_Dne(bSp2.field_267cf0_Qnq, bSp2.field_2d29ef_aFZ, bSp2.field_2e5f16_bzF);
        wAR.method_2be429a4_Dne(bSp2.field_267cf0_Qnq, bSp2.field_2d29ef_aFZ, bSp2.field_388da1_zGp);
        wAR.method_2be429a4_Dne(bSp2.field_2092a9_Dne, bSp2.field_2d29ef_aFZ, bSp2.field_388da1_zGp);
        wAR.method_2be429a4_Dne(bSp2.field_2092a9_Dne, bSp2.field_2d29ef_aFZ, bSp2.field_2e5f16_bzF);
        wAR.method_7a46288d_Dne();
        wAR.method_ce7f5da9_Dne(1);
        wAR.method_2be429a4_Dne(bSp2.field_2092a9_Dne, bSp2.field_212608_FWm, bSp2.field_2e5f16_bzF);
        wAR.method_2be429a4_Dne(bSp2.field_2092a9_Dne, bSp2.field_2d29ef_aFZ, bSp2.field_2e5f16_bzF);
        wAR.method_2be429a4_Dne(bSp2.field_267cf0_Qnq, bSp2.field_212608_FWm, bSp2.field_2e5f16_bzF);
        wAR.method_2be429a4_Dne(bSp2.field_267cf0_Qnq, bSp2.field_2d29ef_aFZ, bSp2.field_2e5f16_bzF);
        wAR.method_2be429a4_Dne(bSp2.field_267cf0_Qnq, bSp2.field_212608_FWm, bSp2.field_388da1_zGp);
        wAR.method_2be429a4_Dne(bSp2.field_267cf0_Qnq, bSp2.field_2d29ef_aFZ, bSp2.field_388da1_zGp);
        wAR.method_2be429a4_Dne(bSp2.field_2092a9_Dne, bSp2.field_212608_FWm, bSp2.field_388da1_zGp);
        wAR.method_2be429a4_Dne(bSp2.field_2092a9_Dne, bSp2.field_2d29ef_aFZ, bSp2.field_388da1_zGp);
        wAR.method_7a46288d_Dne();
    }

    public String method_d1f1ed87_FWm() {
        return "E: " + this.field_28e7fd_Vxn + "/" + this.field_1ed017_ATE + ". B: " + this.field_2e8486_ceE + ", I: " + (this.field_1ed017_ATE - this.field_2e8486_ceE - this.field_28e7fd_Vxn);
    }

    public void method_c2a5d242_Dne(WAR wAR, FiG fiG, float f) {
        double d = fiG.field_36b0a4_udO + (fiG.field_2f0dd3_div - fiG.field_36b0a4_udO) * (double)f;
        double d2 = fiG.field_34225f_ooe + (fiG.field_22c5fd_IjH - fiG.field_34225f_ooe) * (double)f;
        double d3 = fiG.field_36714f_trS + (fiG.field_334487_mrb - fiG.field_36714f_trS) * (double)f;
        if (!this.field_83b1c1b0_Dne.isEmpty()) {
            GL11.glBlendFunc(774, 768);
            this.field_36d36bf_Dne.method_8f501fe4_Dne("/terrain.png");
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 0.5f);
            GL11.glPushMatrix();
            GL11.glDisable(3008);
            GL11.glPolygonOffset(-3.0f, -3.0f);
            GL11.glEnable(32823);
            GL11.glEnable(3008);
            wAR.method_7a46289a_Dne();
            wAR.method_a663d9a5_FWm(-d, -d2, -d3);
            wAR.method_7c6f6039_FWm();
            Iterator iterator = this.field_83b1c1b0_Dne.values().iterator();
            while (iterator.hasNext()) {
                zKP zKP2;
                double d4;
                double d5;
                eyz eyz2 = (eyz)iterator.next();
                double d6 = (double)eyz2.method_7a46288d_Dne() - d;
                if (d6 * d6 + (d5 = (double)eyz2.method_7c6f602c_FWm() - d2) * d5 + (d4 = (double)eyz2.method_ae128dba_bzF() - d3) * d4 > 1024.0) {
                    iterator.remove();
                    continue;
                }
                int n = this.field_36ebf36_Dne.method_2c2cf7bc_Dne(eyz2.method_7a46288d_Dne(), eyz2.method_7c6f602c_FWm(), eyz2.method_ae128dba_bzF());
                zKP zKP3 = zKP2 = n > 0 ? zKP.field_8374b848_Dne[n] : null;
                if (zKP2 == null) {
                    zKP2 = zKP.field_37e6aed_Dne;
                }
                this.field_37e98b3_Dne.method_aea60b5_Dne(zKP2, eyz2.method_7a46288d_Dne(), eyz2.method_7c6f602c_FWm(), eyz2.method_ae128dba_bzF(), this.field_836bfe96_Dne[eyz2.method_907a9d14_Qnq()]);
            }
            wAR.method_7a46288d_Dne();
            wAR.method_a663d9a5_FWm(0.0, 0.0, 0.0);
            GL11.glDisable(3008);
            GL11.glPolygonOffset(0.0f, 0.0f);
            GL11.glDisable(32823);
            GL11.glEnable(3008);
            GL11.glDepthMask(true);
            GL11.glPopMatrix();
        }
    }

    public void method_16cb7b5_Dne(int n, double d) {
        this.field_493682ed_Dne.field_36ac6a1_Dne.method_117d0725_FWm(d);
        for (int i = 0; i < this.field_83702209_Dne.length; ++i) {
            this.field_83702209_Dne[i].method_7a46289a_Dne();
        }
        this.field_493682ed_Dne.field_36ac6a1_Dne.method_ce7f4ae4_Dne(d);
    }

    @Override
    public void method_f3667971_Dne(FiG fiG, String string, double d, double d2, double d3, float f, float f2) {
    }

    private int method_59726188_Dne(int n, int n2, int n3, double d) {
        int n4;
        this.field_7eb83e1f_bzF.clear();
        int n5 = 0;
        for (int i = n; i < n2; ++i) {
            int n6;
            if (n3 == 0) {
                ++this.field_212c1b_EyB;
                if (this.field_8372116e_Dne[i].field_3f1c59a_Dne[n3]) {
                    ++this.field_36e4da_vSL;
                } else if (!this.field_8372116e_Dne[i].field_2092bf_Dne) {
                    ++this.field_215b36_FfS;
                } else if (this.field_2092bf_Dne && !this.field_8372116e_Dne[i].field_2e5f2c_bzF) {
                    ++this.field_2569d5_OdI;
                } else {
                    ++this.field_3393dd_oIf;
                }
            }
            if (this.field_8372116e_Dne[i].field_3f1c59a_Dne[n3] || !this.field_8372116e_Dne[i].field_2092bf_Dne || this.field_2092bf_Dne && !this.field_8372116e_Dne[i].field_2e5f2c_bzF || (n6 = this.field_8372116e_Dne[i].method_ce7f5d9c_Dne(n3)) < 0) continue;
            this.field_7eb83e1f_bzF.add(this.field_8372116e_Dne[i]);
            ++n5;
        }
        FUH fUH = this.field_493682ed_Dne.field_366ec33_Dne;
        double d2 = fUH.field_36b0a4_udO + (fUH.field_2f0dd3_div - fUH.field_36b0a4_udO) * d;
        double d3 = fUH.field_34225f_ooe + (fUH.field_22c5fd_IjH - fUH.field_34225f_ooe) * d;
        double d4 = fUH.field_36714f_trS + (fUH.field_334487_mrb - fUH.field_36714f_trS) * d;
        int n7 = 0;
        for (n4 = 0; n4 < this.field_83702209_Dne.length; ++n4) {
            this.field_83702209_Dne[n4].method_7c6f6039_FWm();
        }
        for (n4 = 0; n4 < this.field_7eb83e1f_bzF.size(); ++n4) {
            snt snt2 = (snt)this.field_7eb83e1f_bzF.get(n4);
            int n8 = -1;
            for (int i = 0; i < n7; ++i) {
                if (!this.field_83702209_Dne[i].method_2c2cf7cd_Dne(snt2.field_2d29f4_aFZ, snt2.field_388da6_zGp, snt2.field_20b857_DyG)) continue;
                n8 = i;
            }
            if (n8 < 0) {
                n8 = n7++;
                this.field_83702209_Dne[n8].method_c66c5815_Dne(snt2.field_2d29f4_aFZ, snt2.field_388da6_zGp, snt2.field_20b857_DyG, d2, d3, d4);
            }
            this.field_83702209_Dne[n8].method_ce7f5da9_Dne(snt2.method_ce7f5d9c_Dne(n3));
        }
        this.method_16cb7b5_Dne(n3, d);
        return n5;
    }

    public void method_ce7f5266_Dne(float f) {
        if (this.field_493682ed_Dne.field_36ebf36_Dne.field_3690d00_Dne.field_2092ae_Dne == 1) {
            GL11.glDisable(2912);
            GL11.glDisable(3008);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            Cit.method_7a46289a_Dne();
            GL11.glDepthMask(false);
            this.field_36d36bf_Dne.method_8f501fe4_Dne("/misc/tunnel.png");
            WAR wAR = WAR.field_36e5ca4_Dne;
            for (int i = 0; i < 6; ++i) {
                GL11.glPushMatrix();
                if (i == 1) {
                    GL11.glRotatef(90.0f, 1.0f, 0.0f, 0.0f);
                }
                if (i == 2) {
                    GL11.glRotatef(-90.0f, 1.0f, 0.0f, 0.0f);
                }
                if (i == 3) {
                    GL11.glRotatef(180.0f, 1.0f, 0.0f, 0.0f);
                }
                if (i == 4) {
                    GL11.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
                }
                if (i == 5) {
                    GL11.glRotatef(-90.0f, 0.0f, 0.0f, 1.0f);
                }
                wAR.method_7a46289a_Dne();
                wAR.method_143f9e1c_bzF(0x282828);
                wAR.method_c38c5864_Dne(-100.0, -100.0, -100.0, 0.0, 0.0);
                wAR.method_c38c5864_Dne(-100.0, -100.0, 100.0, 0.0, 16.0);
                wAR.method_c38c5864_Dne(100.0, -100.0, 100.0, 16.0, 16.0);
                wAR.method_c38c5864_Dne(100.0, -100.0, -100.0, 16.0, 0.0);
                wAR.method_7a46288d_Dne();
                GL11.glPopMatrix();
            }
            GL11.glDepthMask(true);
            GL11.glEnable(3553);
            GL11.glEnable(3008);
        } else if (this.field_493682ed_Dne.field_36ebf36_Dne.field_3690d00_Dne.method_7a46289e_Dne()) {
            float f2;
            float f3;
            int n;
            int n2;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            GL11.glDisable(3553);
            chN chN2 = this.field_36ebf36_Dne.method_6dac6968_Dne(this.field_493682ed_Dne.field_366ec33_Dne, f);
            float f9 = (float)chN2.field_2092a9_Dne;
            float f10 = (float)chN2.field_212608_FWm;
            float f11 = (float)chN2.field_2e5f16_bzF;
            if (this.field_493682ed_Dne.field_3758af7_Dne.field_2e5f2c_bzF) {
                float f12 = (f9 * 30.0f + f10 * 59.0f + f11 * 11.0f) / 100.0f;
                float f13 = (f9 * 30.0f + f10 * 70.0f) / 100.0f;
                f8 = (f9 * 30.0f + f11 * 70.0f) / 100.0f;
                f9 = f12;
                f10 = f13;
                f11 = f8;
            }
            GL11.glColor3f(f9, f10, f11);
            WAR wAR = WAR.field_36e5ca4_Dne;
            GL11.glDepthMask(false);
            GL11.glEnable(2912);
            GL11.glColor3f(f9, f10, f11);
            GL11.glCallList(this.field_2f0dd8_div);
            GL11.glDisable(2912);
            GL11.glDisable(3008);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            Cit.method_7a46289a_Dne();
            float[] fArray = this.field_36ebf36_Dne.field_3690d00_Dne.method_2c00e207_Dne(this.field_36ebf36_Dne.method_117d0e97_FWm(f), f);
            if (fArray != null) {
                float f14;
                GL11.glDisable(3553);
                GL11.glShadeModel(7425);
                GL11.glPushMatrix();
                GL11.glRotatef(90.0f, 1.0f, 0.0f, 0.0f);
                GL11.glRotatef(geR.method_ce7f5256_Dne(this.field_36ebf36_Dne.method_143f92c9_bzF(f)) < 0.0f ? 180.0f : 0.0f, 0.0f, 0.0f, 1.0f);
                GL11.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
                f8 = fArray[0];
                f7 = fArray[1];
                f6 = fArray[2];
                if (this.field_493682ed_Dne.field_3758af7_Dne.field_2e5f2c_bzF) {
                    f5 = (f8 * 30.0f + f7 * 59.0f + f6 * 11.0f) / 100.0f;
                    f4 = (f8 * 30.0f + f7 * 70.0f) / 100.0f;
                    f14 = (f8 * 30.0f + f6 * 70.0f) / 100.0f;
                    f8 = f5;
                    f7 = f4;
                    f6 = f14;
                }
                wAR.method_ce7f5da9_Dne(6);
                wAR.method_54283b9a_Dne(f8, f7, f6, fArray[3]);
                wAR.method_2be429a4_Dne(0.0, 100.0, 0.0);
                n2 = 16;
                wAR.method_54283b9a_Dne(fArray[0], fArray[1], fArray[2], 0.0f);
                for (n = 0; n <= n2; ++n) {
                    f14 = (float)n * (float)Math.PI * 2.0f / (float)n2;
                    f3 = geR.method_ce7f5256_Dne(f14);
                    f2 = geR.method_117d0e97_FWm(f14);
                    wAR.method_2be429a4_Dne(f3 * 120.0f, f2 * 120.0f, -f2 * 40.0f * fArray[3]);
                }
                wAR.method_7a46288d_Dne();
                GL11.glPopMatrix();
                GL11.glShadeModel(7424);
            }
            GL11.glEnable(3553);
            GL11.glBlendFunc(770, 1);
            GL11.glPushMatrix();
            f8 = 1.0f - this.field_36ebf36_Dne.method_b51dd45e_zGp(f);
            f7 = 0.0f;
            f6 = 0.0f;
            f5 = 0.0f;
            GL11.glColor4f(1.0f, 1.0f, 1.0f, f8);
            GL11.glTranslatef(f7, f6, f5);
            GL11.glRotatef(-90.0f, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(this.field_36ebf36_Dne.method_117d0e97_FWm(f) * 360.0f, 1.0f, 0.0f, 0.0f);
            f4 = 30.0f;
            this.field_36d36bf_Dne.method_8f501fe4_Dne("/environment/sun.png");
            wAR.method_7a46289a_Dne();
            wAR.method_c38c5864_Dne(-f4, 100.0, -f4, 0.0, 0.0);
            wAR.method_c38c5864_Dne(f4, 100.0, -f4, 1.0, 0.0);
            wAR.method_c38c5864_Dne(f4, 100.0, f4, 1.0, 1.0);
            wAR.method_c38c5864_Dne(-f4, 100.0, f4, 0.0, 1.0);
            wAR.method_7a46288d_Dne();
            f4 = 20.0f;
            this.field_36d36bf_Dne.method_8f501fe4_Dne("/environment/moon_phases.png");
            int n3 = this.field_36ebf36_Dne.method_7a46288d_Dne();
            n2 = n3 % 4;
            n = n3 / 4 % 2;
            f3 = (float)(n2 + 0) / 4.0f;
            f2 = (float)(n + 0) / 2.0f;
            float f15 = (float)(n2 + 1) / 4.0f;
            float f16 = (float)(n + 1) / 2.0f;
            wAR.method_7a46289a_Dne();
            wAR.method_c38c5864_Dne(-f4, -100.0, f4, f15, f16);
            wAR.method_c38c5864_Dne(f4, -100.0, f4, f3, f16);
            wAR.method_c38c5864_Dne(f4, -100.0, -f4, f3, f2);
            wAR.method_c38c5864_Dne(-f4, -100.0, -f4, f15, f2);
            wAR.method_7a46288d_Dne();
            GL11.glDisable(3553);
            float f17 = this.field_36ebf36_Dne.method_7ed96eaf_Qnq(f) * f8;
            if (f17 > 0.0f) {
                GL11.glColor4f(f17, f17, f17, f17);
                GL11.glCallList(this.field_20b857_DyG);
            }
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            GL11.glDisable(3042);
            GL11.glEnable(3008);
            GL11.glEnable(2912);
            GL11.glPopMatrix();
            GL11.glDisable(3553);
            GL11.glColor3f(0.0f, 0.0f, 0.0f);
            double d = this.field_493682ed_Dne.field_369f6b6_Dne.method_ffc5552e_Dne((float)f).field_212608_FWm - this.field_36ebf36_Dne.method_7a462888_Dne();
            if (d < 0.0) {
                GL11.glPushMatrix();
                GL11.glTranslatef(0.0f, 12.0f, 0.0f);
                GL11.glCallList(this.field_22c602_IjH);
                GL11.glPopMatrix();
                f6 = 1.0f;
                f5 = -((float)(d + 65.0));
                f4 = -f6;
                wAR.method_7a46289a_Dne();
                wAR.method_16cca7a_Dne(0, 255);
                wAR.method_2be429a4_Dne(-f6, f5, f6);
                wAR.method_2be429a4_Dne(f6, f5, f6);
                wAR.method_2be429a4_Dne(f6, f4, f6);
                wAR.method_2be429a4_Dne(-f6, f4, f6);
                wAR.method_2be429a4_Dne(-f6, f4, -f6);
                wAR.method_2be429a4_Dne(f6, f4, -f6);
                wAR.method_2be429a4_Dne(f6, f5, -f6);
                wAR.method_2be429a4_Dne(-f6, f5, -f6);
                wAR.method_2be429a4_Dne(f6, f4, -f6);
                wAR.method_2be429a4_Dne(f6, f4, f6);
                wAR.method_2be429a4_Dne(f6, f5, f6);
                wAR.method_2be429a4_Dne(f6, f5, -f6);
                wAR.method_2be429a4_Dne(-f6, f5, -f6);
                wAR.method_2be429a4_Dne(-f6, f5, f6);
                wAR.method_2be429a4_Dne(-f6, f4, f6);
                wAR.method_2be429a4_Dne(-f6, f4, -f6);
                wAR.method_2be429a4_Dne(-f6, f4, -f6);
                wAR.method_2be429a4_Dne(-f6, f4, f6);
                wAR.method_2be429a4_Dne(f6, f4, f6);
                wAR.method_2be429a4_Dne(f6, f4, -f6);
                wAR.method_7a46288d_Dne();
            }
            if (this.field_36ebf36_Dne.field_3690d00_Dne.method_ae128dcb_bzF()) {
                GL11.glColor3f(f9 * 0.2f + 0.04f, f10 * 0.2f + 0.04f, f11 * 0.6f + 0.1f);
            } else {
                GL11.glColor3f(f9, f10, f11);
            }
            GL11.glPushMatrix();
            GL11.glTranslatef(0.0f, -((float)(d - 16.0)), 0.0f);
            GL11.glCallList(this.field_22c602_IjH);
            GL11.glPopMatrix();
            GL11.glEnable(3553);
            GL11.glDepthMask(true);
        }
    }

    @Override
    public void method_ae303daa_FWm(int n, int n2, int n3, int n4, int n5) {
        if (n5 >= 0 && n5 < 10) {
            eyz eyz2 = (eyz)this.field_83b1c1b0_Dne.get(n);
            if (eyz2 == null || eyz2.method_7a46288d_Dne() != n2 || eyz2.method_7c6f602c_FWm() != n3 || eyz2.method_ae128dba_bzF() != n4) {
                eyz2 = new eyz(n, n2, n3, n4);
                this.field_83b1c1b0_Dne.put(n, eyz2);
            }
            eyz2.method_ce7f5da9_Dne(n5);
            eyz2.method_117d19ea_FWm(this.field_388da6_zGp);
        } else {
            this.field_83b1c1b0_Dne.remove(n);
        }
    }

    public void method_c2c971ee_FWm(FiG fiG, wHH wHH2, int n, NMq nMq, float f) {
        if (n == 0 && wHH2.field_376443d_Dne == gks.field_376443d_Dne) {
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            GL11.glColor4f(0.0f, 0.0f, 0.0f, 0.4f);
            GL11.glLineWidth(2.0f);
            GL11.glDisable(3553);
            GL11.glDepthMask(false);
            float f2 = 0.002f;
            int n2 = this.field_36ebf36_Dne.method_2c2cf7bc_Dne(wHH2.field_2092ae_Dne, wHH2.field_21260d_FWm, wHH2.field_2e5f1b_bzF);
            if (n2 > 0) {
                zKP.field_8374b848_Dne[n2].method_fbabf7ef_Dne(this.field_36ebf36_Dne, wHH2.field_2092ae_Dne, wHH2.field_21260d_FWm, wHH2.field_2e5f1b_bzF);
                double d = fiG.field_36b0a4_udO + (fiG.field_2f0dd3_div - fiG.field_36b0a4_udO) * (double)f;
                double d2 = fiG.field_34225f_ooe + (fiG.field_22c5fd_IjH - fiG.field_34225f_ooe) * (double)f;
                double d3 = fiG.field_36714f_trS + (fiG.field_334487_mrb - fiG.field_36714f_trS) * (double)f;
                this.method_9ed6d428_Dne(zKP.field_8374b848_Dne[n2].method_5f382101_FWm(this.field_36ebf36_Dne, wHH2.field_2092ae_Dne, wHH2.field_21260d_FWm, wHH2.field_2e5f1b_bzF).method_b78565d7_FWm(f2, f2, f2).method_2c4c7c89_bzF(-d, -d2, -d3));
            }
            GL11.glDepthMask(true);
            GL11.glEnable(3553);
            GL11.glDisable(3042);
        }
    }

    @Override
    public void method_d4dc89e9_Dne(int n, int n2, int n3, int n4, int n5) {
        Random random = this.field_36ebf36_Dne.field_7331eae7_Dne;
        switch (n) {
            case 1013: 
            case 1018: {
                if (this.field_493682ed_Dne.field_366ec33_Dne == null) break;
                double d = (double)n2 - this.field_493682ed_Dne.field_366ec33_Dne.field_2f0dd3_div;
                double d2 = (double)n3 - this.field_493682ed_Dne.field_366ec33_Dne.field_22c5fd_IjH;
                double d3 = (double)n4 - this.field_493682ed_Dne.field_366ec33_Dne.field_334487_mrb;
                double d4 = Math.sqrt(d * d + d2 * d2 + d3 * d3);
                double d5 = this.field_493682ed_Dne.field_366ec33_Dne.field_2f0dd3_div;
                double d6 = this.field_493682ed_Dne.field_366ec33_Dne.field_22c5fd_IjH;
                double d7 = this.field_493682ed_Dne.field_366ec33_Dne.field_334487_mrb;
                if (d4 > 0.0) {
                    d5 += d / d4 * 2.0;
                    d6 += d2 / d4 * 2.0;
                    d7 += d3 / d4 * 2.0;
                }
                if (n == 1013) {
                    this.field_36ebf36_Dne.method_62d7c9a6_Dne(d5, d6, d7, "mob.wither.spawn", 1.0f, 1.0f, false);
                    break;
                }
                if (n != 1018) break;
                this.field_36ebf36_Dne.method_62d7c9a6_Dne(d5, d6, d7, "mob.enderdragon.end", 5.0f, 1.0f, false);
            }
        }
    }

    private void method_907a9d21_Qnq() {
        Random random = new Random(10842L);
        WAR wAR = WAR.field_36e5ca4_Dne;
        wAR.method_7a46289a_Dne();
        for (int i = 0; i < 1500; ++i) {
            double d = random.nextFloat() * 2.0f - 1.0f;
            double d2 = random.nextFloat() * 2.0f - 1.0f;
            double d3 = random.nextFloat() * 2.0f - 1.0f;
            double d4 = 0.15f + random.nextFloat() * 0.1f;
            double d5 = d * d + d2 * d2 + d3 * d3;
            if (!(d5 < 1.0) || !(d5 > 0.01)) continue;
            d5 = 1.0 / Math.sqrt(d5);
            double d6 = (d *= d5) * 100.0;
            double d7 = (d2 *= d5) * 100.0;
            double d8 = (d3 *= d5) * 100.0;
            double d9 = Math.atan2(d, d3);
            double d10 = Math.sin(d9);
            double d11 = Math.cos(d9);
            double d12 = Math.atan2(Math.sqrt(d * d + d3 * d3), d2);
            double d13 = Math.sin(d12);
            double d14 = Math.cos(d12);
            double d15 = random.nextDouble() * Math.PI * 2.0;
            double d16 = Math.sin(d15);
            double d17 = Math.cos(d15);
            for (int j = 0; j < 4; ++j) {
                double d18 = 0.0;
                double d19 = (double)((j & 2) - 1) * d4;
                double d20 = (double)((j + 1 & 2) - 1) * d4;
                double d21 = d19 * d17 - d20 * d16;
                double d22 = d20 * d17 + d19 * d16;
                double d23 = d21 * d13 + d18 * d14;
                double d24 = d18 * d13 - d21 * d14;
                double d25 = d24 * d10 - d22 * d11;
                double d26 = d22 * d10 + d24 * d11;
                wAR.method_2be429a4_Dne(d6 + d25, d7 + d23, d8 + d26);
            }
        }
        wAR.method_7a46288d_Dne();
    }

    @Override
    public void method_a6aca7ca_FWm(int n, int n2, int n3) {
        this.method_17d7ea99_FWm(n - 1, n2 - 1, n3 - 1, n + 1, n2 + 1, n3 + 1);
    }

    @Override
    public void method_8600ec24_Dne(String string, double d, double d2, double d3, double d4, double d5, double d6) {
        try {
            this.method_8538c319_Dne(string, d, d2, d3, d4, d5, d6);
        }
        catch (Throwable throwable) {
            McM mcM = McM.method_948e60df_Dne(throwable, "Exception while adding particle");
            Noo noo = mcM.method_284dc627_Dne("Particle being added");
            noo.method_5e295ec0_Dne("Name", string);
            noo.method_2aeeb7ad_Dne("Position", new Yht(this, d, d2, d3));
            throw new kaJ(mcM);
        }
    }

    public void method_ae128dc7_bzF() {
        pZS.method_ce7f5da9_Dne(this.field_2d29f4_aFZ);
    }

    public String method_eecad346_Dne() {
        return "C: " + this.field_3393dd_oIf + "/" + this.field_212c1b_EyB + ". F: " + this.field_215b36_FfS + ", O: " + this.field_2569d5_OdI + ", E: " + this.field_36e4da_vSL;
    }

    public int method_d6a6cfc_Dne(FUH fUH, int n, double d) {
        int n2;
        this.field_36ebf36_Dne.field_365731d_Dne.method_8f501fe4_Dne("sortchunks");
        for (int i = 0; i < 10; ++i) {
            this.field_217c26_Fnk = (this.field_217c26_Fnk + 1) % this.field_fdf1c16f_FWm.length;
            snt snt2 = this.field_fdf1c16f_FWm[this.field_217c26_Fnk];
            if (!snt2.field_21261e_FWm || this.field_6a0474ed_FWm.contains(snt2)) continue;
            this.field_6a0474ed_FWm.add(snt2);
        }
        if (this.field_493682ed_Dne.field_3758af7_Dne.field_2092ae_Dne != this.field_367154_trS) {
            this.method_7a46289a_Dne();
        }
        if (n == 0) {
            this.field_212c1b_EyB = 0;
            this.field_26818f_RPx = 0;
            this.field_215b36_FfS = 0;
            this.field_2569d5_OdI = 0;
            this.field_3393dd_oIf = 0;
            this.field_36e4da_vSL = 0;
        }
        double d2 = fUH.field_36b0a4_udO + (fUH.field_2f0dd3_div - fUH.field_36b0a4_udO) * d;
        double d3 = fUH.field_34225f_ooe + (fUH.field_22c5fd_IjH - fUH.field_34225f_ooe) * d;
        double d4 = fUH.field_36714f_trS + (fUH.field_334487_mrb - fUH.field_36714f_trS) * d;
        double d5 = fUH.field_2f0dd3_div - this.field_2092a9_Dne;
        double d6 = fUH.field_22c5fd_IjH - this.field_212608_FWm;
        double d7 = fUH.field_334487_mrb - this.field_2e5f16_bzF;
        if (d5 * d5 + d6 * d6 + d7 * d7 > 16.0) {
            this.field_2092a9_Dne = fUH.field_2f0dd3_div;
            this.field_212608_FWm = fUH.field_22c5fd_IjH;
            this.field_2e5f16_bzF = fUH.field_334487_mrb;
            this.method_2dee77c_bzF(geR.method_117d0718_FWm(fUH.field_2f0dd3_div), geR.method_117d0718_FWm(fUH.field_22c5fd_IjH), geR.method_117d0718_FWm(fUH.field_334487_mrb));
            Arrays.sort(this.field_8372116e_Dne, new dPW(fUH));
        }
        Cit.method_7a46289a_Dne();
        int n3 = 0;
        if (this.field_2092bf_Dne && this.field_493682ed_Dne.field_3758af7_Dne.field_267d06_Qnq && !this.field_493682ed_Dne.field_3758af7_Dne.field_2e5f2c_bzF && n == 0) {
            int n4;
            int n5 = 0;
            int n6 = 16;
            this.method_16cca7a_Dne(n5, n6);
            for (n4 = n5; n4 < n6; ++n4) {
                this.field_8372116e_Dne[n4].field_2e5f2c_bzF = true;
            }
            this.field_36ebf36_Dne.field_365731d_Dne.method_110c4dc3_FWm("render");
            n2 = n3 + this.method_59726188_Dne(n5, n6, n, d);
            do {
                this.field_36ebf36_Dne.field_365731d_Dne.method_110c4dc3_FWm("occ");
                n4 = n6;
                if ((n6 *= 2) > this.field_8372116e_Dne.length) {
                    n6 = this.field_8372116e_Dne.length;
                }
                GL11.glDisable(3553);
                GL11.glDisable(2896);
                GL11.glDisable(3008);
                GL11.glDisable(2912);
                GL11.glColorMask(false, false, false, false);
                GL11.glDepthMask(false);
                this.field_36ebf36_Dne.field_365731d_Dne.method_8f501fe4_Dne("check");
                this.method_16cca7a_Dne(n4, n6);
                this.field_36ebf36_Dne.field_365731d_Dne.method_7c6f6039_FWm();
                GL11.glPushMatrix();
                float f = 0.0f;
                float f2 = 0.0f;
                float f3 = 0.0f;
                for (int i = n4; i < n6; ++i) {
                    float f4;
                    int n7;
                    if (this.field_8372116e_Dne[i].method_7a46289e_Dne()) {
                        this.field_8372116e_Dne[i].field_2092bf_Dne = false;
                        continue;
                    }
                    if (!this.field_8372116e_Dne[i].field_2092bf_Dne) {
                        this.field_8372116e_Dne[i].field_2e5f2c_bzF = true;
                    }
                    if (!this.field_8372116e_Dne[i].field_2092bf_Dne || this.field_8372116e_Dne[i].field_267d06_Qnq || this.field_388da6_zGp % (n7 = (int)(1.0f + (f4 = geR.method_143f92c9_bzF(this.field_8372116e_Dne[i].method_bb7dd810_Dne(fUH))) / 128.0f)) != i % n7) continue;
                    snt snt3 = this.field_8372116e_Dne[i];
                    float f5 = (float)((double)snt3.field_2d29f4_aFZ - d2);
                    float f6 = (float)((double)snt3.field_388da6_zGp - d3);
                    float f7 = (float)((double)snt3.field_20b857_DyG - d4);
                    float f8 = f5 - f;
                    float f9 = f6 - f2;
                    float f10 = f7 - f3;
                    if (f8 != 0.0f || f9 != 0.0f || f10 != 0.0f) {
                        GL11.glTranslatef(f8, f9, f10);
                        f += f8;
                        f2 += f9;
                        f3 += f10;
                    }
                    this.field_36ebf36_Dne.field_365731d_Dne.method_8f501fe4_Dne("bb");
                    ARBOcclusionQuery.glBeginQueryARB(35092, this.field_8372116e_Dne[i].field_342264_ooe);
                    this.field_8372116e_Dne[i].method_907a9d21_Qnq();
                    ARBOcclusionQuery.glEndQueryARB(35092);
                    this.field_36ebf36_Dne.field_365731d_Dne.method_7c6f6039_FWm();
                    this.field_8372116e_Dne[i].field_267d06_Qnq = true;
                }
                GL11.glPopMatrix();
                if (this.field_493682ed_Dne.field_3758af7_Dne.field_2e5f2c_bzF) {
                    if (OEA.field_2092ae_Dne == 0) {
                        GL11.glColorMask(false, true, true, true);
                    } else {
                        GL11.glColorMask(true, false, false, true);
                    }
                } else {
                    GL11.glColorMask(true, true, true, true);
                }
                GL11.glDepthMask(true);
                GL11.glEnable(3553);
                GL11.glEnable(3008);
                GL11.glEnable(2912);
                this.field_36ebf36_Dne.field_365731d_Dne.method_110c4dc3_FWm("render");
                n2 += this.method_59726188_Dne(n4, n6, n, d);
            } while (n6 < this.field_8372116e_Dne.length);
        } else {
            this.field_36ebf36_Dne.field_365731d_Dne.method_110c4dc3_FWm("render");
            n2 = n3 + this.method_59726188_Dne(0, this.field_8372116e_Dne.length, n, d);
        }
        this.field_36ebf36_Dne.field_365731d_Dne.method_7c6f6039_FWm();
        return n2;
    }

    public void method_17d7ea99_FWm(int n, int n2, int n3, int n4, int n5, int n6) {
        int n7 = geR.method_16cca6d_Dne(n, 16);
        int n8 = geR.method_16cca6d_Dne(n2, 16);
        int n9 = geR.method_16cca6d_Dne(n3, 16);
        int n10 = geR.method_16cca6d_Dne(n4, 16);
        int n11 = geR.method_16cca6d_Dne(n5, 16);
        int n12 = geR.method_16cca6d_Dne(n6, 16);
        for (int i = n7; i <= n10; ++i) {
            int n13 = i % this.field_21260d_FWm;
            if (n13 < 0) {
                n13 += this.field_21260d_FWm;
            }
            for (int j = n8; j <= n11; ++j) {
                int n14 = j % this.field_2e5f1b_bzF;
                if (n14 < 0) {
                    n14 += this.field_2e5f1b_bzF;
                }
                for (int k = n9; k <= n12; ++k) {
                    int n15;
                    snt snt2;
                    int n16 = k % this.field_267cf5_Qnq;
                    if (n16 < 0) {
                        n16 += this.field_267cf5_Qnq;
                    }
                    if ((snt2 = this.field_fdf1c16f_FWm[n15 = (n16 * this.field_2e5f1b_bzF + n14) * this.field_21260d_FWm + n13]) == null || snt2.field_21261e_FWm) continue;
                    this.field_6a0474ed_FWm.add(snt2);
                    snt2.method_a98a0660_aFZ();
                }
            }
        }
    }

    @Override
    public void method_7eed443f_Dne(String string, int n, int n2, int n3) {
        nyS nyS2 = nyS.method_285c742d_Dne(string);
        if (string != null && nyS2 != null) {
            this.field_493682ed_Dne.field_3733694_Dne.method_8f501fe4_Dne(nyS2.method_eecad346_Dne());
        }
        this.field_493682ed_Dne.field_3788296_Dne.method_7ec1955c_Dne(string, n, n2, n3);
    }

    @Override
    public void method_bfa54b80_Dne(FiG fiG, int n, int n2, int n3, int n4, int n5) {
        Random random = this.field_36ebf36_Dne.field_7331eae7_Dne;
        switch (n) {
            case 1000: {
                this.field_36ebf36_Dne.method_62d7c9a6_Dne(n2, n3, n4, "random.click", 1.0f, 1.0f, false);
                break;
            }
            case 1001: {
                this.field_36ebf36_Dne.method_62d7c9a6_Dne(n2, n3, n4, "random.click", 1.0f, 1.2f, false);
                break;
            }
            case 1002: {
                this.field_36ebf36_Dne.method_62d7c9a6_Dne(n2, n3, n4, "random.bow", 1.0f, 1.2f, false);
                break;
            }
            case 1003: {
                if (Math.random() < 0.5) {
                    this.field_36ebf36_Dne.method_62d7c9a6_Dne((double)n2 + 0.5, (double)n3 + 0.5, (double)n4 + 0.5, "random.door_open", 1.0f, this.field_36ebf36_Dne.field_7331eae7_Dne.nextFloat() * 0.1f + 0.9f, false);
                    break;
                }
                this.field_36ebf36_Dne.method_62d7c9a6_Dne((double)n2 + 0.5, (double)n3 + 0.5, (double)n4 + 0.5, "random.door_close", 1.0f, this.field_36ebf36_Dne.field_7331eae7_Dne.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1004: {
                this.field_36ebf36_Dne.method_62d7c9a6_Dne((float)n2 + 0.5f, (float)n3 + 0.5f, (float)n4 + 0.5f, "random.fizz", 0.5f, 2.6f + (random.nextFloat() - random.nextFloat()) * 0.8f, false);
                break;
            }
            case 1005: {
                if (dEr.field_836aa5b6_Dne[n5] instanceof nyS) {
                    this.field_36ebf36_Dne.method_7eed443f_Dne(((nyS)dEr.field_836aa5b6_Dne[n5]).field_569fcf45_Dne, n2, n3, n4);
                    break;
                }
                this.field_36ebf36_Dne.method_7eed443f_Dne(null, n2, n3, n4);
                break;
            }
            case 1007: {
                this.field_36ebf36_Dne.method_62d7c9a6_Dne((double)n2 + 0.5, (double)n3 + 0.5, (double)n4 + 0.5, "mob.ghast.charge", 10.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1008: {
                this.field_36ebf36_Dne.method_62d7c9a6_Dne((double)n2 + 0.5, (double)n3 + 0.5, (double)n4 + 0.5, "mob.ghast.fireball", 10.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1009: {
                this.field_36ebf36_Dne.method_62d7c9a6_Dne((double)n2 + 0.5, (double)n3 + 0.5, (double)n4 + 0.5, "mob.ghast.fireball", 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1010: {
                this.field_36ebf36_Dne.method_62d7c9a6_Dne((double)n2 + 0.5, (double)n3 + 0.5, (double)n4 + 0.5, "mob.zombie.wood", 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1011: {
                this.field_36ebf36_Dne.method_62d7c9a6_Dne((double)n2 + 0.5, (double)n3 + 0.5, (double)n4 + 0.5, "mob.zombie.metal", 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1012: {
                this.field_36ebf36_Dne.method_62d7c9a6_Dne((double)n2 + 0.5, (double)n3 + 0.5, (double)n4 + 0.5, "mob.zombie.woodbreak", 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1014: {
                this.field_36ebf36_Dne.method_62d7c9a6_Dne((double)n2 + 0.5, (double)n3 + 0.5, (double)n4 + 0.5, "mob.wither.shoot", 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1015: {
                this.field_36ebf36_Dne.method_62d7c9a6_Dne((double)n2 + 0.5, (double)n3 + 0.5, (double)n4 + 0.5, "mob.bat.takeoff", 0.05f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1016: {
                this.field_36ebf36_Dne.method_62d7c9a6_Dne((double)n2 + 0.5, (double)n3 + 0.5, (double)n4 + 0.5, "mob.zombie.infect", 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1017: {
                this.field_36ebf36_Dne.method_62d7c9a6_Dne((double)n2 + 0.5, (double)n3 + 0.5, (double)n4 + 0.5, "mob.zombie.unfect", 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1020: {
                this.field_36ebf36_Dne.method_62d7c9a6_Dne((float)n2 + 0.5f, (float)n3 + 0.5f, (float)n4 + 0.5f, "random.anvil_break", 1.0f, this.field_36ebf36_Dne.field_7331eae7_Dne.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1021: {
                this.field_36ebf36_Dne.method_62d7c9a6_Dne((float)n2 + 0.5f, (float)n3 + 0.5f, (float)n4 + 0.5f, "random.anvil_use", 1.0f, this.field_36ebf36_Dne.field_7331eae7_Dne.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1022: {
                this.field_36ebf36_Dne.method_62d7c9a6_Dne((float)n2 + 0.5f, (float)n3 + 0.5f, (float)n4 + 0.5f, "random.anvil_land", 0.3f, this.field_36ebf36_Dne.field_7331eae7_Dne.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 2000: {
                int n6 = n5 % 3 - 1;
                int n7 = n5 / 3 % 3 - 1;
                double d = (double)n2 + (double)n6 * 0.6 + 0.5;
                double d2 = (double)n3 + 0.5;
                double d3 = (double)n4 + (double)n7 * 0.6 + 0.5;
                for (int i = 0; i < 10; ++i) {
                    double d4 = random.nextDouble() * 0.2 + 0.01;
                    double d5 = d + (double)n6 * 0.01 + (random.nextDouble() - 0.5) * (double)n7 * 0.5;
                    double d6 = d2 + (random.nextDouble() - 0.5) * 0.5;
                    double d7 = d3 + (double)n7 * 0.01 + (random.nextDouble() - 0.5) * (double)n6 * 0.5;
                    double d8 = (double)n6 * d4 + random.nextGaussian() * 0.01;
                    double d9 = -0.03 + random.nextGaussian() * 0.01;
                    double d10 = (double)n7 * d4 + random.nextGaussian() * 0.01;
                    this.method_8600ec24_Dne("smoke", d5, d6, d7, d8, d9, d10);
                }
                return;
            }
            case 2001: {
                int n8 = n5 & 0xFFF;
                if (n8 > 0) {
                    zKP zKP2 = zKP.field_8374b848_Dne[n8];
                    this.field_493682ed_Dne.field_3788296_Dne.method_d4bea65c_Dne(zKP2.field_a21c1bc0_kGO.method_eecad346_Dne(), (float)n2 + 0.5f, (float)n3 + 0.5f, (float)n4 + 0.5f, (zKP2.field_a21c1bc0_kGO.method_7a46288a_Dne() + 1.0f) / 2.0f, zKP2.field_a21c1bc0_kGO.method_7c6f6029_FWm() * 0.8f);
                }
                this.field_493682ed_Dne.field_364ffb6_Dne.method_d4dc89e9_Dne(n2, n3, n4, n5 & 0xFFF, n5 >> 12 & 0xFF);
                break;
            }
            case 2002: {
                int n9;
                double d = n2;
                double d11 = n3;
                double d12 = n4;
                String string = "iconcrack_" + dEr.field_3682442_Dne.field_267cf5_Qnq;
                for (n9 = 0; n9 < 8; ++n9) {
                    this.method_8600ec24_Dne(string, d, d11, d12, random.nextGaussian() * 0.15, random.nextDouble() * 0.2, random.nextGaussian() * 0.15);
                }
                n9 = dEr.field_3682442_Dne.method_117d19dd_FWm(n5);
                float f = (float)(n9 >> 16 & 0xFF) / 255.0f;
                float f2 = (float)(n9 >> 8 & 0xFF) / 255.0f;
                float f3 = (float)(n9 >> 0 & 0xFF) / 255.0f;
                String string2 = "spell";
                if (dEr.field_3682442_Dne.method_117d19ee_FWm(n5)) {
                    string2 = "instantSpell";
                }
                for (int i = 0; i < 100; ++i) {
                    double d13 = random.nextDouble() * 4.0;
                    double d14 = random.nextDouble() * Math.PI * 2.0;
                    double d15 = Math.cos(d14) * d13;
                    double d16 = 0.01 + random.nextDouble() * 0.5;
                    double d17 = Math.sin(d14) * d13;
                    CAZ cAZ = this.method_8538c319_Dne(string2, d + d15 * 0.1, d11 + 0.3, d12 + d17 * 0.1, d15, d16, d17);
                    if (cAZ == null) continue;
                    float f4 = 0.75f + random.nextFloat() * 0.25f;
                    cAZ.method_2c0148e6_Dne(f * f4, f2 * f4, f3 * f4);
                    cAZ.method_ffb6385b_Dne((float)d13);
                }
                this.field_36ebf36_Dne.method_62d7c9a6_Dne((double)n2 + 0.5, (double)n3 + 0.5, (double)n4 + 0.5, "random.glass", 1.0f, this.field_36ebf36_Dne.field_7331eae7_Dne.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 2003: {
                double d = (double)n2 + 0.5;
                double d18 = n3;
                double d19 = (double)n4 + 0.5;
                String string = "iconcrack_" + dEr.field_1031d495_Woy.field_267cf5_Qnq;
                for (int i = 0; i < 8; ++i) {
                    this.method_8600ec24_Dne(string, d, d18, d19, random.nextGaussian() * 0.15, random.nextDouble() * 0.2, random.nextGaussian() * 0.15);
                }
                for (double d20 = 0.0; d20 < Math.PI * 2; d20 += 0.15707963267948966) {
                    this.method_8600ec24_Dne("portal", d + Math.cos(d20) * 5.0, d18 - 0.4, d19 + Math.sin(d20) * 5.0, Math.cos(d20) * -5.0, 0.0, Math.sin(d20) * -5.0);
                    this.method_8600ec24_Dne("portal", d + Math.cos(d20) * 5.0, d18 - 0.4, d19 + Math.sin(d20) * 5.0, Math.cos(d20) * -7.0, 0.0, Math.sin(d20) * -7.0);
                }
                return;
            }
            case 2004: {
                for (int i = 0; i < 20; ++i) {
                    double d = (double)n2 + 0.5 + ((double)this.field_36ebf36_Dne.field_7331eae7_Dne.nextFloat() - 0.5) * 2.0;
                    double d21 = (double)n3 + 0.5 + ((double)this.field_36ebf36_Dne.field_7331eae7_Dne.nextFloat() - 0.5) * 2.0;
                    double d22 = (double)n4 + 0.5 + ((double)this.field_36ebf36_Dne.field_7331eae7_Dne.nextFloat() - 0.5) * 2.0;
                    this.field_36ebf36_Dne.method_8600ec24_Dne("smoke", d, d21, d22, 0.0, 0.0, 0.0);
                    this.field_36ebf36_Dne.method_8600ec24_Dne("flame", d, d21, d22, 0.0, 0.0, 0.0);
                }
                return;
            }
            case 2005: {
                AvN.method_f9bf07d3_Dne(this.field_36ebf36_Dne, n2, n3, n4, n5);
            }
        }
    }

    public void method_8c784131_Dne(VzZ vzZ) {
        if (this.field_36ebf36_Dne != null) {
            this.field_36ebf36_Dne.method_4eb34e21_FWm(this);
        }
        this.field_2092a9_Dne = -9999.0;
        this.field_212608_FWm = -9999.0;
        this.field_2e5f16_bzF = -9999.0;
        ptH.field_37a7828_Dne.method_83516093_Dne(vzZ);
        this.field_36ebf36_Dne = vzZ;
        this.field_37e98b3_Dne = new zVu(vzZ);
        if (vzZ != null) {
            vzZ.method_755f9a60_Dne(this);
            this.method_7a46289a_Dne();
        }
    }

    private void method_16cca7a_Dne(int n, int n2) {
        for (int i = n; i < n2; ++i) {
            if (!this.field_8372116e_Dne[i].field_267d06_Qnq) continue;
            this.field_76f31d43_Dne.clear();
            ARBOcclusionQuery.glGetQueryObjectuARB(this.field_8372116e_Dne[i].field_342264_ooe, 34919, this.field_76f31d43_Dne);
            if (this.field_76f31d43_Dne.get(0) == 0) continue;
            this.field_8372116e_Dne[i].field_267d06_Qnq = false;
            this.field_76f31d43_Dne.clear();
            ARBOcclusionQuery.glGetQueryObjectuARB(this.field_8372116e_Dne[i].field_342264_ooe, 34918, this.field_76f31d43_Dne);
            this.field_8372116e_Dne[i].field_2e5f2c_bzF = this.field_76f31d43_Dne.get(0) != 0;
        }
    }

    public void method_7c6f6039_FWm() {
        ++this.field_388da6_zGp;
        if (this.field_388da6_zGp % 20 == 0) {
            Iterator iterator = this.field_83b1c1b0_Dne.values().iterator();
            while (iterator.hasNext()) {
                eyz eyz2 = (eyz)iterator.next();
                int n = eyz2.method_a98a0653_aFZ();
                if (this.field_388da6_zGp - n <= 400) continue;
                iterator.remove();
            }
        }
    }

    public void method_7367138e_Dne(chN chN2, IPx iPx, float f) {
        if (this.field_348572_qLR > 0) {
            --this.field_348572_qLR;
        } else {
            sMa sMa2;
            int n;
            this.field_36ebf36_Dne.field_365731d_Dne.method_8f501fe4_Dne("prepare");
            xwr_0.field_36f2779_Dne.method_3d9b023d_Dne(this.field_36ebf36_Dne, this.field_36d36bf_Dne, this.field_493682ed_Dne.field_3791671_Dne, this.field_493682ed_Dne.field_366ec33_Dne, f);
            ptH.field_37a7828_Dne.method_c5c357b9_Dne(this.field_36ebf36_Dne, this.field_36d36bf_Dne, this.field_493682ed_Dne.field_3791671_Dne, this.field_493682ed_Dne.field_366ec33_Dne, this.field_493682ed_Dne.field_2020b812_FWm, this.field_493682ed_Dne.field_3758af7_Dne, f);
            this.field_1ed017_ATE = 0;
            this.field_28e7fd_Vxn = 0;
            this.field_2e8486_ceE = 0;
            FUH fUH = this.field_493682ed_Dne.field_366ec33_Dne;
            ptH.field_2092a9_Dne = fUH.field_36b0a4_udO + (fUH.field_2f0dd3_div - fUH.field_36b0a4_udO) * (double)f;
            ptH.field_212608_FWm = fUH.field_34225f_ooe + (fUH.field_22c5fd_IjH - fUH.field_34225f_ooe) * (double)f;
            ptH.field_2e5f16_bzF = fUH.field_36714f_trS + (fUH.field_334487_mrb - fUH.field_36714f_trS) * (double)f;
            xwr_0.field_2092a9_Dne = fUH.field_36b0a4_udO + (fUH.field_2f0dd3_div - fUH.field_36b0a4_udO) * (double)f;
            xwr_0.field_212608_FWm = fUH.field_34225f_ooe + (fUH.field_22c5fd_IjH - fUH.field_34225f_ooe) * (double)f;
            xwr_0.field_2e5f16_bzF = fUH.field_36714f_trS + (fUH.field_334487_mrb - fUH.field_36714f_trS) * (double)f;
            this.field_493682ed_Dne.field_36ac6a1_Dne.method_117d0725_FWm(f);
            this.field_36ebf36_Dne.field_365731d_Dne.method_110c4dc3_FWm("global");
            List list = this.field_36ebf36_Dne.method_adea226d_Dne();
            this.field_1ed017_ATE = list.size();
            for (n = 0; n < this.field_36ebf36_Dne.field_10b14626_aFZ.size(); ++n) {
                sMa2 = (sMa)this.field_36ebf36_Dne.field_10b14626_aFZ.get(n);
                ++this.field_28e7fd_Vxn;
                if (!sMa2.method_a1a425c2_Dne(chN2)) continue;
                ptH.field_37a7828_Dne.method_b43d93a0_Dne(sMa2, f);
            }
            this.field_36ebf36_Dne.field_365731d_Dne.method_110c4dc3_FWm("entities");
            for (n = 0; n < list.size(); ++n) {
                sMa2 = (sMa)list.get(n);
                if (!sMa2.method_a1a425c2_Dne(chN2) || !sMa2.field_348583_qLR && !iPx.method_9ed6d42c_Dne(sMa2.field_373a3ed_Dne) && sMa2.field_37b45e5_Dne != this.field_493682ed_Dne.field_369f6b6_Dne || sMa2 == this.field_493682ed_Dne.field_366ec33_Dne && this.field_493682ed_Dne.field_3758af7_Dne.field_2f0dd8_div == 0 && !this.field_493682ed_Dne.field_366ec33_Dne.method_9b310ff4_Wwe() || !this.field_36ebf36_Dne.method_2dee780_bzF(geR.method_117d0718_FWm(sMa2.field_2f0dd3_div), 0, geR.method_117d0718_FWm(sMa2.field_334487_mrb))) continue;
                ++this.field_28e7fd_Vxn;
                ptH.field_37a7828_Dne.method_b43d93a0_Dne(sMa2, f);
            }
            this.field_36ebf36_Dne.field_365731d_Dne.method_110c4dc3_FWm("tileentities");
            Cit.method_7c6f6039_FWm();
            for (n = 0; n < this.field_f27c122c_Dne.size(); ++n) {
                xwr_0.field_36f2779_Dne.method_dd603736_Dne((ipD)this.field_f27c122c_Dne.get(n), f);
            }
            this.field_493682ed_Dne.field_36ac6a1_Dne.method_ce7f4ae4_Dne(f);
            this.field_36ebf36_Dne.field_365731d_Dne.method_7c6f6039_FWm();
        }
    }
}

