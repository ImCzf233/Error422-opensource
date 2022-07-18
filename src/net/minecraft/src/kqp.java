package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class kqp
extends ycv {
    public static int method_3afb8a48_Dne(int n, Random random) {
        return n > 10 ? n - 10 : 1 + random.nextInt(4);
    }

    public static void method_1ddea214_Dne(sMa sMa2, FUH fUH, Random random) {
        int n = UYp.method_ff1760e9_zGp(fUH);
        NMq nMq = UYp.method_7acb75cc_Dne(ycv.field_14272b6a_div, fUH);
        if (kqp.method_3afb8a59_Dne(n, random)) {
            sMa2.method_147b2066_Dne(zBn.method_9a4057ab_Dne(fUH), kqp.method_3afb8a48_Dne(n, random));
            sMa2.method_fbd4aee4_Dne("damage.thorns", 0.5f, 1.0f);
            if (nMq != null) {
                nMq.method_60f1bf3f_Dne(3, fUH);
            }
        } else if (nMq != null) {
            nMq.method_60f1bf3f_Dne(1, fUH);
        }
    }

    public static boolean method_3afb8a59_Dne(int n, Random random) {
        return n <= 0 ? false : random.nextFloat() < 0.15f * (float)n;
    }

    @Override
    public int method_ce7f5d9c_Dne(int n) {
        return 10 + 20 * (n - 1);
    }

    @Override
    public int method_117d19dd_FWm(int n) {
        return super.method_ce7f5d9c_Dne(n) + 50;
    }

    public kqp(int n, int n2) {
        super(n, n2, ACj.field_7127eb2a_aFZ);
        this.method_286125e9_Dne("thorns");
    }

    @Override
    public boolean method_7c61cf19_Dne(NMq nMq) {
        return nMq.method_230de6ba_Dne() instanceof qoi_0 ? true : super.method_7c61cf19_Dne(nMq);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 3;
    }
}

