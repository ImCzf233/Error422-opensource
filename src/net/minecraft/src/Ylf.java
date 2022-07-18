package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Ylf
extends NER {
    public int field_2092ae_Dne;
    private static byte[] field_4039e03_FWm = new byte[0];
    public int field_21260d_FWm;
    public byte[] field_3f1c582_Dne;
    public int field_2e5f1b_bzF;

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_90d6f674_Dne(this);
    }

    public Ylf() {
        this.field_267d06_Qnq = true;
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.field_2092ae_Dne);
        dataOutputStream.writeInt(this.field_21260d_FWm);
        dataOutputStream.writeShort((short)this.field_2e5f1b_bzF);
        if (this.field_3f1c582_Dne != null) {
            dataOutputStream.writeInt(this.field_3f1c582_Dne.length);
            dataOutputStream.write(this.field_3f1c582_Dne);
        } else {
            dataOutputStream.writeInt(0);
        }
    }

    public Ylf(int n, int n2, short[] sArray, int n3, Qnq qnq) {
        this.field_267d06_Qnq = true;
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_2e5f1b_bzF = n3;
        int n4 = 4 * n3;
        qMV qMV2 = qnq.method_e1796070_FWm(n, n2);
        try {
            if (n3 >= 64) {
                this.field_37472c1_Dne.method_8f501fe4_Dne("ChunkTilesUpdatePacket compress " + n3);
                if (field_4039e03_FWm.length < n4) {
                    field_4039e03_FWm = new byte[n4];
                }
            } else {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(n4);
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                for (int i = 0; i < n3; ++i) {
                    int n5 = sArray[i] >> 12 & 0xF;
                    int n6 = sArray[i] >> 8 & 0xF;
                    int n7 = sArray[i] & 0xFF;
                    dataOutputStream.writeShort(sArray[i]);
                    dataOutputStream.writeShort((short)((qMV2.method_2c2cf7bc_Dne(n5, n7, n6) & 0xFFF) << 4 | qMV2.method_2dee76f_bzF(n5, n7, n6) & 0xF));
                }
                this.field_3f1c582_Dne = byteArrayOutputStream.toByteArray();
                if (this.field_3f1c582_Dne.length != n4) {
                    throw new RuntimeException("Expected length " + n4 + " doesn't match received length " + this.field_3f1c582_Dne.length);
                }
            }
        }
        catch (IOException iOException) {
            this.field_37472c1_Dne.method_13eaee12_FWm("Couldn't create chunk packet", iOException);
            this.field_3f1c582_Dne = null;
        }
    }

    @Override
    public int method_7a46288d_Dne() {
        return 10 + this.field_2e5f1b_bzF * 4;
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        this.field_2092ae_Dne = dataInputStream.readInt();
        this.field_21260d_FWm = dataInputStream.readInt();
        this.field_2e5f1b_bzF = dataInputStream.readShort() & 0xFFFF;
        int n = dataInputStream.readInt();
        if (n > 0) {
            this.field_3f1c582_Dne = new byte[n];
            dataInputStream.readFully(this.field_3f1c582_Dne);
        }
    }
}

