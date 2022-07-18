package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.client.Minecraft;

public class KTL
extends xPm {
    private double field_2092a9_Dne;
    private double field_212608_FWm;

    public KTL() {
        super("compass");
    }

    @Override
    public void method_7a46289a_Dne() {
        double d;
        Minecraft minecraft = Minecraft.method_81a5f12e_Dne();
        double d2 = 0.0;
        if (minecraft.field_36ebf36_Dne != null && minecraft.field_369f6b6_Dne != null) {
            float f = minecraft.field_36ebf36_Dne.method_117d0e97_FWm(1.0f);
            d2 = f;
            if (!minecraft.field_36ebf36_Dne.field_3690d00_Dne.method_7a46289e_Dne()) {
                d2 = Math.random();
            }
        }
        for (d = d2 - this.field_2092a9_Dne; d < -0.5; d += 1.0) {
        }
        while (d >= 0.5) {
            d -= 1.0;
        }
        if (d < -1.0) {
            d = -1.0;
        }
        if (d > 1.0) {
            d = 1.0;
        }
        this.field_212608_FWm += d * 0.1;
        this.field_212608_FWm *= 0.8;
        this.field_2092a9_Dne += this.field_212608_FWm;
        int n = (int)((this.field_2092a9_Dne + 1.0) * (double)this.field_f27c122c_Dne.size()) % this.field_f27c122c_Dne.size();
        while (n < 0) {
            n = (n + this.field_f27c122c_Dne.size()) % this.field_f27c122c_Dne.size();
        }
        if (n != this.field_2e5f1b_bzF) {
            this.field_2e5f1b_bzF = n;
            this.field_374ee26_Dne.method_f97e7cb3_Dne(this.field_2092ae_Dne, this.field_21260d_FWm, (dmo)this.field_f27c122c_Dne.get(this.field_2e5f1b_bzF), this.field_2092bf_Dne);
        }
    }
}

