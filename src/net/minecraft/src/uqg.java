package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class uqg {
    public boolean field_2092bf_Dne = false;
    private float field_21260a_FWm = 0.1f;
    public boolean field_267d06_Qnq = false;
    public boolean field_2d2a05_aFZ = true;
    public boolean field_2e5f2c_bzF = false;
    private float field_2092ab_Dne = 0.05f;
    public boolean field_21261e_FWm = false;

    public float method_7a46288a_Dne() {
        return this.field_2092ab_Dne;
    }

    public void method_66a36cd8_FWm(WkD wkD) {
        if (wkD.method_8f501fe8_Dne("abilities")) {
            WkD wkD2 = wkD.method_2851c945_Dne("abilities");
            this.field_2092bf_Dne = wkD2.method_110c4dc7_FWm("invulnerable");
            this.field_21261e_FWm = wkD2.method_110c4dc7_FWm("flying");
            this.field_2e5f2c_bzF = wkD2.method_110c4dc7_FWm("mayfly");
            this.field_267d06_Qnq = wkD2.method_110c4dc7_FWm("instabuild");
            if (wkD2.method_8f501fe8_Dne("flySpeed")) {
                this.field_2092ab_Dne = wkD2.method_8f501fd4_Dne("flySpeed");
                this.field_21260a_FWm = wkD2.method_8f501fd4_Dne("walkSpeed");
            }
            if (wkD2.method_8f501fe8_Dne("mayBuild")) {
                this.field_2d2a05_aFZ = wkD2.method_110c4dc7_FWm("mayBuild");
            }
        }
    }

    public void method_8d4fb917_Dne(WkD wkD) {
        WkD wkD2 = new WkD();
        wkD2.method_5ab48f70_Dne("invulnerable", this.field_2092bf_Dne);
        wkD2.method_5ab48f70_Dne("flying", this.field_21261e_FWm);
        wkD2.method_5ab48f70_Dne("mayfly", this.field_2e5f2c_bzF);
        wkD2.method_5ab48f70_Dne("instabuild", this.field_267d06_Qnq);
        wkD2.method_5ab48f70_Dne("mayBuild", this.field_2d2a05_aFZ);
        wkD2.method_5ab4445c_Dne("flySpeed", this.field_2092ab_Dne);
        wkD2.method_5ab4445c_Dne("walkSpeed", this.field_21260a_FWm);
        wkD.method_58996597_Dne("abilities", wkD2);
    }

    public void method_ce7f5266_Dne(float f) {
        this.field_2092ab_Dne = f;
    }

    public void method_117d0ea7_FWm(float f) {
        this.field_21260a_FWm = f;
    }

    public float method_7c6f6029_FWm() {
        return this.field_21260a_FWm;
    }
}

