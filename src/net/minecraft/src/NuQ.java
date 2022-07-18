package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class NuQ {
    private final jwh_0 field_3694131_Dne;
    public volatile boolean field_2092bf_Dne = false;
    private final List field_f27c122c_Dne = Collections.synchronizedList(new ArrayList());

    public void method_7c6f6039_FWm() {
        for (int i = 0; i < this.field_f27c122c_Dne.size(); ++i) {
            Tnv tnv = (Tnv)this.field_f27c122c_Dne.get(i);
            try {
                tnv.method_7a46289a_Dne();
            }
            catch (Exception exception) {
                if (tnv.field_36c6f8c_Dne instanceof bqd) {
                    McM mcM = McM.method_948e60df_Dne(exception, "Ticking memory connection");
                    throw new kaJ(mcM);
                }
                this.field_3694131_Dne.method_230e0120_Dne().method_37db6a91_Dne("Failed to handle packet for " + tnv.field_36b4fb5_Dne.method_eecad346_Dne() + "/" + tnv.field_36b4fb5_Dne.method_d1f1ed87_FWm() + ": " + exception, exception);
                tnv.method_8f501fe4_Dne("Internal server error");
            }
            if (tnv.field_2092bf_Dne) {
                this.field_f27c122c_Dne.remove(i--);
            }
            tnv.field_36c6f8c_Dne.method_7a46289a_Dne();
        }
    }

    public NuQ(jwh_0 jwh_02) {
        this.field_3694131_Dne = jwh_02;
        this.field_2092bf_Dne = true;
    }

    public void method_7a46289a_Dne() {
        this.field_2092bf_Dne = false;
    }

    public jwh_0 method_2302cf90_Dne() {
        return this.field_3694131_Dne;
    }

    public void method_8872304b_Dne(Tnv tnv) {
        this.field_f27c122c_Dne.add(tnv);
    }
}

