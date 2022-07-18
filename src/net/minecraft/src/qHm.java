package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class qHm
extends NER {
    public int field_2092ae_Dne;
    public int field_21260d_FWm;
    private NMq field_36a761a_Dne;

    public qHm(int n, int n2, NMq nMq) {
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_36a761a_Dne = nMq == null ? null : nMq.method_23040479_Dne();
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092ae_Dne = dataInputStream.readInt();
        this.field_21260d_FWm = dataInputStream.readShort();
        this.field_36a761a_Dne = qHm.method_69d02a62_Dne(dataInputStream);
    }

    @Override
    public boolean method_7be2fb90_Dne(NER nER) {
        qHm qHm2 = (qHm)nER;
        return qHm2.field_2092ae_Dne == this.field_2092ae_Dne && qHm2.field_21260d_FWm == this.field_21260d_FWm;
    }

    public NMq method_23040479_Dne() {
        return this.field_36a761a_Dne;
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.field_2092ae_Dne);
        dataOutputStream.writeShort(this.field_21260d_FWm);
        qHm.method_dcc5e3d_Dne(this.field_36a761a_Dne, dataOutputStream);
    }

    public qHm() {
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return true;
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_b7d325d1_Dne(this);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 8;
    }
}

