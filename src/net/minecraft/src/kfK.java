package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class kfK
extends dEr {
    public kfK(int n) {
        super(n);
        this.field_2d29f4_aFZ = 1;
        this.method_829e7ad2_Dne(JcN.field_5e5261be_Qnq);
    }

    @Override
    public NMq method_d4201764_Dne(NMq nMq, Qnq qnq, FiG fiG) {
        Object object;
        int n;
        float f;
        float f2;
        double d;
        float f3;
        float f4 = 1.0f;
        float f5 = fiG.field_31b813_kGO + (fiG.field_29186a_XHL - fiG.field_31b813_kGO) * f4;
        float f6 = fiG.field_2a9ad3_Zpi + (fiG.field_334489_mrb - fiG.field_2a9ad3_Zpi) * f4;
        double d2 = fiG.field_2d29ef_aFZ + (fiG.field_2f0dd3_div - fiG.field_2d29ef_aFZ) * (double)f4;
        double d3 = fiG.field_388da1_zGp + (fiG.field_22c5fd_IjH - fiG.field_388da1_zGp) * (double)f4 + 1.62 - (double)fiG.field_36b0a6_udO;
        double d4 = fiG.field_20b852_DyG + (fiG.field_334487_mrb - fiG.field_20b852_DyG) * (double)f4;
        chN chN2 = qnq.method_23186a47_Dne().method_e4505d6c_Dne(d2, d3, d4);
        float f7 = geR.method_117d0e97_FWm(-f6 * ((float)Math.PI / 180) - (float)Math.PI);
        float f8 = geR.method_ce7f5256_Dne(-f6 * ((float)Math.PI / 180) - (float)Math.PI);
        float f9 = f8 * (f3 = -geR.method_117d0e97_FWm(-f5 * ((float)Math.PI / 180)));
        chN chN3 = chN2.method_2c4d3b9f_bzF((double)f9 * (d = 5.0), (double)(f2 = geR.method_ce7f5256_Dne(-f5 * ((float)Math.PI / 180))) * d, (double)(f = f7 * f3) * d);
        wHH wHH2 = qnq.method_50000e54_Dne(chN2, chN3, true);
        if (wHH2 == null) {
            return nMq;
        }
        chN chN4 = fiG.method_d91908ef_FWm(f4);
        boolean bl = false;
        float f10 = 1.0f;
        List list = qnq.method_71df22e6_FWm(fiG, fiG.field_373a3ed_Dne.method_e44f9e56_Dne(chN4.field_2092a9_Dne * d, chN4.field_212608_FWm * d, chN4.field_2e5f16_bzF * d).method_b78565d7_FWm(f10, f10, f10));
        for (n = 0; n < list.size(); ++n) {
            float f11;
            sMa sMa2 = (sMa)list.get(n);
            if (!sMa2.method_baa39406_kGO() || !((bSp)(object = sMa2.field_373a3ed_Dne.method_b78565d7_FWm(f11 = sMa2.method_907a9d11_Qnq(), f11, f11))).method_a1a425c2_Dne(chN2)) continue;
            bl = true;
        }
        if (bl) {
            return nMq;
        }
        if (wHH2.field_376443d_Dne == gks.field_376443d_Dne) {
            n = wHH2.field_2092ae_Dne;
            int n2 = wHH2.field_21260d_FWm;
            int n3 = wHH2.field_2e5f1b_bzF;
            if (qnq.method_2c2cf7bc_Dne(n, n2, n3) == zKP.field_23a1e80a_EwP.field_21260d_FWm) {
                --n2;
            }
            object = new iMX(qnq, (float)n + 0.5f, (float)n2 + 1.0f, (float)n3 + 0.5f);
            ((iMX)object).field_334489_mrb = ((geR.method_117d0718_FWm((double)(fiG.field_334489_mrb * 4.0f / 360.0f) + 0.5) & 3) - 1) * 90;
            if (!qnq.method_d11d9a5_Dne((sMa)object, ((iMX)object).field_373a3ed_Dne.method_b78565d7_FWm(-0.1, -0.1, -0.1)).isEmpty()) {
                return nMq;
            }
            if (!qnq.field_2d2a05_aFZ) {
                qnq.method_94d18be5_FWm((sMa)object);
            }
            if (!fiG.field_37cb681_Dne.field_267d06_Qnq) {
                --nMq.field_2092ae_Dne;
            }
        }
        return nMq;
    }
}

