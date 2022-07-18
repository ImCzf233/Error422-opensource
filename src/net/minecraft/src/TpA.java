package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class TpA
extends ipD
implements MqS {
    private int field_2e5f1b_bzF;
    private String field_569fcf45_Dne;
    private boolean field_2092bf_Dne;
    private long field_2092af_Dne;
    private NMq field_36a761a_Dne;
    public static final SXd[][] field_2368f0d_Dne = new SXd[][]{{SXd.field_2026af8c_FWm, SXd.field_5e565274_Qnq}, {SXd.field_616697d5_Zpi, SXd.field_5bd4d01_IjH}, {SXd.field_f09ea2a5_zGp}, {SXd.field_1c2e71ec_XHL}};
    private float field_2092ab_Dne;
    private int field_2092ae_Dne = -1;
    private int field_21260d_FWm;

    public void method_ce7f5da9_Dne(int n) {
        this.field_2092ae_Dne = n;
    }

    @Override
    public double method_582b285_a_() {
        return 65536.0;
    }

    @Override
    public int method_a98a0653_aFZ() {
        return erC.field_2092ae_Dne;
    }

    @Override
    public String method_9fc39d88_b_() {
        return this.method_5acf91e_d_() ? this.field_569fcf45_Dne : "container.beacon";
    }

    public float method_7a46288a_Dne() {
        if (!this.field_2092bf_Dne) {
            return 0.0f;
        }
        int n = (int)(this.field_36c4f18_Dne.method_7c6f602d_FWm() - this.field_2092af_Dne);
        this.field_2092af_Dne = this.field_36c4f18_Dne.method_7c6f602d_FWm();
        if (n > 1) {
            this.field_2092ab_Dne -= (float)n / 40.0f;
            if (this.field_2092ab_Dne < 0.0f) {
                this.field_2092ab_Dne = 0.0f;
            }
        }
        this.field_2092ab_Dne += 0.025f;
        if (this.field_2092ab_Dne > 1.0f) {
            this.field_2092ab_Dne = 1.0f;
        }
        return this.field_2092ab_Dne;
    }

    public int method_ae128dba_bzF() {
        return this.field_2092ae_Dne;
    }

    @Override
    public NMq method_9e6e1a08_Dne(int n) {
        return n == 0 ? this.field_36a761a_Dne : null;
    }

    public void method_117d19ea_FWm(int n) {
        this.field_21260d_FWm = 0;
        for (int i = 0; i < this.field_2092ae_Dne && i < 3; ++i) {
            for (SXd sXd : field_2368f0d_Dne[i]) {
                if (sXd.field_2092ae_Dne != n) continue;
                this.field_21260d_FWm = n;
                return;
            }
        }
    }

    public void method_143f9e1c_bzF(int n) {
        this.field_2e5f1b_bzF = 0;
        if (this.field_2092ae_Dne >= 4) {
            for (int i = 0; i < 4; ++i) {
                for (SXd sXd : field_2368f0d_Dne[i]) {
                    if (sXd.field_2092ae_Dne != n) continue;
                    this.field_2e5f1b_bzF = n;
                    return;
                }
            }
        }
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        super.method_8d4fb917_Dne(wkD);
        this.field_21260d_FWm = wkD.method_8f501fd7_Dne("Primary");
        this.field_2e5f1b_bzF = wkD.method_8f501fd7_Dne("Secondary");
        this.field_2092ae_Dne = wkD.method_8f501fd7_Dne("Levels");
    }

    public void method_8f501fe4_Dne(String string) {
        this.field_569fcf45_Dne = string;
    }

    public int method_7a46288d_Dne() {
        return this.field_21260d_FWm;
    }

    private void method_b0a28144_div() {
        if (this.field_2092bf_Dne && this.field_2092ae_Dne > 0 && !this.field_36c4f18_Dne.field_2d2a05_aFZ && this.field_21260d_FWm > 0) {
            double d = this.field_2092ae_Dne * 10 + 10;
            int n = 0;
            if (this.field_2092ae_Dne >= 4 && this.field_21260d_FWm == this.field_2e5f1b_bzF) {
                n = 1;
            }
            bSp bSp2 = bSp.method_23186cf1_Dne().method_b4ea3e0c_Dne(this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp, this.field_267cf5_Qnq + 1, this.field_2d29f4_aFZ + 1, this.field_388da6_zGp + 1).method_b78565d7_FWm(d, d, d);
            bSp2.field_2d29ef_aFZ = this.field_36c4f18_Dne.method_7c6f602c_FWm();
            List<FiG> list = this.field_36c4f18_Dne.method_9314b7e8_Dne(FiG.class, bSp2);
            for (FiG fiG : list) {
                fiG.method_fe8e2b7b_Qnq(new NAx(this.field_21260d_FWm, 180, n, true));
            }
            if (this.field_2092ae_Dne >= 4 && this.field_21260d_FWm != this.field_2e5f1b_bzF && this.field_2e5f1b_bzF > 0) {
                for (FiG fiG : list) {
                    fiG.method_fe8e2b7b_Qnq(new NAx(this.field_2e5f1b_bzF, 180, 0, true));
                }
            }
        }
    }

    @Override
    public void method_7a46289a_Dne() {
        if (this.field_36c4f18_Dne.method_7c6f602d_FWm() % 80L == 0L) {
            this.method_8288d6ee_IjH();
            this.method_b0a28144_div();
        }
    }

    private void method_8288d6ee_IjH() {
        if (!this.field_36c4f18_Dne.method_76d9fc47_aFZ(this.field_267cf5_Qnq, this.field_2d29f4_aFZ + 1, this.field_388da6_zGp)) {
            this.field_2092bf_Dne = false;
            this.field_2092ae_Dne = 0;
        } else {
            int n;
            this.field_2092bf_Dne = true;
            this.field_2092ae_Dne = 0;
            int n2 = 1;
            while (n2 <= 4 && (n = this.field_2d29f4_aFZ - n2) >= 0) {
                boolean bl = true;
                block1: for (int i = this.field_267cf5_Qnq - n2; i <= this.field_267cf5_Qnq + n2 && bl; ++i) {
                    for (int j = this.field_388da6_zGp - n2; j <= this.field_388da6_zGp + n2; ++j) {
                        int n3 = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(i, n, j);
                        if (n3 == zKP.field_9a0e0146_Jjb.field_21260d_FWm || n3 == zKP.field_dd7dd865_Fnk.field_21260d_FWm || n3 == zKP.field_73bfb6b5_eHV.field_21260d_FWm || n3 == zKP.field_77fdc06_gnI.field_21260d_FWm) continue;
                        bl = false;
                        continue block1;
                    }
                }
                if (!bl) break;
                this.field_2092ae_Dne = n2++;
            }
            if (this.field_2092ae_Dne == 0) {
                this.field_2092bf_Dne = false;
            }
        }
    }

    @Override
    public NER method_2303e2b0_Dne() {
        WkD wkD = new WkD();
        this.method_66a36cd8_FWm(wkD);
        return new ipQ(this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp, 3, wkD);
    }

    public int method_7c6f602c_FWm() {
        return this.field_2e5f1b_bzF;
    }

    @Override
    public NMq method_9046b659_Dne(int n, int n2) {
        if (n == 0 && this.field_36a761a_Dne != null) {
            if (n2 >= this.field_36a761a_Dne.field_2092ae_Dne) {
                NMq nMq = this.field_36a761a_Dne;
                this.field_36a761a_Dne = null;
                return nMq;
            }
            this.field_36a761a_Dne.field_2092ae_Dne -= n2;
            return new NMq(this.field_36a761a_Dne.field_2e5f1b_bzF, n2, this.field_36a761a_Dne.method_907a9d14_Qnq());
        }
        return null;
    }

    @Override
    public boolean method_703284a7_Dne(FiG fiG) {
        return this.field_36c4f18_Dne.method_d98e681d_Dne(this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp) != this ? false : fiG.method_2be42992_Dne((double)this.field_267cf5_Qnq + 0.5, (double)this.field_2d29f4_aFZ + 0.5, (double)this.field_388da6_zGp + 0.5) <= 64.0;
    }

    @Override
    public void method_6e3a6b66_Dne(int n, NMq nMq) {
        if (n == 0) {
            this.field_36a761a_Dne = nMq;
        }
    }

    @Override
    public boolean method_6e3a6b6a_Dne(int n, NMq nMq) {
        return nMq.field_2e5f1b_bzF == dEr.field_86ecf659_Kvh.field_267cf5_Qnq || nMq.field_2e5f1b_bzF == dEr.field_141d2e85_div.field_267cf5_Qnq || nMq.field_2e5f1b_bzF == dEr.field_74feeb39_mrb.field_267cf5_Qnq || nMq.field_2e5f1b_bzF == dEr.field_5c4c1af_IjH.field_267cf5_Qnq;
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        super.method_66a36cd8_FWm(wkD);
        wkD.method_5ab44f9f_Dne("Primary", this.field_21260d_FWm);
        wkD.method_5ab44f9f_Dne("Secondary", this.field_2e5f1b_bzF);
        wkD.method_5ab44f9f_Dne("Levels", this.field_2092ae_Dne);
    }

    @Override
    public boolean method_5acf91e_d_() {
        return this.field_569fcf45_Dne != null && this.field_569fcf45_Dne.length() > 0;
    }

    @Override
    public void method_5f36e9f_i_() {
    }

    @Override
    public NMq method_77c1cdc9_FWm(int n) {
        if (n == 0 && this.field_36a761a_Dne != null) {
            NMq nMq = this.field_36a761a_Dne;
            this.field_36a761a_Dne = null;
            return nMq;
        }
        return null;
    }

    @Override
    public void method_ae128dc7_bzF() {
    }

    @Override
    public int method_907a9d14_Qnq() {
        return 1;
    }
}

