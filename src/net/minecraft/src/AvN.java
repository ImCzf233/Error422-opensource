package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class AvN
extends dEr {
    public static final String[] field_f5e54dca_Dne = new String[]{"black", "red", "green", "brown", "blue", "purple", "cyan", "silver", "gray", "pink", "lime", "yellow", "lightBlue", "magenta", "orange", "white"};
    public static final int[] field_3f1c589_Dne;
    private gDn[] field_836bfe96_Dne;
    public static final String[] field_1e416769_FWm;

    @Override
    public String method_10c7922b_Dne(NMq nMq) {
        int n = geR.method_2c2cf7bc_Dne(nMq.method_907a9d14_Qnq(), 0, 15);
        return super.method_d1f1ed87_FWm() + "." + field_f5e54dca_Dne[n];
    }

    @Override
    public gDn method_9e795529_Dne(int n) {
        int n2 = geR.method_2c2cf7bc_Dne(n, 0, 15);
        return this.field_836bfe96_Dne[n2];
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_836bfe96_Dne = new gDn[field_1e416769_FWm.length];
        for (int i = 0; i < field_1e416769_FWm.length; ++i) {
            this.field_836bfe96_Dne[i] = rbp.method_285881e4_Dne(field_1e416769_FWm[i]);
        }
    }

    @Override
    public void method_d88f4bf4_Dne(int n, JcN jcN, List list) {
        for (int i = 0; i < 16; ++i) {
            list.add(new NMq(n, 1, i));
        }
    }

    @Override
    public boolean method_4ddc487f_Dne(NMq nMq, FiG fiG, Qnq qnq, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        if (!fiG.method_7bcedb59_Dne(n, n2, n3, n4, nMq)) {
            return false;
        }
        if (nMq.method_907a9d14_Qnq() == 15) {
            if (AvN.method_f0aa8caf_Dne(nMq, qnq, n, n2, n3)) {
                if (!qnq.field_2d2a05_aFZ) {
                    qnq.method_57aed1c2_Qnq(2005, n, n2, n3, 0);
                }
                return true;
            }
        } else if (nMq.method_907a9d14_Qnq() == 3) {
            int n5 = qnq.method_2c2cf7bc_Dne(n, n2, n3);
            int n6 = qnq.method_2dee76f_bzF(n, n2, n3);
            if (n5 == zKP.field_af0f1368_udO.field_21260d_FWm && Tkf.method_143f9e0f_bzF(n6) == 3) {
                if (n4 == 0) {
                    return false;
                }
                if (n4 == 1) {
                    return false;
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
                if (qnq.method_2c2cf7cd_Dne(n, n2, n3)) {
                    int n7 = zKP.field_8374b848_Dne[zKP.field_103be727_Woy.field_21260d_FWm].method_a13ce189_Dne(qnq, n, n2, n3, n4, f, f2, f3, 0);
                    qnq.method_17d7ea9d_FWm(n, n2, n3, zKP.field_103be727_Woy.field_21260d_FWm, n7, 2);
                    if (!fiG.field_37cb681_Dne.field_267d06_Qnq) {
                        --nMq.field_2092ae_Dne;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static boolean method_f0aa8caf_Dne(NMq nMq, Qnq qnq, int n, int n2, int n3) {
        int n4 = qnq.method_2c2cf7bc_Dne(n, n2, n3);
        if (n4 == zKP.field_7141ef33_aFZ.field_21260d_FWm) {
            if (!qnq.field_2d2a05_aFZ) {
                if ((double)qnq.field_7331eae7_Dne.nextFloat() < 0.45) {
                    ((vHj)zKP.field_7141ef33_aFZ).method_a62aa109_bzF(qnq, n, n2, n3, qnq.field_7331eae7_Dne);
                }
                --nMq.field_2092ae_Dne;
            }
            return true;
        }
        if (n4 != zKP.field_75be630e_bzF.field_21260d_FWm && n4 != zKP.field_5e6003e8_Qnq.field_21260d_FWm) {
            if (n4 != zKP.field_479d48ec_MUD.field_21260d_FWm && n4 != zKP.field_63458f38_LDH.field_21260d_FWm) {
                if (n4 > 0 && zKP.field_8374b848_Dne[n4] instanceof MdS) {
                    if (qnq.method_2dee76f_bzF(n, n2, n3) == 7) {
                        return false;
                    }
                    if (!qnq.field_2d2a05_aFZ) {
                        ((MdS)zKP.field_8374b848_Dne[n4]).method_5452795d_bzF(qnq, n, n2, n3);
                        --nMq.field_2092ae_Dne;
                    }
                    return true;
                }
                if (n4 == zKP.field_103be727_Woy.field_21260d_FWm) {
                    int n5 = qnq.method_2dee76f_bzF(n, n2, n3);
                    int n6 = kbN.method_7ed979f5_Qnq(n5);
                    int n7 = Lsq.method_ae3dc47d_c_(n5);
                    if (n7 >= 2) {
                        return false;
                    }
                    if (!qnq.field_2d2a05_aFZ) {
                        qnq.method_d4dc89ed_Dne(n, n2, n3, ++n7 << 2 | n6, 2);
                        --nMq.field_2092ae_Dne;
                    }
                    return true;
                }
                if (n4 != zKP.field_36ff555_Dne.field_21260d_FWm) {
                    return false;
                }
                if (!qnq.field_2d2a05_aFZ) {
                    --nMq.field_2092ae_Dne;
                    block0: for (int i = 0; i < 128; ++i) {
                        int n8 = n;
                        int n9 = n2 + 1;
                        int n10 = n3;
                        for (int j = 0; j < i / 16; ++j) {
                            if (qnq.method_2c2cf7bc_Dne(n8 += field_7331eae7_Dne.nextInt(3) - 1, (n9 += (field_7331eae7_Dne.nextInt(3) - 1) * field_7331eae7_Dne.nextInt(3) / 2) - 1, n10 += field_7331eae7_Dne.nextInt(3) - 1) != zKP.field_36ff555_Dne.field_21260d_FWm || qnq.method_6fdef3c4_DyG(n8, n9, n10)) continue block0;
                        }
                        if (qnq.method_2c2cf7bc_Dne(n8, n9, n10) != 0) continue;
                        if (field_7331eae7_Dne.nextInt(10) != 0) {
                            if (!zKP.field_36dc147_Dne.method_52f8ce31_a_(qnq, n8, n9, n10)) continue;
                            qnq.method_17d7ea9d_FWm(n8, n9, n10, zKP.field_36dc147_Dne.field_21260d_FWm, 1, 3);
                            continue;
                        }
                        if (field_7331eae7_Dne.nextInt(3) != 0) {
                            if (!zKP.field_3769521_Dne.method_52f8ce31_a_(qnq, n8, n9, n10)) continue;
                            qnq.method_2ee8c47d_FWm(n8, n9, n10, zKP.field_3769521_Dne.field_21260d_FWm);
                            continue;
                        }
                        if (!zKP.field_20306100_FWm.method_52f8ce31_a_(qnq, n8, n9, n10)) continue;
                        qnq.method_2ee8c47d_FWm(n8, n9, n10, zKP.field_20306100_FWm.field_21260d_FWm);
                    }
                }
                return true;
            }
            if (qnq.method_2dee76f_bzF(n, n2, n3) == 7) {
                return false;
            }
            if (!qnq.field_2d2a05_aFZ) {
                ((ScM)zKP.field_8374b848_Dne[n4]).method_5452795d_bzF(qnq, n, n2, n3);
                --nMq.field_2092ae_Dne;
            }
            return true;
        }
        if (!qnq.field_2d2a05_aFZ) {
            if ((double)qnq.field_7331eae7_Dne.nextFloat() < 0.4) {
                ((gCn)zKP.field_8374b848_Dne[n4]).method_ca828a20_Dne(qnq, n, n2, n3, qnq.field_7331eae7_Dne);
            }
            --nMq.field_2092ae_Dne;
        }
        return true;
    }

    static {
        field_1e416769_FWm = new String[]{"dyePowder_black", "dyePowder_red", "dyePowder_green", "dyePowder_brown", "dyePowder_blue", "dyePowder_purple", "dyePowder_cyan", "dyePowder_silver", "dyePowder_gray", "dyePowder_pink", "dyePowder_lime", "dyePowder_yellow", "dyePowder_lightBlue", "dyePowder_magenta", "dyePowder_orange", "dyePowder_white"};
        field_3f1c589_Dne = new int[]{0x1E1B1B, 11743532, 3887386, 5320730, 2437522, 8073150, 2651799, 0xABABAB, 0x434343, 14188952, 4312372, 14602026, 6719955, 12801229, 15435844, 0xF0F0F0};
    }

    public static void method_f9bf07d3_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        zKP zKP2;
        int n5 = qnq.method_2c2cf7bc_Dne(n, n2, n3);
        if (n4 == 0) {
            n4 = 15;
        }
        zKP zKP3 = zKP2 = n5 > 0 && n5 < zKP.field_8374b848_Dne.length ? zKP.field_8374b848_Dne[n5] : null;
        if (zKP2 != null) {
            zKP2.method_fbabf7ef_Dne(qnq, n, n2, n3);
            for (int i = 0; i < n4; ++i) {
                double d = field_7331eae7_Dne.nextGaussian() * 0.02;
                double d2 = field_7331eae7_Dne.nextGaussian() * 0.02;
                double d3 = field_7331eae7_Dne.nextGaussian() * 0.02;
                qnq.method_8600ec24_Dne("happyVillager", (float)n + field_7331eae7_Dne.nextFloat(), (double)n2 + (double)field_7331eae7_Dne.nextFloat() * zKP2.method_907a9d0f_Qnq(), (float)n3 + field_7331eae7_Dne.nextFloat(), d, d2, d3);
            }
        }
    }

    public AvN(int n) {
        super(n);
        this.method_21c1eb9a_Dne(true);
        this.method_77cbb00a_FWm(0);
        this.method_829e7ad2_Dne(JcN.field_1c2a8136_XHL);
    }

    @Override
    public boolean method_9c395157_Dne(NMq nMq, FUH fUH) {
        if (fUH instanceof Pvd) {
            Pvd pvd = (Pvd)fUH;
            int n = Imc.method_ac88ebde_b_(nMq.method_907a9d14_Qnq());
            if (!pvd.method_86921671_LVR() && pvd.method_c5287a51_qLR() != n) {
                pvd.method_99cf5f41_kGO(n);
                --nMq.field_2092ae_Dne;
            }
            return true;
        }
        return false;
    }
}

