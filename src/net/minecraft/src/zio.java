package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class zio
extends ipD
implements FMb {
    private static final int[] field_4039e0a_FWm;
    private NMq[] field_8360c375_Dne = new NMq[4];
    private String field_569fcf45_Dne;
    private int field_2092ae_Dne;
    private int field_2e5f1b_bzF;
    private int field_21260d_FWm;
    private static final int[] field_3f1c589_Dne;

    @Override
    public int method_907a9d14_Qnq() {
        return this.field_8360c375_Dne.length;
    }

    @Override
    public int method_a98a0653_aFZ() {
        return erC.field_2092ae_Dne;
    }

    @Override
    public boolean method_6e3a6b6a_Dne(int n, NMq nMq) {
        return n == 3 ? dEr.field_836aa5b6_Dne[nMq.field_2e5f1b_bzF].method_c073dafc_mrb() : nMq.field_2e5f1b_bzF == dEr.field_3682442_Dne.field_267cf5_Qnq || nMq.field_2e5f1b_bzF == dEr.field_7c27c815_OCU.field_267cf5_Qnq;
    }

    @Override
    public NMq method_77c1cdc9_FWm(int n) {
        if (n >= 0 && n < this.field_8360c375_Dne.length) {
            NMq nMq = this.field_8360c375_Dne[n];
            this.field_8360c375_Dne[n] = null;
            return nMq;
        }
        return null;
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        super.method_8d4fb917_Dne(wkD);
        mbZ mbZ2 = wkD.method_285baa50_Dne("Items");
        this.field_8360c375_Dne = new NMq[this.method_907a9d14_Qnq()];
        for (int i = 0; i < mbZ2.method_7a46288d_Dne(); ++i) {
            WkD wkD2 = (WkD)mbZ2.method_77d0d055_FWm(i);
            byte by = wkD2.method_8f501fd0_Dne("Slot");
            if (by < 0 || by >= this.field_8360c375_Dne.length) continue;
            this.field_8360c375_Dne[by] = NMq.method_7da70e76_Dne(wkD2);
        }
        this.field_2092ae_Dne = wkD.method_8f501fe1_Dne("BrewTime");
        if (wkD.method_8f501fe8_Dne("CustomName")) {
            this.field_569fcf45_Dne = wkD.method_39193c_Dne("CustomName");
        }
    }

    @Override
    public String method_9fc39d88_b_() {
        return this.method_5acf91e_d_() ? this.field_569fcf45_Dne : "container.brewing";
    }

    public int method_7c6f602c_FWm() {
        int n = 0;
        for (int i = 0; i < 3; ++i) {
            if (this.field_8360c375_Dne[i] == null) continue;
            n |= 1 << i;
        }
        return n;
    }

    @Override
    public NMq method_9046b659_Dne(int n, int n2) {
        if (n >= 0 && n < this.field_8360c375_Dne.length) {
            NMq nMq = this.field_8360c375_Dne[n];
            this.field_8360c375_Dne[n] = null;
            return nMq;
        }
        return null;
    }

    public void method_ce7f5da9_Dne(int n) {
        this.field_2092ae_Dne = n;
    }

    @Override
    public void method_7a46289a_Dne() {
        if (this.field_2092ae_Dne > 0) {
            --this.field_2092ae_Dne;
            if (this.field_2092ae_Dne == 0) {
                this.method_b0a28144_div();
                this.method_582b297_a_();
            } else if (!this.method_7c6f603d_FWm()) {
                this.field_2092ae_Dne = 0;
                this.method_582b297_a_();
            } else if (this.field_2e5f1b_bzF != this.field_8360c375_Dne[3].field_2e5f1b_bzF) {
                this.field_2092ae_Dne = 0;
                this.method_582b297_a_();
            }
        } else if (this.method_7c6f603d_FWm()) {
            this.field_2092ae_Dne = 400;
            this.field_2e5f1b_bzF = this.field_8360c375_Dne[3].field_2e5f1b_bzF;
        }
        int n = this.method_7c6f602c_FWm();
        if (n != this.field_21260d_FWm) {
            this.field_21260d_FWm = n;
            this.field_36c4f18_Dne.method_d4dc89ed_Dne(this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp, n, 2);
        }
        super.method_7a46289a_Dne();
    }

    public int method_7a46288d_Dne() {
        return this.field_2092ae_Dne;
    }

    private int method_6e3a6b59_Dne(int n, NMq nMq) {
        return nMq == null ? n : (dEr.field_836aa5b6_Dne[nMq.field_2e5f1b_bzF].method_c073dafc_mrb() ? yDZ.method_fa81cf26_Dne(n, dEr.field_836aa5b6_Dne[nMq.field_2e5f1b_bzF].method_4a7b1d9f_Qnq()) : n);
    }

    @Override
    public NMq method_9e6e1a08_Dne(int n) {
        return n >= 0 && n < this.field_8360c375_Dne.length ? this.field_8360c375_Dne[n] : null;
    }

    @Override
    public boolean method_2c493be2_FWm(int n, NMq nMq, int n2) {
        return true;
    }

    public void method_8f501fe4_Dne(String string) {
        this.field_569fcf45_Dne = string;
    }

    static {
        field_3f1c589_Dne = new int[]{3};
        field_4039e0a_FWm = new int[]{0, 1, 2};
    }

    @Override
    public void method_6e3a6b66_Dne(int n, NMq nMq) {
        if (n >= 0 && n < this.field_8360c375_Dne.length) {
            this.field_8360c375_Dne[n] = nMq;
        }
    }

    private void method_b0a28144_div() {
        if (this.method_7c6f603d_FWm()) {
            NMq nMq = this.field_8360c375_Dne[3];
            for (int i = 0; i < 3; ++i) {
                if (this.field_8360c375_Dne[i] == null || this.field_8360c375_Dne[i].field_2e5f1b_bzF != dEr.field_3682442_Dne.field_267cf5_Qnq) continue;
                int n = this.field_8360c375_Dne[i].method_907a9d14_Qnq();
                int n2 = this.method_6e3a6b59_Dne(n, nMq);
                List list = dEr.field_3682442_Dne.method_ab0c4d7e_Dne(n);
                List list2 = dEr.field_3682442_Dne.method_ab0c4d7e_Dne(n2);
                if (!(n > 0 && list == list2 || list != null && (list.equals(list2) || list2 == null))) {
                    if (n == n2) continue;
                    this.field_8360c375_Dne[i].method_ce7f5da9_Dne(n2);
                    continue;
                }
                if (IJk.method_ce7f5dad_Dne(n) || !IJk.method_ce7f5dad_Dne(n2)) continue;
                this.field_8360c375_Dne[i].method_ce7f5da9_Dne(n2);
            }
            if (dEr.field_836aa5b6_Dne[nMq.field_2e5f1b_bzF].method_8288d6f2_IjH()) {
                this.field_8360c375_Dne[3] = new NMq(dEr.field_836aa5b6_Dne[nMq.field_2e5f1b_bzF].method_f88436d9_FWm());
            } else {
                --this.field_8360c375_Dne[3].field_2092ae_Dne;
                if (this.field_8360c375_Dne[3].field_2092ae_Dne <= 0) {
                    this.field_8360c375_Dne[3] = null;
                }
            }
        }
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        super.method_66a36cd8_FWm(wkD);
        wkD.method_5ab47529_Dne("BrewTime", (short)this.field_2092ae_Dne);
        mbZ mbZ2 = new mbZ();
        for (int i = 0; i < this.field_8360c375_Dne.length; ++i) {
            if (this.field_8360c375_Dne[i] == null) continue;
            WkD wkD2 = new WkD();
            wkD2.method_5ab43558_Dne("Slot", (byte)i);
            this.field_8360c375_Dne[i].method_7dab90f8_Dne(wkD2);
            mbZ2.method_b4ba5ea1_Dne(wkD2);
        }
        wkD.method_58996597_Dne("Items", mbZ2);
        if (this.method_5acf91e_d_()) {
            wkD.method_abaa98ae_Dne("CustomName", this.field_569fcf45_Dne);
        }
    }

    @Override
    public boolean method_59137461_Dne(int n, NMq nMq, int n2) {
        return this.method_6e3a6b6a_Dne(n, nMq);
    }

    @Override
    public int[] method_16c585b_Dne(int n) {
        return n == 1 ? field_3f1c589_Dne : field_4039e0a_FWm;
    }

    @Override
    public boolean method_5acf91e_d_() {
        return this.field_569fcf45_Dne != null && this.field_569fcf45_Dne.length() > 0;
    }

    @Override
    public void method_5f36e9f_i_() {
    }

    @Override
    public void method_ae128dc7_bzF() {
    }

    private boolean method_7c6f603d_FWm() {
        if (this.field_8360c375_Dne[3] != null && this.field_8360c375_Dne[3].field_2092ae_Dne > 0) {
            NMq nMq = this.field_8360c375_Dne[3];
            if (!dEr.field_836aa5b6_Dne[nMq.field_2e5f1b_bzF].method_c073dafc_mrb()) {
                return false;
            }
            boolean bl = false;
            for (int i = 0; i < 3; ++i) {
                if (this.field_8360c375_Dne[i] == null || this.field_8360c375_Dne[i].field_2e5f1b_bzF != dEr.field_3682442_Dne.field_267cf5_Qnq) continue;
                int n = this.field_8360c375_Dne[i].method_907a9d14_Qnq();
                int n2 = this.method_6e3a6b59_Dne(n, nMq);
                if (!IJk.method_ce7f5dad_Dne(n) && IJk.method_ce7f5dad_Dne(n2)) {
                    bl = true;
                    break;
                }
                List list = dEr.field_3682442_Dne.method_ab0c4d7e_Dne(n);
                List list2 = dEr.field_3682442_Dne.method_ab0c4d7e_Dne(n2);
                if (n > 0 && list == list2 || list != null && (list.equals(list2) || list2 == null) || n == n2) continue;
                bl = true;
                break;
            }
            return bl;
        }
        return false;
    }

    @Override
    public boolean method_703284a7_Dne(FiG fiG) {
        return this.field_36c4f18_Dne.method_d98e681d_Dne(this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp) != this ? false : fiG.method_2be42992_Dne((double)this.field_267cf5_Qnq + 0.5, (double)this.field_2d29f4_aFZ + 0.5, (double)this.field_388da6_zGp + 0.5) <= 64.0;
    }
}

