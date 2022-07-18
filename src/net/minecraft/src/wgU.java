package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class wgU
extends QCe {
    private int field_2092ae_Dne = -1;
    private Gor field_367c742_Dne;

    public void method_69ac06cc_Dne(Ndk ndk, double d, double d2, double d3, float f, float f2) {
        if (this.field_2092ae_Dne != 1) {
            this.field_367c742_Dne = new mrT(0.0f, true);
            this.field_2092ae_Dne = 1;
        }
        float f3 = (float)ndk.field_2092ae_Dne + f2;
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d2, (float)d3);
        this.method_8f501fe4_Dne("/mob/enderdragon/crystal.png");
        float f4 = geR.method_ce7f5256_Dne(f3 * 0.2f) / 2.0f + 0.5f;
        f4 += f4 * f4;
        this.field_367c742_Dne.method_3a102820_Dne(ndk, 0.0f, f3 * 3.0f, f4 * 0.2f, 0.0f, 0.0f, 0.0625f);
        GL11.glPopMatrix();
    }

    @Override
    public void method_31745cde_Dne(sMa sMa2, double d, double d2, double d3, float f, float f2) {
        this.method_69ac06cc_Dne((Ndk)sMa2, d, d2, d3, f, f2);
    }

    public wgU() {
        this.field_2092ab_Dne = 0.5f;
    }
}

