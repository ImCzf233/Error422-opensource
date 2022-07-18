package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class zwq
extends dEr {
    public zwq(int n) {
        super(n);
        this.method_21c1eb9a_Dne(true);
        this.method_77cbb00a_FWm(0);
        this.method_829e7ad2_Dne(JcN.field_1c2a8136_XHL);
    }

    @Override
    public String method_10c7922b_Dne(NMq nMq) {
        return nMq.method_907a9d14_Qnq() == 1 ? "item.charcoal" : "item.coal";
    }

    @Override
    public void method_d88f4bf4_Dne(int n, JcN jcN, List list) {
        list.add(new NMq(n, 1, 0));
        list.add(new NMq(n, 1, 1));
    }
}

