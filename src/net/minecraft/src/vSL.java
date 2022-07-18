package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class vSL {
    private Tfm field_36d8db1_Dne = new Tfm();
    private long field_2092af_Dne = 0L;
    private List field_f27c122c_Dne = new ArrayList();
    private final tgc field_37c1c1c_Dne;

    public OdI[] method_920d50f4_Dne(int n, int n2) {
        return this.method_904893f1_Dne((int)n, (int)n2).field_83618953_Dne;
    }

    public vSL(tgc tgc2) {
        this.field_37c1c1c_Dne = tgc2;
    }

    static tgc method_6b3c6619_Dne(vSL vSL2) {
        return vSL2.field_37c1c1c_Dne;
    }

    public void method_7a46289a_Dne() {
        long l = System.currentTimeMillis();
        long l2 = l - this.field_2092af_Dne;
        if (l2 > 7500L || l2 < 0L) {
            this.field_2092af_Dne = l;
            for (int i = 0; i < this.field_f27c122c_Dne.size(); ++i) {
                RPx rPx = (RPx)this.field_f27c122c_Dne.get(i);
                long l3 = l - rPx.field_2092af_Dne;
                if (l3 <= 30000L && l3 >= 0L) continue;
                this.field_f27c122c_Dne.remove(i--);
                long l4 = (long)rPx.field_2092ae_Dne & 0xFFFFFFFFL | ((long)rPx.field_21260d_FWm & 0xFFFFFFFFL) << 32;
                this.field_36d8db1_Dne.method_a2a9a4e7_FWm(l4);
            }
        }
    }

    public RPx method_904893f1_Dne(int n, int n2) {
        long l = (long)(n >>= 4) & 0xFFFFFFFFL | ((long)(n2 >>= 4) & 0xFFFFFFFFL) << 32;
        RPx rPx = (RPx)this.field_36d8db1_Dne.method_20ed7708_Dne(l);
        if (rPx == null) {
            rPx = new RPx(this, n, n2);
            this.field_36d8db1_Dne.method_b9998ac6_Dne(l, rPx);
            this.field_f27c122c_Dne.add(rPx);
        }
        rPx.field_2092af_Dne = System.currentTimeMillis();
        return rPx;
    }

    public OdI method_90477c37_Dne(int n, int n2) {
        return this.method_904893f1_Dne(n, n2).method_90477c37_Dne(n, n2);
    }
}

