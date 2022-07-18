package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

public class hAV
implements Comparator {
    private FUH field_366ec33_Dne;

    public int compare(Object object, Object object2) {
        return this.method_a9ca690d_Dne((snt)object, (snt)object2);
    }

    public hAV(FUH fUH) {
        this.field_366ec33_Dne = fUH;
    }

    public int method_a9ca690d_Dne(snt snt2, snt snt3) {
        double d;
        if (snt2.field_2092bf_Dne && !snt3.field_2092bf_Dne) {
            return 1;
        }
        if (snt3.field_2092bf_Dne && !snt2.field_2092bf_Dne) {
            return -1;
        }
        double d2 = snt2.method_bb7dd810_Dne(this.field_366ec33_Dne);
        return d2 < (d = (double)snt3.method_bb7dd810_Dne(this.field_366ec33_Dne)) ? 1 : (d2 > d ? -1 : (snt2.field_36b0a9_udO < snt3.field_36b0a9_udO ? 1 : -1));
    }
}

