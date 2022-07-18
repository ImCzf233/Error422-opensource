package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class FaB
extends NER {
    public String field_569fcf45_Dne;
    public byte[] field_3f1c582_Dne;
    public int field_2092ae_Dne;

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        FaB.method_e1033a4c_Dne(this.field_569fcf45_Dne, dataOutputStream);
        dataOutputStream.writeShort((short)this.field_2092ae_Dne);
        if (this.field_3f1c582_Dne != null) {
            dataOutputStream.write(this.field_3f1c582_Dne);
        }
    }

    public FaB() {
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_6fbf82c0_Dne(this);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 2 + this.field_569fcf45_Dne.length() * 2 + 2 + this.field_2092ae_Dne;
    }

    public FaB(String string, byte[] byArray) {
        this.field_569fcf45_Dne = string;
        this.field_3f1c582_Dne = byArray;
        if (byArray != null) {
            this.field_2092ae_Dne = byArray.length;
            if (this.field_2092ae_Dne > Short.MAX_VALUE) {
                throw new IllegalArgumentException("Payload may not be larger than 32k");
            }
        }
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_569fcf45_Dne = FaB.method_1ce99840_Dne(dataInputStream, 20);
        this.field_2092ae_Dne = dataInputStream.readShort();
        if (this.field_2092ae_Dne > 0 && this.field_2092ae_Dne < Short.MAX_VALUE) {
            this.field_3f1c582_Dne = new byte[this.field_2092ae_Dne];
            dataInputStream.readFully(this.field_3f1c582_Dne);
        }
    }
}

