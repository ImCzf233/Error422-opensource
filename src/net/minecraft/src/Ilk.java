package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Ilk
extends vWZ {
    public byte field_2092a7_Dne;
    public byte field_212606_FWm;
    private Map field_da2182cf_FWm;
    public int field_2092ae_Dne;
    public List field_f27c122c_Dne;
    public Map<Object, GHe> field_83b1c1b0_Dne;
    public int field_21260d_FWm;
    public byte[] field_3f1c582_Dne = new byte[16384];

    public void method_2c2cf7c9_Dne(int n, int n2, int n3) {
        super.method_7a46289a_Dne();
        for (int i = 0; i < this.field_f27c122c_Dne.size(); ++i) {
            nJg nJg2 = (nJg)this.field_f27c122c_Dne.get(i);
            if (nJg2.field_3f1c589_Dne[n] < 0 || nJg2.field_3f1c589_Dne[n] > n2) {
                nJg2.field_3f1c589_Dne[n] = n2;
            }
            if (nJg2.field_4039e0a_FWm[n] >= 0 && nJg2.field_4039e0a_FWm[n] >= n3) continue;
            nJg2.field_4039e0a_FWm[n] = n3;
        }
    }

    public nJg method_53efb369_Dne(FiG fiG) {
        nJg nJg2 = (nJg)this.field_da2182cf_FWm.get(fiG);
        if (nJg2 == null) {
            nJg2 = new nJg(this, fiG);
            this.field_da2182cf_FWm.put(fiG, nJg2);
            this.field_f27c122c_Dne.add(nJg2);
        }
        return nJg2;
    }

    public void method_174dee1_Dne(byte[] byArray) {
        if (byArray[0] == 0) {
            int n = byArray[1] & 0xFF;
            int n2 = byArray[2] & 0xFF;
            for (int i = 0; i < byArray.length - 3; ++i) {
                this.field_3f1c582_Dne[(i + n2) * 128 + n] = byArray[i + 3];
            }
            this.method_7a46289a_Dne();
        } else if (byArray[0] == 1) {
            this.field_83b1c1b0_Dne.clear();
            for (int i = 0; i < (byArray.length - 1) / 3; ++i) {
                byte by = (byte)(byArray[i * 3 + 1] >> 4);
                byte by2 = byArray[i * 3 + 2];
                byte by3 = byArray[i * 3 + 3];
                byte by4 = (byte)(byArray[i * 3 + 1] & 0xF);
                this.field_83b1c1b0_Dne.put("icon-" + i, new GHe(this, by, by2, by3, by4));
            }
        } else if (byArray[0] == 2) {
            this.field_212606_FWm = byArray[1];
        }
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        this.field_2092a7_Dne = wkD.method_8f501fd0_Dne("dimension");
        this.field_2092ae_Dne = wkD.method_8f501fd7_Dne("xCenter");
        this.field_21260d_FWm = wkD.method_8f501fd7_Dne("zCenter");
        this.field_212606_FWm = wkD.method_8f501fd0_Dne("scale");
        if (this.field_212606_FWm < 0) {
            this.field_212606_FWm = 0;
        }
        if (this.field_212606_FWm > 4) {
            this.field_212606_FWm = (byte)4;
        }
        int n = wkD.method_8f501fe1_Dne("width");
        int n2 = wkD.method_8f501fe1_Dne("height");
        if (n == 128 && n2 == 128) {
            this.field_3f1c582_Dne = wkD.method_5ab3dd79_Dne("colors");
        } else {
            byte[] byArray = wkD.method_5ab3dd79_Dne("colors");
            this.field_3f1c582_Dne = new byte[16384];
            int n3 = (128 - n) / 2;
            int n4 = (128 - n2) / 2;
            for (int i = 0; i < n2; ++i) {
                int n5 = i + n4;
                if (n5 < 0 && n5 >= 128) continue;
                for (int j = 0; j < n; ++j) {
                    int n6 = j + n3;
                    if (n6 < 0 && n6 >= 128) continue;
                    this.field_3f1c582_Dne[n6 + n5 * 128] = byArray[j + i * n];
                }
            }
        }
    }

    public byte[] method_682eb878_Dne(NMq nMq, Qnq qnq, FiG fiG) {
        nJg nJg2 = (nJg)this.field_da2182cf_FWm.get(fiG);
        return nJg2 == null ? null : nJg2.method_fd81468_Dne(nMq);
    }

    public void method_672a90ac_Dne(FiG fiG, NMq nMq) {
        if (!this.field_da2182cf_FWm.containsKey(fiG)) {
            nJg nJg2 = new nJg(this, fiG);
            this.field_da2182cf_FWm.put(fiG, nJg2);
            this.field_f27c122c_Dne.add(nJg2);
        }
        if (!fiG.field_36a059b_Dne.method_55b582da_FWm(nMq)) {
            this.field_83b1c1b0_Dne.remove(fiG.method_193de2e9_a_());
        }
        for (int i = 0; i < this.field_f27c122c_Dne.size(); ++i) {
            nJg nJg3 = (nJg)this.field_f27c122c_Dne.get(i);
            if (!nJg3.field_3673728_Dne.field_2a9ae7_Zpi && (nJg3.field_3673728_Dne.field_36a059b_Dne.method_55b582da_FWm(nMq) || nMq.method_9a443a9d_XHL())) {
                if (nMq.method_9a443a9d_XHL() || nJg3.field_3673728_Dne.field_348572_qLR != this.field_2092a7_Dne) continue;
                this.method_e0d51410_Dne(0, nJg3.field_3673728_Dne.field_36c4f18_Dne, nJg3.field_3673728_Dne.method_193de2e9_a_(), nJg3.field_3673728_Dne.field_2f0dd3_div, nJg3.field_3673728_Dne.field_334487_mrb, nJg3.field_3673728_Dne.field_334489_mrb);
                continue;
            }
            this.field_da2182cf_FWm.remove(nJg3.field_3673728_Dne);
            this.field_f27c122c_Dne.remove(nJg3);
        }
        if (nMq.method_9a443a9d_XHL()) {
            this.method_e0d51410_Dne(1, fiG.field_36c4f18_Dne, "frame-" + nMq.method_22fe9860_Dne().field_2d29f4_aFZ, nMq.method_22fe9860_Dne().field_21260d_FWm, nMq.method_22fe9860_Dne().field_267cf5_Qnq, nMq.method_22fe9860_Dne().field_2092ae_Dne * 90);
        }
    }

    public Ilk(String string) {
        super(string);
        this.field_f27c122c_Dne = new ArrayList();
        this.field_da2182cf_FWm = new HashMap();
        this.field_83b1c1b0_Dne = new LinkedHashMap();
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        wkD.method_5ab43558_Dne("dimension", this.field_2092a7_Dne);
        wkD.method_5ab44f9f_Dne("xCenter", this.field_2092ae_Dne);
        wkD.method_5ab44f9f_Dne("zCenter", this.field_21260d_FWm);
        wkD.method_5ab43558_Dne("scale", this.field_212606_FWm);
        wkD.method_5ab47529_Dne("width", (short)128);
        wkD.method_5ab47529_Dne("height", (short)128);
        wkD.method_fbde2bab_Dne("colors", this.field_3f1c582_Dne);
    }

    private void method_e0d51410_Dne(int n, Qnq qnq, String string, double d, double d2, double d3) {
        byte by;
        int n2 = 1 << this.field_212606_FWm;
        float f = (float)(d - (double)this.field_2092ae_Dne) / (float)n2;
        float f2 = (float)(d2 - (double)this.field_21260d_FWm) / (float)n2;
        byte by2 = (byte)((double)(f * 2.0f) + 0.5);
        byte by3 = (byte)((double)(f2 * 2.0f) + 0.5);
        int n3 = 63;
        if (f >= (float)(-n3) && f2 >= (float)(-n3) && f <= (float)n3 && f2 <= (float)n3) {
            by = (byte)((d3 += d3 < 0.0 ? -8.0 : 8.0) * 16.0 / 360.0);
            if (this.field_2092a7_Dne < 0) {
                int n4 = (int)(qnq.method_231798c9_Dne().method_ae128dbb_bzF() / 10L);
                by = (byte)(n4 * n4 * 34187121 + n4 * 121 >> 15 & 0xF);
            }
        } else {
            if (Math.abs(f) >= 320.0f || Math.abs(f2) >= 320.0f) {
                this.field_83b1c1b0_Dne.remove(string);
                return;
            }
            n = 6;
            by = 0;
            if (f <= (float)(-n3)) {
                by2 = (byte)((double)(n3 * 2) + 2.5);
            }
            if (f2 <= (float)(-n3)) {
                by3 = (byte)((double)(n3 * 2) + 2.5);
            }
            if (f >= (float)n3) {
                by2 = (byte)(n3 * 2 + 1);
            }
            if (f2 >= (float)n3) {
                by3 = (byte)(n3 * 2 + 1);
            }
        }
        this.field_83b1c1b0_Dne.put(string, new GHe(this, (byte)n, by2, by3, by));
    }
}

