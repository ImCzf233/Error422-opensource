package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class WoI
extends QCe {
    private gDn field_375b13b_Dne;
    private final zVu field_20386492_FWm = new zVu();

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_375b13b_Dne = rbp.method_285881e4_Dne("itemframe_back");
    }

    @Override
    public void method_31745cde_Dne(sMa sMa2, double d, double d2, double d3, float f, float f2) {
        this.method_ec670142_Dne((BPY)sMa2, d, d2, d3, f, f2);
    }

    public void method_ec670142_Dne(BPY bPY, double d, double d2, double d3, float f, float f2) {
        GL11.glPushMatrix();
        float f3 = (float)(bPY.field_2f0dd3_div - d) - 0.5f;
        float f4 = (float)(bPY.field_22c5fd_IjH - d2) - 0.5f;
        float f5 = (float)(bPY.field_334487_mrb - d3) - 0.5f;
        int n = bPY.field_21260d_FWm + zxJ.field_3f1c589_Dne[bPY.field_2092ae_Dne];
        int n2 = bPY.field_2e5f1b_bzF;
        int n3 = bPY.field_267cf5_Qnq + zxJ.field_4039e0a_FWm[bPY.field_2092ae_Dne];
        GL11.glTranslatef((float)n - f3, (float)n2 - f4, (float)n3 - f5);
        this.method_6807053c_Dne(bPY);
        this.method_415ab8fd_FWm(bPY);
        GL11.glPopMatrix();
    }

    private void method_415ab8fd_FWm(BPY bPY) {
        NMq nMq = bPY.method_23040479_Dne();
        if (nMq != null) {
            JiM jiM = new JiM(bPY.field_36c4f18_Dne, 0.0, 0.0, 0.0, nMq);
            jiM.method_23040479_Dne().field_2092ae_Dne = 1;
            jiM.field_2092ab_Dne = 0.0f;
            GL11.glPushMatrix();
            GL11.glTranslatef(-0.453125f * (float)zxJ.field_3f1c589_Dne[bPY.field_2092ae_Dne], -0.18f, -0.453125f * (float)zxJ.field_4039e0a_FWm[bPY.field_2092ae_Dne]);
            GL11.glRotatef(180.0f + bPY.field_334489_mrb, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(-90 * bPY.method_907a9d14_Qnq(), 0.0f, 0.0f, 1.0f);
            switch (bPY.method_907a9d14_Qnq()) {
                case 1: {
                    GL11.glTranslatef(-0.16f, -0.16f, 0.0f);
                    break;
                }
                case 2: {
                    GL11.glTranslatef(0.0f, -0.32f, 0.0f);
                    break;
                }
                case 3: {
                    GL11.glTranslatef(0.16f, -0.16f, 0.0f);
                }
            }
            if (jiM.method_23040479_Dne().method_230de6ba_Dne() == dEr.field_3792594_Dne) {
                this.field_37a7828_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/misc/mapbg.png");
                WAR wAR = WAR.field_36e5ca4_Dne;
                GL11.glRotatef(180.0f, 0.0f, 1.0f, 0.0f);
                GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
                GL11.glScalef(0.00390625f, 0.00390625f, 0.00390625f);
                GL11.glTranslatef(-65.0f, -107.0f, -3.0f);
                GL11.glNormal3f(0.0f, 0.0f, -1.0f);
                wAR.method_7a46289a_Dne();
                int n = 7;
                wAR.method_c38c5864_Dne(0 - n, 128 + n, 0.0, 0.0, 1.0);
                wAR.method_c38c5864_Dne(128 + n, 128 + n, 0.0, 1.0, 1.0);
                wAR.method_c38c5864_Dne(128 + n, 0 - n, 0.0, 1.0, 0.0);
                wAR.method_c38c5864_Dne(0 - n, 0 - n, 0.0, 0.0, 0.0);
                wAR.method_7a46288d_Dne();
                Ilk ilk = dEr.field_3792594_Dne.method_ee3739a1_Dne(jiM.method_23040479_Dne(), bPY.field_36c4f18_Dne);
                GL11.glTranslatef(0.0f, 0.0f, -1.0f);
                if (ilk != null) {
                    this.field_37a7828_Dne.field_36fa224_Dne.field_3652676_Dne.method_bd66b148_Dne(null, this.field_37a7828_Dne.field_36d36bf_Dne, ilk);
                }
            } else {
                qjt qjt2;
                if (jiM.method_23040479_Dne().method_230de6ba_Dne() == dEr.field_9479d34e_Suj) {
                    qjt2 = qjt.field_37acc51_Dne;
                    double d = qjt2.field_2092a9_Dne;
                    double d2 = qjt2.field_212608_FWm;
                    qjt2.field_2092a9_Dne = 0.0;
                    qjt2.field_212608_FWm = 0.0;
                    qjt2.method_2cdc86cb_Dne(bPY.field_36c4f18_Dne, bPY.field_2f0dd3_div, bPY.field_334487_mrb, geR.method_87b72d50_aFZ(180 + bPY.field_2092ae_Dne * 90), false, true);
                    qjt2.field_2092a9_Dne = d;
                    qjt2.field_212608_FWm = d2;
                }
                eKj.field_21261e_FWm = true;
                ptH.field_37a7828_Dne.method_31745cde_Dne(jiM, 0.0, 0.0, 0.0, 0.0f, 0.0f);
                eKj.field_21261e_FWm = false;
                if (jiM.method_23040479_Dne().method_230de6ba_Dne() == dEr.field_9479d34e_Suj) {
                    qjt2 = qjt.field_37acc51_Dne;
                    qjt2.method_7a46289a_Dne();
                }
            }
            GL11.glPopMatrix();
        }
    }

    private void method_6807053c_Dne(BPY bPY) {
        GL11.glPushMatrix();
        this.field_37a7828_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/terrain.png");
        GL11.glRotatef(bPY.field_334489_mrb, 0.0f, 1.0f, 0.0f);
        zKP zKP2 = zKP.field_5e67d9b4_Qnq;
        float f = 0.0625f;
        float f2 = 0.75f;
        float f3 = f2 / 2.0f;
        GL11.glPushMatrix();
        this.field_20386492_FWm.method_ff21d8b9_FWm(0.0, 0.5f - f3 + 0.0625f, 0.5f - f3 + 0.0625f, f * 0.5f, 0.5f + f3 - 0.0625f, 0.5f + f3 - 0.0625f);
        this.field_20386492_FWm.method_a68ac5f6_Dne(this.field_375b13b_Dne);
        this.field_20386492_FWm.method_23d00645_Dne(zKP2, 0, 1.0f);
        this.field_20386492_FWm.method_7a46289a_Dne();
        this.field_20386492_FWm.method_7c6f6039_FWm();
        GL11.glPopMatrix();
        this.field_20386492_FWm.method_a68ac5f6_Dne(zKP.field_5e67d9b4_Qnq.method_9051f17a_Dne(1, 2));
        GL11.glPushMatrix();
        this.field_20386492_FWm.method_ff21d8b9_FWm(0.0, 0.5f - f3, 0.5f - f3, f + 1.0E-4f, f + 0.5f - f3, 0.5f + f3);
        this.field_20386492_FWm.method_23d00645_Dne(zKP2, 0, 1.0f);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        this.field_20386492_FWm.method_ff21d8b9_FWm(0.0, 0.5f + f3 - f, 0.5f - f3, f + 1.0E-4f, 0.5f + f3, 0.5f + f3);
        this.field_20386492_FWm.method_23d00645_Dne(zKP2, 0, 1.0f);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        this.field_20386492_FWm.method_ff21d8b9_FWm(0.0, 0.5f - f3, 0.5f - f3, f, 0.5f + f3, f + 0.5f - f3);
        this.field_20386492_FWm.method_23d00645_Dne(zKP2, 0, 1.0f);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        this.field_20386492_FWm.method_ff21d8b9_FWm(0.0, 0.5f - f3, 0.5f + f3 - f, f, 0.5f + f3, 0.5f + f3);
        this.field_20386492_FWm.method_23d00645_Dne(zKP2, 0, 1.0f);
        GL11.glPopMatrix();
        this.field_20386492_FWm.method_7c6f6039_FWm();
        this.field_20386492_FWm.method_7a46289a_Dne();
        GL11.glPopMatrix();
    }
}

