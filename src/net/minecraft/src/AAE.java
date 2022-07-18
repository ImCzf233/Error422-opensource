package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Random;

class AAE
extends JhS {
    public AAE(Qnq qnq, Random random, int n, int n2) {
        dlc.method_7a46289a_Dne();
        Kci kci = new Kci(0, random, (n << 4) + 2, (n2 << 4) + 2);
        this.field_3dc2cc53_Dne.add(kci);
        kci.method_dbe42dde_Dne(kci, this.field_3dc2cc53_Dne, random);
        ArrayList arrayList = kci.field_dc9cb15_Dne;
        while (!arrayList.isEmpty()) {
            int n3 = random.nextInt(arrayList.size());
            bvz bvz2 = (bvz)arrayList.remove(n3);
            bvz2.method_dbe42dde_Dne(kci, this.field_3dc2cc53_Dne, random);
        }
        this.method_7a46289a_Dne();
        this.method_c7fee424_Dne(qnq, random, 10);
    }
}

