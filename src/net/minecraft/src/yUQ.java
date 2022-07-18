package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class yUQ
extends NER {
    private int field_2e5f1b_bzF;
    private int field_21260d_FWm;
    private boolean field_21261e_FWm;
    private boolean field_2092bf_Dne;
    private int field_2092ae_Dne;
    private String field_569fcf45_Dne;

    @Override
    public int method_7a46288d_Dne() {
        return 7;
    }

    public int method_ae128dba_bzF() {
        return this.field_21260d_FWm;
    }

    public int method_7c6f602c_FWm() {
        return this.field_2092ae_Dne;
    }

    public boolean method_ae128dcb_bzF() {
        return this.field_2092bf_Dne;
    }

    public String method_eecad346_Dne() {
        return this.field_569fcf45_Dne;
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_569fcf45_Dne = yUQ.method_1ce99840_Dne(dataInputStream, 7);
        this.field_2092ae_Dne = dataInputStream.readByte();
        byte by = dataInputStream.readByte();
        this.field_21260d_FWm = by & 7;
        this.field_2092bf_Dne = (by & 8) == 8;
        this.field_2e5f1b_bzF = dataInputStream.readByte();
        this.field_21261e_FWm = dataInputStream.readBoolean();
    }

    public yUQ(String string, int n, int n2, boolean bl, int n3, boolean bl2) {
        this.field_569fcf45_Dne = string;
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_2092bf_Dne = bl;
        this.field_2e5f1b_bzF = n3;
        this.field_21261e_FWm = bl2;
    }

    public yUQ() {
    }

    public int method_907a9d14_Qnq() {
        return this.field_2e5f1b_bzF;
    }

    @Override
    public boolean method_7be2fb90_Dne(NER nER) {
        return true;
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_c62461f2_Dne(this);
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        yUQ.method_e1033a4c_Dne(this.field_569fcf45_Dne, dataOutputStream);
        dataOutputStream.writeByte(this.field_2092ae_Dne);
        dataOutputStream.writeByte(this.field_21260d_FWm | (this.field_2092bf_Dne ? 1 : 0) << 3);
        dataOutputStream.writeByte(this.field_2e5f1b_bzF);
        dataOutputStream.writeBoolean(this.field_21261e_FWm);
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return true;
    }

    public boolean method_907a9d25_Qnq() {
        return this.field_21261e_FWm;
    }
}

