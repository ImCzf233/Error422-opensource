package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class iET
extends NER {
    public boolean field_2092bf_Dne = false;
    public byte field_2092a7_Dne;
    public byte field_2e5f14_bzF;
    public byte field_267cee_Qnq;
    public byte field_2d29ed_aFZ;
    public byte field_212606_FWm;
    public int field_2092ae_Dne;

    @Override
    public String toString() {
        return "Entity_" + super.toString();
    }

    public iET() {
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return true;
    }

    @Override
    public boolean method_7be2fb90_Dne(NER nER) {
        iET iET2 = (iET)nER;
        return iET2.field_2092ae_Dne == this.field_2092ae_Dne;
    }

    public iET(int n) {
        this.field_2092ae_Dne = n;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 4;
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.field_2092ae_Dne);
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_a9f6bd0f_Dne(this);
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092ae_Dne = dataInputStream.readInt();
    }
}

