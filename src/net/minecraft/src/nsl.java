package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.SecretKey;

public class nsl
extends NER {
    private SecretKey field_8d2d5db0_Dne;
    private byte[] field_4039e03_FWm;
    private byte[] field_3f1c582_Dne = new byte[0];

    public SecretKey method_e6eb9cf1_Dne() {
        return this.method_645503e0_Dne(null);
    }

    public nsl(SecretKey secretKey, PublicKey publicKey, byte[] byArray) {
        this.field_4039e03_FWm = new byte[0];
        this.field_8d2d5db0_Dne = secretKey;
        this.field_3f1c582_Dne = Mjb.method_33c23aec_Dne(publicKey, secretKey.getEncoded());
        this.field_4039e03_FWm = Mjb.method_33c23aec_Dne(publicKey, byArray);
    }

    public byte[] method_b8d82fb2_Dne(PrivateKey privateKey) {
        return privateKey == null ? this.field_4039e03_FWm : Mjb.method_fde6614b_FWm(privateKey, this.field_4039e03_FWm);
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_b5121a40_Dne(this);
    }

    public nsl() {
        this.field_4039e03_FWm = new byte[0];
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_3f1c582_Dne = nsl.method_5599b63a_Dne(dataInputStream);
        this.field_4039e03_FWm = nsl.method_5599b63a_Dne(dataInputStream);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 2 + this.field_3f1c582_Dne.length + 2 + this.field_4039e03_FWm.length;
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        nsl.method_91ac7c9_Dne(dataOutputStream, this.field_3f1c582_Dne);
        nsl.method_91ac7c9_Dne(dataOutputStream, this.field_4039e03_FWm);
    }

    public SecretKey method_645503e0_Dne(PrivateKey privateKey) {
        return privateKey == null ? this.field_8d2d5db0_Dne : (this.field_8d2d5db0_Dne = Mjb.method_f4aa2df9_Dne(privateKey, this.field_3f1c582_Dne));
    }
}

