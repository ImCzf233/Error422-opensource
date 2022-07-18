package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class XXJ
extends ljW {
    private final boolean field_2092bf_Dne;
    private static boolean field_388db7_zGp = false;
    private gDn field_375b13b_Dne;
    private final Random field_7331eae7_Dne = new Random();
    private gDn field_202f7d1a_FWm;

    @Override
    public void method_ca7e4e57_Dne(Qnq qnq, int n, int n2, int n3, FUH fUH, NMq nMq) {
        int n4 = geR.method_117d0718_FWm((double)(fUH.field_334489_mrb * 4.0f / 360.0f) + 0.5) & 3;
        if (n4 == 0) {
            qnq.method_d4dc89ed_Dne(n, n2, n3, 2, 2);
        }
        if (n4 == 1) {
            qnq.method_d4dc89ed_Dne(n, n2, n3, 5, 2);
        }
        if (n4 == 2) {
            qnq.method_d4dc89ed_Dne(n, n2, n3, 3, 2);
        }
        if (n4 == 3) {
            qnq.method_d4dc89ed_Dne(n, n2, n3, 4, 2);
        }
        if (nMq.method_d44b4596_zGp()) {
            ((lqs)qnq.method_d98e681d_Dne(n, n2, n3)).method_8f501fe4_Dne(nMq.method_d1f1ed87_FWm());
        }
    }

    @Override
    public int method_9cb39123_Dne(Qnq qnq, int n, int n2, int n3) {
        return zKP.field_cba1f2f1_haP.field_21260d_FWm;
    }

    protected XXJ(int n, boolean bl) {
        super(n, KFd.field_712c8169_aFZ);
        this.field_2092bf_Dne = bl;
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_5e5f2002_Qnq = rbp.method_285881e4_Dne("furnace_side");
        this.field_202f7d1a_FWm = rbp.method_285881e4_Dne(this.field_2092bf_Dne ? "furnace_front_lit" : "furnace_front");
        this.field_375b13b_Dne = rbp.method_285881e4_Dne("furnace_top");
    }

    @Override
    public int method_f9bf07c6_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        return Pdb.method_7c9aa16b_Dne((MqS)((Object)qnq.method_d98e681d_Dne(n, n2, n3)));
    }

    @Override
    public int method_24763341_Dne(int n, Random random, int n2) {
        return zKP.field_cba1f2f1_haP.field_21260d_FWm;
    }

    public static void method_661a2610_Dne(boolean bl, Qnq qnq, int n, int n2, int n3) {
        int n4 = qnq.method_2dee76f_bzF(n, n2, n3);
        ipD ipD2 = qnq.method_d98e681d_Dne(n, n2, n3);
        field_388db7_zGp = true;
        if (bl) {
            qnq.method_2ee8c47d_FWm(n, n2, n3, zKP.field_ddf29d67_qrB.field_21260d_FWm);
        } else {
            qnq.method_2ee8c47d_FWm(n, n2, n3, zKP.field_cba1f2f1_haP.field_21260d_FWm);
        }
        field_388db7_zGp = false;
        qnq.method_d4dc89ed_Dne(n, n2, n3, n4, 2);
        if (ipD2 != null) {
            ipD2.method_7ad38803_DyG();
            qnq.method_c583bffb_Dne(n, n2, n3, ipD2);
        }
    }

    @Override
    public void method_3e226590_Dne(Qnq qnq, int n, int n2, int n3, int n4, int n5) {
        lqs lqs2;
        if (!field_388db7_zGp && (lqs2 = (lqs)qnq.method_d98e681d_Dne(n, n2, n3)) != null) {
            for (int i = 0; i < lqs2.method_907a9d14_Qnq(); ++i) {
                NMq nMq = lqs2.method_9e6e1a08_Dne(i);
                if (nMq == null) continue;
                float f = this.field_7331eae7_Dne.nextFloat() * 0.8f + 0.1f;
                float f2 = this.field_7331eae7_Dne.nextFloat() * 0.8f + 0.1f;
                float f3 = this.field_7331eae7_Dne.nextFloat() * 0.8f + 0.1f;
                while (nMq.field_2092ae_Dne > 0) {
                    int n6 = this.field_7331eae7_Dne.nextInt(21) + 10;
                    if (n6 > nMq.field_2092ae_Dne) {
                        n6 = nMq.field_2092ae_Dne;
                    }
                    nMq.field_2092ae_Dne -= n6;
                    JiM jiM = new JiM(qnq, (float)n + f, (float)n2 + f2, (float)n3 + f3, new NMq(nMq.field_2e5f1b_bzF, n6, nMq.method_907a9d14_Qnq()));
                    if (nMq.method_a98a0664_aFZ()) {
                        jiM.method_23040479_Dne().method_66a36cd8_FWm((WkD)nMq.method_230886fb_Dne().method_23130705_Dne());
                    }
                    float f4 = 0.05f;
                    jiM.field_291868_XHL = (float)this.field_7331eae7_Dne.nextGaussian() * f4;
                    jiM.field_2a9ad1_Zpi = (float)this.field_7331eae7_Dne.nextGaussian() * f4 + 0.2f;
                    jiM.field_31b811_kGO = (float)this.field_7331eae7_Dne.nextGaussian() * f4;
                    qnq.method_94d18be5_FWm(jiM);
                }
            }
            qnq.method_6465ff20_aFZ(n, n2, n3, n4);
        }
        super.method_3e226590_Dne(qnq, n, n2, n3, n4, n5);
    }

    @Override
    public void method_ff5e68fb_FWm(Qnq qnq, int n, int n2, int n3, Random random) {
        if (this.field_2092bf_Dne) {
            int n4 = qnq.method_2dee76f_bzF(n, n2, n3);
            float f = (float)n + 0.5f;
            float f2 = (float)n2 + 0.0f + random.nextFloat() * 6.0f / 16.0f;
            float f3 = (float)n3 + 0.5f;
            float f4 = 0.52f;
            float f5 = random.nextFloat() * 0.6f - 0.3f;
            if (n4 == 4) {
                qnq.method_8600ec24_Dne("smoke", f - f4, f2, f3 + f5, 0.0, 0.0, 0.0);
                qnq.method_8600ec24_Dne("flame", f - f4, f2, f3 + f5, 0.0, 0.0, 0.0);
            } else if (n4 == 5) {
                qnq.method_8600ec24_Dne("smoke", f + f4, f2, f3 + f5, 0.0, 0.0, 0.0);
                qnq.method_8600ec24_Dne("flame", f + f4, f2, f3 + f5, 0.0, 0.0, 0.0);
            } else if (n4 == 2) {
                qnq.method_8600ec24_Dne("smoke", f + f5, f2, f3 - f4, 0.0, 0.0, 0.0);
                qnq.method_8600ec24_Dne("flame", f + f5, f2, f3 - f4, 0.0, 0.0, 0.0);
            } else if (n4 == 3) {
                qnq.method_8600ec24_Dne("smoke", f + f5, f2, f3 + f4, 0.0, 0.0, 0.0);
                qnq.method_8600ec24_Dne("flame", f + f5, f2, f3 + f4, 0.0, 0.0, 0.0);
            }
        }
    }

    @Override
    public ipD method_c35d5be7_Dne(Qnq qnq) {
        return new lqs();
    }

    @Override
    public void method_9cb39130_Dne(Qnq qnq, int n, int n2, int n3) {
        super.method_9cb39130_Dne(qnq, n, n2, n3);
        this.method_5452795d_bzF(qnq, n, n2, n3);
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        return n == 1 ? this.field_375b13b_Dne : (n == 0 ? this.field_375b13b_Dne : (n != n2 ? this.field_5e5f2002_Qnq : this.field_202f7d1a_FWm));
    }

    @Override
    public boolean method_582b29b_a_() {
        return true;
    }

    private void method_5452795d_bzF(Qnq qnq, int n, int n2, int n3) {
        if (!qnq.field_2d2a05_aFZ) {
            int n4 = qnq.method_2c2cf7bc_Dne(n, n2, n3 - 1);
            int n5 = qnq.method_2c2cf7bc_Dne(n, n2, n3 + 1);
            int n6 = qnq.method_2c2cf7bc_Dne(n - 1, n2, n3);
            int n7 = qnq.method_2c2cf7bc_Dne(n + 1, n2, n3);
            int n8 = 3;
            if (zKP.field_4039e1b_FWm[n4] && !zKP.field_4039e1b_FWm[n5]) {
                n8 = 3;
            }
            if (zKP.field_4039e1b_FWm[n5] && !zKP.field_4039e1b_FWm[n4]) {
                n8 = 2;
            }
            if (zKP.field_4039e1b_FWm[n6] && !zKP.field_4039e1b_FWm[n7]) {
                n8 = 5;
            }
            if (zKP.field_4039e1b_FWm[n7] && !zKP.field_4039e1b_FWm[n6]) {
                n8 = 4;
            }
            qnq.method_d4dc89ed_Dne(n, n2, n3, n8, 2);
        }
    }

    @Override
    public boolean method_cb53d52e_Dne(Qnq qnq, int n, int n2, int n3, FiG fiG, int n4, float f, float f2, float f3) {
        if (qnq.field_2d2a05_aFZ) {
            return true;
        }
        lqs lqs2 = (lqs)qnq.method_d98e681d_Dne(n, n2, n3);
        if (lqs2 != null) {
            fiG.method_b18f6899_Dne(lqs2);
        }
        return true;
    }
}

