package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
class nSp
extends BJs {
    final JFs field_3688a95_Dne;

    @Override
    protected void method_16d0a4b_Dne(int n, boolean bl) {
        if (n < JFs.method_ba6e2e41_Dne((JFs)this.field_3688a95_Dne).field_f27c122c_Dne.size()) {
            JFs.method_818ca085_FWm(this.field_3688a95_Dne, n);
        }
    }

    @Override
    protected int method_7c6f602c_FWm() {
        return this.method_7a46288d_Dne() * 12;
    }

    @Override
    protected void method_8a73475f_Dne(int n, int n2, int n3, int n4, WAR wAR) {
        if (n < JFs.method_ba6e2e41_Dne((JFs)this.field_3688a95_Dne).field_f27c122c_Dne.size()) {
            this.method_675532a0_FWm(n, n2, n3, n4, wAR);
        }
    }

    @Override
    protected void method_7a46289a_Dne() {
    }

    public nSp(JFs jFs) {
        super(JFs.method_61be238_Dne(jFs), JFs.method_752cb0c3_Dne(jFs), JFs.method_3069dc26_Dne(jFs, 2), JFs.method_4e806484_FWm(jFs), JFs.method_3069dc26_Dne(jFs, 9) - JFs.method_3069dc26_Dne(jFs, 2), 12);
        this.field_3688a95_Dne = jFs;
    }

    private void method_675532a0_FWm(int n, int n2, int n3, int n4, WAR wAR) {
        String string = (String)JFs.method_ba6e2e41_Dne((JFs)this.field_3688a95_Dne).field_f27c122c_Dne.get(n);
        this.field_3688a95_Dne.method_67d6d54c_FWm(JFs.method_ba6e2206_Dne(this.field_3688a95_Dne), string, n2 + 2, n3 + 1, 0xFFFFFF);
    }

    @Override
    protected int method_7a46288d_Dne() {
        return JFs.method_ba6e2e41_Dne((JFs)this.field_3688a95_Dne).field_f27c122c_Dne.size() + 1;
    }

    @Override
    protected boolean method_ce7f5dad_Dne(int n) {
        return n == JFs.method_67217fb6_bzF(this.field_3688a95_Dne);
    }
}

