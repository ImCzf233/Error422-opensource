package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class LjQ
extends NER {
    public int field_2092ae_Dne;
    public String field_569fcf45_Dne;

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_7a823b94_Dne(this);
    }

    public LjQ() {
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(this.field_2092ae_Dne);
        LjQ.method_e1033a4c_Dne(this.field_569fcf45_Dne, dataOutputStream);
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092ae_Dne = dataInputStream.readByte();
        this.field_569fcf45_Dne = LjQ.method_1ce99840_Dne(dataInputStream, 16);
    }

    public LjQ(int n, vfE vfE2) {
        this.field_2092ae_Dne = n;
        this.field_569fcf45_Dne = vfE2 == null ? "" : vfE2.method_eecad346_Dne();
    }

    @Override
    public int method_7a46288d_Dne() {
        return 3 + this.field_569fcf45_Dne.length();
    }
}

