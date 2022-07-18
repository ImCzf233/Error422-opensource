package net.minecraft.src;
import java.io.IOException;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import java.net.URL;

class gEW
extends InputStream {
    private InputStream field_767c223e_Dne;
    byte[] field_3f1c582_Dne;
    private int field_2092ae_Dne;
    final Lrh field_36a172a_Dne;

    @Override
    public int read() throws IOException {
        int n = this.read(this.field_3f1c582_Dne, 0, 1);
        return n < 0 ? n : this.field_3f1c582_Dne[0];
    }

    @Override
    public int read(byte[] byArray, int n, int n2) throws IOException {
        n2 = this.field_767c223e_Dne.read(byArray, n, n2);
        for (int i = 0; i < n2; ++i) {
            byte by = (byte)(byArray[n + i] ^ this.field_2092ae_Dne >> 8);
            byArray[n + i] = by;
            byte by2 = by;
            this.field_2092ae_Dne = this.field_2092ae_Dne * 498729871 + 85731 * by2;
        }
        return n2;
    }

    public gEW(Lrh lrh, URL uRL, InputStream inputStream) {
        this.field_36a172a_Dne = lrh;
        this.field_3f1c582_Dne = new byte[1];
        this.field_767c223e_Dne = inputStream;
        String string = uRL.getPath();
        string = string.substring(string.lastIndexOf("/") + 1);
        this.field_2092ae_Dne = string.hashCode();
    }
}

