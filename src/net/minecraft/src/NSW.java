package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class NSW
extends cMv {
    private int field_2092ae_Dne;
    float field_2092ab_Dne;
    HzK field_3686033_Dne;
    HzK field_20222c12_FWm;

    @Override
    public boolean method_7c6f603d_FWm() {
        if (!this.field_20222c12_FWm.method_cd4cb3d9_udO()) {
            return false;
        }
        double d = this.field_3686033_Dne.method_bb7dd80e_Dne(this.field_20222c12_FWm);
        return d >= 9.0 && d <= 256.0;
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_2092ae_Dne = 0;
    }

    @Override
    public void method_7c6f6039_FWm() {
        this.field_20222c12_FWm = null;
    }

    @Override
    public void method_ae128dc7_bzF() {
        if (--this.field_2092ae_Dne <= 0) {
            this.field_2092ae_Dne = 10;
            this.field_3686033_Dne.method_23028a4c_Dne().method_740ba296_Dne(this.field_20222c12_FWm, this.field_2092ab_Dne);
        }
    }

    @Override
    public boolean method_7a46289e_Dne() {
        if (this.field_3686033_Dne.method_ae128dba_bzF() >= 0) {
            return false;
        }
        List<HzK> list = (List<HzK>) this.field_3686033_Dne.field_36c4f18_Dne.method_9314b7e8_Dne(this.field_3686033_Dne.getClass(), this.field_3686033_Dne.field_373a3ed_Dne.method_b78565d7_FWm(8.0, 4.0, 8.0));
        HzK hzK = null;
        double d = Double.MAX_VALUE;
        for (HzK hzK2 : list) {
            double d2;
            if (hzK2.method_ae128dba_bzF() < 0 || !((d2 = this.field_3686033_Dne.method_bb7dd80e_Dne(hzK2)) <= d)) continue;
            d = d2;
            hzK = hzK2;
        }
        if (hzK == null) {
            return false;
        }
        if (d < 9.0) {
            return false;
        }
        this.field_20222c12_FWm = hzK;
        return true;
    }

    public NSW(HzK hzK, float f) {
        this.field_3686033_Dne = hzK;
        this.field_2092ab_Dne = f;
    }
}

