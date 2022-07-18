package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;
import net.minecraft.client.Minecraft;
import org.lwjgl.Sys;

public class BwZ
implements Callable {
    final Minecraft field_493682ed_Dne;

    public String method_eecad346_Dne() {
        return Sys.getVersion();
    }

    public Object call() {
        return this.method_eecad346_Dne();
    }

    public BwZ(Minecraft minecraft) {
        this.field_493682ed_Dne = minecraft;
    }
}

