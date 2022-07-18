package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class zCY
extends oNe {
    public long field_2092af_Dne;

    @Override
    public byte method_7a462886_Dne() {
        return 4;
    }

    public zCY(String string, long l) {
        super(string);
        this.field_2092af_Dne = l;
    }

    @Override
    void method_899456a2_Dne(DataOutput dataOutput) throws IOException {
        dataOutput.writeLong(this.field_2092af_Dne);
    }

    @Override
    void method_e280cae3_Dne(DataInput dataInput) throws IOException {
        this.field_2092af_Dne = dataInput.readLong();
    }

    public zCY(String string) {
        super(string);
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ (int)(this.field_2092af_Dne ^ this.field_2092af_Dne >>> 32);
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            zCY zCY2 = (zCY)object;
            return this.field_2092af_Dne == zCY2.field_2092af_Dne;
        }
        return false;
    }

    public String toString() {
        return "" + this.field_2092af_Dne;
    }

    @Override
    public oNe method_23130705_Dne() {
        return new zCY(this.method_eecad346_Dne(), this.field_2092af_Dne);
    }
}

