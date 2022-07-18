package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

/*
 * Renamed from Zxd
 */
public class zxd_0
extends zKP {
    private gDn field_375b13b_Dne;
    private gDn field_202f7d1a_FWm;

    @Override
    public int method_cfc9daf9_Dne(Random random) {
        return 1;
    }

    @Override
    public void method_35fd2546_bzF(Qnq qnq, int n, int n2, int n3, int n4) {
        this.method_c497df55_Dne(qnq, n, n2, n3, n4, null);
    }

    @Override
    public boolean method_c616bed4_Dne(yTR yTR2) {
        return false;
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        return n == 0 ? this.field_202f7d1a_FWm : (n == 1 ? this.field_375b13b_Dne : this.field_5e5f2002_Qnq);
    }

    @Override
    public void method_f9bf07d3_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        if (qnq.method_6382f365_kGO(n, n2, n3)) {
            this.method_35fd2546_bzF(qnq, n, n2, n3, 1);
            qnq.method_2e7161e6_Qnq(n, n2, n3);
        }
    }

    @Override
    public boolean method_cb53d52e_Dne(Qnq qnq, int n, int n2, int n3, FiG fiG, int n4, float f, float f2, float f3) {
        if (fiG.method_22900b26_bzF() != null && fiG.method_22900b26_bzF().field_2e5f1b_bzF == dEr.field_5e5dc722_Qnq.field_267cf5_Qnq) {
            this.method_c497df55_Dne(qnq, n, n2, n3, 1, fiG);
            qnq.method_2e7161e6_Qnq(n, n2, n3);
            return true;
        }
        return super.method_cb53d52e_Dne(qnq, n, n2, n3, fiG, n4, f, f2, f3);
    }

    public zxd_0(int n) {
        super(n, KFd.field_84fa42fb_ceE);
        this.method_82a88d64_Dne(JcN.field_75b0c0e4_bzF);
    }

    @Override
    public void method_9cb39130_Dne(Qnq qnq, int n, int n2, int n3) {
        super.method_9cb39130_Dne(qnq, n, n2, n3);
        if (qnq.method_6382f365_kGO(n, n2, n3)) {
            this.method_35fd2546_bzF(qnq, n, n2, n3, 1);
            qnq.method_2e7161e6_Qnq(n, n2, n3);
        }
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_5e5f2002_Qnq = rbp.method_285881e4_Dne("tnt_side");
        this.field_375b13b_Dne = rbp.method_285881e4_Dne("tnt_top");
        this.field_202f7d1a_FWm = rbp.method_285881e4_Dne("tnt_bottom");
    }

    public void method_c497df55_Dne(Qnq qnq, int n, int n2, int n3, int n4, FUH fUH) {
        if (!qnq.field_2d2a05_aFZ && (n4 & 1) == 1) {
            gqg gqg2 = new gqg(qnq, (float)n + 0.5f, (float)n2 + 0.5f, (float)n3 + 0.5f, fUH);
            qnq.method_94d18be5_FWm(gqg2);
            qnq.method_a36f5f6a_Dne(gqg2, "random.fuse", 1.0f, 1.0f);
        }
    }

    @Override
    public void method_8d285d4a_Dne(Qnq qnq, int n, int n2, int n3, sMa sMa2) {
        hhc hhc2;
        if (sMa2 instanceof hhc && !qnq.field_2d2a05_aFZ && (hhc2 = (hhc)sMa2).method_cc5ef5c4_trS()) {
            this.method_c497df55_Dne(qnq, n, n2, n3, 1, hhc2.field_75c313d2_bzF instanceof FUH ? (FUH)hhc2.field_75c313d2_bzF : null);
            qnq.method_2e7161e6_Qnq(n, n2, n3);
        }
    }

    @Override
    public void method_97c143fa_Dne(Qnq qnq, int n, int n2, int n3, yTR yTR2) {
        if (!qnq.field_2d2a05_aFZ) {
            gqg gqg2 = new gqg(qnq, (float)n + 0.5f, (float)n2 + 0.5f, (float)n3 + 0.5f, yTR2.method_23007a92_Dne());
            gqg2.field_2092ae_Dne = qnq.field_7331eae7_Dne.nextInt(gqg2.field_2092ae_Dne / 4) + gqg2.field_2092ae_Dne / 8;
            qnq.method_94d18be5_FWm(gqg2);
        }
    }
}

