package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/*
 * Renamed from VJn
 */
public class vjn_0
extends NER {
    public int field_21260d_FWm;
    public int field_388da6_zGp;
    public int field_267cf5_Qnq;
    public int field_2e5f1b_bzF;
    public int field_2d29f4_aFZ;
    public int field_2092ae_Dne;

    public vjn_0() {
    }

    @Override
    public int method_7a46288d_Dne() {
        return 14;
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_89dcf06d_Dne(this);
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.field_2092ae_Dne);
        dataOutputStream.writeShort(this.field_21260d_FWm);
        dataOutputStream.writeInt(this.field_2e5f1b_bzF);
        dataOutputStream.write(this.field_267cf5_Qnq);
        dataOutputStream.write(this.field_2d29f4_aFZ);
        dataOutputStream.writeShort(this.field_388da6_zGp & 0xFFF);
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092ae_Dne = dataInputStream.readInt();
        this.field_21260d_FWm = dataInputStream.readShort();
        this.field_2e5f1b_bzF = dataInputStream.readInt();
        this.field_267cf5_Qnq = dataInputStream.read();
        this.field_2d29f4_aFZ = dataInputStream.read();
        this.field_388da6_zGp = dataInputStream.readShort() & 0xFFF;
    }

    public vjn_0(int n, int n2, int n3, int n4, int n5, int n6) {
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_2e5f1b_bzF = n3;
        this.field_267cf5_Qnq = n5;
        this.field_2d29f4_aFZ = n6;
        this.field_388da6_zGp = n4;
    }
}

