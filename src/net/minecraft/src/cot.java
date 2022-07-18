package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class cot
extends OdI {
    public cot(int n) {
        super(n);
        this.field_6a0474ed_FWm.add(new oIf(oEB.class, 5, 4, 4));
        this.field_3674e49_Dne.field_267cf5_Qnq = 10;
        this.field_3674e49_Dne.field_388da6_zGp = 2;
    }

    @Override
    public gwq method_d15c9bd6_Dne(Random random) {
        return random.nextInt(5) == 0 ? this.field_37bae47_Dne : (random.nextInt(10) == 0 ? this.field_3754002_Dne : this.field_3763938_Dne);
    }
}

