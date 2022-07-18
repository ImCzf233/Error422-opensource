package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class Lzp
implements Callable {
    final NER field_36a5451_Dne;
    final Tnv field_36dacd0_Dne;

    public Object call() {
        return this.method_eecad346_Dne();
    }

    Lzp(Tnv tnv, NER nER) {
        this.field_36dacd0_Dne = tnv;
        this.field_36a5451_Dne = nER;
    }

    public String method_eecad346_Dne() {
        return this.field_36a5451_Dne.getClass().getCanonicalName();
    }
}

