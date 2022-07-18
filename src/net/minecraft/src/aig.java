package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class aig
extends NER {
    public int field_2092ae_Dne;

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_9e53e948_Dne(this);
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(this.field_2092ae_Dne);
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092ae_Dne = dataInputStream.readShort();
    }

    public aig() {
    }

    public aig(int n) {
        this.field_2092ae_Dne = n;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return true;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 2;
    }

    @Override
    public boolean method_7be2fb90_Dne(NER nER) {
        return true;
    }
}

