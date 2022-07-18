package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class efs
extends NER {
    private String field_569fcf45_Dne;

    public String method_eecad346_Dne() {
        return this.field_569fcf45_Dne;
    }

    @Override
    public boolean method_7be2fb90_Dne(NER nER) {
        return true;
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_a50279b5_Dne(this);
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_569fcf45_Dne = efs.method_1ce99840_Dne(dataInputStream, rXx.field_2092ae_Dne);
    }

    public efs(String string) {
        this.field_569fcf45_Dne = string;
    }

    public efs() {
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        efs.method_e1033a4c_Dne(this.field_569fcf45_Dne, dataOutputStream);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 2 + this.field_569fcf45_Dne.length() * 2;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return true;
    }
}

