package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.Color;

/*
 * Renamed from Pee
 */
public class pee_0
extends ocu {
    public int field_2e5f1b_bzF;
    protected boolean field_2e5f2c_bzF;
    protected int field_21260d_FWm;
    protected int field_2092ae_Dne;
    private Color field_9db66f5e_Dne = new Color(eCD.method_ce7f5d9c_Dne(140), eCD.method_ce7f5d9c_Dne(110), eCD.method_ce7f5d9c_Dne(110));
    public int field_267cf5_Qnq;
    public int field_2d29f4_aFZ;
    public boolean field_2092bf_Dne;
    public boolean field_21261e_FWm;
    public String field_569fcf45_Dne;

    public void method_1e269659_FWm(int n, int n2) {
    }

    public pee_0(int n, int n2, int n3, int n4, int n5, String string, boolean bl) {
        this.field_2092bf_Dne = bl;
        this.field_21261e_FWm = true;
        this.field_2d29f4_aFZ = n;
        this.field_2e5f1b_bzF = n2;
        this.field_267cf5_Qnq = n3;
        this.field_2092ae_Dne = n4;
        this.field_21260d_FWm = n5;
        this.field_569fcf45_Dne = string;
    }

    public pee_0(int n, int n2, int n3, int n4, int n5, String string) {
        this.field_2092ae_Dne = 200;
        this.field_21260d_FWm = 20;
        this.field_2092bf_Dne = true;
        this.field_21261e_FWm = true;
        this.field_2d29f4_aFZ = n;
        this.field_2e5f1b_bzF = n2;
        this.field_267cf5_Qnq = n3;
        this.field_2092ae_Dne = n4;
        this.field_21260d_FWm = n5;
        this.field_569fcf45_Dne = string;
    }

    protected void method_a045bf4b_FWm(Minecraft minecraft, int n, int n2) {
    }

    public boolean method_f68b2f70_Dne(Minecraft minecraft, int n, int n2) {
        return this.field_2092bf_Dne && this.field_21261e_FWm && n >= this.field_2e5f1b_bzF && n2 >= this.field_267cf5_Qnq && n < this.field_2e5f1b_bzF + this.field_2092ae_Dne && n2 < this.field_267cf5_Qnq + this.field_21260d_FWm;
    }

    protected int method_ce7f9d6d_Dne(boolean bl) {
        int n = 1;
        if (!this.field_2092bf_Dne) {
            n = 0;
        } else if (bl) {
            n = 2;
        }
        return n;
    }

    public pee_0(int n, int n2, int n3, String string) {
        this(n, n2, n3, 200, 20, string);
    }

    public void method_16cca7a_Dne(int n, int n2) {
    }

    public void method_f68b2f6c_Dne(Minecraft minecraft, int n, int n2) {
        if (this.field_21261e_FWm) {
            int n3;
            int n4;
            msA msA2 = minecraft.field_3791671_Dne;
            minecraft.field_36d36bf_Dne.method_8f501fe4_Dne("/gui/gui.png");
            GL11.glColor3b(this.field_9db66f5e_Dne.getRedByte(), this.field_9db66f5e_Dne.getGreenByte(), this.field_9db66f5e_Dne.getBlueByte());
            this.field_2e5f2c_bzF = n >= this.field_2e5f1b_bzF && n2 >= this.field_267cf5_Qnq && n < this.field_2e5f1b_bzF + this.field_2092ae_Dne && n2 < this.field_267cf5_Qnq + this.field_21260d_FWm;
            int n5 = this.method_ce7f9d6d_Dne(this.field_2e5f2c_bzF);
            if (this.field_2e5f2c_bzF) {
                n4 = eCD.method_ce7f5d9c_Dne(4);
                n3 = eCD.method_ce7f5d9c_Dne(3);
                n4 = eCD.method_ce7f5d9c_Dne(2) == 0 ? n4 : -n4;
                n3 = eCD.method_ce7f5d9c_Dne(2) == 0 ? n3 : -n3;
                this.method_17d7ea99_FWm(this.field_2e5f1b_bzF + n4, this.field_267cf5_Qnq + n3, 0, 46 + n5 * 20, this.field_2092ae_Dne / 2, this.field_21260d_FWm);
                this.method_17d7ea99_FWm(this.field_2e5f1b_bzF + this.field_2092ae_Dne / 2 + n4, this.field_267cf5_Qnq + n3, 200 - this.field_2092ae_Dne / 2, 46 + n5 * 20, this.field_2092ae_Dne / 2, this.field_21260d_FWm);
            } else {
                this.method_17d7ea99_FWm(this.field_2e5f1b_bzF, this.field_267cf5_Qnq, 0, 46 + n5 * 20, this.field_2092ae_Dne / 2, this.field_21260d_FWm);
                this.method_17d7ea99_FWm(this.field_2e5f1b_bzF + this.field_2092ae_Dne / 2, this.field_267cf5_Qnq, 200 - this.field_2092ae_Dne / 2, 46 + n5 * 20, this.field_2092ae_Dne / 2, this.field_21260d_FWm);
            }
            this.method_a045bf4b_FWm(minecraft, n, n2);
            n4 = 0xE0E0E0;
            if (!this.field_2092bf_Dne) {
                n4 = -6250336;
            } else if (this.field_2e5f2c_bzF) {
                n4 = eCD.method_ce7f5d9c_Dne(0xFFFFFF);
            }
            if (this.field_2e5f2c_bzF) {
                n3 = eCD.method_ce7f5d9c_Dne(5);
                int n6 = eCD.method_ce7f5d9c_Dne(2);
                n3 = eCD.method_ce7f5d9c_Dne(2) == 0 ? n3 : -n3;
                n6 = eCD.method_ce7f5d9c_Dne(2) == 0 ? n6 : -n6;
                this.method_32faf66d_Dne(msA2, this.field_569fcf45_Dne, this.field_2e5f1b_bzF + this.field_2092ae_Dne / 2 + n3, this.field_267cf5_Qnq + (this.field_21260d_FWm - 8) / 2 + n6, n4);
            } else {
                this.method_32faf66d_Dne(msA2, this.field_569fcf45_Dne, this.field_2e5f1b_bzF + this.field_2092ae_Dne / 2, this.field_267cf5_Qnq + (this.field_21260d_FWm - 8) / 2, n4);
            }
        }
    }

    public boolean method_7a46289e_Dne() {
        return this.field_2e5f2c_bzF;
    }
}

