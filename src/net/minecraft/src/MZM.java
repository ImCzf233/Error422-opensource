package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class MZM
extends zKP {
    public static final String[] field_f5e54dca_Dne = new String[]{"normal", "mossy"};

    @Override
    public boolean method_fbabf7f3_Dne(Zpi zpi, int n, int n2, int n3) {
        return false;
    }

    @Override
    public bSp method_8c85fe2_Dne(Qnq qnq, int n, int n2, int n3) {
        this.method_fbabf7ef_Dne(qnq, n, n2, n3);
        this.field_2d29ef_aFZ = 1.5;
        return super.method_8c85fe2_Dne(qnq, n, n2, n3);
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        return n2 == 1 ? zKP.field_d744d6c2_yMz.method_77cd08ea_FWm(n) : zKP.field_75c638da_bzF.method_77cd08ea_FWm(n);
    }

    public MZM(int n, zKP zKP2) {
        super(n, zKP2.field_368fd23_Dne);
        this.method_f1c42c0b_bzF(zKP2.field_2092ab_Dne);
        this.method_d92310d9_FWm(zKP2.field_21260a_FWm / 3.0f);
        this.method_2792b805_Dne(zKP2.field_a21c1bc0_kGO);
        this.method_82a88d64_Dne(JcN.field_368f2f7_Dne);
    }

    @Override
    public boolean method_79d378f8_Dne(Zpi zpi, int n, int n2, int n3, int n4) {
        return n4 == 0 ? super.method_79d378f8_Dne(zpi, n, n2, n3, n4) : true;
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
    }

    @Override
    public int method_7a46288d_Dne() {
        return 32;
    }

    public boolean method_8f2f2092_FWm(Zpi zpi, int n, int n2, int n3) {
        int n4 = zpi.method_2c2cf7bc_Dne(n, n2, n3);
        if (n4 != this.field_21260d_FWm && n4 != zKP.field_b2a619d_mzX.field_21260d_FWm) {
            zKP zKP2 = zKP.field_8374b848_Dne[n4];
            return zKP2 != null && zKP2.field_368fd23_Dne.method_7ad38807_DyG() && zKP2.method_7a46289e_Dne() ? zKP2.field_368fd23_Dne != KFd.field_dd686a9b_Fnk : false;
        }
        return true;
    }

    @Override
    public void method_fbabf7ef_Dne(Zpi zpi, int n, int n2, int n3) {
        boolean bl = this.method_8f2f2092_FWm(zpi, n, n2, n3 - 1);
        boolean bl2 = this.method_8f2f2092_FWm(zpi, n, n2, n3 + 1);
        boolean bl3 = this.method_8f2f2092_FWm(zpi, n - 1, n2, n3);
        boolean bl4 = this.method_8f2f2092_FWm(zpi, n + 1, n2, n3);
        float f = 0.25f;
        float f2 = 0.75f;
        float f3 = 0.25f;
        float f4 = 0.75f;
        float f5 = 1.0f;
        if (bl) {
            f3 = 0.0f;
        }
        if (bl2) {
            f4 = 1.0f;
        }
        if (bl3) {
            f = 0.0f;
        }
        if (bl4) {
            f2 = 1.0f;
        }
        if (bl && bl2 && !bl3 && !bl4) {
            f5 = 0.8125f;
            f = 0.3125f;
            f2 = 0.6875f;
        } else if (!bl && !bl2 && bl3 && bl4) {
            f5 = 0.8125f;
            f3 = 0.3125f;
            f4 = 0.6875f;
        }
        this.method_eb14b51a_Dne(f, 0.0f, f3, f2, f5, f4);
    }

    @Override
    public int method_ce7f5d9c_Dne(int n) {
        return n;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    @Override
    public void method_d88f4bf4_Dne(int n, JcN jcN, List list) {
        list.add(new NMq(n, 1, 0));
        list.add(new NMq(n, 1, 1));
    }
}

