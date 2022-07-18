package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from ehI
 */
public class ehi_0
extends QCe {
    @Override
    public void method_31745cde_Dne(sMa sMa2, double d, double d2, double d3, float f, float f2) {
        this.method_56a51f2e_Dne((xIh)sMa2, d, d2, d3, f, f2);
    }

    public void method_56a51f2e_Dne(xIh xIh2, double d, double d2, double d3, float f, float f2) {
        int n;
        WAR wAR = WAR.field_36e5ca4_Dne;
        GL11.glDisable(3553);
        GL11.glDisable(2896);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 1);
        double[] dArray = new double[8];
        double[] dArray2 = new double[8];
        double d4 = 0.0;
        double d5 = 0.0;
        Random random = new Random(xIh2.field_2092af_Dne);
        for (n = 7; n >= 0; --n) {
            dArray[n] = d4;
            dArray2[n] = d5;
            d4 += (double)(random.nextInt(11) - 5);
            d5 += (double)(random.nextInt(11) - 5);
        }
        for (n = 0; n < 4; ++n) {
            Random random2 = new Random(xIh2.field_2092af_Dne);
            for (int i = 0; i < 3; ++i) {
                int n2 = 7;
                int n3 = 0;
                if (i > 0) {
                    n2 = 7 - i;
                }
                if (i > 0) {
                    n3 = n2 - 2;
                }
                double d6 = dArray[n2] - d4;
                double d7 = dArray2[n2] - d5;
                for (int j = n2; j >= n3; --j) {
                    double d8 = d6;
                    double d9 = d7;
                    if (i == 0) {
                        d6 += (double)(random2.nextInt(11) - 5);
                        d7 += (double)(random2.nextInt(11) - 5);
                    } else {
                        d6 += (double)(random2.nextInt(31) - 15);
                        d7 += (double)(random2.nextInt(31) - 15);
                    }
                    wAR.method_ce7f5da9_Dne(5);
                    float f3 = 0.5f;
                    wAR.method_54283b9a_Dne(0.9f * f3, 0.9f * f3, 1.0f * f3, 0.3f);
                    double d10 = 0.1 + (double)n * 0.2;
                    if (i == 0) {
                        d10 *= (double)j * 0.1 + 1.0;
                    }
                    double d11 = 0.1 + (double)n * 0.2;
                    if (i == 0) {
                        d11 *= (double)(j - 1) * 0.1 + 1.0;
                    }
                    for (int k = 0; k < 5; ++k) {
                        double d12 = d + 0.5 - d10;
                        double d13 = d3 + 0.5 - d10;
                        if (k == 1 || k == 2) {
                            d12 += d10 * 2.0;
                        }
                        if (k == 2 || k == 3) {
                            d13 += d10 * 2.0;
                        }
                        double d14 = d + 0.5 - d11;
                        double d15 = d3 + 0.5 - d11;
                        if (k == 1 || k == 2) {
                            d14 += d11 * 2.0;
                        }
                        if (k == 2 || k == 3) {
                            d15 += d11 * 2.0;
                        }
                        wAR.method_2be429a4_Dne(d14 + d6, d2 + (double)(j * 16), d15 + d7);
                        wAR.method_2be429a4_Dne(d12 + d8, d2 + (double)((j + 1) * 16), d13 + d9);
                    }
                    wAR.method_7a46288d_Dne();
                }
            }
        }
        GL11.glDisable(3042);
        GL11.glEnable(2896);
        GL11.glEnable(3553);
    }
}

