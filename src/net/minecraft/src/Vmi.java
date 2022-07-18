package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class Vmi
extends flF {
    private fZI field_3758af7_Dne;

    public Vmi(fZI fZI2) {
        this.field_3758af7_Dne = fZI2;
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_2092ab_Dne = 0.0f;
        this.field_21260a_FWm = 0.0f;
        if (this.field_3758af7_Dne.field_37c9f9e_Dne.field_2092bf_Dne) {
            this.field_21260a_FWm += 1.0f;
        }
        if (this.field_3758af7_Dne.field_75c46d8b_bzF.field_2092bf_Dne) {
            this.field_21260a_FWm -= 1.0f;
        }
        if (this.field_3758af7_Dne.field_20366b7d_FWm.field_2092bf_Dne) {
            this.field_2092ab_Dne += 1.0f;
        }
        if (this.field_3758af7_Dne.field_5e660e65_Qnq.field_2092bf_Dne) {
            this.field_2092ab_Dne -= 1.0f;
        }
        this.field_2092bf_Dne = this.field_3758af7_Dne.field_714023e4_aFZ.field_2092bf_Dne;
        this.field_21261e_FWm = this.field_3758af7_Dne.field_5cd08f2_IjH.field_2092bf_Dne;
        if (this.field_21261e_FWm) {
            this.field_2092ab_Dne = (float)((double)this.field_2092ab_Dne * 0.3);
            this.field_21260a_FWm = (float)((double)this.field_21260a_FWm * 0.3);
        }
    }
}

