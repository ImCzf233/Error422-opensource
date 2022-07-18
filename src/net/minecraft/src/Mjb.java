package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Security;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class Mjb {
    public static final Charset field_3be27cc9_Dne = Charset.forName("ISO_8859_1");

    public static OutputStream method_d2677927_Dne(SecretKey secretKey, OutputStream outputStream) {
        return new oFT(outputStream, Mjb.method_21a2cf1b_Dne(true, secretKey));
    }

    private static Cipher method_d37fc5c2_Dne(int n, String string, Key key) {
        try {
            Cipher cipher = Cipher.getInstance(string);
            cipher.init(n, key);
            return cipher;
        }
        catch (InvalidKeyException invalidKeyException) {
            invalidKeyException.printStackTrace();
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            noSuchAlgorithmException.printStackTrace();
        }
        catch (NoSuchPaddingException noSuchPaddingException) {
            noSuchPaddingException.printStackTrace();
        }
        System.err.println("Cipher creation failed!");
        return null;
    }

    private static byte[] method_44ddaabb_Dne(int n, Key key, byte[] byArray) {
        try {
            return Mjb.method_d37fc5c2_Dne(n, key.getAlgorithm(), key).doFinal(byArray);
        }
        catch (IllegalBlockSizeException illegalBlockSizeException) {
            illegalBlockSizeException.printStackTrace();
        }
        catch (BadPaddingException badPaddingException) {
            badPaddingException.printStackTrace();
        }
        System.err.println("Cipher data failed!");
        return null;
    }

    static {
        Security.addProvider(new pvQ());
    }

    public static SecretKey method_f4aa2df9_Dne(PrivateKey privateKey, byte[] byArray) {
        return new SecretKeySpec(Mjb.method_fde6614b_FWm(privateKey, byArray), "AES");
    }

    public static InputStream method_e904d0e7_Dne(SecretKey secretKey, InputStream inputStream) {
        return new jfy_0(inputStream, Mjb.method_21a2cf1b_Dne(false, secretKey));
    }

    private static tUA method_21a2cf1b_Dne(boolean bl, Key key) {
        tUA tUA2 = new tUA(new WNU(new pnN(), 8));
        tUA2.method_7b9bc5f9_Dne(bl, new mpe_0(new Sst(key.getEncoded()), key.getEncoded(), 0, 16));
        return tUA2;
    }

    public static byte[] method_fde6614b_FWm(Key key, byte[] byArray) {
        return Mjb.method_44ddaabb_Dne(2, key, byArray);
    }

    public static KeyPair method_7af00974_Dne() {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(1024);
            return keyPairGenerator.generateKeyPair();
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            noSuchAlgorithmException.printStackTrace();
            System.err.println("Key pair generation failed!");
            return null;
        }
    }

    public static PublicKey method_6750507e_Dne(byte[] byArray) {
        try {
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(byArray);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            return keyFactory.generatePublic(x509EncodedKeySpec);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            noSuchAlgorithmException.printStackTrace();
        }
        catch (InvalidKeySpecException invalidKeySpecException) {
            invalidKeySpecException.printStackTrace();
        }
        System.err.println("Public key reconstitute failed!");
        return null;
    }

    public static SecretKey method_e6eb9cf1_Dne() {
        Xow xow = new Xow();
        xow.method_b888fa41_Dne(new quj_0(new SecureRandom(), 128));
        return new SecretKeySpec(xow.method_ce7eeb83_Dne(), "AES");
    }

    public static byte[] method_685dbf5f_Dne(String string, PublicKey publicKey, SecretKey secretKey) {
        try {
            return Mjb.method_7e6cf825_Dne("SHA-1", string.getBytes("ISO_8859_1"), secretKey.getEncoded(), publicKey.getEncoded());
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            unsupportedEncodingException.printStackTrace();
            return null;
        }
    }

    public static byte[] method_33c23aec_Dne(Key key, byte[] byArray) {
        return Mjb.method_44ddaabb_Dne(1, key, byArray);
    }

    private static byte[] method_7e6cf825_Dne(String string, byte[] ... byArray) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(string);
            byte[][] byArray2 = byArray;
            int n = byArray.length;
            for (int i = 0; i < n; ++i) {
                byte[] byArray3 = byArray2[i];
                messageDigest.update(byArray3);
            }
            return messageDigest.digest();
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            noSuchAlgorithmException.printStackTrace();
            return null;
        }
    }
}

