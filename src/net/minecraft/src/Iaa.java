package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class Iaa
extends Oaf {
    protected gDn field_375b13b_Dne;

    protected boolean method_871a4f08_Dne(Qnq qnq, int n, int n2, int n3, boolean bl, int n4, int n5) {
        int n6 = qnq.method_2c2cf7bc_Dne(n, n2, n3);
        if (n6 == this.field_21260d_FWm) {
            int n7 = qnq.method_2dee76f_bzF(n, n2, n3);
            int n8 = n7 & 7;
            if (n5 == 1 && (n8 == 0 || n8 == 4 || n8 == 5)) {
                return false;
            }
            if (n5 == 0 && (n8 == 1 || n8 == 2 || n8 == 3)) {
                return false;
            }
            if ((n7 & 8) != 0) {
                if (qnq.method_6382f365_kGO(n, n2, n3)) {
                    return true;
                }
                return this.method_863279c6_Dne(qnq, n, n2, n3, n7, bl, n4 + 1);
            }
        }
        return false;
    }

    @Override
    protected void method_862abf73_Dne(Qnq qnq, int n, int n2, int n3, int n4, int n5, int n6) {
        boolean bl = qnq.method_6382f365_kGO(n, n2, n3);
        bl = bl || this.method_863279c6_Dne(qnq, n, n2, n3, n4, true, 0) || this.method_863279c6_Dne(qnq, n, n2, n3, n4, false, 0);
        boolean bl2 = false;
        if (bl && (n4 & 8) == 0) {
            qnq.method_d4dc89ed_Dne(n, n2, n3, n5 | 8, 3);
            bl2 = true;
        } else if (!bl && (n4 & 8) != 0) {
            qnq.method_d4dc89ed_Dne(n, n2, n3, n5, 3);
            bl2 = true;
        }
        if (bl2) {
            qnq.method_58fe7b07_bzF(n, n2 - 1, n3, this.field_21260d_FWm);
            if (n5 == 2 || n5 == 3 || n5 == 4 || n5 == 5) {
                qnq.method_58fe7b07_bzF(n, n2 + 1, n3, this.field_21260d_FWm);
            }
        }
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        return (n2 & 8) == 0 ? this.field_5e5f2002_Qnq : this.field_375b13b_Dne;
    }

    protected boolean method_863279c6_Dne(Qnq qnq, int n, int n2, int n3, int n4, boolean bl, int n5) {
        if (n5 >= 8) {
            return false;
        }
        int n6 = n4 & 7;
        boolean bl2 = true;
        switch (n6) {
            case 0: {
                if (bl) {
                    ++n3;
                    break;
                }
                --n3;
                break;
            }
            case 1: {
                if (bl) {
                    --n;
                    break;
                }
                ++n;
                break;
            }
            case 2: {
                if (bl) {
                    --n;
                } else {
                    ++n;
                    ++n2;
                    bl2 = false;
                }
                n6 = 1;
                break;
            }
            case 3: {
                if (bl) {
                    --n;
                    ++n2;
                    bl2 = false;
                } else {
                    ++n;
                }
                n6 = 1;
                break;
            }
            case 4: {
                if (bl) {
                    ++n3;
                } else {
                    --n3;
                    ++n2;
                    bl2 = false;
                }
                n6 = 0;
                break;
            }
            case 5: {
                if (bl) {
                    ++n3;
                    ++n2;
                    bl2 = false;
                } else {
                    --n3;
                }
                n6 = 0;
            }
        }
        return this.method_871a4f08_Dne(qnq, n, n2, n3, bl, n5, n6) ? true : bl2 && this.method_871a4f08_Dne(qnq, n, n2 - 1, n3, bl, n5, n6);
    }

    protected Iaa(int n) {
        super(n, true);
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        super.method_845caac7_Dne(rbp);
        this.field_375b13b_Dne = rbp.method_285881e4_Dne(this.method_4a7b1d9f_Qnq() + "_powered");
    }
}

