package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class YkL
extends gvx
implements sCQ {
    @Override
    protected int method_d6a0f307_FWm(Qnq qnq, int n, int n2, int n3, int n4) {
        int n5;
        int n6 = super.method_d6a0f307_FWm(qnq, n, n2, n3, n4);
        int n7 = YkL.method_7ed979f5_Qnq(n4);
        int n8 = n + zxJ.field_3f1c589_Dne[n7];
        int n9 = qnq.method_2c2cf7bc_Dne(n8, n2, n5 = n3 + zxJ.field_4039e0a_FWm[n7]);
        if (n9 > 0) {
            if (zKP.field_8374b848_Dne[n9].method_582b29b_a_()) {
                n6 = zKP.field_8374b848_Dne[n9].method_f9bf07c6_Dne(qnq, n8, n2, n5, zxJ.field_5781703_aFZ[n7]);
            } else if (n6 < 15 && zKP.method_df9deb64_DyG(n9) && (n9 = qnq.method_2c2cf7bc_Dne(n8 += zxJ.field_3f1c589_Dne[n7], n2, n5 += zxJ.field_4039e0a_FWm[n7])) > 0 && zKP.field_8374b848_Dne[n9].method_582b29b_a_()) {
                n6 = zKP.field_8374b848_Dne[n9].method_f9bf07c6_Dne(qnq, n8, n2, n5, zxJ.field_5781703_aFZ[n7]);
            }
        }
        return n6;
    }

    public boolean method_117d19ee_FWm(int n) {
        return (n & 4) == 4;
    }

    @Override
    public int method_24763341_Dne(int n, Random random, int n2) {
        return dEr.field_662f3906_NEG.field_267cf5_Qnq;
    }

    @Override
    public ipD method_c35d5be7_Dne(Qnq qnq) {
        return new HFC();
    }

    @Override
    public boolean method_3e226594_Dne(Qnq qnq, int n, int n2, int n3, int n4, int n5) {
        super.method_3e226594_Dne(qnq, n, n2, n3, n4, n5);
        ipD ipD2 = qnq.method_d98e681d_Dne(n, n2, n3);
        return ipD2 != null ? ipD2.method_16cca7e_Dne(n4, n5) : false;
    }

    @Override
    protected boolean method_ce7f5dad_Dne(int n) {
        return this.field_2092bf_Dne || (n & 8) != 0;
    }

    @Override
    public void method_3e226590_Dne(Qnq qnq, int n, int n2, int n3, int n4, int n5) {
        super.method_3e226590_Dne(qnq, n, n2, n3, n4, n5);
        qnq.method_2dee77c_bzF(n, n2, n3);
        this.method_5452795d_bzF(qnq, n, n2, n3);
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        boolean bl;
        boolean bl2 = bl = this.field_2092bf_Dne || (n2 & 8) != 0;
        return n == 0 ? (bl ? zKP.field_3f9bd7dc_CZC.method_77cd08ea_FWm(n) : zKP.field_4821929c_iNQ.method_77cd08ea_FWm(n)) : (n == 1 ? (bl ? zKP.field_2029ae31_FWm.field_5e5f2002_Qnq : this.field_5e5f2002_Qnq) : zKP.field_3747682_Dne.method_77cd08ea_FWm(1));
    }

    @Override
    protected int method_aff29d1c_d_(int n) {
        return 2;
    }

    @Override
    protected gvx method_f8864ca1_FWm() {
        return zKP.field_36fe252_Dne;
    }

    public YkL(int n, boolean bl) {
        super(n, bl);
        this.field_2d2a05_aFZ = true;
    }

    @Override
    public void method_ca828a1c_Dne(Qnq qnq, int n, int n2, int n3, Random random) {
        if (this.field_2092bf_Dne) {
            int n4 = qnq.method_2dee76f_bzF(n, n2, n3);
            qnq.method_17d7ea9d_FWm(n, n2, n3, this.method_f8864ca1_FWm().field_21260d_FWm, n4 | 8, 4);
        }
        this.method_a62aa109_bzF(qnq, n, n2, n3, random);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 37;
    }

    @Override
    protected int method_b611965a_bzF(Zpi zpi, int n, int n2, int n3, int n4) {
        return this.method_d395473b_Dne(zpi, n, n2, n3).method_7a46288d_Dne();
    }

    @Override
    public void method_9cb39130_Dne(Qnq qnq, int n, int n2, int n3) {
        super.method_9cb39130_Dne(qnq, n, n2, n3);
        qnq.method_c583bffb_Dne(n, n2, n3, this.method_c35d5be7_Dne(qnq));
    }

    private int method_35fd2539_bzF(Qnq qnq, int n, int n2, int n3, int n4) {
        return !this.method_117d19ee_FWm(n4) ? this.method_d6a0f307_FWm(qnq, n, n2, n3, n4) : Math.max(this.method_d6a0f307_FWm(qnq, n, n2, n3, n4) - this.method_381c2c40_Qnq(qnq, n, n2, n3, n4), 0);
    }

    @Override
    public boolean method_cb53d52e_Dne(Qnq qnq, int n, int n2, int n3, FiG fiG, int n4, float f, float f2, float f3) {
        int n5 = qnq.method_2dee76f_bzF(n, n2, n3);
        boolean bl = this.field_2092bf_Dne | (n5 & 8) != 0;
        boolean bl2 = !this.method_117d19ee_FWm(n5);
        int n6 = bl2 ? 4 : 0;
        qnq.method_c961c6ee_Dne((double)n + 0.5, (double)n2 + 0.5, (double)n3 + 0.5, "random.click", 0.3f, bl2 ? 0.55f : 0.5f);
        qnq.method_d4dc89ed_Dne(n, n2, n3, (n6 |= bl ? 8 : 0) | n5 & 3, 2);
        this.method_a62aa109_bzF(qnq, n, n2, n3, qnq.field_7331eae7_Dne);
        return true;
    }

    public HFC method_d395473b_Dne(Zpi zpi, int n, int n2, int n3) {
        return (HFC)zpi.method_d98e681d_Dne(n, n2, n3);
    }

    @Override
    protected gvx method_230ffc82_Dne() {
        return zKP.field_2029ae31_FWm;
    }

    @Override
    public int method_9cb39123_Dne(Qnq qnq, int n, int n2, int n3) {
        return dEr.field_662f3906_NEG.field_267cf5_Qnq;
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_5e5f2002_Qnq = rbp.method_285881e4_Dne(this.field_2092bf_Dne ? "comparator_lit" : "comparator");
    }

    @Override
    protected boolean method_d6a0f318_FWm(Qnq qnq, int n, int n2, int n3, int n4) {
        int n5 = this.method_d6a0f307_FWm(qnq, n, n2, n3, n4);
        if (n5 >= 15) {
            return true;
        }
        if (n5 == 0) {
            return false;
        }
        int n6 = this.method_381c2c40_Qnq(qnq, n, n2, n3, n4);
        return n6 == 0 ? true : n5 >= n6;
    }

    @Override
    protected void method_d6a0f314_FWm(Qnq qnq, int n, int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7;
        if (!(qnq.method_58fe7b0b_bzF(n, n2, n3, this.field_21260d_FWm) || (n7 = this.method_35fd2539_bzF(qnq, n, n2, n3, n6 = qnq.method_2dee76f_bzF(n, n2, n3))) == (n5 = this.method_d395473b_Dne(qnq, n, n2, n3).method_7a46288d_Dne()) && this.method_ce7f5dad_Dne(n6) == this.method_d6a0f318_FWm(qnq, n, n2, n3, n6))) {
            if (this.method_35fd254a_bzF(qnq, n, n2, n3, n6)) {
                qnq.method_17d7ea99_FWm(n, n2, n3, this.field_21260d_FWm, this.method_aff29d1c_d_(0), -1);
            } else {
                qnq.method_17d7ea99_FWm(n, n2, n3, this.field_21260d_FWm, this.method_aff29d1c_d_(0), 0);
            }
        }
    }

    private void method_a62aa109_bzF(Qnq qnq, int n, int n2, int n3, Random random) {
        int n4 = qnq.method_2dee76f_bzF(n, n2, n3);
        int n5 = this.method_35fd2539_bzF(qnq, n, n2, n3, n4);
        int n6 = this.method_d395473b_Dne(qnq, n, n2, n3).method_7a46288d_Dne();
        this.method_d395473b_Dne(qnq, n, n2, n3).method_ce7f5da9_Dne(n5);
        if (n6 != n5 || !this.method_117d19ee_FWm(n4)) {
            boolean bl;
            boolean bl2 = this.method_d6a0f318_FWm(qnq, n, n2, n3, n4);
            boolean bl3 = bl = this.field_2092bf_Dne || (n4 & 8) != 0;
            if (bl && !bl2) {
                qnq.method_d4dc89ed_Dne(n, n2, n3, n4 & 0xFFFFFFF7, 2);
            } else if (!bl && bl2) {
                qnq.method_d4dc89ed_Dne(n, n2, n3, n4 | 8, 2);
            }
            this.method_5452795d_bzF(qnq, n, n2, n3);
        }
    }
}

