package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class JgT
extends Gor {
    rxL field_5e64df2d_Qnq;
    rxL field_713ef4ac_aFZ;
    rxL field_20353c45_FWm;
    int field_2092ae_Dne = 1;
    rxL field_162e998f_DyG;
    rxL field_37b7066_Dne;
    rxL field_f0ad2f5e_zGp;
    rxL field_75c33e53_bzF;
    rxL field_14244690_div;

    @Override
    public void method_9fba3e12_Dne(FUH fUH, float f, float f2, float f3) {
        kQo kQo2 = (kQo)fUH;
        this.field_14244690_div.field_267cf2_Qnq = 12.0f;
        this.field_14244690_div.field_2d29f1_aFZ = -10.0f;
        this.field_162e998f_DyG.field_267cf2_Qnq = 15.0f;
        this.field_162e998f_DyG.field_2d29f1_aFZ = -9.0f;
        this.field_713ef4ac_aFZ.field_267cf2_Qnq = 15.0f;
        this.field_713ef4ac_aFZ.field_2d29f1_aFZ = 8.0f;
        this.field_f0ad2f5e_zGp.field_267cf2_Qnq = 20.0f;
        this.field_f0ad2f5e_zGp.field_2d29f1_aFZ = 14.0f;
        this.field_5e64df2d_Qnq.field_267cf2_Qnq = 13.8f;
        this.field_75c33e53_bzF.field_267cf2_Qnq = 13.8f;
        this.field_5e64df2d_Qnq.field_2d29f1_aFZ = -5.0f;
        this.field_75c33e53_bzF.field_2d29f1_aFZ = -5.0f;
        this.field_20353c45_FWm.field_267cf2_Qnq = 18.0f;
        this.field_37b7066_Dne.field_267cf2_Qnq = 18.0f;
        this.field_20353c45_FWm.field_2d29f1_aFZ = 5.0f;
        this.field_37b7066_Dne.field_2d29f1_aFZ = 5.0f;
        this.field_713ef4ac_aFZ.field_388da3_zGp = 0.9f;
        if (kQo2.method_a98a0664_aFZ()) {
            this.field_14244690_div.field_267cf2_Qnq += 1.0f;
            this.field_162e998f_DyG.field_267cf2_Qnq += 2.0f;
            this.field_713ef4ac_aFZ.field_267cf2_Qnq += 1.0f;
            this.field_f0ad2f5e_zGp.field_267cf2_Qnq += -4.0f;
            this.field_f0ad2f5e_zGp.field_2d29f1_aFZ += 2.0f;
            this.field_713ef4ac_aFZ.field_388da3_zGp = 1.5707964f;
            this.field_f0ad2f5e_zGp.field_388da3_zGp = 1.5707964f;
            this.field_2092ae_Dne = 0;
        } else if (kQo2.method_73aaafc7_ATE()) {
            this.field_f0ad2f5e_zGp.field_267cf2_Qnq = this.field_713ef4ac_aFZ.field_267cf2_Qnq;
            this.field_f0ad2f5e_zGp.field_2d29f1_aFZ += 2.0f;
            this.field_713ef4ac_aFZ.field_388da3_zGp = 1.5707964f;
            this.field_f0ad2f5e_zGp.field_388da3_zGp = 1.5707964f;
            this.field_2092ae_Dne = 2;
        } else if (kQo2.method_80692b1e_ICU()) {
            this.field_14244690_div.field_388da3_zGp = 0.7853982f;
            this.field_14244690_div.field_267cf2_Qnq += -4.0f;
            this.field_14244690_div.field_2d29f1_aFZ += 5.0f;
            this.field_162e998f_DyG.field_267cf2_Qnq += -3.3f;
            this.field_162e998f_DyG.field_2d29f1_aFZ += 1.0f;
            this.field_713ef4ac_aFZ.field_267cf2_Qnq += 8.0f;
            this.field_713ef4ac_aFZ.field_2d29f1_aFZ += -2.0f;
            this.field_f0ad2f5e_zGp.field_267cf2_Qnq += 2.0f;
            this.field_f0ad2f5e_zGp.field_2d29f1_aFZ += -0.8f;
            this.field_713ef4ac_aFZ.field_388da3_zGp = 1.7278761f;
            this.field_f0ad2f5e_zGp.field_388da3_zGp = 2.670354f;
            this.field_5e64df2d_Qnq.field_388da3_zGp = -0.15707964f;
            this.field_75c33e53_bzF.field_388da3_zGp = -0.15707964f;
            this.field_5e64df2d_Qnq.field_267cf2_Qnq = 15.8f;
            this.field_75c33e53_bzF.field_267cf2_Qnq = 15.8f;
            this.field_5e64df2d_Qnq.field_2d29f1_aFZ = -7.0f;
            this.field_75c33e53_bzF.field_2d29f1_aFZ = -7.0f;
            this.field_20353c45_FWm.field_388da3_zGp = -1.5707964f;
            this.field_37b7066_Dne.field_388da3_zGp = -1.5707964f;
            this.field_20353c45_FWm.field_267cf2_Qnq = 21.0f;
            this.field_37b7066_Dne.field_267cf2_Qnq = 21.0f;
            this.field_20353c45_FWm.field_2d29f1_aFZ = 1.0f;
            this.field_37b7066_Dne.field_2d29f1_aFZ = 1.0f;
            this.field_2092ae_Dne = 3;
        } else {
            this.field_2092ae_Dne = 1;
        }
    }

    @Override
    public void method_3a102820_Dne(sMa sMa2, float f, float f2, float f3, float f4, float f5, float f6) {
        this.method_5c531ba0_Dne(f, f2, f3, f4, f5, f6, sMa2);
        if (this.field_20b868_DyG) {
            float f7 = 2.0f;
            GL11.glPushMatrix();
            GL11.glScalef(1.5f / f7, 1.5f / f7, 1.5f / f7);
            GL11.glTranslatef(0.0f, 10.0f * f6, 4.0f * f6);
            this.field_162e998f_DyG.method_ce7f5266_Dne(f6);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef(1.0f / f7, 1.0f / f7, 1.0f / f7);
            GL11.glTranslatef(0.0f, 24.0f * f6, 0.0f);
            this.field_14244690_div.method_ce7f5266_Dne(f6);
            this.field_37b7066_Dne.method_ce7f5266_Dne(f6);
            this.field_20353c45_FWm.method_ce7f5266_Dne(f6);
            this.field_75c33e53_bzF.method_ce7f5266_Dne(f6);
            this.field_5e64df2d_Qnq.method_ce7f5266_Dne(f6);
            this.field_713ef4ac_aFZ.method_ce7f5266_Dne(f6);
            this.field_f0ad2f5e_zGp.method_ce7f5266_Dne(f6);
            GL11.glPopMatrix();
        } else {
            this.field_162e998f_DyG.method_ce7f5266_Dne(f6);
            this.field_14244690_div.method_ce7f5266_Dne(f6);
            this.field_713ef4ac_aFZ.method_ce7f5266_Dne(f6);
            this.field_f0ad2f5e_zGp.method_ce7f5266_Dne(f6);
            this.field_37b7066_Dne.method_ce7f5266_Dne(f6);
            this.field_20353c45_FWm.method_ce7f5266_Dne(f6);
            this.field_75c33e53_bzF.method_ce7f5266_Dne(f6);
            this.field_5e64df2d_Qnq.method_ce7f5266_Dne(f6);
        }
    }

    @Override
    public void method_5c531ba0_Dne(float f, float f2, float f3, float f4, float f5, float f6, sMa sMa2) {
        this.field_162e998f_DyG.field_388da3_zGp = f5 / 57.295776f;
        this.field_162e998f_DyG.field_20b854_DyG = f4 / 57.295776f;
        if (this.field_2092ae_Dne != 3) {
            this.field_14244690_div.field_388da3_zGp = 1.5707964f;
            if (this.field_2092ae_Dne == 2) {
                this.field_37b7066_Dne.field_388da3_zGp = geR.method_117d0e97_FWm(f * 0.6662f) * 1.0f * f2;
                this.field_20353c45_FWm.field_388da3_zGp = geR.method_117d0e97_FWm(f * 0.6662f + 0.3f) * 1.0f * f2;
                this.field_75c33e53_bzF.field_388da3_zGp = geR.method_117d0e97_FWm(f * 0.6662f + (float)Math.PI + 0.3f) * 1.0f * f2;
                this.field_5e64df2d_Qnq.field_388da3_zGp = geR.method_117d0e97_FWm(f * 0.6662f + (float)Math.PI) * 1.0f * f2;
                this.field_f0ad2f5e_zGp.field_388da3_zGp = 1.7278761f + 0.31415927f * geR.method_117d0e97_FWm(f) * f2;
            } else {
                this.field_37b7066_Dne.field_388da3_zGp = geR.method_117d0e97_FWm(f * 0.6662f) * 1.0f * f2;
                this.field_20353c45_FWm.field_388da3_zGp = geR.method_117d0e97_FWm(f * 0.6662f + (float)Math.PI) * 1.0f * f2;
                this.field_75c33e53_bzF.field_388da3_zGp = geR.method_117d0e97_FWm(f * 0.6662f + (float)Math.PI) * 1.0f * f2;
                this.field_5e64df2d_Qnq.field_388da3_zGp = geR.method_117d0e97_FWm(f * 0.6662f) * 1.0f * f2;
                this.field_f0ad2f5e_zGp.field_388da3_zGp = this.field_2092ae_Dne == 1 ? 1.7278761f + 0.7853982f * geR.method_117d0e97_FWm(f) * f2 : 1.7278761f + 0.47123894f * geR.method_117d0e97_FWm(f) * f2;
            }
        }
    }

    public JgT() {
        this.method_fbd61744_Dne("head.main", 0, 0);
        this.method_fbd61744_Dne("head.nose", 0, 24);
        this.method_fbd61744_Dne("head.ear1", 0, 10);
        this.method_fbd61744_Dne("head.ear2", 6, 10);
        this.field_162e998f_DyG = new rxL(this, "head");
        this.field_162e998f_DyG.method_9c49b372_Dne("main", -2.5f, -2.0f, -3.0f, 5, 4, 5);
        this.field_162e998f_DyG.method_9c49b372_Dne("nose", -1.5f, 0.0f, -4.0f, 3, 2, 2);
        this.field_162e998f_DyG.method_9c49b372_Dne("ear1", -2.0f, -3.0f, 0.0f, 1, 1, 2);
        this.field_162e998f_DyG.method_9c49b372_Dne("ear2", 1.0f, -3.0f, 0.0f, 1, 1, 2);
        this.field_162e998f_DyG.method_2c0148e6_Dne(0.0f, 15.0f, -9.0f);
        this.field_14244690_div = new rxL(this, 20, 0);
        this.field_14244690_div.method_7ccc8363_Dne(-2.0f, 3.0f, -8.0f, 4, 16, 6, 0.0f);
        this.field_14244690_div.method_2c0148e6_Dne(0.0f, 12.0f, -10.0f);
        this.field_713ef4ac_aFZ = new rxL(this, 0, 15);
        this.field_713ef4ac_aFZ.method_cbecd0a8_Dne(-0.5f, 0.0f, 0.0f, 1, 8, 1);
        this.field_713ef4ac_aFZ.field_388da3_zGp = 0.9f;
        this.field_713ef4ac_aFZ.method_2c0148e6_Dne(0.0f, 15.0f, 8.0f);
        this.field_f0ad2f5e_zGp = new rxL(this, 4, 15);
        this.field_f0ad2f5e_zGp.method_cbecd0a8_Dne(-0.5f, 0.0f, 0.0f, 1, 8, 1);
        this.field_f0ad2f5e_zGp.method_2c0148e6_Dne(0.0f, 20.0f, 14.0f);
        this.field_37b7066_Dne = new rxL(this, 8, 13);
        this.field_37b7066_Dne.method_cbecd0a8_Dne(-1.0f, 0.0f, 1.0f, 2, 6, 2);
        this.field_37b7066_Dne.method_2c0148e6_Dne(1.1f, 18.0f, 5.0f);
        this.field_20353c45_FWm = new rxL(this, 8, 13);
        this.field_20353c45_FWm.method_cbecd0a8_Dne(-1.0f, 0.0f, 1.0f, 2, 6, 2);
        this.field_20353c45_FWm.method_2c0148e6_Dne(-1.1f, 18.0f, 5.0f);
        this.field_75c33e53_bzF = new rxL(this, 40, 0);
        this.field_75c33e53_bzF.method_cbecd0a8_Dne(-1.0f, 0.0f, 0.0f, 2, 10, 2);
        this.field_75c33e53_bzF.method_2c0148e6_Dne(1.2f, 13.8f, -5.0f);
        this.field_5e64df2d_Qnq = new rxL(this, 40, 0);
        this.field_5e64df2d_Qnq.method_cbecd0a8_Dne(-1.0f, 0.0f, 0.0f, 2, 10, 2);
        this.field_5e64df2d_Qnq.method_2c0148e6_Dne(-1.2f, 13.8f, -5.0f);
    }
}

