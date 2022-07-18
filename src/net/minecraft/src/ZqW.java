package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class ZqW
extends Pdb {
    private int field_21260d_FWm;
    private MqS field_36a853d_Dne;

    @Override
    public boolean method_703284a7_Dne(FiG fiG) {
        return this.field_36a853d_Dne.method_703284a7_Dne(fiG);
    }

    public ZqW(MqS mqS, MqS mqS2) {
        int n;
        int n2;
        this.field_36a853d_Dne = mqS2;
        this.field_21260d_FWm = mqS2.method_907a9d14_Qnq() / 9;
        mqS2.method_5f36e9f_i_();
        int n3 = (this.field_21260d_FWm - 4) * 18;
        for (n2 = 0; n2 < this.field_21260d_FWm; ++n2) {
            for (n = 0; n < 9; ++n) {
                this.method_ec04ae2_Dne(new onZ(mqS2, n + n2 * 9, 8 + n * 18, 18 + n2 * 18));
            }
        }
        for (n2 = 0; n2 < 3; ++n2) {
            for (n = 0; n < 9; ++n) {
                this.method_ec04ae2_Dne(new onZ(mqS, n + n2 * 9 + 9, 8 + n * 18, 103 + n2 * 18 + n3));
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            this.method_ec04ae2_Dne(new onZ(mqS, n2, 8 + n2 * 18, 161 + n3));
        }
    }

    @Override
    public void method_703284a3_Dne(FiG fiG) {
        super.method_703284a3_Dne(fiG);
        this.field_36a853d_Dne.method_ae128dc7_bzF();
    }

    public MqS method_2304139c_Dne() {
        return this.field_36a853d_Dne;
    }

    @Override
    public NMq method_8936db9f_Dne(FiG fiG, int n) {
        NMq nMq = null;
        onZ onZ2 = (onZ)this.field_7eb83e1f_bzF.get(n);
        if (onZ2 != null && onZ2.method_7a46289e_Dne()) {
            NMq nMq2 = onZ2.method_23040479_Dne();
            nMq = nMq2.method_23040479_Dne();
            if (n < this.field_21260d_FWm * 9 ? !this.method_7bdfbb43_Dne(nMq2, this.field_21260d_FWm * 9, this.field_7eb83e1f_bzF.size(), true) : !this.method_7bdfbb43_Dne(nMq2, 0, this.field_21260d_FWm * 9, false)) {
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
}

