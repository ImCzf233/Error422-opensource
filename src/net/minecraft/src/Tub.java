package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;
import net.minecraft.client.Dne;
import net.minecraft.client.Minecraft;

public class Tub
implements Callable {
    final Minecraft field_493682ed_Dne;

    public Tub(Minecraft minecraft) {
        this.field_493682ed_Dne = minecraft;
    }

    public Object call() {
        return this.method_eecad346_Dne();
    }

    public String method_eecad346_Dne() {
        String string = Dne.method_eecad346_Dne();
        return !string.equals("vanilla") ? "Definitely; Client brand changed to '" + string + "'" : (Minecraft.class.getSigners() == null ? "Very likely; Jar signature invalidated" : "Probably not. Jar signature remains and client brand is untouched.");
    }
}

