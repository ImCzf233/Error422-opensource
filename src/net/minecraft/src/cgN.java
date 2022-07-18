package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class cgN
extends Gor {
    public rxL field_75c33e53_bzF;
    public rxL field_5e64df2d_Qnq;
    rxL field_14244690_div;
    public rxL field_20353c45_FWm;
    rxL field_162e998f_DyG;
    public rxL field_f0ad2f5e_zGp;
    public rxL field_713ef4ac_aFZ;
    public rxL field_37b7066_Dne;

    public cgN() {
        float f = 0.0f;
        float f2 = 13.5f;
        this.field_37b7066_Dne = new rxL(this, 0, 0);
        this.field_37b7066_Dne.method_7ccc8363_Dne(-3.0f, -3.0f, -2.0f, 6, 6, 4, f);
        this.field_37b7066_Dne.method_2c0148e6_Dne(-1.0f, f2, -7.0f);
        this.field_20353c45_FWm = new rxL(this, 18, 14);
        this.field_20353c45_FWm.method_7ccc8363_Dne(-4.0f, -2.0f, -3.0f, 6, 9, 6, f);
        this.field_20353c45_FWm.method_2c0148e6_Dne(0.0f, 14.0f, 2.0f);
        this.field_14244690_div = new rxL(this, 21, 0);
        this.field_14244690_div.method_7ccc8363_Dne(-4.0f, -3.0f, -3.0f, 8, 6, 7, f);
        this.field_14244690_div.method_2c0148e6_Dne(-1.0f, 14.0f, 2.0f);
        this.field_75c33e53_bzF = new rxL(this, 0, 18);
        this.field_75c33e53_bzF.method_7ccc8363_Dne(-1.0f, 0.0f, -1.0f, 2, 8, 2, f);
        this.field_75c33e53_bzF.method_2c0148e6_Dne(-2.5f, 16.0f, 7.0f);
        this.field_5e64df2d_Qnq = new rxL(this, 0, 18);
        this.field_5e64df2d_Qnq.method_7ccc8363_Dne(-1.0f, 0.0f, -1.0f, 2, 8, 2, f);
        this.field_5e64df2d_Qnq.method_2c0148e6_Dne(0.5f, 16.0f, 7.0f);
        this.field_713ef4ac_aFZ = new rxL(this, 0, 18);
        this.field_713ef4ac_aFZ.method_7ccc8363_Dne(-1.0f, 0.0f, -1.0f, 2, 8, 2, f);
        this.field_713ef4ac_aFZ.method_2c0148e6_Dne(-2.5f, 16.0f, -4.0f);
        this.field_f0ad2f5e_zGp = new rxL(this, 0, 18);
        this.field_f0ad2f5e_zGp.method_7ccc8363_Dne(-1.0f, 0.0f, -1.0f, 2, 8, 2, f);
        this.field_f0ad2f5e_zGp.method_2c0148e6_Dne(0.5f, 16.0f, -4.0f);
        this.field_162e998f_DyG = new rxL(this, 9, 18);
        this.field_162e998f_DyG.method_7ccc8363_Dne(-1.0f, 0.0f, -1.0f, 2, 8, 2, f);
        this.field_162e998f_DyG.method_2c0148e6_Dne(-1.0f, 12.0f, 8.0f);
        this.field_37b7066_Dne.method_9057b0a5_Dne(16, 14).method_7ccc8363_Dne(-3.0f, -5.0f, 0.0f, 2, 2, 1, f);
        this.field_37b7066_Dne.method_9057b0a5_Dne(16, 14).method_7ccc8363_Dne(1.0f, -5.0f, 0.0f, 2, 2, 1, f);
        this.field_37b7066_Dne.method_9057b0a5_Dne(0, 10).method_7ccc8363_Dne(-1.5f, 0.0f, -5.0f, 3, 3, 4, f);
    }

    @Override
    public void method_5c531ba0_Dne(float f, float f2, float f3, float f4, float f5, float f6, sMa sMa2) {
        super.method_5c531ba0_Dne(f, f2, f3, f4, f5, f6, sMa2);
        this.field_37b7066_Dne.field_388da3_zGp = f5 / 57.295776f;
        this.field_37b7066_Dne.field_20b854_DyG = f4 / 57.295776f;
        this.field_162e998f_DyG.field_388da3_zGp = f3;
    }

    @Override
    public void method_9fba3e12_Dne(FUH fUH, float f, float f2, float f3) {
        oEB oEB2 = (oEB)fUH;
        this.field_162e998f_DyG.field_20b854_DyG = oEB2.method_74d3fa79_BJH() ? 0.0f : geR.method_117d0e97_FWm(f * 0.6662f) * 1.4f * f2;
        if (oEB2.method_80692b1e_ICU()) {
            this.field_14244690_div.method_2c0148e6_Dne(-1.0f, 16.0f, -3.0f);
            this.field_14244690_div.field_388da3_zGp = 1.2566371f;
            this.field_14244690_div.field_20b854_DyG = 0.0f;
            this.field_20353c45_FWm.method_2c0148e6_Dne(0.0f, 18.0f, 0.0f);
            this.field_20353c45_FWm.field_388da3_zGp = 0.7853982f;
            this.field_162e998f_DyG.method_2c0148e6_Dne(-1.0f, 21.0f, 6.0f);
            this.field_75c33e53_bzF.method_2c0148e6_Dne(-2.5f, 22.0f, 2.0f);
            this.field_75c33e53_bzF.field_388da3_zGp = 4.712389f;
            this.field_5e64df2d_Qnq.method_2c0148e6_Dne(0.5f, 22.0f, 2.0f);
            this.field_5e64df2d_Qnq.field_388da3_zGp = 4.712389f;
            this.field_713ef4ac_aFZ.field_388da3_zGp = 5.811947f;
            this.field_713ef4ac_aFZ.method_2c0148e6_Dne(-2.49f, 17.0f, -4.0f);
            this.field_f0ad2f5e_zGp.field_388da3_zGp = 5.811947f;
            this.field_f0ad2f5e_zGp.method_2c0148e6_Dne(0.51f, 17.0f, -4.0f);
        } else {
            this.field_20353c45_FWm.method_2c0148e6_Dne(0.0f, 14.0f, 2.0f);
            this.field_20353c45_FWm.field_388da3_zGp = 1.5707964f;
            this.field_14244690_div.method_2c0148e6_Dne(-1.0f, 14.0f, -3.0f);
            this.field_14244690_div.field_388da3_zGp = this.field_20353c45_FWm.field_388da3_zGp;
            this.field_162e998f_DyG.method_2c0148e6_Dne(-1.0f, 12.0f, 8.0f);
            this.field_75c33e53_bzF.method_2c0148e6_Dne(-2.5f, 16.0f, 7.0f);
            this.field_5e64df2d_Qnq.method_2c0148e6_Dne(0.5f, 16.0f, 7.0f);
            this.field_713ef4ac_aFZ.method_2c0148e6_Dne(-2.5f, 16.0f, -4.0f);
            this.field_f0ad2f5e_zGp.method_2c0148e6_Dne(0.5f, 16.0f, -4.0f);
            this.field_75c33e53_bzF.field_388da3_zGp = geR.method_117d0e97_FWm(f * 0.6662f) * 1.4f * f2;
            this.field_5e64df2d_Qnq.field_388da3_zGp = geR.method_117d0e97_FWm(f * 0.6662f + (float)Math.PI) * 1.4f * f2;
            this.field_713ef4ac_aFZ.field_388da3_zGp = geR.method_117d0e97_FWm(f * 0.6662f + (float)Math.PI) * 1.4f * f2;
            this.field_f0ad2f5e_zGp.field_388da3_zGp = geR.method_117d0e97_FWm(f * 0.6662f) * 1.4f * f2;
        }
        this.field_37b7066_Dne.field_2f0dd5_div = oEB2.method_7ed96eaf_Qnq(f3) + oEB2.method_16b620a_Dne(f3, 0.0f);
        this.field_14244690_div.field_2f0dd5_div = oEB2.method_16b620a_Dne(f3, -0.08f);
        this.field_20353c45_FWm.field_2f0dd5_div = oEB2.method_16b620a_Dne(f3, -0.16f);
        this.field_162e998f_DyG.field_2f0dd5_div = oEB2.method_16b620a_Dne(f3, -0.2f);
    }

    @Override
    public void method_3a102820_Dne(sMa sMa2, float f, float f2, float f3, float f4, float f5, float f6) {
        super.method_3a102820_Dne(sMa2, f, f2, f3, f4, f5, f6);
        this.method_5c531ba0_Dne(f, f2, f3, f4, f5, f6, sMa2);
        if (this.field_20b868_DyG) {
            float f7 = 2.0f;
            GL11.glPushMatrix();
            GL11.glTranslatef(0.0f, 5.0f * f6, 2.0f * f6);
            this.field_37b7066_Dne.method_117d0ea7_FWm(f6);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef(1.0f / f7, 1.0f / f7, 1.0f / f7);
            GL11.glTranslatef(0.0f, 24.0f * f6, 0.0f);
            this.field_20353c45_FWm.method_ce7f5266_Dne(f6);
            this.field_75c33e53_bzF.method_ce7f5266_Dne(f6);
            this.field_5e64df2d_Qnq.method_ce7f5266_Dne(f6);
            this.field_713ef4ac_aFZ.method_ce7f5266_Dne(f6);
            this.field_f0ad2f5e_zGp.method_ce7f5266_Dne(f6);
            this.field_162e998f_DyG.method_117d0ea7_FWm(f6);
            this.field_14244690_div.method_ce7f5266_Dne(f6);
            GL11.glPopMatrix();
        } else {
            this.field_37b7066_Dne.method_117d0ea7_FWm(f6);
            this.field_20353c45_FWm.method_ce7f5266_Dne(f6);
            this.field_75c33e53_bzF.method_ce7f5266_Dne(f6);
            this.field_5e64df2d_Qnq.method_ce7f5266_Dne(f6);
            this.field_713ef4ac_aFZ.method_ce7f5266_Dne(f6);
            this.field_f0ad2f5e_zGp.method_ce7f5266_Dne(f6);
            this.field_162e998f_DyG.method_117d0ea7_FWm(f6);
            this.field_14244690_div.method_ce7f5266_Dne(f6);
        }
    }
}

