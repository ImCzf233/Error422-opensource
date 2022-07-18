package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class hYu {
    private String field_569fcf45_Dne;

    public String method_39193c_Dne(String string) {
        try {
            String string2 = this.field_569fcf45_Dne + string;
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(string2.getBytes(), 0, string2.length());
            return new BigInteger(1, messageDigest.digest()).toString(16);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new RuntimeException(noSuchAlgorithmException);
        }
    }

    public hYu(String string) {
        this.field_569fcf45_Dne = string;
    }
}

