package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class VHD
extends zKP {
    private final boolean field_2092bf_Dne;

    @Override
    public void method_f9bf07d3_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        if (!qnq.field_2d2a05_aFZ) {
            if (this.field_2092bf_Dne && !qnq.method_6382f365_kGO(n, n2, n3)) {
                qnq.method_ae303daa_FWm(n, n2, n3, this.field_21260d_FWm, 4);
            } else if (!this.field_2092bf_Dne && qnq.method_6382f365_kGO(n, n2, n3)) {
                qnq.method_17d7ea9d_FWm(n, n2, n3, zKP.field_c2a663f6_yaZ.field_21260d_FWm, 0, 2);
            }
        }
    }

    public VHD(int n, boolean bl) {
        super(n, KFd.field_719812f2_Vxn);
        this.field_2092bf_Dne = bl;
        if (bl) {
            this.method_ffcf5d18_Dne(1.0f);
        }
    }

    @Override
    public void method_9cb39130_Dne(Qnq qnq, int n, int n2, int n3) {
        if (!qnq.field_2d2a05_aFZ) {
            if (this.field_2092bf_Dne && !qnq.method_6382f365_kGO(n, n2, n3)) {
                qnq.method_ae303daa_FWm(n, n2, n3, this.field_21260d_FWm, 4);
            } else if (!this.field_2092bf_Dne && qnq.method_6382f365_kGO(n, n2, n3)) {
                qnq.method_17d7ea9d_FWm(n, n2, n3, zKP.field_c2a663f6_yaZ.field_21260d_FWm, 0, 2);
            }
        }
    }

    @Override
    public int method_24763341_Dne(int n, Random random, int n2) {
        return zKP.field_2931456c_ZkM.field_21260d_FWm;
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_5e5f2002_Qnq = this.field_2092bf_Dne ? rbp.method_285881e4_Dne("redstoneLight_lit") : rbp.method_285881e4_Dne("redstoneLight");
    }

    @Override
    public int method_9cb39123_Dne(Qnq qnq, int n, int n2, int n3) {
        return zKP.field_2931456c_ZkM.field_21260d_FWm;
    }

    @Override
    public void method_ca828a1c_Dne(Qnq qnq, int n, int n2, int n3, Random random) {
        if (!qnq.field_2d2a05_aFZ && this.field_2092bf_Dne && !qnq.method_6382f365_kGO(n, n2, n3)) {
            qnq.method_17d7ea9d_FWm(n, n2, n3, zKP.field_2931456c_ZkM.field_21260d_FWm, 0, 2);
        }
    }
}

