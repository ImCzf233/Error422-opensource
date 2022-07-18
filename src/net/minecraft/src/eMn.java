package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class eMn
extends FQJ {
    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeDouble(this.field_2092a9_Dne);
        dataOutputStream.writeDouble(this.field_212608_FWm);
        dataOutputStream.writeDouble(this.field_267cf0_Qnq);
        dataOutputStream.writeDouble(this.field_2e5f16_bzF);
        dataOutputStream.writeFloat(this.field_2092ab_Dne);
        dataOutputStream.writeFloat(this.field_21260a_FWm);
        super.method_aca12b82_Dne(dataOutputStream);
    }

    public eMn(double d, double d2, double d3, double d4, float f, float f2, boolean bl) {
        this.field_2092a9_Dne = d;
        this.field_212608_FWm = d2;
        this.field_267cf0_Qnq = d3;
        this.field_2e5f16_bzF = d4;
        this.field_2092ab_Dne = f;
        this.field_21260a_FWm = f2;
        this.field_2092bf_Dne = bl;
        this.field_2e5f2c_bzF = true;
        this.field_21261e_FWm = true;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 41;
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092a9_Dne = dataInputStream.readDouble();
        this.field_212608_FWm = dataInputStream.readDouble();
        this.field_267cf0_Qnq = dataInputStream.readDouble();
        this.field_2e5f16_bzF = dataInputStream.readDouble();
        this.field_2092ab_Dne = dataInputStream.readFloat();
        this.field_21260a_FWm = dataInputStream.readFloat();
        super.method_65dbab03_Dne(dataInputStream);
    }

    public eMn() {
        this.field_2e5f2c_bzF = true;
        this.field_21261e_FWm = true;
    }
}

