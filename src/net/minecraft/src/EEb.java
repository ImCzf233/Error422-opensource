package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class EEb {
    FUH field_366ec33_Dne;
    List field_f27c122c_Dne = new ArrayList();
    List field_6a0474ed_FWm = new ArrayList();

    public EEb(FUH fUH) {
        this.field_366ec33_Dne = fUH;
    }

    public boolean method_bb7dd824_Dne(sMa sMa2) {
        if (this.field_f27c122c_Dne.contains(sMa2)) {
            return true;
        }
        if (this.field_6a0474ed_FWm.contains(sMa2)) {
            return false;
        }
        this.field_366ec33_Dne.field_36c4f18_Dne.field_365731d_Dne.method_8f501fe4_Dne("canSee");
        boolean bl = this.field_366ec33_Dne.method_3e501ffd_Qnq(sMa2);
        this.field_366ec33_Dne.field_36c4f18_Dne.field_365731d_Dne.method_7c6f6039_FWm();
        if (bl) {
            this.field_f27c122c_Dne.add(sMa2);
        } else {
            this.field_6a0474ed_FWm.add(sMa2);
        }
        return bl;
    }

    public void method_7a46289a_Dne() {
        this.field_f27c122c_Dne.clear();
        this.field_6a0474ed_FWm.clear();
    }
}

