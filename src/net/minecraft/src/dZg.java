package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class dZg
extends SgG {
    private static zKP[] field_8374b848_Dne = new zKP[]{zKP.field_75c638da_bzF, zKP.field_3747682_Dne, zKP.field_202e4261_FWm, zKP.field_37e6aed_Dne, zKP.field_850fb0c5_ceE, zKP.field_d744d6c2_yMz, zKP.field_61781f15_Zpi, zKP.field_77fdc06_gnI, zKP.field_a22e9c55_kGO, zKP.field_dd7dd865_Fnk, zKP.field_1c3ff92c_XHL, zKP.field_5fd56c22_ZgS, zKP.field_73bfb6b5_eHV, zKP.field_c4c81e9d_xEx, zKP.field_b3a6b297_KLR, zKP.field_1f135bb1_qLR, zKP.field_35ddcbd6_ATE, zKP.field_390036e3_JLG, zKP.field_59cc4908_exS, zKP.field_69989981_FYZ, zKP.field_d2bf3c9c_oIf, zKP.field_39655694_OdI, zKP.field_f674470_Dsg};

    @Override
    public boolean method_c74bdb2c_Dne(zKP zKP2) {
        return zKP2 == zKP.field_e641c680_cot ? this.field_36574ee_Dne.method_ae128dba_bzF() == 3 : (zKP2 != zKP.field_73bfb6b5_eHV && zKP2 != zKP.field_5fd56c22_ZgS ? (zKP2 != zKP.field_152fb3d4_ghu && zKP2 != zKP.field_9a0e0146_Jjb ? (zKP2 != zKP.field_dd7dd865_Fnk && zKP2 != zKP.field_1c3ff92c_XHL ? (zKP2 != zKP.field_77fdc06_gnI && zKP2 != zKP.field_61781f15_Zpi ? (zKP2 != zKP.field_35ddcbd6_ATE && zKP2 != zKP.field_1f135bb1_qLR ? (zKP2 != zKP.field_390036e3_JLG && zKP2 != zKP.field_59cc4908_exS ? (zKP2.field_368fd23_Dne == KFd.field_712c8169_aFZ ? true : (zKP2.field_368fd23_Dne == KFd.field_f09abc1b_zGp ? true : zKP2.field_368fd23_Dne == KFd.field_161c264c_DyG)) : this.field_36574ee_Dne.method_ae128dba_bzF() >= 2) : this.field_36574ee_Dne.method_ae128dba_bzF() >= 1) : this.field_36574ee_Dne.method_ae128dba_bzF() >= 1) : this.field_36574ee_Dne.method_ae128dba_bzF() >= 2) : this.field_36574ee_Dne.method_ae128dba_bzF() >= 2) : this.field_36574ee_Dne.method_ae128dba_bzF() >= 2);
    }

    protected dZg(int n, CNI cNI) {
        super(n, 2, cNI, field_8374b848_Dne);
    }

    @Override
    public float method_f46c097d_Dne(NMq nMq, zKP zKP2) {
        return zKP2 != null && (zKP2.field_368fd23_Dne == KFd.field_f09abc1b_zGp || zKP2.field_368fd23_Dne == KFd.field_161c264c_DyG || zKP2.field_368fd23_Dne == KFd.field_712c8169_aFZ) ? this.field_2092ab_Dne : super.method_f46c097d_Dne(nMq, zKP2);
    }
}

