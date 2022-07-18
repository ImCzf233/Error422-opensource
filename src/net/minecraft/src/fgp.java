package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class fgp {
    public static String method_d4b13455_Dne(Map map) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Object obj : map.entrySet()) { Map.Entry entry = (Map.Entry) obj;
            if (stringBuilder.length() > 0) {
                stringBuilder.append('&');
            }
            try {
                stringBuilder.append(URLEncoder.encode((String)entry.getKey(), "UTF-8"));
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                unsupportedEncodingException.printStackTrace();
            }
            if (entry.getValue() == null) continue;
            stringBuilder.append('=');
            try {
                stringBuilder.append(URLEncoder.encode(entry.getValue().toString(), "UTF-8"));
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                unsupportedEncodingException.printStackTrace();
            }
        }
        return stringBuilder.toString();
    }

    public static String method_32ca8d76_Dne(dLs dLs2, URL uRL, Map map, boolean bl) {
        return fgp.method_98fc8491_Dne(dLs2, uRL, fgp.method_d4b13455_Dne(map), bl);
    }

    public static String method_c6f78527_Dne(URL uRL) throws IOException {
        String string;
        HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection();
        httpURLConnection.setRequestMethod("GET");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
        StringBuilder stringBuilder = new StringBuilder();
        while ((string = bufferedReader.readLine()) != null) {
            stringBuilder.append(string);
            stringBuilder.append('\r');
        }
        bufferedReader.close();
        return stringBuilder.toString();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int method_7a46288d_Dne() throws IOException {
        int n;
        ServerSocket serverSocket = null;
        boolean bl = true;
        try {
            serverSocket = new ServerSocket(0);
            n = serverSocket.getLocalPort();
        }
        finally {
            try {
                if (serverSocket != null) {
                    serverSocket.close();
                }
            }
            catch (IOException iOException) {}
        }
        return n;
    }

    public static String[] method_b7b2d4df_Dne(dLs dLs2, String string, String string2) {
        String string3;
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("user", string);
        hashMap.put("password", string2);
        hashMap.put("version", 13);
        try {
            string3 = fgp.method_32ca8d76_Dne(dLs2, new URL("http://login.minecraft.net/"), hashMap, false);
        }
        catch (MalformedURLException malformedURLException) {
            malformedURLException.printStackTrace();
            return null;
        }
        if (string3 != null && string3.length() != 0) {
            if (!string3.contains(":")) {
                if (dLs2 == null) {
                    System.out.println("Failed to authenticate: " + string3);
                } else {
                    dLs2.method_110c4dc3_FWm("Failed to authenticae: " + string3);
                }
                return null;
            }
            String[] stringArray = string3.split(":");
            return new String[]{stringArray[2], stringArray[3]};
        }
        if (dLs2 == null) {
            System.out.println("Failed to authenticate: Can't connect to minecraft.net");
        } else {
            dLs2.method_110c4dc3_FWm("Failed to authenticate: Can't connect to minecraft.net");
        }
        return null;
    }

    public static void method_78a7cff_Dne(File file, String string, Ejs ejs, Map map, int n, TaY taY) {
        Thread thread = new Thread(new xSE(taY, string, map, file, ejs, n));
        thread.setDaemon(true);
        thread.start();
    }

    public static String method_98fc8491_Dne(dLs dLs2, URL uRL, String string, boolean bl) {
        try {
            String string2;
            HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty("Content-Length", "" + string.getBytes().length);
            httpURLConnection.setRequestProperty("Content-Language", "en-US");
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.writeBytes(string);
            dataOutputStream.flush();
            dataOutputStream.close();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            StringBuffer stringBuffer = new StringBuffer();
            while ((string2 = bufferedReader.readLine()) != null) {
                stringBuffer.append(string2);
                stringBuffer.append('\r');
            }
            bufferedReader.close();
            return stringBuffer.toString();
        }
        catch (Exception exception) {
            if (!bl) {
                if (dLs2 != null) {
                    dLs2.method_13eaee12_FWm("Could not post to " + uRL, exception);
                } else {
                    Logger.getAnonymousLogger().log(Level.SEVERE, "Could not post to " + uRL, exception);
                }
            }
            return "";
        }
    }
}

