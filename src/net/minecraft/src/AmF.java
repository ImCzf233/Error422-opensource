package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.List;

public class AmF
extends ZOO {
    Class field_ce3f4d68_Dne;
    private Wtm field_36f1f5c_Dne;
    FUH field_366ec33_Dne;
    int field_2092ae_Dne;
    private final pUe field_37a074c_Dne;

    public AmF(FUH fUH, Class clazz, float f, int n, boolean bl, boolean bl2) {
        this(fUH, clazz, f, n, bl, bl2, null);
    }

    @Override
    public boolean method_7a46289e_Dne() {
        if (this.field_2092ae_Dne > 0 && this.field_2020b812_FWm.method_b5ceee8_Dne().nextInt(this.field_2092ae_Dne) != 0) {
            return false;
        }
        if (this.field_ce3f4d68_Dne == FiG.class) {
            FiG fiG = this.field_2020b812_FWm.field_36c4f18_Dne.method_c32e43ea_FWm(this.field_2020b812_FWm, this.field_2092ab_Dne);
            if (this.method_740bedaa_Dne(fiG, false)) {
                this.field_366ec33_Dne = fiG;
                return true;
            }
        } else {
            List<sMa> list = this.field_2020b812_FWm.field_36c4f18_Dne.method_e7d4af05_Dne(this.field_ce3f4d68_Dne, this.field_2020b812_FWm.field_373a3ed_Dne.method_b78565d7_FWm(this.field_2092ab_Dne, 4.0, this.field_2092ab_Dne), this.field_37a074c_Dne);
            Collections.sort(list, this.field_36f1f5c_Dne);
            for (sMa sMa2 : list) {
                FUH fUH = (FUH)sMa2;
                if (!this.method_740bedaa_Dne(fUH, false)) continue;
                this.field_366ec33_Dne = fUH;
                return true;
            }
        }
        return false;
    }

    public AmF(FUH fUH, Class clazz, float f, int n, boolean bl) {
        this(fUH, clazz, f, n, bl, false);
    }

    public AmF(FUH fUH, Class clazz, float f, int n, boolean bl, boolean bl2, pUe pUe2) {
        super(fUH, f, bl, bl2);
        this.field_ce3f4d68_Dne = clazz;
        this.field_2092ab_Dne = f;
        this.field_2092ae_Dne = n;
        this.field_36f1f5c_Dne = new Wtm(this, fUH);
        this.field_37a074c_Dne = pUe2;
        this.method_ce7f5da9_Dne(1);
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_2020b812_FWm.method_486cd6af_FWm(this.field_366ec33_Dne);
        super.method_7a46289a_Dne();
    }
}

