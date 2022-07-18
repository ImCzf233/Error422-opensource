package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public enum bfY {
    field_373e877_Dne,
    field_202db456_FWm,
    field_75bbb664_bzF,
    field_5e5d573e_Qnq,
    field_71376cbd_aFZ,
    field_f0a5a76f_zGp;


    public int method_ce7f4ad7_Dne(double d) {
        double d2 = d - ((double)geR.method_117d0718_FWm(d) + 0.5);
        switch (this) {
            case field_373e877_Dne: {
                if (d2 < 0.0 ? d2 < -0.3125 : d2 < 0.3125) {
                    return geR.method_143f8b4a_bzF(d * 32.0);
                }
                return geR.method_117d0718_FWm(d * 32.0);
            }
            case field_202db456_FWm: {
                if (d2 < 0.0 ? d2 < -0.3125 : d2 < 0.3125) {
                    return geR.method_117d0718_FWm(d * 32.0);
                }
                return geR.method_143f8b4a_bzF(d * 32.0);
            }
            case field_75bbb664_bzF: {
                if (d2 > 0.0) {
                    return geR.method_117d0718_FWm(d * 32.0);
                }
                return geR.method_143f8b4a_bzF(d * 32.0);
            }
            case field_5e5d573e_Qnq: {
                if (d2 < 0.0 ? d2 < -0.1875 : d2 < 0.1875) {
                    return geR.method_143f8b4a_bzF(d * 32.0);
                }
                return geR.method_117d0718_FWm(d * 32.0);
            }
            case field_71376cbd_aFZ: {
                if (d2 < 0.0 ? d2 < -0.1875 : d2 < 0.1875) {
                    return geR.method_117d0718_FWm(d * 32.0);
                }
                return geR.method_143f8b4a_bzF(d * 32.0);
            }
        }
        if (d2 > 0.0) {
            return geR.method_143f8b4a_bzF(d * 32.0);
        }
        return geR.method_117d0718_FWm(d * 32.0);
    }
}

