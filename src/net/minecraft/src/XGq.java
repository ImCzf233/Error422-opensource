package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class XGq
extends NER {
    public int field_21260d_FWm;
    public String field_569fcf45_Dne;
    public int field_2e5f1b_bzF;
    public int field_2092ae_Dne;
    public boolean field_2092bf_Dne;

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_8d1db845_Dne(this);
    }

    public XGq() {
    }

    public XGq(int n, int n2, String string, int n3, boolean bl) {
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_569fcf45_Dne = string;
        this.field_2e5f1b_bzF = n3;
        this.field_2092bf_Dne = bl;
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092ae_Dne = dataInputStream.readByte() & 0xFF;
        this.field_21260d_FWm = dataInputStream.readByte() & 0xFF;
        this.field_569fcf45_Dne = XGq.method_1ce99840_Dne(dataInputStream, 32);
        this.field_2e5f1b_bzF = dataInputStream.readByte() & 0xFF;
        this.field_2092bf_Dne = dataInputStream.readBoolean();
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(this.field_2092ae_Dne & 0xFF);
        dataOutputStream.writeByte(this.field_21260d_FWm & 0xFF);
        XGq.method_e1033a4c_Dne(this.field_569fcf45_Dne, dataOutputStream);
        dataOutputStream.writeByte(this.field_2e5f1b_bzF & 0xFF);
        dataOutputStream.writeBoolean(this.field_2092bf_Dne);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 4 + this.field_569fcf45_Dne.length();
    }
}

