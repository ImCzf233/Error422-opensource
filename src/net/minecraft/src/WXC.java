package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class WXC
extends NER {
    public float field_2092ab_Dne;
    public int field_21260d_FWm;
    public int field_2092ae_Dne;

    public WXC(float f, int n, int n2) {
        this.field_2092ab_Dne = f;
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092ab_Dne = dataInputStream.readFloat();
        this.field_21260d_FWm = dataInputStream.readShort();
        this.field_2092ae_Dne = dataInputStream.readShort();
    }

    @Override
    public boolean method_7be2fb90_Dne(NER nER) {
        return true;
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeFloat(this.field_2092ab_Dne);
        dataOutputStream.writeShort(this.field_21260d_FWm);
        dataOutputStream.writeShort(this.field_2092ae_Dne);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 4;
    }

    public WXC() {
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return true;
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_8c438625_Dne(this);
    }
}

