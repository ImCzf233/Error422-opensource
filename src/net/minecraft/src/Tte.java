package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class Tte
extends hbe {
    private static final String[] field_f5e54dca_Dne = new String[]{"deadbush", "tallgrass", "fern"};
    private gDn[] field_836bfe96_Dne;

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        if (n2 >= this.field_836bfe96_Dne.length) {
            n2 = 0;
        }
        return this.field_836bfe96_Dne[n2];
    }

    @Override
    public int method_3036b9c2_FWm(Qnq qnq, int n, int n2, int n3) {
        return qnq.method_2dee76f_bzF(n, n2, n3);
    }

    @Override
    public int method_117d19dd_FWm(int n) {
        return n == 0 ? 0xFFFFFF : QFY.method_ae128dba_bzF();
    }

    @Override
    public int method_3afb8a48_Dne(int n, Random random) {
        return 1 + random.nextInt(n * 2 + 1);
    }

    @Override
    public void method_e061540a_Dne(Qnq qnq, FiG fiG, int n, int n2, int n3, int n4) {
        if (!qnq.field_2d2a05_aFZ && fiG.method_22900b26_bzF() != null && fiG.method_22900b26_bzF().field_2e5f1b_bzF == dEr.field_37078f6_Dne.field_267cf5_Qnq) {
            fiG.method_df3461c5_Dne(trP.field_83628b9e_Dne[this.field_21260d_FWm], 1);
            this.method_c594b700_FWm(qnq, n, n2, n3, new NMq(zKP.field_36dc147_Dne, 1, n4));
        } else {
            super.method_e061540a_Dne(qnq, fiG, n, n2, n3, n4);
        }
    }

    @Override
    public int method_24763341_Dne(int n, Random random, int n2) {
        return random.nextInt(8) == 0 ? dEr.field_4682511_mlD.field_267cf5_Qnq : -1;
    }

    @Override
    public void method_d88f4bf4_Dne(int n, JcN jcN, List list) {
        for (int i = 1; i < 3; ++i) {
            list.add(new NMq(n, 1, i));
        }
    }

    @Override
    public int method_590ca0b_b_() {
        double d = 0.5;
        double d2 = 1.0;
        return bzF.method_16a71cd_Dne(d, d2);
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_836bfe96_Dne = new gDn[field_f5e54dca_Dne.length];
        for (int i = 0; i < this.field_836bfe96_Dne.length; ++i) {
            this.field_836bfe96_Dne[i] = rbp.method_285881e4_Dne(field_f5e54dca_Dne[i]);
        }
    }

    protected Tte(int n) {
        super(n, KFd.field_6162b14b_Zpi);
        float f = 0.4f;
        this.method_eb14b51a_Dne(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, 0.8f, 0.5f + f);
    }

    @Override
    public int method_fbabf7e2_Dne(Zpi zpi, int n, int n2, int n3) {
        int n4 = zpi.method_2dee76f_bzF(n, n2, n3);
        return n4 == 0 ? 0xFFFFFF : zpi.method_90477c37_Dne(n, n3).method_ae128dba_bzF();
    }
}

