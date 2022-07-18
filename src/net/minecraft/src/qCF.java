package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;
import net.minecraft.client.Minecraft;

public class qCF
implements Callable {
    final Minecraft field_493682ed_Dne;

    public Object call() {
        return this.method_eecad346_Dne();
    }

    public String method_eecad346_Dne() {
        int n = this.field_493682ed_Dne.field_36ebf36_Dne.method_23186a47_Dne().method_7a46288d_Dne();
        int n2 = 56 * n;
        int n3 = n2 / 1024 / 1024;
        int n4 = this.field_493682ed_Dne.field_36ebf36_Dne.method_23186a47_Dne().method_7c6f602c_FWm();
        int n5 = 56 * n4;
        int n6 = n5 / 1024 / 1024;
        return n + " (" + n2 + " bytes; " + n3 + " MB) allocated, " + n4 + " (" + n5 + " bytes; " + n6 + " MB) used";
    }

    public qCF(Minecraft minecraft) {
        this.field_493682ed_Dne = minecraft;
    }
}

