package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;
import org.lwjgl.input.Mouse;

class FTG
implements Callable {
    final int field_2092ae_Dne;
    final int field_21260d_FWm;
    final OEA field_36ac6a1_Dne;

    FTG(OEA oEA, int n, int n2) {
        this.field_36ac6a1_Dne = oEA;
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
    }

    public String method_eecad346_Dne() {
        return String.format("Scaled: (%d, %d). Absolute: (%d, %d)", this.field_2092ae_Dne, this.field_21260d_FWm, Mouse.getX(), Mouse.getY());
    }

    public Object call() {
        return this.method_eecad346_Dne();
    }
}

