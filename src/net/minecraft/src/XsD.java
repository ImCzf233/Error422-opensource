package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class XsD
extends NER {
    public byte[] field_3f1c582_Dne;
    public short field_212617_FWm;
    public short field_2092b8_Dne;

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(this.field_2092b8_Dne);
        dataOutputStream.writeShort(this.field_212617_FWm);
        dataOutputStream.writeShort(this.field_3f1c582_Dne.length);
        dataOutputStream.write(this.field_3f1c582_Dne);
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092b8_Dne = dataInputStream.readShort();
        this.field_212617_FWm = dataInputStream.readShort();
        this.field_3f1c582_Dne = new byte[dataInputStream.readUnsignedShort()];
        dataInputStream.readFully(this.field_3f1c582_Dne);
    }

    public XsD(short s, short s2, byte[] byArray) {
        this.field_267d06_Qnq = true;
        this.field_2092b8_Dne = s;
        this.field_212617_FWm = s2;
        this.field_3f1c582_Dne = byArray;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 4 + this.field_3f1c582_Dne.length;
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_8f754dbe_Dne(this);
    }

    public XsD() {
        this.field_267d06_Qnq = true;
    }
}

