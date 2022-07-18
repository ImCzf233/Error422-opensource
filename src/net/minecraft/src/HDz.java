package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class HDz
extends JhS {
    public HDz(Qnq qnq, Random random, int n, int n2) {
        dnY dnY2 = new dnY(0, random, (n << 4) + 2, (n2 << 4) + 2);
        this.field_3dc2cc53_Dne.add(dnY2);
        dnY2.method_dbe42dde_Dne(dnY2, this.field_3dc2cc53_Dne, random);
        this.method_7a46289a_Dne();
        this.method_c7fee424_Dne(qnq, random, 10);
    }
}

