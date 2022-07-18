package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class ocu {
    protected float field_21260a_FWm = 0.0f;

    public void method_f35902f6_Dne(int n, int n2, gDn gDn2, int n3, int n4) {
        WAR wAR = WAR.field_36e5ca4_Dne;
        wAR.method_7a46289a_Dne();
        wAR.method_c38c5864_Dne(n + 0, n2 + n4, this.field_21260a_FWm, gDn2.method_7a46288a_Dne(), gDn2.method_907a9d11_Qnq());
        wAR.method_c38c5864_Dne(n + n3, n2 + n4, this.field_21260a_FWm, gDn2.method_7c6f6029_FWm(), gDn2.method_907a9d11_Qnq());
        wAR.method_c38c5864_Dne(n + n3, n2 + 0, this.field_21260a_FWm, gDn2.method_7c6f6029_FWm(), gDn2.method_ae128db7_bzF());
        wAR.method_c38c5864_Dne(n + 0, n2 + 0, this.field_21260a_FWm, gDn2.method_7a46288a_Dne(), gDn2.method_ae128db7_bzF());
        wAR.method_7a46288d_Dne();
    }

    protected void method_c6b5263a_Dne(int n, int n2, int n3, int n4, int n5, int n6) {
        float f = (float)(n5 >> 24 & 0xFF) / 255.0f;
        float f2 = (float)(n5 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n5 >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n5 & 0xFF) / 255.0f;
        float f5 = (float)(n6 >> 24 & 0xFF) / 255.0f;
        float f6 = (float)(n6 >> 16 & 0xFF) / 255.0f;
        float f7 = (float)(n6 >> 8 & 0xFF) / 255.0f;
        float f8 = (float)(n6 & 0xFF) / 255.0f;
        GL11.glDisable(3553);
        GL11.glEnable(3042);
        GL11.glDisable(3008);
        GL11.glBlendFunc(770, 771);
        GL11.glShadeModel(7425);
        WAR wAR = WAR.field_36e5ca4_Dne;
        wAR.method_7a46289a_Dne();
        wAR.method_54283b9a_Dne(f2, f3, f4, f);
        wAR.method_2be429a4_Dne(n3, n2, this.field_21260a_FWm);
        wAR.method_2be429a4_Dne(n, n2, this.field_21260a_FWm);
        wAR.method_54283b9a_Dne(f6, f7, f8, f5);
        wAR.method_2be429a4_Dne(n, n4, this.field_21260a_FWm);
        wAR.method_2be429a4_Dne(n3, n4, this.field_21260a_FWm);
        wAR.method_7a46288d_Dne();
        GL11.glShadeModel(7424);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glEnable(3553);
    }

    protected void method_2ee8c479_FWm(int n, int n2, int n3, int n4) {
        if (n3 < n2) {
            int n5 = n2;
            n2 = n3;
            n3 = n5;
        }
        ocu.method_d4dc89e9_Dne(n, n2 + 1, n + 1, n3, n4);
    }

    public static void method_d4dc89e9_Dne(int n, int n2, int n3, int n4, int n5) {
        int n6;
        if (n < n3) {
            n6 = n;
            n = n3;
            n3 = n6;
        }
        if (n2 < n4) {
            n6 = n2;
            n2 = n4;
            n4 = n6;
        }
        float f = (float)(n5 >> 24 & 0xFF) / 255.0f;
        float f2 = (float)(n5 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n5 >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n5 & 0xFF) / 255.0f;
        WAR wAR = WAR.field_36e5ca4_Dne;
        GL11.glEnable(3042);
        GL11.glDisable(3553);
        GL11.glBlendFunc(770, 771);
        GL11.glColor4f(f2, f3, f4, f);
        wAR.method_7a46289a_Dne();
        wAR.method_2be429a4_Dne(n, n4, 0.0);
        wAR.method_2be429a4_Dne(n3, n4, 0.0);
        wAR.method_2be429a4_Dne(n3, n2, 0.0);
        wAR.method_2be429a4_Dne(n, n2, 0.0);
        wAR.method_7a46288d_Dne();
        GL11.glEnable(3553);
        GL11.glDisable(3042);
    }

    protected void method_5972745a_Dne(int n, int n2, int n3, int n4) {
        if (n2 < n) {
            int n5 = n;
            n = n2;
            n2 = n5;
        }
        ocu.method_d4dc89e9_Dne(n, n3, n2 + 1, n3 + 1, n4);
    }

    public void method_67d6d54c_FWm(msA msA2, String string, int n, int n2, int n3) {
        msA2.method_7eed4432_Dne(string, n, n2, n3);
    }

    public void method_17d7ea99_FWm(int n, int n2, int n3, int n4, int n5, int n6) {
        float f = 0.00390625f;
        float f2 = 0.00390625f;
        WAR wAR = WAR.field_36e5ca4_Dne;
        wAR.method_7a46289a_Dne();
        wAR.method_c38c5864_Dne(n + 0, n2 + n6, this.field_21260a_FWm, (float)(n3 + 0) * f, (float)(n4 + n6) * f2);
        wAR.method_c38c5864_Dne(n + n5, n2 + n6, this.field_21260a_FWm, (float)(n3 + n5) * f, (float)(n4 + n6) * f2);
        wAR.method_c38c5864_Dne(n + n5, n2 + 0, this.field_21260a_FWm, (float)(n3 + n5) * f, (float)(n4 + 0) * f2);
        wAR.method_c38c5864_Dne(n + 0, n2 + 0, this.field_21260a_FWm, (float)(n3 + 0) * f, (float)(n4 + 0) * f2);
        wAR.method_7a46288d_Dne();
    }

    public void method_32faf66d_Dne(msA msA2, String string, int n, int n2, int n3) {
        msA2.method_7eed4432_Dne(string, n - msA2.method_8f501fd7_Dne(string) / 2, n2, n3);
    }
}

