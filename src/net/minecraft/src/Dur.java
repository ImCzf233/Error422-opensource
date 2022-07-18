package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class Dur
extends sMa {
    public final String field_c480ca78_bzF;
    public final eKx field_374e3fa_Dne;

    @Override
    public boolean method_bb7dd824_Dne(sMa sMa2) {
        return this == sMa2 || this.field_374e3fa_Dne == sMa2;
    }

    @Override
    protected void method_66a36cd8_FWm(WkD wkD) {
    }

    public Dur(eKx eKx2, String string, float f, float f2) {
        super(eKx2.method_2305dd77_Dne());
        this.method_16b621a_Dne(f, f2);
        this.field_374e3fa_Dne = eKx2;
        this.field_c480ca78_bzF = string;
    }

    @Override
    protected void method_8d4fb917_Dne(WkD wkD) {
    }

    @Override
    public boolean method_baa39406_kGO() {
        return true;
    }

    @Override
    public boolean method_147b2066_Dne(zBn zBn2, int n) {
        return this.method_7c861acb_EyB() ? false : this.field_374e3fa_Dne.method_7675a832_Dne(this, zBn2, n);
    }

    @Override
    protected void method_7c6f6039_FWm() {
    }
}

