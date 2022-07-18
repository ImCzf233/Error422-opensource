package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import org.lwjgl.input.Keyboard;

public class ZVE
extends qVZ {
    private int field_2d29f4_aFZ;
    private final qVZ field_37a7e17_Dne;
    private final int field_267cf5_Qnq = 1;
    private String field_569fcf45_Dne;
    private final int field_2092ae_Dne = 0;
    private final muh field_37922ac_Dne;

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        irb irb2 = irb.method_2310d392_Dne();
        this.method_a98a0660_aFZ();
        this.method_32faf66d_Dne(this.field_3791671_Dne, irb2.method_39193c_Dne("mco.configure.world.subscription.title"), this.field_21260d_FWm / 2, 17, 0xFFFFFF);
        this.method_67d6d54c_FWm(this.field_3791671_Dne, irb2.method_39193c_Dne("mco.configure.world.subscription.start"), this.field_21260d_FWm / 2 - 100, 53, 0xA0A0A0);
        this.method_67d6d54c_FWm(this.field_3791671_Dne, this.field_569fcf45_Dne, this.field_21260d_FWm / 2 - 100, 66, 0xFFFFFF);
        this.method_67d6d54c_FWm(this.field_3791671_Dne, irb2.method_39193c_Dne("mco.configure.world.subscription.daysleft"), this.field_21260d_FWm / 2 - 100, 85, 0xA0A0A0);
        this.method_67d6d54c_FWm(this.field_3791671_Dne, String.valueOf(this.field_2d29f4_aFZ), this.field_21260d_FWm / 2 - 100, 98, 0xFFFFFF);
        super.method_2c2cec86_Dne(n, n2, f);
    }

    private void method_ce7f616a_Dne(long l) {
        mNp mNp2 = new mNp(this.field_493682ed_Dne.field_37d3e5f_Dne);
        try {
            YGW yGW = mNp2.method_d3593bb2_Dne(l);
            this.field_2d29f4_aFZ = yGW.field_2092ae_Dne;
            this.field_569fcf45_Dne = this.method_13b05476_Dne(yGW.field_2092af_Dne);
        }
        catch (lUu lUu2) {
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    @Override
    public void method_7a46289a_Dne() {
        this.method_ce7f616a_Dne(this.field_37922ac_Dne.field_2092af_Dne);
        irb irb2 = irb.method_2310d392_Dne();
        Keyboard.enableRepeatEvents(true);
        this.field_f27c122c_Dne.add(new pee_0(0, this.field_21260d_FWm / 2 - 100, this.field_2e5f1b_bzF / 4 + 120 + 12, irb2.method_39193c_Dne("gui.cancel")));
    }

    @Override
    public void method_7c6f6039_FWm() {
        Keyboard.enableRepeatEvents(false);
    }

    @Override
    protected void method_2c2cf7c9_Dne(int n, int n2, int n3) {
        super.method_2c2cf7c9_Dne(n, n2, n3);
    }

    private String method_13b05476_Dne(long l) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getDefault());
        gregorianCalendar.setTimeInMillis(l);
        return SimpleDateFormat.getDateTimeInstance().format(gregorianCalendar.getTime());
    }

    public ZVE(qVZ qVZ2, muh muh2) {
        this.field_37a7e17_Dne = qVZ2;
        this.field_37922ac_Dne = muh2;
    }

    @Override
    public void method_ae128dc7_bzF() {
    }

    @Override
    protected void method_16a1040_Dne(char c, int n) {
    }

    @Override
    protected void method_81183ff7_Dne(pee_0 pee_02) {
        if (pee_02.field_2092bf_Dne) {
            if (pee_02.field_2d29f4_aFZ == 0) {
                this.field_493682ed_Dne.method_b88fcbd2_Dne(this.field_37a7e17_Dne);
            } else if (pee_02.field_2d29f4_aFZ == 1) {
                // empty if block
            }
        }
    }
}

