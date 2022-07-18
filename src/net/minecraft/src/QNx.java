package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class QNx
extends oNe {
    public String field_569fcf45_Dne;

    public QNx(String string) {
        super(string);
    }

    @Override
    public boolean equals(Object object) {
        if (!super.equals(object)) {
            return false;
        }
        QNx qNx = (QNx)object;
        return this.field_569fcf45_Dne == null && qNx.field_569fcf45_Dne == null || this.field_569fcf45_Dne != null && this.field_569fcf45_Dne.equals(qNx.field_569fcf45_Dne);
    }

    public String toString() {
        return "" + this.field_569fcf45_Dne;
    }

    @Override
    void method_899456a2_Dne(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(this.field_569fcf45_Dne);
    }

    @Override
    public oNe method_23130705_Dne() {
        return new QNx(this.method_eecad346_Dne(), this.field_569fcf45_Dne);
    }

    public QNx(String string, String string2) {
        super(string);
        this.field_569fcf45_Dne = string2;
        if (string2 == null) {
            throw new IllegalArgumentException("Empty string not allowed");
        }
    }

    @Override
    void method_e280cae3_Dne(DataInput dataInput) throws IOException {
        this.field_569fcf45_Dne = dataInput.readUTF();
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.field_569fcf45_Dne.hashCode();
    }

    @Override
    public byte method_7a462886_Dne() {
        return 8;
    }
}

