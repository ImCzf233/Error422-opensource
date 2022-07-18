package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.security.PublicKey;

public class GJK
extends NER {
    private PublicKey field_2bf49658_Dne;
    private String field_569fcf45_Dne;
    private byte[] field_3f1c582_Dne = new byte[0];

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_7034561f_Dne(this);
    }

    public PublicKey method_9fe3f37_Dne() {
        return this.field_2bf49658_Dne;
    }

    public GJK() {
    }

    public String method_eecad346_Dne() {
        return this.field_569fcf45_Dne;
    }

    public GJK(String string, PublicKey publicKey, byte[] byArray) {
        this.field_569fcf45_Dne = string;
        this.field_2bf49658_Dne = publicKey;
        this.field_3f1c582_Dne = byArray;
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_569fcf45_Dne = GJK.method_1ce99840_Dne(dataInputStream, 20);
        this.field_2bf49658_Dne = Mjb.method_6750507e_Dne(GJK.method_5599b63a_Dne(dataInputStream));
        this.field_3f1c582_Dne = GJK.method_5599b63a_Dne(dataInputStream);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 2 + this.field_569fcf45_Dne.length() * 2 + 2 + this.field_2bf49658_Dne.getEncoded().length + 2 + this.field_3f1c582_Dne.length;
    }

    public byte[] method_ce7eeb83_Dne() {
        return this.field_3f1c582_Dne;
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        GJK.method_e1033a4c_Dne(this.field_569fcf45_Dne, dataOutputStream);
        GJK.method_91ac7c9_Dne(dataOutputStream, this.field_2bf49658_Dne.getEncoded());
        GJK.method_91ac7c9_Dne(dataOutputStream, this.field_3f1c582_Dne);
    }
}

