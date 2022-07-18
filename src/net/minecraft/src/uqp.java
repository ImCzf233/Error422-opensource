package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class uqp
extends yBi {
    private OdI[] field_83618953_Dne = new OdI[]{OdI.field_75b309e5_bzF, OdI.field_712ec03e_aFZ, OdI.field_5e54aabf_Qnq, OdI.field_161e6521_DyG, OdI.field_202507d7_FWm, OdI.field_f09cfaf0_zGp, OdI.field_d448080_FfS};

    public uqp(long l, yBi yBi2, kGO kGO2) {
        super(l);
        this.field_37dd7cc_Dne = yBi2;
        if (kGO2 == kGO.field_5e60f900_Qnq) {
            this.field_83618953_Dne = new OdI[]{OdI.field_75b309e5_bzF, OdI.field_712ec03e_aFZ, OdI.field_5e54aabf_Qnq, OdI.field_161e6521_DyG, OdI.field_202507d7_FWm, OdI.field_f09cfaf0_zGp};
        }
    }

    @Override
    public int[] method_d4dc17ca_Dne(int n, int n2, int n3, int n4) {
        int[] nArray = this.field_37dd7cc_Dne.method_d4dc17ca_Dne(n, n2, n3, n4);
        int[] nArray2 = Xyv.method_16c585b_Dne(n3 * n4);
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n3; ++j) {
                int n5;
                this.method_16d429a_Dne(j + n, i + n2);
                int n6 = nArray[j + i * n3];
                nArray2[j + i * n3] = n6 == 0 ? 0 : (n6 == OdI.field_ab2400ae_ooe.field_267cf5_Qnq ? n6 : (n6 == 1 ? this.field_83618953_Dne[this.method_ce7f5d9c_Dne((int)this.field_83618953_Dne.length)].field_267cf5_Qnq : ((n5 = this.field_83618953_Dne[this.method_ce7f5d9c_Dne((int)this.field_83618953_Dne.length)].field_267cf5_Qnq) == OdI.field_f09cfaf0_zGp.field_267cf5_Qnq ? n5 : OdI.field_a21b6d60_kGO.field_267cf5_Qnq)));
            }
        }
        return nArray2;
    }
}

