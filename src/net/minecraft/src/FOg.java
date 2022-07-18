package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

class FOg
extends Pdb {
    public List field_f27c122c_Dne = new ArrayList();

    @Override
    public boolean method_b6784eb0_Dne(onZ onZ2) {
        return onZ2.field_36a853d_Dne instanceof MOS || onZ2.field_388da6_zGp > 90 && onZ2.field_2d29f4_aFZ <= 162;
    }

    @Override
    public NMq method_8936db9f_Dne(FiG fiG, int n) {
        onZ onZ2;
        if (n >= this.field_7eb83e1f_bzF.size() - 9 && n < this.field_7eb83e1f_bzF.size() && (onZ2 = (onZ)this.field_7eb83e1f_bzF.get(n)) != null && onZ2.method_7a46289e_Dne()) {
            onZ2.method_7c61cf15_Dne(null);
        }
        return null;
    }

    public void method_ce7f5266_Dne(float f) {
        int n = this.field_f27c122c_Dne.size() / 9 - 5 + 1;
        int n2 = (int)((double)(f * (float)n) + 0.5);
        if (n2 < 0) {
            n2 = 0;
        }
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 9; ++j) {
                int n3 = j + (i + n2) * 9;
                if (n3 >= 0 && n3 < this.field_f27c122c_Dne.size()) {
                    VXB.method_2313c3af_Dne().method_6e3a6b66_Dne(j + i * 9, (NMq)this.field_f27c122c_Dne.get(n3));
                    continue;
                }
                VXB.method_2313c3af_Dne().method_6e3a6b66_Dne(j + i * 9, null);
            }
        }
    }

    public boolean method_7a46289e_Dne() {
        return this.field_f27c122c_Dne.size() > 45;
    }

    @Override
    protected void method_6f5cd5a3_Dne(int n, int n2, boolean bl, FiG fiG) {
    }

    @Override
    public boolean method_e3987d15_Dne(NMq nMq, onZ onZ2) {
        return onZ2.field_388da6_zGp > 90;
    }

    public FOg(FiG fiG) {
        int n;
        MOS mOS = fiG.field_36a059b_Dne;
        for (n = 0; n < 5; ++n) {
            for (int i = 0; i < 9; ++i) {
                this.method_ec04ae2_Dne(new onZ(VXB.method_2313c3af_Dne(), n * 9 + i, 9 + i * 18, 18 + n * 18));
            }
        }
        for (n = 0; n < 9; ++n) {
            this.method_ec04ae2_Dne(new onZ(mOS, n, 9 + n * 18, 112));
        }
        this.method_ce7f5266_Dne(0.0f);
    }

    @Override
    public boolean method_703284a7_Dne(FiG fiG) {
        return true;
    }
}

