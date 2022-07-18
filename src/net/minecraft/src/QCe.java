package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public abstract class QCe {
    protected ptH field_37a7828_Dne;
    protected zVu field_37e98b3_Dne;
    protected float field_21260a_FWm = 1.0f;
    private Gor field_367c742_Dne = new Sgm();
    protected float field_2092ab_Dne = 0.0f;

    public QCe() {
        this.field_37e98b3_Dne = new zVu();
    }

    private Qnq method_2305dd77_Dne() {
        return this.field_37a7828_Dne.field_36c4f18_Dne;
    }

    public void method_f0cfd9bd_FWm(sMa sMa2, double d, double d2, double d3, float f, float f2) {
        double d4;
        float f3;
        if (this.field_37a7828_Dne.field_3758af7_Dne.field_2d2a05_aFZ && this.field_2092ab_Dne > 0.0f && !sMa2.method_998e662d_Vxn() && (f3 = (float)((1.0 - (d4 = this.field_37a7828_Dne.method_2be42992_Dne(sMa2.field_2f0dd3_div, sMa2.field_22c5fd_IjH, sMa2.field_334487_mrb)) / 256.0) * (double)this.field_21260a_FWm)) > 0.0f) {
            this.method_7cf9edcb_bzF(sMa2, d, d2, d3, f3, f2);
        }
        if (sMa2.method_8c71d205_OdI()) {
            this.method_c7c9ef22_Dne(sMa2, d, d2, d3, f2);
        }
    }

    public static void method_4b502b56_Dne(bSp bSp2, double d, double d2, double d3) {
        GL11.glDisable(3553);
        WAR wAR = WAR.field_36e5ca4_Dne;
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        wAR.method_7a46289a_Dne();
        wAR.method_a663d9a5_FWm(d, d2, d3);
        wAR.method_a680f8e7_FWm(0.0f, 0.0f, -1.0f);
        wAR.method_2be429a4_Dne(bSp2.field_2092a9_Dne, bSp2.field_2d29ef_aFZ, bSp2.field_2e5f16_bzF);
        wAR.method_2be429a4_Dne(bSp2.field_267cf0_Qnq, bSp2.field_2d29ef_aFZ, bSp2.field_2e5f16_bzF);
        wAR.method_2be429a4_Dne(bSp2.field_267cf0_Qnq, bSp2.field_212608_FWm, bSp2.field_2e5f16_bzF);
        wAR.method_2be429a4_Dne(bSp2.field_2092a9_Dne, bSp2.field_212608_FWm, bSp2.field_2e5f16_bzF);
        wAR.method_a680f8e7_FWm(0.0f, 0.0f, 1.0f);
        wAR.method_2be429a4_Dne(bSp2.field_2092a9_Dne, bSp2.field_212608_FWm, bSp2.field_388da1_zGp);
        wAR.method_2be429a4_Dne(bSp2.field_267cf0_Qnq, bSp2.field_212608_FWm, bSp2.field_388da1_zGp);
        wAR.method_2be429a4_Dne(bSp2.field_267cf0_Qnq, bSp2.field_2d29ef_aFZ, bSp2.field_388da1_zGp);
        wAR.method_2be429a4_Dne(bSp2.field_2092a9_Dne, bSp2.field_2d29ef_aFZ, bSp2.field_388da1_zGp);
        wAR.method_a680f8e7_FWm(0.0f, -1.0f, 0.0f);
        wAR.method_2be429a4_Dne(bSp2.field_2092a9_Dne, bSp2.field_212608_FWm, bSp2.field_2e5f16_bzF);
        wAR.method_2be429a4_Dne(bSp2.field_267cf0_Qnq, bSp2.field_212608_FWm, bSp2.field_2e5f16_bzF);
        wAR.method_2be429a4_Dne(bSp2.field_267cf0_Qnq, bSp2.field_212608_FWm, bSp2.field_388da1_zGp);
        wAR.method_2be429a4_Dne(bSp2.field_2092a9_Dne, bSp2.field_212608_FWm, bSp2.field_388da1_zGp);
        wAR.method_a680f8e7_FWm(0.0f, 1.0f, 0.0f);
        wAR.method_2be429a4_Dne(bSp2.field_2092a9_Dne, bSp2.field_2d29ef_aFZ, bSp2.field_388da1_zGp);
        wAR.method_2be429a4_Dne(bSp2.field_267cf0_Qnq, bSp2.field_2d29ef_aFZ, bSp2.field_388da1_zGp);
        wAR.method_2be429a4_Dne(bSp2.field_267cf0_Qnq, bSp2.field_2d29ef_aFZ, bSp2.field_2e5f16_bzF);
        wAR.method_2be429a4_Dne(bSp2.field_2092a9_Dne, bSp2.field_2d29ef_aFZ, bSp2.field_2e5f16_bzF);
        wAR.method_a680f8e7_FWm(-1.0f, 0.0f, 0.0f);
        wAR.method_2be429a4_Dne(bSp2.field_2092a9_Dne, bSp2.field_212608_FWm, bSp2.field_388da1_zGp);
        wAR.method_2be429a4_Dne(bSp2.field_2092a9_Dne, bSp2.field_2d29ef_aFZ, bSp2.field_388da1_zGp);
        wAR.method_2be429a4_Dne(bSp2.field_2092a9_Dne, bSp2.field_2d29ef_aFZ, bSp2.field_2e5f16_bzF);
        wAR.method_2be429a4_Dne(bSp2.field_2092a9_Dne, bSp2.field_212608_FWm, bSp2.field_2e5f16_bzF);
        wAR.method_a680f8e7_FWm(1.0f, 0.0f, 0.0f);
        wAR.method_2be429a4_Dne(bSp2.field_267cf0_Qnq, bSp2.field_212608_FWm, bSp2.field_2e5f16_bzF);
        wAR.method_2be429a4_Dne(bSp2.field_267cf0_Qnq, bSp2.field_2d29ef_aFZ, bSp2.field_2e5f16_bzF);
        wAR.method_2be429a4_Dne(bSp2.field_267cf0_Qnq, bSp2.field_2d29ef_aFZ, bSp2.field_388da1_zGp);
        wAR.method_2be429a4_Dne(bSp2.field_267cf0_Qnq, bSp2.field_212608_FWm, bSp2.field_388da1_zGp);
        wAR.method_a663d9a5_FWm(0.0, 0.0, 0.0);
        wAR.method_7a46288d_Dne();
        GL11.glEnable(3553);
    }

    private void method_2412f611_Dne(zKP zKP2, double d, double d2, double d3, int n, int n2, int n3, float f, float f2, double d4, double d5, double d6) {
        double d7;
        WAR wAR = WAR.field_36e5ca4_Dne;
        if (zKP2.method_7a46289e_Dne() && (d7 = ((double)f - (d2 - ((double)n2 + d5)) / 2.0) * 0.5 * (double)this.method_2305dd77_Dne().method_2c2cf7b9_Dne(n, n2, n3)) >= 0.0) {
            if (d7 > 1.0) {
                d7 = 1.0;
            }
            wAR.method_54283b9a_Dne(1.0f, 1.0f, 1.0f, (float)d7);
            double d8 = (double)n + zKP2.method_7a462888_Dne() + d4;
            double d9 = (double)n + zKP2.method_7c6f6027_FWm() + d4;
            double d10 = (double)n2 + zKP2.method_ae128db5_bzF() + d5 + 0.015625;
            double d11 = (double)n3 + zKP2.method_a98a064e_aFZ() + d6;
            double d12 = (double)n3 + zKP2.method_d44b4580_zGp() + d6;
            float f3 = (float)((d - d8) / 2.0 / (double)f2 + 0.5);
            float f4 = (float)((d - d9) / 2.0 / (double)f2 + 0.5);
            float f5 = (float)((d3 - d11) / 2.0 / (double)f2 + 0.5);
            float f6 = (float)((d3 - d12) / 2.0 / (double)f2 + 0.5);
            wAR.method_c38c5864_Dne(d8, d10, d11, f3, f5);
            wAR.method_c38c5864_Dne(d8, d10, d12, f3, f6);
            wAR.method_c38c5864_Dne(d9, d10, d12, f4, f6);
            wAR.method_c38c5864_Dne(d9, d10, d11, f4, f5);
        }
    }

    protected void method_8f501fe4_Dne(String string) {
        this.field_37a7828_Dne.field_36d36bf_Dne.method_8f501fe4_Dne(string);
    }

    public msA method_2312a4d0_Dne() {
        return this.field_37a7828_Dne.method_2312a4d0_Dne();
    }

    public static void method_9ed6d428_Dne(bSp bSp2) {
        WAR wAR = WAR.field_36e5ca4_Dne;
        wAR.method_7a46289a_Dne();
        wAR.method_2be429a4_Dne(bSp2.field_2092a9_Dne, bSp2.field_2d29ef_aFZ, bSp2.field_2e5f16_bzF);
        wAR.method_2be429a4_Dne(bSp2.field_267cf0_Qnq, bSp2.field_2d29ef_aFZ, bSp2.field_2e5f16_bzF);
        wAR.method_2be429a4_Dne(bSp2.field_267cf0_Qnq, bSp2.field_212608_FWm, bSp2.field_2e5f16_bzF);
        wAR.method_2be429a4_Dne(bSp2.field_2092a9_Dne, bSp2.field_212608_FWm, bSp2.field_2e5f16_bzF);
        wAR.method_2be429a4_Dne(bSp2.field_2092a9_Dne, bSp2.field_212608_FWm, bSp2.field_388da1_zGp);
        wAR.method_2be429a4_Dne(bSp2.field_267cf0_Qnq, bSp2.field_212608_FWm, bSp2.field_388da1_zGp);
        wAR.method_2be429a4_Dne(bSp2.field_267cf0_Qnq, bSp2.field_2d29ef_aFZ, bSp2.field_388da1_zGp);
        wAR.method_2be429a4_Dne(bSp2.field_2092a9_Dne, bSp2.field_2d29ef_aFZ, bSp2.field_388da1_zGp);
        wAR.method_2be429a4_Dne(bSp2.field_2092a9_Dne, bSp2.field_212608_FWm, bSp2.field_2e5f16_bzF);
        wAR.method_2be429a4_Dne(bSp2.field_267cf0_Qnq, bSp2.field_212608_FWm, bSp2.field_2e5f16_bzF);
        wAR.method_2be429a4_Dne(bSp2.field_267cf0_Qnq, bSp2.field_212608_FWm, bSp2.field_388da1_zGp);
        wAR.method_2be429a4_Dne(bSp2.field_2092a9_Dne, bSp2.field_212608_FWm, bSp2.field_388da1_zGp);
        wAR.method_2be429a4_Dne(bSp2.field_2092a9_Dne, bSp2.field_2d29ef_aFZ, bSp2.field_388da1_zGp);
        wAR.method_2be429a4_Dne(bSp2.field_267cf0_Qnq, bSp2.field_2d29ef_aFZ, bSp2.field_388da1_zGp);
        wAR.method_2be429a4_Dne(bSp2.field_267cf0_Qnq, bSp2.field_2d29ef_aFZ, bSp2.field_2e5f16_bzF);
        wAR.method_2be429a4_Dne(bSp2.field_2092a9_Dne, bSp2.field_2d29ef_aFZ, bSp2.field_2e5f16_bzF);
        wAR.method_2be429a4_Dne(bSp2.field_2092a9_Dne, bSp2.field_212608_FWm, bSp2.field_388da1_zGp);
        wAR.method_2be429a4_Dne(bSp2.field_2092a9_Dne, bSp2.field_2d29ef_aFZ, bSp2.field_388da1_zGp);
        wAR.method_2be429a4_Dne(bSp2.field_2092a9_Dne, bSp2.field_2d29ef_aFZ, bSp2.field_2e5f16_bzF);
        wAR.method_2be429a4_Dne(bSp2.field_2092a9_Dne, bSp2.field_212608_FWm, bSp2.field_2e5f16_bzF);
        wAR.method_2be429a4_Dne(bSp2.field_267cf0_Qnq, bSp2.field_212608_FWm, bSp2.field_2e5f16_bzF);
        wAR.method_2be429a4_Dne(bSp2.field_267cf0_Qnq, bSp2.field_2d29ef_aFZ, bSp2.field_2e5f16_bzF);
        wAR.method_2be429a4_Dne(bSp2.field_267cf0_Qnq, bSp2.field_2d29ef_aFZ, bSp2.field_388da1_zGp);
        wAR.method_2be429a4_Dne(bSp2.field_267cf0_Qnq, bSp2.field_212608_FWm, bSp2.field_388da1_zGp);
        wAR.method_7a46288d_Dne();
    }

    public void method_845caac7_Dne(Rbp rbp) {
    }

    protected boolean method_abaa98b2_Dne(String string, String string2) {
        Snh snh = this.field_37a7828_Dne.field_36d36bf_Dne;
        int n = snh.method_abaa98a1_Dne(string, string2);
        if (n >= 0) {
            GL11.glBindTexture(3553, n);
            snh.method_7a46289a_Dne();
            return true;
        }
        return false;
    }

    public abstract void method_31745cde_Dne(sMa var1, double var2, double var4, double var6, float var8, float var9);

    private void method_c7c9ef22_Dne(sMa sMa2, double d, double d2, double d3, float f) {
        GL11.glDisable(2896);
        gDn gDn2 = zKP.field_3774324_Dne.method_9e795529_Dne(0);
        gDn gDn3 = zKP.field_3774324_Dne.method_9e795529_Dne(1);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d2, (float)d3);
        float f2 = sMa2.field_342261_ooe * 1.4f;
        GL11.glScalef(f2, f2, f2);
        this.method_8f501fe4_Dne("/terrain.png");
        WAR wAR = WAR.field_36e5ca4_Dne;
        float f3 = 0.5f;
        float f4 = 0.0f;
        float f5 = sMa2.field_367151_trS / f2;
        float f6 = (float)(sMa2.field_22c5fd_IjH - sMa2.field_373a3ed_Dne.field_212608_FWm);
        GL11.glRotatef(-this.field_37a7828_Dne.field_2092ab_Dne, 0.0f, 1.0f, 0.0f);
        GL11.glTranslatef(0.0f, 0.0f, -0.3f + (float)((int)f5) * 0.02f);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        float f7 = 0.0f;
        int n = 0;
        wAR.method_7a46289a_Dne();
        while (f5 > 0.0f) {
            gDn gDn4 = n % 2 == 0 ? gDn2 : gDn3;
            float f8 = gDn4.method_7a46288a_Dne();
            float f9 = gDn4.method_ae128db7_bzF();
            float f10 = gDn4.method_7c6f6029_FWm();
            float f11 = gDn4.method_907a9d11_Qnq();
            if (n / 2 % 2 == 0) {
                float f12 = f10;
                f10 = f8;
                f8 = f12;
            }
            wAR.method_c38c5864_Dne(f3 - f4, 0.0f - f6, f7, f10, f11);
            wAR.method_c38c5864_Dne(-f3 - f4, 0.0f - f6, f7, f8, f11);
            wAR.method_c38c5864_Dne(-f3 - f4, 1.4f - f6, f7, f8, f9);
            wAR.method_c38c5864_Dne(f3 - f4, 1.4f - f6, f7, f10, f9);
            f5 -= 0.45f;
            f6 -= 0.45f;
            f3 *= 0.9f;
            f7 += 0.03f;
            ++n;
        }
        wAR.method_7a46288d_Dne();
        GL11.glPopMatrix();
        GL11.glEnable(2896);
    }

    public void method_b87985a3_Dne(ptH ptH2) {
        this.field_37a7828_Dne = ptH2;
    }

    private void method_7cf9edcb_bzF(sMa sMa2, double d, double d2, double d3, float f, float f2) {
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        this.field_37a7828_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("%clamp%/misc/shadow.png");
        Qnq qnq = this.method_2305dd77_Dne();
        GL11.glDepthMask(false);
        float f3 = this.field_2092ab_Dne;
        if (sMa2 instanceof FUH) {
            FUH fUH = (FUH)sMa2;
            f3 *= fUH.method_8288d6de_IjH();
            if (fUH.method_8288d6f2_IjH()) {
                f3 *= 0.5f;
            }
        }
        double d4 = sMa2.field_36b0a4_udO + (sMa2.field_2f0dd3_div - sMa2.field_36b0a4_udO) * (double)f2;
        double d5 = sMa2.field_34225f_ooe + (sMa2.field_22c5fd_IjH - sMa2.field_34225f_ooe) * (double)f2 + (double)sMa2.method_7a46288a_Dne();
        double d6 = sMa2.field_36714f_trS + (sMa2.field_334487_mrb - sMa2.field_36714f_trS) * (double)f2;
        int n = geR.method_117d0718_FWm(d4 - (double)f3);
        int n2 = geR.method_117d0718_FWm(d4 + (double)f3);
        int n3 = geR.method_117d0718_FWm(d5 - (double)f3);
        int n4 = geR.method_117d0718_FWm(d5);
        int n5 = geR.method_117d0718_FWm(d6 - (double)f3);
        int n6 = geR.method_117d0718_FWm(d6 + (double)f3);
        double d7 = d - d4;
        double d8 = d2 - d5;
        double d9 = d3 - d6;
        WAR wAR = WAR.field_36e5ca4_Dne;
        wAR.method_7a46289a_Dne();
        for (int i = n; i <= n2; ++i) {
            for (int j = n3; j <= n4; ++j) {
                for (int k = n5; k <= n6; ++k) {
                    int n7 = qnq.method_2c2cf7bc_Dne(i, j - 1, k);
                    if (n7 <= 0 || qnq.method_76d9fc36_aFZ(i, j, k) <= 3) continue;
                    this.method_2412f611_Dne(zKP.field_8374b848_Dne[n7], d, d2 + (double)sMa2.method_7a46288a_Dne(), d3, i, j, k, f, f3, d7, d8 + (double)sMa2.method_7a46288a_Dne(), d9);
                }
            }
        }
        wAR.method_7a46288d_Dne();
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glDisable(3042);
        GL11.glDepthMask(true);
    }
}

