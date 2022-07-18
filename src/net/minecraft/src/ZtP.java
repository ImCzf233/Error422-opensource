package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class ZtP
extends dEr {
    @Override
    public float method_f46c097d_Dne(NMq nMq, zKP zKP2) {
        return zKP2.field_21260d_FWm != zKP.field_8e87c719_vSL.field_21260d_FWm && zKP2.field_21260d_FWm != zKP.field_36e218c_Dne.field_21260d_FWm ? (zKP2.field_21260d_FWm == zKP.field_9f40014e_RPx.field_21260d_FWm ? 5.0f : super.method_f46c097d_Dne(nMq, zKP2)) : 15.0f;
    }

    public ZtP(int n) {
        super(n);
        this.method_9e77fc49_Dne(1);
        this.method_77cbb00a_FWm(238);
        this.method_829e7ad2_Dne(JcN.field_1411c921_div);
    }

    @Override
    public boolean method_c74bdb2c_Dne(zKP zKP2) {
        return zKP2.field_21260d_FWm == zKP.field_8e87c719_vSL.field_21260d_FWm || zKP2.field_21260d_FWm == zKP.field_36e009c_Dne.field_21260d_FWm || zKP2.field_21260d_FWm == zKP.field_9b24c8d5_lDk.field_21260d_FWm;
    }

    @Override
    public boolean method_eec51294_Dne(NMq nMq, Qnq qnq, int n, int n2, int n3, int n4, FUH fUH) {
        if (n != zKP.field_36e218c_Dne.field_21260d_FWm && n != zKP.field_8e87c719_vSL.field_21260d_FWm && n != zKP.field_36dc147_Dne.field_21260d_FWm && n != zKP.field_728b3649_ipf.field_21260d_FWm && n != zKP.field_9b24c8d5_lDk.field_21260d_FWm) {
            return super.method_eec51294_Dne(nMq, qnq, n, n2, n3, n4, fUH);
        }
        nMq.method_60f1bf3f_Dne(1, fUH);
        return true;
    }
}

