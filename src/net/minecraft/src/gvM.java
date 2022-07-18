package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.lwjgl.opengl.GL11;

public class gvM
extends qVZ {
    private int field_2092ae_Dne = 0;
    private float field_2092ab_Dne = 0.5f;
    private List field_6a0474ed_FWm;
    private int field_267cf5_Qnq = 0;

    private void method_d44b4592_zGp() {
        this.field_493682ed_Dne.field_369f6b6_Dne.field_37608e7_Dne.method_5536af4d_FWm(new Gle(1));
        this.field_493682ed_Dne.method_b88fcbd2_Dne(null);
    }

    private void method_a6ac9c87_FWm(int n, int n2, float f) {
        WAR wAR = WAR.field_36e5ca4_Dne;
        this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("%blur%/gui/background.png");
        wAR.method_7a46289a_Dne();
        wAR.method_54283b9a_Dne(1.0f, 1.0f, 1.0f, 1.0f);
        int n3 = this.field_21260d_FWm;
        float f2 = 0.0f - ((float)this.field_2092ae_Dne + f) * 0.5f * this.field_2092ab_Dne;
        float f3 = (float)this.field_2e5f1b_bzF - ((float)this.field_2092ae_Dne + f) * 0.5f * this.field_2092ab_Dne;
        float f4 = 0.015625f;
        float f5 = ((float)this.field_2092ae_Dne + f - 0.0f) * 0.02f;
        float f6 = (float)(this.field_267cf5_Qnq + this.field_2e5f1b_bzF + this.field_2e5f1b_bzF + 24) / this.field_2092ab_Dne;
        float f7 = (f6 - 20.0f - ((float)this.field_2092ae_Dne + f)) * 0.005f;
        if (f7 < f5) {
            f5 = f7;
        }
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        f5 *= f5;
        f5 = f5 * 96.0f / 255.0f;
        wAR.method_2c0148e6_Dne(f5, f5, f5);
        wAR.method_c38c5864_Dne(0.0, this.field_2e5f1b_bzF, this.field_21260a_FWm, 0.0, f2 * f4);
        wAR.method_c38c5864_Dne(n3, this.field_2e5f1b_bzF, this.field_21260a_FWm, (float)n3 * f4, f2 * f4);
        wAR.method_c38c5864_Dne(n3, 0.0, this.field_21260a_FWm, (float)n3 * f4, f3 * f4);
        wAR.method_c38c5864_Dne(0.0, 0.0, this.field_21260a_FWm, 0.0, f3 * f4);
        wAR.method_7a46288d_Dne();
    }

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        int n3;
        this.method_a6ac9c87_FWm(n, n2, f);
        WAR wAR = WAR.field_36e5ca4_Dne;
        int n4 = 274;
        int n5 = this.field_21260d_FWm / 2 - n4 / 2;
        int n6 = this.field_2e5f1b_bzF + 50;
        float f2 = -((float)this.field_2092ae_Dne + f) * this.field_2092ab_Dne;
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0f, f2, 0.0f);
        this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/title/mclogo.png");
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.method_17d7ea99_FWm(n5, n6, 0, 0, 155, 44);
        this.method_17d7ea99_FWm(n5 + 155, n6, 0, 45, 155, 44);
        wAR.method_143f9e1c_bzF(0xFFFFFF);
        int n7 = n6 + 200;
        for (n3 = 0; n3 < this.field_6a0474ed_FWm.size(); ++n3) {
            float f3;
            if (n3 == this.field_6a0474ed_FWm.size() - 1 && (f3 = (float)n7 + f2 - (float)(this.field_2e5f1b_bzF / 2 - 6)) < 0.0f) {
                GL11.glTranslatef(0.0f, -f3, 0.0f);
            }
            if ((float)n7 + f2 + 12.0f + 8.0f > 0.0f && (float)n7 + f2 < (float)this.field_2e5f1b_bzF) {
                String string = (String)this.field_6a0474ed_FWm.get(n3);
                if (string.startsWith("[C]")) {
                    this.field_3791671_Dne.method_7eed4432_Dne(string.substring(3), n5 + (n4 - this.field_3791671_Dne.method_8f501fd7_Dne(string.substring(3))) / 2, n7, 0xFFFFFF);
                } else {
                    this.field_3791671_Dne.field_7331eae7_Dne.setSeed((long)n3 * 4238972211L + (long)(this.field_2092ae_Dne / 4));
                    this.field_3791671_Dne.method_7eed4432_Dne(string, n5, n7, 0xFFFFFF);
                }
            }
            n7 += 12;
        }
        GL11.glPopMatrix();
        this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("%blur%/misc/vignette.png");
        GL11.glEnable(3042);
        GL11.glBlendFunc(0, 769);
        wAR.method_7a46289a_Dne();
        wAR.method_54283b9a_Dne(1.0f, 1.0f, 1.0f, 1.0f);
        n3 = this.field_21260d_FWm;
        int n8 = this.field_2e5f1b_bzF;
        wAR.method_c38c5864_Dne(0.0, n8, this.field_21260a_FWm, 0.0, 1.0);
        wAR.method_c38c5864_Dne(n3, n8, this.field_21260a_FWm, 1.0, 1.0);
        wAR.method_c38c5864_Dne(n3, 0.0, this.field_21260a_FWm, 1.0, 0.0);
        wAR.method_c38c5864_Dne(0.0, 0.0, this.field_21260a_FWm, 0.0, 0.0);
        wAR.method_7a46288d_Dne();
        GL11.glDisable(3042);
        super.method_2c2cec86_Dne(n, n2, f);
    }

    @Override
    public void method_ae128dc7_bzF() {
        ++this.field_2092ae_Dne;
        float f = (float)(this.field_267cf5_Qnq + this.field_2e5f1b_bzF + this.field_2e5f1b_bzF + 24) / this.field_2092ab_Dne;
        if ((float)this.field_2092ae_Dne > f) {
            this.method_d44b4592_zGp();
        }
    }

    @Override
    public void method_7a46289a_Dne() {
        if (this.field_6a0474ed_FWm == null) {
            this.field_6a0474ed_FWm = new ArrayList();
            try {
                int n;
                String string = "";
                String string2 = "" + (Object)((Object)Dne.field_32808077_trS) + (Object)((Object)Dne.field_1efb5595_qLR) + (Object)((Object)Dne.field_1c27f310_XHL) + (Object)((Object)Dne.field_616018f9_Zpi);
                int n2 = 274;
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gvM.class.getResourceAsStream("/title/win.txt"), Charset.forName("UTF-8")));
                Random random = new Random(8124371L);
                while ((string = bufferedReader.readLine()) != null) {
                    string = string.replaceAll("PLAYERNAME", this.field_493682ed_Dne.field_37d3e5f_Dne.field_569fcf45_Dne);
                    while (string.contains(string2)) {
                        n = string.indexOf(string2);
                        String string3 = string.substring(0, n);
                        String string4 = string.substring(n + string2.length());
                        string = string3 + (Object)((Object)Dne.field_32808077_trS) + (Object)((Object)Dne.field_1efb5595_qLR) + "XXXXXXXX".substring(0, random.nextInt(4) + 3) + string4;
                    }
                    this.field_6a0474ed_FWm.addAll(this.field_493682ed_Dne.field_3791671_Dne.method_c46270c8_Dne(string, n2));
                    this.field_6a0474ed_FWm.add("");
                }
                for (n = 0; n < 8; ++n) {
                    this.field_6a0474ed_FWm.add("");
                }
                bufferedReader = new BufferedReader(new InputStreamReader(gvM.class.getResourceAsStream("/title/credits.txt"), Charset.forName("UTF-8")));
                while ((string = bufferedReader.readLine()) != null) {
                    string = string.replaceAll("PLAYERNAME", this.field_493682ed_Dne.field_37d3e5f_Dne.field_569fcf45_Dne);
                    string = string.replaceAll("\t", "    ");
                    this.field_6a0474ed_FWm.addAll(this.field_493682ed_Dne.field_3791671_Dne.method_c46270c8_Dne(string, n2));
                    this.field_6a0474ed_FWm.add("");
                }
                this.field_267cf5_Qnq = this.field_6a0474ed_FWm.size() * 12;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    @Override
    protected void method_16a1040_Dne(char c, int n) {
        if (n == 1) {
            this.method_d44b4592_zGp();
        }
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return true;
    }
}

