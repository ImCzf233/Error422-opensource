package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class ulE {
    public boolean field_2092bf_Dne;
    public int field_21260d_FWm = 0;
    public int field_2092ae_Dne;
    public String field_569fcf45_Dne;
    public static List<ulE> field_f27c122c_Dne = new ArrayList();
    public static ZGT field_36fd085_Dne = new ZGT();

    public static void method_ce7f5da9_Dne(int n) {
        ulE ulE2 = (ulE)field_36fd085_Dne.method_394ba0a9_Dne(n);
        if (ulE2 != null) {
            ++ulE2.field_21260d_FWm;
        }
    }

    public static void method_7a46289a_Dne() {
        for (ulE ulE2 : field_f27c122c_Dne) {
            ulE2.method_ae128dc7_bzF();
        }
    }

    public ulE(String string, int n) {
        this.field_569fcf45_Dne = string;
        this.field_2092ae_Dne = n;
        field_f27c122c_Dne.add(this);
        field_36fd085_Dne.method_ad009545_Dne(n, this);
    }

    public boolean method_7a46289e_Dne() {
        if (this.field_21260d_FWm == 0) {
            return false;
        }
        --this.field_21260d_FWm;
        return true;
    }

    private void method_ae128dc7_bzF() {
        this.field_21260d_FWm = 0;
        this.field_2092bf_Dne = false;
    }

    public static void method_16d0a4b_Dne(int n, boolean bl) {
        ulE ulE2 = (ulE)field_36fd085_Dne.method_394ba0a9_Dne(n);
        if (ulE2 != null) {
            ulE2.field_2092bf_Dne = bl;
        }
    }

    public static void method_7c6f6039_FWm() {
        field_36fd085_Dne.method_7a46289a_Dne();
        for (ulE ulE2 : field_f27c122c_Dne) {
            field_36fd085_Dne.method_ad009545_Dne(ulE2.field_2092ae_Dne, ulE2);
        }
    }
}

