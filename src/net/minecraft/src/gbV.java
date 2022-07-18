package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class gbV
extends ljW {
    @Override
    public void method_f9bf07d3_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        boolean bl = qnq.method_6382f365_kGO(n, n2, n3);
        lDs lDs2 = (lDs)qnq.method_d98e681d_Dne(n, n2, n3);
        if (lDs2 != null && lDs2.field_2092bf_Dne != bl) {
            if (bl) {
                lDs2.method_9cb39130_Dne(qnq, n, n2, n3);
            }
            lDs2.field_2092bf_Dne = bl;
        }
    }

    public gbV(int n) {
        super(n, KFd.field_5e526bea_Qnq);
        this.method_82a88d64_Dne(JcN.field_75b0c0e4_bzF);
    }

    @Override
    public boolean method_cb53d52e_Dne(Qnq qnq, int n, int n2, int n3, FiG fiG, int n4, float f, float f2, float f3) {
        if (qnq.field_2d2a05_aFZ) {
            return true;
        }
        lDs lDs2 = (lDs)qnq.method_d98e681d_Dne(n, n2, n3);
        if (lDs2 != null) {
            lDs2.method_7c6f6039_FWm();
            lDs2.method_9cb39130_Dne(qnq, n, n2, n3);
        }
        return true;
    }

    @Override
    public void method_41dd09cd_Dne(Qnq qnq, int n, int n2, int n3, FiG fiG) {
        lDs lDs2;
        if (!qnq.field_2d2a05_aFZ && (lDs2 = (lDs)qnq.method_d98e681d_Dne(n, n2, n3)) != null) {
            lDs2.method_9cb39130_Dne(qnq, n, n2, n3);
        }
    }

    @Override
    public ipD method_c35d5be7_Dne(Qnq qnq) {
        return new lDs();
    }

    @Override
    public boolean method_3e226594_Dne(Qnq qnq, int n, int n2, int n3, int n4, int n5) {
        float f = (float)Math.pow(2.0, (double)(n5 - 12) / 12.0);
        String string = "harp";
        if (n4 == 1) {
            string = "bd";
        }
        if (n4 == 2) {
            string = "snare";
        }
        if (n4 == 3) {
            string = "hat";
        }
        if (n4 == 4) {
            string = "bassattack";
        }
        qnq.method_c961c6ee_Dne((double)n + 0.5, (double)n2 + 0.5, (double)n3 + 0.5, "note." + string, 3.0f, f);
        qnq.method_8600ec24_Dne("note", (double)n + 0.5, (double)n2 + 1.2, (double)n3 + 0.5, (double)n5 / 24.0, 0.0, 0.0);
        return true;
    }
}

