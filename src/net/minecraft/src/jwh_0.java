package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.net.UnknownHostException;
import java.security.KeyPair;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * Renamed from Jwh
 */
public abstract class jwh_0
implements hur,
gnI,
Runnable {
    private int field_2e5f1b_bzF = 0;
    private long field_2d29f5_aFZ;
    private boolean field_20b868_DyG;
    private int field_21260d_FWm = -1;
    private String field_d9a85c6_FWm;
    private String field_8b8e234d_zGp;
    private boolean field_21261e_FWm = false;
    private boolean field_2e5f2c_bzF;
    public final long[] field_59d86bd_bzF;
    private boolean field_2092bf_Dne = true;
    private dzN field_3751af4_Dne;
    private boolean field_33449d_mrb;
    public int field_2092ae_Dne;
    private final FWm field_366f830_Dne;
    private boolean field_2a9ae7_Zpi;
    public RAN[] field_836263a8_Dne;
    private String field_c480ca78_bzF;
    private final YiY field_36fdc63_Dne;
    private boolean field_22c613_IjH;
    public final Bkx field_365731d_Dne;
    private boolean field_267d06_Qnq;
    public final long[] field_4a92423_Qnq;
    private final List field_f27c122c_Dne;
    private int field_267cf5_Qnq;
    private String field_bc57ecbf_aFZ;
    private boolean field_31b827_kGO = false;
    private final evf field_3758337_Dne = new evf("server", this);
    private long field_2092af_Dne;
    private final File field_d102ba32_Dne;
    private long field_267cf6_Qnq;
    private boolean field_2f0de9_div;
    private boolean field_388db7_zGp;
    private long field_21260e_FWm;
    private long field_2e5f1c_bzF;
    private boolean field_29187e_XHL = false;
    public final long[] field_4039e0b_FWm;
    private KeyPair field_db23b4d5_Dne;
    public String field_569fcf45_Dne;
    public final long[] field_5781704_aFZ;
    private String field_be5cd5b_div;
    private String field_9e60dbde_Qnq;
    private boolean field_2d2a05_aFZ;
    private static jwh_0 field_3694131_Dne = null;
    private String field_309c90bc_DyG = "";
    public long[][] field_7a46ee0f_Dne;
    public final long[] field_3f1c58a_Dne;

    public KeyPair method_7af00974_Dne() {
        return this.field_db23b4d5_Dne;
    }

    public void method_ae128dc7_bzF() {
        this.field_2092bf_Dne = false;
    }

    public jwh_0(File file) {
        this.field_f27c122c_Dne = new ArrayList();
        this.field_365731d_Dne = new Bkx();
        this.field_3f1c58a_Dne = new long[100];
        this.field_4039e0b_FWm = new long[100];
        this.field_59d86bd_bzF = new long[100];
        this.field_4a92423_Qnq = new long[100];
        this.field_5781704_aFZ = new long[100];
        field_3694131_Dne = this;
        this.field_d102ba32_Dne = file;
        this.field_366f830_Dne = new RZd();
        this.field_36fdc63_Dne = new Kjm(file);
        this.method_d44b4592_zGp();
    }

    public boolean method_7c861acb_EyB() {
        return this.field_31b827_kGO;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        try {
            if (this.method_7a46289e_Dne()) {
                long l = System.currentTimeMillis();
                long l2 = 0L;
                while (this.field_2092bf_Dne) {
                    long l3 = System.currentTimeMillis();
                    long l4 = l3 - l;
                    if (l4 > 2000L && l - this.field_2d29f5_aFZ >= 15000L) {
                        this.method_230e0120_Dne().method_110c4dc3_FWm("Can't keep up! Did the system time change, or is the server overloaded?");
                        l4 = 2000L;
                        this.field_2d29f5_aFZ = l;
                    }
                    if (l4 < 0L) {
                        this.method_230e0120_Dne().method_110c4dc3_FWm("Time ran backwards! Did the system time change?");
                        l4 = 0L;
                    }
                    l2 += l4;
                    l = l3;
                    if (this.field_836263a8_Dne[0].method_a98a0664_aFZ()) {
                        this.method_5e5571e_h_();
                        l2 = 0L;
                    } else {
                        while (l2 > 50L) {
                            l2 -= 50L;
                            this.method_5e5571e_h_();
                        }
                    }
                    Thread.sleep(1L);
                    this.field_29187e_XHL = true;
                }
            } else {
                this.method_7bd29e30_Dne(null);
            }
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            this.method_230e0120_Dne().method_13eaee12_FWm("Encountered an unexpected exception " + throwable.getClass().getSimpleName(), throwable);
            McM mcM = null;
            mcM = throwable instanceof kaJ ? this.method_f78f98ea_Dne(((kaJ)throwable).method_2303de54_Dne()) : this.method_f78f98ea_Dne(new McM("Exception in server tick loop", throwable));
            File file = new File(new File(this.method_9189e6b3_Dne(), "crash-reports"), "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-server.txt");
            if (mcM.method_7c2f2c69_Dne(file, this.method_230e0120_Dne())) {
                this.method_230e0120_Dne().method_47a073d1_bzF("This crash report has been saved to: " + file.getAbsolutePath());
            } else {
                this.method_230e0120_Dne().method_47a073d1_bzF("We were unable to save this crash report to disk.");
            }
            this.method_7bd29e30_Dne(mcM);
        }
        finally {
            try {
                this.method_7c6f6039_FWm();
                this.field_21261e_FWm = true;
            }
            catch (Throwable throwable) {
                throwable.printStackTrace();
            }
            finally {
                this.method_907a9d21_Qnq();
            }
        }
    }

    @Override
    public void method_a5de08f2_Dne(evf evf2) {
        evf2.method_5e295ec0_Dne("whitelist_enabled", false);
        evf2.method_5e295ec0_Dne("whitelist_count", 0);
        evf2.method_5e295ec0_Dne("players_current", this.method_ae128dba_bzF());
        evf2.method_5e295ec0_Dne("players_max", this.method_907a9d14_Qnq());
        evf2.method_5e295ec0_Dne("players_seen", this.field_3751af4_Dne.method_e4d6f7c8_FWm().length);
        evf2.method_5e295ec0_Dne("uses_auth", this.field_2e5f2c_bzF);
        evf2.method_5e295ec0_Dne("gui_state", this.method_c073dafc_mrb() ? "enabled" : "disabled");
        evf2.method_5e295ec0_Dne("avg_tick_ms", (int)(geR.method_174fcd7_Dne(this.field_5781704_aFZ) * 1.0E-6));
        evf2.method_5e295ec0_Dne("avg_sent_packet_count", (int)geR.method_174fcd7_Dne(this.field_3f1c58a_Dne));
        evf2.method_5e295ec0_Dne("avg_sent_packet_size", (int)geR.method_174fcd7_Dne(this.field_4039e0b_FWm));
        evf2.method_5e295ec0_Dne("avg_rec_packet_count", (int)geR.method_174fcd7_Dne(this.field_59d86bd_bzF));
        evf2.method_5e295ec0_Dne("avg_rec_packet_size", (int)geR.method_174fcd7_Dne(this.field_4a92423_Qnq));
        int n = 0;
        for (int i = 0; i < this.field_836263a8_Dne.length; ++i) {
            if (this.field_836263a8_Dne[i] == null) continue;
            RAN rAN = this.field_836263a8_Dne[i];
            xoY xoY2 = rAN.method_231798c9_Dne();
            evf2.method_5e295ec0_Dne("world[" + n + "][dimension]", rAN.field_3690d00_Dne.field_2092ae_Dne);
            evf2.method_5e295ec0_Dne("world[" + n + "][mode]", (Object)xoY2.method_230878ef_Dne());
            evf2.method_5e295ec0_Dne("world[" + n + "][difficulty]", rAN.field_2d29f4_aFZ);
            evf2.method_5e295ec0_Dne("world[" + n + "][hardcore]", xoY2.method_907a9d25_Qnq());
            evf2.method_5e295ec0_Dne("world[" + n + "][generator_name]", xoY2.method_23111898_Dne().method_eecad346_Dne());
            evf2.method_5e295ec0_Dne("world[" + n + "][generator_version]", xoY2.method_23111898_Dne().method_7a46288d_Dne());
            evf2.method_5e295ec0_Dne("world[" + n + "][height]", this.field_267cf5_Qnq);
            evf2.method_5e295ec0_Dne("world[" + n + "][chunks_loaded]", rAN.method_f8802153_FWm().method_7a46288d_Dne());
            ++n;
        }
        evf2.method_5e295ec0_Dne("worlds", n);
    }

    public int method_7ad387f6_DyG() {
        return 16;
    }

    public void method_b51e1f82_zGp(boolean bl) {
        this.field_2d2a05_aFZ = bl;
    }

    public void method_87b77874_aFZ(boolean bl) {
        this.field_267d06_Qnq = bl;
    }

    public abstract XHL method_230878ef_Dne();

    public void method_9a443a99_XHL() {
        this.field_2a9ae7_Zpi = true;
    }

    public static dzN method_a4d67825_Dne(jwh_0 jwh_02) {
        return jwh_02.field_3751af4_Dne;
    }

    public String method_c6f17a40_aFZ() {
        return this.field_bc57ecbf_aFZ;
    }

    public abstract NuQ method_230496c1_Dne();

    public boolean method_ae9f0476_ceE() {
        return this.field_29187e_XHL;
    }

    public void method_a456a56f_Dne(dzN dzN2) {
        this.field_3751af4_Dne = dzN2;
    }

    public McM method_f78f98ea_Dne(McM mcM) {
        mcM.method_230483dd_Dne().method_2aeeb7ad_Dne("Profiler Position", new MMz(this));
        if (this.field_836263a8_Dne != null && this.field_836263a8_Dne.length > 0 && this.field_836263a8_Dne[0] != null) {
            mcM.method_230483dd_Dne().method_2aeeb7ad_Dne("Vec3 Pool Size", new FVo(this));
        }
        if (this.field_3751af4_Dne != null) {
            mcM.method_230483dd_Dne().method_2aeeb7ad_Dne("Player Count", new cXg(this));
        }
        return mcM;
    }

    public String method_6a89a3dc_div() {
        return this.field_d9a85c6_FWm;
    }

    public String method_6859cdb9_bzF() {
        return this.field_c480ca78_bzF;
    }

    public boolean method_41dd09d1_Dne(Qnq qnq, int n, int n2, int n3, FiG fiG) {
        return false;
    }

    @Override
    public abstract dLs method_230e0120_Dne();

    protected boolean method_8288d6f2_IjH() {
        return true;
    }

    public String method_4a7b1d9f_Qnq() {
        return "UNKNOWN";
    }

    public String method_da581772_IjH() {
        return "vanilla";
    }

    public void method_ce7f5da9_Dne(int n) {
        this.field_21260d_FWm = n;
    }

    public int method_ae128dba_bzF() {
        return this.field_3751af4_Dne.method_7c6f602c_FWm();
    }

    public boolean method_baa39406_kGO() {
        return this.field_2f0de9_div;
    }

    public abstract boolean method_7c6f603d_FWm();

    public abstract String method_9f2c7597_Dne(XHL var1, boolean var2);

    public abstract boolean method_ae128dcb_bzF();

    public YiY method_23096ac2_Dne() {
        return this.field_36fdc63_Dne;
    }

    @Override
    public String method_98148f73_Dne(String string, Object ... objectArray) {
        return irb.method_2310d392_Dne().method_98148f73_Dne(string, objectArray);
    }

    public int method_b0a28137_div() {
        return this.field_267cf5_Qnq;
    }

    public static jwh_0 method_2302cf90_Dne() {
        return field_3694131_Dne;
    }

    public String[] method_631ac9e9_Dne() {
        return this.field_3751af4_Dne.method_631ac9e9_Dne();
    }

    protected abstract boolean method_7a46289e_Dne() throws UnknownHostException;

    public abstract boolean method_907a9d25_Qnq();

    public File method_fac597a9_Dne(String string) {
        return new File(this.method_9189e6b3_Dne(), string);
    }

    public RAN method_9e6fba3b_Dne(int n) {
        return n == -1 ? this.field_836263a8_Dne[1] : (n == 1 ? this.field_836263a8_Dne[2] : this.field_836263a8_Dne[0]);
    }

    public abstract boolean method_7ad38807_DyG();

    public void method_a7eb5b90_Dne(KeyPair keyPair) {
        this.field_db23b4d5_Dne = keyPair;
    }

    public String method_8e7d4a1e_Zpi() {
        return this.field_309c90bc_DyG;
    }

    public void method_ce92b9a6_IjH(boolean bl) {
        this.field_31b827_kGO = bl;
    }

    public void method_143fdded_bzF(boolean bl) {
        this.field_22c613_IjH = bl;
    }

    protected synchronized void method_31d4eedc_zGp(String string) {
        this.field_be5cd5b_div = string;
    }

    public void method_8d1afe0b_Dne(XHL xHL) {
        for (int i = 0; i < this.field_836263a8_Dne.length; ++i) {
            jwh_0.method_2302cf90_Dne().field_836263a8_Dne[i].method_231798c9_Dne().method_8d1afe0b_Dne(xHL);
        }
    }

    protected void method_b0a28144_div() {
        this.field_569fcf45_Dne = null;
        this.field_2092ae_Dne = 0;
    }

    public boolean method_998e662d_Vxn() {
        return this.field_21261e_FWm;
    }

    public String method_c50868a8_mrb() {
        return this.field_9e60dbde_Qnq;
    }

    public void method_a9a920ab_Qnq(String string) {
        if (this.method_d44b4596_zGp()) {
            this.method_230e0120_Dne().method_8f501fe4_Dne(string);
        }
    }

    public void method_117d59bb_FWm(boolean bl) {
        this.field_2f0de9_div = bl;
    }

    public void method_e5ec840c_Zpi(String string) {
        this.field_c480ca78_bzF = string;
    }

    public void method_8b6b620e_div(String string) {
        this.field_9e60dbde_Qnq = string;
    }

    public int method_d44b4585_zGp() {
        return this.field_21260d_FWm;
    }

    public int method_907a9d14_Qnq() {
        return this.field_3751af4_Dne.method_ae128dba_bzF();
    }

    public void method_5e5571e_h_() {
        long l = System.nanoTime();
        bSp.method_23186cf1_Dne().method_7a46289a_Dne();
        ++this.field_2e5f1b_bzF;
        if (this.field_2a9ae7_Zpi) {
            this.field_2a9ae7_Zpi = false;
            this.field_365731d_Dne.field_2092bf_Dne = true;
            this.field_365731d_Dne.method_7a46289a_Dne();
        }
        this.field_365731d_Dne.method_8f501fe4_Dne("root");
        this.method_a98a0660_aFZ();
        if (this.field_2e5f1b_bzF % 900 == 0) {
            this.field_365731d_Dne.method_8f501fe4_Dne("save");
            this.field_3751af4_Dne.method_7c6f6039_FWm();
            this.method_ce7f9d7a_Dne(true);
            this.field_365731d_Dne.method_7c6f6039_FWm();
        }
        this.field_365731d_Dne.method_8f501fe4_Dne("tallying");
        this.field_5781704_aFZ[this.field_2e5f1b_bzF % 100] = System.nanoTime() - l;
        this.field_3f1c58a_Dne[this.field_2e5f1b_bzF % 100] = NER.field_267cf6_Qnq - this.field_2092af_Dne;
        this.field_2092af_Dne = NER.field_267cf6_Qnq;
        this.field_4039e0b_FWm[this.field_2e5f1b_bzF % 100] = NER.field_2d29f5_aFZ - this.field_21260e_FWm;
        this.field_21260e_FWm = NER.field_2d29f5_aFZ;
        this.field_59d86bd_bzF[this.field_2e5f1b_bzF % 100] = NER.field_21260e_FWm - this.field_2e5f1c_bzF;
        this.field_2e5f1c_bzF = NER.field_21260e_FWm;
        this.field_4a92423_Qnq[this.field_2e5f1b_bzF % 100] = NER.field_2e5f1c_bzF - this.field_267cf6_Qnq;
        this.field_267cf6_Qnq = NER.field_2e5f1c_bzF;
        this.field_365731d_Dne.method_7c6f6039_FWm();
        this.field_365731d_Dne.method_8f501fe4_Dne("snooper");
        if (!this.field_3758337_Dne.method_7a46289e_Dne() && this.field_2e5f1b_bzF > 100) {
            this.field_3758337_Dne.method_7a46289a_Dne();
        }
        if (this.field_2e5f1b_bzF % 6000 == 0) {
            this.field_3758337_Dne.method_7c6f6039_FWm();
        }
        this.field_365731d_Dne.method_7c6f6039_FWm();
        this.field_365731d_Dne.method_7c6f6039_FWm();
    }

    public String method_a8d4a4de_kGO() {
        return this.field_c480ca78_bzF;
    }

    protected void method_7bd29e30_Dne(McM mcM) {
    }

    @Override
    public void method_7f31bcb3_FWm(evf evf2) {
        evf2.method_5e295ec0_Dne("singleplayer", this.method_9feec6c6_Zpi());
        evf2.method_5e295ec0_Dne("server_brand", this.method_da581772_IjH());
        evf2.method_5e295ec0_Dne("gui_supported", GraphicsEnvironment.isHeadless() ? "headless" : "supported");
        evf2.method_5e295ec0_Dne("dedicated", this.method_907a9d25_Qnq());
    }

    public void method_47a073d1_bzF(String string) {
        this.method_230e0120_Dne().method_47a073d1_bzF(string);
    }

    @Override
    public String method_193de2e9_a_() {
        return "Server";
    }

    public boolean method_9a443a9d_XHL() {
        return this.field_2092bf_Dne;
    }

    public void method_fbc5d70d_DyG(String string) {
        this.field_d9a85c6_FWm = string;
    }

    protected void method_5ab44f9f_Dne(String string, int n) {
        this.field_569fcf45_Dne = string;
        this.field_2092ae_Dne = n;
        this.method_230e0120_Dne().method_8f501fe4_Dne(string + ": " + n + "%");
    }

    @Override
    public iSh method_23105fed_Dne() {
        return new iSh(0, 0, 0);
    }

    public int method_7c6f602c_FWm() {
        return this.field_21260d_FWm;
    }

    public evf method_230f1196_Dne() {
        return this.field_3758337_Dne;
    }

    protected void method_7ad38803_DyG() {
        int n = 0;
        this.method_31d4eedc_zGp("menu.generatingTerrain");
        int n2 = 0;
        this.method_230e0120_Dne().method_8f501fe4_Dne("Preparing start region for level " + n2);
        RAN rAN = this.field_836263a8_Dne[n2];
        iSh iSh2 = rAN.method_23105fed_Dne();
        long l = System.currentTimeMillis();
        for (int i = -192; i <= 192 && this.method_9a443a9d_XHL(); i += 16) {
            for (int j = -192; j <= 192 && this.method_9a443a9d_XHL(); j += 16) {
                long l2 = System.currentTimeMillis();
                if (l2 - l > 1000L) {
                    this.method_5ab44f9f_Dne("Preparing spawn area", n * 100 / 625);
                    l = l2;
                }
                ++n;
                rAN.field_366d5ad_Dne.method_e1796070_FWm(iSh2.field_2092ae_Dne + i >> 4, iSh2.field_2e5f1b_bzF + j >> 4);
            }
        }
        this.method_b0a28144_div();
    }

    public boolean method_73aaafc7_ATE() {
        return this.field_20b868_DyG;
    }

    @Override
    public boolean method_a98a0664_aFZ() {
        return true;
    }

    public String method_87e11f27_XHL() {
        return this.field_8b8e234d_zGp;
    }

    public boolean method_b0a28148_div() {
        return true;
    }

    public FWm method_2300868f_Dne() {
        return this.field_366f830_Dne;
    }

    protected void method_907a9d21_Qnq() {
    }

    public void method_7c6f6039_FWm() {
        if (!this.field_33449d_mrb) {
            this.method_230e0120_Dne().method_8f501fe4_Dne("Stopping server");
            if (this.method_230496c1_Dne() != null) {
                this.method_230496c1_Dne().method_7a46289a_Dne();
            }
            if (this.field_3751af4_Dne != null) {
                this.method_230e0120_Dne().method_8f501fe4_Dne("Saving players");
                this.field_3751af4_Dne.method_7c6f6039_FWm();
                this.field_3751af4_Dne.method_907a9d21_Qnq();
            }
            this.method_230e0120_Dne().method_8f501fe4_Dne("Saving worlds");
            this.method_ce7f9d7a_Dne(false);
            for (int i = 0; i < this.field_836263a8_Dne.length; ++i) {
                RAN rAN = this.field_836263a8_Dne[i];
                rAN.method_c5287a5e_qLR();
            }
            if (this.field_3758337_Dne != null && this.field_3758337_Dne.method_7a46289e_Dne()) {
                this.field_3758337_Dne.method_ae128dc7_bzF();
            }
        }
    }

    public void method_156b6138_IjH(String string) {
        this.field_bc57ecbf_aFZ = string;
    }

    public int method_a98a0653_aFZ() {
        return 16;
    }

    public String method_39193c_Dne(String string) {
        rBY.field_37aa743_Dne.method_7a46289a_Dne();
        this.field_366f830_Dne.method_d491c9e2_Dne(rBY.field_37aa743_Dne, string);
        return rBY.field_37aa743_Dne.method_d1f1ed87_FWm();
    }

    protected File method_9189e6b3_Dne() {
        return new File(".");
    }

    @Override
    public boolean method_fa81cf37_Dne(int n, String string) {
        return true;
    }

    public int method_8288d6e1_IjH() {
        return this.field_2e5f1b_bzF;
    }

    public boolean method_c3b4a2d4_ooe() {
        return this.field_267d06_Qnq;
    }

    public String method_a174454e_zGp() {
        return "";
    }

    protected void method_bbfe582a_aFZ(String string) {
        if (this.method_23096ac2_Dne().method_8f501fe8_Dne(string)) {
            this.method_230e0120_Dne().method_8f501fe4_Dne("Converting map!");
            this.method_31d4eedc_zGp("menu.convertingLevel");
            this.method_23096ac2_Dne().method_2b8cd6f5_Dne(string, new jXQ(this));
        }
    }

    protected void method_ce7f9d7a_Dne(boolean bl) {
        if (!this.field_33449d_mrb) {
            for (RAN rAN : this.field_836263a8_Dne) {
                if (rAN == null) continue;
                if (!bl) {
                    this.method_230e0120_Dne().method_8f501fe4_Dne("Saving chunks for level '" + rAN.method_231798c9_Dne().method_eecad346_Dne() + "'/" + rAN.field_3690d00_Dne.method_eecad346_Dne());
                }
                try {
                    rAN.method_5f7a671b_Dne(true, null);
                }
                catch (div div2) {
                    this.method_230e0120_Dne().method_110c4dc3_FWm(div2.getMessage());
                }
            }
        }
    }

    public abstract int method_7a46288d_Dne();

    public void method_a98a0660_aFZ() {
        int n;
        this.field_365731d_Dne.method_8f501fe4_Dne("levels");
        for (n = 0; n < this.field_836263a8_Dne.length; ++n) {
            long l = System.nanoTime();
            if (n == 0 || this.method_b0a28148_div()) {
                RAN rAN = this.field_836263a8_Dne[n];
                this.field_365731d_Dne.method_8f501fe4_Dne(rAN.method_231798c9_Dne().method_eecad346_Dne());
                this.field_365731d_Dne.method_8f501fe4_Dne("pools");
                rAN.method_23186a47_Dne().method_7a46289a_Dne();
                this.field_365731d_Dne.method_7c6f6039_FWm();
                if (this.field_2e5f1b_bzF % 20 == 0) {
                    this.field_365731d_Dne.method_8f501fe4_Dne("timeSync");
                    this.field_3751af4_Dne.method_7ce8f7_Dne(new uYm(rAN.method_7c6f602d_FWm(), rAN.method_ae128dbb_bzF()), rAN.field_3690d00_Dne.field_2092ae_Dne);
                    this.field_365731d_Dne.method_7c6f6039_FWm();
                }
                this.field_365731d_Dne.method_8f501fe4_Dne("tick");
                try {
                    rAN.method_907a9d21_Qnq();
                }
                catch (Throwable throwable) {
                    McM mcM = McM.method_948e60df_Dne(throwable, "Exception ticking world");
                    rAN.method_f7903e73_Dne(mcM);
                    throw new kaJ(mcM);
                }
                try {
                    rAN.method_7c6f6039_FWm();
                }
                catch (Throwable throwable) {
                    System.out.println("Exception ticking world entities");
                }
                this.field_365731d_Dne.method_7c6f6039_FWm();
                this.field_365731d_Dne.method_8f501fe4_Dne("tracker");
                rAN.method_230e0484_Dne().method_7a46289a_Dne();
                this.field_365731d_Dne.method_7c6f6039_FWm();
                this.field_365731d_Dne.method_7c6f6039_FWm();
            }
            this.field_7a46ee0f_Dne[n][this.field_2e5f1b_bzF % 100] = System.nanoTime() - l;
        }
        this.field_365731d_Dne.method_110c4dc3_FWm("connection");
        this.method_230496c1_Dne().method_7c6f6039_FWm();
        this.field_365731d_Dne.method_110c4dc3_FWm("players");
        this.field_3751af4_Dne.method_7a46289a_Dne();
        this.field_365731d_Dne.method_110c4dc3_FWm("tickables");
        for (n = 0; n < this.field_f27c122c_Dne.size(); ++n) {
            ((qDW)this.field_f27c122c_Dne.get(n)).method_7a46289a_Dne();
        }
        this.field_365731d_Dne.method_7c6f6039_FWm();
    }

    public void method_c073daf8_mrb() {
        this.field_33449d_mrb = true;
        this.method_23096ac2_Dne().method_7a46289a_Dne();
        for (int i = 0; i < this.field_836263a8_Dne.length; ++i) {
            RAN rAN = this.field_836263a8_Dne[i];
            if (rAN == null) continue;
            rAN.method_c5287a5e_qLR();
        }
        this.method_23096ac2_Dne().method_110c4dc7_FWm(this.field_836263a8_Dne[0].method_23102361_Dne().method_eecad346_Dne());
        this.method_ae128dc7_bzF();
    }

    public boolean method_c073dafc_mrb() {
        return false;
    }

    private void method_d44b4592_zGp() {
        ejD.method_7a46289a_Dne();
    }

    public void method_19035023_XHL(String string) {
        this.field_309c90bc_DyG = string;
    }

    public synchronized String method_3c9d12fd_DyG() {
        return this.field_be5cd5b_div;
    }

    public void method_b33f04a1_a_(String string) {
        this.method_230e0120_Dne().method_8f501fe4_Dne(string);
    }

    public void method_117d19ea_FWm(int n) {
        for (int i = 0; i < this.field_836263a8_Dne.length; ++i) {
            RAN rAN = this.field_836263a8_Dne[i];
            if (rAN == null) continue;
            if (rAN.method_231798c9_Dne().method_907a9d25_Qnq()) {
                rAN.field_2d29f4_aFZ = 3;
                rAN.method_174c49a_Dne(true, true);
                continue;
            }
            if (this.method_9feec6c6_Zpi()) {
                rAN.field_2d29f4_aFZ = n;
                rAN.method_174c49a_Dne(rAN.field_2d29f4_aFZ > 0, true);
                continue;
            }
            rAN.field_2d29f4_aFZ = n;
            rAN.method_174c49a_Dne(this.method_8288d6f2_IjH(), this.field_267d06_Qnq);
        }
    }

    protected void method_6d325d82_Dne(String string, String string2, long l, kGO kGO2, String string3) {
        mrb mrb2;
        this.method_bbfe582a_aFZ(string);
        this.method_31d4eedc_zGp("menu.loadingLevel");
        this.field_836263a8_Dne = new RAN[3];
        this.field_7a46ee0f_Dne = new long[this.field_836263a8_Dne.length][100];
        iDE iDE2 = this.field_36fdc63_Dne.method_c5a32f37_Dne(string, true);
        xoY xoY2 = iDE2.method_231798c9_Dne();
        if (xoY2 == null) {
            mrb2 = new mrb(l, this.method_230878ef_Dne(), this.method_7c6f603d_FWm(), this.method_ae128dcb_bzF(), kGO2);
            mrb2.method_285be758_Dne(string3);
        } else {
            mrb2 = new mrb(xoY2);
        }
        if (this.field_22c613_IjH) {
            mrb2.method_2312a50e_Dne();
        }
        for (int i = 0; i < this.field_836263a8_Dne.length; ++i) {
            int n = 0;
            if (i == 1) {
                n = -1;
            }
            if (i == 2) {
                n = 1;
            }
            this.field_836263a8_Dne[i] = i == 0 ? (this.method_baa39406_kGO() ? new Kqb(this, iDE2, string2, n, this.field_365731d_Dne, this.method_230e0120_Dne()) : new RAN(this, iDE2, string2, n, mrb2, this.field_365731d_Dne, this.method_230e0120_Dne())) : new jgd(this, iDE2, string2, n, mrb2, this.field_836263a8_Dne[0], this.field_365731d_Dne, this.method_230e0120_Dne());
            this.field_836263a8_Dne[i].method_755f9a60_Dne(new vSE(this, this.field_836263a8_Dne[i]));
            if (!this.method_9feec6c6_Zpi()) {
                this.field_836263a8_Dne[i].method_231798c9_Dne().method_8d1afe0b_Dne(this.method_230878ef_Dne());
            }
            this.field_3751af4_Dne.method_c229f287_Dne(this.field_836263a8_Dne);
        }
        this.method_117d19ea_FWm(this.method_7a46288d_Dne());
        this.method_7ad38803_DyG();
    }

    public void method_7ed9b9d3_Qnq(boolean bl) {
        this.field_2e5f2c_bzF = bl;
    }

    public void method_63ae5a10_div(boolean bl) {
        this.field_20b868_DyG = bl;
    }

    public void method_80c536c2_mrb(String string) {
        this.field_8b8e234d_zGp = string;
    }

    public void method_110c4dc3_FWm(String string) {
        this.method_230e0120_Dne().method_110c4dc3_FWm(string);
    }

    public boolean method_cd4cb3d9_udO() {
        return this.field_2e5f2c_bzF;
    }

    public void method_df9e2b31_DyG(boolean bl) {
        this.field_388db7_zGp = bl;
    }

    public void method_8288d6ee_IjH() {
        new jjR(this, "Server thread").start();
    }

    public boolean method_d44b4596_zGp() {
        return false;
    }

    public String method_d1f1ed87_FWm() {
        return this.field_d9a85c6_FWm;
    }

    public dzN method_230ea953_Dne() {
        return this.field_3751af4_Dne;
    }

    public boolean method_cc5ef5c4_trS() {
        return this.field_2d2a05_aFZ;
    }

    public boolean method_9feec6c6_Zpi() {
        return this.field_9e60dbde_Qnq != null;
    }

    public List method_b6370c78_Dne(gnI gnI2, String string) {
        ArrayList<String> arrayList = new ArrayList<String>();
        if (string.startsWith("/")) {
            boolean bl = !(string = string.substring(1)).contains(" ");
            List list = this.field_366f830_Dne.method_b6370c78_Dne(gnI2, string);
            if (list != null) {
                for (Object obj : list) {String string2 = (String) obj;
                    if (bl) {
                        arrayList.add("/" + string2);
                        continue;
                    }
                    arrayList.add(string2);
                }
            }
            return arrayList;
        }
        String[] stringArray = string.split(" ", -1);
        String string3 = stringArray[stringArray.length - 1];
        for (Object obj : this.field_3751af4_Dne.method_631ac9e9_Dne()) {String string4 = (String) obj;
            if (!xZE.method_abaa98b2_Dne(string3, string4)) continue;
            arrayList.add(string4);
        }
        return arrayList;
    }

    @Override
    public void method_8f501fe4_Dne(String string) {
        this.method_230e0120_Dne().method_8f501fe4_Dne(vCA.method_39193c_Dne(string));
    }

    public boolean method_c5287a62_qLR() {
        return this.field_388db7_zGp;
    }

    public void method_143f9e1c_bzF(int n) {
        this.field_267cf5_Qnq = n;
    }
}

