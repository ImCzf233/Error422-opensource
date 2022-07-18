package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class YLL
extends NER {
    private float field_267cf2_Qnq;
    private float field_20b854_DyG;
    private float field_2e5f18_bzF;
    private int field_2092ae_Dne;
    private float field_2092ab_Dne;
    private String field_569fcf45_Dne;
    private float field_388da3_zGp;
    private float field_2d29f1_aFZ;
    private float field_21260a_FWm;

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_8f0834ae_Dne(this);
    }

    public double method_7c6f6027_FWm() {
        return this.field_21260a_FWm;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 64;
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        YLL.method_e1033a4c_Dne(this.field_569fcf45_Dne, dataOutputStream);
        dataOutputStream.writeFloat(this.field_2092ab_Dne);
        dataOutputStream.writeFloat(this.field_21260a_FWm);
        dataOutputStream.writeFloat(this.field_2e5f18_bzF);
        dataOutputStream.writeFloat(this.field_267cf2_Qnq);
        dataOutputStream.writeFloat(this.field_2d29f1_aFZ);
        dataOutputStream.writeFloat(this.field_388da3_zGp);
        dataOutputStream.writeFloat(this.field_20b854_DyG);
        dataOutputStream.writeInt(this.field_2092ae_Dne);
    }

    public float method_ae128db7_bzF() {
        return this.field_388da3_zGp;
    }

    public float method_7a46288a_Dne() {
        return this.field_267cf2_Qnq;
    }

    public double method_ae128db5_bzF() {
        return this.field_2e5f18_bzF;
    }

    public float method_907a9d11_Qnq() {
        return this.field_20b854_DyG;
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_569fcf45_Dne = YLL.method_1ce99840_Dne(dataInputStream, 64);
        this.field_2092ab_Dne = dataInputStream.readFloat();
        this.field_21260a_FWm = dataInputStream.readFloat();
        this.field_2e5f18_bzF = dataInputStream.readFloat();
        this.field_267cf2_Qnq = dataInputStream.readFloat();
        this.field_2d29f1_aFZ = dataInputStream.readFloat();
        this.field_388da3_zGp = dataInputStream.readFloat();
        this.field_20b854_DyG = dataInputStream.readFloat();
        this.field_2092ae_Dne = dataInputStream.readInt();
    }

    public float method_7c6f6029_FWm() {
        return this.field_2d29f1_aFZ;
    }

    public double method_7a462888_Dne() {
        return this.field_2092ab_Dne;
    }

    public int method_7c6f602c_FWm() {
        return this.field_2092ae_Dne;
    }

    public String method_eecad346_Dne() {
        return this.field_569fcf45_Dne;
    }
}

