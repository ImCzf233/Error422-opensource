package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class bhy
extends Pdb {
    private int field_2e5f1b_bzF = 0;
    private int field_21260d_FWm = 0;
    private lqs field_378a09e_Dne;
    private int field_267cf5_Qnq = 0;

    @Override
    public NMq method_8936db9f_Dne(FiG fiG, int n) {
        NMq nMq = null;
        onZ onZ2 = (onZ)this.field_7eb83e1f_bzF.get(n);
        if (onZ2 != null && onZ2.method_7a46289e_Dne()) {
            NMq nMq2 = onZ2.method_23040479_Dne();
            nMq = nMq2.method_23040479_Dne();
            if (n == 2) {
                if (!this.method_7bdfbb43_Dne(nMq2, 3, 39, true)) {
                    return null;
                }
                onZ2.method_a981fd7a_Dne(nMq2, nMq);
            } else if (n != 1 && n != 0 ? (cTN.method_230da64e_Dne().method_9e6e1a08_Dne(nMq2.method_230de6ba_Dne().field_267cf5_Qnq) != null ? !this.method_7bdfbb43_Dne(nMq2, 0, 1, false) : (lqs.method_7c61cf19_Dne(nMq2) ? !this.method_7bdfbb43_Dne(nMq2, 1, 2, false) : (n >= 3 && n < 30 ? !this.method_7bdfbb43_Dne(nMq2, 30, 39, false) : n >= 30 && n < 39 && !this.method_7bdfbb43_Dne(nMq2, 3, 30, false)))) : !this.method_7bdfbb43_Dne(nMq2, 3, 39, false)) {
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

    public bhy(MOS mOS, lqs lqs2) {
        int n;
        this.field_378a09e_Dne = lqs2;
        this.method_ec04ae2_Dne(new onZ(lqs2, 0, 56, 17));
        this.method_ec04ae2_Dne(new onZ(lqs2, 1, 56, 53));
        this.method_ec04ae2_Dne(new DQp(mOS.field_3673728_Dne, lqs2, 2, 116, 35));
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
        return this.field_378a09e_Dne.method_703284a7_Dne(fiG);
    }

    @Override
    public void method_b1d7af9a_Dne(mXX mXX2) {
        super.method_b1d7af9a_Dne(mXX2);
        mXX2.method_6211b979_Dne(this, 0, this.field_378a09e_Dne.field_2e5f1b_bzF);
        mXX2.method_6211b979_Dne(this, 1, this.field_378a09e_Dne.field_2092ae_Dne);
        mXX2.method_6211b979_Dne(this, 2, this.field_378a09e_Dne.field_21260d_FWm);
    }

    @Override
    public void method_16cca7a_Dne(int n, int n2) {
        if (n == 0) {
            this.field_378a09e_Dne.field_2e5f1b_bzF = n2;
        }
        if (n == 1) {
            this.field_378a09e_Dne.field_2092ae_Dne = n2;
        }
        if (n == 2) {
            this.field_378a09e_Dne.field_21260d_FWm = n2;
        }
    }

    @Override
    public void method_7a46289a_Dne() {
        super.method_7a46289a_Dne();
        for (int i = 0; i < this.field_2c197105_Qnq.size(); ++i) {
            mXX mXX2 = (mXX)this.field_2c197105_Qnq.get(i);
            if (this.field_21260d_FWm != this.field_378a09e_Dne.field_2e5f1b_bzF) {
                mXX2.method_6211b979_Dne(this, 0, this.field_378a09e_Dne.field_2e5f1b_bzF);
            }
            if (this.field_2e5f1b_bzF != this.field_378a09e_Dne.field_2092ae_Dne) {
                mXX2.method_6211b979_Dne(this, 1, this.field_378a09e_Dne.field_2092ae_Dne);
            }
            if (this.field_267cf5_Qnq == this.field_378a09e_Dne.field_21260d_FWm) continue;
            mXX2.method_6211b979_Dne(this, 2, this.field_378a09e_Dne.field_21260d_FWm);
        }
        this.field_21260d_FWm = this.field_378a09e_Dne.field_2e5f1b_bzF;
        this.field_2e5f1b_bzF = this.field_378a09e_Dne.field_2092ae_Dne;
        this.field_267cf5_Qnq = this.field_378a09e_Dne.field_21260d_FWm;
    }
}

