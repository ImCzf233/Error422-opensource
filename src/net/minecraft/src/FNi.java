package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;
import net.minecraft.client.Minecraft;

public class FNi
implements Callable {
    final Minecraft field_493682ed_Dne;

    public String method_eecad346_Dne() {
        return "Client (map_client.txt)";
    }

    public FNi(Minecraft minecraft) {
        this.field_493682ed_Dne = minecraft;
    }

    public Object call() {
        return this.method_eecad346_Dne();
    }
}

