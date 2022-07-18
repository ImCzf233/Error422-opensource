package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class phA
extends oNe {
    public short field_2092b8_Dne;

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            phA phA2 = (phA)object;
            return this.field_2092b8_Dne == phA2.field_2092b8_Dne;
        }
        return false;
    }

    @Override
    void method_899456a2_Dne(DataOutput dataOutput) throws IOException {
        dataOutput.writeShort(this.field_2092b8_Dne);
    }

    public phA(String string, short s) {
        super(string);
        this.field_2092b8_Dne = s;
    }

    public phA(String string) {
        super(string);
    }

    public String toString() {
        return "" + this.field_2092b8_Dne;
    }

    @Override
    public byte method_7a462886_Dne() {
        return 2;
    }

    @Override
    public oNe method_23130705_Dne() {
        return new phA(this.method_eecad346_Dne(), this.field_2092b8_Dne);
    }

    @Override
    void method_e280cae3_Dne(DataInput dataInput) throws IOException {
        this.field_2092b8_Dne = dataInput.readShort();
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.field_2092b8_Dne;
    }
}

