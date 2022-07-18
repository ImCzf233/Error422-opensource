package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

public class OQj
extends jhn_0 {
    private final muh field_37922ac_Dne;
    private final qVZ field_37a7e17_Dne;
    private fzy field_37608e7_Dne;

    @Override
    public void run() {
        this.method_110c4dc3_FWm(irb.method_2310d392_Dne().method_39193c_Dne("mco.connect.connecting"));
        mNp mNp2 = new mNp(this.method_81a5f12e_Dne().field_37d3e5f_Dne);
        boolean bl = false;
        boolean bl2 = false;
        HMg hMg = null;
        for (int i = 0; i < 10 && !this.method_7a46289e_Dne(); ++i) {
            try {
                hMg = mNp2.method_d35199d9_Dne(this.field_37922ac_Dne.field_2092af_Dne);
                bl = true;
            }
            catch (Ybw ybw) {
            }
            catch (lUu lUu2) {
                bl2 = true;
                this.method_8f501fe4_Dne(lUu2.getLocalizedMessage());
                break;
            }
            catch (IOException iOException) {
            }
            catch (Exception exception) {
                bl2 = true;
                this.method_8f501fe4_Dne(exception.getLocalizedMessage());
            }
            if (bl) break;
            this.method_ae128dc7_bzF();
        }
        if (!this.method_7a46289e_Dne() && !bl2) {
            if (bl) {
                Qyv qyv = Qyv.method_284f49a7_Dne(hMg.field_569fcf45_Dne);
                this.method_5ab44f9f_Dne(qyv.method_eecad346_Dne(), qyv.method_7a46288d_Dne());
            } else {
                this.method_81a5f12e_Dne().method_b88fcbd2_Dne(this.field_37a7e17_Dne);
            }
        }
    }

    private void method_5ab44f9f_Dne(String string, int n) {
        new Evv(this, string, n).start();
    }

    static qVZ method_37e4f07b_Dne(OQj oQj) {
        return oQj.field_37a7e17_Dne;
    }

    static fzy method_37e07b4b_Dne(OQj oQj) {
        return oQj.field_37608e7_Dne;
    }

    public OQj(qVZ qVZ2, muh muh2) {
        this.field_37a7e17_Dne = qVZ2;
        this.field_37922ac_Dne = muh2;
    }

    private void method_ae128dc7_bzF() {
        try {
            Thread.sleep(5000L);
        }
        catch (InterruptedException interruptedException) {
            System.err.println(interruptedException);
        }
    }

    static fzy method_8646e469_Dne(OQj oQj, fzy fzy2) {
        oQj.field_37608e7_Dne = fzy2;
        return oQj.field_37608e7_Dne;
    }

    @Override
    public void method_7a46289a_Dne() {
        if (this.field_37608e7_Dne != null) {
            this.field_37608e7_Dne.method_7c6f6039_FWm();
        }
    }
}

