package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class HhP
extends Pdb {
    private Qnq field_36c4f18_Dne;
    public MqS field_36a853d_Dne = new NPS(this, "Enchant", true, 1);
    private Random field_7331eae7_Dne = new Random();
    private int field_21260d_FWm;
    public int[] field_3f1c589_Dne = new int[3];
    private int field_2e5f1b_bzF;
    public long field_2092af_Dne;
    private int field_267cf5_Qnq;

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
            } else {
                if (((onZ)this.field_7eb83e1f_bzF.get(0)).method_7a46289e_Dne() || !((onZ)this.field_7eb83e1f_bzF.get(0)).method_7c61cf19_Dne(nMq2)) {
                    return null;
                }
                if (nMq2.method_a98a0664_aFZ() && nMq2.field_2092ae_Dne == 1) {
                    ((onZ)this.field_7eb83e1f_bzF.get(0)).method_7c61cf15_Dne(nMq2.method_23040479_Dne());
                    nMq2.field_2092ae_Dne = 0;
                } else if (nMq2.field_2092ae_Dne >= 1) {
                    ((onZ)this.field_7eb83e1f_bzF.get(0)).method_7c61cf15_Dne(new NMq(nMq2.field_2e5f1b_bzF, 1, nMq2.method_907a9d14_Qnq()));
                    --nMq2.field_2092ae_Dne;
                }
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
    public boolean method_961e82c4_Dne(FiG fiG, int n) {
        NMq nMq = this.field_36a853d_Dne.method_9e6e1a08_Dne(0);
        if (this.field_3f1c589_Dne[n] > 0 && nMq != null && (fiG.field_2f0276_eHV >= this.field_3f1c589_Dne[n] || fiG.field_37cb681_Dne.field_267d06_Qnq)) {
            if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
                boolean bl;
                List list = UYp.method_543e70d_Dne(this.field_7331eae7_Dne, nMq, this.field_3f1c589_Dne[n]);
                boolean bl2 = bl = nMq.field_2e5f1b_bzF == dEr.field_4976bda6_TKg.field_267cf5_Qnq;
                if (list != null) {
                    fiG.method_117d19ea_FWm(-this.field_3f1c589_Dne[n]);
                    if (bl) {
                        nMq.field_2e5f1b_bzF = dEr.field_374f605_Dne.field_267cf5_Qnq;
                    }
                    int n2 = bl ? this.field_7331eae7_Dne.nextInt(list.size()) : -1;
                    for (int i = 0; i < list.size(); ++i) {
                        RmG rmG = (RmG)list.get(i);
                        if (bl && i != n2) continue;
                        if (bl) {
                            dEr.field_374f605_Dne.method_b2053880_Dne(nMq, rmG);
                            continue;
                        }
                        nMq.method_18558da8_Dne(rmG.field_37e5540_Dne, rmG.field_2092ae_Dne);
                    }
                    this.method_7c9aa178_Dne(this.field_36a853d_Dne);
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean method_703284a7_Dne(FiG fiG) {
        return this.field_36c4f18_Dne.method_2c2cf7bc_Dne(this.field_21260d_FWm, this.field_2e5f1b_bzF, this.field_267cf5_Qnq) != zKP.field_558df63_KkE.field_21260d_FWm ? false : fiG.method_2be42992_Dne((double)this.field_21260d_FWm + 0.5, (double)this.field_2e5f1b_bzF + 0.5, (double)this.field_267cf5_Qnq + 0.5) <= 64.0;
    }

    public HhP(MOS mOS, Qnq qnq, int n, int n2, int n3) {
        int n4;
        this.field_36c4f18_Dne = qnq;
        this.field_21260d_FWm = n;
        this.field_2e5f1b_bzF = n2;
        this.field_267cf5_Qnq = n3;
        this.method_ec04ae2_Dne(new fKk(this, this.field_36a853d_Dne, 0, 25, 47));
        for (n4 = 0; n4 < 3; ++n4) {
            for (int i = 0; i < 9; ++i) {
                this.method_ec04ae2_Dne(new onZ(mOS, i + n4 * 9 + 9, 8 + i * 18, 84 + n4 * 18));
            }
        }
        for (n4 = 0; n4 < 9; ++n4) {
            this.method_ec04ae2_Dne(new onZ(mOS, n4, 8 + n4 * 18, 142));
        }
    }

    @Override
    public void method_b1d7af9a_Dne(mXX mXX2) {
        super.method_b1d7af9a_Dne(mXX2);
        mXX2.method_6211b979_Dne(this, 0, this.field_3f1c589_Dne[0]);
        mXX2.method_6211b979_Dne(this, 1, this.field_3f1c589_Dne[1]);
        mXX2.method_6211b979_Dne(this, 2, this.field_3f1c589_Dne[2]);
    }

    @Override
    public void method_7a46289a_Dne() {
        super.method_7a46289a_Dne();
        for (int i = 0; i < this.field_2c197105_Qnq.size(); ++i) {
            mXX mXX2 = (mXX)this.field_2c197105_Qnq.get(i);
            mXX2.method_6211b979_Dne(this, 0, this.field_3f1c589_Dne[0]);
            mXX2.method_6211b979_Dne(this, 1, this.field_3f1c589_Dne[1]);
            mXX2.method_6211b979_Dne(this, 2, this.field_3f1c589_Dne[2]);
        }
    }

    @Override
    public void method_703284a3_Dne(FiG fiG) {
        NMq nMq;
        super.method_703284a3_Dne(fiG);
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ && (nMq = this.field_36a853d_Dne.method_77c1cdc9_FWm(0)) != null) {
            fiG.method_c9a088b8_Dne(nMq);
        }
    }

    @Override
    public void method_7c9aa178_Dne(MqS mqS) {
        if (mqS == this.field_36a853d_Dne) {
            NMq nMq = mqS.method_9e6e1a08_Dne(0);
            if (nMq != null && nMq.method_b0a28148_div()) {
                this.field_2092af_Dne = this.field_7331eae7_Dne.nextLong();
                if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
                    int n;
                    int n2 = 0;
                    for (n = -1; n <= 1; ++n) {
                        for (int i = -1; i <= 1; ++i) {
                            if (n == 0 && i == 0 || !this.field_36c4f18_Dne.method_2c2cf7cd_Dne(this.field_21260d_FWm + i, this.field_2e5f1b_bzF, this.field_267cf5_Qnq + n) || !this.field_36c4f18_Dne.method_2c2cf7cd_Dne(this.field_21260d_FWm + i, this.field_2e5f1b_bzF + 1, this.field_267cf5_Qnq + n)) continue;
                            if (this.field_36c4f18_Dne.method_2c2cf7bc_Dne(this.field_21260d_FWm + i * 2, this.field_2e5f1b_bzF, this.field_267cf5_Qnq + n * 2) == zKP.field_24a90a48_AgF.field_21260d_FWm) {
                                ++n2;
                            }
                            if (this.field_36c4f18_Dne.method_2c2cf7bc_Dne(this.field_21260d_FWm + i * 2, this.field_2e5f1b_bzF + 1, this.field_267cf5_Qnq + n * 2) == zKP.field_24a90a48_AgF.field_21260d_FWm) {
                                ++n2;
                            }
                            if (i == 0 || n == 0) continue;
                            if (this.field_36c4f18_Dne.method_2c2cf7bc_Dne(this.field_21260d_FWm + i * 2, this.field_2e5f1b_bzF, this.field_267cf5_Qnq + n) == zKP.field_24a90a48_AgF.field_21260d_FWm) {
                                ++n2;
                            }
                            if (this.field_36c4f18_Dne.method_2c2cf7bc_Dne(this.field_21260d_FWm + i * 2, this.field_2e5f1b_bzF + 1, this.field_267cf5_Qnq + n) == zKP.field_24a90a48_AgF.field_21260d_FWm) {
                                ++n2;
                            }
                            if (this.field_36c4f18_Dne.method_2c2cf7bc_Dne(this.field_21260d_FWm + i, this.field_2e5f1b_bzF, this.field_267cf5_Qnq + n * 2) == zKP.field_24a90a48_AgF.field_21260d_FWm) {
                                ++n2;
                            }
                            if (this.field_36c4f18_Dne.method_2c2cf7bc_Dne(this.field_21260d_FWm + i, this.field_2e5f1b_bzF + 1, this.field_267cf5_Qnq + n * 2) != zKP.field_24a90a48_AgF.field_21260d_FWm) continue;
                            ++n2;
                        }
                    }
                    for (n = 0; n < 3; ++n) {
                        this.field_3f1c589_Dne[n] = UYp.method_1cc4553c_Dne(this.field_7331eae7_Dne, n, n2, nMq);
                    }
                    this.method_7a46289a_Dne();
                }
            } else {
                for (int i = 0; i < 3; ++i) {
                    this.field_3f1c589_Dne[i] = 0;
                }
            }
        }
    }

    @Override
    public void method_16cca7a_Dne(int n, int n2) {
        if (n >= 0 && n <= 2) {
            this.field_3f1c589_Dne[n] = n2;
        } else {
            super.method_16cca7a_Dne(n, n2);
        }
    }
}

