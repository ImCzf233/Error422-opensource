package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class PCC
implements Callable {
    final iJs field_376b11a_Dne;

    public String method_eecad346_Dne() {
        String string = this.field_376b11a_Dne.method_da581772_IjH();
        return !string.equals("vanilla") ? "Definitely; Server brand changed to '" + string + "'" : "Unknown (can't tell)";
    }

    public Object call() {
        return this.method_eecad346_Dne();
    }

    PCC(iJs iJs2) {
        this.field_376b11a_Dne = iJs2;
    }
}

