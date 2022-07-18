package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class pOU
extends Thread {
    private NuQ field_36b0862_Dne;
    private final List field_f27c122c_Dne = Collections.synchronizedList(new ArrayList());
    private final ServerSocket field_c7020e97_Dne;
    private final HashMap field_ecf0af5e_Dne = new HashMap();
    private final InetAddress field_a7571109_Dne;
    private int field_2092ae_Dne = 0;
    private final int field_21260d_FWm;

    @Override
    public void run() {
        while (this.field_36b0862_Dne.field_2092bf_Dne) {
            try {
                Socket socket = this.field_c7020e97_Dne.accept();
                dnH dnH2 = new dnH(this.field_36b0862_Dne.method_2302cf90_Dne(), socket, "Connection #" + this.field_2092ae_Dne++);
                this.method_a3aad129_Dne(dnH2);
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        this.field_36b0862_Dne.method_2302cf90_Dne().method_230e0120_Dne().method_8f501fe4_Dne("Closing listening thread");
    }

    public pOU(NuQ nuQ, InetAddress inetAddress, int n) throws IOException {
        super("Listen thread");
        this.field_36b0862_Dne = nuQ;
        this.field_21260d_FWm = n;
        this.field_c7020e97_Dne = new ServerSocket(n, 0, inetAddress);
        this.field_a7571109_Dne = inetAddress == null ? this.field_c7020e97_Dne.getInetAddress() : inetAddress;
        this.field_c7020e97_Dne.setPerformancePreferences(0, 2, 1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void method_a3aad129_Dne(dnH dnH2) {
        if (dnH2 == null) {
            throw new IllegalArgumentException("Got null pendingconnection!");
        }
        List list = this.field_f27c122c_Dne;
        List list2 = this.field_f27c122c_Dne;
        synchronized (list2) {
            this.field_f27c122c_Dne.add(dnH2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void method_7a46289a_Dne() {
        List list = this.field_f27c122c_Dne;
        List list2 = this.field_f27c122c_Dne;
        synchronized (list2) {
            for (int i = 0; i < this.field_f27c122c_Dne.size(); ++i) {
                dnH dnH2 = (dnH)this.field_f27c122c_Dne.get(i);
                try {
                    dnH2.method_7a46289a_Dne();
                }
                catch (Exception exception) {
                    dnH2.method_8f501fe4_Dne("Internal server error");
                    this.field_36b0862_Dne.method_2302cf90_Dne().method_230e0120_Dne().method_37db6a91_Dne("Failed to handle packet for " + dnH2.method_eecad346_Dne() + ": " + exception, exception);
                }
                if (dnH2.field_2092bf_Dne) {
                    this.field_f27c122c_Dne.remove(i--);
                }
                dnH2.field_36c7844_Dne.method_7a46289a_Dne();
            }
        }
    }

    public int method_7a46288d_Dne() {
        return this.field_21260d_FWm;
    }

    public InetAddress method_6a6e2c8a_Dne() {
        return this.field_a7571109_Dne;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void method_fc8367a8_Dne(InetAddress inetAddress) {
        if (inetAddress != null) {
            HashMap hashMap = this.field_ecf0af5e_Dne;
            HashMap hashMap2 = this.field_ecf0af5e_Dne;
            synchronized (hashMap2) {
                this.field_ecf0af5e_Dne.remove(inetAddress);
            }
        }
    }

    public void method_7c6f6039_FWm() {
        try {
            this.field_c7020e97_Dne.close();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }
}

