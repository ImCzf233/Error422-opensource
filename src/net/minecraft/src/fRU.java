package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class fRU {
    public static fRU field_3756e63_Dne = new fRU();
    private int field_2092ae_Dne;

    public void method_7a46289a_Dne() {
        YRn.method_7a46289a_Dne();
        Lbz.method_7a46289a_Dne();
        ++FqX.method_2300e59e_Dne().field_2092ae_Dne;
        if (this.field_2092ae_Dne >= 250) {
            qxi_0.field_2092bf_Dne = false;
            this.field_2092ae_Dne = 0;
        }
        if (qxi_0.field_2092bf_Dne) {
            ++this.field_2092ae_Dne;
        }
        FqX.method_2300e59e_Dne().method_7a46289a_Dne();
    }

    public static fRU method_230efcc2_Dne() {
        return field_3756e63_Dne;
    }
}

