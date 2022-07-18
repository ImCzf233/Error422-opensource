package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class XGv
extends Sss {
    private lqs field_378a09e_Dne;

    @Override
    protected void method_16cca7a_Dne(int n, int n2) {
        String string = this.field_378a09e_Dne.method_5acf91e_d_() ? this.field_378a09e_Dne.method_9fc39d88_b_() : KGL.method_39193c_Dne(this.field_378a09e_Dne.method_9fc39d88_b_());
        this.field_3791671_Dne.method_e88b55f3_FWm(string, this.field_2092ae_Dne / 2 - this.field_3791671_Dne.method_8f501fd7_Dne(string) / 2, 6, 0x404040);
        this.field_3791671_Dne.method_e88b55f3_FWm(KGL.method_39193c_Dne("container.inventory"), 8, this.field_267cf5_Qnq - 96 + 2, 0x404040);
    }

    @Override
    protected void method_2c02b146_Dne(float f, int n, int n2) {
        int n3;
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/gui/furnace.png");
        int n4 = (this.field_21260d_FWm - this.field_2092ae_Dne) / 2;
        int n5 = (this.field_2e5f1b_bzF - this.field_267cf5_Qnq) / 2;
        this.method_17d7ea99_FWm(n4, n5, 0, 0, this.field_2092ae_Dne, this.field_267cf5_Qnq);
        if (this.field_378a09e_Dne.method_7c6f603d_FWm()) {
            n3 = this.field_378a09e_Dne.method_117d19dd_FWm(12);
            this.method_17d7ea99_FWm(n4 + 56, n5 + 36 + 12 - n3, 176, 12 - n3, 14, n3 + 2);
        }
        n3 = this.field_378a09e_Dne.method_ce7f5d9c_Dne(24);
        this.method_17d7ea99_FWm(n4 + 79, n5 + 34, 176, 14, n3 + 1, 16);
    }

    public XGv(MOS mOS, lqs lqs2) {
        super(new bhy(mOS, lqs2));
        this.field_378a09e_Dne = lqs2;
    }
}

