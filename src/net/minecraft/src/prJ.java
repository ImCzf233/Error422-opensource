package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;

public class prJ
extends NER {
    public int field_2092ae_Dne = 0;

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_b85e3f5f_Dne(this);
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) {
    }

    @Override
    public int method_7a46288d_Dne() {
        return 0;
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) {
        try {
            this.field_2092ae_Dne = dataInputStream.readByte();
        }
        catch (Throwable throwable) {
            this.field_2092ae_Dne = 0;
        }
    }
}

