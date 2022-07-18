package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class hnQ
extends dEr {
    private static final String[] field_1e416769_FWm = new String[]{"skeleton", "wither", "zombie", "char", "creeper"};
    private gDn[] field_836bfe96_Dne;
    public static final String[] field_f5e54dca_Dne = new String[]{"skull_skeleton", "skull_wither", "skull_zombie", "skull_char", "skull_creeper"};

    @Override
    public int method_ce7f5d9c_Dne(int n) {
        return n;
    }

    @Override
    public void method_d88f4bf4_Dne(int n, JcN jcN, List list) {
        for (int i = 0; i < field_1e416769_FWm.length; ++i) {
            list.add(new NMq(n, 1, i));
        }
    }

    @Override
    public boolean method_4ddc487f_Dne(NMq nMq, FiG fiG, Qnq qnq, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        ipD ipD2;
        if (n4 == 0) {
            return false;
        }
        if (!qnq.method_d9802b31_Dne(n, n2, n3).method_7a46289e_Dne()) {
            return false;
        }
        if (n4 == 1) {
            ++n2;
        }
        if (n4 == 2) {
            --n3;
        }
        if (n4 == 3) {
            ++n3;
        }
        if (n4 == 4) {
            --n;
        }
        if (n4 == 5) {
            ++n;
        }
        if (!fiG.method_7bcedb59_Dne(n, n2, n3, n4, nMq)) {
            return false;
        }
        if (!zKP.field_e40f36ac_mfU.method_9cb39134_Dne(qnq, n, n2, n3)) {
            return false;
        }
        qnq.method_17d7ea9d_FWm(n, n2, n3, zKP.field_e40f36ac_mfU.field_21260d_FWm, n4, 2);
        int n5 = 0;
        if (n4 == 1) {
            n5 = geR.method_117d0718_FWm((double)(fiG.field_334489_mrb * 16.0f / 360.0f) + 0.5) & 0xF;
        }
        if ((ipD2 = qnq.method_d98e681d_Dne(n, n2, n3)) != null && ipD2 instanceof CUf) {
            String string = "";
            if (nMq.method_a98a0664_aFZ() && nMq.method_230886fb_Dne().method_8f501fe8_Dne("SkullOwner")) {
                string = nMq.method_230886fb_Dne().method_39193c_Dne("SkullOwner");
            }
            ((CUf)ipD2).method_fa81cf33_Dne(nMq.method_907a9d14_Qnq(), string);
            ((CUf)ipD2).method_ce7f5da9_Dne(n5);
            ((jHN)zKP.field_e40f36ac_mfU).method_3bb2c15d_Dne(qnq, n, n2, n3, (CUf)ipD2);
        }
        --nMq.field_2092ae_Dne;
        return true;
    }

    @Override
    public gDn method_9e795529_Dne(int n) {
        if (n < 0 || n >= field_1e416769_FWm.length) {
            n = 0;
        }
        return this.field_836bfe96_Dne[n];
    }

    @Override
    public String method_6194d772_Qnq(NMq nMq) {
        return nMq.method_907a9d14_Qnq() == 3 && nMq.method_a98a0664_aFZ() && nMq.method_230886fb_Dne().method_8f501fe8_Dne("SkullOwner") ? KGL.method_98148f73_Dne("item.skull.player.name", nMq.method_230886fb_Dne().method_39193c_Dne("SkullOwner")) : super.method_6194d772_Qnq(nMq);
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_836bfe96_Dne = new gDn[field_f5e54dca_Dne.length];
        for (int i = 0; i < field_f5e54dca_Dne.length; ++i) {
            this.field_836bfe96_Dne[i] = rbp.method_285881e4_Dne(field_f5e54dca_Dne[i]);
        }
    }

    @Override
    public String method_10c7922b_Dne(NMq nMq) {
        int n = nMq.method_907a9d14_Qnq();
        if (n < 0 || n >= field_1e416769_FWm.length) {
            n = 0;
        }
        return super.method_d1f1ed87_FWm() + "." + field_1e416769_FWm[n];
    }

    public hnQ(int n) {
        super(n);
        this.method_829e7ad2_Dne(JcN.field_2022bed6_FWm);
        this.method_77cbb00a_FWm(0);
        this.method_21c1eb9a_Dne(true);
    }
}

