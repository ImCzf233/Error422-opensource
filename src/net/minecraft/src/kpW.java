package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.net.ConnectException;
import java.net.UnknownHostException;

class kpW
extends Thread {
    final rND field_37ad1c4_Dne;
    final int field_2092ae_Dne;
    final String field_569fcf45_Dne;

    kpW(rND rND2, String string, int n) {
        this.field_37ad1c4_Dne = rND2;
        this.field_569fcf45_Dne = string;
        this.field_2092ae_Dne = n;
    }

    @Override
    public void run() {
        try {
            rND.method_c23a1749_Dne(this.field_37ad1c4_Dne, new fzy(rND.method_d8837ce9_Dne(this.field_37ad1c4_Dne), this.field_569fcf45_Dne, this.field_2092ae_Dne));
            if (rND.method_b9c9e843_Dne(this.field_37ad1c4_Dne)) {
                return;
            }
            rND.method_75b0fc6b_Dne(this.field_37ad1c4_Dne).method_5536af4d_FWm(new ike(61, rND.method_fdd99108_FWm((rND)this.field_37ad1c4_Dne).field_37d3e5f_Dne.field_569fcf45_Dne, this.field_569fcf45_Dne, this.field_2092ae_Dne));
        }
        catch (UnknownHostException unknownHostException) {
            if (rND.method_b9c9e843_Dne(this.field_37ad1c4_Dne)) {
                return;
            }
            rND.method_c1418f96_bzF(this.field_37ad1c4_Dne).method_b88fcbd2_Dne(new fZp(rND.method_75b5719b_Dne(this.field_37ad1c4_Dne), "connect.failed", "disconnect.genericReason", "Unknown host '" + this.field_569fcf45_Dne + "'"));
        }
        catch (ConnectException connectException) {
            if (rND.method_b9c9e843_Dne(this.field_37ad1c4_Dne)) {
                return;
            }
            rND.method_4e0e79f0_Qnq(this.field_37ad1c4_Dne).method_b88fcbd2_Dne(new fZp(rND.method_75b5719b_Dne(this.field_37ad1c4_Dne), "connect.failed", "disconnect.genericReason", connectException.getMessage()));
        }
        catch (Exception exception) {
            if (rND.method_b9c9e843_Dne(this.field_37ad1c4_Dne)) {
                return;
            }
            exception.printStackTrace();
            rND.method_f7aa6faf_aFZ(this.field_37ad1c4_Dne).method_b88fcbd2_Dne(new fZp(rND.method_75b5719b_Dne(this.field_37ad1c4_Dne), "connect.failed", "disconnect.genericReason", exception.toString()));
        }
    }
}

