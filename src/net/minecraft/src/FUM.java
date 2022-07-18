package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class FUM {
    private static final fKu[] field_836ba557_Dne = new fKu[]{new fKu(dEr.field_5c4c1af_IjH.field_267cf5_Qnq, 0, 1, 5, 10), new fKu(dEr.field_74feeb39_mrb.field_267cf5_Qnq, 0, 1, 3, 5), new fKu(dEr.field_59c23676_exS.field_267cf5_Qnq, 0, 4, 9, 5), new fKu(dEr.field_5d50330c_edi.field_267cf5_Qnq, 4, 4, 9, 5), new fKu(dEr.field_141d2e85_div.field_267cf5_Qnq, 0, 1, 2, 3), new fKu(dEr.field_16278184_DyG.field_267cf5_Qnq, 0, 3, 8, 10), new fKu(dEr.field_7785c591_rPc.field_267cf5_Qnq, 0, 1, 3, 15), new fKu(dEr.field_202e243a_FWm.field_267cf5_Qnq, 0, 1, 1, 1), new fKu(zKP.field_69989981_FYZ.field_21260d_FWm, 0, 4, 8, 1), new fKu(dEr.field_4793365a_MUD.field_267cf5_Qnq, 0, 2, 4, 10), new fKu(dEr.field_633b7ca6_LDH.field_267cf5_Qnq, 0, 2, 4, 10)};

    private static bvz method_584ff837_Dne(List list, Random random, int n, int n2, int n3, int n4, int n5) {
        int n6 = random.nextInt(100);
        if (n6 >= 80) {
            CLK cLK = dYY.method_b560cbe6_Dne(list, random, n, n2, n3, n4);
            if (cLK != null) {
                return new dYY(n5, random, cLK, n4);
            }
        } else if (n6 >= 70) {
            CLK cLK = jXR.method_b560cbe6_Dne(list, random, n, n2, n3, n4);
            if (cLK != null) {
                return new jXR(n5, random, cLK, n4);
            }
        } else {
            CLK cLK = ZeN.method_b560cbe6_Dne(list, random, n, n2, n3, n4);
            if (cLK != null) {
                return new ZeN(n5, random, cLK, n4);
            }
        }
        return null;
    }

    static fKu[] method_5703e2d8_Dne() {
        return field_836ba557_Dne;
    }

    static bvz method_80be7ff0_Dne(bvz bvz2, List list, Random random, int n, int n2, int n3, int n4, int n5) {
        return FUM.method_73745d8f_FWm(bvz2, list, random, n, n2, n3, n4, n5);
    }

    private static bvz method_73745d8f_FWm(bvz bvz2, List list, Random random, int n, int n2, int n3, int n4, int n5) {
        if (n5 > 8) {
            return null;
        }
        if (Math.abs(n - bvz2.method_22fefc09_Dne().field_2092ae_Dne) <= 80 && Math.abs(n3 - bvz2.method_22fefc09_Dne().field_2e5f1b_bzF) <= 80) {
            bvz bvz3 = FUM.method_584ff837_Dne(list, random, n, n2, n3, n4, n5 + 1);
            if (bvz3 != null) {
                list.add(bvz3);
                bvz3.method_dbe42dde_Dne(bvz2, list, random);
            }
            return bvz3;
        }
        return null;
    }
}

