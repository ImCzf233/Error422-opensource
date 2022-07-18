package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class tXK
extends NER {
    public int[] field_3f1c589_Dne;

    public tXK() {
    }

    @Override
    public int method_7a46288d_Dne() {
        return 1 + this.field_3f1c589_Dne.length * 4;
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_bdc3b320_Dne(this);
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_3f1c589_Dne = new int[dataInputStream.readByte()];
        for (int i = 0; i < this.field_3f1c589_Dne.length; ++i) {
            this.field_3f1c589_Dne[i] = dataInputStream.readInt();
        }
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(this.field_3f1c589_Dne.length);
        for (int i = 0; i < this.field_3f1c589_Dne.length; ++i) {
            dataOutputStream.writeInt(this.field_3f1c589_Dne[i]);
        }
    }

    public tXK(int ... nArray) {
        this.field_3f1c589_Dne = nArray;
    }
}

