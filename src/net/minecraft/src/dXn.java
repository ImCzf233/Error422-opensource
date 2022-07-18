package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class dXn
extends ljW {
    private gDn[] field_836bfe96_Dne = new gDn[2];

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    public void method_5452795d_bzF(Qnq qnq, int n, int n2, int n3) {
        if (!qnq.field_3690d00_Dne.field_21261e_FWm) {
            int n4 = qnq.method_2dee76f_bzF(n, n2, n3);
            int n5 = qnq.method_f476b68e_FWm(udO.field_37c82cc_Dne, n, n2, n3) - qnq.field_2092ae_Dne;
            float f = qnq.method_143f92c9_bzF(1.0f);
            f = f < (float)Math.PI ? (f += (0.0f - f) * 0.2f) : (f += ((float)Math.PI * 2 - f) * 0.2f);
            n5 = Math.round((float)n5 * geR.method_117d0e97_FWm(f));
            if (n5 < 0) {
                n5 = 0;
            }
            if (n5 > 15) {
                n5 = 15;
            }
            if (n4 != n5) {
                qnq.method_d4dc89ed_Dne(n, n2, n3, n5, 3);
            }
        }
    }

    @Override
    public void method_ca828a1c_Dne(Qnq qnq, int n, int n2, int n3, Random random) {
    }

    @Override
    public boolean method_ae128dcb_bzF() {
        return true;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        return n == 1 ? this.field_836bfe96_Dne[0] : this.field_836bfe96_Dne[1];
    }

    @Override
    public ipD method_c35d5be7_Dne(Qnq qnq) {
        return new vmD();
    }

    @Override
    public int method_79d378e7_Dne(Zpi zpi, int n, int n2, int n3, int n4) {
        return zpi.method_2dee76f_bzF(n, n2, n3);
    }

    public dXn(int n) {
        super(n, KFd.field_5e526bea_Qnq);
        this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 0.375f, 1.0f);
        this.method_82a88d64_Dne(JcN.field_75b0c0e4_bzF);
    }

    @Override
    public void method_9cb39130_Dne(Qnq qnq, int n, int n2, int n3) {
    }

    @Override
    public void method_f9bf07d3_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_836bfe96_Dne[0] = rbp.method_285881e4_Dne("daylightDetector_top");
        this.field_836bfe96_Dne[1] = rbp.method_285881e4_Dne("daylightDetector_side");
    }

    @Override
    public void method_fbabf7ef_Dne(Zpi zpi, int n, int n2, int n3) {
        this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 0.375f, 1.0f);
    }
}

