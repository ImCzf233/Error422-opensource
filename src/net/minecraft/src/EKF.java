package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public abstract class EKF {
    protected HttpURLConnection field_6c8af5e4_Dne;
    private boolean field_2092bf_Dne;
    protected String field_569fcf45_Dne;

    public void method_abaa98ae_Dne(String string, String string2) {
        String string3 = this.field_6c8af5e4_Dne.getRequestProperty("Cookie");
        if (string3 == null) {
            this.field_6c8af5e4_Dne.setRequestProperty("Cookie", string + "=" + string2);
        } else {
            this.field_6c8af5e4_Dne.setRequestProperty("Cookie", string3 + ";" + string + "=" + string2);
        }
    }

    public static EKF method_2dc6267f_Dne(String string, String string2) {
        return new lhi_0(string, string2.getBytes(), 5000, 10000);
    }

    protected abstract EKF method_f876308a_FWm();

    public static EKF method_f26d4914_FWm(String string) {
        return new Uzh(string, 5000, 10000);
    }

    public static EKF method_b3e7e43e_FWm(String string, String string2, int n, int n2) {
        return new qKy(string, string2.getBytes(), n, n2);
    }

    private void method_7a46289a_Dne() throws IOException {
        byte[] byArray = new byte[1024];
        try {
            boolean bl = false;
            InputStream inputStream = this.field_6c8af5e4_Dne.getInputStream();
            while (inputStream.read(byArray) > 0) {
            }
            inputStream.close();
        }
        catch (Exception exception) {
            try {
                InputStream inputStream = this.field_6c8af5e4_Dne.getErrorStream();
                boolean bl = false;
                while (inputStream.read(byArray) > 0) {
                }
                inputStream.close();
            }
            catch (IOException iOException) {
                throw iOException;
            }
        }
    }

    public static EKF method_d3a7131e_FWm(String string, String string2) {
        return new qKy(string, string2.getBytes(), 5000, 10000);
    }

    public EKF(String string, int n, int n2) {
        try {
            this.field_569fcf45_Dne = string;
            this.field_6c8af5e4_Dne = (HttpURLConnection)new URL(string).openConnection();
            this.field_6c8af5e4_Dne.setConnectTimeout(n);
            this.field_6c8af5e4_Dne.setReadTimeout(n2);
        }
        catch (Exception exception) {
            throw new HFd("Failed URL: " + string, exception);
        }
    }

    public oct_0 method_2312df8b_Dne() {
        String string = this.field_6c8af5e4_Dne.getHeaderField("Set-Cookie");
        if (string != null) {
            String string2 = string.substring(0, string.indexOf("="));
            String string3 = string.substring(string.indexOf("=") + 1, string.indexOf(";"));
            return oct_0.method_53056900_Dne(Lur.method_8c7671ba_Dne(string2, string3));
        }
        return oct_0.method_2313a433_Dne();
    }

    public int method_7a46288d_Dne() {
        try {
            this.method_22ffe06b_Dne();
            return this.field_6c8af5e4_Dne.getResponseCode();
        }
        catch (Exception exception) {
            throw new HFd("Failed URL: " + this.field_569fcf45_Dne, exception);
        }
    }

    private String method_19032787_Dne(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("input stream cannot be null");
        }
        StringBuilder stringBuilder = new StringBuilder();
        int n = inputStream.read();
        while (n != -1) {
            stringBuilder.append((char)n);
            n = inputStream.read();
        }
        return stringBuilder.toString();
    }

    protected EKF method_22ffe06b_Dne() {
        if (!this.field_2092bf_Dne) {
            EKF eKF = this.method_f876308a_FWm();
            this.field_2092bf_Dne = true;
            return eKF;
        }
        return this;
    }

    public String method_eecad346_Dne() {
        try {
            this.method_22ffe06b_Dne();
            String string = this.method_7a46288d_Dne() >= 400 ? this.method_19032787_Dne(this.field_6c8af5e4_Dne.getErrorStream()) : this.method_19032787_Dne(this.field_6c8af5e4_Dne.getInputStream());
            this.method_7a46289a_Dne();
            return string;
        }
        catch (IOException iOException) {
            throw new HFd("Failed URL: " + this.field_569fcf45_Dne, iOException);
        }
    }

    public static EKF method_28fa35f_Dne(String string, String string2, int n, int n2) {
        return new lhi_0(string, string2.getBytes(), n, n2);
    }

    public static EKF method_284922b5_Dne(String string) {
        return new oGQ(string, 5000, 10000);
    }
}

