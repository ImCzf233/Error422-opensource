package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Hashtable;
import javax.naming.directory.Attributes;
import javax.naming.directory.InitialDirContext;

public class Qyv {
    private final int field_2092ae_Dne;
    private final String field_569fcf45_Dne;

    public int method_7a46288d_Dne() {
        return this.field_2092ae_Dne;
    }

    private static String[] method_7f7542b3_Dne(String string) {
        try {
            Class.forName("com.sun.jndi.dns.DnsContextFactory");
            Hashtable<String, String> hashtable = new Hashtable<String, String>();
            hashtable.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
            hashtable.put("java.naming.provider.url", "dns:");
            hashtable.put("com.sun.jndi.dns.timeout.retries", "1");
            InitialDirContext initialDirContext = new InitialDirContext(hashtable);
            Attributes attributes = initialDirContext.getAttributes("_minecraft._tcp." + string, new String[]{"SRV"});
            String[] stringArray = attributes.get("srv").get().toString().split(" ", 4);
            return new String[]{stringArray[3], stringArray[2]};
        }
        catch (Throwable throwable) {
            return new String[]{string, Integer.toString(25565)};
        }
    }

    private Qyv(String string, int n) {
        this.field_569fcf45_Dne = string;
        this.field_2092ae_Dne = n;
    }

    public static Qyv method_284f49a7_Dne(String var0) {
        if (var0 == null) {
            return null;
        } else {
            String[] var1 = var0.split(":");
            if (var0.startsWith("[")) {
                int var2 = var0.indexOf("]");
                if (var2 > 0) {
                    String var3 = var0.substring(1, var2);
                    String var4 = var0.substring(var2 + 1).trim();
                    if (var4.startsWith(":") && var4.length() > 0) {
                        var4 = var4.substring(1);
                        var1 = new String[]{var3, var4};
                    } else {
                        var1 = new String[]{var3};
                    }
                }
            }

            if (var1.length > 2) {
                var1 = new String[]{var0};
            }

            String var5 = var1[0];
            int var6 = var1.length > 1 ? method_5ab44f92_Dne(var1[1], 25565) : 25565;
            if (var6 == 25565) {
                String[] var7 = method_7f7542b3_Dne(var5);
                var5 = var7[0];
                var6 = method_5ab44f92_Dne(var7[1], 25565);
            }

            return new Qyv(var5, var6);
        }
    }

    private static int method_5ab44f92_Dne(String string, int n) {
        try {
            return Integer.parseInt(string.trim());
        }
        catch (Exception exception) {
            return n;
        }
    }

    public String method_eecad346_Dne() {
        return this.field_569fcf45_Dne;
    }
}

