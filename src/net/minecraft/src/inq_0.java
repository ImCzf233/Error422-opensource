package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;

/*
 * Renamed from iNQ
 */
public class inq_0 {
    private int field_2092ae_Dne;
    private ArrayList field_dc9cb15_Dne;
    private static final byte[] field_3f1c582_Dne = new byte[4096];
    private RandomAccessFile field_914fb9eb_Dne;
    private final int[] field_3f1c589_Dne = new int[1024];
    private final int[] field_4039e0a_FWm = new int[1024];
    private final File field_d102ba32_Dne;
    private long field_2092af_Dne = 0L;

    private void method_2c2cf7c9_Dne(int n, int n2, int n3) throws IOException {
        this.field_3f1c589_Dne[n + n2 * 32] = n3;
        this.field_914fb9eb_Dne.seek((n + n2 * 32) * 4);
        this.field_914fb9eb_Dne.writeInt(n3);
    }

    protected synchronized void method_d5d70262_Dne(int n, int n2, byte[] byArray, int n3) {
        try {
            int n4 = this.method_16cca6d_Dne(n, n2);
            int n5 = n4 >> 8;
            int n6 = n4 & 0xFF;
            int n7 = (n3 + 5) / 4096 + 1;
            if (n7 >= 256) {
                return;
            }
            if (n5 != 0 && n6 == n7) {
                this.method_5a6cecd3_Dne(n5, byArray, n3);
            } else {
                int n8;
                int n9;
                for (n9 = 0; n9 < n6; ++n9) {
                    this.field_dc9cb15_Dne.set(n5 + n9, true);
                }
                n9 = this.field_dc9cb15_Dne.indexOf(true);
                int n10 = 0;
                if (n9 != -1) {
                    for (n8 = n9; n8 < this.field_dc9cb15_Dne.size(); ++n8) {
                        if (n10 != 0) {
                            n10 = ((Boolean)this.field_dc9cb15_Dne.get(n8)).booleanValue() ? ++n10 : 0;
                        } else if (((Boolean)this.field_dc9cb15_Dne.get(n8)).booleanValue()) {
                            n9 = n8;
                            n10 = 1;
                        }
                        if (n10 >= n7) break;
                    }
                }
                if (n10 >= n7) {
                    n5 = n9;
                    this.method_2c2cf7c9_Dne(n, n2, n9 << 8 | n7);
                    for (n8 = 0; n8 < n7; ++n8) {
                        this.field_dc9cb15_Dne.set(n5 + n8, false);
                    }
                    this.method_5a6cecd3_Dne(n5, byArray, n3);
                } else {
                    this.field_914fb9eb_Dne.seek(this.field_914fb9eb_Dne.length());
                    n5 = this.field_dc9cb15_Dne.size();
                    for (n8 = 0; n8 < n7; ++n8) {
                        this.field_914fb9eb_Dne.write(field_3f1c582_Dne);
                        this.field_dc9cb15_Dne.add(false);
                    }
                    this.field_2092ae_Dne += 4096 * n7;
                    this.method_5a6cecd3_Dne(n5, byArray, n3);
                    this.method_2c2cf7c9_Dne(n, n2, n5 << 8 | n7);
                }
            }
            this.method_a6aca7ca_FWm(n, n2, (int)(System.currentTimeMillis() / 1000L));
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    private int method_16cca6d_Dne(int n, int n2) {
        return this.field_3f1c589_Dne[n + n2 * 32];
    }

    public inq_0(File file) {
        this.field_d102ba32_Dne = file;
        this.field_2092ae_Dne = 0;
        try {
            int n;
            int n2;
            int n3;
            if (file.exists()) {
                this.field_2092af_Dne = file.lastModified();
            }
            this.field_914fb9eb_Dne = new RandomAccessFile(file, "rw");
            if (this.field_914fb9eb_Dne.length() < 4096L) {
                for (n3 = 0; n3 < 1024; ++n3) {
                    this.field_914fb9eb_Dne.writeInt(0);
                }
                for (n3 = 0; n3 < 1024; ++n3) {
                    this.field_914fb9eb_Dne.writeInt(0);
                }
                this.field_2092ae_Dne += 8192;
            }
            if ((this.field_914fb9eb_Dne.length() & 0xFFFL) != 0L) {
                n3 = 0;
                while ((long)n3 < (this.field_914fb9eb_Dne.length() & 0xFFFL)) {
                    this.field_914fb9eb_Dne.write(0);
                    ++n3;
                }
            }
            n3 = (int)this.field_914fb9eb_Dne.length() / 4096;
            this.field_dc9cb15_Dne = new ArrayList(n3);
            for (n2 = 0; n2 < n3; ++n2) {
                this.field_dc9cb15_Dne.add(true);
            }
            this.field_dc9cb15_Dne.set(0, false);
            this.field_dc9cb15_Dne.set(1, false);
            this.field_914fb9eb_Dne.seek(0L);
            for (n2 = 0; n2 < 1024; ++n2) {
                this.field_3f1c589_Dne[n2] = n = this.field_914fb9eb_Dne.readInt();
                if (n == 0 || (n >> 8) + (n & 0xFF) > this.field_dc9cb15_Dne.size()) continue;
                for (int i = 0; i < (n & 0xFF); ++i) {
                    this.field_dc9cb15_Dne.set((n >> 8) + i, false);
                }
            }
            for (n2 = 0; n2 < 1024; ++n2) {
                this.field_4039e0a_FWm[n2] = n = this.field_914fb9eb_Dne.readInt();
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    private boolean method_1e26965d_FWm(int n, int n2) {
        return n < 0 || n >= 32 || n2 < 0 || n2 >= 32;
    }

    public boolean method_16cca7e_Dne(int n, int n2) {
        return this.method_16cca6d_Dne(n, n2) != 0;
    }

    public DataOutputStream method_e4950984_Dne(int n, int n2) {
        return this.method_1e26965d_FWm(n, n2) ? null : new DataOutputStream(new DeflaterOutputStream(new CZC(this, n, n2)));
    }

    public synchronized DataInputStream method_1bd4c347_Dne(int n, int n2) {
        if (this.method_1e26965d_FWm(n, n2)) {
            return null;
        }
        try {
            int n3 = this.method_16cca6d_Dne(n, n2);
            if (n3 == 0) {
                return null;
            }
            int n4 = n3 >> 8;
            int n5 = n3 & 0xFF;
            if (n4 + n5 > this.field_dc9cb15_Dne.size()) {
                return null;
            }
            this.field_914fb9eb_Dne.seek(n4 * 4096);
            int n6 = this.field_914fb9eb_Dne.readInt();
            if (n6 > 4096 * n5) {
                return null;
            }
            if (n6 <= 0) {
                return null;
            }
            byte by = this.field_914fb9eb_Dne.readByte();
            if (by == 1) {
                byte[] byArray = new byte[n6 - 1];
                this.field_914fb9eb_Dne.read(byArray);
                return new DataInputStream(new BufferedInputStream(new GZIPInputStream(new ByteArrayInputStream(byArray))));
            }
            if (by == 2) {
                byte[] byArray = new byte[n6 - 1];
                this.field_914fb9eb_Dne.read(byArray);
                return new DataInputStream(new BufferedInputStream(new InflaterInputStream(new ByteArrayInputStream(byArray))));
            }
            return null;
        }
        catch (IOException iOException) {
            return null;
        }
    }

    private void method_5a6cecd3_Dne(int n, byte[] byArray, int n2) throws IOException {
        this.field_914fb9eb_Dne.seek(n * 4096);
        this.field_914fb9eb_Dne.writeInt(n2 + 1);
        this.field_914fb9eb_Dne.writeByte(2);
        this.field_914fb9eb_Dne.write(byArray, 0, n2);
    }

    private void method_a6aca7ca_FWm(int n, int n2, int n3) throws IOException {
        this.field_4039e0a_FWm[n + n2 * 32] = n3;
        this.field_914fb9eb_Dne.seek(4096 + (n + n2 * 32) * 4);
        this.field_914fb9eb_Dne.writeInt(n3);
    }

    public void method_7a46289a_Dne() throws IOException {
        if (this.field_914fb9eb_Dne != null) {
            this.field_914fb9eb_Dne.close();
        }
    }
}

