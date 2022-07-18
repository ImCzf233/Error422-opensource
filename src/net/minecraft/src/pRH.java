package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class pRH
extends yBi {
    public pRH(long l, yBi yBi2) {
        super(l);
        this.field_37dd7cc_Dne = yBi2;
    }

    @Override
    public int[] method_d4dc17ca_Dne(int n, int n2, int n3, int n4) {
        int[] nArray = this.field_37dd7cc_Dne.method_d4dc17ca_Dne(n - 1, n2 - 1, n3 + 2, n4 + 2);
        int[] nArray2 = Xyv.method_16c585b_Dne(n3 * n4);
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n3; ++j) {
                int n5;
                int n6;
                int n7;
                int n8;
                this.method_16d429a_Dne(j + n, i + n2);
                int n9 = nArray[j + 1 + (i + 1) * (n3 + 2)];
                if (n9 == OdI.field_ab2400ae_ooe.field_267cf5_Qnq) {
                    n8 = nArray[j + 1 + (i + 1 - 1) * (n3 + 2)];
                    n7 = nArray[j + 1 + 1 + (i + 1) * (n3 + 2)];
                    n6 = nArray[j + 1 - 1 + (i + 1) * (n3 + 2)];
                    n5 = nArray[j + 1 + (i + 1 + 1) * (n3 + 2)];
                    if (n8 != OdI.field_36b3bf8_Dne.field_267cf5_Qnq && n7 != OdI.field_36b3bf8_Dne.field_267cf5_Qnq && n6 != OdI.field_36b3bf8_Dne.field_267cf5_Qnq && n5 != OdI.field_36b3bf8_Dne.field_267cf5_Qnq) {
                        nArray2[j + i * n3] = n9;
                        continue;
                    }
                    nArray2[j + i * n3] = OdI.field_3285579e_trS.field_267cf5_Qnq;
                    continue;
                }
                if (n9 != OdI.field_36b3bf8_Dne.field_267cf5_Qnq && n9 != OdI.field_14141222_div.field_267cf5_Qnq && n9 != OdI.field_161e6521_DyG.field_267cf5_Qnq && n9 != OdI.field_5e54aabf_Qnq.field_267cf5_Qnq) {
                    n8 = nArray[j + 1 + (i + 1 - 1) * (n3 + 2)];
                    n7 = nArray[j + 1 + 1 + (i + 1) * (n3 + 2)];
                    n6 = nArray[j + 1 - 1 + (i + 1) * (n3 + 2)];
                    n5 = nArray[j + 1 + (i + 1 + 1) * (n3 + 2)];
                    if (n8 != OdI.field_36b3bf8_Dne.field_267cf5_Qnq && n7 != OdI.field_36b3bf8_Dne.field_267cf5_Qnq && n6 != OdI.field_36b3bf8_Dne.field_267cf5_Qnq && n5 != OdI.field_36b3bf8_Dne.field_267cf5_Qnq) {
                        nArray2[j + i * n3] = n9;
                        continue;
                    }
                    nArray2[j + i * n3] = OdI.field_1f002cbc_qLR.field_267cf5_Qnq;
                    continue;
                }
                if (n9 == OdI.field_5e54aabf_Qnq.field_267cf5_Qnq) {
                    n8 = nArray[j + 1 + (i + 1 - 1) * (n3 + 2)];
                    n7 = nArray[j + 1 + 1 + (i + 1) * (n3 + 2)];
                    n6 = nArray[j + 1 - 1 + (i + 1) * (n3 + 2)];
                    n5 = nArray[j + 1 + (i + 1 + 1) * (n3 + 2)];
                    if (n8 == OdI.field_5e54aabf_Qnq.field_267cf5_Qnq && n7 == OdI.field_5e54aabf_Qnq.field_267cf5_Qnq && n6 == OdI.field_5e54aabf_Qnq.field_267cf5_Qnq && n5 == OdI.field_5e54aabf_Qnq.field_267cf5_Qnq) {
                        nArray2[j + i * n3] = n9;
                        continue;
                    }
                    nArray2[j + i * n3] = OdI.field_757756e5_EyB.field_267cf5_Qnq;
                    continue;
                }
                nArray2[j + i * n3] = n9;
            }
        }
        return nArray2;
    }
}

