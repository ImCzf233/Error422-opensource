package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class VVx {
    public static void method_eee5c69f_Dne(WkD wkD, DataOutput dataOutput) throws IOException {
        oNe.method_9e004329_Dne(wkD, dataOutput);
    }

    public static WkD method_cf3ca772_Dne(File file) throws FileNotFoundException, IOException {
        WkD wkD;
        if (!file.exists()) {
            return null;
        }
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));){
            wkD = VVx.method_cd26dcc4_Dne(dataInputStream);
        }
        return wkD;
    }

    public static void method_b3febbc9_Dne(WkD wkD, OutputStream outputStream) throws IOException {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new GZIPOutputStream(outputStream));){
            VVx.method_eee5c69f_Dne(wkD, dataOutputStream);
        }
    }

    public static void method_4f8d1c4f_FWm(WkD wkD, File file) throws FileNotFoundException, IOException {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));){
            VVx.method_eee5c69f_Dne(wkD, dataOutputStream);
        }
    }

    public static void method_99c38e4e_Dne(WkD wkD, File file) throws FileNotFoundException, IOException {
        File file2 = new File(file.getAbsolutePath() + "_tmp");
        if (file2.exists()) {
            file2.delete();
        }
        VVx.method_4f8d1c4f_FWm(wkD, file2);
        if (file.exists()) {
            file.delete();
        }
        if (file.exists()) {
            throw new IOException("Failed to delete " + file);
        }
        file2.renameTo(file);
    }

    public static byte[] method_1ca76aa6_Dne(WkD wkD) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (DataOutputStream dataOutputStream = new DataOutputStream(new GZIPOutputStream(byteArrayOutputStream));){
            VVx.method_eee5c69f_Dne(wkD, dataOutputStream);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static WkD method_cd26dcc4_Dne(DataInput dataInput) throws IOException {
        oNe oNe2 = oNe.method_cd315cce_Dne(dataInput);
        if (oNe2 instanceof WkD) {
            return (WkD)oNe2;
        }
        throw new IOException("Root tag must be a named compound tag");
    }

    public static WkD method_2bf75d1a_Dne(InputStream inputStream) throws IOException {
        WkD wkD;
        try (DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new GZIPInputStream(inputStream)));){
            wkD = VVx.method_cd26dcc4_Dne(dataInputStream);
        }
        return wkD;
    }

    public static WkD method_6bd4c1c2_Dne(byte[] byArray) throws IOException {
        WkD wkD;
        try (DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new GZIPInputStream(new ByteArrayInputStream(byArray))));){
            wkD = VVx.method_cd26dcc4_Dne(dataInputStream);
        }
        return wkD;
    }
}

