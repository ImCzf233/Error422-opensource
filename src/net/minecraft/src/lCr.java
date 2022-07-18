package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
class lCr
extends Nlm {
    final ySb field_37e16c4_Dne;

    @Override
    public int method_7c6f602c_FWm() {
        return this.field_37e16c4_Dne.field_2d29f4_aFZ;
    }

    @Override
    public Qnq method_2305dd77_Dne() {
        return this.field_37e16c4_Dne.field_36c4f18_Dne;
    }

    @Override
    public void method_ce7f5da9_Dne(int n) {
        this.field_37e16c4_Dne.field_36c4f18_Dne.method_9e2bd981_Qnq(this.field_37e16c4_Dne.field_267cf5_Qnq, this.field_37e16c4_Dne.field_2d29f4_aFZ, this.field_37e16c4_Dne.field_388da6_zGp, zKP.field_fdf84104_eJi.field_21260d_FWm, n, 0);
    }

    lCr(ySb ySb2) {
        this.field_37e16c4_Dne = ySb2;
    }

    @Override
    public void method_752f6b0a_Dne(Iey iey) {
        super.method_752f6b0a_Dne(iey);
        if (this.method_2305dd77_Dne() != null) {
            this.method_2305dd77_Dne().method_2c2cf7c9_Dne(this.field_37e16c4_Dne.field_267cf5_Qnq, this.field_37e16c4_Dne.field_2d29f4_aFZ, this.field_37e16c4_Dne.field_388da6_zGp);
        }
    }

    @Override
    public int method_ae128dba_bzF() {
        return this.field_37e16c4_Dne.field_388da6_zGp;
    }

    @Override
    public int method_7a46288d_Dne() {
        return this.field_37e16c4_Dne.field_267cf5_Qnq;
    }
}

