package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class dnY
extends bvz {
    private List<CLK> field_f27c122c_Dne = new LinkedList();

    public dnY(int n, Random random, int n2, int n3) {
        super(n);
        this.field_3656daa_Dne = new CLK(n2, 50, n3, n2 + 7 + random.nextInt(6), 54 + random.nextInt(6), n3 + 7 + random.nextInt(6));
    }

    @Override
    public boolean method_f28ef3a4_Dne(Qnq qnq, Random random, CLK cLK) {
        if (this.method_d2c2fe50_Dne(qnq, cLK)) {
            return false;
        }
        this.method_3d7d4888_Dne(qnq, cLK, this.field_3656daa_Dne.field_2092ae_Dne, this.field_3656daa_Dne.field_21260d_FWm, this.field_3656daa_Dne.field_2e5f1b_bzF, this.field_3656daa_Dne.field_267cf5_Qnq, this.field_3656daa_Dne.field_21260d_FWm, this.field_3656daa_Dne.field_388da6_zGp, zKP.field_203836cc_FWm.field_21260d_FWm, 0, true);
        this.method_3d7d4888_Dne(qnq, cLK, this.field_3656daa_Dne.field_2092ae_Dne, this.field_3656daa_Dne.field_21260d_FWm + 1, this.field_3656daa_Dne.field_2e5f1b_bzF, this.field_3656daa_Dne.field_267cf5_Qnq, Math.min(this.field_3656daa_Dne.field_21260d_FWm + 3, this.field_3656daa_Dne.field_2d29f4_aFZ), this.field_3656daa_Dne.field_388da6_zGp, 0, 0, false);
        for (CLK cLK2 : this.field_f27c122c_Dne) {
            this.method_3d7d4888_Dne(qnq, cLK, cLK2.field_2092ae_Dne, cLK2.field_2d29f4_aFZ - 2, cLK2.field_2e5f1b_bzF, cLK2.field_267cf5_Qnq, cLK2.field_2d29f4_aFZ, cLK2.field_388da6_zGp, 0, 0, false);
        }
        this.method_1280239d_Dne(qnq, cLK, this.field_3656daa_Dne.field_2092ae_Dne, this.field_3656daa_Dne.field_21260d_FWm + 4, this.field_3656daa_Dne.field_2e5f1b_bzF, this.field_3656daa_Dne.field_267cf5_Qnq, this.field_3656daa_Dne.field_2d29f4_aFZ, this.field_3656daa_Dne.field_388da6_zGp, 0, false);
        return true;
    }

    @Override
    public void method_dbe42dde_Dne(bvz bvz2, List list, Random random) {
        CLK cLK;
        bvz bvz3;
        int n;
        int n2 = this.method_7a46288d_Dne();
        int n3 = this.field_3656daa_Dne.method_7c6f602c_FWm() - 3 - 1;
        if (n3 <= 0) {
            n3 = 1;
        }
        for (n = 0; n < this.field_3656daa_Dne.method_7a46288d_Dne() && (n += random.nextInt(this.field_3656daa_Dne.method_7a46288d_Dne())) + 3 <= this.field_3656daa_Dne.method_7a46288d_Dne(); n += 4) {
            bvz3 = FUM.method_80be7ff0_Dne(bvz2, list, random, this.field_3656daa_Dne.field_2092ae_Dne + n, this.field_3656daa_Dne.field_21260d_FWm + random.nextInt(n3) + 1, this.field_3656daa_Dne.field_2e5f1b_bzF - 1, 2, n2);
            if (bvz3 == null) continue;
            cLK = bvz3.method_22fefc09_Dne();
            this.field_f27c122c_Dne.add(new CLK(cLK.field_2092ae_Dne, cLK.field_21260d_FWm, this.field_3656daa_Dne.field_2e5f1b_bzF, cLK.field_267cf5_Qnq, cLK.field_2d29f4_aFZ, this.field_3656daa_Dne.field_2e5f1b_bzF + 1));
        }
        for (n = 0; n < this.field_3656daa_Dne.method_7a46288d_Dne() && (n += random.nextInt(this.field_3656daa_Dne.method_7a46288d_Dne())) + 3 <= this.field_3656daa_Dne.method_7a46288d_Dne(); n += 4) {
            bvz3 = FUM.method_80be7ff0_Dne(bvz2, list, random, this.field_3656daa_Dne.field_2092ae_Dne + n, this.field_3656daa_Dne.field_21260d_FWm + random.nextInt(n3) + 1, this.field_3656daa_Dne.field_388da6_zGp + 1, 0, n2);
            if (bvz3 == null) continue;
            cLK = bvz3.method_22fefc09_Dne();
            this.field_f27c122c_Dne.add(new CLK(cLK.field_2092ae_Dne, cLK.field_21260d_FWm, this.field_3656daa_Dne.field_388da6_zGp - 1, cLK.field_267cf5_Qnq, cLK.field_2d29f4_aFZ, this.field_3656daa_Dne.field_388da6_zGp));
        }
        for (n = 0; n < this.field_3656daa_Dne.method_ae128dba_bzF() && (n += random.nextInt(this.field_3656daa_Dne.method_ae128dba_bzF())) + 3 <= this.field_3656daa_Dne.method_ae128dba_bzF(); n += 4) {
            bvz3 = FUM.method_80be7ff0_Dne(bvz2, list, random, this.field_3656daa_Dne.field_2092ae_Dne - 1, this.field_3656daa_Dne.field_21260d_FWm + random.nextInt(n3) + 1, this.field_3656daa_Dne.field_2e5f1b_bzF + n, 1, n2);
            if (bvz3 == null) continue;
            cLK = bvz3.method_22fefc09_Dne();
            this.field_f27c122c_Dne.add(new CLK(this.field_3656daa_Dne.field_2092ae_Dne, cLK.field_21260d_FWm, cLK.field_2e5f1b_bzF, this.field_3656daa_Dne.field_2092ae_Dne + 1, cLK.field_2d29f4_aFZ, cLK.field_388da6_zGp));
        }
        for (n = 0; n < this.field_3656daa_Dne.method_ae128dba_bzF() && (n += random.nextInt(this.field_3656daa_Dne.method_ae128dba_bzF())) + 3 <= this.field_3656daa_Dne.method_ae128dba_bzF(); n += 4) {
            bvz3 = FUM.method_80be7ff0_Dne(bvz2, list, random, this.field_3656daa_Dne.field_267cf5_Qnq + 1, this.field_3656daa_Dne.field_21260d_FWm + random.nextInt(n3) + 1, this.field_3656daa_Dne.field_2e5f1b_bzF + n, 3, n2);
            if (bvz3 == null) continue;
            cLK = bvz3.method_22fefc09_Dne();
            this.field_f27c122c_Dne.add(new CLK(this.field_3656daa_Dne.field_267cf5_Qnq - 1, cLK.field_21260d_FWm, cLK.field_2e5f1b_bzF, this.field_3656daa_Dne.field_267cf5_Qnq, cLK.field_2d29f4_aFZ, cLK.field_388da6_zGp));
        }
    }
}

