package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class WDT
extends Tgj {
    @Override
    public boolean method_cc5ef5c4_trS() {
        return false;
    }

    @Override
    public boolean method_7ad38807_DyG() {
        return false;
    }

    public WDT(Qnq qnq) {
        super(qnq);
        this.field_c480ca78_bzF = "/mob/lava.png";
        this.field_342275_ooe = true;
        this.field_295781_Wwe = 0.2f;
    }

    @Override
    protected int method_c5287a51_qLR() {
        return super.method_c5287a51_qLR() + 2;
    }

    @Override
    public int method_ce7f5259_Dne(float f) {
        return 0xF000F0;
    }

    @Override
    protected void method_907a9d21_Qnq() {
        this.field_2092ab_Dne *= 0.9f;
    }

    @Override
    protected int method_baa393f5_kGO() {
        return dEr.field_86b404fa_sJS.field_267cf5_Qnq;
    }

    @Override
    protected void method_ce7f5266_Dne(float f) {
    }

    @Override
    protected String method_c50868a8_mrb() {
        return this.method_73aaafb6_ATE() > 1 ? "mob.magmacube.big" : "mob.magmacube.small";
    }

    @Override
    protected boolean method_b6f3e1a2_haP() {
        return true;
    }

    @Override
    protected Tgj method_23071f74_Dne() {
        return new WDT(this.field_36c4f18_Dne);
    }

    @Override
    protected boolean method_c738b198_qrB() {
        return true;
    }

    @Override
    protected String method_6a89a3dc_div() {
        return "mob.slime." + (this.method_73aaafb6_ATE() > 1 ? "big" : "small");
    }

    @Override
    protected void method_8d0b776f_One() {
        this.field_2a9ad1_Zpi = 0.42f + (float)this.method_73aaafb6_ATE() * 0.1f;
        this.field_1ed028_ATE = true;
    }

    @Override
    public boolean method_af414cf1_cot() {
        return this.field_36c4f18_Dne.field_2d29f4_aFZ > 0 && this.field_36c4f18_Dne.method_9ed6d42c_Dne(this.field_373a3ed_Dne) && this.field_36c4f18_Dne.method_d11d9a5_Dne(this, this.field_373a3ed_Dne).isEmpty() && !this.field_36c4f18_Dne.method_90cba31f_bzF(this.field_373a3ed_Dne);
    }

    @Override
    protected String method_d1f1ed87_FWm() {
        return "flame";
    }

    @Override
    public float method_ce7f5256_Dne(float f) {
        return 1.0f;
    }

    @Override
    public int method_9feec6b5_Zpi() {
        return this.method_73aaafb6_ATE() * 3;
    }

    @Override
    protected int method_ae128dba_bzF() {
        return super.method_ae128dba_bzF() * 4;
    }

    @Override
    protected String method_3c9d12fd_DyG() {
        return "mob.slime." + (this.method_73aaafb6_ATE() > 1 ? "big" : "small");
    }

    @Override
    protected void method_17484c9_Dne(boolean bl, int n) {
        int n2 = this.method_baa393f5_kGO();
        if (n2 > 0 && this.method_73aaafb6_ATE() > 1) {
            int n3 = this.field_7331eae7_Dne.nextInt(4) - 2;
            if (n > 0) {
                n3 += this.field_7331eae7_Dne.nextInt(n + 1);
            }
            for (int i = 0; i < n3; ++i) {
                this.method_9045499d_Dne(n2, 1);
            }
        }
    }
}

