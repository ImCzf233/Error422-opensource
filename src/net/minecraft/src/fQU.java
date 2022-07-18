package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class fQU
extends ljW {
    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    public int method_9cb39123_Dne(Qnq qnq, int n, int n2, int n3) {
        return 0;
    }

    @Override
    public ipD method_c35d5be7_Dne(Qnq qnq) {
        return new ySb();
    }

    protected fQU(int n) {
        super(n, KFd.field_712c8169_aFZ);
    }

    @Override
    public int method_cfc9daf9_Dne(Random random) {
        return 0;
    }

    @Override
    public void method_86296256_Dne(Qnq qnq, int n, int n2, int n3, int n4, float f, int n5) {
        super.method_86296256_Dne(qnq, n, n2, n3, n4, f, n5);
        int n6 = 15 + qnq.field_7331eae7_Dne.nextInt(15) + qnq.field_7331eae7_Dne.nextInt(15);
        this.method_b807bb2c_Qnq(qnq, n, n2, n3, n6);
    }

    @Override
    public int method_24763341_Dne(int n, Random random, int n2) {
        return 0;
    }
}

