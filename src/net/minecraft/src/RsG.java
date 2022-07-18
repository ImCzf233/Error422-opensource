package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.List;

public abstract class RsG
extends sMa {
    public int field_2e5f1b_bzF;
    public int field_21260d_FWm;
    public int field_267cf5_Qnq;
    private int field_28e7fd_Vxn = 0;
    public int field_2092ae_Dne = 0;

    @Override
    public void method_2e2893bd_Qnq(double d, double d2, double d3) {
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ && !this.field_2a9ae7_Zpi && d * d + d2 * d2 + d3 * d3 > 0.0) {
            this.method_5d73f9d_g_();
            this.method_ae128dc7_bzF();
        }
    }

    @Override
    public void method_7a46289a_Dne() {
        if (this.field_28e7fd_Vxn++ == 100 && !this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            this.field_28e7fd_Vxn = 0;
            if (!this.field_2a9ae7_Zpi && !this.method_907a9d25_Qnq()) {
                this.method_5d73f9d_g_();
                this.method_ae128dc7_bzF();
            }
        }
    }

    public abstract int method_7a46288d_Dne();

    public void method_ce7f5da9_Dne(int n) {
        this.field_2092ae_Dne = n;
        this.field_2a9ad3_Zpi = this.field_334489_mrb = (float)(n * 90);
        float f = this.method_7a46288d_Dne();
        float f2 = this.method_ae128dba_bzF();
        float f3 = this.method_7a46288d_Dne();
        if (n != 2 && n != 0) {
            f = 0.5f;
        } else {
            f3 = 0.5f;
            this.field_334489_mrb = this.field_2a9ad3_Zpi = (float)(zxJ.field_5781703_aFZ[n] * 90);
        }
        f /= 32.0f;
        f2 /= 32.0f;
        f3 /= 32.0f;
        float f4 = (float)this.field_21260d_FWm + 0.5f;
        float f5 = (float)this.field_2e5f1b_bzF + 0.5f;
        float f6 = (float)this.field_267cf5_Qnq + 0.5f;
        float f7 = 0.5625f;
        if (n == 2) {
            f6 -= f7;
        }
        if (n == 1) {
            f4 -= f7;
        }
        if (n == 0) {
            f6 += f7;
        }
        if (n == 3) {
            f4 += f7;
        }
        if (n == 2) {
            f4 -= this.method_ce7f5d99_Dne(this.method_7a46288d_Dne());
        }
        if (n == 1) {
            f6 += this.method_ce7f5d99_Dne(this.method_7a46288d_Dne());
        }
        if (n == 0) {
            f4 += this.method_ce7f5d99_Dne(this.method_7a46288d_Dne());
        }
        if (n == 3) {
            f6 -= this.method_ce7f5d99_Dne(this.method_7a46288d_Dne());
        }
        this.method_2961957_bzF(f4, f5 += this.method_ce7f5d99_Dne(this.method_ae128dba_bzF()), f6);
        float f8 = -0.03125f;
        this.field_373a3ed_Dne.method_7445baeb_FWm(f4 - f - f8, f5 - f2 - f8, f6 - f3 - f8, f4 + f + f8, f5 + f2 + f8, f6 + f3 + f8);
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        if (wkD.method_8f501fe8_Dne("Direction")) {
            this.field_2092ae_Dne = wkD.method_8f501fd0_Dne("Direction");
        } else {
            switch (wkD.method_8f501fd0_Dne("Dir")) {
                case 0: {
                    this.field_2092ae_Dne = 2;
                    break;
                }
                case 1: {
                    this.field_2092ae_Dne = 1;
                    break;
                }
                case 2: {
                    this.field_2092ae_Dne = 0;
                    break;
                }
                case 3: {
                    this.field_2092ae_Dne = 3;
                }
            }
        }
        this.field_21260d_FWm = wkD.method_8f501fd7_Dne("TileX");
        this.field_2e5f1b_bzF = wkD.method_8f501fd7_Dne("TileY");
        this.field_267cf5_Qnq = wkD.method_8f501fd7_Dne("TileZ");
        this.method_ce7f5da9_Dne(this.field_2092ae_Dne);
    }

    public boolean method_907a9d25_Qnq() {
        Object object;
        if (!this.field_36c4f18_Dne.method_d11d9a5_Dne(this, this.field_373a3ed_Dne).isEmpty()) {
            return false;
        }
        int n = Math.max(1, this.method_7a46288d_Dne() / 16);
        int n2 = Math.max(1, this.method_ae128dba_bzF() / 16);
        int n3 = this.field_21260d_FWm;
        int n4 = this.field_2e5f1b_bzF;
        int n5 = this.field_267cf5_Qnq;
        if (this.field_2092ae_Dne == 2) {
            n3 = geR.method_117d0718_FWm(this.field_2f0dd3_div - (double)((float)this.method_7a46288d_Dne() / 32.0f));
        }
        if (this.field_2092ae_Dne == 1) {
            n5 = geR.method_117d0718_FWm(this.field_334487_mrb - (double)((float)this.method_7a46288d_Dne() / 32.0f));
        }
        if (this.field_2092ae_Dne == 0) {
            n3 = geR.method_117d0718_FWm(this.field_2f0dd3_div - (double)((float)this.method_7a46288d_Dne() / 32.0f));
        }
        if (this.field_2092ae_Dne == 3) {
            n5 = geR.method_117d0718_FWm(this.field_334487_mrb - (double)((float)this.method_7a46288d_Dne() / 32.0f));
        }
        n4 = geR.method_117d0718_FWm(this.field_22c5fd_IjH - (double)((float)this.method_ae128dba_bzF() / 32.0f));
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n2; ++j) {
                object = this.field_2092ae_Dne != 2 && this.field_2092ae_Dne != 0 ? this.field_36c4f18_Dne.method_d9802b31_Dne(this.field_21260d_FWm, n4 + j, n5 + i) : this.field_36c4f18_Dne.method_d9802b31_Dne(n3 + i, n4 + j, this.field_267cf5_Qnq);
                if (((KFd)object).method_7a46289e_Dne()) continue;
                return false;
            }
        }
        List list = this.field_36c4f18_Dne.method_71df22e6_FWm(this, this.field_373a3ed_Dne);
        Iterator iterator = list.iterator();
        do {
            if (iterator.hasNext()) continue;
            return true;
        } while (!((object = (sMa)iterator.next()) instanceof RsG));
        return false;
    }

    public abstract void method_ae128dc7_bzF();

    @Override
    public void method_2be429a4_Dne(double d, double d2, double d3) {
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ && !this.field_2a9ae7_Zpi && d * d + d2 * d2 + d3 * d3 > 0.0) {
            this.method_5d73f9d_g_();
            this.method_ae128dc7_bzF();
        }
    }

    @Override
    public boolean method_147b2066_Dne(zBn zBn2, int n) {
        if (this.method_7c861acb_EyB()) {
            return false;
        }
        if (!this.field_2a9ae7_Zpi && !this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            this.method_5d73f9d_g_();
            this.method_c19d9a09_oIf();
            FiG fiG = null;
            if (zBn2.method_f88b2463_FWm() instanceof FiG) {
                fiG = (FiG)zBn2.method_f88b2463_FWm();
            }
            if (fiG != null && fiG.field_37cb681_Dne.field_267d06_Qnq) {
                return true;
            }
            this.method_ae128dc7_bzF();
        }
        return true;
    }

    private float method_ce7f5d99_Dne(int n) {
        return n == 32 ? 0.5f : (n == 64 ? 0.5f : 0.0f);
    }

    @Override
    protected void method_7c6f6039_FWm() {
    }

    public RsG(Qnq qnq, int n, int n2, int n3, int n4) {
        this(qnq);
        this.field_21260d_FWm = n;
        this.field_2e5f1b_bzF = n2;
        this.field_267cf5_Qnq = n3;
    }

    @Override
    public boolean method_94d18be5_FWm(sMa sMa2) {
        return sMa2 instanceof FiG ? this.method_147b2066_Dne(zBn.method_53f50aae_Dne((FiG)sMa2), 0) : false;
    }

    public RsG(Qnq qnq) {
        super(qnq);
        this.field_36b0a6_udO = 0.0f;
        this.method_16b621a_Dne(0.5f, 0.5f);
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        wkD.method_5ab43558_Dne("Direction", (byte)this.field_2092ae_Dne);
        wkD.method_5ab44f9f_Dne("TileX", this.field_21260d_FWm);
        wkD.method_5ab44f9f_Dne("TileY", this.field_2e5f1b_bzF);
        wkD.method_5ab44f9f_Dne("TileZ", this.field_267cf5_Qnq);
        switch (this.field_2092ae_Dne) {
            case 0: {
                wkD.method_5ab43558_Dne("Dir", (byte)2);
                break;
            }
            case 1: {
                wkD.method_5ab43558_Dne("Dir", (byte)1);
                break;
            }
            case 2: {
                wkD.method_5ab43558_Dne("Dir", (byte)0);
                break;
            }
            case 3: {
                wkD.method_5ab43558_Dne("Dir", (byte)3);
            }
        }
    }

    public abstract int method_ae128dba_bzF();

    @Override
    public boolean method_baa39406_kGO() {
        return true;
    }
}

