package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.List;

public class QZR
extends NER {
    public byte field_212606_FWm;
    public int field_388da6_zGp;
    public int field_2092ae_Dne;
    private List field_f27c122c_Dne;
    public byte field_2092a7_Dne;
    public int field_21260d_FWm;
    public int field_2f0dd8_div;
    public int field_20b857_DyG;
    public byte field_2e5f14_bzF;
    private luM field_378ab08_Dne;
    public int field_267cf5_Qnq;
    public int field_2e5f1b_bzF;
    public int field_2d29f4_aFZ;

    @Override
    public int method_7a46288d_Dne() {
        return 26;
    }

    public List method_adea226d_Dne() {
        if (this.field_f27c122c_Dne == null) {
            this.field_f27c122c_Dne = this.field_378ab08_Dne.method_64e4d8ee_FWm();
        }
        return this.field_f27c122c_Dne;
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_822972fe_Dne(this);
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092ae_Dne = dataInputStream.readInt();
        this.field_21260d_FWm = dataInputStream.readByte() & 0xFF;
        this.field_2e5f1b_bzF = dataInputStream.readInt();
        this.field_267cf5_Qnq = dataInputStream.readInt();
        this.field_2d29f4_aFZ = dataInputStream.readInt();
        this.field_2092a7_Dne = dataInputStream.readByte();
        this.field_212606_FWm = dataInputStream.readByte();
        this.field_2e5f14_bzF = dataInputStream.readByte();
        this.field_388da6_zGp = dataInputStream.readShort();
        this.field_20b857_DyG = dataInputStream.readShort();
        this.field_2f0dd8_div = dataInputStream.readShort();
        this.field_f27c122c_Dne = luM.method_1d3460e4_Dne(dataInputStream);
    }

    public QZR() {
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.field_2092ae_Dne);
        dataOutputStream.writeByte(this.field_21260d_FWm & 0xFF);
        dataOutputStream.writeInt(this.field_2e5f1b_bzF);
        dataOutputStream.writeInt(this.field_267cf5_Qnq);
        dataOutputStream.writeInt(this.field_2d29f4_aFZ);
        dataOutputStream.writeByte(this.field_2092a7_Dne);
        dataOutputStream.writeByte(this.field_212606_FWm);
        dataOutputStream.writeByte(this.field_2e5f14_bzF);
        dataOutputStream.writeShort(this.field_388da6_zGp);
        dataOutputStream.writeShort(this.field_20b857_DyG);
        dataOutputStream.writeShort(this.field_2f0dd8_div);
        this.field_378ab08_Dne.method_aca12b82_Dne(dataOutputStream);
    }

    public QZR(FUH fUH) {
        this.field_2092ae_Dne = fUH.field_2d29f4_aFZ;
        this.field_21260d_FWm = (byte)Klb.method_bb7dd813_Dne(fUH);
        this.field_2e5f1b_bzF = fUH.field_373e877_Dne.method_ce7f4ad7_Dne(fUH.field_2f0dd3_div);
        this.field_267cf5_Qnq = geR.method_117d0718_FWm(fUH.field_22c5fd_IjH * 32.0);
        this.field_2d29f4_aFZ = fUH.field_373e877_Dne.method_ce7f4ad7_Dne(fUH.field_334487_mrb);
        this.field_2092a7_Dne = (byte)(fUH.field_334489_mrb * 256.0f / 360.0f);
        this.field_212606_FWm = (byte)(fUH.field_29186a_XHL * 256.0f / 360.0f);
        this.field_2e5f14_bzF = (byte)(fUH.field_36e4d7_vSL * 256.0f / 360.0f);
        double d = 3.9;
        double d2 = fUH.field_291868_XHL;
        double d3 = fUH.field_2a9ad1_Zpi;
        double d4 = fUH.field_31b811_kGO;
        if (d2 < -d) {
            d2 = -d;
        }
        if (d3 < -d) {
            d3 = -d;
        }
        if (d4 < -d) {
            d4 = -d;
        }
        if (d2 > d) {
            d2 = d;
        }
        if (d3 > d) {
            d3 = d;
        }
        if (d4 > d) {
            d4 = d;
        }
        this.field_388da6_zGp = (int)(d2 * 8000.0);
        this.field_20b857_DyG = (int)(d3 * 8000.0);
        this.field_2f0dd8_div = (int)(d4 * 8000.0);
        this.field_378ab08_Dne = fUH.method_23123967_Dne();
    }
}

