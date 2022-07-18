package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL11;

public class ofu {
    private IntBuffer field_76f31d43_Dne = pZS.method_ab715f95_Dne(65536);
    private double field_2e5f16_bzF;
    private int field_2e5f1b_bzF;
    private double field_2092a9_Dne;
    private boolean field_2092bf_Dne = false;
    private double field_212608_FWm;
    private int field_21260d_FWm;
    private boolean field_21261e_FWm = false;
    private int field_2092ae_Dne;

    public void method_c66c5815_Dne(int n, int n2, int n3, double d, double d2, double d3) {
        this.field_2092bf_Dne = true;
        this.field_76f31d43_Dne.clear();
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_2e5f1b_bzF = n3;
        this.field_2092a9_Dne = d;
        this.field_212608_FWm = d2;
        this.field_2e5f16_bzF = d3;
    }

    public void method_7a46289a_Dne() {
        if (this.field_2092bf_Dne) {
            if (!this.field_21261e_FWm) {
                this.field_76f31d43_Dne.flip();
                this.field_21261e_FWm = true;
            }
            if (this.field_76f31d43_Dne.remaining() > 0) {
                GL11.glPushMatrix();
                GL11.glTranslatef((float)((double)this.field_2092ae_Dne - this.field_2092a9_Dne), (float)((double)this.field_21260d_FWm - this.field_212608_FWm), (float)((double)this.field_2e5f1b_bzF - this.field_2e5f16_bzF));
                GL11.glCallLists(this.field_76f31d43_Dne);
                GL11.glPopMatrix();
            }
        }
    }

    public void method_7c6f6039_FWm() {
        this.field_2092bf_Dne = false;
        this.field_21261e_FWm = false;
    }

    public void method_ce7f5da9_Dne(int n) {
        this.field_76f31d43_Dne.put(n);
        if (this.field_76f31d43_Dne.remaining() == 0) {
            this.method_7a46289a_Dne();
        }
    }

    public boolean method_2c2cf7cd_Dne(int n, int n2, int n3) {
        return !this.field_2092bf_Dne ? false : n == this.field_2092ae_Dne && n2 == this.field_21260d_FWm && n3 == this.field_2e5f1b_bzF;
    }
}

