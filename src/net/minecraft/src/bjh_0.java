package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from BjH
 */
final class bjh_0
implements tHk {
    private final iod field_3773a2e_Dne;
    private final iod field_2031060d_FWm;

    @Override
    public Object method_8dde1bfc_Dne(Object object) {
        Object object2;
        try {
            object2 = this.field_3773a2e_Dne.method_8dde1bfc_Dne(object);
        }
        catch (edm_0 edm_02) {
            throw edm_0.method_c8e725da_FWm(edm_02, this.field_3773a2e_Dne);
        }
        try {
            Object object3 = this.field_2031060d_FWm.method_8dde1bfc_Dne(object2);
            return object3;
        }
        catch (edm_0 edm_03) {
            throw edm_0.method_4f63307b_Dne(edm_03, this.field_3773a2e_Dne);
        }
    }

    bjh_0(iod iod2, iod iod3) {
        this.field_3773a2e_Dne = iod2;
        this.field_2031060d_FWm = iod3;
    }

    @Override
    public String method_eecad346_Dne() {
        return this.field_2031060d_FWm.method_eecad346_Dne();
    }

    public String toString() {
        return this.field_3773a2e_Dne.toString() + ", with " + this.field_2031060d_FWm.toString();
    }

    @Override
    public boolean method_41cee5fa_Dne(Object object) {
        return this.field_3773a2e_Dne.method_41cee5fa_Dne(object) && this.field_2031060d_FWm.method_41cee5fa_Dne(this.field_3773a2e_Dne.method_8dde1bfc_Dne(object));
    }
}

