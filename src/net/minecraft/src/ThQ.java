package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class ThQ
extends Sss {
    @Override
    protected void method_2c02b146_Dne(float f, int n, int n2) {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/gui/crafting.png");
        int n3 = (this.field_21260d_FWm - this.field_2092ae_Dne) / 2;
        int n4 = (this.field_2e5f1b_bzF - this.field_267cf5_Qnq) / 2;
        this.method_17d7ea99_FWm(n3, n4, 0, 0, this.field_2092ae_Dne, this.field_267cf5_Qnq);
    }

    @Override
    protected void method_16cca7a_Dne(int n, int n2) {
        this.field_3791671_Dne.method_e88b55f3_FWm(KGL.method_39193c_Dne("container.crafting"), 28, 6, 0x404040);
        this.field_3791671_Dne.method_e88b55f3_FWm(KGL.method_39193c_Dne("container.inventory"), 8, this.field_267cf5_Qnq - 96 + 2, 0x404040);
    }

    public ThQ(MOS mOS, Qnq qnq, int n, int n2, int n3) {
        super(new uxW(mOS, qnq, n, n2, n3));
    }
}

