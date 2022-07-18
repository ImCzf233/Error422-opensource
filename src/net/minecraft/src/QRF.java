package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class QRF
extends ZOO {
    FUH field_366ec33_Dne;
    boolean field_2092bf_Dne;

    @Override
    public void method_7c6f6039_FWm() {
        if (this.field_2020b812_FWm.method_228c813f_bzF() != null && this.field_2020b812_FWm.method_228c813f_bzF() instanceof FiG && ((FiG)this.field_2020b812_FWm.method_228c813f_bzF()).field_37cb681_Dne.field_2092bf_Dne) {
            super.method_7c6f6039_FWm();
        }
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return this.method_740bedaa_Dne(this.field_2020b812_FWm.method_23007a92_Dne(), true);
    }

    public QRF(FUH fUH, boolean bl) {
        super(fUH, 16.0f, false);
        this.field_2092bf_Dne = bl;
        this.method_ce7f5da9_Dne(1);
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return this.field_2020b812_FWm.method_23007a92_Dne() != null && this.field_2020b812_FWm.method_23007a92_Dne() != this.field_366ec33_Dne;
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_2020b812_FWm.method_486cd6af_FWm(this.field_2020b812_FWm.method_23007a92_Dne());
        this.field_366ec33_Dne = this.field_2020b812_FWm.method_23007a92_Dne();
        if (this.field_2092bf_Dne) {
            List<FUH> list = (List<FUH>) this.field_2020b812_FWm.field_36c4f18_Dne.method_9314b7e8_Dne(this.field_2020b812_FWm.getClass(), bSp.method_23186cf1_Dne().method_b4ea3e0c_Dne(this.field_2020b812_FWm.field_2f0dd3_div, this.field_2020b812_FWm.field_22c5fd_IjH, this.field_2020b812_FWm.field_334487_mrb, this.field_2020b812_FWm.field_2f0dd3_div + 1.0, this.field_2020b812_FWm.field_22c5fd_IjH + 1.0, this.field_2020b812_FWm.field_334487_mrb + 1.0).method_b78565d7_FWm(this.field_2092ab_Dne, 10.0, this.field_2092ab_Dne));
            for (FUH fUH : list) {
                if (this.field_2020b812_FWm == fUH || fUH.method_228c813f_bzF() != null) continue;
                fUH.method_486cd6af_FWm(this.field_2020b812_FWm.method_23007a92_Dne());
            }
        }
        super.method_7a46289a_Dne();
    }
}

