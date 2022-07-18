package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class oJI {
    private int field_2e5f1b_bzF;
    private boolean field_2092bf_Dne = false;
    private int field_388da6_zGp;
    private int field_2092ae_Dne = -1;
    private Qnq field_36c4f18_Dne;
    private int field_2d29f4_aFZ;
    private uQr field_37c3fb6_Dne;
    private int field_21260d_FWm;
    private int field_267cf5_Qnq;

    public oJI(Qnq qnq) {
        this.field_36c4f18_Dne = qnq;
    }

    private boolean method_7a46289e_Dne() {
        List<FiG> list = this.field_36c4f18_Dne.field_2c197105_Qnq;
        for (FiG fiG : list) {
            this.field_37c3fb6_Dne = this.field_36c4f18_Dne.field_36be6b6_Dne.method_b7b639d5_Dne((int)fiG.field_2f0dd3_div, (int)fiG.field_22c5fd_IjH, (int)fiG.field_334487_mrb, 1);
            if (this.field_37c3fb6_Dne == null || this.field_37c3fb6_Dne.method_7c6f602c_FWm() < 10 || this.field_37c3fb6_Dne.method_ae128dba_bzF() < 20 || this.field_37c3fb6_Dne.method_907a9d14_Qnq() < 20) continue;
            iSh iSh2 = this.field_37c3fb6_Dne.method_23105fed_Dne();
            float f = this.field_37c3fb6_Dne.method_7a46288d_Dne();
            boolean bl = false;
            for (int i = 0; i < 10; ++i) {
                this.field_267cf5_Qnq = iSh2.field_2092ae_Dne + (int)((double)(geR.method_117d0e97_FWm(this.field_36c4f18_Dne.field_7331eae7_Dne.nextFloat() * (float)Math.PI * 2.0f) * f) * 0.9);
                this.field_2d29f4_aFZ = iSh2.field_21260d_FWm;
                this.field_388da6_zGp = iSh2.field_2e5f1b_bzF + (int)((double)(geR.method_ce7f5256_Dne(this.field_36c4f18_Dne.field_7331eae7_Dne.nextFloat() * (float)Math.PI * 2.0f) * f) * 0.9);
                bl = false;
                for (uQr uQr2 : this.field_36c4f18_Dne.field_36be6b6_Dne.method_adea226d_Dne()) {
                    if (uQr2 == this.field_37c3fb6_Dne || !uQr2.method_2c2cf7cd_Dne(this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp)) continue;
                    bl = true;
                    break;
                }
                if (!bl) break;
            }
            if (bl) {
                return false;
            }
            chN chN2 = this.method_d98b9111_Dne(this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp);
            if (chN2 == null) continue;
            this.field_2e5f1b_bzF = 0;
            this.field_21260d_FWm = 20;
            return true;
        }
        return false;
    }

    private boolean method_7c6f603d_FWm() {
        zxd zxd2;
        chN chN2 = this.method_d98b9111_Dne(this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp);
        if (chN2 == null) {
            return false;
        }
        try {
            zxd2 = new zxd(this.field_36c4f18_Dne);
            zxd2.method_80692b1a_ICU();
            zxd2.method_ce92b9a6_IjH(false);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
        zxd2.method_9ce0fc65_FWm(chN2.field_2092a9_Dne, chN2.field_212608_FWm, chN2.field_2e5f16_bzF, this.field_36c4f18_Dne.field_7331eae7_Dne.nextFloat() * 360.0f, 0.0f);
        this.field_36c4f18_Dne.method_94d18be5_FWm(zxd2);
        iSh iSh2 = this.field_37c3fb6_Dne.method_23105fed_Dne();
        zxd2.method_2ee8c479_FWm(iSh2.field_2092ae_Dne, iSh2.field_21260d_FWm, iSh2.field_2e5f1b_bzF, this.field_37c3fb6_Dne.method_7a46288d_Dne());
        return true;
    }

    public void method_7a46289a_Dne() {
        boolean bl = false;
        if (bl) {
            if (this.field_2092ae_Dne == 2) {
                this.field_21260d_FWm = 100;
                return;
            }
        } else {
            if (this.field_36c4f18_Dne.method_7a46289e_Dne()) {
                this.field_2092ae_Dne = 0;
                return;
            }
            if (this.field_2092ae_Dne == 2) {
                return;
            }
            if (this.field_2092ae_Dne == 0) {
                float f = this.field_36c4f18_Dne.method_117d0e97_FWm(0.0f);
                if ((double)f < 0.5 || (double)f > 0.501) {
                    return;
                }
                this.field_2092ae_Dne = this.field_36c4f18_Dne.field_7331eae7_Dne.nextInt(10) == 0 ? 1 : 2;
                this.field_2092bf_Dne = false;
                if (this.field_2092ae_Dne == 2) {
                    return;
                }
            }
        }
        if (!this.field_2092bf_Dne) {
            if (!this.method_7a46289e_Dne()) {
                return;
            }
            this.field_2092bf_Dne = true;
        }
        if (this.field_2e5f1b_bzF > 0) {
            --this.field_2e5f1b_bzF;
        } else {
            this.field_2e5f1b_bzF = 2;
            if (this.field_21260d_FWm > 0) {
                this.method_7c6f603d_FWm();
                --this.field_21260d_FWm;
            } else {
                this.field_2092ae_Dne = 2;
            }
        }
    }

    private chN method_d98b9111_Dne(int n, int n2, int n3) {
        for (int i = 0; i < 10; ++i) {
            int n4;
            int n5;
            int n6 = n + this.field_36c4f18_Dne.field_7331eae7_Dne.nextInt(16) - 8;
            if (!this.field_37c3fb6_Dne.method_2c2cf7cd_Dne(n6, n5 = n2 + this.field_36c4f18_Dne.field_7331eae7_Dne.nextInt(6) - 3, n4 = n3 + this.field_36c4f18_Dne.field_7331eae7_Dne.nextInt(16) - 8) || !ooe.method_9ae12078_Dne(Icc.field_3688123_Dne, this.field_36c4f18_Dne, n6, n5, n4)) continue;
            this.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(n6, n5, n4);
        }
        return null;
    }
}

