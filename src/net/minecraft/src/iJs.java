package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class iJs
extends jwh_0
implements xnW {
    private final List field_f27c122c_Dne = Collections.synchronizedList(new ArrayList());
    private final dLs field_37472c1_Dne;
    private wGj field_37d01f2_Dne;
    private qKl field_37a56fa_Dne;
    private XHL field_36eea90_Dne;
    private euc field_3757f19_Dne;
    private boolean field_2092bf_Dne;
    private NuQ field_36b0862_Dne;
    private boolean field_21261e_FWm = false;

    @Override
    public String method_9f2c7597_Dne(XHL xHL, boolean bl) {
        return "";
    }

    @Override
    public McM method_f78f98ea_Dne(McM mcM) {
        mcM = super.method_f78f98ea_Dne(mcM);
        mcM.method_230483dd_Dne().method_2aeeb7ad_Dne("Is Modded", new PCC(this));
        mcM.method_230483dd_Dne().method_2aeeb7ad_Dne("Type", new ITD(this));
        return mcM;
    }

    @Override
    public void method_5e295ec0_Dne(String string, Object object) {
        this.field_3757f19_Dne.method_5e295ec0_Dne(string, object);
    }

    @Override
    protected void method_7bd29e30_Dne(McM mcM) {
        while (this.method_9a443a9d_XHL()) {
            this.method_d44b4592_zGp();
            try {
                Thread.sleep(10L);
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
    }

    public iJs(File file) {
        super(file);
        this.field_37472c1_Dne = new WQU("Minecraft-Server", null, new File(file, "server.log").getAbsolutePath());
        new qsp(this);
    }

    @Override
    public String method_eecad346_Dne() {
        File file = this.field_3757f19_Dne.method_9189e6b3_Dne();
        return file != null ? file.getAbsolutePath() : "No settings file";
    }

    @Override
    public boolean method_ae128dcb_bzF() {
        return this.field_3757f19_Dne.method_5ab48f74_Dne("hardcore", false);
    }

    public void method_d44b4592_zGp() {
        while (!this.field_f27c122c_Dne.isEmpty()) {
            KBG kBG = (KBG)this.field_f27c122c_Dne.remove(0);
            this.method_2300868f_Dne().method_d491c9e2_Dne(kBG.field_3764a6a_Dne, kBG.field_569fcf45_Dne);
        }
    }

    public void method_4ca8d65b_Dne(String string, gnI gnI2) {
        this.field_f27c122c_Dne.add(new KBG(string, gnI2));
    }

    @Override
    public boolean method_b0a28148_div() {
        return this.field_3757f19_Dne.method_5ab48f74_Dne("allow-nether", true);
    }

    @Override
    public int method_7a46288d_Dne() {
        return this.field_3757f19_Dne.method_5ab44f92_Dne("difficulty", 1);
    }

    @Override
    public void method_a98a0660_aFZ() {
        super.method_a98a0660_aFZ();
        this.method_d44b4592_zGp();
    }

    @Override
    public String method_603a0db2_Dne(String string, String string2) {
        return this.field_3757f19_Dne.method_603a0db2_Dne(string, string2);
    }

    @Override
    public boolean method_a98a0664_aFZ() {
        return this.field_3757f19_Dne.method_5ab48f74_Dne("snooper-enabled", true);
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return this.field_2092bf_Dne;
    }

    @Override
    public boolean method_7ad38807_DyG() {
        return this.field_3757f19_Dne.method_5ab48f74_Dne("enable-command-block", false);
    }

    public boolean method_5ab48f74_Dne(String string, boolean bl) {
        return this.field_3757f19_Dne.method_5ab48f74_Dne(string, bl);
    }

    @Override
    public boolean method_8288d6f2_IjH() {
        return this.field_3757f19_Dne.method_5ab48f74_Dne("spawn-monsters", true);
    }

    @Override
    public int method_5ab44f92_Dne(String string, int n) {
        return this.field_3757f19_Dne.method_5ab44f92_Dne(string, n);
    }

    @Override
    protected boolean method_7a46289e_Dne() throws UnknownHostException {
        kGO kGO2;
        mQQ mQQ2 = new mQQ(this);
        mQQ2.setDaemon(true);
        mQQ2.start();
        this.method_230e0120_Dne().method_8f501fe4_Dne("Starting minecraft server version UNKNOWN");
        if (Runtime.getRuntime().maxMemory() / 1024L / 1024L < 512L) {
            this.method_230e0120_Dne().method_110c4dc3_FWm("To start the server with more ram, launch it as \"java -Xmx1024M -Xms1024M -jar minecraft_server.jar\"");
        }
        this.method_230e0120_Dne().method_8f501fe4_Dne("Loading properties");
        this.field_3757f19_Dne = new euc(new File("server.properties"), this.method_230e0120_Dne());
        if (this.method_9feec6c6_Zpi()) {
            this.method_fbc5d70d_DyG("127.0.0.1");
        } else {
            this.method_7ed9b9d3_Qnq(this.field_3757f19_Dne.method_5ab48f74_Dne("online-mode", true));
            this.method_fbc5d70d_DyG(this.field_3757f19_Dne.method_603a0db2_Dne("server-ip", ""));
        }
        this.method_87b77874_aFZ(this.field_3757f19_Dne.method_5ab48f74_Dne("spawn-animals", true));
        this.method_b51e1f82_zGp(this.field_3757f19_Dne.method_5ab48f74_Dne("spawn-npcs", true));
        this.method_df9e2b31_DyG(this.field_3757f19_Dne.method_5ab48f74_Dne("pvp", true));
        this.method_63ae5a10_div(this.field_3757f19_Dne.method_5ab48f74_Dne("allow-flight", false));
        this.method_19035023_XHL(this.field_3757f19_Dne.method_603a0db2_Dne("texture-pack", ""));
        this.method_e5ec840c_Zpi(this.field_3757f19_Dne.method_603a0db2_Dne("motd", "A Minecraft Server"));
        this.method_ce92b9a6_IjH(this.field_3757f19_Dne.method_5ab48f74_Dne("force-gamemode", false));
        if (this.field_3757f19_Dne.method_5ab44f92_Dne("difficulty", 1) < 0) {
            this.field_3757f19_Dne.method_5e295ec0_Dne("difficulty", 0);
        } else if (this.field_3757f19_Dne.method_5ab44f92_Dne("difficulty", 1) > 3) {
            this.field_3757f19_Dne.method_5e295ec0_Dne("difficulty", 3);
        }
        this.field_2092bf_Dne = this.field_3757f19_Dne.method_5ab48f74_Dne("generate-structures", true);
        int n = this.field_3757f19_Dne.method_5ab44f92_Dne("gamemode", XHL.field_2028b66f_FWm.method_7a46288d_Dne());
        this.field_36eea90_Dne = mrb.method_9e728e7e_Dne(n);
        this.method_230e0120_Dne().method_8f501fe4_Dne("Default game type: " + (Object)((Object)this.field_36eea90_Dne));
        InetAddress inetAddress = null;
        if (this.method_6a89a3dc_div().length() > 0) {
            inetAddress = InetAddress.getByName(this.method_6a89a3dc_div());
        }
        if (this.method_d44b4585_zGp() < 0) {
            this.method_ce7f5da9_Dne(this.field_3757f19_Dne.method_5ab44f92_Dne("server-port", 25565));
        }
        this.method_230e0120_Dne().method_8f501fe4_Dne("Generating keypair");
        this.method_a7eb5b90_Dne(Mjb.method_7af00974_Dne());
        this.method_230e0120_Dne().method_8f501fe4_Dne("Starting Minecraft server on " + (this.method_6a89a3dc_div().length() == 0 ? "*" : this.method_6a89a3dc_div()) + ":" + this.method_d44b4585_zGp());
        try {
            this.field_36b0862_Dne = new ysI(this, inetAddress, this.method_d44b4585_zGp());
        }
        catch (IOException iOException) {
            this.method_230e0120_Dne().method_110c4dc3_FWm("**** FAILED TO BIND TO PORT!");
            this.method_230e0120_Dne().method_feb678cd_Dne("The exception was: {0}", iOException.toString());
            this.method_230e0120_Dne().method_110c4dc3_FWm("Perhaps a server is already running on that port?");
            return false;
        }
        if (!this.method_cd4cb3d9_udO()) {
            this.method_230e0120_Dne().method_110c4dc3_FWm("**** SERVER IS RUNNING IN OFFLINE/INSECURE MODE!");
            this.method_230e0120_Dne().method_110c4dc3_FWm("The server will make no attempt to authenticate usernames. Beware.");
            this.method_230e0120_Dne().method_110c4dc3_FWm("While this makes the game possible to play without internet access, it also opens up the ability for hackers to connect with any username they choose.");
            this.method_230e0120_Dne().method_110c4dc3_FWm("To change this, set \"online-mode\" to \"true\" in the server.properties file.");
        }
        this.method_a456a56f_Dne(new bjV(this));
        long l = System.nanoTime();
        if (this.method_c6f17a40_aFZ() == null) {
            this.method_156b6138_IjH(this.field_3757f19_Dne.method_603a0db2_Dne("level-name", "world"));
        }
        String string = this.field_3757f19_Dne.method_603a0db2_Dne("level-seed", "");
        String string2 = this.field_3757f19_Dne.method_603a0db2_Dne("level-type", "DEFAULT");
        String string3 = this.field_3757f19_Dne.method_603a0db2_Dne("generator-settings", "");
        long l2 = new Random().nextLong();
        if (string.length() > 0) {
            try {
                long l3 = Long.parseLong(string);
                if (l3 != 0L) {
                    l2 = l3;
                }
            }
            catch (NumberFormatException numberFormatException) {
                l2 = string.hashCode();
            }
        }
        if ((kGO2 = kGO.method_285a5ae2_Dne(string2)) == null) {
            kGO2 = kGO.field_3778a39_Dne;
        }
        this.method_143f9e1c_bzF(this.field_3757f19_Dne.method_5ab44f92_Dne("max-build-height", 256));
        this.method_143f9e1c_bzF((this.method_b0a28137_div() + 8) / 16 * 16);
        this.method_143f9e1c_bzF(geR.method_2c2cf7bc_Dne(this.method_b0a28137_div(), 64, 256));
        this.field_3757f19_Dne.method_5e295ec0_Dne("max-build-height", this.method_b0a28137_div());
        this.method_230e0120_Dne().method_8f501fe4_Dne("Preparing level \"" + this.method_c6f17a40_aFZ() + "\"");
        this.method_6d325d82_Dne(this.method_c6f17a40_aFZ(), this.method_c6f17a40_aFZ(), l2, kGO2, string3);
        long l4 = System.nanoTime() - l;
        String string4 = String.format("%.3fs", (double)l4 / 1.0E9);
        this.method_230e0120_Dne().method_8f501fe4_Dne("Done (" + string4 + ")! For help, type \"help\" or \"?\"");
        if (this.field_3757f19_Dne.method_5ab48f74_Dne("enable-query", false)) {
            this.method_230e0120_Dne().method_8f501fe4_Dne("Starting GS4 status listener");
            this.field_37d01f2_Dne = new wGj(this);
            this.field_37d01f2_Dne.method_7a46289a_Dne();
        }
        if (this.field_3757f19_Dne.method_5ab48f74_Dne("enable-rcon", false)) {
            this.method_230e0120_Dne().method_8f501fe4_Dne("Starting remote control listener");
            this.field_37a56fa_Dne = new qKl(this);
            this.field_37a56fa_Dne.method_7a46289a_Dne();
        }
        return true;
    }

    @Override
    public int method_a98a0653_aFZ() {
        return this.field_3757f19_Dne.method_5ab44f92_Dne("spawn-protection", super.method_a98a0653_aFZ());
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_3757f19_Dne.method_7c6f6039_FWm();
    }

    public bjV method_230d857d_Dne() {
        return (bjV)super.method_230ea953_Dne();
    }

    @Override
    public XHL method_230878ef_Dne() {
        return this.field_36eea90_Dne;
    }

    @Override
    public dLs method_230e0120_Dne() {
        return this.field_37472c1_Dne;
    }

    @Override
    public boolean method_c073dafc_mrb() {
        return this.field_21261e_FWm;
    }

    @Override
    public dzN method_230ea953_Dne() {
        return this.method_230d857d_Dne();
    }

    @Override
    public void method_a5de08f2_Dne(evf evf2) {
        evf2.method_5e295ec0_Dne("whitelist_enabled", this.method_230d857d_Dne().method_7a46289e_Dne());
        evf2.method_5e295ec0_Dne("whitelist_count", this.method_230d857d_Dne().method_d412ef09_Dne().size());
        super.method_a5de08f2_Dne(evf2);
    }

    @Override
    public boolean method_907a9d25_Qnq() {
        return true;
    }

    @Override
    public NuQ method_230496c1_Dne() {
        return this.field_36b0862_Dne;
    }

    @Override
    public boolean method_41dd09d1_Dne(Qnq qnq, int n, int n2, int n3, FiG fiG) {
        int n4;
        if (qnq.field_3690d00_Dne.field_2092ae_Dne != 0) {
            return false;
        }
        if (this.method_230d857d_Dne().method_4d96e468_FWm().isEmpty()) {
            return false;
        }
        if (this.method_230d857d_Dne().method_110c4dc7_FWm(fiG.field_bc57ecbf_aFZ)) {
            return false;
        }
        if (this.method_a98a0653_aFZ() <= 0) {
            return false;
        }
        iSh iSh2 = qnq.method_23105fed_Dne();
        int n5 = geR.method_ce7f5d9c_Dne(n - iSh2.field_2092ae_Dne);
        int n6 = Math.max(n5, n4 = geR.method_ce7f5d9c_Dne(n3 - iSh2.field_2e5f1b_bzF));
        return n6 <= this.method_a98a0653_aFZ();
    }

    @Override
    protected void method_907a9d21_Qnq() {
        System.exit(0);
    }
}

