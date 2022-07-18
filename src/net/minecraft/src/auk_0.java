package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Auk
 */
public class auk_0
extends RLC {
    private final String field_d9a85c6_FWm;
    public final int field_21260d_FWm;
    public final auk_0 field_36522b5_Dne;
    private boolean field_21261e_FWm;
    public final int field_2092ae_Dne;
    public final NMq field_36a761a_Dne;
    private WGf field_36e7596_Dne;

    public auk_0 method_22feb114_Dne() {
        this.field_2092bf_Dne = true;
        return this;
    }

    public auk_0 method_6fea148b_Dne(WGf wGf) {
        this.field_36e7596_Dne = wGf;
        return this;
    }

    public auk_0 method_228ab7c1_bzF() {
        super.method_2305cca2_Dne();
        qlg.field_f27c122c_Dne.add(this);
        return this;
    }

    public String method_eecad346_Dne() {
        return this.field_36e7596_Dne != null ? this.field_36e7596_Dne.method_39193c_Dne(KGL.method_39193c_Dne(this.field_d9a85c6_FWm)) : KGL.method_39193c_Dne(this.field_d9a85c6_FWm);
    }

    public auk_0(int n, String string, int n2, int n3, zKP zKP2, auk_0 auk_02) {
        this(n, string, n2, n3, new NMq(zKP2), auk_02);
    }

    public boolean method_7c6f603d_FWm() {
        return this.field_21261e_FWm;
    }

    public auk_0(int n, String string, int n2, int n3, dEr dEr2, auk_0 auk_02) {
        this(n, string, n2, n3, new NMq(dEr2), auk_02);
    }

    @Override
    public RLC method_f87c1cc1_FWm() {
        return this.method_22feb114_Dne();
    }

    public auk_0 method_f8750133_FWm() {
        this.field_21261e_FWm = true;
        return this;
    }

    public auk_0(int n, String string, int n2, int n3, NMq nMq, auk_0 auk_02) {
        super(0x500000 + n, "achievement." + string);
        this.field_36a761a_Dne = nMq;
        this.field_d9a85c6_FWm = "achievement." + string + ".desc";
        this.field_2092ae_Dne = n2;
        this.field_21260d_FWm = n3;
        if (n2 < qlg.field_2092ae_Dne) {
            qlg.field_2092ae_Dne = n2;
        }
        if (n3 < qlg.field_21260d_FWm) {
            qlg.field_21260d_FWm = n3;
        }
        if (n2 > qlg.field_2e5f1b_bzF) {
            qlg.field_2e5f1b_bzF = n2;
        }
        if (n3 > qlg.field_267cf5_Qnq) {
            qlg.field_267cf5_Qnq = n3;
        }
        this.field_36522b5_Dne = auk_02;
    }

    @Override
    public RLC method_2305cca2_Dne() {
        return this.method_228ab7c1_bzF();
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return true;
    }
}

