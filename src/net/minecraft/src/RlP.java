package net.minecraft.src;

import java.util.List;

/*
 * Decompiled with CFR 0.152.
 */
public class RlP
extends cMv {
    private Class field_ce3f4d68_Dne;
    private float field_21260a_FWm;
    private float field_2092ab_Dne;
    private kSJ field_377b6aa_Dne;
    private wdG field_37d6a92_Dne;
    public final pUe field_37a074c_Dne = new lKU(this);
    private sMa field_37b45e5_Dne;
    private float field_2e5f18_bzF;
    private KFZ field_368fbed_Dne;

    static kSJ method_2b17a2e0_Dne(RlP rlP) {
        return rlP.field_377b6aa_Dne;
    }

    @Override
    public void method_ae128dc7_bzF() {
        if (this.field_377b6aa_Dne.method_bb7dd80e_Dne(this.field_37b45e5_Dne) < 49.0) {
            this.field_377b6aa_Dne.method_23028a4c_Dne().method_ce7f5266_Dne(this.field_21260a_FWm);
        } else {
            this.field_377b6aa_Dne.method_23028a4c_Dne().method_ce7f5266_Dne(this.field_2092ab_Dne);
        }
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_368fbed_Dne.method_ada793d7_Dne(this.field_37d6a92_Dne, this.field_2092ab_Dne);
    }

    public RlP(kSJ kSJ2, Class clazz, float f, float f2, float f3) {
        this.field_377b6aa_Dne = kSJ2;
        this.field_ce3f4d68_Dne = clazz;
        this.field_2e5f18_bzF = f;
        this.field_2092ab_Dne = f2;
        this.field_21260a_FWm = f3;
        this.field_368fbed_Dne = kSJ2.method_23028a4c_Dne();
        this.method_ce7f5da9_Dne(1);
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return !this.field_368fbed_Dne.method_ae128dcb_bzF();
    }

    @Override
    public void method_7c6f6039_FWm() {
        this.field_37b45e5_Dne = null;
    }

    @Override
    public boolean method_7a46289e_Dne() {
        Object object;
        if (this.field_ce3f4d68_Dne == FiG.class) {
            if (this.field_377b6aa_Dne instanceof BRM && ((BRM)this.field_377b6aa_Dne).method_86921671_LVR()) {
                return false;
            }
            this.field_37b45e5_Dne = this.field_377b6aa_Dne.field_36c4f18_Dne.method_3d2c70b_Dne(this.field_377b6aa_Dne, this.field_2e5f18_bzF);
            if (this.field_37b45e5_Dne == null) {
                return false;
            }
        } else {
            object = this.field_377b6aa_Dne.field_36c4f18_Dne.method_e7d4af05_Dne(this.field_ce3f4d68_Dne, this.field_377b6aa_Dne.field_373a3ed_Dne.method_b78565d7_FWm(this.field_2e5f18_bzF, 3.0, this.field_2e5f18_bzF), this.field_37a074c_Dne);
            if (((List) object).isEmpty()) {
                return false;
            }
            this.field_37b45e5_Dne = (sMa)((List) object).get(0);
        }
        if ((object = gWB.method_4e55885a_FWm(this.field_377b6aa_Dne, 16, 7, this.field_377b6aa_Dne.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(this.field_37b45e5_Dne.field_2f0dd3_div, this.field_37b45e5_Dne.field_22c5fd_IjH, this.field_37b45e5_Dne.field_334487_mrb))) == null) {
            return false;
        }
        if (this.field_37b45e5_Dne.method_2be42992_Dne(((chN)object).field_2092a9_Dne, ((chN)object).field_212608_FWm, ((chN)object).field_2e5f16_bzF) < this.field_37b45e5_Dne.method_bb7dd80e_Dne(this.field_377b6aa_Dne)) {
            return false;
        }
        this.field_37d6a92_Dne = this.field_368fbed_Dne.method_e45964fb_Dne(((chN)object).field_2092a9_Dne, ((chN)object).field_212608_FWm, ((chN)object).field_2e5f16_bzF);
        return this.field_37d6a92_Dne == null ? false : this.field_37d6a92_Dne.method_a1a425c2_Dne((chN)object);
    }
}

