package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class mZp
extends NER {
    public NMq field_36a761a_Dne;
    public int field_267cf5_Qnq;
    public int field_2092ae_Dne;
    public short field_2092b8_Dne;
    public int field_21260d_FWm;
    public int field_2e5f1b_bzF;

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_b1fec784_Dne(this);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 11;
    }

    public mZp() {
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092ae_Dne = dataInputStream.readByte();
        this.field_21260d_FWm = dataInputStream.readShort();
        this.field_2e5f1b_bzF = dataInputStream.readByte();
        this.field_2092b8_Dne = dataInputStream.readShort();
        this.field_267cf5_Qnq = dataInputStream.readByte();
        this.field_36a761a_Dne = mZp.method_69d02a62_Dne(dataInputStream);
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(this.field_2092ae_Dne);
        dataOutputStream.writeShort(this.field_21260d_FWm);
        dataOutputStream.writeByte(this.field_2e5f1b_bzF);
        dataOutputStream.writeShort(this.field_2092b8_Dne);
        dataOutputStream.writeByte(this.field_267cf5_Qnq);
        mZp.method_dcc5e3d_Dne(this.field_36a761a_Dne, dataOutputStream);
    }

    public mZp(int n, int n2, int n3, int n4, NMq nMq, short s) {
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_2e5f1b_bzF = n3;
        this.field_36a761a_Dne = nMq != null ? nMq.method_23040479_Dne() : null;
        this.field_2092b8_Dne = s;
        this.field_267cf5_Qnq = n4;
    }
}

