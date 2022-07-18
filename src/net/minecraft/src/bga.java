package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class bga
extends dfe {
    @Override
    protected void method_be7e6a4d_Dne(Ebp ebp, float f, zKP zKP2, int n) {
        this.method_d31f713d_Dne((Art)ebp, f, zKP2, n);
    }

    protected void method_d31f713d_Dne(Art art, float f, zKP zKP2, int n) {
        int n2 = art.method_907a9d14_Qnq();
        if (n2 > -1 && (float)n2 - f + 1.0f < 10.0f) {
            float f2 = 1.0f - ((float)n2 - f + 1.0f) / 10.0f;
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            f2 *= f2;
            f2 *= f2;
            float f3 = 1.0f + f2 * 0.3f;
            GL11.glScalef(f3, f3, f3);
        }
        super.method_be7e6a4d_Dne(art, f, zKP2, n);
        if (n2 > -1 && n2 / 5 % 2 == 0) {
            GL11.glDisable(3553);
            GL11.glDisable(2896);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 772);
            GL11.glColor4f(1.0f, 1.0f, 1.0f, (1.0f - ((float)n2 - f + 1.0f) / 100.0f) * 0.8f);
            GL11.glPushMatrix();
            this.field_20386492_FWm.method_23d00645_Dne(zKP.field_cb5aacc0_qXo, 0, 1.0f);
            GL11.glPopMatrix();
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            GL11.glDisable(3042);
            GL11.glEnable(2896);
            GL11.glEnable(3553);
        }
    }
}

