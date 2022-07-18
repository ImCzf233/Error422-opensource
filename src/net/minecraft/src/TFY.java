package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.TimerTask;

class TFY
extends TimerTask {
    final evf field_3758337_Dne;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        if (evf.method_49060be_Dne(this.field_3758337_Dne).method_a98a0664_aFZ()) {
            HashMap<String, Integer> hashMap;
            Object object = evf.method_c951d080_Dne(this.field_3758337_Dne);
            synchronized (object) {
                hashMap = new HashMap<String, Integer>(evf.method_4bcc8ba7_Dne(this.field_3758337_Dne));
                hashMap.put("snooper_count", evf.method_a5de08e5_Dne(this.field_3758337_Dne));
            }
            fgp.method_32ca8d76_Dne(evf.method_49060be_Dne(this.field_3758337_Dne).method_230e0120_Dne(), evf.method_52d3af63_Dne(this.field_3758337_Dne), hashMap, true);
        }
    }

    TFY(evf evf2) {
        this.field_3758337_Dne = evf2;
    }
}

