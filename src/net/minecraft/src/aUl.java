package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class aUl
extends ocu {
    private boolean field_21261e_FWm;
    private final Random field_7331eae7_Dne = new Random();
    private final Minecraft field_493682ed_Dne;
    private NMq field_36a761a_Dne;
    private String field_569fcf45_Dne = "";
    private final muJ field_3791f0a_Dne;
    private int field_2e5f1b_bzF;
    private int field_21260d_FWm = 0;
    private boolean field_2092bf_Dne = false;
    private int field_2092ae_Dne = 0;
    public float field_2092ab_Dne = 1.0f;
    private static final eKj field_374e248_Dne = new eKj();

    private void method_c1aeda34_Dne(vfE vfE2, int n, int n2, msA msA2) {
        SFA sFA = vfE2.method_23062a3d_Dne();
        Collection<OHz> collection = sFA.method_6efe9cd5_Dne(vfE2);
        if (collection.size() <= 15) {
            int n3 = msA2.method_8f501fd7_Dne(vfE2.method_d1f1ed87_FWm());
            for (OHz oHz : collection) {
                YGE yGE = sFA.method_d74cc06b_bzF(oHz.method_eecad346_Dne());
                String string = YGE.method_fd2f7d86_Dne(yGE, oHz.method_eecad346_Dne()) + ": " + (Object)((Object)Dne.field_a2169639_kGO) + oHz.method_7a46288d_Dne();
                n3 = Math.max(n3, msA2.method_8f501fd7_Dne(string));
            }
            int n4 = collection.size() * msA2.field_2092ae_Dne;
            int n5 = n / 2 + n4 / 3;
            int n6 = 3;
            int n7 = n2 - n3 - n6;
            int n8 = 0;
            for (OHz oHz : collection) {
                YGE yGE = sFA.method_d74cc06b_bzF(oHz.method_eecad346_Dne());
                String string = YGE.method_fd2f7d86_Dne(yGE, oHz.method_eecad346_Dne());
                String string2 = (Object)((Object)Dne.field_a2169639_kGO) + "" + oHz.method_7a46288d_Dne();
                int n9 = n5 - ++n8 * msA2.field_2092ae_Dne;
                int n10 = n2 - n6 + 2;
                aUl.method_d4dc89e9_Dne(n7 - 2, n9, n10, n9 + msA2.field_2092ae_Dne, 0x50000000);
                msA2.method_e88b55f3_FWm(string, n7, n9, 0x20FFFFFF);
                msA2.method_e88b55f3_FWm(string2, n10 - msA2.method_8f501fd7_Dne(string2), n9, 0x20FFFFFF);
                if (n8 != collection.size()) continue;
                String string3 = vfE2.method_d1f1ed87_FWm();
                aUl.method_d4dc89e9_Dne(n7 - 2, n9 - msA2.field_2092ae_Dne - 1, n10, n9 - 1, 0x60000000);
                aUl.method_d4dc89e9_Dne(n7 - 2, n9 - 1, n10, n9, 0x50000000);
                msA2.method_e88b55f3_FWm(string3, n7 + n3 / 2 - msA2.method_8f501fd7_Dne(string3) / 2, n9 - msA2.field_2092ae_Dne, 0x20FFFFFF);
            }
        }
    }

    private void method_2c02b146_Dne(float f, int n, int n2) {
        if ((f = 1.0f - f) < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        this.field_2092ab_Dne = (float)((double)this.field_2092ab_Dne + (double)(f - this.field_2092ab_Dne) * 0.01);
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        GL11.glBlendFunc(0, 769);
        GL11.glColor4f(this.field_2092ab_Dne, this.field_2092ab_Dne, this.field_2092ab_Dne, 1.0f);
        this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("%blur%/misc/vignette.png");
        WAR wAR = WAR.field_36e5ca4_Dne;
        wAR.method_7a46289a_Dne();
        wAR.method_c38c5864_Dne(0.0, n2, -90.0, 0.0, 1.0);
        wAR.method_c38c5864_Dne(n, n2, -90.0, 1.0, 1.0);
        wAR.method_c38c5864_Dne(n, 0.0, -90.0, 1.0, 0.0);
        wAR.method_c38c5864_Dne(0.0, 0.0, -90.0, 0.0, 0.0);
        wAR.method_7a46288d_Dne();
        GL11.glDepthMask(true);
        GL11.glEnable(2929);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glBlendFunc(770, 771);
    }

    private void method_a6826147_FWm(float f, int n, int n2) {
        if (f < 1.0f) {
            f *= f;
            f *= f;
            f = f * 0.8f + 0.2f;
        }
        GL11.glDisable(3008);
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        GL11.glBlendFunc(770, 771);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, f);
        this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/terrain.png");
        gDn gDn2 = zKP.field_36c4090_Dne.method_77cd08ea_FWm(1);
        float f2 = gDn2.method_7a46288a_Dne();
        float f3 = gDn2.method_ae128db7_bzF();
        float f4 = gDn2.method_7c6f6029_FWm();
        float f5 = gDn2.method_907a9d11_Qnq();
        WAR wAR = WAR.field_36e5ca4_Dne;
        wAR.method_7a46289a_Dne();
        wAR.method_c38c5864_Dne(0.0, n2, -90.0, f2, f5);
        wAR.method_c38c5864_Dne(n, n2, -90.0, f4, f5);
        wAR.method_c38c5864_Dne(n, 0.0, -90.0, f4, f3);
        wAR.method_c38c5864_Dne(0.0, 0.0, -90.0, f2, f3);
        wAR.method_7a46288d_Dne();
        GL11.glDepthMask(true);
        GL11.glEnable(2929);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
    }

    private void method_16cca7a_Dne(int n, int n2) {
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        GL11.glBlendFunc(770, 771);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glDisable(3008);
        this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("%blur%/misc/pumpkinblur.png");
        WAR wAR = WAR.field_36e5ca4_Dne;
        wAR.method_7a46289a_Dne();
        wAR.method_c38c5864_Dne(0.0, n2, -90.0, 0.0, 1.0);
        wAR.method_c38c5864_Dne(n, n2, -90.0, 1.0, 1.0);
        wAR.method_c38c5864_Dne(n, 0.0, -90.0, 1.0, 0.0);
        wAR.method_c38c5864_Dne(0.0, 0.0, -90.0, 0.0, 0.0);
        wAR.method_7a46288d_Dne();
        GL11.glDepthMask(true);
        GL11.glEnable(2929);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
    }

    public aUl(Minecraft minecraft) {
        this.field_493682ed_Dne = minecraft;
        this.field_3791f0a_Dne = new muJ(minecraft);
        if (eCD.method_ce7f5d9c_Dne(100) == 0) {
            this.field_21261e_FWm = true;
        }
    }

    public void method_7a46289a_Dne() {
        if (this.field_21260d_FWm > 0) {
            --this.field_21260d_FWm;
        }
        ++this.field_2092ae_Dne;
        if (this.field_493682ed_Dne.field_369f6b6_Dne != null) {
            NMq nMq = this.field_493682ed_Dne.field_369f6b6_Dne.field_36a059b_Dne.method_23040479_Dne();
            if (nMq == null) {
                this.field_2e5f1b_bzF = 0;
            } else if (this.field_36a761a_Dne != null && nMq.field_2e5f1b_bzF == this.field_36a761a_Dne.field_2e5f1b_bzF && NMq.method_a981fd7e_Dne(nMq, this.field_36a761a_Dne) && (nMq.method_7c6f603d_FWm() || nMq.method_907a9d14_Qnq() == this.field_36a761a_Dne.method_907a9d14_Qnq())) {
                if (this.field_2e5f1b_bzF > 0) {
                    --this.field_2e5f1b_bzF;
                }
            } else {
                this.field_2e5f1b_bzF = 40;
            }
            this.field_36a761a_Dne = nMq;
        }
    }

    private void method_59726917_Dne(int n, int n2, int n3, float f) {
        if (this.field_21261e_FWm) {
            return;
        }
        NMq nMq = this.field_493682ed_Dne.field_369f6b6_Dne.field_36a059b_Dne.field_8360c375_Dne[n];
        if (nMq != null) {
            float f2 = (float)nMq.field_21260d_FWm - f;
            if (f2 > 0.0f) {
                GL11.glPushMatrix();
                float f3 = 1.0f + f2 / 5.0f;
                GL11.glTranslatef(n2 + 8, n3 + 12, 0.0f);
                GL11.glScalef(1.0f / f3, (f3 + 1.0f) / 2.0f, 1.0f);
                GL11.glTranslatef(-(n2 + 8), -(n3 + 12), 0.0f);
            }
            field_374e248_Dne.method_5ae7aca8_FWm(this.field_493682ed_Dne.field_3791671_Dne, this.field_493682ed_Dne.field_36d36bf_Dne, nMq, n2, n3);
            if (f2 > 0.0f) {
                GL11.glPopMatrix();
            }
            field_374e248_Dne.method_f14f8cda_bzF(this.field_493682ed_Dne.field_3791671_Dne, this.field_493682ed_Dne.field_36d36bf_Dne, nMq, n2, n3);
        }
    }

    private void method_7c6f6039_FWm() {
        if (mwX.field_569fcf45_Dne != null && mwX.field_2092ae_Dne > 0) {
            --mwX.field_2092ae_Dne;
            msA msA2 = this.field_493682ed_Dne.field_3791671_Dne;
            IJm iJm = new IJm(this.field_493682ed_Dne.field_3758af7_Dne, this.field_493682ed_Dne.field_2092ae_Dne, this.field_493682ed_Dne.field_21260d_FWm);
            int n = iJm.method_7a46288d_Dne();
            int n2 = 182;
            int n3 = n / 2 - n2 / 2;
            int n4 = (int)(mwX.field_2092ab_Dne * (float)(n2 + 1));
            int n5 = 12;
            this.method_17d7ea99_FWm(n3, n5, 0, 74, n2, 5);
            this.method_17d7ea99_FWm(n3, n5, 0, 74, n2, 5);
            if (n4 > 0) {
                this.method_17d7ea99_FWm(n3, n5, 0, 79, n4, 5);
            }
            String string = mwX.field_569fcf45_Dne;
            msA2.method_7eed4432_Dne(string, n / 2 - msA2.method_8f501fd7_Dne(string) / 2, n5 - 10, 0xFFFFFF);
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/gui/icons.png");
        }
    }

    public void method_8f501fe4_Dne(String string) {
        this.field_569fcf45_Dne = "Now playing: " + string;
        this.field_21260d_FWm = 60;
        this.field_2092bf_Dne = true;
    }

    public muJ method_2312ad69_Dne() {
        return this.field_3791f0a_Dne;
    }

    public void method_55437a0e_Dne(float f, boolean bl, int n, int n2) {
        vfE vfE2;
        String string;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        int n16;
        int n17;
        float f2;
        IJm iJm = new IJm(this.field_493682ed_Dne.field_3758af7_Dne, this.field_493682ed_Dne.field_2092ae_Dne, this.field_493682ed_Dne.field_21260d_FWm);
        int n18 = iJm.method_7a46288d_Dne();
        int n19 = iJm.method_7c6f602c_FWm();
        msA msA2 = this.field_493682ed_Dne.field_3791671_Dne;
        this.field_493682ed_Dne.field_36ac6a1_Dne.method_7c6f6039_FWm();
        GL11.glEnable(3042);
        if (Minecraft.method_ae128dcb_bzF()) {
            this.method_2c02b146_Dne(this.field_493682ed_Dne.field_369f6b6_Dne.method_ce7f5256_Dne(f), n18, n19);
        } else {
            GL11.glBlendFunc(770, 771);
        }
        NMq nMq = this.field_493682ed_Dne.field_369f6b6_Dne.field_36a059b_Dne.method_9062e8fb_bzF(3);
        if (this.field_493682ed_Dne.field_3758af7_Dne.field_2f0dd8_div == 0 && nMq != null && nMq.field_2e5f1b_bzF == zKP.field_32158d62_aJO.field_21260d_FWm) {
            this.method_16cca7a_Dne(n18, n19);
        }
        if (!this.field_493682ed_Dne.field_369f6b6_Dne.method_857f23ec_Dne(SXd.field_74f7768b_mrb) && (f2 = this.field_493682ed_Dne.field_369f6b6_Dne.field_388da3_zGp + (this.field_493682ed_Dne.field_369f6b6_Dne.field_2d29f1_aFZ - this.field_493682ed_Dne.field_369f6b6_Dne.field_388da3_zGp) * f) > 0.0f) {
            this.method_a6826147_FWm(f2, n18, n19);
        }
        if (!this.field_493682ed_Dne.field_36c390e_Dne.method_7a46289e_Dne()) {
            int n20;
            boolean bl2;
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/gui/gui.png");
            MOS mOS = this.field_493682ed_Dne.field_369f6b6_Dne.field_36a059b_Dne;
            this.field_21260a_FWm = -90.0f;
            this.method_17d7ea99_FWm(n18 / 2 - 91, n19 - 22, 0, 0, 182, 22);
            this.method_17d7ea99_FWm(n18 / 2 - 91 - 1 + mOS.field_2092ae_Dne * 20, n19 - 22 - 1, 0, 22, 24, 22);
            this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/gui/icons.png");
            GL11.glEnable(3042);
            GL11.glBlendFunc(775, 769);
            this.method_17d7ea99_FWm(n18 / 2 - 7, n19 / 2 - 7, 0, 0, 16, 16);
            GL11.glDisable(3042);
            boolean bl3 = bl2 = this.field_493682ed_Dne.field_369f6b6_Dne.field_2f0dd8_div / 3 % 2 == 1;
            if (this.field_493682ed_Dne.field_369f6b6_Dne.field_2f0dd8_div < 10) {
                bl2 = false;
            }
            n17 = this.field_493682ed_Dne.field_369f6b6_Dne.method_9a443a8c_XHL();
            n16 = this.field_493682ed_Dne.field_369f6b6_Dne.field_2e8486_ceE;
            this.field_7331eae7_Dne.setSeed(this.field_2092ae_Dne * 312871);
            n15 = 0;
            SCY sCY = this.field_493682ed_Dne.field_369f6b6_Dne.method_230621e2_Dne();
            n14 = sCY.method_7a46288d_Dne();
            n13 = sCY.method_7c6f602c_FWm();
            this.field_493682ed_Dne.field_365731d_Dne.method_8f501fe4_Dne("bossHealth");
            this.method_7c6f6039_FWm();
            this.field_493682ed_Dne.field_365731d_Dne.method_7c6f6039_FWm();
            if (this.field_493682ed_Dne.field_36c390e_Dne.method_7c6f603d_FWm()) {
                int n21;
                int n22;
                int n23;
                n12 = n18 / 2 - 91;
                n20 = n18 / 2 + 91;
                this.field_493682ed_Dne.field_365731d_Dne.method_8f501fe4_Dne("expBar");
                n11 = this.field_493682ed_Dne.field_369f6b6_Dne.method_7c861aba_EyB();
                if (n11 > 0) {
                    n23 = 182;
                    n10 = (int)(this.field_493682ed_Dne.field_369f6b6_Dne.field_30e9da_iNQ * (float)(n23 + 1));
                    n9 = n19 - 32 + 3;
                    this.method_17d7ea99_FWm(n12, n9, 0, 64, n23, 5);
                    if (n10 > 0) {
                        this.method_17d7ea99_FWm(n12, n9, 0, 69, n10, 5);
                    }
                }
                n8 = n19 - 39;
                n10 = n8 - 10;
                n9 = this.field_493682ed_Dne.field_369f6b6_Dne.method_9feec6b5_Zpi();
                n7 = -1;
                if (this.field_493682ed_Dne.field_369f6b6_Dne.method_857f23ec_Dne(SXd.field_1c2e71ec_XHL)) {
                    n7 = this.field_2092ae_Dne % 25;
                }
                this.field_493682ed_Dne.field_365731d_Dne.method_110c4dc3_FWm("healthArmor");
                for (n23 = 0; n23 < 10; ++n23) {
                    if (n9 > 0) {
                        n6 = n12 + n23 * 8;
                        if (n23 * 2 + 1 < n9) {
                            this.method_17d7ea99_FWm(n6, n10, 34, 9, 9, 9);
                        }
                        if (n23 * 2 + 1 == n9) {
                            this.method_17d7ea99_FWm(n6, n10, 25, 9, 9, 9);
                        }
                        if (n23 * 2 + 1 > n9) {
                            this.method_17d7ea99_FWm(n6, n10, 16, 9, 9, 9);
                        }
                    }
                    n6 = eCD.method_ce7f5d9c_Dne(0xFFFFFFF);
                    if (this.field_493682ed_Dne.field_369f6b6_Dne.method_857f23ec_Dne(SXd.field_84fe2985_ceE)) {
                        n6 += 36;
                    } else if (this.field_493682ed_Dne.field_369f6b6_Dne.method_857f23ec_Dne(SXd.field_7578fe9a_EyB)) {
                        n6 += 72;
                    }
                    n5 = 0;
                    if (bl2) {
                        n5 = 1;
                    }
                    int n24 = n12 + n23 * 8;
                    n22 = n8;
                    if (n17 <= 4) {
                        n22 = n8 + this.field_7331eae7_Dne.nextInt(2);
                    }
                    if (n23 == n7) {
                        n22 -= 2;
                    }
                    n4 = 0;
                    if (this.field_493682ed_Dne.field_36ebf36_Dne.method_231798c9_Dne().method_907a9d25_Qnq()) {
                        n4 = 5;
                    }
                    n21 = eCD.method_ce7f5d9c_Dne(2) == 0 ? eCD.method_ce7f5d9c_Dne(20) : -eCD.method_ce7f5d9c_Dne(20);
                    this.method_17d7ea99_FWm(n24 + n21, n22, 16 + n5 * 9, 9 * n4, 9, 9);
                    if (bl2) {
                        if (n23 * 2 + 1 < n16) {
                            this.method_17d7ea99_FWm(n24, n22, n6 + 54, 9 * n4, 9, 9);
                        }
                        if (n23 * 2 + 1 == n16) {
                            this.method_17d7ea99_FWm(n24, n22, n6 + 63, 9 * n4, 9, 9);
                        }
                    }
                    if (n23 * 2 + 1 < n17) {
                        n21 = eCD.method_ce7f5d9c_Dne(2) == 0 ? eCD.method_ce7f5d9c_Dne(30) : -eCD.method_ce7f5d9c_Dne(30);
                        this.method_17d7ea99_FWm(n24 + n21, n22, n6 + 36, 9 * n4, 9, 9);
                    }
                    if (n23 * 2 + 1 != n17) continue;
                    this.method_17d7ea99_FWm(n24, n22, n6 + 45, 9 * n4, 9, 9);
                }
                this.field_493682ed_Dne.field_365731d_Dne.method_110c4dc3_FWm("food");
                n4 = eCD.method_ce7f5d9c_Dne(2) == 0 ? eCD.method_ce7f5d9c_Dne(20) : -eCD.method_ce7f5d9c_Dne(20);
                for (n23 = 0; n23 < 10; ++n23) {
                    n6 = n8;
                    n3 = eCD.method_ce7f5d9c_Dne(255);
                    n21 = eCD.method_ce7f5d9c_Dne(255);
                    if (this.field_493682ed_Dne.field_369f6b6_Dne.method_857f23ec_Dne(SXd.field_35cc4496_ATE)) {
                        n3 += 36;
                        n21 = 13;
                    }
                    if (this.field_493682ed_Dne.field_369f6b6_Dne.method_230621e2_Dne().method_7a46288a_Dne() <= 0.0f && this.field_2092ae_Dne % (n14 * 3 + 1) == 0) {
                        n6 = n8 + (this.field_7331eae7_Dne.nextInt(3) - 1);
                    }
                    if (n15 != 0) {
                        n21 = 1;
                    }
                    n22 = n20 - n23 * 8 - 9 + n4;
                    this.method_17d7ea99_FWm(n22, n6, 16 + n21 * 9, 27, 9, 9);
                    if (n15 != 0) {
                        if (n23 * 2 + 1 < n13) {
                            this.method_17d7ea99_FWm(n22, n6, n3 + 54, 27, 9, 9);
                        }
                        if (n23 * 2 + 1 == n13) {
                            this.method_17d7ea99_FWm(n22, n6, n3 + 63, 27, 9, 9);
                        }
                    }
                    if (n23 * 2 + 1 < n14) {
                        this.method_17d7ea99_FWm(n22, n6, n3 + 36, 27, 9, 9);
                    }
                    if (n23 * 2 + 1 != n14) continue;
                    this.method_17d7ea99_FWm(n22, n6, n3 + 45, 27, 9, 9);
                }
                this.field_493682ed_Dne.field_365731d_Dne.method_7c6f6039_FWm();
            }
            GL11.glDisable(3042);
            this.field_493682ed_Dne.field_365731d_Dne.method_8f501fe4_Dne("actionBar");
            GL11.glEnable(32826);
            Cit.method_ae128dc7_bzF();
            for (n12 = 0; n12 < 9; ++n12) {
                n20 = n18 / 2 - 90 + n12 * 20 + 2;
                n11 = n19 - 16 - 3;
                this.method_59726917_Dne(n12, n20, n11, f);
            }
            Cit.method_7a46289a_Dne();
            GL11.glDisable(32826);
            this.field_493682ed_Dne.field_365731d_Dne.method_7c6f6039_FWm();
        }
        if (this.field_493682ed_Dne.field_369f6b6_Dne.method_ae9f0465_ceE() > 0) {
            this.field_493682ed_Dne.field_365731d_Dne.method_8f501fe4_Dne("sleep");
            GL11.glDisable(2929);
            GL11.glDisable(3008);
            n15 = this.field_493682ed_Dne.field_369f6b6_Dne.method_ae9f0465_ceE();
            float f3 = (float)n15 / 100.0f;
            if (f3 > 1.0f) {
                f3 = 1.0f - (float)(n15 - 100) / 10.0f;
            }
            n17 = (int)(220.0f * f3) << 24 | 0x101020;
            aUl.method_d4dc89e9_Dne(0, 0, n18, n19, n17);
            GL11.glEnable(3008);
            GL11.glEnable(2929);
            this.field_493682ed_Dne.field_365731d_Dne.method_7c6f6039_FWm();
        }
        if (this.field_493682ed_Dne.field_36c390e_Dne.method_ae128dcb_bzF() && this.field_493682ed_Dne.field_369f6b6_Dne.field_2f0276_eHV > 0) {
            this.field_493682ed_Dne.field_365731d_Dne.method_8f501fe4_Dne("expLevel");
            boolean bl4 = false;
            n17 = bl4 ? 0xFFFFFF : 8453920;
            String string2 = "" + Integer.toBinaryString(this.field_493682ed_Dne.field_369f6b6_Dne.field_2f0276_eHV).toUpperCase();
            n15 = (n18 - msA2.method_8f501fd7_Dne(string2)) / 2;
            int n25 = n19 - 31 - 4;
            msA2.method_e88b55f3_FWm(string2, n15 + 1, n25, 0);
            msA2.method_e88b55f3_FWm(string2, n15 - 1, n25, 0);
            msA2.method_e88b55f3_FWm(string2, n15, n25 + 1, 0);
            msA2.method_e88b55f3_FWm(string2, n15, n25 - 1, 0);
            msA2.method_e88b55f3_FWm(string2, n15, n25, n17);
            this.field_493682ed_Dne.field_365731d_Dne.method_7c6f6039_FWm();
        }
        if (this.field_493682ed_Dne.field_3758af7_Dne.field_28e80e_Vxn) {
            this.field_493682ed_Dne.field_365731d_Dne.method_8f501fe4_Dne("toolHighlight");
            if (this.field_2e5f1b_bzF > 0 && this.field_36a761a_Dne != null) {
                String string3 = this.field_36a761a_Dne.method_d1f1ed87_FWm();
                n17 = (n18 - msA2.method_8f501fd7_Dne(string3)) / 2;
                n16 = n19 - 59;
                if (!this.field_493682ed_Dne.field_36c390e_Dne.method_7c6f603d_FWm()) {
                    n16 += 14;
                }
                if ((n15 = (int)((float)this.field_2e5f1b_bzF * 256.0f / 10.0f)) > 255) {
                    n15 = 255;
                }
                if (n15 > 0) {
                    GL11.glPushMatrix();
                    GL11.glEnable(3042);
                    GL11.glBlendFunc(770, 771);
                    msA2.method_7eed4432_Dne(string3, n17, n16, 0xFFFFFF + (n15 << 24));
                    GL11.glDisable(3042);
                    GL11.glPopMatrix();
                }
            }
            this.field_493682ed_Dne.field_365731d_Dne.method_7c6f6039_FWm();
        }
        if (this.field_493682ed_Dne.method_7a46289e_Dne()) {
            this.field_493682ed_Dne.field_365731d_Dne.method_8f501fe4_Dne("demo");
            String string4 = "";
            string4 = this.field_493682ed_Dne.field_36ebf36_Dne.method_7c6f602d_FWm() >= 120500L ? KGL.method_39193c_Dne("demo.demoExpired") : String.format(KGL.method_39193c_Dne("demo.remainingTime"), vCA.method_2c0e7e17_Dne((int)(120500L - this.field_493682ed_Dne.field_36ebf36_Dne.method_7c6f602d_FWm())));
            n17 = msA2.method_8f501fd7_Dne(string4);
            msA2.method_7eed4432_Dne(string4, n18 - n17 - 10, 5, 0xFFFFFF);
            this.field_493682ed_Dne.field_365731d_Dne.method_7c6f6039_FWm();
        }
        if (this.field_493682ed_Dne.field_3758af7_Dne.field_212c2c_EyB) {
            this.field_493682ed_Dne.field_365731d_Dne.method_8f501fe4_Dne("debug");
            GL11.glPushMatrix();
            msA2.method_7eed4432_Dne("\u00a7k" + this.field_493682ed_Dne.method_eecad346_Dne(), 2, 12, 0xFFFFFF);
            msA2.method_7eed4432_Dne("\u00a7k" + this.field_493682ed_Dne.method_d1f1ed87_FWm(), 2, 22, 0xFFFFFF);
            msA2.method_7eed4432_Dne("\u00a7k" + this.field_493682ed_Dne.method_4a7b1d9f_Qnq(), 2, 32, 0xFFFFFF);
            msA2.method_7eed4432_Dne("\u00a7k" + this.field_493682ed_Dne.method_6859cdb9_bzF(), 2, 42, 0xFFFFFF);
            long l = Runtime.getRuntime().maxMemory();
            long l2 = Runtime.getRuntime().totalMemory();
            long l3 = Runtime.getRuntime().freeMemory();
            long l4 = l2 - l3;
            string = "\u00a7kUsed memory: " + l4 * 100L / l + "% (" + l4 / 1024L / 1024L + "MB) of " + l / 1024L / 1024L + "MB";
            this.method_67d6d54c_FWm(msA2, string, n18 - msA2.method_8f501fd7_Dne(string) - 2, 2, 0xE0E0E0);
            string = "\u00a7kAllocated memory: " + l2 * 100L / l + "% (" + l2 / 1024L / 1024L + "MB)";
            this.method_67d6d54c_FWm(msA2, string, n18 - msA2.method_8f501fd7_Dne(string) - 2, 12, 0xE0E0E0);
            n8 = geR.method_117d0718_FWm(this.field_493682ed_Dne.field_369f6b6_Dne.field_2f0dd3_div);
            n10 = geR.method_117d0718_FWm(this.field_493682ed_Dne.field_369f6b6_Dne.field_22c5fd_IjH);
            n9 = geR.method_117d0718_FWm(this.field_493682ed_Dne.field_369f6b6_Dne.field_334487_mrb);
            this.method_67d6d54c_FWm(msA2, String.format("\u00a7kx: %.5f (%d) // c: %d (%d)", this.field_493682ed_Dne.field_369f6b6_Dne.field_2f0dd3_div, n8, n8 >> 4, n8 & 0xF), 2, 64, 0xE0E0E0);
            this.method_67d6d54c_FWm(msA2, String.format("\u00a7ky: %.3f (feet pos, %.3f eyes pos)", this.field_493682ed_Dne.field_369f6b6_Dne.field_373a3ed_Dne.field_212608_FWm, this.field_493682ed_Dne.field_369f6b6_Dne.field_22c5fd_IjH), 2, 72, 0xE0E0E0);
            this.method_67d6d54c_FWm(msA2, String.format("\u00a7kz: %.5f (%d) // c: %d (%d)", this.field_493682ed_Dne.field_369f6b6_Dne.field_334487_mrb, n9, n9 >> 4, n9 & 0xF), 2, 80, 0xE0E0E0);
            n7 = geR.method_117d0718_FWm((double)(this.field_493682ed_Dne.field_369f6b6_Dne.field_334489_mrb * 4.0f / 360.0f) + 0.5) & 3;
            this.method_67d6d54c_FWm(msA2, "\u00a7kf: " + n7 + " (" + zxJ.field_f5e54dca_Dne[n7] + ") / " + geR.method_87b72d50_aFZ(this.field_493682ed_Dne.field_369f6b6_Dne.field_334489_mrb), 2, 88, 0xE0E0E0);
            if (this.field_493682ed_Dne.field_36ebf36_Dne != null && this.field_493682ed_Dne.field_36ebf36_Dne.method_2dee780_bzF(n8, n10, n9)) {
                qMV qMV2 = this.field_493682ed_Dne.field_36ebf36_Dne.method_90569c11_Dne(n8, n9);
                this.method_67d6d54c_FWm(msA2, "\u00a7klc: " + (qMV2.method_7a46288d_Dne() + 15) + " b: " + qMV2.method_812dd1f4_Dne((int)(n8 & 0xF), (int)(n9 & 0xF), (tgc)this.field_493682ed_Dne.field_36ebf36_Dne.method_2315aa7b_Dne()).field_569fcf45_Dne + " bl: " + qMV2.method_60f38def_Dne(udO.field_20364eab_FWm, n8 & 0xF, n10, n9 & 0xF) + " sl: " + qMV2.method_60f38def_Dne(udO.field_37c82cc_Dne, n8 & 0xF, n10, n9 & 0xF) + " rl: " + qMV2.method_5972744d_Dne(n8 & 0xF, n10, n9 & 0xF, 0), 2, 96, 0xE0E0E0);
            }
            this.method_67d6d54c_FWm(msA2, String.format("\u00a7kws: %.3f, fs: %.3f, g: %b, fl: %d", Float.valueOf(this.field_493682ed_Dne.field_369f6b6_Dne.field_37cb681_Dne.method_7c6f6029_FWm()), Float.valueOf(this.field_493682ed_Dne.field_369f6b6_Dne.field_37cb681_Dne.method_7a46288a_Dne()), this.field_493682ed_Dne.field_369f6b6_Dne.field_2d2a05_aFZ, this.field_493682ed_Dne.field_36ebf36_Dne.method_1e26964c_FWm(n8, n9)), 2, 104, 0xE0E0E0);
            GL11.glPopMatrix();
            this.field_493682ed_Dne.field_365731d_Dne.method_7c6f6039_FWm();
        }
        ymm.method_16cca7a_Dne(n18, n19);
        if (this.field_21260d_FWm > 0) {
            this.field_493682ed_Dne.field_365731d_Dne.method_8f501fe4_Dne("overlayMessage");
            float f4 = (float)this.field_21260d_FWm - f;
            n17 = (int)(f4 * 256.0f / 20.0f);
            if (n17 > 255) {
                n17 = 255;
            }
            if (n17 > 0) {
                GL11.glPushMatrix();
                GL11.glTranslatef(n18 / 2, n19 - 48, 0.0f);
                GL11.glEnable(3042);
                GL11.glBlendFunc(770, 771);
                n16 = 0xFFFFFF;
                if (this.field_2092bf_Dne) {
                    n16 = Color.HSBtoRGB(f4 / 50.0f, 0.7f, 0.6f) & 0xFFFFFF;
                }
                msA2.method_e88b55f3_FWm(this.field_569fcf45_Dne, -msA2.method_8f501fd7_Dne(this.field_569fcf45_Dne) / 2, -4, n16 + (n17 << 24));
                GL11.glDisable(3042);
                GL11.glPopMatrix();
            }
            this.field_493682ed_Dne.field_365731d_Dne.method_7c6f6039_FWm();
        }
        if ((vfE2 = this.field_493682ed_Dne.field_36ebf36_Dne.method_23062a3d_Dne().method_9e80a165_Dne(1)) != null) {
            this.method_c1aeda34_Dne(vfE2, n19, n18, msA2);
        }
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glDisable(3008);
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0f, n19 - 48, 0.0f);
        this.field_493682ed_Dne.field_365731d_Dne.method_8f501fe4_Dne("chat");
        this.field_3791f0a_Dne.method_ce7f5da9_Dne(this.field_2092ae_Dne);
        this.field_493682ed_Dne.field_365731d_Dne.method_7c6f6039_FWm();
        GL11.glPopMatrix();
        vfE2 = this.field_493682ed_Dne.field_36ebf36_Dne.method_23062a3d_Dne().method_9e80a165_Dne(0);
        if (this.field_493682ed_Dne.field_3758af7_Dne.field_617653c6_Zpi.field_2092bf_Dne && (!this.field_493682ed_Dne.method_d44b4596_zGp() || this.field_493682ed_Dne.field_369f6b6_Dne.field_37608e7_Dne.field_f27c122c_Dne.size() > 1 || vfE2 != null)) {
            this.field_493682ed_Dne.field_365731d_Dne.method_8f501fe4_Dne("playerList");
            fzy fzy2 = this.field_493682ed_Dne.field_369f6b6_Dne.field_37608e7_Dne;
            List list = fzy2.field_f27c122c_Dne;
            int n26 = n15 = fzy2.field_2092ae_Dne;
            n14 = 1;
            while (n26 > 20) {
                n26 = (n15 + ++n14 - 1) / n14;
            }
            n13 = 300 / n14;
            if (n13 > 150) {
                n13 = 150;
            }
            n12 = (n18 - n14 * n13) / 2;
            n4 = 10;
            aUl.method_d4dc89e9_Dne(n12 - 1, n4 - 1, n12 + n13 * n14, n4 + 9 * n26, Integer.MIN_VALUE);
            for (n11 = 0; n11 < n15; ++n11) {
                n8 = n12 + n11 % n14 * n13;
                n10 = n4 + n11 / n14 * 9;
                aUl.method_d4dc89e9_Dne(n8, n10, n8 + n13 - 1, n10 + 8, 0x20FFFFFF);
                GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                GL11.glEnable(3008);
                if (n11 >= list.size()) continue;
                aCn aCn2 = (aCn)list.get(n11);
                YGE yGE = this.field_493682ed_Dne.field_36ebf36_Dne.method_23062a3d_Dne().method_d74cc06b_bzF(aCn2.field_569fcf45_Dne);
                String string5 = YGE.method_fd2f7d86_Dne(yGE, aCn2.field_569fcf45_Dne);
                msA2.method_7eed4432_Dne(string5, n8, n10, 0xFFFFFF);
                if (vfE2 != null && (n3 = n8 + n13 - 12 - 5) - (n6 = n8 + msA2.method_8f501fd7_Dne(string5) + 5) > 5) {
                    OHz oHz = vfE2.method_23062a3d_Dne().method_938dc1b8_Dne(aCn2.field_569fcf45_Dne, vfE2);
                    string = (Object)((Object)Dne.field_ab1f2987_ooe) + "" + oHz.method_7a46288d_Dne();
                    msA2.method_7eed4432_Dne(string, n3 - msA2.method_8f501fd7_Dne(string), n10, 0xFFFFFF);
                }
                GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/gui/icons.png");
                int n27 = 0;
                boolean bl5 = false;
                n5 = aCn2.field_2092ae_Dne < 0 ? 5 : (aCn2.field_2092ae_Dne < 150 ? 0 : (aCn2.field_2092ae_Dne < 300 ? 1 : (aCn2.field_2092ae_Dne < 600 ? 2 : (aCn2.field_2092ae_Dne < 1000 ? 3 : 4))));
                this.field_21260a_FWm += 100.0f;
                this.method_17d7ea99_FWm(n8 + n13 - 12, n10, 0 + n27 * 10, 176 + n5 * 8, 10, 8);
                this.field_21260a_FWm -= 100.0f;
            }
        }
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glDisable(2896);
        GL11.glEnable(3008);
    }

    public int method_7a46288d_Dne() {
        return this.field_2092ae_Dne;
    }
}

