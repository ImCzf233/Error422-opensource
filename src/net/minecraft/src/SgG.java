package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class SgG
extends dEr {
    protected CNI field_36574ee_Dne;
    protected float field_2092ab_Dne = 4.0f;
    private int field_2092ae_Dne;
    private zKP[] field_8374b848_Dne;

    protected SgG(int n, int n2, CNI cNI, zKP[] zKPArray) {
        super(n);
        this.field_36574ee_Dne = cNI;
        this.field_8374b848_Dne = zKPArray;
        this.field_2d29f4_aFZ = 1;
        this.method_77cbb00a_FWm(cNI.method_7a46288d_Dne());
        this.field_2092ab_Dne = cNI.method_7a46288a_Dne();
        this.field_2092ae_Dne = n2 + cNI.method_7c6f602c_FWm();
        this.method_829e7ad2_Dne(JcN.field_1411c921_div);
    }

    @Override
    public boolean method_a8f85d9_Dne(NMq nMq, FUH fUH, FUH fUH2) {
        nMq.method_60f1bf3f_Dne(2, fUH2);
        return true;
    }

    @Override
    public boolean method_eec51294_Dne(NMq nMq, Qnq qnq, int n, int n2, int n3, int n4, FUH fUH) {
        if ((double)zKP.field_8374b848_Dne[n].method_9cb39120_Dne(qnq, n2, n3, n4) != 0.0) {
            nMq.method_60f1bf3f_Dne(1, fUH);
        }
        return true;
    }

    @Override
    public int method_bb7dd813_Dne(sMa sMa2) {
        return this.field_2092ae_Dne;
    }

    @Override
    public float method_f46c097d_Dne(NMq nMq, zKP zKP2) {
        for (int i = 0; i < this.field_8374b848_Dne.length; ++i) {
            if (this.field_8374b848_Dne[i] != zKP2) continue;
            return this.field_2092ab_Dne;
        }
        return 1.0f;
    }

    @Override
    public int method_7a46288d_Dne() {
        return this.field_36574ee_Dne.method_907a9d14_Qnq();
    }

    @Override
    public boolean method_a981fd7e_Dne(NMq nMq, NMq nMq2) {
        return this.field_36574ee_Dne.method_a98a0653_aFZ() == nMq2.field_2e5f1b_bzF ? true : super.method_a981fd7e_Dne(nMq, nMq2);
    }

    public String method_eecad346_Dne() {
        return this.field_36574ee_Dne.toString();
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return true;
    }
}

