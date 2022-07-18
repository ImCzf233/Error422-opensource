package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.net.ConnectException;
import java.net.UnknownHostException;

class Evv
extends Thread {
    final String field_569fcf45_Dne;
    final int field_2092ae_Dne;
    final OQj field_36af8a4_Dne;

    Evv(OQj oQj, String string, int n) {
        this.field_36af8a4_Dne = oQj;
        this.field_569fcf45_Dne = string;
        this.field_2092ae_Dne = n;
    }

    @Override
    public void run() {
        try {
            OQj.method_8646e469_Dne(this.field_36af8a4_Dne, new fzy(this.field_36af8a4_Dne.method_81a5f12e_Dne(), this.field_569fcf45_Dne, this.field_2092ae_Dne, OQj.method_37e4f07b_Dne(this.field_36af8a4_Dne)));
            if (this.field_36af8a4_Dne.method_7a46289e_Dne()) {
                return;
            }
            this.field_36af8a4_Dne.method_110c4dc3_FWm(irb.method_2310d392_Dne().method_39193c_Dne("mco.connect.authorizing"));
            OQj.method_37e07b4b_Dne(this.field_36af8a4_Dne).method_5536af4d_FWm(new ike(61, this.field_36af8a4_Dne.method_81a5f12e_Dne().field_37d3e5f_Dne.field_569fcf45_Dne, this.field_569fcf45_Dne, this.field_2092ae_Dne));
        }
        catch (UnknownHostException unknownHostException) {
            if (this.field_36af8a4_Dne.method_7a46289e_Dne()) {
                return;
            }
            this.field_36af8a4_Dne.method_81a5f12e_Dne().method_b88fcbd2_Dne(new rNz(OQj.method_37e4f07b_Dne(this.field_36af8a4_Dne), "connect.failed", "disconnect.genericReason", "Unknown host '" + this.field_569fcf45_Dne + "'"));
        }
        catch (ConnectException connectException) {
            if (this.field_36af8a4_Dne.method_7a46289e_Dne()) {
                return;
            }
            this.field_36af8a4_Dne.method_81a5f12e_Dne().method_b88fcbd2_Dne(new rNz(OQj.method_37e4f07b_Dne(this.field_36af8a4_Dne), "connect.failed", "disconnect.genericReason", connectException.getMessage()));
        }
        catch (Exception exception) {
            if (this.field_36af8a4_Dne.method_7a46289e_Dne()) {
                return;
            }
            exception.printStackTrace();
            this.field_36af8a4_Dne.method_81a5f12e_Dne().method_b88fcbd2_Dne(new rNz(OQj.method_37e4f07b_Dne(this.field_36af8a4_Dne), "connect.failed", "disconnect.genericReason", exception.toString()));
        }
    }
}

