package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class Jjt
extends PBI {
    @Override
    public boolean method_55b582da_FWm(NMq nMq) {
        return nMq.method_907a9d14_Qnq() > 0;
    }

    public Jjt(int n, int n2, float f, boolean bl) {
        super(n, n2, f, bl);
        this.method_21c1eb9a_Dne(true);
    }

    @Override
    public GXY method_c99eed3e_Dne(NMq nMq) {
        return nMq.method_907a9d14_Qnq() == 0 ? GXY.field_75af3bd1_bzF : GXY.field_5e50dcab_Qnq;
    }

    @Override
    protected void method_b9e6905_Dne(NMq nMq, Qnq qnq, FiG fiG) {
        if (nMq.method_907a9d14_Qnq() > 0) {
            if (!qnq.field_2d2a05_aFZ) {
                fiG.method_fe8e2b7b_Qnq(new NAx(SXd.field_1c2e71ec_XHL.field_2092ae_Dne, 600, 3));
                fiG.method_fe8e2b7b_Qnq(new NAx(SXd.field_616697d5_Zpi.field_2092ae_Dne, 6000, 0));
                fiG.method_fe8e2b7b_Qnq(new NAx(SXd.field_a21d1515_kGO.field_2092ae_Dne, 6000, 0));
            }
        } else {
            super.method_b9e6905_Dne(nMq, qnq, fiG);
        }
    }

    @Override
    public void method_d88f4bf4_Dne(int n, JcN jcN, List list) {
        list.add(new NMq(n, 1, 0));
        list.add(new NMq(n, 1, 1));
    }
}

