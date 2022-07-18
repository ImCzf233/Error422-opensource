package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.PortUnreachableException;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class wGj
extends JTM {
    private Map field_83b1c1b0_Dne;
    private String field_d9a85c6_FWm;
    private DatagramSocket field_acef1299_Dne = null;
    private Map field_da2182cf_FWm;
    private int field_2e5f1b_bzF;
    private long field_2092af_Dne;
    private long field_2e5f1c_bzF;
    private long field_21260e_FWm;
    private ybG field_37e4bce_Dne;
    private int field_21260d_FWm;
    private String field_c480ca78_bzF;
    private int field_267cf5_Qnq;
    private DatagramPacket field_f6588824_Dne = null;
    private String field_569fcf45_Dne;
    private String field_9e60dbde_Qnq;
    private byte[] field_3f1c582_Dne = new byte[1460];

    @Override
    public void run() {
        this.method_110c4dc3_FWm("Query running on " + this.field_9e60dbde_Qnq + ":" + this.field_21260d_FWm);
        this.field_2092af_Dne = System.currentTimeMillis();
        this.field_f6588824_Dne = new DatagramPacket(this.field_3f1c582_Dne, this.field_3f1c582_Dne.length);
        try {
            while (this.field_2092bf_Dne) {
                try {
                    this.field_acef1299_Dne.receive(this.field_f6588824_Dne);
                    this.method_ae128dc7_bzF();
                    this.method_96e2a3a3_Dne(this.field_f6588824_Dne);
                }
                catch (SocketTimeoutException socketTimeoutException) {
                    this.method_ae128dc7_bzF();
                }
                catch (PortUnreachableException portUnreachableException) {
                }
                catch (IOException iOException) {
                    this.method_95840a2c_Dne(iOException);
                }
            }
        }
        finally {
            this.method_7c6f6039_FWm();
        }
    }

    private void method_e3d2bb38_Dne(byte[] byArray, DatagramPacket datagramPacket) throws IOException {
        this.field_acef1299_Dne.send(new DatagramPacket(byArray, byArray.length, datagramPacket.getSocketAddress()));
    }

    public wGj(xnW xnW2) {
        super(xnW2);
        this.field_21260d_FWm = xnW2.method_5ab44f92_Dne("query.port", 0);
        this.field_9e60dbde_Qnq = xnW2.method_d1f1ed87_FWm();
        this.field_2e5f1b_bzF = xnW2.method_7c6f602c_FWm();
        this.field_569fcf45_Dne = xnW2.method_6859cdb9_bzF();
        this.field_267cf5_Qnq = xnW2.method_907a9d14_Qnq();
        this.field_d9a85c6_FWm = xnW2.method_c6f17a40_aFZ();
        this.field_2e5f1c_bzF = 0L;
        this.field_c480ca78_bzF = "0.0.0.0";
        if (0 != this.field_9e60dbde_Qnq.length() && !this.field_c480ca78_bzF.equals(this.field_9e60dbde_Qnq)) {
            this.field_c480ca78_bzF = this.field_9e60dbde_Qnq;
        } else {
            this.field_9e60dbde_Qnq = "0.0.0.0";
            try {
                InetAddress inetAddress = InetAddress.getLocalHost();
                this.field_c480ca78_bzF = inetAddress.getHostAddress();
            }
            catch (UnknownHostException unknownHostException) {
                this.method_47a073d1_bzF("Unable to determine local host IP, please set server-ip in '" + xnW2.method_eecad346_Dne() + "' : " + unknownHostException.getMessage());
            }
        }
        if (0 == this.field_21260d_FWm) {
            this.field_21260d_FWm = this.field_2e5f1b_bzF;
            this.method_110c4dc3_FWm("Setting default query port to " + this.field_21260d_FWm);
            xnW2.method_5e295ec0_Dne("query.port", this.field_21260d_FWm);
            xnW2.method_5e295ec0_Dne("debug", false);
            xnW2.method_7a46289a_Dne();
        }
        this.field_83b1c1b0_Dne = new HashMap();
        this.field_37e4bce_Dne = new ybG(1460);
        this.field_da2182cf_FWm = new HashMap();
        this.field_21260e_FWm = new Date().getTime();
    }

    private boolean method_96e2a3a3_Dne(DatagramPacket datagramPacket) throws IOException {
        byte[] byArray = datagramPacket.getData();
        int n = datagramPacket.getLength();
        SocketAddress socketAddress = datagramPacket.getSocketAddress();
        this.method_8f501fe4_Dne("Packet len " + n + " [" + socketAddress + "]");
        if (3 <= n && -2 == byArray[0] && -3 == byArray[1]) {
            this.method_8f501fe4_Dne("Packet '" + iwf.method_d6a1a17e_Dne(byArray[2]) + "' [" + socketAddress + "]");
            switch (byArray[2]) {
                case 0: {
                    if (!this.method_860bab5c_Dne(datagramPacket).booleanValue()) {
                        this.method_8f501fe4_Dne("Invalid challenge [" + socketAddress + "]");
                        return false;
                    }
                    if (15 == n) {
                        this.method_e3d2bb38_Dne(this.method_4571d11e_Dne(datagramPacket), datagramPacket);
                        this.method_8f501fe4_Dne("Rules [" + socketAddress + "]");
                    } else {
                        ybG ybG2 = new ybG(1460);
                        ybG2.method_ce7f5da9_Dne(0);
                        ybG2.method_174dee1_Dne(this.method_748589f6_Dne(datagramPacket.getSocketAddress()));
                        ybG2.method_8f501fe4_Dne(this.field_569fcf45_Dne);
                        ybG2.method_8f501fe4_Dne("SMP");
                        ybG2.method_8f501fe4_Dne(this.field_d9a85c6_FWm);
                        ybG2.method_8f501fe4_Dne(Integer.toString(this.method_7a46288d_Dne()));
                        ybG2.method_8f501fe4_Dne(Integer.toString(this.field_267cf5_Qnq));
                        ybG2.method_ce7f8333_Dne((short)this.field_2e5f1b_bzF);
                        ybG2.method_8f501fe4_Dne(this.field_c480ca78_bzF);
                        this.method_e3d2bb38_Dne(ybG2.method_ce7eeb83_Dne(), datagramPacket);
                        this.method_8f501fe4_Dne("Status [" + socketAddress + "]");
                    }
                }
                case 9: {
                    this.method_96e2a39f_Dne(datagramPacket);
                    this.method_8f501fe4_Dne("Challenge [" + socketAddress + "]");
                    return true;
                }
            }
            return true;
        }
        this.method_8f501fe4_Dne("Invalid packet [" + socketAddress + "]");
        return false;
    }

    private byte[] method_748589f6_Dne(SocketAddress socketAddress) {
        return ((cFo)this.field_da2182cf_FWm.get(socketAddress)).method_117ca7c4_FWm();
    }

    private void method_ae128dc7_bzF() {
        long l;
        if (this.field_2092bf_Dne && (l = System.currentTimeMillis()) >= this.field_2092af_Dne + 30000L) {
            this.field_2092af_Dne = l;
            Iterator<Map.Entry> iterator = this.field_da2182cf_FWm.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry entry = iterator.next();
                if (!((cFo)entry.getValue()).method_6eeeac67_Dne(l).booleanValue()) continue;
                iterator.remove();
            }
        }
    }

    private void method_96e2a39f_Dne(DatagramPacket datagramPacket) throws IOException {
        cFo cFo2 = new cFo(this, datagramPacket);
        this.field_da2182cf_FWm.put(datagramPacket.getSocketAddress(), cFo2);
        this.method_e3d2bb38_Dne(cFo2.method_ce7eeb83_Dne(), datagramPacket);
    }

    private byte[] method_4571d11e_Dne(DatagramPacket datagramPacket) throws IOException {
        long l = System.currentTimeMillis();
        if (l < this.field_2e5f1c_bzF + 5000L) {
            byte[] byArray = this.field_37e4bce_Dne.method_ce7eeb83_Dne();
            byte[] byArray2 = this.method_748589f6_Dne(datagramPacket.getSocketAddress());
            byArray[1] = byArray2[0];
            byArray[2] = byArray2[1];
            byArray[3] = byArray2[2];
            byArray[4] = byArray2[3];
            return byArray;
        }
        this.field_2e5f1c_bzF = l;
        this.field_37e4bce_Dne.method_7a46289a_Dne();
        this.field_37e4bce_Dne.method_ce7f5da9_Dne(0);
        this.field_37e4bce_Dne.method_174dee1_Dne(this.method_748589f6_Dne(datagramPacket.getSocketAddress()));
        this.field_37e4bce_Dne.method_8f501fe4_Dne("splitnum");
        this.field_37e4bce_Dne.method_ce7f5da9_Dne(128);
        this.field_37e4bce_Dne.method_ce7f5da9_Dne(0);
        this.field_37e4bce_Dne.method_8f501fe4_Dne("hostname");
        this.field_37e4bce_Dne.method_8f501fe4_Dne(this.field_569fcf45_Dne);
        this.field_37e4bce_Dne.method_8f501fe4_Dne("gametype");
        this.field_37e4bce_Dne.method_8f501fe4_Dne("SMP");
        this.field_37e4bce_Dne.method_8f501fe4_Dne("game_id");
        this.field_37e4bce_Dne.method_8f501fe4_Dne("MINECRAFT");
        this.field_37e4bce_Dne.method_8f501fe4_Dne("version");
        this.field_37e4bce_Dne.method_8f501fe4_Dne(this.field_37e066b_Dne.method_4a7b1d9f_Qnq());
        this.field_37e4bce_Dne.method_8f501fe4_Dne("plugins");
        this.field_37e4bce_Dne.method_8f501fe4_Dne(this.field_37e066b_Dne.method_a174454e_zGp());
        this.field_37e4bce_Dne.method_8f501fe4_Dne("map");
        this.field_37e4bce_Dne.method_8f501fe4_Dne(this.field_d9a85c6_FWm);
        this.field_37e4bce_Dne.method_8f501fe4_Dne("numplayers");
        this.field_37e4bce_Dne.method_8f501fe4_Dne("" + this.method_7a46288d_Dne());
        this.field_37e4bce_Dne.method_8f501fe4_Dne("maxplayers");
        this.field_37e4bce_Dne.method_8f501fe4_Dne("" + this.field_267cf5_Qnq);
        this.field_37e4bce_Dne.method_8f501fe4_Dne("hostport");
        this.field_37e4bce_Dne.method_8f501fe4_Dne("" + this.field_2e5f1b_bzF);
        this.field_37e4bce_Dne.method_8f501fe4_Dne("hostip");
        this.field_37e4bce_Dne.method_8f501fe4_Dne(this.field_c480ca78_bzF);
        this.field_37e4bce_Dne.method_ce7f5da9_Dne(0);
        this.field_37e4bce_Dne.method_ce7f5da9_Dne(1);
        this.field_37e4bce_Dne.method_8f501fe4_Dne("player_");
        this.field_37e4bce_Dne.method_ce7f5da9_Dne(0);
        String[] stringArray = this.field_37e066b_Dne.method_631ac9e9_Dne();
        byte by = (byte)stringArray.length;
        for (byte by2 = (byte)(by - 1); by2 >= 0; by2 = (byte)(by2 - 1)) {
            this.field_37e4bce_Dne.method_8f501fe4_Dne(stringArray[by2]);
        }
        this.field_37e4bce_Dne.method_ce7f5da9_Dne(0);
        return this.field_37e4bce_Dne.method_ce7eeb83_Dne();
    }

    @Override
    public void method_7a46289a_Dne() {
        if (!this.field_2092bf_Dne) {
            if (0 < this.field_21260d_FWm && 65535 >= this.field_21260d_FWm) {
                if (this.method_7c6f603d_FWm()) {
                    super.method_7a46289a_Dne();
                }
            } else {
                this.method_47a073d1_bzF("Invalid query port " + this.field_21260d_FWm + " found in '" + this.field_37e066b_Dne.method_eecad346_Dne() + "' (queries disabled)");
            }
        }
    }

    private Boolean method_860bab5c_Dne(DatagramPacket datagramPacket) {
        SocketAddress socketAddress = datagramPacket.getSocketAddress();
        if (!this.field_da2182cf_FWm.containsKey(socketAddress)) {
            return false;
        }
        byte[] byArray = datagramPacket.getData();
        return ((cFo)this.field_da2182cf_FWm.get(socketAddress)).method_7a46288d_Dne() != iwf.method_4d3d5b13_FWm(byArray, 7, datagramPacket.getLength()) ? Boolean.valueOf(false) : Boolean.valueOf(true);
    }

    private boolean method_7c6f603d_FWm() {
        try {
            this.field_acef1299_Dne = new DatagramSocket(this.field_21260d_FWm, InetAddress.getByName(this.field_9e60dbde_Qnq));
            this.method_20064d4_Dne(this.field_acef1299_Dne);
            this.field_acef1299_Dne.setSoTimeout(500);
            return true;
        }
        catch (SocketException socketException) {
            this.method_47a073d1_bzF("Unable to initialise query system on " + this.field_9e60dbde_Qnq + ":" + this.field_21260d_FWm + " (Socket): " + socketException.getMessage());
        }
        catch (UnknownHostException unknownHostException) {
            this.method_47a073d1_bzF("Unable to initialise query system on " + this.field_9e60dbde_Qnq + ":" + this.field_21260d_FWm + " (Unknown Host): " + unknownHostException.getMessage());
        }
        catch (Exception exception) {
            this.method_47a073d1_bzF("Unable to initialise query system on " + this.field_9e60dbde_Qnq + ":" + this.field_21260d_FWm + " (E): " + exception.getMessage());
        }
        return false;
    }

    private void method_95840a2c_Dne(Exception exception) {
        if (this.field_2092bf_Dne) {
            this.method_47a073d1_bzF("Unexpected exception, buggy JRE? (" + exception.toString() + ")");
            if (!this.method_7c6f603d_FWm()) {
                this.method_a9a920ab_Qnq("Failed to recover from buggy JRE, shutting down!");
                this.field_2092bf_Dne = false;
            }
        }
    }
}

