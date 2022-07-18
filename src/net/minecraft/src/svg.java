package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

import net.minecraft.client.Minecraft;

public class svg
extends Thread {
    private final InetAddress field_a7571109_Dne;
    private final MulticastSocket field_77f369e_Dne;
    private final jQO field_3773b64_Dne;

    public svg(jQO jQO2) throws IOException {
        super("LanServerDetector");
        this.field_3773b64_Dne = jQO2;
        this.setDaemon(true);
        this.field_77f369e_Dne = new MulticastSocket(4445);
        this.field_a7571109_Dne = InetAddress.getByName("224.0.2.60");
        this.field_77f369e_Dne.setSoTimeout(5000);
        this.field_77f369e_Dne.joinGroup(this.field_a7571109_Dne);
    }

    @Override
    public void run() {
        byte[] byArray = new byte[1024];
        while (!this.isInterrupted()) {
            DatagramPacket datagramPacket = new DatagramPacket(byArray, byArray.length);
            try {
                this.field_77f369e_Dne.receive(datagramPacket);
            }
            catch (SocketTimeoutException socketTimeoutException) {
                continue;
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
                break;
            }
            String string = new String(datagramPacket.getData(), datagramPacket.getOffset(), datagramPacket.getLength());
            Minecraft.method_81a5f12e_Dne().method_230e0120_Dne().method_a9a920ab_Qnq(datagramPacket.getAddress() + ": " + string);
            this.field_3773b64_Dne.method_2006b72_Dne(string, datagramPacket.getAddress());
        }
        try {
            this.field_77f369e_Dne.leaveGroup(this.field_a7571109_Dne);
        }
        catch (IOException iOException) {
            // empty catch block
        }
        this.field_77f369e_Dne.close();
    }
}

