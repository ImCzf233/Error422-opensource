package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class VmQ
extends QCe {
    EVc field_3667eda_Dne = new EVc();

    @Override
    public void method_31745cde_Dne(sMa sMa2, double d, double d2, double d3, float f, float f2) {
        this.method_cacf2f5_Dne((YCH)sMa2, d, d2, d3, f, f2);
    }

    private float method_2c0148d6_Dne(float f, float f2, float f3) {
        float f4;
        for (f4 = f2 - f; f4 < -180.0f; f4 += 360.0f) {
        }
        while (f4 >= 180.0f) {
            f4 -= 360.0f;
        }
        return f + f3 * f4;
    }

    public void method_cacf2f5_Dne(YCH yCH, double d, double d2, double d3, float f, float f2) {
        GL11.glPushMatrix();
        GL11.glDisable(2884);
        float f3 = this.method_2c0148d6_Dne(yCH.field_2a9ad3_Zpi, yCH.field_334489_mrb, f2);
        float f4 = yCH.field_31b813_kGO + (yCH.field_29186a_XHL - yCH.field_31b813_kGO) * f2;
        GL11.glTranslatef((float)d, (float)d2, (float)d3);
        float f5 = 0.0625f;
        GL11.glEnable(32826);
        GL11.glScalef(-1.0f, -1.0f, 1.0f);
        GL11.glEnable(3008);
        if (yCH.method_907a9d25_Qnq()) {
            this.method_8f501fe4_Dne("/mob/wither_invul.png");
        } else {
            this.method_8f501fe4_Dne("/mob/wither.png");
        }
        this.field_3667eda_Dne.method_3a102820_Dne(yCH, 0.0f, 0.0f, 0.0f, f3, f4, f5);
        GL11.glPopMatrix();
    }
}

