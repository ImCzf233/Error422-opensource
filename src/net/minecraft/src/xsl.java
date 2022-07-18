package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class xsl
extends dEr {
    public int field_2092ae_Dne;
    private static final ClS field_365e6c2_Dne = new EjW();

    @Override
    public boolean method_4ddc487f_Dne(NMq nMq, FiG fiG, Qnq qnq, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        int n5 = qnq.method_2c2cf7bc_Dne(n, n2, n3);
        if (Oaf.method_ce7f5dad_Dne(n5)) {
            if (!qnq.field_2d2a05_aFZ) {
                Ebp ebp = Ebp.method_bde99596_Dne(qnq, (float)n + 0.5f, (float)n2 + 0.5f, (float)n3 + 0.5f, this.field_2092ae_Dne);
                if (nMq.method_d44b4596_zGp()) {
                    ebp.method_8f501fe4_Dne(nMq.method_d1f1ed87_FWm());
                }
                qnq.method_94d18be5_FWm(ebp);
            }
            --nMq.field_2092ae_Dne;
            return true;
        }
        return false;
    }

    public xsl(int n, int n2) {
        super(n);
        this.field_2d29f4_aFZ = 1;
        this.field_2092ae_Dne = n2;
        this.method_829e7ad2_Dne(JcN.field_5e5261be_Qnq);
        CVd.field_37ddf2f_Dne.method_eabd8452_Dne(this, field_365e6c2_Dne);
    }
}

