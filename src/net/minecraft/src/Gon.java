package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

class Gon
extends jhn_0 {
    private final String field_569fcf45_Dne;
    private final long field_2092af_Dne;
    final MaG field_36a47b9_Dne;

    public Gon(MaG maG, long l, String string) {
        this.field_36a47b9_Dne = maG;
        this.field_2092af_Dne = l;
        this.field_569fcf45_Dne = string;
    }

    @Override
    public void run() {
        mNp mNp2 = new mNp(this.method_81a5f12e_Dne().field_37d3e5f_Dne);
        String string = irb.method_2310d392_Dne().method_39193c_Dne("mco.reset.world.resetting.screen.title");
        this.method_110c4dc3_FWm(string);
        try {
            mNp2.method_2dd79131_Dne(this.field_2092af_Dne, this.field_569fcf45_Dne);
            MaG.method_d67d5994_Dne(this.field_36a47b9_Dne).method_b88fcbd2_Dne(MaG.method_5fcfdbd0_Dne(this.field_36a47b9_Dne));
        }
        catch (lUu lUu2) {
            this.method_8f501fe4_Dne(lUu2.field_569fcf45_Dne);
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }
}

