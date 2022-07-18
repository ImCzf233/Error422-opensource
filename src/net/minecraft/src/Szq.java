package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
class Szq
extends Thread {
    final /* synthetic */ FqX field_367573f_Dne;

    @Override
    public void run() {
        int n = geR.method_117d0718_FWm(qxi_0.field_36b4fb5_Dne.field_2f0dd3_div + 18.0);
        int n2 = geR.method_117d0718_FWm(qxi_0.field_36b4fb5_Dne.field_22c5fd_IjH + 10.0);
        int n3 = geR.method_117d0718_FWm(qxi_0.field_36b4fb5_Dne.field_334487_mrb + 18.0);
        int n4 = zKP.field_af0f1368_udO.field_21260d_FWm;
        int n5 = 36;
        int n6 = 20;
        int n7 = -1;
        if (eCD.method_ce7f5d9c_Dne(8) == 0) {
            n7 = 1;
        } else if (eCD.method_ce7f5d9c_Dne(8) == 0) {
            n7 = 2;
        }
        for (int i = 0; i < n5; ++i) {
            for (int j = 0; j < n5; ++j) {
                block6: for (int k = 0; k < n6; ++k) {
                    if (qxi_0.field_36c164d_Dne.method_2c2cf7bc_Dne(n, n2 - k, n3) == zKP.field_32988693_trS.field_21260d_FWm && eCD.method_ce7f5d9c_Dne(3) == 0) {
                        qxi_0.field_36c164d_Dne.method_2ee8c47d_FWm(n, n2 - k, n3, 0);
                        qxi_0.field_36c164d_Dne.method_c961c6ee_Dne(n, n2, n3, "random.glass", 1.0f, 1.0f);
                    }
                    switch (n7) {
                        case 1: {
                            if (qxi_0.field_36c164d_Dne.method_2c2cf7bc_Dne(n, n2 - k, n3) != zKP.field_374330f_Dne.field_21260d_FWm && qxi_0.field_36c164d_Dne.method_2c2cf7bc_Dne(n, n2 - k, n3) != zKP.field_16319416_DyG.field_21260d_FWm) continue block6;
                            qxi_0.field_36c164d_Dne.method_2ee8c47d_FWm(n, n2 - k, n3, zKP.field_14274117_div.field_21260d_FWm);
                            qxi_0.field_36c164d_Dne.method_c961c6ee_Dne(n, n2, n3, "step.stone", 1.0f, 1.0f);
                            continue block6;
                        }
                        case 2: {
                            if (qxi_0.field_36c164d_Dne.method_2c2cf7bc_Dne(n, n2 - k + 1, n3) != 0 || qxi_0.field_36c164d_Dne.method_2c2cf7bc_Dne(n, n2 - k, n3) == 0 || eCD.method_ce7f5d9c_Dne(10) != 0) continue block6;
                            qxi_0.field_36c164d_Dne.method_2ee8c47d_FWm(n, n2 - k + 1, n3, zKP.field_3774324_Dne.field_21260d_FWm);
                        }
                    }
                }
                --n;
            }
            n += n5;
            --n3;
        }
    }

    Szq(FqX fqX) {
        this.field_367573f_Dne = fqX;
    }
}

