package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class ziS {
    private final int field_2092ae_Dne;
    private final int field_21260d_FWm;
    private final List field_f27c122c_Dne = new ArrayList();
    private int field_2d29f4_aFZ = 0;
    private int field_2e5f1b_bzF = 0;
    private int field_267cf5_Qnq = 0;

    public void method_7a46289a_Dne() {
        if (!this.method_7a46289e_Dne()) {
            if (this.field_2e5f1b_bzF > this.field_267cf5_Qnq) {
                this.field_267cf5_Qnq = this.field_2e5f1b_bzF;
            }
            if (this.field_2d29f4_aFZ++ == this.field_2092ae_Dne) {
                int n = Math.max(this.field_267cf5_Qnq, this.field_f27c122c_Dne.size() - this.field_21260d_FWm);
                while (this.field_f27c122c_Dne.size() > n) {
                    this.field_f27c122c_Dne.remove(n);
                }
                this.field_267cf5_Qnq = 0;
                this.field_2d29f4_aFZ = 0;
            }
            this.field_2e5f1b_bzF = 0;
        }
    }

    public int method_7a46288d_Dne() {
        return this.field_f27c122c_Dne.size();
    }

    private boolean method_7a46289e_Dne() {
        return this.field_21260d_FWm < 0 || this.field_2092ae_Dne < 0;
    }

    public int method_7c6f602c_FWm() {
        return this.field_2e5f1b_bzF;
    }

    public chN method_e4505d6c_Dne(double d, double d2, double d3) {
        chN chN2;
        if (this.method_7a46289e_Dne()) {
            return new chN(this, d, d2, d3);
        }
        if (this.field_2e5f1b_bzF >= this.field_f27c122c_Dne.size()) {
            chN2 = new chN(this, d, d2, d3);
            this.field_f27c122c_Dne.add(chN2);
        } else {
            chN2 = (chN)this.field_f27c122c_Dne.get(this.field_2e5f1b_bzF);
            chN2.method_b78624ed_FWm(d, d2, d3);
        }
        ++this.field_2e5f1b_bzF;
        return chN2;
    }

    public ziS(int n, int n2) {
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
    }

    public void method_7c6f6039_FWm() {
        if (!this.method_7a46289e_Dne()) {
            this.field_2e5f1b_bzF = 0;
            this.field_f27c122c_Dne.clear();
        }
    }
}

