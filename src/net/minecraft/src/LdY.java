package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

class LdY
extends pee_0 {
    private final boolean field_267d06_Qnq;

    @Override
    public void method_f68b2f6c_Dne(Minecraft minecraft, int n, int n2) {
        if (this.field_21261e_FWm) {
            minecraft.field_36d36bf_Dne.method_8f501fe4_Dne("/gui/trading.png");
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            boolean bl = n >= this.field_2e5f1b_bzF && n2 >= this.field_267cf5_Qnq && n < this.field_2e5f1b_bzF + this.field_2092ae_Dne && n2 < this.field_267cf5_Qnq + this.field_21260d_FWm;
            int n3 = 0;
            int n4 = 176;
            if (!this.field_2092bf_Dne) {
                n4 += this.field_2092ae_Dne * 2;
            } else if (bl) {
                n4 += this.field_2092ae_Dne;
            }
            if (!this.field_267d06_Qnq) {
                n3 += this.field_21260d_FWm;
            }
            this.method_17d7ea99_FWm(this.field_2e5f1b_bzF, this.field_267cf5_Qnq, n4, n3, this.field_2092ae_Dne, this.field_21260d_FWm);
        }
    }

    public LdY(int n, int n2, int n3, boolean bl) {
        super(n, n2, n3, 12, 19, "");
        this.field_267d06_Qnq = bl;
    }
}

