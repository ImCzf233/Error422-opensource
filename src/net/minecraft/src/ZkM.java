package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class ZkM
extends gwq {
    private int field_2092ae_Dne;

    public ZkM(int n) {
        this.field_2092ae_Dne = n;
    }

    @Override
    public boolean method_c3e4cb88_Dne(Qnq qnq, Random random, int n, int n2, int n3) {
        if (qnq.method_2c2cf7bc_Dne(n, n2 + 1, n3) != zKP.field_37e6aed_Dne.field_21260d_FWm) {
            return false;
        }
        if (qnq.method_2c2cf7bc_Dne(n, n2 - 1, n3) != zKP.field_37e6aed_Dne.field_21260d_FWm) {
            return false;
        }
        if (qnq.method_2c2cf7bc_Dne(n, n2, n3) != 0 && qnq.method_2c2cf7bc_Dne(n, n2, n3) != zKP.field_37e6aed_Dne.field_21260d_FWm) {
            return false;
        }
        int n4 = 0;
        if (qnq.method_2c2cf7bc_Dne(n - 1, n2, n3) == zKP.field_37e6aed_Dne.field_21260d_FWm) {
            ++n4;
        }
        if (qnq.method_2c2cf7bc_Dne(n + 1, n2, n3) == zKP.field_37e6aed_Dne.field_21260d_FWm) {
            ++n4;
        }
        if (qnq.method_2c2cf7bc_Dne(n, n2, n3 - 1) == zKP.field_37e6aed_Dne.field_21260d_FWm) {
            ++n4;
        }
        if (qnq.method_2c2cf7bc_Dne(n, n2, n3 + 1) == zKP.field_37e6aed_Dne.field_21260d_FWm) {
            ++n4;
        }
        int n5 = 0;
        if (qnq.method_2c2cf7cd_Dne(n - 1, n2, n3)) {
            ++n5;
        }
        if (qnq.method_2c2cf7cd_Dne(n + 1, n2, n3)) {
            ++n5;
        }
        if (qnq.method_2c2cf7cd_Dne(n, n2, n3 - 1)) {
            ++n5;
        }
        if (qnq.method_2c2cf7cd_Dne(n, n2, n3 + 1)) {
            ++n5;
        }
        if (n4 == 3 && n5 == 1) {
            qnq.method_17d7ea9d_FWm(n, n2, n3, this.field_2092ae_Dne, 0, 2);
            qnq.field_2092bf_Dne = true;
            zKP.field_8374b848_Dne[this.field_2092ae_Dne].method_ca828a1c_Dne(qnq, n, n2, n3, random);
            qnq.field_2092bf_Dne = false;
        }
        return true;
    }
}

