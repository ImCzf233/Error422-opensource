/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;

import java.applet.AppletStub;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JPanel;
import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.util.glu.GLU;

import net.minecraft.src.*;

public abstract class Minecraft
implements hur,
Runnable {
    public Afj field_364ea47_Dne;
    public msA field_3791671_Dne;
    public RJV field_36c390e_Dne;
    private int field_2f0dd8_div = 0;
    public static byte[] field_3f1c582_Dne = new byte[0xA00000];
    public qVZ field_37a7e17_Dne = null;
    public rqj field_37b59c1_Dne;
    private etB field_3757759_Dne;
    private EsO field_366e94b_Dne;
    public boolean field_267d06_Qnq = false;
    public tsf_0 field_36dbda5_Dne;
    private YiY field_36fdc63_Dne;
    long field_21260e_FWm;
    private int field_388da6_zGp;
    private int field_33448c_mrb = 0;
    private int field_2d29f4_aFZ;
    long field_2092af_Dne;
    public msA field_2032e250_FWm;
    public MJs field_369f6b6_Dne;
    public boolean field_21261e_FWm = false;
    private static File field_fd16d933_FWm = new File(".minecraft");
    private boolean field_29187e_XHL;
    boolean field_2d2a05_aFZ = false;
    private String field_9e60dbde_Qnq = "root";
    public Jvu field_3693f03_Dne;
    private int field_267cf5_Qnq = 0;
    private String field_c480ca78_bzF;
    public String field_d9a85c6_FWm = "";
    public int field_21260d_FWm;
    long field_2e5f1c_bzF = -1L;
    private int field_22c602_IjH;
    private McM field_36a4ff5_Dne;
    public String field_569fcf45_Dne;
    private evf field_3758337_Dne;
    public ark field_373a352_Dne;
    private boolean field_22c613_IjH;
    private zHD field_37e5e36_Dne;
    public final Bkx field_365731d_Dne;
    public aUl field_3733694_Dne;
    public OEA field_36ac6a1_Dne;
    public Snh field_36d36bf_Dne;
    protected FWm field_ba5595f_FWm;
    public volatile boolean field_2e5f2c_bzF = false;
    int field_2e5f1b_bzF = 0;
    public vwN field_37d3e5f_Dne = null;
    private final dLs field_37472c1_Dne = new WQU("Minecraft-Client", " [CLIENT]", new File(Minecraft.method_9189e6b3_Dne(), "output-client.log").getAbsolutePath());
    private boolean field_2f0de9_div = false;
    private static Minecraft field_493682ed_Dne;
    private RXf field_36c6f8c_Dne;
    private static int field_20b857_DyG;
    public volatile boolean field_20b868_DyG = true;
    private YBR field_36f4923_Dne;
    public File field_d102ba32_Dne;
    public FkP field_3673fc1_Dne;
    public boolean field_2092bf_Dne = false;
    private boolean field_33449d_mrb;
    public int field_2092ae_Dne;
    public mKT field_3788296_Dne;
    public FUH field_2020b812_FWm;
    public FUH field_366ec33_Dne;
    public Canvas field_7c679bf6_Dne;
    public static Frame field_9eb08ffb_Dne;
    public boolean field_388db7_zGp = false;
    public fZI field_3758af7_Dne;
    public wHH field_37d0195_Dne = null;
    private long field_267cf6_Qnq = -1L;
    public VzZ field_36ebf36_Dne;
    public BMa field_364ffb6_Dne;

    public static int method_7a46288d_Dne() {
        for (int i = 16384; i > 0; i >>= 1) {
            GL11.glTexImage2D(32868, 0, 6408, i, i, 0, 6408, 5121, (ByteBuffer)null);
            int n = GL11.glGetTexLevelParameteri(32868, 0, 4096);
            if (n == 0) continue;
            return i;
        }
        return -1;
    }

    public static boolean method_7c6f603d_FWm() {
        return field_493682ed_Dne == null || !Minecraft.field_493682ed_Dne.field_3758af7_Dne.field_2e8497_ceE;
    }

    public boolean method_b0a28148_div() {
        return this.field_2f0de9_div;
    }

    public void method_8c784131_Dne(VzZ vzZ) {
        this.method_81abe0bb_Dne(vzZ, "");
    }

    public etB method_230f05b8_Dne() {
        return this.field_3757759_Dne;
    }

    public String method_6859cdb9_bzF() {
        return this.field_36ebf36_Dne.method_d1f1ed87_FWm();
    }

    private void method_16cca7a_Dne(int n, int n2) {
        this.field_2092ae_Dne = n <= 0 ? 1 : n;
        int n3 = this.field_21260d_FWm = n2 <= 0 ? 1 : n2;
        if (this.field_37a7e17_Dne != null) {
            IJm iJm = new IJm(this.field_3758af7_Dne, n, n2);
            int n4 = iJm.method_7a46288d_Dne();
            int n5 = iJm.method_7c6f602c_FWm();
            this.field_37a7e17_Dne.method_f68b2f6c_Dne(this, n4, n5);
        }
    }

    public abstract void method_7bd29e30_Dne(McM var1);

    public void method_552651f1_FWm(McM mcM) {
        this.field_2092bf_Dne = true;
        this.field_36a4ff5_Dne = mcM;
    }

    public void method_5ab44f9f_Dne(String string, int n) {
        this.field_c480ca78_bzF = string;
        this.field_22c602_IjH = n;
    }

    public void method_b88fcbd2_Dne(qVZ qVZ2) {
        if (this.field_37a7e17_Dne != null) {
            this.field_37a7e17_Dne.method_7c6f6039_FWm();
        }
        this.field_3673fc1_Dne.method_7a46289a_Dne();
        if (qVZ2 == null && this.field_36ebf36_Dne == null) {
            qVZ2 = new MKS();
        } else if (qVZ2 == null && this.field_369f6b6_Dne.method_9a443a8c_XHL() <= 0) {
            qVZ2 = new YcA();
        }
        if (qVZ2 instanceof MKS) {
            this.field_3758af7_Dne.field_212c2c_EyB = false;
            this.field_3733694_Dne.method_2312ad69_Dne().method_7a46289a_Dne();
        }
        this.field_37a7e17_Dne = qVZ2;
        if (qVZ2 != null) {
            this.method_d44b4592_zGp();
            IJm iJm = new IJm(this.field_3758af7_Dne, this.field_2092ae_Dne, this.field_21260d_FWm);
            int n = iJm.method_7a46288d_Dne();
            int n2 = iJm.method_7c6f602c_FWm();
            qVZ2.method_f68b2f6c_Dne(this, n, n2);
            this.field_267d06_Qnq = false;
        } else {
            this.method_a98a0660_aFZ();
        }
    }

    public void method_7c6f6039_FWm() {
        try {
            this.field_3673fc1_Dne.method_7a46289a_Dne();
            try {
                if (this.field_36f4923_Dne != null) {
                    this.field_36f4923_Dne.method_7c6f6039_FWm();
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
            this.method_230e0120_Dne().method_8f501fe4_Dne("Stopping!");
            try {
                this.method_8c784131_Dne(null);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            try {
                pZS.method_7c6f6039_FWm();
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            this.field_3788296_Dne.method_7c6f6039_FWm();
            Mouse.destroy();
            Keyboard.destroy();
        }
        finally {
            Display.destroy();
            if (!this.field_2092bf_Dne) {
                System.exit(0);
            }
        }
        System.gc();
    }

    public boolean method_d44b4596_zGp() {
        return this.field_29187e_XHL;
    }

    public void method_d44b4592_zGp() {
        if (this.field_388db7_zGp) {
            ulE.method_7a46289a_Dne();
            this.field_388db7_zGp = false;
            this.field_3693f03_Dne.method_7c6f6039_FWm();
        }
    }

    public void method_907a9d21_Qnq() {
        this.field_20b868_DyG = false;
    }

    public String method_4a7b1d9f_Qnq() {
        return "P: " + this.field_364ffb6_Dne.method_eecad346_Dne() + ". T: " + this.field_36ebf36_Dne.method_eecad346_Dne();
    }

    public final boolean method_7a46289e_Dne() {
        return this.field_33449d_mrb;
    }

    public void method_7a46289a_Dne() throws LWJGLException {
        if (this.field_7c679bf6_Dne != null) {
            Graphics graphics = this.field_7c679bf6_Dne.getGraphics();
            if (graphics != null) {
                graphics.setColor(Color.BLACK);
                graphics.fillRect(0, 0, this.field_2092ae_Dne, this.field_21260d_FWm);
                graphics.dispose();
            }
            Display.setParent(this.field_7c679bf6_Dne);
        } else if (this.field_2f0de9_div) {
            Display.setFullscreen(true);
            this.field_2092ae_Dne = Display.getDisplayMode().getWidth();
            this.field_21260d_FWm = Display.getDisplayMode().getHeight();
            if (this.field_2092ae_Dne <= 0) {
                this.field_2092ae_Dne = 1;
            }
            if (this.field_21260d_FWm <= 0) {
                this.field_21260d_FWm = 1;
            }
        } else {
            Display.setDisplayMode(new DisplayMode(this.field_2092ae_Dne, this.field_21260d_FWm));
        }
        Display.setTitle("M\u0336i\u0336n\u0336e\u0336c\u0336r\u0336a\u0336f\u0336t\u0336  ERROR422");
        this.method_230e0120_Dne().method_8f501fe4_Dne("LWJGL Version: " + Sys.getVersion());
        try {
            Display.create(new PixelFormat().withDepthBits(24));
        }
        catch (LWJGLException lWJGLException) {
            lWJGLException.printStackTrace();
            try {
                Thread.sleep(1000L);
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
            Display.create();
        }
        oCF.method_7a46289a_Dne();
        this.field_d102ba32_Dne = Minecraft.method_9189e6b3_Dne();
        this.field_36fdc63_Dne = new Kjm(new File(this.field_d102ba32_Dne, "saves"));
        this.field_3758af7_Dne = new fZI(this, this.field_d102ba32_Dne);
        this.field_373a352_Dne = new ark(this.field_d102ba32_Dne, this);
        this.field_36d36bf_Dne = new Snh(this.field_373a352_Dne, this.field_3758af7_Dne);
        this.method_baa39402_kGO();
        this.field_3791671_Dne = new msA(this.field_3758af7_Dne, "/font/default.png", this.field_36d36bf_Dne, false);
        this.field_2032e250_FWm = new msA(this.field_3758af7_Dne, "/font/alternate.png", this.field_36d36bf_Dne, false);
        if (this.field_3758af7_Dne.field_c480ca78_bzF != null) {
            irb.method_2310d392_Dne().method_5ab48f70_Dne(this.field_3758af7_Dne.field_c480ca78_bzF, false);
            this.field_3791671_Dne.method_ce7f9d7a_Dne(irb.method_2310d392_Dne().method_7a46289e_Dne());
            this.field_3791671_Dne.method_117d59bb_FWm(irb.method_110c4dc7_FWm(this.field_3758af7_Dne.field_c480ca78_bzF));
        }
        bzF.method_174f928_Dne(this.field_36d36bf_Dne.method_5ab3dd80_Dne("/misc/grasscolor.png"));
        QFY.method_174f928_Dne(this.field_36d36bf_Dne.method_5ab3dd80_Dne("/misc/foliagecolor.png"));
        this.field_36ac6a1_Dne = new OEA(this);
        ptH.field_37a7828_Dne.field_36fa224_Dne = new XyI(this);
        this.field_3673fc1_Dne = new FkP(this.field_37d3e5f_Dne, this.field_d102ba32_Dne);
        qlg.field_36522b5_Dne.method_6fea148b_Dne(new Ayv(this));
        this.method_baa39402_kGO();
        Mouse.create();
        this.field_3693f03_Dne = new Jvu(this.field_7c679bf6_Dne, this.field_3758af7_Dne);
        this.method_8f501fe4_Dne("Pre startup");
        GL11.glEnable(3553);
        GL11.glShadeModel(7425);
        GL11.glClearDepth(1.0);
        GL11.glEnable(2929);
        GL11.glDepthFunc(515);
        GL11.glEnable(3008);
        GL11.glAlphaFunc(516, 0.1f);
        GL11.glCullFace(1029);
        GL11.glMatrixMode(5889);
        GL11.glLoadIdentity();
        GL11.glMatrixMode(5888);
        this.method_8f501fe4_Dne("Startup");
        this.field_3788296_Dne.method_a5fb20b2_Dne(this.field_3758af7_Dne);
        this.field_37b59c1_Dne = new rqj(this, this.field_36d36bf_Dne);
        this.field_36d36bf_Dne.method_907a9d21_Qnq();
        GL11.glViewport(0, 0, this.field_2092ae_Dne, this.field_21260d_FWm);
        this.field_364ffb6_Dne = new BMa(this.field_36ebf36_Dne, this.field_36d36bf_Dne);
        try {
            this.field_36f4923_Dne = new YBR(this.field_d102ba32_Dne, this);
            this.field_36f4923_Dne.start();
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.method_8f501fe4_Dne("Post startup");
        this.field_3733694_Dne = new aUl(this);
        if (this.field_c480ca78_bzF != null) {
            this.method_b88fcbd2_Dne(new rND(new MKS(), this, this.field_c480ca78_bzF, this.field_22c602_IjH));
        } else {
            this.method_b88fcbd2_Dne(new MKS());
        }
        this.field_364ea47_Dne = new Afj(this);
        if (this.field_3758af7_Dne.field_2a9ae7_Zpi && !this.field_2f0de9_div) {
            this.method_b0a28144_div();
        }
    }

    public void method_a98a0660_aFZ() {
        if (Display.isActive() && !this.field_388db7_zGp) {
            this.field_388db7_zGp = true;
            this.field_3693f03_Dne.method_7a46289a_Dne();
            this.method_b88fcbd2_Dne(null);
            this.field_267cf5_Qnq = 10000;
        }
    }

    public static ZPT method_230980ad_Dne() {
        String string = System.getProperty("os.name").toLowerCase();
        return string.contains("win") ? ZPT.field_75b7c03b_bzF : (string.contains("mac") ? ZPT.field_5e596115_Qnq : (string.contains("solaris") ? ZPT.field_2029be2d_FWm : (string.contains("sunos") ? ZPT.field_2029be2d_FWm : (string.contains("linux") ? ZPT.field_36ff24e_Dne : (string.contains("unix") ? ZPT.field_36ff24e_Dne : ZPT.field_71337694_aFZ)))));
    }

    public boolean method_7ad38807_DyG() {
        return this.field_29187e_XHL && this.field_37e5e36_Dne != null;
    }

    public void method_7ccd8a5b_Dne(String string, File file) {
        int n = string.indexOf("/");
        String string2 = string.substring(0, n);
        string = string.substring(n + 1);
        if (string2.equalsIgnoreCase("sound3")) {
            this.field_3788296_Dne.method_7ccd8a5b_Dne(string, file);
        } else if (string2.equalsIgnoreCase("streaming")) {
            this.field_3788296_Dne.method_1d5885fa_FWm(string, file);
        } else if (!string2.equalsIgnoreCase("music") && !string2.equalsIgnoreCase("newmusic")) {
            if (string2.equalsIgnoreCase("lang")) {
                irb.method_2310d392_Dne().method_7ccd8a5b_Dne(string, file);
            }
        } else {
            this.field_3788296_Dne.method_bcb1fb88_bzF(string, file);
        }
    }

    public static long method_7a46288e_Dne() {
        return Sys.getTime() * 1000L / Sys.getTimerResolution();
    }

    @Override
    public dLs method_230e0120_Dne() {
        return this.field_37472c1_Dne;
    }

    public McM method_f78f98ea_Dne(McM mcM) {
        mcM.method_230483dd_Dne().method_2aeeb7ad_Dne("LWJGL", new BwZ(this));
        mcM.method_230483dd_Dne().method_2aeeb7ad_Dne("OpenGL", new fhF(this));
        mcM.method_230483dd_Dne().method_2aeeb7ad_Dne("Is Modded", new Tub(this));
        mcM.method_230483dd_Dne().method_2aeeb7ad_Dne("Type", new FNi(this));
        mcM.method_230483dd_Dne().method_2aeeb7ad_Dne("Texture Pack", new yiw_0(this));
        mcM.method_230483dd_Dne().method_2aeeb7ad_Dne("Profiler Position", new QPH(this));
        mcM.method_230483dd_Dne().method_2aeeb7ad_Dne("Vec3 Pool Size", new qCF(this));
        if (this.field_36ebf36_Dne != null) {
            this.field_36ebf36_Dne.method_f7903e73_Dne(mcM);
        }
        return mcM;
    }

    private void method_c3b4a2d0_ooe() {
        if (Keyboard.isKeyDown(60)) {
            if (!this.field_2d2a05_aFZ) {
                this.field_2d2a05_aFZ = true;
                this.field_3733694_Dne.method_2312ad69_Dne().method_8f501fe4_Dne(qQe.method_9316300f_Dne(field_fd16d933_FWm, this.field_2092ae_Dne, this.field_21260d_FWm));
            }
        } else {
            this.field_2d2a05_aFZ = false;
        }
    }

    public evf method_230f1196_Dne() {
        return this.field_3758337_Dne;
    }

    public static boolean method_907a9d25_Qnq() {
        return field_493682ed_Dne != null && Minecraft.field_493682ed_Dne.field_3758af7_Dne.field_2e5f1b_bzF != 0;
    }

    private void method_16d0a4b_Dne(int n, boolean bl) {
        if (!bl) {
            this.field_267cf5_Qnq = 0;
        }
        if (n != 0 || this.field_267cf5_Qnq <= 0) {
            if (bl && this.field_37d0195_Dne != null && this.field_37d0195_Dne.field_376443d_Dne == gks.field_376443d_Dne && n == 0) {
                int n2 = this.field_37d0195_Dne.field_2092ae_Dne;
                int n3 = this.field_37d0195_Dne.field_21260d_FWm;
                int n4 = this.field_37d0195_Dne.field_2e5f1b_bzF;
                this.field_36c390e_Dne.method_2ee8c479_FWm(n2, n3, n4, this.field_37d0195_Dne.field_267cf5_Qnq);
                if (this.field_369f6b6_Dne.method_a6aca7ce_FWm(n2, n3, n4)) {
                    this.field_364ffb6_Dne.method_5972745a_Dne(n2, n3, n4, this.field_37d0195_Dne.field_267cf5_Qnq);
                    this.field_369f6b6_Dne.method_ae128dc7_bzF();
                }
            } else {
                this.field_36c390e_Dne.method_7a46289a_Dne();
            }
        }
    }

    public static void method_9a443a99_XHL() {
        zHD zHD2;
        if (field_493682ed_Dne != null && (zHD2 = field_493682ed_Dne.method_2317ec95_Dne()) != null) {
            zHD2.method_7c6f6039_FWm();
        }
    }

    public void method_c6b5263a_Dne(int n, int n2, int n3, int n4, int n5, int n6) {
        float f = 0.00390625f;
        float f2 = 0.00390625f;
        WAR wAR = WAR.field_36e5ca4_Dne;
        wAR.method_7a46289a_Dne();
        wAR.method_c38c5864_Dne(n + 0, n2 + n6, 0.0, (float)(n3 + 0) * f, (float)(n4 + n6) * f2);
        wAR.method_c38c5864_Dne(n + n5, n2 + n6, 0.0, (float)(n3 + n5) * f, (float)(n4 + n6) * f2);
        wAR.method_c38c5864_Dne(n + n5, n2 + 0, 0.0, (float)(n3 + n5) * f, (float)(n4 + 0) * f2);
        wAR.method_c38c5864_Dne(n + 0, n2 + 0, 0.0, (float)(n3 + 0) * f, (float)(n4 + 0) * f2);
        wAR.method_7a46288d_Dne();
    }

    public void method_a5b17c94_Dne(etB etB2) {
        this.field_3757759_Dne = etB2;
    }

    private void method_c5287a5e_qLR() {
        if (this.field_37d0195_Dne != null) {
            int n;
            int n2;
            boolean bl = this.field_369f6b6_Dne.field_37cb681_Dne.field_267d06_Qnq;
            int n3 = 0;
            boolean bl2 = false;
            if (this.field_37d0195_Dne.field_376443d_Dne == gks.field_376443d_Dne) {
                n2 = this.field_37d0195_Dne.field_2092ae_Dne;
                int n4 = this.field_37d0195_Dne.field_21260d_FWm;
                int n5 = this.field_37d0195_Dne.field_2e5f1b_bzF;
                zKP zKP2 = zKP.field_8374b848_Dne[this.field_36ebf36_Dne.method_2c2cf7bc_Dne(n2, n4, n5)];
                if (zKP2 == null) {
                    return;
                }
                n = zKP2.method_9cb39123_Dne(this.field_36ebf36_Dne, n2, n4, n5);
                if (n == 0) {
                    return;
                }
                bl2 = dEr.field_836aa5b6_Dne[n].method_d44b4596_zGp();
                int n6 = n < 256 && !zKP.field_8374b848_Dne[zKP2.field_21260d_FWm].method_b0a28148_div() ? n : zKP2.field_21260d_FWm;
                n3 = zKP.field_8374b848_Dne[n6].method_3036b9c2_FWm(this.field_36ebf36_Dne, n2, n4, n5);
            } else {
                if (this.field_37d0195_Dne.field_376443d_Dne != gks.field_2030101c_FWm || this.field_37d0195_Dne.field_37b45e5_Dne == null || !bl) {
                    return;
                }
                if (this.field_37d0195_Dne.field_37b45e5_Dne instanceof JCd) {
                    n = dEr.field_ce0badb_ICU.field_267cf5_Qnq;
                } else if (this.field_37d0195_Dne.field_37b45e5_Dne instanceof BPY) {
                    BPY bPY = (BPY)this.field_37d0195_Dne.field_37b45e5_Dne;
                    if (bPY.method_23040479_Dne() == null) {
                        n = dEr.field_7fc699d8_FUM.field_267cf5_Qnq;
                    } else {
                        n = bPY.method_23040479_Dne().field_2e5f1b_bzF;
                        n3 = bPY.method_23040479_Dne().method_907a9d14_Qnq();
                        bl2 = true;
                    }
                } else if (this.field_37d0195_Dne.field_37b45e5_Dne instanceof Ebp) {
                    Ebp ebp = (Ebp)this.field_37d0195_Dne.field_37b45e5_Dne;
                    n = ebp.method_9a443a8c_XHL() == 2 ? dEr.field_320b7ad0_aJO.field_267cf5_Qnq : (ebp.method_9a443a8c_XHL() == 1 ? dEr.field_ce200b36_sly.field_267cf5_Qnq : (ebp.method_9a443a8c_XHL() == 3 ? dEr.field_f5d31de_Dsg.field_267cf5_Qnq : (ebp.method_9a443a8c_XHL() == 5 ? dEr.field_c47e8831_yHt.field_267cf5_Qnq : dEr.field_79f29743_IYC.field_267cf5_Qnq)));
                } else if (this.field_37d0195_Dne.field_37b45e5_Dne instanceof iMX) {
                    n = dEr.field_3f91c54a_CZC.field_267cf5_Qnq;
                } else {
                    n = dEr.field_1525a142_ghu.field_267cf5_Qnq;
                    n3 = Klb.method_bb7dd813_Dne(this.field_37d0195_Dne.field_37b45e5_Dne);
                    bl2 = true;
                    if (n3 <= 0 || !Klb.field_ecf0af5e_Dne.containsKey(n3)) {
                        return;
                    }
                }
            }
            this.field_369f6b6_Dne.field_36a059b_Dne.method_597a6e7a_Dne(n, n3, bl2, bl);
            if (bl) {
                n2 = this.field_369f6b6_Dne.field_36bb35e_Dne.field_7eb83e1f_bzF.size() - 9 + this.field_369f6b6_Dne.field_36a059b_Dne.field_2092ae_Dne;
                this.field_36c390e_Dne.method_fd8868e_Dne(this.field_369f6b6_Dne.field_36a059b_Dne.method_9e6e1a08_Dne(this.field_369f6b6_Dne.field_36a059b_Dne.field_2092ae_Dne), n2);
            }
        }
    }

    public void method_c073daf8_mrb() {
        this.field_22c613_IjH = true;
    }

    public static Minecraft method_81a5f12e_Dne() {
        return field_493682ed_Dne;
    }

    @Override
    public void run() {
        this.field_20b868_DyG = true;
        try {
            this.method_7a46289a_Dne();
        }
        catch (Exception exception) {
            exception.printStackTrace();
            this.method_6dc76d23_bzF(this.method_f78f98ea_Dne(new McM("Failed to start game", exception)));
            return;
        }
        try {
            while (this.field_20b868_DyG) {
                if (this.field_2092bf_Dne && this.field_36a4ff5_Dne != null) {
                    this.method_6dc76d23_bzF(this.field_36a4ff5_Dne);
                    return;
                }
                if (this.field_22c613_IjH) {
                    this.field_22c613_IjH = false;
                    this.field_36d36bf_Dne.method_ae128dc7_bzF();
                }
                try {
                    this.method_cd4cb3d5_udO();
                }
                catch (OutOfMemoryError outOfMemoryError) {
                    this.method_ae128dc7_bzF();
                    this.method_b88fcbd2_Dne(new qKn());
                    System.gc();
                }
            }
        }
        catch (MCb mCb) {
        }
        catch (kaJ kaJ2) {
            this.method_f78f98ea_Dne(kaJ2.method_2303de54_Dne());
            this.method_ae128dc7_bzF();
            kaJ2.printStackTrace();
            this.method_6dc76d23_bzF(kaJ2.method_2303de54_Dne());
        }
        catch (Throwable throwable) {
            McM mcM = this.method_f78f98ea_Dne(new McM("Unexpected error", throwable));
            this.method_ae128dc7_bzF();
            throwable.printStackTrace();
            this.method_6dc76d23_bzF(mcM);
        }
        finally {
            this.method_7c6f6039_FWm();
        }
    }

    @Override
    public boolean method_a98a0664_aFZ() {
        return this.field_3758af7_Dne.field_29187e_XHL;
    }

    public static void main(String[] stringArray) {
        Frame frame;
        Object object;
        Object object2;
        String string;
        HashMap<String, String> hashMap = new HashMap<String, String>();
        boolean bl = false;
        boolean bl2 = true;
        boolean bl3 = false;
        String string2 = string = "Player" + Minecraft.method_7a46288e_Dne() % 1000L;
        if (stringArray.length > 0) {
            string2 = stringArray[0];
        }
        String string3 = "-";
        if (stringArray.length > 1) {
            string3 = stringArray[1];
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i = 2; i < stringArray.length; ++i) {
            object2 = stringArray[i];
            object = i == stringArray.length - 1 ? null : stringArray[i + 1];
            boolean bl4 = false;
            if (!((String)object2).equals("-demo") && !((String)object2).equals("--demo")) {
                if (((String)object2).equals("--applet")) {
                    bl2 = false;
                } else if (((String)object2).equals("--password") && object != null) {
                    String[] stringArray2 = fgp.method_b7b2d4df_Dne(null, string2, (String)object);
                    if (stringArray2 != null) {
                        string2 = stringArray2[0];
                        string3 = stringArray2[1];
                        arrayList.add("Logged in insecurely as " + string2);
                    } else {
                        arrayList.add("Could not log in as " + string2 + " with given password");
                    }
                    bl4 = true;
                }
            } else {
                bl = true;
            }
            if (!bl4) continue;
            ++i;
        }
        if (string2.contains("@") && string3.length() <= 1) {
            string2 = string;
        }
        hashMap.put("demo", "" + bl);
        hashMap.put("stand-alone", "" + bl2);
        hashMap.put("username", string2);
        hashMap.put("fullscreen", "" + bl3);
        hashMap.put("sessionid", string3);
        field_9eb08ffb_Dne = frame = new Frame();
        frame.setTitle("E\u0337\u0301\u0342\u033f\u033d\u033f\u0309\u0344\u034b\u034c\u0303\u0343\u0303\u0329\u0330\u0320\u0347\u0359R\u0336\u035b\u0352\u0344\u030f\u034c\u0359\u033a\u031c\u0355\u0322\u031fR\u0337\u0312\u0344\u0357\u030b\u0313\u0312\u031e\u031d\u0326\u0326\u0316O\u0335\u0309\u035d\u031a\u0304\u035a\u0323\u031c\u0349\u0347\u0318\u032b\u0333\u0326\u032dR\u0335\u0342\u030b\u0302\u034c\u0340\u0350\u0343\u034c\u0342\u0306\u0331\u035a\u0329\u0348\u0316\u0319\u032c\u033b\u03244\u0338\u0352\u0351\u0310\u033f\u035b\u030a\u0352\u035d\u035d\u0304\u0330\u033b\u031d\u0330\u035a\u0354\u031c2\u0336\u0360\u0344\u033d\u0315\u0309\u033d\u0317\u0347\u0359\u0330\u035a\u0328\u032f\u0328\u032b2\u0336\u0341\u031a\u0351\u034c\u030b\u030c\u0312\u032d\u031c\u0322\u032d\u0349\u031f\u0333\u0354\u035c\u0317\u033b");
        frame.setBackground(Color.BLACK);
        object2 = new JPanel();
        frame.setLayout(new BorderLayout());
        ((JComponent)object2).setPreferredSize(new Dimension(854, 480));
        frame.add((Component)object2, "Center");
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.addWindowListener(new fjc());
        object = new ALq(hashMap);
        FWm fWm = new FWm();
        fWm.setStub((AppletStub)object);
        ((Container)object).setLayout(new BorderLayout());
        ((Container)object).add((Component)fWm, "Center");
        ((Container)object).validate();
        frame.removeAll();
        frame.setLayout(new BorderLayout());
        frame.add((Component)object, "Center");
        frame.validate();
        fWm.init();
        for (Object obj : arrayList) {String string4 = (String) obj;
            Minecraft.method_81a5f12e_Dne().method_230e0120_Dne().method_8f501fe4_Dne(string4);
        }
        fWm.start();
        Runtime.getRuntime().addShutdownHook(new arc_0());
    }

    @Override
    public void method_7f31bcb3_FWm(evf evf2) {
        evf2.method_5e295ec0_Dne("opengl_version", GL11.glGetString(7938));
        evf2.method_5e295ec0_Dne("opengl_vendor", GL11.glGetString(7936));
        evf2.method_5e295ec0_Dne("client_brand", Dne.method_eecad346_Dne());
        evf2.method_5e295ec0_Dne("applet", this.field_21261e_FWm);
        ContextCapabilities contextCapabilities = GLContext.getCapabilities();
        evf2.method_5e295ec0_Dne("gl_caps[ARB_multitexture]", contextCapabilities.GL_ARB_multitexture);
        evf2.method_5e295ec0_Dne("gl_caps[ARB_multisample]", contextCapabilities.GL_ARB_multisample);
        evf2.method_5e295ec0_Dne("gl_caps[ARB_texture_cube_map]", contextCapabilities.GL_ARB_texture_cube_map);
        evf2.method_5e295ec0_Dne("gl_caps[ARB_vertex_blend]", contextCapabilities.GL_ARB_vertex_blend);
        evf2.method_5e295ec0_Dne("gl_caps[ARB_matrix_palette]", contextCapabilities.GL_ARB_matrix_palette);
        evf2.method_5e295ec0_Dne("gl_caps[ARB_vertex_program]", contextCapabilities.GL_ARB_vertex_program);
        evf2.method_5e295ec0_Dne("gl_caps[ARB_vertex_shader]", contextCapabilities.GL_ARB_vertex_shader);
        evf2.method_5e295ec0_Dne("gl_caps[ARB_fragment_program]", contextCapabilities.GL_ARB_fragment_program);
        evf2.method_5e295ec0_Dne("gl_caps[ARB_fragment_shader]", contextCapabilities.GL_ARB_fragment_shader);
        evf2.method_5e295ec0_Dne("gl_caps[ARB_shader_objects]", contextCapabilities.GL_ARB_shader_objects);
        evf2.method_5e295ec0_Dne("gl_caps[ARB_vertex_buffer_object]", contextCapabilities.GL_ARB_vertex_buffer_object);
        evf2.method_5e295ec0_Dne("gl_caps[ARB_framebuffer_object]", contextCapabilities.GL_ARB_framebuffer_object);
        evf2.method_5e295ec0_Dne("gl_caps[ARB_pixel_buffer_object]", contextCapabilities.GL_ARB_pixel_buffer_object);
        evf2.method_5e295ec0_Dne("gl_caps[ARB_uniform_buffer_object]", contextCapabilities.GL_ARB_uniform_buffer_object);
        evf2.method_5e295ec0_Dne("gl_caps[ARB_texture_non_power_of_two]", contextCapabilities.GL_ARB_texture_non_power_of_two);
        evf2.method_5e295ec0_Dne("gl_caps[gl_max_vertex_uniforms]", GL11.glGetInteger(35658));
        evf2.method_5e295ec0_Dne("gl_caps[gl_max_fragment_uniforms]", GL11.glGetInteger(35657));
        evf2.method_5e295ec0_Dne("gl_max_texture_size", Minecraft.method_7a46288d_Dne());
    }

    public void method_8288d6ee_IjH() throws IOException {
        if (this.field_2f0dd8_div > 0) {
            --this.field_2f0dd8_div;
        }
        this.field_365731d_Dne.method_8f501fe4_Dne("stats");
        this.field_3673fc1_Dne.method_7c6f6039_FWm();
        this.field_365731d_Dne.method_110c4dc3_FWm("gui");
        if (!this.field_2e5f2c_bzF) {
            this.field_3733694_Dne.method_7a46289a_Dne();
        }
        this.field_365731d_Dne.method_110c4dc3_FWm("pick");
        this.field_36ac6a1_Dne.method_ce7f5266_Dne(1.0f);
        this.field_365731d_Dne.method_110c4dc3_FWm("gameMode");
        if (!this.field_2e5f2c_bzF && this.field_36ebf36_Dne != null) {
            this.field_36c390e_Dne.method_7c6f6039_FWm();
        }
        this.field_36d36bf_Dne.method_8f501fe4_Dne("/terrain.png");
        this.field_365731d_Dne.method_110c4dc3_FWm("textures");
        if (!this.field_2e5f2c_bzF) {
            this.field_36d36bf_Dne.method_7c6f6039_FWm();
        }
        if (this.field_37a7e17_Dne == null && this.field_369f6b6_Dne != null) {
            if (this.field_369f6b6_Dne.method_9a443a8c_XHL() <= 0) {
                this.method_b88fcbd2_Dne(null);
            } else if (this.field_369f6b6_Dne.method_9b310ff4_Wwe() && this.field_36ebf36_Dne != null) {
                this.method_b88fcbd2_Dne(new vmT());
            }
        } else if (this.field_37a7e17_Dne != null && this.field_37a7e17_Dne instanceof vmT && !this.field_369f6b6_Dne.method_9b310ff4_Wwe()) {
            this.method_b88fcbd2_Dne(null);
        }
        if (this.field_37a7e17_Dne != null) {
            this.field_267cf5_Qnq = 10000;
        }
        if (this.field_37a7e17_Dne != null) {
            try {
                this.field_37a7e17_Dne.method_7ad38803_DyG();
            }
            catch (Throwable throwable) {
                McM mcM = McM.method_948e60df_Dne(throwable, "Updating screen events");
                Noo noo = mcM.method_284dc627_Dne("Affected screen");
                noo.method_2aeeb7ad_Dne("Screen name", new aDx(this));
                throw new kaJ(mcM);
            }
            if (this.field_37a7e17_Dne != null) {
                try {
                    this.field_37a7e17_Dne.field_3780a57_Dne.method_7a46289a_Dne();
                }
                catch (Throwable throwable) {
                    McM mcM = McM.method_948e60df_Dne(throwable, "Ticking screen particles");
                    Noo noo = mcM.method_284dc627_Dne("Affected screen");
                    noo.method_2aeeb7ad_Dne("Screen name", new wzj_0(this));
                    throw new kaJ(mcM);
                }
                try {
                    this.field_37a7e17_Dne.method_ae128dc7_bzF();
                }
                catch (Throwable throwable) {
                    McM mcM = McM.method_948e60df_Dne(throwable, "Ticking screen");
                    Noo noo = mcM.method_284dc627_Dne("Affected screen");
                    noo.method_2aeeb7ad_Dne("Screen name", new xEs(this));
                    throw new kaJ(mcM);
                }
            }
        }
        if (this.field_37a7e17_Dne == null || this.field_37a7e17_Dne.field_21261e_FWm) {
            boolean bl;
            this.field_365731d_Dne.method_110c4dc3_FWm("mouse");
            while (Mouse.next() && qxi_0.field_376997d_Dne == null && !qxi_0.field_2092bf_Dne) {
                long l;
                ulE.method_16d0a4b_Dne(Mouse.getEventButton() - 100, Mouse.getEventButtonState());
                if (Mouse.getEventButtonState()) {
                    ulE.method_ce7f5da9_Dne(Mouse.getEventButton() - 100);
                }
                if ((l = Minecraft.method_7a46288e_Dne() - this.field_2092af_Dne) > 200L) continue;
                int n = Mouse.getEventDWheel();
                if (n != 0) {
                    this.field_369f6b6_Dne.field_36a059b_Dne.method_ce7f5da9_Dne(n);
                    if (this.field_3758af7_Dne.field_2569e6_OdI) {
                        if (n > 0) {
                            n = 1;
                        }
                        if (n < 0) {
                            n = -1;
                        }
                        this.field_3758af7_Dne.field_22c5ff_IjH += (float)n * 0.25f;
                    }
                }
                if (this.field_37a7e17_Dne == null) {
                    if (this.field_388db7_zGp || !Mouse.getEventButtonState()) continue;
                    this.method_a98a0660_aFZ();
                    continue;
                }
                if (this.field_37a7e17_Dne == null) continue;
                this.field_37a7e17_Dne.method_907a9d21_Qnq();
            }
            if (this.field_267cf5_Qnq > 0) {
                --this.field_267cf5_Qnq;
            }
            this.field_365731d_Dne.method_110c4dc3_FWm("keyboard");
            while (Keyboard.next() && !qxi_0.field_2092bf_Dne && (qxi_0.field_376997d_Dne != hdK.field_376997d_Dne || this.field_37d0195_Dne == null)) {
                int n;
                ulE.method_16d0a4b_Dne(Keyboard.getEventKey(), Keyboard.getEventKeyState());
                if (Keyboard.getEventKeyState()) {
                    ulE.method_ce7f5da9_Dne(Keyboard.getEventKey());
                }
                if (this.field_267cf6_Qnq > 0L) {
                    if (Minecraft.method_7a46288e_Dne() - this.field_267cf6_Qnq >= 6000L) {
                        throw new kaJ(new McM("Manually triggered debug crash", new Throwable()));
                    }
                    if (!Keyboard.isKeyDown(46) || !Keyboard.isKeyDown(61)) {
                        this.field_267cf6_Qnq = -1L;
                    }
                } else if (Keyboard.isKeyDown(46) && Keyboard.isKeyDown(61)) {
                    this.field_267cf6_Qnq = Minecraft.method_7a46288e_Dne();
                }
                if (!Keyboard.getEventKeyState()) continue;
                if (Keyboard.getEventKey() == 87) {
                    this.method_b0a28144_div();
                    continue;
                }
                if (this.field_37a7e17_Dne != null) {
                    this.field_37a7e17_Dne.method_b0a28144_div();
                } else {
                    if (Keyboard.getEventKey() == 1) {
                        this.method_7ad38803_DyG();
                    }
                    if (Keyboard.getEventKey() == 31 && Keyboard.isKeyDown(61)) {
                        this.method_cc5ef5c0_trS();
                    }
                    if (Keyboard.getEventKey() == 20 && Keyboard.isKeyDown(61)) {
                        this.field_36d36bf_Dne.method_ae128dc7_bzF();
                        this.field_37b59c1_Dne.method_7a46289a_Dne();
                    }
                    if (Keyboard.getEventKey() == 33 && Keyboard.isKeyDown(61)) {
                        boolean bl2 = Keyboard.isKeyDown(42) | Keyboard.isKeyDown(54);
                        this.field_3758af7_Dne.method_461f0d68_Dne(ONk.field_161e16a9_DyG, bl2 ? -1 : 1);
                    }
                    if (Keyboard.getEventKey() == 30 && Keyboard.isKeyDown(61)) {
                        this.field_37b59c1_Dne.method_7a46289a_Dne();
                    }
                    if (Keyboard.getEventKey() == 35 && Keyboard.isKeyDown(61)) {
                        this.field_3758af7_Dne.field_342275_ooe = !this.field_3758af7_Dne.field_342275_ooe;
                        this.field_3758af7_Dne.method_7c6f6039_FWm();
                    }
                    if (Keyboard.getEventKey() == 48 && Keyboard.isKeyDown(61)) {
                        boolean bl3 = ptH.field_2092bf_Dne = !ptH.field_2092bf_Dne;
                    }
                    if (Keyboard.getEventKey() == 25 && Keyboard.isKeyDown(61)) {
                        this.field_3758af7_Dne.field_367165_trS = !this.field_3758af7_Dne.field_367165_trS;
                        this.field_3758af7_Dne.method_7c6f6039_FWm();
                    }
                    if (Keyboard.getEventKey() == 59) {
                        boolean bl4 = this.field_3758af7_Dne.field_2e8497_ceE = !this.field_3758af7_Dne.field_2e8497_ceE;
                    }
                    if (Keyboard.getEventKey() == 61) {
                        this.field_3758af7_Dne.field_212c2c_EyB = !this.field_3758af7_Dne.field_212c2c_EyB;
                        this.field_3758af7_Dne.field_215b47_FfS = qVZ.method_ae128dcb_bzF();
                    }
                    if (Keyboard.getEventKey() == 63) {
                        ++this.field_3758af7_Dne.field_2f0dd8_div;
                        if (this.field_3758af7_Dne.field_2f0dd8_div > 2) {
                            this.field_3758af7_Dne.field_2f0dd8_div = 0;
                        }
                    }
                    if (Keyboard.getEventKey() == 66) {
                        this.field_3758af7_Dne.field_3393ee_oIf = !this.field_3758af7_Dne.field_3393ee_oIf;
                    }
                }
                for (n = 0; n < 9; ++n) {
                    if (Keyboard.getEventKey() != 2 + n) continue;
                    this.field_369f6b6_Dne.field_36a059b_Dne.field_2092ae_Dne = n;
                }
                if (!this.field_3758af7_Dne.field_212c2c_EyB || !this.field_3758af7_Dne.field_215b47_FfS) continue;
                if (Keyboard.getEventKey() == 11) {
                    this.method_117d19ea_FWm(0);
                }
                for (n = 0; n < 9; ++n) {
                    if (Keyboard.getEventKey() != 2 + n) continue;
                    this.method_117d19ea_FWm(n + 1);
                }
            }
            boolean bl5 = bl = this.field_3758af7_Dne.field_267cf5_Qnq != 2;
            while (this.field_3758af7_Dne.field_f0ae5e96_zGp.method_7a46289e_Dne()) {
                this.method_b88fcbd2_Dne(new gTB(this.field_369f6b6_Dne));
            }
            while (this.field_3758af7_Dne.field_162fc8c7_DyG.method_7a46289e_Dne()) {
                this.field_369f6b6_Dne.method_21b69c9d_Dne(qVZ.method_7c6f603d_FWm());
            }
            while (this.field_3758af7_Dne.field_142575c8_div.method_7a46289e_Dne() && bl) {
                this.method_b88fcbd2_Dne(new SlE());
            }
            if (this.field_37a7e17_Dne == null && this.field_3758af7_Dne.field_af0d4819_udO.method_7a46289e_Dne() && bl) {
                this.method_b88fcbd2_Dne(new SlE("/"));
            }
            if (this.field_369f6b6_Dne.method_b6f3e1a2_haP()) {
                if (!this.field_3758af7_Dne.field_1c3e2ddd_XHL.field_2092bf_Dne) {
                    this.field_36c390e_Dne.method_62275396_bzF(this.field_369f6b6_Dne);
                }
                while (this.field_3758af7_Dne.field_7507327c_mrb.method_7a46289e_Dne()) {
                }
                while (this.field_3758af7_Dne.field_1c3e2ddd_XHL.method_7a46289e_Dne()) {
                }
                while (this.field_3758af7_Dne.field_a22cd106_kGO.method_7a46289e_Dne()) {
                }
            } else {
                while (this.field_3758af7_Dne.field_7507327c_mrb.method_7a46289e_Dne()) {
                    this.method_143f9e1c_bzF(0);
                }
                while (this.field_3758af7_Dne.field_1c3e2ddd_XHL.method_7a46289e_Dne()) {
                    this.method_143f9e1c_bzF(1);
                }
                while (this.field_3758af7_Dne.field_a22cd106_kGO.method_7a46289e_Dne()) {
                    this.method_c5287a5e_qLR();
                }
            }
            if (this.field_3758af7_Dne.field_1c3e2ddd_XHL.field_2092bf_Dne && this.field_2f0dd8_div == 0 && !this.field_369f6b6_Dne.method_b6f3e1a2_haP()) {
                this.method_143f9e1c_bzF(1);
            }
            this.method_16d0a4b_Dne(0, this.field_37a7e17_Dne == null && this.field_3758af7_Dne.field_7507327c_mrb.field_2092bf_Dne && this.field_388db7_zGp);
        }
        if (this.field_36ebf36_Dne != null) {
            if (this.field_369f6b6_Dne != null) {
                ++this.field_33448c_mrb;
                if (this.field_33448c_mrb == 30) {
                    this.field_33448c_mrb = 0;
                    this.field_36ebf36_Dne.method_4b7c1628_zGp(this.field_369f6b6_Dne);
                }
            }
            this.field_365731d_Dne.method_110c4dc3_FWm("gameRenderer");
            if (!this.field_2e5f2c_bzF) {
                this.field_36ac6a1_Dne.method_7a46289a_Dne();
            }
            this.field_365731d_Dne.method_110c4dc3_FWm("levelRenderer");
            if (!this.field_2e5f2c_bzF) {
                this.field_37b59c1_Dne.method_7c6f6039_FWm();
            }
            this.field_365731d_Dne.method_110c4dc3_FWm("level");
            if (!this.field_2e5f2c_bzF) {
                if (this.field_36ebf36_Dne.field_267cf5_Qnq > 0) {
                    --this.field_36ebf36_Dne.field_267cf5_Qnq;
                }
                this.field_36ebf36_Dne.method_7c6f6039_FWm();
            }
            if (!this.field_2e5f2c_bzF) {
                this.field_36ebf36_Dne.method_174c49a_Dne(this.field_36ebf36_Dne.field_2d29f4_aFZ > 0, true);
                try {
                    this.field_36ebf36_Dne.method_907a9d21_Qnq();
                }
                catch (Throwable throwable) {
                    McM mcM = McM.method_948e60df_Dne(throwable, "Exception in world tick");
                    if (this.field_36ebf36_Dne == null) {
                        Noo noo = mcM.method_284dc627_Dne("Affected level");
                        noo.method_5e295ec0_Dne("Problem", "Level is null!");
                    } else {
                        this.field_36ebf36_Dne.method_f7903e73_Dne(mcM);
                    }
                    throw new kaJ(mcM);
                }
            }
            this.field_365731d_Dne.method_110c4dc3_FWm("animateTick");
            if (!this.field_2e5f2c_bzF && this.field_36ebf36_Dne != null) {
                this.field_36ebf36_Dne.method_e53317d1_zGp(geR.method_117d0718_FWm(this.field_369f6b6_Dne.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_369f6b6_Dne.field_22c5fd_IjH), geR.method_117d0718_FWm(this.field_369f6b6_Dne.field_334487_mrb));
            }
            this.field_365731d_Dne.method_110c4dc3_FWm("particles");
            if (!this.field_2e5f2c_bzF) {
                this.field_364ffb6_Dne.method_7a46289a_Dne();
            }
        } else if (this.field_36c6f8c_Dne != null) {
            this.field_365731d_Dne.method_110c4dc3_FWm("pendingConnection");
            this.field_36c6f8c_Dne.method_7c6f6039_FWm();
        }
        this.field_365731d_Dne.method_7c6f6039_FWm();
        this.field_2092af_Dne = Minecraft.method_7a46288e_Dne();
    }

    public void method_b0a28144_div() {
        try {
            boolean bl = this.field_2f0de9_div = !this.field_2f0de9_div;
            if (this.field_2f0de9_div) {
                Display.setDisplayMode(Display.getDesktopDisplayMode());
                this.field_2092ae_Dne = Display.getDisplayMode().getWidth();
                this.field_21260d_FWm = Display.getDisplayMode().getHeight();
                if (this.field_2092ae_Dne <= 0) {
                    this.field_2092ae_Dne = 1;
                }
                if (this.field_21260d_FWm <= 0) {
                    this.field_21260d_FWm = 1;
                }
            } else {
                if (this.field_7c679bf6_Dne != null) {
                    this.field_2092ae_Dne = this.field_7c679bf6_Dne.getWidth();
                    this.field_21260d_FWm = this.field_7c679bf6_Dne.getHeight();
                } else {
                    this.field_2092ae_Dne = this.field_2d29f4_aFZ;
                    this.field_21260d_FWm = this.field_388da6_zGp;
                }
                if (this.field_2092ae_Dne <= 0) {
                    this.field_2092ae_Dne = 1;
                }
                if (this.field_21260d_FWm <= 0) {
                    this.field_21260d_FWm = 1;
                }
            }
            if (this.field_37a7e17_Dne != null) {
                this.method_16cca7a_Dne(this.field_2092ae_Dne, this.field_21260d_FWm);
            }
            Display.setFullscreen(this.field_2f0de9_div);
            Display.setVSyncEnabled(this.field_3758af7_Dne.field_31b827_kGO);
            Display.update();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public boolean method_8f501fe8_Dne(String string) {
        return !string.startsWith("/") ? false : false;
    }

    private void method_8f501fe4_Dne(String string) {
        int n = GL11.glGetError();
        if (n != 0) {
            String string2 = GLU.gluErrorString(n);
            this.method_230e0120_Dne().method_47a073d1_bzF("########## GL ERROR ##########");
            this.method_230e0120_Dne().method_47a073d1_bzF("@ " + string);
            this.method_230e0120_Dne().method_47a073d1_bzF(n + ": " + string2);
        }
    }

    public static boolean method_ae128dcb_bzF() {
        return field_493682ed_Dne != null && Minecraft.field_493682ed_Dne.field_3758af7_Dne.field_2d2a05_aFZ;
    }

    public void method_ae128dc7_bzF() {
        try {
            field_3f1c582_Dne = new byte[0];
            this.field_37b59c1_Dne.method_ae128dc7_bzF();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        try {
            System.gc();
            bSp.method_23186cf1_Dne().method_7c6f6039_FWm();
            this.field_36ebf36_Dne.method_23186a47_Dne().method_7c6f6039_FWm();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        try {
            System.gc();
            this.method_8c784131_Dne(null);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        System.gc();
    }

    public zHD method_2317ec95_Dne() {
        return this.field_37e5e36_Dne;
    }

    public Minecraft(Canvas canvas, FWm fWm, int n, int n2, boolean bl) {
        this.field_366e94b_Dne = new EsO(20.0f);
        this.field_3758337_Dne = new evf("client", this);
        this.field_3788296_Dne = new mKT();
        this.field_2092af_Dne = Minecraft.method_7a46288e_Dne();
        this.field_365731d_Dne = new Bkx();
        this.field_21260e_FWm = Minecraft.method_7a46288e_Dne();
        trP.method_7a46289a_Dne();
        this.field_388da6_zGp = n2;
        this.field_2f0de9_div = bl;
        this.field_ba5595f_FWm = fWm;
        rXx.field_2092ae_Dne = Short.MAX_VALUE;
        this.method_9feec6c2_Zpi();
        this.field_7c679bf6_Dne = canvas;
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_2f0de9_div = bl;
        field_493682ed_Dne = this;
        zpX.method_7a46289a_Dne();
        this.field_36dbda5_Dne = new tsf_0(this);
    }

    public String method_d1f1ed87_FWm() {
        return this.field_37b59c1_Dne.method_d1f1ed87_FWm();
    }

    public fzy method_230f9746_Dne() {
        return this.field_369f6b6_Dne != null ? this.field_369f6b6_Dne.field_37608e7_Dne : null;
    }

    public void method_81abe0bb_Dne(VzZ vzZ, String string) {
        this.field_3673fc1_Dne.method_7a46289a_Dne();
        if (vzZ == null) {
            fzy fzy2 = this.method_230f9746_Dne();
            if (fzy2 != null) {
                fzy2.method_7a46289a_Dne();
            }
            if (this.field_36c6f8c_Dne != null) {
                this.field_36c6f8c_Dne.method_907a9d21_Qnq();
            }
            if (this.field_37e5e36_Dne != null) {
                this.field_37e5e36_Dne.method_ae128dc7_bzF();
            }
            this.field_37e5e36_Dne = null;
        }
        this.field_366ec33_Dne = null;
        this.field_36c6f8c_Dne = null;
        if (this.field_364ea47_Dne != null) {
            this.field_364ea47_Dne.method_8f501fe4_Dne(string);
            this.field_364ea47_Dne.method_a9a920ab_Qnq("");
        }
        if (vzZ == null && this.field_36ebf36_Dne != null) {
            if (this.field_373a352_Dne.method_7a46289e_Dne()) {
                this.field_373a352_Dne.method_7a46289a_Dne();
            }
            this.method_a5b17c94_Dne(null);
            this.field_29187e_XHL = false;
        }
        this.field_3788296_Dne.method_7ec1955c_Dne(null, 0.0f, 0.0f, 0.0f);
        this.field_3788296_Dne.method_907a9d21_Qnq();
        this.field_36ebf36_Dne = vzZ;
        if (vzZ != null) {
            if (this.field_37b59c1_Dne != null) {
                this.field_37b59c1_Dne.method_8c784131_Dne(vzZ);
            }
            if (this.field_364ffb6_Dne != null) {
                this.field_364ffb6_Dne.method_83516093_Dne(vzZ);
            }
            if (this.field_369f6b6_Dne == null) {
                this.field_369f6b6_Dne = this.field_36c390e_Dne.method_c350188e_Dne(vzZ);
                this.field_36c390e_Dne.method_49863864_FWm(this.field_369f6b6_Dne);
            }
            this.field_369f6b6_Dne.method_73aaafc3_ATE();
            vzZ.method_94d18be5_FWm(this.field_369f6b6_Dne);
            this.field_369f6b6_Dne.field_375ce2c_Dne = new Vmi(this.field_3758af7_Dne);
            this.field_36c390e_Dne.method_703284a3_Dne(this.field_369f6b6_Dne);
            this.field_366ec33_Dne = this.field_369f6b6_Dne;
        } else {
            this.field_36fdc63_Dne.method_7a46289a_Dne();
            this.field_369f6b6_Dne = null;
        }
        System.gc();
        this.field_2092af_Dne = 0L;
    }

    private void method_117d19ea_FWm(int n) {
        List list = this.field_365731d_Dne.method_b6fd6de3_Dne(this.field_9e60dbde_Qnq);
        if (list != null && !list.isEmpty()) {
            Gup gup = (Gup)list.remove(0);
            if (n == 0) {
                int n2;
                if (gup.field_569fcf45_Dne.length() > 0 && (n2 = this.field_9e60dbde_Qnq.lastIndexOf(".")) >= 0) {
                    this.field_9e60dbde_Qnq = this.field_9e60dbde_Qnq.substring(0, n2);
                }
            } else if (--n < list.size() && !((Gup)list.get((int)n)).field_569fcf45_Dne.equals("unspecified")) {
                if (this.field_9e60dbde_Qnq.length() > 0) {
                    this.field_9e60dbde_Qnq = this.field_9e60dbde_Qnq + ".";
                }
                this.field_9e60dbde_Qnq = this.field_9e60dbde_Qnq + ((Gup)list.get((int)n)).field_569fcf45_Dne;
            }
        }
    }

    public void method_7ad38803_DyG() {
        if (this.field_37a7e17_Dne == null) {
            if (!qxi_0.field_2092bf_Dne && qxi_0.field_376997d_Dne == null) {
                this.method_b88fcbd2_Dne(new bze());
            }
            if (this.method_7ad38807_DyG() && !this.field_37e5e36_Dne.method_59ee19d_c_()) {
                this.field_3788296_Dne.method_a98a0660_aFZ();
            }
        }
    }

    public static File method_9189e6b3_Dne() {
        if (field_fd16d933_FWm == null) {
            field_fd16d933_FWm = Minecraft.method_fac597a9_Dne("minecraft");
        }
        return field_fd16d933_FWm;
    }

    @Override
    public void method_a5de08f2_Dne(evf evf2) {
        evf2.method_5e295ec0_Dne("fps", field_20b857_DyG);
        evf2.method_5e295ec0_Dne("texpack_name", this.field_373a352_Dne.method_230121cd_Dne().method_d1f1ed87_FWm());
        evf2.method_5e295ec0_Dne("vsync_enabled", this.field_3758af7_Dne.field_31b827_kGO);
        evf2.method_5e295ec0_Dne("display_frequency", Display.getDisplayMode().getFrequency());
        evf2.method_5e295ec0_Dne("display_type", this.field_2f0de9_div ? "fullscreen" : "windowed");
        if (this.field_37e5e36_Dne != null && this.field_37e5e36_Dne.method_230f1196_Dne() != null) {
            evf2.method_5e295ec0_Dne("snooper_partner", this.field_37e5e36_Dne.method_230f1196_Dne().method_eecad346_Dne());
        }
    }

    public void method_14d1ad6_Dne(String string, String string2, mrb mrb2) {
        Object object;
        this.method_8c784131_Dne(null);
        System.gc();
        iDE iDE2 = this.field_36fdc63_Dne.method_c5a32f37_Dne(string, false);
        xoY xoY2 = iDE2.method_231798c9_Dne();
        if (xoY2 == null && mrb2 != null) {
            this.field_3673fc1_Dne.method_df3461c5_Dne(trP.field_20260a22_FWm, 1);
            xoY2 = new xoY(mrb2, string);
            iDE2.method_c5e18f65_Dne(xoY2);
        }
        if (mrb2 == null) {
            mrb2 = new mrb(xoY2);
        }
        this.field_3673fc1_Dne.method_df3461c5_Dne(trP.field_36c3e43_Dne, 1);
        this.field_37e5e36_Dne = new zHD(this, string, string2, mrb2);
        this.field_37e5e36_Dne.method_8288d6ee_IjH();
        this.field_29187e_XHL = true;
        this.field_364ea47_Dne.method_110c4dc3_FWm(KGL.method_39193c_Dne("menu.loadingLevel"));
        while (!this.field_37e5e36_Dne.method_ae9f0476_ceE()) {
            object = this.field_37e5e36_Dne.method_3c9d12fd_DyG();
            if (object != null) {
                this.field_364ea47_Dne.method_a9a920ab_Qnq(KGL.method_39193c_Dne((String)object));
            } else {
                this.field_364ea47_Dne.method_a9a920ab_Qnq("");
            }
            try {
                Thread.sleep(200L);
            }
            catch (InterruptedException interruptedException) {}
        }
        this.method_b88fcbd2_Dne(null);
        try {
            object = new fzy(this, this.field_37e5e36_Dne);
            this.field_36c6f8c_Dne = ((fzy)object).method_2305fdeb_Dne();
        }
        catch (IOException iOException) {
            this.method_6dc76d23_bzF(this.method_f78f98ea_Dne(new McM("Connecting to integrated server", iOException)));
        }
    }

    private void method_baa39402_kGO() throws LWJGLException {
        this.field_3758af7_Dne.field_2e5f2c_bzF = false;
        IJm iJm = new IJm(this.field_3758af7_Dne, this.field_2092ae_Dne, this.field_21260d_FWm);
        GL11.glClear(16640);
        GL11.glMatrixMode(5889);
        GL11.glLoadIdentity();
        GL11.glOrtho(0.0, iJm.method_7a462888_Dne(), iJm.method_7c6f6027_FWm(), 0.0, 1000.0, 3000.0);
        GL11.glMatrixMode(5888);
        GL11.glLoadIdentity();
        GL11.glTranslatef(0.0f, 0.0f, -2000.0f);
        GL11.glViewport(0, 0, this.field_2092ae_Dne, this.field_21260d_FWm);
        GL11.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GL11.glDisable(2896);
        GL11.glEnable(3553);
        GL11.glDisable(2912);
        WAR wAR = WAR.field_36e5ca4_Dne;
        this.field_36d36bf_Dne.method_8f501fe4_Dne("/title/mojang.png");
        wAR.method_7a46289a_Dne();
        wAR.method_143f9e1c_bzF(0xFFFFFF);
        wAR.method_c38c5864_Dne(0.0, this.field_21260d_FWm, 0.0, 0.0, 0.0);
        wAR.method_c38c5864_Dne(this.field_2092ae_Dne, this.field_21260d_FWm, 0.0, 0.0, 0.0);
        wAR.method_c38c5864_Dne(this.field_2092ae_Dne, 0.0, 0.0, 0.0, 0.0);
        wAR.method_c38c5864_Dne(0.0, 0.0, 0.0, 0.0, 0.0);
        wAR.method_7a46288d_Dne();
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        wAR.method_143f9e1c_bzF(0xFFFFFF);
        int n = 256;
        int n2 = 256;
        this.method_c6b5263a_Dne((iJm.method_7a46288d_Dne() - n) / 2, (iJm.method_7c6f602c_FWm() - n2) / 2, 0, 0, n, n2);
        GL11.glDisable(2896);
        GL11.glDisable(2912);
        GL11.glEnable(3008);
        GL11.glAlphaFunc(516, 0.1f);
        Display.swapBuffers();
    }

    private void method_cc5ef5c0_trS() {
        this.method_230e0120_Dne().method_8f501fe4_Dne("FORCING RELOAD!");
        if (this.field_3788296_Dne != null) {
            this.field_3788296_Dne.method_907a9d21_Qnq();
        }
        this.field_3788296_Dne = new mKT();
        this.field_3788296_Dne.method_a5fb20b2_Dne(this.field_3758af7_Dne);
        this.field_36f4923_Dne.method_7a46289a_Dne();
    }

    public void method_6dc76d23_bzF(McM mcM) {
        this.field_2092bf_Dne = true;
        this.method_7bd29e30_Dne(mcM);
    }

    public void method_ce7f5da9_Dne(int n) {
        this.field_36ebf36_Dne.method_7a46289a_Dne();
        this.field_36ebf36_Dne.method_9feec6c2_Zpi();
        int n2 = 0;
        if (this.field_369f6b6_Dne != null) {
            n2 = this.field_369f6b6_Dne.field_2d29f4_aFZ;
            this.field_36ebf36_Dne.method_ad72a713_bzF(this.field_369f6b6_Dne);
        }
        this.field_366ec33_Dne = null;
        this.field_369f6b6_Dne = this.field_36c390e_Dne.method_c350188e_Dne(this.field_36ebf36_Dne);
        this.field_369f6b6_Dne.field_348572_qLR = n;
        this.field_366ec33_Dne = this.field_369f6b6_Dne;
        this.field_369f6b6_Dne.method_73aaafc3_ATE();
        this.field_36ebf36_Dne.method_94d18be5_FWm(this.field_369f6b6_Dne);
        this.field_36c390e_Dne.method_49863864_FWm(this.field_369f6b6_Dne);
        this.field_369f6b6_Dne.field_375ce2c_Dne = new Vmi(this.field_3758af7_Dne);
        this.field_369f6b6_Dne.field_2d29f4_aFZ = n2;
        this.field_36c390e_Dne.method_703284a3_Dne(this.field_369f6b6_Dne);
        if (this.field_37a7e17_Dne instanceof YcA) {
            this.method_b88fcbd2_Dne(null);
        }
    }

    private void method_ce7f616a_Dne(long l) {
        if (this.field_365731d_Dne.field_2092bf_Dne) {
            int n;
            int n2;
            Object object;
            List list = this.field_365731d_Dne.method_b6fd6de3_Dne(this.field_9e60dbde_Qnq);
            Gup gup = (Gup)list.remove(0);
            GL11.glClear(256);
            GL11.glMatrixMode(5889);
            GL11.glEnable(2903);
            GL11.glLoadIdentity();
            GL11.glOrtho(0.0, this.field_2092ae_Dne, this.field_21260d_FWm, 0.0, 1000.0, 3000.0);
            GL11.glMatrixMode(5888);
            GL11.glLoadIdentity();
            GL11.glTranslatef(0.0f, 0.0f, -2000.0f);
            GL11.glLineWidth(1.0f);
            GL11.glDisable(3553);
            WAR wAR = WAR.field_36e5ca4_Dne;
            int n3 = 160;
            int n4 = this.field_2092ae_Dne - n3 - 10;
            int n5 = this.field_21260d_FWm - n3 * 2;
            GL11.glEnable(3042);
            wAR.method_7a46289a_Dne();
            wAR.method_16cca7a_Dne(0, 200);
            wAR.method_2be429a4_Dne((float)n4 - (float)n3 * 1.1f, (float)n5 - (float)n3 * 0.6f - 16.0f, 0.0);
            wAR.method_2be429a4_Dne((float)n4 - (float)n3 * 1.1f, n5 + n3 * 2, 0.0);
            wAR.method_2be429a4_Dne((float)n4 + (float)n3 * 1.1f, n5 + n3 * 2, 0.0);
            wAR.method_2be429a4_Dne((float)n4 + (float)n3 * 1.1f, (float)n5 - (float)n3 * 0.6f - 16.0f, 0.0);
            wAR.method_7a46288d_Dne();
            GL11.glDisable(3042);
            double d = 0.0;
            for (int i = 0; i < list.size(); ++i) {
                float f;
                float f2;
                float f3;
                object = (Gup)list.get(i);
                n2 = geR.method_117d0718_FWm(((Gup)object).field_2092a9_Dne / 4.0) + 1;
                wAR.method_ce7f5da9_Dne(6);
                wAR.method_143f9e1c_bzF(((Gup)object).method_7a46288d_Dne());
                wAR.method_2be429a4_Dne(n4, n5, 0.0);
                for (n = n2; n >= 0; --n) {
                    f3 = (float)((d + ((Gup)object).field_2092a9_Dne * (double)n / (double)n2) * Math.PI * 2.0 / 100.0);
                    f2 = geR.method_ce7f5256_Dne(f3) * (float)n3;
                    f = geR.method_117d0e97_FWm(f3) * (float)n3 * 0.5f;
                    wAR.method_2be429a4_Dne((float)n4 + f2, (float)n5 - f, 0.0);
                }
                wAR.method_7a46288d_Dne();
                wAR.method_ce7f5da9_Dne(5);
                wAR.method_143f9e1c_bzF((((Gup)object).method_7a46288d_Dne() & 0xFEFEFE) >> 1);
                for (n = n2; n >= 0; --n) {
                    f3 = (float)((d + ((Gup)object).field_2092a9_Dne * (double)n / (double)n2) * Math.PI * 2.0 / 100.0);
                    f2 = geR.method_ce7f5256_Dne(f3) * (float)n3;
                    f = geR.method_117d0e97_FWm(f3) * (float)n3 * 0.5f;
                    wAR.method_2be429a4_Dne((float)n4 + f2, (float)n5 - f, 0.0);
                    wAR.method_2be429a4_Dne((float)n4 + f2, (float)n5 - f + 10.0f, 0.0);
                }
                wAR.method_7a46288d_Dne();
                d += ((Gup)object).field_2092a9_Dne;
            }
            DecimalFormat decimalFormat = new DecimalFormat("##0.00");
            GL11.glEnable(3553);
            object = "";
            if (!gup.field_569fcf45_Dne.equals("unspecified")) {
                object = (String)object + "[0] ";
            }
            object = gup.field_569fcf45_Dne.length() == 0 ? (String)object + "ROOT " : (String)object + gup.field_569fcf45_Dne + " ";
            n2 = 0xFFFFFF;
            this.field_3791671_Dne.method_7eed4432_Dne((String)object, n4 - n3, n5 - n3 / 2 - 16, n2);
            object = decimalFormat.format(gup.field_212608_FWm) + "%";
            this.field_3791671_Dne.method_7eed4432_Dne((String)object, n4 + n3 - this.field_3791671_Dne.method_8f501fd7_Dne((String)object), n5 - n3 / 2 - 16, n2);
            for (n = 0; n < list.size(); ++n) {
                Gup gup2 = (Gup)list.get(n);
                String string = "";
                string = gup2.field_569fcf45_Dne.equals("unspecified") ? string + "[?] " : string + "[" + (n + 1) + "] ";
                string = string + gup2.field_569fcf45_Dne;
                this.field_3791671_Dne.method_7eed4432_Dne(string, n4 - n3, n5 + n3 / 2 + n * 8 + 20, gup2.method_7a46288d_Dne());
                string = decimalFormat.format(gup2.field_2092a9_Dne) + "%";
                this.field_3791671_Dne.method_7eed4432_Dne(string, n4 + n3 - 50 - this.field_3791671_Dne.method_8f501fd7_Dne(string), n5 + n3 / 2 + n * 8 + 20, gup2.method_7a46288d_Dne());
                string = decimalFormat.format(gup2.field_212608_FWm) + "%";
                this.field_3791671_Dne.method_7eed4432_Dne(string, n4 + n3 - this.field_3791671_Dne.method_8f501fd7_Dne(string), n5 + n3 / 2 + n * 8 + 20, gup2.method_7a46288d_Dne());
            }
        }
    }

    private void method_9feec6c2_Zpi() {
        tAS tAS2 = new tAS(this, "Timer hack thread");
        tAS2.setDaemon(true);
        tAS2.start();
    }

    private void method_143f9e1c_bzF(int n) {
        if (n != 0 || this.field_267cf5_Qnq <= 0) {
            NMq nMq;
            if (n == 0) {
                this.field_369f6b6_Dne.method_ae128dc7_bzF();
            }
            if (n == 1) {
                this.field_2f0dd8_div = 4;
            }
            boolean bl = true;
            NMq nMq2 = this.field_369f6b6_Dne.field_36a059b_Dne.method_23040479_Dne();
            if (this.field_37d0195_Dne == null) {
                if (n == 0 && this.field_36c390e_Dne.method_907a9d25_Qnq()) {
                    this.field_267cf5_Qnq = 10;
                }
            } else if (this.field_37d0195_Dne.field_376443d_Dne == gks.field_2030101c_FWm) {
                if (n == 0) {
                    this.field_36c390e_Dne.method_a64699b7_Dne(this.field_369f6b6_Dne, this.field_37d0195_Dne.field_37b45e5_Dne);
                }
                if (n == 1 && this.field_36c390e_Dne.method_a64699bb_Dne(this.field_369f6b6_Dne, this.field_37d0195_Dne.field_37b45e5_Dne)) {
                    bl = false;
                }
            } else if (this.field_37d0195_Dne.field_376443d_Dne == gks.field_376443d_Dne) {
                int n2 = this.field_37d0195_Dne.field_2092ae_Dne;
                int n3 = this.field_37d0195_Dne.field_21260d_FWm;
                int n4 = this.field_37d0195_Dne.field_2e5f1b_bzF;
                int n5 = this.field_37d0195_Dne.field_267cf5_Qnq;
                if (n == 0) {
                    this.field_36c390e_Dne.method_5972745a_Dne(n2, n3, n4, this.field_37d0195_Dne.field_267cf5_Qnq);
                } else {
                    int n6;
                    int n7 = n6 = nMq2 != null ? nMq2.field_2092ae_Dne : 0;
                    if (this.field_36c390e_Dne.method_851a377_Dne(this.field_369f6b6_Dne, this.field_36ebf36_Dne, nMq2, n2, n3, n4, n5, this.field_37d0195_Dne.field_3746303_Dne)) {
                        bl = false;
                        this.field_369f6b6_Dne.method_ae128dc7_bzF();
                    }
                    if (nMq2 == null) {
                        return;
                    }
                    if (nMq2.field_2092ae_Dne == 0) {
                        this.field_369f6b6_Dne.field_36a059b_Dne.field_8360c375_Dne[this.field_369f6b6_Dne.field_36a059b_Dne.field_2092ae_Dne] = null;
                    } else if (nMq2.field_2092ae_Dne != n6 || this.field_36c390e_Dne.method_a98a0664_aFZ()) {
                        this.field_36ac6a1_Dne.field_36fa224_Dne.method_7c6f6039_FWm();
                    }
                }
            }
            if (bl && n == 1 && (nMq = this.field_369f6b6_Dne.field_36a059b_Dne.method_23040479_Dne()) != null && this.field_36c390e_Dne.method_d0db4f89_Dne(this.field_369f6b6_Dne, this.field_36ebf36_Dne, nMq)) {
                this.field_36ac6a1_Dne.field_36fa224_Dne.method_ae128dc7_bzF();
            }
        }
    }

    public YiY method_23096ac2_Dne() {
        return this.field_36fdc63_Dne;
    }

    public static File method_fac597a9_Dne(String string) {
        File file;
        String string2 = System.getProperty("user.home", ".");
        switch (Ext.field_3f1c589_Dne[Minecraft.method_230980ad_Dne().ordinal()]) {
            case 1: 
            case 2: {
                file = new File(string2, '.' + string + '/');
                break;
            }
            case 3: {
                String string3 = System.getenv("APPDATA");
                if (string3 != null) {
                    file = new File(string3, "." + string + '/');
                    break;
                }
                file = new File(string2, '.' + string + '/');
                break;
            }
            case 4: {
                file = new File(string2, "Library/Application Support/" + string);
                break;
            }
            default: {
                file = new File(string2, string + '/');
            }
        }
        if (!file.exists() && !file.mkdirs()) {
            throw new RuntimeException("The working directory could not be created: " + file);
        }
        return file;
    }

    void method_ce7f9d7a_Dne(boolean bl) {
        this.field_33449d_mrb = bl;
    }

    public String method_eecad346_Dne() {
        return this.field_37b59c1_Dne.method_eecad346_Dne();
    }

    private int method_7c6f602c_FWm() {
        return this.field_37a7e17_Dne != null && this.field_37a7e17_Dne instanceof MKS ? 2 : this.field_3758af7_Dne.field_21260d_FWm;
    }

    private void method_cd4cb3d5_udO() throws IOException {
        if (this.field_ba5595f_FWm != null && !this.field_ba5595f_FWm.isActive()) {
            this.field_20b868_DyG = false;
        } else {
            bSp.method_23186cf1_Dne().method_7a46289a_Dne();
            if (this.field_36ebf36_Dne != null) {
                this.field_36ebf36_Dne.method_23186a47_Dne().method_7a46289a_Dne();
            }
            this.field_365731d_Dne.method_8f501fe4_Dne("root");
            if (this.field_7c679bf6_Dne == null && Display.isCloseRequested()) {
                this.method_907a9d21_Qnq();
            }
            if (this.field_2e5f2c_bzF && this.field_36ebf36_Dne != null) {
                float f = this.field_366e94b_Dne.field_21260a_FWm;
                this.field_366e94b_Dne.method_7a46289a_Dne();
                this.field_366e94b_Dne.field_21260a_FWm = f;
            } else {
                this.field_366e94b_Dne.method_7a46289a_Dne();
            }
            long l = System.nanoTime();
            this.field_365731d_Dne.method_8f501fe4_Dne("tick");
            for (int i = 0; i < this.field_366e94b_Dne.field_2092ae_Dne; ++i) {
                this.method_8288d6ee_IjH();
            }
            this.field_365731d_Dne.method_110c4dc3_FWm("preRenderErrors");
            long l2 = System.nanoTime() - l;
            this.method_8f501fe4_Dne("Pre render");
            zVu.field_2092bf_Dne = this.field_3758af7_Dne.field_2d2a05_aFZ;
            this.field_365731d_Dne.method_110c4dc3_FWm("sound");
            this.field_3788296_Dne.method_740ba292_Dne(this.field_369f6b6_Dne, this.field_366e94b_Dne.field_21260a_FWm);
            if (!this.field_2e5f2c_bzF) {
                this.field_3788296_Dne.method_7ad38803_DyG();
            }
            this.field_365731d_Dne.method_7c6f6039_FWm();
            this.field_365731d_Dne.method_8f501fe4_Dne("render");
            this.field_365731d_Dne.method_8f501fe4_Dne("display");
            GL11.glEnable(3553);
            if (!Keyboard.isKeyDown(65)) {
                Display.update();
            }
            if (this.field_369f6b6_Dne != null && this.field_369f6b6_Dne.method_c3b4a2d4_ooe()) {
                this.field_3758af7_Dne.field_2f0dd8_div = 0;
            }
            this.field_365731d_Dne.method_7c6f6039_FWm();
            if (!this.field_267d06_Qnq) {
                this.field_365731d_Dne.method_110c4dc3_FWm("gameRenderer");
                this.field_36ac6a1_Dne.method_117d0ea7_FWm(this.field_366e94b_Dne.field_21260a_FWm);
                this.field_365731d_Dne.method_7c6f6039_FWm();
            }
            GL11.glFlush();
            this.field_365731d_Dne.method_7c6f6039_FWm();
            if (!Display.isActive() && this.field_2f0de9_div) {
                this.method_b0a28144_div();
            }
            if (this.field_3758af7_Dne.field_212c2c_EyB && this.field_3758af7_Dne.field_215b47_FfS) {
                if (!this.field_365731d_Dne.field_2092bf_Dne) {
                    this.field_365731d_Dne.method_7a46289a_Dne();
                }
                this.field_365731d_Dne.field_2092bf_Dne = true;
                this.method_ce7f616a_Dne(l2);
            } else {
                this.field_365731d_Dne.field_2092bf_Dne = false;
                this.field_2e5f1c_bzF = System.nanoTime();
            }
            this.field_36dbda5_Dne.method_7a46289a_Dne();
            this.field_365731d_Dne.method_8f501fe4_Dne("root");
            Thread.yield();
            if (Keyboard.isKeyDown(65)) {
                Display.update();
            }
            this.method_c3b4a2d0_ooe();
            if (!(this.field_7c679bf6_Dne == null || this.field_2f0de9_div || this.field_7c679bf6_Dne.getWidth() == this.field_2092ae_Dne && this.field_7c679bf6_Dne.getHeight() == this.field_21260d_FWm)) {
                this.field_2092ae_Dne = this.field_7c679bf6_Dne.getWidth();
                this.field_21260d_FWm = this.field_7c679bf6_Dne.getHeight();
                if (this.field_2092ae_Dne <= 0) {
                    this.field_2092ae_Dne = 1;
                }
                if (this.field_21260d_FWm <= 0) {
                    this.field_21260d_FWm = 1;
                }
                this.method_16cca7a_Dne(this.field_2092ae_Dne, this.field_21260d_FWm);
            }
            this.method_8f501fe4_Dne("Post render");
            ++this.field_2e5f1b_bzF;
            boolean bl = this.field_2e5f2c_bzF;
            boolean bl2 = this.field_2e5f2c_bzF = this.method_7ad38807_DyG() && this.field_37a7e17_Dne != null && this.field_37a7e17_Dne.method_7a46289e_Dne() && !this.field_37e5e36_Dne.method_59ee19d_c_();
            if (this.method_d44b4596_zGp() && this.field_369f6b6_Dne != null && this.field_369f6b6_Dne.field_37608e7_Dne != null && this.field_2e5f2c_bzF != bl) {
                ((bqd)this.field_369f6b6_Dne.field_37608e7_Dne.method_2305fdeb_Dne()).method_ce7f9d7a_Dne(this.field_2e5f2c_bzF);
            }
            while (Minecraft.method_7a46288e_Dne() >= this.field_21260e_FWm + 1000L) {
                field_20b857_DyG = this.field_2e5f1b_bzF;
                this.field_d9a85c6_FWm = field_20b857_DyG + " fps, " + snt.field_2092ae_Dne + " chunk updates";
                snt.field_2092ae_Dne = 0;
                this.field_21260e_FWm += 1000L;
                this.field_2e5f1b_bzF = 0;
                this.field_3758337_Dne.method_7c6f6039_FWm();
                if (this.field_3758337_Dne.method_7a46289e_Dne()) continue;
                this.field_3758337_Dne.method_7a46289a_Dne();
            }
            this.field_365731d_Dne.method_7c6f6039_FWm();
            if (this.method_7c6f602c_FWm() > 0) {
                Display.sync(OEA.method_ce7f5d9c_Dne(this.method_7c6f602c_FWm()));
            }
        }
    }
    
    static {
    	ImageIO.setUseCache(false);
    }
}

