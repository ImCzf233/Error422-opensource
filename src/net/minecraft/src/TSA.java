package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class TSA
extends YAD {
    private int field_2092ae_Dne;

    @Override
    protected int method_e0a03bff_FWm(FUH fUH, int n, float f) {
        return this.method_f3b7345a_FWm((DhB)fUH, n, f);
    }

    protected int method_20816cd9_Dne(DhB dhB, int n, float f) {
        if (dhB.method_86921671_LVR()) {
            if (dhB.method_998e662d_Vxn()) {
                GL11.glDepthMask(false);
            } else {
                GL11.glDepthMask(true);
            }
            if (n == 1) {
                float f2 = (float)dhB.field_388da6_zGp + f;
                this.method_8f501fe4_Dne("/armor/witherarmor.png");
                GL11.glMatrixMode(5890);
                GL11.glLoadIdentity();
                float f3 = geR.method_117d0e97_FWm(f2 * 0.02f) * 3.0f;
                float f4 = f2 * 0.01f;
                GL11.glTranslatef(f3, f4, 0.0f);
                this.method_724f763d_Dne(this.field_367c742_Dne);
                GL11.glMatrixMode(5888);
                GL11.glEnable(3042);
                float f5 = 0.5f;
                GL11.glColor4f(f5, f5, f5, 1.0f);
                GL11.glDisable(2896);
                GL11.glBlendFunc(1, 1);
                GL11.glTranslatef(0.0f, -0.01f, 0.0f);
                GL11.glScalef(1.1f, 1.1f, 1.1f);
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

    @Override
    public void method_31745cde_Dne(sMa sMa2, double d, double d2, double d3, float f, float f2) {
        this.method_aaed0895_Dne((DhB)sMa2, d, d2, d3, f, f2);
    }

    public TSA() {
        super(new rML(), 1.0f);
        this.field_2092ae_Dne = ((rML)this.field_367c742_Dne).method_7a46288d_Dne();
    }

    @Override
    public void method_2cdda2d0_Dne(FUH fUH, double d, double d2, double d3, float f, float f2) {
        this.method_aaed0895_Dne((DhB)fUH, d, d2, d3, f, f2);
    }

    public void method_aaed0895_Dne(DhB dhB, double d, double d2, double d3, float f, float f2) {
        mwX.method_b9f76b1c_Dne(dhB, true);
        int n = ((rML)this.field_367c742_Dne).method_7a46288d_Dne();
        if (n != this.field_2092ae_Dne) {
            this.field_2092ae_Dne = n;
            this.field_367c742_Dne = new rML();
        }
        super.method_2cdda2d0_Dne(dhB, d, d2, d3, f, f2);
    }

    @Override
    protected void method_740ba292_Dne(FUH fUH, float f) {
        this.method_2a56b2d7_Dne((DhB)fUH, f);
    }

    @Override
    protected int method_d6a747e_Dne(FUH fUH, int n, float f) {
        return this.method_20816cd9_Dne((DhB)fUH, n, f);
    }

    protected void method_2a56b2d7_Dne(DhB dhB, float f) {
        int n = dhB.method_ae128dba_bzF();
        if (n > 0) {
            float f2 = 2.0f - ((float)n - f) / 220.0f * 0.5f;
            GL11.glScalef(f2, f2, f2);
        } else {
            GL11.glScalef(2.0f, 2.0f, 2.0f);
        }
    }

    protected int method_f3b7345a_FWm(DhB dhB, int n, float f) {
        return -1;
    }
}

