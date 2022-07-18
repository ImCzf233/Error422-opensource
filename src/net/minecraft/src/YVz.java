package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class YVz
extends NER {
    public int field_21260d_FWm;
    public int field_2092ae_Dne;

    @Override
    public boolean method_7be2fb90_Dne(NER nER) {
        YVz yVz = (YVz)nER;
        return yVz.field_2092ae_Dne == this.field_2092ae_Dne;
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_8faa08ca_Dne(this);
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.field_2092ae_Dne);
        dataOutputStream.writeInt(this.field_21260d_FWm);
    }

    public YVz() {
    }

    @Override
    public int method_7a46288d_Dne() {
        return 8;
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092ae_Dne = dataInputStream.readInt();
        this.field_21260d_FWm = dataInputStream.readInt();
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return true;
    }

    public YVz(sMa sMa2, sMa sMa3) {
        this.field_2092ae_Dne = sMa2.field_2d29f4_aFZ;
        this.field_21260d_FWm = sMa3 != null ? sMa3.field_2d29f4_aFZ : -1;
    }
}

