package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class bia
extends NER {
    public int field_267cf5_Qnq;
    public int field_2d29f4_aFZ;
    public int field_21260d_FWm;
    public int field_2e5f1b_bzF;
    public String field_569fcf45_Dne;
    public int field_2092ae_Dne;

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_a00607ad_Dne(this);
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092ae_Dne = dataInputStream.readInt();
        this.field_569fcf45_Dne = bia.method_1ce99840_Dne(dataInputStream, uCl.field_2092ae_Dne);
        this.field_21260d_FWm = dataInputStream.readInt();
        this.field_2e5f1b_bzF = dataInputStream.readInt();
        this.field_267cf5_Qnq = dataInputStream.readInt();
        this.field_2d29f4_aFZ = dataInputStream.readInt();
    }

    public bia() {
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.field_2092ae_Dne);
        bia.method_e1033a4c_Dne(this.field_569fcf45_Dne, dataOutputStream);
        dataOutputStream.writeInt(this.field_21260d_FWm);
        dataOutputStream.writeInt(this.field_2e5f1b_bzF);
        dataOutputStream.writeInt(this.field_267cf5_Qnq);
        dataOutputStream.writeInt(this.field_2d29f4_aFZ);
    }

    public bia(JCd jCd) {
        this.field_2092ae_Dne = jCd.field_2d29f4_aFZ;
        this.field_21260d_FWm = jCd.field_21260d_FWm;
        this.field_2e5f1b_bzF = jCd.field_2e5f1b_bzF;
        this.field_267cf5_Qnq = jCd.field_267cf5_Qnq;
        this.field_2d29f4_aFZ = jCd.field_2092ae_Dne;
        this.field_569fcf45_Dne = jCd.field_37c0a6e_Dne.field_569fcf45_Dne;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 24;
    }
}

