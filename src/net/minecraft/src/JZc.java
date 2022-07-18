package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class JZc
extends XLq {
    private int field_2092ae_Dne;

    @Override
    public void method_dbe42dde_Dne(bvz bvz2, List list, Random random) {
        bvz bvz3;
        int n;
        boolean bl = false;
        for (n = random.nextInt(5); n < this.field_2092ae_Dne - 8; n += 2 + random.nextInt(5)) {
            bvz3 = this.method_97ce958d_Dne((opc)bvz2, list, random, 0, n);
            if (bvz3 == null) continue;
            n += Math.max(bvz3.field_3656daa_Dne.method_7a46288d_Dne(), bvz3.field_3656daa_Dne.method_ae128dba_bzF());
            bl = true;
        }
        for (n = random.nextInt(5); n < this.field_2092ae_Dne - 8; n += 2 + random.nextInt(5)) {
            bvz3 = this.method_64f3b44e_FWm((opc)bvz2, list, random, 0, n);
            if (bvz3 == null) continue;
            n += Math.max(bvz3.field_3656daa_Dne.method_7a46288d_Dne(), bvz3.field_3656daa_Dne.method_ae128dba_bzF());
            bl = true;
        }
        if (bl && random.nextInt(3) > 0) {
            switch (this.field_2d29f4_aFZ) {
                case 0: {
                    wBl.method_84b7f48b_FWm((opc)bvz2, list, random, this.field_3656daa_Dne.field_2092ae_Dne - 1, this.field_3656daa_Dne.field_21260d_FWm, this.field_3656daa_Dne.field_388da6_zGp - 2, 1, this.method_7a46288d_Dne());
                    break;
                }
                case 1: {
                    wBl.method_84b7f48b_FWm((opc)bvz2, list, random, this.field_3656daa_Dne.field_2092ae_Dne, this.field_3656daa_Dne.field_21260d_FWm, this.field_3656daa_Dne.field_2e5f1b_bzF - 1, 2, this.method_7a46288d_Dne());
                    break;
                }
                case 2: {
                    wBl.method_84b7f48b_FWm((opc)bvz2, list, random, this.field_3656daa_Dne.field_2092ae_Dne - 1, this.field_3656daa_Dne.field_21260d_FWm, this.field_3656daa_Dne.field_2e5f1b_bzF, 1, this.method_7a46288d_Dne());
                    break;
                }
                case 3: {
                    wBl.method_84b7f48b_FWm((opc)bvz2, list, random, this.field_3656daa_Dne.field_267cf5_Qnq - 2, this.field_3656daa_Dne.field_21260d_FWm, this.field_3656daa_Dne.field_2e5f1b_bzF - 1, 2, this.method_7a46288d_Dne());
                }
            }
        }
        if (bl && random.nextInt(3) > 0) {
            switch (this.field_2d29f4_aFZ) {
                case 0: {
                    wBl.method_84b7f48b_FWm((opc)bvz2, list, random, this.field_3656daa_Dne.field_267cf5_Qnq + 1, this.field_3656daa_Dne.field_21260d_FWm, this.field_3656daa_Dne.field_388da6_zGp - 2, 3, this.method_7a46288d_Dne());
                    break;
                }
                case 1: {
                    wBl.method_84b7f48b_FWm((opc)bvz2, list, random, this.field_3656daa_Dne.field_2092ae_Dne, this.field_3656daa_Dne.field_21260d_FWm, this.field_3656daa_Dne.field_388da6_zGp + 1, 0, this.method_7a46288d_Dne());
                    break;
                }
                case 2: {
                    wBl.method_84b7f48b_FWm((opc)bvz2, list, random, this.field_3656daa_Dne.field_267cf5_Qnq + 1, this.field_3656daa_Dne.field_21260d_FWm, this.field_3656daa_Dne.field_2e5f1b_bzF, 3, this.method_7a46288d_Dne());
                    break;
                }
                case 3: {
                    wBl.method_84b7f48b_FWm((opc)bvz2, list, random, this.field_3656daa_Dne.field_267cf5_Qnq - 2, this.field_3656daa_Dne.field_21260d_FWm, this.field_3656daa_Dne.field_388da6_zGp + 1, 0, this.method_7a46288d_Dne());
                }
            }
        }
    }

    public JZc(opc opc2, int n, Random random, CLK cLK, int n2) {
        super(opc2, n);
        this.field_2d29f4_aFZ = n2;
        this.field_3656daa_Dne = cLK;
        this.field_2092ae_Dne = Math.max(cLK.method_7a46288d_Dne(), cLK.method_ae128dba_bzF());
    }

    public static CLK method_d8458291_Dne(opc opc2, List list, Random random, int n, int n2, int n3, int n4) {
        for (int i = 7 * geR.method_4cd91d9_Dne(random, 3, 5); i >= 7; i -= 7) {
            CLK cLK = CLK.method_286c569_Dne(n, n2, n3, 0, 0, 0, 3, 3, i, n4);
            if (bvz.method_9e83199f_Dne(list, cLK) != null) continue;
            return cLK;
        }
        return null;
    }

    @Override
    public boolean method_f28ef3a4_Dne(Qnq qnq, Random random, CLK cLK) {
        int n = this.method_5c563934_Qnq(zKP.field_7508fdcb_mrb.field_21260d_FWm, 0);
        for (int i = this.field_3656daa_Dne.field_2092ae_Dne; i <= this.field_3656daa_Dne.field_267cf5_Qnq; ++i) {
            for (int j = this.field_3656daa_Dne.field_2e5f1b_bzF; j <= this.field_3656daa_Dne.field_388da6_zGp; ++j) {
                if (!cLK.method_2c2cf7cd_Dne(i, 64, j)) continue;
                int n2 = qnq.method_6f304eb3_aFZ(i, j) - 1;
                qnq.method_17d7ea9d_FWm(i, n2, j, n, 0, 2);
            }
        }
        return true;
    }
}

