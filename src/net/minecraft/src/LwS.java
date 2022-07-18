package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.TimerTask;

class LwS
extends TimerTask {
    mNp field_378913d_Dne;
    final ukD field_37c9bbe_Dne;

    LwS(ukD ukD2, Rpz rpz) {
        this(ukD2);
    }

    private LwS(ukD ukD2) {
        this.field_37c9bbe_Dne = ukD2;
        this.field_378913d_Dne = new mNp(ukD.method_1e55185d_Dne(this.field_37c9bbe_Dne));
    }

    private void method_7a46289a_Dne() {
        try {
            List list = this.field_378913d_Dne.method_2311bc31_Dne().field_f27c122c_Dne;
            this.method_ea14418b_Dne(list);
            ukD.method_7e9b16aa_Dne(this.field_37c9bbe_Dne, list);
        }
        catch (lUu lUu2) {
        }
        catch (IOException iOException) {
            System.err.println(iOException);
        }
    }

    private void method_ea14418b_Dne(List list) {
        Collections.sort(list, new qZK(this, ukD.method_1e55185d_Dne((ukD)this.field_37c9bbe_Dne).field_569fcf45_Dne, null));
    }

    @Override
    public void run() {
        if (!ukD.method_c0811bbd_Dne(this.field_37c9bbe_Dne)) {
            this.method_7a46289a_Dne();
        }
    }
}

