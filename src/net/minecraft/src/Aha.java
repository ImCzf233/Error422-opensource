package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;
import net.minecraft.client.Dne;
import net.minecraft.client.Minecraft;

class Aha
implements Callable {
    final zHD field_37e5e36_Dne;

    public Object call() {
        return this.method_eecad346_Dne();
    }

    Aha(zHD zHD2) {
        this.field_37e5e36_Dne = zHD2;
    }

    public String method_eecad346_Dne() {
        String string = Dne.method_eecad346_Dne();
        if (!string.equals("vanilla")) {
            return "Definitely; Client brand changed to '" + string + "'";
        }
        string = this.field_37e5e36_Dne.method_da581772_IjH();
        return !string.equals("vanilla") ? "Definitely; Server brand changed to '" + string + "'" : (Minecraft.class.getSigners() == null ? "Very likely; Jar signature invalidated" : "Probably not. Jar signature remains and both client + server brands are untouched.");
    }
}

