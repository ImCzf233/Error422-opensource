package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class ReE
extends Pdb {
    public boolean field_2092bf_Dne = false;
    private final FiG field_3673728_Dne;
    public Uqm field_36e2b5b_Dne = new Uqm(this, 2, 2);
    public MqS field_36a853d_Dne = new HuD();

    @Override
    public boolean method_703284a7_Dne(FiG fiG) {
        return true;
    }

    @Override
    public boolean method_e3987d15_Dne(NMq nMq, onZ onZ2) {
        return onZ2.field_36a853d_Dne != this.field_36a853d_Dne && super.method_e3987d15_Dne(nMq, onZ2);
    }

    public ReE(MOS mOS, boolean bl, FiG fiG) {
        int n;
        int n2;
        this.field_2092bf_Dne = bl;
        this.field_3673728_Dne = fiG;
        this.method_ec04ae2_Dne(new wEm(mOS.field_3673728_Dne, this.field_36e2b5b_Dne, this.field_36a853d_Dne, 0, 144, 36));
        for (n2 = 0; n2 < 2; ++n2) {
            for (n = 0; n < 2; ++n) {
                this.method_ec04ae2_Dne(new onZ(this.field_36e2b5b_Dne, n + n2 * 2, 88 + n * 18, 26 + n2 * 18));
            }
        }
        for (n2 = 0; n2 < 4; ++n2) {
            this.method_ec04ae2_Dne(new TFV(this, mOS, mOS.method_907a9d14_Qnq() - 1 - n2, 8, 8 + n2 * 18, n2));
        }
        for (n2 = 0; n2 < 3; ++n2) {
            for (n = 0; n < 9; ++n) {
                this.method_ec04ae2_Dne(new onZ(mOS, n + (n2 + 1) * 9, 8 + n * 18, 84 + n2 * 18));
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            this.method_ec04ae2_Dne(new onZ(mOS, n2, 8 + n2 * 18, 142));
        }
        this.method_7c9aa178_Dne(this.field_36e2b5b_Dne);
    }

    @Override
    public void method_703284a3_Dne(FiG fiG) {
        super.method_703284a3_Dne(fiG);
        for (int i = 0; i < 4; ++i) {
            NMq nMq = this.field_36e2b5b_Dne.method_77c1cdc9_FWm(i);
            if (nMq == null) continue;
            fiG.method_c9a088b8_Dne(nMq);
        }
        this.field_36a853d_Dne.method_6e3a6b66_Dne(0, null);
    }

    @Override
    public NMq method_8936db9f_Dne(FiG fiG, int n) {
        NMq nMq = null;
        onZ onZ2 = (onZ)this.field_7eb83e1f_bzF.get(n);
        if (onZ2 != null && onZ2.method_7a46289e_Dne()) {
            int n2;
            NMq nMq2 = onZ2.method_23040479_Dne();
            nMq = nMq2.method_23040479_Dne();
            if (n == 0) {
                if (!this.method_7bdfbb43_Dne(nMq2, 9, 45, true)) {
                    return null;
                }
                onZ2.method_a981fd7a_Dne(nMq2, nMq);
            } else if (n >= 1 && n < 5 ? !this.method_7bdfbb43_Dne(nMq2, 9, 45, false) : (n >= 5 && n < 9 ? !this.method_7bdfbb43_Dne(nMq2, 9, 45, false) : (nMq.method_230de6ba_Dne() instanceof qoi_0 && !((onZ)this.field_7eb83e1f_bzF.get(5 + ((qoi_0)nMq.method_230de6ba_Dne()).field_2092ae_Dne)).method_7a46289e_Dne() ? !this.method_7bdfbb43_Dne(nMq2, n2 = 5 + ((qoi_0)nMq.method_230de6ba_Dne()).field_2092ae_Dne, n2 + 1, false) : (n >= 9 && n < 36 ? !this.method_7bdfbb43_Dne(nMq2, 36, 45, false) : (n >= 36 && n < 45 ? !this.method_7bdfbb43_Dne(nMq2, 9, 36, false) : !this.method_7bdfbb43_Dne(nMq2, 9, 45, false)))))) {
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
    public void method_7c9aa178_Dne(MqS mqS) {
        this.field_36a853d_Dne.method_6e3a6b66_Dne(0, aXt.method_230cd12e_Dne().method_6c5d33f6_Dne(this.field_36e2b5b_Dne, this.field_3673728_Dne.field_36c4f18_Dne));
    }
}

