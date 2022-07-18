package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class rXx
extends NER {
    private boolean field_2092bf_Dne = true;
    public static int field_2092ae_Dne = 119;
    public String field_569fcf45_Dne;

    public boolean method_ae128dcb_bzF() {
        return this.field_2092bf_Dne;
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        rXx.method_e1033a4c_Dne(this.field_569fcf45_Dne, dataOutputStream);
    }

    public rXx() {
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return !this.field_569fcf45_Dne.startsWith("/");
    }

    @Override
    public int method_7a46288d_Dne() {
        return 2 + this.field_569fcf45_Dne.length() * 2;
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_569fcf45_Dne = rXx.method_1ce99840_Dne(dataInputStream, field_2092ae_Dne);
    }

    public rXx(String string, boolean bl) {
        if (string.length() > field_2092ae_Dne) {
            string = string.substring(0, field_2092ae_Dne);
        }
        this.field_569fcf45_Dne = string;
        this.field_2092bf_Dne = bl;
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_ba6e7695_Dne(this);
    }

    public rXx(String string) {
        this(string, true);
    }
}

