package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ziQ
extends NER {
    public int field_2092ae_Dne;
    public byte field_212606_FWm;
    public byte field_2092a7_Dne;
    public short field_2092b8_Dne;

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_c8f310a5_Dne(this);
    }

    @Override
    public boolean method_7be2fb90_Dne(NER nER) {
        ziQ ziQ2 = (ziQ)nER;
        return ziQ2.field_2092ae_Dne == this.field_2092ae_Dne && ziQ2.field_2092a7_Dne == this.field_2092a7_Dne;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 8;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return true;
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.field_2092ae_Dne);
        dataOutputStream.writeByte(this.field_2092a7_Dne);
        dataOutputStream.writeByte(this.field_212606_FWm);
        dataOutputStream.writeShort(this.field_2092b8_Dne);
    }

    public boolean method_ae128dcb_bzF() {
        return this.field_2092b8_Dne == Short.MAX_VALUE;
    }

    public ziQ(int n, NAx nAx) {
        this.field_2092ae_Dne = n;
        this.field_2092a7_Dne = (byte)(nAx.method_7a46288d_Dne() & 0xFF);
        this.field_212606_FWm = (byte)(nAx.method_ae128dba_bzF() & 0xFF);
        this.field_2092b8_Dne = nAx.method_7c6f602c_FWm() > Short.MAX_VALUE ? (short)Short.MAX_VALUE : (short)nAx.method_7c6f602c_FWm();
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092ae_Dne = dataInputStream.readInt();
        this.field_2092a7_Dne = dataInputStream.readByte();
        this.field_212606_FWm = dataInputStream.readByte();
        this.field_2092b8_Dne = dataInputStream.readShort();
    }

    public ziQ() {
    }
}

