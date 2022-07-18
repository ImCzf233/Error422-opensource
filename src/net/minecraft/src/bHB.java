package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class bHB
extends CAZ {
    private int field_2e8486_ceE = 0;
    private Snh field_36d36bf_Dne;
    private int field_28e7fd_Vxn = 0;

    @Override
    public void method_7a46289a_Dne() {
        ++this.field_28e7fd_Vxn;
        if (this.field_28e7fd_Vxn == this.field_2e8486_ceE) {
            this.method_5d73f9d_g_();
        }
    }

    @Override
    public void method_179c0fdf_Dne(WAR wAR, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7;
        float f8 = ((float)this.field_28e7fd_Vxn + f) / (float)this.field_2e8486_ceE;
        if ((f7 = 2.0f - (f8 *= f8) * 2.0f) > 1.0f) {
            f7 = 1.0f;
        }
        f7 *= 0.2f;
        GL11.glDisable(2896);
        float f9 = 0.125f;
        float f10 = (float)(this.field_2f0dd3_div - field_2092a9_Dne);
        float f11 = (float)(this.field_22c5fd_IjH - field_212608_FWm);
        float f12 = (float)(this.field_334487_mrb - field_2e5f16_bzF);
        float f13 = this.field_36c4f18_Dne.method_2c2cf7b9_Dne(geR.method_117d0718_FWm(this.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_22c5fd_IjH), geR.method_117d0718_FWm(this.field_334487_mrb));
        this.field_36d36bf_Dne.method_8f501fe4_Dne("/misc/footprint.png");
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        wAR.method_7a46289a_Dne();
        wAR.method_54283b9a_Dne(f13, f13, f13, f7);
        wAR.method_c38c5864_Dne(f10 - f9, f11, f12 + f9, 0.0, 1.0);
        wAR.method_c38c5864_Dne(f10 + f9, f11, f12 + f9, 1.0, 1.0);
        wAR.method_c38c5864_Dne(f10 + f9, f11, f12 - f9, 1.0, 0.0);
        wAR.method_c38c5864_Dne(f10 - f9, f11, f12 - f9, 0.0, 0.0);
        wAR.method_7a46288d_Dne();
        GL11.glDisable(3042);
        GL11.glEnable(2896);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 3;
    }

    public bHB(Snh snh, Qnq qnq, double d, double d2, double d3) {
        super(qnq, d, d2, d3, 0.0, 0.0, 0.0);
        this.field_36d36bf_Dne = snh;
        this.field_31b811_kGO = 0.0;
        this.field_2a9ad1_Zpi = 0.0;
        this.field_291868_XHL = 0.0;
        this.field_2e8486_ceE = 200;
    }
}

