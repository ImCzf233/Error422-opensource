package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class NVL
extends NER {
    public byte field_212606_FWm;
    public int field_21260d_FWm;
    public int field_267cf5_Qnq;
    public byte field_2092a7_Dne;
    public int field_2e5f1b_bzF;
    public int field_2092ae_Dne;

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092ae_Dne = dataInputStream.readInt();
        this.field_21260d_FWm = dataInputStream.readInt();
        this.field_2e5f1b_bzF = dataInputStream.readInt();
        this.field_267cf5_Qnq = dataInputStream.readInt();
        this.field_2092a7_Dne = (byte)dataInputStream.read();
        this.field_212606_FWm = (byte)dataInputStream.read();
    }

    @Override
    public boolean method_7be2fb90_Dne(NER nER) {
        NVL nVL = (NVL)nER;
        return nVL.field_2092ae_Dne == this.field_2092ae_Dne;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return true;
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.field_2092ae_Dne);
        dataOutputStream.writeInt(this.field_21260d_FWm);
        dataOutputStream.writeInt(this.field_2e5f1b_bzF);
        dataOutputStream.writeInt(this.field_267cf5_Qnq);
        dataOutputStream.write(this.field_2092a7_Dne);
        dataOutputStream.write(this.field_212606_FWm);
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_7ccfd0e3_Dne(this);
    }

    public NVL() {
    }

    public NVL(sMa sMa2) {
        this.field_2092ae_Dne = sMa2.field_2d29f4_aFZ;
        this.field_21260d_FWm = geR.method_117d0718_FWm(sMa2.field_2f0dd3_div * 32.0);
        this.field_2e5f1b_bzF = geR.method_117d0718_FWm(sMa2.field_22c5fd_IjH * 32.0);
        this.field_267cf5_Qnq = geR.method_117d0718_FWm(sMa2.field_334487_mrb * 32.0);
        this.field_2092a7_Dne = (byte)(sMa2.field_334489_mrb * 256.0f / 360.0f);
        this.field_212606_FWm = (byte)(sMa2.field_29186a_XHL * 256.0f / 360.0f);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 34;
    }

    public NVL(int n, int n2, int n3, int n4, byte by, byte by2) {
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_2e5f1b_bzF = n3;
        this.field_267cf5_Qnq = n4;
        this.field_2092a7_Dne = by;
        this.field_212606_FWm = by2;
    }
}

