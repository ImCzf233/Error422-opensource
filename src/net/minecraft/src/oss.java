package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class oss
extends Pdb {
    private int field_21260d_FWm = 0;
    private zio field_37edf4c_Dne;
    private final onZ field_379ef71_Dne;

    @Override
    public void method_16cca7a_Dne(int n, int n2) {
        if (n == 0) {
            this.field_37edf4c_Dne.method_ce7f5da9_Dne(n2);
        }
    }

    public oss(MOS mOS, zio zio2) {
        int n;
        this.field_37edf4c_Dne = zio2;
        this.method_ec04ae2_Dne(new vqi(mOS.field_3673728_Dne, zio2, 0, 56, 46));
        this.method_ec04ae2_Dne(new vqi(mOS.field_3673728_Dne, zio2, 1, 79, 53));
        this.method_ec04ae2_Dne(new vqi(mOS.field_3673728_Dne, zio2, 2, 102, 46));
        this.field_379ef71_Dne = this.method_ec04ae2_Dne(new EDM(this, zio2, 3, 79, 17));
        for (n = 0; n < 3; ++n) {
            for (int i = 0; i < 9; ++i) {
                this.method_ec04ae2_Dne(new onZ(mOS, i + n * 9 + 9, 8 + i * 18, 84 + n * 18));
            }
        }
        for (n = 0; n < 9; ++n) {
            this.method_ec04ae2_Dne(new onZ(mOS, n, 8 + n * 18, 142));
        }
    }

    @Override
    public boolean method_703284a7_Dne(FiG fiG) {
        return this.field_37edf4c_Dne.method_703284a7_Dne(fiG);
    }

    @Override
    public NMq method_8936db9f_Dne(FiG fiG, int n) {
        NMq nMq = null;
        onZ onZ2 = (onZ)this.field_7eb83e1f_bzF.get(n);
        if (onZ2 != null && onZ2.method_7a46289e_Dne()) {
            NMq nMq2 = onZ2.method_23040479_Dne();
            nMq = nMq2.method_23040479_Dne();
            if ((n < 0 || n > 2) && n != 3) {
                if (!this.field_379ef71_Dne.method_7a46289e_Dne() && this.field_379ef71_Dne.method_7c61cf19_Dne(nMq2) ? !this.method_7bdfbb43_Dne(nMq2, 3, 4, false) : (vqi.method_55b582da_FWm(nMq) ? !this.method_7bdfbb43_Dne(nMq2, 0, 3, false) : (n >= 4 && n < 31 ? !this.method_7bdfbb43_Dne(nMq2, 31, 40, false) : (n >= 31 && n < 40 ? !this.method_7bdfbb43_Dne(nMq2, 4, 31, false) : !this.method_7bdfbb43_Dne(nMq2, 4, 40, false))))) {
                    return null;
                }
            } else {
                if (!this.method_7bdfbb43_Dne(nMq2, 4, 40, true)) {
                    return null;
                }
                onZ2.method_a981fd7a_Dne(nMq2, nMq);
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
    public void method_7a46289a_Dne() {
        super.method_7a46289a_Dne();
        for (int i = 0; i < this.field_2c197105_Qnq.size(); ++i) {
            mXX mXX2 = (mXX)this.field_2c197105_Qnq.get(i);
            if (this.field_21260d_FWm == this.field_37edf4c_Dne.method_7a46288d_Dne()) continue;
            mXX2.method_6211b979_Dne(this, 0, this.field_37edf4c_Dne.method_7a46288d_Dne());
        }
        this.field_21260d_FWm = this.field_37edf4c_Dne.method_7a46288d_Dne();
    }

    @Override
    public void method_b1d7af9a_Dne(mXX mXX2) {
        super.method_b1d7af9a_Dne(mXX2);
        mXX2.method_6211b979_Dne(this, 0, this.field_37edf4c_Dne.method_7a46288d_Dne());
    }
}

