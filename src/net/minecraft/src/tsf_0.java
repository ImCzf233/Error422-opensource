package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from Tsf
 */
public class tsf_0
extends ocu {
    private boolean field_2092bf_Dne;
    private int field_2092ae_Dne;
    private String field_d9a85c6_FWm;
    private Minecraft field_493682ed_Dne;
    private auk_0 field_36522b5_Dne;
    private String field_569fcf45_Dne;
    private eKj field_374e248_Dne;
    private long field_2092af_Dne;
    private int field_21260d_FWm;

    public tsf_0(Minecraft minecraft) {
        this.field_493682ed_Dne = minecraft;
        this.field_374e248_Dne = new eKj();
    }

    private void method_7c6f6039_FWm() {
        GL11.glViewport(0, 0, this.field_493682ed_Dne.field_2092ae_Dne, this.field_493682ed_Dne.field_21260d_FWm);
        GL11.glMatrixMode(5889);
        GL11.glLoadIdentity();
        GL11.glMatrixMode(5888);
        GL11.glLoadIdentity();
        this.field_2092ae_Dne = this.field_493682ed_Dne.field_2092ae_Dne;
        this.field_21260d_FWm = this.field_493682ed_Dne.field_21260d_FWm;
        IJm iJm = new IJm(this.field_493682ed_Dne.field_3758af7_Dne, this.field_493682ed_Dne.field_2092ae_Dne, this.field_493682ed_Dne.field_21260d_FWm);
        this.field_2092ae_Dne = iJm.method_7a46288d_Dne();
        this.field_21260d_FWm = iJm.method_7c6f602c_FWm();
        GL11.glClear(256);
        GL11.glMatrixMode(5889);
        GL11.glLoadIdentity();
        GL11.glOrtho(0.0, this.field_2092ae_Dne, this.field_21260d_FWm, 0.0, 1000.0, 3000.0);
        GL11.glMatrixMode(5888);
        GL11.glLoadIdentity();
        GL11.glTranslatef(0.0f, 0.0f, -2000.0f);
    }

    public void method_41b774b1_FWm(auk_0 auk_02) {
        this.field_569fcf45_Dne = KGL.method_39193c_Dne(auk_02.method_d1f1ed87_FWm());
        this.field_d9a85c6_FWm = auk_02.method_eecad346_Dne();
        this.field_2092af_Dne = Minecraft.method_7a46288e_Dne() - 2500L;
        this.field_36522b5_Dne = auk_02;
        this.field_2092bf_Dne = true;
    }

    public void method_7a46289a_Dne() {
        if (this.field_36522b5_Dne != null && this.field_2092af_Dne != 0L) {
            double d = (double)(Minecraft.method_7a46288e_Dne() - this.field_2092af_Dne) / 3000.0;
            if (!this.field_2092bf_Dne && (d < 0.0 || d > 1.0)) {
                this.field_2092af_Dne = 0L;
            } else {
                this.method_7c6f6039_FWm();
                GL11.glDisable(2929);
                GL11.glDepthMask(false);
                double d2 = d * 2.0;
                if (d2 > 1.0) {
                    d2 = 2.0 - d2;
                }
                d2 *= 4.0;
                if ((d2 = 1.0 - d2) < 0.0) {
                    d2 = 0.0;
                }
                d2 *= d2;
                d2 *= d2;
                int n = this.field_2092ae_Dne - 160;
                int n2 = 0 - (int)(d2 * 36.0);
                GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                GL11.glEnable(3553);
                this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/achievement/bg.png");
                GL11.glDisable(2896);
                this.method_17d7ea99_FWm(n, n2, 96, 202, 160, 32);
                if (this.field_2092bf_Dne) {
                    this.field_493682ed_Dne.field_3791671_Dne.method_5ebbb6a4_Dne(this.field_d9a85c6_FWm, n + 30, n2 + 7, 120, -1);
                } else {
                    this.field_493682ed_Dne.field_3791671_Dne.method_e88b55f3_FWm(this.field_569fcf45_Dne, n + 30, n2 + 7, -256);
                    this.field_493682ed_Dne.field_3791671_Dne.method_e88b55f3_FWm(this.field_d9a85c6_FWm, n + 30, n2 + 18, -1);
                }
                Cit.method_ae128dc7_bzF();
                GL11.glDisable(2896);
                GL11.glEnable(32826);
                GL11.glEnable(2903);
                GL11.glEnable(2896);
                this.field_374e248_Dne.method_5ae7aca8_FWm(this.field_493682ed_Dne.field_3791671_Dne, this.field_493682ed_Dne.field_36d36bf_Dne, this.field_36522b5_Dne.field_36a761a_Dne, n + 8, n2 + 8);
                GL11.glDisable(2896);
                GL11.glDepthMask(true);
                GL11.glEnable(2929);
            }
        }
    }

    public void method_6863c0f0_Dne(auk_0 auk_02) {
        this.field_569fcf45_Dne = KGL.method_39193c_Dne("achievement.get");
        this.field_d9a85c6_FWm = KGL.method_39193c_Dne(auk_02.method_d1f1ed87_FWm());
        this.field_2092af_Dne = Minecraft.method_7a46288e_Dne();
        this.field_36522b5_Dne = auk_02;
        this.field_2092bf_Dne = false;
    }
}

