package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class bdU
extends hbe {
    @Override
    public void method_e061540a_Dne(Qnq qnq, FiG fiG, int n, int n2, int n3, int n4) {
        if (!qnq.field_2d2a05_aFZ && fiG.method_22900b26_bzF() != null && fiG.method_22900b26_bzF().field_2e5f1b_bzF == dEr.field_37078f6_Dne.field_267cf5_Qnq) {
            fiG.method_df3461c5_Dne(trP.field_83628b9e_Dne[this.field_21260d_FWm], 1);
            this.method_c594b700_FWm(qnq, n, n2, n3, new NMq(zKP.field_373e079_Dne, 1, n4));
        } else {
            super.method_e061540a_Dne(qnq, fiG, n, n2, n3, n4);
        }
    }

    protected bdU(int n) {
        super(n, KFd.field_6162b14b_Zpi);
        float f = 0.4f;
        this.method_eb14b51a_Dne(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, 0.8f, 0.5f + f);
    }

    @Override
    public int method_24763341_Dne(int n, Random random, int n2) {
        return -1;
    }

    @Override
    protected boolean method_ce7f5dad_Dne(int n) {
        return true;
    }
}

