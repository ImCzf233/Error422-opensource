package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class eSp
extends Pdb {
    private int field_2e5f1b_bzF;
    private final QGu field_36bbd2d_Dne;
    private int field_267cf5_Qnq;
    private int field_21260d_FWm;
    private TpA field_36dade7_Dne;

    @Override
    public void method_7a46289a_Dne() {
        super.method_7a46289a_Dne();
    }

    @Override
    public void method_b1d7af9a_Dne(mXX mXX2) {
        super.method_b1d7af9a_Dne(mXX2);
        mXX2.method_6211b979_Dne(this, 0, this.field_21260d_FWm);
        mXX2.method_6211b979_Dne(this, 1, this.field_2e5f1b_bzF);
        mXX2.method_6211b979_Dne(this, 2, this.field_267cf5_Qnq);
    }

    @Override
    public boolean method_703284a7_Dne(FiG fiG) {
        return this.field_36dade7_Dne.method_703284a7_Dne(fiG);
    }

    public TpA method_23073c46_Dne() {
        return this.field_36dade7_Dne;
    }

    @Override
    public NMq method_8936db9f_Dne(FiG fiG, int n) {
        NMq nMq = null;
        onZ onZ2 = (onZ)this.field_7eb83e1f_bzF.get(n);
        if (onZ2 != null && onZ2.method_7a46289e_Dne()) {
            NMq nMq2 = onZ2.method_23040479_Dne();
            nMq = nMq2.method_23040479_Dne();
            if (n == 0) {
                if (!this.method_7bdfbb43_Dne(nMq2, 1, 37, true)) {
                    return null;
                }
                onZ2.method_a981fd7a_Dne(nMq2, nMq);
            } else if (!this.field_36bbd2d_Dne.method_7a46289e_Dne() && this.field_36bbd2d_Dne.method_7c61cf19_Dne(nMq2) && nMq2.field_2092ae_Dne == 1 ? !this.method_7bdfbb43_Dne(nMq2, 0, 1, false) : (n >= 1 && n < 28 ? !this.method_7bdfbb43_Dne(nMq2, 28, 37, false) : (n >= 28 && n < 37 ? !this.method_7bdfbb43_Dne(nMq2, 1, 28, false) : !this.method_7bdfbb43_Dne(nMq2, 1, 37, false)))) {
                return null;
            }
            if (nMq2.field_2092ae_Dne == 0) {
                onZ2.method_7c61cf15_Dne(null);
            } else {
                onZ2.method_7a46289a_Dne();
            }
            if (nMq2.field_2092ae_Dne == nMq.field_2092ae_Dne) {
                return null;
            }
            onZ2.method_672a90ac_Dne(fiG, nMq2);
        }
        return nMq;
    }

    public eSp(MOS mOS, TpA tpA) {
        int n;
        this.field_36dade7_Dne = tpA;
        this.field_36bbd2d_Dne = new QGu(this, tpA, 0, 136, 110);
        this.method_ec04ae2_Dne(this.field_36bbd2d_Dne);
        int n2 = 36;
        int n3 = 137;
        for (n = 0; n < 3; ++n) {
            for (int i = 0; i < 9; ++i) {
                this.method_ec04ae2_Dne(new onZ(mOS, i + n * 9 + 9, n2 + i * 18, n3 + n * 18));
            }
        }
        for (n = 0; n < 9; ++n) {
            this.method_ec04ae2_Dne(new onZ(mOS, n, n2 + n * 18, 58 + n3));
        }
        this.field_21260d_FWm = tpA.method_ae128dba_bzF();
        this.field_2e5f1b_bzF = tpA.method_7a46288d_Dne();
        this.field_267cf5_Qnq = tpA.method_7c6f602c_FWm();
    }

    @Override
    public void method_16cca7a_Dne(int n, int n2) {
        if (n == 0) {
            this.field_36dade7_Dne.method_ce7f5da9_Dne(n2);
        }
        if (n == 1) {
            this.field_36dade7_Dne.method_117d19ea_FWm(n2);
        }
        if (n == 2) {
            this.field_36dade7_Dne.method_143f9e1c_bzF(n2);
        }
    }
}

