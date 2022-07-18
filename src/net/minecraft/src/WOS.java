package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class WOS
extends Sss {
    private MqS field_36a853d_Dne;
    private MqS field_2024511c_FWm;

    @Override
    protected void method_16cca7a_Dne(int n, int n2) {
        this.field_3791671_Dne.method_e88b55f3_FWm(this.field_2024511c_FWm.method_5acf91e_d_() ? this.field_2024511c_FWm.method_9fc39d88_b_() : KGL.method_39193c_Dne(this.field_2024511c_FWm.method_9fc39d88_b_()), 8, 6, 0x404040);
        this.field_3791671_Dne.method_e88b55f3_FWm(this.field_36a853d_Dne.method_5acf91e_d_() ? this.field_36a853d_Dne.method_9fc39d88_b_() : KGL.method_39193c_Dne(this.field_36a853d_Dne.method_9fc39d88_b_()), 8, this.field_267cf5_Qnq - 96 + 2, 0x404040);
    }

    @Override
    protected void method_2c02b146_Dne(float f, int n, int n2) {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/gui/hopper.png");
        int n3 = (this.field_21260d_FWm - this.field_2092ae_Dne) / 2;
        int n4 = (this.field_2e5f1b_bzF - this.field_267cf5_Qnq) / 2;
        this.method_17d7ea99_FWm(n3, n4, 0, 0, this.field_2092ae_Dne, this.field_267cf5_Qnq);
    }

    public WOS(MOS mOS, MqS mqS) {
        super(new Fed(mOS, mqS));
        this.field_36a853d_Dne = mOS;
        this.field_2024511c_FWm = mqS;
        this.field_21261e_FWm = false;
        this.field_267cf5_Qnq = 133;
    }
}

