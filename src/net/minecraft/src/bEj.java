package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class bEj
extends NER {
    private int field_267cf5_Qnq;
    private int field_2d29f4_aFZ;
    private int field_21260d_FWm;
    private int field_2092ae_Dne;
    private int field_2e5f1b_bzF;

    public int method_d44b4585_zGp() {
        return this.field_267cf5_Qnq;
    }

    public bEj(int n, int n2, int n3, int n4, int n5) {
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_2e5f1b_bzF = n3;
        this.field_267cf5_Qnq = n4;
        this.field_2d29f4_aFZ = n5;
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092ae_Dne = dataInputStream.readInt();
        this.field_21260d_FWm = dataInputStream.readInt();
        this.field_2e5f1b_bzF = dataInputStream.readInt();
        this.field_267cf5_Qnq = dataInputStream.readInt();
        this.field_2d29f4_aFZ = dataInputStream.read();
    }

    @Override
    public int method_7a46288d_Dne() {
        return 13;
    }

    public int method_7ad387f6_DyG() {
        return this.field_2d29f4_aFZ;
    }

    public bEj() {
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.field_2092ae_Dne);
        dataOutputStream.writeInt(this.field_21260d_FWm);
        dataOutputStream.writeInt(this.field_2e5f1b_bzF);
        dataOutputStream.writeInt(this.field_267cf5_Qnq);
        dataOutputStream.write(this.field_2d29f4_aFZ);
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return true;
    }

    public int method_7c6f602c_FWm() {
        return this.field_2092ae_Dne;
    }

    @Override
    public boolean method_7be2fb90_Dne(NER nER) {
        bEj bEj2 = (bEj)nER;
        return bEj2.field_2092ae_Dne == this.field_2092ae_Dne;
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_9e0ed0e0_Dne(this);
    }

    public int method_ae128dba_bzF() {
        return this.field_21260d_FWm;
    }

    public int method_907a9d14_Qnq() {
        return this.field_2e5f1b_bzF;
    }
}

