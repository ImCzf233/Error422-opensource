package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class JLG {
    public static exS method_7db220c8_Dne(WkD wkD) {
        int n = wkD.method_8f501fd7_Dne("xPos");
        int n2 = wkD.method_8f501fd7_Dne("zPos");
        exS exS2 = new exS(n, n2);
        exS2.field_4039e03_FWm = wkD.method_5ab3dd79_Dne("Blocks");
        exS2.field_75c580ab_bzF = new xXN(wkD.method_5ab3dd79_Dne("Data"), 7);
        exS2.field_20377e9d_FWm = new xXN(wkD.method_5ab3dd79_Dne("SkyLight"), 7);
        exS2.field_37db2be_Dne = new xXN(wkD.method_5ab3dd79_Dne("BlockLight"), 7);
        exS2.field_3f1c582_Dne = wkD.method_5ab3dd79_Dne("HeightMap");
        exS2.field_2092bf_Dne = wkD.method_110c4dc7_FWm("TerrainPopulated");
        exS2.field_378d9a7_Dne = wkD.method_285baa50_Dne("Entities");
        exS2.field_2032a586_FWm = wkD.method_285baa50_Dne("TileEntities");
        exS2.field_75c0a794_bzF = wkD.method_285baa50_Dne("TileTicks");
        try {
            exS2.field_2092af_Dne = wkD.method_8f501fd8_Dne("LastUpdate");
        }
        catch (ClassCastException classCastException) {
            exS2.field_2092af_Dne = wkD.method_8f501fd7_Dne("LastUpdate");
        }
        return exS2;
    }

    public static void method_ce7e6247_Dne(exS exS2, WkD wkD, tgc tgc2) {
        int n;
        int n2;
        wkD.method_5ab44f9f_Dne("xPos", exS2.field_2092ae_Dne);
        wkD.method_5ab44f9f_Dne("zPos", exS2.field_21260d_FWm);
        wkD.method_5ab45360_Dne("LastUpdate", exS2.field_2092af_Dne);
        int[] nArray = new int[exS2.field_3f1c582_Dne.length];
        for (int i = 0; i < exS2.field_3f1c582_Dne.length; ++i) {
            nArray[i] = exS2.field_3f1c582_Dne[i];
        }
        wkD.method_fbde45f2_Dne("HeightMap", nArray);
        wkD.method_5ab48f70_Dne("TerrainPopulated", exS2.field_2092bf_Dne);
        mbZ mbZ2 = new mbZ("Sections");
        for (int i = 0; i < 8; ++i) {
            n2 = 1;
            for (n = 0; n < 16 && n2 != 0; ++n) {
                block3: for (int j = 0; j < 16 && n2 != 0; ++j) {
                    for (int k = 0; k < 16; ++k) {
                        int n3 = n << 11 | k << 7 | j + (i << 4);
                        byte by = exS2.field_4039e03_FWm[n3];
                        if (by == 0) {
                            continue;
                        }
                        n2 = 0;
                        continue block3;
                    }
                }
            }
            if (n2 != 0) continue;
            byte[] byArray = new byte[4096];
            FYZ fYZ = new FYZ(byArray.length, 4);
            FYZ fYZ2 = new FYZ(byArray.length, 4);
            FYZ fYZ3 = new FYZ(byArray.length, 4);
            for (int j = 0; j < 16; ++j) {
                for (int k = 0; k < 16; ++k) {
                    for (int i2 = 0; i2 < 16; ++i2) {
                        int n4 = j << 11 | i2 << 7 | k + (i << 4);
                        byte by = exS2.field_4039e03_FWm[n4];
                        byArray[k << 8 | i2 << 4 | j] = (byte)(by & 0xFF);
                        fYZ.method_5972745a_Dne(j, k, i2, exS2.field_75c580ab_bzF.method_2c2cf7bc_Dne(j, k + (i << 4), i2));
                        fYZ2.method_5972745a_Dne(j, k, i2, exS2.field_20377e9d_FWm.method_2c2cf7bc_Dne(j, k + (i << 4), i2));
                        fYZ3.method_5972745a_Dne(j, k, i2, exS2.field_37db2be_Dne.method_2c2cf7bc_Dne(j, k + (i << 4), i2));
                    }
                }
            }
            WkD wkD2 = new WkD();
            wkD2.method_5ab43558_Dne("Y", (byte)(i & 0xFF));
            wkD2.method_fbde2bab_Dne("Blocks", byArray);
            wkD2.method_fbde2bab_Dne("Data", fYZ.field_3f1c582_Dne);
            wkD2.method_fbde2bab_Dne("SkyLight", fYZ2.field_3f1c582_Dne);
            wkD2.method_fbde2bab_Dne("BlockLight", fYZ3.field_3f1c582_Dne);
            mbZ2.method_b4ba5ea1_Dne(wkD2);
        }
        wkD.method_58996597_Dne("Sections", mbZ2);
        byte[] byArray = new byte[256];
        for (n2 = 0; n2 < 16; ++n2) {
            for (n = 0; n < 16; ++n) {
                byArray[n << 4 | n2] = (byte)(tgc2.method_90477c37_Dne((int)(exS2.field_2092ae_Dne << 4 | n2), (int)(exS2.field_21260d_FWm << 4 | n)).field_267cf5_Qnq & 0xFF);
            }
        }
        wkD.method_fbde2bab_Dne("Biomes", byArray);
        wkD.method_58996597_Dne("Entities", exS2.field_378d9a7_Dne);
        wkD.method_58996597_Dne("TileEntities", exS2.field_2032a586_FWm);
        if (exS2.field_75c0a794_bzF != null) {
            wkD.method_58996597_Dne("TileTicks", exS2.field_75c0a794_bzF);
        }
    }
}

