package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class CpP
extends Kgw {
    private sMa field_203511c4_FWm;

    public CpP(String string, sMa sMa2, sMa sMa3) {
        super(string, sMa2);
        this.field_203511c4_FWm = sMa3;
    }

    @Override
    public sMa method_2314d444_Dne() {
        return this.field_37b45e5_Dne;
    }

    @Override
    public sMa method_f88b2463_FWm() {
        return this.field_203511c4_FWm;
    }

    @Override
    public String method_eee94b72_Dne(FUH fUH) {
        String string = this.field_203511c4_FWm == null ? this.field_37b45e5_Dne.method_c6f17a40_aFZ() : this.field_203511c4_FWm.method_c6f17a40_aFZ();
        NMq nMq = this.field_203511c4_FWm instanceof FUH ? ((FUH)this.field_203511c4_FWm).method_23040479_Dne() : null;
        String string2 = "death.attack." + this.field_569fcf45_Dne;
        String string3 = string2 + ".item";
        return nMq != null && nMq.method_d44b4596_zGp() && KGL.method_8f501fe8_Dne(string3) ? KGL.method_98148f73_Dne(string3, fUH.method_c6f17a40_aFZ(), string, nMq.method_d1f1ed87_FWm()) : KGL.method_98148f73_Dne(string2, fUH.method_c6f17a40_aFZ(), string);
    }
}

