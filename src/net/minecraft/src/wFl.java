package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class wFl
extends NER {
    public int field_2092ae_Dne;
    public int field_267cf5_Qnq;
    public int field_2e5f1b_bzF;
    public int field_21260d_FWm;

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.field_2092ae_Dne);
        dataOutputStream.writeShort(this.field_21260d_FWm);
        dataOutputStream.writeShort(this.field_2e5f1b_bzF);
        dataOutputStream.writeShort(this.field_267cf5_Qnq);
    }

    public wFl(int n, double d, double d2, double d3) {
        this.field_2092ae_Dne = n;
        double d4 = 3.9;
        if (d < -d4) {
            d = -d4;
        }
        if (d2 < -d4) {
            d2 = -d4;
        }
        if (d3 < -d4) {
            d3 = -d4;
        }
        if (d > d4) {
            d = d4;
        }
        if (d2 > d4) {
            d2 = d4;
        }
        if (d3 > d4) {
            d3 = d4;
        }
        this.field_21260d_FWm = (int)(d * 8000.0);
        this.field_2e5f1b_bzF = (int)(d2 * 8000.0);
        this.field_267cf5_Qnq = (int)(d3 * 8000.0);
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_c1f3962a_Dne(this);
    }

    public wFl(sMa sMa2) {
        this(sMa2.field_2d29f4_aFZ, sMa2.field_291868_XHL, sMa2.field_2a9ad1_Zpi, sMa2.field_31b811_kGO);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 10;
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092ae_Dne = dataInputStream.readInt();
        this.field_21260d_FWm = dataInputStream.readShort();
        this.field_2e5f1b_bzF = dataInputStream.readShort();
        this.field_267cf5_Qnq = dataInputStream.readShort();
    }

    @Override
    public boolean method_7be2fb90_Dne(NER nER) {
        wFl wFl2 = (wFl)nER;
        return wFl2.field_2092ae_Dne == this.field_2092ae_Dne;
    }

    public wFl() {
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return true;
    }
}

