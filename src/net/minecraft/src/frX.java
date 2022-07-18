package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class frX
extends tkL {
    private final dNT field_3747682_Dne;
    private final dNT field_202e4261_FWm;
    private final boolean field_2e5f2c_bzF;

    @Override
    public int method_ce7f5d9c_Dne(int n) {
        return n;
    }

    public frX(int n, dNT dNT2, dNT dNT3, boolean bl) {
        super(n);
        this.field_3747682_Dne = dNT2;
        this.field_202e4261_FWm = dNT3;
        this.field_2e5f2c_bzF = bl;
        this.method_77cbb00a_FWm(0);
        this.method_21c1eb9a_Dne(true);
    }

    private boolean method_12bc5929_Dne(NMq nMq, FiG fiG, Qnq qnq, int n, int n2, int n3, int n4) {
        if (n4 == 0) {
            --n2;
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
        int n5 = qnq.method_2c2cf7bc_Dne(n, n2, n3);
        int n6 = qnq.method_2dee76f_bzF(n, n2, n3);
        int n7 = n6 & 7;
        if (n5 == this.field_3747682_Dne.field_21260d_FWm && n7 == nMq.method_907a9d14_Qnq()) {
            if (qnq.method_9ed6d42c_Dne(this.field_202e4261_FWm.method_8c85fe2_Dne(qnq, n, n2, n3)) && qnq.method_17d7ea9d_FWm(n, n2, n3, this.field_202e4261_FWm.field_21260d_FWm, n7, 3)) {
                qnq.method_c961c6ee_Dne((float)n + 0.5f, (float)n2 + 0.5f, (float)n3 + 0.5f, this.field_202e4261_FWm.field_a21c1bc0_kGO.method_d1f1ed87_FWm(), (this.field_202e4261_FWm.field_a21c1bc0_kGO.method_7a46288a_Dne() + 1.0f) / 2.0f, this.field_202e4261_FWm.field_a21c1bc0_kGO.method_7c6f6029_FWm() * 0.8f);
                --nMq.field_2092ae_Dne;
            }
            return true;
        }
        return false;
    }

    @Override
    public gDn method_9e795529_Dne(int n) {
        return zKP.field_8374b848_Dne[this.field_267cf5_Qnq].method_9051f17a_Dne(2, n);
    }

    @Override
    public String method_10c7922b_Dne(NMq nMq) {
        return this.field_3747682_Dne.method_2c0e7e17_Dne(nMq.method_907a9d14_Qnq());
    }

    @Override
    public boolean method_4f447ca9_Dne(Qnq qnq, int n, int n2, int n3, int n4, FiG fiG, NMq nMq) {
        boolean bl;
        int n5 = n;
        int n6 = n2;
        int n7 = n3;
        int n8 = qnq.method_2c2cf7bc_Dne(n, n2, n3);
        int n9 = qnq.method_2dee76f_bzF(n, n2, n3);
        int n10 = n9 & 7;
        boolean bl2 = bl = (n9 & 8) != 0;
        if ((n4 == 1 && !bl || n4 == 0 && bl) && n8 == this.field_3747682_Dne.field_21260d_FWm && n10 == nMq.method_907a9d14_Qnq()) {
            return true;
        }
        if (n4 == 0) {
            --n2;
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
        n8 = qnq.method_2c2cf7bc_Dne(n, n2, n3);
        n9 = qnq.method_2dee76f_bzF(n, n2, n3);
        n10 = n9 & 7;
        bl = (n9 & 8) != 0;
        return n8 == this.field_3747682_Dne.field_21260d_FWm && n10 == nMq.method_907a9d14_Qnq() ? true : super.method_4f447ca9_Dne(qnq, n5, n6, n7, n4, fiG, nMq);
    }

    @Override
    public boolean method_4ddc487f_Dne(NMq nMq, FiG fiG, Qnq qnq, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        boolean bl;
        if (this.field_2e5f2c_bzF) {
            return super.method_4ddc487f_Dne(nMq, fiG, qnq, n, n2, n3, n4, f, f2, f3);
        }
        if (nMq.field_2092ae_Dne == 0) {
            return false;
        }
        if (!fiG.method_7bcedb59_Dne(n, n2, n3, n4, nMq)) {
            return false;
        }
        int n5 = qnq.method_2c2cf7bc_Dne(n, n2, n3);
        int n6 = qnq.method_2dee76f_bzF(n, n2, n3);
        int n7 = n6 & 7;
        boolean bl2 = bl = (n6 & 8) != 0;
        if ((n4 == 1 && !bl || n4 == 0 && bl) && n5 == this.field_3747682_Dne.field_21260d_FWm && n7 == nMq.method_907a9d14_Qnq()) {
            if (qnq.method_9ed6d42c_Dne(this.field_202e4261_FWm.method_8c85fe2_Dne(qnq, n, n2, n3)) && qnq.method_17d7ea9d_FWm(n, n2, n3, this.field_202e4261_FWm.field_21260d_FWm, n7, 3)) {
                qnq.method_c961c6ee_Dne((float)n + 0.5f, (float)n2 + 0.5f, (float)n3 + 0.5f, this.field_202e4261_FWm.field_a21c1bc0_kGO.method_d1f1ed87_FWm(), (this.field_202e4261_FWm.field_a21c1bc0_kGO.method_7a46288a_Dne() + 1.0f) / 2.0f, this.field_202e4261_FWm.field_a21c1bc0_kGO.method_7c6f6029_FWm() * 0.8f);
                --nMq.field_2092ae_Dne;
            }
            return true;
        }
        return this.method_12bc5929_Dne(nMq, fiG, qnq, n, n2, n3, n4) ? true : super.method_4ddc487f_Dne(nMq, fiG, qnq, n, n2, n3, n4, f, f2, f3);
    }
}

