package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class DJg
extends dEr {
    @Override
    public NMq method_d4201764_Dne(NMq nMq, Qnq qnq, FiG fiG) {
        if (!fiG.field_37cb681_Dne.field_267d06_Qnq) {
            --nMq.field_2092ae_Dne;
        }
        qnq.method_a36f5f6a_Dne(fiG, "random.bow", 0.5f, 0.4f / (field_7331eae7_Dne.nextFloat() * 0.4f + 0.8f));
        if (!qnq.field_2d2a05_aFZ) {
            qnq.method_94d18be5_FWm(new AEw(qnq, fiG));
        }
        return nMq;
    }

    public DJg(int n) {
        super(n);
        this.method_829e7ad2_Dne(JcN.field_712c773d_aFZ);
    }

    @Override
    public boolean method_55b582da_FWm(NMq nMq) {
        return true;
    }
}

