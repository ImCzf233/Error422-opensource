package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;
import net.minecraft.client.Minecraft;

public class QPH
implements Callable {
    final Minecraft field_493682ed_Dne;

    public String method_eecad346_Dne() {
        return this.field_493682ed_Dne.field_365731d_Dne.field_2092bf_Dne ? this.field_493682ed_Dne.field_365731d_Dne.method_eecad346_Dne() : "N/A (disabled)";
    }

    public QPH(Minecraft minecraft) {
        this.field_493682ed_Dne = minecraft;
    }

    public Object call() {
        return this.method_eecad346_Dne();
    }
}

