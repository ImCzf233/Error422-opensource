package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

public class Wtm
implements Comparator {
    private sMa field_37b45e5_Dne;
    final AmF field_3650032_Dne;

    public int compare(Object object, Object object2) {
        return this.method_2964ec4d_Dne((sMa)object, (sMa)object2);
    }

    public Wtm(AmF amF, sMa sMa2) {
        this.field_3650032_Dne = amF;
        this.field_37b45e5_Dne = sMa2;
    }

    public int method_2964ec4d_Dne(sMa sMa2, sMa sMa3) {
        double d;
        double d2 = this.field_37b45e5_Dne.method_bb7dd80e_Dne(sMa2);
        return d2 < (d = this.field_37b45e5_Dne.method_bb7dd80e_Dne(sMa3)) ? -1 : (d2 > d ? 1 : 0);
    }
}

