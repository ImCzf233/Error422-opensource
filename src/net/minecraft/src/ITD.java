package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class ITD
implements Callable {
    final iJs field_376b11a_Dne;

    public Object call() {
        return this.method_eecad346_Dne();
    }

    ITD(iJs iJs2) {
        this.field_376b11a_Dne = iJs2;
    }

    public String method_eecad346_Dne() {
        return "Dedicated Server (map_server.txt)";
    }
}

