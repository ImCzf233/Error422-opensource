package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class kJU
extends oNe {
    public double field_2092a9_Dne;

    @Override
    void method_e280cae3_Dne(DataInput dataInput) throws IOException {
        this.field_2092a9_Dne = dataInput.readDouble();
    }

    @Override
    public int hashCode() {
        long l = Double.doubleToLongBits(this.field_2092a9_Dne);
        return super.hashCode() ^ (int)(l ^ l >>> 32);
    }

    @Override
    public oNe method_23130705_Dne() {
        return new kJU(this.method_eecad346_Dne(), this.field_2092a9_Dne);
    }

    @Override
    public byte method_7a462886_Dne() {
        return 6;
    }

    public String toString() {
        return "" + this.field_2092a9_Dne;
    }

    public kJU(String string) {
        super(string);
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            kJU kJU2 = (kJU)object;
            return this.field_2092a9_Dne == kJU2.field_2092a9_Dne;
        }
        return false;
    }

    public kJU(String string, double d) {
        super(string);
        this.field_2092a9_Dne = d;
    }

    @Override
    void method_899456a2_Dne(DataOutput dataOutput) throws IOException {
        dataOutput.writeDouble(this.field_2092a9_Dne);
    }
}

