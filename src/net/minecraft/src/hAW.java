package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.nio.FloatBuffer;
import org.lwjgl.opengl.GL11;

public class hAW
extends DOP {
    private FloatBuffer field_7b76629_bzF;
    private static hAW field_376178e_Dne = new hAW();
    private FloatBuffer field_b5fd3c76_Dne = pZS.method_c3f43248_Dne(16);
    private FloatBuffer field_6bc6ca77_FWm = pZS.method_c3f43248_Dne(16);

    public static DOP method_22ff7c46_Dne() {
        field_376178e_Dne.method_7a46289a_Dne();
        return field_376178e_Dne;
    }

    private void method_7925f97d_Dne(float[][] fArray, int n) {
        float f = geR.method_143f92c9_bzF(fArray[n][0] * fArray[n][0] + fArray[n][1] * fArray[n][1] + fArray[n][2] * fArray[n][2]);
        float[] fArray2 = fArray[n];
        fArray2[0] = fArray2[0] / f;
        float[] fArray3 = fArray[n];
        fArray3[1] = fArray3[1] / f;
        float[] fArray4 = fArray[n];
        fArray4[2] = fArray4[2] / f;
        float[] fArray5 = fArray[n];
        fArray5[3] = fArray5[3] / f;
    }

    private void method_7a46289a_Dne() {
        this.field_b5fd3c76_Dne.clear();
        this.field_6bc6ca77_FWm.clear();
        this.field_7b76629_bzF.clear();
        GL11.glGetFloat(2983, this.field_b5fd3c76_Dne);
        GL11.glGetFloat(2982, this.field_6bc6ca77_FWm);
        this.field_b5fd3c76_Dne.flip().limit(16);
        this.field_b5fd3c76_Dne.get(this.field_3f1c586_Dne);
        this.field_6bc6ca77_FWm.flip().limit(16);
        this.field_6bc6ca77_FWm.get(this.field_4039e07_FWm);
        this.field_59d86b9_bzF[0] = this.field_4039e07_FWm[0] * this.field_3f1c586_Dne[0] + this.field_4039e07_FWm[1] * this.field_3f1c586_Dne[4] + this.field_4039e07_FWm[2] * this.field_3f1c586_Dne[8] + this.field_4039e07_FWm[3] * this.field_3f1c586_Dne[12];
        this.field_59d86b9_bzF[1] = this.field_4039e07_FWm[0] * this.field_3f1c586_Dne[1] + this.field_4039e07_FWm[1] * this.field_3f1c586_Dne[5] + this.field_4039e07_FWm[2] * this.field_3f1c586_Dne[9] + this.field_4039e07_FWm[3] * this.field_3f1c586_Dne[13];
        this.field_59d86b9_bzF[2] = this.field_4039e07_FWm[0] * this.field_3f1c586_Dne[2] + this.field_4039e07_FWm[1] * this.field_3f1c586_Dne[6] + this.field_4039e07_FWm[2] * this.field_3f1c586_Dne[10] + this.field_4039e07_FWm[3] * this.field_3f1c586_Dne[14];
        this.field_59d86b9_bzF[3] = this.field_4039e07_FWm[0] * this.field_3f1c586_Dne[3] + this.field_4039e07_FWm[1] * this.field_3f1c586_Dne[7] + this.field_4039e07_FWm[2] * this.field_3f1c586_Dne[11] + this.field_4039e07_FWm[3] * this.field_3f1c586_Dne[15];
        this.field_59d86b9_bzF[4] = this.field_4039e07_FWm[4] * this.field_3f1c586_Dne[0] + this.field_4039e07_FWm[5] * this.field_3f1c586_Dne[4] + this.field_4039e07_FWm[6] * this.field_3f1c586_Dne[8] + this.field_4039e07_FWm[7] * this.field_3f1c586_Dne[12];
        this.field_59d86b9_bzF[5] = this.field_4039e07_FWm[4] * this.field_3f1c586_Dne[1] + this.field_4039e07_FWm[5] * this.field_3f1c586_Dne[5] + this.field_4039e07_FWm[6] * this.field_3f1c586_Dne[9] + this.field_4039e07_FWm[7] * this.field_3f1c586_Dne[13];
        this.field_59d86b9_bzF[6] = this.field_4039e07_FWm[4] * this.field_3f1c586_Dne[2] + this.field_4039e07_FWm[5] * this.field_3f1c586_Dne[6] + this.field_4039e07_FWm[6] * this.field_3f1c586_Dne[10] + this.field_4039e07_FWm[7] * this.field_3f1c586_Dne[14];
        this.field_59d86b9_bzF[7] = this.field_4039e07_FWm[4] * this.field_3f1c586_Dne[3] + this.field_4039e07_FWm[5] * this.field_3f1c586_Dne[7] + this.field_4039e07_FWm[6] * this.field_3f1c586_Dne[11] + this.field_4039e07_FWm[7] * this.field_3f1c586_Dne[15];
        this.field_59d86b9_bzF[8] = this.field_4039e07_FWm[8] * this.field_3f1c586_Dne[0] + this.field_4039e07_FWm[9] * this.field_3f1c586_Dne[4] + this.field_4039e07_FWm[10] * this.field_3f1c586_Dne[8] + this.field_4039e07_FWm[11] * this.field_3f1c586_Dne[12];
        this.field_59d86b9_bzF[9] = this.field_4039e07_FWm[8] * this.field_3f1c586_Dne[1] + this.field_4039e07_FWm[9] * this.field_3f1c586_Dne[5] + this.field_4039e07_FWm[10] * this.field_3f1c586_Dne[9] + this.field_4039e07_FWm[11] * this.field_3f1c586_Dne[13];
        this.field_59d86b9_bzF[10] = this.field_4039e07_FWm[8] * this.field_3f1c586_Dne[2] + this.field_4039e07_FWm[9] * this.field_3f1c586_Dne[6] + this.field_4039e07_FWm[10] * this.field_3f1c586_Dne[10] + this.field_4039e07_FWm[11] * this.field_3f1c586_Dne[14];
        this.field_59d86b9_bzF[11] = this.field_4039e07_FWm[8] * this.field_3f1c586_Dne[3] + this.field_4039e07_FWm[9] * this.field_3f1c586_Dne[7] + this.field_4039e07_FWm[10] * this.field_3f1c586_Dne[11] + this.field_4039e07_FWm[11] * this.field_3f1c586_Dne[15];
        this.field_59d86b9_bzF[12] = this.field_4039e07_FWm[12] * this.field_3f1c586_Dne[0] + this.field_4039e07_FWm[13] * this.field_3f1c586_Dne[4] + this.field_4039e07_FWm[14] * this.field_3f1c586_Dne[8] + this.field_4039e07_FWm[15] * this.field_3f1c586_Dne[12];
        this.field_59d86b9_bzF[13] = this.field_4039e07_FWm[12] * this.field_3f1c586_Dne[1] + this.field_4039e07_FWm[13] * this.field_3f1c586_Dne[5] + this.field_4039e07_FWm[14] * this.field_3f1c586_Dne[9] + this.field_4039e07_FWm[15] * this.field_3f1c586_Dne[13];
        this.field_59d86b9_bzF[14] = this.field_4039e07_FWm[12] * this.field_3f1c586_Dne[2] + this.field_4039e07_FWm[13] * this.field_3f1c586_Dne[6] + this.field_4039e07_FWm[14] * this.field_3f1c586_Dne[10] + this.field_4039e07_FWm[15] * this.field_3f1c586_Dne[14];
        this.field_59d86b9_bzF[15] = this.field_4039e07_FWm[12] * this.field_3f1c586_Dne[3] + this.field_4039e07_FWm[13] * this.field_3f1c586_Dne[7] + this.field_4039e07_FWm[14] * this.field_3f1c586_Dne[11] + this.field_4039e07_FWm[15] * this.field_3f1c586_Dne[15];
        this.field_7a46ee0b_Dne[0][0] = this.field_59d86b9_bzF[3] - this.field_59d86b9_bzF[0];
        this.field_7a46ee0b_Dne[0][1] = this.field_59d86b9_bzF[7] - this.field_59d86b9_bzF[4];
        this.field_7a46ee0b_Dne[0][2] = this.field_59d86b9_bzF[11] - this.field_59d86b9_bzF[8];
        this.field_7a46ee0b_Dne[0][3] = this.field_59d86b9_bzF[15] - this.field_59d86b9_bzF[12];
        this.method_7925f97d_Dne(this.field_7a46ee0b_Dne, 0);
        this.field_7a46ee0b_Dne[1][0] = this.field_59d86b9_bzF[3] + this.field_59d86b9_bzF[0];
        this.field_7a46ee0b_Dne[1][1] = this.field_59d86b9_bzF[7] + this.field_59d86b9_bzF[4];
        this.field_7a46ee0b_Dne[1][2] = this.field_59d86b9_bzF[11] + this.field_59d86b9_bzF[8];
        this.field_7a46ee0b_Dne[1][3] = this.field_59d86b9_bzF[15] + this.field_59d86b9_bzF[12];
        this.method_7925f97d_Dne(this.field_7a46ee0b_Dne, 1);
        this.field_7a46ee0b_Dne[2][0] = this.field_59d86b9_bzF[3] + this.field_59d86b9_bzF[1];
        this.field_7a46ee0b_Dne[2][1] = this.field_59d86b9_bzF[7] + this.field_59d86b9_bzF[5];
        this.field_7a46ee0b_Dne[2][2] = this.field_59d86b9_bzF[11] + this.field_59d86b9_bzF[9];
        this.field_7a46ee0b_Dne[2][3] = this.field_59d86b9_bzF[15] + this.field_59d86b9_bzF[13];
        this.method_7925f97d_Dne(this.field_7a46ee0b_Dne, 2);
        this.field_7a46ee0b_Dne[3][0] = this.field_59d86b9_bzF[3] - this.field_59d86b9_bzF[1];
        this.field_7a46ee0b_Dne[3][1] = this.field_59d86b9_bzF[7] - this.field_59d86b9_bzF[5];
        this.field_7a46ee0b_Dne[3][2] = this.field_59d86b9_bzF[11] - this.field_59d86b9_bzF[9];
        this.field_7a46ee0b_Dne[3][3] = this.field_59d86b9_bzF[15] - this.field_59d86b9_bzF[13];
        this.method_7925f97d_Dne(this.field_7a46ee0b_Dne, 3);
        this.field_7a46ee0b_Dne[4][0] = this.field_59d86b9_bzF[3] - this.field_59d86b9_bzF[2];
        this.field_7a46ee0b_Dne[4][1] = this.field_59d86b9_bzF[7] - this.field_59d86b9_bzF[6];
        this.field_7a46ee0b_Dne[4][2] = this.field_59d86b9_bzF[11] - this.field_59d86b9_bzF[10];
        this.field_7a46ee0b_Dne[4][3] = this.field_59d86b9_bzF[15] - this.field_59d86b9_bzF[14];
        this.method_7925f97d_Dne(this.field_7a46ee0b_Dne, 4);
        this.field_7a46ee0b_Dne[5][0] = this.field_59d86b9_bzF[3] + this.field_59d86b9_bzF[2];
        this.field_7a46ee0b_Dne[5][1] = this.field_59d86b9_bzF[7] + this.field_59d86b9_bzF[6];
        this.field_7a46ee0b_Dne[5][2] = this.field_59d86b9_bzF[11] + this.field_59d86b9_bzF[10];
        this.field_7a46ee0b_Dne[5][3] = this.field_59d86b9_bzF[15] + this.field_59d86b9_bzF[14];
        this.method_7925f97d_Dne(this.field_7a46ee0b_Dne, 5);
    }

    public hAW() {
        this.field_7b76629_bzF = pZS.method_c3f43248_Dne(16);
    }
}

