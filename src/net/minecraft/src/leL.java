package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class leL
extends jte_0 {
    private UuX field_36e37d4_Dne = new UuX();

    @Override
    public void method_bdc49bcc_Dne(ipD ipD2, double d, double d2, double d3, float f) {
        this.method_5053db8b_Dne((AjG)ipD2, d, d2, d3, f);
    }

    public void method_5053db8b_Dne(AjG ajG, double d, double d2, double d3, float f) {
        float f2;
        zKP zKP2 = ajG.method_2317f94c_Dne();
        GL11.glPushMatrix();
        float f3 = 0.6666667f;
        if (zKP2 == zKP.field_2c863000_LVR) {
            GL11.glTranslatef((float)d + 0.5f, (float)d2 + 0.75f * f3, (float)d3 + 0.5f);
            float f4 = (float)(ajG.method_d44b4585_zGp() * 360) / 16.0f;
            GL11.glRotatef(-f4, 0.0f, 1.0f, 0.0f);
            this.field_36e37d4_Dne.field_20353c45_FWm.field_21261e_FWm = true;
        } else {
            int n = ajG.method_d44b4585_zGp();
            f2 = 0.0f;
            if (n == 2) {
                f2 = 180.0f;
            }
            if (n == 4) {
                f2 = 90.0f;
            }
            if (n == 5) {
                f2 = -90.0f;
            }
            GL11.glTranslatef((float)d + 0.5f, (float)d2 + 0.75f * f3, (float)d3 + 0.5f);
            GL11.glRotatef(-f2, 0.0f, 1.0f, 0.0f);
            GL11.glTranslatef(0.0f, -0.3125f, -0.4375f);
            this.field_36e37d4_Dne.field_20353c45_FWm.field_21261e_FWm = false;
        }
        this.method_8f501fe4_Dne("/item/sign.png");
        GL11.glPushMatrix();
        GL11.glScalef(f3, -f3, -f3);
        this.field_36e37d4_Dne.method_7a46289a_Dne();
        GL11.glPopMatrix();
        msA msA2 = this.method_2312a4d0_Dne();
        f2 = 0.016666668f * f3;
        GL11.glTranslatef(0.0f, 0.5f * f3, 0.07f * f3);
        GL11.glScalef(f2, -f2, f2);
        GL11.glNormal3f(0.0f, 0.0f, -1.0f * f2);
        GL11.glDepthMask(false);
        int n = 0;
        for (int i = 0; i < ajG.field_f5e54dca_Dne.length; ++i) {
            String string = ajG.field_f5e54dca_Dne[i];
            if (i == ajG.field_2092ae_Dne) {
                string = "> " + string + " <";
                msA2.method_e88b55f3_FWm(string, -msA2.method_8f501fd7_Dne(string) / 2, i * 10 - ajG.field_f5e54dca_Dne.length * 5, n);
                continue;
            }
            msA2.method_e88b55f3_FWm(string, -msA2.method_8f501fd7_Dne(string) / 2, i * 10 - ajG.field_f5e54dca_Dne.length * 5, n);
        }
        GL11.glDepthMask(true);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glPopMatrix();
    }
}

