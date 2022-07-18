package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class qZK
implements Comparator {
    private final String field_569fcf45_Dne;
    final LwS field_36a2764_Dne;

    qZK(LwS lwS, String string, Rpz rpz) {
        this(lwS, string);
    }

    public int compare(Object object, Object object2) {
        return this.method_dd5b38ad_Dne((muh)object, (muh)object2);
    }

    private qZK(LwS lwS, String string) {
        this.field_36a2764_Dne = lwS;
        this.field_569fcf45_Dne = string;
    }

    public int method_dd5b38ad_Dne(muh muh2, muh muh3) {
        if (muh2.field_9e60dbde_Qnq.equals(muh3.field_9e60dbde_Qnq)) {
            return muh2.field_2092af_Dne < muh3.field_2092af_Dne ? 1 : (muh2.field_2092af_Dne > muh3.field_2092af_Dne ? -1 : 0);
        }
        if (muh2.field_9e60dbde_Qnq.equals(this.field_569fcf45_Dne)) {
            return -1;
        }
        if (muh3.field_9e60dbde_Qnq.equals(this.field_569fcf45_Dne)) {
            return 1;
        }
        if (muh2.field_c480ca78_bzF.equals("CLOSED") || muh3.field_c480ca78_bzF.equals("CLOSED")) {
            if (muh2.field_c480ca78_bzF.equals("CLOSED")) {
                return 1;
            }
            if (muh3.field_c480ca78_bzF.equals("CLOSED")) {
                return 0;
            }
        }
        return muh2.field_2092af_Dne < muh3.field_2092af_Dne ? 1 : (muh2.field_2092af_Dne > muh3.field_2092af_Dne ? -1 : 0);
    }
}

