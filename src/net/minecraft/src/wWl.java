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
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class wWl
extends qVZ {
    private static final Object field_63dcf1d7_Dne;
    private qVZ field_37a7e17_Dne;
    private TIk field_36d2096_Dne;
    private boolean field_2e5f2c_bzF;
    private zXv field_37ea054_Dne;
    private ukD field_37c9bbe_Dne;
    private volatile int field_2d29f4_aFZ;
    private int field_388da6_zGp = 0;
    private String field_569fcf45_Dne = null;
    private int field_267cf5_Qnq = -1;
    private static int field_2092ae_Dne;
    private pee_0 field_36bb77c_Dne;
    private pee_0 field_75b38569_bzF;
    private pee_0 field_2025835b_FWm;
    private Long field_59bc38fa_Dne;
    private List<muh> field_6a0474ed_FWm = Collections.emptyList();

    static Minecraft method_d86c8cf4_Qnq(wWl wWl2) {
        return wWl2.field_493682ed_Dne;
    }

    static msA method_acba2971_Dne(wWl wWl2) {
        return wWl2.field_3791671_Dne;
    }

    @Override
    public void method_7c6f6039_FWm() {
        Keyboard.enableRepeatEvents(false);
    }

    private void method_ce7f5da9_Dne(int n) {
        if (n >= 0 && n < this.field_6a0474ed_FWm.size()) {
            muh muh2 = (muh)this.field_6a0474ed_FWm.get(n);
            this.field_37c9bbe_Dne.method_7c6f6039_FWm();
            blc blc2 = new blc(this.field_493682ed_Dne, this, new OQj(this, muh2));
            blc2.method_d44b4592_zGp();
            this.field_493682ed_Dne.method_b88fcbd2_Dne(blc2);
        }
    }

    private void method_9fbb4d61_Qnq(int n, int n2, int n3, int n4) {
        this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/gui/gui.png");
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glPushMatrix();
        GL11.glScalef(0.5f, 0.5f, 0.5f);
        this.method_17d7ea99_FWm(n * 2, n2 * 2, 207, 0, 16, 15);
        GL11.glPopMatrix();
        if (n3 >= n && n3 <= n + 9 && n4 >= n2 && n4 <= n2 + 9) {
            this.field_569fcf45_Dne = "Open World";
        }
    }

    private void method_ae303daa_FWm(int n, int n2, int n3, int n4, int n5) {
        if (this.field_388da6_zGp % 20 < 10) {
            this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/gui/gui.png");
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            GL11.glPushMatrix();
            GL11.glScalef(0.5f, 0.5f, 0.5f);
            this.method_17d7ea99_FWm(n * 2, n2 * 2, 207, 0, 16, 15);
            GL11.glPopMatrix();
        }
        if (n3 >= n && n3 <= n + 9 && n4 >= n2 && n4 <= n2 + 9) {
            this.field_569fcf45_Dne = n5 == 0 ? "Expires in < a day" : "Expires in " + n5 + (n5 > 1 ? " days" : " day");
        }
    }

    static void method_80259968_Dne(wWl wWl2, int n, int n2, int n3, int n4, int n5) {
        wWl2.method_ae303daa_FWm(n, n2, n3, n4, n5);
    }

    static int method_eaa4c8fa_FWm(wWl wWl2, int n) {
        wWl2.field_267cf5_Qnq = n;
        return wWl2.field_267cf5_Qnq;
    }

    static int method_ae128dba_bzF() {
        return field_2092ae_Dne--;
    }

    private muh method_d36301db_Dne(long l) {
        mNp mNp2 = new mNp(this.field_493682ed_Dne.field_37d3e5f_Dne);
        try {
            return mNp2.method_d36301db_Dne(l);
        }
        catch (lUu lUu2) {
        }
        catch (IOException iOException) {
            // empty catch block
        }
        return null;
    }

    static int method_7a46288d_Dne() {
        return field_2092ae_Dne;
    }

    static msA method_899c14b2_FWm(wWl wWl2) {
        return wWl2.field_3791671_Dne;
    }

    static void method_998204a8_Dne(wWl wWl2, int n) {
        wWl2.method_ce7f5da9_Dne(n);
    }

    static Minecraft method_441d90e5_zGp(wWl wWl2) {
        return wWl2.field_493682ed_Dne;
    }

    static msA method_6b02dcca_Qnq(wWl wWl2) {
        return wWl2.field_3791671_Dne;
    }

    @Override
    protected void method_16a1040_Dne(char c, int n) {
        if (n == 59) {
            this.field_493682ed_Dne.field_3758af7_Dne.field_36b0ba_udO = !this.field_493682ed_Dne.field_3758af7_Dne.field_36b0ba_udO;
            this.field_493682ed_Dne.field_3758af7_Dne.method_7c6f6039_FWm();
        } else if (c == '\r') {
            this.method_81183ff7_Dne((pee_0)this.field_f27c122c_Dne.get(2));
        } else {
            super.method_16a1040_Dne(c, n);
        }
    }

    static String method_88f9407b_Dne(wWl wWl2, String string) {
        wWl2.field_569fcf45_Dne = string;
        return wWl2.field_569fcf45_Dne;
    }

    static pee_0 method_acacca7c_Dne(wWl wWl2) {
        return wWl2.field_36bb77c_Dne;
    }

    static msA method_6de71028_DyG(wWl wWl2) {
        return wWl2.field_3791671_Dne;
    }

    static msA method_504c6a6b_aFZ(wWl wWl2) {
        return wWl2.field_3791671_Dne;
    }

    static {
        field_2092ae_Dne = 0;
        field_63dcf1d7_Dne = new Object();
    }

    static List method_d5e11f2c_Dne(wWl wWl2) {
        return wWl2.field_6a0474ed_FWm;
    }

    static pee_0 method_898eb5bd_FWm(wWl wWl2) {
        return wWl2.field_75b38569_bzF;
    }

    private void method_6465ff20_aFZ(int n, int n2, int n3, int n4) {
        this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/gui/gui.png");
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glPushMatrix();
        GL11.glScalef(0.5f, 0.5f, 0.5f);
        this.method_17d7ea99_FWm(n * 2, n2 * 2, 223, 0, 16, 15);
        GL11.glPopMatrix();
        if (n3 >= n && n3 <= n + 9 && n4 >= n2 && n4 <= n2 + 9) {
            this.field_569fcf45_Dne = "Closed World";
        }
    }

    static Minecraft method_62e18fed_Dne(wWl wWl2) {
        return wWl2.field_493682ed_Dne;
    }

    public void method_d44b4592_zGp() {
        irb irb2 = irb.method_2310d392_Dne();
        this.field_75b38569_bzF = new pee_0(1, this.field_21260d_FWm / 2 - 154, this.field_2e5f1b_bzF - 52, 100, 20, irb2.method_39193c_Dne("mco.selectServer.select"));
        this.field_f27c122c_Dne.add(this.field_75b38569_bzF);
        this.field_2025835b_FWm = new pee_0(2, this.field_21260d_FWm / 2 - 48, this.field_2e5f1b_bzF - 52, 100, 20, irb2.method_39193c_Dne("mco.selectServer.create"));
        this.field_f27c122c_Dne.add(this.field_2025835b_FWm);
        this.field_36bb77c_Dne = new pee_0(3, this.field_21260d_FWm / 2 + 58, this.field_2e5f1b_bzF - 52, 100, 20, irb2.method_39193c_Dne("mco.selectServer.configure"));
        this.field_f27c122c_Dne.add(this.field_36bb77c_Dne);
        this.field_37ea054_Dne = new zXv(4, this.field_21260d_FWm / 2 - 154, this.field_2e5f1b_bzF - 28, 154, 20, irb2.method_39193c_Dne("mco.selectServer.moreinfo"));
        this.field_f27c122c_Dne.add(this.field_37ea054_Dne);
        this.field_f27c122c_Dne.add(new pee_0(0, this.field_21260d_FWm / 2 + 6, this.field_2e5f1b_bzF - 28, 153, 20, irb2.method_39193c_Dne("gui.cancel")));
        boolean bl = this.field_267cf5_Qnq >= 0 && this.field_267cf5_Qnq < this.field_36d2096_Dne.method_7a46288d_Dne();
        this.field_75b38569_bzF.field_2092bf_Dne = bl && ((muh)this.field_6a0474ed_FWm.get((int)this.field_267cf5_Qnq)).field_c480ca78_bzF.equals("OPEN") && !((muh)this.field_6a0474ed_FWm.get((int)this.field_267cf5_Qnq)).field_2092bf_Dne;
        this.field_36bb77c_Dne.field_2092bf_Dne = bl && this.field_493682ed_Dne.field_37d3e5f_Dne.field_569fcf45_Dne.equals(((muh)this.field_6a0474ed_FWm.get((int)this.field_267cf5_Qnq)).field_9e60dbde_Qnq);
        this.field_2025835b_FWm.field_2092bf_Dne = this.field_2d29f4_aFZ > 0;
    }

    static msA method_77da2379_zGp(wWl wWl2) {
        return wWl2.field_3791671_Dne;
    }

    static Minecraft method_8837a40c_FWm(wWl wWl2) {
        return wWl2.field_493682ed_Dne;
    }

    @Override
    public void method_ae128dc7_bzF() {
        super.method_ae128dc7_bzF();
        ++this.field_388da6_zGp;
        if (this.field_37c9bbe_Dne.method_7a46289e_Dne()) {
            List<muh> list = this.field_37c9bbe_Dne.method_adea226d_Dne();
            block0: for (muh muh2 : list) {
                for (muh muh3 : this.field_6a0474ed_FWm) {
                    if (muh2.field_2092af_Dne != muh3.field_2092af_Dne) continue;
                    muh2.method_b3779f27_Dne(muh3);
                    if (this.field_59bc38fa_Dne == null || this.field_59bc38fa_Dne != muh2.field_2092af_Dne) continue block0;
                    this.field_59bc38fa_Dne = null;
                    muh2.field_21261e_FWm = false;
                    continue block0;
                }
            }
            this.field_6a0474ed_FWm = list;
            this.field_37c9bbe_Dne.method_7a46289a_Dne();
        }
        this.field_2025835b_FWm.field_2092bf_Dne = this.field_2d29f4_aFZ > 0;
    }

    static void method_e319f8fb_Dne(wWl wWl2, int n, int n2, int n3, int n4) {
        wWl2.method_58fe7b07_bzF(n, n2, n3, n4);
    }

    static int method_7c6f602c_FWm() {
        return field_2092ae_Dne++;
    }

    public void method_ce7f616a_Dne(long l) {
        this.field_267cf5_Qnq = -1;
        this.field_59bc38fa_Dne = l;
    }

    static Minecraft method_820882b3_aFZ(wWl wWl2) {
        return wWl2.field_493682ed_Dne;
    }

    static int method_c2e325ae_Dne(wWl wWl2) {
        return wWl2.field_267cf5_Qnq;
    }

    static Minecraft method_4b9fa29a_bzF(wWl wWl2) {
        return wWl2.field_493682ed_Dne;
    }

    private void method_58fe7b07_bzF(int n, int n2, int n3, int n4) {
        this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/gui/gui.png");
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glPushMatrix();
        GL11.glScalef(0.5f, 0.5f, 0.5f);
        this.method_17d7ea99_FWm(n * 2, n2 * 2, 191, 0, 16, 15);
        GL11.glPopMatrix();
        if (n3 >= n && n3 <= n + 9 && n4 >= n2 && n4 <= n2 + 9) {
            this.field_569fcf45_Dne = "Expired World";
        }
    }

    static int method_9982049b_Dne(wWl wWl2, int n) {
        wWl2.field_2d29f4_aFZ = n;
        return wWl2.field_2d29f4_aFZ;
    }

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        this.field_569fcf45_Dne = null;
        irb irb2 = irb.method_2310d392_Dne();
        this.method_a98a0660_aFZ();
        this.field_36d2096_Dne.method_2c2cec86_Dne(n, n2, f);
        this.method_32faf66d_Dne(this.field_3791671_Dne, irb2.method_39193c_Dne("mco.title"), this.field_21260d_FWm / 2, 20, 0xFFFFFF);
        super.method_2c2cec86_Dne(n, n2, f);
        if (this.field_569fcf45_Dne != null) {
            this.method_fbd61744_Dne(this.field_569fcf45_Dne, n, n2);
        }
    }

    @Override
    public void method_7a46289a_Dne() {
        Keyboard.enableRepeatEvents(true);
        this.field_f27c122c_Dne.clear();
        this.field_37c9bbe_Dne = new ukD(this.field_493682ed_Dne.field_37d3e5f_Dne);
        if (!this.field_2e5f2c_bzF) {
            this.field_2e5f2c_bzF = true;
            this.field_36d2096_Dne = new TIk(this);
        } else {
            this.field_36d2096_Dne.method_5972745a_Dne(this.field_21260d_FWm, this.field_2e5f1b_bzF, 32, this.field_2e5f1b_bzF - 64);
        }
        new nwv(this).start();
        this.method_d44b4592_zGp();
    }

    @Override
    protected void method_81183ff7_Dne(pee_0 pee_02) {
        if (pee_02.field_2092bf_Dne) {
            if (pee_02.field_2d29f4_aFZ == 1) {
                this.method_ce7f5da9_Dne(this.field_267cf5_Qnq);
            } else if (pee_02.field_2d29f4_aFZ == 3) {
                List list = this.field_37c9bbe_Dne.method_adea226d_Dne();
                if (this.field_267cf5_Qnq < list.size()) {
                    muh muh2 = (muh)list.get(this.field_267cf5_Qnq);
                    muh muh3 = this.method_d36301db_Dne(muh2.field_2092af_Dne);
                    if (muh3 != null) {
                        this.field_37c9bbe_Dne.method_7c6f6039_FWm();
                        this.field_493682ed_Dne.method_b88fcbd2_Dne(new JFs(this, muh3));
                    }
                }
            } else if (pee_02.field_2d29f4_aFZ == 0) {
                this.field_37c9bbe_Dne.method_7c6f6039_FWm();
                this.field_493682ed_Dne.method_b88fcbd2_Dne(this.field_37a7e17_Dne);
            } else if (pee_02.field_2d29f4_aFZ == 2) {
                this.field_37c9bbe_Dne.method_7c6f6039_FWm();
                this.field_493682ed_Dne.method_b88fcbd2_Dne(new LKa(this));
            } else if (pee_02.field_2d29f4_aFZ == 4) {
                this.field_37ea054_Dne.method_8f501fe4_Dne("http://realms.minecraft.net/");
            } else {
                this.field_36d2096_Dne.method_81183ff7_Dne(pee_02);
            }
        }
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

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void method_b3779f27_Dne(muh muh2) throws IOException {
        block26: {
            if (muh2.field_309c90bc_DyG.equals("")) {
                muh2.field_309c90bc_DyG = (Object)((Object)Dne.field_140f3afb_div) + "" + 0;
            }
            muh2.field_21260d_FWm = 61;
            Qyv qyv = Qyv.method_284f49a7_Dne(muh2.field_bc57ecbf_aFZ);
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
                        muh2.field_21260d_FWm = geR.method_5ab44f92_Dne(stringArray[1], muh2.field_21260d_FWm);
                        muh2.field_8b8e234d_zGp = stringArray[2];
                        n = geR.method_5ab44f92_Dne(stringArray[4], 0);
                        int n2 = geR.method_5ab44f92_Dne(stringArray[5], 0);
                        muh2.field_309c90bc_DyG = n >= 0 && n2 >= 0 ? (Object)((Object)Dne.field_140f3afb_div) + "" + n : "" + (Object)((Object)Dne.field_5b6ce25_IjH) + "???";
                    } else {
                        muh2.field_8b8e234d_zGp = "???";
                        muh2.field_21260d_FWm = 62;
                        muh2.field_309c90bc_DyG = "" + (Object)((Object)Dne.field_5b6ce25_IjH) + "???";
                    }
                    break block26;
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
                muh2.field_d9a85c6_FWm = (Object)((Object)Dne.field_140f3afb_div) + string;
                muh2.field_309c90bc_DyG = n >= 0 && n3 > 0 ? (Object)((Object)Dne.field_140f3afb_div) + "" + n : "" + (Object)((Object)Dne.field_5b6ce25_IjH) + "???";
                muh2.field_8b8e234d_zGp = "1.3";
                muh2.field_21260d_FWm = 60;
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

    static void method_5ec0aea6_Dne(wWl wWl2, muh muh2) throws IOException {
        wWl2.method_b3779f27_Dne(muh2);
    }

    static msA method_e8f846e4_bzF(wWl wWl2) {
        return wWl2.field_3791671_Dne;
    }

    static void method_1f58166e_bzF(wWl wWl2, int n, int n2, int n3, int n4) {
        wWl2.method_9fbb4d61_Qnq(n, n2, n3, n4);
    }

    static Object method_fc07f5d8_Dne() {
        return field_63dcf1d7_Dne;
    }

    static void method_bffbe43c_FWm(wWl wWl2, int n, int n2, int n3, int n4) {
        wWl2.method_6465ff20_aFZ(n, n2, n3, n4);
    }

    public wWl(qVZ qVZ2) {
        this.field_37a7e17_Dne = qVZ2;
    }
}

