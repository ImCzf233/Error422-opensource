package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class MHV
extends yBi {
    private yBi field_75c5a5b9_bzF;
    private yBi field_2037a3ab_FWm;

    @Override
    public void method_ce7f616a_Dne(long l) {
        this.field_2037a3ab_FWm.method_ce7f616a_Dne(l);
        this.field_75c5a5b9_bzF.method_ce7f616a_Dne(l);
        super.method_ce7f616a_Dne(l);
    }

    public MHV(long l, yBi yBi2, yBi yBi3) {
        super(l);
        this.field_2037a3ab_FWm = yBi2;
        this.field_75c5a5b9_bzF = yBi3;
    }

    @Override
    public int[] method_d4dc17ca_Dne(int n, int n2, int n3, int n4) {
        int[] nArray = this.field_2037a3ab_FWm.method_d4dc17ca_Dne(n, n2, n3, n4);
        int[] nArray2 = this.field_75c5a5b9_bzF.method_d4dc17ca_Dne(n, n2, n3, n4);
        int[] nArray3 = Xyv.method_16c585b_Dne(n3 * n4);
        for (int i = 0; i < n3 * n4; ++i) {
            if (nArray[i] == OdI.field_36b3bf8_Dne.field_267cf5_Qnq) {
                nArray3[i] = nArray[i];
                continue;
            }
            if (nArray2[i] >= 0) {
                if (nArray[i] == OdI.field_a21b6d60_kGO.field_267cf5_Qnq) {
                    nArray3[i] = OdI.field_6164f020_Zpi.field_267cf5_Qnq;
                    continue;
                }
                if (nArray[i] != OdI.field_ab2400ae_ooe.field_267cf5_Qnq && nArray[i] != OdI.field_3285579e_trS.field_267cf5_Qnq) {
                    nArray3[i] = nArray2[i];
                    continue;
                }
                nArray3[i] = OdI.field_3285579e_trS.field_267cf5_Qnq;
                continue;
            }
            nArray3[i] = nArray[i];
        }
        return nArray3;
    }
}

