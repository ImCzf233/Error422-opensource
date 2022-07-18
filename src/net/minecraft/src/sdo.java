package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class sdo
implements Callable {
    final Tnv field_36dacd0_Dne;
    final NER field_36a5451_Dne;

    public String method_eecad346_Dne() {
        return String.valueOf(this.field_36a5451_Dne.method_a98a0653_aFZ());
    }

    public Object call() {
        return this.method_eecad346_Dne();
    }

    sdo(Tnv tnv, NER nER) {
        this.field_36dacd0_Dne = tnv;
        this.field_36a5451_Dne = nER;
    }
}

