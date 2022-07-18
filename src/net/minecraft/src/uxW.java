package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class uxW
extends Pdb {
    private int field_2e5f1b_bzF;
    private int field_267cf5_Qnq;
    public MqS field_36a853d_Dne;
    private int field_21260d_FWm;
    public Uqm field_36e2b5b_Dne = new Uqm(this, 3, 3);
    private Qnq field_36c4f18_Dne;

    @Override
    public void method_703284a3_Dne(FiG fiG) {
        super.method_703284a3_Dne(fiG);
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            for (int i = 0; i < 9; ++i) {
                NMq nMq = this.field_36e2b5b_Dne.method_77c1cdc9_FWm(i);
                if (nMq == null) continue;
                fiG.method_c9a088b8_Dne(nMq);
            }
        }
    }

    @Override
    public NMq method_8936db9f_Dne(FiG fiG, int n) {
        NMq nMq = null;
        onZ onZ2 = (onZ)this.field_7eb83e1f_bzF.get(n);
        if (onZ2 != null && onZ2.method_7a46289e_Dne()) {
            NMq nMq2 = onZ2.method_23040479_Dne();
            nMq = nMq2.method_23040479_Dne();
            if (n == 0) {
                if (!this.method_7bdfbb43_Dne(nMq2, 10, 46, true)) {
                    return null;
                }
                onZ2.method_a981fd7a_Dne(nMq2, nMq);
            } else if (n >= 10 && n < 37 ? !this.method_7bdfbb43_Dne(nMq2, 37, 46, false) : (n >= 37 && n < 46 ? !this.method_7bdfbb43_Dne(nMq2, 10, 37, false) : !this.method_7bdfbb43_Dne(nMq2, 10, 46, false))) {
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

    @Override
    public boolean method_703284a7_Dne(FiG fiG) {
        return this.field_36c4f18_Dne.method_2c2cf7bc_Dne(this.field_21260d_FWm, this.field_2e5f1b_bzF, this.field_267cf5_Qnq) != zKP.field_47237a3_mlD.field_21260d_FWm ? false : fiG.method_2be42992_Dne((double)this.field_21260d_FWm + 0.5, (double)this.field_2e5f1b_bzF + 0.5, (double)this.field_267cf5_Qnq + 0.5) <= 64.0;
    }

    @Override
    public void method_7c9aa178_Dne(MqS mqS) {
        this.field_36a853d_Dne.method_6e3a6b66_Dne(0, aXt.method_230cd12e_Dne().method_6c5d33f6_Dne(this.field_36e2b5b_Dne, this.field_36c4f18_Dne));
    }

    @Override
    public boolean method_e3987d15_Dne(NMq nMq, onZ onZ2) {
        return onZ2.field_36a853d_Dne != this.field_36a853d_Dne && super.method_e3987d15_Dne(nMq, onZ2);
    }

    public uxW(MOS mOS, Qnq qnq, int n, int n2, int n3) {
        int n4;
        int n5;
        this.field_36a853d_Dne = new HuD();
        this.field_36c4f18_Dne = qnq;
        this.field_21260d_FWm = n;
        this.field_2e5f1b_bzF = n2;
        this.field_267cf5_Qnq = n3;
        this.method_ec04ae2_Dne(new wEm(mOS.field_3673728_Dne, this.field_36e2b5b_Dne, this.field_36a853d_Dne, 0, 124, 35));
        for (n5 = 0; n5 < 3; ++n5) {
            for (n4 = 0; n4 < 3; ++n4) {
                this.method_ec04ae2_Dne(new onZ(this.field_36e2b5b_Dne, n4 + n5 * 3, 30 + n4 * 18, 17 + n5 * 18));
            }
        }
        for (n5 = 0; n5 < 3; ++n5) {
            for (n4 = 0; n4 < 9; ++n4) {
                this.method_ec04ae2_Dne(new onZ(mOS, n4 + n5 * 9 + 9, 8 + n4 * 18, 84 + n5 * 18));
            }
        }
        for (n5 = 0; n5 < 9; ++n5) {
            this.method_ec04ae2_Dne(new onZ(mOS, n5, 8 + n5 * 18, 142));
        }
        this.method_7c9aa178_Dne(this.field_36e2b5b_Dne);
    }
}

