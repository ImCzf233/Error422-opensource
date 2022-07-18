package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class dGv {
    private final String field_569fcf45_Dne;
    private final Set field_83b48b6a_Dne = new HashSet(256);
    private final int field_2d29f4_aFZ;
    private final List<wjH> field_f27c122c_Dne = new ArrayList(256);
    private int field_21260d_FWm = 0;
    private dmo field_374ee26_Dne;
    private int field_2092ae_Dne = 0;
    private final int field_267cf5_Qnq;
    private final boolean field_2092bf_Dne;
    private final int field_2e5f1b_bzF;

    public void method_8cd65a02_Dne(WbP wbP) {
        if (this.field_2d29f4_aFZ > 0) {
            wbP.method_ce7f5da9_Dne(this.field_2d29f4_aFZ);
        }
        this.field_83b48b6a_Dne.add(wbP);
    }

    public List method_adea226d_Dne() {
        ArrayList arrayList = new ArrayList();
        for (wjH wjH2 : this.field_f27c122c_Dne) {
            wjH2.method_ea14418b_Dne(arrayList);
        }
        return arrayList;
    }

    private int method_ce7f5d9c_Dne(int n) {
        int n2 = n - 1;
        n2 |= n2 >> 1;
        n2 |= n2 >> 2;
        n2 |= n2 >> 4;
        n2 |= n2 >> 8;
        n2 |= n2 >> 16;
        return n2 + 1;
    }

    public dGv(String string, int n, int n2, boolean bl) {
        this(string, n, n2, bl, 0);
    }

    public dmo method_230e7c85_Dne() {
        if (this.field_2092bf_Dne) {
            this.field_2092ae_Dne = this.method_ce7f5d9c_Dne(this.field_2092ae_Dne);
            this.field_21260d_FWm = this.method_ce7f5d9c_Dne(this.field_21260d_FWm);
        }
        this.field_374ee26_Dne = zpX.method_23188529_Dne().method_9699f58f_Dne(this.field_569fcf45_Dne, 1, this.field_2092ae_Dne, this.field_21260d_FWm, 6408);
        this.field_374ee26_Dne.method_f23809c9_Dne(this.field_374ee26_Dne.method_230ec31e_Dne(), -65536);
        List list = this.method_adea226d_Dne();
        for (int i = 0; i < list.size(); ++i) {
            wjH wjH2 = (wjH)list.get(i);
            WbP wbP = wjH2.method_230866a6_Dne();
            this.field_374ee26_Dne.method_f97e7cb3_Dne(wjH2.method_7a46288d_Dne(), wjH2.method_7c6f602c_FWm(), wbP.method_230e7c85_Dne(), wbP.method_7a46289e_Dne());
        }
        zpX.method_23188529_Dne().method_478d7b17_Dne(this.field_569fcf45_Dne, this.field_374ee26_Dne);
        return this.field_374ee26_Dne;
    }

    public dGv(String string, int n, int n2, boolean bl, int n3) {
        this.field_569fcf45_Dne = string;
        this.field_2e5f1b_bzF = n;
        this.field_267cf5_Qnq = n2;
        this.field_2092bf_Dne = bl;
        this.field_2d29f4_aFZ = n3;
    }

    private boolean method_662a0dc7_FWm(WbP wbP) {
        wjH wjH2;
        boolean bl;
        int n;
        boolean bl2;
        int n2 = Math.min(wbP.method_7c6f602c_FWm(), wbP.method_7a46288d_Dne());
        boolean bl3 = bl2 = this.field_2092ae_Dne == 0 && this.field_21260d_FWm == 0;
        if (this.field_2092bf_Dne) {
            boolean bl4;
            boolean bl5;
            n = this.method_ce7f5d9c_Dne(this.field_2092ae_Dne);
            int n3 = this.method_ce7f5d9c_Dne(this.field_21260d_FWm);
            int n4 = this.method_ce7f5d9c_Dne(this.field_2092ae_Dne + n2);
            int n5 = this.method_ce7f5d9c_Dne(this.field_21260d_FWm + n2);
            boolean bl6 = n4 <= this.field_2e5f1b_bzF;
            boolean bl7 = bl5 = n5 <= this.field_267cf5_Qnq;
            if (!bl6 && !bl5) {
                return false;
            }
            int n6 = Math.max(wbP.method_7c6f602c_FWm(), wbP.method_7a46288d_Dne());
            if (bl2 && !bl6 && this.method_ce7f5d9c_Dne(this.field_21260d_FWm + n6) > this.field_267cf5_Qnq) {
                return false;
            }
            boolean bl8 = n != n4;
            boolean bl9 = bl4 = n3 != n5;
            bl = bl8 ^ bl4 ? bl8 && bl6 : bl6 && n <= n3;
        } else {
            boolean bl10;
            n = this.field_2092ae_Dne + n2 <= this.field_2e5f1b_bzF ? 1 : 0;
            boolean bl11 = bl10 = this.field_21260d_FWm + n2 <= this.field_267cf5_Qnq;
            if (n == 0 && !bl10) {
                return false;
            }
            boolean bl12 = bl = (bl2 || this.field_2092ae_Dne <= this.field_21260d_FWm) && n != 0;
        }
        if (bl) {
            if (wbP.method_7a46288d_Dne() > wbP.method_7c6f602c_FWm()) {
                wbP.method_7a46289a_Dne();
            }
            if (this.field_21260d_FWm == 0) {
                this.field_21260d_FWm = wbP.method_7c6f602c_FWm();
            }
            wjH2 = new wjH(this.field_2092ae_Dne, 0, wbP.method_7a46288d_Dne(), this.field_21260d_FWm);
            this.field_2092ae_Dne += wbP.method_7a46288d_Dne();
        } else {
            wjH2 = new wjH(0, this.field_21260d_FWm, this.field_2092ae_Dne, wbP.method_7c6f602c_FWm());
            this.field_21260d_FWm += wbP.method_7c6f602c_FWm();
        }
        wjH2.method_8cd65a06_Dne(wbP);
        this.field_f27c122c_Dne.add(wjH2);
        return true;
    }

    private boolean method_8cd65a06_Dne(WbP wbP) {
        for (int i = 0; i < this.field_f27c122c_Dne.size(); ++i) {
            if (((wjH)this.field_f27c122c_Dne.get(i)).method_8cd65a06_Dne(wbP)) {
                return true;
            }
            wbP.method_7a46289a_Dne();
            if (((wjH)this.field_f27c122c_Dne.get(i)).method_8cd65a06_Dne(wbP)) {
                return true;
            }
            wbP.method_7a46289a_Dne();
        }
        return this.method_662a0dc7_FWm(wbP);
    }

    public void method_7a46289a_Dne() {
        Object[] objectArray = this.field_83b48b6a_Dne.toArray(new WbP[this.field_83b48b6a_Dne.size()]);
        Arrays.sort(objectArray);
        this.field_374ee26_Dne = null;
        for (int i = 0; i < objectArray.length; ++i) {
            Object object = objectArray[i];
            if (this.method_8cd65a06_Dne((WbP)object)) continue;
            throw new kmB((WbP)object);
        }
    }
}

