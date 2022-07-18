package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class myY
extends phH {
    private static Map field_83b1c1b0_Dne = new HashMap();
    private boolean field_2092bf_Dne = false;

    @Override
    public void method_ff5e68fb_FWm(Qnq qnq, int n, int n2, int n3, Random random) {
        if (this.field_2092bf_Dne) {
            int n4 = qnq.method_2dee76f_bzF(n, n2, n3);
            double d = (double)((float)n + 0.5f) + (double)(random.nextFloat() - 0.5f) * 0.2;
            double d2 = (double)((float)n2 + 0.7f) + (double)(random.nextFloat() - 0.5f) * 0.2;
            double d3 = (double)((float)n3 + 0.5f) + (double)(random.nextFloat() - 0.5f) * 0.2;
            double d4 = 0.22f;
            double d5 = 0.27f;
            if (n4 == 1) {
                qnq.method_8600ec24_Dne("reddust", d - d5, d2 + d4, d3, 0.0, 0.0, 0.0);
            } else if (n4 == 2) {
                qnq.method_8600ec24_Dne("reddust", d + d5, d2 + d4, d3, 0.0, 0.0, 0.0);
            } else if (n4 == 3) {
                qnq.method_8600ec24_Dne("reddust", d, d2 + d4, d3 - d5, 0.0, 0.0, 0.0);
            } else if (n4 == 4) {
                qnq.method_8600ec24_Dne("reddust", d, d2 + d4, d3 + d5, 0.0, 0.0, 0.0);
            } else {
                qnq.method_8600ec24_Dne("reddust", d, d2, d3, 0.0, 0.0, 0.0);
            }
        }
    }

    @Override
    public int method_24763341_Dne(int n, Random random, int n2) {
        return zKP.field_3f9bd7dc_CZC.field_21260d_FWm;
    }

    @Override
    public void method_f9bf07d3_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        if (!this.method_d6a0f318_FWm(qnq, n, n2, n3, n4)) {
            boolean bl = this.method_714a8ebb_Qnq(qnq, n, n2, n3);
            if (this.field_2092bf_Dne && bl || !this.field_2092bf_Dne && !bl) {
                qnq.method_ae303daa_FWm(n, n2, n3, this.field_21260d_FWm, this.method_83516086_Dne(qnq));
            }
        }
    }

    protected myY(int n, boolean bl) {
        super(n);
        this.field_2092bf_Dne = bl;
        this.method_21cbfe2c_Dne(true);
        this.method_82a88d64_Dne(null);
    }

    @Override
    public int method_9cb39123_Dne(Qnq qnq, int n, int n2, int n3) {
        return zKP.field_3f9bd7dc_CZC.field_21260d_FWm;
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_5e5f2002_Qnq = this.field_2092bf_Dne ? rbp.method_285881e4_Dne("redtorch_lit") : rbp.method_285881e4_Dne("redtorch");
    }

    @Override
    public void method_3e226590_Dne(Qnq qnq, int n, int n2, int n3, int n4, int n5) {
        if (this.field_2092bf_Dne) {
            qnq.method_58fe7b07_bzF(n, n2 - 1, n3, this.field_21260d_FWm);
            qnq.method_58fe7b07_bzF(n, n2 + 1, n3, this.field_21260d_FWm);
            qnq.method_58fe7b07_bzF(n - 1, n2, n3, this.field_21260d_FWm);
            qnq.method_58fe7b07_bzF(n + 1, n2, n3, this.field_21260d_FWm);
            qnq.method_58fe7b07_bzF(n, n2, n3 - 1, this.field_21260d_FWm);
            qnq.method_58fe7b07_bzF(n, n2, n3 + 1, this.field_21260d_FWm);
        }
    }

    @Override
    public int method_56b56428_FWm(Zpi zpi, int n, int n2, int n3, int n4) {
        return n4 == 0 ? this.method_79d378e7_Dne(zpi, n, n2, n3, n4) : 0;
    }

    @Override
    public boolean method_b51ddfb5_zGp(int n) {
        return n == zKP.field_4821929c_iNQ.field_21260d_FWm || n == zKP.field_3f9bd7dc_CZC.field_21260d_FWm;
    }

    @Override
    public void method_9cb39130_Dne(Qnq qnq, int n, int n2, int n3) {
        if (qnq.method_2dee76f_bzF(n, n2, n3) == 0) {
            super.method_9cb39130_Dne(qnq, n, n2, n3);
        }
        if (this.field_2092bf_Dne) {
            qnq.method_58fe7b07_bzF(n, n2 - 1, n3, this.field_21260d_FWm);
            qnq.method_58fe7b07_bzF(n, n2 + 1, n3, this.field_21260d_FWm);
            qnq.method_58fe7b07_bzF(n - 1, n2, n3, this.field_21260d_FWm);
            qnq.method_58fe7b07_bzF(n + 1, n2, n3, this.field_21260d_FWm);
            qnq.method_58fe7b07_bzF(n, n2, n3 - 1, this.field_21260d_FWm);
            qnq.method_58fe7b07_bzF(n, n2, n3 + 1, this.field_21260d_FWm);
        }
    }

    @Override
    public int method_83516086_Dne(Qnq qnq) {
        return 2;
    }

    private boolean method_714a8ebb_Qnq(Qnq qnq, int n, int n2, int n3) {
        int n4 = qnq.method_2dee76f_bzF(n, n2, n3);
        return n4 == 5 && qnq.method_9fbb4d65_Qnq(n, n2 - 1, n3, 0) ? true : (n4 == 3 && qnq.method_9fbb4d65_Qnq(n, n2, n3 - 1, 2) ? true : (n4 == 4 && qnq.method_9fbb4d65_Qnq(n, n2, n3 + 1, 3) ? true : (n4 == 1 && qnq.method_9fbb4d65_Qnq(n - 1, n2, n3, 4) ? true : n4 == 2 && qnq.method_9fbb4d65_Qnq(n + 1, n2, n3, 5))));
    }

    @Override
    public boolean method_ae128dcb_bzF() {
        return true;
    }

    @Override
    public int method_79d378e7_Dne(Zpi zpi, int n, int n2, int n3, int n4) {
        if (!this.field_2092bf_Dne) {
            return 0;
        }
        int n5 = zpi.method_2dee76f_bzF(n, n2, n3);
        return n5 == 5 && n4 == 1 ? 0 : (n5 == 3 && n4 == 3 ? 0 : (n5 == 4 && n4 == 2 ? 0 : (n5 == 1 && n4 == 5 ? 0 : (n5 == 2 && n4 == 4 ? 0 : 15))));
    }

    @Override
    public void method_ca828a1c_Dne(Qnq qnq, int n, int n2, int n3, Random random) {
        boolean bl = this.method_714a8ebb_Qnq(qnq, n, n2, n3);
        List list = (List)field_83b1c1b0_Dne.get(qnq);
        while (list != null && !list.isEmpty() && qnq.method_7c6f602d_FWm() - ((lAp)list.get((int)0)).field_2092af_Dne > 60L) {
            list.remove(0);
        }
        if (this.field_2092bf_Dne) {
            if (bl) {
                qnq.method_17d7ea9d_FWm(n, n2, n3, zKP.field_4821929c_iNQ.field_21260d_FWm, qnq.method_2dee76f_bzF(n, n2, n3), 3);
                if (this.method_f9bf47a8_Dne(qnq, n, n2, n3, true)) {
                    qnq.method_c961c6ee_Dne((float)n + 0.5f, (float)n2 + 0.5f, (float)n3 + 0.5f, "random.fizz", 0.5f, 2.6f + (qnq.field_7331eae7_Dne.nextFloat() - qnq.field_7331eae7_Dne.nextFloat()) * 0.8f);
                    for (int i = 0; i < 5; ++i) {
                        double d = (double)n + random.nextDouble() * 0.6 + 0.2;
                        double d2 = (double)n2 + random.nextDouble() * 0.6 + 0.2;
                        double d3 = (double)n3 + random.nextDouble() * 0.6 + 0.2;
                        qnq.method_8600ec24_Dne("smoke", d, d2, d3, 0.0, 0.0, 0.0);
                    }
                }
            }
        } else if (!bl && !this.method_f9bf47a8_Dne(qnq, n, n2, n3, false)) {
            qnq.method_17d7ea9d_FWm(n, n2, n3, zKP.field_3f9bd7dc_CZC.field_21260d_FWm, qnq.method_2dee76f_bzF(n, n2, n3), 3);
        }
    }

    private boolean method_f9bf47a8_Dne(Qnq qnq, int n, int n2, int n3, boolean bl) {
        if (!field_83b1c1b0_Dne.containsKey(qnq)) {
            field_83b1c1b0_Dne.put(qnq, new ArrayList());
        }
        List list = (List)field_83b1c1b0_Dne.get(qnq);
        if (bl) {
            list.add(new lAp(n, n2, n3, qnq.method_7c6f602d_FWm()));
        }
        int n4 = 0;
        for (int i = 0; i < list.size(); ++i) {
            lAp lAp2 = (lAp)list.get(i);
            if (lAp2.field_2092ae_Dne != n || lAp2.field_21260d_FWm != n2 || lAp2.field_2e5f1b_bzF != n3 || ++n4 < 8) continue;
            return true;
        }
        return false;
    }
}

