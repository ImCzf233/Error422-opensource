package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public class JFs
extends qVZ {
    private int field_2d29f4_aFZ;
    private pee_0 field_712f3bc2_aFZ;
    private pee_0 field_2025835b_FWm;
    private int field_388da6_zGp = -1;
    private pee_0 field_36bb77c_Dne;
    private pee_0 field_161ee0a5_DyG;
    private pee_0 field_75b38569_bzF;
    private String field_569fcf45_Dne;
    private muh field_37922ac_Dne;
    private pee_0 field_5e552643_Qnq;
    private nSp field_3791861_Dne;
    private boolean field_2e5f2c_bzF;
    private final qVZ field_37a7e17_Dne;
    private pee_0 field_f09d7674_zGp;
    private int field_267cf5_Qnq;
    private int field_2092ae_Dne;

    static int method_818ca085_FWm(JFs jFs, int n) {
        jFs.field_388da6_zGp = n;
        return jFs.field_388da6_zGp;
    }

    @Override
    protected void method_2c2cf7c9_Dne(int n, int n2, int n3) {
        super.method_2c2cf7c9_Dne(n, n2, n3);
    }

    private void method_d44b4592_zGp() {
        mNp mNp2 = new mNp(this.field_493682ed_Dne.field_37d3e5f_Dne);
        try {
            Boolean bl = mNp2.method_6eeeac67_Dne(this.field_37922ac_Dne.field_2092af_Dne);
            if (bl.booleanValue()) {
                this.field_2e5f2c_bzF = true;
                this.field_37922ac_Dne.field_c480ca78_bzF = "OPEN";
                this.method_7a46289a_Dne();
            }
        }
        catch (lUu lUu2) {
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    static msA method_ba6e2206_Dne(JFs jFs) {
        return jFs.field_3791671_Dne;
    }

    private void method_c073daf8_mrb() {
        if (this.field_388da6_zGp >= 0 && this.field_388da6_zGp < this.field_37922ac_Dne.field_f27c122c_Dne.size()) {
            this.field_569fcf45_Dne = (String)this.field_37922ac_Dne.field_f27c122c_Dne.get(this.field_388da6_zGp);
            irb irb2 = irb.method_2310d392_Dne();
            sHC sHC2 = new sHC(this, "Warning!", irb2.method_39193c_Dne("mco.configure.world.uninvite.question") + " '" + this.field_569fcf45_Dne + "'", 3);
            this.field_493682ed_Dne.method_b88fcbd2_Dne(sHC2);
        }
    }

    @Override
    public void method_7c6f6039_FWm() {
        Keyboard.enableRepeatEvents(false);
    }

    public JFs(qVZ qVZ2, muh muh2) {
        this.field_37a7e17_Dne = qVZ2;
        this.field_37922ac_Dne = muh2;
    }

    private String method_eecad346_Dne() {
        if (this.field_37922ac_Dne.field_2092bf_Dne) {
            return "Expired";
        }
        String string = this.field_37922ac_Dne.field_c480ca78_bzF.toLowerCase();
        return Character.toUpperCase(string.charAt(0)) + string.substring(1);
    }

    static int method_4e806484_FWm(JFs jFs) {
        return jFs.field_267cf5_Qnq;
    }

    private void method_8288d6ee_IjH() {
        mNp mNp2 = new mNp(this.field_493682ed_Dne.field_37d3e5f_Dne);
        try {
            boolean bl = mNp2.method_24b83a68_FWm(this.field_37922ac_Dne.field_2092af_Dne);
            if (bl) {
                this.field_2e5f2c_bzF = true;
                this.field_37922ac_Dne.field_c480ca78_bzF = "CLOSED";
                this.method_7a46289a_Dne();
            }
        }
        catch (lUu lUu2) {
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    private void method_ce7f5da9_Dne(int n) {
        this.field_37922ac_Dne.field_f27c122c_Dne.remove(n);
    }

    @Override
    public void method_ae128dc7_bzF() {
    }

    static int method_3069dc26_Dne(JFs jFs, int n) {
        return jFs.method_ce7f5d9c_Dne(n);
    }

    static muh method_ba6e2e41_Dne(JFs jFs) {
        return jFs.field_37922ac_Dne;
    }

    @Override
    protected void method_81183ff7_Dne(pee_0 pee_02) {
        if (pee_02.field_2092bf_Dne) {
            if (pee_02.field_2d29f4_aFZ == 10) {
                if (this.field_2e5f2c_bzF) {
                    ((wWl)this.field_37a7e17_Dne).method_ce7f616a_Dne(this.field_37922ac_Dne.field_2092af_Dne);
                }
                this.field_493682ed_Dne.method_b88fcbd2_Dne(this.field_37a7e17_Dne);
            } else if (pee_02.field_2d29f4_aFZ == 5) {
                this.field_493682ed_Dne.method_b88fcbd2_Dne(new PGU(this, this.field_37a7e17_Dne, this.field_37922ac_Dne));
            } else if (pee_02.field_2d29f4_aFZ == 1) {
                irb irb2 = irb.method_2310d392_Dne();
                String string = irb2.method_39193c_Dne("mco.configure.world.close.question.line1");
                String string2 = irb2.method_39193c_Dne("mco.configure.world.close.question.line2");
                this.field_493682ed_Dne.method_b88fcbd2_Dne(new lSK(this, "Warning!", string, string2, 1));
            } else if (pee_02.field_2d29f4_aFZ == 0) {
                this.method_d44b4592_zGp();
            } else if (pee_02.field_2d29f4_aFZ == 4) {
                this.field_493682ed_Dne.method_b88fcbd2_Dne(new VqU(this.field_37a7e17_Dne, this, this.field_37922ac_Dne));
            } else if (pee_02.field_2d29f4_aFZ == 3) {
                this.method_c073daf8_mrb();
            } else if (pee_02.field_2d29f4_aFZ == 6) {
                this.field_493682ed_Dne.method_b88fcbd2_Dne(new MaG(this, this.field_37922ac_Dne));
            } else if (pee_02.field_2d29f4_aFZ == 7) {
                this.field_493682ed_Dne.method_b88fcbd2_Dne(new ZVE(this, this.field_37922ac_Dne));
            }
        }
    }

    @Override
    protected void method_16a1040_Dne(char c, int n) {
    }

    static Minecraft method_61be238_Dne(JFs jFs) {
        return jFs.field_493682ed_Dne;
    }

    static int method_67217fb6_bzF(JFs jFs) {
        return jFs.field_388da6_zGp;
    }

    @Override
    public void method_17484c9_Dne(boolean bl, int n) {
        if (n == 3) {
            if (bl) {
                mNp mNp2 = new mNp(this.field_493682ed_Dne.field_37d3e5f_Dne);
                try {
                    mNp2.method_71ac4b4_Dne(this.field_37922ac_Dne.field_2092af_Dne, this.field_569fcf45_Dne);
                }
                catch (lUu lUu2) {
                    System.err.println("Could not uninvite the selected user");
                }
                this.method_ce7f5da9_Dne(this.field_388da6_zGp);
            }
            this.field_493682ed_Dne.method_b88fcbd2_Dne(new JFs(this.field_37a7e17_Dne, this.field_37922ac_Dne));
        }
        if (n == 1) {
            if (bl) {
                this.method_8288d6ee_IjH();
            }
            this.field_493682ed_Dne.method_b88fcbd2_Dne(this);
        }
    }

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        irb irb2 = irb.method_2310d392_Dne();
        this.method_a98a0660_aFZ();
        this.field_3791861_Dne.method_2c2cec86_Dne(n, n2, f);
        this.method_32faf66d_Dne(this.field_3791671_Dne, irb2.method_39193c_Dne("mco.configure.world.title"), this.field_21260d_FWm / 2, 17, 0xFFFFFF);
        this.method_67d6d54c_FWm(this.field_3791671_Dne, irb2.method_39193c_Dne("mco.configure.world.name"), this.field_2092ae_Dne, this.method_ce7f5d9c_Dne(1), 0xA0A0A0);
        this.method_67d6d54c_FWm(this.field_3791671_Dne, this.field_37922ac_Dne.method_d1f1ed87_FWm(), this.field_2092ae_Dne, this.method_ce7f5d9c_Dne(2), 0xFFFFFF);
        this.method_67d6d54c_FWm(this.field_3791671_Dne, irb2.method_39193c_Dne("mco.configure.world.description"), this.field_2092ae_Dne, this.method_ce7f5d9c_Dne(4), 0xA0A0A0);
        this.method_67d6d54c_FWm(this.field_3791671_Dne, this.field_37922ac_Dne.method_eecad346_Dne(), this.field_2092ae_Dne, this.method_ce7f5d9c_Dne(5), 0xFFFFFF);
        this.method_67d6d54c_FWm(this.field_3791671_Dne, irb2.method_39193c_Dne("mco.configure.world.status"), this.field_2092ae_Dne, this.method_ce7f5d9c_Dne(7), 0xA0A0A0);
        this.method_67d6d54c_FWm(this.field_3791671_Dne, this.method_eecad346_Dne(), this.field_2092ae_Dne, this.method_ce7f5d9c_Dne(8), 0xFFFFFF);
        this.method_67d6d54c_FWm(this.field_3791671_Dne, irb2.method_39193c_Dne("mco.configure.world.invited"), this.field_2d29f4_aFZ, this.method_ce7f5d9c_Dne(1), 0xA0A0A0);
        super.method_2c2cec86_Dne(n, n2, f);
    }

    @Override
    public void method_7a46289a_Dne() {
        irb irb2 = irb.method_2310d392_Dne();
        this.field_2092ae_Dne = this.field_21260d_FWm / 2 - 200;
        this.field_267cf5_Qnq = 180;
        this.field_2d29f4_aFZ = this.field_21260d_FWm / 2;
        Keyboard.enableRepeatEvents(true);
        this.field_f27c122c_Dne.clear();
        if (this.field_37922ac_Dne.field_c480ca78_bzF.equals("CLOSED")) {
            this.field_36bb77c_Dne = new pee_0(0, this.field_2092ae_Dne, this.method_ce7f5d9c_Dne(12), this.field_267cf5_Qnq / 2 - 2, 20, irb2.method_39193c_Dne("mco.configure.world.buttons.open"));
            this.field_f27c122c_Dne.add(this.field_36bb77c_Dne);
            this.field_36bb77c_Dne.field_2092bf_Dne = !this.field_37922ac_Dne.field_2092bf_Dne;
        } else {
            this.field_2025835b_FWm = new pee_0(1, this.field_2092ae_Dne, this.method_ce7f5d9c_Dne(12), this.field_267cf5_Qnq / 2 - 2, 20, irb2.method_39193c_Dne("mco.configure.world.buttons.close"));
            this.field_f27c122c_Dne.add(this.field_2025835b_FWm);
            this.field_2025835b_FWm.field_2092bf_Dne = !this.field_37922ac_Dne.field_2092bf_Dne;
        }
        this.field_161ee0a5_DyG = new pee_0(7, this.field_2092ae_Dne + this.field_267cf5_Qnq / 2 + 2, this.method_ce7f5d9c_Dne(12), this.field_267cf5_Qnq / 2 - 2, 20, irb2.method_39193c_Dne("mco.configure.world.buttons.subscription"));
        this.field_f27c122c_Dne.add(this.field_161ee0a5_DyG);
        this.field_75b38569_bzF = new pee_0(5, this.field_2092ae_Dne, this.method_ce7f5d9c_Dne(10), this.field_267cf5_Qnq / 2 - 2, 20, irb2.method_39193c_Dne("mco.configure.world.buttons.edit"));
        this.field_f27c122c_Dne.add(this.field_75b38569_bzF);
        this.field_5e552643_Qnq = new pee_0(6, this.field_2092ae_Dne + this.field_267cf5_Qnq / 2 + 2, this.method_ce7f5d9c_Dne(10), this.field_267cf5_Qnq / 2 - 2, 20, irb2.method_39193c_Dne("mco.configure.world.buttons.reset"));
        this.field_f27c122c_Dne.add(this.field_5e552643_Qnq);
        this.field_712f3bc2_aFZ = new pee_0(4, this.field_2d29f4_aFZ, this.method_ce7f5d9c_Dne(10), this.field_267cf5_Qnq / 2 - 2, 20, irb2.method_39193c_Dne("mco.configure.world.buttons.invite"));
        this.field_f27c122c_Dne.add(this.field_712f3bc2_aFZ);
        this.field_f09d7674_zGp = new pee_0(3, this.field_2d29f4_aFZ + this.field_267cf5_Qnq / 2 + 2, this.method_ce7f5d9c_Dne(10), this.field_267cf5_Qnq / 2 - 2, 20, irb2.method_39193c_Dne("mco.configure.world.buttons.uninvite"));
        this.field_f27c122c_Dne.add(this.field_f09d7674_zGp);
        this.field_f27c122c_Dne.add(new pee_0(10, this.field_2d29f4_aFZ, this.method_ce7f5d9c_Dne(12), this.field_267cf5_Qnq, 20, irb2.method_39193c_Dne("gui.back")));
        this.field_3791861_Dne = new nSp(this);
        this.field_75b38569_bzF.field_2092bf_Dne = !this.field_37922ac_Dne.field_2092bf_Dne;
        this.field_5e552643_Qnq.field_2092bf_Dne = !this.field_37922ac_Dne.field_2092bf_Dne;
        this.field_712f3bc2_aFZ.field_2092bf_Dne = !this.field_37922ac_Dne.field_2092bf_Dne;
        this.field_f09d7674_zGp.field_2092bf_Dne = !this.field_37922ac_Dne.field_2092bf_Dne;
    }

    private int method_ce7f5d9c_Dne(int n) {
        return 40 + n * 13;
    }

    static int method_752cb0c3_Dne(JFs jFs) {
        return jFs.field_2d29f4_aFZ;
    }
}

