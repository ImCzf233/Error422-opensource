package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public abstract class BRM
extends HzK {
    protected HAo field_3678e96_Dne = new HAo(this);

    public FUH method_2df40558_aFZ() {
        return this.field_36c4f18_Dne.method_284a07d1_Dne(this.method_d1f1ed87_FWm());
    }

    public void method_4e0836dc_mrb(boolean bl) {
        byte by = this.field_378ab08_Dne.method_ce7f5d95_Dne(16);
        if (bl) {
            this.field_378ab08_Dne.method_62ca2346_FWm(16, (byte)(by | 4));
        } else {
            this.field_378ab08_Dne.method_62ca2346_FWm(16, (byte)(by & 0xFFFFFFFB));
        }
    }

    public boolean method_80692b1e_ICU() {
        return (this.field_378ab08_Dne.method_ce7f5d95_Dne(16) & 1) != 0;
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        super.method_66a36cd8_FWm(wkD);
        String string = wkD.method_39193c_Dne("Owner");
        if (string.length() > 0) {
            this.method_8f501fe4_Dne(string);
            this.method_4e0836dc_mrb(true);
        }
        this.field_3678e96_Dne.method_ce7f9d7a_Dne(wkD.method_110c4dc7_FWm("Sitting"));
        this.method_ae43cb5b_XHL(wkD.method_110c4dc7_FWm("Sitting"));
    }

    @Override
    public void method_ce7f4362_Dne(byte by) {
        if (by == 7) {
            this.method_ce92b9a6_IjH(true);
        } else if (by == 6) {
            this.method_ce92b9a6_IjH(false);
        } else {
            super.method_ce7f4362_Dne(by);
        }
    }

    public BRM(Qnq qnq) {
        super(qnq);
    }

    @Override
    protected void method_7c6f6039_FWm() {
        super.method_7c6f6039_FWm();
        this.field_378ab08_Dne.method_ad009545_Dne(16, (byte)0);
        this.field_378ab08_Dne.method_ad009545_Dne(17, "");
    }

    protected void method_ce92b9a6_IjH(boolean bl) {
        String string = "heart";
        if (!bl) {
            string = "smoke";
        }
        for (int i = 0; i < 7; ++i) {
            double d = this.field_7331eae7_Dne.nextGaussian() * 0.02;
            double d2 = this.field_7331eae7_Dne.nextGaussian() * 0.02;
            double d3 = this.field_7331eae7_Dne.nextGaussian() * 0.02;
            this.field_36c4f18_Dne.method_8600ec24_Dne(string, this.field_2f0dd3_div + (double)(this.field_7331eae7_Dne.nextFloat() * this.field_342261_ooe * 2.0f) - (double)this.field_342261_ooe, this.field_22c5fd_IjH + 0.5 + (double)(this.field_7331eae7_Dne.nextFloat() * this.field_367151_trS), this.field_334487_mrb + (double)(this.field_7331eae7_Dne.nextFloat() * this.field_342261_ooe * 2.0f) - (double)this.field_342261_ooe, d, d2, d3);
        }
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        super.method_8d4fb917_Dne(wkD);
        if (this.method_d1f1ed87_FWm() == null) {
            wkD.method_abaa98ae_Dne("Owner", "");
        } else {
            wkD.method_abaa98ae_Dne("Owner", this.method_d1f1ed87_FWm());
        }
        wkD.method_5ab48f70_Dne("Sitting", this.method_80692b1e_ICU());
    }

    public HAo method_23011cf5_Dne() {
        return this.field_3678e96_Dne;
    }

    public String method_d1f1ed87_FWm() {
        return this.field_378ab08_Dne.method_2c0e7e17_Dne(17);
    }

    public void method_ae43cb5b_XHL(boolean bl) {
        byte by = this.field_378ab08_Dne.method_ce7f5d95_Dne(16);
        if (bl) {
            this.field_378ab08_Dne.method_62ca2346_FWm(16, (byte)(by | 1));
        } else {
            this.field_378ab08_Dne.method_62ca2346_FWm(16, (byte)(by & 0xFFFFFFFE));
        }
    }

    public void method_8f501fe4_Dne(String string) {
        this.field_378ab08_Dne.method_62ca2346_FWm(17, string);
    }

    public boolean method_86921671_LVR() {
        return (this.field_378ab08_Dne.method_ce7f5d95_Dne(16) & 4) != 0;
    }
}

