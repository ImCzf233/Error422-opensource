package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class nKy
extends ipD {
    private NMq field_36a761a_Dne;

    public NMq method_23040479_Dne() {
        return this.field_36a761a_Dne;
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        super.method_8d4fb917_Dne(wkD);
        if (wkD.method_8f501fe8_Dne("RecordItem")) {
            this.method_7c61cf15_Dne(NMq.method_7da70e76_Dne(wkD.method_2851c945_Dne("RecordItem")));
        } else if (wkD.method_8f501fd7_Dne("Record") > 0) {
            this.method_7c61cf15_Dne(new NMq(wkD.method_8f501fd7_Dne("Record"), 1, 0));
        }
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        super.method_66a36cd8_FWm(wkD);
        if (this.method_23040479_Dne() != null) {
            wkD.method_312ec00d_Dne("RecordItem", this.method_23040479_Dne().method_7dab90f8_Dne(new WkD()));
            wkD.method_5ab44f9f_Dne("Record", this.method_23040479_Dne().field_2e5f1b_bzF);
        }
    }

    public void method_7c61cf15_Dne(NMq nMq) {
        this.field_36a761a_Dne = nMq;
        this.method_582b297_a_();
    }
}

