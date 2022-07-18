package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.net.SocketAddress;

public class Rfd
extends dzN {
    private WkD field_36ef89c_Dne = null;

    public Rfd(zHD zHD2) {
        super(zHD2);
        this.field_21260d_FWm = 10;
    }

    @Override
    public String method_9e765aef_Dne(SocketAddress socketAddress, String string) {
        return string.equalsIgnoreCase(this.method_2317ec95_Dne().method_c50868a8_mrb()) ? "That name is already taken." : super.method_9e765aef_Dne(socketAddress, string);
    }

    @Override
    public jwh_0 method_2302cf90_Dne() {
        return this.method_2317ec95_Dne();
    }

    @Override
    public WkD method_230886fb_Dne() {
        return this.field_36ef89c_Dne;
    }

    public zHD method_2317ec95_Dne() {
        return (zHD)super.method_2302cf90_Dne();
    }

    @Override
    protected void method_7f92adf0_Dne(PJQ pJQ) {
        if (pJQ.method_193de2e9_a_().equals(this.method_2317ec95_Dne().method_c50868a8_mrb())) {
            this.field_36ef89c_Dne = new WkD();
            pJQ.method_7f44880a_bzF(this.field_36ef89c_Dne);
        }
        super.method_7f92adf0_Dne(pJQ);
    }
}

