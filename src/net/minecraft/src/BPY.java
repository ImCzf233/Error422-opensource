package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class BPY
extends RsG {
    private float field_2092ab_Dne = 1.0f;

    public int method_907a9d14_Qnq() {
        return this.method_23123967_Dne().method_ce7f5d95_Dne(3);
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        WkD wkD2 = wkD.method_2851c945_Dne("Item");
        if (wkD2 != null && !wkD2.method_7a46289e_Dne()) {
            this.method_7c61cf15_Dne(NMq.method_7da70e76_Dne(wkD2));
            this.method_117d19ea_FWm(wkD.method_8f501fd0_Dne("ItemRotation"));
            if (wkD.method_8f501fe8_Dne("ItemDropChance")) {
                this.field_2092ab_Dne = wkD.method_8f501fd4_Dne("ItemDropChance");
            }
        }
        super.method_66a36cd8_FWm(wkD);
    }

    @Override
    public int method_ae128dba_bzF() {
        return 9;
    }

    public BPY(Qnq qnq, int n, int n2, int n3, int n4) {
        super(qnq, n, n2, n3, n4);
        this.method_ce7f5da9_Dne(n4);
    }

    public BPY(Qnq qnq) {
        super(qnq);
    }

    @Override
    protected void method_7c6f6039_FWm() {
        this.method_23123967_Dne().method_16cca7a_Dne(2, 5);
        this.method_23123967_Dne().method_ad009545_Dne(3, (byte)0);
    }

    public void method_7c61cf15_Dne(NMq nMq) {
        nMq = nMq.method_23040479_Dne();
        nMq.field_2092ae_Dne = 1;
        nMq.method_6807053c_Dne(this);
        this.method_23123967_Dne().method_62ca2346_FWm(2, nMq);
        this.method_23123967_Dne().method_ce7f5da9_Dne(2);
    }

    public void method_117d19ea_FWm(int n) {
        this.method_23123967_Dne().method_62ca2346_FWm(3, (byte)(n % 4));
    }

    public NMq method_23040479_Dne() {
        return this.method_23123967_Dne().method_9e6e1a08_Dne(2);
    }

    @Override
    public boolean method_21db0ca_a_(FiG fiG) {
        if (this.method_23040479_Dne() == null) {
            NMq nMq = fiG.method_23040479_Dne();
            if (nMq != null && !this.field_36c4f18_Dne.field_2d2a05_aFZ) {
                this.method_7c61cf15_Dne(nMq);
                if (!fiG.field_37cb681_Dne.field_267d06_Qnq && --nMq.field_2092ae_Dne <= 0) {
                    fiG.field_36a059b_Dne.method_6e3a6b66_Dne(fiG.field_36a059b_Dne.field_2092ae_Dne, null);
                }
            }
        } else if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            this.method_117d19ea_FWm(this.method_907a9d14_Qnq() + 1);
        }
        return true;
    }

    @Override
    public boolean method_ce7f4ae8_Dne(double d) {
        double d2 = 16.0;
        return d < (d2 *= 64.0 * this.field_267cf0_Qnq) * d2;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 9;
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        if (this.method_23040479_Dne() != null) {
            wkD.method_312ec00d_Dne("Item", this.method_23040479_Dne().method_7dab90f8_Dne(new WkD()));
            wkD.method_5ab43558_Dne("ItemRotation", (byte)this.method_907a9d14_Qnq());
            wkD.method_5ab4445c_Dne("ItemDropChance", this.field_2092ab_Dne);
        }
        super.method_8d4fb917_Dne(wkD);
    }

    @Override
    public void method_ae128dc7_bzF() {
        this.method_2cda29ee_Dne(new NMq(dEr.field_7fc699d8_FUM), 0.0f);
        NMq nMq = this.method_23040479_Dne();
        if (nMq != null && this.field_7331eae7_Dne.nextFloat() < this.field_2092ab_Dne) {
            nMq = nMq.method_23040479_Dne();
            nMq.method_6807053c_Dne(null);
            this.method_2cda29ee_Dne(nMq, 0.0f);
        }
    }
}

