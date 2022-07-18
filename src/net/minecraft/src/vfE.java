package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class vfE {
    private String field_d9a85c6_FWm;
    private final SFA field_36c9bde_Dne;
    private final String field_569fcf45_Dne;
    private final PAf field_36b3077_Dne;

    public void method_8f501fe4_Dne(String string) {
        this.field_d9a85c6_FWm = string;
        this.field_36c9bde_Dne.method_b3e4c225_bzF(this);
    }

    public SFA method_23062a3d_Dne() {
        return this.field_36c9bde_Dne;
    }

    public vfE(SFA sFA, String string, PAf pAf) {
        this.field_36c9bde_Dne = sFA;
        this.field_569fcf45_Dne = string;
        this.field_36b3077_Dne = pAf;
        this.field_d9a85c6_FWm = string;
    }

    public String method_d1f1ed87_FWm() {
        return this.field_d9a85c6_FWm;
    }

    public String method_eecad346_Dne() {
        return this.field_569fcf45_Dne;
    }

    public PAf method_2304bed6_Dne() {
        return this.field_36b3077_Dne;
    }
}

