package net.minecraft.src;
import java.io.IOException;
/*
 * Decompiled with CFR 0.152.
 */
import java.net.InetAddress;

public class ysI
extends NuQ {
    private final pOU field_379eed6_Dne;

    @Override
    public void method_7a46289a_Dne() {
        super.method_7a46289a_Dne();
        this.field_379eed6_Dne.method_7c6f6039_FWm();
        this.field_379eed6_Dne.interrupt();
    }

    @Override
    public jwh_0 method_2302cf90_Dne() {
        return this.method_23103f79_Dne();
    }

    public ysI(jwh_0 jwh_02, InetAddress inetAddress, int n) throws IOException {
        super(jwh_02);
        this.field_379eed6_Dne = new pOU(this, inetAddress, n);
        this.field_379eed6_Dne.start();
    }

    @Override
    public void method_7c6f6039_FWm() {
        this.field_379eed6_Dne.method_7a46289a_Dne();
        super.method_7c6f6039_FWm();
    }

    public iJs method_23103f79_Dne() {
        return (iJs)super.method_2302cf90_Dne();
    }

    public void method_fc8367a8_Dne(InetAddress inetAddress) {
        this.field_379eed6_Dne.method_fc8367a8_Dne(inetAddress);
    }
}

