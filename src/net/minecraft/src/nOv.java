package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class nOv
extends oNe {
    public float field_2092ab_Dne;

    @Override
    public int hashCode() {
        return super.hashCode() ^ Float.floatToIntBits(this.field_2092ab_Dne);
    }

    public nOv(String string, float f) {
        super(string);
        this.field_2092ab_Dne = f;
    }

    @Override
    public byte method_7a462886_Dne() {
        return 5;
    }

    public String toString() {
        return "" + this.field_2092ab_Dne;
    }

    @Override
    public oNe method_23130705_Dne() {
        return new nOv(this.method_eecad346_Dne(), this.field_2092ab_Dne);
    }

    @Override
    void method_899456a2_Dne(DataOutput dataOutput) throws IOException {
        dataOutput.writeFloat(this.field_2092ab_Dne);
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            nOv nOv2 = (nOv)object;
            return this.field_2092ab_Dne == nOv2.field_2092ab_Dne;
        }
        return false;
    }

    public nOv(String string) {
        super(string);
    }

    @Override
    void method_e280cae3_Dne(DataInput dataInput) throws IOException {
        this.field_2092ab_Dne = dataInput.readFloat();
    }
}

