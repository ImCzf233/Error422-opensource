package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

class Vdw
extends pee_0 {
    private final String field_d9a85c6_FWm;
    private final int field_388da6_zGp;
    private boolean field_267d06_Qnq;
    private final int field_20b857_DyG;

    @Override
    public void method_f68b2f6c_Dne(Minecraft minecraft, int n, int n2) {
        if (this.field_21261e_FWm) {
            minecraft.field_36d36bf_Dne.method_8f501fe4_Dne("/gui/beacon.png");
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            this.field_2e5f2c_bzF = n >= this.field_2e5f1b_bzF && n2 >= this.field_267cf5_Qnq && n < this.field_2e5f1b_bzF + this.field_2092ae_Dne && n2 < this.field_267cf5_Qnq + this.field_21260d_FWm;
            int n3 = 219;
            int n4 = 0;
            if (!this.field_2092bf_Dne) {
                n4 += this.field_2092ae_Dne * 2;
            } else if (this.field_267d06_Qnq) {
                n4 += this.field_2092ae_Dne * 1;
            } else if (this.field_2e5f2c_bzF) {
                n4 += this.field_2092ae_Dne * 3;
            }
            this.method_17d7ea99_FWm(this.field_2e5f1b_bzF, this.field_267cf5_Qnq, n4, n3, this.field_2092ae_Dne, this.field_21260d_FWm);
            if (!"/gui/beacon.png".equals(this.field_d9a85c6_FWm)) {
                minecraft.field_36d36bf_Dne.method_8f501fe4_Dne(this.field_d9a85c6_FWm);
            }
            this.method_17d7ea99_FWm(this.field_2e5f1b_bzF + 2, this.field_267cf5_Qnq + 2, this.field_388da6_zGp, this.field_20b857_DyG, 18, 18);
        }
    }

    protected Vdw(int n, int n2, int n3, String string, int n4, int n5) {
        super(n, n2, n3, 22, 22, "");
        this.field_d9a85c6_FWm = string;
        this.field_388da6_zGp = n4;
        this.field_20b857_DyG = n5;
    }

    public boolean method_7c6f603d_FWm() {
        return this.field_267d06_Qnq;
    }

    public void method_ce7f9d7a_Dne(boolean bl) {
        this.field_267d06_Qnq = bl;
    }
}

