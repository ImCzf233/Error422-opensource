package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class rKp {
    final Oaf field_36b3438_Dne;
    private List field_f27c122c_Dne;
    private int field_21260d_FWm;
    private int field_2e5f1b_bzF;
    private int field_2092ae_Dne;
    private final boolean field_2092bf_Dne;
    private Qnq field_36c4f18_Dne;

    private boolean method_930755d5_FWm(rKp rKp2) {
        return this.method_b9b3a214_Dne(rKp2) ? true : (this.field_f27c122c_Dne.size() == 2 ? false : (this.field_f27c122c_Dne.isEmpty() ? true : true));
    }

    private boolean method_b9b3a214_Dne(rKp rKp2) {
        for (int i = 0; i < this.field_f27c122c_Dne.size(); ++i) {
            EyB eyB = (EyB)this.field_f27c122c_Dne.get(i);
            if (eyB.field_2092ae_Dne != rKp2.field_2092ae_Dne || eyB.field_2e5f1b_bzF != rKp2.field_2e5f1b_bzF) continue;
            return true;
        }
        return false;
    }

    public void method_174c49a_Dne(boolean bl, boolean bl2) {
        boolean bl3 = this.method_2dee780_bzF(this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF - 1);
        boolean bl4 = this.method_2dee780_bzF(this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF + 1);
        boolean bl5 = this.method_2dee780_bzF(this.field_2092ae_Dne - 1, this.field_21260d_FWm, this.field_2e5f1b_bzF);
        boolean bl6 = this.method_2dee780_bzF(this.field_2092ae_Dne + 1, this.field_21260d_FWm, this.field_2e5f1b_bzF);
        int n = -1;
        if ((bl3 || bl4) && !bl5 && !bl6) {
            n = 0;
        }
        if ((bl5 || bl6) && !bl3 && !bl4) {
            n = 1;
        }
        if (!this.field_2092bf_Dne) {
            if (bl4 && bl6 && !bl3 && !bl5) {
                n = 6;
            }
            if (bl4 && bl5 && !bl3 && !bl6) {
                n = 7;
            }
            if (bl3 && bl5 && !bl4 && !bl6) {
                n = 8;
            }
            if (bl3 && bl6 && !bl4 && !bl5) {
                n = 9;
            }
        }
        if (n == -1) {
            if (bl3 || bl4) {
                n = 0;
            }
            if (bl5 || bl6) {
                n = 1;
            }
            if (!this.field_2092bf_Dne) {
                if (bl) {
                    if (bl4 && bl6) {
                        n = 6;
                    }
                    if (bl5 && bl4) {
                        n = 7;
                    }
                    if (bl6 && bl3) {
                        n = 9;
                    }
                    if (bl3 && bl5) {
                        n = 8;
                    }
                } else {
                    if (bl3 && bl5) {
                        n = 8;
                    }
                    if (bl6 && bl3) {
                        n = 9;
                    }
                    if (bl5 && bl4) {
                        n = 7;
                    }
                    if (bl4 && bl6) {
                        n = 6;
                    }
                }
            }
        }
        if (n == 0) {
            if (Oaf.method_3036b9d3_FWm(this.field_36c4f18_Dne, this.field_2092ae_Dne, this.field_21260d_FWm + 1, this.field_2e5f1b_bzF - 1)) {
                n = 4;
            }
            if (Oaf.method_3036b9d3_FWm(this.field_36c4f18_Dne, this.field_2092ae_Dne, this.field_21260d_FWm + 1, this.field_2e5f1b_bzF + 1)) {
                n = 5;
            }
        }
        if (n == 1) {
            if (Oaf.method_3036b9d3_FWm(this.field_36c4f18_Dne, this.field_2092ae_Dne + 1, this.field_21260d_FWm + 1, this.field_2e5f1b_bzF)) {
                n = 2;
            }
            if (Oaf.method_3036b9d3_FWm(this.field_36c4f18_Dne, this.field_2092ae_Dne - 1, this.field_21260d_FWm + 1, this.field_2e5f1b_bzF)) {
                n = 3;
            }
        }
        if (n < 0) {
            n = 0;
        }
        this.method_ce7f5da9_Dne(n);
        int n2 = n;
        if (this.field_2092bf_Dne) {
            n2 = this.field_36c4f18_Dne.method_2dee76f_bzF(this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF) & 8 | n;
        }
        if (bl2 || this.field_36c4f18_Dne.method_2dee76f_bzF(this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF) != n2) {
            this.field_36c4f18_Dne.method_d4dc89ed_Dne(this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF, n2, 3);
            for (int i = 0; i < this.field_f27c122c_Dne.size(); ++i) {
                rKp rKp2 = this.method_9c892853_Dne((EyB)this.field_f27c122c_Dne.get(i));
                if (rKp2 == null) continue;
                rKp2.method_7a46289a_Dne();
                if (!rKp2.method_930755d5_FWm(this)) continue;
                rKp2.method_b9b3a210_Dne(this);
            }
        }
    }

    private rKp method_9c892853_Dne(EyB eyB) {
        return Oaf.method_3036b9d3_FWm(this.field_36c4f18_Dne, eyB.field_2092ae_Dne, eyB.field_21260d_FWm, eyB.field_2e5f1b_bzF) ? new rKp(this.field_36b3438_Dne, this.field_36c4f18_Dne, eyB.field_2092ae_Dne, eyB.field_21260d_FWm, eyB.field_2e5f1b_bzF) : (Oaf.method_3036b9d3_FWm(this.field_36c4f18_Dne, eyB.field_2092ae_Dne, eyB.field_21260d_FWm + 1, eyB.field_2e5f1b_bzF) ? new rKp(this.field_36b3438_Dne, this.field_36c4f18_Dne, eyB.field_2092ae_Dne, eyB.field_21260d_FWm + 1, eyB.field_2e5f1b_bzF) : (Oaf.method_3036b9d3_FWm(this.field_36c4f18_Dne, eyB.field_2092ae_Dne, eyB.field_21260d_FWm - 1, eyB.field_2e5f1b_bzF) ? new rKp(this.field_36b3438_Dne, this.field_36c4f18_Dne, eyB.field_2092ae_Dne, eyB.field_21260d_FWm - 1, eyB.field_2e5f1b_bzF) : null));
    }

    private boolean method_2c2cf7cd_Dne(int n, int n2, int n3) {
        return Oaf.method_3036b9d3_FWm(this.field_36c4f18_Dne, n, n2, n3) ? true : (Oaf.method_3036b9d3_FWm(this.field_36c4f18_Dne, n, n2 + 1, n3) ? true : Oaf.method_3036b9d3_FWm(this.field_36c4f18_Dne, n, n2 - 1, n3));
    }

    private void method_ce7f5da9_Dne(int n) {
        this.field_f27c122c_Dne.clear();
        if (n == 0) {
            this.field_f27c122c_Dne.add(new EyB(this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF - 1));
            this.field_f27c122c_Dne.add(new EyB(this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF + 1));
        } else if (n == 1) {
            this.field_f27c122c_Dne.add(new EyB(this.field_2092ae_Dne - 1, this.field_21260d_FWm, this.field_2e5f1b_bzF));
            this.field_f27c122c_Dne.add(new EyB(this.field_2092ae_Dne + 1, this.field_21260d_FWm, this.field_2e5f1b_bzF));
        } else if (n == 2) {
            this.field_f27c122c_Dne.add(new EyB(this.field_2092ae_Dne - 1, this.field_21260d_FWm, this.field_2e5f1b_bzF));
            this.field_f27c122c_Dne.add(new EyB(this.field_2092ae_Dne + 1, this.field_21260d_FWm + 1, this.field_2e5f1b_bzF));
        } else if (n == 3) {
            this.field_f27c122c_Dne.add(new EyB(this.field_2092ae_Dne - 1, this.field_21260d_FWm + 1, this.field_2e5f1b_bzF));
            this.field_f27c122c_Dne.add(new EyB(this.field_2092ae_Dne + 1, this.field_21260d_FWm, this.field_2e5f1b_bzF));
        } else if (n == 4) {
            this.field_f27c122c_Dne.add(new EyB(this.field_2092ae_Dne, this.field_21260d_FWm + 1, this.field_2e5f1b_bzF - 1));
            this.field_f27c122c_Dne.add(new EyB(this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF + 1));
        } else if (n == 5) {
            this.field_f27c122c_Dne.add(new EyB(this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF - 1));
            this.field_f27c122c_Dne.add(new EyB(this.field_2092ae_Dne, this.field_21260d_FWm + 1, this.field_2e5f1b_bzF + 1));
        } else if (n == 6) {
            this.field_f27c122c_Dne.add(new EyB(this.field_2092ae_Dne + 1, this.field_21260d_FWm, this.field_2e5f1b_bzF));
            this.field_f27c122c_Dne.add(new EyB(this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF + 1));
        } else if (n == 7) {
            this.field_f27c122c_Dne.add(new EyB(this.field_2092ae_Dne - 1, this.field_21260d_FWm, this.field_2e5f1b_bzF));
            this.field_f27c122c_Dne.add(new EyB(this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF + 1));
        } else if (n == 8) {
            this.field_f27c122c_Dne.add(new EyB(this.field_2092ae_Dne - 1, this.field_21260d_FWm, this.field_2e5f1b_bzF));
            this.field_f27c122c_Dne.add(new EyB(this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF - 1));
        } else if (n == 9) {
            this.field_f27c122c_Dne.add(new EyB(this.field_2092ae_Dne + 1, this.field_21260d_FWm, this.field_2e5f1b_bzF));
            this.field_f27c122c_Dne.add(new EyB(this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF - 1));
        }
    }

    private boolean method_a6aca7ce_FWm(int n, int n2, int n3) {
        for (int i = 0; i < this.field_f27c122c_Dne.size(); ++i) {
            EyB eyB = (EyB)this.field_f27c122c_Dne.get(i);
            if (eyB.field_2092ae_Dne != n || eyB.field_2e5f1b_bzF != n3) continue;
            return true;
        }
        return false;
    }

    private boolean method_2dee780_bzF(int n, int n2, int n3) {
        rKp rKp2 = this.method_9c892853_Dne(new EyB(n, n2, n3));
        if (rKp2 == null) {
            return false;
        }
        rKp2.method_7a46289a_Dne();
        return rKp2.method_930755d5_FWm(this);
    }

    private void method_b9b3a210_Dne(rKp rKp2) {
        this.field_f27c122c_Dne.add(new EyB(rKp2.field_2092ae_Dne, rKp2.field_21260d_FWm, rKp2.field_2e5f1b_bzF));
        boolean bl = this.method_a6aca7ce_FWm(this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF - 1);
        boolean bl2 = this.method_a6aca7ce_FWm(this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF + 1);
        boolean bl3 = this.method_a6aca7ce_FWm(this.field_2092ae_Dne - 1, this.field_21260d_FWm, this.field_2e5f1b_bzF);
        boolean bl4 = this.method_a6aca7ce_FWm(this.field_2092ae_Dne + 1, this.field_21260d_FWm, this.field_2e5f1b_bzF);
        int n = -1;
        if (bl || bl2) {
            n = 0;
        }
        if (bl3 || bl4) {
            n = 1;
        }
        if (!this.field_2092bf_Dne) {
            if (bl2 && bl4 && !bl && !bl3) {
                n = 6;
            }
            if (bl2 && bl3 && !bl && !bl4) {
                n = 7;
            }
            if (bl && bl3 && !bl2 && !bl4) {
                n = 8;
            }
            if (bl && bl4 && !bl2 && !bl3) {
                n = 9;
            }
        }
        if (n == 0) {
            if (Oaf.method_3036b9d3_FWm(this.field_36c4f18_Dne, this.field_2092ae_Dne, this.field_21260d_FWm + 1, this.field_2e5f1b_bzF - 1)) {
                n = 4;
            }
            if (Oaf.method_3036b9d3_FWm(this.field_36c4f18_Dne, this.field_2092ae_Dne, this.field_21260d_FWm + 1, this.field_2e5f1b_bzF + 1)) {
                n = 5;
            }
        }
        if (n == 1) {
            if (Oaf.method_3036b9d3_FWm(this.field_36c4f18_Dne, this.field_2092ae_Dne + 1, this.field_21260d_FWm + 1, this.field_2e5f1b_bzF)) {
                n = 2;
            }
            if (Oaf.method_3036b9d3_FWm(this.field_36c4f18_Dne, this.field_2092ae_Dne - 1, this.field_21260d_FWm + 1, this.field_2e5f1b_bzF)) {
                n = 3;
            }
        }
        if (n < 0) {
            n = 0;
        }
        int n2 = n;
        if (this.field_2092bf_Dne) {
            n2 = this.field_36c4f18_Dne.method_2dee76f_bzF(this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF) & 8 | n;
        }
        this.field_36c4f18_Dne.method_d4dc89ed_Dne(this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF, n2, 3);
    }

    public rKp(Oaf oaf, Qnq qnq, int n, int n2, int n3) {
        this.field_36b3438_Dne = oaf;
        this.field_f27c122c_Dne = new ArrayList();
        this.field_36c4f18_Dne = qnq;
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_2e5f1b_bzF = n3;
        int n4 = qnq.method_2c2cf7bc_Dne(n, n2, n3);
        int n5 = qnq.method_2dee76f_bzF(n, n2, n3);
        if (((Oaf)zKP.field_8374b848_Dne[n4]).field_2092bf_Dne) {
            this.field_2092bf_Dne = true;
            n5 &= 0xFFFFFFF7;
        } else {
            this.field_2092bf_Dne = false;
        }
        this.method_ce7f5da9_Dne(n5);
    }

    private void method_7a46289a_Dne() {
        for (int i = 0; i < this.field_f27c122c_Dne.size(); ++i) {
            rKp rKp2 = this.method_9c892853_Dne((EyB)this.field_f27c122c_Dne.get(i));
            if (rKp2 != null && rKp2.method_b9b3a214_Dne(this)) {
                this.field_f27c122c_Dne.set(i, new EyB(rKp2.field_2092ae_Dne, rKp2.field_21260d_FWm, rKp2.field_2e5f1b_bzF));
                continue;
            }
            this.field_f27c122c_Dne.remove(i--);
        }
    }

    protected int method_7a46288d_Dne() {
        int n = 0;
        if (this.method_2c2cf7cd_Dne(this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF - 1)) {
            ++n;
        }
        if (this.method_2c2cf7cd_Dne(this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF + 1)) {
            ++n;
        }
        if (this.method_2c2cf7cd_Dne(this.field_2092ae_Dne - 1, this.field_21260d_FWm, this.field_2e5f1b_bzF)) {
            ++n;
        }
        if (this.method_2c2cf7cd_Dne(this.field_2092ae_Dne + 1, this.field_21260d_FWm, this.field_2e5f1b_bzF)) {
            ++n;
        }
        return n;
    }
}

