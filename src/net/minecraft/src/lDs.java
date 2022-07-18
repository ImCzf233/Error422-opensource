package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class lDs
extends ipD {
    public byte field_2092a7_Dne = 0;
    public boolean field_2092bf_Dne = false;

    public void method_9cb39130_Dne(Qnq qnq, int n, int n2, int n3) {
        if (qnq.method_d9802b31_Dne(n, n2 + 1, n3) == KFd.field_368fd23_Dne) {
            KFd kFd = qnq.method_d9802b31_Dne(n, n2 - 1, n3);
            int n4 = 0;
            if (kFd == KFd.field_712c8169_aFZ) {
                n4 = 1;
            }
            if (kFd == KFd.field_328318c9_trS) {
                n4 = 2;
            }
            if (kFd == KFd.field_35c85e0c_ATE) {
                n4 = 3;
            }
            if (kFd == KFd.field_5e526bea_Qnq) {
                n4 = 4;
            }
            qnq.method_9e2bd981_Qnq(n, n2, n3, zKP.field_758a85da_EyB.field_21260d_FWm, n4, this.field_2092a7_Dne);
        }
    }

    public void method_7c6f6039_FWm() {
        this.field_2092a7_Dne = (byte)((this.field_2092a7_Dne + 1) % 25);
        this.method_582b297_a_();
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        super.method_8d4fb917_Dne(wkD);
        this.field_2092a7_Dne = wkD.method_8f501fd0_Dne("note");
        if (this.field_2092a7_Dne < 0) {
            this.field_2092a7_Dne = 0;
        }
        if (this.field_2092a7_Dne > 24) {
            this.field_2092a7_Dne = (byte)24;
        }
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        super.method_66a36cd8_FWm(wkD);
        wkD.method_5ab43558_Dne("note", this.field_2092a7_Dne);
    }
}

