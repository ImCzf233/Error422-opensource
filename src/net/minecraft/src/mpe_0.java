package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from mpE
 */
public class mpe_0
implements ePy {
    private ePy field_374f6de_Dne;
    private byte[] field_3f1c582_Dne;

    public ePy method_230e853d_Dne() {
        return this.field_374f6de_Dne;
    }

    public mpe_0(ePy ePy2, byte[] byArray, int n, int n2) {
        this.field_3f1c582_Dne = new byte[n2];
        this.field_374f6de_Dne = ePy2;
        System.arraycopy(byArray, n, this.field_3f1c582_Dne, 0, n2);
    }

    public byte[] method_ce7eeb83_Dne() {
        return this.field_3f1c582_Dne;
    }
}

