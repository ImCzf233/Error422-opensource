package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Collections;
import java.util.List;
import org.lwjgl.input.Keyboard;

public class KDD
extends qVZ {
    private jQO field_3773b64_Dne;
    private static int field_2092ae_Dne = 0;
    private etB field_3757759_Dne = null;
    private svg field_37be088_Dne;
    private qVZ field_37a7e17_Dne;
    private int field_267cf5_Qnq = -1;
    private List field_6a0474ed_FWm = Collections.emptyList();
    private boolean field_388db7_zGp = false;
    private pee_0 field_75b38569_bzF;
    private Nmc field_36aec88_Dne;
    private pee_0 field_36bb77c_Dne;
    private boolean field_267d06_Qnq = false;
    private GNm field_3674ac6_Dne;
    private static Object field_63dcf1d7_Dne = new Object();
    private boolean field_2d2a05_aFZ = false;
    private pee_0 field_2025835b_FWm;
    private int field_2d29f4_aFZ;
    private boolean field_20b868_DyG;
    private String field_569fcf45_Dne = null;
    private boolean field_2e5f2c_bzF = false;

    @Override
    public void method_7c6f6039_FWm() {
        Keyboard.enableRepeatEvents(false);
        if (this.field_37be088_Dne != null) {
            this.field_37be088_Dne.interrupt();
            this.field_37be088_Dne = null;
        }
    }

    static pee_0 method_73ca193d_Dne(KDD kDD) {
        return kDD.field_2025835b_FWm;
    }

    static void method_5f501587_Dne(KDD kDD, int n) {
        kDD.method_ce7f5da9_Dne(n);
    }

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        this.field_569fcf45_Dne = null;
        irb irb2 = irb.method_2310d392_Dne();
        this.method_a98a0660_aFZ();
        this.field_36aec88_Dne.method_2c2cec86_Dne(n, n2, f);
        this.method_32faf66d_Dne(this.field_3791671_Dne, irb2.method_39193c_Dne("multiplayer.title"), this.field_21260d_FWm / 2, 20, 0xFFFFFF);
        super.method_2c2cec86_Dne(n, n2, f);
        if (this.field_569fcf45_Dne != null) {
            this.method_fbd61744_Dne(this.field_569fcf45_Dne, n, n2);
        }
    }

    static int method_5003b0b0_FWm(KDD kDD) {
        return kDD.field_2d29f4_aFZ;
    }

    static int method_5f50157a_Dne(KDD kDD, int n) {
        kDD.field_267cf5_Qnq = n;
        return kDD.field_267cf5_Qnq;
    }

    @Override
    protected void method_16a1040_Dne(char c, int n) {
        int n2 = this.field_267cf5_Qnq--;
        if (n == 59) {
            this.field_493682ed_Dne.field_3758af7_Dne.field_36b0ba_udO = !this.field_493682ed_Dne.field_3758af7_Dne.field_36b0ba_udO;
            this.field_493682ed_Dne.field_3758af7_Dne.method_7c6f6039_FWm();
        } else if (KDD.method_ae128dcb_bzF() && n == 200) {
            if (n2 > 0 && n2 < this.field_3674ac6_Dne.method_7a46288d_Dne()) {
                this.field_3674ac6_Dne.method_16cca7a_Dne(n2, n2 - 1);
                if (n2 < this.field_3674ac6_Dne.method_7a46288d_Dne() - 1) {
                    this.field_36aec88_Dne.method_ce7f5da9_Dne(-this.field_36aec88_Dne.field_267cf5_Qnq);
                }
            }
        } else if (KDD.method_ae128dcb_bzF() && n == 208) {
            if (n2 < this.field_3674ac6_Dne.method_7a46288d_Dne() - 1) {
                this.field_3674ac6_Dne.method_16cca7a_Dne(n2, n2 + 1);
                ++this.field_267cf5_Qnq;
                if (n2 > 0) {
                    this.field_36aec88_Dne.method_ce7f5da9_Dne(this.field_36aec88_Dne.field_267cf5_Qnq);
                }
            }
        } else if (c == '\r') {
            this.method_81183ff7_Dne((pee_0)this.field_f27c122c_Dne.get(2));
        } else {
            super.method_16a1040_Dne(c, n);
        }
    }

    static String method_7e12599a_Dne(KDD kDD, String string) {
        kDD.field_569fcf45_Dne = string;
        return kDD.field_569fcf45_Dne;
    }

    @Override
    public void method_17484c9_Dne(boolean bl, int n) {
        if (this.field_2e5f2c_bzF) {
            this.field_2e5f2c_bzF = false;
            if (bl) {
                this.field_3674ac6_Dne.method_ce7f5da9_Dne(n);
                this.field_3674ac6_Dne.method_7c6f6039_FWm();
                this.field_267cf5_Qnq = -1;
            }
            this.field_493682ed_Dne.method_b88fcbd2_Dne(this);
        } else if (this.field_388db7_zGp) {
            this.field_388db7_zGp = false;
            if (bl) {
                this.method_7f053055_FWm(this.field_3757759_Dne);
            } else {
                this.field_493682ed_Dne.method_b88fcbd2_Dne(this);
            }
        } else if (this.field_267d06_Qnq) {
            this.field_267d06_Qnq = false;
            if (bl) {
                this.field_3674ac6_Dne.method_a5b17c94_Dne(this.field_3757759_Dne);
                this.field_3674ac6_Dne.method_7c6f6039_FWm();
                this.field_267cf5_Qnq = -1;
            }
            this.field_493682ed_Dne.method_b88fcbd2_Dne(this);
        } else if (this.field_2d2a05_aFZ) {
            this.field_2d2a05_aFZ = false;
            if (bl) {
                etB etB2 = this.field_3674ac6_Dne.method_9e791b47_Dne(this.field_267cf5_Qnq);
                etB2.field_569fcf45_Dne = this.field_3757759_Dne.field_569fcf45_Dne;
                etB2.field_d9a85c6_FWm = this.field_3757759_Dne.field_d9a85c6_FWm;
                etB2.method_117d59bb_FWm(this.field_3757759_Dne.method_ae128dcb_bzF());
                this.field_3674ac6_Dne.method_7c6f6039_FWm();
            }
            this.field_493682ed_Dne.method_b88fcbd2_Dne(this);
        }
    }

    static int method_7a46288d_Dne() {
        return field_2092ae_Dne;
    }

    @Override
    public void method_7a46289a_Dne() {
        Keyboard.enableRepeatEvents(true);
        this.field_f27c122c_Dne.clear();
        if (!this.field_20b868_DyG) {
            this.field_20b868_DyG = true;
            this.field_3674ac6_Dne = new GNm(this.field_493682ed_Dne);
            this.field_3674ac6_Dne.method_7a46289a_Dne();
            this.field_3773b64_Dne = new jQO();
            try {
                this.field_37be088_Dne = new svg(this.field_3773b64_Dne);
                this.field_37be088_Dne.start();
            }
            catch (Exception exception) {
                this.field_493682ed_Dne.method_230e0120_Dne().method_110c4dc3_FWm("Unable to start LAN server detection: " + exception.getMessage());
            }
            this.field_36aec88_Dne = new Nmc(this);
        } else {
            this.field_36aec88_Dne.method_5972745a_Dne(this.field_21260d_FWm, this.field_2e5f1b_bzF, 32, this.field_2e5f1b_bzF - 64);
        }
        this.method_d44b4592_zGp();
    }

    static pee_0 method_50ac047e_FWm(KDD kDD) {
        return kDD.field_36bb77c_Dne;
    }

    static int method_76affcef_Dne(KDD kDD) {
        return kDD.field_267cf5_Qnq;
    }

    static pee_0 method_b00836b0_bzF(KDD kDD) {
        return kDD.field_75b38569_bzF;
    }

    protected void method_fbd61744_Dne(String string, int n, int n2) {
        if (string != null) {
            int n3 = n + 12;
            int n4 = n2 - 12;
            int n5 = this.field_3791671_Dne.method_8f501fd7_Dne(string);
            this.method_c6b5263a_Dne(n3 - 3, n4 - 3, n3 + n5 + 3, n4 + 8 + 3, -1073741824, -1073741824);
            this.field_3791671_Dne.method_7eed4432_Dne(string, n3, n4, -1);
        }
    }

    @Override
    public void method_ae128dc7_bzF() {
        super.method_ae128dc7_bzF();
        ++this.field_2d29f4_aFZ;
        if (this.field_3773b64_Dne.method_7a46289e_Dne()) {
            this.field_6a0474ed_FWm = this.field_3773b64_Dne.method_adea226d_Dne();
            this.field_3773b64_Dne.method_7a46289a_Dne();
        }
    }

    static List method_57f4bdcb_Dne(KDD kDD) {
        return kDD.field_6a0474ed_FWm;
    }

    public KDD(qVZ qVZ2) {
        this.field_37a7e17_Dne = qVZ2;
    }

    private void method_ce7f5da9_Dne(int n) {
        if (n < this.field_3674ac6_Dne.method_7a46288d_Dne()) {
            this.method_7f053055_FWm(this.field_3674ac6_Dne.method_9e791b47_Dne(n));
        } else if ((n -= this.field_3674ac6_Dne.method_7a46288d_Dne()) < this.field_6a0474ed_FWm.size()) {
            jhx jhx2 = (jhx)this.field_6a0474ed_FWm.get(n);
            this.method_7f053055_FWm(new etB(jhx2.method_eecad346_Dne(), jhx2.method_d1f1ed87_FWm()));
        }
    }

    static GNm method_73c5ac87_Dne(KDD kDD) {
        return kDD.field_3674ac6_Dne;
    }

    public void method_d44b4592_zGp() {
        boolean bl;
        irb irb2 = irb.method_2310d392_Dne();
        this.field_36bb77c_Dne = new pee_0(7, this.field_21260d_FWm / 2 - 154, this.field_2e5f1b_bzF - 28, 70, 20, irb2.method_39193c_Dne("selectServer.edit"));
        this.field_f27c122c_Dne.add(this.field_36bb77c_Dne);
        this.field_75b38569_bzF = new pee_0(2, this.field_21260d_FWm / 2 - 74, this.field_2e5f1b_bzF - 28, 70, 20, irb2.method_39193c_Dne("selectServer.delete"));
        this.field_f27c122c_Dne.add(this.field_75b38569_bzF);
        this.field_2025835b_FWm = new pee_0(1, this.field_21260d_FWm / 2 - 154, this.field_2e5f1b_bzF - 52, 100, 20, irb2.method_39193c_Dne("selectServer.select"));
        this.field_f27c122c_Dne.add(this.field_2025835b_FWm);
        this.field_f27c122c_Dne.add(new pee_0(4, this.field_21260d_FWm / 2 - 50, this.field_2e5f1b_bzF - 52, 100, 20, irb2.method_39193c_Dne("selectServer.direct")));
        this.field_f27c122c_Dne.add(new pee_0(3, this.field_21260d_FWm / 2 + 4 + 50, this.field_2e5f1b_bzF - 52, 100, 20, irb2.method_39193c_Dne("selectServer.add")));
        this.field_f27c122c_Dne.add(new pee_0(8, this.field_21260d_FWm / 2 + 4, this.field_2e5f1b_bzF - 28, 70, 20, irb2.method_39193c_Dne("selectServer.refresh")));
        this.field_f27c122c_Dne.add(new pee_0(0, this.field_21260d_FWm / 2 + 4 + 76, this.field_2e5f1b_bzF - 28, 75, 20, irb2.method_39193c_Dne("gui.cancel")));
        this.field_2025835b_FWm.field_2092bf_Dne = bl = this.field_267cf5_Qnq >= 0 && this.field_267cf5_Qnq < this.field_36aec88_Dne.method_7a46288d_Dne();
        this.field_36bb77c_Dne.field_2092bf_Dne = bl;
        this.field_75b38569_bzF.field_2092bf_Dne = bl;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void method_97a64b87_bzF(etB etB2) throws IOException {
        block25: {
            Qyv qyv = Qyv.method_284f49a7_Dne(etB2.field_d9a85c6_FWm);
            Socket socket = null;
            FilterInputStream filterInputStream = null;
            FilterOutputStream filterOutputStream = null;
            try {
                int n;
                socket = new Socket();
                socket.setSoTimeout(3000);
                socket.setTcpNoDelay(true);
                socket.setTrafficClass(18);
                socket.connect(new InetSocketAddress(qyv.method_eecad346_Dne(), qyv.method_7a46288d_Dne()), 3000);
                filterInputStream = new DataInputStream(socket.getInputStream());
                filterOutputStream = new DataOutputStream(socket.getOutputStream());
                ((DataOutputStream)filterOutputStream).write(254);
                ((DataOutputStream)filterOutputStream).write(1);
                if (filterInputStream.read() != 255) {
                    throw new IOException("Bad message");
                }
                String string = NER.method_1ce99840_Dne((DataInputStream)filterInputStream, 256);
                char[] cArray = string.toCharArray();
                for (n = 0; n < cArray.length; ++n) {
                    if (cArray[n] == '\u00a7' || cArray[n] == '\u0000' || BAQ.field_569fcf45_Dne.indexOf(cArray[n]) >= 0) continue;
                    cArray[n] = 63;
                }
                string = new String(cArray);
                if (string.startsWith("\u00a7") && string.length() > 1) {
                    String[] stringArray = string.substring(1).split("\u0000");
                    if (geR.method_5ab44f92_Dne(stringArray[0], 0) == 1) {
                        etB2.field_9e60dbde_Qnq = stringArray[3];
                        etB2.field_2092ae_Dne = geR.method_5ab44f92_Dne(stringArray[1], etB2.field_2092ae_Dne);
                        etB2.field_bc57ecbf_aFZ = stringArray[2];
                        n = geR.method_5ab44f92_Dne(stringArray[4], 0);
                        int n2 = geR.method_5ab44f92_Dne(stringArray[5], 0);
                        etB2.field_c480ca78_bzF = n >= 0 && n2 >= 0 ? (Object)((Object)Dne.field_140f3afb_div) + "" + n + "" + (Object)((Object)Dne.field_5b6ce25_IjH) + "/" + (Object)((Object)Dne.field_140f3afb_div) + n2 : "" + (Object)((Object)Dne.field_5b6ce25_IjH) + "???";
                    } else {
                        etB2.field_bc57ecbf_aFZ = "???";
                        etB2.field_9e60dbde_Qnq = "" + (Object)((Object)Dne.field_5b6ce25_IjH) + "???";
                        etB2.field_2092ae_Dne = 62;
                        etB2.field_c480ca78_bzF = "" + (Object)((Object)Dne.field_5b6ce25_IjH) + "???";
                    }
                    break block25;
                }
                String[] stringArray = string.split("\u00a7");
                string = stringArray[0];
                n = -1;
                int n3 = -1;
                try {
                    n = Integer.parseInt(stringArray[1]);
                    n3 = Integer.parseInt(stringArray[2]);
                }
                catch (Exception exception) {
                    // empty catch block
                }
                etB2.field_9e60dbde_Qnq = (Object)((Object)Dne.field_140f3afb_div) + string;
                etB2.field_c480ca78_bzF = n >= 0 && n3 > 0 ? (Object)((Object)Dne.field_140f3afb_div) + "" + n + "" + (Object)((Object)Dne.field_5b6ce25_IjH) + "/" + (Object)((Object)Dne.field_140f3afb_div) + n3 : "" + (Object)((Object)Dne.field_5b6ce25_IjH) + "???";
                etB2.field_bc57ecbf_aFZ = "1.3";
                etB2.field_2092ae_Dne = 60;
            }
            finally {
                try {
                    if (filterInputStream != null) {
                        filterInputStream.close();
                    }
                }
                catch (Throwable throwable) {}
                try {
                    if (filterOutputStream != null) {
                        filterOutputStream.close();
                    }
                }
                catch (Throwable throwable) {}
                try {
                    if (socket != null) {
                        socket.close();
                    }
                }
                catch (Throwable throwable) {}
            }
        }
    }

    private void method_7f053055_FWm(etB etB2) {
        this.field_493682ed_Dne.method_b88fcbd2_Dne(new rND(this, this.field_493682ed_Dne, etB2));
    }

    static int method_ae128dba_bzF() {
        return field_2092ae_Dne--;
    }

    static void method_a5b17c94_Dne(etB etB2) throws IOException {
        KDD.method_97a64b87_bzF(etB2);
    }

    static int method_7c6f602c_FWm() {
        return field_2092ae_Dne++;
    }

    @Override
    protected void method_81183ff7_Dne(pee_0 pee_02) {
        if (pee_02.field_2092bf_Dne) {
            if (pee_02.field_2d29f4_aFZ == 2) {
                String string = this.field_3674ac6_Dne.method_9e791b47_Dne((int)this.field_267cf5_Qnq).field_569fcf45_Dne;
                if (string != null) {
                    this.field_2e5f2c_bzF = true;
                    irb irb2 = irb.method_2310d392_Dne();
                    String string2 = irb2.method_39193c_Dne("selectServer.deleteQuestion");
                    String string3 = "'" + string + "' " + irb2.method_39193c_Dne("selectServer.deleteWarning");
                    String string4 = irb2.method_39193c_Dne("selectServer.deleteButton");
                    String string5 = irb2.method_39193c_Dne("gui.cancel");
                    sHC sHC2 = new sHC(this, string2, string3, string4, string5, this.field_267cf5_Qnq);
                    this.field_493682ed_Dne.method_b88fcbd2_Dne(sHC2);
                }
            } else if (pee_02.field_2d29f4_aFZ == 1) {
                this.method_ce7f5da9_Dne(this.field_267cf5_Qnq);
            } else if (pee_02.field_2d29f4_aFZ == 4) {
                this.field_388db7_zGp = true;
                this.field_3757759_Dne = new etB(KGL.method_39193c_Dne("selectServer.defaultName"), "");
                this.field_493682ed_Dne.method_b88fcbd2_Dne(new xze_0(this, this.field_3757759_Dne));
            } else if (pee_02.field_2d29f4_aFZ == 3) {
                this.field_267d06_Qnq = true;
                this.field_3757759_Dne = new etB(KGL.method_39193c_Dne("selectServer.defaultName"), "");
                this.field_493682ed_Dne.method_b88fcbd2_Dne(new ugH(this, this.field_3757759_Dne));
            } else if (pee_02.field_2d29f4_aFZ == 7) {
                this.field_2d2a05_aFZ = true;
                etB etB2 = this.field_3674ac6_Dne.method_9e791b47_Dne(this.field_267cf5_Qnq);
                this.field_3757759_Dne = new etB(etB2.field_569fcf45_Dne, etB2.field_d9a85c6_FWm);
                this.field_3757759_Dne.method_117d59bb_FWm(etB2.method_ae128dcb_bzF());
                this.field_493682ed_Dne.method_b88fcbd2_Dne(new ugH(this, this.field_3757759_Dne));
            } else if (pee_02.field_2d29f4_aFZ == 0) {
                this.field_493682ed_Dne.method_b88fcbd2_Dne(this.field_37a7e17_Dne);
            } else if (pee_02.field_2d29f4_aFZ == 8) {
                this.field_493682ed_Dne.method_b88fcbd2_Dne(new KDD(this.field_37a7e17_Dne));
            } else {
                this.field_36aec88_Dne.method_81183ff7_Dne(pee_02);
            }
        }
    }

    static Object method_fc07f5d8_Dne() {
        return field_63dcf1d7_Dne;
    }
}

