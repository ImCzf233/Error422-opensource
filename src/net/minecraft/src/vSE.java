package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class vSE
implements IjH {
    private RAN field_36c164d_Dne;
    private jwh_0 field_3694131_Dne;

    @Override
    public void method_a6aca7ca_FWm(int n, int n2, int n3) {
    }

    public vSE(jwh_0 jwh_02, RAN rAN) {
        this.field_3694131_Dne = jwh_02;
        this.field_36c164d_Dne = rAN;
    }

    @Override
    public void method_7eed443f_Dne(String string, int n, int n2, int n3) {
    }

    @Override
    public void method_2c2cf7c9_Dne(int n, int n2, int n3) {
        this.field_36c164d_Dne.method_231732d3_Dne().method_2c2cf7c9_Dne(n, n2, n3);
    }

    @Override
    public void method_bfa54b80_Dne(FiG fiG, int n, int n2, int n3, int n4, int n5) {
        this.field_3694131_Dne.method_230ea953_Dne().method_8d6e9f26_Dne(fiG, n2, n3, n4, 64.0, this.field_36c164d_Dne.field_3690d00_Dne.field_2092ae_Dne, new wwJ(n, n2, n3, n4, n5, false));
    }

    @Override
    public void method_676c4f9a_Dne(String string, double d, double d2, double d3, float f, float f2) {
        this.field_3694131_Dne.method_230ea953_Dne().method_a23afa5d_Dne(d, d2, d3, f > 1.0f ? (double)(16.0f * f) : 16.0, this.field_36c164d_Dne.field_3690d00_Dne.field_2092ae_Dne, new AQV(string, d, d2, d3, f, f2));
    }

    @Override
    public void method_f3667971_Dne(FiG fiG, String string, double d, double d2, double d3, float f, float f2) {
        this.field_3694131_Dne.method_230ea953_Dne().method_8d6e9f26_Dne(fiG, d, d2, d3, f > 1.0f ? (double)(16.0f * f) : 16.0, this.field_36c164d_Dne.field_3690d00_Dne.field_2092ae_Dne, new AQV(string, d, d2, d3, f, f2));
    }

    @Override
    public void method_c6b5263a_Dne(int n, int n2, int n3, int n4, int n5, int n6) {
    }

    @Override
    public void method_94d18be1_FWm(sMa sMa2) {
        this.field_36c164d_Dne.method_230e0484_Dne().method_94d18be1_FWm(sMa2);
    }

    @Override
    public void method_bb7dd820_Dne(sMa sMa2) {
        this.field_36c164d_Dne.method_230e0484_Dne().method_bb7dd820_Dne(sMa2);
    }

    @Override
    public void method_ae303daa_FWm(int n, int n2, int n3, int n4, int n5) {
        for (PJQ pJQ : this.field_3694131_Dne.method_230ea953_Dne().field_f27c122c_Dne) {
            double d;
            double d2;
            double d3;
            if (pJQ == null || pJQ.field_36c4f18_Dne != this.field_36c164d_Dne || pJQ.field_2d29f4_aFZ == n || !((d3 = (double)n2 - pJQ.field_2f0dd3_div) * d3 + (d2 = (double)n3 - pJQ.field_22c5fd_IjH) * d2 + (d = (double)n4 - pJQ.field_334487_mrb) * d < 1024.0)) continue;
            pJQ.field_36dacd0_Dne.method_7be2fb8c_Dne(new bEj(n, n2, n3, n4, n5));
        }
    }

    @Override
    public void method_8600ec24_Dne(String string, double d, double d2, double d3, double d4, double d5, double d6) {
    }

    @Override
    public void method_d4dc89e9_Dne(int n, int n2, int n3, int n4, int n5) {
        this.field_3694131_Dne.method_230ea953_Dne().method_7be2fb8c_Dne(new wwJ(n, n2, n3, n4, n5, true));
    }
}

