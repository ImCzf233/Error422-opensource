package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class YgL
extends VHz {
    private NMq field_36a761a_Dne;

    @Override
    protected float method_ae128db7_bzF() {
        return 0.5f;
    }

    public YgL(Qnq qnq, double d, double d2, double d3, int n) {
        this(qnq, d, d2, d3, new NMq(dEr.field_3682442_Dne, 1, n));
    }

    @Override
    protected float method_d44b4582_zGp() {
        return -20.0f;
    }

    public YgL(Qnq qnq) {
        super(qnq);
    }

    public YgL(Qnq qnq, FUH fUH, NMq nMq) {
        super(qnq, fUH);
        this.field_36a761a_Dne = nMq;
    }

    public YgL(Qnq qnq, FUH fUH, int n) {
        this(qnq, fUH, new NMq(dEr.field_3682442_Dne, 1, n));
    }

    @Override
    protected float method_7ad387f3_DyG() {
        return 0.05f;
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        super.method_8d4fb917_Dne(wkD);
        if (this.field_36a761a_Dne != null) {
            wkD.method_312ec00d_Dne("Potion", this.field_36a761a_Dne.method_7dab90f8_Dne(new WkD()));
        }
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        super.method_66a36cd8_FWm(wkD);
        if (wkD.method_8f501fe8_Dne("Potion")) {
            this.field_36a761a_Dne = NMq.method_7da70e76_Dne(wkD.method_2851c945_Dne("Potion"));
        } else {
            this.method_ce7f5da9_Dne(wkD.method_8f501fd7_Dne("potionValue"));
        }
        if (this.field_36a761a_Dne == null) {
            this.method_5d73f9d_g_();
        }
    }

    @Override
    protected void method_c1ff67d0_Dne(wHH wHH2) {
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            bSp bSp2;
            List<FUH> list;
            List<NAx> list2 = dEr.field_3682442_Dne.method_c9635692_Dne(this.field_36a761a_Dne);
            if (list2 != null && !list2.isEmpty() && (list = this.field_36c4f18_Dne.method_9314b7e8_Dne(FUH.class, bSp2 = this.field_373a3ed_Dne.method_b78565d7_FWm(4.0, 2.0, 4.0))) != null && !list.isEmpty()) {
                for (FUH fUH : list) {
                    double d = this.method_bb7dd80e_Dne(fUH);
                    if (!(d < 16.0)) continue;
                    double d2 = 1.0 - Math.sqrt(d) / 4.0;
                    if (fUH == wHH2.field_37b45e5_Dne) {
                        d2 = 1.0;
                    }
                    for (NAx nAx : list2) {
                        int n = nAx.method_7a46288d_Dne();
                        if (SXd.field_83633108_Dne[n].method_7a46289e_Dne()) {
                            SXd.field_83633108_Dne[n].method_640cec35_Dne(this.method_23007a92_Dne(), fUH, nAx.method_ae128dba_bzF(), d2);
                            continue;
                        }
                        int n2 = (int)(d2 * (double)nAx.method_7c6f602c_FWm() + 0.5);
                        if (n2 <= 20) continue;
                        fUH.method_fe8e2b7b_Qnq(new NAx(n, n2, nAx.method_ae128dba_bzF()));
                    }
                }
            }
            this.field_36c4f18_Dne.method_57aed1c2_Qnq(2002, (int)Math.round(this.field_2f0dd3_div), (int)Math.round(this.field_22c5fd_IjH), (int)Math.round(this.field_334487_mrb), this.method_7a46288d_Dne());
            this.method_5d73f9d_g_();
        }
    }

    public YgL(Qnq qnq, double d, double d2, double d3, NMq nMq) {
        super(qnq, d, d2, d3);
        this.field_36a761a_Dne = nMq;
    }

    public void method_ce7f5da9_Dne(int n) {
        if (this.field_36a761a_Dne == null) {
            this.field_36a761a_Dne = new NMq(dEr.field_3682442_Dne, 1, 0);
        }
        this.field_36a761a_Dne.method_ce7f5da9_Dne(n);
    }

    public int method_7a46288d_Dne() {
        if (this.field_36a761a_Dne == null) {
            this.field_36a761a_Dne = new NMq(dEr.field_3682442_Dne, 1, 0);
        }
        return this.field_36a761a_Dne.method_907a9d14_Qnq();
    }
}

