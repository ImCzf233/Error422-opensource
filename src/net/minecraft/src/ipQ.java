package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ipQ
extends NER {
    public int field_2e5f1b_bzF;
    public int field_267cf5_Qnq;
    public int field_2092ae_Dne;
    public WkD field_36ef89c_Dne;
    public int field_21260d_FWm;

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_ac53529d_Dne(this);
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.field_2092ae_Dne);
        dataOutputStream.writeShort(this.field_21260d_FWm);
        dataOutputStream.writeInt(this.field_2e5f1b_bzF);
        dataOutputStream.writeByte((byte)this.field_267cf5_Qnq);
        ipQ.method_2c6be9bf_Dne(this.field_36ef89c_Dne, dataOutputStream);
    }

    public ipQ() {
        this.field_267d06_Qnq = true;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 25;
    }

    public ipQ(int n, int n2, int n3, int n4, WkD wkD) {
        this.field_267d06_Qnq = true;
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_2e5f1b_bzF = n3;
        this.field_267cf5_Qnq = n4;
        this.field_36ef89c_Dne = wkD;
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092ae_Dne = dataInputStream.readInt();
        this.field_21260d_FWm = dataInputStream.readShort();
        this.field_2e5f1b_bzF = dataInputStream.readInt();
        this.field_267cf5_Qnq = dataInputStream.readByte();
        this.field_36ef89c_Dne = ipQ.method_69d4ace4_Dne(dataInputStream);
    }
}

