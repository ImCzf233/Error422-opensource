package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public abstract class ZOO
extends cMv {
    protected float field_2092ab_Dne;
    private int field_2092ae_Dne = 0;
    private int field_21260d_FWm = 0;
    private boolean field_2092bf_Dne;
    protected FUH field_2020b812_FWm;
    protected boolean field_21261e_FWm;
    private int field_2e5f1b_bzF = 0;

    @Override
    public void method_7a46289a_Dne() {
        this.field_2092ae_Dne = 0;
        this.field_21260d_FWm = 0;
        this.field_2e5f1b_bzF = 0;
    }

    public ZOO(FUH fUH, float f, boolean bl, boolean bl2) {
        this.field_2020b812_FWm = fUH;
        this.field_2092ab_Dne = f;
        this.field_21261e_FWm = bl;
        this.field_2092bf_Dne = bl2;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        FUH fUH = this.field_2020b812_FWm.method_228c813f_bzF();
        if (fUH == null) {
            return false;
        }
        if (!fUH.method_cd4cb3d9_udO()) {
            return false;
        }
        if (this.field_2020b812_FWm.method_bb7dd80e_Dne(fUH) > (double)(this.field_2092ab_Dne * this.field_2092ab_Dne)) {
            return false;
        }
        if (this.field_21261e_FWm) {
            if (this.field_2020b812_FWm.method_22ffcd49_Dne().method_bb7dd824_Dne(fUH)) {
                this.field_2e5f1b_bzF = 0;
            } else if (++this.field_2e5f1b_bzF > 60) {
                return false;
            }
        }
        return true;
    }

    public ZOO(FUH fUH, float f, boolean bl) {
        this(fUH, f, bl, false);
    }

    @Override
    public void method_7c6f6039_FWm() {
        this.field_2020b812_FWm.method_486cd6af_FWm(null);
    }

    private boolean method_6f1922f2_Dne(FUH fUH) {
        int n;
        this.field_21260d_FWm = 10 + this.field_2020b812_FWm.method_b5ceee8_Dne().nextInt(5);
        wdG wdG2 = this.field_2020b812_FWm.method_23028a4c_Dne().method_267ca945_Dne(fUH);
        if (wdG2 == null) {
            return false;
        }
        whE whE2 = wdG2.method_231707b7_Dne();
        if (whE2 == null) {
            return false;
        }
        int n2 = whE2.field_2092ae_Dne - geR.method_117d0718_FWm(fUH.field_2f0dd3_div);
        return (double)(n2 * n2 + (n = whE2.field_2e5f1b_bzF - geR.method_117d0718_FWm(fUH.field_334487_mrb)) * n) <= 2.25;
    }

    protected boolean method_740bedaa_Dne(FUH fUH, boolean bl) {
        if (fUH == null) {
            return false;
        }
        if (fUH == this.field_2020b812_FWm) {
            return false;
        }
        if (!fUH.method_cd4cb3d9_udO()) {
            return false;
        }
        if (!this.field_2020b812_FWm.method_5fce35e7_Dne(fUH.getClass())) {
            return false;
        }
        if (this.field_2020b812_FWm instanceof BRM && ((BRM)this.field_2020b812_FWm).method_86921671_LVR()) {
            if (fUH instanceof BRM && ((BRM)fUH).method_86921671_LVR()) {
                return false;
            }
            if (fUH == ((BRM)this.field_2020b812_FWm).method_2df40558_aFZ()) {
                return false;
            }
        } else if (fUH instanceof FiG && !bl && ((FiG)fUH).field_37cb681_Dne.field_2092bf_Dne) {
            return false;
        }
        if (!this.field_2020b812_FWm.method_2c2cf7cd_Dne(geR.method_117d0718_FWm(fUH.field_2f0dd3_div), geR.method_117d0718_FWm(fUH.field_22c5fd_IjH), geR.method_117d0718_FWm(fUH.field_334487_mrb))) {
            return false;
        }
        if (this.field_21261e_FWm && !this.field_2020b812_FWm.method_22ffcd49_Dne().method_bb7dd824_Dne(fUH)) {
            return false;
        }
        if (this.field_2092bf_Dne) {
            if (--this.field_21260d_FWm <= 0) {
                this.field_2092ae_Dne = 0;
            }
            if (this.field_2092ae_Dne == 0) {
                int n = this.field_2092ae_Dne = this.method_6f1922f2_Dne(fUH) ? 1 : 2;
            }
            if (this.field_2092ae_Dne == 2) {
                return false;
            }
        }
        return true;
    }
}

