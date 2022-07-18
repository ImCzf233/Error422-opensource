package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class uYm
extends NER {
    public long field_388da7_zGp;
    public long field_20b858_DyG;

    @Override
    public boolean method_7a46289e_Dne() {
        return true;
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeLong(this.field_388da7_zGp);
        dataOutputStream.writeLong(this.field_20b858_DyG);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 16;
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_bf9617de_Dne(this);
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_388da7_zGp = dataInputStream.readLong();
        this.field_20b858_DyG = dataInputStream.readLong();
    }

    public uYm() {
    }

    @Override
    public boolean method_7be2fb90_Dne(NER nER) {
        return true;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return true;
    }

    public uYm(long l, long l2) {
        this.field_388da7_zGp = l;
        this.field_20b858_DyG = l2;
    }
}

