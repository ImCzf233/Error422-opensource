package net.minecraft.src;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import java.io.RandomAccessFile;

class TJY
extends InputStream {
    RandomAccessFile field_914fb9eb_Dne = null;
    final /* synthetic */ JQZ field_368b0d9_Dne;
    final String field_569fcf45_Dne = "r";

    public int read() throws IOException {
        return this.field_914fb9eb_Dne.read();
    }

    TJY(JQZ jQZ, String string) throws FileNotFoundException {
        this.field_368b0d9_Dne = jQZ;
        this.field_914fb9eb_Dne = new RandomAccessFile(string, "r");
    }

    public long method_7c6f602d_FWm() throws IOException {
        return this.field_914fb9eb_Dne.getFilePointer();
    }

    public int read(byte[] byArray) throws IOException {
        return this.field_914fb9eb_Dne.read(byArray);
    }

    public int read(byte[] byArray, int n, int n2) throws IOException {
        return this.field_914fb9eb_Dne.read(byArray, n, n2);
    }

    public synchronized void mark(int n) {
    }

    public int available() throws IOException {
        return this.field_914fb9eb_Dne.length() == this.field_914fb9eb_Dne.getFilePointer() ? 0 : 1;
    }

    public boolean markSupported() {
        return false;
    }

    public void method_ce7f616a_Dne(long l) throws IOException {
        this.field_914fb9eb_Dne.seek(l);
    }

    public void close() throws IOException {
        this.field_914fb9eb_Dne.close();
    }

    public synchronized void reset() {
    }

    public long method_7a46288e_Dne() throws IOException {
        return this.field_914fb9eb_Dne.length();
    }

    public long skip(long l) throws IOException {
        return this.field_914fb9eb_Dne.skipBytes((int)l);
    }
}

