package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class Cpw
extends pee_0 {
    private final ONk field_36aed80_Dne;

    public Cpw(int n, int n2, int n3, int n4, int n5, String string) {
        super(n, n2, n3, n4, n5, string);
        this.field_36aed80_Dne = null;
    }

    public Cpw(int n, int n2, int n3, ONk oNk, String string) {
        super(n, n2, n3, 150, 20, string);
        this.field_36aed80_Dne = oNk;
    }

    public Cpw(int n, int n2, int n3, String string) {
        this(n, n2, n3, null, string);
    }

    public ONk method_23047bdf_Dne() {
        return this.field_36aed80_Dne;
    }
}

