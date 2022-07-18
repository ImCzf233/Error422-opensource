package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.Map;

public class sZS
extends Pdb {
    private int field_267cf5_Qnq;
    private Qnq field_36c4f18_Dne;
    private int field_388da6_zGp = 0;
    private MqS field_36a853d_Dne = new HuD();
    public int field_21260d_FWm = 0;
    private final FiG field_3673728_Dne;
    private int field_2e5f1b_bzF;
    private String field_569fcf45_Dne;
    private int field_2d29f4_aFZ;
    private MqS field_2024511c_FWm = new qhH(this, "Repair", true, 2);

    static MqS method_7355befd_Dne(sZS sZS2) {
        return sZS2.field_2024511c_FWm;
    }

    @Override
    public void method_703284a3_Dne(FiG fiG) {
        super.method_703284a3_Dne(fiG);
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            for (int i = 0; i < this.field_2024511c_FWm.method_907a9d14_Qnq(); ++i) {
                NMq nMq = this.field_2024511c_FWm.method_77c1cdc9_FWm(i);
                if (nMq == null) continue;
                fiG.method_c9a088b8_Dne(nMq);
            }
        }
    }

    public void method_ae128dc7_bzF() {
        NMq nMq = this.field_2024511c_FWm.method_9e6e1a08_Dne(0);
        this.field_21260d_FWm = 0;
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        if (nMq == null) {
            this.field_36a853d_Dne.method_6e3a6b66_Dne(0, null);
            this.field_21260d_FWm = 0;
        } else {
            int n4;
            ycv ycv2;
            Iterator iterator;
            int n5;
            int n6;
            int n7;
            int n8;
            NMq nMq2 = nMq.method_23040479_Dne();
            NMq nMq3 = this.field_2024511c_FWm.method_9e6e1a08_Dne(1);
            Map map = UYp.method_fe3d588a_Dne(nMq2);
            boolean bl = false;
            int n9 = n2 + nMq.method_7ad387f6_DyG() + (nMq3 == null ? 0 : nMq3.method_7ad387f6_DyG());
            this.field_388da6_zGp = 0;
            if (nMq3 != null) {
                boolean bl2 = bl = nMq3.field_2e5f1b_bzF == dEr.field_374f605_Dne.field_267cf5_Qnq && dEr.field_374f605_Dne.method_c9b05901_Dne(nMq3).method_7a46288d_Dne() > 0;
                if (nMq2.method_7c6f603d_FWm() && dEr.field_836aa5b6_Dne[nMq2.field_2e5f1b_bzF].method_a981fd7e_Dne(nMq, nMq3)) {
                    n8 = Math.min(nMq2.method_ae128dba_bzF(), nMq2.method_a98a0653_aFZ() / 4);
                    if (n8 <= 0) {
                        this.field_36a853d_Dne.method_6e3a6b66_Dne(0, null);
                        this.field_21260d_FWm = 0;
                        return;
                    }
                    for (n7 = 0; n8 > 0 && n7 < nMq3.field_2092ae_Dne; ++n7) {
                        n6 = nMq2.method_ae128dba_bzF() - n8;
                        nMq2.method_ce7f5da9_Dne(n6);
                        n += Math.max(1, n8 / 100) + map.size();
                        n8 = Math.min(nMq2.method_ae128dba_bzF(), nMq2.method_a98a0653_aFZ() / 4);
                    }
                    this.field_388da6_zGp = n7;
                } else {
                    if (!(bl || nMq2.field_2e5f1b_bzF == nMq3.field_2e5f1b_bzF && nMq2.method_7c6f603d_FWm())) {
                        this.field_36a853d_Dne.method_6e3a6b66_Dne(0, null);
                        this.field_21260d_FWm = 0;
                        return;
                    }
                    if (nMq2.method_7c6f603d_FWm() && !bl) {
                        n8 = nMq.method_a98a0653_aFZ() - nMq.method_ae128dba_bzF();
                        n7 = nMq3.method_a98a0653_aFZ() - nMq3.method_ae128dba_bzF();
                        n6 = n7 + nMq2.method_a98a0653_aFZ() * 12 / 100;
                        int n10 = n8 + n6;
                        n5 = nMq2.method_a98a0653_aFZ() - n10;
                        if (n5 < 0) {
                            n5 = 0;
                        }
                        if (n5 < nMq2.method_907a9d14_Qnq()) {
                            nMq2.method_ce7f5da9_Dne(n5);
                            n += Math.max(1, n6 / 100);
                        }
                    }
                    Map map2 = UYp.method_fe3d588a_Dne(nMq3);
                    iterator = map2.keySet().iterator();
                    while (iterator.hasNext()) {
                        int n11;
                        n6 = (Integer)iterator.next();
                        ycv2 = ycv.field_8374a29b_Dne[n6];
                        n5 = map.containsKey(n6) ? (Integer)map.get(n6) : 0;
                        n4 = (Integer)map2.get(n6);
                        int n12 = n5 == n4 ? ++n4 : Math.max(n4, n5);
                        n4 = n12;
                        int n13 = n4 - n5;
                        boolean bl3 = ycv2.method_7c61cf19_Dne(nMq);
                        if (this.field_3673728_Dne.field_37cb681_Dne.field_267d06_Qnq || nMq.field_2e5f1b_bzF == dpS.field_374f605_Dne.field_267cf5_Qnq) {
                            bl3 = true;
                        }
                        Iterator iterator2 = map.keySet().iterator();
                        while (iterator2.hasNext()) {
                            n11 = (Integer)iterator2.next();
                            if (n11 == n6 || ycv2.method_c6fa7cbf_Dne(ycv.field_8374a29b_Dne[n11])) continue;
                            bl3 = false;
                            n += n13;
                        }
                        if (!bl3) continue;
                        if (n4 > ycv2.method_7a46288d_Dne()) {
                            n4 = ycv2.method_7a46288d_Dne();
                        }
                        map.put(n6, n4);
                        n11 = 0;
                        switch (ycv2.method_7c6f602c_FWm()) {
                            case 1: {
                                n11 = 8;
                                break;
                            }
                            case 2: {
                                n11 = 4;
                            }
                            default: {
                                break;
                            }
                            case 5: {
                                n11 = 2;
                                break;
                            }
                            case 10: {
                                n11 = 1;
                            }
                        }
                        if (bl) {
                            n11 = Math.max(1, n11 / 2);
                        }
                        n += n11 * n13;
                    }
                }
            }
            if (this.field_569fcf45_Dne != null && this.field_569fcf45_Dne.length() > 0 && !this.field_569fcf45_Dne.equalsIgnoreCase(this.field_3673728_Dne.method_2310d392_Dne().method_8dd0853d_FWm(nMq.method_eecad346_Dne())) && !this.field_569fcf45_Dne.equals(nMq.method_d1f1ed87_FWm())) {
                n3 = nMq.method_7c6f603d_FWm() ? 7 : nMq.field_2092ae_Dne * 5;
                n += n3;
                if (nMq.method_d44b4596_zGp()) {
                    n9 += n3 / 2;
                }
                nMq2.method_8f501fe4_Dne(this.field_569fcf45_Dne);
            }
            n8 = 0;
            iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                n6 = (Integer)iterator.next();
                ycv2 = ycv.field_8374a29b_Dne[n6];
                n5 = (Integer)map.get(n6);
                n4 = 0;
                ++n8;
                switch (ycv2.method_7c6f602c_FWm()) {
                    case 1: {
                        n4 = 8;
                        break;
                    }
                    case 2: {
                        n4 = 4;
                    }
                    default: {
                        break;
                    }
                    case 5: {
                        n4 = 2;
                        break;
                    }
                    case 10: {
                        n4 = 1;
                    }
                }
                if (bl) {
                    n4 = Math.max(1, n4 / 2);
                }
                n9 += n8 + n5 * n4;
            }
            if (bl) {
                n9 = Math.max(1, n9 / 2);
            }
            this.field_21260d_FWm = n9 + n;
            if (n <= 0) {
                nMq2 = null;
            }
            if (n3 == n && n3 > 0 && this.field_21260d_FWm >= 40) {
                this.field_36c4f18_Dne.method_230e0120_Dne().method_8f501fe4_Dne("Naming an item only, cost too high; giving discount to cap cost to 39 levels");
                this.field_21260d_FWm = 39;
            }
            if (this.field_21260d_FWm >= 40 && !this.field_3673728_Dne.field_37cb681_Dne.field_267d06_Qnq) {
                nMq2 = null;
            }
            if (nMq2 != null) {
                n7 = nMq2.method_7ad387f6_DyG();
                if (nMq3 != null && n7 < nMq3.method_7ad387f6_DyG()) {
                    n7 = nMq3.method_7ad387f6_DyG();
                }
                if (nMq2.method_d44b4596_zGp()) {
                    n7 -= 9;
                }
                if (n7 < 0) {
                    n7 = 0;
                }
                nMq2.method_117d19ea_FWm(n7 += 2);
                UYp.method_327e0ea4_Dne(map, nMq2);
            }
            this.field_36a853d_Dne.method_6e3a6b66_Dne(0, nMq2);
            this.method_7a46289a_Dne();
        }
    }

    @Override
    public void method_16cca7a_Dne(int n, int n2) {
        if (n == 0) {
            this.field_21260d_FWm = n2;
        }
    }

    public sZS(MOS mOS, Qnq qnq, int n, int n2, int n3, FiG fiG) {
        int n4;
        this.field_36c4f18_Dne = qnq;
        this.field_2e5f1b_bzF = n;
        this.field_267cf5_Qnq = n2;
        this.field_2d29f4_aFZ = n3;
        this.field_3673728_Dne = fiG;
        this.method_ec04ae2_Dne(new onZ(this.field_2024511c_FWm, 0, 27, 47));
        this.method_ec04ae2_Dne(new onZ(this.field_2024511c_FWm, 1, 76, 47));
        this.method_ec04ae2_Dne(new HSg(this, this.field_36a853d_Dne, 2, 134, 47, qnq, n, n2, n3));
        for (n4 = 0; n4 < 3; ++n4) {
            for (int i = 0; i < 9; ++i) {
                this.method_ec04ae2_Dne(new onZ(mOS, i + n4 * 9 + 9, 8 + i * 18, 84 + n4 * 18));
            }
        }
        for (n4 = 0; n4 < 9; ++n4) {
            this.method_ec04ae2_Dne(new onZ(mOS, n4, 8 + n4 * 18, 142));
        }
    }

    public void method_8f501fe4_Dne(String string) {
        this.field_569fcf45_Dne = string;
        if (this.method_9e7d935f_Dne(2).method_7a46289e_Dne()) {
            this.method_9e7d935f_Dne(2).method_23040479_Dne().method_8f501fe4_Dne(this.field_569fcf45_Dne);
        }
        this.method_ae128dc7_bzF();
    }

    static int method_bc2eac6e_Dne(sZS sZS2) {
        return sZS2.field_388da6_zGp;
    }

    @Override
    public boolean method_703284a7_Dne(FiG fiG) {
        return this.field_36c4f18_Dne.method_2c2cf7bc_Dne(this.field_2e5f1b_bzF, this.field_267cf5_Qnq, this.field_2d29f4_aFZ) != zKP.field_9225485d_etZ.field_21260d_FWm ? false : fiG.method_2be42992_Dne((double)this.field_2e5f1b_bzF + 0.5, (double)this.field_267cf5_Qnq + 0.5, (double)this.field_2d29f4_aFZ + 0.5) <= 64.0;
    }

    @Override
    public void method_b1d7af9a_Dne(mXX mXX2) {
        super.method_b1d7af9a_Dne(mXX2);
        mXX2.method_6211b979_Dne(this, 0, this.field_21260d_FWm);
    }

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
            } else if (n != 0 && n != 1 ? n >= 3 && n < 39 && !this.method_7bdfbb43_Dne(nMq2, 0, 2, false) : !this.method_7bdfbb43_Dne(nMq2, 3, 39, false)) {
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
        super.method_7c9aa178_Dne(mqS);
        if (mqS == this.field_2024511c_FWm) {
            this.method_ae128dc7_bzF();
        }
    }
}

