package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class njX
extends Sss {
    private zio field_37edf4c_Dne;

    public njX(MOS mOS, zio zio2) {
        super(new oss(mOS, zio2));
        this.field_37edf4c_Dne = zio2;
    }

    @Override
    protected void method_16cca7a_Dne(int n, int n2) {
        String string = this.field_37edf4c_Dne.method_5acf91e_d_() ? this.field_37edf4c_Dne.method_9fc39d88_b_() : KGL.method_39193c_Dne(this.field_37edf4c_Dne.method_9fc39d88_b_());
        this.field_3791671_Dne.method_e88b55f3_FWm(string, this.field_2092ae_Dne / 2 - this.field_3791671_Dne.method_8f501fd7_Dne(string) / 2, 6, 0x404040);
        this.field_3791671_Dne.method_e88b55f3_FWm(KGL.method_39193c_Dne("container.inventory"), 8, this.field_267cf5_Qnq - 96 + 2, 0x404040);
    }

    @Override
    protected void method_2c02b146_Dne(float f, int n, int n2) {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/gui/alchemy.png");
        int n3 = (this.field_21260d_FWm - this.field_2092ae_Dne) / 2;
        int n4 = (this.field_2e5f1b_bzF - this.field_267cf5_Qnq) / 2;
        this.method_17d7ea99_FWm(n3, n4, 0, 0, this.field_2092ae_Dne, this.field_267cf5_Qnq);
        int n5 = this.field_37edf4c_Dne.method_7a46288d_Dne();
        if (n5 > 0) {
            int n6 = (int)(28.0f * (1.0f - (float)n5 / 400.0f));
            if (n6 > 0) {
                this.method_17d7ea99_FWm(n3 + 97, n4 + 16, 176, 0, 9, n6);
            }
            int n7 = n5 / 2 % 7;
            switch (n7) {
                case 0: {
                    n6 = 29;
                    break;
                }
                case 1: {
                    n6 = 24;
                    break;
                }
                case 2: {
                    n6 = 20;
                    break;
                }
                case 3: {
                    n6 = 16;
                    break;
                }
                case 4: {
                    n6 = 11;
                    break;
                }
                case 5: {
                    n6 = 6;
                    break;
                }
                case 6: {
                    n6 = 0;
                }
            }
            if (n6 > 0) {
                this.method_17d7ea99_FWm(n3 + 65, n4 + 14 + 29 - n6, 185, 29 - n6, 12, n6);
            }
        }
    }
}

