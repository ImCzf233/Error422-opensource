package net.minecraft.src;
// Decompiled with: FernFlower
// Class Version: 8
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class FkP {
    private Map field_83b1c1b0_Dne = new HashMap();
    private Map field_da2182cf_FWm = new HashMap();
    private boolean field_2092bf_Dne = false;
    private yJm field_37df650_Dne;

    public int method_831230f1_Dne(RLC var1) {
        Integer var2 = (Integer)this.field_83b1c1b0_Dne.get(var1);
        return var2 == null ? 0 : var2;
    }

    private void method_eca01416_Dne(Map var1, RLC var2, int var3) {
        Integer var4 = (Integer)var1.get(var2);
        int var5 = var4 == null ? 0 : var4;
        var1.put(var2, var5 + var3);
    }

    public void method_5cb0e22c_FWm(Map var1) {
        if (var1 != null) {
            Iterator var2 = var1.keySet().iterator();

            while(var2.hasNext()) {
                RLC var3 = (RLC)var2.next();
                Integer var4 = (Integer)this.field_da2182cf_FWm.get(var3);
                int var5 = var4 == null ? 0 : var4;
                this.field_83b1c1b0_Dne.put(var3, (Integer)var1.get(var3) + var5);
            }
        }

    }

    public boolean method_41b774b5_FWm(auk_0 var1) {
        return var1.field_36522b5_Dne == null || this.method_6863c0f4_Dne(var1.field_36522b5_Dne);
    }

    public void method_139726de_bzF(Map var1) {
        if (var1 != null) {
            this.field_2092bf_Dne = true;
            Iterator var2 = var1.keySet().iterator();

            while(var2.hasNext()) {
                RLC var3 = (RLC)var2.next();
                this.method_eca01416_Dne(this.field_da2182cf_FWm, var3, (Integer)var1.get(var3));
            }
        }

    }

    public boolean method_6863c0f4_Dne(auk_0 var1) {
        return this.field_83b1c1b0_Dne.containsKey(var1);
    }

    public void method_df3461c5_Dne(RLC var1, int var2) {
        this.method_eca01416_Dne(this.field_da2182cf_FWm, var1, var2);
        this.method_eca01416_Dne(this.field_83b1c1b0_Dne, var1, var2);
        this.field_2092bf_Dne = true;
    }

    public static Map method_924a9319_Dne(String var0) {
        HashMap var1 = new HashMap();

        try {
            String var2 = "local";
            StringBuilder var3 = new StringBuilder();
            bab var4 = (new tjH()).method_2856a772_Dne(var0);
            List var5 = var4.method_d26b6110_Dne(new Object[]{"stats-change"});
            Iterator var6 = var5.iterator();

            while(var6.hasNext()) {
                LIC var7 = (LIC)var6.next();
                Map var8 = var7.method_d410254f_Dne();
                Entry var9 = (Entry)var8.entrySet().iterator().next();
                int var10 = Integer.parseInt(((QUo)var9.getKey()).method_eecad346_Dne());
                int var11 = Integer.parseInt(((LIC)var9.getValue()).method_eecad346_Dne());
                RLC var12 = trP.method_9e6fe231_Dne(var10);
                if (var12 == null) {
                    System.out.println(var10 + " is not a valid stat, creating place-holder");
                    var12 = (new oXU(var10)).method_2305cca2_Dne();
                }

                var3.append(trP.method_9e6fe231_Dne(var10).field_569fcf45_Dne).append(",");
                var3.append(var11).append(",");
                var1.put(var12, var11);
            }

            hYu var14 = new hYu(var2);
            String var15 = var14.method_39193c_Dne(var3.toString());
            if (!var15.equals(var4.method_f7f6f529_Dne(new Object[]{"checksum"}))) {
                System.out.println("CHECKSUM MISMATCH");
                return null;
            }
        } catch (pPp var13) {
            var13.printStackTrace();
        }

        return var1;
    }

    public void method_7a46289a_Dne() {
        this.field_37df650_Dne.method_5cb0e22c_FWm(this.method_d410254f_Dne());
    }

    public FkP(vwN var1, File var2) {
        File var3 = new File(var2, "stats");
        if (!var3.exists()) {
            var3.mkdir();
        }

        File[] var4 = var2.listFiles();
        int var5 = var4.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            File var7 = var4[var6];
            if (var7.getName().startsWith("stats_") && var7.getName().endsWith(".dat")) {
                File var8 = new File(var3, var7.getName());
                if (!var8.exists()) {
                    System.out.println("Relocating " + var7.getName());
                    var7.renameTo(var8);
                }
            }
        }

        this.field_37df650_Dne = new yJm(var1, this, var3);
    }

    public void method_a5b62bab_Dne(Map var1) {
        if (var1 != null) {
            this.field_2092bf_Dne = true;
            Iterator var2 = var1.keySet().iterator();

            while(var2.hasNext()) {
                RLC var3 = (RLC)var2.next();
                this.method_eca01416_Dne(this.field_da2182cf_FWm, var3, (Integer)var1.get(var3));
                this.method_eca01416_Dne(this.field_83b1c1b0_Dne, var3, (Integer)var1.get(var3));
            }
        }

    }

    public static String method_ad305469_Dne(String var0, String var1, Map var2) {
        StringBuilder var3 = new StringBuilder();
        StringBuilder var4 = new StringBuilder();
        boolean var5 = true;
        var3.append("{\r\n");
        if (var0 != null && var1 != null) {
            var3.append("  \"user\":{\r\n");
            var3.append("    \"name\":\"").append(var0).append("\",\r\n");
            var3.append("    \"sessionid\":\"").append(var1).append("\"\r\n");
            var3.append("  },\r\n");
        }

        var3.append("  \"stats-change\":[");
        Iterator var6 = var2.keySet().iterator();

        while(var6.hasNext()) {
            RLC var7 = (RLC)var6.next();
            if (var5) {
                var5 = false;
            } else {
                var3.append("},");
            }

            var3.append("\r\n    {\"").append(var7.field_2e5f1b_bzF).append("\":").append(var2.get(var7));
            var4.append(var7.field_569fcf45_Dne).append(",");
            var4.append(var2.get(var7)).append(",");
        }

        if (!var5) {
            var3.append("}");
        }

        hYu var8 = new hYu(var1);
        var3.append("\r\n  ],\r\n");
        var3.append("  \"checksum\":\"").append(var8.method_39193c_Dne(var4.toString())).append("\"\r\n");
        var3.append("}");
        return var3.toString();
    }

    public Map method_d410254f_Dne() {
        return new HashMap(this.field_da2182cf_FWm);
    }

    public void method_7c6f6039_FWm() {
        if (this.field_2092bf_Dne && this.field_37df650_Dne.method_7a46289e_Dne()) {
            this.field_37df650_Dne.method_a5b62bab_Dne(this.method_d410254f_Dne());
        }

        this.field_37df650_Dne.method_7c6f6039_FWm();
    }
}
 
