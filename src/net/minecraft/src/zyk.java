package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class zyk
extends Sss {
    public UTs field_36dbf38_Dne;

    @Override
    protected void method_16cca7a_Dne(int n, int n2) {
        String string = this.field_36dbf38_Dne.method_5acf91e_d_() ? this.field_36dbf38_Dne.method_9fc39d88_b_() : KGL.method_39193c_Dne(this.field_36dbf38_Dne.method_9fc39d88_b_());
        this.field_3791671_Dne.method_e88b55f3_FWm(string, this.field_2092ae_Dne / 2 - this.field_3791671_Dne.method_8f501fd7_Dne(string) / 2, 6, 0x404040);
        this.field_3791671_Dne.method_e88b55f3_FWm(KGL.method_39193c_Dne("container.inventory"), 8, this.field_267cf5_Qnq - 96 + 2, 0x404040);
    }

    @Override
    protected void method_2c02b146_Dne(float f, int n, int n2) {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/gui/trap.png");
        int n3 = (this.field_21260d_FWm - this.field_2092ae_Dne) / 2;
        int n4 = (this.field_2e5f1b_bzF - this.field_267cf5_Qnq) / 2;
        this.method_17d7ea99_FWm(n3, n4, 0, 0, this.field_2092ae_Dne, this.field_267cf5_Qnq);
    }

    public zyk(MOS mOS, UTs uTs) {
        super(new HnX(mOS, uTs));
        this.field_36dbf38_Dne = uTs;
    }
}

