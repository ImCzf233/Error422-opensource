package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class Vnr {
    private int field_21260d_FWm;
    private NMq field_36a761a_Dne;
    private NMq field_75b24407_bzF;
    private int field_2092ae_Dne;
    private NMq field_202441f9_FWm;

    public boolean method_8bda1011_Dne(Vnr vnr) {
        return this.field_36a761a_Dne.field_2e5f1b_bzF == vnr.field_36a761a_Dne.field_2e5f1b_bzF && this.field_75b24407_bzF.field_2e5f1b_bzF == vnr.field_75b24407_bzF.field_2e5f1b_bzF ? this.field_202441f9_FWm == null && vnr.field_202441f9_FWm == null || this.field_202441f9_FWm != null && vnr.field_202441f9_FWm != null && this.field_202441f9_FWm.field_2e5f1b_bzF == vnr.field_202441f9_FWm.field_2e5f1b_bzF : false;
    }

    public Vnr(NMq nMq, NMq nMq2, NMq nMq3) {
        this.field_36a761a_Dne = nMq;
        this.field_202441f9_FWm = nMq2;
        this.field_75b24407_bzF = nMq3;
        this.field_21260d_FWm = 7;
    }

    public NMq method_f87a5498_FWm() {
        return this.field_202441f9_FWm;
    }

    public NMq method_22900b26_bzF() {
        return this.field_75b24407_bzF;
    }

    public void method_ce7f5da9_Dne(int n) {
        this.field_21260d_FWm += n;
    }

    public boolean method_7c6f603d_FWm() {
        return this.field_2092ae_Dne >= this.field_21260d_FWm;
    }

    public NMq method_23040479_Dne() {
        return this.field_36a761a_Dne;
    }

    public void method_7c6f6039_FWm() {
        this.field_2092ae_Dne = this.field_21260d_FWm;
    }

    public boolean method_7a46289e_Dne() {
        return this.field_202441f9_FWm != null;
    }

    public Vnr(NMq nMq, dEr dEr2) {
        this(nMq, new NMq(dEr2));
    }

    public void method_7a46289a_Dne() {
        ++this.field_2092ae_Dne;
    }

    public boolean method_652dc3d2_FWm(Vnr vnr) {
        return this.method_8bda1011_Dne(vnr) && (this.field_36a761a_Dne.field_2092ae_Dne < vnr.field_36a761a_Dne.field_2092ae_Dne || this.field_202441f9_FWm != null && this.field_202441f9_FWm.field_2092ae_Dne < vnr.field_202441f9_FWm.field_2092ae_Dne);
    }

    public void method_8d4fb917_Dne(WkD wkD) {
        WkD wkD2 = wkD.method_2851c945_Dne("buy");
        this.field_36a761a_Dne = NMq.method_7da70e76_Dne(wkD2);
        WkD wkD3 = wkD.method_2851c945_Dne("sell");
        this.field_75b24407_bzF = NMq.method_7da70e76_Dne(wkD3);
        if (wkD.method_8f501fe8_Dne("buyB")) {
            this.field_202441f9_FWm = NMq.method_7da70e76_Dne(wkD.method_2851c945_Dne("buyB"));
        }
        if (wkD.method_8f501fe8_Dne("uses")) {
            this.field_2092ae_Dne = wkD.method_8f501fd7_Dne("uses");
        }
        this.field_21260d_FWm = wkD.method_8f501fe8_Dne("maxUses") ? wkD.method_8f501fd7_Dne("maxUses") : 7;
    }

    public Vnr(NMq nMq, NMq nMq2) {
        this(nMq, null, nMq2);
    }

    public WkD method_230886fb_Dne() {
        WkD wkD = new WkD();
        wkD.method_312ec00d_Dne("buy", this.field_36a761a_Dne.method_7dab90f8_Dne(new WkD("buy")));
        wkD.method_312ec00d_Dne("sell", this.field_75b24407_bzF.method_7dab90f8_Dne(new WkD("sell")));
        if (this.field_202441f9_FWm != null) {
            wkD.method_312ec00d_Dne("buyB", this.field_202441f9_FWm.method_7dab90f8_Dne(new WkD("buyB")));
        }
        wkD.method_5ab44f9f_Dne("uses", this.field_2092ae_Dne);
        wkD.method_5ab44f9f_Dne("maxUses", this.field_21260d_FWm);
        return wkD;
    }

    public Vnr(WkD wkD) {
        this.method_8d4fb917_Dne(wkD);
    }
}

