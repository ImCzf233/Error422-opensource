package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public class Khi
extends sAy {
    private double field_2092a9_Dne = 32.0;
    private int field_21260d_FWm = 3;
    private boolean field_2092bf_Dne;
    private OdI[] field_83618953_Dne = new OdI[]{OdI.field_75b309e5_bzF, OdI.field_712ec03e_aFZ, OdI.field_5e54aabf_Qnq, OdI.field_161e6521_DyG, OdI.field_f09cfaf0_zGp, OdI.field_a21b6d60_kGO, OdI.field_aefbe473_udO, OdI.field_35ca9ce1_ATE, OdI.field_719a51c7_Vxn, OdI.field_757756e5_EyB, OdI.field_d448080_FfS, OdI.field_3952279f_OdI};
    private Sxs[] field_8363aaf9_Dne = new Sxs[3];

    @Override
    protected List method_c012bed0_a_() {
        ArrayList<EyB> arrayList = new ArrayList<EyB>();
        for (Sxs sxs : this.field_8363aaf9_Dne) {
            if (sxs == null) continue;
            arrayList.add(sxs.method_9e6aa22c_Dne(64));
        }
        return arrayList;
    }

    public Khi() {
    }

    @Override
    protected boolean method_16cca7e_Dne(int n, int n2) {
        if (!this.field_2092bf_Dne) {
            Random random = new Random();
            random.setSeed(this.field_36c4f18_Dne.method_7a46288e_Dne());
            double d = random.nextDouble() * Math.PI * 2.0;
            int n3 = 1;
            for (int i = 0; i < this.field_8363aaf9_Dne.length; ++i) {
                double d2 = (1.25 * (double)n3 + random.nextDouble()) * this.field_2092a9_Dne * (double)n3;
                int n4 = (int)Math.round(Math.cos(d) * d2);
                int n5 = (int)Math.round(Math.sin(d) * d2);
                ArrayList arrayList = new ArrayList();
                Collections.addAll(arrayList, this.field_83618953_Dne);
                EyB eyB = this.field_36c4f18_Dne.method_2315aa7b_Dne().method_962b7b29_Dne((n4 << 4) + 8, (n5 << 4) + 8, 112, arrayList, random);
                if (eyB != null) {
                    n4 = eyB.field_2092ae_Dne >> 4;
                    n5 = eyB.field_2e5f1b_bzF >> 4;
                }
                this.field_8363aaf9_Dne[i] = new Sxs(n4, n5);
                d += Math.PI * 2 * (double)n3 / (double)this.field_21260d_FWm;
                if (i != this.field_21260d_FWm) continue;
                n3 += 2 + random.nextInt(5);
                this.field_21260d_FWm += 1 + random.nextInt(2);
            }
            this.field_2092bf_Dne = true;
        }
        for (Sxs sxs : this.field_8363aaf9_Dne) {
            if (n != sxs.field_2092ae_Dne || n2 != sxs.field_21260d_FWm) continue;
            return true;
        }
        return false;
    }

    @Override
    protected JhS method_90454696_Dne(int n, int n2) {
        AAE aAE = new AAE(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n, n2);
        while (aAE.method_d9e7d4_Dne().isEmpty() || ((Kci)aAE.method_d9e7d4_Dne().get((int)0)).field_36606f8_Dne == null) {
            aAE = new AAE(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n, n2);
        }
        return aAE;
    }

    public Khi(Map map) {
        for (Object obj : map.entrySet()) {
        	Map.Entry entry = (Entry) obj;
            if (((String)entry.getKey()).equals("distance")) {
                this.field_2092a9_Dne = geR.method_fbd3be92_Dne((String)entry.getValue(), this.field_2092a9_Dne, 1.0);
                continue;
            }
            if (((String)entry.getKey()).equals("count")) {
                this.field_8363aaf9_Dne = new Sxs[geR.method_fbd61737_Dne((String)entry.getValue(), this.field_8363aaf9_Dne.length, 1)];
                continue;
            }
            if (!((String)entry.getKey()).equals("spread")) continue;
            this.field_21260d_FWm = geR.method_fbd61737_Dne((String)entry.getValue(), this.field_21260d_FWm, 1);
        }
    }
}

