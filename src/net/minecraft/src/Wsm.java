package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;
import org.lwjgl.opengl.GL11;

public class Wsm
extends Gor {
    rxL[] field_8371bdc1_Dne = new rxL[9];
    rxL field_37b7066_Dne;

    @Override
    public void method_5c531ba0_Dne(float f, float f2, float f3, float f4, float f5, float f6, sMa sMa2) {
        for (int i = 0; i < this.field_8371bdc1_Dne.length; ++i) {
            this.field_8371bdc1_Dne[i].field_388da3_zGp = 0.2f * geR.method_ce7f5256_Dne(f3 * 0.3f + (float)i) + 0.4f;
        }
    }

    @Override
    public void method_3a102820_Dne(sMa sMa2, float f, float f2, float f3, float f4, float f5, float f6) {
        this.method_5c531ba0_Dne(f, f2, f3, f4, f5, f6, sMa2);
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0f, 0.6f, 0.0f);
        this.field_37b7066_Dne.method_ce7f5266_Dne(f6);
        for (rxL rxL2 : this.field_8371bdc1_Dne) {
            rxL2.method_ce7f5266_Dne(f6);
        }
        GL11.glPopMatrix();
    }

    public Wsm() {
        int n = -16;
        this.field_37b7066_Dne = new rxL(this, 0, 0);
        this.field_37b7066_Dne.method_cbecd0a8_Dne(-8.0f, -8.0f, -8.0f, 16, 16, 16);
        this.field_37b7066_Dne.field_267cf2_Qnq += (float)(24 + n);
        Random random = new Random(1660L);
        for (int i = 0; i < this.field_8371bdc1_Dne.length; ++i) {
            this.field_8371bdc1_Dne[i] = new rxL(this, 0, 0);
            float f = (((float)(i % 3) - (float)(i / 3 % 2) * 0.5f + 0.25f) / 2.0f * 2.0f - 1.0f) * 5.0f;
            float f2 = ((float)(i / 3) / 2.0f * 2.0f - 1.0f) * 5.0f;
            int n2 = random.nextInt(7) + 8;
            this.field_8371bdc1_Dne[i].method_cbecd0a8_Dne(-1.0f, 0.0f, -1.0f, 2, n2, 2);
            this.field_8371bdc1_Dne[i].field_2e5f18_bzF = f;
            this.field_8371bdc1_Dne[i].field_2d29f1_aFZ = f2;
            this.field_8371bdc1_Dne[i].field_267cf2_Qnq = 31 + n;
        }
    }
}

