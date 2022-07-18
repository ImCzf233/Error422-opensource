package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class zBn {
    private float field_2092ab_Dne = 0.3f;
    public static zBn field_7508dfa4_mrb;
    public static zBn field_142722f0_div;
    public static zBn field_75c61ab3_bzF;
    private boolean field_267d06_Qnq;
    private boolean field_2e5f2c_bzF;
    public static zBn field_5e67bb8d_Qnq;
    public static zBn field_5ceb61a_IjH;
    public static zBn field_203818a5_FWm;
    private boolean field_2092bf_Dne = false;
    private boolean field_21261e_FWm = false;
    public static zBn field_a22e7e2e_kGO;
    private boolean field_2d2a05_aFZ;
    public static zBn field_617800ee_Zpi;
    public static zBn field_37e4cc6_Dne;
    public String field_569fcf45_Dne;
    public static zBn field_7141d10c_aFZ;
    private boolean field_388db7_zGp = false;
    private boolean field_20b868_DyG = false;
    public static zBn field_163175ef_DyG;
    public static zBn field_1c3fdb05_XHL;
    public static zBn field_f0b00bbe_zGp;
    public static zBn field_af0ef541_udO;

    protected zBn method_2e0b65eb_aFZ() {
        this.field_2e5f2c_bzF = true;
        return this;
    }

    public static zBn method_19bd6ce0_Dne(Tdr tdr, sMa sMa2) {
        return sMa2 == null ? new CpP("onFire", tdr, tdr).method_2e0b65eb_aFZ().method_2317db25_Dne() : new CpP("fireball", tdr, sMa2).method_2e0b65eb_aFZ().method_2317db25_Dne();
    }

    public float method_7a46288a_Dne() {
        return this.field_2092ab_Dne;
    }

    public boolean method_7c6f603d_FWm() {
        return this.field_20b868_DyG;
    }

    public boolean method_ae128dcb_bzF() {
        return this.field_2092bf_Dne;
    }

    public String method_eecad346_Dne() {
        return this.field_569fcf45_Dne;
    }

    public sMa method_f88b2463_FWm() {
        return null;
    }

    public boolean method_7a46289e_Dne() {
        return this.field_267d06_Qnq;
    }

    public static zBn method_267d8b79_Dne(FUH fUH) {
        return new Kgw("mob", fUH);
    }

    protected zBn method_6960b42c_Qnq() {
        this.field_21261e_FWm = true;
        return this;
    }

    static {
        field_37e4cc6_Dne = new zBn("inFire").method_2e0b65eb_aFZ();
        field_203818a5_FWm = new zBn("onFire").method_22a3e1d2_bzF().method_2e0b65eb_aFZ();
        field_75c61ab3_bzF = new zBn("lava").method_2e0b65eb_aFZ();
        field_5e67bb8d_Qnq = new zBn("inWall").method_22a3e1d2_bzF();
        field_7141d10c_aFZ = new zBn("drown").method_22a3e1d2_bzF();
        field_f0b00bbe_zGp = new zBn("starve").method_22a3e1d2_bzF();
        field_163175ef_DyG = new zBn("cactus");
        field_142722f0_div = new zBn("fall").method_22a3e1d2_bzF();
        field_5ceb61a_IjH = new zBn("outOfWorld").method_22a3e1d2_bzF().method_6960b42c_Qnq();
        field_7508dfa4_mrb = new zBn("generic").method_22a3e1d2_bzF();
        field_1c3fdb05_XHL = new zBn("magic").method_22a3e1d2_bzF().method_55a55e0e_DyG();
        field_617800ee_Zpi = new zBn("wither").method_22a3e1d2_bzF();
        field_a22e7e2e_kGO = new zBn("anvil");
        field_af0ef541_udO = new zBn("fallingBlock");
    }

    public static zBn method_9a4057ab_Dne(sMa sMa2) {
        return new Kgw("thorns", sMa2).method_55a55e0e_DyG();
    }

    public String method_eee94b72_Dne(FUH fUH) {
        FUH fUH2 = fUH.method_69495399_Qnq();
        String string = "death.attack." + this.field_569fcf45_Dne;
        String string2 = string + ".player";
        return fUH2 != null && KGL.method_8f501fe8_Dne(string2) ? KGL.method_98148f73_Dne(string2, fUH.method_c6f17a40_aFZ(), fUH2.method_c6f17a40_aFZ()) : KGL.method_98148f73_Dne(string, fUH.method_c6f17a40_aFZ());
    }

    protected zBn method_22a3e1d2_bzF() {
        this.field_2092bf_Dne = true;
        this.field_2092ab_Dne = 0.0f;
        return this;
    }

    public boolean method_a98a0664_aFZ() {
        return this.field_2e5f2c_bzF;
    }

    public static zBn method_5332b444_FWm(sMa sMa2, sMa sMa3) {
        return new CpP("indirectMagic", sMa2, sMa3).method_22a3e1d2_bzF().method_55a55e0e_DyG();
    }

    public boolean method_7ad38807_DyG() {
        return this.field_388db7_zGp;
    }

    public static zBn method_4ba6665b_Dne(yTR yTR2) {
        return yTR2 != null && yTR2.method_23007a92_Dne() != null ? new Kgw("explosion.player", yTR2.method_23007a92_Dne()).method_8ad5bc1d_zGp().method_f88e2b44_FWm() : new zBn("explosion").method_8ad5bc1d_zGp().method_f88e2b44_FWm();
    }

    public boolean method_d44b4596_zGp() {
        return this.field_2d2a05_aFZ;
    }

    protected zBn(String string) {
        this.field_569fcf45_Dne = string;
    }

    public static zBn method_acab7ee1_Dne(hhc hhc2, sMa sMa2) {
        return new CpP("arrow", hhc2, sMa2).method_2317db25_Dne();
    }

    public zBn method_2317db25_Dne() {
        this.field_267d06_Qnq = true;
        return this;
    }

    public zBn method_55a55e0e_DyG() {
        this.field_388db7_zGp = true;
        return this;
    }

    public zBn method_f88e2b44_FWm() {
        this.field_20b868_DyG = true;
        return this;
    }

    public static zBn method_53f50aae_Dne(FiG fiG) {
        return new Kgw("player", fiG);
    }

    public sMa method_2314d444_Dne() {
        return this.method_f88b2463_FWm();
    }

    public zBn method_8ad5bc1d_zGp() {
        this.field_2d2a05_aFZ = true;
        return this;
    }

    public boolean method_907a9d25_Qnq() {
        return this.field_21261e_FWm;
    }

    public static zBn method_d9aebee5_Dne(sMa sMa2, sMa sMa3) {
        return new CpP("thrown", sMa2, sMa3).method_2317db25_Dne();
    }
}

