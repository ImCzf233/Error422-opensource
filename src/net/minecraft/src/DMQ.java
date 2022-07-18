package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class DMQ
extends pee_0 {
    @Override
    public void method_f68b2f6c_Dne(Minecraft minecraft, int n, int n2) {
        if (this.field_21261e_FWm) {
            minecraft.field_36d36bf_Dne.method_8f501fe4_Dne("/gui/gui.png");
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            boolean bl = n >= this.field_2e5f1b_bzF && n2 >= this.field_267cf5_Qnq && n < this.field_2e5f1b_bzF + this.field_2092ae_Dne && n2 < this.field_267cf5_Qnq + this.field_21260d_FWm;
            int n3 = 106;
            if (bl) {
                n3 += this.field_21260d_FWm;
            }
            this.method_17d7ea99_FWm(this.field_2e5f1b_bzF, this.field_267cf5_Qnq, 0, n3, this.field_2092ae_Dne, this.field_21260d_FWm);
        }
    }

    public DMQ(int n, int n2, int n3) {
        super(n, n2, n3, 20, 20, "");
    }
}

