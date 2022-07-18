package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class PGM
extends osi {
    @Override
    public int method_7a46288d_Dne() {
        return 12;
    }

    @Override
    public void method_80692b1a_ICU() {
    }

    public PGM(Qnq qnq) {
        super(qnq);
        this.field_c480ca78_bzF = "/mob/cavespider.png";
        this.method_16b621a_Dne(0.7f, 0.5f);
    }

    @Override
    public boolean method_ad72a717_bzF(sMa sMa2) {
        if (super.method_ad72a717_bzF(sMa2)) {
            if (sMa2 instanceof FUH) {
                int n = 0;
                if (this.field_36c4f18_Dne.field_2d29f4_aFZ > 1) {
                    if (this.field_36c4f18_Dne.field_2d29f4_aFZ == 2) {
                        n = 7;
                    } else if (this.field_36c4f18_Dne.field_2d29f4_aFZ == 3) {
                        n = 15;
                    }
                }
                if (n > 0) {
                    ((FUH)sMa2).method_fe8e2b7b_Qnq(new NAx(SXd.field_84fe2985_ceE.field_2092ae_Dne, n * 20, 0));
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public float method_9a443a89_XHL() {
        return 0.7f;
    }
}

