package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.opengl.GL11;

public class dfd
extends CAZ {
    private int field_2e8486_ceE = 0;
    private int field_28e7fd_Vxn = 0;
    private Snh field_36d36bf_Dne;
    private float field_2092ab_Dne;

    public dfd(Snh snh, Qnq qnq, double d, double d2, double d3, double d4, double d5, double d6) {
        super(qnq, d, d2, d3, 0.0, 0.0, 0.0);
        this.field_36d36bf_Dne = snh;
        this.field_2e8486_ceE = 6 + this.field_7331eae7_Dne.nextInt(4);
        this.field_20b854_DyG = this.field_2f0dd5_div = this.field_7331eae7_Dne.nextFloat() * 0.6f + 0.4f;
        this.field_388da3_zGp = this.field_2f0dd5_div;
        this.field_2092ab_Dne = 1.0f - (float)d4 * 0.5f;
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_2d29ef_aFZ = this.field_2f0dd3_div;
        this.field_388da1_zGp = this.field_22c5fd_IjH;
        this.field_20b852_DyG = this.field_334487_mrb;
        ++this.field_28e7fd_Vxn;
        if (this.field_28e7fd_Vxn == this.field_2e8486_ceE) {
            this.method_5d73f9d_g_();
        }
    }

    @Override
    public int method_ce7f5259_Dne(float f) {
        return 61680;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 3;
    }

    @Override
    public void method_179c0fdf_Dne(WAR wAR, float f, float f2, float f3, float f4, float f5, float f6) {
        int n = (int)(((float)this.field_28e7fd_Vxn + f) * 15.0f / (float)this.field_2e8486_ceE);
        if (n <= 15) {
            this.field_36d36bf_Dne.method_8f501fe4_Dne("/misc/explosion.png");
            float f7 = (float)(n % 4) / 4.0f;
            float f8 = f7 + 0.24975f;
            float f9 = (float)(n / 4) / 4.0f;
            float f10 = f9 + 0.24975f;
            float f11 = 2.0f * this.field_2092ab_Dne;
            float f12 = (float)(this.field_2d29ef_aFZ + (this.field_2f0dd3_div - this.field_2d29ef_aFZ) * (double)f - field_2092a9_Dne);
            float f13 = (float)(this.field_388da1_zGp + (this.field_22c5fd_IjH - this.field_388da1_zGp) * (double)f - field_212608_FWm);
            float f14 = (float)(this.field_20b852_DyG + (this.field_334487_mrb - this.field_20b852_DyG) * (double)f - field_2e5f16_bzF);
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            GL11.glDisable(2896);
            Cit.method_7a46289a_Dne();
            wAR.method_7a46289a_Dne();
            wAR.method_54283b9a_Dne(this.field_388da3_zGp, this.field_20b854_DyG, this.field_2f0dd5_div, 1.0f);
            wAR.method_a680f8e7_FWm(0.0f, 1.0f, 0.0f);
            wAR.method_117d19ea_FWm(240);
            wAR.method_c38c5864_Dne(f12 - f2 * f11 - f5 * f11, f13 - f3 * f11, f14 - f4 * f11 - f6 * f11, f8, f10);
            wAR.method_c38c5864_Dne(f12 - f2 * f11 + f5 * f11, f13 + f3 * f11, f14 - f4 * f11 + f6 * f11, f8, f9);
            wAR.method_c38c5864_Dne(f12 + f2 * f11 + f5 * f11, f13 + f3 * f11, f14 + f4 * f11 + f6 * f11, f7, f9);
            wAR.method_c38c5864_Dne(f12 + f2 * f11 - f5 * f11, f13 - f3 * f11, f14 + f4 * f11 - f6 * f11, f7, f10);
            wAR.method_7a46288d_Dne();
            GL11.glPolygonOffset(0.0f, 0.0f);
            GL11.glEnable(2896);
        }
    }
}

