package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class mPe
extends NER {
    public int field_267cf5_Qnq;
    public int field_2d29f4_aFZ;
    public int field_2e5f1b_bzF;
    public int field_2092ae_Dne;
    public int field_21260d_FWm;

    public mPe(alg alg2) {
        this.field_2092ae_Dne = alg2.field_2d29f4_aFZ;
        this.field_21260d_FWm = geR.method_117d0718_FWm(alg2.field_2f0dd3_div * 32.0);
        this.field_2e5f1b_bzF = geR.method_117d0718_FWm(alg2.field_22c5fd_IjH * 32.0);
        this.field_267cf5_Qnq = geR.method_117d0718_FWm(alg2.field_334487_mrb * 32.0);
        this.field_2d29f4_aFZ = alg2.method_7a46288d_Dne();
    }

    public mPe() {
    }

    @Override
    public int method_7a46288d_Dne() {
        return 18;
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_b16cdc65_Dne(this);
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.field_2092ae_Dne);
        dataOutputStream.writeInt(this.field_21260d_FWm);
        dataOutputStream.writeInt(this.field_2e5f1b_bzF);
        dataOutputStream.writeInt(this.field_267cf5_Qnq);
        dataOutputStream.writeShort(this.field_2d29f4_aFZ);
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092ae_Dne = dataInputStream.readInt();
        this.field_21260d_FWm = dataInputStream.readInt();
        this.field_2e5f1b_bzF = dataInputStream.readInt();
        this.field_267cf5_Qnq = dataInputStream.readInt();
        this.field_2d29f4_aFZ = dataInputStream.readShort();
    }
}

