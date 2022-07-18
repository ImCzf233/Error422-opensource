package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

public class MKS
extends qVZ {
    private int field_388da6_zGp;
    private String field_9e60dbde_Qnq;
    private pee_0 field_36bb77c_Dne;
    private int field_2d29f4_aFZ;
    private static final String[] field_f5e54dca_Dne;
    private String field_c480ca78_bzF;
    private int field_2f0dd8_div;
    private int field_20b857_DyG;
    private static boolean field_267d06_Qnq;
    private int field_267cf5_Qnq;
    private int field_2092ae_Dne = 0;
    private float field_2092ab_Dne = 0.0f;
    private static final Random field_7331eae7_Dne;
    private String field_d9a85c6_FWm = "missingno";
    private int field_29186d_XHL;
    public static final String field_569fcf45_Dne;
    private int field_31b816_kGO;
    private static boolean field_2d2a05_aFZ;
    private int field_2a9ad6_Zpi;
    private int field_33448c_mrb;
    private final Object field_63dcf1d7_Dne = new Object();
    private int field_22c602_IjH;
    private boolean field_2e5f2c_bzF = true;

    static int method_53d6d806_FWm(MKS mKS) {
        return mKS.field_2d29f4_aFZ;
    }

    static msA method_5d5cefc9_FWm(MKS mKS) {
        return mKS.field_3791671_Dne;
    }

    @Override
    protected void method_81183ff7_Dne(pee_0 pee_02) {
        YiY yiY;
        xoY xoY2;
        if (pee_02.field_2d29f4_aFZ == 0) {
            this.field_493682ed_Dne.method_b88fcbd2_Dne(new uqy(this, this.field_493682ed_Dne.field_3758af7_Dne));
        }
        if (pee_02.field_2d29f4_aFZ == 5) {
            this.field_493682ed_Dne.method_b88fcbd2_Dne(new Utr(this, this.field_493682ed_Dne.field_3758af7_Dne));
        }
        if (pee_02.field_2d29f4_aFZ == 1) {
            this.field_493682ed_Dne.method_b88fcbd2_Dne(new PRD(this));
        }
        if (pee_02.field_2d29f4_aFZ == 2) {
            this.field_493682ed_Dne.method_b88fcbd2_Dne(new KDD(this));
        }
        if (pee_02.field_2d29f4_aFZ == 3) {
            this.field_493682ed_Dne.method_b88fcbd2_Dne(new wWl(this));
        }
        if (pee_02.field_2d29f4_aFZ == 4) {
            this.field_493682ed_Dne.method_907a9d21_Qnq();
        }
        if (pee_02.field_2d29f4_aFZ == 11) {
            this.field_493682ed_Dne.method_14d1ad6_Dne("Demo_World", "Demo_World", Kqb.field_37916af_Dne);
        }
        if (pee_02.field_2d29f4_aFZ == 12 && (xoY2 = (yiY = this.field_493682ed_Dne.method_23096ac2_Dne()).method_2860db13_Dne("Demo_World")) != null) {
            sHC sHC2 = PRD.method_2044182a_Dne(this, xoY2.method_eecad346_Dne(), 12);
            this.field_493682ed_Dne.method_b88fcbd2_Dne(sHC2);
        }
    }

    private void method_a6ac9c87_FWm(int n, int n2, float f) {
        WAR wAR = WAR.field_36e5ca4_Dne;
        GL11.glMatrixMode(5889);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        GLU.gluPerspective(120.0f, 1.0f, 0.05f, 10.0f);
        GL11.glMatrixMode(5888);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glRotatef(180.0f, 1.0f, 0.0f, 0.0f);
        GL11.glEnable(3042);
        GL11.glDisable(3008);
        GL11.glDisable(2884);
        GL11.glDepthMask(false);
        GL11.glBlendFunc(770, 771);
        int n3 = 8;
        for (int i = 0; i < n3 * n3; ++i) {
            GL11.glPushMatrix();
            float f2 = ((float)(i % n3) / (float)n3 - 0.5f) / 64.0f;
            float f3 = ((float)(i / n3) / (float)n3 - 0.5f) / 64.0f;
            float f4 = 0.0f;
            GL11.glTranslatef(f2, f3, f4);
            GL11.glRotatef(geR.method_ce7f5256_Dne(((float)this.field_2092ae_Dne + f) / 400.0f) * 25.0f + 20.0f, 1.0f, 0.0f, 0.0f);
            GL11.glRotatef(-((float)this.field_2092ae_Dne + f) * 0.1f, 0.0f, 1.0f, 0.0f);
            for (int j = 0; j < 6; ++j) {
                GL11.glPushMatrix();
                if (j == 1) {
                    GL11.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
                }
                if (j == 2) {
                    GL11.glRotatef(180.0f, 0.0f, 1.0f, 0.0f);
                }
                if (j == 3) {
                    GL11.glRotatef(-90.0f, 0.0f, 1.0f, 0.0f);
                }
                if (j == 4) {
                    GL11.glRotatef(90.0f, 1.0f, 0.0f, 0.0f);
                }
                if (j == 5) {
                    GL11.glRotatef(-90.0f, 1.0f, 0.0f, 0.0f);
                }
                this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne(field_f5e54dca_Dne[j]);
                wAR.method_7a46289a_Dne();
                wAR.method_16cca7a_Dne(0xFFFFFF, 255 / (i + 1));
                float f5 = 0.0f;
                wAR.method_c38c5864_Dne(-1.0, -1.0, 1.0, 0.0f + f5, 0.0f + f5);
                wAR.method_c38c5864_Dne(1.0, -1.0, 1.0, 1.0f - f5, 0.0f + f5);
                wAR.method_c38c5864_Dne(1.0, 1.0, 1.0, 1.0f - f5, 1.0f - f5);
                wAR.method_c38c5864_Dne(-1.0, 1.0, 1.0, 0.0f + f5, 1.0f - f5);
                wAR.method_7a46288d_Dne();
                GL11.glPopMatrix();
            }
            GL11.glPopMatrix();
            GL11.glColorMask(true, true, true, false);
        }
        wAR.method_a663d9a5_FWm(0.0, 0.0, 0.0);
        GL11.glColorMask(true, true, true, true);
        GL11.glMatrixMode(5889);
        GL11.glPopMatrix();
        GL11.glMatrixMode(5888);
        GL11.glPopMatrix();
        GL11.glDepthMask(true);
        GL11.glEnable(2884);
        GL11.glEnable(3008);
        GL11.glEnable(2929);
    }

    private void method_2dedc39_bzF(int n, int n2, float f) {
        GL11.glViewport(0, 0, 256, 256);
        GL11.glDisable(3553);
        GL11.glEnable(3553);
        GL11.glViewport(0, 0, this.field_493682ed_Dne.field_2092ae_Dne, this.field_493682ed_Dne.field_21260d_FWm);
        WAR wAR = WAR.field_36e5ca4_Dne;
        wAR.method_7a46289a_Dne();
        float f2 = this.field_21260d_FWm > this.field_2e5f1b_bzF ? 120.0f / (float)this.field_21260d_FWm : 120.0f / (float)this.field_2e5f1b_bzF;
        float f3 = (float)this.field_2e5f1b_bzF * f2 / 256.0f;
        float f4 = (float)this.field_21260d_FWm * f2 / 256.0f;
        GL11.glTexParameteri(3553, 10241, 9729);
        GL11.glTexParameteri(3553, 10240, 9729);
        wAR.method_54283b9a_Dne(1.0f, 1.0f, 1.0f, 1.0f);
        int n3 = this.field_21260d_FWm;
        int n4 = this.field_2e5f1b_bzF;
        wAR.method_c38c5864_Dne(0.0, n4, this.field_21260a_FWm, 0.5f - f3, 0.5f + f4);
        wAR.method_c38c5864_Dne(n3, n4, this.field_21260a_FWm, 0.5f - f3, 0.5f - f4);
        wAR.method_c38c5864_Dne(n3, 0.0, this.field_21260a_FWm, 0.5f + f3, 0.5f - f4);
        wAR.method_c38c5864_Dne(0.0, 0.0, this.field_21260a_FWm, 0.5f + f3, 0.5f + f4);
        wAR.method_7a46288d_Dne();
    }

    static boolean method_ce7f9d7e_Dne(boolean bl) {
        field_2d2a05_aFZ = bl;
        return bl;
    }

    static int method_7a832445_Dne(MKS mKS) {
        return mKS.field_388da6_zGp;
    }

    static int method_ad588c2b_Qnq(MKS mKS, int n) {
        mKS.field_2f0dd8_div = n;
        return mKS.field_2f0dd8_div;
    }

    static String method_c032c284_Dne(MKS mKS, String string) {
        mKS.field_c480ca78_bzF = string;
        return mKS.field_c480ca78_bzF;
    }

    private void method_bac08d8f_FWm(int n, int n2, irb irb2) {
        this.field_f27c122c_Dne.add(new pee_0(11, this.field_21260d_FWm / 2 - 100, n, irb2.method_39193c_Dne("menu.playdemo")));
        this.field_36bb77c_Dne = new pee_0(12, this.field_21260d_FWm / 2 - 100, n + n2 * 1, irb2.method_39193c_Dne("menu.resetdemo"));
        this.field_f27c122c_Dne.add(this.field_36bb77c_Dne);
        YiY yiY = this.field_493682ed_Dne.method_23096ac2_Dne();
        xoY xoY2 = yiY.method_2860db13_Dne("Demo_World");
        if (xoY2 == null) {
            this.field_36bb77c_Dne.field_2092bf_Dne = false;
        }
    }

    static Minecraft method_ab377e76_Dne(MKS mKS) {
        return mKS.field_493682ed_Dne;
    }

    private void method_ce7f5266_Dne(float f) {
        GL11.glBindTexture(3553, this.field_267cf5_Qnq);
        this.field_493682ed_Dne.field_36d36bf_Dne.method_7a46289a_Dne();
        GL11.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, 256, 256);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glColorMask(true, true, true, false);
        WAR wAR = WAR.field_36e5ca4_Dne;
        wAR.method_7a46289a_Dne();
        int n = 3;
        for (int i = 0; i < n; ++i) {
            wAR.method_54283b9a_Dne(1.0f, 1.0f, 1.0f, 1.0f / (float)(i + 1));
            int n2 = this.field_21260d_FWm;
            int n3 = this.field_2e5f1b_bzF;
            float f2 = (float)(i - n / 2) / 256.0f;
            wAR.method_c38c5864_Dne(n2, n3, this.field_21260a_FWm, 0.0f + f2, 0.0);
            wAR.method_c38c5864_Dne(n2, 0.0, this.field_21260a_FWm, 1.0f + f2, 0.0);
            wAR.method_c38c5864_Dne(0.0, 0.0, this.field_21260a_FWm, 1.0f + f2, 1.0);
            wAR.method_c38c5864_Dne(0.0, n3, this.field_21260a_FWm, 0.0f + f2, 1.0);
        }
        wAR.method_7a46288d_Dne();
        GL11.glColorMask(true, true, true, true);
        this.field_493682ed_Dne.field_36d36bf_Dne.method_7a46289a_Dne();
    }

    static int method_f21dca2a_aFZ(MKS mKS, int n) {
        mKS.field_22c602_IjH = n;
        return mKS.field_22c602_IjH;
    }

    static msA method_807b0488_Dne(MKS mKS) {
        return mKS.field_3791671_Dne;
    }

    static int method_27049d43_FWm(MKS mKS, int n) {
        mKS.field_2d29f4_aFZ = n;
        return mKS.field_2d29f4_aFZ;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public MKS() {
        String string;
        Object object;
        BufferedReader bufferedReader = null;
        try {
            object = new ArrayList();
            bufferedReader = new BufferedReader(new InputStreamReader(MKS.class.getResourceAsStream("/title/splashes.txt"), Charset.forName("UTF-8")));
            while ((string = bufferedReader.readLine()) != null) {
                if ((string = string.trim()).length() <= 0) continue;
                ((ArrayList)object).add(string);
            }
            do {
                this.field_d9a85c6_FWm = (String)((ArrayList)object).get(field_7331eae7_Dne.nextInt(((ArrayList)object).size()));
            } while (this.field_d9a85c6_FWm.hashCode() == 125780783);
        }
        catch (IOException iOException) {
        }
        finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                }
                catch (IOException iOException) {}
            }
        }
        this.field_2092ab_Dne = field_7331eae7_Dne.nextFloat();
        this.field_c480ca78_bzF = "";
        object = System.getProperty("os_architecture");
        string = System.getProperty("java_version");
    }

    static List method_d38f3fb5_Dne(MKS mKS) {
        return mKS.field_f27c122c_Dne;
    }

    static int method_d5e1d8e4_Dne(MKS mKS, int n) {
        mKS.field_388da6_zGp = n;
        return mKS.field_388da6_zGp;
    }

    private void method_3edc204f_FWm(irb irb2, int n, int n2) {
        this.field_f27c122c_Dne.add(new pee_0(3, this.field_21260d_FWm / 2 - 100, n + n2 * 2, irb2.method_39193c_Dne("menu.online")));
    }

    static String method_3f9dbe8e_Dne(MKS mKS) {
        return mKS.field_c480ca78_bzF;
    }

    private void method_e78ac60e_Dne(int n, int n2, irb irb2) {
        this.field_f27c122c_Dne.add(new pee_0(1, this.field_21260d_FWm / 2 - 100, n, irb2.method_39193c_Dne("menu.singleplayer")));
        this.field_f27c122c_Dne.add(new pee_0(1, this.field_21260d_FWm / 2 - 100, n + n2, 200, 20, "SocketException", false));
        this.field_f27c122c_Dne.add(new pee_0(1, this.field_21260d_FWm / 2 - 100, n + n2 + n2, 200, 20, "NullPointerException", false));
        this.field_f27c122c_Dne.add(new pee_0(1, this.field_21260d_FWm / 2 - 100, n, irb2.method_39193c_Dne("menu.singleplayer")));
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    static int method_2286e851_bzF(MKS mKS, int n) {
        mKS.field_20b857_DyG = n;
        return mKS.field_20b857_DyG;
    }

    static int method_6c77f338_bzF(MKS mKS) {
        return mKS.field_20b857_DyG;
    }

    static {
        field_7331eae7_Dne = new Random();
        field_267d06_Qnq = false;
        field_2d2a05_aFZ = false;
        field_f5e54dca_Dne = new String[]{"/title/bg/panorama0.png", "/title/bg/panorama1.png", "/title/bg/panorama2.png", "/title/bg/panorama3.png", "/title/bg/panorama4.png", "/title/bg/panorama5.png"};
        field_569fcf45_Dne = "Please click " + (Object)((Object)Dne.field_84f7aaa9_ceE) + "here" + (Object)((Object)Dne.field_d3fa959_FfS) + " for more information.";
    }

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        Object object2;
        this.method_a98a0660_aFZ();
        OEk.method_7c6f6039_FWm();
        MKS.method_d4dc89e9_Dne(0, 0, this.field_21260d_FWm, this.field_2e5f1b_bzF, 0);
        WAR wAR = WAR.field_36e5ca4_Dne;
        int n3 = 274;
        int n4 = this.field_21260d_FWm / 2 - n3 / 2;
        int n5 = 30;
        this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/title/mclogo.png");
        int n6 = 0;
        int n7 = 0;
        if (this.field_2a9ad6_Zpi >= 50) {
            if (eCD.method_ce7f5d9c_Dne(10) == 0) {
                n6 = eCD.method_ce7f5d9c_Dne(10);
                n7 = eCD.method_ce7f5d9c_Dne(1);
                n6 = eCD.method_ce7f5d9c_Dne(2) == 0 ? -n6 : n6;
                int n8 = n7 = eCD.method_ce7f5d9c_Dne(2) == 0 ? -n7 : n7;
            }
            if (this.field_2a9ad6_Zpi >= 100) {
                this.field_2a9ad6_Zpi = 0;
            }
        }
        if (this.field_29186d_XHL >= 300) {
            if (eCD.method_ce7f5d9c_Dne(10) == 0) {
                GL11.glScaled(1.0, 1.0f + (eCD.field_7331eae7_Dne.nextFloat() - 0.8f) + 0.8f, 1.0);
            }
            if (this.field_29186d_XHL >= 330) {
                this.field_29186d_XHL = 0;
            }
        }
        if (this.field_31b816_kGO >= Jcz.method_ce7f5d9c_Dne(10)) {
            for (Object object : this.field_f27c122c_Dne) {
                ((pee_0)object).field_2e5f1b_bzF = eCD.method_ce7f5d9c_Dne(this.field_493682ed_Dne.field_37a7e17_Dne.field_21260d_FWm);
                ((pee_0)object).field_267cf5_Qnq = eCD.method_ce7f5d9c_Dne(this.field_493682ed_Dne.field_37a7e17_Dne.field_2e5f1b_bzF);
            }
            this.field_31b816_kGO = 0;
        }
        ++this.field_2a9ad6_Zpi;
        ++this.field_31b816_kGO;
        ++this.field_29186d_XHL;
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.method_17d7ea99_FWm(n4 + 0 + n6, n5 + 0 + n7, 0, 0, 155, 44);
        this.method_17d7ea99_FWm(n4 + 155 + n6, n5 + 0 + n7, 0, 45, 155, 44);
        wAR.method_143f9e1c_bzF(0xFFFFFF);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.field_21260d_FWm / 2 + 90, 70.0f, 0.0f);
        GL11.glRotatef(-20.0f, 0.0f, 0.0f, 1.0f);
        float f2 = 1.8f - geR.method_7ed96eaf_Qnq(geR.method_ce7f5256_Dne((float)(Minecraft.method_7a46288e_Dne() % 1000L) / 1000.0f * (float)Math.PI * 2.0f) * 0.1f);
        f2 = f2 * 100.0f / (float)(this.field_3791671_Dne.method_8f501fd7_Dne(this.field_d9a85c6_FWm) + 32);
        GL11.glScalef(f2, f2, f2);
        GL11.glPopMatrix();
        object2 = "\u00a7mMinecraft \u00a7r\u00a7cERR422";
        if (this.field_493682ed_Dne.method_7a46289e_Dne()) {
            object2 = object2 + " Demo";
        }
        if (this.field_c480ca78_bzF != null && this.field_c480ca78_bzF.length() > 0) {
            MKS.method_d4dc89e9_Dne(this.field_20b857_DyG - 2, this.field_2f0dd8_div - 2, this.field_22c602_IjH + 2, this.field_33448c_mrb - 1, 0x55200000);
            this.method_67d6d54c_FWm(this.field_3791671_Dne, this.field_c480ca78_bzF, this.field_20b857_DyG, this.field_2f0dd8_div, 0xFFFFFF);
            this.method_67d6d54c_FWm(this.field_3791671_Dne, field_569fcf45_Dne, (this.field_21260d_FWm - this.field_2d29f4_aFZ) / 2, ((pee_0)this.field_f27c122c_Dne.get((int)0)).field_267cf5_Qnq - 12, 0xFFFFFF);
        }
        super.method_2c2cec86_Dne(n, n2, f);
    }

    @Override
    protected void method_16a1040_Dne(char c, int n) {
    }

    static String method_6613af23_FWm(MKS mKS, String string) {
        mKS.field_9e60dbde_Qnq = string;
        return mKS.field_9e60dbde_Qnq;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void method_7a46289a_Dne() {
        this.field_267cf5_Qnq = this.field_493682ed_Dne.field_36d36bf_Dne.method_1420ded2_Dne(new BufferedImage(256, 256, 2));
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        if (calendar.get(2) + 1 == 11 && calendar.get(5) == 9) {
            this.field_d9a85c6_FWm = "Happy birthday, ez!";
        } else if (calendar.get(2) + 1 == 6 && calendar.get(5) == 1) {
            this.field_d9a85c6_FWm = "Happy birthday, Notch!";
        } else if (calendar.get(2) + 1 == 12 && calendar.get(5) == 24) {
            this.field_d9a85c6_FWm = "Merry X-mas!";
        } else if (calendar.get(2) + 1 == 1 && calendar.get(5) == 1) {
            this.field_d9a85c6_FWm = "Happy new year!";
        } else if (calendar.get(2) + 1 == 10 && calendar.get(5) == 31) {
            this.field_d9a85c6_FWm = "OOoooOOOoooo! Spooky!";
        }
        this.field_d9a85c6_FWm = "NullPointerException";
        irb irb2 = irb.method_2310d392_Dne();
        int n = this.field_2e5f1b_bzF / 4 + 48;
        if (this.field_493682ed_Dne.method_7a46289e_Dne()) {
            this.method_bac08d8f_FWm(n, 24, irb2);
        } else {
            this.method_e78ac60e_Dne(n, 24, irb2);
        }
        this.method_6ba658ce_Dne(irb2, n, 24);
        if (this.field_493682ed_Dne.field_21261e_FWm) {
            this.field_f27c122c_Dne.add(new pee_0(0, this.field_21260d_FWm / 2 - 100, n + 72, irb2.method_39193c_Dne("menu.options")));
        } else {
            this.field_f27c122c_Dne.add(new pee_0(0, this.field_21260d_FWm / 2 - 100, n + 72 + 12, 98, 20, irb2.method_39193c_Dne("menu.options")));
            this.field_f27c122c_Dne.add(new pee_0(4, this.field_21260d_FWm / 2 + 2, n + 72 + 12, 98, 20, "\u00a74" + irb2.method_39193c_Dne("menu.quit"), false));
        }
        Object object = this.field_63dcf1d7_Dne;
        Object object2 = this.field_63dcf1d7_Dne;
        synchronized (object2) {
            this.field_388da6_zGp = this.field_3791671_Dne.method_8f501fd7_Dne(this.field_c480ca78_bzF);
            this.field_2d29f4_aFZ = this.field_3791671_Dne.method_8f501fd7_Dne(field_569fcf45_Dne);
            int n2 = Math.max(this.field_388da6_zGp, this.field_2d29f4_aFZ);
            this.field_20b857_DyG = (this.field_21260d_FWm - n2) / 2;
            this.field_2f0dd8_div = ((pee_0)this.field_f27c122c_Dne.get((int)0)).field_267cf5_Qnq - 24;
            this.field_22c602_IjH = this.field_20b857_DyG + n2;
            this.field_33448c_mrb = this.field_2f0dd8_div + 24;
        }
        OEk.method_7a46289a_Dne();
    }

    static Object method_4cdae120_Dne(MKS mKS) {
        return mKS.field_63dcf1d7_Dne;
    }

    @Override
    public void method_ae128dc7_bzF() {
        ++this.field_2092ae_Dne;
    }

    static int method_45ab5bdc_zGp(MKS mKS, int n) {
        mKS.field_33448c_mrb = n;
        return mKS.field_33448c_mrb;
    }

    static void method_60c13e16_Dne(MKS mKS, irb irb2, int n, int n2) {
        mKS.method_3edc204f_FWm(irb2, n, n2);
    }

    static int method_fd556c1e_Qnq(MKS mKS) {
        return mKS.field_2f0dd8_div;
    }

    private void method_6ba658ce_Dne(irb irb2, int n, int n2) {
        if (this.field_2e5f2c_bzF) {
            if (!field_267d06_Qnq) {
                field_267d06_Qnq = true;
                new mxl(this, irb2, n, n2).start();
            } else if (field_2d2a05_aFZ) {
                this.method_3edc204f_FWm(irb2, n, n2);
            }
        }
    }

    @Override
    public void method_17484c9_Dne(boolean bl, int n) {
        if (bl && n == 12) {
            YiY yiY = this.field_493682ed_Dne.method_23096ac2_Dne();
            yiY.method_7a46289a_Dne();
            yiY.method_110c4dc7_FWm("Demo_World");
            this.field_493682ed_Dne.method_b88fcbd2_Dne(this);
        } else if (n == 13) {
            if (bl) {
                try {
                    Class<?> clazz = Class.forName("java.awt.Desktop");
                    Object object = clazz.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
                    clazz.getMethod("browse", URI.class).invoke(object, new URI(this.field_9e60dbde_Qnq));
                }
                catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
            }
            this.field_493682ed_Dne.method_b88fcbd2_Dne(this);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected void method_2c2cf7c9_Dne(int n, int n2, int n3) {
        super.method_2c2cf7c9_Dne(n, n2, n3);
        Object object = this.field_63dcf1d7_Dne;
        Object object2 = this.field_63dcf1d7_Dne;
        synchronized (object2) {
            if (this.field_c480ca78_bzF.length() > 0 && n >= this.field_20b857_DyG && n <= this.field_22c602_IjH && n2 >= this.field_2f0dd8_div && n2 <= this.field_33448c_mrb) {
                vBZ vBZ2 = new vBZ((qVZ)this, this.field_9e60dbde_Qnq, 13, true);
                vBZ2.method_8288d6ee_IjH();
                this.field_493682ed_Dne.method_b88fcbd2_Dne(vBZ2);
            }
        }
    }
}

