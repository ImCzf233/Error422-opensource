package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class CfM
implements Comparator {
    final ZyA field_37089ea_Dne;
    final LAz field_3696167_Dne;

    CfM(LAz lAz, ZyA zyA) {
        this.field_3696167_Dne = lAz;
        this.field_37089ea_Dne = zyA;
    }

    public int method_72d9134d_Dne(isy isy2, isy isy3) {
        int n = isy2.method_7a46288d_Dne();
        int n2 = isy3.method_7a46288d_Dne();
        RLC rLC = null;
        RLC rLC2 = null;
        if (this.field_3696167_Dne.field_20b857_DyG == 0) {
            rLC = trP.field_85a6f5b7_Qnq[n];
            rLC2 = trP.field_85a6f5b7_Qnq[n2];
        } else if (this.field_3696167_Dne.field_20b857_DyG == 1) {
            rLC = trP.field_fde23b9f_FWm[n];
            rLC2 = trP.field_fde23b9f_FWm[n2];
        } else if (this.field_3696167_Dne.field_20b857_DyG == 2) {
            rLC = trP.field_5a147b51_bzF[n];
            rLC2 = trP.field_5a147b51_bzF[n2];
        }
        if (rLC != null || rLC2 != null) {
            int n3;
            if (rLC == null) {
                return 1;
            }
            if (rLC2 == null) {
                return -1;
            }
            int n4 = ZyA.method_3e9ab6eb_Dne(this.field_3696167_Dne.field_37089ea_Dne).method_831230f1_Dne(rLC);
            if (n4 != (n3 = ZyA.method_3e9ab6eb_Dne(this.field_3696167_Dne.field_37089ea_Dne).method_831230f1_Dne(rLC2))) {
                return (n4 - n3) * this.field_3696167_Dne.field_2f0dd8_div;
            }
        }
        return n - n2;
    }

    public int compare(Object object, Object object2) {
        return this.method_72d9134d_Dne((isy)object, (isy)object2);
    }
}

