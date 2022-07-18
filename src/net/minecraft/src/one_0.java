package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

/*
 * Renamed from One
 */
public class one_0
extends OdI {
    @Override
    public gwq method_9b80c235_FWm(Random random) {
        return random.nextInt(4) == 0 ? new Wnd(zKP.field_36dc147_Dne.field_21260d_FWm, 2) : new Wnd(zKP.field_36dc147_Dne.field_21260d_FWm, 1);
    }

    @Override
    public void method_37de135f_Dne(Qnq qnq, Random random, int n, int n2) {
        super.method_37de135f_Dne(qnq, random, n, n2);
        wns wns2 = new wns();
        for (int i = 0; i < 50; ++i) {
            int n3 = n + random.nextInt(16) + 8;
            int n4 = 64;
            int n5 = n2 + random.nextInt(16) + 8;
            wns2.method_c3e4cb88_Dne(qnq, random, n3, n4, n5);
        }
    }

    public one_0(int n) {
        super(n);
        this.field_3674e49_Dne.field_267cf5_Qnq = 50;
        this.field_3674e49_Dne.field_388da6_zGp = 25;
        this.field_3674e49_Dne.field_2d29f4_aFZ = 4;
        this.field_f27c122c_Dne.add(new oIf(kQo.class, 2, 1, 1));
        this.field_6a0474ed_FWm.add(new oIf(GRq.class, 10, 4, 4));
    }

    @Override
    public gwq method_d15c9bd6_Dne(Random random) {
        return random.nextInt(10) == 0 ? this.field_3754002_Dne : (random.nextInt(2) == 0 ? new MUD(3, 0) : (random.nextInt(3) == 0 ? new TpV(false, 10 + random.nextInt(20), 3, 3) : new ghu(false, 4 + random.nextInt(7), 3, 3, true)));
    }
}

