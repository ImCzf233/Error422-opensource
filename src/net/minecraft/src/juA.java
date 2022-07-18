package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class juA
extends Sss
implements mXX {
    private sZS field_37b7500_Dne;
    private MOS field_36a059b_Dne;
    private mHN field_3787699_Dne;

    @Override
    protected void method_16a1040_Dne(char c, int n) {
        if (this.field_3787699_Dne.method_16a1044_Dne(c, n)) {
            this.field_37b7500_Dne.method_8f501fe4_Dne(this.field_3787699_Dne.method_eecad346_Dne());
            this.field_493682ed_Dne.field_369f6b6_Dne.field_37608e7_Dne.method_5536af4d_FWm(new FaB("MC|ItemName", this.field_3787699_Dne.method_eecad346_Dne().getBytes()));
        } else {
            super.method_16a1040_Dne(c, n);
        }
    }

    @Override
    protected void method_2c02b146_Dne(float f, int n, int n2) {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/gui/repair.png");
        int n3 = (this.field_21260d_FWm - this.field_2092ae_Dne) / 2;
        int n4 = (this.field_2e5f1b_bzF - this.field_267cf5_Qnq) / 2;
        this.method_17d7ea99_FWm(n3, n4, 0, 0, this.field_2092ae_Dne, this.field_267cf5_Qnq);
        this.method_17d7ea99_FWm(n3 + 59, n4 + 20, 0, this.field_267cf5_Qnq + (this.field_37b7500_Dne.method_9e7d935f_Dne(0).method_7a46289e_Dne() ? 0 : 16), 110, 16);
        if ((this.field_37b7500_Dne.method_9e7d935f_Dne(0).method_7a46289e_Dne() || this.field_37b7500_Dne.method_9e7d935f_Dne(1).method_7a46289e_Dne()) && !this.field_37b7500_Dne.method_9e7d935f_Dne(2).method_7a46289e_Dne()) {
            this.method_17d7ea99_FWm(n3 + 99, n4 + 45, this.field_2092ae_Dne, 0, 28, 21);
        }
    }

    @Override
    protected void method_2c2cf7c9_Dne(int n, int n2, int n3) {
        super.method_2c2cf7c9_Dne(n, n2, n3);
        this.field_3787699_Dne.method_2c2cf7c9_Dne(n, n2, n3);
    }

    @Override
    public void method_7c6f6039_FWm() {
        super.method_7c6f6039_FWm();
        Keyboard.enableRepeatEvents(false);
        this.field_36bb35e_Dne.method_8b2b635b_FWm(this);
    }

    @Override
    public void method_6211b979_Dne(Pdb pdb, int n, int n2) {
    }

    @Override
    public void method_4c1c2e5_Dne(Pdb pdb, int n, NMq nMq) {
        if (n == 0) {
            this.field_3787699_Dne.method_8f501fe4_Dne(nMq == null ? "" : nMq.method_d1f1ed87_FWm());
            this.field_3787699_Dne.method_143fdded_bzF(nMq != null);
            if (nMq != null) {
                this.field_37b7500_Dne.method_8f501fe4_Dne(this.field_3787699_Dne.method_eecad346_Dne());
                this.field_493682ed_Dne.field_369f6b6_Dne.field_37608e7_Dne.method_5536af4d_FWm(new FaB("MC|ItemName", this.field_3787699_Dne.method_eecad346_Dne().getBytes()));
            }
        }
    }

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        super.method_2c2cec86_Dne(n, n2, f);
        GL11.glDisable(2896);
        this.field_3787699_Dne.method_907a9d21_Qnq();
    }

    @Override
    public void method_7a46289a_Dne() {
        super.method_7a46289a_Dne();
        Keyboard.enableRepeatEvents(true);
        int n = (this.field_21260d_FWm - this.field_2092ae_Dne) / 2;
        int n2 = (this.field_2e5f1b_bzF - this.field_267cf5_Qnq) / 2;
        this.field_3787699_Dne = new mHN(this.field_3791671_Dne, n + 62, n2 + 24, 103, 12);
        this.field_3787699_Dne.method_b51ddfb1_zGp(-1);
        this.field_3787699_Dne.method_df9deb60_DyG(-1);
        this.field_3787699_Dne.method_ce7f9d7a_Dne(false);
        this.field_3787699_Dne.method_87b738a3_aFZ(30);
        this.field_36bb35e_Dne.method_8b2b635b_FWm(this);
        this.field_36bb35e_Dne.method_b1d7af9a_Dne(this);
    }

    @Override
    public void method_da0f864a_Dne(Pdb pdb, List list) {
        this.method_4c1c2e5_Dne(pdb, 0, pdb.method_9e7d935f_Dne(0).method_23040479_Dne());
    }

    public juA(MOS mOS, Qnq qnq, int n, int n2, int n3) {
        super(new sZS(mOS, qnq, n, n2, n3, Minecraft.method_81a5f12e_Dne().field_369f6b6_Dne));
        this.field_36a059b_Dne = mOS;
        this.field_37b7500_Dne = (sZS)this.field_36bb35e_Dne;
    }

    @Override
    protected void method_16cca7a_Dne(int n, int n2) {
        GL11.glDisable(2896);
        this.field_3791671_Dne.method_e88b55f3_FWm(KGL.method_39193c_Dne("container.repair"), 60, 6, 0x404040);
        if (this.field_37b7500_Dne.field_21260d_FWm > 0) {
            int n3 = 8453920;
            boolean bl = true;
            String string = KGL.method_98148f73_Dne("container.repair.cost", 2);
            string = string.replaceFirst("2", "");
            string = string + Integer.toBinaryString(this.field_37b7500_Dne.field_21260d_FWm);
            if (this.field_37b7500_Dne.field_21260d_FWm >= 40 && !this.field_493682ed_Dne.field_369f6b6_Dne.field_37cb681_Dne.field_267d06_Qnq) {
                string = KGL.method_39193c_Dne("container.repair.expensive");
                n3 = 0xFF6060;
            } else if (!this.field_37b7500_Dne.method_9e7d935f_Dne(2).method_7a46289e_Dne()) {
                bl = false;
            } else if (!this.field_37b7500_Dne.method_9e7d935f_Dne(2).method_703284a7_Dne(this.field_36a059b_Dne.field_3673728_Dne)) {
                n3 = 0xFF6060;
            }
            if (bl) {
                int n4 = 0xFF000000 | (n3 & 0xFCFCFC) >> 2 | n3 & 0xFF000000;
                int n5 = this.field_2092ae_Dne - 8 - this.field_3791671_Dne.method_8f501fd7_Dne(string);
                int n6 = 67;
                if (this.field_3791671_Dne.method_7a46289e_Dne()) {
                    juA.method_d4dc89e9_Dne(n5 - 3, n6 - 2, this.field_2092ae_Dne - 7, n6 + 10, -16777216);
                    juA.method_d4dc89e9_Dne(n5 - 2, n6 - 1, this.field_2092ae_Dne - 8, n6 + 9, -12895429);
                } else {
                    this.field_3791671_Dne.method_e88b55f3_FWm(string, n5, n6 + 1, n4);
                    this.field_3791671_Dne.method_e88b55f3_FWm(string, n5 + 1, n6, n4);
                    this.field_3791671_Dne.method_e88b55f3_FWm(string, n5 + 1, n6 + 1, n4);
                }
                this.field_3791671_Dne.method_e88b55f3_FWm(string, n5, n6, n3);
            }
        }
        GL11.glEnable(2896);
    }
}

