package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class QKM
extends NER {
    public int field_2092ae_Dne;
    public int field_2e5f1b_bzF;
    public int field_21260d_FWm;

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_8153cc94_Dne(this);
    }

    public QKM() {
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092ae_Dne = dataInputStream.readByte();
        this.field_21260d_FWm = dataInputStream.readShort();
        this.field_2e5f1b_bzF = dataInputStream.readShort();
    }

    @Override
    public int method_7a46288d_Dne() {
        return 5;
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(this.field_2092ae_Dne);
        dataOutputStream.writeShort(this.field_21260d_FWm);
        dataOutputStream.writeShort(this.field_2e5f1b_bzF);
    }

    public QKM(int n, int n2, int n3) {
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_2e5f1b_bzF = n3;
    }
}

