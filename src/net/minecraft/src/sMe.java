package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class sMe
extends hvE {
    private boolean field_267d06_Qnq;
    private boolean field_21261e_FWm;
    private static Exw field_36700e8_Dne;
    private static final fKu[] field_fdeb5558_FWm;
    private boolean field_2e5f2c_bzF;
    private static final fKu[] field_836ba557_Dne;
    private boolean field_2092bf_Dne;

    @Override
    public boolean method_f28ef3a4_Dne(Qnq qnq, Random random, CLK cLK) {
        int n;
        if (!this.method_859d3e3b_Dne(qnq, cLK, 0)) {
            return false;
        }
        int n2 = this.method_73b4985a_bzF(zKP.field_91df3208_BJH.field_21260d_FWm, 3);
        int n3 = this.method_73b4985a_bzF(zKP.field_91df3208_BJH.field_21260d_FWm, 2);
        int n4 = this.method_73b4985a_bzF(zKP.field_91df3208_BJH.field_21260d_FWm, 0);
        int n5 = this.method_73b4985a_bzF(zKP.field_91df3208_BJH.field_21260d_FWm, 1);
        this.method_294f1b74_Dne(qnq, cLK, 0, -4, 0, this.field_2092ae_Dne - 1, 0, this.field_2e5f1b_bzF - 1, false, random, field_36700e8_Dne);
        this.method_294f1b74_Dne(qnq, cLK, 2, 1, 2, 9, 2, 2, false, random, field_36700e8_Dne);
        this.method_294f1b74_Dne(qnq, cLK, 2, 1, 12, 9, 2, 12, false, random, field_36700e8_Dne);
        this.method_294f1b74_Dne(qnq, cLK, 2, 1, 3, 2, 2, 11, false, random, field_36700e8_Dne);
        this.method_294f1b74_Dne(qnq, cLK, 9, 1, 3, 9, 2, 11, false, random, field_36700e8_Dne);
        this.method_294f1b74_Dne(qnq, cLK, 1, 3, 1, 10, 6, 1, false, random, field_36700e8_Dne);
        this.method_294f1b74_Dne(qnq, cLK, 1, 3, 13, 10, 6, 13, false, random, field_36700e8_Dne);
        this.method_294f1b74_Dne(qnq, cLK, 1, 3, 2, 1, 6, 12, false, random, field_36700e8_Dne);
        this.method_294f1b74_Dne(qnq, cLK, 10, 3, 2, 10, 6, 12, false, random, field_36700e8_Dne);
        this.method_294f1b74_Dne(qnq, cLK, 2, 3, 2, 9, 3, 12, false, random, field_36700e8_Dne);
        this.method_294f1b74_Dne(qnq, cLK, 2, 6, 2, 9, 6, 12, false, random, field_36700e8_Dne);
        this.method_294f1b74_Dne(qnq, cLK, 3, 7, 3, 8, 7, 11, false, random, field_36700e8_Dne);
        this.method_294f1b74_Dne(qnq, cLK, 4, 8, 4, 7, 8, 10, false, random, field_36700e8_Dne);
        this.method_29936e6c_Dne(qnq, cLK, 3, 1, 3, 8, 2, 11);
        this.method_29936e6c_Dne(qnq, cLK, 4, 3, 6, 7, 3, 9);
        this.method_29936e6c_Dne(qnq, cLK, 2, 4, 2, 9, 5, 12);
        this.method_29936e6c_Dne(qnq, cLK, 4, 6, 5, 7, 6, 9);
        this.method_29936e6c_Dne(qnq, cLK, 5, 7, 6, 6, 7, 8);
        this.method_29936e6c_Dne(qnq, cLK, 5, 1, 2, 6, 2, 2);
        this.method_29936e6c_Dne(qnq, cLK, 5, 2, 12, 6, 2, 12);
        this.method_29936e6c_Dne(qnq, cLK, 5, 5, 1, 6, 5, 1);
        this.method_29936e6c_Dne(qnq, cLK, 5, 5, 13, 6, 5, 13);
        this.method_b5ae8f6f_Dne(qnq, 0, 0, 1, 5, 5, cLK);
        this.method_b5ae8f6f_Dne(qnq, 0, 0, 10, 5, 5, cLK);
        this.method_b5ae8f6f_Dne(qnq, 0, 0, 1, 5, 9, cLK);
        this.method_b5ae8f6f_Dne(qnq, 0, 0, 10, 5, 9, cLK);
        for (n = 0; n <= 14; n += 14) {
            this.method_294f1b74_Dne(qnq, cLK, 2, 4, n, 2, 5, n, false, random, field_36700e8_Dne);
            this.method_294f1b74_Dne(qnq, cLK, 4, 4, n, 4, 5, n, false, random, field_36700e8_Dne);
            this.method_294f1b74_Dne(qnq, cLK, 7, 4, n, 7, 5, n, false, random, field_36700e8_Dne);
            this.method_294f1b74_Dne(qnq, cLK, 9, 4, n, 9, 5, n, false, random, field_36700e8_Dne);
        }
        this.method_294f1b74_Dne(qnq, cLK, 5, 6, 0, 6, 6, 0, false, random, field_36700e8_Dne);
        for (n = 0; n <= 11; n += 11) {
            for (int i = 2; i <= 12; i += 2) {
                this.method_294f1b74_Dne(qnq, cLK, n, 4, i, n, 5, i, false, random, field_36700e8_Dne);
            }
            this.method_294f1b74_Dne(qnq, cLK, n, 6, 5, n, 6, 5, false, random, field_36700e8_Dne);
            this.method_294f1b74_Dne(qnq, cLK, n, 6, 9, n, 6, 9, false, random, field_36700e8_Dne);
        }
        this.method_294f1b74_Dne(qnq, cLK, 2, 7, 2, 2, 9, 2, false, random, field_36700e8_Dne);
        this.method_294f1b74_Dne(qnq, cLK, 9, 7, 2, 9, 9, 2, false, random, field_36700e8_Dne);
        this.method_294f1b74_Dne(qnq, cLK, 2, 7, 12, 2, 9, 12, false, random, field_36700e8_Dne);
        this.method_294f1b74_Dne(qnq, cLK, 9, 7, 12, 9, 9, 12, false, random, field_36700e8_Dne);
        this.method_294f1b74_Dne(qnq, cLK, 4, 9, 4, 4, 9, 4, false, random, field_36700e8_Dne);
        this.method_294f1b74_Dne(qnq, cLK, 7, 9, 4, 7, 9, 4, false, random, field_36700e8_Dne);
        this.method_294f1b74_Dne(qnq, cLK, 4, 9, 10, 4, 9, 10, false, random, field_36700e8_Dne);
        this.method_294f1b74_Dne(qnq, cLK, 7, 9, 10, 7, 9, 10, false, random, field_36700e8_Dne);
        this.method_294f1b74_Dne(qnq, cLK, 5, 9, 7, 6, 9, 7, false, random, field_36700e8_Dne);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_91df3208_BJH.field_21260d_FWm, n2, 5, 9, 6, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_91df3208_BJH.field_21260d_FWm, n2, 6, 9, 6, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_91df3208_BJH.field_21260d_FWm, n3, 5, 9, 8, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_91df3208_BJH.field_21260d_FWm, n3, 6, 9, 8, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_91df3208_BJH.field_21260d_FWm, n2, 4, 0, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_91df3208_BJH.field_21260d_FWm, n2, 5, 0, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_91df3208_BJH.field_21260d_FWm, n2, 6, 0, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_91df3208_BJH.field_21260d_FWm, n2, 7, 0, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_91df3208_BJH.field_21260d_FWm, n2, 4, 1, 8, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_91df3208_BJH.field_21260d_FWm, n2, 4, 2, 9, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_91df3208_BJH.field_21260d_FWm, n2, 4, 3, 10, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_91df3208_BJH.field_21260d_FWm, n2, 7, 1, 8, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_91df3208_BJH.field_21260d_FWm, n2, 7, 2, 9, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_91df3208_BJH.field_21260d_FWm, n2, 7, 3, 10, cLK);
        this.method_294f1b74_Dne(qnq, cLK, 4, 1, 9, 4, 1, 9, false, random, field_36700e8_Dne);
        this.method_294f1b74_Dne(qnq, cLK, 7, 1, 9, 7, 1, 9, false, random, field_36700e8_Dne);
        this.method_294f1b74_Dne(qnq, cLK, 4, 1, 10, 7, 2, 10, false, random, field_36700e8_Dne);
        this.method_294f1b74_Dne(qnq, cLK, 5, 4, 5, 6, 4, 5, false, random, field_36700e8_Dne);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_91df3208_BJH.field_21260d_FWm, n4, 4, 4, 5, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_91df3208_BJH.field_21260d_FWm, n5, 7, 4, 5, cLK);
        for (n = 0; n < 4; ++n) {
            this.method_b5ae8f6f_Dne(qnq, zKP.field_91df3208_BJH.field_21260d_FWm, n3, 5, 0 - n, 6 + n, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_91df3208_BJH.field_21260d_FWm, n3, 6, 0 - n, 6 + n, cLK);
            this.method_29936e6c_Dne(qnq, cLK, 5, 0 - n, 7 + n, 6, 0 - n, 9 + n);
        }
        this.method_29936e6c_Dne(qnq, cLK, 1, -3, 12, 10, -1, 13);
        this.method_29936e6c_Dne(qnq, cLK, 1, -3, 1, 3, -1, 13);
        this.method_29936e6c_Dne(qnq, cLK, 1, -3, 1, 9, -1, 5);
        for (n = 1; n <= 13; n += 2) {
            this.method_294f1b74_Dne(qnq, cLK, 1, -3, n, 1, -2, n, false, random, field_36700e8_Dne);
        }
        for (n = 2; n <= 12; n += 2) {
            this.method_294f1b74_Dne(qnq, cLK, 1, -1, n, 3, -1, n, false, random, field_36700e8_Dne);
        }
        this.method_294f1b74_Dne(qnq, cLK, 2, -2, 1, 5, -2, 1, false, random, field_36700e8_Dne);
        this.method_294f1b74_Dne(qnq, cLK, 7, -2, 1, 9, -2, 1, false, random, field_36700e8_Dne);
        this.method_294f1b74_Dne(qnq, cLK, 6, -3, 1, 6, -3, 1, false, random, field_36700e8_Dne);
        this.method_294f1b74_Dne(qnq, cLK, 6, -1, 1, 6, -1, 1, false, random, field_36700e8_Dne);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_37692b5_Dne.field_21260d_FWm, this.method_73b4985a_bzF(zKP.field_37692b5_Dne.field_21260d_FWm, 3) | 4, 1, -3, 8, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_37692b5_Dne.field_21260d_FWm, this.method_73b4985a_bzF(zKP.field_37692b5_Dne.field_21260d_FWm, 1) | 4, 4, -3, 8, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_9b24c8d5_lDk.field_21260d_FWm, 4, 2, -3, 8, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_9b24c8d5_lDk.field_21260d_FWm, 4, 3, -3, 8, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_36e009c_Dne.field_21260d_FWm, 0, 5, -3, 7, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_36e009c_Dne.field_21260d_FWm, 0, 5, -3, 6, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_36e009c_Dne.field_21260d_FWm, 0, 5, -3, 5, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_36e009c_Dne.field_21260d_FWm, 0, 5, -3, 4, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_36e009c_Dne.field_21260d_FWm, 0, 5, -3, 3, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_36e009c_Dne.field_21260d_FWm, 0, 5, -3, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_36e009c_Dne.field_21260d_FWm, 0, 5, -3, 1, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_36e009c_Dne.field_21260d_FWm, 0, 4, -3, 1, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_d744d6c2_yMz.field_21260d_FWm, 0, 3, -3, 1, cLK);
        if (!this.field_2e5f2c_bzF) {
            this.field_2e5f2c_bzF = this.method_6b0beb33_Dne(qnq, cLK, random, 3, -2, 1, 2, field_fdeb5558_FWm, 2);
        }
        this.method_b5ae8f6f_Dne(qnq, zKP.field_728b3649_ipf.field_21260d_FWm, 15, 3, -2, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_37692b5_Dne.field_21260d_FWm, this.method_73b4985a_bzF(zKP.field_37692b5_Dne.field_21260d_FWm, 2) | 4, 7, -3, 1, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_37692b5_Dne.field_21260d_FWm, this.method_73b4985a_bzF(zKP.field_37692b5_Dne.field_21260d_FWm, 0) | 4, 7, -3, 5, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_9b24c8d5_lDk.field_21260d_FWm, 4, 7, -3, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_9b24c8d5_lDk.field_21260d_FWm, 4, 7, -3, 3, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_9b24c8d5_lDk.field_21260d_FWm, 4, 7, -3, 4, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_36e009c_Dne.field_21260d_FWm, 0, 8, -3, 6, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_36e009c_Dne.field_21260d_FWm, 0, 9, -3, 6, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_36e009c_Dne.field_21260d_FWm, 0, 9, -3, 5, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_d744d6c2_yMz.field_21260d_FWm, 0, 9, -3, 4, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_36e009c_Dne.field_21260d_FWm, 0, 9, -2, 4, cLK);
        if (!this.field_267d06_Qnq) {
            this.field_267d06_Qnq = this.method_6b0beb33_Dne(qnq, cLK, random, 9, -2, 3, 4, field_fdeb5558_FWm, 2);
        }
        this.method_b5ae8f6f_Dne(qnq, zKP.field_728b3649_ipf.field_21260d_FWm, 15, 8, -1, 3, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_728b3649_ipf.field_21260d_FWm, 15, 8, -2, 3, cLK);
        if (!this.field_2092bf_Dne) {
            this.field_2092bf_Dne = this.method_f8f1dd60_Dne(qnq, cLK, random, 8, -3, 3, fKu.method_3e9b7320_Dne(field_836ba557_Dne, dEr.field_374f605_Dne.method_d15b82c7_Dne(random)), 2 + random.nextInt(5));
        }
        this.method_b5ae8f6f_Dne(qnq, zKP.field_d744d6c2_yMz.field_21260d_FWm, 0, 9, -3, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_d744d6c2_yMz.field_21260d_FWm, 0, 8, -3, 1, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_d744d6c2_yMz.field_21260d_FWm, 0, 4, -3, 5, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_d744d6c2_yMz.field_21260d_FWm, 0, 5, -2, 5, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_d744d6c2_yMz.field_21260d_FWm, 0, 5, -1, 5, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_d744d6c2_yMz.field_21260d_FWm, 0, 6, -3, 5, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_d744d6c2_yMz.field_21260d_FWm, 0, 7, -2, 5, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_d744d6c2_yMz.field_21260d_FWm, 0, 7, -1, 5, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_d744d6c2_yMz.field_21260d_FWm, 0, 8, -3, 5, cLK);
        this.method_294f1b74_Dne(qnq, cLK, 9, -1, 1, 9, -1, 5, false, random, field_36700e8_Dne);
        this.method_29936e6c_Dne(qnq, cLK, 8, -3, 8, 10, -1, 10);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 3, 8, -2, 11, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 3, 9, -2, 11, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 3, 10, -2, 11, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_dfb6fab4_cHy.field_21260d_FWm, YlD.method_143f9e0f_bzF(this.method_73b4985a_bzF(zKP.field_dfb6fab4_cHy.field_21260d_FWm, 2)), 8, -2, 12, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_dfb6fab4_cHy.field_21260d_FWm, YlD.method_143f9e0f_bzF(this.method_73b4985a_bzF(zKP.field_dfb6fab4_cHy.field_21260d_FWm, 2)), 9, -2, 12, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_dfb6fab4_cHy.field_21260d_FWm, YlD.method_143f9e0f_bzF(this.method_73b4985a_bzF(zKP.field_dfb6fab4_cHy.field_21260d_FWm, 2)), 10, -2, 12, cLK);
        this.method_294f1b74_Dne(qnq, cLK, 8, -3, 8, 8, -3, 10, false, random, field_36700e8_Dne);
        this.method_294f1b74_Dne(qnq, cLK, 10, -3, 8, 10, -3, 10, false, random, field_36700e8_Dne);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_d744d6c2_yMz.field_21260d_FWm, 0, 10, -2, 9, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_36e009c_Dne.field_21260d_FWm, 0, 8, -2, 9, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_36e009c_Dne.field_21260d_FWm, 0, 8, -2, 10, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_36e009c_Dne.field_21260d_FWm, 0, 10, -1, 9, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_36f4c68_Dne.field_21260d_FWm, 1, 9, -2, 8, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_36f4c68_Dne.field_21260d_FWm, this.method_73b4985a_bzF(zKP.field_36f4c68_Dne.field_21260d_FWm, 4), 10, -2, 8, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_36f4c68_Dne.field_21260d_FWm, this.method_73b4985a_bzF(zKP.field_36f4c68_Dne.field_21260d_FWm, 4), 10, -1, 8, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_37e22e0_Dne.field_21260d_FWm, this.method_73b4985a_bzF(zKP.field_37e22e0_Dne.field_21260d_FWm, 2), 10, -2, 10, cLK);
        if (!this.field_21261e_FWm) {
            this.field_21261e_FWm = this.method_f8f1dd60_Dne(qnq, cLK, random, 9, -3, 10, fKu.method_3e9b7320_Dne(field_836ba557_Dne, dEr.field_374f605_Dne.method_d15b82c7_Dne(random)), 2 + random.nextInt(5));
        }
        return true;
    }

    static {
        field_836ba557_Dne = new fKu[]{new fKu(dEr.field_141d2e85_div.field_267cf5_Qnq, 0, 1, 3, 3), new fKu(dEr.field_5c4c1af_IjH.field_267cf5_Qnq, 0, 1, 5, 10), new fKu(dEr.field_74feeb39_mrb.field_267cf5_Qnq, 0, 2, 7, 15), new fKu(dEr.field_86ecf659_Kvh.field_267cf5_Qnq, 0, 1, 3, 2), new fKu(dEr.field_fc3bf6d1_tIz.field_267cf5_Qnq, 0, 4, 6, 20), new fKu(dEr.field_a989199f_gvF.field_267cf5_Qnq, 0, 3, 7, 16)};
        field_fdeb5558_FWm = new fKu[]{new fKu(dEr.field_f0a61753_zGp.field_267cf5_Qnq, 0, 2, 7, 30)};
        field_36700e8_Dne = new Exw(null);
    }

    public sMe(Random random, int n, int n2) {
        super(random, n, 64, n2, 12, 10, 15);
    }
}

