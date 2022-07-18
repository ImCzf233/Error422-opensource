package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class iQd
extends NER {
    public String field_569fcf45_Dne;
    public String field_d9a85c6_FWm;
    public int field_2092ae_Dne;

    public iQd() {
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_569fcf45_Dne = iQd.method_1ce99840_Dne(dataInputStream, 16);
        this.field_d9a85c6_FWm = iQd.method_1ce99840_Dne(dataInputStream, 32);
        this.field_2092ae_Dne = dataInputStream.readByte();
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        iQd.method_e1033a4c_Dne(this.field_569fcf45_Dne, dataOutputStream);
        iQd.method_e1033a4c_Dne(this.field_d9a85c6_FWm, dataOutputStream);
        dataOutputStream.writeByte(this.field_2092ae_Dne);
    }

    public iQd(vfE vfE2, int n) {
        this.field_569fcf45_Dne = vfE2.method_eecad346_Dne();
        this.field_d9a85c6_FWm = vfE2.method_d1f1ed87_FWm();
        this.field_2092ae_Dne = n;
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_aaa71d0b_Dne(this);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 2 + this.field_569fcf45_Dne.length() + 2 + this.field_d9a85c6_FWm.length() + 1;
    }
}

