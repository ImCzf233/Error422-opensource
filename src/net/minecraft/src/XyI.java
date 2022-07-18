package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class XyI {
    private float field_2092ab_Dne = 0.0f;
    private float field_21260a_FWm = 0.0f;
    private int field_2092ae_Dne = -1;
    public final BXL field_3652676_Dne;
    private NMq field_36a761a_Dne = null;
    private zVu field_37e98b3_Dne = new zVu();
    private Minecraft field_493682ed_Dne;

    public void method_ae128dc7_bzF() {
        this.field_2092ab_Dne = 0.0f;
    }

    public void method_ce7f5266_Dne(float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        Object object;
        float f7 = this.field_21260a_FWm + (this.field_2092ab_Dne - this.field_21260a_FWm) * f;
        MJs mJs = this.field_493682ed_Dne.field_369f6b6_Dne;
        float f8 = mJs.field_31b813_kGO + (mJs.field_29186a_XHL - mJs.field_31b813_kGO) * f;
        GL11.glPushMatrix();
        GL11.glRotatef(f8, 1.0f, 0.0f, 0.0f);
        GL11.glRotatef(mJs.field_2a9ad3_Zpi + (mJs.field_334489_mrb - mJs.field_2a9ad3_Zpi) * f, 0.0f, 1.0f, 0.0f);
        Cit.method_7c6f6039_FWm();
        GL11.glPopMatrix();
        if (mJs instanceof FKB) {
            object = mJs;
            f6 = ((FKB)object).field_267cf2_Qnq + (((FKB)object).field_21260a_FWm - ((FKB)object).field_267cf2_Qnq) * f;
            f5 = ((FKB)object).field_2e5f18_bzF + (((FKB)object).field_2092ab_Dne - ((FKB)object).field_2e5f18_bzF) * f;
            GL11.glRotatef((mJs.field_29186a_XHL - f6) * 0.1f, 1.0f, 0.0f, 0.0f);
            GL11.glRotatef((mJs.field_334489_mrb - f5) * 0.1f, 0.0f, 1.0f, 0.0f);
        }
        object = this.field_36a761a_Dne;
        f6 = this.field_493682ed_Dne.field_36ebf36_Dne.method_2c2cf7b9_Dne(geR.method_117d0718_FWm(mJs.field_2f0dd3_div), geR.method_117d0718_FWm(mJs.field_22c5fd_IjH), geR.method_117d0718_FWm(mJs.field_334487_mrb));
        f6 = 1.0f;
        int n = this.field_493682ed_Dne.field_36ebf36_Dne.method_5972744d_Dne(geR.method_117d0718_FWm(mJs.field_2f0dd3_div), geR.method_117d0718_FWm(mJs.field_22c5fd_IjH), geR.method_117d0718_FWm(mJs.field_334487_mrb), 0);
        int n2 = n % 65536;
        int n3 = n / 65536;
        oCF.method_2c2b8f69_Dne(oCF.field_21260d_FWm, (float)n2 / 1.0f, (float)n3 / 1.0f);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        if (object != null) {
            n = dEr.field_836aa5b6_Dne[((NMq)object).field_2e5f1b_bzF].method_fd88681_Dne((NMq)object, 0);
            f4 = (float)(n >> 16 & 0xFF) / 255.0f;
            f3 = (float)(n >> 8 & 0xFF) / 255.0f;
            f2 = (float)(n & 0xFF) / 255.0f;
            GL11.glColor4f(f6 * f4, f6 * f3, f6 * f2, 1.0f);
        } else {
            GL11.glColor4f(f6, f6, f6, 1.0f);
        }
        if (object != null && ((NMq)object).field_2e5f1b_bzF == dEr.field_3792594_Dne.field_267cf5_Qnq) {
            float f9;
            GL11.glPushMatrix();
            f5 = 0.8f;
            f4 = mJs.method_117d0e97_FWm(f);
            f3 = geR.method_ce7f5256_Dne(f4 * (float)Math.PI);
            f2 = geR.method_ce7f5256_Dne(geR.method_143f92c9_bzF(f4) * (float)Math.PI);
            GL11.glTranslatef(-f2 * 0.4f, geR.method_ce7f5256_Dne(geR.method_143f92c9_bzF(f4) * (float)Math.PI * 2.0f) * 0.2f, -f3 * 0.2f);
            f4 = 1.0f - f8 / 45.0f + 0.1f;
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            if (f4 > 1.0f) {
                f4 = 1.0f;
            }
            f4 = -geR.method_117d0e97_FWm(f4 * (float)Math.PI) * 0.5f + 0.5f;
            GL11.glTranslatef(0.0f, 0.0f * f5 - (1.0f - f7) * 1.2f - f4 * 0.5f + 0.04f, -0.9f * f5);
            GL11.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(f4 * -85.0f, 0.0f, 0.0f, 1.0f);
            GL11.glEnable(32826);
            GL11.glBindTexture(3553, this.field_493682ed_Dne.field_36d36bf_Dne.method_abaa98a1_Dne(this.field_493682ed_Dne.field_369f6b6_Dne.field_569fcf45_Dne, this.field_493682ed_Dne.field_369f6b6_Dne.method_6859cdb9_bzF()));
            this.field_493682ed_Dne.field_36d36bf_Dne.method_7a46289a_Dne();
            for (n3 = 0; n3 < 2; ++n3) {
                int n4 = n3 * 2 - 1;
                GL11.glPushMatrix();
                GL11.glTranslatef(-0.0f, -0.6f, 1.1f * (float)n4);
                GL11.glRotatef(-45 * n4, 1.0f, 0.0f, 0.0f);
                GL11.glRotatef(-90.0f, 0.0f, 0.0f, 1.0f);
                GL11.glRotatef(59.0f, 0.0f, 0.0f, 1.0f);
                GL11.glRotatef(-65 * n4, 0.0f, 1.0f, 0.0f);
                QCe qCe = ptH.field_37a7828_Dne.method_9a2db71e_Dne(this.field_493682ed_Dne.field_369f6b6_Dne);
                CSH cSH = (CSH)qCe;
                f9 = 1.0f;
                GL11.glScalef(f9, f9, f9);
                cSH.method_49863864_FWm(this.field_493682ed_Dne.field_369f6b6_Dne);
                GL11.glPopMatrix();
            }
            f3 = mJs.method_117d0e97_FWm(f);
            f2 = geR.method_ce7f5256_Dne(f3 * f3 * (float)Math.PI);
            float f10 = geR.method_ce7f5256_Dne(geR.method_143f92c9_bzF(f3) * (float)Math.PI);
            GL11.glRotatef(-f2 * 20.0f, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(-f10 * 20.0f, 0.0f, 0.0f, 1.0f);
            GL11.glRotatef(-f10 * 80.0f, 1.0f, 0.0f, 0.0f);
            float f11 = 0.38f;
            GL11.glScalef(f11, f11, f11);
            GL11.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
            GL11.glTranslatef(-1.0f, -1.0f, 0.0f);
            f9 = 0.015625f;
            GL11.glScalef(f9, f9, f9);
            this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/misc/mapbg.png");
            WAR wAR = WAR.field_36e5ca4_Dne;
            GL11.glNormal3f(0.0f, 0.0f, -1.0f);
            wAR.method_7a46289a_Dne();
            int n5 = 7;
            wAR.method_c38c5864_Dne(0 - n5, 128 + n5, 0.0, 0.0, 1.0);
            wAR.method_c38c5864_Dne(128 + n5, 128 + n5, 0.0, 1.0, 1.0);
            wAR.method_c38c5864_Dne(128 + n5, 0 - n5, 0.0, 1.0, 0.0);
            wAR.method_c38c5864_Dne(0 - n5, 0 - n5, 0.0, 0.0, 0.0);
            wAR.method_7a46288d_Dne();
            Ilk ilk = dEr.field_3792594_Dne.method_ee3739a1_Dne((NMq)object, this.field_493682ed_Dne.field_36ebf36_Dne);
            if (ilk != null) {
                this.field_3652676_Dne.method_bd66b148_Dne(this.field_493682ed_Dne.field_369f6b6_Dne, this.field_493682ed_Dne.field_36d36bf_Dne, ilk);
            }
            GL11.glPopMatrix();
        } else if (object != null) {
            float f12;
            float f13;
            float f14;
            GL11.glPushMatrix();
            f5 = 0.8f;
            if (mJs.method_c5287a51_qLR() > 0) {
                een een2 = ((NMq)object).method_230ed2bd_Dne();
                if (een2 == een.field_202f103d_FWm || een2 == een.field_75bd124b_bzF) {
                    f3 = (float)mJs.method_c5287a51_qLR() - f + 1.0f;
                    f2 = 1.0f - f3 / (float)((NMq)object).method_d44b4585_zGp();
                    f14 = 1.0f - f2;
                    f14 = f14 * f14 * f14;
                    f14 = f14 * f14 * f14;
                    f14 = f14 * f14 * f14;
                    float f15 = 1.0f - f14;
                    GL11.glTranslatef(0.0f, geR.method_7ed96eaf_Qnq(geR.method_117d0e97_FWm(f3 / 4.0f * (float)Math.PI) * 0.1f) * (float)((double)f2 > 0.2 ? 1 : 0), 0.0f);
                    GL11.glTranslatef(f15 * 0.6f, -f15 * 0.5f, 0.0f);
                    GL11.glRotatef(f15 * 90.0f, 0.0f, 1.0f, 0.0f);
                    GL11.glRotatef(f15 * 10.0f, 1.0f, 0.0f, 0.0f);
                    GL11.glRotatef(f15 * 30.0f, 0.0f, 0.0f, 1.0f);
                }
            } else {
                f4 = mJs.method_117d0e97_FWm(f);
                f3 = geR.method_ce7f5256_Dne(f4 * (float)Math.PI);
                f2 = geR.method_ce7f5256_Dne(geR.method_143f92c9_bzF(f4) * (float)Math.PI);
                GL11.glTranslatef(-f2 * 0.4f, geR.method_ce7f5256_Dne(geR.method_143f92c9_bzF(f4) * (float)Math.PI * 2.0f) * 0.2f, -f3 * 0.2f);
            }
            GL11.glTranslatef(0.7f * f5, -0.65f * f5 - (1.0f - f7) * 0.6f, -0.9f * f5);
            GL11.glRotatef(45.0f, 0.0f, 1.0f, 0.0f);
            GL11.glEnable(32826);
            f4 = mJs.method_117d0e97_FWm(f);
            f3 = geR.method_ce7f5256_Dne(f4 * f4 * (float)Math.PI);
            f2 = geR.method_ce7f5256_Dne(geR.method_143f92c9_bzF(f4) * (float)Math.PI);
            GL11.glRotatef(-f3 * 20.0f, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(-f2 * 20.0f, 0.0f, 0.0f, 1.0f);
            GL11.glRotatef(-f2 * 80.0f, 1.0f, 0.0f, 0.0f);
            f14 = 0.4f;
            GL11.glScalef(f14, f14, f14);
            if (mJs.method_c5287a51_qLR() > 0) {
                een een3 = ((NMq)object).method_230ed2bd_Dne();
                if (een3 == een.field_5e5eb325_Qnq) {
                    GL11.glTranslatef(-0.5f, 0.2f, 0.0f);
                    GL11.glRotatef(30.0f, 0.0f, 1.0f, 0.0f);
                    GL11.glRotatef(-80.0f, 1.0f, 0.0f, 0.0f);
                    GL11.glRotatef(60.0f, 0.0f, 1.0f, 0.0f);
                } else if (een3 == een.field_7138c8a4_aFZ) {
                    GL11.glRotatef(-18.0f, 0.0f, 0.0f, 1.0f);
                    GL11.glRotatef(-12.0f, 0.0f, 1.0f, 0.0f);
                    GL11.glRotatef(-8.0f, 1.0f, 0.0f, 0.0f);
                    GL11.glTranslatef(-0.9f, 0.2f, 0.0f);
                    f13 = (float)((NMq)object).method_d44b4585_zGp() - ((float)mJs.method_c5287a51_qLR() - f + 1.0f);
                    float f16 = f13 / 20.0f;
                    f16 = (f16 * f16 + f16 * 2.0f) / 3.0f;
                    if (f16 > 1.0f) {
                        f16 = 1.0f;
                    }
                    if (f16 > 0.1f) {
                        GL11.glTranslatef(0.0f, geR.method_ce7f5256_Dne((f13 - 0.1f) * 1.3f) * 0.01f * (f16 - 0.1f), 0.0f);
                    }
                    GL11.glTranslatef(0.0f, 0.0f, f16 * 0.1f);
                    GL11.glRotatef(-335.0f, 0.0f, 0.0f, 1.0f);
                    GL11.glRotatef(-50.0f, 0.0f, 1.0f, 0.0f);
                    GL11.glTranslatef(0.0f, 0.5f, 0.0f);
                    f12 = 1.0f + f16 * 0.2f;
                    GL11.glScalef(1.0f, 1.0f, f12);
                    GL11.glTranslatef(0.0f, -0.5f, 0.0f);
                    GL11.glRotatef(50.0f, 0.0f, 1.0f, 0.0f);
                    GL11.glRotatef(335.0f, 0.0f, 0.0f, 1.0f);
                }
            }
            if (((NMq)object).method_230de6ba_Dne().method_ae128dcb_bzF()) {
                GL11.glRotatef(180.0f, 0.0f, 1.0f, 0.0f);
            }
            if (((NMq)object).method_230de6ba_Dne().method_7a46289e_Dne()) {
                this.method_d09371e2_Dne(mJs, (NMq)object, 0);
                int n6 = dEr.field_836aa5b6_Dne[((NMq)object).field_2e5f1b_bzF].method_fd88681_Dne((NMq)object, 1);
                f13 = (float)(n6 >> 16 & 0xFF) / 255.0f;
                float f17 = (float)(n6 >> 8 & 0xFF) / 255.0f;
                f12 = (float)(n6 & 0xFF) / 255.0f;
                GL11.glColor4f(f6 * f13, f6 * f17, f6 * f12, 1.0f);
                this.method_d09371e2_Dne(mJs, (NMq)object, 1);
            } else {
                this.method_d09371e2_Dne(mJs, (NMq)object, 0);
            }
            GL11.glPopMatrix();
        } else if (!mJs.method_998e662d_Vxn()) {
            GL11.glPushMatrix();
            f5 = 0.8f;
            f4 = mJs.method_117d0e97_FWm(f);
            f3 = geR.method_ce7f5256_Dne(f4 * (float)Math.PI);
            f2 = geR.method_ce7f5256_Dne(geR.method_143f92c9_bzF(f4) * (float)Math.PI);
            GL11.glTranslatef(-f2 * 0.3f, geR.method_ce7f5256_Dne(geR.method_143f92c9_bzF(f4) * (float)Math.PI * 2.0f) * 0.4f, -f3 * 0.4f);
            GL11.glTranslatef(0.8f * f5, -0.75f * f5 - (1.0f - f7) * 0.6f, -0.9f * f5);
            GL11.glRotatef(45.0f, 0.0f, 1.0f, 0.0f);
            GL11.glEnable(32826);
            f4 = mJs.method_117d0e97_FWm(f);
            f3 = geR.method_ce7f5256_Dne(f4 * f4 * (float)Math.PI);
            f2 = geR.method_ce7f5256_Dne(geR.method_143f92c9_bzF(f4) * (float)Math.PI);
            GL11.glRotatef(f2 * 70.0f, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(-f3 * 20.0f, 0.0f, 0.0f, 1.0f);
            GL11.glBindTexture(3553, this.field_493682ed_Dne.field_36d36bf_Dne.method_abaa98a1_Dne(this.field_493682ed_Dne.field_369f6b6_Dne.field_569fcf45_Dne, this.field_493682ed_Dne.field_369f6b6_Dne.method_6859cdb9_bzF()));
            this.field_493682ed_Dne.field_36d36bf_Dne.method_7a46289a_Dne();
            GL11.glTranslatef(-1.0f, 3.6f, 3.5f);
            GL11.glRotatef(120.0f, 0.0f, 0.0f, 1.0f);
            GL11.glRotatef(200.0f, 1.0f, 0.0f, 0.0f);
            GL11.glRotatef(-135.0f, 0.0f, 1.0f, 0.0f);
            GL11.glScalef(1.0f, 1.0f, 1.0f);
            GL11.glTranslatef(5.6f, 0.0f, 0.0f);
            QCe qCe = ptH.field_37a7828_Dne.method_9a2db71e_Dne(this.field_493682ed_Dne.field_369f6b6_Dne);
            CSH cSH = (CSH)qCe;
            float f18 = 1.0f;
            GL11.glScalef(f18, f18, f18);
            cSH.method_49863864_FWm(this.field_493682ed_Dne.field_369f6b6_Dne);
            GL11.glPopMatrix();
        }
        GL11.glDisable(32826);
        Cit.method_7a46289a_Dne();
    }

    private void method_60bfdbaa_Dne(float f, gDn gDn2) {
        WAR wAR = WAR.field_36e5ca4_Dne;
        float f2 = 0.1f;
        GL11.glColor4f(f2, f2, f2, 0.5f);
        GL11.glPushMatrix();
        float f3 = -1.0f;
        float f4 = 1.0f;
        float f5 = -1.0f;
        float f6 = 1.0f;
        float f7 = -0.5f;
        float f8 = gDn2.method_7a46288a_Dne();
        float f9 = gDn2.method_7c6f6029_FWm();
        float f10 = gDn2.method_ae128db7_bzF();
        float f11 = gDn2.method_907a9d11_Qnq();
        wAR.method_7a46289a_Dne();
        wAR.method_c38c5864_Dne(f3, f5, f7, f9, f11);
        wAR.method_c38c5864_Dne(f4, f5, f7, f8, f11);
        wAR.method_c38c5864_Dne(f4, f6, f7, f8, f10);
        wAR.method_c38c5864_Dne(f3, f6, f7, f9, f10);
        wAR.method_7a46288d_Dne();
        GL11.glPopMatrix();
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
    }

    private void method_143f92d9_bzF(float f) {
        WAR wAR = WAR.field_36e5ca4_Dne;
        float f2 = this.field_493682ed_Dne.field_369f6b6_Dne.method_ce7f5256_Dne(f);
        GL11.glColor4f(f2, f2, f2, 0.5f);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glPushMatrix();
        float f3 = 4.0f;
        float f4 = -1.0f;
        float f5 = 1.0f;
        float f6 = -1.0f;
        float f7 = 1.0f;
        float f8 = -0.5f;
        float f9 = -this.field_493682ed_Dne.field_369f6b6_Dne.field_334489_mrb / 64.0f;
        float f10 = this.field_493682ed_Dne.field_369f6b6_Dne.field_29186a_XHL / 64.0f;
        wAR.method_7a46289a_Dne();
        wAR.method_c38c5864_Dne(f4, f6, f8, f3 + f9, f3 + f10);
        wAR.method_c38c5864_Dne(f5, f6, f8, 0.0f + f9, f3 + f10);
        wAR.method_c38c5864_Dne(f5, f7, f8, 0.0f + f9, 0.0f + f10);
        wAR.method_c38c5864_Dne(f4, f7, f8, f3 + f9, 0.0f + f10);
        wAR.method_7a46288d_Dne();
        GL11.glPopMatrix();
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glDisable(3042);
    }

    public void method_117d0ea7_FWm(float f) {
        GL11.glDisable(3008);
        if (this.field_493682ed_Dne.field_369f6b6_Dne.method_cc5ef5c4_trS()) {
            this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/terrain.png");
            this.method_7ed96ebf_Qnq(f);
        }
        if (this.field_493682ed_Dne.field_369f6b6_Dne.method_c3b4a2d4_ooe()) {
            int n = geR.method_117d0718_FWm(this.field_493682ed_Dne.field_369f6b6_Dne.field_2f0dd3_div);
            int n2 = geR.method_117d0718_FWm(this.field_493682ed_Dne.field_369f6b6_Dne.field_22c5fd_IjH);
            int n3 = geR.method_117d0718_FWm(this.field_493682ed_Dne.field_369f6b6_Dne.field_334487_mrb);
            this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/terrain.png");
            int n4 = this.field_493682ed_Dne.field_36ebf36_Dne.method_2c2cf7bc_Dne(n, n2, n3);
            if (this.field_493682ed_Dne.field_36ebf36_Dne.method_6fdef3c4_DyG(n, n2, n3)) {
                this.method_60bfdbaa_Dne(f, zKP.field_8374b848_Dne[n4].method_77cd08ea_FWm(2));
            } else {
                for (int i = 0; i < 8; ++i) {
                    int n5;
                    int n6;
                    float f2 = ((float)((i >> 0) % 2) - 0.5f) * this.field_493682ed_Dne.field_369f6b6_Dne.field_342261_ooe * 0.9f;
                    float f3 = ((float)((i >> 1) % 2) - 0.5f) * this.field_493682ed_Dne.field_369f6b6_Dne.field_367151_trS * 0.2f;
                    float f4 = ((float)((i >> 2) % 2) - 0.5f) * this.field_493682ed_Dne.field_369f6b6_Dne.field_342261_ooe * 0.9f;
                    int n7 = geR.method_ce7f5259_Dne((float)n + f2);
                    if (!this.field_493682ed_Dne.field_36ebf36_Dne.method_6fdef3c4_DyG(n7, n6 = geR.method_ce7f5259_Dne((float)n2 + f3), n5 = geR.method_ce7f5259_Dne((float)n3 + f4))) continue;
                    n4 = this.field_493682ed_Dne.field_36ebf36_Dne.method_2c2cf7bc_Dne(n7, n6, n5);
                }
            }
            if (zKP.field_8374b848_Dne[n4] != null) {
                this.method_60bfdbaa_Dne(f, zKP.field_8374b848_Dne[n4].method_77cd08ea_FWm(2));
            }
        }
        if (this.field_493682ed_Dne.field_369f6b6_Dne.method_76dab7e2_Dne(KFd.field_1411d34d_div)) {
            this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/misc/water.png");
            this.method_143f92d9_bzF(f);
        }
        GL11.glEnable(3008);
    }

    public void method_7c6f6039_FWm() {
        this.field_2092ab_Dne = 0.0f;
    }

    public static void method_dc11f761_Dne(WAR wAR, float f, float f2, float f3, float f4, int n, int n2, float f5) {
        float f6;
        float f7;
        float f8;
        wAR.method_7a46289a_Dne();
        wAR.method_a680f8e7_FWm(0.0f, 0.0f, 1.0f);
        wAR.method_c38c5864_Dne(0.0, 0.0, 0.0, f, f4);
        wAR.method_c38c5864_Dne(1.0, 0.0, 0.0, f3, f4);
        wAR.method_c38c5864_Dne(1.0, 1.0, 0.0, f3, f2);
        wAR.method_c38c5864_Dne(0.0, 1.0, 0.0, f, f2);
        wAR.method_7a46288d_Dne();
        wAR.method_7a46289a_Dne();
        wAR.method_a680f8e7_FWm(0.0f, 0.0f, -1.0f);
        wAR.method_c38c5864_Dne(0.0, 1.0, 0.0f - f5, f, f2);
        wAR.method_c38c5864_Dne(1.0, 1.0, 0.0f - f5, f3, f2);
        wAR.method_c38c5864_Dne(1.0, 0.0, 0.0f - f5, f3, f4);
        wAR.method_c38c5864_Dne(0.0, 0.0, 0.0f - f5, f, f4);
        wAR.method_7a46288d_Dne();
        float f9 = (float)n * (f - f3);
        float f10 = (float)n2 * (f4 - f2);
        wAR.method_7a46289a_Dne();
        wAR.method_a680f8e7_FWm(-1.0f, 0.0f, 0.0f);
        int n3 = 0;
        while ((float)n3 < f9) {
            f8 = (float)n3 / f9;
            f7 = f + (f3 - f) * f8 - 0.5f / (float)n;
            wAR.method_c38c5864_Dne(f8, 0.0, 0.0f - f5, f7, f4);
            wAR.method_c38c5864_Dne(f8, 0.0, 0.0, f7, f4);
            wAR.method_c38c5864_Dne(f8, 1.0, 0.0, f7, f2);
            wAR.method_c38c5864_Dne(f8, 1.0, 0.0f - f5, f7, f2);
            ++n3;
        }
        wAR.method_7a46288d_Dne();
        wAR.method_7a46289a_Dne();
        wAR.method_a680f8e7_FWm(1.0f, 0.0f, 0.0f);
        n3 = 0;
        while ((float)n3 < f9) {
            f8 = (float)n3 / f9;
            f7 = f + (f3 - f) * f8 - 0.5f / (float)n;
            f6 = f8 + 1.0f / f9;
            wAR.method_c38c5864_Dne(f6, 1.0, 0.0f - f5, f7, f2);
            wAR.method_c38c5864_Dne(f6, 1.0, 0.0, f7, f2);
            wAR.method_c38c5864_Dne(f6, 0.0, 0.0, f7, f4);
            wAR.method_c38c5864_Dne(f6, 0.0, 0.0f - f5, f7, f4);
            ++n3;
        }
        wAR.method_7a46288d_Dne();
        wAR.method_7a46289a_Dne();
        wAR.method_a680f8e7_FWm(0.0f, 1.0f, 0.0f);
        n3 = 0;
        while ((float)n3 < f10) {
            f8 = (float)n3 / f10;
            f7 = f4 + (f2 - f4) * f8 - 0.5f / (float)n2;
            f6 = f8 + 1.0f / f10;
            wAR.method_c38c5864_Dne(0.0, f6, 0.0, f, f7);
            wAR.method_c38c5864_Dne(1.0, f6, 0.0, f3, f7);
            wAR.method_c38c5864_Dne(1.0, f6, 0.0f - f5, f3, f7);
            wAR.method_c38c5864_Dne(0.0, f6, 0.0f - f5, f, f7);
            ++n3;
        }
        wAR.method_7a46288d_Dne();
        wAR.method_7a46289a_Dne();
        wAR.method_a680f8e7_FWm(0.0f, -1.0f, 0.0f);
        n3 = 0;
        while ((float)n3 < f10) {
            f8 = (float)n3 / f10;
            f7 = f4 + (f2 - f4) * f8 - 0.5f / (float)n2;
            wAR.method_c38c5864_Dne(1.0, f8, 0.0, f3, f7);
            wAR.method_c38c5864_Dne(0.0, f8, 0.0, f, f7);
            wAR.method_c38c5864_Dne(0.0, f8, 0.0f - f5, f, f7);
            wAR.method_c38c5864_Dne(1.0, f8, 0.0f - f5, f3, f7);
            ++n3;
        }
        wAR.method_7a46288d_Dne();
    }

    public XyI(Minecraft minecraft) {
        this.field_493682ed_Dne = minecraft;
        this.field_3652676_Dne = new BXL(minecraft.field_3791671_Dne, minecraft.field_3758af7_Dne, minecraft.field_36d36bf_Dne);
    }

    public void method_d09371e2_Dne(FUH fUH, NMq nMq, int n) {
        GL11.glPushMatrix();
        if (nMq.method_7a46288d_Dne() == 0 && zKP.field_8374b848_Dne[nMq.field_2e5f1b_bzF] != null && zVu.method_ce7f5dad_Dne(zKP.field_8374b848_Dne[nMq.field_2e5f1b_bzF].method_7a46288d_Dne())) {
            this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/terrain.png");
            this.field_37e98b3_Dne.method_23d00645_Dne(zKP.field_8374b848_Dne[nMq.field_2e5f1b_bzF], nMq.method_907a9d14_Qnq(), 1.0f);
        } else {
            gDn gDn2 = fUH.method_cb99838e_Dne(nMq, n);
            if (gDn2 == null) {
                GL11.glPopMatrix();
                return;
            }
            if (nMq.method_7a46288d_Dne() == 0) {
                this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/terrain.png");
            } else {
                this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/gui/items.png");
            }
            WAR wAR = WAR.field_36e5ca4_Dne;
            float f = gDn2.method_7a46288a_Dne();
            float f2 = gDn2.method_7c6f6029_FWm();
            float f3 = gDn2.method_ae128db7_bzF();
            float f4 = gDn2.method_907a9d11_Qnq();
            float f5 = 0.0f;
            float f6 = 0.3f;
            GL11.glEnable(32826);
            GL11.glTranslatef(-f5, -f6, 0.0f);
            float f7 = 1.5f;
            GL11.glScalef(f7, f7, f7);
            GL11.glRotatef(50.0f, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(335.0f, 0.0f, 0.0f, 1.0f);
            GL11.glTranslatef(-0.9375f, -0.0625f, 0.0f);
            XyI.method_dc11f761_Dne(wAR, f2, f3, f, f4, gDn2.method_ae128dba_bzF(), gDn2.method_907a9d14_Qnq(), 0.0625f);
            if (nMq != null && nMq.method_7ad38807_DyG() && n == 0) {
                GL11.glDepthFunc(514);
                GL11.glDisable(2896);
                this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("%blur%/misc/glint.png");
                GL11.glEnable(3042);
                GL11.glBlendFunc(768, 1);
                float f8 = 0.76f;
                GL11.glColor4f(0.5f * f8, 0.25f * f8, 0.8f * f8, 1.0f);
                GL11.glMatrixMode(5890);
                GL11.glPushMatrix();
                float f9 = 0.125f;
                GL11.glScalef(f9, f9, f9);
                float f10 = (float)(Minecraft.method_7a46288e_Dne() % 3000L) / 3000.0f * 8.0f;
                GL11.glTranslatef(f10, 0.0f, 0.0f);
                GL11.glRotatef(-50.0f, 0.0f, 0.0f, 1.0f);
                XyI.method_dc11f761_Dne(wAR, 0.0f, 0.0f, 1.0f, 1.0f, 256, 256, 0.0625f);
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                GL11.glScalef(f9, f9, f9);
                f10 = (float)(Minecraft.method_7a46288e_Dne() % 4873L) / 4873.0f * 8.0f;
                GL11.glTranslatef(-f10, 0.0f, 0.0f);
                GL11.glRotatef(10.0f, 0.0f, 0.0f, 1.0f);
                XyI.method_dc11f761_Dne(wAR, 0.0f, 0.0f, 1.0f, 1.0f, 256, 256, 0.0625f);
                GL11.glPopMatrix();
                GL11.glMatrixMode(5888);
                GL11.glDisable(3042);
                GL11.glEnable(2896);
                GL11.glDepthFunc(515);
            }
            GL11.glDisable(32826);
        }
        GL11.glPopMatrix();
    }

    private void method_7ed96ebf_Qnq(float f) {
        WAR wAR = WAR.field_36e5ca4_Dne;
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 0.9f);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        float f2 = 1.0f;
        for (int i = 0; i < 2; ++i) {
            GL11.glPushMatrix();
            gDn gDn2 = zKP.field_3774324_Dne.method_9e795529_Dne(1);
            float f3 = gDn2.method_7a46288a_Dne();
            float f4 = gDn2.method_7c6f6029_FWm();
            float f5 = gDn2.method_ae128db7_bzF();
            float f6 = gDn2.method_907a9d11_Qnq();
            float f7 = (0.0f - f2) / 2.0f;
            float f8 = f7 + f2;
            float f9 = 0.0f - f2 / 2.0f;
            float f10 = f9 + f2;
            float f11 = -0.5f;
            GL11.glTranslatef((float)(-(i * 2 - 1)) * 0.24f, -0.3f, 0.0f);
            GL11.glRotatef((float)(i * 2 - 1) * 10.0f, 0.0f, 1.0f, 0.0f);
            wAR.method_7a46289a_Dne();
            wAR.method_c38c5864_Dne(f7, f9, f11, f4, f6);
            wAR.method_c38c5864_Dne(f8, f9, f11, f3, f6);
            wAR.method_c38c5864_Dne(f8, f10, f11, f3, f5);
            wAR.method_c38c5864_Dne(f7, f10, f11, f4, f5);
            wAR.method_7a46288d_Dne();
            GL11.glPopMatrix();
        }
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glDisable(3042);
    }

    public void method_7a46289a_Dne() {
        float f;
        float f2;
        float f3;
        boolean bl;
        this.field_21260a_FWm = this.field_2092ab_Dne;
        MJs mJs = this.field_493682ed_Dne.field_369f6b6_Dne;
        NMq nMq = mJs.field_36a059b_Dne.method_23040479_Dne();
        boolean bl2 = bl = this.field_2092ae_Dne == mJs.field_36a059b_Dne.field_2092ae_Dne && nMq == this.field_36a761a_Dne;
        if (this.field_36a761a_Dne == null && nMq == null) {
            bl = true;
        }
        if (nMq != null && this.field_36a761a_Dne != null && nMq != this.field_36a761a_Dne && nMq.field_2e5f1b_bzF == this.field_36a761a_Dne.field_2e5f1b_bzF && nMq.method_907a9d14_Qnq() == this.field_36a761a_Dne.method_907a9d14_Qnq()) {
            this.field_36a761a_Dne = nMq;
            bl = true;
        }
        if ((f3 = (f2 = bl ? 1.0f : 0.0f) - this.field_2092ab_Dne) < -(f = 0.4f)) {
            f3 = -f;
        }
        if (f3 > f) {
            f3 = f;
        }
        this.field_2092ab_Dne += f3;
        if (this.field_2092ab_Dne < 0.1f) {
            this.field_36a761a_Dne = nMq;
            this.field_2092ae_Dne = mJs.field_36a059b_Dne.field_2092ae_Dne;
        }
    }
}

