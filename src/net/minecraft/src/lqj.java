package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

public class lqj {
    public static float field_20b854_DyG;
    public static float field_2e5f18_bzF;
    public static float field_388da3_zGp;
    public static float field_267cf2_Qnq;
    public static float field_2f0dd5_div;
    private static FloatBuffer field_b5fd3c76_Dne;
    public static float field_21260a_FWm;
    private static FloatBuffer field_6bc6ca77_FWm;
    private static FloatBuffer field_7b76629_bzF;
    public static float field_2d29f1_aFZ;
    private static IntBuffer field_76f31d43_Dne;
    public static float field_2092ab_Dne;

    public static chN method_ff4938d8_Dne(FUH fUH, double d) {
        double d2 = fUH.field_2d29ef_aFZ + (fUH.field_2f0dd3_div - fUH.field_2d29ef_aFZ) * d;
        double d3 = fUH.field_388da1_zGp + (fUH.field_22c5fd_IjH - fUH.field_388da1_zGp) * d + (double)fUH.method_59ee189_c_();
        double d4 = fUH.field_20b852_DyG + (fUH.field_334487_mrb - fUH.field_20b852_DyG) * d;
        double d5 = d2 + (double)(field_2092ab_Dne * 1.0f);
        double d6 = d3 + (double)(field_21260a_FWm * 1.0f);
        double d7 = d4 + (double)(field_2e5f18_bzF * 1.0f);
        return fUH.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(d5, d6, d7);
    }

    public static void method_961ec291_Dne(FiG fiG, boolean bl) {
        GL11.glGetFloat(2982, field_b5fd3c76_Dne);
        GL11.glGetFloat(2983, field_6bc6ca77_FWm);
        GL11.glGetInteger(2978, field_76f31d43_Dne);
        float f = (field_76f31d43_Dne.get(0) + field_76f31d43_Dne.get(2)) / 2;
        float f2 = (field_76f31d43_Dne.get(1) + field_76f31d43_Dne.get(3)) / 2;
        GLU.gluUnProject(f, f2, 0.0f, field_b5fd3c76_Dne, field_6bc6ca77_FWm, field_76f31d43_Dne, field_7b76629_bzF);
        field_2092ab_Dne = field_7b76629_bzF.get(0);
        field_21260a_FWm = field_7b76629_bzF.get(1);
        field_2e5f18_bzF = field_7b76629_bzF.get(2);
        int n = bl ? 1 : 0;
        float f3 = fiG.field_29186a_XHL;
        float f4 = fiG.field_334489_mrb;
        field_267cf2_Qnq = geR.method_117d0e97_FWm(f4 * (float)Math.PI / 180.0f) * (float)(1 - n * 2);
        field_388da3_zGp = geR.method_ce7f5256_Dne(f4 * (float)Math.PI / 180.0f) * (float)(1 - n * 2);
        field_20b854_DyG = -field_388da3_zGp * geR.method_ce7f5256_Dne(f3 * (float)Math.PI / 180.0f) * (float)(1 - n * 2);
        field_2f0dd5_div = field_267cf2_Qnq * geR.method_ce7f5256_Dne(f3 * (float)Math.PI / 180.0f) * (float)(1 - n * 2);
        field_2d29f1_aFZ = geR.method_117d0e97_FWm(f3 * (float)Math.PI / 180.0f);
    }

    static {
        field_2092ab_Dne = 0.0f;
        field_21260a_FWm = 0.0f;
        field_2e5f18_bzF = 0.0f;
        field_76f31d43_Dne = pZS.method_ab715f95_Dne(16);
        field_b5fd3c76_Dne = pZS.method_c3f43248_Dne(16);
        field_6bc6ca77_FWm = pZS.method_c3f43248_Dne(16);
        field_7b76629_bzF = pZS.method_c3f43248_Dne(3);
    }

    public static int method_33813bbe_Dne(Qnq qnq, FUH fUH, float f) {
        float f2;
        float f3;
        chN chN2 = lqj.method_ff4938d8_Dne(fUH, f);
        EyB eyB = new EyB(chN2);
        int n = qnq.method_2c2cf7bc_Dne(eyB.field_2092ae_Dne, eyB.field_21260d_FWm, eyB.field_2e5f1b_bzF);
        if (n != 0 && zKP.field_8374b848_Dne[n].field_368fd23_Dne.method_907a9d25_Qnq() && chN2.field_212608_FWm >= (double)(f3 = (float)(eyB.field_21260d_FWm + 1) - (f2 = byt.method_ce7f5d99_Dne(qnq.method_2dee76f_bzF(eyB.field_2092ae_Dne, eyB.field_21260d_FWm, eyB.field_2e5f1b_bzF)) - 0.11111111f))) {
            n = qnq.method_2c2cf7bc_Dne(eyB.field_2092ae_Dne, eyB.field_21260d_FWm + 1, eyB.field_2e5f1b_bzF);
        }
        return n;
    }
}

