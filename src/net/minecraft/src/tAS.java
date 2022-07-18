package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.client.Minecraft;

public class tAS
extends Thread {
    final Minecraft field_493682ed_Dne;

    public tAS(Minecraft minecraft, String string) {
        super(string);
        this.field_493682ed_Dne = minecraft;
    }

    @Override
    public void run() {
        while (this.field_493682ed_Dne.field_20b868_DyG) {
            try {
                Thread.sleep(Integer.MAX_VALUE);
            }
            catch (InterruptedException interruptedException) {}
        }
    }
}

