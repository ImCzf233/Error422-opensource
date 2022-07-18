package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Map;

public abstract class LIC {
    public abstract BAS method_22fe5f57_Dne();

    public final String method_1d4d0948_FWm(Object ... objectArray) {
        return (String)this.method_e3db95b3_Dne(YQD.method_29e4f74b_FWm(objectArray), this, objectArray);
    }

    public final List<LIC> method_d26b6110_Dne(Object ... objectArray) {
        return (List)this.method_e3db95b3_Dne(YQD.method_785fb563_Qnq(objectArray), this, objectArray);
    }

    private Object method_e3db95b3_Dne(iod iod2, LIC lIC, Object[] objectArray) {
        try {
            return iod2.method_8dde1bfc_Dne(lIC);
        }
        catch (edm_0 edm_02) {
            throw rtv.method_e1bd6b83_Dne(edm_02, objectArray, ACm.method_50ae544e_Dne(lIC));
        }
    }

    public abstract List<LIC> method_adea226d_Dne();

    public final Boolean method_137c2214_Dne(Object ... objectArray) {
        return (Boolean)this.method_e3db95b3_Dne(YQD.method_dfdc69fd_bzF(objectArray), this, objectArray);
    }

    public abstract String method_eecad346_Dne();

    public final boolean method_8fc1d85b_Dne(Object ... objectArray) {
        return YQD.method_785fb563_Qnq(objectArray).method_41cee5fa_Dne(this);
    }

    public final String method_f7f6f529_Dne(Object ... objectArray) {
        return (String)this.method_e3db95b3_Dne(YQD.method_af8451ca_Dne(objectArray), this, objectArray);
    }

    public abstract Map method_d410254f_Dne();
}

