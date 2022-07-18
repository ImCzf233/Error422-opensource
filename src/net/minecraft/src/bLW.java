package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;
import org.lwjgl.opengl.GL11;

public class bLW
extends YAD {
    private Random field_7331eae7_Dne = new Random();
    private ZYo field_370175c_Dne = (ZYo)this.field_367c742_Dne;

    @Override
    public void method_2cdda2d0_Dne(FUH fUH, double d, double d2, double d3, float f, float f2) {
        this.method_56cf3ba9_Dne((iGp)fUH, d, d2, d3, f, f2);
    }

    protected int method_a0de3245_Dne(iGp iGp2, int n, float f) {
        if (n != 0) {
            return -1;
        }
        this.method_8f501fe4_Dne("/mob/enderman_eyes.png");
        float f2 = 1.0f;
        GL11.glEnable(3042);
        GL11.glDisable(3008);
        GL11.glBlendFunc(1, 1);
        GL11.glDisable(2896);
        if (iGp2.method_998e662d_Vxn()) {
            GL11.glDepthMask(false);
        } else {
            GL11.glDepthMask(true);
        }
        int n2 = 61680;
        int n3 = n2 % 65536;
        int n4 = n2 / 65536;
        oCF.method_2c2b8f69_Dne(oCF.field_21260d_FWm, (float)n3 / 1.0f, (float)n4 / 1.0f);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glEnable(2896);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, f2);
        return 1;
    }

    @Override
    public void method_31745cde_Dne(sMa sMa2, double d, double d2, double d3, float f, float f2) {
        this.method_56cf3ba9_Dne((iGp)sMa2, d, d2, d3, f, f2);
    }

    protected void method_99d58feb_Dne(iGp iGp2, float f) {
        super.method_c52e66f1_FWm(iGp2, f);
        if (iGp2.method_ae128dba_bzF() > 0) {
            GL11.glEnable(32826);
            GL11.glPushMatrix();
            float f2 = 0.5f;
            GL11.glTranslatef(0.0f, 0.6875f, -0.75f);
            GL11.glRotatef(20.0f, 1.0f, 0.0f, 0.0f);
            GL11.glRotatef(45.0f, 0.0f, 1.0f, 0.0f);
            GL11.glScalef(-(f2 *= 1.0f), -f2, f2);
            int n = iGp2.method_ce7f5259_Dne(f);
            int n2 = n % 65536;
            int n3 = n / 65536;
            oCF.method_2c2b8f69_Dne(oCF.field_21260d_FWm, (float)n2 / 1.0f, (float)n3 / 1.0f);
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            this.method_8f501fe4_Dne("/terrain.png");
            this.field_37e98b3_Dne.method_23d00645_Dne(zKP.field_8374b848_Dne[iGp2.method_ae128dba_bzF()], iGp2.method_c5287a51_qLR(), 1.0f);
            GL11.glPopMatrix();
            GL11.glDisable(32826);
        }
    }

    public void method_56cf3ba9_Dne(iGp iGp2, double d, double d2, double d3, float f, float f2) {
        this.field_370175c_Dne.field_2092bf_Dne = iGp2.method_ae128dba_bzF() > 0;
        this.field_370175c_Dne.field_21261e_FWm = iGp2.method_9f5095a2_ZfC();
        if (iGp2.method_9f5095a2_ZfC()) {
            double d4 = 0.02;
            d += this.field_7331eae7_Dne.nextGaussian() * d4;
            d3 += this.field_7331eae7_Dne.nextGaussian() * d4;
        }
        super.method_2cdda2d0_Dne(iGp2, d, d2, d3, f, f2);
    }

    @Override
    protected int method_d6a747e_Dne(FUH fUH, int n, float f) {
        return this.method_a0de3245_Dne((iGp)fUH, n, f);
    }

    public bLW() {
        super(new ZYo(), 0.5f);
        this.method_724f763d_Dne(this.field_370175c_Dne);
    }

    @Override
    protected void method_c52e66f1_FWm(FUH fUH, float f) {
        this.method_99d58feb_Dne((iGp)fUH, f);
    }
}

