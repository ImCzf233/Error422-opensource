package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class kwp
extends NER {
    public int field_267cf5_Qnq;
    public int field_21260d_FWm;
    public int field_2e5f1b_bzF;
    public int field_2092ae_Dne;
    public int field_2d29f4_aFZ;

    public kwp(sMa sMa2, int n, int n2, int n3, int n4) {
        this.field_2d29f4_aFZ = n;
        this.field_21260d_FWm = n2;
        this.field_2e5f1b_bzF = n3;
        this.field_267cf5_Qnq = n4;
        this.field_2092ae_Dne = sMa2.field_2d29f4_aFZ;
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_b02dbfe3_Dne(this);
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092ae_Dne = dataInputStream.readInt();
        this.field_2d29f4_aFZ = dataInputStream.readByte();
        this.field_21260d_FWm = dataInputStream.readInt();
        this.field_2e5f1b_bzF = dataInputStream.readByte();
        this.field_267cf5_Qnq = dataInputStream.readInt();
    }

    public kwp() {
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.field_2092ae_Dne);
        dataOutputStream.writeByte(this.field_2d29f4_aFZ);
        dataOutputStream.writeInt(this.field_21260d_FWm);
        dataOutputStream.writeByte(this.field_2e5f1b_bzF);
        dataOutputStream.writeInt(this.field_267cf5_Qnq);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 14;
    }
}

