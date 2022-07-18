package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class EAx
extends dEr {
    @Override
    public boolean method_55b582da_FWm(NMq nMq) {
        return true;
    }

    @Override
    public void method_497c81fb_Dne(NMq nMq, FiG fiG, List list, boolean bl) {
        WkD wkD;
        QNx qNx;
        if (nMq.method_a98a0664_aFZ() && (qNx = (QNx)(wkD = nMq.method_230886fb_Dne()).method_285c494f_Dne("author")) != null) {
            list.add((Object)((Object)Dne.field_140f3afb_div) + String.format(KGL.method_98148f73_Dne("book.byAuthor", qNx.field_569fcf45_Dne), new Object[0]));
        }
    }

    @Override
    public boolean method_b0a28148_div() {
        return true;
    }

    @Override
    public NMq method_d4201764_Dne(NMq nMq, Qnq qnq, FiG fiG) {
        fiG.method_7c61cf15_Dne(nMq);
        return nMq;
    }

    @Override
    public String method_6194d772_Qnq(NMq nMq) {
        WkD wkD;
        QNx qNx;
        if (nMq.method_a98a0664_aFZ() && (qNx = (QNx)(wkD = nMq.method_230886fb_Dne()).method_285c494f_Dne("title")) != null) {
            return qNx.toString();
        }
        return super.method_6194d772_Qnq(nMq);
    }

    public EAx(int n) {
        super(n);
        this.method_9e77fc49_Dne(1);
    }

    public static boolean method_8d4fb91b_Dne(WkD wkD) {
        if (!Iny.method_8d4fb91b_Dne(wkD)) {
            return false;
        }
        if (!wkD.method_8f501fe8_Dne("title")) {
            return false;
        }
        String string = wkD.method_39193c_Dne("title");
        return string != null && string.length() <= 16 ? wkD.method_8f501fe8_Dne("author") : false;
    }
}

