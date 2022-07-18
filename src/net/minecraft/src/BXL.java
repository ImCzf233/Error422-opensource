package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.awt.image.BufferedImage;
import org.lwjgl.opengl.GL11;

public class BXL {
    private fZI field_3758af7_Dne;
    private int field_2092ae_Dne;
    private msA field_3791671_Dne;
    private int[] field_3f1c589_Dne = new int[16384];

    public void method_bd66b148_Dne(FiG fiG, Snh snh, Ilk ilk) {
        int n;
        byte by;
        int n2;
        for (n2 = 0; n2 < 16384; ++n2) {
            by = ilk.field_3f1c582_Dne[n2];
            if (by / 4 == 0) {
                this.field_3f1c589_Dne[n2] = (n2 + n2 / 128 & 1) * 8 + 16 << 24;
                continue;
            }
            int n3 = UpO.field_83647153_Dne[by / 4].field_2092ae_Dne;
            int n4 = by & 3;
            n = 220;
            if (n4 == 2) {
                n = 255;
            }
            if (n4 == 0) {
                n = 180;
            }
            int n5 = (n3 >> 16 & 0xFF) * n / 255;
            int n6 = (n3 >> 8 & 0xFF) * n / 255;
            int n7 = (n3 & 0xFF) * n / 255;
            if (this.field_3758af7_Dne.field_2e5f2c_bzF) {
                int n8 = (n5 * 30 + n6 * 59 + n7 * 11) / 100;
                int n9 = (n5 * 30 + n6 * 70) / 100;
                int n10 = (n5 * 30 + n7 * 70) / 100;
                n5 = n8;
                n6 = n9;
                n7 = n10;
            }
            this.field_3f1c589_Dne[n2] = 0xFF000000 | n5 << 16 | n6 << 8 | n7;
        }
        snh.method_8d0cb47b_Dne(this.field_3f1c589_Dne, 128, 128, this.field_2092ae_Dne);
        n2 = 0;
        by = 0;
        WAR wAR = WAR.field_36e5ca4_Dne;
        float f = 0.0f;
        GL11.glBindTexture(3553, this.field_2092ae_Dne);
        GL11.glEnable(3042);
        GL11.glBlendFunc(1, 771);
        GL11.glDisable(3008);
        wAR.method_7a46289a_Dne();
        wAR.method_c38c5864_Dne((float)(n2 + 0) + f, (float)(by + 128) - f, -0.01f, 0.0, 1.0);
        wAR.method_c38c5864_Dne((float)(n2 + 128) - f, (float)(by + 128) - f, -0.01f, 1.0, 1.0);
        wAR.method_c38c5864_Dne((float)(n2 + 128) - f, (float)(by + 0) + f, -0.01f, 1.0, 0.0);
        wAR.method_c38c5864_Dne((float)(n2 + 0) + f, (float)(by + 0) + f, -0.01f, 0.0, 0.0);
        wAR.method_7a46288d_Dne();
        GL11.glEnable(3008);
        GL11.glDisable(3042);
        snh.method_7a46289a_Dne();
        snh.method_8f501fe4_Dne("/misc/mapicons.png");
        n = 0;
        for (GHe gHe : ilk.field_83b1c1b0_Dne.values()) {
            GL11.glPushMatrix();
            GL11.glTranslatef((float)n2 + (float)gHe.field_212606_FWm / 2.0f + 64.0f, (float)by + (float)gHe.field_2e5f14_bzF / 2.0f + 64.0f, -0.02f);
            GL11.glRotatef((float)(gHe.field_267cee_Qnq * 360) / 16.0f, 0.0f, 0.0f, 1.0f);
            GL11.glScalef(4.0f, 4.0f, 3.0f);
            GL11.glTranslatef(-0.125f, 0.125f, 0.0f);
            float f2 = (float)(gHe.field_2092a7_Dne % 4 + 0) / 4.0f;
            float f3 = (float)(gHe.field_2092a7_Dne / 4 + 0) / 4.0f;
            float f4 = (float)(gHe.field_2092a7_Dne % 4 + 1) / 4.0f;
            float f5 = (float)(gHe.field_2092a7_Dne / 4 + 1) / 4.0f;
            wAR.method_7a46289a_Dne();
            wAR.method_c38c5864_Dne(-1.0, 1.0, (float)n * 0.001f, f2, f3);
            wAR.method_c38c5864_Dne(1.0, 1.0, (float)n * 0.001f, f4, f3);
            wAR.method_c38c5864_Dne(1.0, -1.0, (float)n * 0.001f, f4, f5);
            wAR.method_c38c5864_Dne(-1.0, -1.0, (float)n * 0.001f, f2, f5);
            wAR.method_7a46288d_Dne();
            GL11.glPopMatrix();
            ++n;
        }
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0f, 0.0f, -0.04f);
        GL11.glScalef(1.0f, 1.0f, 1.0f);
        GL11.glPopMatrix();
    }

    public BXL(msA msA2, fZI fZI2, Snh snh) {
        this.field_3758af7_Dne = fZI2;
        this.field_3791671_Dne = msA2;
        this.field_2092ae_Dne = snh.method_1420ded2_Dne(new BufferedImage(128, 128, 2));
        for (int i = 0; i < 16384; ++i) {
            this.field_3f1c589_Dne[i] = 0;
        }
    }
}

