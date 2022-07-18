package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

/*
 * Renamed from Qnx
 */
public class qnx_0
extends CAZ {
    private int field_2e8486_ceE = 0;
    private float field_2092ab_Dne;
    private sMa field_5e64b4ac_Qnq;
    private sMa field_75c313d2_bzF;
    private int field_28e7fd_Vxn = 0;

    @Override
    public void method_179c0fdf_Dne(WAR wAR, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = ((float)this.field_28e7fd_Vxn + f) / (float)this.field_2e8486_ceE;
        f7 *= f7;
        double d = this.field_75c313d2_bzF.field_2f0dd3_div;
        double d2 = this.field_75c313d2_bzF.field_22c5fd_IjH;
        double d3 = this.field_75c313d2_bzF.field_334487_mrb;
        double d4 = this.field_5e64b4ac_Qnq.field_36b0a4_udO + (this.field_5e64b4ac_Qnq.field_2f0dd3_div - this.field_5e64b4ac_Qnq.field_36b0a4_udO) * (double)f;
        double d5 = this.field_5e64b4ac_Qnq.field_34225f_ooe + (this.field_5e64b4ac_Qnq.field_22c5fd_IjH - this.field_5e64b4ac_Qnq.field_34225f_ooe) * (double)f + (double)this.field_2092ab_Dne;
        double d6 = this.field_5e64b4ac_Qnq.field_36714f_trS + (this.field_5e64b4ac_Qnq.field_334487_mrb - this.field_5e64b4ac_Qnq.field_36714f_trS) * (double)f;
        double d7 = d + (d4 - d) * (double)f7;
        double d8 = d2 + (d5 - d2) * (double)f7;
        double d9 = d3 + (d6 - d3) * (double)f7;
        int n = geR.method_117d0718_FWm(d7);
        int n2 = geR.method_117d0718_FWm(d8 + (double)(this.field_36b0a6_udO / 2.0f));
        int n3 = geR.method_117d0718_FWm(d9);
        int n4 = this.method_ce7f5259_Dne(f);
        int n5 = n4 % 65536;
        int n6 = n4 / 65536;
        oCF.method_2c2b8f69_Dne(oCF.field_21260d_FWm, (float)n5 / 1.0f, (float)n6 / 1.0f);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        ptH.field_37a7828_Dne.method_31745cde_Dne(this.field_75c313d2_bzF, (float)(d7 -= field_2092a9_Dne), (float)(d8 -= field_212608_FWm), (float)(d9 -= field_2e5f16_bzF), this.field_75c313d2_bzF.field_334489_mrb, f);
    }

    @Override
    public void method_7a46289a_Dne() {
        ++this.field_28e7fd_Vxn;
        if (this.field_28e7fd_Vxn == this.field_2e8486_ceE) {
            this.method_5d73f9d_g_();
        }
    }

    @Override
    public int method_7a46288d_Dne() {
        return 3;
    }

    public qnx_0(Qnq qnq, sMa sMa2, sMa sMa3, float f) {
        super(qnq, sMa2.field_2f0dd3_div, sMa2.field_22c5fd_IjH, sMa2.field_334487_mrb, sMa2.field_291868_XHL, sMa2.field_2a9ad1_Zpi, sMa2.field_31b811_kGO);
        this.field_75c313d2_bzF = sMa2;
        this.field_5e64b4ac_Qnq = sMa3;
        this.field_2e8486_ceE = 3;
        this.field_2092ab_Dne = f;
    }
}

