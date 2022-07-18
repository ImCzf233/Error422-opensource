package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class geR {
    private static float[] field_3f1c586_Dne = new float[65536];

    public static final float method_ce7f4ad4_Dne(double d) {
        return (float)Math.sqrt(d);
    }

    public static float method_7ed96eaf_Qnq(float f) {
        return f >= 0.0f ? f : -f;
    }

    public static int method_2c2cf7bc_Dne(int n, int n2, int n3) {
        return n < n2 ? n2 : (n > n3 ? n3 : n);
    }

    public static int method_ce7f5259_Dne(float f) {
        int n = (int)f;
        return f < (float)n ? n - 1 : n;
    }

    public static int method_117d0718_FWm(double d) {
        int n = (int)d;
        return d < (double)n ? n - 1 : n;
    }

    public static long method_ce7f4ad8_Dne(double d) {
        long l = (long)d;
        return d < (double)l ? l - 1L : l;
    }

    public static int method_117d0e9a_FWm(float f) {
        int n = (int)f;
        return f > (float)n ? n + 1 : n;
    }

    public static int method_fbd61737_Dne(String string, int n, int n2) {
        int n3 = n;
        try {
            n3 = Integer.parseInt(string);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        if (n3 < n2) {
            n3 = n2;
        }
        return n3;
    }

    public static boolean method_8f501fe8_Dne(String string) {
        return string == null || string.length() == 0;
    }

    public static double method_174fcd7_Dne(long[] lArray) {
        long l = 0L;
        long[] lArray2 = lArray;
        int n = lArray.length;
        for (int i = 0; i < n; ++i) {
            long l2 = lArray2[i];
            l += l2;
        }
        return (double)l / (double)lArray.length;
    }

    public static final float method_117d0e97_FWm(float f) {
        return field_3f1c586_Dne[(int)(f * 10430.378f + 16384.0f) & 0xFFFF];
    }

    public static double method_16a71c8_Dne(double d, double d2) {
        if (d < 0.0) {
            d = -d;
        }
        if (d2 < 0.0) {
            d2 = -d2;
        }
        return d > d2 ? d : d2;
    }

    public static float method_2c0148d6_Dne(float f, float f2, float f3) {
        return f < f2 ? f2 : (f > f3 ? f3 : f);
    }

    public static int method_5ab44f92_Dne(String string, int n) {
        int n2 = n;
        try {
            n2 = Integer.parseInt(string);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        return n2;
    }

    public static int method_4cd91d9_Dne(Random random, int n, int n2) {
        return n >= n2 ? n : random.nextInt(n2 - n + 1) + n;
    }

    public static final float method_143f92c9_bzF(float f) {
        return (float)Math.sqrt(f);
    }

    public static int method_143f8b4a_bzF(double d) {
        int n = (int)d;
        return d > (double)n ? n + 1 : n;
    }

    static {
        for (int i = 0; i < 65536; ++i) {
            geR.field_3f1c586_Dne[i] = (float)Math.sin((double)i * Math.PI * 2.0 / 65536.0);
        }
    }

    public static int method_16cca6d_Dne(int n, int n2) {
        return n < 0 ? -((-n - 1) / n2) - 1 : n / n2;
    }

    public static double method_ce7f4ad2_Dne(double d) {
        if ((d %= 360.0) >= 180.0) {
            d -= 360.0;
        }
        if (d < -180.0) {
            d += 360.0;
        }
        return d;
    }

    public static double method_4cb3934_Dne(Random random, double d, double d2) {
        return d >= d2 ? d : random.nextDouble() * (d2 - d) + d;
    }

    public static double method_fbd3be92_Dne(String string, double d, double d2) {
        double d3 = d;
        try {
            d3 = Double.parseDouble(string);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        if (d3 < d2) {
            d3 = d2;
        }
        return d3;
    }

    public static float method_87b72d50_aFZ(float f) {
        if ((f %= 360.0f) >= 180.0f) {
            f -= 360.0f;
        }
        if (f < -180.0f) {
            f += 360.0f;
        }
        return f;
    }

    public static int method_ce7f5d9c_Dne(int n) {
        return n >= 0 ? n : -n;
    }

    public static final float method_ce7f5256_Dne(float f) {
        return field_3f1c586_Dne[(int)(f * 10430.378f) & 0xFFFF];
    }

    public static double method_5ab43cc8_Dne(String string, double d) {
        double d2 = d;
        try {
            d2 = Double.parseDouble(string);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        return d2;
    }

    public static int method_ce7f4ad7_Dne(double d) {
        return (int)(d + 1024.0) - 1024;
    }
}

