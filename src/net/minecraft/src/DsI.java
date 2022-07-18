package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class DsI
extends dEr {
    public static final String[] field_f5e54dca_Dne = new String[]{"bow_pull_0", "bow_pull_1", "bow_pull_2"};
    private gDn[] field_836bfe96_Dne;

    @Override
    public void method_682f2a9e_Dne(NMq nMq, Qnq qnq, FiG fiG, int n) {
        boolean bl;
        boolean bl2 = bl = fiG.field_37cb681_Dne.field_267d06_Qnq || UYp.method_6e3a6b59_Dne(ycv.field_d5799c8_FfS.field_21260d_FWm, nMq) > 0;
        if (bl || fiG.field_36a059b_Dne.method_117d19ee_FWm(dEr.field_f0a61753_zGp.field_267cf5_Qnq)) {
            int n2;
            int n3;
            int n4 = this.method_e4cfb2b_a_(nMq) - n;
            float f = (float)n4 / 20.0f;
            if ((double)(f = (f * f + f * 2.0f) / 3.0f) < 0.1) {
                return;
            }
            if (f > 1.0f) {
                f = 1.0f;
            }
            hhc hhc2 = new hhc(qnq, fiG, f * 2.0f);
            if (f == 1.0f) {
                hhc2.method_117d59bb_FWm(true);
            }
            if ((n3 = UYp.method_6e3a6b59_Dne(ycv.field_71ad6b0f_Vxn.field_21260d_FWm, nMq)) > 0) {
                hhc2.method_ce7f4ae4_Dne(hhc2.method_7a462888_Dne() + (double)n3 * 0.5 + 0.5);
            }
            if ((n2 = UYp.method_6e3a6b59_Dne(ycv.field_850f9b18_ceE.field_21260d_FWm, nMq)) > 0) {
                hhc2.method_ce7f5da9_Dne(n2);
            }
            if (UYp.method_6e3a6b59_Dne(ycv.field_758a702d_EyB.field_21260d_FWm, nMq) > 0) {
                hhc2.method_87b738a3_aFZ(100);
            }
            nMq.method_60f1bf3f_Dne(1, fiG);
            qnq.method_a36f5f6a_Dne(fiG, "random.bow", 1.0f, 1.0f / (field_7331eae7_Dne.nextFloat() * 0.4f + 1.2f) + f * 0.5f);
            if (bl) {
                hhc2.field_2092ae_Dne = 2;
            } else {
                fiG.field_36a059b_Dne.method_ce7f5dad_Dne(dEr.field_f0a61753_zGp.field_267cf5_Qnq);
            }
            if (!qnq.field_2d2a05_aFZ) {
                qnq.method_94d18be5_FWm(hhc2);
            }
        }
    }

    @Override
    public een method_c9acc3b8_Dne(NMq nMq) {
        return een.field_7138c8a4_aFZ;
    }

    @Override
    public int method_e4cfb2b_a_(NMq nMq) {
        return 72000;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 1;
    }

    public DsI(int n) {
        super(n);
        this.field_2d29f4_aFZ = 1;
        this.method_77cbb00a_FWm(384);
        this.method_829e7ad2_Dne(JcN.field_5b95c4b_IjH);
    }

    @Override
    public NMq method_d4201764_Dne(NMq nMq, Qnq qnq, FiG fiG) {
        if (fiG.field_37cb681_Dne.field_267d06_Qnq || fiG.field_36a059b_Dne.method_117d19ee_FWm(dEr.field_f0a61753_zGp.field_267cf5_Qnq)) {
            fiG.method_fd8868e_Dne(nMq, this.method_e4cfb2b_a_(nMq));
        }
        return nMq;
    }

    public gDn method_77cd08ea_FWm(int n) {
        return this.field_836bfe96_Dne[n];
    }

    @Override
    public NMq method_89e9a565_FWm(NMq nMq, Qnq qnq, FiG fiG) {
        return nMq;
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        super.method_845caac7_Dne(rbp);
        this.field_836bfe96_Dne = new gDn[field_f5e54dca_Dne.length];
        for (int i = 0; i < this.field_836bfe96_Dne.length; ++i) {
            this.field_836bfe96_Dne[i] = rbp.method_285881e4_Dne(field_f5e54dca_Dne[i]);
        }
    }
}

