package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class FTJ
extends FQJ {
    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeFloat(this.field_2092ab_Dne);
        dataOutputStream.writeFloat(this.field_21260a_FWm);
        super.method_aca12b82_Dne(dataOutputStream);
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092ab_Dne = dataInputStream.readFloat();
        this.field_21260a_FWm = dataInputStream.readFloat();
        super.method_65dbab03_Dne(dataInputStream);
    }

    public FTJ(float f, float f2, boolean bl) {
        this.field_2092ab_Dne = f;
        this.field_21260a_FWm = f2;
        this.field_2092bf_Dne = bl;
        this.field_2e5f2c_bzF = true;
    }

    public FTJ() {
        this.field_2e5f2c_bzF = true;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 9;
    }
}

