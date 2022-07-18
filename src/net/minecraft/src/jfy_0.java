package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/*
 * Renamed from Jfy
 */
public class jfy_0
extends FilterInputStream {
    private byte[] field_4039e03_FWm;
    private int field_2092ae_Dne;
    private XAo field_36ed486_Dne;
    private int field_21260d_FWm;
    private boolean field_2092bf_Dne;
    private byte[] field_3f1c582_Dne;
    private tUA field_37bd46c_Dne;

    public jfy_0(InputStream inputStream, tUA tUA2) {
        super(inputStream);
        this.field_37bd46c_Dne = tUA2;
        this.field_3f1c582_Dne = new byte[tUA2.method_117d19dd_FWm(2048)];
        this.field_4039e03_FWm = new byte[2048];
    }

    private int method_7a46288d_Dne() throws IOException {
        int n = super.available();
        if (n <= 0) {
            n = 1;
        }
        if ((n = n > this.field_4039e03_FWm.length ? super.read(this.field_4039e03_FWm, 0, this.field_4039e03_FWm.length) : super.read(this.field_4039e03_FWm, 0, n)) < 0) {
            if (this.field_2092bf_Dne) {
                return -1;
            }
            try {
                this.field_21260d_FWm = this.field_37bd46c_Dne != null ? this.field_37bd46c_Dne.method_2d277035_Dne(this.field_3f1c582_Dne, 0) : 0;
            }
            catch (Exception exception) {
                throw new IOException("error processing stream: " + exception.toString());
            }
            this.field_2092ae_Dne = 0;
            this.field_2092bf_Dne = true;
            if (this.field_2092ae_Dne == this.field_21260d_FWm) {
                return -1;
            }
        } else {
            this.field_2092ae_Dne = 0;
            try {
                if (this.field_37bd46c_Dne != null) {
                    this.field_21260d_FWm = this.field_37bd46c_Dne.method_a692206e_Dne(this.field_4039e03_FWm, 0, n, this.field_3f1c582_Dne, 0);
                } else {
                    this.field_36ed486_Dne.method_a692207b_Dne(this.field_4039e03_FWm, 0, n, this.field_3f1c582_Dne, 0);
                    this.field_21260d_FWm = n;
                }
            }
            catch (Exception exception) {
                throw new IOException("error processing stream: " + exception.toString());
            }
            if (this.field_21260d_FWm == 0) {
                return this.method_7a46288d_Dne();
            }
        }
        return this.field_21260d_FWm;
    }

    @Override
    public int read(byte[] byArray, int n, int n2) throws IOException {
        if (this.field_2092ae_Dne == this.field_21260d_FWm && this.method_7a46288d_Dne() < 0) {
            return -1;
        }
        int n3 = this.field_21260d_FWm - this.field_2092ae_Dne;
        if (n2 > n3) {
            System.arraycopy(this.field_3f1c582_Dne, this.field_2092ae_Dne, byArray, n, n3);
            this.field_2092ae_Dne = this.field_21260d_FWm;
            return n3;
        }
        System.arraycopy(this.field_3f1c582_Dne, this.field_2092ae_Dne, byArray, n, n2);
        this.field_2092ae_Dne += n2;
        return n2;
    }

    @Override
    public long skip(long l) {
        if (l <= 0L) {
            return 0L;
        }
        int n = this.field_21260d_FWm - this.field_2092ae_Dne;
        if (l > (long)n) {
            this.field_2092ae_Dne = this.field_21260d_FWm;
            return n;
        }
        this.field_2092ae_Dne += (int)l;
        return (int)l;
    }

    @Override
    public boolean markSupported() {
        return false;
    }

    @Override
    public int read() throws IOException {
        return this.field_2092ae_Dne == this.field_21260d_FWm && this.method_7a46288d_Dne() < 0 ? -1 : this.field_3f1c582_Dne[this.field_2092ae_Dne++] & 0xFF;
    }

    @Override
    public int read(byte[] byArray) throws IOException {
        return this.read(byArray, 0, byArray.length);
    }

    @Override
    public int available() {
        return this.field_21260d_FWm - this.field_2092ae_Dne;
    }
}

