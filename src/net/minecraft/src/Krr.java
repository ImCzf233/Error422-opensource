package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Krr
extends NER {
    public int field_2092ae_Dne;

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(this.field_2092ae_Dne);
    }

    public Krr() {
    }

    public Krr(int n) {
        this.field_2092ae_Dne = n;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 1;
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092ae_Dne = dataInputStream.readByte();
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_794d1f3c_Dne(this);
    }
}

