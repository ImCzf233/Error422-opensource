package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.OutputStream;

public class qKy
extends EKF {
    private byte[] field_3f1c582_Dne;

    public qKy(String string, byte[] byArray, int n, int n2) {
        super(string, n, n2);
        this.field_3f1c582_Dne = byArray;
    }

    @Override
    public EKF method_f876308a_FWm() {
        return this.method_2313e6ec_Dne();
    }

    public qKy method_2313e6ec_Dne() {
        try {
            this.field_6c8af5e4_Dne.setDoOutput(true);
            this.field_6c8af5e4_Dne.setDoInput(true);
            this.field_6c8af5e4_Dne.setRequestMethod("PUT");
            OutputStream outputStream = this.field_6c8af5e4_Dne.getOutputStream();
            outputStream.write(this.field_3f1c582_Dne);
            outputStream.flush();
            return this;
        }
        catch (Exception exception) {
            throw new HFd("Failed URL: " + this.field_569fcf45_Dne, exception);
        }
    }
}

