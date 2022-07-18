package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class ema
extends Pdb {
    private YzO field_3701afe_Dne;
    private final Qnq field_36c4f18_Dne;
    private Jmn field_3691c61_Dne;

    @Override
    public NMq method_8936db9f_Dne(FiG fiG, int n) {
        NMq nMq = null;
        onZ onZ2 = (onZ)this.field_7eb83e1f_bzF.get(n);
        if (onZ2 != null && onZ2.method_7a46289e_Dne()) {
            NMq nMq2 = onZ2.method_23040479_Dne();
            nMq = nMq2.method_23040479_Dne();
            if (n == 2) {
                if (!this.method_7bdfbb43_Dne(nMq2, 3, 39, true)) {
                    return null;
                }
                onZ2.method_a981fd7a_Dne(nMq2, nMq);
            } else if (n != 0 && n != 1 ? (n >= 3 && n < 30 ? !this.method_7bdfbb43_Dne(nMq2, 30, 39, false) : n >= 30 && n < 39 && !this.method_7bdfbb43_Dne(nMq2, 3, 30, false)) : !this.method_7bdfbb43_Dne(nMq2, 3, 39, false)) {
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
    public void method_7a46289a_Dne() {
        super.method_7a46289a_Dne();
    }

    public void method_ce7f5da9_Dne(int n) {
        this.field_3691c61_Dne.method_ce7f5da9_Dne(n);
    }

    @Override
    public void method_b1d7af9a_Dne(mXX mXX2) {
        super.method_b1d7af9a_Dne(mXX2);
    }

    @Override
    public void method_7c9aa178_Dne(MqS mqS) {
        this.field_3691c61_Dne.method_7a46289a_Dne();
        super.method_7c9aa178_Dne(mqS);
    }

    public Jmn method_2302aac0_Dne() {
        return this.field_3691c61_Dne;
    }

    @Override
    public boolean method_703284a7_Dne(FiG fiG) {
        return this.field_3701afe_Dne.method_2300c587_Dne() == fiG;
    }

    @Override
    public void method_703284a3_Dne(FiG fiG) {
        super.method_703284a3_Dne(fiG);
        this.field_3701afe_Dne.method_703284a3_Dne(null);
        super.method_703284a3_Dne(fiG);
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            NMq nMq = this.field_3691c61_Dne.method_77c1cdc9_FWm(0);
            if (nMq != null) {
                fiG.method_c9a088b8_Dne(nMq);
            }
            if ((nMq = this.field_3691c61_Dne.method_77c1cdc9_FWm(1)) != null) {
                fiG.method_c9a088b8_Dne(nMq);
            }
        }
    }

    public ema(MOS mOS, YzO yzO, Qnq qnq) {
        int n;
        this.field_3701afe_Dne = yzO;
        this.field_36c4f18_Dne = qnq;
        this.field_3691c61_Dne = new Jmn(mOS.field_3673728_Dne, yzO);
        this.method_ec04ae2_Dne(new onZ(this.field_3691c61_Dne, 0, 36, 53));
        this.method_ec04ae2_Dne(new onZ(this.field_3691c61_Dne, 1, 62, 53));
        this.method_ec04ae2_Dne(new qaM(mOS.field_3673728_Dne, yzO, this.field_3691c61_Dne, 2, 120, 53));
        for (n = 0; n < 3; ++n) {
            for (int i = 0; i < 9; ++i) {
                this.method_ec04ae2_Dne(new onZ(mOS, i + n * 9 + 9, 8 + i * 18, 84 + n * 18));
            }
        }
        for (n = 0; n < 9; ++n) {
            this.method_ec04ae2_Dne(new onZ(mOS, n, 8 + n * 18, 142));
        }
    }

    @Override
    public void method_16cca7a_Dne(int n, int n2) {
    }
}

