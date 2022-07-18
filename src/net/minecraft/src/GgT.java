package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

class GgT
extends Xtu {
    private GgT() {
    }

    GgT(ywz ywz2) {
        this();
    }

    @Override
    public void method_7bf5097_Dne(Random random, int n, int n2, int n3, boolean bl) {
        if (bl) {
            this.field_2092ae_Dne = zKP.field_39272339_WvN.field_21260d_FWm;
            float f = random.nextFloat();
            if (f < 0.2f) {
                this.field_21260d_FWm = 2;
            } else if (f < 0.5f) {
                this.field_21260d_FWm = 1;
            } else if (f < 0.55f) {
                this.field_2092ae_Dne = zKP.field_fc460963_tIz.field_21260d_FWm;
                this.field_21260d_FWm = 2;
            } else {
                this.field_21260d_FWm = 0;
            }
        } else {
            this.field_2092ae_Dne = 0;
            this.field_21260d_FWm = 0;
        }
    }
}

