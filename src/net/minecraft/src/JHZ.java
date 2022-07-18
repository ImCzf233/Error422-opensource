package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedList;
import java.util.List;

public final class JHZ
implements Xix {
    private final List<Xix> field_f27c122c_Dne = new LinkedList();

    public JHZ method_6322d7d5_Dne(Xix xix) {
        this.field_f27c122c_Dne.add(xix);
        return this;
    }

    public bab method_230d6528_Dne() {
        LinkedList<LIC> linkedList = new LinkedList<LIC>();
        for (Xix xix : this.field_f27c122c_Dne) {
            linkedList.add(xix.method_23030725_Dne());
        }
        return ACm.method_926de4b1_Dne(linkedList);
    }

    @Override
    public LIC method_23030725_Dne() {
        return this.method_230d6528_Dne();
    }
}

