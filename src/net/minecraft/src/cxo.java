package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class cxo
extends Oaf {
    private gDn[] field_836bfe96_Dne;

    @Override
    public int method_f9bf07c6_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        if ((qnq.method_2dee76f_bzF(n, n2, n3) & 8) > 0) {
            float f = 0.125f;
            List list = qnq.method_e7d4af05_Dne(Ebp.class, bSp.method_23186cf1_Dne().method_b4ea3e0c_Dne((float)n + f, n2, (float)n3 + f, (float)(n + 1) - f, (float)(n2 + 1) - f, (float)(n3 + 1) - f), pUe.field_2033d32b_FWm);
            if (list.size() > 0) {
                return Pdb.method_7c9aa16b_Dne((MqS)list.get(0));
            }
        }
        return 0;
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_836bfe96_Dne = new gDn[2];
        this.field_836bfe96_Dne[0] = rbp.method_285881e4_Dne("detectorRail");
        this.field_836bfe96_Dne[1] = rbp.method_285881e4_Dne("detectorRail_on");
    }

    @Override
    public void method_9cb39130_Dne(Qnq qnq, int n, int n2, int n3) {
        super.method_9cb39130_Dne(qnq, n, n2, n3);
        this.method_d6a0f314_FWm(qnq, n, n2, n3, qnq.method_2dee76f_bzF(n, n2, n3));
    }

    @Override
    public void method_8d285d4a_Dne(Qnq qnq, int n, int n2, int n3, sMa sMa2) {
        int n4;
        if (!qnq.field_2d2a05_aFZ && ((n4 = qnq.method_2dee76f_bzF(n, n2, n3)) & 8) == 0) {
            this.method_d6a0f314_FWm(qnq, n, n2, n3, n4);
        }
    }

    @Override
    public boolean method_582b29b_a_() {
        return true;
    }

    @Override
    public int method_79d378e7_Dne(Zpi zpi, int n, int n2, int n3, int n4) {
        return (zpi.method_2dee76f_bzF(n, n2, n3) & 8) != 0 ? 15 : 0;
    }

    @Override
    public int method_56b56428_FWm(Zpi zpi, int n, int n2, int n3, int n4) {
        return (zpi.method_2dee76f_bzF(n, n2, n3) & 8) == 0 ? 0 : (n4 == 1 ? 15 : 0);
    }

    @Override
    public void method_ca828a1c_Dne(Qnq qnq, int n, int n2, int n3, Random random) {
        int n4;
        if (!qnq.field_2d2a05_aFZ && ((n4 = qnq.method_2dee76f_bzF(n, n2, n3)) & 8) != 0) {
            this.method_d6a0f314_FWm(qnq, n, n2, n3, n4);
        }
    }

    private void method_d6a0f314_FWm(Qnq qnq, int n, int n2, int n3, int n4) {
        boolean bl = (n4 & 8) != 0;
        boolean bl2 = false;
        float f = 0.125f;
        List list = qnq.method_9314b7e8_Dne(Ebp.class, bSp.method_23186cf1_Dne().method_b4ea3e0c_Dne((float)n + f, n2, (float)n3 + f, (float)(n + 1) - f, (float)(n2 + 1) - f, (float)(n3 + 1) - f));
        if (!list.isEmpty()) {
            bl2 = true;
        }
        if (bl2 && !bl) {
            qnq.method_d4dc89ed_Dne(n, n2, n3, n4 | 8, 3);
            qnq.method_58fe7b07_bzF(n, n2, n3, this.field_21260d_FWm);
            qnq.method_58fe7b07_bzF(n, n2 - 1, n3, this.field_21260d_FWm);
            qnq.method_c6b5263a_Dne(n, n2, n3, n, n2, n3);
        }
        if (!bl2 && bl) {
            qnq.method_d4dc89ed_Dne(n, n2, n3, n4 & 7, 3);
            qnq.method_58fe7b07_bzF(n, n2, n3, this.field_21260d_FWm);
            qnq.method_58fe7b07_bzF(n, n2 - 1, n3, this.field_21260d_FWm);
            qnq.method_c6b5263a_Dne(n, n2, n3, n, n2, n3);
        }
        if (bl2) {
            qnq.method_ae303daa_FWm(n, n2, n3, this.field_21260d_FWm, this.method_83516086_Dne(qnq));
        }
        qnq.method_6465ff20_aFZ(n, n2, n3, this.field_21260d_FWm);
    }

    @Override
    public int method_83516086_Dne(Qnq qnq) {
        return 20;
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        return (n2 & 8) != 0 ? this.field_836bfe96_Dne[1] : this.field_836bfe96_Dne[0];
    }

    @Override
    public boolean method_ae128dcb_bzF() {
        return true;
    }

    public cxo(int n) {
        super(n, true);
        this.method_21cbfe2c_Dne(true);
    }
}

