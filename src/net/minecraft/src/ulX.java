package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Canvas;
import net.minecraft.client.FWm;

public class ulX
extends Canvas {
    final FWm field_9144b3de_Dne;

    @Override
    public synchronized void addNotify() {
        super.addNotify();
        this.field_9144b3de_Dne.method_7a46289a_Dne();
    }

    @Override
    public synchronized void removeNotify() {
        this.field_9144b3de_Dne.method_7c6f6039_FWm();
        super.removeNotify();
    }

    public ulX(FWm fWm) {
        this.field_9144b3de_Dne = fWm;
    }
}

