package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class Gdb
extends Gor {
    public rxL field_162e998f_DyG;
    public rxL field_5e64df2d_Qnq;
    public rxL field_37b7066_Dne;
    public rxL field_713ef4ac_aFZ;
    public rxL field_f0ad2f5e_zGp;
    public rxL field_75c33e53_bzF;
    public rxL field_14244690_div;
    public rxL field_20353c45_FWm;

    @Override
    public void method_3a102820_Dne(sMa sMa2, float f, float f2, float f3, float f4, float f5, float f6) {
        this.method_5c531ba0_Dne(f, f2, f3, f4, f5, f6, sMa2);
        if (this.field_20b868_DyG) {
            float f7 = 2.0f;
            GL11.glPushMatrix();
            GL11.glTranslatef(0.0f, 5.0f * f6, 2.0f * f6);
            this.field_37b7066_Dne.method_ce7f5266_Dne(f6);
            this.field_162e998f_DyG.method_ce7f5266_Dne(f6);
            this.field_14244690_div.method_ce7f5266_Dne(f6);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef(1.0f / f7, 1.0f / f7, 1.0f / f7);
            GL11.glTranslatef(0.0f, 24.0f * f6, 0.0f);
            this.field_20353c45_FWm.method_ce7f5266_Dne(f6);
            this.field_75c33e53_bzF.method_ce7f5266_Dne(f6);
            this.field_5e64df2d_Qnq.method_ce7f5266_Dne(f6);
            this.field_713ef4ac_aFZ.method_ce7f5266_Dne(f6);
            this.field_f0ad2f5e_zGp.method_ce7f5266_Dne(f6);
            GL11.glPopMatrix();
        } else {
            this.field_37b7066_Dne.method_ce7f5266_Dne(f6);
            this.field_162e998f_DyG.method_ce7f5266_Dne(f6);
            this.field_14244690_div.method_ce7f5266_Dne(f6);
            this.field_20353c45_FWm.method_ce7f5266_Dne(f6);
            this.field_75c33e53_bzF.method_ce7f5266_Dne(f6);
            this.field_5e64df2d_Qnq.method_ce7f5266_Dne(f6);
            this.field_713ef4ac_aFZ.method_ce7f5266_Dne(f6);
            this.field_f0ad2f5e_zGp.method_ce7f5266_Dne(f6);
        }
    }

    public Gdb() {
        int n = 16;
        this.field_37b7066_Dne = new rxL(this, 0, 0);
        this.field_37b7066_Dne.method_7ccc8363_Dne(-2.0f, -6.0f, -2.0f, 4, 6, 3, 0.0f);
        this.field_37b7066_Dne.method_2c0148e6_Dne(0.0f, -1 + n, -4.0f);
        this.field_162e998f_DyG = new rxL(this, 14, 0);
        this.field_162e998f_DyG.method_7ccc8363_Dne(-2.0f, -4.0f, -4.0f, 4, 2, 2, 0.0f);
        this.field_162e998f_DyG.method_2c0148e6_Dne(0.0f, -1 + n, -4.0f);
        this.field_14244690_div = new rxL(this, 14, 4);
        this.field_14244690_div.method_7ccc8363_Dne(-1.0f, -2.0f, -3.0f, 2, 2, 2, 0.0f);
        this.field_14244690_div.method_2c0148e6_Dne(0.0f, -1 + n, -4.0f);
        this.field_20353c45_FWm = new rxL(this, 0, 9);
        this.field_20353c45_FWm.method_7ccc8363_Dne(-3.0f, -4.0f, -3.0f, 6, 8, 6, 0.0f);
        this.field_20353c45_FWm.method_2c0148e6_Dne(0.0f, n, 0.0f);
        this.field_75c33e53_bzF = new rxL(this, 26, 0);
        this.field_75c33e53_bzF.method_cbecd0a8_Dne(-1.0f, 0.0f, -3.0f, 3, 5, 3);
        this.field_75c33e53_bzF.method_2c0148e6_Dne(-2.0f, 3 + n, 1.0f);
        this.field_5e64df2d_Qnq = new rxL(this, 26, 0);
        this.field_5e64df2d_Qnq.method_cbecd0a8_Dne(-1.0f, 0.0f, -3.0f, 3, 5, 3);
        this.field_5e64df2d_Qnq.method_2c0148e6_Dne(1.0f, 3 + n, 1.0f);
        this.field_713ef4ac_aFZ = new rxL(this, 24, 13);
        this.field_713ef4ac_aFZ.method_cbecd0a8_Dne(0.0f, 0.0f, -3.0f, 1, 4, 6);
        this.field_713ef4ac_aFZ.method_2c0148e6_Dne(-4.0f, -3 + n, 0.0f);
        this.field_f0ad2f5e_zGp = new rxL(this, 24, 13);
        this.field_f0ad2f5e_zGp.method_cbecd0a8_Dne(-1.0f, 0.0f, -3.0f, 1, 4, 6);
        this.field_f0ad2f5e_zGp.method_2c0148e6_Dne(4.0f, -3 + n, 0.0f);
    }

    @Override
    public void method_5c531ba0_Dne(float f, float f2, float f3, float f4, float f5, float f6, sMa sMa2) {
        this.field_37b7066_Dne.field_388da3_zGp = f5 / 57.295776f;
        this.field_37b7066_Dne.field_20b854_DyG = f4 / 57.295776f;
        this.field_162e998f_DyG.field_388da3_zGp = this.field_37b7066_Dne.field_388da3_zGp;
        this.field_162e998f_DyG.field_20b854_DyG = this.field_37b7066_Dne.field_20b854_DyG;
        this.field_14244690_div.field_388da3_zGp = this.field_37b7066_Dne.field_388da3_zGp;
        this.field_14244690_div.field_20b854_DyG = this.field_37b7066_Dne.field_20b854_DyG;
        this.field_20353c45_FWm.field_388da3_zGp = 1.5707964f;
        this.field_75c33e53_bzF.field_388da3_zGp = geR.method_117d0e97_FWm(f * 0.6662f) * 1.4f * f2;
        this.field_5e64df2d_Qnq.field_388da3_zGp = geR.method_117d0e97_FWm(f * 0.6662f + (float)Math.PI) * 1.4f * f2;
        this.field_713ef4ac_aFZ.field_2f0dd5_div = f3;
        this.field_f0ad2f5e_zGp.field_2f0dd5_div = -f3;
    }
}

