package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class oFT
extends FilterOutputStream {
    private tUA field_37bd46c_Dne;
    private XAo field_36ed486_Dne;
    private byte[] field_4039e03_FWm;
    private byte[] field_3f1c582_Dne = new byte[1];

    @Override
    public void write(byte[] byArray) throws IOException {
        this.write(byArray, 0, byArray.length);
    }

    @Override
    public void write(int n) throws IOException {
        this.field_3f1c582_Dne[0] = (byte)n;
        if (this.field_37bd46c_Dne != null) {
            int n2 = this.field_37bd46c_Dne.method_a692206e_Dne(this.field_3f1c582_Dne, 0, 1, this.field_4039e03_FWm, 0);
            if (n2 != 0) {
                this.out.write(this.field_4039e03_FWm, 0, n2);
            }
        } else {
            this.out.write(this.field_36ed486_Dne.method_ce7f434e_Dne((byte)n));
        }
    }

    public oFT(OutputStream outputStream, tUA tUA2) {
        super(outputStream);
        this.field_37bd46c_Dne = tUA2;
        this.field_4039e03_FWm = new byte[tUA2.method_7a46288d_Dne()];
    }

    @Override
    public void close() throws IOException {
        try {
            byte[] byArray;
            int n;
            if (this.field_37bd46c_Dne != null && (n = this.field_37bd46c_Dne.method_2d277035_Dne(byArray = new byte[this.field_37bd46c_Dne.method_117d19dd_FWm(0)], 0)) != 0) {
                this.out.write(byArray, 0, n);
            }
        }
        catch (Exception exception) {
            throw new IOException("Error closing stream: " + exception.toString());
        }
        this.flush();
        super.close();
    }

    @Override
    public void write(byte[] byArray, int n, int n2) throws IOException {
        if (this.field_37bd46c_Dne != null) {
            byte[] byArray2 = new byte[this.field_37bd46c_Dne.method_117d19dd_FWm(n2)];
            int n3 = this.field_37bd46c_Dne.method_a692206e_Dne(byArray, n, n2, byArray2, 0);
            if (n3 != 0) {
                this.out.write(byArray2, 0, n3);
            }
        } else {
            byte[] byArray3 = new byte[n2];
            this.field_36ed486_Dne.method_a692207b_Dne(byArray, n, n2, byArray3, 0);
            this.out.write(byArray3, 0, n2);
        }
    }
}

