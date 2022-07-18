package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class xIh
extends orI {
    private int field_21260d_FWm;
    public long field_2092af_Dne = 0L;
    private int field_2092ae_Dne;

    @Override
    public boolean method_a1a425c2_Dne(chN chN2) {
        return this.field_2092ae_Dne >= 0;
    }

    @Override
    public void method_7a46289a_Dne() {
        super.method_7a46289a_Dne();
        if (this.field_2092ae_Dne == 2) {
            this.field_36c4f18_Dne.method_c961c6ee_Dne(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb, "ambient.weather.thunder", 10000.0f, 0.8f + this.field_7331eae7_Dne.nextFloat() * 0.2f);
            this.field_36c4f18_Dne.method_c961c6ee_Dne(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb, "random.explode", 2.0f, 0.5f + this.field_7331eae7_Dne.nextFloat() * 0.2f);
        }
        --this.field_2092ae_Dne;
        if (this.field_2092ae_Dne < 0) {
            if (this.field_21260d_FWm == 0) {
                this.method_5d73f9d_g_();
            } else if (this.field_2092ae_Dne < -this.field_7331eae7_Dne.nextInt(10)) {
                int n;
                int n2;
                int n3;
                --this.field_21260d_FWm;
                this.field_2092ae_Dne = 1;
                this.field_2092af_Dne = this.field_7331eae7_Dne.nextLong();
                if (!this.field_36c4f18_Dne.field_2d2a05_aFZ && this.field_36c4f18_Dne.method_5972745e_Dne(geR.method_117d0718_FWm(this.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_22c5fd_IjH), geR.method_117d0718_FWm(this.field_334487_mrb), 10) && this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n3 = geR.method_117d0718_FWm(this.field_2f0dd3_div), n2 = geR.method_117d0718_FWm(this.field_22c5fd_IjH), n = geR.method_117d0718_FWm(this.field_334487_mrb)) == 0 && zKP.field_3774324_Dne.method_9cb39134_Dne(this.field_36c4f18_Dne, n3, n2, n)) {
                    this.field_36c4f18_Dne.method_2ee8c47d_FWm(n3, n2, n, zKP.field_3774324_Dne.field_21260d_FWm);
                }
            }
        }
        if (this.field_2092ae_Dne >= 0) {
            if (this.field_36c4f18_Dne.field_2d2a05_aFZ) {
                this.field_36c4f18_Dne.field_267cf5_Qnq = 2;
            } else {
                double d = 3.0;
                List list = this.field_36c4f18_Dne.method_71df22e6_FWm(this, bSp.method_23186cf1_Dne().method_b4ea3e0c_Dne(this.field_2f0dd3_div - d, this.field_22c5fd_IjH - d, this.field_334487_mrb - d, this.field_2f0dd3_div + d, this.field_22c5fd_IjH + 6.0 + d, this.field_334487_mrb + d));
                for (int i = 0; i < list.size(); ++i) {
                    sMa sMa2 = (sMa)list.get(i);
                    sMa2.method_c3d0e3d0_Dne(this);
                }
            }
        }
    }

    @Override
    protected void method_66a36cd8_FWm(WkD wkD) {
    }

    @Override
    protected void method_8d4fb917_Dne(WkD wkD) {
    }

    @Override
    protected void method_7c6f6039_FWm() {
    }

    public xIh(Qnq qnq, double d, double d2, double d3) {
        super(qnq);
        this.method_9ce0fc65_FWm(d, d2, d3, 0.0f, 0.0f);
        this.field_2092ae_Dne = 2;
        this.field_2092af_Dne = this.field_7331eae7_Dne.nextLong();
        this.field_21260d_FWm = this.field_7331eae7_Dne.nextInt(3) + 1;
        if (!qnq.field_2d2a05_aFZ && qnq.field_2d29f4_aFZ >= 2 && qnq.method_5972745e_Dne(geR.method_117d0718_FWm(d), geR.method_117d0718_FWm(d2), geR.method_117d0718_FWm(d3), 10)) {
            int n;
            int n2;
            int n3 = geR.method_117d0718_FWm(d);
            if (qnq.method_2c2cf7bc_Dne(n3, n2 = geR.method_117d0718_FWm(d2), n = geR.method_117d0718_FWm(d3)) == 0 && zKP.field_3774324_Dne.method_9cb39134_Dne(qnq, n3, n2, n)) {
                qnq.method_2ee8c47d_FWm(n3, n2, n, zKP.field_3774324_Dne.field_21260d_FWm);
            }
            for (n3 = 0; n3 < 4; ++n3) {
                int n4;
                n2 = geR.method_117d0718_FWm(d) + this.field_7331eae7_Dne.nextInt(3) - 1;
                if (qnq.method_2c2cf7bc_Dne(n2, n = geR.method_117d0718_FWm(d2) + this.field_7331eae7_Dne.nextInt(3) - 1, n4 = geR.method_117d0718_FWm(d3) + this.field_7331eae7_Dne.nextInt(3) - 1) != 0 || !zKP.field_3774324_Dne.method_9cb39134_Dne(qnq, n2, n, n4)) continue;
                qnq.method_2ee8c47d_FWm(n2, n, n4, zKP.field_3774324_Dne.field_21260d_FWm);
            }
        }
    }
}

