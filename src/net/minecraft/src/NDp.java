package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class NDp
implements iQt {
    private final NMq field_36a761a_Dne;
    private final List field_f27c122c_Dne;

    @Override
    public NMq method_23040479_Dne() {
        return this.field_36a761a_Dne;
    }

    @Override
    public boolean method_cbf49e9b_Dne(Uqm uqm, Qnq qnq) {
        ArrayList<NMq> arrayList = new ArrayList(this.field_f27c122c_Dne);
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                NMq nMq = uqm.method_e1697ab8_FWm(j, i);
                if (nMq == null) continue;
                boolean bl = false;
                for (NMq nMq2 : arrayList) {
                    if (nMq.field_2e5f1b_bzF != nMq2.field_2e5f1b_bzF || nMq2.method_907a9d14_Qnq() != Short.MAX_VALUE && nMq.method_907a9d14_Qnq() != nMq2.method_907a9d14_Qnq()) continue;
                    bl = true;
                    arrayList.remove(nMq2);
                    break;
                }
                if (bl) continue;
                return false;
            }
        }
        return arrayList.isEmpty();
    }

    @Override
    public NMq method_b1bef5f5_Dne(Uqm uqm) {
        return this.field_36a761a_Dne.method_23040479_Dne();
    }

    @Override
    public int method_7a46288d_Dne() {
        return this.field_f27c122c_Dne.size();
    }

    public NDp(NMq nMq, List list) {
        this.field_36a761a_Dne = nMq;
        this.field_f27c122c_Dne = list;
    }
}

