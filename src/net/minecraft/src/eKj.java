package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class eKj
extends QCe {
    public float field_2e5f18_bzF = 0.0f;
    private zVu field_20386492_FWm = new zVu();
    public static boolean field_21261e_FWm = false;
    private Random field_7331eae7_Dne = new Random();
    public boolean field_2092bf_Dne = true;

    public void method_f14f8cda_bzF(msA msA2, Snh snh, NMq nMq, int n, int n2) {
        this.method_75d29071_Dne(msA2, snh, nMq, n, n2, null);
    }

    private void method_f053834c_Dne(JiM jiM, gDn gDn2, int n, float f, float f2, float f3, float f4) {
        WAR wAR = WAR.field_36e5ca4_Dne;
        if (gDn2 == null) {
            gDn2 = this.field_37a7828_Dne.field_36d36bf_Dne.method_9e795529_Dne(jiM.method_23040479_Dne().method_7a46288d_Dne());
        }
        float f5 = gDn2.method_7a46288a_Dne();
        float f6 = gDn2.method_7c6f6029_FWm();
        float f7 = gDn2.method_ae128db7_bzF();
        float f8 = gDn2.method_907a9d11_Qnq();
        float f9 = 1.0f;
        float f10 = 0.5f;
        float f11 = 0.25f;
        if (this.field_37a7828_Dne.field_3758af7_Dne.field_2d2a05_aFZ) {
            GL11.glPushMatrix();
            if (field_21261e_FWm) {
                GL11.glRotatef(180.0f, 0.0f, 1.0f, 0.0f);
            } else {
                GL11.glRotatef((((float)jiM.field_2092ae_Dne + f) / 20.0f + jiM.field_2092ab_Dne) * 57.295776f, 0.0f, 1.0f, 0.0f);
            }
            float f12 = 0.0625f;
            float f13 = 0.021875f;
            NMq nMq = jiM.method_23040479_Dne();
            int n2 = nMq.field_2092ae_Dne;
            int n3 = n2 < 2 ? 1 : (n2 < 16 ? 2 : (n2 < 32 ? 3 : 4));
            GL11.glTranslatef(-f10, -f11, -((f12 + f13) * (float)n3 / 2.0f));
            for (int i = 0; i < n3; ++i) {
                GL11.glTranslatef(0.0f, 0.0f, f12 + f13);
                if (nMq.method_7a46288d_Dne() == 0 && zKP.field_8374b848_Dne[nMq.field_2e5f1b_bzF] != null) {
                    this.method_8f501fe4_Dne("/terrain.png");
                } else {
                    this.method_8f501fe4_Dne("/gui/items.png");
                }
                GL11.glColor4f(f2, f3, f4, 1.0f);
                XyI.method_dc11f761_Dne(wAR, f6, f7, f5, f8, gDn2.method_ae128dba_bzF(), gDn2.method_907a9d14_Qnq(), f12);
                if (nMq == null || !nMq.method_7ad38807_DyG()) continue;
                GL11.glDepthFunc(514);
                GL11.glDisable(2896);
                this.field_37a7828_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("%blur%/misc/glint.png");
                GL11.glEnable(3042);
                GL11.glBlendFunc(768, 1);
                float f14 = 0.76f;
                GL11.glColor4f(0.5f * f14, 0.25f * f14, 0.8f * f14, 1.0f);
                GL11.glMatrixMode(5890);
                GL11.glPushMatrix();
                float f15 = 0.125f;
                GL11.glScalef(f15, f15, f15);
                float f16 = (float)(Minecraft.method_7a46288e_Dne() % 3000L) / 3000.0f * 8.0f;
                GL11.glTranslatef(f16, 0.0f, 0.0f);
                GL11.glRotatef(-50.0f, 0.0f, 0.0f, 1.0f);
                XyI.method_dc11f761_Dne(wAR, 0.0f, 0.0f, 1.0f, 1.0f, 255, 255, f12);
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                GL11.glScalef(f15, f15, f15);
                f16 = (float)(Minecraft.method_7a46288e_Dne() % 4873L) / 4873.0f * 8.0f;
                GL11.glTranslatef(-f16, 0.0f, 0.0f);
                GL11.glRotatef(10.0f, 0.0f, 0.0f, 1.0f);
                XyI.method_dc11f761_Dne(wAR, 0.0f, 0.0f, 1.0f, 1.0f, 255, 255, f12);
                GL11.glPopMatrix();
                GL11.glMatrixMode(5888);
                GL11.glDisable(3042);
                GL11.glEnable(2896);
                GL11.glDepthFunc(515);
            }
            GL11.glPopMatrix();
        } else {
            for (int i = 0; i < n; ++i) {
                GL11.glPushMatrix();
                if (i > 0) {
                    float f17 = (this.field_7331eae7_Dne.nextFloat() * 2.0f - 1.0f) * 0.3f;
                    float f18 = (this.field_7331eae7_Dne.nextFloat() * 2.0f - 1.0f) * 0.3f;
                    float f19 = (this.field_7331eae7_Dne.nextFloat() * 2.0f - 1.0f) * 0.3f;
                    GL11.glTranslatef(f17, f18, f19);
                }
                if (!field_21261e_FWm) {
                    GL11.glRotatef(180.0f - this.field_37a7828_Dne.field_2092ab_Dne, 0.0f, 1.0f, 0.0f);
                }
                GL11.glColor4f(f2, f3, f4, 1.0f);
                wAR.method_7a46289a_Dne();
                wAR.method_a680f8e7_FWm(0.0f, 1.0f, 0.0f);
                wAR.method_c38c5864_Dne(0.0f - f10, 0.0f - f11, 0.0, f5, f8);
                wAR.method_c38c5864_Dne(f9 - f10, 0.0f - f11, 0.0, f6, f8);
                wAR.method_c38c5864_Dne(f9 - f10, 1.0f - f11, 0.0, f6, f7);
                wAR.method_c38c5864_Dne(0.0f - f10, 1.0f - f11, 0.0, f5, f7);
                wAR.method_7a46288d_Dne();
                GL11.glPopMatrix();
            }
        }
    }

    public eKj() {
        this.field_2092ab_Dne = 0.15f;
        this.field_21260a_FWm = 0.75f;
    }

    public void method_75d29071_Dne(msA msA2, Snh snh, NMq nMq, int n, int n2, String string) {
        if (nMq != null) {
            if (nMq.field_2092ae_Dne > 1 || string != null) {
                String string2 = string == null ? String.valueOf(nMq.field_2092ae_Dne) : string;
                GL11.glDisable(2896);
                GL11.glDisable(2929);
                msA2.method_7eed4432_Dne(string2, n + 19 - 2 - msA2.method_8f501fd7_Dne(string2), n2 + 6 + 3, 0xFFFFFF);
                GL11.glEnable(2896);
                GL11.glEnable(2929);
            }
            if (nMq.method_907a9d25_Qnq()) {
                int n3 = (int)Math.round(13.0 - (double)nMq.method_ae128dba_bzF() * 13.0 / (double)nMq.method_a98a0653_aFZ());
                int n4 = (int)Math.round(255.0 - (double)nMq.method_ae128dba_bzF() * 255.0 / (double)nMq.method_a98a0653_aFZ());
                GL11.glDisable(2896);
                GL11.glDisable(2929);
                GL11.glDisable(3553);
                WAR wAR = WAR.field_36e5ca4_Dne;
                int n5 = 255 - n4 << 16 | n4 << 8;
                int n6 = (255 - n4) / 4 << 16 | 0x3F00;
                this.method_d64c4284_Dne(wAR, n + 2, n2 + 13, 13, 2, 0);
                this.method_d64c4284_Dne(wAR, n + 2, n2 + 13, 12, 1, n6);
                this.method_d64c4284_Dne(wAR, n + 2, n2 + 13, n3, 1, n5);
                GL11.glEnable(3553);
                GL11.glEnable(2896);
                GL11.glEnable(2929);
                GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            }
        }
    }

    private void method_d4dc89e9_Dne(int n, int n2, int n3, int n4, int n5) {
        for (int i = 0; i < 2; ++i) {
            if (i == 0) {
                GL11.glBlendFunc(768, 1);
            }
            if (i == 1) {
                GL11.glBlendFunc(768, 1);
            }
            float f = 0.00390625f;
            float f2 = 0.00390625f;
            float f3 = (float)(Minecraft.method_7a46288e_Dne() % (long)(3000 + i * 1873)) / (3000.0f + (float)(i * 1873)) * 256.0f;
            float f4 = 0.0f;
            WAR wAR = WAR.field_36e5ca4_Dne;
            float f5 = 4.0f;
            if (i == 1) {
                f5 = -1.0f;
            }
            wAR.method_7a46289a_Dne();
            wAR.method_c38c5864_Dne(n2 + 0, n3 + n5, this.field_2e5f18_bzF, (f3 + (float)n5 * f5) * f, (f4 + (float)n5) * f2);
            wAR.method_c38c5864_Dne(n2 + n4, n3 + n5, this.field_2e5f18_bzF, (f3 + (float)n4 + (float)n5 * f5) * f, (f4 + (float)n5) * f2);
            wAR.method_c38c5864_Dne(n2 + n4, n3 + 0, this.field_2e5f18_bzF, (f3 + (float)n4) * f, (f4 + 0.0f) * f2);
            wAR.method_c38c5864_Dne(n2 + 0, n3 + 0, this.field_2e5f18_bzF, (f3 + 0.0f) * f, (f4 + 0.0f) * f2);
            wAR.method_7a46288d_Dne();
        }
    }

    public void method_f35902f6_Dne(int n, int n2, gDn gDn2, int n3, int n4) {
        WAR wAR = WAR.field_36e5ca4_Dne;
        wAR.method_7a46289a_Dne();
        wAR.method_c38c5864_Dne(n + 0, n2 + n4, this.field_2e5f18_bzF, gDn2.method_7a46288a_Dne(), gDn2.method_907a9d11_Qnq());
        wAR.method_c38c5864_Dne(n + n3, n2 + n4, this.field_2e5f18_bzF, gDn2.method_7c6f6029_FWm(), gDn2.method_907a9d11_Qnq());
        wAR.method_c38c5864_Dne(n + n3, n2 + 0, this.field_2e5f18_bzF, gDn2.method_7c6f6029_FWm(), gDn2.method_ae128db7_bzF());
        wAR.method_c38c5864_Dne(n + 0, n2 + 0, this.field_2e5f18_bzF, gDn2.method_7a46288a_Dne(), gDn2.method_ae128db7_bzF());
        wAR.method_7a46288d_Dne();
    }

    public void method_77c09267_Dne(msA msA2, Snh snh, NMq nMq, int n, int n2) {
        int n3 = nMq.field_2e5f1b_bzF;
        int n4 = nMq.method_907a9d14_Qnq();
        gDn gDn2 = nMq.method_230f3f9a_Dne();
        if (nMq.method_7a46288d_Dne() == 0 && zVu.method_ce7f5dad_Dne(zKP.field_8374b848_Dne[n3].method_7a46288d_Dne())) {
            snh.method_8f501fe4_Dne("/terrain.png");
            zKP zKP2 = zKP.field_8374b848_Dne[n3];
            GL11.glPushMatrix();
            GL11.glTranslatef(n - 2, n2 + 3, -3.0f + this.field_2e5f18_bzF);
            GL11.glScalef(10.0f, 10.0f, 10.0f);
            GL11.glTranslatef(1.0f, 0.5f, 1.0f);
            GL11.glScalef(1.0f, 1.0f, -1.0f);
            GL11.glRotatef(210.0f, 1.0f, 0.0f, 0.0f);
            GL11.glRotatef(45.0f, 0.0f, 1.0f, 0.0f);
            int n5 = dEr.field_836aa5b6_Dne[n3].method_fd88681_Dne(nMq, 0);
            float f = (float)(n5 >> 16 & 0xFF) / 255.0f;
            float f2 = (float)(n5 >> 8 & 0xFF) / 255.0f;
            float f3 = (float)(n5 & 0xFF) / 255.0f;
            if (this.field_2092bf_Dne) {
                GL11.glColor4f(f, f2, f3, 1.0f);
            }
            GL11.glRotatef(-90.0f, 0.0f, 1.0f, 0.0f);
            this.field_20386492_FWm.field_21261e_FWm = this.field_2092bf_Dne;
            this.field_20386492_FWm.method_23d00645_Dne(zKP2, n4, 1.0f);
            this.field_20386492_FWm.field_21261e_FWm = true;
            GL11.glPopMatrix();
        } else if (dEr.field_836aa5b6_Dne[n3].method_7a46289e_Dne()) {
            GL11.glDisable(2896);
            snh.method_8f501fe4_Dne("/gui/items.png");
            for (int i = 0; i <= 1; ++i) {
                gDn gDn3 = dEr.field_836aa5b6_Dne[n3].method_9051f17a_Dne(n4, i);
                int n6 = dEr.field_836aa5b6_Dne[n3].method_fd88681_Dne(nMq, i);
                float f = (float)(n6 >> 16 & 0xFF) / 255.0f;
                float f4 = (float)(n6 >> 8 & 0xFF) / 255.0f;
                float f5 = (float)(n6 & 0xFF) / 255.0f;
                if (this.field_2092bf_Dne) {
                    GL11.glColor4f(f, f4, f5, 1.0f);
                }
                this.method_f35902f6_Dne(n, n2, gDn3, 16, 16);
            }
            GL11.glEnable(2896);
        } else {
            GL11.glDisable(2896);
            if (nMq.method_7a46288d_Dne() == 0) {
                snh.method_8f501fe4_Dne("/terrain.png");
            } else {
                snh.method_8f501fe4_Dne("/gui/items.png");
            }
            if (gDn2 == null) {
                gDn2 = snh.method_9e795529_Dne(nMq.method_7a46288d_Dne());
            }
            int n7 = dEr.field_836aa5b6_Dne[n3].method_fd88681_Dne(nMq, 0);
            float f = (float)(n7 >> 16 & 0xFF) / 255.0f;
            float f6 = (float)(n7 >> 8 & 0xFF) / 255.0f;
            float f7 = (float)(n7 & 0xFF) / 255.0f;
            if (this.field_2092bf_Dne) {
                GL11.glColor4f(f, f6, f7, 1.0f);
            }
            this.method_f35902f6_Dne(n, n2, gDn2, 16, 16);
            GL11.glEnable(2896);
        }
        GL11.glEnable(2884);
    }

    private void method_d64c4284_Dne(WAR wAR, int n, int n2, int n3, int n4, int n5) {
        wAR.method_7a46289a_Dne();
        wAR.method_143f9e1c_bzF(n5);
        wAR.method_2be429a4_Dne(n + 0, n2 + 0, 0.0);
        wAR.method_2be429a4_Dne(n + 0, n2 + n4, 0.0);
        wAR.method_2be429a4_Dne(n + n3, n2 + n4, 0.0);
        wAR.method_2be429a4_Dne(n + n3, n2 + 0, 0.0);
        wAR.method_7a46288d_Dne();
    }

    @Override
    public void method_31745cde_Dne(sMa sMa2, double d, double d2, double d3, float f, float f2) {
        this.method_7b836f45_Dne((JiM)sMa2, d, d2, d3, f, f2);
    }

    public void method_5ae7aca8_FWm(msA msA2, Snh snh, NMq nMq, int n, int n2) {
        if (nMq != null) {
            this.method_77c09267_Dne(msA2, snh, nMq, n, n2);
            if (nMq.method_7ad38807_DyG()) {
                GL11.glDepthFunc(516);
                GL11.glDisable(2896);
                GL11.glDepthMask(false);
                snh.method_8f501fe4_Dne("%blur%/misc/glint.png");
                this.field_2e5f18_bzF -= 50.0f;
                GL11.glEnable(3042);
                GL11.glBlendFunc(774, 774);
                GL11.glColor4f(0.5f, 0.25f, 0.8f, 1.0f);
                this.method_d4dc89e9_Dne(n * 431278612 + n2 * 32178161, n - 2, n2 - 2, 20, 20);
                GL11.glDisable(3042);
                GL11.glDepthMask(true);
                this.field_2e5f18_bzF += 50.0f;
                GL11.glEnable(2896);
                GL11.glDepthFunc(515);
            }
        }
    }

    public void method_7b836f45_Dne(JiM jiM, double d, double d2, double d3, float f, float f2) {
        this.field_7331eae7_Dne.setSeed(187L);
        NMq nMq = jiM.method_23040479_Dne();
        if (nMq.method_230de6ba_Dne() != null) {
            GL11.glPushMatrix();
            float f3 = geR.method_ce7f5256_Dne(((float)jiM.field_2092ae_Dne + f2) / 10.0f + jiM.field_2092ab_Dne) * 0.1f + 0.1f;
            float f4 = (((float)jiM.field_2092ae_Dne + f2) / 20.0f + jiM.field_2092ab_Dne) * 57.295776f;
            int n = 1;
            if (jiM.method_23040479_Dne().field_2092ae_Dne > 1) {
                n = 2;
            }
            if (jiM.method_23040479_Dne().field_2092ae_Dne > 5) {
                n = 3;
            }
            if (jiM.method_23040479_Dne().field_2092ae_Dne > 20) {
                n = 4;
            }
            if (jiM.method_23040479_Dne().field_2092ae_Dne > 40) {
                n = 5;
            }
            GL11.glTranslatef((float)d, (float)d2 + f3, (float)d3);
            GL11.glEnable(32826);
            if (nMq.method_7a46288d_Dne() == 0 && zKP.field_8374b848_Dne[nMq.field_2e5f1b_bzF] != null && zVu.method_ce7f5dad_Dne(zKP.field_8374b848_Dne[nMq.field_2e5f1b_bzF].method_7a46288d_Dne())) {
                zKP zKP2 = zKP.field_8374b848_Dne[nMq.field_2e5f1b_bzF];
                GL11.glRotatef(f4, 0.0f, 1.0f, 0.0f);
                if (field_21261e_FWm) {
                    GL11.glScalef(1.25f, 1.25f, 1.25f);
                    GL11.glTranslatef(0.0f, 0.05f, 0.0f);
                    GL11.glRotatef(-90.0f, 0.0f, 1.0f, 0.0f);
                }
                this.method_8f501fe4_Dne("/terrain.png");
                float f5 = 0.25f;
                int n2 = zKP2.method_7a46288d_Dne();
                if (n2 == 1 || n2 == 19 || n2 == 12 || n2 == 2) {
                    f5 = 0.5f;
                }
                GL11.glScalef(f5, f5, f5);
                for (int i = 0; i < n; ++i) {
                    float f6;
                    GL11.glPushMatrix();
                    if (i > 0) {
                        f6 = (this.field_7331eae7_Dne.nextFloat() * 2.0f - 1.0f) * 0.2f / f5;
                        float f7 = (this.field_7331eae7_Dne.nextFloat() * 2.0f - 1.0f) * 0.2f / f5;
                        float f8 = (this.field_7331eae7_Dne.nextFloat() * 2.0f - 1.0f) * 0.2f / f5;
                        GL11.glTranslatef(f6, f7, f8);
                    }
                    f6 = 1.0f;
                    this.field_20386492_FWm.method_23d00645_Dne(zKP2, nMq.method_907a9d14_Qnq(), f6);
                    GL11.glPopMatrix();
                }
            } else if (nMq.method_230de6ba_Dne().method_7a46289e_Dne()) {
                if (field_21261e_FWm) {
                    GL11.glScalef(0.5128205f, 0.5128205f, 0.5128205f);
                    GL11.glTranslatef(0.0f, -0.05f, 0.0f);
                } else {
                    GL11.glScalef(0.5f, 0.5f, 0.5f);
                }
                this.method_8f501fe4_Dne("/gui/items.png");
                for (int i = 0; i <= 1; ++i) {
                    this.field_7331eae7_Dne.setSeed(187L);
                    gDn gDn2 = nMq.method_230de6ba_Dne().method_9051f17a_Dne(nMq.method_907a9d14_Qnq(), i);
                    float f9 = 1.0f;
                    if (this.field_2092bf_Dne) {
                        int n3 = dEr.field_836aa5b6_Dne[nMq.field_2e5f1b_bzF].method_fd88681_Dne(nMq, i);
                        float f10 = (float)(n3 >> 16 & 0xFF) / 255.0f;
                        float f11 = (float)(n3 >> 8 & 0xFF) / 255.0f;
                        float f12 = (float)(n3 & 0xFF) / 255.0f;
                        GL11.glColor4f(f10 * f9, f11 * f9, f12 * f9, 1.0f);
                        this.method_f053834c_Dne(jiM, gDn2, n, f2, f10 * f9, f11 * f9, f12 * f9);
                        continue;
                    }
                    this.method_f053834c_Dne(jiM, gDn2, n, f2, 1.0f, 1.0f, 1.0f);
                }
            } else {
                if (field_21261e_FWm) {
                    GL11.glScalef(0.5128205f, 0.5128205f, 0.5128205f);
                    GL11.glTranslatef(0.0f, -0.05f, 0.0f);
                } else {
                    GL11.glScalef(0.5f, 0.5f, 0.5f);
                }
                gDn gDn3 = nMq.method_230f3f9a_Dne();
                if (nMq.method_7a46288d_Dne() == 0) {
                    this.method_8f501fe4_Dne("/terrain.png");
                } else {
                    this.method_8f501fe4_Dne("/gui/items.png");
                }
                if (this.field_2092bf_Dne) {
                    int n4 = dEr.field_836aa5b6_Dne[nMq.field_2e5f1b_bzF].method_fd88681_Dne(nMq, 0);
                    float f13 = (float)(n4 >> 16 & 0xFF) / 255.0f;
                    float f14 = (float)(n4 >> 8 & 0xFF) / 255.0f;
                    float f15 = (float)(n4 & 0xFF) / 255.0f;
                    float f16 = 1.0f;
                    this.method_f053834c_Dne(jiM, gDn3, n, f2, f13 * f16, f14 * f16, f15 * f16);
                } else {
                    this.method_f053834c_Dne(jiM, gDn3, n, f2, 1.0f, 1.0f, 1.0f);
                }
            }
            GL11.glDisable(32826);
            GL11.glPopMatrix();
        }
    }
}

