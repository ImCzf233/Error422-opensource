package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrX
extends vWZ {
    private int field_2092ae_Dne = 0;
    private final List field_f27c122c_Dne = new ArrayList();
    private final List<uQr> field_7eb83e1f_bzF;
    private final List field_6a0474ed_FWm = new ArrayList();
    private Qnq field_36c4f18_Dne;

    private void method_aac51d89_Dne(iSh iSh2) {
        int n = 16;
        int n2 = 4;
        int n3 = 16;
        for (int i = iSh2.field_2092ae_Dne - n; i < iSh2.field_2092ae_Dne + n; ++i) {
            for (int j = iSh2.field_21260d_FWm - n2; j < iSh2.field_21260d_FWm + n2; ++j) {
                for (int k = iSh2.field_2e5f1b_bzF - n3; k < iSh2.field_2e5f1b_bzF + n3; ++k) {
                    if (!this.method_a6aca7ce_FWm(i, j, k)) continue;
                    yQQ yQQ2 = this.method_d9953b41_Dne(i, j, k);
                    if (yQQ2 == null) {
                        this.method_a6aca7ca_FWm(i, j, k);
                        continue;
                    }
                    yQQ2.field_388da6_zGp = this.field_2092ae_Dne;
                }
            }
        }
    }

    private void method_a6aca7ca_FWm(int n, int n2, int n3) {
        int n4 = ((oqu_0)zKP.field_ceacd6d_ICU).method_b1f134df_a_(this.field_36c4f18_Dne, n, n2, n3);
        if (n4 != 0 && n4 != 2) {
            int n5;
            int n6 = 0;
            for (n5 = -5; n5 < 0; ++n5) {
                if (!this.field_36c4f18_Dne.method_76d9fc47_aFZ(n, n2, n3 + n5)) continue;
                --n6;
            }
            for (n5 = 1; n5 <= 5; ++n5) {
                if (!this.field_36c4f18_Dne.method_76d9fc47_aFZ(n, n2, n3 + n5)) continue;
                ++n6;
            }
            if (n6 != 0) {
                this.field_6a0474ed_FWm.add(new yQQ(n, n2, n3, 0, n6 > 0 ? -2 : 2, this.field_2092ae_Dne));
            }
        } else {
            int n7;
            int n8 = 0;
            for (n7 = -5; n7 < 0; ++n7) {
                if (!this.field_36c4f18_Dne.method_76d9fc47_aFZ(n + n7, n2, n3)) continue;
                --n8;
            }
            for (n7 = 1; n7 <= 5; ++n7) {
                if (!this.field_36c4f18_Dne.method_76d9fc47_aFZ(n + n7, n2, n3)) continue;
                ++n8;
            }
            if (n8 != 0) {
                this.field_6a0474ed_FWm.add(new yQQ(n, n2, n3, n8 > 0 ? -2 : 2, 0, this.field_2092ae_Dne));
            }
        }
    }

    private void method_907a9d21_Qnq() {
        if (!this.field_f27c122c_Dne.isEmpty()) {
            this.method_aac51d89_Dne((iSh)this.field_f27c122c_Dne.remove(0));
        }
    }

    public uQr method_b7b639d5_Dne(int n, int n2, int n3, int n4) {
        uQr uQr2 = null;
        float f = Float.MAX_VALUE;
        for (uQr uQr3 : this.field_7eb83e1f_bzF) {
            int n5;
            float f2 = uQr3.method_23105fed_Dne().method_2c2cf7b9_Dne(n, n2, n3);
            if (!(f2 < f) || !(f2 <= (float)((n5 = n4 + uQr3.method_7a46288d_Dne()) * n5))) continue;
            uQr2 = uQr3;
            f = f2;
        }
        return uQr2;
    }

    public List<uQr> method_adea226d_Dne() {
        return this.field_7eb83e1f_bzF;
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        this.field_2092ae_Dne = wkD.method_8f501fd7_Dne("Tick");
        mbZ mbZ2 = wkD.method_285baa50_Dne("Villages");
        for (int i = 0; i < mbZ2.method_7a46288d_Dne(); ++i) {
            WkD wkD2 = (WkD)mbZ2.method_77d0d055_FWm(i);
            uQr uQr2 = new uQr();
            uQr2.method_8d4fb917_Dne(wkD2);
            this.field_7eb83e1f_bzF.add(uQr2);
        }
    }

    private void method_ae128dc7_bzF() {
        Iterator iterator = this.field_7eb83e1f_bzF.iterator();
        while (iterator.hasNext()) {
            uQr uQr2 = (uQr)iterator.next();
            if (!uQr2.method_7a46289e_Dne()) continue;
            iterator.remove();
            this.method_7a46289a_Dne();
        }
    }

    private void method_a98a0660_aFZ() {
        for (int i = 0; i < this.field_6a0474ed_FWm.size(); ++i) {
            uQr uQr22;
            yQQ yQQ2 = (yQQ)this.field_6a0474ed_FWm.get(i);
            boolean bl = false;
            for (uQr uQr : this.field_7eb83e1f_bzF) {
                int n;
                int n2 = (int)uQr.method_23105fed_Dne().method_2c2cf7b9_Dne(yQQ2.field_2092ae_Dne, yQQ2.field_21260d_FWm, yQQ2.field_2e5f1b_bzF);
                if (n2 > (n = 32 + uQr.method_7a46288d_Dne()) * n) continue;
                uQr.method_c5ec03ee_Dne(yQQ2);
                bl = true;
                break;
            }
            if (bl) continue;
            uQr22 = new uQr(this.field_36c4f18_Dne);
            uQr22.method_c5ec03ee_Dne(yQQ2);
            this.field_7eb83e1f_bzF.add(uQr22);
            this.method_7a46289a_Dne();
        }
        this.field_6a0474ed_FWm.clear();
    }

    private boolean method_2c2cf7cd_Dne(int n, int n2, int n3) {
        iSh iSh2;
        Iterator iterator = this.field_f27c122c_Dne.iterator();
        do {
            if (!iterator.hasNext()) {
                return false;
            }
            iSh2 = (iSh)iterator.next();
        } while (iSh2.field_2092ae_Dne != n || iSh2.field_21260d_FWm != n2 || iSh2.field_2e5f1b_bzF != n3);
        return true;
    }

    public void method_2c2cf7c9_Dne(int n, int n2, int n3) {
        if (this.field_f27c122c_Dne.size() <= 64 && !this.method_2c2cf7cd_Dne(n, n2, n3)) {
            this.field_f27c122c_Dne.add(new iSh(n, n2, n3));
        }
    }

    private boolean method_a6aca7ce_FWm(int n, int n2, int n3) {
        int n4 = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n, n2, n3);
        return n4 == zKP.field_ceacd6d_ICU.field_21260d_FWm;
    }

    public void method_83516093_Dne(Qnq qnq) {
        this.field_36c4f18_Dne = qnq;
        for (uQr uQr2 : this.field_7eb83e1f_bzF) {
            uQr2.method_83516093_Dne(qnq);
        }
    }

    public PrX(Qnq qnq) {
        super("villages");
        this.field_7eb83e1f_bzF = new ArrayList();
        this.field_36c4f18_Dne = qnq;
        this.method_7a46289a_Dne();
    }

    private yQQ method_d9953b41_Dne(int n, int n2, int n3) {
        yQQ yQQ2;
        Iterator iterator = this.field_6a0474ed_FWm.iterator();
        do {
            if (!iterator.hasNext()) {
                uQr uQr2;
                yQQ yQQ3;
                iterator = this.field_7eb83e1f_bzF.iterator();
                do {
                    if (iterator.hasNext()) continue;
                    return null;
                } while ((yQQ3 = (uQr2 = (uQr)iterator.next()).method_21921974_bzF(n, n2, n3)) == null);
                return yQQ3;
            }
            yQQ2 = (yQQ)iterator.next();
        } while (yQQ2.field_2092ae_Dne != n || yQQ2.field_2e5f1b_bzF != n3 || Math.abs(yQQ2.field_21260d_FWm - n2) > 1);
        return yQQ2;
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        wkD.method_5ab44f9f_Dne("Tick", this.field_2092ae_Dne);
        mbZ mbZ2 = new mbZ("Villages");
        for (uQr uQr2 : this.field_7eb83e1f_bzF) {
            WkD wkD2 = new WkD("Village");
            uQr2.method_66a36cd8_FWm(wkD2);
            mbZ2.method_b4ba5ea1_Dne(wkD2);
        }
        wkD.method_58996597_Dne("Villages", mbZ2);
    }

    public PrX(String string) {
        super(string);
        this.field_7eb83e1f_bzF = new ArrayList();
    }

    public void method_7c6f6039_FWm() {
        ++this.field_2092ae_Dne;
        for (uQr uQr2 : this.field_7eb83e1f_bzF) {
            uQr2.method_ce7f5da9_Dne(this.field_2092ae_Dne);
        }
        this.method_ae128dc7_bzF();
        this.method_907a9d21_Qnq();
        this.method_a98a0660_aFZ();
        if (this.field_2092ae_Dne % 400 == 0) {
            this.method_7a46289a_Dne();
        }
    }
}

