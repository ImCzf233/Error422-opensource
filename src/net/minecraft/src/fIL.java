package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class fIL
extends ajI {
    private UVr field_36dc69b_Dne;

    @Override
    protected int method_143f9e0f_bzF(int n) {
        return n > 0 ? 1 : 0;
    }

    @Override
    protected int method_52f8ce20_a_(Qnq qnq, int n, int n2, int n3) {
        List list = null;
        if (this.field_36dc69b_Dne == UVr.field_36dc69b_Dne) {
            list = qnq.method_71df22e6_FWm(null, this.method_d98ad1fb_Dne(n, n2, n3));
        }
        if (this.field_36dc69b_Dne == UVr.field_2027927a_FWm) {
            list = qnq.method_9314b7e8_Dne(FUH.class, this.method_d98ad1fb_Dne(n, n2, n3));
        }
        if (this.field_36dc69b_Dne == UVr.field_75b59488_bzF) {
            list = qnq.method_9314b7e8_Dne(FiG.class, this.method_d98ad1fb_Dne(n, n2, n3));
        }
        if (!list.isEmpty()) {
            for (Object obj : list) {
            	sMa sMa2 = (sMa) obj;
                if (sMa2.method_7d36ef26_FfS()) continue;
                return 15;
            }
        }
        return 0;
    }

    protected fIL(int n, String string, KFd kFd, UVr uVr) {
        super(n, string, kFd);
        this.field_36dc69b_Dne = uVr;
    }

    @Override
    protected int method_aad4133f_a_(int n) {
        return n == 1 ? 15 : 0;
    }
}

