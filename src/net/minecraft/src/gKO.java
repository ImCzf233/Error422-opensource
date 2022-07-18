package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class gKO
extends SgG {
    private static zKP[] field_8374b848_Dne = new zKP[]{zKP.field_5e67d9b4_Qnq, zKP.field_24a90a48_AgF, zKP.field_af0f1368_udO, zKP.field_375bc02_Dne, zKP.field_3747682_Dne, zKP.field_202e4261_FWm, zKP.field_32158d62_aJO, zKP.field_dcc1edd5_XwR};

    @Override
    public float method_f46c097d_Dne(NMq nMq, zKP zKP2) {
        return zKP2 != null && (zKP2.field_368fd23_Dne == KFd.field_5e526bea_Qnq || zKP2.field_368fd23_Dne == KFd.field_1c2a8b62_XHL || zKP2.field_368fd23_Dne == KFd.field_6162b14b_Zpi) ? this.field_2092ab_Dne : super.method_f46c097d_Dne(nMq, zKP2);
    }

    protected gKO(int n, CNI cNI) {
        super(n, 3, cNI, field_8374b848_Dne);
    }
}

