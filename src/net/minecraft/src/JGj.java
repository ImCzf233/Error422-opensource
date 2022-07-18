package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class JGj
extends NER {
    public int field_2092ae_Dne;
    public byte field_2092a7_Dne;

    @Override
    public int method_7a46288d_Dne() {
        return 5;
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_7536b0fa_Dne(this);
    }

    public JGj(int n, byte by) {
        this.field_2092ae_Dne = n;
        this.field_2092a7_Dne = by;
    }

    public JGj() {
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.field_2092ae_Dne);
        dataOutputStream.writeByte(this.field_2092a7_Dne);
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092ae_Dne = dataInputStream.readInt();
        this.field_2092a7_Dne = dataInputStream.readByte();
    }
}

