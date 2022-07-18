package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class tkL
extends dEr {
    private gDn field_202f7d1a_FWm;
    private int field_2092ae_Dne;

    @Override
    public String method_d1f1ed87_FWm() {
        return zKP.field_8374b848_Dne[this.field_2092ae_Dne].method_6859cdb9_bzF();
    }

    @Override
    public JcN method_23028156_Dne() {
        return zKP.field_8374b848_Dne[this.field_2092ae_Dne].method_23028156_Dne();
    }

    @Override
    public String method_10c7922b_Dne(NMq nMq) {
        return zKP.field_8374b848_Dne[this.field_2092ae_Dne].method_6859cdb9_bzF();
    }

    @Override
    public boolean method_4ddc487f_Dne(NMq nMq, FiG fiG, Qnq qnq, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        int n5 = qnq.method_2c2cf7bc_Dne(n, n2, n3);
        if (n5 == zKP.field_23a1e80a_EwP.field_21260d_FWm && (qnq.method_2dee76f_bzF(n, n2, n3) & 7) < 1) {
            n4 = 1;
        } else {
            if (n4 == 0) {
                --n2;
            }
            if (n4 == 1) {
                ++n2;
            }
            if (n4 == 2) {
                --n3;
            }
            if (n4 == 3) {
                ++n3;
            }
            if (n4 == 4) {
                --n;
            }
            if (n4 == 5) {
                ++n;
            }
        }
        if (nMq.field_2092ae_Dne == 0) {
            return false;
        }
        if (!fiG.method_7bcedb59_Dne(n, n2, n3, n4, nMq)) {
            return false;
        }
        if (n2 == 255 && zKP.field_8374b848_Dne[this.field_2092ae_Dne].field_368fd23_Dne.method_7a46289e_Dne()) {
            return false;
        }
        if (qnq.method_1889bc82_Dne(this.field_2092ae_Dne, n, n2, n3, false, n4, fiG, nMq)) {
            zKP zKP2 = zKP.field_8374b848_Dne[this.field_2092ae_Dne];
            int n6 = this.method_ce7f5d9c_Dne(nMq.method_907a9d14_Qnq());
            int n7 = zKP.field_8374b848_Dne[this.field_2092ae_Dne].method_a13ce189_Dne(qnq, n, n2, n3, n4, f, f2, f3, n6);
            if (qnq.method_17d7ea9d_FWm(n, n2, n3, this.field_2092ae_Dne, n7, 3)) {
                if (qnq.method_2c2cf7bc_Dne(n, n2, n3) == this.field_2092ae_Dne) {
                    zKP.field_8374b848_Dne[this.field_2092ae_Dne].method_ca7e4e57_Dne(qnq, n, n2, n3, fiG, nMq);
                    zKP.field_8374b848_Dne[this.field_2092ae_Dne].method_9d5148cd_aFZ(qnq, n, n2, n3, n7);
                }
                qnq.method_c961c6ee_Dne((float)n + 0.5f, (float)n2 + 0.5f, (float)n3 + 0.5f, zKP2.field_a21c1bc0_kGO.method_d1f1ed87_FWm(), (zKP2.field_a21c1bc0_kGO.method_7a46288a_Dne() + 1.0f) / 2.0f, zKP2.field_a21c1bc0_kGO.method_7c6f6029_FWm() * 0.8f);
                --nMq.field_2092ae_Dne;
            }
            return true;
        }
        return false;
    }

    public boolean method_4f447ca9_Dne(Qnq qnq, int n, int n2, int n3, int n4, FiG fiG, NMq nMq) {
        int n5 = qnq.method_2c2cf7bc_Dne(n, n2, n3);
        if (n5 == zKP.field_23a1e80a_EwP.field_21260d_FWm) {
            n4 = 1;
        } else if (n5 != zKP.field_728b3649_ipf.field_21260d_FWm && n5 != zKP.field_36dc147_Dne.field_21260d_FWm && n5 != zKP.field_373e079_Dne.field_21260d_FWm) {
            if (n4 == 0) {
                --n2;
            }
            if (n4 == 1) {
                ++n2;
            }
            if (n4 == 2) {
                --n3;
            }
            if (n4 == 3) {
                ++n3;
            }
            if (n4 == 4) {
                --n;
            }
            if (n4 == 5) {
                ++n;
            }
        }
        return qnq.method_1889bc82_Dne(this.method_7c6f602c_FWm(), n, n2, n3, false, n4, null, nMq);
    }

    @Override
    public gDn method_9e795529_Dne(int n) {
        return this.field_202f7d1a_FWm != null ? this.field_202f7d1a_FWm : zKP.field_8374b848_Dne[this.field_2092ae_Dne].method_77cd08ea_FWm(1);
    }

    public tkL(int n) {
        super(n);
        this.field_2092ae_Dne = n + 256;
    }

    @Override
    public void method_d88f4bf4_Dne(int n, JcN jcN, List list) {
        zKP.field_8374b848_Dne[this.field_2092ae_Dne].method_d88f4bf4_Dne(n, jcN, list);
    }

    @Override
    public int method_ae128dba_bzF() {
        return zKP.field_8374b848_Dne[this.field_2092ae_Dne].method_eecad346_Dne() != null ? 1 : 0;
    }

    public int method_7c6f602c_FWm() {
        return this.field_2092ae_Dne;
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        String string = zKP.field_8374b848_Dne[this.field_2092ae_Dne].method_eecad346_Dne();
        if (string != null) {
            this.field_202f7d1a_FWm = rbp.method_285881e4_Dne(string);
        }
    }
}

