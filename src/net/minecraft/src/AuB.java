package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class AuB
extends ajI {
    private final int field_2092ae_Dne;

    @Override
    protected int method_143f9e0f_bzF(int n) {
        return n;
    }

    @Override
    protected int method_52f8ce20_a_(Qnq qnq, int n, int n2, int n3) {
        int n4 = 0;
        for (JiM jiM : qnq.method_9314b7e8_Dne(JiM.class, this.method_d98ad1fb_Dne(n, n2, n3))) {
            if ((n4 += jiM.method_23040479_Dne().field_2092ae_Dne) < this.field_2092ae_Dne) continue;
            break;
        }
        if (n4 <= 0) {
            return 0;
        }
        float f = (float)Math.min(this.field_2092ae_Dne, n4) / (float)this.field_2092ae_Dne;
        return geR.method_117d0e9a_FWm(f * 15.0f);
    }

    protected AuB(int n, String string, KFd kFd, int n2) {
        super(n, string, kFd);
        this.field_2092ae_Dne = n2;
    }

    @Override
    public int method_83516086_Dne(Qnq qnq) {
        return 10;
    }

    @Override
    protected int method_aad4133f_a_(int n) {
        return n;
    }
}

