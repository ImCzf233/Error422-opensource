package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;

public class fZI {
    public float field_267cf2_Qnq = 1.0f;
    public int field_20b857_DyG = 2;
    public float field_2e5f18_bzF = 0.5f;
    public int field_33448c_mrb = 0;
    public float field_334489_mrb = 1.0f;
    private File field_d102ba32_Dne;
    public boolean field_36e4eb_vSL = false;
    public ulE field_7507327c_mrb;
    public ulE field_142575c8_div;
    public boolean field_3393ee_oIf = false;
    public ulE field_a22cd106_kGO;
    public boolean field_212c2c_EyB = false;
    public float field_388da3_zGp = 1.0f;
    public String field_c480ca78_bzF = "en_US";
    public ulE[] field_8372ecf9_Dne;
    public float field_2f0dd5_div = 1.0f;
    public boolean field_2569e6_OdI = false;
    public float field_2d29f1_aFZ = 1.0f;
    public boolean field_215b47_FfS = false;
    public boolean field_22c613_IjH = true;
    public String field_d9a85c6_FWm = "";
    public boolean field_367165_trS = true;
    public ulE field_714023e4_aFZ;
    public int field_22c602_IjH = 0;
    public ulE field_20366b7d_FWm;
    public boolean field_21261e_FWm = true;
    public int field_2f0dd8_div = 0;
    public boolean field_2e5f2c_bzF = false;
    public int field_388da6_zGp = 0;
    public boolean field_388db7_zGp = true;
    public boolean field_2f0de9_div = true;
    public boolean field_348583_qLR = true;
    public boolean field_36b0ba_udO = false;
    public ulE field_37c9f9e_Dne = new ulE("key.forward", 17);
    public int field_2e5f1b_bzF = 2;
    public float field_21260a_FWm = 1.0f;
    public int field_21260d_FWm = 1;
    public int field_2092ae_Dne = 0;
    public boolean field_2e8497_ceE = false;
    public boolean field_33449d_mrb = true;
    private static final String[] field_f5e54dca_Dne = new String[]{"options.renderDistance.far", "options.renderDistance.normal", "options.renderDistance.short", "options.renderDistance.tiny"};
    public boolean field_20b868_DyG = true;
    private static final String[] field_1e416769_FWm = new String[]{"options.difficulty.peaceful", "options.difficulty.easy", "options.difficulty.normal", "options.difficulty.hard"};
    public boolean field_2a9ae7_Zpi = false;
    public ulE field_af0d4819_udO;
    public boolean field_342275_ooe = false;
    public ulE field_1c3e2ddd_XHL;
    public boolean field_31b827_kGO = true;
    private static final String[] field_4730df90_aFZ;
    private static final String[] field_4423b8f7_bzF;
    public ulE field_f0ae5e96_zGp;
    public float field_2a9ad3_Zpi = 0.0f;
    private static final String[] field_5b80bb33_DyG;
    public boolean field_2092bf_Dne = false;
    private static final String[] field_5ec17ac2_zGp;
    public ulE field_617653c6_Zpi;
    public ulE field_75c46d8b_bzF;
    public String field_569fcf45_Dne = "Default";
    public boolean field_28e80e_Vxn = true;
    public int field_2d29f4_aFZ = 0;
    public int field_267cf5_Qnq = 0;
    public boolean field_267d06_Qnq = false;
    public float field_29186a_XHL = 0.0f;
    public ulE field_162fc8c7_DyG;
    public boolean field_2d2a05_aFZ = true;
    public float field_20b854_DyG = 0.44366196f;
    public float field_2092ab_Dne = 1.0f;
    public float field_22c5ff_IjH = 1.0f;
    public ulE field_5cd08f2_IjH;
    public boolean field_1ed028_ATE = false;
    private static final String[] field_a645d451_Qnq;
    protected Minecraft field_493682ed_Dne;
    public boolean field_29187e_XHL = true;
    public ulE field_5e660e65_Qnq;

    public boolean method_7a46289e_Dne() {
        return this.field_2092ae_Dne < 2 && this.field_388db7_zGp;
    }

    public boolean method_7e2204ff_Dne(ONk oNk) {
        switch (fmx_0.field_3f1c589_Dne[oNk.ordinal()]) {
            case 1: {
                return this.field_2092bf_Dne;
            }
            case 2: {
                return this.field_21261e_FWm;
            }
            case 3: {
                return this.field_2e5f2c_bzF;
            }
            case 4: {
                return this.field_267d06_Qnq;
            }
            case 5: {
                return this.field_388db7_zGp;
            }
            case 6: {
                return this.field_20b868_DyG;
            }
            case 7: {
                return this.field_2f0de9_div;
            }
            case 8: {
                return this.field_22c613_IjH;
            }
            case 9: {
                return this.field_33449d_mrb;
            }
            case 10: {
                return this.field_29187e_XHL;
            }
            case 11: {
                return this.field_2a9ae7_Zpi;
            }
            case 12: {
                return this.field_31b827_kGO;
            }
            case 13: {
                return this.field_348583_qLR;
            }
            case 14: {
                return this.field_1ed028_ATE;
            }
        }
        return false;
    }

    public void method_7a46289a_Dne() {
        try {
            if (!this.field_d102ba32_Dne.exists()) {
                return;
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.field_d102ba32_Dne));
            String string = "";
            while ((string = bufferedReader.readLine()) != null) {
                try {
                    String[] stringArray = string.split(":");
                    if (stringArray[0].equals("music")) {
                        this.field_2092ab_Dne = this.method_8f501fd4_Dne(stringArray[1]);
                    }
                    if (stringArray[0].equals("sound")) {
                        this.field_21260a_FWm = this.method_8f501fd4_Dne(stringArray[1]);
                    }
                    if (stringArray[0].equals("mouseSensitivity")) {
                        this.field_2e5f18_bzF = this.method_8f501fd4_Dne(stringArray[1]);
                    }
                    if (stringArray[0].equals("fov")) {
                        this.field_29186a_XHL = this.method_8f501fd4_Dne(stringArray[1]);
                    }
                    if (stringArray[0].equals("gamma")) {
                        this.field_2a9ad3_Zpi = this.method_8f501fd4_Dne(stringArray[1]);
                    }
                    if (stringArray[0].equals("invertYMouse")) {
                        this.field_2092bf_Dne = stringArray[1].equals("true");
                    }
                    if (stringArray[0].equals("viewDistance")) {
                        this.field_2092ae_Dne = Integer.parseInt(stringArray[1]);
                    }
                    if (stringArray[0].equals("guiScale")) {
                        this.field_22c602_IjH = Integer.parseInt(stringArray[1]);
                    }
                    if (stringArray[0].equals("particles")) {
                        this.field_33448c_mrb = Integer.parseInt(stringArray[1]);
                    }
                    if (stringArray[0].equals("bobView")) {
                        this.field_21261e_FWm = stringArray[1].equals("true");
                    }
                    if (stringArray[0].equals("anaglyph3d")) {
                        this.field_2e5f2c_bzF = stringArray[1].equals("true");
                    }
                    if (stringArray[0].equals("advancedOpengl")) {
                        this.field_267d06_Qnq = stringArray[1].equals("true");
                    }
                    if (stringArray[0].equals("fpsLimit")) {
                        this.field_21260d_FWm = Integer.parseInt(stringArray[1]);
                    }
                    if (stringArray[0].equals("difficulty")) {
                        this.field_20b857_DyG = Integer.parseInt(stringArray[1]);
                    }
                    if (stringArray[0].equals("fancyGraphics")) {
                        this.field_2d2a05_aFZ = stringArray[1].equals("true");
                    }
                    if (stringArray[0].equals("ao")) {
                        this.field_2e5f1b_bzF = stringArray[1].equals("true") ? 2 : (stringArray[1].equals("false") ? 0 : Integer.parseInt(stringArray[1]));
                    }
                    if (stringArray[0].equals("clouds")) {
                        this.field_388db7_zGp = stringArray[1].equals("true");
                    }
                    if (stringArray[0].equals("skin")) {
                        this.field_569fcf45_Dne = stringArray[1];
                    }
                    if (stringArray[0].equals("lastServer") && stringArray.length >= 2) {
                        this.field_d9a85c6_FWm = stringArray[1];
                    }
                    if (stringArray[0].equals("chatVisibility")) {
                        this.field_267cf5_Qnq = Integer.parseInt(stringArray[1]);
                    }
                    if (stringArray[0].equals("chatColors")) {
                        this.field_20b868_DyG = stringArray[1].equals("true");
                    }
                    if (stringArray[0].equals("chatLinks")) {
                        this.field_2f0de9_div = stringArray[1].equals("true");
                    }
                    if (stringArray[0].equals("chatLinksPrompt")) {
                        this.field_22c613_IjH = stringArray[1].equals("true");
                    }
                    if (stringArray[0].equals("chatOpacity")) {
                        this.field_267cf2_Qnq = this.method_8f501fd4_Dne(stringArray[1]);
                    }
                    if (stringArray[0].equals("serverTextures")) {
                        this.field_33449d_mrb = stringArray[1].equals("true");
                    }
                    if (stringArray[0].equals("snooperEnabled")) {
                        this.field_29187e_XHL = stringArray[1].equals("true");
                    }
                    if (stringArray[0].equals("fullscreen")) {
                        this.field_2a9ae7_Zpi = stringArray[1].equals("true");
                    }
                    if (stringArray[0].equals("enableVsync")) {
                        this.field_31b827_kGO = stringArray[1].equals("true");
                    }
                    if (stringArray[0].equals("hideServerAddress")) {
                        this.field_36b0ba_udO = stringArray[1].equals("true");
                    }
                    if (stringArray[0].equals("advancedItemTooltips")) {
                        this.field_342275_ooe = stringArray[1].equals("true");
                    }
                    if (stringArray[0].equals("pauseOnLostFocus")) {
                        this.field_367165_trS = stringArray[1].equals("true");
                    }
                    if (stringArray[0].equals("showCape")) {
                        this.field_348583_qLR = stringArray[1].equals("true");
                    }
                    if (stringArray[0].equals("touchscreen")) {
                        this.field_1ed028_ATE = stringArray[1].equals("true");
                    }
                    if (stringArray[0].equals("overrideHeight")) {
                        this.field_388da6_zGp = Integer.parseInt(stringArray[1]);
                    }
                    if (stringArray[0].equals("overrideWidth")) {
                        this.field_2d29f4_aFZ = Integer.parseInt(stringArray[1]);
                    }
                    if (stringArray[0].equals("heldItemTooltips")) {
                        this.field_28e80e_Vxn = stringArray[1].equals("true");
                    }
                    if (stringArray[0].equals("chatHeightFocused")) {
                        this.field_2f0dd5_div = this.method_8f501fd4_Dne(stringArray[1]);
                    }
                    if (stringArray[0].equals("chatHeightUnfocused")) {
                        this.field_20b854_DyG = this.method_8f501fd4_Dne(stringArray[1]);
                    }
                    if (stringArray[0].equals("chatScale")) {
                        this.field_2d29f1_aFZ = this.method_8f501fd4_Dne(stringArray[1]);
                    }
                    if (stringArray[0].equals("chatWidth")) {
                        this.field_388da3_zGp = this.method_8f501fd4_Dne(stringArray[1]);
                    }
                    for (int i = 0; i < this.field_8372ecf9_Dne.length; ++i) {
                        if (!stringArray[0].equals("key_" + this.field_8372ecf9_Dne[i].field_569fcf45_Dne)) continue;
                        this.field_8372ecf9_Dne[i].field_2092ae_Dne = Integer.parseInt(stringArray[1]);
                    }
                }
                catch (Exception exception) {
                    this.field_493682ed_Dne.method_230e0120_Dne().method_110c4dc3_FWm("Skipping bad option: " + string);
                }
            }
            ulE.method_7c6f6039_FWm();
            bufferedReader.close();
        }
        catch (Exception exception) {
            this.field_493682ed_Dne.method_230e0120_Dne().method_110c4dc3_FWm("Failed to load options");
            exception.printStackTrace();
        }
    }

    public void method_461f0225_Dne(ONk oNk, float f) {
        if (oNk == ONk.field_36aed80_Dne) {
            this.field_2092ab_Dne = f;
            this.field_493682ed_Dne.field_3788296_Dne.method_7a46289a_Dne();
        }
        if (oNk == ONk.field_2024b95f_FWm) {
            this.field_21260a_FWm = f;
            this.field_493682ed_Dne.field_3788296_Dne.method_7a46289a_Dne();
        }
        if (oNk == ONk.field_5e545c47_Qnq) {
            this.field_2e5f18_bzF = f;
        }
        if (oNk == ONk.field_712e71c6_aFZ) {
            this.field_29186a_XHL = f;
        }
        if (oNk == ONk.field_f09cac78_zGp) {
            this.field_2a9ad3_Zpi = f;
        }
        if (oNk == ONk.field_7577086d_EyB) {
            this.field_267cf2_Qnq = f;
            this.field_493682ed_Dne.field_3733694_Dne.method_2312ad69_Dne().method_7c6f6039_FWm();
        }
        if (oNk == ONk.field_24958cdb_AgF) {
            this.field_2f0dd5_div = f;
            this.field_493682ed_Dne.field_3733694_Dne.method_2312ad69_Dne().method_7c6f6039_FWm();
        }
        if (oNk == ONk.field_d7315955_yMz) {
            this.field_20b854_DyG = f;
            this.field_493682ed_Dne.field_3733694_Dne.method_2312ad69_Dne().method_7c6f6039_FWm();
        }
        if (oNk == ONk.field_cb472f53_qXo) {
            this.field_388da3_zGp = f;
            this.field_493682ed_Dne.field_3733694_Dne.method_2312ad69_Dne().method_7c6f6039_FWm();
        }
        if (oNk == ONk.field_7ee074b_tgc) {
            this.field_2d29f1_aFZ = f;
            this.field_493682ed_Dne.field_3733694_Dne.method_2312ad69_Dne().method_7c6f6039_FWm();
        }
    }

    public fZI() {
        this.field_20366b7d_FWm = new ulE("key.left", 30);
        this.field_75c46d8b_bzF = new ulE("key.back", 31);
        this.field_5e660e65_Qnq = new ulE("key.right", 32);
        this.field_714023e4_aFZ = new ulE("key.jump", 57);
        this.field_f0ae5e96_zGp = new ulE("key.inventory", 18);
        this.field_162fc8c7_DyG = new ulE("key.drop", 16);
        this.field_142575c8_div = new ulE("key.chat", 20);
        this.field_5cd08f2_IjH = new ulE("key.sneak", 42);
        this.field_7507327c_mrb = new ulE("key.attack", -100);
        this.field_1c3e2ddd_XHL = new ulE("key.use", -99);
        this.field_617653c6_Zpi = new ulE("key.playerlist", 15);
        this.field_a22cd106_kGO = new ulE("key.pickItem", -98);
        this.field_af0d4819_udO = new ulE("key.command", 53);
        this.field_8372ecf9_Dne = new ulE[]{this.field_7507327c_mrb, this.field_1c3e2ddd_XHL, this.field_37c9f9e_Dne, this.field_20366b7d_FWm, this.field_75c46d8b_bzF, this.field_5e660e65_Qnq, this.field_714023e4_aFZ, this.field_5cd08f2_IjH, this.field_162fc8c7_DyG, this.field_f0ae5e96_zGp, this.field_142575c8_div, this.field_617653c6_Zpi, this.field_a22cd106_kGO, this.field_af0d4819_udO};
    }

    public static String method_e45ed204_bzF(int n) {
        return n < 0 ? KGL.method_98148f73_Dne("key.mouseButton", n + 101) : Keyboard.getKeyName(n);
    }

    public String method_adcaabf6_FWm(int n) {
        int n2 = this.field_8372ecf9_Dne[n].field_2092ae_Dne;
        return fZI.method_e45ed204_bzF(n2);
    }

    public String method_2c0e7e17_Dne(int n) {
        irb irb2 = irb.method_2310d392_Dne();
        return irb2.method_39193c_Dne(this.field_8372ecf9_Dne[n].field_569fcf45_Dne);
    }

    private static String method_bbd27302_Dne(String[] stringArray, int n) {
        if (n < 0 || n >= stringArray.length) {
            n = 0;
        }
        irb irb2 = irb.method_2310d392_Dne();
        return irb2.method_39193c_Dne(stringArray[n]);
    }

    private float method_8f501fd4_Dne(String string) {
        return string.equals("true") ? 1.0f : (string.equals("false") ? 0.0f : Float.parseFloat(string));
    }

    public void method_461f0d68_Dne(ONk oNk, int n) {
        if (oNk == ONk.field_75b2bb6d_bzF) {
            boolean bl = this.field_2092bf_Dne = !this.field_2092bf_Dne;
        }
        if (oNk == ONk.field_161e16a9_DyG) {
            this.field_2092ae_Dne = this.field_2092ae_Dne + n & 3;
        }
        if (oNk == ONk.field_ab23b236_ooe) {
            this.field_22c602_IjH = this.field_22c602_IjH + n & 3;
        }
        if (oNk == ONk.field_1effde44_qLR) {
            this.field_33448c_mrb = (this.field_33448c_mrb + n) % 3;
        }
        if (oNk == ONk.field_1413c3aa_div) {
            boolean bl = this.field_21261e_FWm = !this.field_21261e_FWm;
        }
        if (oNk == ONk.field_32850926_trS) {
            boolean bl = this.field_388db7_zGp = !this.field_388db7_zGp;
        }
        if (oNk == ONk.field_74f5805e_mrb) {
            this.field_267d06_Qnq = !this.field_267d06_Qnq;
            this.field_493682ed_Dne.field_37b59c1_Dne.method_7a46289a_Dne();
        }
        if (oNk == ONk.field_5bb56d4_IjH) {
            this.field_2e5f2c_bzF = !this.field_2e5f2c_bzF;
            this.field_493682ed_Dne.field_36d36bf_Dne.method_ae128dc7_bzF();
        }
        if (oNk == ONk.field_1c2c7bbf_XHL) {
            this.field_21260d_FWm = (this.field_21260d_FWm + n + 3) % 3;
        }
        if (oNk == ONk.field_6164a1a8_Zpi) {
            this.field_20b857_DyG = this.field_20b857_DyG + n & 3;
        }
        if (oNk == ONk.field_a21b1ee8_kGO) {
            this.field_2d2a05_aFZ = !this.field_2d2a05_aFZ;
            this.field_493682ed_Dne.field_37b59c1_Dne.method_7a46289a_Dne();
        }
        if (oNk == ONk.field_aefb95fb_udO) {
            this.field_2e5f1b_bzF = (this.field_2e5f1b_bzF + n) % 3;
            this.field_493682ed_Dne.field_37b59c1_Dne.method_7a46289a_Dne();
        }
        if (oNk == ONk.field_35ca4e69_ATE) {
            this.field_267cf5_Qnq = (this.field_267cf5_Qnq + n) % 3;
        }
        if (oNk == ONk.field_719a034f_Vxn) {
            boolean bl = this.field_20b868_DyG = !this.field_20b868_DyG;
        }
        if (oNk == ONk.field_84fc3358_ceE) {
            boolean bl = this.field_2f0de9_div = !this.field_2f0de9_div;
        }
        if (oNk == ONk.field_d443208_FfS) {
            boolean bl = this.field_22c613_IjH = !this.field_22c613_IjH;
        }
        if (oNk == ONk.field_3951d927_OdI) {
            boolean bl = this.field_33449d_mrb = !this.field_33449d_mrb;
        }
        if (oNk == ONk.field_d2abbf2f_oIf) {
            boolean bl = this.field_29187e_XHL = !this.field_29187e_XHL;
        }
        if (oNk == ONk.field_dd6a5af8_Fnk) {
            boolean bl = this.field_348583_qLR = !this.field_348583_qLR;
        }
        if (oNk == ONk.field_76c5e99_gnI) {
            boolean bl = this.field_1ed028_ATE = !this.field_1ed028_ATE;
        }
        if (oNk == ONk.field_8e7449ac_vSL) {
            boolean bl = this.field_2a9ae7_Zpi = !this.field_2a9ae7_Zpi;
            if (this.field_493682ed_Dne.method_b0a28148_div() != this.field_2a9ae7_Zpi) {
                this.field_493682ed_Dne.method_b0a28144_div();
            }
        }
        if (oNk == ONk.field_9f2c83e1_RPx) {
            this.field_31b827_kGO = !this.field_31b827_kGO;
            Display.setVSyncEnabled(this.field_31b827_kGO);
        }
        this.method_7c6f6039_FWm();
    }

    static {
        field_4423b8f7_bzF = new String[]{"options.guiScale.auto", "options.guiScale.small", "options.guiScale.normal", "options.guiScale.large"};
        field_a645d451_Qnq = new String[]{"options.chat.visibility.full", "options.chat.visibility.system", "options.chat.visibility.hidden"};
        field_4730df90_aFZ = new String[]{"options.particles.all", "options.particles.decreased", "options.particles.minimal"};
        field_5ec17ac2_zGp = new String[]{"performance.max", "performance.balanced", "performance.powersaver"};
        field_5b80bb33_DyG = new String[]{"options.ao.off", "options.ao.min", "options.ao.max"};
    }

    public void method_7c6f6039_FWm() {
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter(this.field_d102ba32_Dne));
            printWriter.println("music:" + this.field_2092ab_Dne);
            printWriter.println("sound:" + this.field_21260a_FWm);
            printWriter.println("invertYMouse:" + this.field_2092bf_Dne);
            printWriter.println("mouseSensitivity:" + this.field_2e5f18_bzF);
            printWriter.println("fov:" + this.field_29186a_XHL);
            printWriter.println("gamma:" + this.field_2a9ad3_Zpi);
            printWriter.println("viewDistance:" + this.field_2092ae_Dne);
            printWriter.println("guiScale:" + this.field_22c602_IjH);
            printWriter.println("particles:" + this.field_33448c_mrb);
            printWriter.println("bobView:" + this.field_21261e_FWm);
            printWriter.println("anaglyph3d:" + this.field_2e5f2c_bzF);
            printWriter.println("advancedOpengl:" + this.field_267d06_Qnq);
            printWriter.println("fpsLimit:" + this.field_21260d_FWm);
            printWriter.println("difficulty:" + this.field_20b857_DyG);
            printWriter.println("fancyGraphics:" + this.field_2d2a05_aFZ);
            printWriter.println("ao:" + this.field_2e5f1b_bzF);
            printWriter.println("clouds:" + this.field_388db7_zGp);
            printWriter.println("skin:" + this.field_569fcf45_Dne);
            printWriter.println("lastServer:" + this.field_d9a85c6_FWm);
            printWriter.println("lang:" + this.field_c480ca78_bzF);
            printWriter.println("chatVisibility:" + this.field_267cf5_Qnq);
            printWriter.println("chatColors:" + this.field_20b868_DyG);
            printWriter.println("chatLinks:" + this.field_2f0de9_div);
            printWriter.println("chatLinksPrompt:" + this.field_22c613_IjH);
            printWriter.println("chatOpacity:" + this.field_267cf2_Qnq);
            printWriter.println("serverTextures:" + this.field_33449d_mrb);
            printWriter.println("snooperEnabled:" + this.field_29187e_XHL);
            printWriter.println("fullscreen:" + this.field_2a9ae7_Zpi);
            printWriter.println("enableVsync:" + this.field_31b827_kGO);
            printWriter.println("hideServerAddress:" + this.field_36b0ba_udO);
            printWriter.println("advancedItemTooltips:" + this.field_342275_ooe);
            printWriter.println("pauseOnLostFocus:" + this.field_367165_trS);
            printWriter.println("showCape:" + this.field_348583_qLR);
            printWriter.println("touchscreen:" + this.field_1ed028_ATE);
            printWriter.println("overrideWidth:" + this.field_2d29f4_aFZ);
            printWriter.println("overrideHeight:" + this.field_388da6_zGp);
            printWriter.println("heldItemTooltips:" + this.field_28e80e_Vxn);
            printWriter.println("chatHeightFocused:" + this.field_2f0dd5_div);
            printWriter.println("chatHeightUnfocused:" + this.field_20b854_DyG);
            printWriter.println("chatScale:" + this.field_2d29f1_aFZ);
            printWriter.println("chatWidth:" + this.field_388da3_zGp);
            for (int i = 0; i < this.field_8372ecf9_Dne.length; ++i) {
                printWriter.println("key_" + this.field_8372ecf9_Dne[i].field_569fcf45_Dne + ":" + this.field_8372ecf9_Dne[i].field_2092ae_Dne);
            }
            printWriter.close();
        }
        catch (Exception exception) {
            this.field_493682ed_Dne.method_230e0120_Dne().method_110c4dc3_FWm("Failed to save options");
            exception.printStackTrace();
        }
        this.method_ae128dc7_bzF();
    }

    public static boolean method_c08fa79d_Dne(ulE ulE2) {
        return ulE2.field_2092ae_Dne < 0 ? Mouse.isButtonDown(ulE2.field_2092ae_Dne + 100) : Keyboard.isKeyDown(ulE2.field_2092ae_Dne);
    }

    public void method_16cca7a_Dne(int n, int n2) {
        this.field_8372ecf9_Dne[n].field_2092ae_Dne = n2;
        this.method_7c6f6039_FWm();
    }

    public String method_95e92505_Dne(ONk oNk) {
        irb irb2 = irb.method_2310d392_Dne();
        String string = irb2.method_39193c_Dne(oNk.method_eecad346_Dne()) + ": ";
        if (oNk.method_7a46289e_Dne()) {
            float f = this.method_7e2204eb_Dne(oNk);
            return oNk == ONk.field_5e545c47_Qnq ? (f == 0.0f ? string + irb2.method_39193c_Dne("options.sensitivity.min") : (f == 1.0f ? string + irb2.method_39193c_Dne("options.sensitivity.max") : string + (int)(f * 200.0f) + "%")) : (oNk == ONk.field_712e71c6_aFZ ? (f == 0.0f ? string + irb2.method_39193c_Dne("options.fov.min") : (f == 1.0f ? string + irb2.method_39193c_Dne("options.fov.max") : string + (int)(70.0f + f * 40.0f))) : (oNk == ONk.field_f09cac78_zGp ? (f == 0.0f ? string + irb2.method_39193c_Dne("options.gamma.min") : (f == 1.0f ? string + irb2.method_39193c_Dne("options.gamma.max") : string + "+" + (int)(f * 100.0f) + "%")) : (oNk == ONk.field_7577086d_EyB ? string + (int)(f * 90.0f + 10.0f) + "%" : (oNk == ONk.field_d7315955_yMz ? string + muJ.method_117d0e9a_FWm(f) + "px" : (oNk == ONk.field_24958cdb_AgF ? string + muJ.method_117d0e9a_FWm(f) + "px" : (oNk == ONk.field_cb472f53_qXo ? string + muJ.method_ce7f5259_Dne(f) + "px" : (f == 0.0f ? string + irb2.method_39193c_Dne("options.off") : string + (int)(f * 100.0f) + "%")))))));
        }
        if (oNk.method_7c6f603d_FWm()) {
            boolean bl = this.method_7e2204ff_Dne(oNk);
            return bl ? string + irb2.method_39193c_Dne("options.on") : string + irb2.method_39193c_Dne("options.off");
        }
        return oNk == ONk.field_161e16a9_DyG ? string + fZI.method_bbd27302_Dne(field_f5e54dca_Dne, this.field_2092ae_Dne) : (oNk == ONk.field_6164a1a8_Zpi ? string + fZI.method_bbd27302_Dne(field_1e416769_FWm, this.field_20b857_DyG) : (oNk == ONk.field_ab23b236_ooe ? string + fZI.method_bbd27302_Dne(field_4423b8f7_bzF, this.field_22c602_IjH) : (oNk == ONk.field_35ca4e69_ATE ? string + fZI.method_bbd27302_Dne(field_a645d451_Qnq, this.field_267cf5_Qnq) : (oNk == ONk.field_1effde44_qLR ? string + fZI.method_bbd27302_Dne(field_4730df90_aFZ, this.field_33448c_mrb) : (oNk == ONk.field_1c2c7bbf_XHL ? string + fZI.method_bbd27302_Dne(field_5ec17ac2_zGp, this.field_21260d_FWm) : (oNk == ONk.field_aefb95fb_udO ? string + fZI.method_bbd27302_Dne(field_5b80bb33_DyG, this.field_2e5f1b_bzF) : (oNk == ONk.field_a21b1ee8_kGO ? (this.field_2d2a05_aFZ ? string + irb2.method_39193c_Dne("options.graphics.fancy") : string + irb2.method_39193c_Dne("options.graphics.fast")) : string)))))));
    }

    public fZI(Minecraft minecraft, File file) {
        this.field_20366b7d_FWm = new ulE("key.left", 30);
        this.field_75c46d8b_bzF = new ulE("key.back", 31);
        this.field_5e660e65_Qnq = new ulE("key.right", 32);
        this.field_714023e4_aFZ = new ulE("key.jump", 57);
        this.field_f0ae5e96_zGp = new ulE("key.inventory", 18);
        this.field_162fc8c7_DyG = new ulE("key.drop", 16);
        this.field_142575c8_div = new ulE("key.chat", 20);
        this.field_5cd08f2_IjH = new ulE("key.sneak", 42);
        this.field_7507327c_mrb = new ulE("key.attack", -100);
        this.field_1c3e2ddd_XHL = new ulE("key.use", -99);
        this.field_617653c6_Zpi = new ulE("key.playerlist", 15);
        this.field_a22cd106_kGO = new ulE("key.pickItem", -98);
        this.field_af0d4819_udO = new ulE("key.command", 53);
        this.field_8372ecf9_Dne = new ulE[]{this.field_7507327c_mrb, this.field_1c3e2ddd_XHL, this.field_37c9f9e_Dne, this.field_20366b7d_FWm, this.field_75c46d8b_bzF, this.field_5e660e65_Qnq, this.field_714023e4_aFZ, this.field_5cd08f2_IjH, this.field_162fc8c7_DyG, this.field_f0ae5e96_zGp, this.field_142575c8_div, this.field_617653c6_Zpi, this.field_a22cd106_kGO, this.field_af0d4819_udO};
        this.field_493682ed_Dne = minecraft;
        this.field_d102ba32_Dne = new File(file, "options.txt");
        this.method_7a46289a_Dne();
    }

    public void method_ae128dc7_bzF() {
        if (this.field_493682ed_Dne.field_369f6b6_Dne != null) {
            this.field_493682ed_Dne.field_369f6b6_Dne.field_37608e7_Dne.method_5536af4d_FWm(new yUQ(this.field_c480ca78_bzF, this.field_2092ae_Dne, this.field_267cf5_Qnq, this.field_20b868_DyG, this.field_20b857_DyG, this.field_348583_qLR));
        }
    }

    public float method_7e2204eb_Dne(ONk oNk) {
        return oNk == ONk.field_712e71c6_aFZ ? this.field_29186a_XHL : (oNk == ONk.field_f09cac78_zGp ? this.field_2a9ad3_Zpi : (oNk == ONk.field_36aed80_Dne ? this.field_2092ab_Dne : (oNk == ONk.field_2024b95f_FWm ? this.field_21260a_FWm : (oNk == ONk.field_5e545c47_Qnq ? this.field_2e5f18_bzF : (oNk == ONk.field_7577086d_EyB ? this.field_267cf2_Qnq : (oNk == ONk.field_24958cdb_AgF ? this.field_2f0dd5_div : (oNk == ONk.field_d7315955_yMz ? this.field_20b854_DyG : (oNk == ONk.field_7ee074b_tgc ? this.field_2d29f1_aFZ : (oNk == ONk.field_cb472f53_qXo ? this.field_388da3_zGp : 0.0f)))))))));
    }
}

