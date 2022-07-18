package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.List;

public abstract class JTM
implements Runnable {
    protected List<Closeable> field_f27c122c_Dne = new ArrayList();
    protected Thread field_7709e06c_Dne;
    protected xnW field_37e066b_Dne;
    protected List<Closeable> field_6a0474ed_FWm = new ArrayList();
    protected boolean field_2092bf_Dne = false;
    protected int field_2092ae_Dne = 5;

    protected int method_7a46288d_Dne() {
        return this.field_37e066b_Dne.method_ae128dba_bzF();
    }

    protected void method_8f501fe4_Dne(String string) {
        this.field_37e066b_Dne.method_a9a920ab_Qnq(string);
    }

    protected void method_110c4dc3_FWm(String string) {
        this.field_37e066b_Dne.method_b33f04a1_a_(string);
    }

    protected void method_20064d4_Dne(DatagramSocket datagramSocket) {
        this.method_8f501fe4_Dne("registerSocket: " + datagramSocket);
        this.field_f27c122c_Dne.add(datagramSocket);
    }

    protected void method_a9a920ab_Qnq(String string) {
        this.field_37e066b_Dne.method_47a073d1_bzF(string);
    }

    protected boolean method_9db00046_Dne(ServerSocket serverSocket, boolean bl) {
        this.method_8f501fe4_Dne("closeSocket: " + serverSocket);
        if (null == serverSocket) {
            return false;
        }
        boolean bl2 = false;
        try {
            if (!serverSocket.isClosed()) {
                serverSocket.close();
                bl2 = true;
            }
        }
        catch (IOException iOException) {
            this.method_47a073d1_bzF("IO: " + iOException.getMessage());
        }
        if (bl) {
            this.field_6a0474ed_FWm.remove(serverSocket);
        }
        return bl2;
    }

    public synchronized void method_7a46289a_Dne() {
        this.field_7709e06c_Dne = new Thread(this);
        this.field_7709e06c_Dne.start();
        this.field_2092bf_Dne = true;
    }

    protected boolean method_3e0ce884_Dne(DatagramSocket datagramSocket, boolean bl) {
        this.method_8f501fe4_Dne("closeSocket: " + datagramSocket);
        if (null == datagramSocket) {
            return false;
        }
        boolean bl2 = false;
        if (!datagramSocket.isClosed()) {
            datagramSocket.close();
            bl2 = true;
        }
        if (bl) {
            this.field_f27c122c_Dne.remove(datagramSocket);
        }
        return bl2;
    }

    public boolean method_7a46289e_Dne() {
        return this.field_2092bf_Dne;
    }

    JTM(xnW xnW2) {
        this.field_37e066b_Dne = xnW2;
        if (this.field_37e066b_Dne.method_d44b4596_zGp()) {
            this.method_47a073d1_bzF("Debugging is enabled, performance maybe reduced!");
        }
    }

    protected void method_ce7f9d7a_Dne(boolean bl) {
        int n = 0;
        for (Closeable closeable : this.field_f27c122c_Dne) {
            if (!this.method_3e0ce884_Dne((DatagramSocket)closeable, false)) continue;
            ++n;
        }
        this.field_f27c122c_Dne.clear();
        for (Closeable closeable : this.field_6a0474ed_FWm) {
            if (!this.method_9db00046_Dne((ServerSocket)closeable, false)) continue;
            ++n;
        }
        this.field_6a0474ed_FWm.clear();
        if (bl && 0 < n) {
            this.method_47a073d1_bzF("Force closed " + n + " sockets");
        }
    }

    protected void method_7c6f6039_FWm() {
        this.method_ce7f9d7a_Dne(false);
    }

    protected boolean method_159a4cd6_Dne(ServerSocket serverSocket) {
        return this.method_9db00046_Dne(serverSocket, true);
    }

    protected void method_47a073d1_bzF(String string) {
        this.field_37e066b_Dne.method_110c4dc3_FWm(string);
    }
}

