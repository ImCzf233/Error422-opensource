package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class DlZ
implements pUe {
    private final NMq field_36a761a_Dne;

    public DlZ(NMq nMq) {
        this.field_36a761a_Dne = nMq;
    }

    @Override
    public boolean method_bb7dd824_Dne(sMa sMa2) {
        if (!sMa2.method_cd4cb3d9_udO()) {
            return false;
        }
        if (!(sMa2 instanceof FUH)) {
            return false;
        }
        FUH fUH = (FUH)sMa2;
        return fUH.method_9e6e1a08_Dne(FUH.method_7c61cf08_Dne(this.field_36a761a_Dne)) != null ? false : fUH.method_7ac07071_EWz() || fUH instanceof FiG;
    }
}

