package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

public class VGP
implements fwN {
    private int[] field_3f1c589_Dne;
    private int field_2092ae_Dne;
    private int field_21260d_FWm;

    private boolean method_5972745e_Dne(int n, int n2, int n3, int n4) {
        for (int i = n; i < n3; ++i) {
            for (int j = n2; j < n4; ++j) {
                int n5 = this.field_3f1c589_Dne[i + j * this.field_2092ae_Dne];
                if ((n5 >> 24 & 0xFF) >= 128) continue;
                return true;
            }
        }
        return false;
    }

    private void method_5972745a_Dne(int n, int n2, int n3, int n4) {
        if (!this.method_5972745e_Dne(n, n2, n3, n4)) {
            for (int i = n; i < n3; ++i) {
                for (int j = n2; j < n4; ++j) {
                    int n5 = i + j * this.field_2092ae_Dne;
                    this.field_3f1c589_Dne[n5] = this.field_3f1c589_Dne[n5] & 0xFFFFFF;
                }
            }
        }
    }

    private void method_2ee8c479_FWm(int n, int n2, int n3, int n4) {
        for (int i = n; i < n3; ++i) {
            for (int j = n2; j < n4; ++j) {
                int n5 = i + j * this.field_2092ae_Dne;
                this.field_3f1c589_Dne[n5] = this.field_3f1c589_Dne[n5] | 0xFF000000;
            }
        }
    }

    @Override
    public BufferedImage method_59de725c_Dne(BufferedImage bufferedImage) {
        int n;
        int n2;
        int n3;
        if (bufferedImage == null) {
            return null;
        }
        this.field_2092ae_Dne = 64;
        this.field_21260d_FWm = 32;
        BufferedImage bufferedImage2 = new BufferedImage(this.field_2092ae_Dne, this.field_21260d_FWm, 2);
        Graphics graphics = bufferedImage2.getGraphics();
        graphics.drawImage(bufferedImage, 0, 0, null);
        graphics.dispose();
        this.field_3f1c589_Dne = ((DataBufferInt)bufferedImage2.getRaster().getDataBuffer()).getData();
        this.method_2ee8c479_FWm(0, 0, 32, 16);
        this.method_5972745a_Dne(32, 0, 64, 32);
        this.method_2ee8c479_FWm(0, 16, 64, 32);
        boolean bl = false;
        for (n3 = 32; n3 < 64; ++n3) {
            for (n2 = 0; n2 < 16; ++n2) {
                n = this.field_3f1c589_Dne[n3 + n2 * 64];
                if ((n >> 24 & 0xFF) >= 128) continue;
                bl = true;
            }
        }
        if (!bl) {
            for (n3 = 32; n3 < 64; ++n3) {
                for (n2 = 0; n2 < 16; ++n2) {
                    n = this.field_3f1c589_Dne[n3 + n2 * 64];
                    if ((n >> 24 & 0xFF) >= 128) continue;
                    bl = true;
                }
            }
        }
        return bufferedImage2;
    }
}

