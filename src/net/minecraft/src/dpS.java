package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class dpS
extends dEr {
    @Override
    public boolean method_55b582da_FWm(NMq nMq) {
        return true;
    }

    public NMq method_18643d7a_Dne(RmG rmG) {
        NMq nMq = new NMq(this);
        this.method_b2053880_Dne(nMq, rmG);
        return nMq;
    }

    public NMq method_d150a0e5_Dne(Random random) {
        ycv ycv2 = ycv.field_fdf4529c_FWm[random.nextInt(ycv.field_fdf4529c_FWm.length)];
        NMq nMq = new NMq(this.field_267cf5_Qnq, 1, 0);
        int n = geR.method_4cd91d9_Dne(random, ycv2.method_ae128dba_bzF(), ycv2.method_7a46288d_Dne());
        this.method_b2053880_Dne(nMq, new RmG(ycv2, n));
        return nMq;
    }

    @Override
    public GXY method_c99eed3e_Dne(NMq nMq) {
        return this.method_c9b05901_Dne(nMq).method_7a46288d_Dne() > 0 ? GXY.field_202139c3_FWm : super.method_c99eed3e_Dne(nMq);
    }

    public fKu method_3edb821e_Dne(Random random, int n, int n2, int n3) {
        ycv ycv2 = ycv.field_fdf4529c_FWm[random.nextInt(ycv.field_fdf4529c_FWm.length)];
        NMq nMq = new NMq(this.field_267cf5_Qnq, 1, 0);
        int n4 = geR.method_4cd91d9_Dne(random, ycv2.method_ae128dba_bzF(), ycv2.method_7a46288d_Dne());
        this.method_b2053880_Dne(nMq, new RmG(ycv2, n4));
        return new fKu(nMq, n, n2, n3);
    }

    @Override
    public boolean method_e4cfb3c_a_(NMq nMq) {
        return false;
    }

    @Override
    public void method_497c81fb_Dne(NMq nMq, FiG fiG, List list, boolean bl) {
        super.method_497c81fb_Dne(nMq, fiG, list, bl);
        mbZ mbZ2 = this.method_c9b05901_Dne(nMq);
        if (mbZ2 != null) {
            for (int i = 0; i < mbZ2.method_7a46288d_Dne(); ++i) {
                short s = ((WkD)mbZ2.method_77d0d055_FWm(i)).method_8f501fe1_Dne("id");
                short s2 = ((WkD)mbZ2.method_77d0d055_FWm(i)).method_8f501fe1_Dne("lvl");
                if (ycv.field_8374a29b_Dne[s] == null) continue;
                list.add(ycv.field_8374a29b_Dne[s].method_2c0e7e17_Dne(s2));
            }
        }
    }

    public void method_718633ac_Dne(ycv ycv2, List list) {
        for (int i = ycv2.method_ae128dba_bzF(); i <= ycv2.method_7a46288d_Dne(); ++i) {
            list.add(this.method_18643d7a_Dne(new RmG(ycv2, i)));
        }
    }

    public dpS(int n) {
        super(n);
    }

    public void method_b2053880_Dne(NMq nMq, RmG rmG) {
        mbZ mbZ2 = this.method_c9b05901_Dne(nMq);
        boolean bl = true;
        for (int i = 0; i < mbZ2.method_7a46288d_Dne(); ++i) {
            WkD wkD = (WkD)mbZ2.method_77d0d055_FWm(i);
            if (wkD.method_8f501fe1_Dne("id") != rmG.field_37e5540_Dne.field_21260d_FWm) continue;
            if (wkD.method_8f501fe1_Dne("lvl") < rmG.field_2092ae_Dne) {
                wkD.method_5ab47529_Dne("lvl", (short)rmG.field_2092ae_Dne);
            }
            bl = false;
            break;
        }
        if (bl) {
            WkD wkD = new WkD();
            wkD.method_5ab47529_Dne("id", (short)rmG.field_37e5540_Dne.field_21260d_FWm);
            wkD.method_5ab47529_Dne("lvl", (short)rmG.field_2092ae_Dne);
            mbZ2.method_b4ba5ea1_Dne(wkD);
        }
        if (!nMq.method_a98a0664_aFZ()) {
            nMq.method_66a36cd8_FWm(new WkD());
        }
        nMq.method_230886fb_Dne().method_58996597_Dne("StoredEnchantments", mbZ2);
    }

    public mbZ method_c9b05901_Dne(NMq nMq) {
        return nMq.field_36ef89c_Dne != null && nMq.field_36ef89c_Dne.method_8f501fe8_Dne("StoredEnchantments") ? (mbZ)nMq.field_36ef89c_Dne.method_285c494f_Dne("StoredEnchantments") : new mbZ();
    }

    public fKu method_d15b82c7_Dne(Random random) {
        return this.method_3edb821e_Dne(random, 1, 1, 1);
    }
}

