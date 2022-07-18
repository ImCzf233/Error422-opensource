package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

class eiw
extends xYY {
    final ZyA field_37089ea_Dne;

    @Override
    protected void method_c619c53f_Dne(int n, int n2, WAR wAR) {
        super.method_c619c53f_Dne(n, n2, wAR);
        if (this.field_2092ae_Dne == 0) {
            ZyA.method_750c5d25_Dne(this.field_37089ea_Dne, n + 115 - 18 + 1, n2 + 1 + 1, 18, 18);
        } else {
            ZyA.method_750c5d25_Dne(this.field_37089ea_Dne, n + 115 - 18, n2 + 1, 18, 18);
        }
        if (this.field_2092ae_Dne == 1) {
            ZyA.method_750c5d25_Dne(this.field_37089ea_Dne, n + 165 - 18 + 1, n2 + 1 + 1, 36, 18);
        } else {
            ZyA.method_750c5d25_Dne(this.field_37089ea_Dne, n + 165 - 18, n2 + 1, 36, 18);
        }
        if (this.field_2092ae_Dne == 2) {
            ZyA.method_750c5d25_Dne(this.field_37089ea_Dne, n + 215 - 18 + 1, n2 + 1 + 1, 54, 18);
        } else {
            ZyA.method_750c5d25_Dne(this.field_37089ea_Dne, n + 215 - 18, n2 + 1, 54, 18);
        }
    }

    @Override
    protected String method_2c0e7e17_Dne(int n) {
        return n == 0 ? "stat.crafted" : (n == 1 ? "stat.used" : "stat.mined");
    }

    public eiw(ZyA zyA) {
        super(zyA);
        this.field_37089ea_Dne = zyA;
        this.field_f27c122c_Dne = new ArrayList();
        for (isy isy2 : trP.field_2c197105_Qnq) {
            boolean bl = false;
            int n = isy2.method_7a46288d_Dne();
            if (ZyA.method_3e9ab6eb_Dne(zyA).method_831230f1_Dne(isy2) > 0) {
                bl = true;
            } else if (trP.field_5a147b51_bzF[n] != null && ZyA.method_3e9ab6eb_Dne(zyA).method_831230f1_Dne(trP.field_5a147b51_bzF[n]) > 0) {
                bl = true;
            } else if (trP.field_fde23b9f_FWm[n] != null && ZyA.method_3e9ab6eb_Dne(zyA).method_831230f1_Dne(trP.field_fde23b9f_FWm[n]) > 0) {
                bl = true;
            }
            if (!bl) continue;
            this.field_f27c122c_Dne.add(isy2);
        }
        this.field_740a65b4_Dne = new jQl(this, zyA);
    }

    @Override
    protected void method_8a73475f_Dne(int n, int n2, int n3, int n4, WAR wAR) {
        isy isy2 = this.method_9e7aefab_Dne(n);
        int n5 = isy2.method_7a46288d_Dne();
        ZyA.method_5e9d499e_Dne(this.field_37089ea_Dne, n2 + 40, n3, n5);
        this.method_31b5f37c_Dne((isy)trP.field_fde23b9f_FWm[n5], n2 + 115, n3, n % 2 == 0);
        this.method_31b5f37c_Dne((isy)trP.field_5a147b51_bzF[n5], n2 + 165, n3, n % 2 == 0);
        this.method_31b5f37c_Dne(isy2, n2 + 215, n3, n % 2 == 0);
    }
}

