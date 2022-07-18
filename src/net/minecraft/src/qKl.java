package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class qKl
extends JTM {
    private ServerSocket field_c7020e97_Dne = null;
    private Map field_83b1c1b0_Dne;
    private int field_2e5f1b_bzF;
    private int field_21260d_FWm;
    private String field_569fcf45_Dne;
    private String field_d9a85c6_FWm;

    @Override
    public void method_7a46289a_Dne() {
        if (0 == this.field_d9a85c6_FWm.length()) {
            this.method_47a073d1_bzF("No rcon password set in '" + this.field_37e066b_Dne.method_eecad346_Dne() + "', rcon disabled!");
        } else if (0 < this.field_21260d_FWm && 65535 >= this.field_21260d_FWm) {
            if (!this.field_2092bf_Dne) {
                try {
                    this.field_c7020e97_Dne = new ServerSocket(this.field_21260d_FWm, 0, InetAddress.getByName(this.field_569fcf45_Dne));
                    this.field_c7020e97_Dne.setSoTimeout(500);
                    super.method_7a46289a_Dne();
                }
                catch (IOException iOException) {
                    this.method_47a073d1_bzF("Unable to initialise rcon on " + this.field_569fcf45_Dne + ":" + this.field_21260d_FWm + " : " + iOException.getMessage());
                }
            }
        } else {
            this.method_47a073d1_bzF("Invalid rcon port " + this.field_21260d_FWm + " found in '" + this.field_37e066b_Dne.method_eecad346_Dne() + "', rcon disabled!");
        }
    }

    private void method_ae128dc7_bzF() {
        this.field_83b1c1b0_Dne = new HashMap();
    }

    public qKl(xnW xnW2) {
        super(xnW2);
        this.field_21260d_FWm = xnW2.method_5ab44f92_Dne("rcon.port", 0);
        this.field_d9a85c6_FWm = xnW2.method_603a0db2_Dne("rcon.password", "");
        this.field_569fcf45_Dne = xnW2.method_d1f1ed87_FWm();
        this.field_2e5f1b_bzF = xnW2.method_7c6f602c_FWm();
        if (0 == this.field_21260d_FWm) {
            this.field_21260d_FWm = this.field_2e5f1b_bzF + 10;
            this.method_110c4dc3_FWm("Setting default rcon port to " + this.field_21260d_FWm);
            xnW2.method_5e295ec0_Dne("rcon.port", this.field_21260d_FWm);
            if (0 == this.field_d9a85c6_FWm.length()) {
                xnW2.method_5e295ec0_Dne("rcon.password", "");
            }
            xnW2.method_7a46289a_Dne();
        }
        if (0 == this.field_569fcf45_Dne.length()) {
            this.field_569fcf45_Dne = "0.0.0.0";
        }
        this.method_ae128dc7_bzF();
        this.field_c7020e97_Dne = null;
    }

    private void method_907a9d21_Qnq() {
        Iterator<Map.Entry> iterator = this.field_83b1c1b0_Dne.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            if (((oea_0)entry.getValue()).method_7a46289e_Dne()) continue;
            iterator.remove();
        }
    }

    @Override
    public void run() {
        this.method_110c4dc3_FWm("RCON running on " + this.field_569fcf45_Dne + ":" + this.field_21260d_FWm);
        try {
            while (this.field_2092bf_Dne) {
                try {
                    Socket socket = this.field_c7020e97_Dne.accept();
                    socket.setSoTimeout(500);
                    oea_0 oea_02 = new oea_0(this.field_37e066b_Dne, socket);
                    oea_02.method_7a46289a_Dne();
                    this.field_83b1c1b0_Dne.put(socket.getRemoteSocketAddress(), oea_02);
                    this.method_907a9d21_Qnq();
                }
                catch (SocketTimeoutException socketTimeoutException) {
                    this.method_907a9d21_Qnq();
                }
                catch (IOException iOException) {
                    if (!this.field_2092bf_Dne) continue;
                    this.method_110c4dc3_FWm("IO: " + iOException.getMessage());
                }
            }
        }
        finally {
            this.method_159a4cd6_Dne(this.field_c7020e97_Dne);
        }
    }
}

