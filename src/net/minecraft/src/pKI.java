package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class pKI
extends NER {
    public int field_21260d_FWm;
    private byte[] field_3f1c582_Dne;
    private byte[] field_4039e03_FWm;
    private static byte[] field_59d86b5_bzF = new byte[196864];
    public int field_2092ae_Dne;
    private int field_2d29f4_aFZ;
    public int field_267cf5_Qnq;
    public int field_2e5f1b_bzF;
    public boolean field_2092bf_Dne;

    public static uqn method_36bd3e5b_Dne(qMV var0, boolean var1, int var2) {
        int var3 = 0;
        cHy[] var4 = var0.method_57027af4_Dne();
        int var5 = 0;
        uqn var6 = new uqn();
        byte[] var7 = field_59d86b5_bzF;
        if (var1) {
            var0.field_388db7_zGp = true;
        }

        int var8;
        for(var8 = 0; var8 < var4.length; ++var8) {
            if (var4[var8] != null && (!var1 || !var4[var8].method_7a46289e_Dne()) && (var2 & 1 << var8) != 0) {
                var6.field_2092ae_Dne |= 1 << var8;
                if (var4[var8].method_23008bc4_Dne() != null) {
                    var6.field_21260d_FWm |= 1 << var8;
                    ++var5;
                }
            }
        }

        for(var8 = 0; var8 < var4.length; ++var8) {
            if (var4[var8] != null && (!var1 || !var4[var8].method_7a46289e_Dne()) && (var2 & 1 << var8) != 0) {
                byte[] var9 = var4[var8].method_ce7eeb83_Dne();
                System.arraycopy(var9, 0, var7, var3, var9.length);
                var3 += var9.length;
            }
        }

        FYZ var11;
        for(var8 = 0; var8 < var4.length; ++var8) {
            if (var4[var8] != null && (!var1 || !var4[var8].method_7a46289e_Dne()) && (var2 & 1 << var8) != 0) {
                var11 = var4[var8].method_f876dbe3_FWm();
                System.arraycopy(var11.field_3f1c582_Dne, 0, var7, var3, var11.field_3f1c582_Dne.length);
                var3 += var11.field_3f1c582_Dne.length;
            }
        }

        for(var8 = 0; var8 < var4.length; ++var8) {
            if (var4[var8] != null && (!var1 || !var4[var8].method_7a46289e_Dne()) && (var2 & 1 << var8) != 0) {
                var11 = var4[var8].method_228c9271_bzF();
                System.arraycopy(var11.field_3f1c582_Dne, 0, var7, var3, var11.field_3f1c582_Dne.length);
                var3 += var11.field_3f1c582_Dne.length;
            }
        }

        if (!var0.field_36c4f18_Dne.field_3690d00_Dne.field_21261e_FWm) {
            for(var8 = 0; var8 < var4.length; ++var8) {
                if (var4[var8] != null && (!var1 || !var4[var8].method_7a46289e_Dne()) && (var2 & 1 << var8) != 0) {
                    var11 = var4[var8].method_694964cb_Qnq();
                    System.arraycopy(var11.field_3f1c582_Dne, 0, var7, var3, var11.field_3f1c582_Dne.length);
                    var3 += var11.field_3f1c582_Dne.length;
                }
            }
        }

        if (var5 > 0) {
            for(var8 = 0; var8 < var4.length; ++var8) {
                if (var4[var8] != null && (!var1 || !var4[var8].method_7a46289e_Dne()) && var4[var8].method_23008bc4_Dne() != null && (var2 & 1 << var8) != 0) {
                    var11 = var4[var8].method_23008bc4_Dne();
                    System.arraycopy(var11.field_3f1c582_Dne, 0, var7, var3, var11.field_3f1c582_Dne.length);
                    var3 += var11.field_3f1c582_Dne.length;
                }
            }
        }

        if (var1) {
            byte[] var10 = var0.method_ce7eeb83_Dne();
            System.arraycopy(var10, 0, var7, var3, var10.length);
            var3 += var10.length;
        }

        var6.field_3f1c582_Dne = new byte[var3];
        System.arraycopy(var7, 0, var6.field_3f1c582_Dne, 0, var3);
        return var6;
    }

    @Override
    public void method_b68494b1_Dne(pPV pPV2) {
        pPV2.method_b6383659_Dne(this);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 17 + this.field_2d29f4_aFZ;
    }

    @Override
    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.field_2092ae_Dne);
        dataOutputStream.writeInt(this.field_21260d_FWm);
        dataOutputStream.writeBoolean(this.field_2092bf_Dne);
        dataOutputStream.writeShort((short)(this.field_2e5f1b_bzF & 0xFFFF));
        dataOutputStream.writeShort((short)(this.field_267cf5_Qnq & 0xFFFF));
        dataOutputStream.writeInt(this.field_2d29f4_aFZ);
        dataOutputStream.write(this.field_3f1c582_Dne, 0, this.field_2d29f4_aFZ);
    }

    public pKI() {
        this.field_267d06_Qnq = true;
    }

    @Override
    public void method_65dbab03_Dne(DataInputStream dataInputStream) throws IOException {
        int n;
        this.field_2092ae_Dne = dataInputStream.readInt();
        this.field_21260d_FWm = dataInputStream.readInt();
        this.field_2092bf_Dne = dataInputStream.readBoolean();
        this.field_2e5f1b_bzF = dataInputStream.readShort();
        this.field_267cf5_Qnq = dataInputStream.readShort();
        this.field_2d29f4_aFZ = dataInputStream.readInt();
        if (field_59d86b5_bzF.length < this.field_2d29f4_aFZ) {
            field_59d86b5_bzF = new byte[this.field_2d29f4_aFZ];
        }
        dataInputStream.readFully(field_59d86b5_bzF, 0, this.field_2d29f4_aFZ);
        int n2 = 0;
        for (n = 0; n < 16; ++n) {
            n2 += this.field_2e5f1b_bzF >> n & 1;
        }
        n = 12288 * n2;
        if (this.field_2092bf_Dne) {
            n += 256;
        }
        this.field_4039e03_FWm = new byte[n];
        Inflater inflater = new Inflater();
        inflater.setInput(field_59d86b5_bzF, 0, this.field_2d29f4_aFZ);
        try {
            inflater.inflate(this.field_4039e03_FWm);
        }
        catch (DataFormatException dataFormatException) {
            throw new IOException("Bad compressed data format");
        }
        finally {
            inflater.end();
        }
    }

    public byte[] method_ce7eeb83_Dne() {
        return this.field_4039e03_FWm;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public pKI(qMV qMV2, boolean bl, int n) {
        this.field_267d06_Qnq = true;
        this.field_2092ae_Dne = qMV2.field_2092ae_Dne;
        this.field_21260d_FWm = qMV2.field_21260d_FWm;
        this.field_2092bf_Dne = bl;
        uqn uqn2 = pKI.method_36bd3e5b_Dne(qMV2, bl, n);
        Deflater deflater = new Deflater(-1);
        this.field_267cf5_Qnq = uqn2.field_21260d_FWm;
        this.field_2e5f1b_bzF = uqn2.field_2092ae_Dne;
        try {
            this.field_4039e03_FWm = uqn2.field_3f1c582_Dne;
            deflater.setInput(uqn2.field_3f1c582_Dne, 0, uqn2.field_3f1c582_Dne.length);
            deflater.finish();
            this.field_3f1c582_Dne = new byte[uqn2.field_3f1c582_Dne.length];
            this.field_2d29f4_aFZ = deflater.deflate(this.field_3f1c582_Dne);
        }
        finally {
            deflater.end();
        }
    }
}

