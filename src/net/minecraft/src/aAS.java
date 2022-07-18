package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class aAS
extends dEr {
    @Override
    public boolean method_4ddc487f_Dne(NMq nMq, FiG fiG, Qnq qnq, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        if (n4 == 0) {
            --n2;
        }
        if (n4 == 1) {
            ++n2;
        }
        if (n4 == 2) {
            --n3;
        }
        if (n4 == 3) {
            ++n3;
        }
        if (n4 == 4) {
            --n;
        }
        if (n4 == 5) {
            ++n;
        }
        if (!fiG.method_7bcedb59_Dne(n, n2, n3, n4, nMq)) {
            return false;
        }
        int n5 = qnq.method_2c2cf7bc_Dne(n, n2, n3);
        if (n5 == 0) {
            qnq.method_c961c6ee_Dne((double)n + 0.5, (double)n2 + 0.5, (double)n3 + 0.5, "fire.ignite", 1.0f, field_7331eae7_Dne.nextFloat() * 0.4f + 0.8f);
            qnq.method_2ee8c47d_FWm(n, n2, n3, zKP.field_3774324_Dne.field_21260d_FWm);
        }
        nMq.method_60f1bf3f_Dne(1, fiG);
        return true;
    }

    public aAS(int n) {
        super(n);
        this.field_2d29f4_aFZ = 1;
        this.method_77cbb00a_FWm(64);
        this.method_829e7ad2_Dne(JcN.field_1411c921_div);
    }
}

