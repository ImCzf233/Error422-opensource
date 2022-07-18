package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class JsZ
extends zKP {
    public JsZ(int n) {
        super(n, KFd.field_328318c9_trS);
        this.method_82a88d64_Dne(JcN.field_368f2f7_Dne);
    }

    @Override
    public void method_8d285d4a_Dne(Qnq qnq, int n, int n2, int n3, sMa sMa2) {
        sMa2.field_291868_XHL *= 0.4;
        sMa2.field_31b811_kGO *= 0.4;
    }

    @Override
    public bSp method_8c85fe2_Dne(Qnq qnq, int n, int n2, int n3) {
        float f = 0.125f;
        return bSp.method_23186cf1_Dne().method_b4ea3e0c_Dne(n, n2, n3, n + 1, (float)(n2 + 1) - f, n3 + 1);
    }
}

