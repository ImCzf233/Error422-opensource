package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class ckY
extends zKP {
    public ckY(int n) {
        super(n, KFd.field_712c8169_aFZ);
        this.method_82a88d64_Dne(JcN.field_368f2f7_Dne);
    }

    @Override
    public int method_ce7f5d9c_Dne(int n) {
        return this.field_21260d_FWm == zKP.field_1f135bb1_qLR.field_21260d_FWm ? 4 : 0;
    }

    @Override
    public void method_86296256_Dne(Qnq qnq, int n, int n2, int n3, int n4, float f, int n5) {
        super.method_86296256_Dne(qnq, n, n2, n3, n4, f, n5);
        if (this.method_24763341_Dne(n4, qnq.field_7331eae7_Dne, n5) != this.field_21260d_FWm) {
            int n6 = 0;
            if (this.field_21260d_FWm == zKP.field_a22e9c55_kGO.field_21260d_FWm) {
                n6 = geR.method_4cd91d9_Dne(qnq.field_7331eae7_Dne, 0, 2);
            } else if (this.field_21260d_FWm == zKP.field_5fd56c22_ZgS.field_21260d_FWm) {
                n6 = geR.method_4cd91d9_Dne(qnq.field_7331eae7_Dne, 3, 7);
            } else if (this.field_21260d_FWm == zKP.field_152fb3d4_ghu.field_21260d_FWm) {
                n6 = geR.method_4cd91d9_Dne(qnq.field_7331eae7_Dne, 3, 7);
            } else if (this.field_21260d_FWm == zKP.field_1f135bb1_qLR.field_21260d_FWm) {
                n6 = geR.method_4cd91d9_Dne(qnq.field_7331eae7_Dne, 2, 5);
            } else if (this.field_21260d_FWm == zKP.field_66394b98_NEG.field_21260d_FWm) {
                n6 = geR.method_4cd91d9_Dne(qnq.field_7331eae7_Dne, 2, 5);
            }
            this.method_b807bb2c_Qnq(qnq, n, n2, n3, n6);
        }
    }

    @Override
    public int method_cfc9daf9_Dne(Random random) {
        return this.field_21260d_FWm == zKP.field_1f135bb1_qLR.field_21260d_FWm ? 4 + random.nextInt(5) : 1;
    }

    @Override
    public int method_3afb8a48_Dne(int n, Random random) {
        if (n > 0 && this.field_21260d_FWm != this.method_24763341_Dne(0, random, n)) {
            int n2 = random.nextInt(n + 2) - 1;
            if (n2 < 0) {
                n2 = 0;
            }
            return this.method_cfc9daf9_Dne(random) * (n2 + 1);
        }
        return this.method_cfc9daf9_Dne(random);
    }

    @Override
    public int method_24763341_Dne(int n, Random random, int n2) {
        return this.field_21260d_FWm == zKP.field_a22e9c55_kGO.field_21260d_FWm ? dEr.field_16278184_DyG.field_267cf5_Qnq : (this.field_21260d_FWm == zKP.field_5fd56c22_ZgS.field_21260d_FWm ? dEr.field_141d2e85_div.field_267cf5_Qnq : (this.field_21260d_FWm == zKP.field_1f135bb1_qLR.field_21260d_FWm ? dEr.field_5d50330c_edi.field_267cf5_Qnq : (this.field_21260d_FWm == zKP.field_152fb3d4_ghu.field_21260d_FWm ? dEr.field_86ecf659_Kvh.field_267cf5_Qnq : (this.field_21260d_FWm == zKP.field_66394b98_NEG.field_21260d_FWm ? dEr.field_fd198bbb_RMv.field_267cf5_Qnq : this.field_21260d_FWm))));
    }
}

