package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class qvF
extends byt {
    boolean[] field_3f1c59a_Dne = new boolean[4];
    int field_2092ae_Dne = 0;
    int[] field_3f1c589_Dne = new int[4];

    protected qvF(int n, KFd kFd) {
        super(n, kFd);
    }

    private boolean method_54527961_bzF(Qnq qnq, int n, int n2, int n3) {
        int n4 = qnq.method_2c2cf7bc_Dne(n, n2, n3);
        if (n4 != zKP.field_ceacd6d_ICU.field_21260d_FWm && n4 != zKP.field_79fca9d5_IYC.field_21260d_FWm && n4 != zKP.field_2c863000_LVR.field_21260d_FWm && n4 != zKP.field_fa1a6f1_ZfC.field_21260d_FWm && n4 != zKP.field_4980d038_TKg.field_21260d_FWm) {
            if (n4 == 0) {
                return false;
            }
            KFd kFd = zKP.field_8374b848_Dne[n4].field_368fd23_Dne;
            return kFd == KFd.field_7ec16ee_tgc ? true : kFd.method_ae128dcb_bzF();
        }
        return true;
    }

    private void method_d6a0f314_FWm(Qnq qnq, int n, int n2, int n3, int n4) {
        if (this.method_714a8ebb_Qnq(qnq, n, n2, n3)) {
            int n5 = qnq.method_2c2cf7bc_Dne(n, n2, n3);
            if (n5 > 0) {
                if (this.field_368fd23_Dne == KFd.field_5b96677_IjH) {
                    this.method_5452795d_bzF(qnq, n, n2, n3);
                } else {
                    zKP.field_8374b848_Dne[n5].method_fd7de26f_FWm(qnq, n, n2, n3, qnq.method_2dee76f_bzF(n, n2, n3), 0);
                }
            }
            qnq.method_17d7ea9d_FWm(n, n2, n3, this.field_21260d_FWm, n4, 3);
        }
    }

    private boolean[] method_f9be95c5_Dne(Qnq qnq, int n, int n2, int n3) {
        int n4;
        int n5;
        for (n5 = 0; n5 < 4; ++n5) {
            this.field_3f1c589_Dne[n5] = 1000;
            n4 = n;
            int n6 = n3;
            if (n5 == 0) {
                n4 = n - 1;
            }
            if (n5 == 1) {
                ++n4;
            }
            if (n5 == 2) {
                n6 = n3 - 1;
            }
            if (n5 == 3) {
                ++n6;
            }
            if (this.method_54527961_bzF(qnq, n4, n2, n6) || qnq.method_d9802b31_Dne(n4, n2, n6) == this.field_368fd23_Dne && qnq.method_2dee76f_bzF(n4, n2, n6) == 0) continue;
            this.field_3f1c589_Dne[n5] = this.method_54527961_bzF(qnq, n4, n2 - 1, n6) ? this.method_3e226583_Dne(qnq, n4, n2, n6, 1, n5) : 0;
        }
        n5 = this.field_3f1c589_Dne[0];
        for (n4 = 1; n4 < 4; ++n4) {
            if (this.field_3f1c589_Dne[n4] >= n5) continue;
            n5 = this.field_3f1c589_Dne[n4];
        }
        for (n4 = 0; n4 < 4; ++n4) {
            this.field_3f1c59a_Dne[n4] = this.field_3f1c589_Dne[n4] == n5;
        }
        return this.field_3f1c59a_Dne;
    }

    @Override
    public boolean method_d44b4596_zGp() {
        return false;
    }

    private void method_714a8eb7_Qnq(Qnq qnq, int n, int n2, int n3) {
        int n4 = qnq.method_2dee76f_bzF(n, n2, n3);
        qnq.method_17d7ea9d_FWm(n, n2, n3, this.field_21260d_FWm + 1, n4, 2);
    }

    private int method_3e226583_Dne(Qnq qnq, int n, int n2, int n3, int n4, int n5) {
        int n6 = 1000;
        for (int i = 0; i < 4; ++i) {
            int n7;
            if (i == 0 && n5 == 1 || i == 1 && n5 == 0 || i == 2 && n5 == 3 || i == 3 && n5 == 2) continue;
            int n8 = n;
            int n9 = n3;
            if (i == 0) {
                n8 = n - 1;
            }
            if (i == 1) {
                ++n8;
            }
            if (i == 2) {
                n9 = n3 - 1;
            }
            if (i == 3) {
                ++n9;
            }
            if (this.method_54527961_bzF(qnq, n8, n2, n9) || qnq.method_d9802b31_Dne(n8, n2, n9) == this.field_368fd23_Dne && qnq.method_2dee76f_bzF(n8, n2, n9) == 0) continue;
            if (!this.method_54527961_bzF(qnq, n8, n2 - 1, n9)) {
                return n4;
            }
            if (n4 >= 4 || (n7 = this.method_3e226583_Dne(qnq, n8, n2, n9, n4 + 1, i)) >= n6) continue;
            n6 = n7;
        }
        return n6;
    }

    @Override
    public boolean method_fbabf7f3_Dne(Zpi zpi, int n, int n2, int n3) {
        return this.field_368fd23_Dne != KFd.field_5b96677_IjH;
    }

    protected int method_d6a0f307_FWm(Qnq qnq, int n, int n2, int n3, int n4) {
        int n5 = this.method_54527950_bzF(qnq, n, n2, n3);
        if (n5 < 0) {
            return n4;
        }
        if (n5 == 0) {
            ++this.field_2092ae_Dne;
        }
        if (n5 >= 8) {
            n5 = 0;
        }
        return n4 >= 0 && n5 >= n4 ? n4 : n5;
    }

    @Override
    public void method_9cb39130_Dne(Qnq qnq, int n, int n2, int n3) {
        super.method_9cb39130_Dne(qnq, n, n2, n3);
        if (qnq.method_2c2cf7bc_Dne(n, n2, n3) == this.field_21260d_FWm) {
            qnq.method_ae303daa_FWm(n, n2, n3, this.field_21260d_FWm, this.method_83516086_Dne(qnq));
        }
    }

    private boolean method_714a8ebb_Qnq(Qnq qnq, int n, int n2, int n3) {
        KFd kFd = qnq.method_d9802b31_Dne(n, n2, n3);
        return kFd == this.field_368fd23_Dne ? false : (kFd == KFd.field_5b96677_IjH ? false : !this.method_54527961_bzF(qnq, n, n2, n3));
    }

    @Override
    public void method_ca828a1c_Dne(Qnq qnq, int n, int n2, int n3, Random random) {
        int n4;
        int n5 = this.method_54527950_bzF(qnq, n, n2, n3);
        int n6 = 1;
        if (this.field_368fd23_Dne == KFd.field_5b96677_IjH && !qnq.field_3690d00_Dne.field_2092bf_Dne) {
            n6 = 2;
        }
        boolean bl = true;
        if (n5 > 0) {
            int n7 = -100;
            this.field_2092ae_Dne = 0;
            int n8 = this.method_d6a0f307_FWm(qnq, n - 1, n2, n3, n7);
            n8 = this.method_d6a0f307_FWm(qnq, n + 1, n2, n3, n8);
            n8 = this.method_d6a0f307_FWm(qnq, n, n2, n3 - 1, n8);
            n4 = (n8 = this.method_d6a0f307_FWm(qnq, n, n2, n3 + 1, n8)) + n6;
            if (n4 >= 8 || n8 < 0) {
                n4 = -1;
            }
            if (this.method_54527950_bzF(qnq, n, n2 + 1, n3) >= 0) {
                int n9 = this.method_54527950_bzF(qnq, n, n2 + 1, n3);
                n4 = n9 >= 8 ? n9 : n9 + 8;
            }
            if (this.field_2092ae_Dne >= 2 && this.field_368fd23_Dne == KFd.field_1411d34d_div) {
                if (qnq.method_d9802b31_Dne(n, n2 - 1, n3).method_7a46289e_Dne()) {
                    n4 = 0;
                } else if (qnq.method_d9802b31_Dne(n, n2 - 1, n3) == this.field_368fd23_Dne && qnq.method_2dee76f_bzF(n, n2 - 1, n3) == 0) {
                    n4 = 0;
                }
            }
            if (this.field_368fd23_Dne == KFd.field_5b96677_IjH && n5 < 8 && n4 < 8 && n4 > n5 && random.nextInt(4) != 0) {
                n4 = n5;
                bl = false;
            }
            if (n4 == n5) {
                if (bl) {
                    this.method_714a8eb7_Qnq(qnq, n, n2, n3);
                }
            } else {
                n5 = n4;
                if (n4 < 0) {
                    qnq.method_2e7161e6_Qnq(n, n2, n3);
                } else {
                    qnq.method_d4dc89ed_Dne(n, n2, n3, n4, 2);
                    qnq.method_ae303daa_FWm(n, n2, n3, this.field_21260d_FWm, this.method_83516086_Dne(qnq));
                    qnq.method_58fe7b07_bzF(n, n2, n3, this.field_21260d_FWm);
                }
            }
        } else {
            this.method_714a8eb7_Qnq(qnq, n, n2, n3);
        }
        if (this.method_714a8ebb_Qnq(qnq, n, n2 - 1, n3)) {
            if (this.field_368fd23_Dne == KFd.field_5b96677_IjH && qnq.method_d9802b31_Dne(n, n2 - 1, n3) == KFd.field_1411d34d_div) {
                qnq.method_2ee8c47d_FWm(n, n2 - 1, n3, zKP.field_37e6aed_Dne.field_21260d_FWm);
                this.method_5452795d_bzF(qnq, n, n2 - 1, n3);
                return;
            }
            if (n5 >= 8) {
                this.method_d6a0f314_FWm(qnq, n, n2 - 1, n3, n5);
            } else {
                this.method_d6a0f314_FWm(qnq, n, n2 - 1, n3, n5 + 8);
            }
        } else if (n5 >= 0 && (n5 == 0 || this.method_54527961_bzF(qnq, n, n2 - 1, n3))) {
            boolean[] blArray = this.method_f9be95c5_Dne(qnq, n, n2, n3);
            n4 = n5 + n6;
            if (n5 >= 8) {
                n4 = 1;
            }
            if (n4 >= 8) {
                return;
            }
            if (blArray[0]) {
                this.method_d6a0f314_FWm(qnq, n - 1, n2, n3, n4);
            }
            if (blArray[1]) {
                this.method_d6a0f314_FWm(qnq, n + 1, n2, n3, n4);
            }
            if (blArray[2]) {
                this.method_d6a0f314_FWm(qnq, n, n2, n3 - 1, n4);
            }
            if (blArray[3]) {
                this.method_d6a0f314_FWm(qnq, n, n2, n3 + 1, n4);
            }
        }
    }
}

