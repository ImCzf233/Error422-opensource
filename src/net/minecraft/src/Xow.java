package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.security.SecureRandom;

public class Xow {
    protected int field_2092ae_Dne;
    protected SecureRandom field_10e7e0ee_Dne;

    public byte[] method_ce7eeb83_Dne() {
        byte[] byArray = new byte[this.field_2092ae_Dne];
        this.field_10e7e0ee_Dne.nextBytes(byArray);
        return byArray;
    }

    public void method_b888fa41_Dne(quj_0 quj_02) {
        this.field_10e7e0ee_Dne = quj_02.method_d70297af_Dne();
        this.field_2092ae_Dne = (quj_02.method_7a46288d_Dne() + 7) / 8;
    }
}

