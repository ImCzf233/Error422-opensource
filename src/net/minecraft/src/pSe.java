package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class pSe
extends NER {
    private boolean field_2092bf_Dne = false;
    private float field_2092ab_Dne;
    private boolean field_2e5f2c_bzF = false;
    private float field_21260a_FWm;
    private boolean field_2d2a05_aFZ = false;
    private boolean field_21261e_FWm = false;

    public boolean method_ae128dcb_bzF() {
        return this.field_2092bf_Dne;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 2;
    }

    public pSe() {
    }

    public boolean method_907a9d25_Qnq() {
        return this.field_21261e_FWm;
    }

    @Override
    public boolean method_7be2fb90_Dne(NER nER) {
        return true;
    }

    public void method_143fdded_bzF(boolean bl) {
        this.field_2e5f2c_bzF = bl;
    }

    public float method_7c6f6029_FWm() {
        return this.field_21260a_FWm;
    }

    public pSe(uqg uqg2) {
        this.method_ce7f9d7a_Dne(uqg2.field_2092bf_Dne);
        this.method_117d59bb_FWm(uqg2.field_21261e_FWm);
        this.method_143fdded_bzF(uqg2.field_2e5f2c_bzF);
        this.method_7ed9b9d3_Qnq(uqg2.field_267d06_Qnq);
        this.method_ce7f5266_Dne(uqg2.method_7a46288a_Dne());
        this.method_117d0ea7_FWm(uqg2.method_7c6f6029_FWm());
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        byte by = 0;
        if (this.method_ae128dcb_bzF()) {
            by = (byte)(by | 1);
        }
        if (this.method_907a9d25_Qnq()) {
            by = (byte)(by | 2);
        }
        if (this.method_a98a0664_aFZ()) {
            by = (byte)(by | 4);
        }
        if (this.method_d44b4596_zGp()) {
            by = (byte)(by | 8);
        }
        dataOutputStream.writeByte(by);
        dataOutputStream.writeByte((int)(this.field_2092ab_Dne * 255.0f));
        dataOutputStream.writeByte((int)(this.field_21260a_FWm * 255.0f));
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        byte by = dataInputStream.readByte();
        this.method_ce7f9d7a_Dne((by & 1) > 0);
        this.method_117d59bb_FWm((by & 2) > 0);
        this.method_143fdded_bzF((by & 4) > 0);
        this.method_7ed9b9d3_Qnq((by & 8) > 0);
        this.method_ce7f5266_Dne((float)dataInputStream.readByte() / 255.0f);
        this.method_117d0ea7_FWm((float)dataInputStream.readByte() / 255.0f);
    }

    public boolean method_a98a0664_aFZ() {
        return this.field_2e5f2c_bzF;
    }

    public void method_ce7f9d7a_Dne(boolean bl) {
        this.field_2092bf_Dne = bl;
    }

    public void method_117d59bb_FWm(boolean bl) {
        this.field_21261e_FWm = bl;
    }

    public void method_ce7f5266_Dne(float f) {
        this.field_2092ab_Dne = f;
    }

    public boolean method_d44b4596_zGp() {
        return this.field_2d2a05_aFZ;
    }

    public float method_7a46288a_Dne() {
        return this.field_2092ab_Dne;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return true;
    }

    public void method_7ed9b9d3_Qnq(boolean bl) {
        this.field_2d2a05_aFZ = bl;
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_b6b5acc5_Dne(this);
    }

    public void method_117d0ea7_FWm(float f) {
        this.field_21260a_FWm = f;
    }
}

