package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class hIB
extends ljW {
    private gDn field_202f7d1a_FWm;
    private gDn field_375b13b_Dne;

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_5e5f2002_Qnq = rbp.method_285881e4_Dne("enchantment_side");
        this.field_375b13b_Dne = rbp.method_285881e4_Dne("enchantment_top");
        this.field_202f7d1a_FWm = rbp.method_285881e4_Dne("enchantment_bottom");
    }

    protected hIB(int n) {
        super(n, KFd.field_712c8169_aFZ);
        this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 0.75f, 1.0f);
        this.method_9e820edb_Dne(0);
        this.method_82a88d64_Dne(JcN.field_2022bed6_FWm);
    }

    @Override
    public boolean method_cb53d52e_Dne(Qnq qnq, int n, int n2, int n3, FiG fiG, int n4, float f, float f2, float f3) {
        if (qnq.field_2d2a05_aFZ) {
            return true;
        }
        llR llR2 = (llR)qnq.method_d98e681d_Dne(n, n2, n3);
        fiG.method_5b092153_Dne(n, n2, n3, llR2.method_7a46289e_Dne() ? llR2.method_eecad346_Dne() : null);
        return true;
    }

    @Override
    public void method_ff5e68fb_FWm(Qnq qnq, int n, int n2, int n3, Random random) {
        super.method_ff5e68fb_FWm(qnq, n, n2, n3, random);
        for (int i = n - 2; i <= n + 2; ++i) {
            block1: for (int j = n3 - 2; j <= n3 + 2; ++j) {
                if (i > n - 2 && i < n + 2 && j == n3 - 1) {
                    j = n3 + 2;
                }
                if (random.nextInt(16) != 0) continue;
                for (int k = n2; k <= n2 + 1; ++k) {
                    if (qnq.method_2c2cf7bc_Dne(i, k, j) != zKP.field_24a90a48_AgF.field_21260d_FWm) continue;
                    if (!qnq.method_2c2cf7cd_Dne((i - n) / 2 + n, k, (j - n3) / 2 + n3)) continue block1;
                    qnq.method_8600ec24_Dne("enchantmenttable", (double)n + 0.5, (double)n2 + 2.0, (double)n3 + 0.5, (double)((float)(i - n) + random.nextFloat()) - 0.5, (float)(k - n2) - random.nextFloat() - 1.0f, (double)((float)(j - n3) + random.nextFloat()) - 0.5);
                }
            }
        }
    }

    @Override
    public void method_ca7e4e57_Dne(Qnq qnq, int n, int n2, int n3, FUH fUH, NMq nMq) {
        super.method_ca7e4e57_Dne(qnq, n, n2, n3, fUH, nMq);
        if (nMq.method_d44b4596_zGp()) {
            ((llR)qnq.method_d98e681d_Dne(n, n2, n3)).method_8f501fe4_Dne(nMq.method_d1f1ed87_FWm());
        }
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        return n == 0 ? this.field_202f7d1a_FWm : (n == 1 ? this.field_375b13b_Dne : this.field_5e5f2002_Qnq);
    }

    @Override
    public ipD method_c35d5be7_Dne(Qnq qnq) {
        return new llR();
    }
}

