package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Map;

final class Fke
extends LIC {
    static final Fke field_20210e2b_FWm;
    private final BAS field_364d0f8_Dne;
    static final Fke field_75af1039_bzF;
    static final Fke field_367424c_Dne;

    @Override
    public BAS method_22fe5f57_Dne() {
        return this.field_364d0f8_Dne;
    }

    @Override
    public String method_eecad346_Dne() {
        throw new IllegalStateException("Attempt to get text on a JsonNode without text.");
    }

    @Override
    public Map method_d410254f_Dne() {
        throw new IllegalStateException("Attempt to get fields on a JsonNode without fields.");
    }

    private Fke(BAS bAS) {
        this.field_364d0f8_Dne = bAS;
    }

    @Override
    public List method_adea226d_Dne() {
        throw new IllegalStateException("Attempt to get elements on a JsonNode without elements.");
    }

    static {
        field_367424c_Dne = new Fke(BAS.field_1617fa21_DyG);
        field_20210e2b_FWm = new Fke(BAS.field_7128553e_aFZ);
        field_75af1039_bzF = new Fke(BAS.field_f0968ff0_zGp);
    }
}

