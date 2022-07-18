package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class Iny
extends dEr {
    @Override
    public NMq method_d4201764_Dne(NMq nMq, Qnq qnq, FiG fiG) {
        fiG.method_7c61cf15_Dne(nMq);
        return nMq;
    }

    public static boolean method_8d4fb91b_Dne(WkD wkD) {
        if (wkD == null) {
            return false;
        }
        if (!wkD.method_8f501fe8_Dne("pages")) {
            return false;
        }
        mbZ mbZ2 = (mbZ)wkD.method_285c494f_Dne("pages");
        for (int i = 0; i < mbZ2.method_7a46288d_Dne(); ++i) {
            QNx qNx = (QNx)mbZ2.method_77d0d055_FWm(i);
            if (qNx.field_569fcf45_Dne == null) {
                return false;
            }
            if (qNx.field_569fcf45_Dne.length() <= 256) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean method_b0a28148_div() {
        return true;
    }

    public Iny(int n) {
        super(n);
        this.method_9e77fc49_Dne(1);
    }
}

