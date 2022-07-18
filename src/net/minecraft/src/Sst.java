package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class Sst
implements ePy {
    private byte[] field_3f1c582_Dne;

    public Sst(byte[] byArray, int n, int n2) {
        this.field_3f1c582_Dne = new byte[n2];
        System.arraycopy(byArray, n, this.field_3f1c582_Dne, 0, n2);
    }

    public Sst(byte[] byArray) {
        this(byArray, 0, byArray.length);
    }

    public byte[] method_ce7eeb83_Dne() {
        return this.field_3f1c582_Dne;
    }
}

