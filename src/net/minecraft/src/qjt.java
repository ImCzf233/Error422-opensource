package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.client.Minecraft;

public class qjt
extends xPm {
    public double field_212608_FWm;
    public double field_2092a9_Dne;
    public static qjt field_37acc51_Dne;

    public qjt() {
        super("compass");
        field_37acc51_Dne = this;
    }

    public void method_2cdc86cb_Dne(Qnq qnq, double d, double d2, double d3, boolean bl, boolean bl2) {
        double d4 = 0.0;
        if (qnq != null && !bl) {
            iSh iSh2 = qnq.method_23105fed_Dne();
            double d5 = (double)iSh2.field_2092ae_Dne - d;
            double d6 = (double)iSh2.field_2e5f1b_bzF - d2;
            d4 = -(((d3 %= 360.0) - 90.0) * Math.PI / 180.0 - Math.atan2(d6, d5));
            if (!qnq.field_3690d00_Dne.method_7a46289e_Dne()) {
                d4 = Math.random() * Math.PI * 2.0;
            }
        }
        if (bl2) {
            this.field_2092a9_Dne = d4;
        } else {
            double d7;
            for (d7 = d4 - this.field_2092a9_Dne; d7 < -Math.PI; d7 += Math.PI * 2) {
            }
            while (d7 >= Math.PI) {
                d7 -= Math.PI * 2;
            }
            if (d7 < -1.0) {
                d7 = -1.0;
            }
            if (d7 > 1.0) {
                d7 = 1.0;
            }
            this.field_212608_FWm += d7 * 0.1;
            this.field_212608_FWm *= 0.8;
            this.field_2092a9_Dne += this.field_212608_FWm;
        }
        int n = (int)((this.field_2092a9_Dne / (Math.PI * 2) + 1.0) * (double)this.field_f27c122c_Dne.size()) % this.field_f27c122c_Dne.size();
        while (n < 0) {
            n = (n + this.field_f27c122c_Dne.size()) % this.field_f27c122c_Dne.size();
        }
        if (n != this.field_2e5f1b_bzF) {
            this.field_2e5f1b_bzF = n;
            this.field_374ee26_Dne.method_f97e7cb3_Dne(this.field_2092ae_Dne, this.field_21260d_FWm, (dmo)this.field_f27c122c_Dne.get(this.field_2e5f1b_bzF), this.field_2092bf_Dne);
        }
    }

    @Override
    public void method_7a46289a_Dne() {
        Minecraft minecraft = Minecraft.method_81a5f12e_Dne();
        if (minecraft.field_36ebf36_Dne != null && minecraft.field_369f6b6_Dne != null) {
            this.method_2cdc86cb_Dne(minecraft.field_36ebf36_Dne, minecraft.field_369f6b6_Dne.field_2f0dd3_div, minecraft.field_369f6b6_Dne.field_334487_mrb, minecraft.field_369f6b6_Dne.field_334489_mrb, false, false);
        } else {
            this.method_2cdc86cb_Dne(null, 0.0, 0.0, 0.0, true, false);
        }
    }
}

