package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;

/*
 * Renamed from oea
 */
public class oea_0
extends JTM {
    private String field_569fcf45_Dne;
    private Socket field_448254da_Dne;
    private boolean field_21261e_FWm = false;
    private byte[] field_3f1c582_Dne = new byte[1460];

    private void method_fa81cf33_Dne(int n, String string) throws IOException {
        int n2;
        int n3 = string.length();
        do {
            n2 = 4096 <= n3 ? 4096 : n3;
            this.method_f58609c4_Dne(n, 0, string.substring(0, n2));
        } while (0 != (n3 = (string = string.substring(n2)).length()));
    }

    oea_0(xnW xnW2, Socket socket) {
        super(xnW2);
        this.field_448254da_Dne = socket;
        try {
            this.field_448254da_Dne.setSoTimeout(0);
        }
        catch (Exception exception) {
            this.field_2092bf_Dne = false;
        }
        this.field_569fcf45_Dne = xnW2.method_603a0db2_Dne("rcon.password", "");
        this.method_110c4dc3_FWm("Rcon connection from: " + socket.getInetAddress());
    }

    private void method_f58609c4_Dne(int n, int n2, String string) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1248);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeInt(Integer.reverseBytes(string.length() + 10));
        dataOutputStream.writeInt(Integer.reverseBytes(n));
        dataOutputStream.writeInt(Integer.reverseBytes(n2));
        dataOutputStream.writeBytes(string);
        dataOutputStream.write(0);
        dataOutputStream.write(0);
        this.field_448254da_Dne.getOutputStream().write(byteArrayOutputStream.toByteArray());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        try {
            block14: while (true) {
                if (!this.field_2092bf_Dne) {
                    return;
                }
                BufferedInputStream bufferedInputStream = new BufferedInputStream(this.field_448254da_Dne.getInputStream());
                int n = bufferedInputStream.read(this.field_3f1c582_Dne, 0, 1460);
                if (10 > n) continue;
                int n2 = 0;
                int n3 = iwf.method_77c70af4_Dne(this.field_3f1c582_Dne, 0, n);
                if (n3 != n - 4) {
                    return;
                }
                int n4 = n2 + 4;
                int n5 = iwf.method_77c70af4_Dne(this.field_3f1c582_Dne, n4, n);
                int n6 = iwf.method_2d277035_Dne(this.field_3f1c582_Dne, n4 += 4);
                n4 += 4;
                switch (n6) {
                    case 2: {
                        String string;
                        if (this.field_21261e_FWm) {
                            string = iwf.method_819c2bbf_Dne(this.field_3f1c582_Dne, n4, n);
                            try {
                                this.method_fa81cf33_Dne(n5, this.field_37e066b_Dne.method_39193c_Dne(string));
                            }
                            catch (Exception exception) {
                                this.method_fa81cf33_Dne(n5, "Error executing: " + string + " (" + exception.getMessage() + ")");
                            }
                            continue block14;
                        }
                        this.method_ae128dc7_bzF();
                        continue block14;
                    }
                    case 3: {
                        String string = iwf.method_819c2bbf_Dne(this.field_3f1c582_Dne, n4, n);
                        int n7 = n4 + string.length();
                        if (0 != string.length() && string.equals(this.field_569fcf45_Dne)) {
                            this.field_21261e_FWm = true;
                            this.method_f58609c4_Dne(n5, 2, "");
                            continue block14;
                        }
                        this.field_21261e_FWm = false;
                        this.method_ae128dc7_bzF();
                        continue block14;
                    }
                }
                this.method_fa81cf33_Dne(n5, String.format("Unknown request %s", Integer.toHexString(n6)));
            }
        }
        catch (SocketTimeoutException socketTimeoutException) {
            return;
        }
        catch (IOException iOException) {
            return;
        }
        catch (Exception exception) {
            System.out.println(exception);
            return;
        }
        finally {
            this.method_907a9d21_Qnq();
        }
    }

    private void method_907a9d21_Qnq() {
        if (null != this.field_448254da_Dne) {
            try {
                this.field_448254da_Dne.close();
            }
            catch (IOException iOException) {
                this.method_47a073d1_bzF("IO: " + iOException.getMessage());
            }
            this.field_448254da_Dne = null;
        }
    }

    private void method_ae128dc7_bzF() throws IOException {
        this.method_f58609c4_Dne(-1, 2, "");
    }
}

