package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class uVe
extends dEr {
    private final CNI field_36574ee_Dne;
    private int field_2092ae_Dne;

    @Override
    public boolean method_c74bdb2c_Dne(zKP zKP2) {
        return zKP2.field_21260d_FWm == zKP.field_8e87c719_vSL.field_21260d_FWm;
    }

    @Override
    public boolean method_eec51294_Dne(NMq nMq, Qnq qnq, int n, int n2, int n3, int n4, FUH fUH) {
        if ((double)zKP.field_8374b848_Dne[n].method_9cb39120_Dne(qnq, n2, n3, n4) != 0.0) {
            nMq.method_60f1bf3f_Dne(2, fUH);
        }
        return true;
    }

    @Override
    public boolean method_a8f85d9_Dne(NMq nMq, FUH fUH, FUH fUH2) {
        nMq.method_60f1bf3f_Dne(1, fUH2);
        return true;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return true;
    }

    @Override
    public NMq method_d4201764_Dne(NMq nMq, Qnq qnq, FiG fiG) {
        fiG.method_fd8868e_Dne(nMq, this.method_e4cfb2b_a_(nMq));
        return nMq;
    }

    public int method_7c6f602c_FWm() {
        return this.field_36574ee_Dne.method_7c6f602c_FWm();
    }

    public uVe(int n, CNI cNI) {
        super(n);
        this.field_36574ee_Dne = cNI;
        this.field_2d29f4_aFZ = 1;
        this.method_77cbb00a_FWm(cNI.method_7a46288d_Dne());
        this.method_829e7ad2_Dne(JcN.field_5b95c4b_IjH);
        this.field_2092ae_Dne = 4 + cNI.method_7c6f602c_FWm();
    }

    @Override
    public int method_7a46288d_Dne() {
        return this.field_36574ee_Dne.method_907a9d14_Qnq();
    }

    @Override
    public int method_e4cfb2b_a_(NMq nMq) {
        return 72000;
    }

    public String method_eecad346_Dne() {
        return this.field_36574ee_Dne.toString();
    }

    @Override
    public float method_f46c097d_Dne(NMq nMq, zKP zKP2) {
        if (zKP2.field_21260d_FWm == zKP.field_8e87c719_vSL.field_21260d_FWm) {
            return 15.0f;
        }
        KFd kFd = zKP2.field_368fd23_Dne;
        return kFd != KFd.field_1c2a8b62_XHL && kFd != KFd.field_6162b14b_Zpi && kFd != KFd.field_75751810_EyB && kFd != KFd.field_74f39001_mrb && kFd != KFd.field_dd686a9b_Fnk ? 1.0f : 1.5f;
    }

    @Override
    public een method_c9acc3b8_Dne(NMq nMq) {
        return een.field_5e5eb325_Qnq;
    }

    @Override
    public boolean method_a981fd7e_Dne(NMq nMq, NMq nMq2) {
        return this.field_36574ee_Dne.method_a98a0653_aFZ() == nMq2.field_2e5f1b_bzF ? true : super.method_a981fd7e_Dne(nMq, nMq2);
    }

    @Override
    public int method_bb7dd813_Dne(sMa sMa2) {
        return this.field_2092ae_Dne;
    }
}

