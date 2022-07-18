package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.List;

public class SnO
extends NER {
    private List field_f27c122c_Dne;
    public int field_2092ae_Dne;

    @Override
    public int method_7a46288d_Dne() {
        return 5;
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092ae_Dne = dataInputStream.readInt();
        this.field_f27c122c_Dne = luM.method_1d3460e4_Dne(dataInputStream);
    }

    public SnO(int n, luM luM2, boolean bl) {
        this.field_2092ae_Dne = n;
        this.field_f27c122c_Dne = bl ? luM2.method_64e4d8ee_FWm() : luM2.method_adea226d_Dne();
    }

    public List method_adea226d_Dne() {
        return this.field_f27c122c_Dne;
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_86ab9d33_Dne(this);
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.field_2092ae_Dne);
        luM.method_65d20933_Dne(this.field_f27c122c_Dne, dataOutputStream);
    }

    public SnO() {
    }
}

