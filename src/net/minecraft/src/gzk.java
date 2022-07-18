package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class gzk
extends NER {
    public byte field_2092a7_Dne;
    public int field_2092ae_Dne;

    @Override
    public int method_7a46288d_Dne() {
        return 5;
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.field_2092ae_Dne);
        dataOutputStream.writeByte(this.field_2092a7_Dne);
    }

    public gzk() {
    }

    public gzk(int n, NAx nAx) {
        this.field_2092ae_Dne = n;
        this.field_2092a7_Dne = (byte)(nAx.method_7a46288d_Dne() & 0xFF);
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_a9825e0f_Dne(this);
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092ae_Dne = dataInputStream.readInt();
        this.field_2092a7_Dne = dataInputStream.readByte();
    }
}

