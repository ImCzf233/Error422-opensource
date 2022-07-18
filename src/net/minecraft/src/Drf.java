package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class Drf
extends Gor {
    private rxL field_713ef4ac_aFZ;
    private rxL field_20353c45_FWm;
    private rxL field_f0ad2f5e_zGp;
    private rxL field_5cbd9ba_IjH;
    private rxL field_162e998f_DyG;
    private rxL field_6175248e_Zpi;
    private rxL field_75060344_mrb;
    private rxL field_75c33e53_bzF;
    private float field_21260a_FWm;
    private rxL field_14244690_div;
    private rxL field_37b7066_Dne;
    private rxL field_1c3cfea5_XHL;
    private rxL field_5e64df2d_Qnq;

    private float method_ce7f4ad4_Dne(double d) {
        while (d >= 180.0) {
            d -= 360.0;
        }
        while (d < -180.0) {
            d += 360.0;
        }
        return (float)d;
    }

    @Override
    public void method_9fba3e12_Dne(FUH fUH, float f, float f2, float f3) {
        this.field_21260a_FWm = f3;
    }

    public Drf(float f) {
        this.field_2e5f1b_bzF = 256;
        this.field_267cf5_Qnq = 256;
        this.method_fbd61744_Dne("body.body", 0, 0);
        this.method_fbd61744_Dne("wing.skin", -56, 88);
        this.method_fbd61744_Dne("wingtip.skin", -56, 144);
        this.method_fbd61744_Dne("rearleg.main", 0, 0);
        this.method_fbd61744_Dne("rearfoot.main", 112, 0);
        this.method_fbd61744_Dne("rearlegtip.main", 196, 0);
        this.method_fbd61744_Dne("head.upperhead", 112, 30);
        this.method_fbd61744_Dne("wing.bone", 112, 88);
        this.method_fbd61744_Dne("head.upperlip", 176, 44);
        this.method_fbd61744_Dne("jaw.jaw", 176, 65);
        this.method_fbd61744_Dne("frontleg.main", 112, 104);
        this.method_fbd61744_Dne("wingtip.bone", 112, 136);
        this.method_fbd61744_Dne("frontfoot.main", 144, 104);
        this.method_fbd61744_Dne("neck.box", 192, 104);
        this.method_fbd61744_Dne("frontlegtip.main", 226, 138);
        this.method_fbd61744_Dne("body.scale", 220, 53);
        this.method_fbd61744_Dne("head.scale", 0, 0);
        this.method_fbd61744_Dne("neck.scale", 48, 0);
        this.method_fbd61744_Dne("head.nostril", 112, 0);
        float f2 = -16.0f;
        this.field_37b7066_Dne = new rxL(this, "head");
        this.field_37b7066_Dne.method_9c49b372_Dne("upperlip", -6.0f, -1.0f, -8.0f + f2, 12, 5, 16);
        this.field_37b7066_Dne.method_9c49b372_Dne("upperhead", -8.0f, -8.0f, 6.0f + f2, 16, 16, 16);
        this.field_37b7066_Dne.field_2092bf_Dne = true;
        this.field_37b7066_Dne.method_9c49b372_Dne("scale", -5.0f, -12.0f, 12.0f + f2, 2, 4, 6);
        this.field_37b7066_Dne.method_9c49b372_Dne("nostril", -5.0f, -3.0f, -6.0f + f2, 2, 2, 4);
        this.field_37b7066_Dne.field_2092bf_Dne = false;
        this.field_37b7066_Dne.method_9c49b372_Dne("scale", 3.0f, -12.0f, 12.0f + f2, 2, 4, 6);
        this.field_37b7066_Dne.method_9c49b372_Dne("nostril", 3.0f, -3.0f, -6.0f + f2, 2, 2, 4);
        this.field_75c33e53_bzF = new rxL(this, "jaw");
        this.field_75c33e53_bzF.method_2c0148e6_Dne(0.0f, 4.0f, 8.0f + f2);
        this.field_75c33e53_bzF.method_9c49b372_Dne("jaw", -6.0f, 0.0f, -16.0f, 12, 4, 16);
        this.field_37b7066_Dne.method_bc1d6661_Dne(this.field_75c33e53_bzF);
        this.field_20353c45_FWm = new rxL(this, "neck");
        this.field_20353c45_FWm.method_9c49b372_Dne("box", -5.0f, -5.0f, -5.0f, 10, 10, 10);
        this.field_20353c45_FWm.method_9c49b372_Dne("scale", -1.0f, -9.0f, -3.0f, 2, 4, 6);
        this.field_5e64df2d_Qnq = new rxL(this, "body");
        this.field_5e64df2d_Qnq.method_2c0148e6_Dne(0.0f, 4.0f, 8.0f);
        this.field_5e64df2d_Qnq.method_9c49b372_Dne("body", -12.0f, 0.0f, -16.0f, 24, 24, 64);
        this.field_5e64df2d_Qnq.method_9c49b372_Dne("scale", -1.0f, -6.0f, -10.0f, 2, 6, 12);
        this.field_5e64df2d_Qnq.method_9c49b372_Dne("scale", -1.0f, -6.0f, 10.0f, 2, 6, 12);
        this.field_5e64df2d_Qnq.method_9c49b372_Dne("scale", -1.0f, -6.0f, 30.0f, 2, 6, 12);
        this.field_1c3cfea5_XHL = new rxL(this, "wing");
        this.field_1c3cfea5_XHL.method_2c0148e6_Dne(-12.0f, 5.0f, 2.0f);
        this.field_1c3cfea5_XHL.method_9c49b372_Dne("bone", -56.0f, -4.0f, -4.0f, 56, 8, 8);
        this.field_1c3cfea5_XHL.method_9c49b372_Dne("skin", -56.0f, 0.0f, 2.0f, 56, 0, 56);
        this.field_6175248e_Zpi = new rxL(this, "wingtip");
        this.field_6175248e_Zpi.method_2c0148e6_Dne(-56.0f, 0.0f, 0.0f);
        this.field_6175248e_Zpi.method_9c49b372_Dne("bone", -56.0f, -2.0f, -2.0f, 56, 4, 4);
        this.field_6175248e_Zpi.method_9c49b372_Dne("skin", -56.0f, 0.0f, 2.0f, 56, 0, 56);
        this.field_1c3cfea5_XHL.method_bc1d6661_Dne(this.field_6175248e_Zpi);
        this.field_f0ad2f5e_zGp = new rxL(this, "frontleg");
        this.field_f0ad2f5e_zGp.method_2c0148e6_Dne(-12.0f, 20.0f, 2.0f);
        this.field_f0ad2f5e_zGp.method_9c49b372_Dne("main", -4.0f, -4.0f, -4.0f, 8, 24, 8);
        this.field_14244690_div = new rxL(this, "frontlegtip");
        this.field_14244690_div.method_2c0148e6_Dne(0.0f, 20.0f, -1.0f);
        this.field_14244690_div.method_9c49b372_Dne("main", -3.0f, -1.0f, -3.0f, 6, 24, 6);
        this.field_f0ad2f5e_zGp.method_bc1d6661_Dne(this.field_14244690_div);
        this.field_75060344_mrb = new rxL(this, "frontfoot");
        this.field_75060344_mrb.method_2c0148e6_Dne(0.0f, 23.0f, 0.0f);
        this.field_75060344_mrb.method_9c49b372_Dne("main", -4.0f, 0.0f, -12.0f, 8, 4, 16);
        this.field_14244690_div.method_bc1d6661_Dne(this.field_75060344_mrb);
        this.field_713ef4ac_aFZ = new rxL(this, "rearleg");
        this.field_713ef4ac_aFZ.method_2c0148e6_Dne(-16.0f, 16.0f, 42.0f);
        this.field_713ef4ac_aFZ.method_9c49b372_Dne("main", -8.0f, -4.0f, -8.0f, 16, 32, 16);
        this.field_162e998f_DyG = new rxL(this, "rearlegtip");
        this.field_162e998f_DyG.method_2c0148e6_Dne(0.0f, 32.0f, -4.0f);
        this.field_162e998f_DyG.method_9c49b372_Dne("main", -6.0f, -2.0f, 0.0f, 12, 32, 12);
        this.field_713ef4ac_aFZ.method_bc1d6661_Dne(this.field_162e998f_DyG);
        this.field_5cbd9ba_IjH = new rxL(this, "rearfoot");
        this.field_5cbd9ba_IjH.method_2c0148e6_Dne(0.0f, 31.0f, 4.0f);
        this.field_5cbd9ba_IjH.method_9c49b372_Dne("main", -9.0f, 0.0f, -20.0f, 18, 6, 24);
        this.field_162e998f_DyG.method_bc1d6661_Dne(this.field_5cbd9ba_IjH);
    }

    @Override
    public void method_3a102820_Dne(sMa sMa2, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7;
        GL11.glPushMatrix();
        WSC wSC = (WSC)sMa2;
        float f8 = wSC.field_2092ab_Dne + (wSC.field_21260a_FWm - wSC.field_2092ab_Dne) * this.field_21260a_FWm;
        this.field_75c33e53_bzF.field_388da3_zGp = (float)(Math.sin(f8 * (float)Math.PI * 2.0f) + 1.0) * 0.2f;
        float f9 = (float)(Math.sin(f8 * (float)Math.PI * 2.0f - 1.0f) + 1.0);
        f9 = (f9 * f9 * 1.0f + f9 * 2.0f) * 0.05f;
        GL11.glTranslatef(0.0f, f9 - 2.0f, -3.0f);
        GL11.glRotatef(f9 * 2.0f, 1.0f, 0.0f, 0.0f);
        float f10 = -30.0f;
        float f11 = 0.0f;
        float f12 = 1.5f;
        double[] dArray = wSC.method_2c2b2888_Dne(6, this.field_21260a_FWm);
        float f13 = this.method_ce7f4ad4_Dne(wSC.method_2c2b2888_Dne(5, this.field_21260a_FWm)[0] - wSC.method_2c2b2888_Dne(10, this.field_21260a_FWm)[0]);
        float f14 = this.method_ce7f4ad4_Dne(wSC.method_2c2b2888_Dne(5, this.field_21260a_FWm)[0] + (double)(f13 / 2.0f));
        f10 += 2.0f;
        float f15 = f8 * (float)Math.PI * 2.0f;
        f10 = 20.0f;
        float f16 = -12.0f;
        for (int i = 0; i < 5; ++i) {
            double[] dArray2 = wSC.method_2c2b2888_Dne(5 - i, this.field_21260a_FWm);
            f7 = (float)Math.cos((float)i * 0.45f + f15) * 0.15f;
            this.field_20353c45_FWm.field_20b854_DyG = this.method_ce7f4ad4_Dne(dArray2[0] - dArray[0]) * (float)Math.PI / 180.0f * f12;
            this.field_20353c45_FWm.field_388da3_zGp = f7 + (float)(dArray2[1] - dArray[1]) * (float)Math.PI / 180.0f * f12 * 5.0f;
            this.field_20353c45_FWm.field_2f0dd5_div = -this.method_ce7f4ad4_Dne(dArray2[0] - (double)f14) * (float)Math.PI / 180.0f * f12;
            this.field_20353c45_FWm.field_267cf2_Qnq = f10;
            this.field_20353c45_FWm.field_2d29f1_aFZ = f16;
            this.field_20353c45_FWm.field_2e5f18_bzF = f11;
            f10 = (float)((double)f10 + Math.sin(this.field_20353c45_FWm.field_388da3_zGp) * 10.0);
            f16 = (float)((double)f16 - Math.cos(this.field_20353c45_FWm.field_20b854_DyG) * Math.cos(this.field_20353c45_FWm.field_388da3_zGp) * 10.0);
            f11 = (float)((double)f11 - Math.sin(this.field_20353c45_FWm.field_20b854_DyG) * Math.cos(this.field_20353c45_FWm.field_388da3_zGp) * 10.0);
            this.field_20353c45_FWm.method_ce7f5266_Dne(f6);
        }
        this.field_37b7066_Dne.field_267cf2_Qnq = f10;
        this.field_37b7066_Dne.field_2d29f1_aFZ = f16;
        this.field_37b7066_Dne.field_2e5f18_bzF = f11;
        double[] dArray3 = wSC.method_2c2b2888_Dne(0, this.field_21260a_FWm);
        this.field_37b7066_Dne.field_20b854_DyG = this.method_ce7f4ad4_Dne(dArray3[0] - dArray[0]) * (float)Math.PI / 180.0f * 1.0f;
        this.field_37b7066_Dne.field_2f0dd5_div = -this.method_ce7f4ad4_Dne(dArray3[0] - (double)f14) * (float)Math.PI / 180.0f * 1.0f;
        this.field_37b7066_Dne.method_ce7f5266_Dne(f6);
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0f, 1.0f, 0.0f);
        GL11.glRotatef(-f13 * f12 * 1.0f, 0.0f, 0.0f, 1.0f);
        GL11.glTranslatef(0.0f, -1.0f, 0.0f);
        this.field_5e64df2d_Qnq.field_2f0dd5_div = 0.0f;
        this.field_5e64df2d_Qnq.method_ce7f5266_Dne(f6);
        for (int i = 0; i < 2; ++i) {
            GL11.glEnable(2884);
            f7 = f8 * (float)Math.PI * 2.0f;
            this.field_1c3cfea5_XHL.field_388da3_zGp = 0.125f - (float)Math.cos(f7) * 0.2f;
            this.field_1c3cfea5_XHL.field_20b854_DyG = 0.25f;
            this.field_1c3cfea5_XHL.field_2f0dd5_div = (float)(Math.sin(f7) + 0.125) * 0.8f;
            this.field_6175248e_Zpi.field_2f0dd5_div = -((float)(Math.sin(f7 + 2.0f) + 0.5)) * 0.75f;
            this.field_713ef4ac_aFZ.field_388da3_zGp = 1.0f + f9 * 0.1f;
            this.field_162e998f_DyG.field_388da3_zGp = 0.5f + f9 * 0.1f;
            this.field_5cbd9ba_IjH.field_388da3_zGp = 0.75f + f9 * 0.1f;
            this.field_f0ad2f5e_zGp.field_388da3_zGp = 1.3f + f9 * 0.1f;
            this.field_14244690_div.field_388da3_zGp = -0.5f - f9 * 0.1f;
            this.field_75060344_mrb.field_388da3_zGp = 0.75f + f9 * 0.1f;
            this.field_1c3cfea5_XHL.method_ce7f5266_Dne(f6);
            this.field_f0ad2f5e_zGp.method_ce7f5266_Dne(f6);
            this.field_713ef4ac_aFZ.method_ce7f5266_Dne(f6);
            GL11.glScalef(-1.0f, 1.0f, 1.0f);
            if (i != 0) continue;
            GL11.glCullFace(1028);
        }
        GL11.glPopMatrix();
        GL11.glCullFace(1029);
        GL11.glDisable(2884);
        float f17 = -((float)Math.sin(f8 * (float)Math.PI * 2.0f)) * 0.0f;
        f15 = f8 * (float)Math.PI * 2.0f;
        f10 = 10.0f;
        f16 = 60.0f;
        f11 = 0.0f;
        dArray = wSC.method_2c2b2888_Dne(11, this.field_21260a_FWm);
        for (int i = 0; i < 12; ++i) {
            dArray3 = wSC.method_2c2b2888_Dne(12 + i, this.field_21260a_FWm);
            f17 = (float)((double)f17 + Math.sin((float)i * 0.45f + f15) * (double)0.05f);
            this.field_20353c45_FWm.field_20b854_DyG = (this.method_ce7f4ad4_Dne(dArray3[0] - dArray[0]) * f12 + 180.0f) * (float)Math.PI / 180.0f;
            this.field_20353c45_FWm.field_388da3_zGp = f17 + (float)(dArray3[1] - dArray[1]) * (float)Math.PI / 180.0f * f12 * 5.0f;
            this.field_20353c45_FWm.field_2f0dd5_div = this.method_ce7f4ad4_Dne(dArray3[0] - (double)f14) * (float)Math.PI / 180.0f * f12;
            this.field_20353c45_FWm.field_267cf2_Qnq = f10;
            this.field_20353c45_FWm.field_2d29f1_aFZ = f16;
            this.field_20353c45_FWm.field_2e5f18_bzF = f11;
            f10 = (float)((double)f10 + Math.sin(this.field_20353c45_FWm.field_388da3_zGp) * 10.0);
            f16 = (float)((double)f16 - Math.cos(this.field_20353c45_FWm.field_20b854_DyG) * Math.cos(this.field_20353c45_FWm.field_388da3_zGp) * 10.0);
            f11 = (float)((double)f11 - Math.sin(this.field_20353c45_FWm.field_20b854_DyG) * Math.cos(this.field_20353c45_FWm.field_388da3_zGp) * 10.0);
            this.field_20353c45_FWm.method_ce7f5266_Dne(f6);
        }
        GL11.glPopMatrix();
    }
}

