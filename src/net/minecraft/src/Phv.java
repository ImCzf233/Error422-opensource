package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Phv
extends NER {
    public int field_2092ae_Dne;

    @Override
    public boolean method_7c6f603d_FWm() {
        return true;
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_814a40c9_Dne(this);
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return true;
    }

    public Phv() {
    }

    @Override
    public int method_7a46288d_Dne() {
        return 4;
    }

    @Override
    public boolean method_7be2fb90_Dne(NER nER) {
        return true;
    }

    public Phv(int n) {
        this.field_2092ae_Dne = n;
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.field_2092ae_Dne);
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092ae_Dne = dataInputStream.readInt();
    }
}

