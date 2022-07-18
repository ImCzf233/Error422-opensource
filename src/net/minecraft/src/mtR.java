package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class mtR
implements Callable {
    final xoY field_37e0a6a_Dne;

    public Object call() {
        return this.method_eecad346_Dne();
    }

    mtR(xoY xoY2) {
        this.field_37e0a6a_Dne = xoY2;
    }

    public String method_eecad346_Dne() {
        String string = "Unknown?";
        try {
            switch (xoY.method_195f5d52_aFZ(this.field_37e0a6a_Dne)) {
                case 19132: {
                    string = "McRegion";
                    break;
                }
                case 19133: {
                    string = "Anvil";
                }
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        return String.format("0x%05X - %s", xoY.method_195f5d52_aFZ(this.field_37e0a6a_Dne), string);
    }
}

