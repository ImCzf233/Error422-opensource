package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class BYr
extends oNe {
    public int field_2092ae_Dne;

    @Override
    void method_e280cae3_Dne(DataInput dataInput) throws IOException {
        this.field_2092ae_Dne = dataInput.readInt();
    }

    public BYr(String string, int n) {
        super(string);
        this.field_2092ae_Dne = n;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.field_2092ae_Dne;
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            BYr bYr = (BYr)object;
            return this.field_2092ae_Dne == bYr.field_2092ae_Dne;
        }
        return false;
    }

    @Override
    public byte method_7a462886_Dne() {
        return 3;
    }

    @Override
    public oNe method_23130705_Dne() {
        return new BYr(this.method_eecad346_Dne(), this.field_2092ae_Dne);
    }

    public String toString() {
        return "" + this.field_2092ae_Dne;
    }

    @Override
    void method_899456a2_Dne(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.field_2092ae_Dne);
    }

    public BYr(String string) {
        super(string);
    }
}

