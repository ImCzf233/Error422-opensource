package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class cBP
extends cMv {
    private yQQ field_37e0d33_Dne;
    private kSJ field_377b6aa_Dne;
    private List field_f27c122c_Dne = new ArrayList();
    private float field_2092ab_Dne;
    private boolean field_2092bf_Dne;
    private wdG field_37d6a92_Dne;

    @Override
    public boolean method_7c6f603d_FWm() {
        if (this.field_377b6aa_Dne.method_23028a4c_Dne().method_ae128dcb_bzF()) {
            return false;
        }
        float f = this.field_377b6aa_Dne.field_342261_ooe + 4.0f;
        return this.field_377b6aa_Dne.method_2be42992_Dne(this.field_37e0d33_Dne.field_2092ae_Dne, this.field_37e0d33_Dne.field_21260d_FWm, this.field_37e0d33_Dne.field_2e5f1b_bzF) > (double)(f * f);
    }

    private boolean method_c5ec03f2_Dne(yQQ yQQ2) {
        yQQ yQQ3;
        Iterator iterator = this.field_f27c122c_Dne.iterator();
        do {
            if (!iterator.hasNext()) {
                return false;
            }
            yQQ3 = (yQQ)iterator.next();
        } while (yQQ2.field_2092ae_Dne != yQQ3.field_2092ae_Dne || yQQ2.field_21260d_FWm != yQQ3.field_21260d_FWm || yQQ2.field_2e5f1b_bzF != yQQ3.field_2e5f1b_bzF);
        return true;
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_377b6aa_Dne.method_23028a4c_Dne().method_ada793d7_Dne(this.field_37d6a92_Dne, this.field_2092ab_Dne);
    }

    @Override
    public boolean method_7a46289e_Dne() {
        this.method_907a9d21_Qnq();
        if (this.field_2092bf_Dne && this.field_377b6aa_Dne.field_36c4f18_Dne.method_7a46289e_Dne()) {
            return false;
        }
        uQr uQr2 = this.field_377b6aa_Dne.field_36c4f18_Dne.field_36be6b6_Dne.method_b7b639d5_Dne(geR.method_117d0718_FWm(this.field_377b6aa_Dne.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_377b6aa_Dne.field_22c5fd_IjH), geR.method_117d0718_FWm(this.field_377b6aa_Dne.field_334487_mrb), 0);
        if (uQr2 == null) {
            return false;
        }
        this.field_37e0d33_Dne = this.method_b9d8b129_Dne(uQr2);
        if (this.field_37e0d33_Dne == null) {
            return false;
        }
        boolean bl = this.field_377b6aa_Dne.method_23028a4c_Dne().method_7c6f603d_FWm();
        this.field_377b6aa_Dne.method_23028a4c_Dne().method_117d59bb_FWm(false);
        this.field_37d6a92_Dne = this.field_377b6aa_Dne.method_23028a4c_Dne().method_e45964fb_Dne(this.field_37e0d33_Dne.field_2092ae_Dne, this.field_37e0d33_Dne.field_21260d_FWm, this.field_37e0d33_Dne.field_2e5f1b_bzF);
        this.field_377b6aa_Dne.method_23028a4c_Dne().method_117d59bb_FWm(bl);
        if (this.field_37d6a92_Dne != null) {
            return true;
        }
        chN chN2 = gWB.method_25f96ebb_Dne(this.field_377b6aa_Dne, 10, 7, this.field_377b6aa_Dne.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(this.field_37e0d33_Dne.field_2092ae_Dne, this.field_37e0d33_Dne.field_21260d_FWm, this.field_37e0d33_Dne.field_2e5f1b_bzF));
        if (chN2 == null) {
            return false;
        }
        this.field_377b6aa_Dne.method_23028a4c_Dne().method_117d59bb_FWm(false);
        this.field_37d6a92_Dne = this.field_377b6aa_Dne.method_23028a4c_Dne().method_e45964fb_Dne(chN2.field_2092a9_Dne, chN2.field_212608_FWm, chN2.field_2e5f16_bzF);
        this.field_377b6aa_Dne.method_23028a4c_Dne().method_117d59bb_FWm(bl);
        return this.field_37d6a92_Dne != null;
    }

    private yQQ method_b9d8b129_Dne(uQr uQr2) {
        yQQ yQQ2 = null;
        int n = Integer.MAX_VALUE;
        List<yQQ> list = uQr2.method_adea226d_Dne();
        for (yQQ yQQ3 : list) {
            int n2 = yQQ3.method_2c2cf7bc_Dne(geR.method_117d0718_FWm(this.field_377b6aa_Dne.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_377b6aa_Dne.field_22c5fd_IjH), geR.method_117d0718_FWm(this.field_377b6aa_Dne.field_334487_mrb));
            if (n2 >= n || this.method_c5ec03f2_Dne(yQQ3)) continue;
            yQQ2 = yQQ3;
            n = n2;
        }
        return yQQ2;
    }

    public cBP(kSJ kSJ2, float f, boolean bl) {
        this.field_377b6aa_Dne = kSJ2;
        this.field_2092ab_Dne = f;
        this.field_2092bf_Dne = bl;
        this.method_ce7f5da9_Dne(1);
    }

    @Override
    public void method_7c6f6039_FWm() {
        if (this.field_377b6aa_Dne.method_23028a4c_Dne().method_ae128dcb_bzF() || this.field_377b6aa_Dne.method_2be42992_Dne(this.field_37e0d33_Dne.field_2092ae_Dne, this.field_37e0d33_Dne.field_21260d_FWm, this.field_37e0d33_Dne.field_2e5f1b_bzF) < 16.0) {
            this.field_f27c122c_Dne.add(this.field_37e0d33_Dne);
        }
    }

    private void method_907a9d21_Qnq() {
        if (this.field_f27c122c_Dne.size() > 15) {
            this.field_f27c122c_Dne.remove(0);
        }
    }
}

