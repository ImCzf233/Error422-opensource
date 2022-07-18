package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;

public class xuY
extends oNe {
    public int[] field_3f1c589_Dne;

    public String toString() {
        return "[" + this.field_3f1c589_Dne.length + " bytes]";
    }

    @Override
    void method_e280cae3_Dne(DataInput dataInput) throws IOException {
        int n = dataInput.readInt();
        this.field_3f1c589_Dne = new int[n];
        for (int i = 0; i < n; ++i) {
            this.field_3f1c589_Dne[i] = dataInput.readInt();
        }
    }

    @Override
    void method_899456a2_Dne(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.field_3f1c589_Dne.length);
        for (int i = 0; i < this.field_3f1c589_Dne.length; ++i) {
            dataOutput.writeInt(this.field_3f1c589_Dne[i]);
        }
    }

    @Override
    public oNe method_23130705_Dne() {
        int[] nArray = new int[this.field_3f1c589_Dne.length];
        System.arraycopy(this.field_3f1c589_Dne, 0, nArray, 0, this.field_3f1c589_Dne.length);
        return new xuY(this.method_eecad346_Dne(), nArray);
    }

    @Override
    public byte method_7a462886_Dne() {
        return 11;
    }

    @Override
    public boolean equals(Object object) {
        if (!super.equals(object)) {
            return false;
        }
        xuY xuY2 = (xuY)object;
        return this.field_3f1c589_Dne == null && xuY2.field_3f1c589_Dne == null || this.field_3f1c589_Dne != null && Arrays.equals(this.field_3f1c589_Dne, xuY2.field_3f1c589_Dne);
    }

    public xuY(String string, int[] nArray) {
        super(string);
        this.field_3f1c589_Dne = nArray;
    }

    public xuY(String string) {
        super(string);
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ Arrays.hashCode(this.field_3f1c589_Dne);
    }
}

