package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

class bod
extends pee_0 {
    private final boolean field_267d06_Qnq;

    public bod(int n, int n2, int n3, boolean bl) {
        super(n, n2, n3, 23, 13, "");
        this.field_267d06_Qnq = bl;
    }

    @Override
    public void method_f68b2f6c_Dne(Minecraft minecraft, int n, int n2) {
        if (this.field_21261e_FWm) {
            boolean bl = n >= this.field_2e5f1b_bzF && n2 >= this.field_267cf5_Qnq && n < this.field_2e5f1b_bzF + this.field_2092ae_Dne && n2 < this.field_267cf5_Qnq + this.field_21260d_FWm;
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            minecraft.field_36d36bf_Dne.method_8f501fe4_Dne("/gui/book.png");
            int n3 = 0;
            int n4 = 192;
            if (bl) {
                n3 += 23;
            }
            if (!this.field_267d06_Qnq) {
                n4 += 13;
            }
            this.method_17d7ea99_FWm(this.field_2e5f1b_bzF, this.field_267cf5_Qnq, n3, n4, 23, 13);
        }
    }
}

