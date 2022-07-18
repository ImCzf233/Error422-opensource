package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class TXd
extends ljW {
    private gDn field_375b13b_Dne;
    private Random field_7331eae7_Dne = new Random();

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    public void method_7a46289a_Dne() {
        this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 0.125f, 1.0f);
    }

    @Override
    public int method_9cb39123_Dne(Qnq qnq, int n, int n2, int n3) {
        return dEr.field_292732da_ZkM.field_267cf5_Qnq;
    }

    @Override
    public boolean method_582b29b_a_() {
        return true;
    }

    @Override
    public void method_1bbfa017_Dne(Qnq qnq, int n, int n2, int n3, bSp bSp2, List list, sMa sMa2) {
        this.method_eb14b51a_Dne(0.4375f, 0.0f, 0.4375f, 0.5625f, 0.875f, 0.5625f);
        super.method_1bbfa017_Dne(qnq, n, n2, n3, bSp2, list, sMa2);
        this.method_7a46289a_Dne();
        super.method_1bbfa017_Dne(qnq, n, n2, n3, bSp2, list, sMa2);
    }

    @Override
    public boolean method_cb53d52e_Dne(Qnq qnq, int n, int n2, int n3, FiG fiG, int n4, float f, float f2, float f3) {
        if (qnq.field_2d2a05_aFZ) {
            return true;
        }
        zio zio2 = (zio)qnq.method_d98e681d_Dne(n, n2, n3);
        if (zio2 != null) {
            fiG.method_c900b3c7_Dne(zio2);
        }
        return true;
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        super.method_845caac7_Dne(rbp);
        this.field_375b13b_Dne = rbp.method_285881e4_Dne("brewingStand_base");
    }

    @Override
    public int method_7a46288d_Dne() {
        return 25;
    }

    @Override
    public ipD method_c35d5be7_Dne(Qnq qnq) {
        return new zio();
    }

    public gDn method_230f3f9a_Dne() {
        return this.field_375b13b_Dne;
    }

    @Override
    public int method_f9bf07c6_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        return Pdb.method_7c9aa16b_Dne((MqS)((Object)qnq.method_d98e681d_Dne(n, n2, n3)));
    }

    @Override
    public void method_ff5e68fb_FWm(Qnq qnq, int n, int n2, int n3, Random random) {
        double d = (float)n + 0.4f + random.nextFloat() * 0.2f;
        double d2 = (float)n2 + 0.7f + random.nextFloat() * 0.3f;
        double d3 = (float)n3 + 0.4f + random.nextFloat() * 0.2f;
        qnq.method_8600ec24_Dne("smoke", d, d2, d3, 0.0, 0.0, 0.0);
    }

    public TXd(int n) {
        super(n, KFd.field_f09abc1b_zGp);
    }

    @Override
    public void method_3e226590_Dne(Qnq qnq, int n, int n2, int n3, int n4, int n5) {
        ipD ipD2 = qnq.method_d98e681d_Dne(n, n2, n3);
        if (ipD2 instanceof zio) {
            zio zio2 = (zio)ipD2;
            for (int i = 0; i < zio2.method_907a9d14_Qnq(); ++i) {
                NMq nMq = zio2.method_9e6e1a08_Dne(i);
                if (nMq == null) continue;
                float f = this.field_7331eae7_Dne.nextFloat() * 0.8f + 0.1f;
                float f2 = this.field_7331eae7_Dne.nextFloat() * 0.8f + 0.1f;
                float f3 = this.field_7331eae7_Dne.nextFloat() * 0.8f + 0.1f;
                while (nMq.field_2092ae_Dne > 0) {
                    int n6 = this.field_7331eae7_Dne.nextInt(21) + 10;
                    if (n6 > nMq.field_2092ae_Dne) {
                        n6 = nMq.field_2092ae_Dne;
                    }
                    nMq.field_2092ae_Dne -= n6;
                    JiM jiM = new JiM(qnq, (float)n + f, (float)n2 + f2, (float)n3 + f3, new NMq(nMq.field_2e5f1b_bzF, n6, nMq.method_907a9d14_Qnq()));
                    float f4 = 0.05f;
                    jiM.field_291868_XHL = (float)this.field_7331eae7_Dne.nextGaussian() * f4;
                    jiM.field_2a9ad1_Zpi = (float)this.field_7331eae7_Dne.nextGaussian() * f4 + 0.2f;
                    jiM.field_31b811_kGO = (float)this.field_7331eae7_Dne.nextGaussian() * f4;
                    qnq.method_94d18be5_FWm(jiM);
                }
            }
        }
        super.method_3e226590_Dne(qnq, n, n2, n3, n4, n5);
    }

    @Override
    public void method_ca7e4e57_Dne(Qnq qnq, int n, int n2, int n3, FUH fUH, NMq nMq) {
        if (nMq.method_d44b4596_zGp()) {
            ((zio)qnq.method_d98e681d_Dne(n, n2, n3)).method_8f501fe4_Dne(nMq.method_d1f1ed87_FWm());
        }
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    @Override
    public int method_24763341_Dne(int n, Random random, int n2) {
        return dEr.field_292732da_ZkM.field_267cf5_Qnq;
    }
}

