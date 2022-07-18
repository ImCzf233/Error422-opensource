package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class mrT
extends Gor {
    private rxL field_20353c45_FWm = new rxL(this, "glass");
    private rxL field_75c33e53_bzF;
    private rxL field_37b7066_Dne;

    @Override
    public void method_3a102820_Dne(sMa sMa2, float f, float f2, float f3, float f4, float f5, float f6) {
        GL11.glPushMatrix();
        GL11.glScalef(2.0f, 2.0f, 2.0f);
        GL11.glTranslatef(0.0f, -0.5f, 0.0f);
        if (this.field_75c33e53_bzF != null) {
            this.field_75c33e53_bzF.method_ce7f5266_Dne(f6);
        }
        GL11.glRotatef(f2, 0.0f, 1.0f, 0.0f);
        GL11.glTranslatef(0.0f, 0.8f + f3, 0.0f);
        GL11.glRotatef(60.0f, 0.7071f, 0.0f, 0.7071f);
        this.field_20353c45_FWm.method_ce7f5266_Dne(f6);
        float f7 = 0.875f;
        GL11.glScalef(f7, f7, f7);
        GL11.glRotatef(60.0f, 0.7071f, 0.0f, 0.7071f);
        GL11.glRotatef(f2, 0.0f, 1.0f, 0.0f);
        this.field_20353c45_FWm.method_ce7f5266_Dne(f6);
        GL11.glScalef(f7, f7, f7);
        GL11.glRotatef(60.0f, 0.7071f, 0.0f, 0.7071f);
        GL11.glRotatef(f2, 0.0f, 1.0f, 0.0f);
        this.field_37b7066_Dne.method_ce7f5266_Dne(f6);
        GL11.glPopMatrix();
    }

    public mrT(float f, boolean bl) {
        this.field_20353c45_FWm.method_9057b0a5_Dne(0, 0).method_cbecd0a8_Dne(-4.0f, -4.0f, -4.0f, 8, 8, 8);
        this.field_37b7066_Dne = new rxL(this, "cube");
        this.field_37b7066_Dne.method_9057b0a5_Dne(32, 0).method_cbecd0a8_Dne(-4.0f, -4.0f, -4.0f, 8, 8, 8);
        if (bl) {
            this.field_75c33e53_bzF = new rxL(this, "base");
            this.field_75c33e53_bzF.method_9057b0a5_Dne(0, 16).method_cbecd0a8_Dne(-6.0f, 0.0f, -6.0f, 12, 4, 12);
        }
    }
}

