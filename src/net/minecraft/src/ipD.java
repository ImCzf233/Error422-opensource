package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

public class ipD {
    protected Qnq field_36c4f18_Dne;
    public int field_267cf5_Qnq;
    public int field_2d29f4_aFZ;
    public int field_388da6_zGp;
    public int field_20b857_DyG = -1;
    private static Map field_da2182cf_FWm;
    public zKP field_37e6aed_Dne;
    protected boolean field_21261e_FWm;
    private static Map field_83b1c1b0_Dne;

    static Map method_d410254f_Dne() {
        return field_da2182cf_FWm;
    }

    public double method_2be42992_Dne(double d, double d2, double d3) {
        double d4 = (double)this.field_267cf5_Qnq + 0.5 - d;
        double d5 = (double)this.field_2d29f4_aFZ + 0.5 - d2;
        double d6 = (double)this.field_388da6_zGp + 0.5 - d3;
        return d4 * d4 + d5 * d5 + d6 * d6;
    }

    public void method_582b297_a_() {
        if (this.field_36c4f18_Dne != null) {
            this.field_20b857_DyG = this.field_36c4f18_Dne.method_2dee76f_bzF(this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp);
            this.field_36c4f18_Dne.method_5906e89a_FWm(this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp, this);
            if (this.method_2317f94c_Dne() != null) {
                this.field_36c4f18_Dne.method_6465ff20_aFZ(this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp, this.method_2317f94c_Dne().field_21260d_FWm);
            }
        }
    }

    public static ipD method_7db3d26b_Dne(WkD wkD) {
        ipD ipD2 = null;
        try {
            Class clazz = (Class)field_83b1c1b0_Dne.get(wkD.method_39193c_Dne("id"));
            if (clazz != null) {
                ipD2 = (ipD)clazz.newInstance();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (ipD2 != null) {
            ipD2.method_8d4fb917_Dne(wkD);
        } else {
            jwh_0.method_2302cf90_Dne().method_230e0120_Dne().method_110c4dc3_FWm("Skipping TileEntity with id " + wkD.method_39193c_Dne("id"));
        }
        return ipD2;
    }

    public void method_83516093_Dne(Qnq qnq) {
        this.field_36c4f18_Dne = qnq;
    }

    public double method_582b285_a_() {
        return 4096.0;
    }

    public void method_8d4fb917_Dne(WkD wkD) {
        this.field_267cf5_Qnq = wkD.method_8f501fd7_Dne("x");
        this.field_2d29f4_aFZ = wkD.method_8f501fd7_Dne("y");
        this.field_388da6_zGp = wkD.method_8f501fd7_Dne("z");
    }

    public void method_7e400579_Dne(Noo noo) {
        noo.method_2aeeb7ad_Dne("Name", new WSD(this));
        Noo.method_4b34e06a_Dne(noo, this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp, this.method_2317f94c_Dne().field_21260d_FWm, this.method_d44b4585_zGp());
        noo.method_2aeeb7ad_Dne("Actual block type", new XfI(this));
        noo.method_2aeeb7ad_Dne("Actual block data value", new NTs(this));
    }

    public void method_d44b4592_zGp() {
        this.field_21261e_FWm = true;
    }

    public void method_7ad38803_DyG() {
        this.field_21261e_FWm = false;
    }

    public boolean method_907a9d25_Qnq() {
        return this.field_36c4f18_Dne != null;
    }

    public Qnq method_2305dd77_Dne() {
        return this.field_36c4f18_Dne;
    }

    public boolean method_16cca7e_Dne(int n, int n2) {
        return false;
    }

    public int method_d44b4585_zGp() {
        if (this.field_20b857_DyG == -1) {
            this.field_20b857_DyG = this.field_36c4f18_Dne.method_2dee76f_bzF(this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp);
        }
        return this.field_20b857_DyG;
    }

    public void method_907a9d21_Qnq() {
        this.field_37e6aed_Dne = null;
        this.field_20b857_DyG = -1;
    }

    public boolean method_a98a0664_aFZ() {
        return this.field_21261e_FWm;
    }

    public void method_66a36cd8_FWm(WkD wkD) {
        String string = (String)field_da2182cf_FWm.get(this.getClass());
        if (string == null) {
            throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
        }
        wkD.method_abaa98ae_Dne("id", string);
        wkD.method_5ab44f9f_Dne("x", this.field_267cf5_Qnq);
        wkD.method_5ab44f9f_Dne("y", this.field_2d29f4_aFZ);
        wkD.method_5ab44f9f_Dne("z", this.field_388da6_zGp);
    }

    public void method_7a46289a_Dne() {
    }

    public zKP method_2317f94c_Dne() {
        if (this.field_37e6aed_Dne == null) {
            this.field_37e6aed_Dne = zKP.field_8374b848_Dne[this.field_36c4f18_Dne.method_2c2cf7bc_Dne(this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp)];
        }
        return this.field_37e6aed_Dne;
    }

    private static void method_6f64cced_Dne(Class clazz, String string) {
        if (field_83b1c1b0_Dne.containsKey(string)) {
            throw new IllegalArgumentException("Duplicate id: " + string);
        }
        field_83b1c1b0_Dne.put(string, clazz);
        field_da2182cf_FWm.put(clazz, string);
    }

    public NER method_2303e2b0_Dne() {
        return null;
    }

    static {
        field_83b1c1b0_Dne = new HashMap();
        field_da2182cf_FWm = new HashMap();
        ipD.method_6f64cced_Dne(lqs.class, "Furnace");
        ipD.method_6f64cced_Dne(gon_0.class, "Chest");
        ipD.method_6f64cced_Dne(RPI.class, "EnderChest");
        ipD.method_6f64cced_Dne(nKy.class, "RecordPlayer");
        ipD.method_6f64cced_Dne(UTs.class, "Trap");
        ipD.method_6f64cced_Dne(BDA.class, "Dropper");
        ipD.method_6f64cced_Dne(AjG.class, "Sign");
        ipD.method_6f64cced_Dne(ySb.class, "MobSpawner");
        ipD.method_6f64cced_Dne(lDs.class, "Music");
        ipD.method_6f64cced_Dne(SoB.class, "Piston");
        ipD.method_6f64cced_Dne(zio.class, "Cauldron");
        ipD.method_6f64cced_Dne(llR.class, "EnchantTable");
        ipD.method_6f64cced_Dne(CmX.class, "Airportal");
        ipD.method_6f64cced_Dne(FgE.class, "Control");
        ipD.method_6f64cced_Dne(TpA.class, "Beacon");
        ipD.method_6f64cced_Dne(CUf.class, "Skull");
        ipD.method_6f64cced_Dne(vmD.class, "DLDetector");
        ipD.method_6f64cced_Dne(Aem.class, "Hopper");
        ipD.method_6f64cced_Dne(HFC.class, "Comparator");
    }
}

