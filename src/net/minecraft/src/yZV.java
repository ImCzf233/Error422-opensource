package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class yZV
extends NER {
    public String field_569fcf45_Dne;

    public yZV(String string) {
        this.field_569fcf45_Dne = string;
    }

    public yZV() {
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return true;
    }

    @Override
    public int method_7a46288d_Dne() {
        return this.field_569fcf45_Dne.length();
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        yZV.method_e1033a4c_Dne(this.field_569fcf45_Dne, dataOutputStream);
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_c66d1d52_Dne(this);
    }

    @Override
    public boolean method_7be2fb90_Dne(NER nER) {
        return true;
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_569fcf45_Dne = yZV.method_1ce99840_Dne(dataInputStream, 256);
    }
}

