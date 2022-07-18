package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public class pZS {
    private static final List field_f27c122c_Dne;
    private static final Map field_83b1c1b0_Dne;

    public static synchronized void method_7a46289a_Dne() {
        for (int i = 0; i < field_f27c122c_Dne.size(); ++i) {
            GL11.glDeleteTextures((Integer)field_f27c122c_Dne.get(i));
        }
        field_f27c122c_Dne.clear();
    }

    public static synchronized int method_ce7f5d9c_Dne(int n) {
        int n2 = GL11.glGenLists(n);
        field_83b1c1b0_Dne.put(n2, n);
        return n2;
    }

    public static synchronized void method_7c6f6039_FWm() {
        for (Object obj : field_83b1c1b0_Dne.entrySet()) { Map.Entry entry = (Map.Entry) obj;
            GL11.glDeleteLists((Integer)entry.getKey(), (Integer)entry.getValue());
        }
        field_83b1c1b0_Dne.clear();
        pZS.method_7a46289a_Dne();
    }

    public static IntBuffer method_ab715f95_Dne(int n) {
        return pZS.method_f325dc6a_Dne(n << 2).asIntBuffer();
    }

    public static synchronized int method_7a46288d_Dne() {
        int n = GL11.glGenTextures();
        field_f27c122c_Dne.add(n);
        return n;
    }

    static {
        field_83b1c1b0_Dne = new HashMap();
        field_f27c122c_Dne = new ArrayList();
    }

    public static synchronized void method_ce7f5da9_Dne(int n) {
        GL11.glDeleteLists(n, (Integer)field_83b1c1b0_Dne.remove(n));
    }

    public static FloatBuffer method_c3f43248_Dne(int n) {
        return pZS.method_f325dc6a_Dne(n << 2).asFloatBuffer();
    }

    public static synchronized ByteBuffer method_f325dc6a_Dne(int n) {
        return ByteBuffer.allocateDirect(n).order(ByteOrder.nativeOrder());
    }
}

