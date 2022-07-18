package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class KNg
extends dEr {
    @Override
    public boolean method_a8f85d9_Dne(NMq nMq, FUH fUH, FUH fUH2) {
        this.method_9c395157_Dne(nMq, fUH);
        return true;
    }

    public KNg(int n) {
        super(n);
        this.field_2d29f4_aFZ = 1;
        this.method_829e7ad2_Dne(JcN.field_5e5261be_Qnq);
    }

    @Override
    public boolean method_9c395157_Dne(NMq nMq, FUH fUH) {
        if (fUH instanceof fNv) {
            fNv fNv2 = (fNv)fUH;
            if (!fNv2.method_86921671_LVR() && !fNv2.method_8288d6f2_IjH()) {
                fNv2.method_ce92b9a6_IjH(true);
                --nMq.field_2092ae_Dne;
            }
            return true;
        }
        return false;
    }
}

