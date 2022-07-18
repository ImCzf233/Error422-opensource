package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class xoY {
    private int field_21260d_FWm;
    private boolean field_388db7_zGp;
    private long field_2d29f5_aFZ;
    private kGO field_3778a39_Dne = kGO.field_3778a39_Dne;
    private WkD field_36ef89c_Dne;
    private long field_21260e_FWm;
    private int field_2d29f4_aFZ;
    private int field_388da6_zGp;
    private aSc field_3732dfb_Dne = new aSc();
    private String field_d9a85c6_FWm;
    private long field_2092af_Dne;
    private int field_2e5f1b_bzF;
    private XHL field_36eea90_Dne;
    private boolean field_2092bf_Dne;
    private int field_20b857_DyG;
    private long field_267cf6_Qnq;
    private int field_2092ae_Dne;
    private boolean field_21261e_FWm;
    private long field_2e5f1c_bzF;
    private boolean field_2d2a05_aFZ;
    private int field_267cf5_Qnq;
    private String field_569fcf45_Dne = "";
    private boolean field_2e5f2c_bzF;
    private boolean field_267d06_Qnq;

    static int method_e504698f_DyG(xoY xoY2) {
        return xoY2.field_20b857_DyG;
    }

    public void method_ce7f5da9_Dne(int n) {
        this.field_2092ae_Dne = n;
    }

    public WkD method_f87ed71a_FWm() {
        return this.field_36ef89c_Dne;
    }

    public boolean method_ae128dcb_bzF() {
        return this.field_2e5f2c_bzF;
    }

    public int method_a98a0653_aFZ() {
        return this.field_2d29f4_aFZ;
    }

    public String method_eecad346_Dne() {
        return this.field_d9a85c6_FWm;
    }

    public boolean method_a98a0664_aFZ() {
        return this.field_2d2a05_aFZ;
    }

    public WkD method_230886fb_Dne() {
        WkD wkD = new WkD();
        this.method_870deeba_Dne(wkD, this.field_36ef89c_Dne);
        return wkD;
    }

    public int method_907a9d14_Qnq() {
        return this.field_267cf5_Qnq;
    }

    public kGO method_23111898_Dne() {
        return this.field_3778a39_Dne;
    }

    public void method_ad7a5774_Dne(kGO kGO2) {
        this.field_3778a39_Dne = kGO2;
    }

    public void method_2c2cf7c9_Dne(int n, int n2, int n3) {
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_2e5f1b_bzF = n3;
    }

    public int method_ae128dba_bzF() {
        return this.field_2e5f1b_bzF;
    }

    public void method_143fdded_bzF(boolean bl) {
        this.field_388db7_zGp = bl;
    }

    static boolean method_9f35432a_FWm(xoY xoY2) {
        return xoY2.field_2092bf_Dne;
    }

    public long method_ae128dbb_bzF() {
        return this.field_2e5f1c_bzF;
    }

    static boolean method_48b3d742_Qnq(xoY xoY2) {
        return xoY2.field_267d06_Qnq;
    }

    public void method_7ed97a02_Qnq(int n) {
        this.field_2d29f4_aFZ = n;
    }

    static int method_55dfcd60_zGp(xoY xoY2) {
        return xoY2.field_388da6_zGp;
    }

    protected xoY() {
    }

    public xoY(xoY xoY2) {
        this.field_2092af_Dne = xoY2.field_2092af_Dne;
        this.field_3778a39_Dne = xoY2.field_3778a39_Dne;
        this.field_569fcf45_Dne = xoY2.field_569fcf45_Dne;
        this.field_36eea90_Dne = xoY2.field_36eea90_Dne;
        this.field_2e5f2c_bzF = xoY2.field_2e5f2c_bzF;
        this.field_2092ae_Dne = xoY2.field_2092ae_Dne;
        this.field_21260d_FWm = xoY2.field_21260d_FWm;
        this.field_2e5f1b_bzF = xoY2.field_2e5f1b_bzF;
        this.field_21260e_FWm = xoY2.field_21260e_FWm;
        this.field_2e5f1c_bzF = xoY2.field_2e5f1c_bzF;
        this.field_267cf6_Qnq = xoY2.field_267cf6_Qnq;
        this.field_2d29f5_aFZ = xoY2.field_2d29f5_aFZ;
        this.field_36ef89c_Dne = xoY2.field_36ef89c_Dne;
        this.field_267cf5_Qnq = xoY2.field_267cf5_Qnq;
        this.field_d9a85c6_FWm = xoY2.field_d9a85c6_FWm;
        this.field_2d29f4_aFZ = xoY2.field_2d29f4_aFZ;
        this.field_388da6_zGp = xoY2.field_388da6_zGp;
        this.field_2092bf_Dne = xoY2.field_2092bf_Dne;
        this.field_20b857_DyG = xoY2.field_20b857_DyG;
        this.field_21261e_FWm = xoY2.field_21261e_FWm;
        this.field_267d06_Qnq = xoY2.field_267d06_Qnq;
        this.field_2d2a05_aFZ = xoY2.field_2d2a05_aFZ;
        this.field_388db7_zGp = xoY2.field_388db7_zGp;
        this.field_3732dfb_Dne = xoY2.field_3732dfb_Dne;
    }

    public xoY(WkD wkD) {
        this.field_2092af_Dne = wkD.method_8f501fd8_Dne("RandomSeed");
        if (wkD.method_8f501fe8_Dne("generatorName")) {
            String string = wkD.method_39193c_Dne("generatorName");
            this.field_3778a39_Dne = kGO.method_285a5ae2_Dne(string);
            if (this.field_3778a39_Dne == null) {
                this.field_3778a39_Dne = kGO.field_3778a39_Dne;
            } else if (this.field_3778a39_Dne.method_7c6f603d_FWm()) {
                int n = 0;
                if (wkD.method_8f501fe8_Dne("generatorVersion")) {
                    n = wkD.method_8f501fd7_Dne("generatorVersion");
                }
                this.field_3778a39_Dne = this.field_3778a39_Dne.method_9e7b2e27_Dne(n);
            }
            if (wkD.method_8f501fe8_Dne("generatorOptions")) {
                this.field_569fcf45_Dne = wkD.method_39193c_Dne("generatorOptions");
            }
        }
        this.field_36eea90_Dne = XHL.method_9e728e7e_Dne(wkD.method_8f501fd7_Dne("GameType"));
        this.field_2e5f2c_bzF = wkD.method_8f501fe8_Dne("MapFeatures") ? wkD.method_110c4dc7_FWm("MapFeatures") : true;
        this.field_2092ae_Dne = wkD.method_8f501fd7_Dne("SpawnX");
        this.field_21260d_FWm = wkD.method_8f501fd7_Dne("SpawnY");
        this.field_2e5f1b_bzF = wkD.method_8f501fd7_Dne("SpawnZ");
        this.field_21260e_FWm = wkD.method_8f501fd8_Dne("Time");
        this.field_2e5f1c_bzF = wkD.method_8f501fe8_Dne("DayTime") ? wkD.method_8f501fd8_Dne("DayTime") : this.field_21260e_FWm;
        this.field_267cf6_Qnq = wkD.method_8f501fd8_Dne("LastPlayed");
        this.field_2d29f5_aFZ = wkD.method_8f501fd8_Dne("SizeOnDisk");
        this.field_d9a85c6_FWm = wkD.method_39193c_Dne("LevelName");
        this.field_2d29f4_aFZ = wkD.method_8f501fd7_Dne("version");
        this.field_388da6_zGp = wkD.method_8f501fd7_Dne("rainTime");
        this.field_2092bf_Dne = wkD.method_110c4dc7_FWm("raining");
        this.field_20b857_DyG = wkD.method_8f501fd7_Dne("thunderTime");
        this.field_21261e_FWm = wkD.method_110c4dc7_FWm("thundering");
        this.field_267d06_Qnq = wkD.method_110c4dc7_FWm("hardcore");
        this.field_388db7_zGp = wkD.method_8f501fe8_Dne("initialized") ? wkD.method_110c4dc7_FWm("initialized") : true;
        if (wkD.method_8f501fe8_Dne("allowCommands")) {
            this.field_2d2a05_aFZ = wkD.method_110c4dc7_FWm("allowCommands");
        } else {
            boolean bl = this.field_2d2a05_aFZ = this.field_36eea90_Dne == XHL.field_75b6b87d_bzF;
        }
        if (wkD.method_8f501fe8_Dne("Player")) {
            this.field_36ef89c_Dne = wkD.method_2851c945_Dne("Player");
            this.field_267cf5_Qnq = this.field_36ef89c_Dne.method_8f501fd7_Dne("Dimension");
        }
        if (wkD.method_8f501fe8_Dne("GameRules")) {
            this.field_3732dfb_Dne.method_8d4fb917_Dne(wkD.method_2851c945_Dne("GameRules"));
        }
    }

    static int method_b7d65e4b_bzF(xoY xoY2) {
        return xoY2.field_2e5f1b_bzF;
    }

    public boolean method_7c6f603d_FWm() {
        return this.field_2092bf_Dne;
    }

    public void method_117d19ea_FWm(int n) {
        this.field_21260d_FWm = n;
    }

    public int method_7ad387f6_DyG() {
        return this.field_388da6_zGp;
    }

    static boolean method_195f5d63_aFZ(xoY xoY2) {
        return xoY2.field_2d2a05_aFZ;
    }

    public int method_d44b4585_zGp() {
        return this.field_20b857_DyG;
    }

    static boolean method_c5e18f69_Dne(xoY xoY2) {
        return xoY2.field_2e5f2c_bzF;
    }

    public void method_ce7f9d7a_Dne(boolean bl) {
        this.field_21261e_FWm = bl;
    }

    static long method_9f35431a_FWm(xoY xoY2) {
        return xoY2.field_2e5f1c_bzF;
    }

    static String method_ec567bdb_Dne(xoY xoY2) {
        return xoY2.field_569fcf45_Dne;
    }

    public aSc method_230cbc5a_Dne() {
        return this.field_3732dfb_Dne;
    }

    public int method_7c6f602c_FWm() {
        return this.field_21260d_FWm;
    }

    public XHL method_230878ef_Dne() {
        return this.field_36eea90_Dne;
    }

    static long method_c5e18f59_Dne(xoY xoY2) {
        return xoY2.field_21260e_FWm;
    }

    public long method_907a9d15_Qnq() {
        return this.field_2d29f5_aFZ;
    }

    public boolean method_907a9d25_Qnq() {
        return this.field_267d06_Qnq;
    }

    public int method_7a46288d_Dne() {
        return this.field_2092ae_Dne;
    }

    public void method_b51ddfb1_zGp(int n) {
        this.field_388da6_zGp = n;
    }

    static int method_9f354319_FWm(xoY xoY2) {
        return xoY2.field_21260d_FWm;
    }

    public void method_7e400579_Dne(Noo noo) {
        noo.method_2aeeb7ad_Dne("Level seed", new MFa(this));
        noo.method_2aeeb7ad_Dne("Level generator", new DXs(this));
        noo.method_2aeeb7ad_Dne("Level generator options", new mAp(this));
        noo.method_2aeeb7ad_Dne("Level spawn location", new sSx(this));
        noo.method_2aeeb7ad_Dne("Level time", new OKy(this));
        noo.method_2aeeb7ad_Dne("Level dimension", new wdk(this));
        noo.method_2aeeb7ad_Dne("Level storage version", new mtR(this));
        noo.method_2aeeb7ad_Dne("Level weather", new isf(this));
        noo.method_2aeeb7ad_Dne("Level game mode", new tYR(this));
    }

    public void method_117d59bb_FWm(boolean bl) {
        this.field_2092bf_Dne = bl;
    }

    public void method_8f501fe4_Dne(String string) {
        this.field_d9a85c6_FWm = string;
    }

    public long method_7a46288e_Dne() {
        return this.field_2092af_Dne;
    }

    public boolean method_d44b4596_zGp() {
        return this.field_388db7_zGp;
    }

    private void method_870deeba_Dne(WkD wkD, WkD wkD2) {
        wkD.method_5ab45360_Dne("RandomSeed", this.field_2092af_Dne);
        wkD.method_abaa98ae_Dne("generatorName", this.field_3778a39_Dne.method_eecad346_Dne());
        wkD.method_5ab44f9f_Dne("generatorVersion", this.field_3778a39_Dne.method_7a46288d_Dne());
        wkD.method_abaa98ae_Dne("generatorOptions", this.field_569fcf45_Dne);
        wkD.method_5ab44f9f_Dne("GameType", this.field_36eea90_Dne.method_7a46288d_Dne());
        wkD.method_5ab48f70_Dne("MapFeatures", this.field_2e5f2c_bzF);
        wkD.method_5ab44f9f_Dne("SpawnX", this.field_2092ae_Dne);
        wkD.method_5ab44f9f_Dne("SpawnY", this.field_21260d_FWm);
        wkD.method_5ab44f9f_Dne("SpawnZ", this.field_2e5f1b_bzF);
        wkD.method_5ab45360_Dne("Time", this.field_21260e_FWm);
        wkD.method_5ab45360_Dne("DayTime", this.field_2e5f1c_bzF);
        wkD.method_5ab45360_Dne("SizeOnDisk", this.field_2d29f5_aFZ);
        wkD.method_5ab45360_Dne("LastPlayed", System.currentTimeMillis());
        wkD.method_abaa98ae_Dne("LevelName", this.field_d9a85c6_FWm);
        wkD.method_5ab44f9f_Dne("version", this.field_2d29f4_aFZ);
        wkD.method_5ab44f9f_Dne("rainTime", this.field_388da6_zGp);
        wkD.method_5ab48f70_Dne("raining", this.field_2092bf_Dne);
        wkD.method_5ab44f9f_Dne("thunderTime", this.field_20b857_DyG);
        wkD.method_5ab48f70_Dne("thundering", this.field_21261e_FWm);
        wkD.method_5ab48f70_Dne("hardcore", this.field_267d06_Qnq);
        wkD.method_5ab48f70_Dne("allowCommands", this.field_2d2a05_aFZ);
        wkD.method_5ab48f70_Dne("initialized", this.field_388db7_zGp);
        wkD.method_312ec00d_Dne("GameRules", this.field_3732dfb_Dne.method_230886fb_Dne());
        if (wkD2 != null) {
            wkD.method_312ec00d_Dne("Player", wkD2);
        }
    }

    static int method_c5e18f58_Dne(xoY xoY2) {
        return xoY2.field_2092ae_Dne;
    }

    public xoY(mrb mrb2, String string) {
        this.field_2092af_Dne = mrb2.method_7a46288e_Dne();
        this.field_36eea90_Dne = mrb2.method_230878ef_Dne();
        this.field_2e5f2c_bzF = mrb2.method_ae128dcb_bzF();
        this.field_d9a85c6_FWm = string;
        this.field_267d06_Qnq = mrb2.method_7c6f603d_FWm();
        this.field_3778a39_Dne = mrb2.method_23111898_Dne();
        this.field_569fcf45_Dne = mrb2.method_eecad346_Dne();
        this.field_2d2a05_aFZ = mrb2.method_907a9d25_Qnq();
        this.field_388db7_zGp = false;
    }

    public void method_8d1afe0b_Dne(XHL xHL) {
        this.field_36eea90_Dne = xHL;
    }

    public long method_7c6f602d_FWm() {
        return this.field_21260e_FWm;
    }

    public void method_ce7f616a_Dne(long l) {
        this.field_21260e_FWm = l;
    }

    static XHL method_d1ad823a_Dne(xoY xoY2) {
        return xoY2.field_36eea90_Dne;
    }

    public long method_a98a0654_aFZ() {
        return this.field_267cf6_Qnq;
    }

    static kGO method_d1b621e3_Dne(xoY xoY2) {
        return xoY2.field_3778a39_Dne;
    }

    public String method_d1f1ed87_FWm() {
        return this.field_569fcf45_Dne;
    }

    public boolean method_7a46289e_Dne() {
        return this.field_21261e_FWm;
    }

    public WkD method_7dab90f8_Dne(WkD wkD) {
        WkD wkD2 = new WkD();
        this.method_870deeba_Dne(wkD2, wkD);
        return wkD2;
    }

    static boolean method_b7d65e5c_bzF(xoY xoY2) {
        return xoY2.field_21261e_FWm;
    }

    public void method_117d1dab_FWm(long l) {
        this.field_2e5f1c_bzF = l;
    }

    static int method_48b3d731_Qnq(xoY xoY2) {
        return xoY2.field_267cf5_Qnq;
    }

    public void method_87b738a3_aFZ(int n) {
        this.field_20b857_DyG = n;
    }

    public void method_143f9e1c_bzF(int n) {
        this.field_2e5f1b_bzF = n;
    }

    static int method_195f5d52_aFZ(xoY xoY2) {
        return xoY2.field_2d29f4_aFZ;
    }
}

