package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class aQq
extends ljW {
    public static boolean field_2092bf_Dne = false;

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    public void method_ff5e68fb_FWm(Qnq qnq, int n, int n2, int n3, Random random) {
        double d = (float)n + random.nextFloat();
        double d2 = (float)n2 + 0.8f;
        double d3 = (float)n3 + random.nextFloat();
        double d4 = 0.0;
        double d5 = 0.0;
        double d6 = 0.0;
        qnq.method_8600ec24_Dne("smoke", d, d2, d3, d4, d5, d6);
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_5e5f2002_Qnq = rbp.method_285881e4_Dne("portal");
    }

    @Override
    public void method_9cb39130_Dne(Qnq qnq, int n, int n2, int n3) {
        if (!field_2092bf_Dne && qnq.field_3690d00_Dne.field_2092ae_Dne != 0) {
            qnq.method_2e7161e6_Qnq(n, n2, n3);
        }
    }

    @Override
    public int method_cfc9daf9_Dne(Random random) {
        return 0;
    }

    @Override
    public int method_7a46288d_Dne() {
        return -1;
    }

    @Override
    public ipD method_c35d5be7_Dne(Qnq qnq) {
        return new CmX();
    }

    @Override
    public boolean method_79d378f8_Dne(Zpi zpi, int n, int n2, int n3, int n4) {
        return n4 != 0 ? false : super.method_79d378f8_Dne(zpi, n, n2, n3, n4);
    }

    protected aQq(int n, KFd kFd) {
        super(n, kFd);
        this.method_ffcf5d18_Dne(1.0f);
    }

    @Override
    public void method_1bbfa017_Dne(Qnq qnq, int n, int n2, int n3, bSp bSp2, List list, sMa sMa2) {
    }

    @Override
    public void method_fbabf7ef_Dne(Zpi zpi, int n, int n2, int n3) {
        float f = 0.0625f;
        this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, f, 1.0f);
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    @Override
    public int method_9cb39123_Dne(Qnq qnq, int n, int n2, int n3) {
        return 0;
    }

    @Override
    public void method_8d285d4a_Dne(Qnq qnq, int n, int n2, int n3, sMa sMa2) {
        if (sMa2.field_203511c4_FWm == null && sMa2.field_37b45e5_Dne == null && !qnq.field_2d2a05_aFZ) {
            sMa2.method_7ed97a02_Qnq(1);
        }
    }
}

