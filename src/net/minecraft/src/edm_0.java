package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedList;
import java.util.List;

/*
 * Renamed from EDm
 */
public final class edm_0
extends PiY {
    final tHk field_37ba8b5_Dne;
    final List field_f27c122c_Dne;

    private edm_0(tHk tHk2, List list) {
        super("Failed to match any JSON node at [" + edm_0.method_f459a75_Dne(list) + "]");
        this.field_37ba8b5_Dne = tHk2;
        this.field_f27c122c_Dne = list;
    }

    static PiY method_c8e725da_FWm(edm_0 edm_02, iod iod2) {
        LinkedList<iod> linkedList = new LinkedList<iod>();
        linkedList.add(iod2);
        return new edm_0(edm_02.field_37ba8b5_Dne, linkedList);
    }

    @Override
    public String toString() {
        return "JsonNodeDoesNotMatchJsonNodeSelectorException{failedNode=" + this.field_37ba8b5_Dne + ", failPath=" + this.field_f27c122c_Dne + '}';
    }

    static PiY method_4f63307b_Dne(edm_0 edm_02, iod iod2) {
        LinkedList<iod> linkedList = new LinkedList<iod>(edm_02.field_f27c122c_Dne);
        linkedList.add(iod2);
        return new edm_0(edm_02.field_37ba8b5_Dne, linkedList);
    }

    static PiY method_b7ecd6c1_Dne(tHk tHk2) {
        return new edm_0(tHk2, new LinkedList());
    }

    static String method_f459a75_Dne(List list) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = list.size() - 1; i >= 0; --i) {
            stringBuilder.append(((iod)list.get(i)).method_eecad346_Dne());
            if (i == 0) continue;
            stringBuilder.append(".");
        }
        return stringBuilder.toString();
    }
}

