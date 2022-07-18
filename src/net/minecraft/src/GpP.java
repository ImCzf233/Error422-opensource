package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class GpP
extends dEr {
    private final Class field_ce3f4d68_Dne;

    public GpP(int n, Class clazz) {
        super(n);
        this.field_ce3f4d68_Dne = clazz;
        this.method_829e7ad2_Dne(JcN.field_2022bed6_FWm);
    }

    @Override
    public boolean method_4ddc487f_Dne(NMq nMq, FiG fiG, Qnq qnq, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        if (n4 == 0) {
            return false;
        }
        if (n4 == 1) {
            return false;
        }
        int n5 = zxJ.field_4a92422_Qnq[n4];
        RsG rsG = this.method_701afa3e_Dne(qnq, n, n2, n3, n5);
        if (!fiG.method_7bcedb59_Dne(n, n2, n3, n4, nMq)) {
            return false;
        }
        if (rsG != null && rsG.method_907a9d25_Qnq()) {
            if (!qnq.field_2d2a05_aFZ) {
                qnq.method_94d18be5_FWm(rsG);
            }
            --nMq.field_2092ae_Dne;
        }
        return true;
    }

    private RsG method_701afa3e_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        return this.field_ce3f4d68_Dne == JCd.class ? new JCd(qnq, n, n2, n3, n4) : (this.field_ce3f4d68_Dne == BPY.class ? new BPY(qnq, n, n2, n3, n4) : null);
    }
}

