package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class eNn
extends NER {
    public byte field_2092a7_Dne;
    public int field_2092ae_Dne;

    public eNn() {
    }

    @Override
    public int method_7a46288d_Dne() {
        return 5;
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092ae_Dne = dataInputStream.readInt();
        this.field_2092a7_Dne = dataInputStream.readByte();
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.field_2092ae_Dne);
        dataOutputStream.writeByte(this.field_2092a7_Dne);
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_a3adffc2_Dne(this);
    }

    @Override
    public boolean method_7be2fb90_Dne(NER nER) {
        eNn eNn2 = (eNn)nER;
        return eNn2.field_2092ae_Dne == this.field_2092ae_Dne;
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return true;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return true;
    }

    public eNn(int n, byte by) {
        this.field_2092ae_Dne = n;
        this.field_2092a7_Dne = by;
    }
}

