package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public final class fjc
extends WindowAdapter {
    @Override
    public void windowClosing(WindowEvent windowEvent) {
        System.err.println("Someone is closing me!");
        System.exit(1);
    }
}

