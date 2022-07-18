package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from QJt
 */
public class qjt_0
extends yBi {
    @Override
    public int[] method_d4dc17ca_Dne(int n, int n2, int n3, int n4) {
        int[] nArray = this.field_37dd7cc_Dne.method_d4dc17ca_Dne(n - 1, n2 - 1, n3 + 2, n4 + 2);
        int[] nArray2 = Xyv.method_16c585b_Dne(n3 * n4);
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n3; ++j) {
                this.method_16d429a_Dne(j + n, i + n2);
                int n5 = nArray[j + 1 + (i + 1) * (n3 + 2)];
                if (this.method_ce7f5d9c_Dne(3) == 0) {
                    int n6 = n5;
                    if (n5 == OdI.field_75b309e5_bzF.field_267cf5_Qnq) {
                        n6 = OdI.field_35ca9ce1_ATE.field_267cf5_Qnq;
                    } else if (n5 == OdI.field_712ec03e_aFZ.field_267cf5_Qnq) {
                        n6 = OdI.field_719a51c7_Vxn.field_267cf5_Qnq;
                    } else if (n5 == OdI.field_f09cfaf0_zGp.field_267cf5_Qnq) {
                        n6 = OdI.field_84fc81d0_ceE.field_267cf5_Qnq;
                    } else if (n5 == OdI.field_202507d7_FWm.field_267cf5_Qnq) {
                        n6 = OdI.field_712ec03e_aFZ.field_267cf5_Qnq;
                    } else if (n5 == OdI.field_a21b6d60_kGO.field_267cf5_Qnq) {
                        n6 = OdI.field_aefbe473_udO.field_267cf5_Qnq;
                    } else if (n5 == OdI.field_d448080_FfS.field_267cf5_Qnq) {
                        n6 = OdI.field_3952279f_OdI.field_267cf5_Qnq;
                    }
                    if (n6 == n5) {
                        nArray2[j + i * n3] = n5;
                        continue;
                    }
                    int n7 = nArray[j + 1 + (i + 1 - 1) * (n3 + 2)];
                    int n8 = nArray[j + 1 + 1 + (i + 1) * (n3 + 2)];
                    int n9 = nArray[j + 1 - 1 + (i + 1) * (n3 + 2)];
                    int n10 = nArray[j + 1 + (i + 1 + 1) * (n3 + 2)];
                    if (n7 == n5 && n8 == n5 && n9 == n5 && n10 == n5) {
                        nArray2[j + i * n3] = n6;
                        continue;
                    }
                    nArray2[j + i * n3] = n5;
                    continue;
                }
                nArray2[j + i * n3] = n5;
            }
        }
        return nArray2;
    }

    public qjt_0(long l, yBi yBi2) {
        super(l);
        this.field_37dd7cc_Dne = yBi2;
    }
}

