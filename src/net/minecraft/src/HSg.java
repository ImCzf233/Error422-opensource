package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
class HSg
extends onZ {
    final int field_2092ae_Dne;
    final Qnq field_36c4f18_Dne;
    final sZS field_37b7500_Dne;
    final int field_2e5f1b_bzF;
    final int field_21260d_FWm;

    @Override
    public void method_672a90ac_Dne(FiG fiG, NMq nMq) {
        if (!fiG.field_37cb681_Dne.field_267d06_Qnq) {
            fiG.method_117d19ea_FWm(-this.field_37b7500_Dne.field_21260d_FWm);
        }
        sZS.method_7355befd_Dne(this.field_37b7500_Dne).method_6e3a6b66_Dne(0, null);
        if (sZS.method_bc2eac6e_Dne(this.field_37b7500_Dne) > 0) {
            NMq nMq2 = sZS.method_7355befd_Dne(this.field_37b7500_Dne).method_9e6e1a08_Dne(1);
            if (nMq2 != null && nMq2.field_2092ae_Dne > sZS.method_bc2eac6e_Dne(this.field_37b7500_Dne)) {
                nMq2.field_2092ae_Dne -= sZS.method_bc2eac6e_Dne(this.field_37b7500_Dne);
                sZS.method_7355befd_Dne(this.field_37b7500_Dne).method_6e3a6b66_Dne(1, nMq2);
            } else {
                sZS.method_7355befd_Dne(this.field_37b7500_Dne).method_6e3a6b66_Dne(1, null);
            }
        } else {
            sZS.method_7355befd_Dne(this.field_37b7500_Dne).method_6e3a6b66_Dne(1, null);
        }
        this.field_37b7500_Dne.field_21260d_FWm = 0;
        if (!fiG.field_37cb681_Dne.field_267d06_Qnq && !this.field_36c4f18_Dne.field_2d2a05_aFZ && this.field_36c4f18_Dne.method_2c2cf7bc_Dne(this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF) == zKP.field_9225485d_etZ.field_21260d_FWm && fiG.method_b5ceee8_Dne().nextFloat() < 0.12f) {
            int n = this.field_36c4f18_Dne.method_2dee76f_bzF(this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF);
            int n2 = n & 3;
            int n3 = n >> 2;
            if (++n3 > 2) {
                this.field_36c4f18_Dne.method_2e7161e6_Qnq(this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF);
                this.field_36c4f18_Dne.method_57aed1c2_Qnq(1020, this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF, 0);
            } else {
                this.field_36c4f18_Dne.method_d4dc89ed_Dne(this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF, n2 | n3 << 2, 2);
                this.field_36c4f18_Dne.method_57aed1c2_Qnq(1021, this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF, 0);
            }
        } else if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            this.field_36c4f18_Dne.method_57aed1c2_Qnq(1021, this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF, 0);
        }
    }

    HSg(sZS sZS2, MqS mqS, int n, int n2, int n3, Qnq qnq, int n4, int n5, int n6) {
        super(mqS, n, n2, n3);
        this.field_37b7500_Dne = sZS2;
        this.field_36c4f18_Dne = qnq;
        this.field_2092ae_Dne = n4;
        this.field_21260d_FWm = n5;
        this.field_2e5f1b_bzF = n6;
    }

    @Override
    public boolean method_703284a7_Dne(FiG fiG) {
        return (fiG.field_37cb681_Dne.field_267d06_Qnq || fiG.field_2f0276_eHV >= this.field_37b7500_Dne.field_21260d_FWm) && this.field_37b7500_Dne.field_21260d_FWm > 0 && this.method_7a46289e_Dne();
    }

    @Override
    public boolean method_7c61cf19_Dne(NMq nMq) {
        return false;
    }
}

