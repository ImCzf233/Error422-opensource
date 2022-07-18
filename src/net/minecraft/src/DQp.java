package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class DQp
extends onZ {
    private FiG field_3673728_Dne;
    private int field_2092ae_Dne;

    @Override
    protected void method_55b582d6_FWm(NMq nMq) {
        nMq.method_55941bf9_Dne(this.field_3673728_Dne.field_36c4f18_Dne, this.field_3673728_Dne, this.field_2092ae_Dne);
        if (!this.field_3673728_Dne.field_36c4f18_Dne.field_2d2a05_aFZ) {
            int n;
            int n2 = this.field_2092ae_Dne;
            float f = cTN.method_230da64e_Dne().method_ce7f5d99_Dne(nMq.field_2e5f1b_bzF);
            if (f == 0.0f) {
                n2 = 0;
            } else if (f < 1.0f) {
                n = geR.method_ce7f5259_Dne((float)n2 * f);
                if (n < geR.method_117d0e9a_FWm((float)n2 * f) && (float)Math.random() < (float)n2 * f - (float)n) {
                    ++n;
                }
                n2 = n;
            }
            while (n2 > 0) {
                n = alg.method_ce7f5d9c_Dne(n2);
                n2 -= n;
                this.field_3673728_Dne.field_36c4f18_Dne.method_94d18be5_FWm(new alg(this.field_3673728_Dne.field_36c4f18_Dne, this.field_3673728_Dne.field_2f0dd3_div, this.field_3673728_Dne.field_22c5fd_IjH + 0.5, this.field_3673728_Dne.field_334487_mrb + 0.5, n));
            }
        }
        this.field_2092ae_Dne = 0;
        if (nMq.field_2e5f1b_bzF == dEr.field_5c4c1af_IjH.field_267cf5_Qnq) {
            this.field_3673728_Dne.method_df3461c5_Dne(qlg.field_f096e1ad_zGp, 1);
        }
        if (nMq.field_2e5f1b_bzF == dEr.field_1ea4296e_kSP.field_267cf5_Qnq) {
            this.field_3673728_Dne.method_df3461c5_Dne(qlg.field_1c26b0f4_XHL, 1);
        }
    }

    @Override
    public boolean method_7c61cf19_Dne(NMq nMq) {
        return false;
    }

    @Override
    public void method_672a90ac_Dne(FiG fiG, NMq nMq) {
        this.method_55b582d6_FWm(nMq);
        super.method_672a90ac_Dne(fiG, nMq);
    }

    @Override
    protected void method_fd8868e_Dne(NMq nMq, int n) {
        this.field_2092ae_Dne += n;
        this.method_55b582d6_FWm(nMq);
    }

    @Override
    public NMq method_9e6e1a08_Dne(int n) {
        if (this.method_7a46289e_Dne()) {
            this.field_2092ae_Dne += Math.min(n, this.method_23040479_Dne().field_2092ae_Dne);
        }
        return super.method_9e6e1a08_Dne(n);
    }

    public DQp(FiG fiG, MqS mqS, int n, int n2, int n3) {
        super(mqS, n, n2, n3);
        this.field_3673728_Dne = fiG;
    }
}

