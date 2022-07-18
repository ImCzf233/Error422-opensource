package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class niw
extends NER {
    public int field_2092ae_Dne = 0;
    public String field_d9a85c6_FWm = "";
    public String field_569fcf45_Dne = "";
    public int field_21260d_FWm = 0;

    public niw(OHz oHz, int n) {
        this.field_569fcf45_Dne = oHz.method_eecad346_Dne();
        this.field_d9a85c6_FWm = oHz.method_23168bd6_Dne().method_eecad346_Dne();
        this.field_2092ae_Dne = oHz.method_7a46288d_Dne();
        this.field_21260d_FWm = n;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 2 + this.field_569fcf45_Dne.length() + 2 + this.field_d9a85c6_FWm.length() + 4 + 1;
    }

    public niw(String string) {
        this.field_569fcf45_Dne = string;
        this.field_d9a85c6_FWm = "";
        this.field_2092ae_Dne = 0;
        this.field_21260d_FWm = 1;
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_b48a2f4b_Dne(this);
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_569fcf45_Dne = niw.method_1ce99840_Dne(dataInputStream, 16);
        this.field_21260d_FWm = dataInputStream.readByte();
        if (this.field_21260d_FWm != 1) {
            this.field_d9a85c6_FWm = niw.method_1ce99840_Dne(dataInputStream, 16);
            this.field_2092ae_Dne = dataInputStream.readInt();
        }
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        niw.method_e1033a4c_Dne(this.field_569fcf45_Dne, dataOutputStream);
        dataOutputStream.writeByte(this.field_21260d_FWm);
        if (this.field_21260d_FWm != 1) {
            niw.method_e1033a4c_Dne(this.field_d9a85c6_FWm, dataOutputStream);
            dataOutputStream.writeInt(this.field_2092ae_Dne);
        }
    }

    public niw() {
    }
}

