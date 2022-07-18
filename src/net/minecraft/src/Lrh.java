package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import paulscode.sound.codecs.CodecJOrbis;

public class Lrh
extends CodecJOrbis {
    @Override
    protected InputStream openInputStream() {
        try {
            return new gEW(this, this.url, this.urlConnection.getInputStream());
        }
        catch (IOException iOException) {
            return null;
        }
    }
}

