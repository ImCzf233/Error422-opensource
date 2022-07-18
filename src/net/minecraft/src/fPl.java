package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class fPl
extends NER {
    public int field_2092ae_Dne;
    public boolean field_2092bf_Dne;
    public String field_569fcf45_Dne;

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_569fcf45_Dne = fPl.method_1ce99840_Dne(dataInputStream, 16);
        this.field_2092bf_Dne = dataInputStream.readByte() != 0;
        this.field_2092ae_Dne = dataInputStream.readShort();
    }

    @Override
    public int method_7a46288d_Dne() {
        return this.field_569fcf45_Dne.length() + 2 + 1 + 2;
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_a57e1ea5_Dne(this);
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        fPl.method_e1033a4c_Dne(this.field_569fcf45_Dne, dataOutputStream);
        dataOutputStream.writeByte(this.field_2092bf_Dne ? 1 : 0);
        dataOutputStream.writeShort(this.field_2092ae_Dne);
    }

    public fPl(String string, boolean bl, int n) {
        this.field_569fcf45_Dne = string;
        this.field_2092bf_Dne = bl;
        this.field_2092ae_Dne = n;
    }

    public fPl() {
    }
}

