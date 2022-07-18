package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ike
extends NER {
    private String field_569fcf45_Dne;
    private int field_21260d_FWm;
    private int field_2092ae_Dne;
    private String field_d9a85c6_FWm;

    public int method_7c6f602c_FWm() {
        return this.field_2092ae_Dne;
    }

    public ike(int n, String string, String string2, int n2) {
        this.field_2092ae_Dne = n;
        this.field_569fcf45_Dne = string;
        this.field_d9a85c6_FWm = string2;
        this.field_21260d_FWm = n2;
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092ae_Dne = dataInputStream.readByte();
        this.field_569fcf45_Dne = ike.method_1ce99840_Dne(dataInputStream, 16);
        this.field_d9a85c6_FWm = ike.method_1ce99840_Dne(dataInputStream, 255);
        this.field_21260d_FWm = dataInputStream.readInt();
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(this.field_2092ae_Dne);
        ike.method_e1033a4c_Dne(this.field_569fcf45_Dne, dataOutputStream);
        ike.method_e1033a4c_Dne(this.field_d9a85c6_FWm, dataOutputStream);
        dataOutputStream.writeInt(this.field_21260d_FWm);
    }

    public String method_eecad346_Dne() {
        return this.field_569fcf45_Dne;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 3 + 2 * this.field_569fcf45_Dne.length();
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_ac15f484_Dne(this);
    }

    public ike() {
    }
}

