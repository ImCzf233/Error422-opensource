package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;
import net.minecraft.client.Minecraft;

/*
 * Renamed from wzJ
 */
public class wzj_0
implements Callable {
    final Minecraft field_493682ed_Dne;

    public wzj_0(Minecraft minecraft) {
        this.field_493682ed_Dne = minecraft;
    }

    public String method_eecad346_Dne() {
        return this.field_493682ed_Dne.field_37a7e17_Dne.getClass().getCanonicalName();
    }

    public Object call() {
        return this.method_eecad346_Dne();
    }
}

