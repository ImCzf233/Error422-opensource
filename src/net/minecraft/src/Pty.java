package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class Pty
extends zKP {
    @Override
    public int method_24763341_Dne(int n, Random random, int n2) {
        return dEr.field_dcb7db43_XwR.field_267cf5_Qnq;
    }

    public Pty(int n, KFd kFd) {
        super(n, kFd);
        this.method_82a88d64_Dne(JcN.field_368f2f7_Dne);
    }

    @Override
    public int method_3afb8a48_Dne(int n, Random random) {
        return geR.method_2c2cf7bc_Dne(this.method_cfc9daf9_Dne(random) + random.nextInt(n + 1), 1, 4);
    }

    @Override
    public int method_cfc9daf9_Dne(Random random) {
        return 2 + random.nextInt(3);
    }
}

