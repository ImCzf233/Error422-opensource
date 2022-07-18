package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public enum ACj {
    field_36466e4_Dne,
    field_201e32c3_FWm,
    field_75ac34d1_bzF,
    field_5e4dd5ab_Qnq,
    field_7127eb2a_aFZ,
    field_f09625dc_zGp,
    field_1617900d_DyG,
    field_140d3d0e_div,
    field_5b4d038_IjH;


    public boolean method_a17c251a_Dne(dEr dEr2) {
        if (this == field_36466e4_Dne) {
            return true;
        }
        if (dEr2 instanceof qoi_0) {
            if (this == field_201e32c3_FWm) {
                return true;
            }
            qoi_0 qoi_02 = (qoi_0)dEr2;
            return qoi_02.field_2092ae_Dne == 0 ? this == field_f09625dc_zGp : (qoi_02.field_2092ae_Dne == 2 ? this == field_5e4dd5ab_Qnq : (qoi_02.field_2092ae_Dne == 1 ? this == field_7127eb2a_aFZ : (qoi_02.field_2092ae_Dne == 3 ? this == field_75ac34d1_bzF : false)));
        }
        return dEr2 instanceof uVe ? this == field_1617900d_DyG : (dEr2 instanceof SgG ? this == field_140d3d0e_div : (dEr2 instanceof DsI ? this == field_5b4d038_IjH : false));
    }
}

