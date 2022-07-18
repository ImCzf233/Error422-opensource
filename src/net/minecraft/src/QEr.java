package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class QEr
extends FQJ {
    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeDouble(this.field_2092a9_Dne);
        dataOutputStream.writeDouble(this.field_212608_FWm);
        dataOutputStream.writeDouble(this.field_267cf0_Qnq);
        dataOutputStream.writeDouble(this.field_2e5f16_bzF);
        super.method_aca12b82_Dne(dataOutputStream);
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092a9_Dne = dataInputStream.readDouble();
        this.field_212608_FWm = dataInputStream.readDouble();
        this.field_267cf0_Qnq = dataInputStream.readDouble();
        this.field_2e5f16_bzF = dataInputStream.readDouble();
        super.method_65dbab03_Dne(dataInputStream);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 33;
    }

    public QEr(double d, double d2, double d3, double d4, boolean bl) {
        this.field_2092a9_Dne = d;
        this.field_212608_FWm = d2;
        this.field_267cf0_Qnq = d3;
        this.field_2e5f16_bzF = d4;
        this.field_2092bf_Dne = bl;
        this.field_21261e_FWm = true;
    }

    public QEr() {
        this.field_21261e_FWm = true;
    }
}

