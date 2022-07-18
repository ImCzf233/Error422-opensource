package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

abstract class oeq
extends bvz {
    protected bvz method_784619f_FWm(Kci kci, List list, Random random, int n, int n2) {
        switch (this.field_2d29f4_aFZ) {
            case 0: {
                return dlc.method_743b1bfb_Dne(kci, list, random, this.field_3656daa_Dne.field_2092ae_Dne - 1, this.field_3656daa_Dne.field_21260d_FWm + n, this.field_3656daa_Dne.field_2e5f1b_bzF + n2, 1, this.method_7a46288d_Dne());
            }
            case 1: {
                return dlc.method_743b1bfb_Dne(kci, list, random, this.field_3656daa_Dne.field_2092ae_Dne + n2, this.field_3656daa_Dne.field_21260d_FWm + n, this.field_3656daa_Dne.field_2e5f1b_bzF - 1, 2, this.method_7a46288d_Dne());
            }
            case 2: {
                return dlc.method_743b1bfb_Dne(kci, list, random, this.field_3656daa_Dne.field_2092ae_Dne - 1, this.field_3656daa_Dne.field_21260d_FWm + n, this.field_3656daa_Dne.field_2e5f1b_bzF + n2, 1, this.method_7a46288d_Dne());
            }
            case 3: {
                return dlc.method_743b1bfb_Dne(kci, list, random, this.field_3656daa_Dne.field_2092ae_Dne + n2, this.field_3656daa_Dne.field_21260d_FWm + n, this.field_3656daa_Dne.field_2e5f1b_bzF - 1, 2, this.method_7a46288d_Dne());
            }
        }
        return null;
    }

    protected bvz method_3a5f42de_Dne(Kci kci, List list, Random random, int n, int n2) {
        switch (this.field_2d29f4_aFZ) {
            case 0: {
                return dlc.method_743b1bfb_Dne(kci, list, random, this.field_3656daa_Dne.field_2092ae_Dne + n, this.field_3656daa_Dne.field_21260d_FWm + n2, this.field_3656daa_Dne.field_388da6_zGp + 1, this.field_2d29f4_aFZ, this.method_7a46288d_Dne());
            }
            case 1: {
                return dlc.method_743b1bfb_Dne(kci, list, random, this.field_3656daa_Dne.field_2092ae_Dne - 1, this.field_3656daa_Dne.field_21260d_FWm + n2, this.field_3656daa_Dne.field_2e5f1b_bzF + n, this.field_2d29f4_aFZ, this.method_7a46288d_Dne());
            }
            case 2: {
                return dlc.method_743b1bfb_Dne(kci, list, random, this.field_3656daa_Dne.field_2092ae_Dne + n, this.field_3656daa_Dne.field_21260d_FWm + n2, this.field_3656daa_Dne.field_2e5f1b_bzF - 1, this.field_2d29f4_aFZ, this.method_7a46288d_Dne());
            }
            case 3: {
                return dlc.method_743b1bfb_Dne(kci, list, random, this.field_3656daa_Dne.field_267cf5_Qnq + 1, this.field_3656daa_Dne.field_21260d_FWm + n2, this.field_3656daa_Dne.field_2e5f1b_bzF + n, this.field_2d29f4_aFZ, this.method_7a46288d_Dne());
            }
        }
        return null;
    }

    protected oeq(int n) {
        super(n);
    }

    protected RLF method_d152696b_Dne(Random random) {
        int n = random.nextInt(5);
        switch (n) {
            default: {
                return RLF.field_36c3ea0_Dne;
            }
            case 2: {
                return RLF.field_20260a7f_FWm;
            }
            case 3: {
                return RLF.field_75b40c8d_bzF;
            }
            case 4: 
        }
        return RLF.field_5e55ad67_Qnq;
    }

    protected static boolean method_697d22a9_Dne(CLK cLK) {
        return cLK != null && cLK.field_21260d_FWm > 10;
    }

    protected void method_f04c7bae_Dne(Qnq qnq, Random random, CLK cLK, RLF rLF, int n, int n2, int n3) {
        switch (JDV.field_3f1c589_Dne[rLF.ordinal()]) {
            default: {
                this.method_3d7d4888_Dne(qnq, cLK, n, n2, n3, n + 3 - 1, n2 + 3 - 1, n3, 0, 0, false);
                break;
            }
            case 2: {
                this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, n, n2, n3, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, n, n2 + 1, n3, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, n, n2 + 2, n3, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, n + 1, n2 + 2, n3, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, n + 2, n2 + 2, n3, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, n + 2, n2 + 1, n3, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, n + 2, n2, n3, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_ceacd6d_ICU.field_21260d_FWm, 0, n + 1, n2, n3, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_ceacd6d_ICU.field_21260d_FWm, 8, n + 1, n2 + 1, n3, cLK);
                break;
            }
            case 3: {
                this.method_b5ae8f6f_Dne(qnq, 0, 0, n + 1, n2, n3, cLK);
                this.method_b5ae8f6f_Dne(qnq, 0, 0, n + 1, n2 + 1, n3, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_1ee0bb87_Sdr.field_21260d_FWm, 0, n, n2, n3, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_1ee0bb87_Sdr.field_21260d_FWm, 0, n, n2 + 1, n3, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_1ee0bb87_Sdr.field_21260d_FWm, 0, n, n2 + 2, n3, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_1ee0bb87_Sdr.field_21260d_FWm, 0, n + 1, n2 + 2, n3, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_1ee0bb87_Sdr.field_21260d_FWm, 0, n + 2, n2 + 2, n3, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_1ee0bb87_Sdr.field_21260d_FWm, 0, n + 2, n2 + 1, n3, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_1ee0bb87_Sdr.field_21260d_FWm, 0, n + 2, n2, n3, cLK);
                break;
            }
            case 4: {
                this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, n, n2, n3, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, n, n2 + 1, n3, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, n, n2 + 2, n3, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, n + 1, n2 + 2, n3, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, n + 2, n2 + 2, n3, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, n + 2, n2 + 1, n3, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, n + 2, n2, n3, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_79fca9d5_IYC.field_21260d_FWm, 0, n + 1, n2, n3, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_79fca9d5_IYC.field_21260d_FWm, 8, n + 1, n2 + 1, n3, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_443caa84_LoG.field_21260d_FWm, this.method_73b4985a_bzF(zKP.field_443caa84_LoG.field_21260d_FWm, 4), n + 2, n2 + 1, n3 + 1, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_443caa84_LoG.field_21260d_FWm, this.method_73b4985a_bzF(zKP.field_443caa84_LoG.field_21260d_FWm, 3), n + 2, n2 + 1, n3 - 1, cLK);
            }
        }
    }

    protected bvz method_86f6e2d1_bzF(Kci kci, List list, Random random, int n, int n2) {
        switch (this.field_2d29f4_aFZ) {
            case 0: {
                return dlc.method_743b1bfb_Dne(kci, list, random, this.field_3656daa_Dne.field_267cf5_Qnq + 1, this.field_3656daa_Dne.field_21260d_FWm + n, this.field_3656daa_Dne.field_2e5f1b_bzF + n2, 3, this.method_7a46288d_Dne());
            }
            case 1: {
                return dlc.method_743b1bfb_Dne(kci, list, random, this.field_3656daa_Dne.field_2092ae_Dne + n2, this.field_3656daa_Dne.field_21260d_FWm + n, this.field_3656daa_Dne.field_388da6_zGp + 1, 0, this.method_7a46288d_Dne());
            }
            case 2: {
                return dlc.method_743b1bfb_Dne(kci, list, random, this.field_3656daa_Dne.field_267cf5_Qnq + 1, this.field_3656daa_Dne.field_21260d_FWm + n, this.field_3656daa_Dne.field_2e5f1b_bzF + n2, 3, this.method_7a46288d_Dne());
            }
            case 3: {
                return dlc.method_743b1bfb_Dne(kci, list, random, this.field_3656daa_Dne.field_2092ae_Dne + n2, this.field_3656daa_Dne.field_21260d_FWm + n, this.field_3656daa_Dne.field_388da6_zGp + 1, 0, this.method_7a46288d_Dne());
            }
        }
        return null;
    }
}

