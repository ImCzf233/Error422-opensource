package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.nio.FloatBuffer;
import org.lwjgl.opengl.GL11;

public class Cit {
    private static FloatBuffer field_b5fd3c76_Dne = pZS.method_c3f43248_Dne(16);
    private static final chN field_3746303_Dne = chN.method_e4505d6c_Dne(0.2f, 1.0, -0.7f).method_230df162_Dne();
    private static final chN field_202e2ee2_FWm = chN.method_e4505d6c_Dne(-0.2f, 1.0, 0.7f).method_230df162_Dne();

    private static FloatBuffer method_ed4c24f7_Dne(float f, float f2, float f3, float f4) {
        field_b5fd3c76_Dne.clear();
        field_b5fd3c76_Dne.put(f).put(f2).put(f3).put(f4);
        field_b5fd3c76_Dne.flip();
        return field_b5fd3c76_Dne;
    }

    public static void method_ae128dc7_bzF() {
        GL11.glPushMatrix();
        GL11.glRotatef(-30.0f, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(165.0f, 1.0f, 0.0f, 0.0f);
        Cit.method_7c6f6039_FWm();
        GL11.glPopMatrix();
    }

    public static void method_7c6f6039_FWm() {
        GL11.glEnable(2896);
        GL11.glEnable(16384);
        GL11.glEnable(16385);
        GL11.glEnable(2903);
        GL11.glColorMaterial(1032, 5634);
        float f = 0.4f;
        float f2 = 0.6f;
        float f3 = 0.0f;
        GL11.glLight(16384, 4611, Cit.method_7693a577_Dne(Cit.field_3746303_Dne.field_2092a9_Dne, Cit.field_3746303_Dne.field_212608_FWm, Cit.field_3746303_Dne.field_2e5f16_bzF, 0.0));
        GL11.glLight(16384, 4609, Cit.method_ed4c24f7_Dne(f2, f2, f2, 1.0f));
        GL11.glLight(16384, 4608, Cit.method_ed4c24f7_Dne(0.0f, 0.0f, 0.0f, 1.0f));
        GL11.glLight(16384, 4610, Cit.method_ed4c24f7_Dne(f3, f3, f3, 1.0f));
        GL11.glLight(16385, 4611, Cit.method_7693a577_Dne(Cit.field_202e2ee2_FWm.field_2092a9_Dne, Cit.field_202e2ee2_FWm.field_212608_FWm, Cit.field_202e2ee2_FWm.field_2e5f16_bzF, 0.0));
        GL11.glLight(16385, 4609, Cit.method_ed4c24f7_Dne(f2, f2, f2, 1.0f));
        GL11.glLight(16385, 4608, Cit.method_ed4c24f7_Dne(0.0f, 0.0f, 0.0f, 1.0f));
        GL11.glLight(16385, 4610, Cit.method_ed4c24f7_Dne(f3, f3, f3, 1.0f));
        GL11.glShadeModel(7424);
        GL11.glLightModel(2899, Cit.method_ed4c24f7_Dne(f, f, f, 1.0f));
    }

    private static FloatBuffer method_7693a577_Dne(double d, double d2, double d3, double d4) {
        return Cit.method_ed4c24f7_Dne((float)d, (float)d2, (float)d3, (float)d4);
    }

    public static void method_7a46289a_Dne() {
        GL11.glDisable(2896);
        GL11.glDisable(16384);
        GL11.glDisable(16385);
        GL11.glDisable(2903);
    }
}

