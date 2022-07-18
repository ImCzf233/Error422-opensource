package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class euc {
    private final Properties field_ddac30f7_Dne = new Properties();
    private final File field_d102ba32_Dne;
    private final dLs field_37472c1_Dne;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public euc(File file, dLs dLs2) {
        this.field_d102ba32_Dne = file;
        this.field_37472c1_Dne = dLs2;
        if (file.exists()) {
            FileInputStream fileInputStream = null;
            try {
                fileInputStream = new FileInputStream(file);
                this.field_ddac30f7_Dne.load(fileInputStream);
            }
            catch (Exception exception) {
                dLs2.method_37db6a91_Dne("Failed to load " + file, exception);
                this.method_7a46289a_Dne();
            }
            finally {
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    }
                    catch (IOException iOException) {}
                }
            }
        } else {
            dLs2.method_110c4dc3_FWm(file + " does not exist");
            this.method_7a46289a_Dne();
        }
    }

    public void method_7a46289a_Dne() {
        this.field_37472c1_Dne.method_8f501fe4_Dne("Generating new properties file");
        this.method_7c6f6039_FWm();
    }

    public boolean method_5ab48f74_Dne(String string, boolean bl) {
        try {
            return Boolean.parseBoolean(this.method_603a0db2_Dne(string, "" + bl));
        }
        catch (Exception exception) {
            this.field_ddac30f7_Dne.setProperty(string, "" + bl);
            return bl;
        }
    }

    public File method_9189e6b3_Dne() {
        return this.field_d102ba32_Dne;
    }

    public int method_5ab44f92_Dne(String string, int n) {
        try {
            return Integer.parseInt(this.method_603a0db2_Dne(string, "" + n));
        }
        catch (Exception exception) {
            this.field_ddac30f7_Dne.setProperty(string, "" + n);
            return n;
        }
    }

    public String method_603a0db2_Dne(String string, String string2) {
        if (!this.field_ddac30f7_Dne.containsKey(string)) {
            this.field_ddac30f7_Dne.setProperty(string, string2);
            this.method_7c6f6039_FWm();
        }
        return this.field_ddac30f7_Dne.getProperty(string, string2);
    }

    public void method_7c6f6039_FWm() {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(this.field_d102ba32_Dne);
            this.field_ddac30f7_Dne.store(fileOutputStream, "Minecraft server properties");
        }
        catch (Exception exception) {
            this.field_37472c1_Dne.method_37db6a91_Dne("Failed to save " + this.field_d102ba32_Dne, exception);
            this.method_7a46289a_Dne();
        }
        finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                }
                catch (IOException iOException) {}
            }
        }
    }

    public void method_5e295ec0_Dne(String string, Object object) {
        this.field_ddac30f7_Dne.setProperty(string, "" + object);
    }
}

