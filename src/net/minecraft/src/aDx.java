package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;
import net.minecraft.client.Minecraft;

public class aDx
implements Callable {
    final Minecraft field_493682ed_Dne;

    public Object call() {
        return this.method_eecad346_Dne();
    }

    public aDx(Minecraft minecraft) {
        this.field_493682ed_Dne = minecraft;
    }

    public String method_eecad346_Dne() {
        return this.field_493682ed_Dne.field_37a7e17_Dne.getClass().getCanonicalName();
    }
}

