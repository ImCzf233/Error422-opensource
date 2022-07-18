package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class ZkF
extends ZOO {
    CDE field_3654ee8_Dne;
    FUH field_366ec33_Dne;

    @Override
    public boolean method_7a46289e_Dne() {
        uQr uQr2 = this.field_3654ee8_Dne.method_2315ce15_Dne();
        if (uQr2 == null) {
            return false;
        }
        this.field_366ec33_Dne = uQr2.method_26662ae6_Dne(this.field_3654ee8_Dne);
        if (!this.method_740bedaa_Dne(this.field_366ec33_Dne, false)) {
            if (this.field_2020b812_FWm.method_b5ceee8_Dne().nextInt(20) == 0) {
                this.field_366ec33_Dne = uQr2.method_266675db_Dne(this.field_3654ee8_Dne);
                return this.method_740bedaa_Dne(this.field_366ec33_Dne, false);
            }
            return false;
        }
        return true;
    }

    public ZkF(CDE cDE) {
        super(cDE, 16.0f, false, true);
        this.field_3654ee8_Dne = cDE;
        this.method_ce7f5da9_Dne(1);
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_3654ee8_Dne.method_486cd6af_FWm(this.field_366ec33_Dne);
        super.method_7a46289a_Dne();
    }
}

