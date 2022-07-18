package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class fmA
extends NER {
    public int field_21260d_FWm;
    public kGO field_3778a39_Dne;
    public int field_2e5f1b_bzF;
    public XHL field_36eea90_Dne;
    public int field_2092ae_Dne;

    @Override
    public int method_7a46288d_Dne() {
        return 8 + (this.field_3778a39_Dne == null ? 0 : this.field_3778a39_Dne.method_eecad346_Dne().length());
    }

    public fmA(int n, byte by, kGO kGO2, int n2, XHL xHL) {
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = by;
        this.field_2e5f1b_bzF = n2;
        this.field_36eea90_Dne = xHL;
        this.field_3778a39_Dne = kGO2;
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092ae_Dne = dataInputStream.readInt();
        this.field_21260d_FWm = dataInputStream.readByte();
        this.field_36eea90_Dne = XHL.method_9e728e7e_Dne(dataInputStream.readByte());
        this.field_2e5f1b_bzF = dataInputStream.readShort();
        String string = fmA.method_1ce99840_Dne(dataInputStream, 16);
        this.field_3778a39_Dne = kGO.method_285a5ae2_Dne(string);
        if (this.field_3778a39_Dne == null) {
            this.field_3778a39_Dne = kGO.field_3778a39_Dne;
        }
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_a7033c4d_Dne(this);
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.field_2092ae_Dne);
        dataOutputStream.writeByte(this.field_21260d_FWm);
        dataOutputStream.writeByte(this.field_36eea90_Dne.method_7a46288d_Dne());
        dataOutputStream.writeShort(this.field_2e5f1b_bzF);
        fmA.method_e1033a4c_Dne(this.field_3778a39_Dne.method_eecad346_Dne(), dataOutputStream);
    }

    public fmA() {
    }
}

