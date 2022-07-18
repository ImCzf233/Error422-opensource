package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.lwjgl.opengl.GL11;

public class BMa {
    private Snh field_36d36bf_Dne;
    private List[] field_27a96df1_Dne = new List[4];
    protected Qnq field_36c4f18_Dne;
    private Random field_7331eae7_Dne = new Random();

    public void method_b43d93a0_Dne(sMa sMa2, float f) {
        float f2 = lqj.field_267cf2_Qnq;
        float f3 = lqj.field_388da3_zGp;
        float f4 = lqj.field_20b854_DyG;
        float f5 = lqj.field_2f0dd5_div;
        float f6 = lqj.field_2d29f1_aFZ;
        CAZ.field_2092a9_Dne = sMa2.field_36b0a4_udO + (sMa2.field_2f0dd3_div - sMa2.field_36b0a4_udO) * (double)f;
        CAZ.field_212608_FWm = sMa2.field_34225f_ooe + (sMa2.field_22c5fd_IjH - sMa2.field_34225f_ooe) * (double)f;
        CAZ.field_2e5f16_bzF = sMa2.field_36714f_trS + (sMa2.field_334487_mrb - sMa2.field_36714f_trS) * (double)f;
        for (int i = 0; i < 3; ++i) {
            if (this.field_27a96df1_Dne[i].isEmpty()) continue;
            switch (i) {
                default: {
                    this.field_36d36bf_Dne.method_8f501fe4_Dne("/particles.png");
                    break;
                }
                case 1: {
                    this.field_36d36bf_Dne.method_8f501fe4_Dne("/terrain.png");
                    break;
                }
                case 2: {
                    this.field_36d36bf_Dne.method_8f501fe4_Dne("/gui/items.png");
                }
            }
            WAR wAR = WAR.field_36e5ca4_Dne;
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            GL11.glDepthMask(false);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            GL11.glAlphaFunc(516, 0.003921569f);
            wAR.method_7a46289a_Dne();
            for (int j = 0; j < this.field_27a96df1_Dne[i].size(); ++j) {
                CAZ cAZ = (CAZ)this.field_27a96df1_Dne[i].get(j);
                wAR.method_117d19ea_FWm(cAZ.method_ce7f5259_Dne(f));
                cAZ.method_179c0fdf_Dne(wAR, f, f2, f6, f3, f4, f5);
            }
            wAR.method_7a46288d_Dne();
            GL11.glDisable(3042);
            GL11.glDepthMask(true);
            GL11.glAlphaFunc(516, 0.1f);
        }
    }

    public void method_d4dc89e9_Dne(int n, int n2, int n3, int n4, int n5) {
        if (n4 != 0) {
            zKP zKP2 = zKP.field_8374b848_Dne[n4];
            int n6 = 4;
            for (int i = 0; i < n6; ++i) {
                for (int j = 0; j < n6; ++j) {
                    for (int k = 0; k < n6; ++k) {
                        double d = (double)n + ((double)i + 0.5) / (double)n6;
                        double d2 = (double)n2 + ((double)j + 0.5) / (double)n6;
                        double d3 = (double)n3 + ((double)k + 0.5) / (double)n6;
                        int n7 = this.field_7331eae7_Dne.nextInt(6);
                        this.method_68e8f1ab_Dne(new gWM(this.field_36c4f18_Dne, d, d2, d3, d - (double)n - 0.5, d2 - (double)n2 - 0.5, d3 - (double)n3 - 0.5, zKP2, n7, n5, this.field_36d36bf_Dne).method_d98d229d_Dne(n, n2, n3));
                    }
                }
            }
        }
    }

    public void method_83516093_Dne(Qnq qnq) {
        this.field_36c4f18_Dne = qnq;
        for (int i = 0; i < 4; ++i) {
            this.field_27a96df1_Dne[i].clear();
        }
    }

    public void method_7a46289a_Dne() {
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < this.field_27a96df1_Dne[i].size(); ++j) {
                CAZ cAZ = (CAZ)this.field_27a96df1_Dne[i].get(j);
                cAZ.method_7a46289a_Dne();
                if (!cAZ.field_2a9ae7_Zpi) continue;
                this.field_27a96df1_Dne[i].remove(j--);
            }
        }
    }

    public BMa(Qnq qnq, Snh snh) {
        if (qnq != null) {
            this.field_36c4f18_Dne = qnq;
        }
        this.field_36d36bf_Dne = snh;
        for (int i = 0; i < 4; ++i) {
            this.field_27a96df1_Dne[i] = new ArrayList();
        }
    }

    public void method_5972745a_Dne(int n, int n2, int n3, int n4) {
        int n5 = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n, n2, n3);
        if (n5 != 0) {
            zKP zKP2 = zKP.field_8374b848_Dne[n5];
            float f = 0.1f;
            double d = (double)n + this.field_7331eae7_Dne.nextDouble() * (zKP2.method_7c6f6027_FWm() - zKP2.method_7a462888_Dne() - (double)(f * 2.0f)) + (double)f + zKP2.method_7a462888_Dne();
            double d2 = (double)n2 + this.field_7331eae7_Dne.nextDouble() * (zKP2.method_907a9d0f_Qnq() - zKP2.method_ae128db5_bzF() - (double)(f * 2.0f)) + (double)f + zKP2.method_ae128db5_bzF();
            double d3 = (double)n3 + this.field_7331eae7_Dne.nextDouble() * (zKP2.method_d44b4580_zGp() - zKP2.method_a98a064e_aFZ() - (double)(f * 2.0f)) + (double)f + zKP2.method_a98a064e_aFZ();
            if (n4 == 0) {
                d2 = (double)n2 + zKP2.method_ae128db5_bzF() - (double)f;
            }
            if (n4 == 1) {
                d2 = (double)n2 + zKP2.method_907a9d0f_Qnq() + (double)f;
            }
            if (n4 == 2) {
                d3 = (double)n3 + zKP2.method_a98a064e_aFZ() - (double)f;
            }
            if (n4 == 3) {
                d3 = (double)n3 + zKP2.method_d44b4580_zGp() + (double)f;
            }
            if (n4 == 4) {
                d = (double)n + zKP2.method_7a462888_Dne() - (double)f;
            }
            if (n4 == 5) {
                d = (double)n + zKP2.method_7c6f6027_FWm() + (double)f;
            }
            this.method_68e8f1ab_Dne(new gWM(this.field_36c4f18_Dne, d, d2, d3, 0.0, 0.0, 0.0, zKP2, n4, this.field_36c4f18_Dne.method_2dee76f_bzF(n, n2, n3), this.field_36d36bf_Dne).method_d98d229d_Dne(n, n2, n3).method_ffb6385b_Dne(0.2f).method_d909ec1c_FWm(0.6f));
        }
    }

    public void method_56057ff_FWm(sMa sMa2, float f) {
        float f2 = geR.method_117d0e97_FWm(sMa2.field_334489_mrb * ((float)Math.PI / 180));
        float f3 = geR.method_ce7f5256_Dne(sMa2.field_334489_mrb * ((float)Math.PI / 180));
        float f4 = -f3 * geR.method_ce7f5256_Dne(sMa2.field_29186a_XHL * ((float)Math.PI / 180));
        float f5 = f2 * geR.method_ce7f5256_Dne(sMa2.field_29186a_XHL * ((float)Math.PI / 180));
        float f6 = geR.method_117d0e97_FWm(sMa2.field_29186a_XHL * ((float)Math.PI / 180));
        int n = 3;
        if (!this.field_27a96df1_Dne[n].isEmpty()) {
            WAR wAR = WAR.field_36e5ca4_Dne;
            for (int i = 0; i < this.field_27a96df1_Dne[n].size(); ++i) {
                CAZ cAZ = (CAZ)this.field_27a96df1_Dne[n].get(i);
                wAR.method_117d19ea_FWm(cAZ.method_ce7f5259_Dne(f));
                cAZ.method_179c0fdf_Dne(wAR, f, f2, f6, f3, f4, f5);
            }
        }
    }

    public void method_68e8f1ab_Dne(CAZ cAZ) {
        int n = cAZ.method_7a46288d_Dne();
        if (this.field_27a96df1_Dne[n].size() >= 4000) {
            this.field_27a96df1_Dne[n].remove(0);
        }
        this.field_27a96df1_Dne[n].add(cAZ);
    }

    public String method_eecad346_Dne() {
        return "" + (this.field_27a96df1_Dne[0].size() + this.field_27a96df1_Dne[1].size() + this.field_27a96df1_Dne[2].size());
    }
}

