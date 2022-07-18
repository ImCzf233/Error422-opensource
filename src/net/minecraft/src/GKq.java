package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class GKq
extends iET {
    @Override
    public int method_7a46288d_Dne() {
        return 7;
    }

    public GKq(int n, byte by, byte by2, byte by3) {
        super(n);
        this.field_2092a7_Dne = by;
        this.field_212606_FWm = by2;
        this.field_2e5f14_bzF = by3;
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        super.method_65dbab03_Dne(dataInputStream);
        this.field_2092a7_Dne = dataInputStream.readByte();
        this.field_212606_FWm = dataInputStream.readByte();
        this.field_2e5f14_bzF = dataInputStream.readByte();
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        super.method_aca12b82_Dne(dataOutputStream);
        dataOutputStream.writeByte(this.field_2092a7_Dne);
        dataOutputStream.writeByte(this.field_212606_FWm);
        dataOutputStream.writeByte(this.field_2e5f14_bzF);
    }

    public GKq() {
    }
}

