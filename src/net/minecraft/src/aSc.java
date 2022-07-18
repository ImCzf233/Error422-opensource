package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.TreeMap;

public class aSc {
    private TreeMap<String, iVH> field_36ba99ee_Dne = new TreeMap();

    public String[] method_631ac9e9_Dne() {
        return this.field_36ba99ee_Dne.keySet().toArray(new String[0]);
    }

    public aSc() {
        this.method_abaa98ae_Dne("doFireTick", "true");
        this.method_abaa98ae_Dne("mobGriefing", "true");
        this.method_abaa98ae_Dne("keepInventory", "false");
        this.method_abaa98ae_Dne("doMobSpawning", "true");
        this.method_abaa98ae_Dne("doMobLoot", "true");
        this.method_abaa98ae_Dne("doTileDrops", "true");
        this.method_abaa98ae_Dne("commandBlockOutput", "true");
    }

    public void method_d100accd_FWm(String string, String string2) {
        iVH iVH2 = (iVH)this.field_36ba99ee_Dne.get(string);
        if (iVH2 != null) {
            iVH2.method_8f501fe4_Dne(string2);
        } else {
            this.method_abaa98ae_Dne(string, string2);
        }
    }

    public void method_abaa98ae_Dne(String string, String string2) {
        this.field_36ba99ee_Dne.put(string, new iVH(string2));
    }

    public String method_39193c_Dne(String string) {
        iVH iVH2 = (iVH)this.field_36ba99ee_Dne.get(string);
        return iVH2 != null ? iVH2.method_eecad346_Dne() : "";
    }

    public boolean method_110c4dc7_FWm(String string) {
        return this.field_36ba99ee_Dne.containsKey(string);
    }

    public void method_8d4fb917_Dne(WkD wkD) {
        Collection<oNe> collection = wkD.method_be5f586d_Dne();
        for (oNe oNe2 : collection) {
            String string = oNe2.method_eecad346_Dne();
            String string2 = wkD.method_39193c_Dne(oNe2.method_eecad346_Dne());
            this.method_d100accd_FWm(string, string2);
        }
    }

    public WkD method_230886fb_Dne() {
        WkD wkD = new WkD("GameRules");
        for (Object obj : this.field_36ba99ee_Dne.keySet()) {String string = (String) obj;
            iVH iVH2 = (iVH)this.field_36ba99ee_Dne.get(string);
            wkD.method_abaa98ae_Dne(string, iVH2.method_eecad346_Dne());
        }
        return wkD;
    }

    public boolean method_8f501fe8_Dne(String string) {
        iVH iVH2 = (iVH)this.field_36ba99ee_Dne.get(string);
        return iVH2 != null ? iVH2.method_7a46289e_Dne() : false;
    }
}

