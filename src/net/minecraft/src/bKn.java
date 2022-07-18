package net.minecraft.src;
import java.io.IOException;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.PushbackReader;
import java.io.Reader;

final class bKn
implements BEs {
    private int field_21260d_FWm = 1;
    private boolean field_2092bf_Dne = false;
    private int field_2092ae_Dne = 0;
    private final PushbackReader field_8e8cf9ca_Dne;

    public bKn(Reader reader) {
        this.field_8e8cf9ca_Dne = new PushbackReader(reader);
    }

    public int method_7a46288d_Dne() throws IOException {
        int n = this.field_8e8cf9ca_Dne.read();
        this.method_ce7f5da9_Dne(n);
        return n;
    }

    public int method_174e295_Dne(char[] cArray) throws IOException {
        int n = this.field_8e8cf9ca_Dne.read(cArray);
        char[] cArray2 = cArray;
        int n2 = cArray.length;
        for (int i = 0; i < n2; ++i) {
            char c = cArray2[i];
            this.method_ce7f5da9_Dne(c);
        }
        return n;
    }

    public void method_174e2a2_Dne(char[] cArray) {
        this.field_2092ae_Dne -= cArray.length;
        if (this.field_2092ae_Dne < 0) {
            this.field_2092ae_Dne = 0;
        }
    }

    @Override
    public int method_ae128dba_bzF() {
        return this.field_21260d_FWm;
    }

    public void method_ce7f4723_Dne(char c) throws IOException {
        --this.field_2092ae_Dne;
        if (this.field_2092ae_Dne < 0) {
            this.field_2092ae_Dne = 0;
        }
        this.field_8e8cf9ca_Dne.unread(c);
    }

    private void method_ce7f5da9_Dne(int n) {
        if (13 == n) {
            this.field_2092ae_Dne = 0;
            ++this.field_21260d_FWm;
            this.field_2092bf_Dne = true;
        } else {
            if (10 == n && !this.field_2092bf_Dne) {
                this.field_2092ae_Dne = 0;
                ++this.field_21260d_FWm;
            } else {
                ++this.field_2092ae_Dne;
            }
            this.field_2092bf_Dne = false;
        }
    }

    @Override
    public int method_7c6f602c_FWm() {
        return this.field_2092ae_Dne;
    }
}

