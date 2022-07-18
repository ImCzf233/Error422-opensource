package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.UnsupportedEncodingException;

class dlo
extends jhn_0 {
    private final String field_d9a85c6_FWm;
    final LKa field_36983ea_Dne;
    private final String field_9e60dbde_Qnq;
    private final String field_c480ca78_bzF;
    private final String field_569fcf45_Dne;

    public dlo(LKa lKa, String string, String string2, String string3, String string4) {
        this.field_36983ea_Dne = lKa;
        this.field_569fcf45_Dne = string;
        this.field_d9a85c6_FWm = string2;
        this.field_c480ca78_bzF = string3;
        this.field_9e60dbde_Qnq = string4;
    }

    @Override
    public void run() {
        String string = irb.method_2310d392_Dne().method_39193c_Dne("mco.create.world.wait");
        this.method_110c4dc3_FWm(string);
        mNp mNp2 = new mNp(LKa.method_376a2783_Dne((LKa)this.field_36983ea_Dne).field_37d3e5f_Dne);
        try {
            mNp2.method_f0b38ec2_Dne(this.field_569fcf45_Dne, this.field_d9a85c6_FWm, this.field_c480ca78_bzF, this.field_9e60dbde_Qnq);
            LKa.method_5cc03ba2_FWm(this.field_36983ea_Dne).method_b88fcbd2_Dne(LKa.method_3a836f41_Dne(this.field_36983ea_Dne));
        }
        catch (lUu lUu2) {
            this.method_8f501fe4_Dne(lUu2.field_569fcf45_Dne);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
        }
        catch (IOException iOException) {
        }
        catch (Exception exception) {
            this.method_8f501fe4_Dne("Failed");
        }
    }
}

