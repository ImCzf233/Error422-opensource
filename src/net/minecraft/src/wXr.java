package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class wXr
extends iET {
    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        super.method_aca12b82_Dne(dataOutputStream);
        dataOutputStream.writeByte(this.field_267cee_Qnq);
        dataOutputStream.writeByte(this.field_2d29ed_aFZ);
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        super.method_65dbab03_Dne(dataInputStream);
        this.field_267cee_Qnq = dataInputStream.readByte();
        this.field_2d29ed_aFZ = dataInputStream.readByte();
    }

    @Override
    public int method_7a46288d_Dne() {
        return 6;
    }

    public wXr(int n, byte by, byte by2) {
        super(n);
        this.field_267cee_Qnq = by;
        this.field_2d29ed_aFZ = by2;
        this.field_2092bf_Dne = true;
    }

    public wXr() {
        this.field_2092bf_Dne = true;
    }
}

