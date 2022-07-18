package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class CEb
extends xZE {
    @Override
    public String method_eecad346_Dne() {
        return "tp";
    }

    @Override
    public List method_cac7816d_Dne(gnI gnI2, String[] stringArray) {
        return stringArray.length != 1 && stringArray.length != 2 ? null : CEb.method_80180c4d_Dne(stringArray, jwh_0.method_2302cf90_Dne().method_631ac9e9_Dne());
    }

    @Override
    public int method_7a46288d_Dne() {
        return 2;
    }

    private double method_1e789af1_Dne(gnI gnI2, double d, String string) {
        return this.method_62cc4691_Dne(gnI2, d, string, -30000000, 30000000);
    }

    private double method_62cc4691_Dne(gnI gnI2, double d, String string, int n, int n2) {
        double d2;
        boolean bl = string.startsWith("~");
        double d3 = d2 = bl ? d : 0.0;
        if (!bl || string.length() > 1) {
            boolean bl2 = string.contains(".");
            if (bl) {
                string = string.substring(1);
            }
            d2 += CEb.method_d491c9dd_Dne(gnI2, string);
            if (!bl2 && !bl) {
                d2 += 0.5;
            }
        }
        if (n != 0 || n2 != 0) {
            if (d2 < (double)n) {
                throw new PUA("commands.generic.double.tooSmall", d2, n);
            }
            if (d2 > (double)n2) {
                throw new PUA("commands.generic.double.tooBig", d2, n2);
            }
        }
        return d2;
    }

    @Override
    public boolean method_cb1fa962_Dne(String[] stringArray, int n) {
        return n == 0;
    }

    @Override
    public String method_aef63bdb_Dne(gnI gnI2) {
        return gnI2.method_98148f73_Dne("commands.tp.usage", new Object[0]);
    }

    @Override
    public void method_4036a99a_Dne(gnI gnI2, String[] stringArray) {
        PJQ pJQ;
        if (stringArray.length < 1) {
            throw new fxw_0("commands.tp.usage", new Object[0]);
        }
        if (stringArray.length != 2 && stringArray.length != 4) {
            pJQ = CEb.method_8672275f_Dne(gnI2);
        } else {
            pJQ = CEb.method_4145cce9_Dne(gnI2, stringArray[0]);
            if (pJQ == null) {
                throw new FKZ();
            }
        }
        if (stringArray.length != 3 && stringArray.length != 4) {
            if (stringArray.length == 1 || stringArray.length == 2) {
                PJQ pJQ2 = CEb.method_4145cce9_Dne(gnI2, stringArray[stringArray.length - 1]);
                if (pJQ2 == null) {
                    throw new FKZ();
                }
                if (pJQ2.field_36c4f18_Dne != pJQ.field_36c4f18_Dne) {
                    CEb.method_7424c4e2_Dne(gnI2, "commands.tp.notSameDimension", new Object[0]);
                    return;
                }
                pJQ.method_ad72a713_bzF(null);
                pJQ.field_36dacd0_Dne.method_c38d48a4_Dne(pJQ2.field_2f0dd3_div, pJQ2.field_22c5fd_IjH, pJQ2.field_334487_mrb, pJQ2.field_334489_mrb, pJQ2.field_29186a_XHL);
                CEb.method_7424c4e2_Dne(gnI2, "commands.tp.success", pJQ.method_eecad346_Dne(), pJQ2.method_eecad346_Dne());
            }
        } else if (pJQ.field_36c4f18_Dne != null) {
            int n = stringArray.length - 3;
            double d = this.method_1e789af1_Dne(gnI2, pJQ.field_2f0dd3_div, stringArray[n++]);
            double d2 = this.method_62cc4691_Dne(gnI2, pJQ.field_22c5fd_IjH, stringArray[n++], 0, 0);
            double d3 = this.method_1e789af1_Dne(gnI2, pJQ.field_334487_mrb, stringArray[n++]);
            pJQ.method_ad72a713_bzF(null);
            pJQ.method_a663d9a5_FWm(d, d2, d3);
            CEb.method_7424c4e2_Dne(gnI2, "commands.tp.success.coordinates", pJQ.method_eecad346_Dne(), d, d2, d3);
        }
    }
}

