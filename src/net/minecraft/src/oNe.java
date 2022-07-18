package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public abstract class oNe {
    public static final String[] field_f5e54dca_Dne = new String[]{"END", "BYTE", "SHORT", "INT", "LONG", "FLOAT", "DOUBLE", "BYTE[]", "STRING", "LIST", "COMPOUND", "INT[]"};
    private String field_569fcf45_Dne;

    abstract void method_e280cae3_Dne(DataInput var1) throws IOException;

    public int hashCode() {
        return this.field_569fcf45_Dne.hashCode() ^ this.method_7a462886_Dne();
    }

    public String method_eecad346_Dne() {
        return this.field_569fcf45_Dne == null ? "" : this.field_569fcf45_Dne;
    }

    public static oNe method_9c259e17_Dne(byte by, String string) {
        switch (by) {
            case 0: {
                return new log_0();
            }
            case 1: {
                return new bCM(string);
            }
            case 2: {
                return new phA(string);
            }
            case 3: {
                return new BYr(string);
            }
            case 4: {
                return new zCY(string);
            }
            case 5: {
                return new nOv(string);
            }
            case 6: {
                return new kJU(string);
            }
            case 7: {
                return new kfd_0(string);
            }
            case 8: {
                return new QNx(string);
            }
            case 9: {
                return new mbZ(string);
            }
            case 10: {
                return new WkD(string);
            }
            case 11: {
                return new xuY(string);
            }
        }
        return null;
    }

    public boolean equals(Object object) {
        if (!(object instanceof oNe)) {
            return false;
        }
        oNe oNe2 = (oNe)object;
        return this.method_7a462886_Dne() != oNe2.method_7a462886_Dne() ? false : (!(this.field_569fcf45_Dne == null && oNe2.field_569fcf45_Dne != null || this.field_569fcf45_Dne != null && oNe2.field_569fcf45_Dne == null) ? this.field_569fcf45_Dne == null || this.field_569fcf45_Dne.equals(oNe2.field_569fcf45_Dne) : false);
    }

    public oNe method_f2806fae_FWm(String string) {
        this.field_569fcf45_Dne = string == null ? "" : string;
        return this;
    }

    public static String method_d6a1a17e_Dne(byte by) {
        switch (by) {
            case 0: {
                return "TAG_End";
            }
            case 1: {
                return "TAG_Byte";
            }
            case 2: {
                return "TAG_Short";
            }
            case 3: {
                return "TAG_Int";
            }
            case 4: {
                return "TAG_Long";
            }
            case 5: {
                return "TAG_Float";
            }
            case 6: {
                return "TAG_Double";
            }
            case 7: {
                return "TAG_Byte_Array";
            }
            case 8: {
                return "TAG_String";
            }
            case 9: {
                return "TAG_List";
            }
            case 10: {
                return "TAG_Compound";
            }
            case 11: {
                return "TAG_Int_Array";
            }
        }
        return "UNKNOWN";
    }

    public static void method_9e004329_Dne(oNe oNe2, DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(oNe2.method_7a462886_Dne());
        if (oNe2.method_7a462886_Dne() != 0) {
            dataOutput.writeUTF(oNe2.method_eecad346_Dne());
            oNe2.method_899456a2_Dne(dataOutput);
        }
    }

    protected oNe(String string) {
        this.field_569fcf45_Dne = string == null ? "" : string;
    }

    public static oNe method_cd315cce_Dne(DataInput dataInput) throws IOException {
        byte by = dataInput.readByte();
        if (by == 0) {
            return new log_0();
        }
        String string = dataInput.readUTF();
        oNe oNe2 = oNe.method_9c259e17_Dne(by, string);
        try {
            oNe2.method_e280cae3_Dne(dataInput);
            return oNe2;
        }
        catch (IOException iOException) {
            McM mcM = McM.method_948e60df_Dne(iOException, "Loading NBT data");
            Noo noo = mcM.method_284dc627_Dne("NBT Tag");
            noo.method_5e295ec0_Dne("Tag name", string);
            noo.method_5e295ec0_Dne("Tag type", by);
            throw new kaJ(mcM);
        }
    }

    public abstract oNe method_23130705_Dne();

    abstract void method_899456a2_Dne(DataOutput var1) throws IOException;

    public abstract byte method_7a462886_Dne();
}

