package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class ClL
extends Sss {
    private MqS field_2024511c_FWm;
    private MqS field_36a853d_Dne;
    private int field_20b857_DyG = 0;

    public ClL(MqS mqS, MqS mqS2) {
        super(new ZqW(mqS, mqS2));
        this.field_36a853d_Dne = mqS;
        this.field_2024511c_FWm = mqS2;
        this.field_21261e_FWm = false;
        int n = 222;
        int n2 = n - 108;
        this.field_20b857_DyG = mqS2.method_907a9d14_Qnq() / 9;
        this.field_267cf5_Qnq = n2 + this.field_20b857_DyG * 18;
    }

    @Override
    protected void method_2c02b146_Dne(float f, int n, int n2) {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/gui/container.png");
        int n3 = (this.field_21260d_FWm - this.field_2092ae_Dne) / 2;
        int n4 = (this.field_2e5f1b_bzF - this.field_267cf5_Qnq) / 2;
        this.method_17d7ea99_FWm(n3, n4, 0, 0, this.field_2092ae_Dne, this.field_20b857_DyG * 18 + 17);
        this.method_17d7ea99_FWm(n3, n4 + this.field_20b857_DyG * 18 + 17, 0, 126, this.field_2092ae_Dne, 96);
    }

    @Override
    protected void method_16cca7a_Dne(int n, int n2) {
        this.field_3791671_Dne.method_e88b55f3_FWm(this.field_2024511c_FWm.method_5acf91e_d_() ? this.field_2024511c_FWm.method_9fc39d88_b_() : KGL.method_39193c_Dne(this.field_2024511c_FWm.method_9fc39d88_b_()), 8, 6, 0x404040);
        this.field_3791671_Dne.method_e88b55f3_FWm(this.field_36a853d_Dne.method_5acf91e_d_() ? this.field_36a853d_Dne.method_9fc39d88_b_() : KGL.method_39193c_Dne(this.field_36a853d_Dne.method_9fc39d88_b_()), 8, this.field_267cf5_Qnq - 96 + 2, 0x404040);
    }
}

