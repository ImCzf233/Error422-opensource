package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;

public class PRD
extends qVZ {
    private String field_c480ca78_bzF;
    private String[] field_f5e54dca_Dne;
    private pee_0 field_36bb77c_Dne;
    private pee_0 field_2025835b_FWm;
    private final DateFormat field_364c53d0_Dne = new SimpleDateFormat();
    protected String field_569fcf45_Dne = "Select world";
    private SWj field_36ce0a6_Dne;
    protected qVZ field_37a7e17_Dne;
    private List field_6a0474ed_FWm;
    private pee_0 field_5e552643_Qnq;
    private int field_2092ae_Dne;
    private boolean field_267d06_Qnq;
    private boolean field_2e5f2c_bzF = false;
    private String field_d9a85c6_FWm;
    private pee_0 field_75b38569_bzF;

    static String[] method_462f35b4_Dne(PRD pRD) {
        return pRD.field_f5e54dca_Dne;
    }

    protected String method_adcaabf6_FWm(int n) {
        String string = ((pQP)this.field_6a0474ed_FWm.get(n)).method_d1f1ed87_FWm();
        if (string == null || geR.method_8f501fe8_Dne(string)) {
            irb irb2 = irb.method_2310d392_Dne();
            string = irb2.method_39193c_Dne("selectWorld.world") + " " + (n + 1);
        }
        return string;
    }

    public PRD(qVZ qVZ2) {
        this.field_f5e54dca_Dne = new String[3];
        this.field_37a7e17_Dne = qVZ2;
    }

    static List method_41cb4282_Dne(PRD pRD) {
        return pRD.field_6a0474ed_FWm;
    }

    protected String method_2c0e7e17_Dne(int n) {
        return ((pQP)this.field_6a0474ed_FWm.get(n)).method_eecad346_Dne();
    }

    @Override
    public void method_17484c9_Dne(boolean bl, int n) {
        if (this.field_267d06_Qnq) {
            this.field_267d06_Qnq = false;
            if (bl) {
                YiY yiY = this.field_493682ed_Dne.method_23096ac2_Dne();
                yiY.method_7a46289a_Dne();
                yiY.method_110c4dc7_FWm(this.method_2c0e7e17_Dne(n));
                try {
                    this.method_8288d6ee_IjH();
                }
                catch (Ipl ipl) {
                    ipl.printStackTrace();
                }
            }
            this.field_493682ed_Dne.method_b88fcbd2_Dne(this);
        }
    }

    static pee_0 method_91357e59_bzF(PRD pRD) {
        return pRD.field_75b38569_bzF;
    }

    public static sHC method_2044182a_Dne(qVZ qVZ2, String string, int n) {
        irb irb2 = irb.method_2310d392_Dne();
        String string2 = irb2.method_39193c_Dne("selectWorld.deleteQuestion");
        String string3 = "'" + string + "' " + irb2.method_39193c_Dne("selectWorld.deleteWarning");
        String string4 = irb2.method_39193c_Dne("selectWorld.deleteButton");
        String string5 = irb2.method_39193c_Dne("gui.cancel");
        sHC sHC2 = new sHC(qVZ2, string2, string3, string4, string5, n);
        return sHC2;
    }

    static DateFormat method_7ecf6ba6_Dne(PRD pRD) {
        return pRD.field_364c53d0_Dne;
    }

    public void method_d44b4592_zGp() {
        irb irb2 = irb.method_2310d392_Dne();
        this.field_2025835b_FWm = new pee_0(1, this.field_21260d_FWm / 2 - 154, this.field_2e5f1b_bzF - 52, 150, 20, irb2.method_39193c_Dne("selectWorld.select"));
        this.field_f27c122c_Dne.add(this.field_2025835b_FWm);
        this.field_f27c122c_Dne.add(new pee_0(3, this.field_21260d_FWm / 2 + 4, this.field_2e5f1b_bzF - 52, 150, 20, irb2.method_39193c_Dne("selectWorld.create")));
        this.field_75b38569_bzF = new pee_0(6, this.field_21260d_FWm / 2 - 154, this.field_2e5f1b_bzF - 28, 72, 20, irb2.method_39193c_Dne("selectWorld.rename"));
        this.field_f27c122c_Dne.add(this.field_75b38569_bzF);
        this.field_36bb77c_Dne = new pee_0(2, this.field_21260d_FWm / 2 - 76, this.field_2e5f1b_bzF - 28, 72, 20, irb2.method_39193c_Dne("selectWorld.delete"));
        this.field_f27c122c_Dne.add(this.field_36bb77c_Dne);
        this.field_5e552643_Qnq = new pee_0(7, this.field_21260d_FWm / 2 + 4, this.field_2e5f1b_bzF - 28, 72, 20, irb2.method_39193c_Dne("selectWorld.recreate"));
        this.field_f27c122c_Dne.add(this.field_5e552643_Qnq);
        this.field_f27c122c_Dne.add(new pee_0(0, this.field_21260d_FWm / 2 + 82, this.field_2e5f1b_bzF - 28, 72, 20, irb2.method_39193c_Dne("gui.cancel")));
        this.field_2025835b_FWm.field_2092bf_Dne = false;
        this.field_36bb77c_Dne.field_2092bf_Dne = false;
        this.field_75b38569_bzF.field_2092bf_Dne = false;
        this.field_5e552643_Qnq.field_2092bf_Dne = false;
    }

    static int method_7fb31671_Dne(PRD pRD, int n) {
        pRD.field_2092ae_Dne = n;
        return pRD.field_2092ae_Dne;
    }

    static String method_ee4421b_Dne(PRD pRD) {
        return pRD.field_d9a85c6_FWm;
    }

    @Override
    protected void method_81183ff7_Dne(pee_0 pee_02) {
        if (pee_02.field_2092bf_Dne) {
            if (pee_02.field_2d29f4_aFZ == 2) {
                String string = this.method_adcaabf6_FWm(this.field_2092ae_Dne);
                if (string != null) {
                    this.field_267d06_Qnq = true;
                    sHC sHC2 = PRD.method_2044182a_Dne(this, string, this.field_2092ae_Dne);
                    this.field_493682ed_Dne.method_b88fcbd2_Dne(sHC2);
                }
            } else if (pee_02.field_2d29f4_aFZ == 1) {
                this.method_ce7f5da9_Dne(this.field_2092ae_Dne);
            } else if (pee_02.field_2d29f4_aFZ == 3) {
                this.field_493682ed_Dne.method_b88fcbd2_Dne(new Lbd(this));
            } else if (pee_02.field_2d29f4_aFZ == 6) {
                this.field_493682ed_Dne.method_b88fcbd2_Dne(new CkO(this, this.method_2c0e7e17_Dne(this.field_2092ae_Dne)));
            } else if (pee_02.field_2d29f4_aFZ == 0) {
                this.field_493682ed_Dne.method_b88fcbd2_Dne(this.field_37a7e17_Dne);
            } else if (pee_02.field_2d29f4_aFZ == 7) {
                Lbd lbd = new Lbd(this);
                iDE iDE2 = this.field_493682ed_Dne.method_23096ac2_Dne().method_c5a32f37_Dne(this.method_2c0e7e17_Dne(this.field_2092ae_Dne), false);
                xoY xoY2 = iDE2.method_231798c9_Dne();
                iDE2.method_7a46289a_Dne();
                lbd.method_c5e18f65_Dne(xoY2);
                this.field_493682ed_Dne.method_b88fcbd2_Dne(lbd);
            } else {
                this.field_36ce0a6_Dne.method_81183ff7_Dne(pee_02);
            }
        }
    }

    static pee_0 method_31d94c27_FWm(PRD pRD) {
        return pRD.field_36bb77c_Dne;
    }

    static int method_7ffd8118_Dne(PRD pRD) {
        return pRD.field_2092ae_Dne;
    }

    private void method_8288d6ee_IjH() throws Ipl {
        YiY yiY = this.field_493682ed_Dne.method_23096ac2_Dne();
        this.field_6a0474ed_FWm = yiY.method_adea226d_Dne();
        Collections.sort(this.field_6a0474ed_FWm);
        this.field_2092ae_Dne = -1;
    }

    static String method_d908687a_FWm(PRD pRD) {
        return pRD.field_c480ca78_bzF;
    }

    public void method_ce7f5da9_Dne(int n) {
        this.field_493682ed_Dne.method_b88fcbd2_Dne(null);
        if (!this.field_2e5f2c_bzF) {
            String string;
            this.field_2e5f2c_bzF = true;
            String string2 = this.method_2c0e7e17_Dne(n);
            if (string2 == null) {
                string2 = "World" + n;
            }
            if ((string = this.method_adcaabf6_FWm(n)) == null) {
                string = "World" + n;
            }
            if (this.field_493682ed_Dne.method_23096ac2_Dne().method_47a073d5_bzF(string2)) {
                this.field_493682ed_Dne.method_14d1ad6_Dne(string2, string, null);
            }
        }
    }

    static pee_0 method_1340143f_Qnq(PRD pRD) {
        return pRD.field_5e552643_Qnq;
    }

    @Override
    public void method_7a46289a_Dne() {
        irb irb2 = irb.method_2310d392_Dne();
        this.field_569fcf45_Dne = irb2.method_39193c_Dne("selectWorld.title");
        try {
            this.method_8288d6ee_IjH();
        }
        catch (Ipl ipl) {
            ipl.printStackTrace();
            this.field_493682ed_Dne.method_b88fcbd2_Dne(new qtV("Unable to load words", ipl.getMessage()));
            return;
        }
        this.field_d9a85c6_FWm = irb2.method_39193c_Dne("selectWorld.world");
        this.field_c480ca78_bzF = irb2.method_39193c_Dne("selectWorld.conversion");
        this.field_f5e54dca_Dne[XHL.field_2028b66f_FWm.method_7a46288d_Dne()] = irb2.method_39193c_Dne("gameMode.survival");
        this.field_f5e54dca_Dne[XHL.field_75b6b87d_bzF.method_7a46288d_Dne()] = irb2.method_39193c_Dne("gameMode.creative");
        this.field_f5e54dca_Dne[XHL.field_5e585957_Qnq.method_7a46288d_Dne()] = irb2.method_39193c_Dne("gameMode.adventure");
        this.field_36ce0a6_Dne = new SWj(this);
        this.field_36ce0a6_Dne.method_b6186b2b_Dne(this.field_f27c122c_Dne, 4, 5);
        this.method_d44b4592_zGp();
    }

    static pee_0 method_54f760e6_Dne(PRD pRD) {
        return pRD.field_2025835b_FWm;
    }

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        this.field_36ce0a6_Dne.method_2c2cec86_Dne(n, n2, f);
        this.method_32faf66d_Dne(this.field_3791671_Dne, this.field_569fcf45_Dne, this.field_21260d_FWm / 2, 20, 0xFFFFFF);
        super.method_2c2cec86_Dne(n, n2, f);
    }
}

