package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class zqT
extends NER {
    public float field_2092ab_Dne;
    public int field_2092ae_Dne;
    public int field_21260d_FWm;

    @Override
    public int method_7a46288d_Dne() {
        return 8;
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(this.field_2092ae_Dne);
        dataOutputStream.writeShort(this.field_21260d_FWm);
        dataOutputStream.writeFloat(this.field_2092ab_Dne);
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_c96529ca_Dne(this);
    }

    @Override
    public boolean method_7be2fb90_Dne(NER nER) {
        return true;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return true;
    }

    public zqT(int n, int n2, float f) {
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_2092ab_Dne = f;
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092ae_Dne = dataInputStream.readShort();
        this.field_21260d_FWm = dataInputStream.readShort();
        this.field_2092ab_Dne = dataInputStream.readFloat();
    }

    public zqT() {
    }
}

