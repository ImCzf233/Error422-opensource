package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class Uzh
extends EKF {
    @Override
    public EKF method_f876308a_FWm() {
        return this.method_2307dae8_Dne();
    }

    public Uzh method_2307dae8_Dne() {
        try {
            this.field_6c8af5e4_Dne.setDoOutput(true);
            this.field_6c8af5e4_Dne.setRequestMethod("DELETE");
            this.field_6c8af5e4_Dne.connect();
            return this;
        }
        catch (Exception exception) {
            throw new HFd("Failed URL: " + this.field_569fcf45_Dne, exception);
        }
    }

    public Uzh(String string, int n, int n2) {
        super(string, n, n2);
    }
}

