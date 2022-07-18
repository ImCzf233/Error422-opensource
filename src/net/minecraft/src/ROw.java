package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ROw
extends NER {
    public int field_2092ae_Dne;
    public int field_21260d_FWm;
    public int field_2e5f1b_bzF;

    public ROw() {
    }

    @Override
    public boolean method_7be2fb90_Dne(NER nER) {
        return true;
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    public ROw(int n, int n2, int n3) {
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_2e5f1b_bzF = n3;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 12;
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.field_2092ae_Dne);
        dataOutputStream.writeInt(this.field_21260d_FWm);
        dataOutputStream.writeInt(this.field_2e5f1b_bzF);
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092ae_Dne = dataInputStream.readInt();
        this.field_21260d_FWm = dataInputStream.readInt();
        this.field_2e5f1b_bzF = dataInputStream.readInt();
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_83541acd_Dne(this);
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return true;
    }
}

