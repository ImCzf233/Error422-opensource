package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class Ahh
extends wBN {
    public Ahh(Qnq qnq) {
        super(qnq);
        this.field_c480ca78_bzF = "/mob/redcow.png";
        this.method_16b621a_Dne(0.9f, 1.3f);
    }

    @Override
    public boolean method_21db0ca_a_(FiG fiG) {
        NMq nMq = fiG.field_36a059b_Dne.method_23040479_Dne();
        if (nMq != null && nMq.field_2e5f1b_bzF == dEr.field_8e7db487_vSL.field_267cf5_Qnq && this.method_ae128dba_bzF() >= 0) {
            if (nMq.field_2092ae_Dne == 1) {
                fiG.field_36a059b_Dne.method_6e3a6b66_Dne(fiG.field_36a059b_Dne.field_2092ae_Dne, new NMq(dEr.field_9f35eebc_RPx));
                return true;
            }
            if (fiG.field_36a059b_Dne.method_7c61cf19_Dne(new NMq(dEr.field_9f35eebc_RPx)) && !fiG.field_37cb681_Dne.field_267d06_Qnq) {
                fiG.field_36a059b_Dne.method_9046b659_Dne(fiG.field_36a059b_Dne.field_2092ae_Dne, 1);
                return true;
            }
        }
        if (nMq != null && nMq.field_2e5f1b_bzF == dEr.field_37078f6_Dne.field_267cf5_Qnq && this.method_ae128dba_bzF() >= 0) {
            this.method_5d73f9d_g_();
            this.field_36c4f18_Dne.method_8600ec24_Dne("largeexplode", this.field_2f0dd3_div, this.field_22c5fd_IjH + (double)(this.field_367151_trS / 2.0f), this.field_334487_mrb, 0.0, 0.0, 0.0);
            if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
                wBN wBN2 = new wBN(this.field_36c4f18_Dne);
                wBN2.method_9ce0fc65_FWm(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb, this.field_334489_mrb, this.field_29186a_XHL);
                wBN2.method_143f9e1c_bzF(this.method_9a443a8c_XHL());
                wBN2.field_22c5ff_IjH = this.field_22c5ff_IjH;
                this.field_36c4f18_Dne.method_94d18be5_FWm(wBN2);
                for (int i = 0; i < 5; ++i) {
                    this.field_36c4f18_Dne.method_94d18be5_FWm(new JiM(this.field_36c4f18_Dne, this.field_2f0dd3_div, this.field_22c5fd_IjH + (double)this.field_367151_trS, this.field_334487_mrb, new NMq(zKP.field_5e6003e8_Qnq)));
                }
            }
            return true;
        }
        return super.method_21db0ca_a_(fiG);
    }

    @Override
    public Azh method_cafee53a_Dne(Azh azh) {
        return this.method_cafea1a8_Dne(azh);
    }

    @Override
    public wBN method_cb169be6_Dne(Azh azh) {
        return this.method_cafea1a8_Dne(azh);
    }

    public Ahh method_cafea1a8_Dne(Azh azh) {
        return new Ahh(this.field_36c4f18_Dne);
    }
}

