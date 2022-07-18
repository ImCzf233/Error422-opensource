package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class nPC
extends NER {
    private static byte[] field_4039e03_FWm = new byte[0];
    private int[] field_59d86bc_bzF;
    public int[] field_3f1c589_Dne;
    private int field_2092ae_Dne;
    private byte[][] field_7a46ee07_Dne;
    private byte[] field_3f1c582_Dne;
    private boolean field_2092bf_Dne;
    public int[] field_4039e0a_FWm;
    private int[] field_4a92422_Qnq;

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        int n = dataInputStream.readShort();
        this.field_2092ae_Dne = dataInputStream.readInt();
        this.field_2092bf_Dne = dataInputStream.readBoolean();
        this.field_59d86bc_bzF = new int[n];
        this.field_4a92422_Qnq = new int[n];
        this.field_3f1c589_Dne = new int[n];
        this.field_4039e0a_FWm = new int[n];
        this.field_7a46ee07_Dne = new byte[n][];
        if (field_4039e03_FWm.length < this.field_2092ae_Dne) {
            field_4039e03_FWm = new byte[this.field_2092ae_Dne];
        }
        dataInputStream.readFully(field_4039e03_FWm, 0, this.field_2092ae_Dne);
        byte[] byArray = new byte[196864 * n];
        Inflater inflater = new Inflater();
        inflater.setInput(field_4039e03_FWm, 0, this.field_2092ae_Dne);
        try {
            inflater.inflate(byArray);
        }
        catch (DataFormatException dataFormatException) {
            throw new IOException("Bad compressed data format");
        }
        finally {
            inflater.end();
        }
        int n2 = 0;
        for (int i = 0; i < n; ++i) {
            int n3;
            this.field_59d86bc_bzF[i] = dataInputStream.readInt();
            this.field_4a92422_Qnq[i] = dataInputStream.readInt();
            this.field_3f1c589_Dne[i] = dataInputStream.readShort();
            this.field_4039e0a_FWm[i] = dataInputStream.readShort();
            int n4 = 0;
            int n5 = 0;
            for (n3 = 0; n3 < 16; ++n3) {
                n4 += this.field_3f1c589_Dne[i] >> n3 & 1;
                n5 += this.field_4039e0a_FWm[i] >> n3 & 1;
            }
            n3 = 8192 * n4 + 256;
            n3 += 2048 * n5;
            if (this.field_2092bf_Dne) {
                n3 += 2048 * n4;
            }
            this.field_7a46ee07_Dne[i] = new byte[n3];
            System.arraycopy(byArray, n2, this.field_7a46ee07_Dne[i], 0, n3);
            n2 += n3;
        }
    }

    public nPC() {
    }

    public byte[] method_16c5854_Dne(int n) {
        return this.field_7a46ee07_Dne[n];
    }

    public int method_117d19dd_FWm(int n) {
        return this.field_4a92422_Qnq[n];
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public nPC(List list) {
        int n = list.size();
        this.field_59d86bc_bzF = new int[n];
        this.field_4a92422_Qnq = new int[n];
        this.field_3f1c589_Dne = new int[n];
        this.field_4039e0a_FWm = new int[n];
        this.field_7a46ee07_Dne = new byte[n][];
        this.field_2092bf_Dne = !list.isEmpty() && !((qMV)list.get((int)0)).field_36c4f18_Dne.field_3690d00_Dne.field_21261e_FWm;
        int n2 = 0;
        for (int i = 0; i < n; ++i) {
            qMV qMV2 = (qMV)list.get(i);
            uqn uqn2 = pKI.method_36bd3e5b_Dne(qMV2, true, 65535);
            if (field_4039e03_FWm.length < n2 + uqn2.field_3f1c582_Dne.length) {
                byte[] byArray = new byte[n2 + uqn2.field_3f1c582_Dne.length];
                System.arraycopy(field_4039e03_FWm, 0, byArray, 0, field_4039e03_FWm.length);
                field_4039e03_FWm = byArray;
            }
            System.arraycopy(uqn2.field_3f1c582_Dne, 0, field_4039e03_FWm, n2, uqn2.field_3f1c582_Dne.length);
            n2 += uqn2.field_3f1c582_Dne.length;
            this.field_59d86bc_bzF[i] = qMV2.field_2092ae_Dne;
            this.field_4a92422_Qnq[i] = qMV2.field_21260d_FWm;
            this.field_3f1c589_Dne[i] = uqn2.field_2092ae_Dne;
            this.field_4039e0a_FWm[i] = uqn2.field_21260d_FWm;
            this.field_7a46ee07_Dne[i] = uqn2.field_3f1c582_Dne;
        }
        Deflater deflater = new Deflater(-1);
        try {
            deflater.setInput(field_4039e03_FWm, 0, n2);
            deflater.finish();
            this.field_3f1c582_Dne = new byte[n2];
            this.field_2092ae_Dne = deflater.deflate(this.field_3f1c582_Dne);
        }
        finally {
            deflater.end();
        }
    }

    @Override
    public int method_7a46288d_Dne() {
        return 6 + this.field_2092ae_Dne + 12 * this.method_7c6f602c_FWm();
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(this.field_59d86bc_bzF.length);
        dataOutputStream.writeInt(this.field_2092ae_Dne);
        dataOutputStream.writeBoolean(this.field_2092bf_Dne);
        dataOutputStream.write(this.field_3f1c582_Dne, 0, this.field_2092ae_Dne);
        for (int i = 0; i < this.field_59d86bc_bzF.length; ++i) {
            dataOutputStream.writeInt(this.field_59d86bc_bzF[i]);
            dataOutputStream.writeInt(this.field_4a92422_Qnq[i]);
            dataOutputStream.writeShort((short)(this.field_3f1c589_Dne[i] & 0xFFFF));
            dataOutputStream.writeShort((short)(this.field_4039e0a_FWm[i] & 0xFFFF));
        }
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_b3124066_Dne(this);
    }

    public int method_ce7f5d9c_Dne(int n) {
        return this.field_59d86bc_bzF[n];
    }

    public int method_7c6f602c_FWm() {
        return this.field_59d86bc_bzF.length;
    }
}

