package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class wXa
extends NER {
    public int field_20b857_DyG;
    public int field_267cf5_Qnq;
    public int field_2092ae_Dne;
    public int field_2e5f1b_bzF;
    public int field_2d29f4_aFZ;
    public int field_33448c_mrb;
    public int field_2f0dd8_div;
    public int field_29186d_XHL;
    public int field_388da6_zGp;
    public int field_21260d_FWm;
    public int field_22c602_IjH;

    public wXa() {
    }

    public wXa(sMa sMa2, int n) {
        this(sMa2, n, 0);
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.field_2092ae_Dne);
        dataOutputStream.writeByte(this.field_33448c_mrb);
        dataOutputStream.writeInt(this.field_21260d_FWm);
        dataOutputStream.writeInt(this.field_2e5f1b_bzF);
        dataOutputStream.writeInt(this.field_267cf5_Qnq);
        dataOutputStream.writeByte(this.field_2f0dd8_div);
        dataOutputStream.writeByte(this.field_22c602_IjH);
        dataOutputStream.writeInt(this.field_29186d_XHL);
        if (this.field_29186d_XHL > 0) {
            dataOutputStream.writeShort(this.field_2d29f4_aFZ);
            dataOutputStream.writeShort(this.field_388da6_zGp);
            dataOutputStream.writeShort(this.field_20b857_DyG);
        }
    }

    public wXa(sMa sMa2, int n, int n2) {
        this.field_2092ae_Dne = sMa2.field_2d29f4_aFZ;
        this.field_21260d_FWm = geR.method_117d0718_FWm(sMa2.field_2f0dd3_div * 32.0);
        this.field_2e5f1b_bzF = geR.method_117d0718_FWm(sMa2.field_22c5fd_IjH * 32.0);
        this.field_267cf5_Qnq = geR.method_117d0718_FWm(sMa2.field_334487_mrb * 32.0);
        this.field_2f0dd8_div = geR.method_ce7f5259_Dne(sMa2.field_29186a_XHL * 256.0f / 360.0f);
        this.field_22c602_IjH = geR.method_ce7f5259_Dne(sMa2.field_334489_mrb * 256.0f / 360.0f);
        this.field_33448c_mrb = n;
        this.field_29186d_XHL = n2;
        if (n2 > 0) {
            double d = sMa2.field_291868_XHL;
            double d2 = sMa2.field_2a9ad1_Zpi;
            double d3 = sMa2.field_31b811_kGO;
            double d4 = 3.9;
            if (d < -d4) {
                d = -d4;
            }
            if (d2 < -d4) {
                d2 = -d4;
            }
            if (d3 < -d4) {
                d3 = -d4;
            }
            if (d > d4) {
                d = d4;
            }
            if (d2 > d4) {
                d2 = d4;
            }
            if (d3 > d4) {
                d3 = d4;
            }
            this.field_2d29f4_aFZ = (int)(d * 8000.0);
            this.field_388da6_zGp = (int)(d2 * 8000.0);
            this.field_20b857_DyG = (int)(d3 * 8000.0);
        }
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_c2ec3d27_Dne(this);
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092ae_Dne = dataInputStream.readInt();
        this.field_33448c_mrb = dataInputStream.readByte();
        this.field_21260d_FWm = dataInputStream.readInt();
        this.field_2e5f1b_bzF = dataInputStream.readInt();
        this.field_267cf5_Qnq = dataInputStream.readInt();
        this.field_2f0dd8_div = dataInputStream.readByte();
        this.field_22c602_IjH = dataInputStream.readByte();
        this.field_29186d_XHL = dataInputStream.readInt();
        if (this.field_29186d_XHL > 0) {
            this.field_2d29f4_aFZ = dataInputStream.readShort();
            this.field_388da6_zGp = dataInputStream.readShort();
            this.field_20b857_DyG = dataInputStream.readShort();
        }
    }

    @Override
    public int method_7a46288d_Dne() {
        return 21 + this.field_29186d_XHL > 0 ? 6 : 0;
    }
}

