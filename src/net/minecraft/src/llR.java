package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class llR
extends ipD {
    private static Random field_7331eae7_Dne = new Random();
    public float field_267cf2_Qnq;
    public float field_2092ab_Dne;
    private String field_569fcf45_Dne;
    public float field_21260a_FWm;
    public float field_2d29f1_aFZ;
    public float field_22c5ff_IjH;
    public float field_20b854_DyG;
    public float field_388da3_zGp;
    public float field_2e5f18_bzF;
    public float field_2f0dd5_div;
    public int field_2092ae_Dne;

    public void method_8f501fe4_Dne(String string) {
        this.field_569fcf45_Dne = string;
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        super.method_8d4fb917_Dne(wkD);
        if (wkD.method_8f501fe8_Dne("CustomName")) {
            this.field_569fcf45_Dne = wkD.method_39193c_Dne("CustomName");
        }
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        super.method_66a36cd8_FWm(wkD);
        if (this.method_7a46289e_Dne()) {
            wkD.method_abaa98ae_Dne("CustomName", this.field_569fcf45_Dne);
        }
    }

    public boolean method_7a46289e_Dne() {
        return this.field_569fcf45_Dne != null && this.field_569fcf45_Dne.length() > 0;
    }

    @Override
    public void method_7a46289a_Dne() {
        float f;
        super.method_7a46289a_Dne();
        this.field_388da3_zGp = this.field_2d29f1_aFZ;
        this.field_2f0dd5_div = this.field_20b854_DyG;
        FiG fiG = this.field_36c4f18_Dne.method_fcf6c807_Dne((float)this.field_267cf5_Qnq + 0.5f, (float)this.field_2d29f4_aFZ + 0.5f, (float)this.field_388da6_zGp + 0.5f, 3.0);
        if (fiG != null) {
            double d = fiG.field_2f0dd3_div - (double)((float)this.field_267cf5_Qnq + 0.5f);
            double d2 = fiG.field_334487_mrb - (double)((float)this.field_388da6_zGp + 0.5f);
            this.field_22c5ff_IjH = (float)Math.atan2(d2, d);
            this.field_2d29f1_aFZ += 0.1f;
            if (this.field_2d29f1_aFZ < 0.5f || field_7331eae7_Dne.nextInt(40) == 0) {
                float f2 = this.field_2e5f18_bzF;
                do {
                    this.field_2e5f18_bzF += (float)(field_7331eae7_Dne.nextInt(4) - field_7331eae7_Dne.nextInt(4));
                } while (f2 == this.field_2e5f18_bzF);
            }
        } else {
            this.field_22c5ff_IjH += 0.02f;
            this.field_2d29f1_aFZ -= 0.1f;
        }
        while (this.field_20b854_DyG >= (float)Math.PI) {
            this.field_20b854_DyG -= (float)Math.PI * 2;
        }
        while (this.field_20b854_DyG < (float)(-Math.PI)) {
            this.field_20b854_DyG += (float)Math.PI * 2;
        }
        while (this.field_22c5ff_IjH >= (float)Math.PI) {
            this.field_22c5ff_IjH -= (float)Math.PI * 2;
        }
        while (this.field_22c5ff_IjH < (float)(-Math.PI)) {
            this.field_22c5ff_IjH += (float)Math.PI * 2;
        }
        for (f = this.field_22c5ff_IjH - this.field_20b854_DyG; f >= (float)Math.PI; f -= (float)Math.PI * 2) {
        }
        while (f < (float)(-Math.PI)) {
            f += (float)Math.PI * 2;
        }
        this.field_20b854_DyG += f * 0.4f;
        if (this.field_2d29f1_aFZ < 0.0f) {
            this.field_2d29f1_aFZ = 0.0f;
        }
        if (this.field_2d29f1_aFZ > 1.0f) {
            this.field_2d29f1_aFZ = 1.0f;
        }
        ++this.field_2092ae_Dne;
        this.field_21260a_FWm = this.field_2092ab_Dne;
        float f3 = (this.field_2e5f18_bzF - this.field_2092ab_Dne) * 0.4f;
        float f4 = 0.2f;
        if (f3 < -f4) {
            f3 = -f4;
        }
        if (f3 > f4) {
            f3 = f4;
        }
        this.field_267cf2_Qnq += (f3 - this.field_267cf2_Qnq) * 0.9f;
        this.field_2092ab_Dne += this.field_267cf2_Qnq;
    }

    public String method_eecad346_Dne() {
        return this.method_7a46289e_Dne() ? this.field_569fcf45_Dne : "container.enchant";
    }
}

