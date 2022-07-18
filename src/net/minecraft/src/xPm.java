package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

public class xPm
implements gDn {
    private float field_388da3_zGp;
    private List field_6a0474ed_FWm;
    private int field_2d29f4_aFZ;
    protected int field_2092ae_Dne;
    private float field_21260a_FWm;
    private final String field_569fcf45_Dne;
    private float field_2092ab_Dne;
    protected int field_267cf5_Qnq = 0;
    private float field_2e5f18_bzF;
    protected int field_21260d_FWm;
    protected int field_2e5f1b_bzF = 0;
    private float field_2d29f1_aFZ;
    private int field_388da6_zGp;
    protected boolean field_2092bf_Dne;
    protected List field_f27c122c_Dne;
    private float field_267cf2_Qnq;
    protected dmo field_374ee26_Dne;

    public void method_c435ce32_Dne(xPm xPm2) {
        this.method_b279e42_Dne(xPm2.field_374ee26_Dne, xPm2.field_f27c122c_Dne, xPm2.field_2092ae_Dne, xPm2.field_21260d_FWm, xPm2.field_2d29f4_aFZ, xPm2.field_388da6_zGp, xPm2.field_2092bf_Dne);
    }

    @Override
    public float method_907a9d11_Qnq() {
        return this.field_267cf2_Qnq;
    }

    public void method_176c78b_Dne(BufferedReader bufferedReader) {
        ArrayList<INq> arrayList = new ArrayList<INq>();
        try {
            String string = bufferedReader.readLine();
            while (string != null) {
                if ((string = string.trim()).length() > 0) {
                    String[] stringArray;
                    String[] stringArray2 = stringArray = string.split(",");
                    int n = stringArray.length;
                    for (int i = 0; i < n; ++i) {
                        String string2 = stringArray2[i];
                        int n2 = string2.indexOf(42);
                        if (n2 > 0) {
                            Integer n3 = new Integer(string2.substring(0, n2));
                            Integer n4 = new Integer(string2.substring(n2 + 1));
                            arrayList.add(new INq(n3, n4));
                            continue;
                        }
                        arrayList.add(new INq(new Integer(string2), 1));
                    }
                }
                string = bufferedReader.readLine();
            }
        }
        catch (Exception exception) {
            System.err.println("Failed to read animation info for " + this.field_569fcf45_Dne + ": " + exception.getMessage());
        }
        if (!arrayList.isEmpty() && arrayList.size() < 600) {
            this.field_6a0474ed_FWm = arrayList;
        }
    }

    @Override
    public int method_907a9d14_Qnq() {
        return this.field_374ee26_Dne.method_907a9d14_Qnq();
    }

    @Override
    public int method_ae128dba_bzF() {
        return this.field_374ee26_Dne.method_ae128dba_bzF();
    }

    public void method_b279e42_Dne(dmo dmo2, List list, int n, int n2, int n3, int n4, boolean bl) {
        this.field_374ee26_Dne = dmo2;
        this.field_f27c122c_Dne = list;
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_2d29f4_aFZ = n3;
        this.field_388da6_zGp = n4;
        this.field_2092bf_Dne = bl;
        float f = 0.01f / (float)dmo2.method_ae128dba_bzF();
        float f2 = 0.01f / (float)dmo2.method_907a9d14_Qnq();
        this.field_2092ab_Dne = (float)n / (float)dmo2.method_ae128dba_bzF() + f;
        this.field_21260a_FWm = (float)(n + n3) / (float)dmo2.method_ae128dba_bzF() - f;
        this.field_2e5f18_bzF = (float)n2 / (float)dmo2.method_907a9d14_Qnq() + f2;
        this.field_267cf2_Qnq = (float)(n2 + n4) / (float)dmo2.method_907a9d14_Qnq() - f2;
        this.field_2d29f1_aFZ = (float)n3 / 16.0f;
        this.field_388da3_zGp = (float)n4 / 16.0f;
    }

    public void method_7a46289a_Dne() {
        if (this.field_6a0474ed_FWm != null) {
            INq iNq = (INq)this.field_6a0474ed_FWm.get(this.field_2e5f1b_bzF);
            ++this.field_267cf5_Qnq;
            if (this.field_267cf5_Qnq >= (Integer)iNq.method_df2f1019_FWm()) {
                int n = (Integer)iNq.method_fc07f5d8_Dne();
                this.field_2e5f1b_bzF = (this.field_2e5f1b_bzF + 1) % this.field_6a0474ed_FWm.size();
                this.field_267cf5_Qnq = 0;
                iNq = (INq)this.field_6a0474ed_FWm.get(this.field_2e5f1b_bzF);
                int n2 = (Integer)iNq.method_fc07f5d8_Dne();
                if (n != n2 && n2 >= 0 && n2 < this.field_f27c122c_Dne.size()) {
                    this.field_374ee26_Dne.method_dec1fe41_Dne(this.field_2092ae_Dne, this.field_21260d_FWm, (dmo)this.field_f27c122c_Dne.get(n2));
                }
            }
        } else {
            int n = this.field_2e5f1b_bzF;
            this.field_2e5f1b_bzF = (this.field_2e5f1b_bzF + 1) % this.field_f27c122c_Dne.size();
            if (n != this.field_2e5f1b_bzF) {
                this.field_374ee26_Dne.method_dec1fe41_Dne(this.field_2092ae_Dne, this.field_21260d_FWm, (dmo)this.field_f27c122c_Dne.get(this.field_2e5f1b_bzF));
            }
        }
    }

    @Override
    public int method_7a46288d_Dne() {
        return this.field_2092ae_Dne;
    }

    @Override
    public String method_eecad346_Dne() {
        return this.field_569fcf45_Dne;
    }

    @Override
    public int method_7c6f602c_FWm() {
        return this.field_21260d_FWm;
    }

    @Override
    public float method_7c6f6029_FWm() {
        return this.field_21260a_FWm;
    }

    @Override
    public float method_117d0715_FWm(double d) {
        float f = this.field_267cf2_Qnq - this.field_2e5f18_bzF;
        return this.field_2e5f18_bzF + f * ((float)d / 16.0f);
    }

    public static xPm method_28606920_Dne(String string) {
        return "clock".equals(string) ? new KTL() : ("compass".equals(string) ? new qjt() : new xPm(string));
    }

    @Override
    public float method_ce7f4ad4_Dne(double d) {
        float f = this.field_21260a_FWm - this.field_2092ab_Dne;
        return this.field_2092ab_Dne + f * ((float)d / 16.0f);
    }

    @Override
    public float method_7a46288a_Dne() {
        return this.field_2092ab_Dne;
    }

    protected xPm(String string) {
        this.field_569fcf45_Dne = string;
    }

    @Override
    public float method_ae128db7_bzF() {
        return this.field_2e5f18_bzF;
    }
}

