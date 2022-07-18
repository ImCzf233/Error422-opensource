package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class zjJ {
    private final List field_f27c122c_Dne = new ArrayList();
    private final int field_21260d_FWm;
    private int field_2e5f1b_bzF = 0;
    private int field_2d29f4_aFZ = 0;
    private int field_267cf5_Qnq = 0;
    private final int field_2092ae_Dne;

    public int method_7a46288d_Dne() {
        return this.field_f27c122c_Dne.size();
    }

    public void method_7a46289a_Dne() {
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

    public zjJ(int n, int n2) {
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
    }

    public void method_7c6f6039_FWm() {
        this.field_2e5f1b_bzF = 0;
        this.field_f27c122c_Dne.clear();
    }

    public int method_7c6f602c_FWm() {
        return this.field_2e5f1b_bzF;
    }

    public bSp method_b4ea3e0c_Dne(double d, double d2, double d3, double d4, double d5, double d6) {
        bSp bSp2;
        if (this.field_2e5f1b_bzF >= this.field_f27c122c_Dne.size()) {
            bSp2 = new bSp(d, d2, d3, d4, d5, d6);
            this.field_f27c122c_Dne.add(bSp2);
        } else {
            bSp2 = (bSp)this.field_f27c122c_Dne.get(this.field_2e5f1b_bzF);
            bSp2.method_7445baeb_FWm(d, d2, d3, d4, d5, d6);
        }
        ++this.field_2e5f1b_bzF;
        return bSp2;
    }
}

