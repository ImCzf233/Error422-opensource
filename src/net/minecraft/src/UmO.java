package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class UmO
extends QCe {
    private zVu field_20386492_FWm = new zVu();

    public void method_aaa7e34_Dne(gqg gqg2, double d, double d2, double d3, float f, float f2) {
        float f3;
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d2, (float)d3);
        if ((float)gqg2.field_2092ae_Dne - f2 + 1.0f < 10.0f) {
            f3 = 1.0f - ((float)gqg2.field_2092ae_Dne - f2 + 1.0f) / 10.0f;
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 > 1.0f) {
                f3 = 1.0f;
            }
            f3 *= f3;
            f3 *= f3;
            float f4 = 1.0f + f3 * 0.3f;
            GL11.glScalef(f4, f4, f4);
        }
        f3 = (1.0f - ((float)gqg2.field_2092ae_Dne - f2 + 1.0f) / 100.0f) * 0.8f;
        this.method_8f501fe4_Dne("/terrain.png");
        this.field_20386492_FWm.method_23d00645_Dne(zKP.field_cb5aacc0_qXo, 0, gqg2.method_ce7f5256_Dne(f2));
        if (gqg2.field_2092ae_Dne / 5 % 2 == 0) {
            GL11.glDisable(3553);
            GL11.glDisable(2896);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 772);
            GL11.glColor4f(1.0f, 1.0f, 1.0f, f3);
            this.field_20386492_FWm.method_23d00645_Dne(zKP.field_cb5aacc0_qXo, 0, 1.0f);
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            GL11.glDisable(3042);
            GL11.glEnable(2896);
            GL11.glEnable(3553);
        }
        GL11.glPopMatrix();
    }

    @Override
    public void method_31745cde_Dne(sMa sMa2, double d, double d2, double d3, float f, float f2) {
        this.method_aaa7e34_Dne((gqg)sMa2, d, d2, d3, f, f2);
    }

    public UmO() {
        this.field_2092ab_Dne = 0.5f;
    }
}

