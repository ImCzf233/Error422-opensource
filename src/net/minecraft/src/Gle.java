package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Gle
extends NER {
    public int field_2092ae_Dne;

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_721f46e7_Dne(this);
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(this.field_2092ae_Dne & 0xFF);
    }

    public Gle(int n) {
        this.field_2092ae_Dne = n;
    }

    public Gle() {
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092ae_Dne = dataInputStream.readByte();
    }

    @Override
    public int method_7a46288d_Dne() {
        return 1;
    }
}

