package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FilenameFilter;

class qRn
implements FilenameFilter {
    final Kjm field_369855e_Dne;

    @Override
    public boolean accept(File file, String string) {
        return string.endsWith(".mcr");
    }

    qRn(Kjm kjm) {
        this.field_369855e_Dne = kjm;
    }
}

