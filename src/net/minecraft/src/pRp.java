package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class pRp
extends NER {
    public int field_2092ae_Dne;
    public NMq field_36a761a_Dne;

    @Override
    public int method_7a46288d_Dne() {
        return 8;
    }

    public pRp(int n, NMq nMq) {
        this.field_2092ae_Dne = n;
        this.field_36a761a_Dne = nMq != null ? nMq.method_23040479_Dne() : null;
    }

    public pRp() {
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(this.field_2092ae_Dne);
        pRp.method_dcc5e3d_Dne(this.field_36a761a_Dne, dataOutputStream);
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092ae_Dne = dataInputStream.readShort();
        this.field_36a761a_Dne = pRp.method_69d02a62_Dne(dataInputStream);
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_b6ac9559_Dne(this);
    }
}

