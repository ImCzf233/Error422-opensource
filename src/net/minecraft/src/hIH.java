package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.client.Minecraft;

public class hIH
extends FiG {
    private double field_2092a9_Dne;
    private double field_212608_FWm;
    private boolean field_2092bf_Dne = false;
    private double field_307842_gnI;
    private int field_2092ae_Dne;
    private double field_3649f4_tgc;
    private double field_217c21_Fnk;

    @Override
    public iSh method_23105fed_Dne() {
        return new iSh(geR.method_117d0718_FWm(this.field_2f0dd3_div + 0.5), geR.method_117d0718_FWm(this.field_22c5fd_IjH + 0.5), geR.method_117d0718_FWm(this.field_334487_mrb + 0.5));
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_22c9a1_JLG = 0.0f;
        super.method_7a46289a_Dne();
        this.field_30bcaf_haP = this.field_351225_qrB;
        double d = this.field_2f0dd3_div - this.field_2d29ef_aFZ;
        double d2 = this.field_334487_mrb - this.field_20b852_DyG;
        float f = geR.method_ce7f4ad4_Dne(d * d + d2 * d2) * 4.0f;
        if (f > 1.0f) {
            f = 1.0f;
        }
        this.field_351225_qrB += (f - this.field_351225_qrB) * 0.4f;
        this.field_23d93e_LVR += this.field_351225_qrB;
        if (!this.field_2092bf_Dne && this.method_ae9f0476_ceE() && this.field_36a059b_Dne.field_8360c375_Dne[this.field_36a059b_Dne.field_2092ae_Dne] != null) {
            NMq nMq = this.field_36a059b_Dne.field_8360c375_Dne[this.field_36a059b_Dne.field_2092ae_Dne];
            this.method_fd8868e_Dne(this.field_36a059b_Dne.field_8360c375_Dne[this.field_36a059b_Dne.field_2092ae_Dne], dEr.field_836aa5b6_Dne[nMq.field_2e5f1b_bzF].method_e4cfb2b_a_(nMq));
            this.field_2092bf_Dne = true;
        } else if (this.field_2092bf_Dne && !this.method_ae9f0476_ceE()) {
            this.method_7c82ec2e_FYZ();
            this.field_2092bf_Dne = false;
        }
    }

    @Override
    public boolean method_fa81cf37_Dne(int n, String string) {
        return false;
    }

    @Override
    public boolean method_147b2066_Dne(zBn zBn2, int n) {
        return true;
    }

    @Override
    public void method_ae1c3edf_Dne(double d, double d2, double d3, float f, float f2, int n) {
        this.field_2092a9_Dne = d;
        this.field_212608_FWm = d2;
        this.field_217c21_Fnk = d3;
        this.field_307842_gnI = f;
        this.field_3649f4_tgc = f2;
        this.field_2092ae_Dne = n;
    }

    @Override
    public void method_8288d6ee_IjH() {
        super.method_b0a28144_div();
        if (this.field_2092ae_Dne > 0) {
            double d;
            double d2 = this.field_2f0dd3_div + (this.field_2092a9_Dne - this.field_2f0dd3_div) / (double)this.field_2092ae_Dne;
            double d3 = this.field_22c5fd_IjH + (this.field_212608_FWm - this.field_22c5fd_IjH) / (double)this.field_2092ae_Dne;
            double d4 = this.field_334487_mrb + (this.field_217c21_Fnk - this.field_334487_mrb) / (double)this.field_2092ae_Dne;
            for (d = this.field_307842_gnI - (double)this.field_334489_mrb; d < -180.0; d += 360.0) {
            }
            while (d >= 180.0) {
                d -= 360.0;
            }
            this.field_334489_mrb = (float)((double)this.field_334489_mrb + d / (double)this.field_2092ae_Dne);
            this.field_29186a_XHL = (float)((double)this.field_29186a_XHL + (this.field_3649f4_tgc - (double)this.field_29186a_XHL) / (double)this.field_2092ae_Dne);
            --this.field_2092ae_Dne;
            this.method_2961957_bzF(d2, d3, d4);
            this.method_1e252df9_FWm(this.field_334489_mrb, this.field_29186a_XHL);
        }
        this.field_37e098_xXN = this.field_228593_IYC;
        float f = geR.method_ce7f4ad4_Dne(this.field_291868_XHL * this.field_291868_XHL + this.field_31b811_kGO * this.field_31b811_kGO);
        float f2 = (float)Math.atan(-this.field_2a9ad1_Zpi * (double)0.2f) * 15.0f;
        if (f > 0.1f) {
            f = 0.1f;
        }
        if (!this.field_2d2a05_aFZ || this.method_9a443a8c_XHL() <= 0) {
            f = 0.0f;
        }
        if (this.field_2d2a05_aFZ || this.method_9a443a8c_XHL() <= 0) {
            f2 = 0.0f;
        }
        this.field_228593_IYC += (f - this.field_228593_IYC) * 0.4f;
        this.field_20b33e_EWz += (f2 - this.field_20b33e_EWz) * 0.8f;
    }

    @Override
    public void method_c073daf8_mrb() {
        this.field_d9a85c6_FWm = "http://skins.minecraft.net/MinecraftCloaks/" + vCA.method_39193c_Dne(this.field_bc57ecbf_aFZ) + ".png";
    }

    @Override
    protected void method_d44b4592_zGp() {
        this.field_36b0a6_udO = 0.0f;
    }

    @Override
    public float method_7a46288a_Dne() {
        return 0.0f;
    }

    @Override
    public float method_59ee189_c_() {
        return 1.82f;
    }

    public hIH(Qnq qnq, String string) {
        super(qnq);
        this.field_bc57ecbf_aFZ = string;
        this.field_36b0a6_udO = 0.0f;
        this.field_215b33_FfS = 0.0f;
        if (string != null && string.length() > 0) {
            this.field_569fcf45_Dne = "http://skins.minecraft.net/MinecraftSkins/" + vCA.method_39193c_Dne(string) + ".png";
        }
        this.field_31b827_kGO = true;
        this.field_22c9a1_JLG = 0.25f;
        this.field_267cf0_Qnq = 10.0;
    }

    @Override
    public void method_8f501fe4_Dne(String string) {
        Minecraft.method_81a5f12e_Dne().field_3733694_Dne.method_2312ad69_Dne().method_8f501fe4_Dne(string);
    }

    @Override
    public void method_19b4c3a3_a_(int n, NMq nMq) {
        if (n == 0) {
            this.field_36a059b_Dne.field_8360c375_Dne[this.field_36a059b_Dne.field_2092ae_Dne] = nMq;
        } else {
            this.field_36a059b_Dne.field_fde07376_FWm[n - 1] = nMq;
        }
    }
}

