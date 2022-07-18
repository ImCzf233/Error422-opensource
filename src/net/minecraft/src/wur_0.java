package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

/*
 * Renamed from Wur
 */
class wur_0
extends Thread {
    final Map field_83b1c1b0_Dne;
    final yJm field_37df650_Dne;

    wur_0(yJm yJm2, Map map) {
        this.field_37df650_Dne = yJm2;
        this.field_83b1c1b0_Dne = map;
    }

    @Override
    public void run() {
        try {
            yJm.method_9381797f_Dne(this.field_37df650_Dne, this.field_83b1c1b0_Dne, yJm.method_7f362de9_Qnq(this.field_37df650_Dne), yJm.method_918b6568_aFZ(this.field_37df650_Dne), yJm.method_761fc1a_zGp(this.field_37df650_Dne));
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            yJm.method_ed2dd26d_Dne(this.field_37df650_Dne, false);
        }
    }
}

