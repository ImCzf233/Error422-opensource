package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class luM {
    private static final HashMap field_ecf0af5e_Dne = new HashMap();
    private ReadWriteLock field_befaddf5_Dne;
    private boolean field_2092bf_Dne = true;
    private final Map<Object, uGR> field_83b1c1b0_Dne = new HashMap();
    private boolean field_21261e_FWm;

    public void method_62ca2346_FWm(int n, Object object) {
        uGR uGR2 = this.method_9e7fba3a_Dne(n);
        if (!object.equals(uGR2.method_fc07f5d8_Dne())) {
            uGR2.method_41cee5f6_Dne(object);
            uGR2.method_ce7f9d7a_Dne(true);
            this.field_21261e_FWm = true;
        }
    }

    public void method_16cca7a_Dne(int n, int n2) {
        uGR uGR2 = new uGR(n2, n, null);
        this.field_befaddf5_Dne.writeLock().lock();
        this.field_83b1c1b0_Dne.put(n, uGR2);
        this.field_befaddf5_Dne.writeLock().unlock();
        this.field_2092bf_Dne = false;
    }

    public boolean method_7a46289e_Dne() {
        return this.field_21261e_FWm;
    }

    public luM() {
        this.field_befaddf5_Dne = new ReentrantReadWriteLock();
    }

    static {
        field_ecf0af5e_Dne.put(Byte.class, 0);
        field_ecf0af5e_Dne.put(Short.class, 1);
        field_ecf0af5e_Dne.put(Integer.class, 2);
        field_ecf0af5e_Dne.put(Float.class, 3);
        field_ecf0af5e_Dne.put(String.class, 4);
        field_ecf0af5e_Dne.put(NMq.class, 5);
        field_ecf0af5e_Dne.put(iSh.class, 6);
    }

    public void method_ad009545_Dne(int n, Object object) {
        Integer n2 = (Integer)field_ecf0af5e_Dne.get(object.getClass());
        if (n2 == null) {
            throw new IllegalArgumentException("Unknown data type: " + object.getClass());
        }
        if (n > 31) {
            throw new IllegalArgumentException("Data value id is too big with " + n + "! (Max is " + 31 + ")");
        }
        if (this.field_83b1c1b0_Dne.containsKey(n)) {
            throw new IllegalArgumentException("Duplicate id value for " + n + "!");
        }
        uGR uGR2 = new uGR(n2, n, object);
        this.field_befaddf5_Dne.writeLock().lock();
        this.field_83b1c1b0_Dne.put(n, uGR2);
        this.field_befaddf5_Dne.writeLock().unlock();
        this.field_2092bf_Dne = false;
    }

    public boolean method_7c6f603d_FWm() {
        return this.field_2092bf_Dne;
    }

    public short method_ce7f5da6_Dne(int n) {
        return (Short)this.method_9e7fba3a_Dne(n).method_fc07f5d8_Dne();
    }

    public List method_adea226d_Dne() {
        ArrayList<uGR> arrayList = null;
        if (this.field_21261e_FWm) {
            this.field_befaddf5_Dne.readLock().lock();
            for (uGR uGR2 : this.field_83b1c1b0_Dne.values()) {
                if (!uGR2.method_7a46289e_Dne()) continue;
                uGR2.method_ce7f9d7a_Dne(false);
                if (arrayList == null) {
                    arrayList = new ArrayList<uGR>();
                }
                arrayList.add(uGR2);
            }
            this.field_befaddf5_Dne.readLock().unlock();
        }
        this.field_21261e_FWm = false;
        return arrayList;
    }

    public void method_aca12b82_Dne(DataOutputStream dataOutputStream) throws IOException {
        this.field_befaddf5_Dne.readLock().lock();
        for (uGR uGR2 : this.field_83b1c1b0_Dne.values()) {
            luM.method_c2a6b8df_Dne(dataOutputStream, uGR2);
        }
        this.field_befaddf5_Dne.readLock().unlock();
        dataOutputStream.writeByte(127);
    }

    public static List method_1d3460e4_Dne(DataInputStream dataInputStream) throws IOException {
        ArrayList<uGR> arrayList = null;
        byte by = dataInputStream.readByte();
        while (by != 127) {
            if (arrayList == null) {
                arrayList = new ArrayList<uGR>();
            }
            int n = (by & 0xE0) >> 5;
            int n2 = by & 0x1F;
            uGR uGR2 = null;
            switch (n) {
                case 0: {
                    uGR2 = new uGR(n, n2, dataInputStream.readByte());
                    break;
                }
                case 1: {
                    uGR2 = new uGR(n, n2, dataInputStream.readShort());
                    break;
                }
                case 2: {
                    uGR2 = new uGR(n, n2, dataInputStream.readInt());
                    break;
                }
                case 3: {
                    uGR2 = new uGR(n, n2, Float.valueOf(dataInputStream.readFloat()));
                    break;
                }
                case 4: {
                    uGR2 = new uGR(n, n2, NER.method_1ce99840_Dne(dataInputStream, 64));
                    break;
                }
                case 5: {
                    uGR2 = new uGR(n, n2, NER.method_69d02a62_Dne(dataInputStream));
                    break;
                }
                case 6: {
                    int n3 = dataInputStream.readInt();
                    int n4 = dataInputStream.readInt();
                    int n5 = dataInputStream.readInt();
                    uGR2 = new uGR(n, n2, new iSh(n3, n4, n5));
                }
            }
            arrayList.add(uGR2);
            by = dataInputStream.readByte();
        }
        return arrayList;
    }

    public void method_ce7f5da9_Dne(int n) {
        uGR.method_12f9e0f1_Dne(this.method_9e7fba3a_Dne(n), true);
        this.field_21261e_FWm = true;
    }

    public String method_2c0e7e17_Dne(int n) {
        return (String)this.method_9e7fba3a_Dne(n).method_fc07f5d8_Dne();
    }

    private static void method_c2a6b8df_Dne(DataOutputStream dataOutputStream, uGR uGR2) throws IOException {
        int n = (uGR2.method_7c6f602c_FWm() << 5 | uGR2.method_7a46288d_Dne() & 0x1F) & 0xFF;
        dataOutputStream.writeByte(n);
        switch (uGR2.method_7c6f602c_FWm()) {
            case 0: {
                dataOutputStream.writeByte(((Byte)uGR2.method_fc07f5d8_Dne()).byteValue());
                break;
            }
            case 1: {
                dataOutputStream.writeShort(((Short)uGR2.method_fc07f5d8_Dne()).shortValue());
                break;
            }
            case 2: {
                dataOutputStream.writeInt((Integer)uGR2.method_fc07f5d8_Dne());
                break;
            }
            case 3: {
                dataOutputStream.writeFloat(((Float)uGR2.method_fc07f5d8_Dne()).floatValue());
                break;
            }
            case 4: {
                NER.method_e1033a4c_Dne((String)uGR2.method_fc07f5d8_Dne(), dataOutputStream);
                break;
            }
            case 5: {
                NMq nMq = (NMq)uGR2.method_fc07f5d8_Dne();
                NER.method_dcc5e3d_Dne(nMq, dataOutputStream);
                break;
            }
            case 6: {
                iSh iSh2 = (iSh)uGR2.method_fc07f5d8_Dne();
                dataOutputStream.writeInt(iSh2.field_2092ae_Dne);
                dataOutputStream.writeInt(iSh2.field_21260d_FWm);
                dataOutputStream.writeInt(iSh2.field_2e5f1b_bzF);
            }
        }
    }

    public NMq method_9e6e1a08_Dne(int n) {
        return (NMq)this.method_9e7fba3a_Dne(n).method_fc07f5d8_Dne();
    }

    public static void method_65d20933_Dne(List<uGR> list, DataOutputStream dataOutputStream) throws IOException {
        if (list != null) {
            for (uGR uGR2 : list) {
                luM.method_c2a6b8df_Dne(dataOutputStream, uGR2);
            }
        }
        dataOutputStream.writeByte(127);
    }

    private uGR method_9e7fba3a_Dne(int n) {
        uGR uGR2;
        this.field_befaddf5_Dne.readLock().lock();
        try {
            uGR2 = (uGR)this.field_83b1c1b0_Dne.get(n);
        }
        catch (Throwable throwable) {
            McM mcM = McM.method_948e60df_Dne(throwable, "Getting synched entity data");
            Noo noo = mcM.method_284dc627_Dne("Synched entity data");
            noo.method_5e295ec0_Dne("Data ID", n);
            throw new kaJ(mcM);
        }
        this.field_befaddf5_Dne.readLock().unlock();
        return uGR2;
    }

    public List method_64e4d8ee_FWm() {
        ArrayList<uGR> arrayList = null;
        this.field_befaddf5_Dne.readLock().lock();
        for (uGR uGR2 : this.field_83b1c1b0_Dne.values()) {
            if (arrayList == null) {
                arrayList = new ArrayList<uGR>();
            }
            arrayList.add(uGR2);
        }
        this.field_befaddf5_Dne.readLock().unlock();
        return arrayList;
    }

    public void method_ea14418b_Dne(List<uGR> list) {
        this.field_befaddf5_Dne.writeLock().lock();
        for (uGR uGR2 : list) {
            uGR uGR3 = (uGR)this.field_83b1c1b0_Dne.get(uGR2.method_7a46288d_Dne());
            if (uGR3 == null) continue;
            uGR3.method_41cee5f6_Dne(uGR2.method_fc07f5d8_Dne());
        }
        this.field_befaddf5_Dne.writeLock().unlock();
    }

    public int method_ce7f5d9c_Dne(int n) {
        return (Integer)this.method_9e7fba3a_Dne(n).method_fc07f5d8_Dne();
    }

    public byte method_ce7f5d95_Dne(int n) {
        return (Byte)this.method_9e7fba3a_Dne(n).method_fc07f5d8_Dne();
    }
}

