package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import net.minecraft.client.Minecraft;

public class TWE
extends Thread {
    private final DatagramSocket field_acef1299_Dne;
    private boolean field_2092bf_Dne = true;
    private final String field_d9a85c6_FWm;
    private final String field_569fcf45_Dne;

    public static String method_39193c_Dne(String string) {
        int n = string.indexOf("[MOTD]");
        if (n < 0) {
            return "missing no";
        }
        int n2 = string.indexOf("[/MOTD]", n + "[MOTD]".length());
        return n2 < n ? "missing no" : string.substring(n + "[MOTD]".length(), n2);
    }

    public static String method_603a0db2_Dne(String string, String string2) {
        return "[MOTD]" + string + "[/MOTD][AD]" + string2 + "[/AD]";
    }

    @Override
    public void interrupt() {
        super.interrupt();
        this.field_2092bf_Dne = false;
    }

    public static String method_8dd0853d_FWm(String string) {
        int n = string.indexOf("[/MOTD]");
        if (n < 0) {
            return null;
        }
        int n2 = string.indexOf("[/MOTD]", n + "[/MOTD]".length());
        if (n2 >= 0) {
            return null;
        }
        int n3 = string.indexOf("[AD]", n + "[/MOTD]".length());
        if (n3 < 0) {
            return null;
        }
        int n4 = string.indexOf("[/AD]", n3 + "[AD]".length());
        return n4 < n3 ? null : string.substring(n3 + "[AD]".length(), n4);
    }

    @Override
    public void run() {
        String string = TWE.method_603a0db2_Dne(this.field_569fcf45_Dne, this.field_d9a85c6_FWm);
        byte[] byArray = string.getBytes();
        while (!this.isInterrupted() && this.field_2092bf_Dne) {
            try {
                InetAddress inetAddress = InetAddress.getByName("224.0.2.60");
                DatagramPacket datagramPacket = new DatagramPacket(byArray, byArray.length, inetAddress, 4445);
                this.field_acef1299_Dne.send(datagramPacket);
            }
            catch (IOException iOException) {
                Minecraft.method_81a5f12e_Dne().method_230e0120_Dne().method_110c4dc3_FWm("LanServerPinger: " + iOException.getMessage());
                break;
            }
            try {
                TWE.sleep(1500L);
            }
            catch (InterruptedException interruptedException) {}
        }
    }

    public TWE(String string, String string2) throws SocketException {
        super("LanServerPinger");
        this.field_569fcf45_Dne = string;
        this.field_d9a85c6_FWm = string2;
        this.setDaemon(true);
        this.field_acef1299_Dne = new DatagramSocket();
    }
}

