package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class haP
extends OdI {
    public haP(int n) {
        super(n);
        this.field_6a0474ed_FWm.add(new oIf(oEB.class, 8, 4, 4));
        this.field_3674e49_Dne.field_267cf5_Qnq = 10;
        this.field_3674e49_Dne.field_388da6_zGp = 1;
    }

    @Override
    public gwq method_d15c9bd6_Dne(Random random) {
        return random.nextInt(3) == 0 ? new KkE() : new yaZ(false);
    }
}

