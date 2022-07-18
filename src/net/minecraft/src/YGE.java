package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class YGE {
    private String field_d9a85c6_FWm;
    private String field_9e60dbde_Qnq = "";
    private boolean field_2092bf_Dne = true;
    private final String field_569fcf45_Dne;
    private String field_c480ca78_bzF = "";
    private final SFA field_36c9bde_Dne;
    private final Set field_83b48b6a_Dne = new HashSet();
    private boolean field_21261e_FWm = true;

    public String method_eecad346_Dne() {
        return this.field_569fcf45_Dne;
    }

    public String method_d1f1ed87_FWm() {
        return this.field_d9a85c6_FWm;
    }

    public Collection method_be5f586d_Dne() {
        return this.field_83b48b6a_Dne;
    }

    public String method_4a7b1d9f_Qnq() {
        return this.field_9e60dbde_Qnq;
    }

    public static String method_fd2f7d86_Dne(YGE yGE, String string) {
        return yGE == null ? string : yGE.method_6859cdb9_bzF() + string + yGE.method_4a7b1d9f_Qnq();
    }

    public String method_6859cdb9_bzF() {
        return this.field_c480ca78_bzF;
    }

    public YGE(SFA sFA, String string) {
        this.field_36c9bde_Dne = sFA;
        this.field_569fcf45_Dne = string;
        this.field_d9a85c6_FWm = string;
    }

    public boolean method_7a46289e_Dne() {
        return this.field_2092bf_Dne;
    }

    public void method_117d59bb_FWm(boolean bl) {
        this.field_21261e_FWm = bl;
        this.field_36c9bde_Dne.method_80b35f83_bzF(this);
    }

    public void method_110c4dc3_FWm(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Prefix cannot be null");
        }
        this.field_c480ca78_bzF = string;
        this.field_36c9bde_Dne.method_80b35f83_bzF(this);
    }

    public void method_ce7f9d7a_Dne(boolean bl) {
        this.field_2092bf_Dne = bl;
        this.field_36c9bde_Dne.method_80b35f83_bzF(this);
    }

    public int method_7a46288d_Dne() {
        int n = 0;
        int n2 = 0;
        if (this.method_7a46289e_Dne()) {
            n |= 1 << n2++;
        }
        if (this.method_7c6f603d_FWm()) {
            n |= 1 << n2++;
        }
        return n;
    }

    public void method_8f501fe4_Dne(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        this.field_d9a85c6_FWm = string;
        this.field_36c9bde_Dne.method_80b35f83_bzF(this);
    }

    public void method_47a073d1_bzF(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Suffix cannot be null");
        }
        this.field_9e60dbde_Qnq = string;
        this.field_36c9bde_Dne.method_80b35f83_bzF(this);
    }

    public boolean method_7c6f603d_FWm() {
        return this.field_21261e_FWm;
    }

    public void method_ce7f5da9_Dne(int n) {
        int n2 = 0;
        int n3 = n2 + 1;
        this.method_ce7f9d7a_Dne((n & 1 << n2) > 0);
        this.method_117d59bb_FWm((n & 1 << n3++) > 0);
    }
}

