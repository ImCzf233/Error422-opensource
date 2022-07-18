package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class cSs
extends NER {
    public int field_2d29f4_aFZ;
    public int field_2092ae_Dne;
    public int field_2e5f1b_bzF;
    public int field_21260d_FWm;
    public int field_267cf5_Qnq;

    @Override
    public int method_7a46288d_Dne() {
        return 11;
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092ae_Dne = dataInputStream.readInt();
        this.field_21260d_FWm = dataInputStream.read();
        this.field_2e5f1b_bzF = dataInputStream.readInt();
        this.field_267cf5_Qnq = dataInputStream.readShort();
        this.field_2d29f4_aFZ = dataInputStream.read();
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_a08d09e4_Dne(this);
    }

    public cSs() {
        this.field_267d06_Qnq = true;
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.field_2092ae_Dne);
        dataOutputStream.write(this.field_21260d_FWm);
        dataOutputStream.writeInt(this.field_2e5f1b_bzF);
        dataOutputStream.writeShort(this.field_267cf5_Qnq);
        dataOutputStream.write(this.field_2d29f4_aFZ);
    }

    public cSs(int n, int n2, int n3, Qnq qnq) {
        this.field_267d06_Qnq = true;
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_2e5f1b_bzF = n3;
        this.field_267cf5_Qnq = qnq.method_2c2cf7bc_Dne(n, n2, n3);
        this.field_2d29f4_aFZ = qnq.method_2dee76f_bzF(n, n2, n3);
    }
}

