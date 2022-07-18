package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class LVR
extends Fnk {
    protected gwq field_8507b6e3_ceE;

    @Override
    protected void method_7a46289a_Dne() {
        this.method_7c6f6039_FWm();
        if (this.field_7331eae7_Dne.nextInt(5) == 0) {
            int n;
            int n2 = this.field_2092ae_Dne + this.field_7331eae7_Dne.nextInt(16) + 8;
            int n3 = this.field_36c4f18_Dne.method_6f304eb3_aFZ(n2, n = this.field_21260d_FWm + this.field_7331eae7_Dne.nextInt(16) + 8);
            if (n3 > 0) {
                // empty if block
            }
            this.field_8507b6e3_ceE.method_c3e4cb88_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n2, n3, n);
        }
        if (this.field_2092ae_Dne == 0 && this.field_21260d_FWm == 0) {
            WSC wSC = new WSC(this.field_36c4f18_Dne);
            wSC.method_9ce0fc65_FWm(0.0, 128.0, 0.0, this.field_7331eae7_Dne.nextFloat() * 360.0f, 0.0f);
            this.field_36c4f18_Dne.method_94d18be5_FWm(wSC);
        }
    }

    public LVR(OdI odI) {
        super(odI);
        this.field_8507b6e3_ceE = new sJS(zKP.field_4e627739_dNY.field_21260d_FWm);
    }
}

