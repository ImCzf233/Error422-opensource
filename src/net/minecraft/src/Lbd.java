package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;
import org.lwjgl.input.Keyboard;

public class Lbd
extends qVZ {
    public String field_569fcf45_Dne = "";
    private boolean field_2e5f2c_bzF = true;
    private pee_0 field_712f3bc2_aFZ;
    private mHN field_20324278_FWm;
    private pee_0 field_75b38569_bzF;
    private mHN field_3787699_Dne;
    private pee_0 field_5e552643_Qnq;
    private pee_0 field_36bb77c_Dne;
    private pee_0 field_161ee0a5_DyG;
    private boolean field_2d2a05_aFZ = false;
    private String field_d9a85c6_FWm;
    private String field_309c90bc_DyG;
    private boolean field_388db7_zGp = false;
    private String field_c480ca78_bzF = "survival";
    private boolean field_267d06_Qnq = false;
    private boolean field_2f0de9_div;
    private String field_bc57ecbf_aFZ;
    private String field_9e60dbde_Qnq;
    private pee_0 field_f09d7674_zGp;
    private qVZ field_37a7e17_Dne;
    private boolean field_22c613_IjH;
    private boolean field_20b868_DyG = false;
    private int field_2092ae_Dne = 0;
    private String field_8b8e234d_zGp;
    private static final String[] field_f5e54dca_Dne = new String[]{"CON", "COM", "PRN", "AUX", "CLOCK$", "NUL", "COM1", "COM2", "COM3", "COM4", "COM5", "COM6", "COM7", "COM8", "COM9", "LPT1", "LPT2", "LPT3", "LPT4", "LPT5", "LPT6", "LPT7", "LPT8", "LPT9"};
    private pee_0 field_2025835b_FWm;

    @Override
    public void method_7c6f6039_FWm() {
        Keyboard.enableRepeatEvents(false);
    }

    @Override
    public void method_ae128dc7_bzF() {
        this.field_3787699_Dne.method_7a46289a_Dne();
        this.field_20324278_FWm.method_7a46289a_Dne();
    }

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        irb irb2 = irb.method_2310d392_Dne();
        this.method_a98a0660_aFZ();
        this.method_32faf66d_Dne(this.field_3791671_Dne, irb2.method_39193c_Dne("selectWorld.create"), this.field_21260d_FWm / 2, 20, 0xFFFFFF);
        if (this.field_22c613_IjH) {
            this.method_67d6d54c_FWm(this.field_3791671_Dne, irb2.method_39193c_Dne("selectWorld.enterSeed"), this.field_21260d_FWm / 2 - 100, 47, 0xA0A0A0);
            this.method_67d6d54c_FWm(this.field_3791671_Dne, irb2.method_39193c_Dne("selectWorld.seedInfo"), this.field_21260d_FWm / 2 - 100, 85, 0xA0A0A0);
            this.method_67d6d54c_FWm(this.field_3791671_Dne, irb2.method_39193c_Dne("selectWorld.mapFeatures.info"), this.field_21260d_FWm / 2 - 150, 122, 0xA0A0A0);
            this.method_67d6d54c_FWm(this.field_3791671_Dne, irb2.method_39193c_Dne("selectWorld.allowCommands.info"), this.field_21260d_FWm / 2 - 150, 172, 0xA0A0A0);
            this.field_20324278_FWm.method_907a9d21_Qnq();
        } else {
            this.method_67d6d54c_FWm(this.field_3791671_Dne, irb2.method_39193c_Dne("selectWorld.enterName"), this.field_21260d_FWm / 2 - 100, 47, 0xA0A0A0);
            this.method_67d6d54c_FWm(this.field_3791671_Dne, irb2.method_39193c_Dne("selectWorld.resultFolder") + " " + this.field_d9a85c6_FWm, this.field_21260d_FWm / 2 - 100, 85, 0xA0A0A0);
            this.field_3787699_Dne.method_907a9d21_Qnq();
            this.method_67d6d54c_FWm(this.field_3791671_Dne, this.field_9e60dbde_Qnq, this.field_21260d_FWm / 2 - 100, 137, 0xA0A0A0);
            this.method_67d6d54c_FWm(this.field_3791671_Dne, this.field_bc57ecbf_aFZ, this.field_21260d_FWm / 2 - 100, 149, 0xA0A0A0);
        }
        super.method_2c2cec86_Dne(n, n2, f);
    }

    private void method_c073daf8_mrb() {
        this.method_ce7f9d7a_Dne(!this.field_22c613_IjH);
    }

    @Override
    protected void method_16a1040_Dne(char c, int n) {
        if (this.field_3787699_Dne.method_7c6f603d_FWm() && !this.field_22c613_IjH) {
            this.field_3787699_Dne.method_16a1044_Dne(c, n);
            this.field_309c90bc_DyG = this.field_3787699_Dne.method_eecad346_Dne();
        } else if (this.field_20324278_FWm.method_7c6f603d_FWm() && this.field_22c613_IjH) {
            this.field_20324278_FWm.method_16a1044_Dne(c, n);
            this.field_8b8e234d_zGp = this.field_20324278_FWm.method_eecad346_Dne();
        }
        if (c == '\r') {
            this.method_81183ff7_Dne((pee_0)this.field_f27c122c_Dne.get(0));
        }
        ((pee_0)this.field_f27c122c_Dne.get((int)0)).field_2092bf_Dne = this.field_3787699_Dne.method_eecad346_Dne().length() > 0;
        this.method_d44b4592_zGp();
    }

    public void method_c5e18f65_Dne(xoY xoY2) {
        this.field_309c90bc_DyG = KGL.method_98148f73_Dne("selectWorld.newWorld.copyOf", xoY2.method_eecad346_Dne());
        this.field_8b8e234d_zGp = xoY2.method_7a46288e_Dne() + "";
        this.field_2092ae_Dne = xoY2.method_23111898_Dne().method_7c6f602c_FWm();
        this.field_569fcf45_Dne = xoY2.method_d1f1ed87_FWm();
        this.field_2e5f2c_bzF = xoY2.method_ae128dcb_bzF();
        this.field_267d06_Qnq = xoY2.method_a98a0664_aFZ();
        if (xoY2.method_907a9d25_Qnq()) {
            this.field_c480ca78_bzF = "hardcore";
        } else if (xoY2.method_230878ef_Dne().method_ae128dcb_bzF()) {
            this.field_c480ca78_bzF = "survival";
        } else if (xoY2.method_230878ef_Dne().method_7c6f603d_FWm()) {
            this.field_c480ca78_bzF = "creative";
        }
    }

    private void method_8288d6ee_IjH() {
        irb irb2 = irb.method_2310d392_Dne();
        this.field_36bb77c_Dne.field_569fcf45_Dne = irb2.method_39193c_Dne("selectWorld.gameMode") + " " + irb2.method_39193c_Dne("selectWorld.gameMode." + this.field_c480ca78_bzF);
        this.field_9e60dbde_Qnq = irb2.method_39193c_Dne("selectWorld.gameMode." + this.field_c480ca78_bzF + ".line1");
        this.field_bc57ecbf_aFZ = irb2.method_39193c_Dne("selectWorld.gameMode." + this.field_c480ca78_bzF + ".line2");
        this.field_75b38569_bzF.field_569fcf45_Dne = irb2.method_39193c_Dne("selectWorld.mapFeatures") + " ";
        this.field_75b38569_bzF.field_569fcf45_Dne = this.field_2e5f2c_bzF ? this.field_75b38569_bzF.field_569fcf45_Dne + irb2.method_39193c_Dne("options.on") : this.field_75b38569_bzF.field_569fcf45_Dne + irb2.method_39193c_Dne("options.off");
        this.field_5e552643_Qnq.field_569fcf45_Dne = irb2.method_39193c_Dne("selectWorld.bonusItems") + " ";
        this.field_5e552643_Qnq.field_569fcf45_Dne = this.field_388db7_zGp && !this.field_20b868_DyG ? this.field_5e552643_Qnq.field_569fcf45_Dne + irb2.method_39193c_Dne("options.on") : this.field_5e552643_Qnq.field_569fcf45_Dne + irb2.method_39193c_Dne("options.off");
        this.field_712f3bc2_aFZ.field_569fcf45_Dne = irb2.method_39193c_Dne("selectWorld.mapType") + " " + irb2.method_39193c_Dne(kGO.field_836dd794_Dne[this.field_2092ae_Dne].method_d1f1ed87_FWm());
        this.field_f09d7674_zGp.field_569fcf45_Dne = irb2.method_39193c_Dne("selectWorld.allowCommands") + " ";
        this.field_f09d7674_zGp.field_569fcf45_Dne = this.field_267d06_Qnq && !this.field_20b868_DyG ? this.field_f09d7674_zGp.field_569fcf45_Dne + irb2.method_39193c_Dne("options.on") : this.field_f09d7674_zGp.field_569fcf45_Dne + irb2.method_39193c_Dne("options.off");
    }

    @Override
    protected void method_81183ff7_Dne(pee_0 pee_02) {
        if (pee_02.field_2092bf_Dne) {
            if (pee_02.field_2d29f4_aFZ == 1) {
                this.field_493682ed_Dne.method_b88fcbd2_Dne(this.field_37a7e17_Dne);
            } else if (pee_02.field_2d29f4_aFZ == 0) {
                this.field_493682ed_Dne.method_b88fcbd2_Dne(null);
                if (this.field_2f0de9_div) {
                    return;
                }
                this.field_2f0de9_div = true;
                long l = new Random().nextLong();
                String string = this.field_20324278_FWm.method_eecad346_Dne();
                if (!geR.method_8f501fe8_Dne(string)) {
                    try {
                        long l2 = Long.parseLong(string);
                        if (l2 != 0L) {
                            l = l2;
                        }
                    }
                    catch (NumberFormatException numberFormatException) {
                        l = string.hashCode();
                    }
                }
                XHL xHL = XHL.method_2851bb39_Dne(this.field_c480ca78_bzF);
                mrb mrb2 = new mrb(l, xHL, this.field_2e5f2c_bzF, this.field_20b868_DyG, kGO.field_836dd794_Dne[this.field_2092ae_Dne]);
                mrb2.method_285be758_Dne(this.field_569fcf45_Dne);
                if (this.field_388db7_zGp && !this.field_20b868_DyG) {
                    mrb2.method_2312a50e_Dne();
                }
                if (this.field_267d06_Qnq && !this.field_20b868_DyG) {
                    mrb2.method_f888f52d_FWm();
                }
                this.field_493682ed_Dne.method_14d1ad6_Dne(nVa.method_39193c_Dne(this.field_d9a85c6_FWm), nVa.method_39193c_Dne(this.field_3787699_Dne.method_eecad346_Dne().trim()), mrb2);
            } else if (pee_02.field_2d29f4_aFZ == 3) {
                this.method_c073daf8_mrb();
            } else if (pee_02.field_2d29f4_aFZ == 2) {
                if (this.field_c480ca78_bzF.equals("survival")) {
                    if (!this.field_2d2a05_aFZ) {
                        this.field_267d06_Qnq = false;
                    }
                    this.field_20b868_DyG = false;
                    this.field_c480ca78_bzF = "hardcore";
                    this.field_20b868_DyG = true;
                    this.field_f09d7674_zGp.field_2092bf_Dne = false;
                    this.field_5e552643_Qnq.field_2092bf_Dne = false;
                    this.method_8288d6ee_IjH();
                } else if (this.field_c480ca78_bzF.equals("hardcore")) {
                    if (!this.field_2d2a05_aFZ) {
                        this.field_267d06_Qnq = true;
                    }
                    this.field_20b868_DyG = false;
                    this.field_c480ca78_bzF = "creative";
                    this.method_8288d6ee_IjH();
                    this.field_20b868_DyG = false;
                    this.field_f09d7674_zGp.field_2092bf_Dne = true;
                    this.field_5e552643_Qnq.field_2092bf_Dne = true;
                } else {
                    if (!this.field_2d2a05_aFZ) {
                        this.field_267d06_Qnq = false;
                    }
                    this.field_c480ca78_bzF = "survival";
                    this.method_8288d6ee_IjH();
                    this.field_f09d7674_zGp.field_2092bf_Dne = true;
                    this.field_5e552643_Qnq.field_2092bf_Dne = true;
                    this.field_20b868_DyG = false;
                }
                this.method_8288d6ee_IjH();
            } else if (pee_02.field_2d29f4_aFZ == 4) {
                this.field_2e5f2c_bzF = !this.field_2e5f2c_bzF;
                this.method_8288d6ee_IjH();
            } else if (pee_02.field_2d29f4_aFZ == 7) {
                this.field_388db7_zGp = !this.field_388db7_zGp;
                this.method_8288d6ee_IjH();
            } else if (pee_02.field_2d29f4_aFZ == 5) {
                ++this.field_2092ae_Dne;
                if (this.field_2092ae_Dne >= kGO.field_836dd794_Dne.length) {
                    this.field_2092ae_Dne = 0;
                }
                while (kGO.field_836dd794_Dne[this.field_2092ae_Dne] == null || !kGO.field_836dd794_Dne[this.field_2092ae_Dne].method_7a46289e_Dne()) {
                    ++this.field_2092ae_Dne;
                    if (this.field_2092ae_Dne < kGO.field_836dd794_Dne.length) continue;
                    this.field_2092ae_Dne = 0;
                }
                this.field_569fcf45_Dne = "";
                this.method_8288d6ee_IjH();
                this.method_ce7f9d7a_Dne(this.field_22c613_IjH);
            } else if (pee_02.field_2d29f4_aFZ == 6) {
                this.field_2d2a05_aFZ = true;
                this.field_267d06_Qnq = !this.field_267d06_Qnq;
                this.method_8288d6ee_IjH();
            } else if (pee_02.field_2d29f4_aFZ == 8) {
                this.field_493682ed_Dne.method_b88fcbd2_Dne(new hcj(this, this.field_569fcf45_Dne));
            }
        }
    }

    private void method_ce7f9d7a_Dne(boolean bl) {
        this.field_22c613_IjH = bl;
        this.field_36bb77c_Dne.field_21261e_FWm = !this.field_22c613_IjH;
        this.field_75b38569_bzF.field_21261e_FWm = this.field_22c613_IjH;
        this.field_5e552643_Qnq.field_21261e_FWm = this.field_22c613_IjH;
        this.field_712f3bc2_aFZ.field_21261e_FWm = this.field_22c613_IjH;
        this.field_f09d7674_zGp.field_21261e_FWm = this.field_22c613_IjH;
        boolean bl2 = this.field_161ee0a5_DyG.field_21261e_FWm = this.field_22c613_IjH && kGO.field_836dd794_Dne[this.field_2092ae_Dne] == kGO.field_20315618_FWm;
        if (this.field_22c613_IjH) {
            irb irb2 = irb.method_2310d392_Dne();
            this.field_2025835b_FWm.field_569fcf45_Dne = irb2.method_39193c_Dne("gui.done");
        } else {
            irb irb3 = irb.method_2310d392_Dne();
            this.field_2025835b_FWm.field_569fcf45_Dne = irb3.method_39193c_Dne("selectWorld.moreWorldOptions");
        }
    }

    @Override
    public void method_7a46289a_Dne() {
        irb irb2 = irb.method_2310d392_Dne();
        Keyboard.enableRepeatEvents(true);
        this.field_f27c122c_Dne.clear();
        this.field_f27c122c_Dne.add(new pee_0(0, this.field_21260d_FWm / 2 - 155, this.field_2e5f1b_bzF - 28, 150, 20, irb2.method_39193c_Dne("selectWorld.create")));
        this.field_f27c122c_Dne.add(new pee_0(1, this.field_21260d_FWm / 2 + 5, this.field_2e5f1b_bzF - 28, 150, 20, irb2.method_39193c_Dne("gui.cancel")));
        this.field_36bb77c_Dne = new pee_0(2, this.field_21260d_FWm / 2 - 75, 115, 150, 20, "ERROR", false);
        this.field_f27c122c_Dne.add(this.field_36bb77c_Dne);
        this.field_2025835b_FWm = new pee_0(3, this.field_21260d_FWm / 2 - 75, 187, 150, 20, "ERROR", false);
        this.field_f27c122c_Dne.add(this.field_2025835b_FWm);
        this.field_75b38569_bzF = new pee_0(4, this.field_21260d_FWm / 2 - 155, 100, 150, 20, "ERROR", false);
        this.field_f27c122c_Dne.add(this.field_75b38569_bzF);
        this.field_75b38569_bzF.field_21261e_FWm = false;
        this.field_5e552643_Qnq = new pee_0(7, this.field_21260d_FWm / 2 + 5, 151, 150, 20, irb2.method_39193c_Dne("selectWorld.bonusItems"));
        this.field_f27c122c_Dne.add(this.field_5e552643_Qnq);
        this.field_5e552643_Qnq.field_21261e_FWm = false;
        this.field_712f3bc2_aFZ = new pee_0(5, this.field_21260d_FWm / 2 + 5, 100, 150, 20, irb2.method_39193c_Dne("selectWorld.mapType"));
        this.field_f27c122c_Dne.add(this.field_712f3bc2_aFZ);
        this.field_712f3bc2_aFZ.field_21261e_FWm = false;
        this.field_f09d7674_zGp = new pee_0(6, this.field_21260d_FWm / 2 - 155, 151, 150, 20, irb2.method_39193c_Dne("selectWorld.allowCommands"));
        this.field_f27c122c_Dne.add(this.field_f09d7674_zGp);
        this.field_f09d7674_zGp.field_21261e_FWm = false;
        this.field_161ee0a5_DyG = new pee_0(8, this.field_21260d_FWm / 2 + 5, 120, 150, 20, irb2.method_39193c_Dne("selectWorld.customizeType"));
        this.field_f27c122c_Dne.add(this.field_161ee0a5_DyG);
        this.field_161ee0a5_DyG.field_21261e_FWm = false;
        this.field_3787699_Dne = new mHN(this.field_3791671_Dne, this.field_21260d_FWm / 2 - 100, 60, 200, 20);
        this.field_3787699_Dne.method_117d59bb_FWm(true);
        this.field_3787699_Dne.method_8f501fe4_Dne(this.field_309c90bc_DyG);
        this.field_20324278_FWm = new mHN(this.field_3791671_Dne, this.field_21260d_FWm / 2 - 100, 60, 200, 20);
        this.field_20324278_FWm.method_8f501fe4_Dne(this.field_8b8e234d_zGp);
        this.method_ce7f9d7a_Dne(this.field_22c613_IjH);
        this.method_d44b4592_zGp();
        this.method_8288d6ee_IjH();
    }

    private void method_d44b4592_zGp() {
        this.field_d9a85c6_FWm = this.field_3787699_Dne.method_eecad346_Dne().trim();
        for (char c : BAQ.field_3f1c583_Dne) {
            this.field_d9a85c6_FWm = this.field_d9a85c6_FWm.replace(c, '_');
        }
        if (geR.method_8f501fe8_Dne(this.field_d9a85c6_FWm)) {
            this.field_d9a85c6_FWm = "World";
        }
        this.field_d9a85c6_FWm = Lbd.method_433ccc38_Dne(this.field_493682ed_Dne.method_23096ac2_Dne(), this.field_d9a85c6_FWm);
    }

    @Override
    protected void method_2c2cf7c9_Dne(int n, int n2, int n3) {
        super.method_2c2cf7c9_Dne(n, n2, n3);
        if (this.field_22c613_IjH) {
            this.field_20324278_FWm.method_2c2cf7c9_Dne(n, n2, n3);
        } else {
            this.field_3787699_Dne.method_2c2cf7c9_Dne(n, n2, n3);
        }
    }

    public static String method_433ccc38_Dne(YiY yiY, String string) {
        string = string.replaceAll("[\\./\"]", "_");
        for (Object obj : field_f5e54dca_Dne) {String string2 = (String) obj;
            if (!string.equalsIgnoreCase(string2)) continue;
            string = "_" + string + "_";
        }
        while (yiY.method_2860db13_Dne(string) != null) {
            string = string + "-";
        }
        return string;
    }

    public Lbd(qVZ qVZ2) {
        this.field_37a7e17_Dne = qVZ2;
        this.field_8b8e234d_zGp = "";
        this.field_309c90bc_DyG = KGL.method_39193c_Dne("selectWorld.newWorld");
    }
}

