package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class Kgw
extends zBn {
    protected sMa field_37b45e5_Dne;

    @Override
    public String method_eee94b72_Dne(FUH fUH) {
        NMq nMq = this.field_37b45e5_Dne instanceof FUH ? ((FUH)this.field_37b45e5_Dne).method_23040479_Dne() : null;
        String string = "death.attack." + this.field_569fcf45_Dne;
        String string2 = string + ".item";
        return nMq != null && nMq.method_d44b4596_zGp() && KGL.method_8f501fe8_Dne(string2) ? KGL.method_98148f73_Dne(string2, fUH.method_c6f17a40_aFZ(), this.field_37b45e5_Dne.method_c6f17a40_aFZ(), nMq.method_d1f1ed87_FWm()) : KGL.method_98148f73_Dne(string, fUH.method_c6f17a40_aFZ(), this.field_37b45e5_Dne.method_c6f17a40_aFZ());
    }

    @Override
    public boolean method_d44b4596_zGp() {
        return this.field_37b45e5_Dne != null && this.field_37b45e5_Dne instanceof FUH && !(this.field_37b45e5_Dne instanceof FiG);
    }

    @Override
    public sMa method_f88b2463_FWm() {
        return this.field_37b45e5_Dne;
    }

    public Kgw(String string, sMa sMa2) {
        super(string);
        this.field_37b45e5_Dne = sMa2;
    }
}

