package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class fPe
extends JhS {
    public fPe(Qnq qnq, Random random, int n, int n2) {
        OdI odI = qnq.method_90477c37_Dne(n * 16 + 8, n2 * 16 + 8);
        if (odI != OdI.field_d448080_FfS && odI != OdI.field_3952279f_OdI) {
            if (odI == OdI.field_161e6521_DyG) {
                Nle nle = new Nle(random, n * 16, n2 * 16);
                this.field_3dc2cc53_Dne.add(nle);
            } else {
                UeW ueW = new UeW(random, n * 16, n2 * 16);
                this.field_3dc2cc53_Dne.add(ueW);
            }
        } else {
            sMe sMe2 = new sMe(random, n * 16, n2 * 16);
            this.field_3dc2cc53_Dne.add(sMe2);
        }
        this.method_7a46289a_Dne();
    }
}

