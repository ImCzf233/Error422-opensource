package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class RZL
extends NER {
    public int field_2092ae_Dne;
    public NMq field_36a761a_Dne;
    public int field_21260d_FWm;

    public RZL() {
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_83db9163_Dne(this);
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(this.field_2092ae_Dne);
        dataOutputStream.writeShort(this.field_21260d_FWm);
        RZL.method_dcc5e3d_Dne(this.field_36a761a_Dne, dataOutputStream);
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092ae_Dne = dataInputStream.readByte();
        this.field_21260d_FWm = dataInputStream.readShort();
        this.field_36a761a_Dne = RZL.method_69d02a62_Dne(dataInputStream);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 8;
    }

    public RZL(int n, int n2, NMq nMq) {
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_36a761a_Dne = nMq == null ? nMq : nMq.method_23040479_Dne();
    }
}

