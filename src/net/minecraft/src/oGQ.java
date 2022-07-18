package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class oGQ
extends EKF {
    @Override
    public EKF method_f876308a_FWm() {
        return this.method_2312ea52_Dne();
    }

    public oGQ method_2312ea52_Dne() {
        try {
            this.field_6c8af5e4_Dne.setDoInput(true);
            this.field_6c8af5e4_Dne.setDoOutput(true);
            this.field_6c8af5e4_Dne.setUseCaches(false);
            this.field_6c8af5e4_Dne.setRequestMethod("GET");
            return this;
        }
        catch (Exception exception) {
            throw new HFd("Failed URL: " + this.field_569fcf45_Dne, exception);
        }
    }

    public oGQ(String string, int n, int n2) {
        super(string, n, n2);
    }
}

