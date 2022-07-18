package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class jjR
extends Thread {
    final jwh_0 field_3694131_Dne;

    public jjR(jwh_0 jwh_02, String string) {
        super(string);
        this.field_3694131_Dne = jwh_02;
    }

    @Override
    public void run() {
        this.field_3694131_Dne.run();
    }
}

