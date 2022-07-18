package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.net.DatagramPacket;
import java.util.Date;
import java.util.Random;

class cFo {
    private int field_2092ae_Dne;
    private byte[] field_4039e03_FWm;
    private String field_569fcf45_Dne;
    final wGj field_37d01f2_Dne;
    private byte[] field_3f1c582_Dne;
    private long field_2092af_Dne;

    public cFo(wGj wGj2, DatagramPacket datagramPacket) {
        this.field_37d01f2_Dne = wGj2;
        this.field_2092af_Dne = new Date().getTime();
        byte[] byArray = datagramPacket.getData();
        this.field_3f1c582_Dne = new byte[4];
        this.field_3f1c582_Dne[0] = byArray[3];
        this.field_3f1c582_Dne[1] = byArray[4];
        this.field_3f1c582_Dne[2] = byArray[5];
        this.field_3f1c582_Dne[3] = byArray[6];
        this.field_569fcf45_Dne = new String(this.field_3f1c582_Dne);
        this.field_2092ae_Dne = new Random().nextInt(0x1000000);
        this.field_4039e03_FWm = String.format("\t%s%d\u0000", this.field_569fcf45_Dne, this.field_2092ae_Dne).getBytes();
    }

    public byte[] method_117ca7c4_FWm() {
        return this.field_3f1c582_Dne;
    }

    public byte[] method_ce7eeb83_Dne() {
        return this.field_4039e03_FWm;
    }

    public Boolean method_6eeeac67_Dne(long l) {
        return this.field_2092af_Dne < l;
    }

    public int method_7a46288d_Dne() {
        return this.field_2092ae_Dne;
    }
}

