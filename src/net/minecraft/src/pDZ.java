package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class pDZ
extends NER {
    public short field_2092b8_Dne;
    public int field_2092ae_Dne;
    public boolean field_2092bf_Dne;

    public pDZ(int n, short s, boolean bl) {
        this.field_2092ae_Dne = n;
        this.field_2092b8_Dne = s;
        this.field_2092bf_Dne = bl;
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_b5dd4c21_Dne(this);
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(this.field_2092ae_Dne);
        dataOutputStream.writeShort(this.field_2092b8_Dne);
        dataOutputStream.writeByte(this.field_2092bf_Dne ? 1 : 0);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 4;
    }

    public pDZ() {
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092ae_Dne = dataInputStream.readByte();
        this.field_2092b8_Dne = dataInputStream.readShort();
        this.field_2092bf_Dne = dataInputStream.readByte() != 0;
    }
}

