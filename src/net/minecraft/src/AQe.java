package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.nio.FloatBuffer;
import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class AQe
extends jte_0 {
    FloatBuffer field_b5fd3c76_Dne = pZS.method_c3f43248_Dne(16);

    public void method_dba8059b_Dne(CmX cmX, double d, double d2, double d3, float f) {
        float f2 = (float)this.field_36f2779_Dne.field_267cf0_Qnq;
        float f3 = (float)this.field_36f2779_Dne.field_2d29ef_aFZ;
        float f4 = (float)this.field_36f2779_Dne.field_388da1_zGp;
        GL11.glDisable(2896);
        Random random = new Random(31100L);
        float f5 = 0.75f;
        for (int i = 0; i < 16; ++i) {
            GL11.glPushMatrix();
            float f6 = 16 - i;
            float f7 = 0.0625f;
            float f8 = 1.0f / (f6 + 1.0f);
            if (i == 0) {
                this.method_8f501fe4_Dne("/misc/tunnel.png");
                f8 = 0.1f;
                f6 = 65.0f;
                f7 = 0.125f;
                GL11.glEnable(3042);
                GL11.glBlendFunc(770, 771);
            }
            if (i == 1) {
                this.method_8f501fe4_Dne("/misc/particlefield.png");
                GL11.glEnable(3042);
                GL11.glBlendFunc(1, 1);
                f7 = 0.5f;
            }
            float f9 = (float)(-(d2 + (double)f5));
            float f10 = f9 + lqj.field_21260a_FWm;
            float f11 = f9 + f6 + lqj.field_21260a_FWm;
            float f12 = f10 / f11;
            GL11.glTranslatef(f2, f12 += (float)(d2 + (double)f5), f4);
            GL11.glTexGeni(8192, 9472, 9217);
            GL11.glTexGeni(8193, 9472, 9217);
            GL11.glTexGeni(8194, 9472, 9217);
            GL11.glTexGeni(8195, 9472, 9216);
            GL11.glTexGen(8192, 9473, this.method_ed4c24f7_Dne(1.0f, 0.0f, 0.0f, 0.0f));
            GL11.glTexGen(8193, 9473, this.method_ed4c24f7_Dne(0.0f, 0.0f, 1.0f, 0.0f));
            GL11.glTexGen(8194, 9473, this.method_ed4c24f7_Dne(0.0f, 0.0f, 0.0f, 1.0f));
            GL11.glTexGen(8195, 9474, this.method_ed4c24f7_Dne(0.0f, 1.0f, 0.0f, 0.0f));
            GL11.glEnable(3168);
            GL11.glEnable(3169);
            GL11.glEnable(3170);
            GL11.glEnable(3171);
            GL11.glPopMatrix();
            GL11.glMatrixMode(5890);
            GL11.glPushMatrix();
            GL11.glLoadIdentity();
            GL11.glTranslatef(0.0f, (float)(Minecraft.method_7a46288e_Dne() % 700000L) / 700000.0f, 0.0f);
            GL11.glScalef(f7, f7, f7);
            GL11.glTranslatef(0.5f, 0.5f, 0.0f);
            GL11.glRotatef((float)(i * i * 4321 + i * 9) * 2.0f, 0.0f, 0.0f, 1.0f);
            GL11.glTranslatef(-0.5f, -0.5f, 0.0f);
            GL11.glTranslatef(-f2, -f4, -f3);
            f10 = f9 + lqj.field_21260a_FWm;
            GL11.glTranslatef(lqj.field_2092ab_Dne * f6 / f10, lqj.field_2e5f18_bzF * f6 / f10, -f3);
            WAR wAR = WAR.field_36e5ca4_Dne;
            wAR.method_7a46289a_Dne();
            f12 = random.nextFloat() * 0.5f + 0.1f;
            float f13 = random.nextFloat() * 0.5f + 0.4f;
            float f14 = random.nextFloat() * 0.5f + 0.5f;
            if (i == 0) {
                f14 = 1.0f;
                f13 = 1.0f;
                f12 = 1.0f;
            }
            wAR.method_54283b9a_Dne(f12 * f8, f13 * f8, f14 * f8, 1.0f);
            wAR.method_2be429a4_Dne(d, d2 + (double)f5, d3);
            wAR.method_2be429a4_Dne(d, d2 + (double)f5, d3 + 1.0);
            wAR.method_2be429a4_Dne(d + 1.0, d2 + (double)f5, d3 + 1.0);
            wAR.method_2be429a4_Dne(d + 1.0, d2 + (double)f5, d3);
            wAR.method_7a46288d_Dne();
            GL11.glPopMatrix();
            GL11.glMatrixMode(5888);
        }
        GL11.glDisable(3042);
        GL11.glDisable(3168);
        GL11.glDisable(3169);
        GL11.glDisable(3170);
        GL11.glDisable(3171);
        GL11.glEnable(2896);
    }

    @Override
    public void method_bdc49bcc_Dne(ipD ipD2, double d, double d2, double d3, float f) {
        this.method_dba8059b_Dne((CmX)ipD2, d, d2, d3, f);
    }

    private FloatBuffer method_ed4c24f7_Dne(float f, float f2, float f3, float f4) {
        this.field_b5fd3c76_Dne.clear();
        this.field_b5fd3c76_Dne.put(f).put(f2).put(f3).put(f4);
        this.field_b5fd3c76_Dne.flip();
        return this.field_b5fd3c76_Dne;
    }
}

