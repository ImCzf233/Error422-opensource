package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class DyR
extends iET {
    public DyR() {
        this.field_2092bf_Dne = true;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 9;
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        super.method_aca12b82_Dne(dataOutputStream);
        dataOutputStream.writeByte(this.field_2092a7_Dne);
        dataOutputStream.writeByte(this.field_212606_FWm);
        dataOutputStream.writeByte(this.field_2e5f14_bzF);
        dataOutputStream.writeByte(this.field_267cee_Qnq);
        dataOutputStream.writeByte(this.field_2d29ed_aFZ);
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        super.method_65dbab03_Dne(dataInputStream);
        this.field_2092a7_Dne = dataInputStream.readByte();
        this.field_212606_FWm = dataInputStream.readByte();
        this.field_2e5f14_bzF = dataInputStream.readByte();
        this.field_267cee_Qnq = dataInputStream.readByte();
        this.field_2d29ed_aFZ = dataInputStream.readByte();
    }

    public DyR(int n, byte by, byte by2, byte by3, byte by4, byte by5) {
        super(n);
        this.field_2092a7_Dne = by;
        this.field_212606_FWm = by2;
        this.field_2e5f14_bzF = by3;
        this.field_267cee_Qnq = by4;
        this.field_2d29ed_aFZ = by5;
        this.field_2092bf_Dne = true;
    }
}

