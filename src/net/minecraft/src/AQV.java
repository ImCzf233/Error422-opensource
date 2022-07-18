package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class AQV
extends NER {
    private int field_267cf5_Qnq;
    private int field_2e5f1b_bzF;
    private int field_2092ae_Dne;
    private float field_2092ab_Dne;
    private String field_569fcf45_Dne;
    private int field_21260d_FWm = Integer.MAX_VALUE;

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_665ee701_Dne(this);
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_569fcf45_Dne = AQV.method_1ce99840_Dne(dataInputStream, 32);
        this.field_2092ae_Dne = dataInputStream.readInt();
        this.field_21260d_FWm = dataInputStream.readInt();
        this.field_2e5f1b_bzF = dataInputStream.readInt();
        this.field_2092ab_Dne = dataInputStream.readFloat();
        this.field_267cf5_Qnq = dataInputStream.readUnsignedByte();
    }

    public double method_7c6f6027_FWm() {
        return (float)this.field_21260d_FWm / 8.0f;
    }

    public float method_7c6f6029_FWm() {
        return (float)this.field_267cf5_Qnq / 63.0f;
    }

    public AQV(String string, double d, double d2, double d3, float f, float f2) {
        this.field_569fcf45_Dne = string;
        this.field_2092ae_Dne = (int)(d * 8.0);
        this.field_21260d_FWm = (int)(d2 * 8.0);
        this.field_2e5f1b_bzF = (int)(d3 * 8.0);
        this.field_2092ab_Dne = f;
        this.field_267cf5_Qnq = (int)(f2 * 63.0f);
        if (this.field_267cf5_Qnq < 0) {
            this.field_267cf5_Qnq = 0;
        }
        if (this.field_267cf5_Qnq > 255) {
            this.field_267cf5_Qnq = 255;
        }
    }

    public double method_ae128db5_bzF() {
        return (float)this.field_2e5f1b_bzF / 8.0f;
    }

    public AQV() {
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        AQV.method_e1033a4c_Dne(this.field_569fcf45_Dne, dataOutputStream);
        dataOutputStream.writeInt(this.field_2092ae_Dne);
        dataOutputStream.writeInt(this.field_21260d_FWm);
        dataOutputStream.writeInt(this.field_2e5f1b_bzF);
        dataOutputStream.writeFloat(this.field_2092ab_Dne);
        dataOutputStream.writeByte(this.field_267cf5_Qnq);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 24;
    }

    public double method_7a462888_Dne() {
        return (float)this.field_2092ae_Dne / 8.0f;
    }

    public float method_7a46288a_Dne() {
        return this.field_2092ab_Dne;
    }

    public String method_eecad346_Dne() {
        return this.field_569fcf45_Dne;
    }
}

