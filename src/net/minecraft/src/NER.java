package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class NER {
    public static long field_21260e_FWm;
    protected dLs field_37472c1_Dne;
    private static Map field_83b1c1b0_Dne;
    private static Set field_83b48b6a_Dne;
    public boolean field_267d06_Qnq = false;
    public static long field_2e5f1c_bzF;
    public final long field_2092af_Dne = System.currentTimeMillis();
    public static ZGT field_36fd085_Dne;
    public static long field_2d29f5_aFZ;
    private static Set field_da244c89_FWm;
    public static long field_267cf6_Qnq;

    public static byte[] method_5599b63a_Dne(DataInputStream dataInputStream) throws IOException {
        short s = dataInputStream.readShort();
        if (s < 0) {
            throw new IOException("Key was smaller than nothing!  Weird key!");
        }
        byte[] byArray = new byte[s];
        dataInputStream.readFully(byArray);
        return byArray;
    }

    public abstract void method_aca12b82_Dne(DataOutputStream var1) throws IOException;

    public static void method_91ac7c9_Dne(DataOutputStream dataOutputStream, byte[] byArray) throws IOException {
        dataOutputStream.writeShort(byArray.length);
        dataOutputStream.write(byArray);
    }

    public abstract int method_7a46288d_Dne();

    public static NER method_b04c492_Dne(dLs dLs2, DataInputStream dataInputStream, boolean bl, Socket socket) throws IOException {
        int n;
        boolean bl2 = false;
        NER nER = null;
        int n2 = socket.getSoTimeout();
        try {
            n = dataInputStream.read();
            if (n == -1) {
                return null;
            }
            if (bl && !field_da244c89_FWm.contains(n) || !bl && !field_83b48b6a_Dne.contains(n)) {
                throw new IOException("Bad packet id " + n);
            }
            nER = NER.method_cb74f01d_Dne(dLs2, n);
            if (nER == null) {
                throw new IOException("Bad packet id " + n);
            }
            nER.field_37472c1_Dne = dLs2;
            if (nER instanceof prJ) {
                socket.setSoTimeout(1500);
            }
            nER.method_65dbab03_Dne(dataInputStream);
            ++field_21260e_FWm;
            field_2e5f1c_bzF += (long)nER.method_7a46288d_Dne();
        }
        catch (EOFException eOFException) {
            dLs2.method_47a073d1_bzF("Reached end of stream");
            return null;
        }
        qXI.method_16cce3b_Dne(n, nER.method_7a46288d_Dne());
        ++field_21260e_FWm;
        field_2e5f1c_bzF += (long)nER.method_7a46288d_Dne();
        socket.setSoTimeout(n2);
        return nER;
    }

    protected static void method_2c6be9bf_Dne(WkD wkD, DataOutputStream dataOutputStream) throws IOException {
        if (wkD == null) {
            dataOutputStream.writeShort(-1);
        } else {
            byte[] byArray = VVx.method_1ca76aa6_Dne(wkD);
            dataOutputStream.writeShort((short)byArray.length);
            dataOutputStream.write(byArray);
        }
    }

    public static void method_e1033a4c_Dne(String string, DataOutputStream dataOutputStream) throws IOException {
        if (string.length() > Short.MAX_VALUE) {
            throw new IOException("String too big");
        }
        dataOutputStream.writeShort(string.length());
        dataOutputStream.writeChars(string);
    }

    public abstract void method_65dbab03_Dne(DataInputStream var1) throws IOException;

    public boolean method_7be2fb90_Dne(NER nER) {
        return false;
    }

    public static NMq method_69d02a62_Dne(DataInputStream dataInputStream) throws IOException {
        NMq nMq = null;
        short s = dataInputStream.readShort();
        if (s >= 0) {
            byte by = dataInputStream.readByte();
            short s2 = dataInputStream.readShort();
            nMq = new NMq(s, (int)by, (int)s2);
            nMq.field_36ef89c_Dne = NER.method_69d4ace4_Dne(dataInputStream);
        }
        return nMq;
    }

    static {
        field_36fd085_Dne = new ZGT();
        field_83b1c1b0_Dne = new HashMap();
        field_83b48b6a_Dne = new HashSet();
        field_da244c89_FWm = new HashSet();
        NER.method_3b2f5474_Dne(0, true, true, Phv.class);
        NER.method_3b2f5474_Dne(1, true, true, VPw.class);
        NER.method_3b2f5474_Dne(2, false, true, ike.class);
        NER.method_3b2f5474_Dne(3, true, true, rXx.class);
        NER.method_3b2f5474_Dne(4, true, false, uYm.class);
        NER.method_3b2f5474_Dne(5, true, false, qHm.class);
        NER.method_3b2f5474_Dne(6, true, false, ROw.class);
        NER.method_3b2f5474_Dne(7, false, true, EHr.class);
        NER.method_3b2f5474_Dne(8, true, false, zqT.class);
        NER.method_3b2f5474_Dne(9, true, true, fmA.class);
        NER.method_3b2f5474_Dne(10, true, true, FQJ.class);
        NER.method_3b2f5474_Dne(11, true, true, QEr.class);
        NER.method_3b2f5474_Dne(12, true, true, FTJ.class);
        NER.method_3b2f5474_Dne(13, true, true, eMn.class);
        NER.method_3b2f5474_Dne(14, false, true, Wbc.class);
        NER.method_3b2f5474_Dne(15, false, true, dtj_0.class);
        NER.method_3b2f5474_Dne(16, true, true, aig.class);
        NER.method_3b2f5474_Dne(17, true, false, kwp.class);
        NER.method_3b2f5474_Dne(18, true, true, UVb.class);
        NER.method_3b2f5474_Dne(19, false, true, Pkw.class);
        NER.method_3b2f5474_Dne(20, true, false, MwE.class);
        NER.method_3b2f5474_Dne(22, true, false, liE.class);
        NER.method_3b2f5474_Dne(23, true, false, wXa.class);
        NER.method_3b2f5474_Dne(24, true, false, QZR.class);
        NER.method_3b2f5474_Dne(25, true, false, bia.class);
        NER.method_3b2f5474_Dne(26, true, false, mPe.class);
        NER.method_3b2f5474_Dne(28, true, false, wFl.class);
        NER.method_3b2f5474_Dne(29, true, false, tXK.class);
        NER.method_3b2f5474_Dne(30, true, false, iET.class);
        NER.method_3b2f5474_Dne(31, true, false, GKq.class);
        NER.method_3b2f5474_Dne(32, true, false, wXr.class);
        NER.method_3b2f5474_Dne(33, true, false, DyR.class);
        NER.method_3b2f5474_Dne(34, true, false, NVL.class);
        NER.method_3b2f5474_Dne(35, true, false, eNn.class);
        NER.method_3b2f5474_Dne(38, true, false, JGj.class);
        NER.method_3b2f5474_Dne(39, true, false, YVz.class);
        NER.method_3b2f5474_Dne(40, true, false, SnO.class);
        NER.method_3b2f5474_Dne(41, true, false, ziQ.class);
        NER.method_3b2f5474_Dne(42, true, false, gzk.class);
        NER.method_3b2f5474_Dne(43, true, false, WXC.class);
        NER.method_3b2f5474_Dne(51, true, false, pKI.class);
        NER.method_3b2f5474_Dne(52, true, false, Ylf.class);
        NER.method_3b2f5474_Dne(53, true, false, cSs.class);
        NER.method_3b2f5474_Dne(54, true, false, vjn_0.class);
        NER.method_3b2f5474_Dne(55, true, false, bEj.class);
        NER.method_3b2f5474_Dne(56, true, false, nPC.class);
        NER.method_3b2f5474_Dne(60, true, false, UdA.class);
        NER.method_3b2f5474_Dne(61, true, false, wwJ.class);
        NER.method_3b2f5474_Dne(62, true, false, AQV.class);
        NER.method_3b2f5474_Dne(63, true, false, YLL.class);
        NER.method_3b2f5474_Dne(70, true, false, Tnn.class);
        NER.method_3b2f5474_Dne(71, true, false, Rle.class);
        NER.method_3b2f5474_Dne(100, true, false, XGq.class);
        NER.method_3b2f5474_Dne(101, true, true, Krr.class);
        NER.method_3b2f5474_Dne(102, false, true, mZp.class);
        NER.method_3b2f5474_Dne(103, true, false, RZL.class);
        NER.method_3b2f5474_Dne(104, true, false, Pwq.class);
        NER.method_3b2f5474_Dne(105, true, false, QKM.class);
        NER.method_3b2f5474_Dne(106, true, true, pDZ.class);
        NER.method_3b2f5474_Dne(107, true, true, pRp.class);
        NER.method_3b2f5474_Dne(108, false, true, fwI.class);
        NER.method_3b2f5474_Dne(130, true, true, eFM.class);
        NER.method_3b2f5474_Dne(131, true, false, XsD.class);
        NER.method_3b2f5474_Dne(132, true, false, ipQ.class);
        NER.method_3b2f5474_Dne(200, true, false, Raa.class);
        NER.method_3b2f5474_Dne(201, true, false, fPl.class);
        NER.method_3b2f5474_Dne(202, true, true, pSe.class);
        NER.method_3b2f5474_Dne(203, true, true, efs.class);
        NER.method_3b2f5474_Dne(204, false, true, yUQ.class);
        NER.method_3b2f5474_Dne(205, false, true, Gle.class);
        NER.method_3b2f5474_Dne(206, true, false, iQd.class);
        NER.method_3b2f5474_Dne(207, true, false, niw.class);
        NER.method_3b2f5474_Dne(208, true, false, LjQ.class);
        NER.method_3b2f5474_Dne(209, true, false, SPR.class);
        NER.method_3b2f5474_Dne(250, true, true, FaB.class);
        NER.method_3b2f5474_Dne(252, true, true, nsl.class);
        NER.method_3b2f5474_Dne(253, true, false, GJK.class);
        NER.method_3b2f5474_Dne(254, false, true, prJ.class);
        NER.method_3b2f5474_Dne(255, true, true, yZV.class);
    }

    public final int method_a98a0653_aFZ() {
        return (Integer)field_83b1c1b0_Dne.get(this.getClass());
    }

    public abstract void method_b68494b1_Dne(pPV var1);

    public boolean method_7c6f603d_FWm() {
        return false;
    }

    public static void method_519d53f4_Dne(NER nER, DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.write(nER.method_a98a0653_aFZ());
        nER.method_aca12b82_Dne(dataOutputStream);
        ++field_267cf6_Qnq;
        field_2d29f5_aFZ += (long)nER.method_7a46288d_Dne();
    }

    public static void method_dcc5e3d_Dne(NMq nMq, DataOutputStream dataOutputStream) throws IOException {
        if (nMq == null) {
            dataOutputStream.writeShort(-1);
        } else {
            dataOutputStream.writeShort(nMq.field_2e5f1b_bzF);
            dataOutputStream.writeByte(nMq.field_2092ae_Dne);
            dataOutputStream.writeShort(nMq.method_907a9d14_Qnq());
            WkD wkD = null;
            if (nMq.method_230de6ba_Dne().method_7ad38807_DyG() || nMq.method_230de6ba_Dne().method_b0a28148_div()) {
                wkD = nMq.field_36ef89c_Dne;
            }
            NER.method_2c6be9bf_Dne(wkD, dataOutputStream);
        }
    }

    public boolean method_7a46289e_Dne() {
        return false;
    }

    public static String method_1ce99840_Dne(DataInputStream dataInputStream, int n) throws IOException {
        int n2 = dataInputStream.readShort();
        if (n2 > n) {
            throw new IOException("Received string length longer than maximum allowed (" + n2 + " > " + n + ")");
        }
        if (n2 < 0) {
            throw new IOException("Received string length is less than zero! Weird string!");
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n2; ++i) {
            stringBuilder.append(dataInputStream.readChar());
        }
        return stringBuilder.toString();
    }

    public static NER method_cb74f01d_Dne(dLs dLs2, int n) {
        try {
            Class clazz = (Class)field_36fd085_Dne.method_394ba0a9_Dne(n);
            return clazz == null ? null : (NER)clazz.newInstance();
        }
        catch (Exception exception) {
            exception.printStackTrace();
            dLs2.method_47a073d1_bzF("Skipping packet with id " + n);
            return null;
        }
    }

    public String toString() {
        String string = this.getClass().getSimpleName();
        return string;
    }

    public static WkD method_69d4ace4_Dne(DataInputStream dataInputStream) throws IOException {
        short s = dataInputStream.readShort();
        if (s < 0) {
            return null;
        }
        byte[] byArray = new byte[s];
        dataInputStream.readFully(byArray);
        return VVx.method_6bd4c1c2_Dne(byArray);
    }

    static void method_3b2f5474_Dne(int n, boolean bl, boolean bl2, Class clazz) {
        if (field_36fd085_Dne.method_ce7f5dad_Dne(n)) {
            throw new IllegalArgumentException("Duplicate packet id:" + n);
        }
        if (field_83b1c1b0_Dne.containsKey(clazz)) {
            throw new IllegalArgumentException("Duplicate packet class:" + clazz);
        }
        field_36fd085_Dne.method_ad009545_Dne(n, clazz);
        field_83b1c1b0_Dne.put(clazz, n);
        if (bl) {
            field_83b48b6a_Dne.add(n);
        }
        if (bl2) {
            field_da244c89_FWm.add(n);
        }
    }
}

