package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class cXw
extends sAy {
    private int field_2e5f1b_bzF = 32;
    public static final List field_f27c122c_Dne = Arrays.asList(OdI.field_202507d7_FWm, OdI.field_75b309e5_bzF);
    private int field_267cf5_Qnq = 8;
    private int field_21260d_FWm = 0;

    public cXw() {
    }

    public cXw(Map map) {
        this();
        for (Object obj : map.entrySet()) { Map.Entry entry = (Map.Entry) obj;
            if (((String)entry.getKey()).equals("size")) {
                this.field_21260d_FWm = geR.method_fbd61737_Dne((String)entry.getValue(), this.field_21260d_FWm, 0);
                continue;
            }
            if (!((String)entry.getKey()).equals("distance")) continue;
            this.field_2e5f1b_bzF = geR.method_fbd61737_Dne((String)entry.getValue(), this.field_2e5f1b_bzF, this.field_267cf5_Qnq + 1);
        }
    }

    @Override
    protected JhS method_90454696_Dne(int n, int n2) {
        return new nwL(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n, n2, this.field_21260d_FWm);
    }

    @Override
    protected boolean method_16cca7e_Dne(int n, int n2) {
        boolean bl;
        int n3 = n;
        int n4 = n2;
        if (n < 0) {
            n -= this.field_2e5f1b_bzF - 1;
        }
        if (n2 < 0) {
            n2 -= this.field_2e5f1b_bzF - 1;
        }
        int n5 = n / this.field_2e5f1b_bzF;
        int n6 = n2 / this.field_2e5f1b_bzF;
        Random random = this.field_36c4f18_Dne.method_aed68399_Dne(n5, n6, 10387312);
        n5 *= this.field_2e5f1b_bzF;
        n6 *= this.field_2e5f1b_bzF;
        return n3 == (n5 += random.nextInt(this.field_2e5f1b_bzF - this.field_267cf5_Qnq)) && n4 == (n6 += random.nextInt(this.field_2e5f1b_bzF - this.field_267cf5_Qnq)) && (bl = this.field_36c4f18_Dne.method_2315aa7b_Dne().method_39acd2be_Dne(n3 * 16 + 8, n4 * 16 + 8, 0, field_f27c122c_Dne));
    }
}

