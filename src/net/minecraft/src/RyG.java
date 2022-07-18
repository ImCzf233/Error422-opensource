package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class RyG
extends yBi {
    @Override
    public int[] method_d4dc17ca_Dne(int n, int n2, int n3, int n4) {
        int[] nArray = this.field_37dd7cc_Dne.method_d4dc17ca_Dne(n - 1, n2 - 1, n3 + 2, n4 + 2);
        int[] nArray2 = Xyv.method_16c585b_Dne(n3 * n4);
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n3; ++j) {
                this.method_16d429a_Dne(j + n, i + n2);
                int n5 = nArray[j + 1 + (i + 1) * (n3 + 2)];
                nArray2[j + i * n3] = (n5 != OdI.field_161e6521_DyG.field_267cf5_Qnq || this.method_ce7f5d9c_Dne(6) != 0) && (n5 != OdI.field_d448080_FfS.field_267cf5_Qnq && n5 != OdI.field_3952279f_OdI.field_267cf5_Qnq || this.method_ce7f5d9c_Dne(8) != 0) ? n5 : OdI.field_14141222_div.field_267cf5_Qnq;
            }
        }
        return nArray2;
    }

    public RyG(long l, yBi yBi2) {
        super(l);
        this.field_37dd7cc_Dne = yBi2;
    }
}

