package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;

/*
 * Renamed from kfd
 */
public class kfd_0
extends oNe {
    public byte[] field_3f1c582_Dne;

    public kfd_0(String string) {
        super(string);
    }

    @Override
    public byte method_7a462886_Dne() {
        return 7;
    }

    public String toString() {
        return "[" + this.field_3f1c582_Dne.length + " bytes]";
    }

    @Override
    void method_899456a2_Dne(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.field_3f1c582_Dne.length);
        dataOutput.write(this.field_3f1c582_Dne);
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object) ? Arrays.equals(this.field_3f1c582_Dne, ((kfd_0)object).field_3f1c582_Dne) : false;
    }

    @Override
    void method_e280cae3_Dne(DataInput dataInput) throws IOException {
        int n = dataInput.readInt();
        this.field_3f1c582_Dne = new byte[n];
        dataInput.readFully(this.field_3f1c582_Dne);
    }

    public kfd_0(String string, byte[] byArray) {
        super(string);
        this.field_3f1c582_Dne = byArray;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ Arrays.hashCode(this.field_3f1c582_Dne);
    }

    @Override
    public oNe method_23130705_Dne() {
        byte[] byArray = new byte[this.field_3f1c582_Dne.length];
        System.arraycopy(this.field_3f1c582_Dne, 0, byArray, 0, this.field_3f1c582_Dne.length);
        return new kfd_0(this.method_eecad346_Dne(), byArray);
    }
}

