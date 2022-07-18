package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class tMg
extends sAy {
    private static List<OdI> field_f27c122c_Dne = Arrays.asList(OdI.field_75b309e5_bzF, OdI.field_35ca9ce1_ATE, OdI.field_d448080_FfS, OdI.field_3952279f_OdI, OdI.field_161e6521_DyG);
    private int field_2e5f1b_bzF = 8;
    private List field_6a0474ed_FWm = new ArrayList();
    private int field_21260d_FWm = 32;

    public List method_adea226d_Dne() {
        return this.field_6a0474ed_FWm;
    }

    public tMg() {
        this.field_6a0474ed_FWm.add(new oIf(bVr.class, 1, 1, 1));
    }

    @Override
    protected boolean method_16cca7e_Dne(int n, int n2) {
        int n3 = n;
        int n4 = n2;
        if (n < 0) {
            n -= this.field_21260d_FWm - 1;
        }
        if (n2 < 0) {
            n2 -= this.field_21260d_FWm - 1;
        }
        int n5 = n / this.field_21260d_FWm;
        int n6 = n2 / this.field_21260d_FWm;
        Random random = this.field_36c4f18_Dne.method_aed68399_Dne(n5, n6, 14357617);
        n5 *= this.field_21260d_FWm;
        n6 *= this.field_21260d_FWm;
        if (n3 == (n5 += random.nextInt(this.field_21260d_FWm - this.field_2e5f1b_bzF)) && n4 == (n6 += random.nextInt(this.field_21260d_FWm - this.field_2e5f1b_bzF))) {
            OdI odI = this.field_36c4f18_Dne.method_2315aa7b_Dne().method_90477c37_Dne(n3 * 16 + 8, n4 * 16 + 8);
            for (OdI odI2 : field_f27c122c_Dne) {
                if (odI != odI2) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    protected JhS method_90454696_Dne(int n, int n2) {
        return new fPe(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n, n2);
    }

    public tMg(Map map) {
        this();
        for (Object obj : map.entrySet()) { Map.Entry entry = (Map.Entry) obj;
            if (!((String)entry.getKey()).equals("distance")) continue;
            this.field_21260d_FWm = geR.method_fbd61737_Dne((String)entry.getValue(), this.field_21260d_FWm, this.field_2e5f1b_bzF + 1);
        }
    }
}

