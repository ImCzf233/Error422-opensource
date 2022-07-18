package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

class IvV
extends HashMap {
    final EWS field_36680ab_Dne;

    IvV(EWS eWS) {
        this.field_36680ab_Dne = eWS;
        for (hta hta2 : EWS.method_4a5da021_Dne(this.field_36680ab_Dne)) {
            this.put(hta2.method_23057f60_Dne(), hta2.method_23030725_Dne());
        }
    }
}

