package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Raa
extends NER {
    public int field_2092ae_Dne;
    public int field_21260d_FWm;

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_8447c1b5_Dne(this);
    }

    public Raa(int n, int n2) {
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
    }

    public Raa() {
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.field_2092ae_Dne);
        dataOutputStream.writeByte(this.field_21260d_FWm);
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return true;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 6;
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092ae_Dne = dataInputStream.readInt();
        this.field_21260d_FWm = dataInputStream.readByte();
    }
}

