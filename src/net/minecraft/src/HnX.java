package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class HnX
extends Pdb {
    private UTs field_36dbf38_Dne;

    @Override
    public NMq method_8936db9f_Dne(FiG fiG, int n) {
        NMq nMq = null;
        onZ onZ2 = (onZ)this.field_7eb83e1f_bzF.get(n);
        if (onZ2 != null && onZ2.method_7a46289e_Dne()) {
            NMq nMq2 = onZ2.method_23040479_Dne();
            nMq = nMq2.method_23040479_Dne();
            if (n < 9 ? !this.method_7bdfbb43_Dne(nMq2, 9, 45, true) : !this.method_7bdfbb43_Dne(nMq2, 0, 9, false)) {
                return null;
            }
            if (nMq2.field_2092ae_Dne == 0) {
                onZ2.method_7c61cf15_Dne(null);
            } else {
                onZ2.method_7a46289a_Dne();
            }
            if (nMq2.field_2092ae_Dne == nMq.field_2092ae_Dne) {
                return null;
            }
            onZ2.method_672a90ac_Dne(fiG, nMq2);
        }
        return nMq;
    }

    @Override
    public boolean method_703284a7_Dne(FiG fiG) {
        return this.field_36dbf38_Dne.method_703284a7_Dne(fiG);
    }

    public HnX(MqS mqS, UTs uTs) {
        int n;
        int n2;
        this.field_36dbf38_Dne = uTs;
        for (n2 = 0; n2 < 3; ++n2) {
            for (n = 0; n < 3; ++n) {
                this.method_ec04ae2_Dne(new onZ(uTs, n + n2 * 3, 62 + n * 18, 17 + n2 * 18));
            }
        }
        for (n2 = 0; n2 < 3; ++n2) {
            for (n = 0; n < 9; ++n) {
                this.method_ec04ae2_Dne(new onZ(mqS, n + n2 * 9 + 9, 8 + n * 18, 84 + n2 * 18));
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            this.method_ec04ae2_Dne(new onZ(mqS, n2, 8 + n2 * 18, 142));
        }
    }
}

