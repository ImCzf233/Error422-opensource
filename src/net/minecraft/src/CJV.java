package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class CJV
extends dEr {
    public CJV(int n) {
        super(n);
        this.field_2d29f4_aFZ = 16;
        this.method_829e7ad2_Dne(JcN.field_712c773d_aFZ);
    }

    @Override
    public NMq method_d4201764_Dne(NMq nMq, Qnq qnq, FiG fiG) {
        if (fiG.field_37cb681_Dne.field_267d06_Qnq) {
            return nMq;
        }
        if (fiG.field_203511c4_FWm != null) {
            return nMq;
        }
        --nMq.field_2092ae_Dne;
        qnq.method_a36f5f6a_Dne(fiG, "random.bow", 0.5f, 0.4f / (field_7331eae7_Dne.nextFloat() * 0.4f + 0.8f));
        if (!qnq.field_2d2a05_aFZ) {
            qnq.method_94d18be5_FWm(new Hhj(qnq, fiG));
        }
        return nMq;
    }
}

