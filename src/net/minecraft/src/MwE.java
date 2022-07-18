package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.List;

public class MwE
extends NER {
    public int field_267cf5_Qnq;
    public int field_2092ae_Dne;
    public int field_21260d_FWm;
    private luM field_378ab08_Dne;
    public int field_2d29f4_aFZ;
    public byte field_2092a7_Dne;
    public String field_569fcf45_Dne;
    public byte field_212606_FWm;
    public int field_2e5f1b_bzF;
    private List field_f27c122c_Dne;

    public List method_adea226d_Dne() {
        if (this.field_f27c122c_Dne == null) {
            this.field_f27c122c_Dne = this.field_378ab08_Dne.method_64e4d8ee_FWm();
        }
        return this.field_f27c122c_Dne;
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_7ce8d14c_Dne(this);
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.field_2092ae_Dne);
        MwE.method_e1033a4c_Dne(this.field_569fcf45_Dne, dataOutputStream);
        dataOutputStream.writeInt(this.field_21260d_FWm);
        dataOutputStream.writeInt(this.field_2e5f1b_bzF);
        dataOutputStream.writeInt(this.field_267cf5_Qnq);
        dataOutputStream.writeByte(this.field_2092a7_Dne);
        dataOutputStream.writeByte(this.field_212606_FWm);
        dataOutputStream.writeShort(this.field_2d29f4_aFZ);
        this.field_378ab08_Dne.method_aca12b82_Dne(dataOutputStream);
    }

    public MwE() {
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092ae_Dne = dataInputStream.readInt();
        this.field_569fcf45_Dne = MwE.method_1ce99840_Dne(dataInputStream, 16);
        this.field_21260d_FWm = dataInputStream.readInt();
        this.field_2e5f1b_bzF = dataInputStream.readInt();
        this.field_267cf5_Qnq = dataInputStream.readInt();
        this.field_2092a7_Dne = dataInputStream.readByte();
        this.field_212606_FWm = dataInputStream.readByte();
        this.field_2d29f4_aFZ = dataInputStream.readShort();
        this.field_f27c122c_Dne = luM.method_1d3460e4_Dne(dataInputStream);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 28;
    }

    public MwE(FiG fiG) {
        this.field_2092ae_Dne = fiG.field_2d29f4_aFZ;
        this.field_569fcf45_Dne = fiG.field_bc57ecbf_aFZ;
        this.field_21260d_FWm = geR.method_117d0718_FWm(fiG.field_2f0dd3_div * 32.0);
        this.field_2e5f1b_bzF = geR.method_117d0718_FWm(fiG.field_22c5fd_IjH * 32.0);
        this.field_267cf5_Qnq = geR.method_117d0718_FWm(fiG.field_334487_mrb * 32.0);
        this.field_2092a7_Dne = (byte)(fiG.field_334489_mrb * 256.0f / 360.0f);
        this.field_212606_FWm = (byte)(fiG.field_29186a_XHL * 256.0f / 360.0f);
        NMq nMq = fiG.field_36a059b_Dne.method_23040479_Dne();
        this.field_2d29f4_aFZ = nMq == null ? 0 : nMq.field_2e5f1b_bzF;
        this.field_378ab08_Dne = fiG.method_23123967_Dne();
    }
}

