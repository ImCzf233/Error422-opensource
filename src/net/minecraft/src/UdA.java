package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UdA
extends NER {
    private float field_2e5f18_bzF;
    public List<EyB> field_f27c122c_Dne;
    private float field_21260a_FWm;
    public float field_2092ab_Dne;
    public double field_212608_FWm;
    public double field_2e5f16_bzF;
    public double field_2092a9_Dne;
    private float field_267cf2_Qnq;

    public UdA() {
    }

    public float method_7c6f6029_FWm() {
        return this.field_2e5f18_bzF;
    }

    public UdA(double d, double d2, double d3, float f, List list, chN chN2) {
        this.field_2092a9_Dne = d;
        this.field_212608_FWm = d2;
        this.field_2e5f16_bzF = d3;
        this.field_2092ab_Dne = f;
        this.field_f27c122c_Dne = new ArrayList(list);
        if (chN2 != null) {
            this.field_21260a_FWm = (float)chN2.field_2092a9_Dne;
            this.field_2e5f18_bzF = (float)chN2.field_212608_FWm;
            this.field_267cf2_Qnq = (float)chN2.field_2e5f16_bzF;
        }
    }

    @Override
    public int method_7a46288d_Dne() {
        return 32 + this.field_f27c122c_Dne.size() * 3 + 3;
    }

    public float method_7a46288a_Dne() {
        return this.field_21260a_FWm;
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092a9_Dne = dataInputStream.readDouble();
        this.field_212608_FWm = dataInputStream.readDouble();
        this.field_2e5f16_bzF = dataInputStream.readDouble();
        this.field_2092ab_Dne = dataInputStream.readFloat();
        int n = dataInputStream.readInt();
        this.field_f27c122c_Dne = new ArrayList(n);
        int n2 = (int)this.field_2092a9_Dne;
        int n3 = (int)this.field_212608_FWm;
        int n4 = (int)this.field_2e5f16_bzF;
        for (int i = 0; i < n; ++i) {
            int n5 = dataInputStream.readByte() + n2;
            int n6 = dataInputStream.readByte() + n3;
            int n7 = dataInputStream.readByte() + n4;
            this.field_f27c122c_Dne.add(new EyB(n5, n6, n7));
        }
        this.field_21260a_FWm = dataInputStream.readFloat();
        this.field_2e5f18_bzF = dataInputStream.readFloat();
        this.field_267cf2_Qnq = dataInputStream.readFloat();
    }

    public float method_ae128db7_bzF() {
        return this.field_267cf2_Qnq;
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeDouble(this.field_2092a9_Dne);
        dataOutputStream.writeDouble(this.field_212608_FWm);
        dataOutputStream.writeDouble(this.field_2e5f16_bzF);
        dataOutputStream.writeFloat(this.field_2092ab_Dne);
        dataOutputStream.writeInt(this.field_f27c122c_Dne.size());
        int n = (int)this.field_2092a9_Dne;
        int n2 = (int)this.field_212608_FWm;
        int n3 = (int)this.field_2e5f16_bzF;
        for (EyB eyB : this.field_f27c122c_Dne) {
            int n4 = eyB.field_2092ae_Dne - n;
            int n5 = eyB.field_21260d_FWm - n2;
            int n6 = eyB.field_2e5f1b_bzF - n3;
            dataOutputStream.writeByte(n4);
            dataOutputStream.writeByte(n5);
            dataOutputStream.writeByte(n6);
        }
        dataOutputStream.writeFloat(this.field_21260a_FWm);
        dataOutputStream.writeFloat(this.field_2e5f18_bzF);
        dataOutputStream.writeFloat(this.field_267cf2_Qnq);
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_89820635_Dne(this);
    }
}

