package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class oZz
extends cMv {
    private pjB field_37a51e4_Dne;
    private float field_2092ab_Dne;
    private int field_2092ae_Dne;
    private FUH field_366ec33_Dne;

    @Override
    public void method_7c6f6039_FWm() {
        this.field_37a51e4_Dne.method_4e0836dc_mrb(false);
        this.field_366ec33_Dne = null;
    }

    @Override
    public boolean method_7a46289e_Dne() {
        if (this.field_37a51e4_Dne.method_ae128dba_bzF() >= 0) {
            return false;
        }
        if (this.field_37a51e4_Dne.method_b5ceee8_Dne().nextInt(400) != 0) {
            return false;
        }
        List list = this.field_37a51e4_Dne.field_36c4f18_Dne.method_9314b7e8_Dne(pjB.class, this.field_37a51e4_Dne.field_373a3ed_Dne.method_b78565d7_FWm(6.0, 3.0, 6.0));
        double d = Double.MAX_VALUE;
        for (Object object : list) {
            double d2;
            if (object == this.field_37a51e4_Dne || ((pjB)object).method_80692b1e_ICU() || ((Azh)object).method_ae128dba_bzF() >= 0 || !((d2 = ((sMa)object).method_bb7dd80e_Dne(this.field_37a51e4_Dne)) <= d)) continue;
            d = d2;
            this.field_366ec33_Dne = (FUH) object;
        }
        return this.field_366ec33_Dne != null || (gWB.method_2c81f20d_Dne(this.field_37a51e4_Dne, 16, 3)) != null;
    }

    @Override
    public void method_ae128dc7_bzF() {
        --this.field_2092ae_Dne;
        if (this.field_366ec33_Dne != null) {
            if (this.field_37a51e4_Dne.method_bb7dd80e_Dne(this.field_366ec33_Dne) > 4.0) {
                this.field_37a51e4_Dne.method_23028a4c_Dne().method_740ba296_Dne(this.field_366ec33_Dne, this.field_2092ab_Dne);
            }
        } else if (this.field_37a51e4_Dne.method_23028a4c_Dne().method_ae128dcb_bzF()) {
            chN chN2 = gWB.method_2c81f20d_Dne(this.field_37a51e4_Dne, 16, 3);
            if (chN2 == null) {
                return;
            }
            this.field_37a51e4_Dne.method_23028a4c_Dne().method_50a172a0_Dne(chN2.field_2092a9_Dne, chN2.field_212608_FWm, chN2.field_2e5f16_bzF, this.field_2092ab_Dne);
        }
    }

    public oZz(pjB pjB2, float f) {
        this.field_37a51e4_Dne = pjB2;
        this.field_2092ab_Dne = f;
        this.method_ce7f5da9_Dne(1);
    }

    @Override
    public void method_7a46289a_Dne() {
        if (this.field_366ec33_Dne != null) {
            this.field_37a51e4_Dne.method_4e0836dc_mrb(true);
        }
        this.field_2092ae_Dne = 1000;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return this.field_2092ae_Dne > 0;
    }
}

