package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class ErH
extends zKP {
    @Override
    public void method_ca828a1c_Dne(Qnq qnq, int n, int n2, int n3, Random random) {
        if (qnq.method_f476b68e_FWm(udO.field_20364eab_FWm, n, n2, n3) > 11) {
            this.method_fd7de26f_FWm(qnq, n, n2, n3, qnq.method_2dee76f_bzF(n, n2, n3), 0);
            qnq.method_2e7161e6_Qnq(n, n2, n3);
        }
    }

    @Override
    public int method_24763341_Dne(int n, Random random, int n2) {
        return dEr.field_4817800a_iNQ.field_267cf5_Qnq;
    }

    protected ErH(int n) {
        super(n, KFd.field_d2a9ced2_oIf);
        this.method_21cbfe2c_Dne(true);
        this.method_82a88d64_Dne(JcN.field_368f2f7_Dne);
    }

    @Override
    public int method_cfc9daf9_Dne(Random random) {
        return 4;
    }
}

