package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Klb {
    private static Map field_83b1c1b0_Dne = new HashMap();
    public static HashMap<Object, FMM> field_ecf0af5e_Dne;
    private static Map field_7c692676_aFZ;
    private static Map field_11f0a3b7_Qnq;
    private static Map field_416cb5d_bzF;
    private static Map field_da2182cf_FWm;

    private static void method_5018e96_Dne(Class clazz, String string, int n, int n2, int n3) {
        Klb.method_7d3543b6_Dne(clazz, string, n);
        field_ecf0af5e_Dne.put(n, new FMM(n, n2, n3));
    }

    public static int method_bb7dd813_Dne(sMa sMa2) {
        Class<?> clazz = sMa2.getClass();
        return field_11f0a3b7_Qnq.containsKey(clazz) ? (Integer)field_11f0a3b7_Qnq.get(clazz) : 0;
    }

    public static sMa method_c1d803b3_Dne(String string, Qnq qnq) {
        sMa sMa2 = null;
        try {
            Class clazz = (Class)field_83b1c1b0_Dne.get(string);
            if (clazz != null) {
                sMa2 = (sMa)clazz.getConstructor(Qnq.class).newInstance(qnq);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return sMa2;
    }

    public static sMa method_a401738e_Dne(int n, Qnq qnq) {
        sMa sMa2 = null;
        try {
            Class clazz = Klb.method_27b67c56_Dne(n);
            if (clazz != null) {
                sMa2 = (sMa)clazz.getConstructor(Qnq.class).newInstance(qnq);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (sMa2 == null) {
            qnq.method_230e0120_Dne().method_110c4dc3_FWm("Skipping Entity with id " + n);
        }
        return sMa2;
    }

    private static void method_7d3543b6_Dne(Class clazz, String string, int n) {
        field_83b1c1b0_Dne.put(string, clazz);
        field_da2182cf_FWm.put(clazz, string);
        field_416cb5d_bzF.put(n, clazz);
        field_11f0a3b7_Qnq.put(clazz, n);
        field_7c692676_aFZ.put(string, n);
    }

    public static sMa method_a1f613e0_Dne(WkD wkD, Qnq qnq) {
        sMa sMa2 = null;
        if ("Minecart".equals(wkD.method_39193c_Dne("id"))) {
            switch (wkD.method_8f501fd7_Dne("Type")) {
                case 0: {
                    wkD.method_abaa98ae_Dne("id", "MinecartRideable");
                    break;
                }
                case 1: {
                    wkD.method_abaa98ae_Dne("id", "MinecartChest");
                    break;
                }
                case 2: {
                    wkD.method_abaa98ae_Dne("id", "MinecartFurnace");
                }
            }
            wkD.method_8f501fe4_Dne("Type");
        }
        try {
            Class clazz = (Class)field_83b1c1b0_Dne.get(wkD.method_39193c_Dne("id"));
            if (clazz != null) {
                sMa2 = (sMa)clazz.getConstructor(Qnq.class).newInstance(qnq);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (sMa2 != null) {
            sMa2.method_102200f0_Qnq(wkD);
        } else {
            qnq.method_230e0120_Dne().method_110c4dc3_FWm("Skipping Entity with id " + wkD.method_39193c_Dne("id"));
        }
        return sMa2;
    }

    static {
        field_da2182cf_FWm = new HashMap();
        field_416cb5d_bzF = new HashMap();
        field_11f0a3b7_Qnq = new HashMap();
        field_7c692676_aFZ = new HashMap();
        field_ecf0af5e_Dne = new LinkedHashMap();
        Klb.method_7d3543b6_Dne(JiM.class, "Item", 1);
        Klb.method_7d3543b6_Dne(alg.class, "XPOrb", 2);
        Klb.method_7d3543b6_Dne(JCd.class, "Painting", 9);
        Klb.method_7d3543b6_Dne(hhc.class, "Arrow", 10);
        Klb.method_7d3543b6_Dne(kxx_0.class, "Snowball", 11);
        Klb.method_7d3543b6_Dne(iis.class, "Fireball", 12);
        Klb.method_7d3543b6_Dne(Xzh.class, "SmallFireball", 13);
        Klb.method_7d3543b6_Dne(Hhj.class, "ThrownEnderpearl", 14);
        Klb.method_7d3543b6_Dne(UMP.class, "EyeOfEnderSignal", 15);
        Klb.method_7d3543b6_Dne(YgL.class, "ThrownPotion", 16);
        Klb.method_7d3543b6_Dne(AEw.class, "ThrownExpBottle", 17);
        Klb.method_7d3543b6_Dne(BPY.class, "ItemFrame", 18);
        Klb.method_7d3543b6_Dne(YCH.class, "WitherSkull", 19);
        Klb.method_7d3543b6_Dne(gqg.class, "PrimedTnt", 20);
        Klb.method_7d3543b6_Dne(CiF.class, "FallingSand", 21);
        Klb.method_7d3543b6_Dne(zMx.class, "FireworksRocketEntity", 22);
        Klb.method_7d3543b6_Dne(iMX.class, "Boat", 41);
        Klb.method_7d3543b6_Dne(FdF.class, "MinecartRideable", 42);
        Klb.method_7d3543b6_Dne(bnY.class, "MinecartChest", 43);
        Klb.method_7d3543b6_Dne(tVV.class, "MinecartFurnace", 44);
        Klb.method_7d3543b6_Dne(Art.class, "MinecartTNT", 45);
        Klb.method_7d3543b6_Dne(klq.class, "MinecartHopper", 46);
        Klb.method_7d3543b6_Dne(sry.class, "MinecartSpawner", 47);
        Klb.method_7d3543b6_Dne(FUH.class, "Mob", 48);
        Klb.method_7d3543b6_Dne(LHi.class, "Monster", 49);
        Klb.method_5018e96_Dne(gls.class, "Creeper", 50, 894731, 0);
        Klb.method_5018e96_Dne(yxx_0.class, "Skeleton", 51, 0xC1C1C1, 0x494949);
        Klb.method_5018e96_Dne(osi.class, "Spider", 52, 3419431, 11013646);
        Klb.method_7d3543b6_Dne(ZFJ.class, "Giant", 53);
        Klb.method_5018e96_Dne(zxd.class, "Zombie", 54, 44975, 7969893);
        Klb.method_5018e96_Dne(Tgj.class, "Slime", 55, 5349438, 8306542);
        Klb.method_5018e96_Dne(VAd.class, "Ghast", 56, 0xF9F9F9, 0xBCBCBC);
        Klb.method_5018e96_Dne(eBi.class, "PigZombie", 57, 15373203, 5009705);
        Klb.method_5018e96_Dne(iGp.class, "Enderman", 58, 0x161616, 0);
        Klb.method_5018e96_Dne(PGM.class, "CaveSpider", 59, 803406, 11013646);
        Klb.method_5018e96_Dne(zTy.class, "Silverfish", 60, 0x6E6E6E, 0x303030);
        Klb.method_5018e96_Dne(hlo.class, "Blaze", 61, 16167425, 16775294);
        Klb.method_5018e96_Dne(WDT.class, "LavaSlime", 62, 0x340000, 0xFCFC00);
        Klb.method_7d3543b6_Dne(WSC.class, "EnderDragon", 63);
        Klb.method_7d3543b6_Dne(DhB.class, "WitherBoss", 64);
        Klb.method_5018e96_Dne(oaw.class, "Bat", 65, 4996656, 986895);
        Klb.method_5018e96_Dne(bVr.class, "Witch", 66, 0x340000, 5349438);
        Klb.method_5018e96_Dne(fNv.class, "Pig", 90, 15771042, 14377823);
        Klb.method_5018e96_Dne(Pvd.class, "Sheep", 91, 0xE7E7E7, 0xFFB5B5);
        Klb.method_5018e96_Dne(wBN.class, "Cow", 92, 4470310, 0xA1A1A1);
        Klb.method_5018e96_Dne(GRq.class, "Chicken", 93, 0xA1A1A1, 0xFF0000);
        Klb.method_5018e96_Dne(Xxe.class, "Squid", 94, 2243405, 7375001);
        Klb.method_5018e96_Dne(oEB.class, "Wolf", 95, 0xD7D3D3, 13545366);
        Klb.method_5018e96_Dne(Ahh.class, "MushroomCow", 96, 10489616, 0xB7B7B7);
        Klb.method_7d3543b6_Dne(wao.class, "SnowMan", 97);
        Klb.method_5018e96_Dne(kQo.class, "Ozelot", 98, 15720061, 5653556);
        Klb.method_7d3543b6_Dne(CDE.class, "VillagerGolem", 99);
        Klb.method_5018e96_Dne(pjB.class, "Villager", 120, 5651507, 12422002);
        Klb.method_7d3543b6_Dne(Ndk.class, "EnderCrystal", 200);
        Klb.method_7d3543b6_Dne(fxj_0.class, "ERR422", -1);
    }

    public static String method_2c0e7e17_Dne(int n) {
        Class clazz = Klb.method_27b67c56_Dne(n);
        return clazz != null ? (String)field_da2182cf_FWm.get(clazz) : null;
    }

    public static String method_636080_Dne(sMa sMa2) {
        return (String)field_da2182cf_FWm.get(sMa2.getClass());
    }

    public static Class method_27b67c56_Dne(int n) {
        return (Class)field_416cb5d_bzF.get(n);
    }
}

