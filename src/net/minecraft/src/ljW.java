package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public abstract class ljW
extends zKP
implements sCQ {
    @Override
    public void method_9cb39130_Dne(Qnq qnq, int n, int n2, int n3) {
        super.method_9cb39130_Dne(qnq, n, n2, n3);
    }

    @Override
    public void method_3e226590_Dne(Qnq qnq, int n, int n2, int n3, int n4, int n5) {
        super.method_3e226590_Dne(qnq, n, n2, n3, n4, n5);
        qnq.method_2dee77c_bzF(n, n2, n3);
    }

    @Override
    public boolean method_3e226594_Dne(Qnq qnq, int n, int n2, int n3, int n4, int n5) {
        super.method_3e226594_Dne(qnq, n, n2, n3, n4, n5);
        ipD ipD2 = qnq.method_d98e681d_Dne(n, n2, n3);
        return ipD2 != null ? ipD2.method_16cca7e_Dne(n4, n5) : false;
    }

    protected ljW(int n, KFd kFd) {
        super(n, kFd);
        this.field_2d2a05_aFZ = true;
    }
}

