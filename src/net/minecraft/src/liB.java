package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.net.InetAddress;

public class liB
extends NuQ {
    private pOU field_379eed6_Dne;
    private boolean field_21261e_FWm = false;
    private final bqd field_3741317_Dne;
    private String field_569fcf45_Dne;
    private bqd field_202ddef6_FWm;

    public void method_f7397a1c_Dne(bqd bqd2, String string) {
        this.field_202ddef6_FWm = bqd2;
        this.field_569fcf45_Dne = string;
    }

    public liB(zHD zHD2) throws IOException {
        super(zHD2);
        this.field_3741317_Dne = new bqd(zHD2.method_230e0120_Dne(), null);
    }

    public zHD method_2317ec95_Dne() {
        return (zHD)super.method_2302cf90_Dne();
    }

    public boolean method_7a46289e_Dne() {
        return this.field_21261e_FWm && this.field_3741317_Dne.method_230da176_Dne().method_7a46289e_Dne() && this.field_3741317_Dne.method_230da176_Dne().method_7c6f603d_FWm();
    }

    @Override
    public jwh_0 method_2302cf90_Dne() {
        return this.method_2317ec95_Dne();
    }

    @Override
    public void method_7c6f6039_FWm() {
        if (this.field_202ddef6_FWm != null) {
            PJQ pJQ = this.method_2317ec95_Dne().method_230ea953_Dne().method_284e205e_Dne(this.field_569fcf45_Dne);
            if (pJQ != null) {
                this.field_3741317_Dne.method_a07820d2_Dne(this.field_202ddef6_FWm);
                this.field_21261e_FWm = true;
                this.method_2317ec95_Dne().method_230ea953_Dne().method_207cbea3_Dne(this.field_3741317_Dne, pJQ);
            }
            this.field_202ddef6_FWm = null;
            this.field_569fcf45_Dne = null;
        }
        if (this.field_379eed6_Dne != null) {
            this.field_379eed6_Dne.method_7a46289a_Dne();
        }
        super.method_7c6f6039_FWm();
    }

    public String method_eecad346_Dne() throws IOException {
        if (this.field_379eed6_Dne == null) {
            int n = -1;
            try {
                n = fgp.method_7a46288d_Dne();
            }
            catch (IOException iOException) {
                // empty catch block
            }
            if (n <= 0) {
                n = 25564;
            }
            this.field_379eed6_Dne = new pOU(this, (InetAddress)null, n);
            this.field_379eed6_Dne.start();
        }
        return this.field_379eed6_Dne.method_6a6e2c8a_Dne().getHostAddress() + ":" + this.field_379eed6_Dne.method_7a46288d_Dne();
    }

    @Override
    public void method_7a46289a_Dne() {
        super.method_7a46289a_Dne();
        if (this.field_379eed6_Dne != null) {
            this.method_2317ec95_Dne().method_230e0120_Dne().method_8f501fe4_Dne("Stopping server connection");
            this.field_379eed6_Dne.method_7c6f6039_FWm();
            this.field_379eed6_Dne.interrupt();
            this.field_379eed6_Dne = null;
        }
    }
}

