package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class FYH
extends jte_0 {
    public static void method_4c04213a_Dne(Nlm nlm, double d, double d2, double d3, float f) {
        sMa sMa2 = nlm.method_2314d444_Dne();
        if (sMa2 != null) {
            sMa2.method_83516093_Dne(nlm.method_2305dd77_Dne());
            float f2 = 0.4375f;
            GL11.glTranslatef(0.0f, 0.4f, 0.0f);
            GL11.glRotatef((float)(nlm.field_212608_FWm + (nlm.field_2092a9_Dne - nlm.field_212608_FWm) * (double)f) * 10.0f, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(-30.0f, 1.0f, 0.0f, 0.0f);
            GL11.glTranslatef(0.0f, -0.4f, 0.0f);
            GL11.glScalef(f2, f2, f2);
            sMa2.method_9ce0fc65_FWm(d, d2, d3, 0.0f, 0.0f);
            ptH.field_37a7828_Dne.method_31745cde_Dne(sMa2, 0.0, 0.0, 0.0, 0.0f, f);
        }
    }

    public void method_62fe5cc1_Dne(ySb ySb2, double d, double d2, double d3, float f) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d + 0.5f, (float)d2, (float)d3 + 0.5f);
        FYH.method_4c04213a_Dne(ySb2.method_2304785c_Dne(), d, d2, d3, f);
        GL11.glPopMatrix();
    }

    @Override
    public void method_bdc49bcc_Dne(ipD ipD2, double d, double d2, double d3, float f) {
        this.method_62fe5cc1_Dne((ySb)ipD2, d, d2, d3, f);
    }
}

