package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;
import java.util.List;

public class OHz {
    private final SFA field_36c9bde_Dne;
    private final String field_569fcf45_Dne;
    private int field_2092ae_Dne;
    private final vfE field_37cfd77_Dne;
    public static final Comparator field_740a65b4_Dne = new mdF();

    public void method_7a46289a_Dne() {
        if (this.field_37cfd77_Dne.method_2304bed6_Dne().method_7a46289e_Dne()) {
            throw new IllegalStateException("Cannot modify read-only score");
        }
        this.method_ce7f5da9_Dne(1);
    }

    public OHz(SFA sFA, vfE vfE2, String string) {
        this.field_36c9bde_Dne = sFA;
        this.field_37cfd77_Dne = vfE2;
        this.field_569fcf45_Dne = string;
    }

    public vfE method_23168bd6_Dne() {
        return this.field_37cfd77_Dne;
    }

    public void method_ea14418b_Dne(List list) {
        this.method_143f9e1c_bzF(this.field_37cfd77_Dne.method_2304bed6_Dne().method_ea14417e_Dne(list));
    }

    public int method_7a46288d_Dne() {
        return this.field_2092ae_Dne;
    }

    public void method_ce7f5da9_Dne(int n) {
        if (this.field_37cfd77_Dne.method_2304bed6_Dne().method_7a46289e_Dne()) {
            throw new IllegalStateException("Cannot modify read-only score");
        }
        this.method_143f9e1c_bzF(this.method_7a46288d_Dne() + n);
    }

    public String method_eecad346_Dne() {
        return this.field_569fcf45_Dne;
    }

    public SFA method_23062a3d_Dne() {
        return this.field_36c9bde_Dne;
    }

    public void method_117d19ea_FWm(int n) {
        if (this.field_37cfd77_Dne.method_2304bed6_Dne().method_7a46289e_Dne()) {
            throw new IllegalStateException("Cannot modify read-only score");
        }
        this.method_143f9e1c_bzF(this.method_7a46288d_Dne() - n);
    }

    public void method_143f9e1c_bzF(int n) {
        int n2 = this.field_2092ae_Dne;
        this.field_2092ae_Dne = n;
        if (n2 != n) {
            this.method_23062a3d_Dne().method_7dd44986_Dne(this);
        }
    }
}

