package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class ITf
extends cMv {
    private double field_2092a9_Dne;
    private kSJ field_377b6aa_Dne;
    private double field_2e5f16_bzF;
    private double field_212608_FWm;
    private Qnq field_36c4f18_Dne;
    private float field_2092ab_Dne;

    @Override
    public void method_7a46289a_Dne() {
        this.field_377b6aa_Dne.method_23028a4c_Dne().method_50a172a0_Dne(this.field_2092a9_Dne, this.field_212608_FWm, this.field_2e5f16_bzF, this.field_2092ab_Dne);
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return !this.field_377b6aa_Dne.method_23028a4c_Dne().method_ae128dcb_bzF();
    }

    public ITf(kSJ kSJ2, float f) {
        this.field_377b6aa_Dne = kSJ2;
        this.field_2092ab_Dne = f;
        this.field_36c4f18_Dne = kSJ2.field_36c4f18_Dne;
        this.method_ce7f5da9_Dne(1);
    }

    private chN method_230df162_Dne() {
        Random random = this.field_377b6aa_Dne.method_b5ceee8_Dne();
        for (int i = 0; i < 10; ++i) {
            int n;
            int n2;
            int n3 = geR.method_117d0718_FWm(this.field_377b6aa_Dne.field_2f0dd3_div + (double)random.nextInt(20) - 10.0);
            if (this.field_36c4f18_Dne.method_76d9fc47_aFZ(n3, n2 = geR.method_117d0718_FWm(this.field_377b6aa_Dne.field_373a3ed_Dne.field_212608_FWm + (double)random.nextInt(6) - 3.0), n = geR.method_117d0718_FWm(this.field_377b6aa_Dne.field_334487_mrb + (double)random.nextInt(20) - 10.0)) || !(this.field_377b6aa_Dne.method_2c2cf7b9_Dne(n3, n2, n) < 0.0f)) continue;
            return this.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(n3, n2, n);
        }
        return null;
    }

    @Override
    public boolean method_7a46289e_Dne() {
        if (!this.field_36c4f18_Dne.method_7a46289e_Dne()) {
            return false;
        }
        if (!this.field_377b6aa_Dne.method_cc5ef5c4_trS()) {
            return false;
        }
        if (!this.field_36c4f18_Dne.method_76d9fc47_aFZ(geR.method_117d0718_FWm(this.field_377b6aa_Dne.field_2f0dd3_div), (int)this.field_377b6aa_Dne.field_373a3ed_Dne.field_212608_FWm, geR.method_117d0718_FWm(this.field_377b6aa_Dne.field_334487_mrb))) {
            return false;
        }
        chN chN2 = this.method_230df162_Dne();
        if (chN2 == null) {
            return false;
        }
        this.field_2092a9_Dne = chN2.field_2092a9_Dne;
        this.field_212608_FWm = chN2.field_212608_FWm;
        this.field_2e5f16_bzF = chN2.field_2e5f16_bzF;
        return true;
    }
}

