package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class QUJ
extends YAD {
    public QUJ() {
        super(new FgN(), 1.0f);
        this.method_724f763d_Dne(new FgN());
    }

    protected void method_21ed8a3e_Dne(osi osi2, float f) {
        float f2 = osi2.method_9a443a89_XHL();
        GL11.glScalef(f2, f2, f2);
    }

    protected float method_b6c595b2_Dne(osi osi2) {
        return 180.0f;
    }

    protected int method_1bc58252_Dne(osi osi2, int n, float f) {
        if (n != 0) {
            return -1;
        }
        this.method_8f501fe4_Dne("/mob/spider_eyes.png");
        float f2 = 1.0f;
        GL11.glEnable(3042);
        GL11.glDisable(3008);
        GL11.glBlendFunc(1, 1);
        if (osi2.method_998e662d_Vxn()) {
            GL11.glDepthMask(false);
        } else {
            GL11.glDepthMask(true);
        }
        int n2 = 61680;
        int n3 = n2 % 65536;
        int n4 = n2 / 65536;
        oCF.method_2c2b8f69_Dne(oCF.field_21260d_FWm, (float)n3 / 1.0f, (float)n4 / 1.0f);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, f2);
        return 1;
    }

    @Override
    protected int method_d6a747e_Dne(FUH fUH, int n, float f) {
        return this.method_1bc58252_Dne((osi)fUH, n, f);
    }

    @Override
    protected void method_740ba292_Dne(FUH fUH, float f) {
        this.method_21ed8a3e_Dne((osi)fUH, f);
    }

    @Override
    protected float method_6f1922de_Dne(FUH fUH) {
        return this.method_b6c595b2_Dne((osi)fUH);
    }
}

