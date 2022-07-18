package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class Fed
extends Pdb {
    private final MqS field_36a853d_Dne;

    @Override
    public NMq method_8936db9f_Dne(FiG fiG, int n) {
        NMq nMq = null;
        onZ onZ2 = (onZ)this.field_7eb83e1f_bzF.get(n);
        if (onZ2 != null && onZ2.method_7a46289e_Dne()) {
            NMq nMq2 = onZ2.method_23040479_Dne();
            nMq = nMq2.method_23040479_Dne();
            if (n < this.field_36a853d_Dne.method_907a9d14_Qnq() ? !this.method_7bdfbb43_Dne(nMq2, this.field_36a853d_Dne.method_907a9d14_Qnq(), this.field_7eb83e1f_bzF.size(), true) : !this.method_7bdfbb43_Dne(nMq2, 0, this.field_36a853d_Dne.method_907a9d14_Qnq(), false)) {
                return null;
            }
            if (nMq2.field_2092ae_Dne == 0) {
                onZ2.method_7c61cf15_Dne(null);
            } else {
                onZ2.method_7a46289a_Dne();
            }
        }
        return nMq;
    }

    @Override
    public void method_703284a3_Dne(FiG fiG) {
        super.method_703284a3_Dne(fiG);
        this.field_36a853d_Dne.method_ae128dc7_bzF();
    }

    @Override
    public boolean method_703284a7_Dne(FiG fiG) {
        return this.field_36a853d_Dne.method_703284a7_Dne(fiG);
    }

    public Fed(MOS mOS, MqS mqS) {
        int n;
        this.field_36a853d_Dne = mqS;
        mqS.method_5f36e9f_i_();
        int n2 = 51;
        for (n = 0; n < mqS.method_907a9d14_Qnq(); ++n) {
            this.method_ec04ae2_Dne(new onZ(mqS, n, 44 + n * 18, 20));
        }
        for (n = 0; n < 3; ++n) {
            for (int i = 0; i < 9; ++i) {
                this.method_ec04ae2_Dne(new onZ(mOS, i + n * 9 + 9, 8 + i * 18, n * 18 + n2));
            }
        }
        for (n = 0; n < 9; ++n) {
            this.method_ec04ae2_Dne(new onZ(mOS, n, 8 + n * 18, 58 + n2));
        }
    }
}

