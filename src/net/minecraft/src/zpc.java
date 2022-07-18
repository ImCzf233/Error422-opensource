package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class zpc
extends jte_0 {
    private XLo field_36efdd1_Dne = new XLo();

    public void method_4a03723e_Dne(RPI rPI, double d, double d2, double d3, float f) {
        int n = 0;
        if (rPI.method_907a9d25_Qnq()) {
            n = rPI.method_d44b4585_zGp();
        }
        this.method_8f501fe4_Dne("/item/enderchest.png");
        GL11.glPushMatrix();
        GL11.glEnable(32826);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glTranslatef((float)d, (float)d2 + 1.0f, (float)d3 + 1.0f);
        GL11.glScalef(1.0f, -1.0f, -1.0f);
        GL11.glTranslatef(0.5f, 0.5f, 0.5f);
        int n2 = 0;
        if (n == 2) {
            n2 = 180;
        }
        if (n == 3) {
            n2 = 0;
        }
        if (n == 4) {
            n2 = 90;
        }
        if (n == 5) {
            n2 = -90;
        }
        GL11.glRotatef(n2, 0.0f, 1.0f, 0.0f);
        GL11.glTranslatef(-0.5f, -0.5f, -0.5f);
        float f2 = rPI.field_21260a_FWm + (rPI.field_2092ab_Dne - rPI.field_21260a_FWm) * f;
        f2 = 1.0f - f2;
        f2 = 1.0f - f2 * f2 * f2;
        this.field_36efdd1_Dne.field_37b7066_Dne.field_388da3_zGp = -(f2 * (float)Math.PI / 2.0f);
        this.field_36efdd1_Dne.method_7a46289a_Dne();
        GL11.glDisable(32826);
        GL11.glPopMatrix();
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public void method_bdc49bcc_Dne(ipD ipD2, double d, double d2, double d3, float f) {
        this.method_4a03723e_Dne((RPI)ipD2, d, d2, d3, f);
    }
}

