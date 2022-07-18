package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class xxt {
    int field_2092ae_Dne = 0;
    private final int field_388da6_zGp;
    String[][] field_3f4f9fe5_Dne;
    List field_f27c122c_Dne = new ArrayList();
    private final int field_2e5f1b_bzF;
    private final int field_267cf5_Qnq;
    String[] field_f5e54dca_Dne;
    String[] field_1e416769_FWm;
    private final int field_2d29f4_aFZ;
    int field_21260d_FWm = 0;

    private String method_eecad346_Dne() {
        irb irb2 = irb.method_2310d392_Dne();
        String string = irb2.method_39193c_Dne("options.difficulty");
        return string + ": " + this.field_f5e54dca_Dne[this.field_2092ae_Dne];
    }

    private String method_d1f1ed87_FWm() {
        irb irb2 = irb.method_2310d392_Dne();
        String string = irb2.method_39193c_Dne("mco.gameMode");
        return string + ": " + this.field_1e416769_FWm[this.field_21260d_FWm];
    }

    void method_81183ff7_Dne(pee_0 pee_02) {
        if (pee_02.field_2092bf_Dne) {
            if (pee_02.field_2d29f4_aFZ == 5005) {
                this.field_2092ae_Dne = (this.field_2092ae_Dne + 1) % this.field_f5e54dca_Dne.length;
                pee_02.field_569fcf45_Dne = this.method_eecad346_Dne();
            } else if (pee_02.field_2d29f4_aFZ == 5006) {
                this.field_21260d_FWm = (this.field_21260d_FWm + 1) % this.field_1e416769_FWm.length;
                pee_02.field_569fcf45_Dne = this.method_d1f1ed87_FWm();
            }
        }
    }

    private void method_7c6f6039_FWm() {
        irb irb2 = irb.method_2310d392_Dne();
        this.field_f5e54dca_Dne = new String[]{irb2.method_39193c_Dne("options.difficulty.normal"), irb2.method_39193c_Dne("options.difficulty.hard"), irb2.method_39193c_Dne("options.difficulty.peaceful"), irb2.method_39193c_Dne("options.difficulty.easy")};
        this.field_1e416769_FWm = new String[]{irb2.method_39193c_Dne("mco.gameMode.survival"), irb2.method_39193c_Dne("mco.gameMode.creative"), irb2.method_39193c_Dne("mco.gameMode.adventure")};
        this.field_3f4f9fe5_Dne = new String[][]{{irb2.method_39193c_Dne("mco.gameMode.survival.line1"), irb2.method_39193c_Dne("mco.gameMode.survival.line2")}, {irb2.method_39193c_Dne("mco.gameMode.creative.line1"), irb2.method_39193c_Dne("mco.gameMode.creative.line2")}, {irb2.method_39193c_Dne("mco.gameMode.adventure.line1"), irb2.method_39193c_Dne("mco.gameMode.adventure.line2")}};
    }

    public xxt(int n, int n2, int n3, int n4) {
        this.field_2e5f1b_bzF = n;
        this.field_267cf5_Qnq = n2;
        this.field_2d29f4_aFZ = n3;
        this.field_388da6_zGp = n4;
        this.method_7a46289a_Dne();
    }

    private void method_7a46289a_Dne() {
        this.method_7c6f6039_FWm();
        this.field_f27c122c_Dne.add(new pee_0(5005, this.field_2d29f4_aFZ, this.field_388da6_zGp + 1, 212, 20, this.method_eecad346_Dne()));
        this.field_f27c122c_Dne.add(new pee_0(5006, this.field_2d29f4_aFZ, this.field_388da6_zGp + 25, 212, 20, this.method_d1f1ed87_FWm()));
    }

    public void method_801d5574_Dne(qVZ qVZ2, msA msA2) {
        qVZ2.method_67d6d54c_FWm(msA2, this.field_3f4f9fe5_Dne[this.field_21260d_FWm][0], this.field_2d29f4_aFZ, this.field_388da6_zGp + 50, 0xA0A0A0);
        qVZ2.method_67d6d54c_FWm(msA2, this.field_3f4f9fe5_Dne[this.field_21260d_FWm][1], this.field_2d29f4_aFZ, this.field_388da6_zGp + 60, 0xA0A0A0);
    }
}

