package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class bCM
extends oNe {
    public byte field_2092a7_Dne;

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.field_2092a7_Dne;
    }

    public bCM(String string, byte by) {
        super(string);
        this.field_2092a7_Dne = by;
    }

    public bCM(String string) {
        super(string);
    }

    @Override
    public oNe method_23130705_Dne() {
        return new bCM(this.method_eecad346_Dne(), this.field_2092a7_Dne);
    }

    @Override
    public byte method_7a462886_Dne() {
        return 1;
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            bCM bCM2 = (bCM)object;
            return this.field_2092a7_Dne == bCM2.field_2092a7_Dne;
        }
        return false;
    }

    public String toString() {
        return "" + this.field_2092a7_Dne;
    }

    @Override
    void method_899456a2_Dne(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(this.field_2092a7_Dne);
    }

    @Override
    void method_e280cae3_Dne(DataInput dataInput) throws IOException {
        this.field_2092a7_Dne = dataInput.readByte();
    }
}

