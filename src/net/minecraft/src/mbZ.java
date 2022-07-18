package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class mbZ
extends oNe {
    public List<oNe> field_f27c122c_Dne = new ArrayList();
    private byte field_2092a7_Dne;

    public String toString() {
        return "" + this.field_f27c122c_Dne.size() + " entries of type " + oNe.method_d6a1a17e_Dne(this.field_2092a7_Dne);
    }

    @Override
    void method_e280cae3_Dne(DataInput dataInput) throws IOException {
        this.field_2092a7_Dne = dataInput.readByte();
        int n = dataInput.readInt();
        this.field_f27c122c_Dne = new ArrayList();
        for (int i = 0; i < n; ++i) {
            oNe oNe2 = oNe.method_9c259e17_Dne(this.field_2092a7_Dne, null);
            oNe2.method_e280cae3_Dne(dataInput);
            this.field_f27c122c_Dne.add(oNe2);
        }
    }

    @Override
    void method_899456a2_Dne(DataOutput dataOutput) throws IOException {
        this.field_2092a7_Dne = !this.field_f27c122c_Dne.isEmpty() ? ((oNe)this.field_f27c122c_Dne.get(0)).method_7a462886_Dne() : (byte)1;
        dataOutput.writeByte(this.field_2092a7_Dne);
        dataOutput.writeInt(this.field_f27c122c_Dne.size());
        for (int i = 0; i < this.field_f27c122c_Dne.size(); ++i) {
            ((oNe)this.field_f27c122c_Dne.get(i)).method_899456a2_Dne(dataOutput);
        }
    }

    public void method_b4ba5ea1_Dne(oNe oNe2) {
        this.field_2092a7_Dne = oNe2.method_7a462886_Dne();
        this.field_f27c122c_Dne.add(oNe2);
    }

    public int method_7a46288d_Dne() {
        return this.field_f27c122c_Dne.size();
    }

    @Override
    public byte method_7a462886_Dne() {
        return 9;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.field_f27c122c_Dne.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            mbZ mbZ2 = (mbZ)object;
            if (this.field_2092a7_Dne == mbZ2.field_2092a7_Dne) {
                return this.field_f27c122c_Dne.equals(mbZ2.field_f27c122c_Dne);
            }
        }
        return false;
    }

    public oNe method_9e7d1c94_Dne(int n) {
        return (oNe)this.field_f27c122c_Dne.remove(n);
    }

    public mbZ() {
        super("");
    }

    @Override
    public oNe method_23130705_Dne() {
        mbZ mbZ2 = new mbZ(this.method_eecad346_Dne());
        mbZ2.field_2092a7_Dne = this.field_2092a7_Dne;
        for (oNe oNe2 : this.field_f27c122c_Dne) {
            oNe oNe3 = oNe2.method_23130705_Dne();
            mbZ2.field_f27c122c_Dne.add(oNe3);
        }
        return mbZ2;
    }

    public oNe method_77d0d055_FWm(int n) {
        return (oNe)this.field_f27c122c_Dne.get(n);
    }

    public mbZ(String string) {
        super(string);
    }
}

