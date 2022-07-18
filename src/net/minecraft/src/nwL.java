package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Random;

class nwL
extends JhS {
    private boolean field_2092bf_Dne = false;

    @Override
    public boolean method_7a46289e_Dne() {
        return this.field_2092bf_Dne;
    }

    public nwL(Qnq qnq, Random random, int n, int n2, int n3) {
        int n4;
        ArrayList arrayList = wBl.method_6f9e1c17_Dne(random, n3);
        opc opc2 = new opc(qnq.method_2315aa7b_Dne(), 0, random, (n << 4) + 2, (n2 << 4) + 2, arrayList, n3);
        this.field_3dc2cc53_Dne.add(opc2);
        opc2.method_dbe42dde_Dne(opc2, this.field_3dc2cc53_Dne, random);
        ArrayList arrayList2 = opc2.field_c61a1f02_bzF;
        ArrayList arrayList3 = opc2.field_8f85f8f4_FWm;
        while (!arrayList2.isEmpty() || !arrayList3.isEmpty()) {
            Object object;
            if (arrayList2.isEmpty()) {
                n4 = random.nextInt(arrayList3.size());
                object = (bvz)arrayList3.remove(n4);
                ((bvz)object).method_dbe42dde_Dne(opc2, this.field_3dc2cc53_Dne, random);
                continue;
            }
            n4 = random.nextInt(arrayList2.size());
            object = (bvz)arrayList2.remove(n4);
            ((bvz)object).method_dbe42dde_Dne(opc2, this.field_3dc2cc53_Dne, random);
        }
        this.method_7a46289a_Dne();
        n4 = 0;
        for (bvz bvz2 : this.field_3dc2cc53_Dne) {
            if (bvz2 instanceof XLq) continue;
            ++n4;
        }
        this.field_2092bf_Dne = n4 > 2;
    }
}

