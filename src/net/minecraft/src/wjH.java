package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class wjH {
    private final int field_2092ae_Dne;
    private List<wjH> field_f27c122c_Dne;
    private final int field_21260d_FWm;
    private final int field_267cf5_Qnq;
    private final int field_2e5f1b_bzF;
    private WbP field_36ed847_Dne;

    public int method_7a46288d_Dne() {
        return this.field_2092ae_Dne;
    }

    public wjH(int n, int n2, int n3, int n4) {
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_2e5f1b_bzF = n3;
        this.field_267cf5_Qnq = n4;
    }

    public WbP method_230866a6_Dne() {
        return this.field_36ed847_Dne;
    }

    public void method_ea14418b_Dne(List list) {
        if (this.field_36ed847_Dne != null) {
            list.add(this);
        } else if (this.field_f27c122c_Dne != null) {
            for (wjH wjH2 : this.field_f27c122c_Dne) {
                wjH2.method_ea14418b_Dne(list);
            }
        }
    }

    public String toString() {
        return "Slot{originX=" + this.field_2092ae_Dne + ", originY=" + this.field_21260d_FWm + ", width=" + this.field_2e5f1b_bzF + ", height=" + this.field_267cf5_Qnq + ", texture=" + this.field_36ed847_Dne + ", subSlots=" + this.field_f27c122c_Dne + '}';
    }

    public int method_7c6f602c_FWm() {
        return this.field_21260d_FWm;
    }

    public boolean method_8cd65a06_Dne(WbP wbP) {
        if (this.field_36ed847_Dne != null) {
            return false;
        }
        int n = wbP.method_7a46288d_Dne();
        int n2 = wbP.method_7c6f602c_FWm();
        if (n <= this.field_2e5f1b_bzF && n2 <= this.field_267cf5_Qnq) {
            wjH wjH2;
            if (n == this.field_2e5f1b_bzF && n2 == this.field_267cf5_Qnq) {
                this.field_36ed847_Dne = wbP;
                return true;
            }
            if (this.field_f27c122c_Dne == null) {
                this.field_f27c122c_Dne = new ArrayList(1);
                this.field_f27c122c_Dne.add(new wjH(this.field_2092ae_Dne, this.field_21260d_FWm, n, n2));
                int n3 = this.field_2e5f1b_bzF - n;
                int n4 = this.field_267cf5_Qnq - n2;
                if (n4 > 0 && n3 > 0) {
                    int n5;
                    int n6 = Math.max(this.field_267cf5_Qnq, n3);
                    if (n6 >= (n5 = Math.max(this.field_2e5f1b_bzF, n4))) {
                        this.field_f27c122c_Dne.add(new wjH(this.field_2092ae_Dne, this.field_21260d_FWm + n2, n, n4));
                        this.field_f27c122c_Dne.add(new wjH(this.field_2092ae_Dne + n, this.field_21260d_FWm, n3, this.field_267cf5_Qnq));
                    } else {
                        this.field_f27c122c_Dne.add(new wjH(this.field_2092ae_Dne + n, this.field_21260d_FWm, n3, n2));
                        this.field_f27c122c_Dne.add(new wjH(this.field_2092ae_Dne, this.field_21260d_FWm + n2, this.field_2e5f1b_bzF, n4));
                    }
                } else if (n3 == 0) {
                    this.field_f27c122c_Dne.add(new wjH(this.field_2092ae_Dne, this.field_21260d_FWm + n2, n, n4));
                } else if (n4 == 0) {
                    this.field_f27c122c_Dne.add(new wjH(this.field_2092ae_Dne + n, this.field_21260d_FWm, n3, n2));
                }
            }
            Iterator iterator = this.field_f27c122c_Dne.iterator();
            do {
                if (iterator.hasNext()) continue;
                return false;
            } while (!(wjH2 = (wjH)iterator.next()).method_8cd65a06_Dne(wbP));
            return true;
        }
        return false;
    }
}

