package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class WUR
extends YAD {
    private Gor field_75af952f_bzF = new BHA(2.0f);

    @Override
    protected void method_740ba292_Dne(FUH fUH, float f) {
        this.method_6f56aee7_Dne((gls)fUH, f);
    }

    protected int method_7b7f95ac_Dne(gls gls2, float f, float f2) {
        float f3 = gls2.method_143f92c9_bzF(f2);
        if ((int)(f3 * 10.0f) % 2 == 0) {
            return 0;
        }
        int n = (int)(f3 * 0.2f * 255.0f);
        if (n < 0) {
            n = 0;
        }
        if (n > 255) {
            n = 255;
        }
        int n2 = 255;
        int n3 = 255;
        int n4 = 255;
        return n << 24 | n2 << 16 | n3 << 8 | n4;
    }

    @Override
    protected int method_e0a03bff_FWm(FUH fUH, int n, float f) {
        return this.method_4eb6ba4a_FWm((gls)fUH, n, f);
    }

    public WUR() {
        super(new BHA(), 0.5f);
    }

    @Override
    protected int method_d6a747e_Dne(FUH fUH, int n, float f) {
        return this.method_7b80f2c9_Dne((gls)fUH, n, f);
    }

    protected void method_6f56aee7_Dne(gls gls2, float f) {
        float f2 = gls2.method_143f92c9_bzF(f);
        float f3 = 1.0f + geR.method_ce7f5256_Dne(f2 * 100.0f) * f2 * 0.01f;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        f2 *= f2;
        f2 *= f2;
        float f4 = (1.0f + f2 * 0.4f) * f3;
        float f5 = (1.0f + f2 * 0.1f) / f3;
        GL11.glScalef(f4, f5, f4);
    }

    @Override
    protected int method_d691761_Dne(FUH fUH, float f, float f2) {
        return this.method_7b7f95ac_Dne((gls)fUH, f, f2);
    }

    protected int method_4eb6ba4a_FWm(gls gls2, int n, float f) {
        return -1;
    }

    protected int method_7b80f2c9_Dne(gls gls2, int n, float f) {
        if (gls2.method_86921671_LVR()) {
            if (gls2.method_998e662d_Vxn()) {
                GL11.glDepthMask(false);
            } else {
                GL11.glDepthMask(true);
            }
            if (n == 1) {
                float f2 = (float)gls2.field_388da6_zGp + f;
                this.method_8f501fe4_Dne("/armor/power.png");
                GL11.glMatrixMode(5890);
                GL11.glLoadIdentity();
                float f3 = f2 * 0.01f;
                float f4 = f2 * 0.01f;
                GL11.glTranslatef(f3, f4, 0.0f);
                this.method_724f763d_Dne(this.field_75af952f_bzF);
                GL11.glMatrixMode(5888);
                GL11.glEnable(3042);
                float f5 = 0.5f;
                GL11.glColor4f(f5, f5, f5, 1.0f);
                GL11.glDisable(2896);
                GL11.glBlendFunc(1, 1);
                return 1;
            }
            if (n == 2) {
                GL11.glMatrixMode(5890);
                GL11.glLoadIdentity();
                GL11.glMatrixMode(5888);
                GL11.glEnable(2896);
                GL11.glDisable(3042);
            }
        }
        return -1;
    }
}

