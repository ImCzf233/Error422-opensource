package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.client.Minecraft;

public class EsO {
    private double field_2092a9_Dne;
    private long field_2092af_Dne;
    public float field_267cf2_Qnq = 0.0f;
    public float field_2e5f18_bzF = 1.0f;
    private double field_212608_FWm = 1.0;
    private long field_2e5f1c_bzF;
    private long field_21260e_FWm;
    public int field_2092ae_Dne;
    public float field_21260a_FWm;
    float field_2092ab_Dne;

    public void method_7a46289a_Dne() {
        long l = Minecraft.method_7a46288e_Dne();
        long l2 = l - this.field_2092af_Dne;
        long l3 = System.nanoTime() / 1000000L;
        double d = (double)l3 / 1000.0;
        if (l2 <= 1000L && l2 >= 0L) {
            this.field_2e5f1c_bzF += l2;
            if (this.field_2e5f1c_bzF > 1000L) {
                long l4 = l3 - this.field_21260e_FWm;
                double d2 = (double)this.field_2e5f1c_bzF / (double)l4;
                this.field_212608_FWm += (d2 - this.field_212608_FWm) * (double)0.2f;
                this.field_21260e_FWm = l3;
                this.field_2e5f1c_bzF = 0L;
            }
            if (this.field_2e5f1c_bzF < 0L) {
                this.field_21260e_FWm = l3;
            }
        } else {
            this.field_2092a9_Dne = d;
        }
        this.field_2092af_Dne = l;
        double d3 = (d - this.field_2092a9_Dne) * this.field_212608_FWm;
        this.field_2092a9_Dne = d;
        if (d3 < 0.0) {
            d3 = 0.0;
        }
        if (d3 > 1.0) {
            d3 = 1.0;
        }
        this.field_267cf2_Qnq = (float)((double)this.field_267cf2_Qnq + d3 * (double)this.field_2e5f18_bzF * (double)this.field_2092ab_Dne);
        this.field_2092ae_Dne = (int)this.field_267cf2_Qnq;
        this.field_267cf2_Qnq -= (float)this.field_2092ae_Dne;
        if (this.field_2092ae_Dne > 10) {
            this.field_2092ae_Dne = 10;
        }
        this.field_21260a_FWm = this.field_267cf2_Qnq;
    }

    public EsO(float f) {
        this.field_2092ab_Dne = f;
        this.field_2092af_Dne = Minecraft.method_7a46288e_Dne();
        this.field_21260e_FWm = System.nanoTime() / 1000000L;
    }
}

