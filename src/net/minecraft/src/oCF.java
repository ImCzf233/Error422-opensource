package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.ARBMultitexture;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GLContext;

public class oCF {
    public static int field_2092ae_Dne;
    public static int field_21260d_FWm;
    private static boolean field_2092bf_Dne;

    public static void method_ce7f5da9_Dne(int n) {
        if (field_2092bf_Dne) {
            ARBMultitexture.glActiveTextureARB(n);
        } else {
            GL13.glActiveTexture(n);
        }
    }

    public static void method_2c2b8f69_Dne(int n, float f, float f2) {
        if (field_2092bf_Dne) {
            ARBMultitexture.glMultiTexCoord2fARB(n, f, f2);
        } else {
            GL13.glMultiTexCoord2f(n, f, f2);
        }
    }

    static {
        field_2092bf_Dne = false;
    }

    public static void method_117d19ea_FWm(int n) {
        if (field_2092bf_Dne) {
            ARBMultitexture.glClientActiveTextureARB(n);
        } else {
            GL13.glClientActiveTexture(n);
        }
    }

    public static void method_7a46289a_Dne() {
        boolean bl = field_2092bf_Dne = GLContext.getCapabilities().GL_ARB_multitexture && !GLContext.getCapabilities().OpenGL13;
        if (field_2092bf_Dne) {
            field_2092ae_Dne = 33984;
            field_21260d_FWm = 33985;
        } else {
            field_2092ae_Dne = 33984;
            field_21260d_FWm = 33985;
        }
    }
}

