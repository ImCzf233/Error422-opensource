package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class qcK
extends Gor {
    public rxL field_20353c45_FWm;
    protected float field_21260a_FWm = 8.0f;
    public rxL field_713ef4ac_aFZ;
    public rxL field_37b7066_Dne = new rxL(this, 0, 0);
    public rxL field_5e64df2d_Qnq;
    public rxL field_75c33e53_bzF;
    protected float field_2e5f18_bzF = 4.0f;
    public rxL field_f0ad2f5e_zGp;

    @Override
    public void method_5c531ba0_Dne(float f, float f2, float f3, float f4, float f5, float f6, sMa sMa2) {
        this.field_37b7066_Dne.field_388da3_zGp = f5 / 57.295776f;
        this.field_37b7066_Dne.field_20b854_DyG = f4 / 57.295776f;
        this.field_20353c45_FWm.field_388da3_zGp = 1.5707964f;
        this.field_75c33e53_bzF.field_388da3_zGp = geR.method_117d0e97_FWm(f * 0.6662f) * 1.4f * f2;
        this.field_5e64df2d_Qnq.field_388da3_zGp = geR.method_117d0e97_FWm(f * 0.6662f + (float)Math.PI) * 1.4f * f2;
        this.field_713ef4ac_aFZ.field_388da3_zGp = geR.method_117d0e97_FWm(f * 0.6662f + (float)Math.PI) * 1.4f * f2;
        this.field_f0ad2f5e_zGp.field_388da3_zGp = geR.method_117d0e97_FWm(f * 0.6662f) * 1.4f * f2;
    }

    @Override
    public void method_3a102820_Dne(sMa sMa2, float f, float f2, float f3, float f4, float f5, float f6) {
        this.method_5c531ba0_Dne(f, f2, f3, f4, f5, f6, sMa2);
        if (this.field_20b868_DyG) {
            float f7 = 2.0f;
            GL11.glPushMatrix();
            GL11.glTranslatef(0.0f, this.field_21260a_FWm * f6, this.field_2e5f18_bzF * f6);
            this.field_37b7066_Dne.method_ce7f5266_Dne(f6);
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
            this.field_20353c45_FWm.method_ce7f5266_Dne(f6);
            this.field_75c33e53_bzF.method_ce7f5266_Dne(f6);
            this.field_5e64df2d_Qnq.method_ce7f5266_Dne(f6);
            this.field_713ef4ac_aFZ.method_ce7f5266_Dne(f6);
            this.field_f0ad2f5e_zGp.method_ce7f5266_Dne(f6);
        }
    }

    public qcK(int n, float f) {
        this.field_37b7066_Dne.method_7ccc8363_Dne(-4.0f, -4.0f, -8.0f, 8, 8, 8, f);
        this.field_37b7066_Dne.method_2c0148e6_Dne(0.0f, 18 - n, -6.0f);
        this.field_20353c45_FWm = new rxL(this, 28, 8);
        this.field_20353c45_FWm.method_7ccc8363_Dne(-5.0f, -10.0f, -7.0f, 10, 16, 8, f);
        this.field_20353c45_FWm.method_2c0148e6_Dne(0.0f, 17 - n, 2.0f);
        this.field_75c33e53_bzF = new rxL(this, 0, 16);
        this.field_75c33e53_bzF.method_7ccc8363_Dne(-2.0f, 0.0f, -2.0f, 4, n, 4, f);
        this.field_75c33e53_bzF.method_2c0148e6_Dne(-3.0f, 24 - n, 7.0f);
        this.field_5e64df2d_Qnq = new rxL(this, 0, 16);
        this.field_5e64df2d_Qnq.method_7ccc8363_Dne(-2.0f, 0.0f, -2.0f, 4, n, 4, f);
        this.field_5e64df2d_Qnq.method_2c0148e6_Dne(3.0f, 24 - n, 7.0f);
        this.field_713ef4ac_aFZ = new rxL(this, 0, 16);
        this.field_713ef4ac_aFZ.method_7ccc8363_Dne(-2.0f, 0.0f, -2.0f, 4, n, 4, f);
        this.field_713ef4ac_aFZ.method_2c0148e6_Dne(-3.0f, 24 - n, -5.0f);
        this.field_f0ad2f5e_zGp = new rxL(this, 0, 16);
        this.field_f0ad2f5e_zGp.method_7ccc8363_Dne(-2.0f, 0.0f, -2.0f, 4, n, 4, f);
        this.field_f0ad2f5e_zGp.method_2c0148e6_Dne(3.0f, 24 - n, -5.0f);
    }
}

