package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class wwJ
extends NER {
    public int field_267cf5_Qnq;
    public int field_2e5f1b_bzF;
    private boolean field_2092bf_Dne;
    public int field_21260d_FWm;
    public int field_2092ae_Dne;
    public int field_2d29f4_aFZ;

    @Override
    public int method_7a46288d_Dne() {
        return 21;
    }

    public wwJ() {
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_c496a13d_Dne(this);
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092ae_Dne = dataInputStream.readInt();
        this.field_2e5f1b_bzF = dataInputStream.readInt();
        this.field_267cf5_Qnq = dataInputStream.readByte() & 0xFF;
        this.field_2d29f4_aFZ = dataInputStream.readInt();
        this.field_21260d_FWm = dataInputStream.readInt();
        this.field_2092bf_Dne = dataInputStream.readBoolean();
    }

    public wwJ(int n, int n2, int n3, int n4, int n5, boolean bl) {
        this.field_2092ae_Dne = n;
        this.field_2e5f1b_bzF = n2;
        this.field_267cf5_Qnq = n3;
        this.field_2d29f4_aFZ = n4;
        this.field_21260d_FWm = n5;
        this.field_2092bf_Dne = bl;
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.field_2092ae_Dne);
        dataOutputStream.writeInt(this.field_2e5f1b_bzF);
        dataOutputStream.writeByte(this.field_267cf5_Qnq & 0xFF);
        dataOutputStream.writeInt(this.field_2d29f4_aFZ);
        dataOutputStream.writeInt(this.field_21260d_FWm);
        dataOutputStream.writeBoolean(this.field_2092bf_Dne);
    }

    public boolean method_ae128dcb_bzF() {
        return this.field_2092bf_Dne;
    }
}

