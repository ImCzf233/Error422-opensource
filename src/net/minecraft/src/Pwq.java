package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.List;

public class Pwq
extends NER {
    public NMq[] field_8360c375_Dne;
    public int field_2092ae_Dne;

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(this.field_2092ae_Dne);
        dataOutputStream.writeShort(this.field_8360c375_Dne.length);
        for (int i = 0; i < this.field_8360c375_Dne.length; ++i) {
            Pwq.method_dcc5e3d_Dne(this.field_8360c375_Dne[i], dataOutputStream);
        }
    }

    public Pwq() {
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_821b5b7d_Dne(this);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 3 + this.field_8360c375_Dne.length * 5;
    }

    public Pwq(int n, List list) {
        this.field_2092ae_Dne = n;
        this.field_8360c375_Dne = new NMq[list.size()];
        for (int i = 0; i < this.field_8360c375_Dne.length; ++i) {
            NMq nMq = (NMq)list.get(i);
            this.field_8360c375_Dne[i] = nMq == null ? null : nMq.method_23040479_Dne();
        }
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092ae_Dne = dataInputStream.readByte();
        int n = dataInputStream.readShort();
        this.field_8360c375_Dne = new NMq[n];
        for (int i = 0; i < n; ++i) {
            this.field_8360c375_Dne[i] = Pwq.method_69d02a62_Dne(dataInputStream);
        }
    }
}

