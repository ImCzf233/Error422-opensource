package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/*
 * Renamed from DtJ
 */
public class dtj_0
extends NER {
    private float field_2e5f18_bzF;
    private int field_267cf5_Qnq;
    private float field_21260a_FWm;
    private int field_2e5f1b_bzF;
    private int field_21260d_FWm;
    private int field_2092ae_Dne;
    private float field_2092ab_Dne;
    private NMq field_36a761a_Dne;

    public dtj_0(int n, int n2, int n3, int n4, NMq nMq, float f, float f2, float f3) {
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_2e5f1b_bzF = n3;
        this.field_267cf5_Qnq = n4;
        this.field_36a761a_Dne = nMq != null ? nMq.method_23040479_Dne() : null;
        this.field_2092ab_Dne = f;
        this.field_21260a_FWm = f2;
        this.field_2e5f18_bzF = f3;
    }

    public float method_7c6f6029_FWm() {
        return this.field_21260a_FWm;
    }

    public dtj_0() {
    }

    public NMq method_23040479_Dne() {
        return this.field_36a761a_Dne;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 19;
    }

    public float method_ae128db7_bzF() {
        return this.field_2e5f18_bzF;
    }

    public int method_7c6f602c_FWm() {
        return this.field_2092ae_Dne;
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092ae_Dne = dataInputStream.readInt();
        this.field_21260d_FWm = dataInputStream.read();
        this.field_2e5f1b_bzF = dataInputStream.readInt();
        this.field_267cf5_Qnq = dataInputStream.read();
        this.field_36a761a_Dne = dtj_0.method_69d02a62_Dne(dataInputStream);
        this.field_2092ab_Dne = (float)dataInputStream.read() / 16.0f;
        this.field_21260a_FWm = (float)dataInputStream.read() / 16.0f;
        this.field_2e5f18_bzF = (float)dataInputStream.read() / 16.0f;
    }

    public float method_7a46288a_Dne() {
        return this.field_2092ab_Dne;
    }

    public int method_907a9d14_Qnq() {
        return this.field_2e5f1b_bzF;
    }

    public int method_ae128dba_bzF() {
        return this.field_21260d_FWm;
    }

    public int method_d44b4585_zGp() {
        return this.field_267cf5_Qnq;
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_6d65330d_Dne(this);
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.field_2092ae_Dne);
        dataOutputStream.write(this.field_21260d_FWm);
        dataOutputStream.writeInt(this.field_2e5f1b_bzF);
        dataOutputStream.write(this.field_267cf5_Qnq);
        dtj_0.method_dcc5e3d_Dne(this.field_36a761a_Dne, dataOutputStream);
        dataOutputStream.write((int)(this.field_2092ab_Dne * 16.0f));
        dataOutputStream.write((int)(this.field_21260a_FWm * 16.0f));
        dataOutputStream.write((int)(this.field_2e5f18_bzF * 16.0f));
    }
}

