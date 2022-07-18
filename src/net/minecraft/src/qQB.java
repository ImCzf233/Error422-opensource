package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class qQB
extends ZgW {
    private gDn[] field_836bfe96_Dne;
    public int field_2092ae_Dne = 0;
    private static final String[] field_1e416769_FWm;
    public static final String[] field_f5e54dca_Dne;

    @Override
    protected void method_6b138667_Dne(CiF ciF) {
        ciF.method_117d59bb_FWm(true);
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    @Override
    public void method_c216a76_a_(Qnq qnq, int n, int n2, int n3, int n4) {
        qnq.method_57aed1c2_Qnq(1022, n, n2, n3, 0);
    }

    static {
        field_f5e54dca_Dne = new String[]{"intact", "slightlyDamaged", "veryDamaged"};
        field_1e416769_FWm = new String[]{"anvil_top", "anvil_top_damaged_1", "anvil_top_damaged_2"};
    }

    @Override
    public void method_d88f4bf4_Dne(int n, JcN jcN, List list) {
        list.add(new NMq(n, 1, 0));
        list.add(new NMq(n, 1, 1));
        list.add(new NMq(n, 1, 2));
    }

    @Override
    public boolean method_cb53d52e_Dne(Qnq qnq, int n, int n2, int n3, FiG fiG, int n4, float f, float f2, float f3) {
        if (qnq.field_2d2a05_aFZ) {
            return true;
        }
        fiG.method_a6aca7ca_FWm(n, n2, n3);
        return true;
    }

    @Override
    public void method_ca7e4e57_Dne(Qnq qnq, int n, int n2, int n3, FUH fUH, NMq nMq) {
        int n4 = geR.method_117d0718_FWm((double)(fUH.field_334489_mrb * 4.0f / 360.0f) + 0.5) & 3;
        int n5 = qnq.method_2dee76f_bzF(n, n2, n3) >> 2;
        ++n4;
        if ((n4 %= 4) == 0) {
            qnq.method_d4dc89ed_Dne(n, n2, n3, 2 | n5 << 2, 2);
        }
        if (n4 == 1) {
            qnq.method_d4dc89ed_Dne(n, n2, n3, 3 | n5 << 2, 2);
        }
        if (n4 == 2) {
            qnq.method_d4dc89ed_Dne(n, n2, n3, 0 | n5 << 2, 2);
        }
        if (n4 == 3) {
            qnq.method_d4dc89ed_Dne(n, n2, n3, 1 | n5 << 2, 2);
        }
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_5e5f2002_Qnq = rbp.method_285881e4_Dne("anvil_base");
        this.field_836bfe96_Dne = new gDn[field_1e416769_FWm.length];
        for (int i = 0; i < this.field_836bfe96_Dne.length; ++i) {
            this.field_836bfe96_Dne[i] = rbp.method_285881e4_Dne(field_1e416769_FWm[i]);
        }
    }

    @Override
    public int method_7a46288d_Dne() {
        return 35;
    }

    @Override
    public void method_fbabf7ef_Dne(Zpi zpi, int n, int n2, int n3) {
        int n4 = zpi.method_2dee76f_bzF(n, n2, n3) & 3;
        if (n4 != 3 && n4 != 1) {
            this.method_eb14b51a_Dne(0.125f, 0.0f, 0.0f, 0.875f, 1.0f, 1.0f);
        } else {
            this.method_eb14b51a_Dne(0.0f, 0.0f, 0.125f, 1.0f, 1.0f, 0.875f);
        }
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        if (this.field_2092ae_Dne == 3 && n == 1) {
            int n3 = (n2 >> 2) % this.field_836bfe96_Dne.length;
            return this.field_836bfe96_Dne[n3];
        }
        return this.field_5e5f2002_Qnq;
    }

    @Override
    public boolean method_79d378f8_Dne(Zpi zpi, int n, int n2, int n3, int n4) {
        return true;
    }

    protected qQB(int n) {
        super(n, KFd.field_161c264c_DyG);
        this.method_9e820edb_Dne(0);
        this.method_82a88d64_Dne(JcN.field_2022bed6_FWm);
    }

    @Override
    public int method_ce7f5d9c_Dne(int n) {
        return n >> 2;
    }
}

