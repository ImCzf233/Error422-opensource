package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class wIp
extends jte_0 {
    private wsR field_37da436_Dne = new wsR();

    @Override
    public void method_bdc49bcc_Dne(ipD ipD2, double d, double d2, double d3, float f) {
        this.method_f7dfa757_Dne((llR)ipD2, d, d2, d3, f);
    }

    public void method_f7dfa757_Dne(llR llR2, double d, double d2, double d3, float f) {
        float f2;
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d + 0.5f, (float)d2 + 0.75f, (float)d3 + 0.5f);
        float f3 = (float)llR2.field_2092ae_Dne + f;
        GL11.glTranslatef(0.0f, 0.1f + geR.method_ce7f5256_Dne(f3 * 0.1f) * 0.01f, 0.0f);
        for (f2 = llR2.field_20b854_DyG - llR2.field_2f0dd5_div; f2 >= (float)Math.PI; f2 -= (float)Math.PI * 2) {
        }
        while (f2 < (float)(-Math.PI)) {
            f2 += (float)Math.PI * 2;
        }
        float f4 = llR2.field_2f0dd5_div + f2 * f;
        GL11.glRotatef(-f4 * 180.0f / (float)Math.PI, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(80.0f, 0.0f, 0.0f, 1.0f);
        this.method_8f501fe4_Dne("/item/book.png");
        float f5 = llR2.field_21260a_FWm + (llR2.field_2092ab_Dne - llR2.field_21260a_FWm) * f + 0.25f;
        float f6 = llR2.field_21260a_FWm + (llR2.field_2092ab_Dne - llR2.field_21260a_FWm) * f + 0.75f;
        f5 = (f5 - (float)geR.method_ce7f4ad7_Dne(f5)) * 1.6f - 0.3f;
        f6 = (f6 - (float)geR.method_ce7f4ad7_Dne(f6)) * 1.6f - 0.3f;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        float f7 = llR2.field_388da3_zGp + (llR2.field_2d29f1_aFZ - llR2.field_388da3_zGp) * f;
        GL11.glEnable(2884);
        this.field_37da436_Dne.method_3a102820_Dne(null, f3, f5, f6, f7, 0.0f, 0.0625f);
        GL11.glPopMatrix();
    }
}

